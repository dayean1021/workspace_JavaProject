import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField; 

public class Win10_Layout extends Frame{    
    Label lblId;
    Label lblPwd;
    TextField txtId;
    TextField txtPwd;
   
    public Win10_Layout(){
        
         GridLayout gu = new GridLayout(2,2);
         setLayout(gu);
         lblId = new Label("���̵�");
         txtId = new TextField();
        
         lblPwd = new Label("��й�ȣ");
         txtPwd = new TextField();
        
         add(lblId);
         add(txtId);
         add(lblPwd);
         add(txtPwd);
        
         setSize(200, 100);
         setVisible(true);
    }
   
   
    public static void main(String[] args) {
         new Win10_Layout();
    }
}