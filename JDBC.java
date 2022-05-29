// package dbms;

package dbms;

import java.awt.*; 
import java.awt.event.*; 
import java.sql.*; 
import javax.swing.*; 
import javax.swing.border.Border;

public class JDBC extends JFrame{ 
JTextField name; 
JTextField email; 
JTextField destinationaddress; 
JTextField pickupaddress; 
JTextField phoneNumber; 
JTextField adharNumber; 
JTextField tf1; 
JTextField tf2; 
JTextField tf4; 
JTextField tf5; 
JTextField tf6; 
JTextField tf3; 
JLabel lname; 
JLabel lemail; 
JLabel ldestinationaddress; 
JLabel lpickupaddress; 
JLabel lphoneNumber; 
JLabel ladharNumber; 
JLabel lgender; 
JLabel lpassengers; 
JLabel lseattype; 
JLabel lpickuptime; 
JLabel lpickupdate; 
JLabel l1,l3; 
JLabel l2,l4;
JComboBox<String> cb; 
JComboBox<String> cb1; 
JComboBox<String> cb2; 
JComboBox<String> cb3; 
JComboBox<String> cb4; 
JComboBox<String> cb5; 
JComboBox<String> cb6; 
JComboBox<String> cb7; 
JRadioButton male; 
JRadioButton female; 
ButtonGroup gender; 
JPanel pname; 
JPanel pemail; 
JPanel pdestinationaddress; 
JPanel ppickupaddress; 
JPanel pphoneNumber; 
JPanel padharNumber; 
JPanel pgender; 
JPanel ppassengers; 
JPanel pseattype; 
JPanel ppickuptime; 
JPanel ppickupdate; 
JPanel mainpanel; 
JPanel mainpanel1; 
JPanel mainpanel2; 
JPanel mainpanel3; 
String Month[] = { " ", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }; 
String date[] = { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", 
"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }; 
// String hour[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09",  "10", "11", "12" }; 
String time[] = { " ", "AM", "PM" }; 
String seat[] = {" ","A/C","NON-A/C","SLEEPER A/C","NON-A/C SLEEPER"}; String seat1[] = { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", 
"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
Font f1 = new Font(Font.SERIF, Font.BOLD, 18); 
Font f2 = new Font(Font.SERIF, Font.BOLD, 30); 
Color b = new Color(225,225,204); 
Border border = BorderFactory.createLineBorder(Color.GRAY, 2); 
JDBC(){ 
// JFrame f = new JFrame(); 
setTitle("Bus Ticket Booking!"); 
this.setSize(700,700); 
l1 = new JLabel("Online Booking Form"); 
l1.setFont(f2); 
l2 = new JLabel("To reserve seats please complete and submit the  booking form."); 
l2.setFont(f1); 
JPanel j = new JPanel(); 
j.add(l1); 
j.setBackground(b); 
JPanel j1 = new JPanel(); 
j1.add(l2); 
j1.setBackground(b); 
lname = new JLabel("Name:"); 
lname.setFont(f1); 
lemail = new JLabel("E-Mai l*:"); 
lemail.setFont(f1); 
ldestinationaddress = new JLabel("Destination Address:"); ldestinationaddress.setFont(f1); 
lpickupaddress = new JLabel("Pickup Address:"); 
lpickupaddress.setFont(f1); 
lphoneNumber = new JLabel("Phone Number:"); 
lphoneNumber.setFont(f1); 
ladharNumber = new JLabel("Adhar Number:"); 
ladharNumber.setFont(f1); 
lgender = new JLabel("Gender:"); 
lgender.setFont(f1); 
lpassengers = new JLabel("No.of.Passengers:"); 
lpassengers.setFont(f1); 
lseattype = new JLabel("Seat Type:"); 
lseattype.setFont(f1); 
lpickupdate = new JLabel("Pickup Date:"); 
lpickupdate.setFont(f1); 
lpickuptime = new JLabel("Pickup Time:");
lpickuptime.setFont(f1); 
name = new JTextField(""); 
name.setBorder(border); 
email = new JTextField(""); 
email.setBorder(border); 
destinationaddress = new JTextField(""); destinationaddress.setBorder(border); pickupaddress = new JTextField(""); pickupaddress.setBorder(border); phoneNumber = new JTextField(""); phoneNumber.setBorder(border); 
adharNumber = new JTextField(""); adharNumber.setBorder(border); 
cb = new JComboBox<>(Month); 
// cb.setBorder(border); 
cb1 = new JComboBox<>(Month); 
// cb1.setBorder(border); 
cb2 = new JComboBox<>(date); 
// cb2.setBorder(border); 
cb3 = new JComboBox<>(date); 
// cb3.setBorder(border); 
cb4 = new JComboBox<>(seat); 
cb4.setBorder(border); 
cb5 = new JComboBox<>(seat1); 
cb5.setBorder(border); 
cb6 = new JComboBox<>(time); 
// cb6.setBorder(border); 
cb7 = new JComboBox<>(time); 
// cb7.setBorder(border); 
male = new JRadioButton("Male"); female = new JRadioButton("Female"); male.setBackground(b); 
female.setBackground(b); 
gender = new ButtonGroup(); 
gender.add(male); 
gender.add(female); 
JPanel t = new JPanel(); 
t.setSize(150, 150); 
t.add(male); 
t.add(female); 
t.setBackground(b);
JPanel p1 = new JPanel(); 
p1.setSize(150,150); 
tf1 = new JTextField(); 
tf1.setBorder(border); 
p1.add(cb2); 
p1.add(cb); 
p1.add(tf1); 
p1.setLayout(new GridLayout(1,3)); 
JPanel p2 = new JPanel(); 
tf2 = new JTextField(); 
tf2.setBorder(border); 
p2.setSize(200,200); 
p2.add(cb3); 
p2.add(cb1); 
p2.add(tf2); 
p2.setLayout(new GridLayout(1,3)); 
JPanel p3 = new JPanel(); 
tf3 = new JTextField(); 
tf4 = new JTextField(); 
tf3.setBorder(border); 
tf4.setBorder(border); 
p3.setSize(200,200); 
p3.add(tf3); 
p3.add(tf4); 
p3.add(cb7); 
p3.setLayout(new GridLayout(1,3)); 
JPanel p4 = new JPanel(); 
tf5 = new JTextField(); 
tf6 = new JTextField(); 
tf5.setBorder(border); 
tf6.setBorder(border); 
p4.setSize(150,150); 
p4.add(tf5); 
p4.add(tf6); 
p4.add(cb6); 
p4.setLayout(new GridLayout(1,3)); p4.setBackground(b); 
JPanel p5 = new JPanel(); 
p5.add(p1);//ddate 
p5.setBackground(b);
JPanel p6 = new JPanel(); 
p6.add(p2);//pdate 
p6.setBackground(b); 
JPanel p7 = new JPanel(); 
p7.add(p3);//dtime 
p7.setBackground(b); 
JPanel p8 = new JPanel(); 
p8.add(p4);//ptime 
p8.setBackground(b); 
pname = new JPanel(); 
pname.add(lname); 
pname.setBackground(b); 
pemail = new JPanel(); 
pemail.add(lemail); 
pemail.setBackground(b); 
pdestinationaddress = new JPanel(); pdestinationaddress.add(ldestinationaddress); pdestinationaddress.setBackground(b); ppickupaddress = new JPanel(); 
ppickupaddress.add(lpickupaddress); ppickupaddress.setBackground(b); 
pphoneNumber = new JPanel(); 
pphoneNumber.add(lphoneNumber); 
pphoneNumber.setBackground(b); 
padharNumber = new JPanel(); 
padharNumber.add(ladharNumber); 
padharNumber.setBackground(b); 
pgender = new JPanel(); 
pgender.add(lgender); 
pgender.setBackground(b); 
ppassengers = new JPanel(); 
ppassengers.add(lpassengers); 
ppassengers.setBackground(b); 
pseattype = new JPanel(); 
pseattype.add(lseattype); 
pseattype.setBackground(b); 
ppickupdate = new JPanel(); 
ppickupdate.add(lpickupdate); 
ppickupdate.setBackground(b); 
ppickuptime = new JPanel(); 
ppickuptime.add(lpickuptime); 
ppickuptime.setBackground(b);
mainpanel = new JPanel(); 
mainpanel1 = new JPanel(); 
mainpanel2 = new JPanel(); 
// mainpanel3 = new JPanel(); 
mainpanel.setLayout(new GridLayout(2, 2, 20, 15)); mainpanel1.setLayout(new GridLayout(6,2,20,15)); mainpanel2.setLayout(new GridLayout(6,2,20,15)); // mainpanel3.setLayout(new GridLayout(1,1)); 
// mainpanel3.add(j1); 
mainpanel1.add(pname); 
mainpanel1.add(name); 
mainpanel1.add(pemail); 
mainpanel1.add(email); 
mainpanel1.add(pphoneNumber); 
mainpanel1.add(phoneNumber); 
mainpanel1.add(padharNumber); 
mainpanel1.add(adharNumber); 
mainpanel1.add(pgender); 
mainpanel1.add(t); 
mainpanel2.add(pseattype); 
mainpanel2.add(cb4); 
mainpanel2.add(ppassengers); 
mainpanel2.add(cb5); 
mainpanel2.add(pdestinationaddress); 
mainpanel2.add(destinationaddress); 
mainpanel2.add(ppickupaddress); 
mainpanel2.add(pickupaddress); 
mainpanel2.add(ppickupdate); 
mainpanel2.add(p6); 
mainpanel2.add(ppickuptime); 
mainpanel2.add(p8);
// setLayout(new BorderLayout(0, 0)); 
// mainpanel.add(j1, BorderLayout.NORTH); 
// mainpanel.add(mainpanel3); 
mainpanel.add(mainpanel1); 
mainpanel.add(mainpanel2); 
mainpanel.setAlignmentX(Component.CENTER_ALIGNMENT); mainpanel.setSize(600,650); 
setLayout(new BorderLayout(0, 0)); 
add(j, BorderLayout.NORTH); 
// add(j1, BorderLayout.NORTH); 
JButton submit = new JButton("Submit"); 
submit.setBackground(getForeground()); 
add(mainpanel); 
mainpanel.setBackground(b); 
mainpanel1.setBackground(b); 
mainpanel2.setBackground(b); 
// f.add(mainpanel); 
submit.setPreferredSize(new Dimension(100, 40)); add(submit, BorderLayout.SOUTH); 
// f.add(submit); 
// f.getContentPane().setBackground(b); 
submit.addActionListener(new ActionListener() {  
public void actionPerformed(ActionEvent e) 
{  
String name1=name.getText(); 
String email1=email.getText(); 
String phone1=phoneNumber.getText(); 
String gender1; 
if(male.isSelected()) { 
gender1 = "Male"; 
} 
else { 
gender1="Female"; 
} 
String seattype1=""+ cb4.getSelectedItem(); String nopas1=""+ cb5.getSelectedItem(); 
String desaddress1=destinationaddress.getText(); try 
{
Connection con =  
DriverManager.getConnection("jdbc:derby:dbm;create=true"); 
System.out.println("Connected To Derby Database!"); 
Statement st = con.createStatement(); 
PreparedStatement ps = con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?)"); 
ps.setString(1,name1); 
ps.setString(2,email1); 
ps.setString(3,phone1); 
ps.setString(4,gender1); 
ps.setString(5,seattype1); 
ps.setString(6,nopas1); 
ps.setString(7,desaddress1); 
ps.executeUpdate(); 
String query = "SELECT * FROM student_details"; 
ResultSet rs = st.executeQuery(query); 
while(rs.next()) 
{ 
System.out.println("Name: "+rs.getString(1)); 
System.out.println("Email: "+rs.getString(2)); 
System.out.println("Phone number: "+rs.getString(3)); 
System.out.println("Gender: "+rs.getString(4)); 
System.out.println("Seattype: "+rs.getString(5)); 
System.out.println("No.of.Passengers:"+rs.getString(6)); 
System.out.println("Destination Address: "+rs.getString(7)); 
} 
System.out.println("Inserted into Database!"); 
con.close(); 
} 
catch(SQLException e1) 
{ 
e1.printStackTrace(); 
} 
}  
}); 
setVisible(true); 
} 
public static void main(String args[]) { 
new JDBC();
} 
}

