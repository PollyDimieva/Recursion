package recursion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

static int order = 0;

	//private JTextField jtfOrder = new JTextField("0", 5); // Order
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		
		 JButton plus = new JButton("+");
		    panel.add(plus);
		   
		    plus.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){ 
		    	    order++;
		    		trianglePanel.setOrder(order);
		    		int newOrder=order;
		        }  
		    }); 

		
		 JButton minus = new JButton("-");
		    panel.add(minus);
		   
		    minus.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){ 
		    	    order--;
		    		trianglePanel.setOrder(order);
		        }  
		    }); 
		    
		    add(trianglePanel);
			add(panel, BorderLayout.SOUTH);

	}

}
