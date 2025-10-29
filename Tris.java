package Tris;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Tris {

	private JFrame frmTris;
	private String winner = null;
	private Boolean cpu_play;
	private int turno = 0;
	private JFrame frmGame;
	private JPanel pnl_game;
	// bottoni
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tris window = new Tris();
					window.frmTris.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tris window2 = new Tris();
					window2.frmGame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tris() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGame = new JFrame();
		frmGame.setTitle("TRIS");
		frmGame.setBounds(100, 100, 300, 300);
		frmGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		pnl_game = new JPanel();
		pnl_game.setLayout(new GridLayout(3, 3, 7, 7));
		frmGame.getContentPane().add(pnl_game, BorderLayout.CENTER);
		pnl_game.setBackground(Color.BLACK);
		
		JOptionPane jOptionPane = new JOptionPane();
		
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn1.setBorderPainted(false);
		btn1.setFocusPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setOpaque(true);
		btn1.setText(" ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn1);
			}
		});
		pnl_game.add(btn1);
		
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn2.setBorderPainted(false);
		btn2.setFocusPainted(false);
		btn2.setContentAreaFilled(false);
		btn2.setOpaque(true);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn2);
			}
		});
		pnl_game.add(btn2);
		
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn3.setBorderPainted(false);
		btn3.setFocusPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.setOpaque(true);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn3);
			}
		});
		pnl_game.add(btn3);
		
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn4.setBorderPainted(false);
		btn4.setFocusPainted(false);
		btn4.setContentAreaFilled(false);
		btn4.setOpaque(true);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn4);
			}
		});
		pnl_game.add(btn4);
		
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn5.setBorderPainted(false);
		btn5.setFocusPainted(false);
		btn5.setContentAreaFilled(false);
		btn5.setOpaque(true);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn5);
			}
		});
		pnl_game.add(btn5);
		
		
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn6.setBorderPainted(false);
		btn6.setFocusPainted(false);
		btn6.setContentAreaFilled(false);
		btn6.setOpaque(true);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn6);
			}
		});
		pnl_game.add(btn6);
		
		btn7 = new JButton();
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn7.setBorderPainted(false);
		btn7.setFocusPainted(false);
		btn7.setContentAreaFilled(false);
		btn7.setOpaque(true);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn7);
			}
		});
		pnl_game.add(btn7);
		
		btn8 = new JButton();
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn8.setBorderPainted(false);
		btn8.setFocusPainted(false);
		btn8.setContentAreaFilled(false);
		btn8.setOpaque(true);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn8);
			}
		});
		pnl_game.add(btn8);
		
		btn9 = new JButton();
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn9.setBorderPainted(false);
		btn9.setFocusPainted(false);
		btn9.setContentAreaFilled(false);
		btn9.setOpaque(true);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleMove(btn9);
			}
		});
		pnl_game.add(btn9);
		
		
		frmTris = new JFrame();
		frmTris.setTitle("TRIS");
		frmTris.setBounds(100, 100, 300, 300);
		frmTris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmTris.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("TRIS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frmTris.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnVsCpu = new JButton("GIOCO 1 VS CPU");
		btnVsCpu.setVisible(true);
		btnVsCpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLAYER VS CPU
				
				
				
			}
		});
		btnVsCpu.setBounds(20, 53, 244, 47);
		panel_1.add(btnVsCpu);
		
		JButton btnVsPlayer = new JButton("GIOCO 1 VS 1");
		btnVsPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLAYER VS PLAYER
				
				frmGame.setVisible(true);
				frmTris.setVisible(false);
				//frmTris.setVisible(false);
				reset_tris();
			}
		});
		btnVsPlayer.setBounds(20, 110, 244, 47);
		panel_1.add(btnVsPlayer);
	}
	private void reset_tris() {
		btn1.setText(null);
		btn2.setText(null);
		btn3.setText(null);
		btn4.setText(null);
		btn5.setText(null);
		btn6.setText(null);
		btn7.setText(null);
		btn8.setText(null);
		btn9.setText(null);
		frmGame.setVisible(true);
		
	}
	
	private String checkWinner() {
    String[][] board = {
        { btn1.getText(), btn2.getText(), btn3.getText() },
        { btn4.getText(), btn5.getText(), btn6.getText() },
        { btn7.getText(), btn8.getText(), btn9.getText() }
    };

    // normalizza: evita null e spazi
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == null || board[i][j].isBlank()) {
                board[i][j] = "";
            }
        }
    }

    // Controllo righe
    for (int i = 0; i < 3; i++) {
        if (!board[i][0].isEmpty() &&
            board[i][0].equals(board[i][1]) &&
            board[i][1].equals(board[i][2])) {
            return board[i][0];
        }
    }

    // Controllo colonne
    for (int i = 0; i < 3; i++) {
        if (!board[0][i].isEmpty() &&
            board[0][i].equals(board[1][i]) &&
            board[1][i].equals(board[2][i])) {
            return board[0][i];
        }
    }

    // Controllo diagonali
    if (!board[0][0].isEmpty() &&
        board[0][0].equals(board[1][1]) &&
        board[1][1].equals(board[2][2])) {
        return board[0][0];
    }

    if (!board[0][2].isEmpty() &&
        board[0][2].equals(board[1][1]) &&
        board[1][1].equals(board[2][0])) {
        return board[0][2];
    }

    // Controllo se la griglia è piena (Patta)
    boolean full = true;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j].isEmpty()) {
                full = false;
                break;
            }
        }
    }

    if (full) {
        return "Patta";
    }

    return null;
}

	
	private void handleMove(JButton button) {
	    if (button.getText() == null || button.getText().isBlank()) {
	        button.setText(turno == 0 ? "O" : "X");
	        turno = (turno + 1) % 2;
	        winner = checkWinner();
	        if (winner != null) {
	            mostraRisultato();
	        }
	    }
	}
	
	private void mostraRisultato() {
	    switch (winner) {
	        case "X":
	        	JOptionPane.showMessageDialog(null, "Ha vinto la X!");
	            break;
	        case "O":
	            JOptionPane.showMessageDialog(null, "Ha vinto la O!");
	            break;
	        case "Patta":
	            JOptionPane.showMessageDialog(null, "Partita patta!");
	            break;
	    }
	    frmGame.dispose();
	    frmTris.setVisible(true);
	}


	
}
