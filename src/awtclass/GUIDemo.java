package awtclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIDemo extends Frame implements ActionListener{
	Label lblNum1, lblNum2;
	TextField txtNum1, txtNum2, txtNum3;
	Button btnAdd, btnSub;
	public GUIDemo() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
				
		lblNum1 = new Label();
		lblNum1.setText("Input Num1: ");
		lblNum1.setBounds(30, 50, 75, 50);
		
		txtNum1 = new TextField();
		txtNum1.setBounds(120, 60, 100, 30);
		
		lblNum2 = new Label();
		lblNum2.setText("Input Num2: ");
		lblNum2.setBounds(30, 90, 75, 50);
		
		txtNum2 = new TextField();
		txtNum2.setBounds(120, 100, 100, 30);
		
		txtNum3 = new TextField();
		txtNum3.setBounds(30, 150, 188, 30);
		txtNum3.setEnabled(false);
		
		btnAdd = new Button("Add");
		btnAdd.setBounds(60, 190, 90, 30);
		
		btnSub = new Button("Sub");
		btnSub.setBounds(170, 190, 90, 30);
		
		add(lblNum1);
		add(txtNum1);
		add(lblNum2);
		add(txtNum2);
		add(txtNum3);
		add(btnAdd);
		add(btnSub);
		btnAdd.addActionListener(this);
		btnSub.addActionListener(this);
		
		setSize(350, 350);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = txtNum1.getText();
		String str2 = txtNum2.getText();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum=0;
		if(e.getSource() == btnAdd){
			sum = num1 + num2;
		}else if(e.getSource() == btnSub){
			sum = num1 - num2;
		}
		String result = String.valueOf(sum);
		txtNum3.setText(result);
	}

}
