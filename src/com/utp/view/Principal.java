package com.utp.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtVel;
	private JTextField txtTiem;
	private JTextField txtDist;
	private JTextField txtRespta;
	private JTextField txtAceleracion;
	private JTextField txtTiempo;
	private JTextField txtVf;
	private JTextField txtVi;
	private JTextField txtRespuesta;
	private JButton btnA;

	/**
	 * Launch the application.
	 */

	private void Limpiar() {
		// TODO Auto-generated method stub

		txtRespta.setText("");
		txtDist.setText("");
		txtTiem.setText("");
		txtVel.setText("");
		txtAceleracion.setText("");
		txtRespuesta.setText("");
		txtTiempo.setText("");
		txtVf.setText("");
		txtVi.setText("");

	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		try {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 800, 580);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(0, 102, 0));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\banner.png"));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(181, 0, 603, 105);
			contentPane.add(lblNewLabel);

			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(181, 82, 603, 459);
			contentPane.add(tabbedPane);

			JPanel MRUA = new JPanel();
			MRUA.setForeground(Color.WHITE);
			MRUA.setBackground(new Color(0, 51, 0));
			tabbedPane.addTab("MRUA", null, MRUA, null);
			MRUA.setLayout(null);

			btnA = new JButton("Aceleracion");
			btnA.setFont(new Font("Arial", Font.BOLD, 14));
			btnA.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\icons8-acceleration-64.png"));
			btnA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double vf, vi, t, btna;

						vf = Double.parseDouble(txtVf.getText());
						vi = Double.parseDouble(txtVi.getText());
						t = Double.parseDouble(txtTiempo.getText());
						btna = (vf - vi) / t;

						txtRespuesta.setText(String.valueOf(btna));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "INGRESAR DATOS");

					}
				}
			});
			btnA.setBounds(394, 290, 194, 43);
			MRUA.add(btnA);

			JButton btnVf = new JButton("Velocidad Final");
			btnVf.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\icons8-gravedad-60.png"));
			btnVf.setFont(new Font("Arial", Font.BOLD, 14));
			btnVf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double vi, a, t, btnV, rpta;

						vi = Double.parseDouble(txtVi.getText());
						a = Double.parseDouble(txtAceleracion.getText());
						t = Double.parseDouble(txtTiempo.getText());
						btnV = vi + (a * t);

						txtRespuesta.setText(String.valueOf(btnV));
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "INGRESAR DATOS");

					}

				}
			});
			btnVf.setBounds(382, 355, 206, 42);
			MRUA.add(btnVf);

			JButton btnD2 = new JButton("2ax");
			btnD2.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\fisica (2).png"));
			btnD2.setFont(new Font("Arial", Font.BOLD, 14));
			btnD2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double vf, vi, t, a, btnx2;

						vf = Double.parseDouble(txtVf.getText());
						vi = Double.parseDouble(txtVi.getText());
						btnx2 = Math.pow(vf, 2) - Math.pow(vi, 2);
						txtRespuesta.setText(String.valueOf(btnx2));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "INGRESAR DATOS");

					}

				}
			});
			btnD2.setBounds(410, 176, 178, 43);
			MRUA.add(btnD2);

			JButton btnT = new JButton("Tiempo");
			btnT.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\cronografo.png"));
			btnT.setFont(new Font("Arial", Font.BOLD, 14));
			btnT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double vf, vi, a, btnt;

						vf = Double.parseDouble(txtVf.getText());
						vi = Double.parseDouble(txtVi.getText());
						a = Double.parseDouble(txtAceleracion.getText());
						btnt = (vf - vi) / a;

						txtRespuesta.setText(String.valueOf(btnt));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "INGRESAR DATOS");
					}

				}
			});
			btnT.setBounds(410, 68, 178, 46);
			MRUA.add(btnT);

			JButton btnD = new JButton("Distancia");
			btnD.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\distancia.png"));
			btnD.setFont(new Font("Arial", Font.BOLD, 14));
			btnD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double vf, vi, t, btnd;

						vf = Double.parseDouble(txtVf.getText());
						vi = Double.parseDouble(txtVi.getText());
						t = Double.parseDouble(txtTiempo.getText());
						btnd = ((vf + vi) / 2) * t;

						txtRespuesta.setText(String.valueOf(btnd));
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "INGRESAR DATOS");

					}

				}
			});
			btnD.setBounds(410, 125, 178, 42);
			MRUA.add(btnD);

			JButton btnLim = new JButton("Limpiar");
			btnLim.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\esc.png"));
			btnLim.setFont(new Font("Arial", Font.BOLD, 14));
			btnLim.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						Limpiar();
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "DATOS VACIOS");
					}

				}
			});
			btnLim.setBounds(187, 343, 178, 56);
			MRUA.add(btnLim);

			txtAceleracion = new JTextField();
			txtAceleracion.setHorizontalAlignment(SwingConstants.CENTER);
			txtAceleracion.setFont(new Font("Arial", Font.BOLD, 14));
			txtAceleracion.setBounds(26, 105, 66, 31);
			MRUA.add(txtAceleracion);
			txtAceleracion.setColumns(10);

			txtTiempo = new JTextField();
			txtTiempo.setHorizontalAlignment(SwingConstants.CENTER);
			txtTiempo.setFont(new Font("Arial", Font.BOLD, 14));
			txtTiempo.setColumns(10);
			txtTiempo.setBounds(26, 187, 66, 32);
			MRUA.add(txtTiempo);

			JTextField txtDistancia = new JTextField();
			txtDistancia.setHorizontalAlignment(SwingConstants.CENTER);
			txtDistancia.setFont(new Font("Arial", Font.BOLD, 14));
			txtDistancia.setColumns(10);
			txtDistancia.setBounds(26, 265, 66, 40);
			MRUA.add(txtDistancia);

			txtVf = new JTextField();
			txtVf.setHorizontalAlignment(SwingConstants.CENTER);
			txtVf.setFont(new Font("Arial", Font.BOLD, 14));
			txtVf.setColumns(10);
			txtVf.setBounds(189, 106, 66, 31);
			MRUA.add(txtVf);

			txtVi = new JTextField();
			txtVi.setHorizontalAlignment(SwingConstants.CENTER);
			txtVi.setFont(new Font("Arial", Font.BOLD, 14));
			txtVi.setColumns(10);
			txtVi.setBounds(188, 192, 67, 36);
			MRUA.add(txtVi);

			txtRespuesta = new JTextField();
			txtRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
			txtRespuesta.setFont(new Font("Arial", Font.BOLD, 14));
			txtRespuesta.setColumns(10);
			txtRespuesta.setBounds(26, 361, 72, 31);
			MRUA.add(txtRespuesta);

			JLabel lblNewLabel_1 = new JLabel("Aceleracion");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(26, 76, 103, 31);
			MRUA.add(lblNewLabel_1);

			JLabel lblNewLabel_1_1 = new JLabel("Tiempo");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(26, 146, 103, 42);
			MRUA.add(lblNewLabel_1_1);

			JLabel lblNewLabel_1_2 = new JLabel("Distancia");
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_2.setBounds(26, 236, 102, 31);
			MRUA.add(lblNewLabel_1_2);

			JLabel lblNewLabel_1_3 = new JLabel("Velocidad Inicial");
			lblNewLabel_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_3.setBounds(170, 159, 103, 39);
			MRUA.add(lblNewLabel_1_3);

			JLabel lblNewLabel_1_4 = new JLabel("Velocidad Final");
			lblNewLabel_1_4.setForeground(Color.WHITE);
			lblNewLabel_1_4.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_4.setBounds(170, 76, 103, 31);
			MRUA.add(lblNewLabel_1_4);

			JLabel lblNewLabel_1_3_1 = new JLabel("Respuesta");
			lblNewLabel_1_3_1.setForeground(Color.WHITE);
			lblNewLabel_1_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
			lblNewLabel_1_3_1.setBounds(26, 323, 103, 42);
			MRUA.add(lblNewLabel_1_3_1);

			JButton btnax = new JButton("Distancia_Two");
			btnax.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\distancia1.png"));
			btnax.setFont(new Font("Arial", Font.BOLD, 14));
			btnax.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						double t, vi, a, btnd, rpta;

						t = Double.parseDouble(txtTiempo.getText());
						vi = Double.parseDouble(txtVi.getText());
						a = Double.parseDouble(txtAceleracion.getText());
						btnd = (vi * t) + (a * Math.pow(t, 2) / 2);

						txtRespuesta.setText(String.valueOf(btnd));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "FALTAN INGRESAR DATOS");

					}

				}
			});
			btnax.setBounds(410, 230, 178, 42);
			MRUA.add(btnax);

			JLabel lblNewLabel_5 = new JLabel("MOVIMIENTO RECTILINIU UNIFORME ACELERADO");
			lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 22));
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setBounds(0, 10, 551, 46);
			MRUA.add(lblNewLabel_5);

			JPanel MRU = new JPanel();
			MRU.setBackground(new Color(0, 51, 0));
			tabbedPane.addTab("MRU", null, MRU, null);
			MRU.setLayout(null);

			JButton btnCalcularV = new JButton("Calcular V");
			btnCalcularV.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\icons8-acceleration-64.png"));
			btnCalcularV.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					double d, t;

					try {

						d = Double.parseDouble(txtDist.getText());
						t = Double.parseDouble(txtTiem.getText());

						txtRespta.setText(String.valueOf((double) d / t));

					} catch (Exception e2) {
						// TODO: handle exception

						JOptionPane.showMessageDialog(null, "FALTAN INGRESAR LA DISTANCIA O TIEMPO");

					}

				}
			});
			btnCalcularV.setBounds(25, 126, 169, 52);
			MRU.add(btnCalcularV);

			JButton btnCalcularT = new JButton("Calcular T");
			btnCalcularT.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\cronografo.png"));
			btnCalcularT.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					double d, v;

					try {

						d = Double.parseDouble(txtDist.getText());
						v = Double.parseDouble(txtVel.getText());

						txtRespta.setText(String.valueOf(d / v));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "FALTAN INGRESAR LA DISTANCIA O VELOCIDAD");

					}

				}
			});
			btnCalcularT.setBounds(25, 250, 169, 52);
			MRU.add(btnCalcularT);

			JButton btnCalcularD = new JButton("Calcular D");
			btnCalcularD.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\distancia1.png"));
			btnCalcularD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					double v, t;

					try {

						v = Double.parseDouble(txtVel.getText());
						t = Double.parseDouble(txtTiem.getText());

						txtRespta.setText(String.valueOf((double) v * t));

					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "FALTAN INGRESAR LA VELOCIDAD  O TIEMPO");

					}
				}
			});
			btnCalcularD.setBounds(25, 188, 169, 52);
			MRU.add(btnCalcularD);

			JButton btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\esc.png"));
			btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {

						Limpiar();

					} catch (Exception e2) {
						// TODO: handle exception

						JOptionPane.showMessageDialog(null, "DATOS VACIOS");

					}

				}
			});
			btnLimpiar.setBounds(25, 356, 169, 47);
			MRU.add(btnLimpiar);

			txtVel = new JTextField();
			txtVel.setColumns(10);
			txtVel.setBounds(380, 158, 60, 40);
			MRU.add(txtVel);

			txtTiem = new JTextField();
			txtTiem.setColumns(10);
			txtTiem.setBounds(495, 158, 60, 40);
			MRU.add(txtTiem);

			txtDist = new JTextField();
			txtDist.setColumns(10);
			txtDist.setBounds(455, 250, 60, 32);
			MRU.add(txtDist);

			txtRespta = new JTextField();
			txtRespta.setColumns(10);
			txtRespta.setBounds(365, 356, 75, 47);
			MRU.add(txtRespta);

			JLabel lblNewLabel_2 = new JLabel("Velocidad");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2.setBounds(365, 102, 105, 52);
			MRU.add(lblNewLabel_2);

			JLabel lblNewLabel_2_1 = new JLabel("Distancia");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1.setBounds(445, 209, 81, 52);
			MRU.add(lblNewLabel_2_1);

			JLabel lblNewLabel_2_1_1 = new JLabel("Tiempo");
			lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1_1.setBounds(479, 108, 92, 40);
			MRU.add(lblNewLabel_2_1_1);

			JLabel lblNewLabel_2_1_1_1 = new JLabel("Respuesta");
			lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1_1_1.setBounds(359, 304, 81, 52);
			MRU.add(lblNewLabel_2_1_1_1);

			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(
					new ImageIcon("C:\\Users\\centi\\eclipse-workspace\\Aplicativo\\src\\com\\utp\\img\\atomo.png"));
			lblNewLabel_3.setBounds(513, 191, 35, 59);
			MRU.add(lblNewLabel_3);

			JLabel lblNewLabel_3_2 = new JLabel("");
			lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_2.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\atomo.png"));
			lblNewLabel_3_2.setBounds(456, 328, 92, 75);
			MRU.add(lblNewLabel_3_2);

			JLabel lblNewLabel_6 = new JLabel("MOVIMIENTO RECTILINO UNIFORME");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setForeground(Color.WHITE);
			lblNewLabel_6.setBackground(Color.WHITE);
			lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 22));
			lblNewLabel_6.setBounds(10, 10, 538, 69);
			MRU.add(lblNewLabel_6);

			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\FMRR.png"));
			lblNewLabel_7.setBounds(204, 129, 174, 122);
			MRU.add(lblNewLabel_7);

			JLabel lblNewLabel_2_1_2 = new JLabel("Metro");
			lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2.setForeground(Color.WHITE);
			lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1_2.setBounds(507, 245, 81, 40);
			MRU.add(lblNewLabel_2_1_2);

			JLabel lblNewLabel_2_1_2_1 = new JLabel("S");
			lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1_2_1.setBounds(527, 157, 81, 40);
			MRU.add(lblNewLabel_2_1_2_1);

			JLabel lblNewLabel_2_1_2_1_1 = new JLabel("M/S");
			lblNewLabel_2_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 15));
			lblNewLabel_2_1_2_1_1.setBounds(429, 158, 81, 40);
			MRU.add(lblNewLabel_2_1_2_1_1);

			JLabel lblNewLabel_3_1 = new JLabel("");
			lblNewLabel_3_1.setBounds(24, 34, 128, 130);
			contentPane.add(lblNewLabel_3_1);
			lblNewLabel_3_1.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\einstein.png"));

			JLabel lblNewLabel_3_3 = new JLabel("");
			lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_3.setBounds(0, 391, 186, 131);
			contentPane.add(lblNewLabel_3_3);
			lblNewLabel_3_3.setIcon(new ImageIcon(
					"C:\\Users\\Usuario\\eclipse-workspace\\Fisica\\Aplicativo\\src\\com\\utp\\img\\relatividad.png"));

			JLabel lblNewLabel_4 = new JLabel("Usuario");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
			lblNewLabel_4.setBounds(0, 174, 186, 21);
			contentPane.add(lblNewLabel_4);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
