import javax.swing.*;
import java.awt.*;

public class Bienvenida extends JFrame {

    public static String texto = "";
    private JTextField campoTexto;
    private JButton botonIngresar;

    public Bienvenida() {
        setTitle("Bienvenida");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(245, 245, 255));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("¡Bienvenido!");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titulo.setAlignmentX(CENTER_ALIGNMENT);

        JLabel label = new JLabel("Ingresa tu nombre:");
        label.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        label.setAlignmentX(CENTER_ALIGNMENT);

        campoTexto = new JTextField(15);
        campoTexto.setMaximumSize(new Dimension(200, 30));

        botonIngresar = new JButton("Ingresar");
        botonIngresar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        botonIngresar.setBackground(new Color(100, 149, 237));
        botonIngresar.setForeground(Color.WHITE);
        botonIngresar.setFocusPainted(false);
        botonIngresar.setAlignmentX(CENTER_ALIGNMENT);

        botonIngresar.addActionListener(e -> {
            texto = campoTexto.getText().trim();
            Licencia licencia = new Licencia();
            licencia.setVisible(true);
            setVisible(false);
        });

        panel.add(Box.createVerticalStrut(15));
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(15));
        panel.add(label);
        panel.add(campoTexto);
        panel.add(Box.createVerticalStrut(15));
        panel.add(botonIngresar);

        JButton salir = new JButton("Salir");
        salir.addActionListener(e -> System.exit(0));
        panel.add(salir, BorderLayout.SOUTH);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bienvenida().setVisible(true);
        });
    }
}
