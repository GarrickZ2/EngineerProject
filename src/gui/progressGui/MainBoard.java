/*
 * Created by JFormDesigner on Sat Apr 04 20:03:50 GMT+08:00 2020
 */

package gui.progressGui;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import com.alee.laf.WebLookAndFeel;
import com.jgoodies.forms.factories.*;
import gui.management.ChangeMenu;

/**
 * @author Brainrain
 */
public class MainBoard extends JFrame {
    public MainBoard() {
        initComponents();
    }

    private void guidance_changeMenuPanelMouseClicked(MouseEvent e) {
        guidance_analysisPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changeMenuPanel.setBackground(Color.white);
        guidance_changePasswordPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_membershipPanel.setBackground(new Color(247, 246, 243, 249));
    }

    private void guidance_analysisPanelMouseClicked(MouseEvent e) {
        guidance_analysisPanel.setBackground(Color.white);
        guidance_changeMenuPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changePasswordPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_membershipPanel.setBackground(new Color(247, 246, 243, 249));
    }

    private void guidance_changePasswordPanelMouseClicked(MouseEvent e) {
        guidance_analysisPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changeMenuPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changePasswordPanel.setBackground(Color.white);
        guidance_membershipPanel.setBackground(new Color(247, 246, 243, 249));
    }

    private void guidance_membershipPanelMouseClicked(MouseEvent e) {
        guidance_analysisPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changeMenuPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_changePasswordPanel.setBackground(new Color(247, 246, 243, 249));
        guidance_membershipPanel.setBackground(Color.white);
    }

    private void guidance_ReturnPanelMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        containerPanel = new JPanel();
        panel20 = new JPanel();
        label16 = new JLabel();
        label17 = new JLabel();
        title_latterBar = new JPanel();
        guidancePanel = new JPanel();
        guidance_changeMenuPanel = new JPanel();
        changeMenuLabel = new JLabel();
        guidance_changePasswordPanel = new JPanel();
        changePasswordLabel = new JLabel();
        guidance_membershipPanel = new JPanel();
        membershipLabel = new JLabel();
        guidance_analysisPanel = new JPanel();
        analysisLabel = new JLabel();
        guidance_ReturnPanel = new JPanel();
        returnPanel = new JLabel();
        suggest_mainPanel = new JPanel();
        suggest_mainCardPanel = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.white);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {770, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {525, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== containerPanel ========
        {
            containerPanel.setBackground(Color.white);
            containerPanel.setLayout(new GridBagLayout());
            ((GridBagLayout)containerPanel.getLayout()).columnWidths = new int[] {200, 570, 0};
            ((GridBagLayout)containerPanel.getLayout()).rowHeights = new int[] {75, 450, 0};
            ((GridBagLayout)containerPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)containerPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //======== panel20 ========
            {
                panel20.setBackground(new Color(228, 182, 113));
                panel20.setLayout(new GridBagLayout());
                ((GridBagLayout)panel20.getLayout()).columnWidths = new int[] {75, 125, 0};
                ((GridBagLayout)panel20.getLayout()).rowHeights = new int[] {75, 0};
                ((GridBagLayout)panel20.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel20.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- label16 ----
                label16.setIcon(new ImageIcon(getClass().getResource("/img/40pxLogoIcon.png")));
                label16.setHorizontalAlignment(SwingConstants.TRAILING);
                label16.setBackground(new Color(228, 182, 113));
                panel20.add(label16, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label17 ----
                label17.setText("Totoro Ramen");
                label17.setFont(new Font("Calibri", Font.PLAIN, 21));
                label17.setForeground(Color.white);
                panel20.add(label17, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            containerPanel.add(panel20, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== title_latterBar ========
            {
                title_latterBar.setBackground(new Color(228, 182, 113));
                title_latterBar.setLayout(new GridLayout(1, 1));
            }
            containerPanel.add(title_latterBar, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== guidancePanel ========
            {
                guidancePanel.setBackground(new Color(247, 246, 243, 249));
                guidancePanel.setLayout(new GridLayout(5, 0));

                //======== guidance_changeMenuPanel ========
                {
                    guidance_changeMenuPanel.setBackground(Color.white);
                    guidance_changeMenuPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            guidance_changeMenuPanelMouseClicked(e);
                        }
                    });
                    guidance_changeMenuPanel.setLayout(new GridLayout());

                    //---- changeMenuLabel ----
                    changeMenuLabel.setText("Change Menu");
                    changeMenuLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
                    changeMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    changeMenuLabel.setBackground(Color.white);
                    guidance_changeMenuPanel.add(changeMenuLabel);
                }
                guidancePanel.add(guidance_changeMenuPanel);

                //======== guidance_changePasswordPanel ========
                {
                    guidance_changePasswordPanel.setBackground(new Color(247, 246, 243, 249));
                    guidance_changePasswordPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            guidance_changePasswordPanelMouseClicked(e);
                        }
                    });
                    guidance_changePasswordPanel.setLayout(new GridLayout());

                    //---- changePasswordLabel ----
                    changePasswordLabel.setText("Change Password");
                    changePasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    changePasswordLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
                    guidance_changePasswordPanel.add(changePasswordLabel);
                }
                guidancePanel.add(guidance_changePasswordPanel);

                //======== guidance_membershipPanel ========
                {
                    guidance_membershipPanel.setBackground(new Color(247, 246, 243, 249));
                    guidance_membershipPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            guidance_membershipPanelMouseClicked(e);
                        }
                    });
                    guidance_membershipPanel.setLayout(new GridLayout());

                    //---- membershipLabel ----
                    membershipLabel.setText("Membership");
                    membershipLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    membershipLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
                    guidance_membershipPanel.add(membershipLabel);
                }
                guidancePanel.add(guidance_membershipPanel);

                //======== guidance_analysisPanel ========
                {
                    guidance_analysisPanel.setBackground(new Color(247, 246, 243, 249));
                    guidance_analysisPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            guidance_analysisPanelMouseClicked(e);
                        }
                    });
                    guidance_analysisPanel.setLayout(new GridLayout());

                    //---- analysisLabel ----
                    analysisLabel.setText("Analysis");
                    analysisLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    analysisLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
                    guidance_analysisPanel.add(analysisLabel);
                }
                guidancePanel.add(guidance_analysisPanel);

                //======== guidance_ReturnPanel ========
                {
                    guidance_ReturnPanel.setBackground(new Color(86, 83, 74, 249));
                    guidance_ReturnPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            guidance_ReturnPanelMouseClicked(e);
                        }
                    });
                    guidance_ReturnPanel.setLayout(new GridLayout());

                    //---- returnPanel ----
                    returnPanel.setText("Return");
                    returnPanel.setHorizontalAlignment(SwingConstants.CENTER);
                    returnPanel.setFont(new Font("Calibri", Font.PLAIN, 20));
                    returnPanel.setForeground(Color.white);
                    guidance_ReturnPanel.add(returnPanel);
                }
                guidancePanel.add(guidance_ReturnPanel);
            }
            containerPanel.add(guidancePanel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== suggest_mainPanel ========
            {
                suggest_mainPanel.setBackground(Color.white);
                suggest_mainPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)suggest_mainPanel.getLayout()).columnWidths = new int[] {30, 510, 30, 0};
                ((GridBagLayout)suggest_mainPanel.getLayout()).rowHeights = new int[] {30, 390, 30, 0};
                ((GridBagLayout)suggest_mainPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)suggest_mainPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== suggest_mainCardPanel ========
                {
                    suggest_mainCardPanel.setBackground(Color.white);
                    suggest_mainCardPanel.setLayout(new CardLayout());
                }
                suggest_mainPanel.add(suggest_mainCardPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            containerPanel.add(suggest_mainPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(containerPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        suggest_mainCardPanel.add(changeMenu,"change");


    }

    public ChangeMenu changeMenu = new ChangeMenu();


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel containerPanel;
    private JPanel panel20;
    private JLabel label16;
    private JLabel label17;
    private JPanel title_latterBar;
    private JPanel guidancePanel;
    public JPanel guidance_changeMenuPanel;
    private JLabel changeMenuLabel;
    public JPanel guidance_changePasswordPanel;
    private JLabel changePasswordLabel;
    public JPanel guidance_membershipPanel;
    private JLabel membershipLabel;
    public JPanel guidance_analysisPanel;
    private JLabel analysisLabel;
    public JPanel guidance_ReturnPanel;
    private JLabel returnPanel;
    private JPanel suggest_mainPanel;
    public JPanel suggest_mainCardPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
        WebLookAndFeel.initializeManagers ();

        MainBoard mainBoard = new MainBoard();

        mainBoard.setVisible(true);
    }
}
