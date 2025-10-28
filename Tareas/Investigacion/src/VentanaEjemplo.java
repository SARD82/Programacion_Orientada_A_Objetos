import javax.swing.*;

public class VentanaEjemplo extends JFrame {
    public VentanaEjemplo() {
        setTitle("Mi primera interfaz");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel etiqueta = new JLabel("Hola, Java!");
        etiqueta.setBounds(100, 50, 100, 30);
        add(etiqueta);

        JButton boton = new JButton("Cerrar");
        boton.setBounds(100, 100, 100, 30);
        boton.addActionListener(e -> dispose());
        add(boton);
    }

    public static void main(String[] args) {
        new VentanaEjemplo().setVisible(true);
    }
}
