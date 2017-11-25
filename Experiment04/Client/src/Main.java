import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){

        Chatting c=new Chatting("127.0.0.1",9999);
        Thread t=new Thread(c);
        t.start();

/*
        JFrame frame = new JFrame("IM PC");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
*/
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("Name:");
        userLabel.setBounds(50,50,80,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,50,165,25);
        panel.add(userText);
        JButton loginButton = new JButton("login");
        loginButton.setBounds(130, 100, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(panel,"hello");
                Chatting c=new Chatting("127.0.0.1",9999);
                Thread t=new Thread(c);
                t.start();
            }
        });
        panel.add(loginButton);
    }

}
