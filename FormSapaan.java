
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormSapaan extends JFrame {

    JTextField nama;
    JComboBox<String> jurusan;
    JCheckBox formal;
    JTextArea hasil;
    JButton sapa, reset;

    public FormSapaan() {
        setTitle("Latihan GUI Java - Form Sapaan");
        setSize(540, 420);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Judul
        JLabel judul = new JLabel(
            "Form Sapaan Mahasiswa", JLabel.CENTER
        );
        judul.setFont(new Font("Arial", Font.BOLD, 22));
        add(judul, BorderLayout.NORTH);

        // Form input
        JPanel form = new JPanel(new GridLayout(3, 1, 5, 15));

        JPanel barisNama = new JPanel(new FlowLayout(FlowLayout.LEFT));
        barisNama.add(new JLabel("Nama:"));
        nama = new JTextField(23);
        barisNama.add(nama);

        JPanel barisJurusan = new JPanel(new FlowLayout(FlowLayout.LEFT));
        barisJurusan.add(new JLabel("Jurusan:"));

        jurusan = new JComboBox<>(new String[]{
            "Teknik Informatika",
            "Sistem Informasi",
            "Teknik Elektro",
            "Teknik Sipil"
        });
        jurusan.setPreferredSize(new Dimension(265, 27));
        barisJurusan.add(jurusan);

        JPanel barisFormal = new JPanel(new FlowLayout(FlowLayout.LEFT));
        formal = new JCheckBox("Gunakan sapaan formal");
        formal.setSelected(true);
        barisFormal.add(formal);

        form.add(barisNama);
        form.add(barisJurusan);
        form.add(barisFormal);

        add(form, BorderLayout.CENTER);

        // Tombol
        JPanel panelBawah = new JPanel(new BorderLayout());

        JPanel tombol = new JPanel(new FlowLayout());
        sapa = new JButton("Sapa");
        reset = new JButton("Reset");

        tombol.add(sapa);
        tombol.add(reset);

        panelBawah.add(tombol, BorderLayout.NORTH);

        // Area hasil
        hasil = new JTextArea(5, 40);
        hasil.setEditable(false);

        JScrollPane scroll = new JScrollPane(hasil);
        panelBawah.add(scroll, BorderLayout.CENTER);

        add(panelBawah, BorderLayout.SOUTH);

        // Event tombol Sapa
        sapa.addActionListener(e -> {
            String namaMhs = nama.getText().trim();
            String prodi = jurusan.getSelectedItem().toString();

            if (namaMhs.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this, "Nama harus diisi!"
                );
            } else {
                String sapaan;

                if (formal.isSelected()) {
                    sapaan = "Selamat datang, Saudara/i ";
                } else {
                    sapaan = "Halo, ";
                }

                hasil.setText(
                    sapaan + namaMhs +
                    "\nJurusan: " + prodi
                );
            }
        });

        // Event tombol Reset
        reset.addActionListener(e -> {
            nama.setText("");
            jurusan.setSelectedIndex(0);
            formal.setSelected(true);
            hasil.setText("");
        });

        // MouseAdapter
        sapa.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                sapa.setBackground(Color.GREEN);
            }

            public void mouseExited(MouseEvent e) {
                sapa.setBackground(null);
            }
        });

        // KeyAdapter
        nama.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!Character.isLetter(e.getKeyChar())
                    && !Character.isWhitespace(e.getKeyChar())) {
                    e.consume();
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormSapaan();
    }
}
