package sec1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginGUI extends JFrame implements ActionListener, KeyListener{
	JPanel port_log = new JPanel(); 
	JLabel port_label = new JLabel("유저 입력");
	JLabel port_labe2 = new JLabel("포트 입력");
	JLabel port_labe3 = new JLabel("주소 입력");
	JTextField port_num = new JTextField(20);
	JTextField port_num1 = new JTextField(20);
	JTextField port_num2 = new JTextField(20);
	JButton port_btn = new JButton("접속");
	
	public LoginGUI() {
	setTitle("GUI 관리자 창");
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,300);
	setVisible(true);
	setResizable(true);
	port_btn.addActionListener(this);
	port_num.addKeyListener(this);
	port_log.add(port_label);
	port_log.add(port_num);
	port_log.add(port_labe2);
	port_log.add(port_num1);
	port_log.add(port_labe3);
	port_log.add(port_num2);
	port_log.add(port_btn);
	port_btn.setPreferredSize(new Dimension(100, 50));
	add(port_log);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	public class GUIClient {
	public static void main(String[] args) {
		new LoginGUI();
	}

}
