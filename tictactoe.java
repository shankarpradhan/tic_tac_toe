import java.awt.*;
import java.awt.event.*;

class Start extends Frame implements ActionListener{
	Button b[] = new Button[9];
	Font f = new Font("", Font.BOLD, 20);
	Button b1;

	int ind=0,x=100,y=100;
	int margin_top = 50;
	int action_type = 0;
	int winning_location = 450;

	int butt[] = new int[9];


	Start(){
		//window 
		setLayout(null);
		setVisible(true);
		setSize(800,600);
		setLocation(300,100);
		setBackground(Color.black);
		setForeground(Color.white);

		//matrix
		for(int i=1;i<=3;i++){

			for(int j=1;j<=3;j++){

				b[ind] = new Button();
				b[ind].setSize(100,100);
				b[ind].setLocation(x,y);
				b[ind].setFont(new Font("",Font.BOLD,40));

				add(b[ind]);

				b[ind].addActionListener(this);
				b[ind].setBackground(new Color(255,141,28));
				ind++;
				x=x+100;
			}
			x = 100;
			y=y+100;
		}

		b1 = new Button("NEW GAME");
		b1.setSize(150, 50);
		b1.setLocation(180,450);
		b1.setFont(f);
		b1.setForeground(Color.black);
		
		add(b1);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		//variable for winning conditions
		Label p1 = new Label();
		

		if(e.getSource()==b1){
			for(int i=0;i<=8;i++){
				b[i].setLabel("");
				butt[i] = 0;
			}
			action_type = 0;
		}

		for(int i=0;i<=8;i++){
			if(e.getSource()==b[i] && butt[i]==0){
				if(action_type%2==0){
					b[i].setLabel("O");
				}
				else{
					b[i].setLabel("X");
				}
				butt[i] += 1;
				action_type++;
			}
		}
		
		
		// Game Winning conditions row wise
		if(b[0].getLabel()==b[1].getLabel() && b[1].getLabel()==b[2].getLabel()){
			if(b[0].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[0].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
			
		}
		if(b[3].getLabel()==b[4].getLabel() && b[4].getLabel()==b[5].getLabel()){
			if(b[3].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[3].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
			
		}

		if(b[6].getLabel()==b[7].getLabel() && b[7].getLabel()==b[8].getLabel()){
			if(b[6].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[6].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}
		
		// Game Winning conditions column wise
		if(b[0].getLabel()==b[3].getLabel() && b[3].getLabel()==b[6].getLabel()){
			if(b[0].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[0].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}
		
		if(b[1].getLabel()==b[4].getLabel() && b[4].getLabel()==b[7].getLabel()){
			if(b[1].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[1].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}

		if(b[2].getLabel()==b[5].getLabel() && b[5].getLabel()==b[8].getLabel()){
			if(b[2].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}

			if(b[2].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}

		// corner wise winning conditions
		if(b[0].getLabel()==b[4].getLabel() && b[4].getLabel()==b[8].getLabel()){
			if(b[0].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
			if(b[0].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}
			
		if(b[2].getLabel()==b[4].getLabel() && b[4].getLabel()==b[6].getLabel()){
			if(b[2].getLabel()=="O"){
				p1 = new Label("player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
			if(b[2].getLabel()=="X"){
				p1 = new Label("player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(winning_location,margin_top);
				p1.setFont(f);
				add(p1);
				margin_top += 50;
			}
		}
			// if(b[2].getLabel()=="O"){
			// 	Label p1 = new Label("player 2 wins");
			// 	p1.setSize(150,50);
			// 	p1.setLocation(320,margin_top);
			// 	p1.setFont(f);
			// 	add(p1);
			// }

		


	}
}
public class tictactoe{
	public static void main(String[] args){
		Start obj1 = new Start();
	}
}