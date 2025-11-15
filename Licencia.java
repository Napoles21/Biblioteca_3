import javax.swing.*;
import java.awt.*;

public class Licencia extends JFrame {

    private JCheckBox check;
    private JButton continuar, noAceptar;

    public Licencia() {
        setTitle("Licencia");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 248, 255));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("Términos y Condiciones");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setAlignmentX(CENTER_ALIGNMENT);

        check = new JCheckBox("Yo " + Bienvenida.texto + " acepto los términos");
        check.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        check.setBackground(new Color(240, 248, 255));
        check.setAlignmentX(CENTER_ALIGNMENT);

        continuar = new JButton("Continuar");
        continuar.setEnabled(false);
        continuar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        continuar.setBackground(new Color(60, 179, 113));
        continuar.setForeground(Color.WHITE);
        continuar.setFocusPainted(false);

        noAceptar = new JButton("No acepto");
        noAceptar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        noAceptar.setBackground(new Color(220, 20, 60));
        noAceptar.setForeground(Color.WHITE);
        noAceptar.setFocusPainted(false);

        check.addChangeListener(e -> {
            boolean ok = check.isSelected();
            continuar.setEnabled(ok);
            noAceptar.setEnabled(!ok);
        });

        continuar.addActionListener(e -> {
            new Principal().setVisible(true);
            setVisible(false);
        });

        noAceptar.addActionListener(e -> {
            new Bienvenida().setVisible(true);
            setVisible(false);
        });

        panel.add(Box.createVerticalStrut(15));
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(20));
        panel.add(check);
        panel.add(Box.createVerticalStrut(20));
        panel.add(continuar);
        panel.add(Box.createVerticalStrut(10));
        panel.add(noAceptar);

        JButton salir = new JButton("Salir");
        salir.addActionListener(e -> System.exit(0));
        panel.add(salir, BorderLayout.SOUTH);
        add(panel);
    }
}
