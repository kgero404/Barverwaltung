package getraenkeVertrieb;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class VerkaufButton extends JButton {						
	
	@Override
	public void addActionListener(ActionListener listener) {
		 for( ActionListener al : getActionListeners()) {
		        removeActionListener( al );
		    }
		super.addActionListener(listener);
	}
	
}
// da in der KLasse BetserButtonVonWelt 