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

public class MainMenuPage extends JFrame{
    public MainMenuPage(){
        setTitle("Movie Selection");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        
        JButton Spongebob = new JButton("Spongebob");
        JButton FastFurry = new JButton("Fast & Furious");
        JButton Avenger = new JButton("Avenger");
        JButton Ironman = new JButton("Iron Man");
        
        Spongebob.addActionListener(e -> new BookingPage("Spongebob", 20000));
        FastFurry.addActionListener(e -> new BookingPage("Fast & Furious", 20000));
        Avenger.addActionListener(e -> new BookingPage("Avenger", 20000));
        Ironman.addActionListener(e -> new BookingPage("Iron Man", 20000));
        
        setVisible(true);
    }
}