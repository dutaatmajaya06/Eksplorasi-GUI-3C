# Eksplorasi-GUI-3C

5 Komponen GUI yang digunakan

1. Kontainer tingkat atas: JFrame
   Menjadi jendela utama aplikasi, mengatur judul, ukuran, posisi, dan perilaku
   ketika jendela ditutup.

2. Kontainer menengah: JPanel  
   Mengelompokkan komponen GUI, seperti panel utama, panel formulir, panel tengah,
   dan panel tombol.

3. Komponen atom: JLabel, JTextField, JComboBox, JButton, JTextArea  
   JLabel menampilkan keterangan, JTextField menerima NIM dan nama,
   JComboBox menyediakan pilihan program studi, JButton menjalankan perintah,
   dan JTextArea menampilkan hasil.

4. Kelas tata letak: BorderLayout, GridLayout, FlowLayout  
   BorderLayout membagi area utama menjadi bagian utara, tengah, dan selatan.
   GridLayout menyusun label dan input dalam baris dan kolom.
   FlowLayout menyusun tombol secara berurutan.

5. Pendengar peristiwa: ActionListener
   Menangani klik tombol Simpan dan Reset. Tombol Simpan memeriksa input lalu
   menampilkan data, sedangkan tombol Reset mengosongkan formulir.
