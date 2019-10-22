package tictactoe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class tictactoe extends JFrame implements ActionListener,MouseListener{
	public static void main(String[] args) {
		tictactoe tictactoe = new tictactoe();
		tictactoe.go();
	}
	
	int i =0;
	int b1 =0;
	int b2 =0;
	int b3 =0;
	int b4 =0;
	int b5 =0;
	int b6 =0;
	int b7 =0;
	int b8 =0;
	int b9 =0;
	int judge1=0;
	int judge2=0;
	
	int a[][] = new int[3][3];

	ImageIcon image1 = new ImageIcon(tictactoe.class.getResource("/tictactoeimages/cha.jpg"));
	ImageIcon image2 = new ImageIcon(tictactoe.class.getResource("/tictactoeimages/quan.jpg"));
	JLabel label11 =new JLabel(image1);
	JLabel label12 =new JLabel(image2);
	JLabel label21 =new JLabel(image1);
	JLabel label22 =new JLabel(image2);
	JLabel label31 =new JLabel(image1);
	JLabel label32 =new JLabel(image2);
	JLabel label41 =new JLabel(image1);
	JLabel label42 =new JLabel(image2);
	JLabel label51 =new JLabel(image1);
	JLabel label52 =new JLabel(image2);
	JLabel label61 =new JLabel(image1);
	JLabel label62 =new JLabel(image2);
	JLabel label71 =new JLabel(image1);
	JLabel label72 =new JLabel(image2);
	JLabel label81 =new JLabel(image1);
	JLabel label82 =new JLabel(image2);
	JLabel label91 =new JLabel(image1);
	JLabel label92 =new JLabel(image2);
	JTextField field = new JTextField("游戏结果：");
	JTextArea explain = new JTextArea("游戏说明：游戏有两名玩家，玩家1使用的为棋子为“叉”，"+"\n"+"玩家2使用的棋子为“圈”。游戏开始时玩家1先下第一步。");

	
	
	public void go(){
		setTitle("TicTacToe");
		setSize(500,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon bg = new ImageIcon(tictactoe.class.getResource("/tictactoeimages/zhuan.jpg"));
		JLabel label = new JLabel(bg);
		label.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());
        getLayeredPane().add(label,new Integer(-30001));
        JPanel contentpane = (JPanel)getContentPane();      
        contentpane.setOpaque(false);
      
        
        JPanel button = getbutton();
        button.setOpaque(false);
      
        
        contentpane.add(button);
        
        JPanel labels = getlabel();
        labels.setOpaque(false);
        
        contentpane.add(labels);
        contentpane.addMouseListener(this);
        
        JPanel fields = getfield();
        fields.setOpaque(false);
        contentpane.add(fields);

      
		setVisible(true);
		
		
	}
	
	public JPanel getbutton() {
		JPanel p = new JPanel();
		
		JButton New = new JButton("New");

		
		p.setVisible(true);
		p.setSize(500, 700);
		p.setLayout(null);
		
		Font font = new Font("宋体",Font.ITALIC,30);
		
		
		New.setFocusPainted(false);					
		New.setBounds(350, 130, 100, 50);
		New.setFont(font);
		
		New.addActionListener(this);
		

     
        p.add(New);


		return (p);
		
	}
	
	public JPanel getlabel() {
		JPanel p = new JPanel();		
		p.setVisible(true);
		p.setSize(500, 700);
		p.setLayout(null);
		

		label11.setBounds(60, 200, 100, 100);
		label21.setBounds(200, 200, 100, 100);
		label31.setBounds(340, 200, 100, 100);
		label41.setBounds(60, 320, 100, 100);
		label51.setBounds(200, 320, 100, 100);
		label61.setBounds(340, 320, 100, 100);
		label71.setBounds(60, 440, 100, 100);
		label81.setBounds(200, 440, 100, 100);
		label91.setBounds(340, 440, 100, 100);
		label12.setBounds(60, 200, 100, 100);
		label22.setBounds(200, 200, 100, 100);
		label32.setBounds(340, 200, 100, 100);
		label42.setBounds(60, 320, 100, 100);
		label52.setBounds(200, 320, 100, 100);
		label62.setBounds(340, 320, 100, 100);
		label72.setBounds(60, 440, 100, 100);
		label82.setBounds(200, 440, 100, 100);
		label92.setBounds(340, 440, 100, 100);
	
		p.add(label11);
		p.add(label21);
		p.add(label31);
		p.add(label41);
		p.add(label51);
		p.add(label61);
		p.add(label71);
		p.add(label81);
		p.add(label91);
		p.add(label12);
		p.add(label22);
		p.add(label32);
		p.add(label42);
		p.add(label52);
		p.add(label62);
		p.add(label72);
		p.add(label82);
		p.add(label92);
		
		label11.setVisible(false);
		label12.setVisible(false);
		label21.setVisible(false);
		label22.setVisible(false);
		label31.setVisible(false);
		label32.setVisible(false);
		label42.setVisible(false);
		label41.setVisible(false);
		label51.setVisible(false);
		label52.setVisible(false);
		label61.setVisible(false);
		label62.setVisible(false);
		label71.setVisible(false);
		label72.setVisible(false);
		label81.setVisible(false);
		label82.setVisible(false);
		label91.setVisible(false);
		label92.setVisible(false);	
		
		
		for(int j=0;j<=2;j++)
		{
			for(int k =0 ;k<=2;k++)
			{
				a[j][k]=0;
			}
		}


		return p;
	}
	
	
	public JPanel getfield() {
		JPanel p = new JPanel();		
		p.setVisible(true);
		p.setSize(500, 700);
		p.setLayout(null);
		
		
		Font font = new Font("宋体",Font.PLAIN,34);
		field.setBounds(50, 600, 400, 50);
		field.setEditable(false);
		field.setFont(font);
		
		explain.setBounds(30,130,300,40);
		explain.setEditable(false);
		
		
		
		p.add(field);
		p.add(explain);
		
		
		return p;
		
	}
	


	public void actionPerformed(ActionEvent b) {
		
		if(b.getActionCommand().equals("New"))
		{
			 i =0;
		     b1 =0;
			b2 =0;
			 b3 =0;
			 b4 =0;
			 b5 =0;
			 b6 =0;
			 b7 =0;
			 b8 =0;
			 b9 =0;
			 judge1=0;
			 judge2=0;
			 
			 label11.setVisible(false);
				label12.setVisible(false);
				label21.setVisible(false);
				label22.setVisible(false);
				label31.setVisible(false);
				label32.setVisible(false);
				label42.setVisible(false);
				label41.setVisible(false);
				label51.setVisible(false);
				label52.setVisible(false);
				label61.setVisible(false);
				label62.setVisible(false);
				label71.setVisible(false);
				label72.setVisible(false);
				label81.setVisible(false);
				label82.setVisible(false);
				label91.setVisible(false);
				label92.setVisible(false);	
				
				for(int j=0;j<=2;j++)
				{
					for(int k =0 ;k<=2;k++)
					{
						a[j][k]=0;
					}
				}

				field.setText("游戏结果：");

		
			
		}
	
		
		
	}

	
	public void mouseClicked(MouseEvent arg0) {
	
	}

	
	public void mouseEntered(MouseEvent arg0) {
	
	}

	
	public void mouseExited(MouseEvent arg0) {
	
		
	}

	public void mousePressed(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		


		
		if((x>=50)&&(x<=170)&&(y>=200)&&(y<=300))
		{
		if(b1==0) {
			if(i%2==0)
			{
				a[0][0]=1;
				label11.setVisible(true);
			}
			else
			{
				a[0][0]=2;
			label12.setVisible(true);
			}
			b1 += 1;
			i+=1;
			}
			
		}
		
		if((x>=180)&&(x<=325)&&(y>=200)&&(y<=300))
		{
		if(b2==0) {
			if(i%2==0) {
				a[0][1]=1;
			    label21.setVisible(true);
			}
			else {
				a[0][1]=2;
				label22.setVisible(true);
				
			}
			
			b2 += 1;
			i+=1;
			}
			
		}
		
		if((x>=330)&&(x<=450)&&(y>=200)&&(y<=300))
		{
			if(b3==0) {
		
			if(i%2==0)
			{
			a[0][2]=1;	
			label31.setVisible(true);
			}
			else
			{
			a[0][2]=2;	
			label32.setVisible(true);
			}
			b3 += 1;
			i+=1;
			}
			
		}
		if((x>=50)&&(x<=170)&&(y>=310)&&(y<=430))
		{
			
			if(b4==0) {
			if(i%2==0)
			{
				a[1][0]=1;
			label41.setVisible(true);
			}
			else
			{
			a[1][0]=2;	
			label42.setVisible(true);
			}
			b4 += 1;
			i+=1;
			}
		}
		
		if((x>=180)&&(x<=325)&&(y>=310)&&(y<=430))
		{
			
			if(b5==0) {
			if(i%2==0)
			{
				a[1][1]=1;
			label51.setVisible(true);
			}
			else
			{
			a[1][1]=2;	
			label52.setVisible(true);
			}
			b5 += 1;
			i+=1;
			}
		}
		if((x>=330)&&(x<=450)&&(y>=310)&&(y<=430))
		{
			
			if(b6==0) {
			if(i%2==0)
			{
			a[1][2]=1;	
			label61.setVisible(true);
			}
			else
			{
				a[1][2]=2;
			}
			label62.setVisible(true);
			
			b6 += 1;
			i+=1;
			}
		}
		if((x>=50)&&(x<=170)&&(y>=440)&&(y<=560))
		{
		
			if(b7==0) {
			if(i%2==0)
			{
			a[2][0]=1;	
			label71.setVisible(true);
			}
			else
			{
			a[2][0]=2;	
			label72.setVisible(true);
			}
			b7 += 1;
			i+=1;
			}
		}
		if((x>=180)&&(x<=325)&&(y>=440)&&(y<=560))
		{
			
			
			if(b8==0) {
			if(i%2==0)
			{
			a[2][1]=1;	
			label81.setVisible(true);
			}
			else
			{
			a[2][1]=2;	
			label82.setVisible(true);
			}
			b8 += 1;
			i+=1;
			}
		}
		if((x>=330)&&(x<=450)&&(y>=440)&&(y<=560))
		{
			
			
			if(b9==0) {
			if(i%2==0)
			{
			a[2][2]=1;	
			label91.setVisible(true);
			}
			else
			{
			a[2][2]=2;	
			label92.setVisible(true);
			}
			b9 += 1;
			i+=1;
			}
		}
		
		for(int i1=0;i1<=2;i1++)
		{
			if((a[i1][0]==1&&a[i1][1]==1&&a[i1][2]==1))
			{
				judge1+=1;
			}
			if((a[i1][0]==2&&a[i1][1]==2&&a[i1][2]==2))
			{
				judge2+=1;
			}
		}
		for(int i1=0;i1<=2;i1++)
		{
			if((a[0][i1]==1&&a[1][i1]==1&&a[2][i1]==1))
			{
				judge1+=1;
			}
			if((a[0][i1]==2&&a[1][i1]==2&&a[2][i1]==2))
			{
				judge2+=1;
				
			}
		}
		if((a[1][1]==1&&a[2][2]==1&&a[0][0]==1))
		{
			judge1+=1;
		}
		if((a[1][1]==2&&a[2][2]==2&&a[0][0]==2))
		{
			judge2+=1;
		}
		if((a[1][1]==1&&a[2][0]==1&&a[0][2]==1))
		{
			judge1+=1;
		}
		if((a[1][1]==2&&a[2][0]==2&&a[0][2]==2))
		{
			judge2+=1;
		}
		if(i==9)
		{
			field.setText("游戏结果：平局！");
			b1=2;
			b2=2;
			b3=2;
			b4=2;
			b5=2;
			b6=2;
			b7=2;
			b8=2;
			b9=2;

		}
		if(judge1>0)
		{
			field.setText("游戏结果：玩家1获胜！");
			b1=2;
			b2=2;
			b3=2;
			b4=2;
			b5=2;
			b6=2;
			b7=2;
			b8=2;
			b9=2;
		}
		if(judge2>0)
		{
			field.setText("游戏结果：玩家2获胜！");
			b1=2;
			b2=2;
			b3=2;
			b4=2;
			b5=2;
			b6=2;
			b7=2;
			b8=2;
			b9=2;
		}


		
	}


	public void mouseReleased(MouseEvent arg0) {

		
	}

}
