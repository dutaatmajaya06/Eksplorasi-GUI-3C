# Eksplorasi-GUI-3C

5 Komponen GUI yang digunakan

1. Top-level Container Class: JFrame
   Menjadi jendela utama aplikasi, mengatur judul, ukuran, posisi, dan perilaku
   ketika jendela ditutup.

2. Intermediate Container Class: JPanel, JScrollPane
   JPanel: Mengelompokkan komponen GUI, seperti panel utama, panel formulir, panel tengah,
   dan panel tombol.
   JScrollPane digunakan sebagai wadah JTextArea agar hasil sapaan dapat ditampilkan dan digulir jika teks terlalu panjang.

4. Atomic Component Class: JLabel, JTextField, JComboBox, JButton, JCheckBox, JTextArea  
   JLabel menampilkan keterangan, JTextField menerima NIM dan nama,
   JComboBox menyediakan pilihan program studi, JButton menjalankan perintah, JCheckBox mengaktifkan atau menonaktifkan sapaan formal.
   dan JTextArea menampilkan hasil

5. Layout Classes: BorderLayout, GridLayout, FlowLayout  
   BorderLayout membagi area utama menjadi bagian utara, tengah, dan selatan.
   GridLayout menyusun label dan input dalam baris dan kolom.
   FlowLayout menyusun tombol secara berurutan.

6. Event Listener:
   ActionListener: Menangani klik tombol Simpan dan Reset.
   MouseAdapter: Memberikan efek perubahan warna ketika kursor berada di atas tombol Sapa
   KeyAdapter: Mengatur input nama agar hanya menerima huruf dan spasi.
   WindowAdapter: Dapat digunakan untuk menangani peristiwa pada jendela aplikasi.
