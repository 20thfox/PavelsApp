package ru.twent.PavelsApp;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    static String str;

    public Frame(String s) {
        super(s);
        JMenuBar menu = new JMenuBar();
        menu.add(createFileMenu());
        setJMenuBar(menu);

        Container contentPane = getContentPane();

        GridLayout lay = new GridLayout(0,3,5,12); //первые два параметра количество строк и столбцов, вторые два расстояние можде ячейками по гориз и верт
        contentPane.setLayout(lay);

        JLabel label = new JLabel("Текущее событие");
        JLabel dialog = new JLabel(str);

        contentPane.add(label);
        contentPane.add(dialog);


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
            str = JOptionPane.showInputDialog("Input dialog");

        }
    }

}
