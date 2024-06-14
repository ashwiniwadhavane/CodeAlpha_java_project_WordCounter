import java.awt.event.*;  
import javax.swing.*;  
public class Word extends JFrame implements ActionListener
{  
	JTextArea t1;  
	JButton b1;  
	Word()
		{  
    			super("Word Counter");  
     			t1=new JTextArea();  
    			t1.setBounds(50,50,500,300);  
      			b1=new JButton("Count Words");  
    			b1.setBounds(200,400,200,50);    
      
    			b1.addActionListener(this);  
    			add(b1);
    			add(t1);  
    			setSize(600,600);  
    			setLayout(null);  
    			setVisible(true);  
		}  
		public void actionPerformed(ActionEvent e)
			{  
    				String text=t1.getText();  
    				if(e.getSource()==b1){  
        			String words[]=text.split("\\s");  
        			JOptionPane.showMessageDialog(this,"Total words: "+words.length);  
    			}  
    
}  
public static void main(String[] args)
 {  
    new Word();  
}  
}  