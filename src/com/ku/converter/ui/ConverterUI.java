package com.ku.converter.ui;

/***
 * Respresents the programme of the conversions of unit by using a conversion factor
 * @author Methawee Apinainarong 5810546714
 */

import javax.swing.*;
import javax.swing.event.DocumentEvent;

import com.ku.converter.unit.*;
import com.ku.converter.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class ConverterUI extends JFrame {

	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenuItem exit;
	private JComboBox firstUnit;
	private JComboBox secondUnit;
	private JTextField input;
	private JTextField result;
	private JRadioButton leftToRight;
	private JRadioButton rightToLeft;
	private JButton convertButton;
	private JButton clearButton;
	private UnitConverter unitconverter;

	public ConverterUI(UnitConverter converter) {

		this.unitconverter = converter;
		this.setTitle("Unit Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	/***
	 * Perform designing the window of distance converter program there are 2
	 * style in this program, at first, if user click the button left > right
	 * user can input the value field in the input textfield (on the left), then
	 * choose your current unit by using combo box beside, afterwards user can
	 * choose the unit that you wanna change, and the result will happen in the
	 * result at the right field by click enter or click on convert button. then
	 * again, in the right to left version, using similar as the first one, but
	 * the input field will at the right of the window.
	 */

	private JMenu makeMenu() {

		menu = new JMenu("Unit type");

		UnitType[] unittypes = UnitFactory.getInstance().getUnitTypes();

		for (UnitType utype : unittypes) {
			menuItem = new JMenuItem(utype.toString());
			menuItem.addActionListener(new UnitAction(utype));
			menu.add(menuItem);
		}

		menu.addSeparator();
		exit = new JMenuItem("Exit");
		exit.addActionListener(new ExitAction());
		menu.add(exit);
		return menu;
	}

	private void initComponents() {

		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);

		menubar = new JMenuBar();
		this.setJMenuBar(menubar);

		menubar.add(this.makeMenu());

		input = new JTextField(7);
		this.add(input);
		input.setEditable(false);
		
		firstUnit = new JComboBox<>();
		this.add(firstUnit);
		
		JLabel equals = new JLabel(" = ");
		this.add(equals);

		result = new JTextField(7);
		this.add(result);
		result.setEditable(false);

		secondUnit = new JComboBox<>();

		this.add(secondUnit);

		convertButton = new JButton("Convert!");
		clearButton = new JButton("Clear");
		this.add(convertButton);
		this.add(clearButton);

		ActionListener listener = new ConvertButtonListener();
		convertButton.addActionListener(listener);

		ActionListener clear = new ClearButtonListener();
		clearButton.addActionListener(clear);

		leftToRight = new JRadioButton("Left > Right");
		this.add(leftToRight);

		rightToLeft = new JRadioButton("Right > Left");
		this.add(rightToLeft);

		ActionListener left = new leftToRightListener();
		leftToRight.addActionListener(left);

		ActionListener right = new rightToLeftListener();
		rightToLeft.addActionListener(right);

		input.addActionListener(listener);
		result.addActionListener(listener);
	}

	class ExitAction extends AbstractAction {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	}

	class UnitAction implements ActionListener {

		private UnitType type;

		public UnitAction(UnitType utype) {
			type = utype;
		}

		public void changeUnits(UnitType utype) {
			Unit[] units = unitconverter.getUnits(utype);
			firstUnit.removeAllItems();
			secondUnit.removeAllItems();
			for (Unit u : units) {
				firstUnit.addItem(u);
				secondUnit.addItem(u);
			}
		}

		public void actionPerformed(ActionEvent event) {

			if (type == UnitType.LENGTH) {
				changeUnits(UnitType.LENGTH);
				menu.setText("LENGTH");
			} else if (type == UnitType.AREA) {
				changeUnits(UnitType.AREA);
				menu.setText("AREA");
			} else if (type == UnitType.WEIGHT) {
				changeUnits(UnitType.WEIGHT);
				menu.setText("WEIGHT");
			} else if (type == UnitType.VOLUME) {
				changeUnits(UnitType.VOLUME);
				menu.setText("VOLUME");
			}
		}

	}

	public void run() {
		pack();
		setBounds(50, 50, 600, 120);
		setResizable(false);
		setVisible(true);
	}

	/***
	 * Perform the convert button to simplify the initial unit to the unit that
	 * user choose in the combo box.
	 */
	class ConvertButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (input.isEditable()) {
				String firstinput = input.getText().trim();
				if (firstinput.length() > 0) {
					try {
						double value = Double.valueOf(firstinput);
						double convert = unitconverter.convert(value, (Unit) firstUnit.getSelectedItem(),
								(Unit) secondUnit.getSelectedItem());
						result.setText(String.format("%.5g", convert));
					} catch (NumberFormatException a) {

					}
				}
			} else if (!input.isEditable()) {
				String second = result.getText().trim();
				if (second.length() > 0) {
					try {
						double value = Double.valueOf(second);
						double convert = unitconverter.convert(value, (Unit) secondUnit.getSelectedItem(),
								(Unit) firstUnit.getSelectedItem());
						input.setText(String.format("%.5g", convert));
					} catch (NumberFormatException a) {

					}
				}
			}
		}
	}

	/***
	 * Perform the clear button to clear all of the content in the window
	 */
	class ClearButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			input.setText("");
			result.setText("");
			leftToRight.setSelected(false);
			rightToLeft.setSelected(false);
			menu.setText("Unit type");
			firstUnit.removeAllItems();
			secondUnit.removeAllItems();
			
		}
	}

	/***
	 * 
	 * Perform the distance converter to convert value on the left side to the
	 * right side of the window
	 *
	 */
	class leftToRightListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			input.setEditable(true);
			result.setEditable(false);
			rightToLeft.setSelected(false);

		}
	}

	/***
	 * 
	 * Perform the distance converter to convert value on the right side to the
	 * left side of the window
	 *
	 */
	class rightToLeftListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			input.setEditable(false);
			result.setEditable(true);
			leftToRight.setSelected(false);
		}
	}
}
