package gui.membership;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import database.MemberList;
import database.information.Membership;

/**
 * @author Yanzhao Chen
 */
public class UserRegister implements ActionListener{
	JButton Register;
	String LastName;
    String FirstName;
    String PhoneNumber;
    String Email;
    JTextField lastname;
    JTextField firstname;
    JTextField phonenumber;
    JTextField email;
	public UserRegister(){
		JFrame f = new JFrame("Swing����");                           //ʵ�����������
        lastname = new JTextField(30);  
        firstname = new JTextField(30);    
        phonenumber = new JTextField(30);    
        email = new JTextField(30);    //�����ı��򣬲�ָ������
        JLabel lastnameLab = new JLabel("please input lastname��"); //  �����ǩ
        JLabel firstnameLab = new JLabel("please input firstname��"); //  �����ǩ
        JLabel PhoneNumberLab = new JLabel("please input phonenumber��"); //  �����ǩ
        JLabel EmailLab = new JLabel("please input email��"); //  �����ǩ
        Register = new JButton("Register");
        lastnameLab.setBounds(10,10,100,20); 
        firstnameLab.setBounds(10,10,100,20);   
        PhoneNumberLab.setBounds(10,10,100,20);   
        EmailLab.setBounds(10,10,100,20);   
        lastname.setBounds(110,10,100,20); 
        firstname.setBounds(110,10,100,20);   
        phonenumber.setBounds(110,10,100,20);   
        email.setBounds(110,10,100,20); //�������λ�úʹ�С
        lastname.setColumns(10);      
        firstname.setColumns(10);   
        phonenumber.setColumns(10);   
        email.setColumns(10);   //���ó��ȣ����Ǵ�ʱ��������
      f.setLayout(new GridLayout(4,2,0,10));       //���������Ĳ��ֹ�����
//        f.setLayout(null);      //���������Ĳ��ֹ�����
        f.add(lastnameLab);  
        f.add(lastname); 
        f.add(firstnameLab);
        f.add(firstname);
        f.add(PhoneNumberLab);
        f.add(phonenumber);
        f.add(EmailLab);//���������������
        f.add(email); 
        f.add(Register);//���������������
        f.setSize(440, 320);            //���ô���
        f.setLocation(300,200);     //������ʾλ��
        f.setVisible(true);
        Register.addActionListener(this);
	}
	
	@Override
    public void actionPerformed(ActionEvent e){
		JButton resource=(JButton)e.getSource();
		if(resource.getText().equals("Register")){
			LastName=lastname.getText();
	        FirstName=firstname.getText();
	        PhoneNumber=phonenumber.getText();
	        Email=email.getText();
	        if(LastName.equals(""))
	        	LastName=null;
	        if(FirstName.equals(""))
	        	FirstName=null;
	        if(PhoneNumber.equals(""))
	        	PhoneNumber=null;
	        if(Email.equals(""))
	        	Email=null;
	        System.out.println(FirstName);
	        System.out.println(LastName);
	        System.out.println(PhoneNumber);
	        System.out.println(Email);
	        Membership m = new Membership("M0001","Tian", "Huang", "15500043370", null,0);
	        MemberList memberlist = new MemberList();
	        memberlist.getMsl().add(m);
	        if(memberlist.createMember(FirstName, LastName, PhoneNumber, Email).equals("Error type 01: Null message input, name is empty or both telephone and e-mail are null")){
	        	JOptionPane.showMessageDialog(null, "Null message input, name is empty or both telephone and e-mail are null", "title",JOptionPane.WARNING_MESSAGE); 
	        }else if(memberlist.createMember(FirstName, LastName, PhoneNumber, Email).equals("Error type 02: Invalid format of telephone or e-mail address")){
	        	JOptionPane.showMessageDialog(null, "Invalid format of telephone or e-mail address", "title",JOptionPane.WARNING_MESSAGE); 
	        }else if(memberlist.createMember(FirstName, LastName, PhoneNumber, Email).equals("Error type 03: Telephone or E-mail address has been already used")){
	        	JOptionPane.showMessageDialog(null, "Telephone or E-mail address has been already used", "title",JOptionPane.WARNING_MESSAGE); 
	        }else{
	        	memberlist.save();
	        }
		}
	}
	
	    public static void main(String[] args) {
	        UserRegister Info = new UserRegister();
	    }
	 
}
