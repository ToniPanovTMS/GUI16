import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI17 extends JFrame {
    static String answer="";
    static String bufer="";
    static boolean chek = false;
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel= new JPanel();
        jFrame.add(jPanel);

        String[] items={"Красный","Синий","Фиолетовый","Жёлтый","Розовый"};
        JComboBox jоcomboBox = new JComboBox(items);
        jоcomboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        jоcomboBox.setMaximumSize(new Dimension(100,30));
        jоcomboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer=(String)jоcomboBox.getSelectedItem();
            }
        });

        JCheckBox jCheckBox = new JCheckBox("Свой вариант");
        jCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chek == true) { chek = false;
                }else if(chek == false) { chek = true; }
            }
        });

        JTextField jTextField= new JTextField();
        jTextField.setAlignmentX(Component.CENTER_ALIGNMENT);
        jTextField.setMaximumSize(new Dimension(100,30));
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bufer=jTextField.getText();
            }
        });


        JButton jButton = new JButton("Ответить");
        jButton.setBounds(150,40,100,50);
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel jLabel = new JLabel("Ответ: "+answer);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(answer==""){answer=items[0];}

                if(chek==false){
                    jLabel.setText("Ответ: "+answer);
                }else if(chek==true){
                    answer=bufer;

                    jLabel.setText("Ответ: "+answer);
                }
            }
        });





        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(Box.createVerticalStrut(20));
        jPanel.add(jоcomboBox);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jCheckBox);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jTextField);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jButton);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jLabel);
        jPanel.add(Box.createVerticalStrut(20));


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 200 / 2, dim.height / 2 - 200 / 2, 200, 250);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        return jFrame;
    }
}