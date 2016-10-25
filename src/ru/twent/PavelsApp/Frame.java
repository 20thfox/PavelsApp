package ru.twent.PavelsApp;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    public Frame(String s) {
        super(s);
        JMenuBar menu = new JMenuBar();
        menu.add(createFileMenu());
        setJMenuBar(menu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JMenu createFileMenu () {
        JMenu file = new JMenu("Файл");
        JMenuItem exit = new JMenuItem(new ExitAction());
        JMenuItem create = new JMenuItem(new CreateAction());
        file.add(create);
        file.addSeparator();
        file.add(exit);
        return file;
    }

    class ExitAction extends AbstractAction {
        ExitAction() {
            putValue(NAME,"Exit");
        }

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class CreateAction extends AbstractAction {
        CreateAction() {
            putValue(NAME,"Create");
        }

        public void actionPerformed(ActionEvent e) {
            String str = JOptionPane.showInputDialog("Input dialog");
            System.out.println(str);
        }
    }

}
