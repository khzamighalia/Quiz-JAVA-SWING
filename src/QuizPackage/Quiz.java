/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizPackage;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 *
 */

public class Quiz extends JFrame {
    
    /**
	 * KHZAMI EL GHALIA
	 */
	private static final long serialVersionUID = 1L;
	private JFrame f;
    private JPanel panel1,panel2,panel3;
    private JLabel Label1,Label2;
    private final JRadioButton //Niveau 1
	            Niveau1_Radio1_Choix1,Niveau1_Radio1_Choix2,Niveau1_Radio1_Choix3,
            Niveau1_Radio2_Choix1,Niveau1_Radio2_Choix2,Niveau1_Radio2_Choix3,
            Niveau1_Radio3_Choix1,Niveau1_Radio3_Choix2,Niveau1_Radio3_Choix3,
            Niveau1_Radio4_Choix1,Niveau1_Radio4_Choix2,
            Niveau1_Radio5_Choix1,Niveau1_Radio5_Choix2,Niveau1_Radio5_Choix3,
            //Niveau 2
            Niveau2_Radio1_Choix1,Niveau2_Radio1_Choix2,Niveau2_Radio1_Choix3,
            Niveau2_Radio2_Choix1,Niveau2_Radio2_Choix2,Niveau2_Radio2_Choix3,
            Niveau2_Radio3_Choix1,Niveau2_Radio3_Choix2,
            Niveau2_Radio4_Choix1,Niveau2_Radio4_Choix2,Niveau2_Radio4_Choix3,
            Niveau2_Radio5_Choix1,Niveau2_Radio5_Choix2,Niveau2_Radio5_Choix3,
            //Niveau 3
            Niveau3_Radio1_Choix1,Niveau3_Radio1_Choix2,Niveau3_Radio1_Choix3,
            Niveau3_Radio2_Choix1,Niveau3_Radio2_Choix2,
            Niveau3_Radio3_Choix1,Niveau3_Radio3_Choix2,
            Niveau3_Radio4_Choix1,Niveau3_Radio4_Choix2,
            Niveau3_Radio5_Choix1,Niveau3_Radio5_Choix2,Niveau3_Radio5_Choix3;
    //Buttons Valider
    private JButton BtnValider1,BtnValider2,BtnValider3;
    private final GridLayout GLayout;
    private ButtonGroup BGroup;
    private int score=0;
    
    JLabel chrono1,chrono2,chrono3;
    
    
    public Quiz(){
        super("Quiz");
        f=new JFrame();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        GLayout = new GridLayout(0,4);
	panel1.setLayout(GLayout);
        panel2.setLayout(GLayout);
        panel3.setLayout(GLayout);
        BGroup=new ButtonGroup();
        BtnValider1=new JButton(" Valider ");
        BtnValider2=new JButton(" Valider ");
        BtnValider3=new JButton(" Valider ");
       
        //*************************Pannel 1 :*****************************************
        Label2 = new JLabel(" ");
        panel1.add(Label2);
        Label2 = new JLabel(" ");
        panel1.add(Label2);
        Label2 = new JLabel(" ");
        panel1.add(Label2);
        chrono1=new JLabel();
        panel1.add(chrono1);
        
          // Question 1
        Label1 = new JLabel("JAVA est un langage");
        panel1.add(Label1);
        Niveau1_Radio1_Choix1= new JRadioButton("Compilé");
        panel1.add(Niveau1_Radio1_Choix1);
         Niveau1_Radio1_Choix2= new JRadioButton("Interprété");
        panel1.add(Niveau1_Radio1_Choix2);
         Niveau1_Radio1_Choix3= new JRadioButton("Compilé et interpreté");
        panel1.add(Niveau1_Radio1_Choix3);
        BGroup.add(Niveau1_Radio1_Choix1);
        BGroup.add(Niveau1_Radio1_Choix2);
        BGroup.add(Niveau1_Radio1_Choix3);
        

            // Question 2
        Label1 = new JLabel("Toutes les classes héritent de la classe ");
        panel1.add(Label1);
        Niveau1_Radio2_Choix1= new JRadioButton("Main");
        panel1.add(Niveau1_Radio2_Choix1);
         Niveau1_Radio2_Choix2= new JRadioButton("Object");
        panel1.add(Niveau1_Radio2_Choix2);
         Niveau1_Radio2_Choix3= new JRadioButton("AWT");
        panel1.add(Niveau1_Radio2_Choix3);
        BGroup = new ButtonGroup();
        BGroup.add(Niveau1_Radio2_Choix1);
        BGroup.add(Niveau1_Radio2_Choix2);
        BGroup.add(Niveau1_Radio2_Choix3);

            // Question 3
        Label1 = new JLabel("Par convention une classe ");
        panel1.add(Label1);
        Niveau1_Radio3_Choix1= new JRadioButton("est en minuscule");
        panel1.add(Niveau1_Radio3_Choix1);
         Niveau1_Radio3_Choix2= new JRadioButton("commence par une majuscule");
        panel1.add(Niveau1_Radio3_Choix2);
         Niveau1_Radio3_Choix3= new JRadioButton("est en majuscules");
        panel1.add(Niveau1_Radio3_Choix3);
        BGroup = new ButtonGroup();
        BGroup.add(Niveau1_Radio3_Choix1);
        BGroup.add(Niveau1_Radio3_Choix2);
        BGroup.add(Niveau1_Radio3_Choix3);
        
            // Question 4
        Label1 = new JLabel("Est-ce que on peut avoir plusieurs constructeurs pour la même classe ");
        panel1.add(Label1);
        Niveau1_Radio4_Choix1= new JRadioButton("Oui ");
        panel1.add(Niveau1_Radio4_Choix1);
        Niveau1_Radio4_Choix2= new JRadioButton("Non");
        panel1.add(Niveau1_Radio4_Choix2);
        Label2 = new JLabel(" ");
        panel1.add(Label2);
        BGroup = new ButtonGroup();
        BGroup.add(Niveau1_Radio4_Choix1);
        BGroup.add(Niveau1_Radio4_Choix2);
      
       
            // Question 5
        Label1 = new JLabel("Dans la ligne 'public class A' implements B, B est : ");
        panel1.add(Label1);
        Niveau1_Radio5_Choix1= new JRadioButton("Interface ");
        panel1.add(Niveau1_Radio5_Choix1);
        Niveau1_Radio5_Choix2= new JRadioButton("Classe parent");
        panel1.add(Niveau1_Radio5_Choix2);
        Niveau1_Radio5_Choix3= new JRadioButton("Package");
        panel1.add(Niveau1_Radio5_Choix3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau1_Radio5_Choix1);
        BGroup.add(Niveau1_Radio5_Choix2);
        BGroup.add(Niveau1_Radio5_Choix3);
        
        panel1.add(BtnValider1);
        
        //*************************Pannel 2 :*****************************************
          
        Label2 = new JLabel(" ");
        panel2.add(Label2);
        Label2 = new JLabel(" ");
        panel2.add(Label2);
        Label2 = new JLabel(" ");
        panel2.add(Label2);
        chrono2=new JLabel();
        panel2.add(chrono2);
        
        // Question 1
        Label1 = new JLabel("Après la compilation, un programme écrit en\n" +
"JAVA, il se transforme en programme en bytecode\n" +
"Quelle est l’extension du programme en\n" +
"bytecode ?");
        panel2.add(Label1);
        Niveau2_Radio1_Choix1= new JRadioButton("aucun des choix");
        panel2.add(Niveau2_Radio1_Choix1);
         Niveau2_Radio1_Choix2= new JRadioButton(".JAVA");
        panel2.add(Niveau2_Radio1_Choix2);
         Niveau2_Radio1_Choix3= new JRadioButton(".Class");
        panel2.add(Niveau2_Radio1_Choix3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau2_Radio1_Choix1);
        BGroup.add(Niveau2_Radio1_Choix2);
        BGroup.add(Niveau2_Radio1_Choix3);
        

            // Question 2
        Label1 = new JLabel("Class Test{\n" +
"Public Test () {\n" +
"System.out.println(”Bonjour”);}\n" +
"public Test (int i) {\n" +
"this();\n" +
"System.out.println(”Nous sommes en ”+i+ ” !”);};\n" +
"}\n" +
"qu’affichera l’instruction suivante?\n" +
"Test t1=new Test (2018); ");
        panel2.add(Label1);
        Niveau2_Radio2_Choix1= new JRadioButton("aucun\n" +
"des choix");
        panel2.add(Niveau2_Radio2_Choix1);
         Niveau2_Radio2_Choix2= new JRadioButton("Bonjour\n" +
"Nous\n" +
"sommes en\n" +
"2018 !");
        panel2.add(Niveau2_Radio2_Choix2);
        Niveau2_Radio2_Choix3= new JRadioButton("Nous\n" +
"sommes en\n" +
"2018 !");
        panel2.add(Niveau2_Radio2_Choix3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau2_Radio2_Choix1);
        BGroup.add(Niveau2_Radio2_Choix2);
        BGroup.add(Niveau2_Radio2_Choix3);

            // Question 3
        Label1 = new JLabel("Voici un constructeur de la classe Employee, y-at'il un problème ?\n" +
"Public void Employe(String n){\n" +
"Nom=n;} ");
        panel2.add(Label1);
        Niveau2_Radio3_Choix1= new JRadioButton("Oui ");
        panel2.add(Niveau2_Radio3_Choix1);
         Niveau2_Radio3_Choix2= new JRadioButton("Non");
        panel2.add(Niveau2_Radio3_Choix2);
        Label2 = new JLabel(" ");
         panel2.add(Label2);
         
        BGroup = new ButtonGroup();
        BGroup.add(Niveau2_Radio3_Choix1);
        BGroup.add(Niveau2_Radio3_Choix2);
        
            // Question 4
        Label1 = new JLabel("Pour spécifier que la variable ne pourra plus être\n" +
"modifiée et doit être initialisée dès sa déclaration,\n" +
"on la déclare comme une constante avec le mot\n" +
"réservé ");
        panel2.add(Label1);
        Niveau2_Radio4_Choix1= new JRadioButton("aucun\n" +
"des choix ");
        panel2.add(Niveau2_Radio4_Choix1);
        Niveau2_Radio4_Choix2= new JRadioButton("final");
        panel2.add(Niveau2_Radio4_Choix2);
        Niveau2_Radio4_Choix3= new JRadioButton("const");
        panel2.add(Niveau2_Radio4_Choix3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau2_Radio4_Choix1);
        BGroup.add(Niveau2_Radio4_Choix2);
        BGroup.add(Niveau2_Radio4_Choix3);
      
       
            // Question 5
        Label1 = new JLabel("Dans une classe, on accède à ses variables grâce au\n" +
"mot clé ");
        panel2.add(Label1);
        Niveau2_Radio5_Choix1= new JRadioButton("aucun\n" +
"des choix ");
        panel2.add(Niveau2_Radio5_Choix1);
        Niveau2_Radio5_Choix2= new JRadioButton("this");
        panel2.add(Niveau2_Radio5_Choix2);
        Niveau2_Radio5_Choix3= new JRadioButton("super");
        panel2.add(Niveau2_Radio5_Choix3);
        panel2.add(BtnValider2);
        
        BGroup = new
        ButtonGroup();
        BGroup.add(Niveau2_Radio5_Choix1);
        BGroup.add(Niveau2_Radio5_Choix2);
        BGroup.add(Niveau2_Radio5_Choix3);

        
//*************************Pannel 3 :*****************************************
        
        Label2 = new JLabel(" ");
        panel3.add(Label2);
        Label2 = new JLabel(" ");
        panel3.add(Label2);
        Label2 = new JLabel(" ");
        panel3.add(Label2);
        chrono3=new JLabel();
        panel3.add(chrono3);
        
        
        // Question 1
        Label1 = new JLabel("calculerSalaire(int) calculerSalaire(int, double) La méthode calculerSalaire est :");
        panel3.add(Label1);
        Niveau3_Radio1_Choix1= new JRadioButton("aucun des choix");
        panel3.add(Niveau3_Radio1_Choix1);
        Niveau3_Radio1_Choix2= new JRadioButton("surchargée");
        panel3.add(Niveau3_Radio1_Choix2);
        Niveau3_Radio1_Choix3= new JRadioButton("redéfinie");
        panel3.add(Niveau3_Radio1_Choix3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau3_Radio1_Choix1);
        BGroup.add(Niveau3_Radio1_Choix2);
        BGroup.add(Niveau3_Radio1_Choix3);
        

            // Question 2
        Label1 = new JLabel("Une classe qui contient au moins une méthode abstraite doit être déclarée abstraite.");
        panel3.add(Label1);
        Niveau3_Radio2_Choix1= new JRadioButton("Oui ");
        panel3.add(Niveau3_Radio2_Choix1);
         Niveau3_Radio2_Choix2= new JRadioButton("Non");
        panel3.add(Niveau3_Radio2_Choix2);
        Label2 = new JLabel(" ");
         panel3.add(Label2);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau3_Radio2_Choix1);
        BGroup.add(Niveau3_Radio2_Choix2);

            // Question 3
        Label1 = new JLabel("Est-ce qu’une classe peut implémenter plusieurs interfaces ? ");
        panel3.add(Label1);
        Niveau3_Radio3_Choix1= new JRadioButton("Oui ");
        panel3.add(Niveau3_Radio3_Choix1);
         Niveau3_Radio3_Choix2= new JRadioButton("Non");
        panel3.add(Niveau3_Radio3_Choix2);
        Label2 = new JLabel(" ");
        panel3.add(Label2);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau3_Radio3_Choix1);
        BGroup.add(Niveau3_Radio3_Choix2);
        
            // Question 4
        Label1 = new JLabel("La déclaration d'une méthode suivante : public void traitement() throws IOException précise que la méthode propage une exception\n" +
"contrôlée ");
        panel3.add(Label1);
        Niveau3_Radio4_Choix1= new JRadioButton("Oui ");
        panel3.add(Niveau3_Radio4_Choix1);
         Niveau3_Radio4_Choix2= new JRadioButton("Non");
        panel3.add(Niveau3_Radio4_Choix2);
        Label2 = new JLabel(" ");
         panel3.add(Label2);
         
        BGroup = new ButtonGroup();
        BGroup.add(Niveau3_Radio4_Choix1);
        BGroup.add(Niveau3_Radio4_Choix2);
      
       
            // Question 5
        Label1 = new JLabel("class Test{\n" +
"public static void main (String[] args) {\n" +
"try {\n" +
"int a =10;\n" +
"System.out.println (\"a = \" + a );\n" +
"int b = 0 / a;\n" +
"System.out.println (\"b = \" + b);\n" +
"}\n" +
"catch(ArithmeticException e)\n" +
"{System.out.println (\"diviser par 0!\"); }\n" +
"finally\n" +
"{System.out.println (\"je suis à l’intérieur de\n" +
"finally\");}}} ");
        panel3.add(Label1);
        Niveau3_Radio5_Choix1= new JRadioButton("aucun des choix ");
        panel3.add(Niveau3_Radio5_Choix1);
        Niveau3_Radio5_Choix2= new JRadioButton("a=10\n" +
"b=0\n" +
"Je suis à\n" +
"l’intérieur de\n" +
"finally");
        panel3.add(Niveau3_Radio5_Choix2);
        Niveau3_Radio5_Choix3= new JRadioButton("a=10\n" +
"b=0\n" +
"diviser par 0!\n" +
"je suis à\n" +
"l’intérieur de\n" +
"finally");
        panel3.add(Niveau3_Radio5_Choix3);
        panel3.add(BtnValider3);
        
        BGroup = new ButtonGroup();
        BGroup.add(Niveau3_Radio5_Choix1);
        BGroup.add(Niveau3_Radio5_Choix2);
        BGroup.add(Niveau3_Radio5_Choix3);


        
//******************************************************************************************************************        
       
        f.add(panel1);
        f.setVisible(true);
	f.setSize(1200, 230);
    
  
    
    
    
   BtnValider1.addActionListener(new java.awt.event.ActionListener() {
				@Override
	            public void actionPerformed(java.awt.event.ActionEvent e) {
 //**************** Button 1 **************************************************
   { if(Niveau1_Radio1_Choix3.isSelected()){
       score+=20;
   }
   if(Niveau1_Radio2_Choix2.isSelected()){
       score+=20;
   }
   if( Niveau1_Radio3_Choix2.isSelected()){
       score+=20;
       }
   if(Niveau1_Radio4_Choix1.isSelected()){
       score+=20;
   }
   if(Niveau1_Radio5_Choix1.isSelected()){
       score+=20;
   }
    if(score >= 40)
    {   playSound("C:\\Youcode\\QuizV1\\applause.wav");
        JOptionPane.showMessageDialog(panel1,"Bravo vous passez au deuxieme niveau ");
        f.setContentPane(panel2);
	f.invalidate();
	f.validate();
    }
    else {
        BtnValider1.setEnabled(false);
        playSound("C:\\Youcode\\QuizV1\\gameover.wav");
        JOptionPane.showMessageDialog(panel1," Vous avez perdu ");
        
    }
   }
   
   /* //**************** Button 2 **************************************************
   if(e.getSource()==BtnValider2){
   }
   
   
    //**************** Button 3 **************************************************
   if(e.getSource()==BtnValider3){
   
   }*/
   }
       
   
   });
   
   BtnValider2.addActionListener(new java.awt.event.ActionListener() {
				@Override
	            public void actionPerformed(java.awt.event.ActionEvent e) {
 //**************** Button 1 **************************************************
   { if(Niveau2_Radio1_Choix3.isSelected()){
       score+=20;
   }
   if(Niveau2_Radio2_Choix1.isSelected()){
       score+=20;
   }
   if( Niveau2_Radio3_Choix2.isSelected()){
       score+=20;
       }
   if(Niveau2_Radio4_Choix2.isSelected()){
       score+=20;
   }
   if(Niveau2_Radio5_Choix2.isSelected()){
       score+=20;
   }
    if(score >= 60)
    {
    	playSound("C:\\Youcode\\QuizV1\\applause.wav");
    	JOptionPane.showMessageDialog(panel2,"Bravo vous passez au troisieme niveau ");
        f.setContentPane(panel3);
	f.invalidate();
	f.validate();
    }
    else {
        BtnValider2.setEnabled(false);
        playSound("C:\\Youcode\\QuizV1\\gameover.wav");
        JOptionPane.showMessageDialog(panel2," Vous avez perdu ");
       
    }
   
                    }

                    }
     
   
   });
    
   
      
   BtnValider3.addActionListener(new java.awt.event.ActionListener() {
				@Override
	            public void actionPerformed(java.awt.event.ActionEvent e) {
 //**************** Button 1 **************************************************
   { if(Niveau3_Radio1_Choix2.isSelected()){
       score+=20;
   }
   if(Niveau3_Radio2_Choix1.isSelected()){
       score+=20;
   }
   if( Niveau3_Radio3_Choix1.isSelected()){
       score+=20;
       }
   if(Niveau3_Radio4_Choix1.isSelected()){
       score+=20;
   }
   if(Niveau3_Radio5_Choix1.isSelected()){
       score+=20;
   }
    if(score >= 80)
    {
    	 playSound("C:\\Youcode\\QuizV1\\applause.wav");
    	JOptionPane.showMessageDialog(panel3," You Win ");
        
    }
    else {
        BtnValider3.setEnabled(false);
        playSound("C:\\Youcode\\QuizV1\\gameover.wav");
        JOptionPane.showMessageDialog(panel3," Vous avez perdu ");
        
    	
    }

                    }
 }
       
   
   });
    }
    

	//***Methode Audio****//
	private final int BUFFER_SIZE = 128000;
	private File soundFile;
	private AudioInputStream audioStream;
	private AudioFormat audioFormat;
	private SourceDataLine sourceLine;

	public void playSound(String filename){
		
		String strFilename = filename;
			try {
				soundFile = new File(strFilename);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}

			try {
				audioStream = AudioSystem.getAudioInputStream(soundFile);
			} catch (Exception e){
				e.printStackTrace();
				System.exit(1);
			}
			audioFormat = audioStream.getFormat();

			DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
			try {
				sourceLine = (SourceDataLine) AudioSystem.getLine(info);
				sourceLine.open(audioFormat);
			} catch (LineUnavailableException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		
			sourceLine.start();

			int nBytesRead = 0;
			byte[] abData = new byte[BUFFER_SIZE];
			while (nBytesRead != -1) {
				try {
					nBytesRead = audioStream.read(abData, 0, abData.length);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (nBytesRead >= 0) {
					@SuppressWarnings("unused")
					int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
				}
			}
	}
		


    public static void main(String[] args) {
			Quiz QZ = new Quiz();
			
			QZ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  final long Five_MINUTES = 300000;
		        final java.text.SimpleDateFormat FormatDate = new java.text.SimpleDateFormat("mm : ss");
		        ActionListener TimerListener = new ActionListener() {
		            long x = Five_MINUTES - 1000;

		            @Override
		            public void actionPerformed(java.awt.event.ActionEvent ae) {
		                QZ.chrono1.setText(FormatDate.format(new Date(x)));
		                QZ.chrono2.setText(FormatDate.format(new Date(x)));
		                QZ.chrono3.setText(FormatDate.format(new Date(x)));
		                x -= 1000;
		                if (x == 0) {
		                            QZ.playSound("C:\\Youcode\\QuizV1\\gameover.wav");

		                    JOptionPane.showMessageDialog(null, "Time's Up :(");
		                

		                    System.exit(0);
		                }
		            }
		        };
		        new javax.swing.Timer(1000, TimerListener).start();



                         
  }

   
}
   
    
    
    
