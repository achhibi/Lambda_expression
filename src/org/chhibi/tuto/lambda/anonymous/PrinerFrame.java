package org.chhibi.tuto.lambda.anonymous;

import javax.swing.JButton;
import javax.swing.JFrame;
//il faut ajouter le package javax.swing dans dans le module-info comme requires
@SuppressWarnings("serial")
public class PrinerFrame extends JFrame{
	
	PrinerFrame(){
		var btn=new JButton("clic me");
		
		add(btn);
		
		btn.addActionListener(e->{
			System.out.println("Clicked");
			this.dispose();
		});
		
		pack();
	}
	
	public static void main(String[] args) {
		var window=new PrinerFrame();
		window.setVisible(true);
	}

}
