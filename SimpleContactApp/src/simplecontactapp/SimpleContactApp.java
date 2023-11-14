/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecontactapp;

/**
 *
 * @author Atlai Camero
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SimpleContactApp {
    private ArrayList<Contact> contactList = new ArrayList<>();

    private JFrame frame;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextArea displayArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                SimpleContactApp window = new SimpleContactApp();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public SimpleContactApp() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Simple Contact App");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(10, 11, 46, 14);
        frame.getContentPane().add(lblName);

        nameField = new JTextField();
        nameField.setBounds(66, 8, 150, 20);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel lblPhone = new JLabel("Phone:");
         lblPhone.setBounds(226, 11, 46, 14);
        frame.getContentPane().add(lblPhone);

        phoneField = new JTextField();
        phoneField.setBounds(282, 8, 150, 20);
        frame.getContentPane().add(phoneField);
        phoneField.setColumns(10);

        JButton btnAddContact = new JButton("Add Contact");
        btnAddContact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });
        btnAddContact.setBounds(162, 39, 140, 23);
        frame.getContentPane().add(btnAddContact);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setBounds(10, 73, 414, 177);
        frame.getContentPane().add(displayArea);
    }
    
     private void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();

        if (!name.isEmpty() && !phone.isEmpty()) {
            Contact contact = new Contact(name, phone, "");
            contactList.add(contact);
            displayContacts();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(frame, "Please fill in both name and phone fields.");
        }
    }

    private void displayContacts() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Contact contact : contactList) {
            stringBuilder.append(contact.toString()).append("\n");
        }
        displayArea.setText(stringBuilder.toString());
    }

    private void clearFields() {
        nameField.setText("");
        phoneField.setText("");
    }
}
    

