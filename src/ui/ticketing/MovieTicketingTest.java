/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ticketing;

import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import data.MovieInfo;
import db.dao.MovieDBManager;
import db.dao.TheatersDBManager;
import db.util.OracleDBUtil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 *
 * @author alfo4-9
 */
public class MovieTicketingTest extends JFrame {
	public int adPersons;
	public int stPersons;
	public String movTitle;
	public MyCalendar calFrame = new MyCalendar();
	
	public ButtonGroup bgAdult; 
	public ButtonGroup bgStudent;
	public ButtonGroup bg;
	
	public static OracleDBUtil db;
	public MovieDBManager movieMgr;
	public TheatersDBManager thMgr;
	
	public JDesktopPane desktop;
	
	public ImageIcon Icon;
	public ImageIcon Icon2; 
	
	public LinkedHashMap<String, ArrayList<String>> timeList;
	
	public static MovieTicketingTest mov;
	
	public void setFrame() {
		setBounds(0, 0, 500, 400);

		setAlwaysOnTop(false);
		desktop = new JDesktopPane(); // a specialized layered pane
		createFrame(); // create first "window"
		setContentPane(desktop);
	}

	protected void createFrame() {
		setAlwaysOnTop(false);
		// frame.setBounds(470, 30, 260, 370);
		calFrame.setBounds(273, 35, 454, 304); // 364
		calFrame.setVisible(true);
		BasicInternalFrameUI bi = (BasicInternalFrameUI) calFrame.getUI();
		calFrame.setBorder(null);
		bi.setNorthPane(null);
		desktop.add(calFrame);
		try {
			calFrame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
	}

	/**
	 * Creates new form MovieReservation
	 */
	
	public MovieTicketingTest() {
		MyCalendar.mov = this;
		initComponents();
	}
	
	// �ʱ�ȭ 
	public void resetFrame() {
		adPersons = 0;
		stPersons = 0;
		calFrame.resetButsTrue();
		calFrame.showCal();
		bg.clearSelection();
		movieList.clearSelection();
		bgAdult.clearSelection();
		bgStudent.clearSelection();
		btnReserve.setEnabled(false);
		for (int i = 0; i < bAdults.length; i++) {
			bAdults[i].setEnabled(false);
			bStudents[i].setEnabled(false);
		}
		timePanel.setVisible(false);
		movieInfoName.setFont(new Font("����������", 0, 20)); // NOI18N
		movieInfoName.setText("��ȭ�� �������ּ���");
		movieInfoName.setForeground(new Color(255, 255, 255));
		movieInfoGrade.setText("");
		movieInfoScreenName.setText("-");
		movieInfoMoneyName.setText("-");
		movieInfoPeopleName.setText("-");
		movieInfoDayName.setText("-");
		movieInfoTimeName.setText("-");
		
		try {
			Image image = ImageIO.read(new File("C:\\fusion11\\JAVA_WS\\MovieProject\\files\\image\\no_poster.png"));
			Image changedImg = image.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
			Icon = new ImageIcon(changedImg);
			movieInfoPoster.setIcon(Icon);
			
			Image image2 = ImageIO.read(new File("./files/image/starRating/star0.png"));
			Image changedImg2 = image2.getScaledInstance(120, 25, Image.SCALE_SMOOTH);
			Icon2 = new ImageIcon(changedImg2);
			movieInfoStar.setIcon(Icon2);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	/**    
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	public void initComponents() {
		OracleDBUtil.connectDB();
		movieMgr = new MovieDBManager();
		thMgr = new TheatersDBManager();
		Main = new JPanel();
		selMovie = new JPanel();
		labelMovie = new JLabel();
		order = new JPanel();
		ganadaB = new JToggleButton();
		gradeB = new JToggleButton();
		movieListSC = new JScrollPane();
		movieList = new JList<>();
		movieInfo = new JPanel();
		resetRe = new JButton();
		movieInfoPoster = new JLabel();
		movieInfoGrade = new JLabel();
		movieInfoName = new JLabel();
		movieInfoMoney = new JLabel();
		movieInfoRating = new JLabel();
		movieInfoScreen = new JLabel();
		movieInfoDay = new JLabel();
		btnReserve = new JButton();
		movieInfoTime = new JLabel();
		movieInfoPeople = new JLabel();
		movieInfoScreenName = new JLabel();
		movieInfoDayName = new JLabel();
		movieInfoPeopleName = new JLabel();
		movieInfoTimeName = new JLabel();
		movieInfoMoneyName = new JLabel();
		timePanel = new JPanel();
		// timeBtPanel = new JPanel();
		movieInfoStar = new JLabel();
		selCal = new JPanel();
		calSel = new JLabel();
		selPeople = new JPanel();
		lblPeopleSel = new JLabel();
		selPeoplePanel = new JPanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		selMovieTime = new JPanel();
		lblSelMovieTime = new JLabel();
		adult0 = new JToggleButton();
		adult1 = new JToggleButton();
		adult2 = new JToggleButton();
		adult3 = new JToggleButton();
		adult4 = new JToggleButton();
		adult5 = new JToggleButton();
		adult6 = new JToggleButton();
		adult7 = new JToggleButton();
		student0 = new JToggleButton();
		student1 = new JToggleButton();
		student2 = new JToggleButton();
		student3 = new JToggleButton();
		student4 = new JToggleButton();
		student5 = new JToggleButton();
		student6 = new JToggleButton();
		student7 = new JToggleButton();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBackground(new Color(255, 255, 255));

		Main.setBackground(new Color(255, 255, 255));
		Main.setLayout(new AbsoluteLayout());

		selMovie.setBackground(new Color(218, 210, 180));
		selMovie.setBorder(BorderFactory.createEtchedBorder());
		selMovie.setLayout(new AbsoluteLayout());

		labelMovie.setFont(new Font("�����ٸ�����", 0, 18)); // NOI18N
		labelMovie.setForeground(new Color(0, 0, 0));
		labelMovie.setText("��ȭ ����");
		selMovie.add(labelMovie, new AbsoluteConstraints(10, 3, 70, 30));

		Main.add(selMovie, new AbsoluteConstraints(0, 0, 270, 35));

		order.setBackground(new Color(204, 204, 204));
		order.setLayout(new AbsoluteLayout());
		
		bg = new ButtonGroup();
		
		bg.add(gradeB);
		bg.add(ganadaB);
		
		ganadaB.setBackground(new Color(255, 255, 255));
		ganadaB.setFont(new Font("�����ٸ�����", 1, 13)); // NOI18N
		ganadaB.setForeground(new Color(0, 0, 0));
		ganadaB.setText("�����ټ�");
		ganadaB.setAlignmentY(0.0F);
		ganadaB.setBorder(null);
		ganadaB.setOpaque(false);
		ganadaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ganadaBActionPerformed(evt);
				resetFrame();
			}
		});
		
		order.add(ganadaB, new AbsoluteConstraints(70, 2, 60, 30));

		gradeB.setBackground(new Color(255, 255, 255));
		gradeB.setFont(new Font("�����ٸ�����", 1, 13)); // NOI18N
		gradeB.setForeground(new Color(0, 0, 0));
		gradeB.setText("������");
		gradeB.setAlignmentY(0.0F);
		gradeB.setBorder(null);
		gradeB.setOpaque(false);
		gradeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gradeBActionPerformed(evt);
				resetFrame();
			}
		});
		
		order.add(gradeB, new AbsoluteConstraints(2, 2, 60, 30));

		Main.add(order, new AbsoluteConstraints(0, 34, 269, 35));

		movieListSC.setBackground(new Color(255, 255, 255));
		movieListSC.setAlignmentX(0.0F);
		movieListSC.setAlignmentY(0.0F);

		movieList.setBackground(new Color(255, 255, 255));
		movieList.setFont(new Font("�����ٸ�����", Font.PLAIN, 16)); // NOI18N
		
		movieList.setModel(new AbstractListModel<String>() {
			String[] strings = movieMgr.movie_selectAllTitle(true);
			/*
			String[] strings = { "��λ�", "��λ� (ATMOS)", "�õ�", "�ź����Ʈ ������ �ϴõ����� �� �丣..", "�ܿ�ձ� 2", "�ܿ�ձ� 2 (�츮������)", "�ܿ�ձ� 2 (�̾��)",
					"�ܿ�ձ� 2 (3D)", "Ĺ��", "Ĺ�� (ATMOS)", "���� V ���", "���� V ��� (ATMOS)", "�길��: �ؽ�Ʈ ����", "���̺꽺 �ƿ�", "������ �ڱ� (�츮������)", "������ �ڱ�",
					"���� ����4 (�츮������)", "���� ����4", "�̾��ؿ䣬��Ű", "�̾��ؿ䣬��Ű (�ʸ��һ��̾�Ƽ)", "�̾��ؿ䣬��Ű (�ʸ��һ��̾�Ƽ)", "ī��Ʈ�ٿ�", "���񿡰�", "���񿡰� (�����ڸ�)",
					"���ʰ��� �׳�", "��Ʈ ũ��������", "���� �����", "���� ����� (������)", "���� ����� (�汸�� ��ȭ��)", "�� ��Ȳ", "�� ��Ȳ (�ʸ��һ��̾�Ƽ)", "�� ��Ȳ (ATMOS)",
					"�ĺ�ȴ��� ���� ����", "�ĺ�ȴ��� ���� ���� (�ʸ��һ��̾�Ƽ..", "�ĺ�ȴ��� ���� ���� (�ʸ��һ��̾�Ƽ..", "��ȥ �̾߱�", "���̸��ø�", "���̸��ø� (ATMOS)", "���̸��ø� (GV)",
					"����ġ���� ��Ȳ : �� ���� ���� ����", "����ġ���� ��Ȳ : �� ���� ���� ���� ..", "������� 7�ð�", "����", "���¿�", "���¿� (�����ڸ�)", "������ ����", "�Ƴ��� �׿���", "����",
					"���� (�����ڸ�)", "���� (2019 ���� ������ ��ȭ)", "82��� ������", "82��� ������ (�����ڸ�)", "���� ����", "���� ���� (�ʸ��һ��̾�Ƽ)", "������ Ÿ�������� ������ - �������..",
					"��δϸ�", "�ޱ�", "�𿡰�", "�ӹ���", "���� ã����", "���� ã���� (��ġ��)", "2019 CINE ICON: ����", "���壬������ ������", "���壬������ ������ (�ʸ��һ��̾�Ƽ)",
					"��ȭ�ο� ����", "��ȭ�ο� ���� (�����ڸ�)" };
			 */
			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		
		// ��ȭ ����Ʈ Ŭ���� ��ȭ ���� ����
		movieList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					String selection = movieList.getSelectedValue();
					movTitle = selection;
					movieInfoName.setFont(new Font("����������", 0, 18)); // NOI18N
					movieInfoName.setText(selection);
					if (selection != null) {
						try {
							MovieInfo movieInfo = movieMgr.movie_selectOneByTitle(selection);
							String strURL = movieInfo.getMoviePoster();
							URL url = new URL(strURL);
							Image image = ImageIO.read(url);
							Image changedImg = image.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
							Icon = new ImageIcon(changedImg);
							movieInfoPoster.setIcon(Icon);
							movieInfoGrade.setText(String.valueOf(movieInfo.getMovieRating()));
							movieInfoDayName.setText("-");
							float rating = movieInfo.getMovieRating();
							
							String ratingPath = "0";
							if (rating >= 0 && rating < 1.5) ratingPath = "0.5"; 
							else if (rating >= 1.5 && rating < 2.5) ratingPath = "1";
							else if (rating >= 2.5 && rating < 3.5) ratingPath = "1.5";
							else if (rating >= 3.5 && rating < 4.5) ratingPath = "2";
							else if (rating >= 4.5 && rating < 5.5) ratingPath = "2.5";
							else if (rating >= 5.5 && rating < 6.5) ratingPath = "3";
							else if (rating >= 6.5 && rating < 7.5) ratingPath = "3.5";
							else if (rating >= 7.5 && rating < 8.5) ratingPath = "4";
							else if (rating >= 8.5 && rating < 9.5) ratingPath = "4.5";
							else if (rating >= 9.5) ratingPath = "5";
							
							Image image2 = ImageIO.read(new File("./files/image/starRating/star" + ratingPath + ".png"));
							Image changedImg2 = image2.getScaledInstance(120, 25, Image.SCALE_SMOOTH);
							Icon2 = new ImageIcon(changedImg2);
							movieInfoStar.setIcon(Icon2);
							// calFrame.setVisible(true);
							calFrame.showCalAfterDB(movTitle);
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					}
				}
			}
		});
		
		movieList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		movieListSC.setViewportView(movieList);
		
		Main.add(movieListSC, new AbsoluteConstraints(0, 70, 270, 540));

		movieInfo.setBackground(new Color(45, 45, 45));
		movieInfo.setLayout(new AbsoluteLayout());

		resetRe.setFont(new Font("����������", 1, 15)); // NOI18N
		resetRe.setText("���� �ٽ��ϱ�");
		resetRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetFrame();
			}
		});
		movieInfo.add(resetRe, new AbsoluteConstraints(10, 10, 130, 30));
		
		try {
			Image image = ImageIO.read(new File("C:\\fusion11\\JAVA_WS\\MovieProject\\files\\image\\no_poster.png"));
			Image changedImg = image.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
			Icon = new ImageIcon(changedImg);
			movieInfoPoster.setIcon(Icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// moviePoster.setIcon(new ImageIcon("C:\\fusion11\\JAVA_NETBEANS\\Test\\Image\\poster.png"));
		movieInfoPoster.setOpaque(true);
		movieInfo.add(movieInfoPoster, new AbsoluteConstraints(40, 60, 200, 250));

		movieInfoGrade.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoGrade.setForeground(new Color(255, 0, 0));
		movieInfo.add(movieInfoGrade, new AbsoluteConstraints(205, 350, -1, -1));
		
		movieInfoName.setFont(new Font("����������", 0, 20)); // NOI18N
		movieInfoName.setForeground(new Color(255, 255, 255));
		movieInfoName.setText("��ȭ�� �������ּ���");
		movieInfo.add(movieInfoName, new AbsoluteConstraints(40, 320, -1, -1));

		movieInfoMoney.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoMoney.setForeground(new Color(255, 255, 255));
		movieInfoMoney.setText("�ݾ�");
		movieInfo.add(movieInfoMoney, new AbsoluteConstraints(40, 500, -1, -1));

		movieInfoRating.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoRating.setForeground(new Color(255, 0, 0));
		movieInfoRating.setText("\uD3C9\uC810");
		movieInfo.add(movieInfoRating, new AbsoluteConstraints(40, 350, -1, -1));

		movieInfoScreen.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoScreen.setForeground(new Color(255, 255, 255));
		movieInfoScreen.setText("\uADF9\uC7A5");
		movieInfo.add(movieInfoScreen, new AbsoluteConstraints(40, 380, -1, -1));

		movieInfoDay.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoDay.setForeground(new Color(255, 255, 255));
		movieInfoDay.setText("��¥");
		movieInfo.add(movieInfoDay, new AbsoluteConstraints(40, 410, -1, -1));

		btnReserve.setBackground(new Color(255, 255, 255));
		btnReserve.setFont(new Font("����������", 1, 24)); // NOI18N
		btnReserve.setText("���� �ϱ�");
		btnReserve.setOpaque(false);
		btnReserve.setEnabled(false);
		btnReserve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ����, ����, ���۽ð�, ����ð�, ���μ�, �л���, ���� �ݾ�
				System.out.println("===============����=================");
				System.out.println("����: " + movTitle);
				System.out.println("����: " + movieInfoDayName.getText());
				System.out.println("���۽ð�: " + movieInfoTimeName.getText().split("~")[0].replace(" ", ""));
				System.out.println("����ð�: " + movieInfoTimeName.getText().split("~")[1].replace(" ", ""));
				System.out.println("���μ�: " + adPersons);
				System.out.println("�л���: " + stPersons);
				System.out.println("�ݾ�: " + movieInfoMoneyName.getText());
				System.out.println(Icon.toString());
				System.out.println(Icon2.toString());
				System.out.println("===============����=================");
				
				MovieTicketingSeatTest seatFrame = new MovieTicketingSeatTest(mov);
				seatFrame.setVisible(true);
			}
		});
		movieInfo.add(btnReserve, new AbsoluteConstraints(50, 540, 190, -1));

		movieInfoTime.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoTime.setForeground(new Color(255, 255, 255));
		movieInfoTime.setText("\uC2DC\uAC04");
		movieInfo.add(movieInfoTime, new AbsoluteConstraints(40, 470, -1, -1));

		movieInfoPeople.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoPeople.setForeground(new Color(255, 255, 255));
		movieInfoPeople.setText("�ο�");
		movieInfo.add(movieInfoPeople, new AbsoluteConstraints(40, 440, -1, -1));
		
		movieInfoScreenName.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoScreenName.setForeground(new Color(255, 255, 255));
		movieInfoScreenName.setText("-");
		movieInfo.add(movieInfoScreenName, new AbsoluteConstraints(80, 380, -1, -1));

		movieInfoDayName.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoDayName.setForeground(new Color(255, 255, 255));
		movieInfoDayName.setText("-");
		movieInfo.add(movieInfoDayName, new AbsoluteConstraints(80, 410, -1, -1));

		movieInfoPeopleName.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoPeopleName.setForeground(new Color(255, 255, 255));
		movieInfoPeopleName.setText("-");
		movieInfo.add(movieInfoPeopleName, new AbsoluteConstraints(80, 440, -1, -1));

		movieInfoTimeName.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoTimeName.setForeground(new Color(255, 255, 255));
		movieInfoTimeName.setText("-");
		movieInfo.add(movieInfoTimeName, new AbsoluteConstraints(80, 470, -1, -1));
		
		movieInfoMoneyName.setFont(new Font("����������", 0, 18)); // NOI18N
		movieInfoMoneyName.setForeground(new Color(255, 255, 255));
		movieInfoMoneyName.setText("-");
		movieInfo.add(movieInfoMoneyName, new AbsoluteConstraints(80, 500, 80, -1));

		Main.add(movieInfo, new AbsoluteConstraints(730, 0, 280, 610));

		selCal.setBackground(new Color(218, 210, 180));
		selCal.setBorder(BorderFactory.createEtchedBorder());
		selCal.setLayout(new AbsoluteLayout());

		calSel.setFont(new Font("�����ٸ�����", 0, 18)); // NOI18N
		calSel.setForeground(new Color(0, 0, 0));
		calSel.setText("�޷� ����");
		selCal.add(calSel, new AbsoluteConstraints(10, 3, 70, 30));

		Main.add(selCal, new AbsoluteConstraints(270, 0, 460, 35));
		
		selPeople.setBackground(new Color(218, 210, 180));
		selPeople.setBorder(BorderFactory.createEtchedBorder());
		selPeople.setLayout(new AbsoluteLayout());

		lblPeopleSel.setFont(new Font("�����ٸ�����", 0, 18)); // NOI18N
		lblPeopleSel.setForeground(new Color(0, 0, 0));
		lblPeopleSel.setText("�ο� ����");
		selPeople.add(lblPeopleSel, new AbsoluteConstraints(10, 3, 70, 30));

		Main.add(selPeople, new AbsoluteConstraints(470, 340, 260, 35));

		selPeoplePanel.setBackground(new Color(255, 255, 204));
		selPeoplePanel.setAlignmentX(0.0F);
		selPeoplePanel.setAlignmentY(0.0F);
		selPeoplePanel.setLayout(new AbsoluteLayout());

		jLabel1.setFont(new Font("�����ٸ�����", 1, 18)); // NOI18N
		jLabel1.setForeground(new Color(0, 0, 0));
		jLabel1.setText("�л�");
		selPeoplePanel.add(jLabel1, new AbsoluteConstraints(6, 125, -1, -1));

		jLabel2.setFont(new Font("�����ٸ�����", 1, 18)); // NOI18N
		jLabel2.setForeground(new Color(0, 0, 0));
		jLabel2.setText("����");
		selPeoplePanel.add(jLabel2, new AbsoluteConstraints(6, 35, -1, -1));

		jLabel3.setBackground(new Color(0, 0, 0));
		jLabel3.setFont(new Font("�����ٸ�����", 1, 14)); // NOI18N
		jLabel3.setForeground(new Color(0, 0, 0));
		jLabel3.setText("1�� / 8000��");
		selPeoplePanel.add(jLabel3, new AbsoluteConstraints(180, 125, -1, -1));

		jLabel4.setBackground(new Color(0, 0, 0));
		jLabel4.setFont(new Font("�����ٸ�����", 1, 14)); // NOI18N
		jLabel4.setForeground(new Color(0, 0, 0));
		jLabel4.setText("1�� / 10000��");
		selPeoplePanel.add(jLabel4, new AbsoluteConstraints(173, 35, -1, -1));
		
		bAdults = new JToggleButton[] {adult0, adult1, adult2, adult3, adult4, adult5, adult6, adult7};
		bgAdult = new ButtonGroup();
		
		for (int i = 0; i < bAdults.length; i++) {
			bAdults[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JToggleButton btn = (JToggleButton)e.getSource();
					adPersons = Integer.parseInt(btn.getText());
					sumPersons();
					if (!btnReserve.isEnabled()) btnReserve.setEnabled(true);
				}
			});
			bgAdult.add(bAdults[i]);
		}
		
		bStudents = new JToggleButton[] {student0, student1, student2, student3, student4, student5, student6, student7};
		bgStudent = new ButtonGroup();
		
		for (int i = 0; i < bAdults.length; i++) {
			bStudents[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JToggleButton btn = (JToggleButton)e.getSource();
					stPersons = Integer.parseInt(btn.getText());
					sumPersons();
					if (!btnReserve.isEnabled()) btnReserve.setEnabled(true);
				}
			});
			bgStudent.add(bStudents[i]);
		}
		
		adult0.setBackground(new Color(255, 255, 255));
		adult0.setMargin(new Insets(0, 0, 0, 0));
		adult0.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult0.setText("0");
		selPeoplePanel.add(adult0, new AbsoluteConstraints(2, 60, 30, 30));

		adult1.setBackground(new Color(255, 255, 255));
		adult1.setMargin(new Insets(0, 0, 0, 0));
		adult1.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult1.setText("1");
		adult1.setOpaque(false);
		selPeoplePanel.add(adult1, new AbsoluteConstraints(34, 60, 30, 30));

		adult2.setBackground(new Color(255, 255, 255));
		adult2.setMargin(new Insets(0, 0, 0, 0));
		adult2.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult2.setText("2");
		adult2.setOpaque(false);
		selPeoplePanel.add(adult2, new AbsoluteConstraints(66, 60, 30, 30));

		adult3.setBackground(new Color(255, 255, 255));
		adult3.setMargin(new Insets(0, 0, 0, 0));
		adult3.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult3.setText("3");
		adult3.setOpaque(false);
		selPeoplePanel.add(adult3, new AbsoluteConstraints(98, 60, 30, 30));
		
		adult4.setBackground(new Color(255, 255, 255));
		adult4.setMargin(new Insets(0, 0, 0, 0));
		adult4.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult4.setText("4");
		adult4.setOpaque(false);
		selPeoplePanel.add(adult4, new AbsoluteConstraints(130, 60, 30, 30));

		adult5.setBackground(new Color(255, 255, 255));
		adult5.setMargin(new Insets(0, 0, 0, 0));
		adult5.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult5.setText("5");
		adult5.setOpaque(false);
		selPeoplePanel.add(adult5, new AbsoluteConstraints(162, 60, 30, 30));
		
		adult6.setBackground(new Color(255, 255, 255));
		adult6.setMargin(new Insets(0, 0, 0, 0));
		adult6.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult6.setText("6");
		adult6.setOpaque(false);
		selPeoplePanel.add(adult6, new AbsoluteConstraints(194, 60, 30, 30));
		
		adult7.setBackground(new Color(255, 255, 255));
		adult7.setMargin(new Insets(0, 0, 0, 0));
		adult7.setFont(new Font("Dialog", 1, 13)); // NOI18N
		adult7.setText("7");
		adult7.setOpaque(false);
		selPeoplePanel.add(adult7, new AbsoluteConstraints(226, 60, 30, 30));
		
		student0.setBackground(new Color(255, 255, 255));
		student0.setMargin(new Insets(0, 0, 0, 0));
		student0.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student0.setText("0");
		selPeoplePanel.add(student0, new AbsoluteConstraints(2, 155, 30, 30));

		student1.setBackground(new Color(255, 255, 255));
		student1.setMargin(new Insets(0, 0, 0, 0));
		student1.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student1.setText("1");
		student1.setOpaque(false);
		selPeoplePanel.add(student1, new AbsoluteConstraints(34, 155, 30, 30));

		student2.setBackground(new Color(255, 255, 255));
		student2.setMargin(new Insets(0, 0, 0, 0));
		student2.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student2.setText("2");
		student2.setOpaque(false);
		selPeoplePanel.add(student2, new AbsoluteConstraints(66, 155, 30, 30));

		student3.setBackground(new Color(255, 255, 255));
		student3.setMargin(new Insets(0, 0, 0, 0));
		student3.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student3.setText("3");
		student3.setOpaque(false);
		selPeoplePanel.add(student3, new AbsoluteConstraints(98, 155, 30, 30));
		
		student4.setBackground(new Color(255, 255, 255));
		student4.setMargin(new Insets(0, 0, 0, 0));
		student4.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student4.setText("4");
		student4.setOpaque(false);
		selPeoplePanel.add(student4, new AbsoluteConstraints(130, 155, 30, 30));

		student5.setBackground(new Color(255, 255, 255));
		student5.setMargin(new Insets(0, 0, 0, 0));
		student5.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student5.setText("5");
		student5.setOpaque(false);
		selPeoplePanel.add(student5, new AbsoluteConstraints(162, 155, 30, 30));
		
		student6.setBackground(new Color(255, 255, 255));
		student6.setMargin(new Insets(0, 0, 0, 0));
		student6.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student6.setText("6");
		student6.setOpaque(false);
		selPeoplePanel.add(student6, new AbsoluteConstraints(194, 155, 30, 30));
		
		student7.setBackground(new Color(255, 255, 255));
		student7.setMargin(new Insets(0, 0, 0, 0));
		student7.setFont(new Font("Dialog", 1, 13)); // NOI18N
		student7.setText("7");
		student7.setOpaque(false);
		selPeoplePanel.add(student7, new AbsoluteConstraints(226, 155, 30, 30));
		
		for (int i = 0; i < bAdults.length; i++) {
			bAdults[i].setEnabled(false);
			bStudents[i].setEnabled(false);
		}
		
		Main.add(selPeoplePanel, new AbsoluteConstraints(470, 374, 260, 235));

		selMovieTime.setBackground(new Color(218, 210, 180));
		selMovieTime.setBorder(BorderFactory.createEtchedBorder());
		selMovieTime.setLayout(new AbsoluteLayout());
		
		lblSelMovieTime.setFont(new Font("�����ٸ�����", 0, 18)); // NOI18N
		lblSelMovieTime.setForeground(new Color(0, 0, 0));
		lblSelMovieTime.setText("\uC2DC\uAC04 \uBC0F \uADF9\uC7A5 \uC120\uD0DD");
		selMovieTime.add(lblSelMovieTime, new AbsoluteConstraints(10, 3, 180, 30));
		
		movieInfoStar.setBackground(new Color(255, 255, 255));
		movieInfoStar.setAlignmentY(0.0F);
		try {
			Image image = ImageIO.read(new File("./files/image/starRating/star0.png"));
			Image changedImg = image.getScaledInstance(120, 25, Image.SCALE_SMOOTH);
			Icon = new ImageIcon(changedImg);
			movieInfoStar.setIcon(Icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		movieInfo.add(movieInfoStar, new AbsoluteConstraints(78, 347, 120, 25));
		
		setFrame();
		Main.add(selMovieTime, new AbsoluteConstraints(270, 340, 200, 35));
		timePanel.setBackground(new Color(255, 255, 255));
        // timePanel.setAlignmentX(0.0F);
        // timePanel.setAlignmentY(0.0F);
        Main.add(timePanel, new AbsoluteConstraints(270, 375, 200, 230));
        timePanel.setLayout(new BorderLayout());
        
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Main, GroupLayout.PREFERRED_SIZE,
				GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Main, GroupLayout.DEFAULT_SIZE,
				GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		
		pack();
		mov = this;
	}// </editor-fold>
	
	private void ganadaBActionPerformed(ActionEvent evt) {
		movieList.setModel(new AbstractListModel<String>() {
			String[] strings = movieMgr.movie_selectAllTitle(false);
			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});	
	}

	private void gradeBActionPerformed(ActionEvent evt) {
		movieList.setModel(new AbstractListModel<String>() {
			String[] strings = movieMgr.movie_selectAllTitle(true);
			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
//		try {
//			System.setProperty("awt.useSystemAAFontSettings", "on");
//			System.setProperty("swing.aatext", "true");
//			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(MovieTicketingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(MovieTicketingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(MovieTicketingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(MovieTicketingTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			System.setProperty("awt.useSystemAAFontSettings", "on");
			System.setProperty("swing.aatext", "true");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		// </editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MovieTicketingTest().setVisible(true);
			}
		});
		OracleDBUtil.closeDB();
	}
	
	// ���� �ð� ���� -> �޷�üũ
	public void setTheaters() {
		Calendar today = Calendar.getInstance();
		JPanel timeBtPanel = new JPanel();
		Date date = new Date(calFrame.date.getTime());
		timeList = thMgr.selectOneMovieStartByName(movTitle, date);
		String[] keyList = timeList.keySet().toArray(new String[timeList.size()]);
		for (int i = 0; i < keyList.length; i++) {
			JLabel lbt = new JLabel();
			lbt.setVisible(true);
			lbt.setPreferredSize(new Dimension(200, 0));
			timeBtPanel.add(lbt);
			ArrayList<String> tempList = timeList.get(keyList[i]);
			JLabel lb = new JLabel(keyList[i]);
			lb.setVisible(true);
			lb.setFont(new Font("�����ٸ�������", 0, 18));
			lb.setPreferredSize(new Dimension(30, 30));
			lb.setLayout(new FlowLayout(FlowLayout.LEFT));
			timeBtPanel.add(lb);
	        for (int j = 0; j < tempList.size(); j++) {
	        	int todayHourInt = today.get(Calendar.HOUR_OF_DAY) * 60 + today.get(Calendar.MINUTE);
	        	int movieDate = Integer.parseInt(tempList.get(j).substring(0, 2)) * 60 + Integer.parseInt(tempList.get(j).substring(3, 5));
				JButton btn = new JButton(tempList.get(j));
				btn.setVisible(true);
				if (todayHourInt >= movieDate) btn.setEnabled(false);
				// btn.setBorder(new EmptyBorder(0, 10, 0, 10));
				btn.setMargin(new Insets(0, 0, 0, 0)); // top left bottom right
				btn.setFont(new Font("�����ٸ�����", 0, 12));
				btn.setPreferredSize(new Dimension(65, 30));
				btn.addActionListener(new ActionListener() {
					public String getKeyFromValue(LinkedHashMap<String, ArrayList<String>> map, ArrayList<String> value) {
						for (String key : map.keySet()) {
							if (map.get(key).equals(value)) {
								return key;
							}
						}
						return "";
					}
					
					@Override
					public void actionPerformed(ActionEvent e) {
						movieInfoScreenName.setText(getKeyFromValue(timeList, tempList));
						timeAddMovie();
						for (int i = 0; i < bAdults.length; i++) {
							bAdults[i].setEnabled(true);
							bStudents[i].setEnabled(true);
						}
					}
					
					// �ð� �ø���
					public void timeAddMovie() {
						MovieInfo mov = movieMgr.movie_selectOneByTitle(movTitle);
						int hour = Integer.parseInt(btn.getText().substring(0, 2));
						int min = Integer.parseInt(btn.getText().substring(3, 5));
						int movHour = (mov.getMovieTimes() / 60);
						int movMin = mov.getMovieTimes() - (movHour * 60);
						String startTime = String.format("%02d:%02d", hour, min);
						
						hour += movHour; min += movMin;
						if (min >= 60) {
							min -= 60; hour++;
						}
						if (hour >= 24) {
							hour -= 24;
						}
						String addTime = String.format("%02d:%02d", hour, min);
						movieInfoTimeName.setText(startTime + " ~ " + addTime);
					}
				});
	        	timeBtPanel.add(btn);
			}
		}
		timeBtPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
        // timeBtPanel.setLayout(new GridLayout(5, 3, 5, 5));
        timeBtPanel.setVisible(true);
        timePanel.add(timeBtPanel, BorderLayout.CENTER);
	}
	
	void sumPersons() {
		int adult = adPersons;
		int student = stPersons;
		int sumPersons = adult + student;
		
		if (sumPersons == 0) {
			movieInfoPeopleName.setText("-");
			movieInfoMoneyName.setText("-");
		} else {
			movieInfoPeopleName.setText(String.format("%d�� (����:%d �л�:%d)", sumPersons, adult, student));
			movieInfoMoneyName.setText(String.valueOf((adult * 10000) + (student * 8000)));
		}
	}
	
	public Object[] getObjects() {
		Object[] objList = new Object[] {
				Icon, movieInfoName.getText(), movieInfoGrade.getText(), Icon2, movieInfoScreenName.getText(), 
				movieInfoDayName.getText(), movieInfoPeopleName.getText(), movieInfoTimeName.getText(), movieInfoMoneyName.getText()
		};
		return objList;
	}
	
	// Variables declaration - do not modify
	private JPanel Main;
	private JLabel calSel;
	private JToggleButton ganadaB;
	private JToggleButton gradeB;
	private JButton btnReserve;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel labelMovie;
	private JLabel lblSelMovieTime;
	private JPanel movieInfo;
	public JLabel movieInfoDayName;
	public JLabel movieInfoMoneyName;
	public JLabel movieInfoScreenName;
	public JLabel movieInfoTimeName;
	public JLabel movieInfoPeopleName;
	public JList<String> movieList;
	private JScrollPane movieListSC;
	public JLabel movieInfoGrade;
	public JLabel movieInfoName;
	public JLabel movieInfoMoney;
	public JLabel movieInfoRating;
	public JLabel movieInfoScreen;
	public JLabel movieInfoDay;
	public JLabel movieInfoTime;
	public JLabel movieInfoPeople;
	public JLabel movieInfoPoster;
	public JLabel movieInfoStar;
	public JPanel order;
	public JLabel lblPeopleSel;
	public JButton resetRe;
	public JPanel selCal;
	public JPanel selMovie;
	public JPanel selMovieTime;
	public JPanel selPeoplePanel;
	public JPanel selPeople;
	public JPanel timePanel;
	public JToggleButton[] bAdults;
	public JToggleButton[] bStudents;
	private JToggleButton adult0;
	private JToggleButton adult1;
	private JToggleButton adult2;
	private JToggleButton adult3;
	private JToggleButton adult4;
	private JToggleButton adult5;
	private JToggleButton adult6;
	private JToggleButton adult7;
	private JToggleButton student0;
	private JToggleButton student1;
	private JToggleButton student2;
	private JToggleButton student3;
	private JToggleButton student4;
	private JToggleButton student5;
	private JToggleButton student6;
	private JToggleButton student7;
}