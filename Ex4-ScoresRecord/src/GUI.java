import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	JLabel lbName, lbNum, lbJava, lbHF;
	JTextField txName, txNum, txJava, txHF;
	JButton bnAdd, bnClose;
	JTextArea txList;
	JFrame f;

	public static void main(String[] args) {
		new GUI();
	}

	public GUI() {

		f = new JFrame("成绩录入系统");
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
		lbName = new JLabel("姓名");
		txName = new JTextField("");
		lbNum = new JLabel("学号");
		txNum = new JTextField("");
		bnAdd = new JButton("添加");

		lbJava = new JLabel("Java成绩");
		txJava = new JTextField("");
		lbHF = new JLabel("高频成绩");
		txHF = new JTextField("");
		bnClose = new JButton("退出");

		txList = new JTextArea("");
		txList.setSize(750, 400);
		txList.setEnabled(false);
		txList.setDisabledTextColor(Color.BLACK);
		bnAdd.addActionListener(this);
		bnClose.addActionListener(this);

		JPanel pnGrid = new JPanel(new GridLayout(2, 5));
		pnGrid.add(lbName);
		pnGrid.add(txName);
		pnGrid.add(lbNum);
		pnGrid.add(txNum);
		pnGrid.add(bnAdd);
		pnGrid.add(lbJava);
		pnGrid.add(txJava);
		pnGrid.add(lbHF);
		pnGrid.add(txHF);
		pnGrid.add(bnClose);

		f.add(pnGrid, BorderLayout.NORTH);
		f.add(txList, BorderLayout.CENTER);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bnAdd) {
			txList.append(txName.getText() + "," + txNum.getText() + ","
					+ txJava.getText() + "," + txHF.getText() + "\n");
		} else if (e.getSource() == bnClose) {
			f.dispose();
		}
	}
}
