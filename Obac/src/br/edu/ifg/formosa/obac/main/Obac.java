
package br.edu.ifg.formosa.obac.main;

import java.applet.Applet;
import java.security.AccessController;
import java.security.PrivilegedAction;



public class Obac extends Applet{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		this.setSize(800, 600);
		this.setLayout(null);
		AccessController.doPrivileged(new PrivilegedAction() {
		@Override
		public Object run() {
			
			return null;
		}
		});
		
    	try {
             java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                	new InterfaceBuilder(Obac.this);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
