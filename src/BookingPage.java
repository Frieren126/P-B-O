/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingPage extends JFrame{
    private JLabel dataBookingLabel;
    private JLabel totalHargaLabel;
    private JTextField namaField;
    private JRadioButton lakiRadio;
    private JRadioButton perempuanRadio;
    private JRadioButton femboyRadio;
    private JSpinner jumlahSpinner;
    private JTextField lamaField;
    private int hargaPerMovie;
    
    public BookingPage(String roomType, int harga){
        this.hargaPerMovie = harga;
        setTitle("Booking -" + roomType);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        JLabel namaLabel = new JLabel("Nama:");
        namaField = new JTextField(20);
        JLabel jumlahLabel = new JLabel("Booking Date: ");
        jumlahSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        JLabel lamaLabel = new JLabel("Showtime :");
        lamaField = new JTextField(5);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(lakiRadio);
        genderGroup.add(perempuanRadio);
        JLabel genderLabel = new JLabel("Payment Method:");
        lakiRadio = new JRadioButton("Credit Card");
        perempuanRadio = new JRadioButton("E-Wallet");
        femboyRadio = new JRadioButton("Bank Transfer");
        JButton pesanButton = new JButton("Pesan");
        JButton resetButton = new JButton("Reset");
        JButton kembaliButton = new JButton("Kembali");
        
        dataBookingLabel = new JLabel("Data Booking: -");
        totalHargaLabel = new JLabel("Total Harga: -");
        
        gbc.gridx = 0; gbc.gridy = 0; add(namaLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; add(namaField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; add(genderLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; add(lakiRadio, gbc);
        gbc.gridx = 2; gbc.gridy = 1; add(perempuanRadio, gbc);
        gbc.gridx = 0; gbc.gridy = 2; add(jumlahLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2; add(jumlahSpinner, gbc);
        gbc.gridx = 0; gbc.gridy = 3; add(lamaLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 3; add(lamaField, gbc);
        gbc.gridx = 0; gbc.gridy = 4; add(pesanButton, gbc);
        gbc.gridx = 1; gbc.gridy = 4; add(resetButton, gbc);
        gbc.gridx = 2; gbc.gridy = 4; add(kembaliButton, gbc);
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 3; add(dataBookingLabel, gbc);
        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 3; add(totalHargaLabel, gbc);
        
        pesanButton.addActionListener(e -> pesanKamar(roomType));
        resetButton.addActionListener(e -> resetForm());
        kembaliButton.addActionListener(e -> {dispose(); new MainMenuPage();});
        
        setVisible(true);
    }
    
    private void pesanKamar(String roomType){
        String nama = namaField.getText();
        String gender = lakiRadio.isSelected() ? "Credit Card" : perempuanRadio.isSelected() ? "E-Wallet" : perempuanRadio.isSelected() ? "Bank Transfer" : "-";
    }
    
    private void resetForm(){
        namaField.setText("");
        jumlahSpinner.setValue(1);
        lamaField.setText("");
        dataBookingLabel.setText("Data Booking: -");
        totalHargaLabel.setText("Total Harga: -");
    }
}
