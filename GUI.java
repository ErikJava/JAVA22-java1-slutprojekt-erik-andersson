package calenderkladd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	static void createAndDisplay() {

		/*
		 * FRAME The main frame that holds all other content.
		 */

		MainFrame mainFrame = new MainFrame();

		/*
		 * TEXT FIELDS For user input.
		 */

		JTextField mondayField = new JTextField("Add event...");
		mondayField.setBounds(15, 350, 165, 25);
		mainFrame.add(mondayField);

		JTextField tuesdayField = new JTextField("Add event...");
		tuesdayField.setBounds(220, 350, 165, 25);
		mainFrame.add(tuesdayField);

		JTextField wednesdayField = new JTextField("Add event...");
		wednesdayField.setBounds(420, 350, 165, 25);
		mainFrame.add(wednesdayField);

		JTextField thursdayField = new JTextField("Add event...");
		thursdayField.setBounds(620, 350, 165, 25);
		mainFrame.add(thursdayField);

		JTextField fridayField = new JTextField("Add event...");
		fridayField.setBounds(820, 350, 165, 25);
		mainFrame.add(fridayField);

		JTextField saturdayField = new JTextField("Add event...");
		saturdayField.setBounds(1020, 350, 165, 25);
		mainFrame.add(saturdayField);

		JTextField sundayField = new JTextField("Add event...");
		sundayField.setBounds(1220, 350, 165, 25);
		mainFrame.add(sundayField);

		/*
		 * BUTTONS Prints user input from JTextFields into the Calendar when clicked.
		 */

		JButton mondayButton = new JButton("ADD");
		mondayButton.setBounds(75, 400, 60, 40);
		mondayButton.setBackground(Color.orange);

		JButton tuesdayButton = new JButton("ADD");
		tuesdayButton.setBounds(270, 400, 60, 40);
		tuesdayButton.setBackground(Color.orange);

		JButton wednesdayButton = new JButton("ADD");
		wednesdayButton.setBounds(470, 400, 60, 40);
		wednesdayButton.setBackground(Color.orange);

		JButton thursdayButton = new JButton("ADD");
		thursdayButton.setBounds(670, 400, 60, 40);
		thursdayButton.setBackground(Color.orange);

		JButton fridayButton = new JButton("ADD");
		fridayButton.setBounds(870, 400, 60, 40);
		fridayButton.setBackground(Color.orange);

		JButton saturdayButton = new JButton("ADD");
		saturdayButton.setBounds(1070, 400, 60, 40);
		saturdayButton.setBackground(Color.orange);

		JButton sundayButton = new JButton("ADD");
		sundayButton.setBounds(1270, 400, 60, 40);
		sundayButton.setBackground(Color.orange);

		/*
		 * PANELS Every JPanel that holds all other GUI components.
		 */

		JPanel mondayPanel = new JPanel();
		mondayPanel.setBackground(Color.gray);
		mondayPanel.setBounds(0, 0, 200, 500);
		mondayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel tuesdayPanel = new JPanel();
		tuesdayPanel.setBackground(Color.gray);
		tuesdayPanel.setBounds(200, 0, 200, 500);
		tuesdayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel wednesdayPanel = new JPanel();
		wednesdayPanel.setBackground(Color.gray);
		wednesdayPanel.setBounds(400, 0, 200, 500);
		wednesdayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel thursdayPanel = new JPanel();
		thursdayPanel.setBackground(Color.gray);
		thursdayPanel.setBounds(600, 0, 200, 500);
		thursdayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel fridayPanel = new JPanel();
		fridayPanel.setBackground(Color.gray);
		fridayPanel.setBounds(800, 0, 200, 500);
		fridayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel saturdayPanel = new JPanel();
		saturdayPanel.setBackground(Color.gray);
		saturdayPanel.setBounds(1000, 0, 200, 500);
		saturdayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		JPanel sundayPanel = new JPanel();
		sundayPanel.setBackground(Color.gray);
		sundayPanel.setBounds(1200, 0, 200, 500);
		sundayPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		/*
		 * DATE This makes the dates appear correctly in the Calendar, it also
		 * highlights the current day in RED.
		 */

		LocalDate today = LocalDate.now();
		Month month = today.getMonth();
		DayOfWeek day = today.getDayOfWeek();
		String stringMonth = month.name();
		int dayOfMonth = today.getDayOfMonth();

		LocalDate startDate = today.minusDays(day.getValue() - 1);
		LocalDate mondayDate = startDate.plusDays(0);
		LocalDate tuesdayDate = startDate.plusDays(1);
		LocalDate wednesdayDate = startDate.plusDays(2);
		LocalDate thursdayDate = startDate.plusDays(3);
		LocalDate fridayDate = startDate.plusDays(4);
		LocalDate saturdayDate = startDate.plusDays(5);
		LocalDate sundayDate = startDate.plusDays(6);

		if (today.getDayOfWeek() == DayOfWeek.MONDAY) {
			mondayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.TUESDAY) {
			tuesdayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
			wednesdayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.THURSDAY) {
			thursdayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.FRIDAY) {
			fridayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.SATURDAY) {
			saturdayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		if (today.getDayOfWeek() == DayOfWeek.SUNDAY) {
			sundayPanel.setBorder(BorderFactory.createLineBorder(Color.red));
		}

		/*
		 * LABELS AND TEXT FIELDS JLabels that stores all dates, TextLabels that stores
		 * user input.
		 */

		JLabel mondayLabel = new JLabel("MONDAY" + ", " + mondayDate.getDayOfMonth() + " " + mondayDate.getMonth());
		JLabel mondayTextLabel = new JLabel("");
		mondayTextLabel.setBounds(75, 0, 300, 300);

		JLabel tuesdayLabel = new JLabel("TUESDAY" + ", " + tuesdayDate.getDayOfMonth() + " " + tuesdayDate.getMonth());
		JLabel tuesdayTextLabel = new JLabel("");
		tuesdayTextLabel.setBounds(275, 0, 300, 300);

		JLabel wednesdayLabel = new JLabel(
				"WEDNESDAY" + ", " + wednesdayDate.getDayOfMonth() + " " + wednesdayDate.getMonth());
		JLabel wednesdayTextLabel = new JLabel("");
		wednesdayTextLabel.setBounds(475, 0, 300, 300);

		JLabel thursdayLabel = new JLabel(
				"THURSDAY" + ", " + thursdayDate.getDayOfMonth() + " " + thursdayDate.getMonth());
		JLabel thursdayTextLabel = new JLabel("");
		thursdayTextLabel.setBounds(675, 0, 300, 300);

		JLabel fridayLabel = new JLabel("FRIDAY" + ", " + fridayDate.getDayOfMonth() + " " + fridayDate.getMonth());
		JLabel fridayTextLabel = new JLabel("");
		fridayTextLabel.setBounds(875, 0, 300, 300);

		JLabel saturdayLabel = new JLabel(
				"SATURDAY" + ", " + saturdayDate.getDayOfMonth() + " " + saturdayDate.getMonth());
		JLabel saturdayTextLabel = new JLabel("");
		saturdayTextLabel.setBounds(1075, 0, 300, 300);

		JLabel sundayLabel = new JLabel("SUNDAY" + ", " + sundayDate.getDayOfMonth() + " " + sundayDate.getMonth());
		JLabel sundayTextLabel = new JLabel("");
		sundayTextLabel.setBounds(1275, 0, 300, 300);

		/*
		 * ADD COMPONENTS For adding all GUI content onto the JPanels & MainFrame.
		 */

		mondayPanel.add(mondayLabel);
		mainFrame.add(mondayButton);
		mainFrame.add(mondayTextLabel);
		mainFrame.add(mondayPanel);

		tuesdayPanel.add(tuesdayLabel);
		mainFrame.add(tuesdayButton);
		mainFrame.add(tuesdayTextLabel);
		mainFrame.add(tuesdayPanel);

		wednesdayPanel.add(wednesdayLabel);
		mainFrame.add(wednesdayButton);
		mainFrame.add(wednesdayTextLabel);
		mainFrame.add(wednesdayPanel);

		thursdayPanel.add(thursdayLabel);
		mainFrame.add(thursdayButton);
		mainFrame.add(thursdayTextLabel);
		mainFrame.add(thursdayPanel);

		fridayPanel.add(fridayLabel);
		mainFrame.add(fridayButton);
		mainFrame.add(fridayTextLabel);
		mainFrame.add(fridayPanel);

		saturdayPanel.add(saturdayLabel);
		mainFrame.add(saturdayButton);
		mainFrame.add(saturdayTextLabel);
		mainFrame.add(saturdayPanel);

		sundayPanel.add(sundayLabel);
		mainFrame.add(sundayButton);
		mainFrame.add(sundayTextLabel);
		mainFrame.add(sundayPanel);

		mainFrame.setVisible(true);

		/*
		 * ACTION LISTENER Printing input into the Calendar when clicking JButtons.
		 */

		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mondayButton) {
					mondayTextLabel.setText(mondayField.getText());
					mondayField.setText("");
				} else if (e.getSource() == tuesdayButton) {
					tuesdayTextLabel.setText(tuesdayField.getText());
					tuesdayField.setText("");

				} else if (e.getSource() == wednesdayButton) {
					wednesdayTextLabel.setText(wednesdayField.getText());
					wednesdayField.setText("");

				} else if (e.getSource() == thursdayButton) {
					thursdayTextLabel.setText(thursdayField.getText());
					thursdayField.setText("");

				} else if (e.getSource() == fridayButton) {
					fridayTextLabel.setText(fridayField.getText());
					fridayField.setText("");

				} else if (e.getSource() == saturdayButton) {
					saturdayTextLabel.setText(saturdayField.getText());
					saturdayField.setText("");

				} else if (e.getSource() == sundayButton) {
					sundayTextLabel.setText(sundayField.getText());
					sundayField.setText("");
				}
			}
		};
		mondayButton.addActionListener(buttonListener);
		tuesdayButton.addActionListener(buttonListener);
		wednesdayButton.addActionListener(buttonListener);
		thursdayButton.addActionListener(buttonListener);
		fridayButton.addActionListener(buttonListener);
		saturdayButton.addActionListener(buttonListener);
		sundayButton.addActionListener(buttonListener);
	}
}