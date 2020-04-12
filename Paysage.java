package miniprojet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paysage{
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();         
        jf.setSize(750, 500);                       
        jf.setLocationRelativeTo(null);             
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(null);
        JButton bouton1 = new JButton("Règle du Jeu");
        bouton1.setLocation(300, 100);
        bouton1.setSize(150, 30);
        
        //Image image = Toolkit.getDefaultToolkit().getImage(String filename);
        
        /*bouton1.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                
        	};
        	
        });*/
        
        /*
        jf.addKeyListener(new KeyListener()
        {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.print(e.getKeyCode());
				
			}
            @Override
            public void keyTyped(KeyEvent e) {
                // e.getKeyChar() 获取键入的字符
            	//VK_KP_DOWN VK_KP_UP VK_KP_LEFT VK_KP_RIGHT
                System.out.println("saisie: " + e.getKeyChar());
            }
			@Override
			public void keyReleased(KeyEvent e) {}
        });*/

        panel.requestFocusInWindow(); 
        
        JButton bouton2 = new JButton("Commencer");
        bouton2.setLocation(300, 150);
        bouton2.setSize(150, 30);
        

		EventQueue.invokeLater(new Runnable() {
		    @Override
		    public void run() {
		        // 创建窗口对象
		        MyFrame frame = new MyFrame();
		        // 显示窗口
		        frame.setVisible(true);
		    }
		});      
        
        panel.add(bouton1);
        panel.add(bouton2);
        
        jf.setContentPane(panel);
        jf.setVisible(true);
	}
	
	public static class MyFrame extends JFrame {
		
		public static final String TITLE = "JEU";
		public static final int WIDTH = 750;
		public static final int HEIGHT = 500;
		
		public MyFrame() {
		    super();
		    initFrame();
		}
		
		private void initFrame() {
		    // 设置 窗口标题 和 窗口大小
		    setTitle(TITLE);
		    setSize(WIDTH, HEIGHT);
		
		    // 设置窗口关闭按钮的默认操作(点击关闭时退出进程)
		    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		    // 把窗口位置设置到屏幕的中心
		    setLocationRelativeTo(null);
		
		    // 设置窗口的内容面板
		    MyPanel panel = new MyPanel(this);
		    setContentPane(panel);
		}
	}
	
	public static class MyPanel extends JPanel {

        private MyFrame frame;

        public MyPanel(MyFrame frame) {
            super();
            this.frame = frame;
        }
        
        private void drawImage(Graphics g) {
            frame.setTitle("JEU");
            Graphics2D g2d = (Graphics2D) g.create();

            // 从本地读取一张图片
            String filepath = "/home/tyan/GM3/miniprojet/miniprojet/src/miniprojet/font.png";
            Image image = Toolkit.getDefaultToolkit().getImage(filepath);

            // 绘制图片（如果宽高传的不是图片原本的宽高, 则图片将会适当缩放绘制）
            g2d.drawImage(image, 750, 500, image.getWidth(this), image.getHeight(this), this);

            g2d.dispose();
        }
	}
	
	

}




