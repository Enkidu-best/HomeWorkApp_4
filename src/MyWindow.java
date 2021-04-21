import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Создаем класс для формы
public class MyWindow extends JFrame {
    public MyWindow(){
    // Устанавливаем заголовок
    setTitle("Test Window");
    // Сообщает системе о необходимости завершить работу программы при закрытии формы;
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // Формат (x, y, width, height). Устанавливает координаты формы и ее размер в пикселях;
    setBounds(300, 300, 400, 400);

    // Вариант 1. Добавление элементов в ручную + BorderLayout
//        // Создаем кнопку и в ее конструкторе передаем надпись на кнопке
//        JButton button1 = new JButton("Надпись на кнопке #1");
//        JButton button2 = new JButton("Вторая кнопка");
//        // После создания кнопок, их нужно добавить на форму с помощью метода add() North - место расположение на форме
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);

        // Вариант 2. Создание элементов формы в массиве + BoxLayout (все в одну строку)
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        for (int i = 1; i <= 10; i++) {
//            add(new JButton("#" + i));
//        }

        // Вариант 3. В ручную передаем координаты элементов формы
        // Методу setLayout обязательно ставим значение (null)
        setLayout(null);
        // Создаем текстовое поле с названием field.
        JTextField field = new JTextField();
        // Текстовому полю field передаем значение по формату (x, y, width, height).
        field.setBounds(20, 20, 180, 32);
        add(field);

        // Создаем новую кнопку и добавляем событие на нее - смена текста при нажатии
        JButton button = new JButton("Нажми сюда!");
        add(button, BorderLayout.CENTER);
        button.setBounds(20, 100, 180, 42);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Нажал!");  }    });

        // Создаем текстовое поле с событием, которое печатает в консоль, все что напечатано в поле (Enter)
        JTextField textField1 = new JTextField();
        add(textField1, BorderLayout.CENTER);  // Можно тут про ориентацию по центру не писать
        textField1.setBounds(20, 180, 180, 32);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textField1.getText());
            }
        });

        // Создаем событие на закрытие окна - печать в консоль
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается");
            }
        });


        // Показывает полученную форму на экране, желательно вызывать этот метод после настроек формы, иначе могут быть корявости
    setVisible(true);

    }
}
