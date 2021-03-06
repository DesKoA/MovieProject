package Join;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class join2 extends JFrame {

   private JPanel contentPane;
   private JTextField idEnter;
   private JPasswordField pwfirst;
   private JPasswordField pwpwField;
   private JTextField phoneMid;
   private JTextField emailField;
   private JTextField phoneEnd;
   private BufferedImage background;
   private JPanel panel_2;
   private JLabel lblStatus;
   private JTextField phone1st;
   private JTextField emailAddress;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               join frame = new join();
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
   
   public join2() {
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 1002, 537);
      contentPane = new JPanel();
      //불투명
      //contentPane.setOpaque(false);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(new Color(88,105,219));//(124, 166, 150));
      panel.setBounds(0, 86, 210, 392);
      contentPane.add(panel);
      panel.setLayout(null);
      
      JButton button = new JButton("\uCC98\uC74C\uD654\uBA74\uC73C\uB85C");
      button.setFont(new Font("굴림", Font.BOLD, 15));
      button.setBackground(new Color(127, 109, 242));
      button.setBounds(19, 50, 133, 35);
      panel.add(button);
      
      JButton button_1 = new JButton("\uBE44\uD68C\uC6D0\uC608\uB9E4");
      button_1.setFont(new Font("굴림", Font.BOLD, 15));
      button_1.setBackground(new Color(127, 109, 242));
      button_1.setBounds(19, 119, 133, 35);
      panel.add(button_1);
      
      JPanel liftTitle = new JPanel();
      liftTitle.setBackground(new Color(100, 159, 249)); //(98, 140, 150));
      liftTitle.setBounds(0, 0, 210, 86);
      contentPane.add(liftTitle);
      liftTitle.setLayout(null);
      
      JPanel panel_1 = new JPanel();
      ImageIcon icn = new ImageIcon(
//            final String ic = 
                  ".\\image\\회원가입제목1.png");
                  
      panel_2 = new JPanel() {
      public void paintComponent(Graphics g) {
       // Approach 1: Dispaly image at at full size
       g.drawImage(icn.getImage(), 0, 0, null);
       // Approach 2: Scale image to size of component
       // Dimension d = getSize();
       // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
       // Approach 3: Fix the image position in the scroll pane
       // Point p = scrollPane.getViewport().getViewPosition();
       // g.drawImage(icon.getImage(), p.x, p.y, null);
       setOpaque(false);
       super.paintComponent(g);
      }
     };
      
      panel_2.setBounds(294, 10, 669, 86);
      contentPane.add(panel_2);
      panel_2.setLayout(null);
      
      
      JLabel title = new JLabel("\t  \uB098        \uBA3C   \uC800        \uC608   \uB9E4");
      title.setBounds(0, 10, 500, 53);
      panel_2.add(title);
      title.setForeground(new Color(85, 71, 89));
      title.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
      
      JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
      label.setFont(new Font("맑은 고딕", Font.BOLD, 21));
      label.setBounds(53, 22, 108, 37);
      liftTitle.add(label);
      
      
     //   File file = new File("C:\\Users\\alfo4-11\\Desktop\\1차 프로젝트\\티켓보라색.png");
      ImageIcon ic = new ImageIcon(
//      final String ic = 
            ".\\image\\티켓보라색.png");
            
            JPanel centens = new JPanel() {
            public void paintComponent(Graphics g) {
             // Approach 1: Dispaly image at at full size
             g.drawImage(ic.getImage(), 0, 0, null);
             // Approach 2: Scale image to size of component
             // Dimension d = getSize();
             // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
             // Approach 3: Fix the image position in the scroll pane
             // Point p = scrollPane.getViewport().getViewPosition();
             // g.drawImage(icon.getImage(), p.x, p.y, null);
             setOpaque(false);
             super.paintComponent(g);
            }
           };
      
      //JPanel centens = new JPanel();
//        try {
//            background = ImageIO.read(file);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//      contentPane = new ImagePanel(ic.getImage(), 
//            "bg_cafe.jpg");
       centens.setBounds(209, 86, 775, 392);
      contentPane.add(centens);
      centens.setLayout(null);
      
      JButton canel = new JButton("\uCDE8\uC18C\uD558\uAE30");
      canel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      
/*
 *       JButton btnLogout = new JButton("Logout");
      btnLogout.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            int result = JOptionPane.showConfirmDialog(pnMovieInfo, "Logout 하시겠습니까?", "이용해 주셔서 감사합니다.",
                  JOptionPane.OK_CANCEL_OPTION, 1);

            if (result == JOptionPane.OK_OPTION) {
               System.exit(0);
            } else if (result == JOptionPane.CANCEL_OPTION) {
               // JOptionPane.showMessageDialog(pnMovieInfo, "취소하였습니다");
            }
         }
      });
 */
      canel.setBackground(new Color(123, 104, 238));
      
      canel.setBounds(243, 331, 90, 23);
      centens.add(canel);
      //?? frame.getContentPane().add(canel); 
      
      JButton pwCheck = new JButton("\uC911\uBCF5\uD655\uC778");
      pwCheck.setForeground(new Color(240, 248, 255));
      pwCheck.setBackground(new Color(47, 79, 79));
      pwCheck.setBounds(228, 102, 90, 23);
      centens.add(pwCheck);
      pwCheck.setBorderPainted(false);
      
      JLabel emailWhelk = new JLabel("  @");
      emailWhelk.setBounds(497, 75, 24, 21);
      centens.add(emailWhelk);
      
      JButton OKButton = new JButton("\uB4F1\uB85D\uD558\uAE30");
      OKButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      OKButton.setBounds(434, 331, 97, 23);
      centens.add(OKButton);
      OKButton.setOpaque(true); //투명화
      OKButton.setForeground(UIManager.getColor("CheckBox.shadow"));
      OKButton.setBackground(new Color(123, 104, 238));
      
      JLabel yymmdd = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
      yymmdd.setBounds(141, 261, 140, 25);
      centens.add(yymmdd);
      yymmdd.setFont(new Font("한컴돋움", Font.PLAIN, 20));
      
      phoneMid = new JTextField();
      phoneMid.setBounds(479, 296, 54, 21);
      centens.add(phoneMid);
      phoneMid.setColumns(4);
      
      phoneEnd = new JTextField();
      phoneEnd.setBounds(563, 296, 54, 21);
      centens.add(phoneEnd);
      phoneEnd.setColumns(4);
      
      JLabel _2 = new JLabel("   -");
      _2.setBounds(531, 300, 24, 15);
      centens.add(_2);
      
      JLabel _1 = new JLabel("   -");
      _1.setBounds(453, 298, 24, 18);
      centens.add(_1);
      
      JLabel pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
      pw.setBounds(141, 159, 140, 25);
      centens.add(pw);
      pw.setFont(new Font("한컴돋움", Font.PLAIN, 20));
      
      pwfirst = new JPasswordField();
      pwfirst.addFocusListener(new FocusAdapter() {
         @Override
         public void focusGained(FocusEvent e) {
            pwfirst.setBackground(Color.yellow);
         }
         @Override
         public void focusLost(FocusEvent e) {
            pwfirst.setBackground(Color.white);
         }
      });
      pwfirst.setColumns(8);
      pwfirst.setBounds(151, 194, 116, 21);
      centens.add(pwfirst);
      pwfirst.setColumns(10);

   //   pwFirst.setForeground(Color.LIGHT_GRAY);
   //   pwFirst.setFont(new Font("굴림", Font.BOLD, 16));

      
      pwpwField = new JPasswordField();
      pwpwField.setBounds(401, 194, 116, 21);
      centens.add(pwpwField);
      pwpwField.addFocusListener(new FocusAdapter() {
         @Override
         public void focusGained(FocusEvent e) {
            pwpwField.setBackground(Color.yellow);
            String pw1 = new String(pwfirst.getPassword());
            System.out.println("pw1: " + pw1);
            if (pw1.isEmpty()) {
               lblStatus.setForeground(Color.RED);
            //   lblStatus.setText("첫번째 암호 입력하세요!");
               pwfirst.requestFocusInWindow();
            }
         }
         @Override
         public void focusLost(FocusEvent e) {
            pwpwField.setBackground(Color.white);            
            String pw1 = new String(pwfirst.getPassword());
            String pw2 = new String(pwpwField.getPassword());
            System.out.println("pw2: " + pw2);
            if (pw2.isEmpty()) {
               lblStatus.setForeground(Color.RED);
         //      lblStatus.setText("두번째 암호 입력하세요!");
            } else {
               // 4자 길이?
               if( pw1.equals(pw2) ) {
                  lblStatus.setForeground(Color.BLUE);
                  lblStatus.setText("암호 일치");
               } else {
                  lblStatus.setForeground(Color.RED);
                  lblStatus.setText("암호 불일치!");
               }
            }
         }
      });
         
//      pwpwField = new JTextField();
//      pwpwField.setBounds(364, 195, 116, 21);
//      centens.add(pwpwField);
//      pwpwField.setColumns(10);
      
      JLabel pwpw = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
      pwpw.setBounds(391, 159, 140, 25);
      centens.add(pwpw);
      pwpw.setFont(new Font("한컴돋움", Font.PLAIN, 20));
      
      JLabel phone = new JLabel("\uC804\uD654\uBC88\uD638");
      phone.setBounds(387, 261, 140, 25);
      centens.add(phone);
      phone.setFont(new Font("한컴돋움", Font.PLAIN, 20));

      
      idEnter = new JTextField();
      idEnter.setBounds(151, 75, 116, 21);
      centens.add(idEnter);
      idEnter.setText("\uC544\uC774\uB514 \uC785\uB825");
      idEnter.setColumns(10);
      
      emailField = new JTextField();
      emailField.setBounds(401, 75, 97, 21);
      centens.add(emailField);
      emailField.setColumns(10);
      
      JLabel email = new JLabel("\uC774\uBA54\uC77C");
      email.setBounds(391, 38, 140, 25);
      centens.add(email);
      email.setFont(new Font("한컴돋움", Font.PLAIN, 20));
      
      JLabel id = new JLabel("\uC544\uC774\uB514");
      id.setBounds(141, 38, 140, 25);
      centens.add(id);
      id.setFont(new Font("한컴돋움", Font.PLAIN, 20));
      
      JComboBox emailCombo = new JComboBox();
      emailCombo.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "gmail.com"}));
      
      emailCombo.setBounds(491, 103, 109, 21);
      centens.add(emailCombo);
      
      JSpinner mm = new JSpinner();
      mm.setModel(new SpinnerNumberModel(6, 1, 12, 1));
      mm.setBounds(209, 299, 40, 22);
      centens.add(mm);
      
      JSpinner yy = new JSpinner();
      yy.setModel(new SpinnerListModel(new String[] {"1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980"}));
      yy.setBounds(151, 299, 59, 22);
      centens.add(yy);
      
      JSpinner dd = new JSpinner();
      dd.setModel(new SpinnerNumberModel(new Integer(15), null, null, new Integer(1)));
      dd.setBounds(248, 299, 41, 22);
      centens.add(dd);
      
      lblStatus = new JLabel("");
      lblStatus.setBounds(116, 237, 148, 15);
      centens.add(lblStatus);
      
      phone1st = new JTextField();
      phone1st.setColumns(4);
      phone1st.setBounds(402, 296, 54, 21);
      centens.add(phone1st);
      
      emailAddress = new JTextField(emailCombo.getSelectedItem().toString());
      //emailAddress = new JTextField(emailCombo.getSelectedIndex());
      //emailAddress = emailCombo.getSelectedIndex();
/*
.
      //emailAddress = emailCombo.getSelectedItem().toString();.
      emailAddress.addFocusListener(new FocusAdapter() {
         public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(emailCombo)) { 
            emailCombo = (JComboBox) e.getSource();
            emailAddress = (JTextField) emailCombo.getSelectedItem();
            d
            }
            }
      });
 */
      emailAddress.setColumns(10);
      emailAddress.setBounds(520, 75, 97, 21);
      centens.add(emailAddress);
      

   }
}