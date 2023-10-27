package co.edu.udea.views;

import co.edu.udea.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraUi extends JFrame{
    private JPanel PanelPrincipal;
    private JButton btnSiete;
    private JButton btnOcho;
    private JButton btnNueve;
    private JButton btnDivision;
    private JButton btnCuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnResta;
    private JButton btnDos;
    private JButton btnTres;
    private JButton btnUno;
    private JButton btnSuma;
    private JButton btnPunto;
    private JButton btnCero;
    private JButton btnIgual;
    private JTextField txtPantalla;
    private JButton btnLeftParentesis;
    private JButton btnC;
    private JButton btnRightPrentesis;
    private JButton btnMultiplicacion;

    public CalculadoraUi() {
        btnCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnCero.getText());
            }
        });

        btnUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnUno.getText());
            }
        });

        btnDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnDos.getText());
            }
        });

        btnTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnTres.getText());
            }
        });

        btnCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnCuatro.getText());
            }
        });

        btnCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnCinco.getText());
            }
        });

        btnSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnSeis.getText());
            }
        });

        btnSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnSiete.getText());
            }
        });

        btnOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnOcho.getText());
            }
        });

        btnNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnNueve.getText());
            }
        });

        btnPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnPunto.getText());
            }
        });

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnDivision.getText());
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnResta.getText());
            }
        });

        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnSuma.getText());
            }
        });

        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnMultiplicacion.getText());
            }
        });

        btnLeftParentesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnLeftParentesis.getText());
            }
        });

        btnRightPrentesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText()+ btnRightPrentesis.getText());
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setFont(new Font("Arial", Font.BOLD, 18));
                txtPantalla.setText("");
            }
        });

        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    txtPantalla.setText(String.valueOf(Calculadora.evaluar(txtPantalla.getText())));
                } catch (Exception ex) {
                    txtPantalla.setFont(new Font("Arial", Font.PLAIN, 12));
                    txtPantalla.setText("Error sintáctico en la expresión ingresada: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {

        CalculadoraUi calculadoraUi = new CalculadoraUi();
        calculadoraUi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadoraUi.setContentPane(calculadoraUi.PanelPrincipal);
        calculadoraUi.txtPantalla.setPreferredSize(new Dimension(300, 30));

        calculadoraUi.setVisible(true);
        calculadoraUi.setSize(300, 240);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - calculadoraUi.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - calculadoraUi.getHeight()) / 2);
        calculadoraUi.setLocation(x, y);

    }
}
