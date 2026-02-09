import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindown {
    private JPanel winfrom;
    private JLabel Lbl_firstname;
    private JLabel Lbl_lastname;
    private JTextField Txt_firstname;
    private JTextField Txt_lastname;
    private JButton Btn_submit;
    private JButton Btn_reset;
    private JFrame jframe;

    public FirstWindown(){
        jframe =new JFrame();
        jframe.setContentPane(winfrom);
        jframe.setTitle("Wy First window Form");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(300,200);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        Btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Txt_firstname.getText().isEmpty() || Txt_lastname.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Please fill in you First Name or Last Name",
                            "Warning",JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            Txt_firstname.getText() + " " + Txt_lastname.getText());
                }
            }
        });
        Btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Txt_lastname.setText("");
                Txt_firstname.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new FirstWindown();

    }
}
