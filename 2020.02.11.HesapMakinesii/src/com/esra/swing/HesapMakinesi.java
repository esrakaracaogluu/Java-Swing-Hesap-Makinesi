package com.esra.swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class HesapMakinesi extends JFrame {

	private JPanel contentPane;
	private static JTextField textSonuc;
	private String isaret;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	double sayi1;
	double sayi2;
	double sonuc;
	String islem;

	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 65, 153, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Hesap Makinesi", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 19, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		textSonuc = new JTextField();
		textSonuc.setForeground(Color.RED);
		textSonuc.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		GridBagConstraints gbc_textSonuc = new GridBagConstraints();
		gbc_textSonuc.fill = GridBagConstraints.BOTH;
		gbc_textSonuc.gridx = 0;
		gbc_textSonuc.gridy = 0;
		panel.add(textSonuc, gbc_textSonuc);
		textSonuc.setBackground(Color.BLACK);
		textSonuc.setEnabled(false);
		textSonuc.setHorizontalAlignment(SwingConstants.RIGHT);
		textSonuc.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(
				new TitledBorder(null, "Canon", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 153, 0 };
		gbl_panel_2.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel_2.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JButton btnyuzde = new JButton("%");
		GridBagConstraints gbc_btnyuzde = new GridBagConstraints();
		gbc_btnyuzde.fill = GridBagConstraints.BOTH;
		gbc_btnyuzde.insets = new Insets(0, 0, 5, 5);
		gbc_btnyuzde.gridx = 0;
		gbc_btnyuzde.gridy = 0;
		panel_1.add(btnyuzde, gbc_btnyuzde);

		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 2;
		gbc_btnC.gridy = 0;
		panel_1.add(btnC, gbc_btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText("");
			}
		});

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\icons8-clear-symbol-24.png"));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 0;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textSonuc.getText();
				int length = value.length();
				if (length > 0) {
					StringBuilder builder = new StringBuilder(value);
					builder.deleteCharAt(length - 1);
					textSonuc.setText(builder.toString());
				}
			}
		});

		JButton btnBol = new JButton("÷");
		GridBagConstraints gbc_btnBol = new GridBagConstraints();
		gbc_btnBol.fill = GridBagConstraints.BOTH;
		gbc_btnBol.insets = new Insets(0, 0, 5, 0);
		gbc_btnBol.gridx = 4;
		gbc_btnBol.gridy = 0;
		panel_1.add(btnBol, gbc_btnBol);
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0)
					sayi1 = Double.parseDouble(textSonuc.getText());
				textSonuc.setText("");
				isaret = "÷";
			}

		});

		JButton btnkarekok = new JButton("√");
		GridBagConstraints gbc_btnkarekok = new GridBagConstraints();
		gbc_btnkarekok.fill = GridBagConstraints.BOTH;
		gbc_btnkarekok.insets = new Insets(0, 0, 5, 5);
		gbc_btnkarekok.gridx = 0;
		gbc_btnkarekok.gridy = 1;
		panel_1.add(btnkarekok, gbc_btnkarekok);

		JButton btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 1;
		gbc_btn7.gridy = 1;
		panel_1.add(btn7, gbc_btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "7");

			}
		});

		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 2;
		gbc_btn8.gridy = 1;
		panel_1.add(btn8, gbc_btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "8");

			}
		});

		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 3;
		gbc_btn9.gridy = 1;
		panel_1.add(btn9, gbc_btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "9");

			}
		});

		JButton btnCarp = new JButton("x");
		GridBagConstraints gbc_btnCarp = new GridBagConstraints();
		gbc_btnCarp.fill = GridBagConstraints.BOTH;
		gbc_btnCarp.insets = new Insets(0, 0, 5, 0);
		gbc_btnCarp.gridx = 4;
		gbc_btnCarp.gridy = 1;
		panel_1.add(btnCarp, gbc_btnCarp);
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textSonuc.getText().length() > 0)
					sayi1 = Double.parseDouble(textSonuc.getText());
				textSonuc.setText("");
				isaret = "x";

			}
		});

		JButton btnkare = new JButton("x²");
		GridBagConstraints gbc_btnkare = new GridBagConstraints();
		gbc_btnkare.fill = GridBagConstraints.BOTH;
		gbc_btnkare.insets = new Insets(0, 0, 5, 5);
		gbc_btnkare.gridx = 0;
		gbc_btnkare.gridy = 2;
		panel_1.add(btnkare, gbc_btnkare);

		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 1;
		gbc_btn4.gridy = 2;
		panel_1.add(btn4, gbc_btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "4");

			}
		});

		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 2;
		gbc_btn5.gridy = 2;
		panel_1.add(btn5, gbc_btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "5");

			}
		});

		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 3;
		gbc_btn6.gridy = 2;
		panel_1.add(btn6, gbc_btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "6");

			}
		});

		JButton btnCikart = new JButton("-");
		GridBagConstraints gbc_btnCikart = new GridBagConstraints();
		gbc_btnCikart.fill = GridBagConstraints.BOTH;
		gbc_btnCikart.insets = new Insets(0, 0, 5, 0);
		gbc_btnCikart.gridx = 4;
		gbc_btnCikart.gridy = 2;
		panel_1.add(btnCikart, gbc_btnCikart);
		btnCikart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textSonuc.getText().length() > 0)
					sayi1 = Double.parseDouble(textSonuc.getText());
				textSonuc.setText("");
				isaret = "-";

			}
		});

		JButton btnkup = new JButton("x³");
		GridBagConstraints gbc_btnkup = new GridBagConstraints();
		gbc_btnkup.fill = GridBagConstraints.BOTH;
		gbc_btnkup.insets = new Insets(0, 0, 5, 5);
		gbc_btnkup.gridx = 0;
		gbc_btnkup.gridy = 3;
		panel_1.add(btnkup, gbc_btnkup);

		JButton btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 1;
		gbc_btn1.gridy = 3;
		panel_1.add(btn1, gbc_btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "1");
			}
		});

		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 2;
		gbc_btn2.gridy = 3;
		panel_1.add(btn2, gbc_btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "2");
			}
		});

		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 3;
		gbc_btn3.gridy = 3;
		panel_1.add(btn3, gbc_btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSonuc.setText(textSonuc.getText() + "3");
			}
		});

		JButton btnTopla = new JButton("+");
		GridBagConstraints gbc_btnTopla = new GridBagConstraints();
		gbc_btnTopla.fill = GridBagConstraints.BOTH;
		gbc_btnTopla.insets = new Insets(0, 0, 5, 0);
		gbc_btnTopla.gridx = 4;
		gbc_btnTopla.gridy = 3;
		panel_1.add(btnTopla, gbc_btnTopla);
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textSonuc.getText().length() > 0)
					sayi1 = Double.parseDouble(textSonuc.getText());
				textSonuc.setText("");
				isaret = "+";

			}
		});

		JButton btnoran = new JButton("⅟x");
		GridBagConstraints gbc_btnoran = new GridBagConstraints();
		gbc_btnoran.fill = GridBagConstraints.BOTH;
		gbc_btnoran.insets = new Insets(0, 0, 0, 5);
		gbc_btnoran.gridx = 0;
		gbc_btnoran.gridy = 4;
		panel_1.add(btnoran, gbc_btnoran);

		JButton btnartieksi = new JButton("±");
		GridBagConstraints gbc_btnartieksi = new GridBagConstraints();
		gbc_btnartieksi.fill = GridBagConstraints.BOTH;
		gbc_btnartieksi.insets = new Insets(0, 0, 0, 5);
		gbc_btnartieksi.gridx = 1;
		gbc_btnartieksi.gridy = 4;
		panel_1.add(btnartieksi, gbc_btnartieksi);

		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 2;
		gbc_btn0.gridy = 4;
		panel_1.add(btn0, gbc_btn0);

		JButton btnnokta = new JButton(".");
		GridBagConstraints gbc_btnnokta = new GridBagConstraints();
		gbc_btnnokta.fill = GridBagConstraints.BOTH;
		gbc_btnnokta.insets = new Insets(0, 0, 0, 5);
		gbc_btnnokta.gridx = 3;
		gbc_btnnokta.gridy = 4;
		panel_1.add(btnnokta, gbc_btnnokta);

		btnnokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textSonuc.getText().contains(".")) {

					textSonuc.setText(textSonuc.getText());
				} else if (textSonuc.getText().length() > 0) {
					textSonuc.setText(textSonuc.getText() + ".");
				} else {
					textSonuc.setText("0.");
				}
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sayi1==0)
					textSonuc.setText(null);
				textSonuc.setText(textSonuc.getText() + "0");
			}
		});
		btnartieksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					double plusm = Double.parseDouble(String.valueOf(textSonuc.getText()));
					plusm = plusm * (-1);
					textSonuc.setText(String.valueOf(plusm));
				}
			}

		});
		btnoran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					double oran = Double.parseDouble(String.valueOf(textSonuc.getText()));
					oran = (1 / oran);
					textSonuc.setText(String.valueOf(oran));

				}
			}
		});
		btnkup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					double sayiKup = Double.parseDouble(String.valueOf(textSonuc.getText()));
					sayiKup = (sayiKup * sayiKup * sayiKup);
					textSonuc.setText(String.valueOf(sayiKup));

				}
			}
		});
		btnkare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					double sayiKare = Double.parseDouble(String.valueOf(textSonuc.getText()));
					sayiKare = (sayiKare * sayiKare);
					textSonuc.setText(String.valueOf(sayiKare));

				}
			}
		});
		btnkarekok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					double kareKok = Double.parseDouble(String.valueOf(textSonuc.getText()));
					kareKok = Math.sqrt(kareKok);
					textSonuc.setText(String.valueOf(kareKok));

				}

			}
		});
		btnyuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0) {
					sayi1 = Double.parseDouble(textSonuc.getText());
					sayi2 = Double.parseDouble(textSonuc.getText());

					sayi2 = 0;
					textSonuc.setText("");

					isaret = "%";
				}
			}
		});
		JButton btnesittir = new JButton("=");
		GridBagConstraints gbc_btnesittir = new GridBagConstraints();
		gbc_btnesittir.fill = GridBagConstraints.BOTH;
		gbc_btnesittir.gridx = 4;
		gbc_btnesittir.gridy = 4;
		panel_1.add(btnesittir, gbc_btnesittir);
		btnesittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textSonuc.getText().length() > 0)
					sayi2 = Double.parseDouble(textSonuc.getText());

				if (isaret == "+") {
					sonuc = sayi1 + sayi2;
					textSonuc.setText(String.valueOf(sonuc));
				} else if (isaret == "-") {
					sonuc = sayi1 - sayi2;
					textSonuc.setText(String.valueOf(sonuc));
				} else if (isaret == "x") {
					sonuc = sayi1 * sayi2;
					textSonuc.setText(String.valueOf(sonuc));
				} else if (isaret == "÷") {

					sonuc = sayi1 / sayi2;
					textSonuc.setText(String.valueOf(sonuc));
				} else if (isaret == "%") {
					if (sayi2 == 0) {
						sonuc = sayi1 / 100;

					} else
						sonuc = sayi1 * sayi2 / 100;
					textSonuc.setText(String.valueOf(sonuc));
				}
				isaret = "";
			}

		});
	}

}
