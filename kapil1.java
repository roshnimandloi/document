import java.awt.*;
public class hello1{
public static void main(srings args[]){
Frame f=new frame("Label Example");
Label l1,l2;

l1=new Label("First Label");
l2=new Label("Second Label");

l1.setBounds("50,100,100,30");
l2.setBounds("50,150,100,30");
l1.setBackground(Color.red);
l2.setBackground(Color.blue);
f.add(l1);
f.add(l2);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}