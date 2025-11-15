import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {

    public Principal() {
        setTitle("Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(245, 255, 250));
        panel.setLayout(new BorderLayout());

        JLabel mensaje = new JLabel("Bienvenido, " + Bienvenida.texto, SwingConstants.CENTER);
        mensaje.setFont(new Font("Segoe UI", Font.BOLD, 22));

        panel.add(mensaje, BorderLayout.CENTER);

        JButton salir = new JButton("Salir");
        salir.addActionListener(e -> System.exit(0));
        panel.add(salir, BorderLayout.SOUTH);
        add(panel);
    }
}
