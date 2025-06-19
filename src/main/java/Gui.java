import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Gui extends JFrame {

	ImageIcon iconMusic;
	JLabel background;


	private DefaultTableModel tableModel = new DefaultTableModel();
	private JTable table = new JTable(tableModel);

	private JScrollPane tableScroller = new JScrollPane( table );


	private JButton btnPlaySong = new JButton();
	private JButton btnStop = new JButton();
	private JButton btnMakePlaylist = new JButton("new Playlist");
	private JButton btnSearch = new JButton();
	private JButton btnAddSong = new JButton();
	private JButton btnRemoveSong = new JButton();
	private JButton btnChoosePlaylist = new JButton("Choose Playlist");

	private JLabel labelCurrentName = new JLabel("");


	private JTextField textFieldPlaylistName = new JTextField();
	private JTextField textFieldSearch = new JTextField();



	static JLabel labelTotal = new JLabel("");

	public JTextField getTextFieldSearch() {
		return this.textFieldSearch;
	}

	public ImageIcon getIconMusic() {
		return this.iconMusic;
	}

	public DefaultTableModel getTableModel() {
		return this.tableModel;
	}


	public JTable getTable() {
		return this.table;
	}


	public JScrollPane getTableScroller() {
		return this.tableScroller;
	}


	public JLabel getLabelCurrentName() {
		return this.labelCurrentName;
	}

	public JTextField getTextFieldPlaylistName() {
		return this.textFieldPlaylistName;
	}


	public JButton getbtnMakePlaylist() {
		return this.btnMakePlaylist;
	}


	public JButton getBtnSearch() {
		return this.btnSearch;
	}

	public JButton getBtnAddSong() {
		return this.btnAddSong;
	}


	public JButton getBtnRemoveSong() {
		return this.btnRemoveSong;
	}

	public JButton getBtnPlaySong() {
		return this.btnPlaySong;
	}

	public JButton getBtnStop() {
		return this.btnStop;
	}


	public JButton getbtnChoosePlaylist() {
		return this.btnChoosePlaylist;
	}


	public Gui() {
		super("Musikverwaltung");

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close an the end
		setSize(950, 400);// Determine the dimensions of the window
		setLocation(600, 700);
		setLocationRelativeTo(null); //to show the windo in the middle of the screen
		setResizable(false);

		// einfuegen Background Bild
		iconMusic = new ImageIcon (Const.RES_FOLDER + "freeImage.jpg");
		background= new JLabel(iconMusic);
		background.setBounds(0, 0, 1000, 700);

		ImageIcon playIcon = new ImageIcon(Const.RES_FOLDER + "Play15.png");
		btnPlaySong.setIcon(playIcon);

		ImageIcon stopIcon = new ImageIcon(Const.RES_FOLDER + "Stop15.png");
		btnStop.setIcon(stopIcon);

		ImageIcon searchIcon = new ImageIcon(Const.RES_FOLDER + "search15.png");
		btnSearch.setIcon(searchIcon);

		ImageIcon addIcon = new ImageIcon(Const.RES_FOLDER + "Plus.png");
		btnAddSong.setIcon(addIcon);

		ImageIcon removeIcon = new ImageIcon(Const.RES_FOLDER + "remove.png");
		btnRemoveSong.setIcon(removeIcon);

		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(10,130,130));
		getColorModel();
		tableModel.addColumn("Artist");
		tableModel.addColumn("Titel");
		tableModel.addColumn("Genre");
		tableModel.addColumn("Album");


		// Einfuegen die Deminsional


		btnPlaySong.setBounds(250, 320, 100, 30);
		btnStop.setBounds(370, 320, 100, 30);
		tableScroller.setBounds(250, 110, 500, 200);
		labelCurrentName.setBounds(450, 65, 200, 50);
		labelCurrentName.setForeground(Color.white);
		btnChoosePlaylist.setBounds(250, 75, 180, 30);
		btnAddSong.setBounds(490, 320, 110, 30);
		btnRemoveSong.setBounds(620, 320, 115, 30);
		btnMakePlaylist.setBounds(20, 20, 115, 30);
		textFieldPlaylistName.setBounds(130, 20, 100, 30);
		textFieldSearch.setBounds(815, 20, 100, 30);
		btnSearch.setBounds(700, 20, 115, 30);
		labelTotal.setBounds(150, 250, 100, 30);


		// Einfuegen zu JFrame
		add(btnPlaySong);
		add(btnStop);
		add(tableScroller);
		add(background);
		add(textFieldPlaylistName);
		add(labelCurrentName);
		add(btnChoosePlaylist);
		add(btnAddSong);
		add(btnRemoveSong);
		add(btnMakePlaylist);
		add(textFieldSearch);
		add(btnSearch);
		add(labelTotal);
		add(background);

		setVisible(true); // to display the window on the computer screen
	}
}