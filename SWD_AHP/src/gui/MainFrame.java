package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;

import java.awt.BorderLayout;

public class MainFrame extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		ProductsPanel p1 = new ProductsPanel();
		tabbedPane.addTab("Produkty", p1);
		
		CriteriaPanel p2 = new CriteriaPanel();
		tabbedPane.addTab("Kryteria", p2);
		
		PreferencesPanel p3 = new PreferencesPanel();
		tabbedPane.addTab("Preferencje", p3);
		
		ResultPanel p4 = new ResultPanel();
		tabbedPane.addTab("Ranking", p4);
	}
}
