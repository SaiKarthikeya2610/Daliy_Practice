package Examples;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NoInternetError extends JFrame {

    private static final long serialVersionUID = 1L;

    public NoInternetError() {
        setTitle("No Internet");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contentPane = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Draw the sad face
                g2d.setColor(Color.GRAY);
                g2d.fillRect(100, 50, 100, 100); // Body
                g2d.fillRect(120, 100, 60, 20); // Arms
                g2d.fillRect(120, 120, 20, 40); // Left leg
                g2d.fillRect(160, 120, 20, 40); // Right leg
                g2d.setColor(Color.BLUE);
                g2d.fillOval(120, 60, 20, 20); // Left eye
                g2d.fillOval(160, 60, 20, 20); // Right eye
                g2d.setColor(Color.WHITE);
                g2d.fillRect(125, 70, 10, 10); // Left eye white
                g2d.fillRect(165, 70, 10, 10); // Right eye white
                g2d.fillRect(135, 85, 30, 10); // Mouth
            }
        };
        contentPane.setBackground(Color.BLACK);

        // Add the "No internet" label
        JLabel noInternetLabel = new JLabel("No internet");
        noInternetLabel.setFont(new Font("Arial", Font.BOLD, 24));
        noInternetLabel.setForeground(Color.WHITE);
        contentPane.add(noInternetLabel);

        // Add the "Try:" label
        JLabel tryLabel = new JLabel("Try:");
        tryLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        tryLabel.setForeground(Color.WHITE);
        contentPane.add(tryLabel);

        // Add the suggestions
        String[] suggestions = {
                "• Checking the network cables, modem, and router",
                "• Reconnecting to Wi-Fi",
                "• Running Windows Network Diagnostics"
        };
        for (String suggestion : suggestions) {
            JLabel suggestionLabel = new JLabel(suggestion);
            suggestionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            suggestionLabel.setForeground(Color.WHITE);
            contentPane.add(suggestionLabel);
        }

        // Add the "ERR_INTERNET_DISCONNECTED" label
        JLabel errorLabel = new JLabel("ERR_INTERNET_DISCONNECTED");
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        errorLabel.setForeground(Color.WHITE);
        contentPane.add(errorLabel);

        // Add the "Refresh" button
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement refresh logic here
                System.out.println("Refresh button clicked");
            }
        });
        contentPane.add(refreshButton);

        add(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NoInternetError();
    }
}