
package xogame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class gui extends JFrame implements ActionListener{

    Font newFont,newFont2;
    JTextField txt;
    JPanel p,p2;
    JButton btn[]=new JButton[9];
    JButton again,home;
    public static boolean b=true;
    public static JLabel l1=new JLabel(),l2=new JLabel(),l3,l4,l5=new JLabel(XoGame.player1+" now...");
    public static   int count=0;
    JTextField t1,t2;
    public static int player_=0;
    public gui(){
       this.setTitle("X/o");
       newFont = new Font("Serif", Font.BOLD, 90);
        setLayout(null);
       p=new JPanel(new GridLayout(3,3));
       for(int i=0;i<btn.length;i++){
           btn[i]=new JButton("");
           btn[i].setFont(newFont);
           p.add(btn[i]);
           btn[i].setBackground(Color.white);
           
           btn[i].addActionListener(this);
       }
       p.setBounds(0, 0, 700, 500);
       add(p);
       
       
       l1.setBounds(10, 505,100, 20);
       add(l1);
       l3=new JLabel("0");
       l3.setBounds(105, 505, 100, 20);
       add(l3);

       l2.setBounds(10, 530,100, 20);
       add(l2);
       
       l4=new JLabel("0");
       l4.setBounds(105, 530, 100, 20);
       add(l4);
       
       l5.setBounds(300, 515, 150, 20);
       add(l5);
       
       again=new JButton("again");
        again.setBounds(500, 510, 100, 20);
         add(again);
         
        home=new JButton("home");
        home.setBounds(500, 535, 100, 20);
        add(home);
        
                  home.addActionListener(this);
                  again.addActionListener(this);

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 100);
        this.setResizable(false);
        this.setSize(700, 600);
        this.setVisible(true);

    }
    
  
    String player="";
    String arr[][]=new String[3][3];
    int countX=0,countO=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == home){
          int c= JOptionPane.showConfirmDialog(null, "Are u sure ? " , "Confirm", 0);
          if(c == 0){
              XoGame.gui.hide();
               XoGame.gui=null;
               XoGame.mainMenue();
          }
        }else if(e.getSource() == again){
             int cc= JOptionPane.showConfirmDialog(null, "Do you want to restart the game again ? " , "Confirm", 0);
          if(cc == 0){
            countX=0;
            countO=0;
            count=0;
            int c=0;
            for(int i=0;i<arr.length;i++){
                
                for(int j=0;j<3;j++){
                btn[c].setText(""); 
                c++;
                arr[i][j]=null;
                }
                l3.setText("0");
                l4.setText("0");
            }
            return ;
          }
        
        }
        
        
        if(count%2 == 0){
            player="x";
        }else if(count%2 == 1 && b==true){
            player="o";
        }
     if(e.getSource() == btn[0]){
         
         if(arr[0][0] == null){
             if(player_== 0){
            btn[0].setText("x");
            arr[0][0]="x";
            check("x");
            computer();
             }else{
               
            btn[0].setText(player);
            arr[0][0]=player;
            count++;
            check(player);   
             }
         }
         
     }else if(e.getSource() == btn[1]){
        if(arr[0][1] == null){
           if(player_== 0){
            btn[1].setText("x");
            arr[0][1]="x";
            check("x");
            computer();
             }else{
         btn[1].setText(player);
         arr[0][1]=player;
         count++;
         check(player);
               }
             }
         }else if(e.getSource() == btn[2]){
               
             if(arr[0][2] == null){
                     if(player_== 0){
                    btn[2].setText("x");
                    arr[0][2]="x";
                    check("x");
                    computer();
                     }else{
                btn[2].setText(player);
                arr[0][2]=player;
                count++;            
                check(player);
                     }
             }
          
     }else if(e.getSource() == btn[3]){
          if(arr[1][0] == null){
               if(player_== 0){
                    btn[3].setText("x");
                    arr[1][0]="x";
                    check("x");
                    computer();
                     }else{
           btn[3].setText(player);
           arr[1][0]=player;
           count++;
           check(player);
               }
             }
     }else if(e.getSource() == btn[4]){
        if(arr[1][1] == null){
             if(player_== 0){
                    btn[4].setText("x");
                    arr[1][1]="x";
                    check("x");
                    computer();
                     }else{
         btn[4].setText(player);
           arr[1][1]=player;
           count++;
           check(player);
             }
        }
        
        }else if(e.getSource() == btn[5]){
          if(arr[1][2] == null){
               if(player_== 0){
                    btn[5].setText("x");
                    arr[1][2]="x";
                    check("x");
                    computer();
                     }else{
            btn[5].setText(player);
           arr[1][2]=player;
           count++;
           check(player);
               }
          }
          }else if(e.getSource() == btn[6]){
            if(arr[2][0] == null){
                 if(player_== 0){
                    btn[6].setText("x");
                    arr[2][0]="x";
                    check("x");
                    computer();
                     }else{
                btn[6].setText(player);
               arr[2][0]=player;
               count++;
               check(player);
                }
            }
     }else if(e.getSource() == btn[7]){
        if(arr[2][1] == null){
             if(player_== 0){
                    btn[7].setText("x");
                    arr[2][1]="x";
                    check("x");
                    computer();
                     }else{
         btn[7].setText(player);
           arr[2][1]=player;
           count++;
           check(player);
        }
        }
     }else if(e.getSource() == btn[8]){
         if(arr[2][2] == null){
              if(player_== 0){
                    btn[8].setText("x");
                    arr[2][2]="x";
                    check("x");
                    computer();
                     }else{
         btn[8].setText(player);
           arr[2][2]=player;
           count++;
           check(player);
              }
         }
     }
    
    
    }
    
   
    
    
    public void computer(){
        // 2 o >> 1 null
         int count=0,count2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i][0] == arr[i][1] )  && (arr[i][0] =="o") &&( arr[i][2] ==null) ){
                 arr[i][2]="o";
                 btn[count+2].setText("o");
                         check("o");
                          return ;

            }else if( (   (arr[i][0] == arr[i][2]) && (arr[i][0] =="o")  ) && ( arr[i][1] == null) ){
                    
                 arr[i][1]="o";
                 btn[count+1].setText("o");
                         check("o");

                 return ;

                }  else if( (   (arr[i][1] == arr[i][2]) && (arr[i][1] =="o")  ) && (  arr[i][0] == null)  ){
                  arr[i][0]="o";
                 btn[count].setText("o");
                         check("o");
                         return ;

                }else{
                    count+=3;
                }
                
                
                if((arr[0][i] == arr[1][i] )  && (arr[0][i] =="o")  && (arr[2][i]== null) ){
                 arr[2][i]="o";
                 btn[count2+6].setText("o");
                  check("o");
                   return ;
                    

            }else if( (   (arr[0][i] == arr[2][i]) && (arr[0][i] =="o")  )  && (arr[1][i]== null)  ){
                    
                  arr[1][i]="o";
                 btn[count2+3].setText("o");
                  check("o");
                  return ;

               }  else if( (   (arr[1][i] == arr[2][i]) && (arr[1][i] =="o")  && (arr[0][i]== null)  )  ){
                  arr[0][i]="o";
                 btn[count2].setText("o");
                  check("o");
                  return ;

                }else{
                    count2++;
                }
            
        }
        
            if( ( arr[0][0] == arr[1][1]  ) && ( arr[0][0] == "o") && (arr[2][2]== null) ){
                arr[2][2]="o";
                btn[8].setText("o");
                check("o");
                return;
            }else if( ( arr[0][0] == arr[2][2]  ) && ( arr[0][0] == "o") && (arr[1][1]== null) ){
                arr[1][1]="o";
                btn[4].setText("o");
                check("o");
                return;
            } else if( ( arr[1][1] == arr[2][2]  ) && ( arr[1][1] == "o") && (arr[0][0]== null) ){
                arr[0][0]="o";
                btn[0].setText("o");
                check("o");
                return;
            }else if( ( arr[0][2] == arr[1][1]  ) && ( arr[0][2] == "o") && (arr[2][0]== null) ){
                arr[2][0]="o";
                btn[6].setText("o");
                check("o");
                return;
            }else if( ( arr[0][2] == arr[2][0]  ) && ( arr[0][2] == "o") && (arr[1][1]== null) ){
                arr[1][1]="o";
                btn[4].setText("o");
                check("o");
                return;
            }else if( ( arr[1][1] == arr[2][0]  ) && ( arr[1][1] == "o") && (arr[0][2]== null) ){
                arr[0][2]="o";
                btn[2].setText("o");
                check("o");
                return;
            }
              
            
       // end 2 0 >> 1 null 
       
       
       // 2 x >> 1 null 
            int count3=0,count4=0;
            
            for(int i=0;i<arr.length;i++){
            if((arr[i][0] == arr[i][1] )  && (arr[i][0] =="x") &&( arr[i][2] ==null) ){
                 arr[i][2]="o";
                 btn[count3+2].setText("o");
                         check("o");
                          return ;

            }else if( (   (arr[i][0] == arr[i][2]) && (arr[i][0] =="x")  ) && ( arr[i][1] == null) ){
                    
                 arr[i][1]="o";
                 btn[count3+1].setText("o");
                         check("o");

                 return ;

                }  else if( (   (arr[i][1] == arr[i][2]) && (arr[i][1] =="x")  ) && (  arr[i][0] == null)  ){
                  arr[i][0]="o";
                 btn[count3].setText("o");
                         check("o");
                         return ;

                }else{
                    count3+=3;
                }
                
                
                if((arr[0][i] == arr[1][i] )  && (arr[0][i] =="x") && (arr[2][i]== null) ){
                 arr[2][i]="o";
                 btn[count4+6].setText("o");
                  check("o");
                   return ;
                    

            }else if( (   (arr[0][i] == arr[2][i]) && (arr[0][i] =="x")  )&& (arr[1][i]== null)  ){
                    
                  arr[1][i]="o";
                 btn[count4+3].setText("o");
                  check("o");
                  return ;

               }  else if( (   (arr[1][i] == arr[2][i]) && (arr[1][i] =="x")  ) && (arr[0][i]== null)  ){
                  arr[0][i]="o";
                 btn[count4].setText("o");
                  check("o");
                  return ;

                }else{
                    count4++;
                }
            
        }
        
            if( ( arr[0][0] == arr[1][1]  ) && ( arr[0][0] == "x") && (arr[2][2]== null) ){
                arr[2][2]="o";
                btn[8].setText("o");
                check("o");
                return;
            }else if( ( arr[0][0] == arr[2][2]  ) && ( arr[0][0] == "x") && (arr[1][1]== null) ){
                arr[1][1]="o";
                btn[4].setText("o");
                check("o");
                return;
            } else if( ( arr[1][1] == arr[2][2]  ) && ( arr[1][1] == "x") && (arr[0][0]== null) ){
                arr[0][0]="o";
                btn[0].setText("o");
                check("o");
                return;
            }else if( ( arr[0][2] == arr[1][1]  ) && ( arr[0][2] == "x") && (arr[2][0]== null) ){
                arr[2][0]="o";
                btn[6].setText("o");
                check("o");
                return;
            }else if( ( arr[0][2] == arr[2][0]  ) && ( arr[0][2] == "x") && (arr[1][1]== null) ){
                arr[1][1]="o";
                btn[4].setText("o");
                check("o");
                return;
            }else if( ( arr[1][1] == arr[2][0]  ) && ( arr[1][1] == "x") && (arr[0][2]== null) ){
                arr[0][2]="o";
                btn[2].setText("o");
                check("o");
                return;
            }
            
            // end 2 x >> 1 null 
            
            
            
            // 1 o >>> 2 null
             count=0;
             count2=0;
            for(int i=0;i<arr.length;i++){

            if(  (arr[i][0] == "o") && (arr[i][1]==null) && (arr[i][2]==null)  ){
                int max=2 ,min=1;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                arr[i][r]="o";
                btn[count+r].setText("o");
                check("o");
               return ;
            }else if(  (arr[i][1] == "o") && (arr[i][0]==null) && (arr[i][2]==null)  ){
                int max=2 ,min=0;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                 if(r==1){
                     r=0;
                 }
                arr[i][r]="o";
                btn[count+r].setText("o");
                check("o");
               return ;
            }else if(  (arr[i][2] == "o") && (arr[i][0]==null) && (arr[i][1]==null)  ){
                int max=1 ,min=0;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                arr[i][r]="o";
                btn[count+r].setText("o");
                check("o");
               return ;
            }else if(  (arr[0][i] == "o") && (arr[1][i]==null) && (arr[2][i]==null)  ){
                int max=2 ,min=1;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                arr[r][i]="o";
                if(r == 1){
                    r=3;
                }else if(r == 2){
                    r=6;
                }
                btn[count2+r].setText("o");
                check("o");
               return ;
            }else if(  (arr[1][i] == "o") && (arr[0][i]==null) && (arr[2][i]==null)  ){
                int max=2 ,min=0;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                 if(r==1){
                     r=0;
                 }
                arr[r][i]="o";
                if(r == 0){
                    r=0;
                }else if(r == 2){
                    r=6;
                }
                btn[count2+r].setText("o");
                check("o");
               return ;
            }else if(  (arr[2][i] == "o") && (arr[1][i]==null) && (arr[0][i]==null)  ){
                int max=1 ,min=0;
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                arr[r][i]="o";
                if(r == 0){
                    r=0;
                }else if(r == 1){
                    r=3;
                }
                btn[count2+r].setText("o");
                check("o");
               return ;
            }
            
            
            
            else{
                count2++;
                count+=3;
            }
            
            }
            
            
            if( (arr[0][0] =="o") && (arr[1][1] == null) && (arr[2][2] == null) )
            {
                int max=3 ,min=1;
                
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                if(r == 3){
                    r=2;
                }
                 arr[r][r]="o";
                if(r == 1){
                    r=4;
                }else if(r == 2){
                    r=8;
                }
                btn[r].setText("o");
                check("o");
               return ;
            }else if( (arr[1][1] =="o") && (arr[0][0] == null) && (arr[2][2] == null) )
            {
                int max=3 ,min=0;
                
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                if(r == 3){
                    r=2;
                }
                if(r == 1){
                    r=0;
                }
                 arr[r][r]="o";
                if(r == 0){
                    r=0;
                }else if(r == 2){
                    r=8;
                }
                btn[r].setText("o");
                check("o");
               return ;
            }else if( (arr[2][2] =="o") && (arr[0][0] == null) && (arr[1][1] == null) )
            {
                int max=2 ,min=0;
                
                 int r = (int) ((Math.random()*((max-min)+1))+min);
                if(r == 2){
                    r=1;
                }
                
                 arr[r][r]="o";
                if(r == 0){
                    r=0;
                }else if(r == 1){
                    r=4;
                }
                btn[r].setText("o");
                check("o");
               return ;
            }else if( (arr[0][2] =="o") && (arr[1][1] == null) && (arr[2][0] == null) )
            {
               
                arr[2][0]="o";
                
                btn[6].setText("o");
                check("o");
               return ;
            }else if( (arr[1][1] =="o") && (arr[0][2] == null) && (arr[2][0] == null) )
            {
               
                arr[0][2]="o";
                
                btn[2].setText("o");
                check("o");
               return ;
            }else if( (arr[2][0] =="o") && (arr[0][2] == null) && (arr[1][1] == null) )
            {
               
                arr[0][2]="o";
                
                btn[2].setText("o");
                check("o");
               return ;
            }
            
            // end 1 o >> 2 null 
            
           
            // 3 null 
            count=0;
            count2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i][0] == arr[i][1] )  && (arr[i][0] ==arr[i][2]) &&( arr[i][2] ==null) ){
                 Random rand = new Random(); 
                 // Generate random integers in range 0 to 2 
                int r = rand.nextInt(3);  
                arr[i][r]="o";
                btn[count+r].setText("o");
                check("o");
               return ;

            }else{
                    count+=3;
                }
                
                
                if( (arr[0][i] == arr[1][i] ) && (arr[0][i] == arr[2][i])  && (arr[0][i] ==null) ){
                 Random rand = new Random(); 
                 // Generate random integers in range 0 to 2 
                int r = rand.nextInt(3);  
                arr[r][i]="o";
                if(r == 0){
                    r=0;
                }else if(r == 1){
                    r=3;
                }else if(r == 2){
                    r=6;
                }
                btn[count2+r].setText("o");
                check("o");
               return ;
             
            }else{
                    count2++;
                }
            
        }
        
            if( ( arr[0][0] == arr[1][1]  ) && (arr[0][0] == arr[2][2]) && ( arr[0][0] == null) ){
               
                  Random rand = new Random(); 
                 // Generate random integers in range 0 to 2 
                int r = rand.nextInt(3);  
                arr[r][r]="o";
                 if(r == 0){
                    r=0;
                }else if(r == 1){
                    r=4;
                }else if(r == 2){
                    r=8;
                }
                btn[r].setText("o");
                check("o");
                return;
               }else if( ( arr[0][2] == arr[1][1]  ) && (arr[0][2] == arr[2][0]) && ( arr[0][2] == null) ){
                arr[0][2]="o";
                btn[0].setText("o");
                check("o");
                return;
            }
            // end 3 null
            
            
            // other 
            count = 0;
            for(int i = 0; i<arr.length;i++){
                for(int j=0 ; j<3;j++){
                    if(arr[i][j] == null){
                        arr[i][j]="o";
                        btn[count].setText("o");
                        check("o");
                        return;
                    }
                    count++;
                }
            }
            
    }
    
  
  
    
    public void check(String value){
        String won=null;
         if(value == "x"){
             won= l1.getText();
         }else if(value == "o"){
             won = l2.getText();
         }
        if( ( (arr[0][0] ==  arr[1][1]) && (arr[0][0] == arr[2][2]) && (arr[0][0]!=null) ) || ( (arr[0][2] ==  arr[1][1]) && (arr[0][2] == arr[2][0]) && (arr[0][2]!=null) )  ){
             
            JOptionPane.showMessageDialog(null,won+" won !! !!");
            count=0;
            l5.setText(XoGame.player1+" now...");

             if(value == "x"){
                 countX++;
             }else if(value == "o"){
                 countO++;
             }
             for(int i=0;i<btn.length;i++){
                 btn[i].setText("");
             }
             for(int i=0;i<arr.length;i++){
                 for(int j=0;j<3;j++){
                  arr[i][j]=null;     
                 }
             }
              l3.setText(countX+"");
              l4.setText(countO+"");

    
        }
        for(int i = 0;i<arr.length;i++){
          
            if(  ( (arr[i][0] ==  arr[i][1]) && (arr[i][0] == arr[i][2]) && (arr[i][0]!=null) ) || ((arr[0][i] ==  arr[1][i]) && (arr[0][i] == arr[2][i]) && (arr[0][i]!=null) )  ){
            JOptionPane.showMessageDialog(null,won+" won !! !!");
            count=0;
            l5.setText(XoGame.player1+" now...");

            if(value == "x"){
                 countX++;
             }else if(value == "o"){
                 countO++;
             }
             for(int ii=0;ii<btn.length;ii++){
                 btn[ii].setText("");
             }
             
             for(int ii=0;ii<arr.length;ii++){
                 for(int j=0;j<3;j++){
                  arr[ii][j]=null;     
                 }
             }
               l3.setText(countX+"");
               l4.setText(countO+"");
    
        }
        }
        boolean b = false;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] == null){
                    b=true;
                }
            }
        }
        
        if(b == false){
             JOptionPane.showMessageDialog(null,"Draw !! ");
            count=0; 
          l5.setText(XoGame.player1+" now...");

             for(int i=0;i<btn.length;i++){
                 btn[i].setText("");
             }
             
             for(int ii=0;ii<arr.length;ii++){
                 for(int j=0;j<3;j++){
                  arr[ii][j]=null;     
                 }
             }
                l3.setText(countX+"");
               l4.setText(countO+"");
        }
        
        if(gui.count%2 == 0){
            player="x";
            l5.setText(XoGame.player1+" now...");
        }else if(gui.count%2 == 1 && b==true){
            player="o";
            l5.setText(XoGame.player2+" now...");
        }
        
    }
}


public class XoGame {
    
    public static String player1,player2;
    public static gui gui ; 
    public static void mainMenue(){
        boolean bo =true;
         try{
        while(bo){
       
                String play= JOptionPane.showInputDialog(null," I want to play with : \n 1- computer \n 2- player");
                if(play.equals("1")){
                  player1= JOptionPane.showInputDialog(null,"please, enter your name ");
                  player2="Computer";
                  if(player1.equals("")){
                      player1="you";
                  }
                   gui.l1.setText(player1+" (X)");
                   gui.l2.setText(player2+" (O)");
                   gui.player_=0;
                   gui.l5.hide();
                   bo=false;      
                }else if(play.equals("2")){
                     player1= JOptionPane.showInputDialog(null,"please, enter name player 1  ");
                     if(player1.equals("")){
                      player1="player1";
                  }
                     gui.l1.setText(player1+" (X)");
                     player2= JOptionPane.showInputDialog(null,"please, enter name player 2  ");
                     if(player2.equals("")){
                      player2="player2";
                  }
                    gui.l2.setText(player2+" (O)");
                    gui.player_=1;
                   bo =false; 
                }else{
                    
                    JOptionPane.showMessageDialog(null, "please enter correctly !! ");
                }
        }
             
            }catch(Exception e){
                System.exit(0);
            }
             gui=  new gui();

    }
    
    public static void main(String[] args) {
        
        mainMenue();
    }
    
}
