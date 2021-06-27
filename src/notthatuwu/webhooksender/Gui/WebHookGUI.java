package notthatuwu.webhooksender.Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import notthatuwu.webhooksender.WebhookSender;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class WebHookGUI {

	public JFrame frame;
	private JTextField webHookInput;
	private JTextField message_Input;
	private JTextField webHook_NameInput;
	private JTextField webhook_ProfileInput;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public WebHookGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("WebHook Sender");
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel webhooklabel = new JLabel("Web Hook Sender");
		webhooklabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		webhooklabel.setBounds(140, 13, 208, 39);
		panel.add(webhooklabel);
		
		webHookInput = new JTextField();
		webHookInput.setBounds(54, 69, 333, 22);
		panel.add(webHookInput);
		webHookInput.setColumns(10);
		
		JLabel webhookInputLabel = new JLabel("Input Webhook");
		webhookInputLabel.setBounds(54, 50, 101, 16);
		panel.add(webhookInputLabel);
		

		JLabel status_Text = new JLabel("Status : Waiting");
		status_Text.setBounds(54, 236, 333, 16);
		panel.add(status_Text);
		
		JButton SendButton = new JButton("Send Message");
		SendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WebhookSender.sendMessage(webHook_NameInput.getText() ,webhook_ProfileInput.getText() ,webHookInput.getText(), message_Input.getText());
				status_Text.setText(WebhookSender.getStatus());
				
			}
		});
		SendButton.setBounds(54, 206, 125, 25);
		panel.add(SendButton);
		
		message_Input = new JTextField();
		message_Input.setBounds(54, 140, 333, 22);
		panel.add(message_Input);
		message_Input.setColumns(10);
		
		JLabel inputMessage_Label = new JLabel("Input Your Message Here");
		inputMessage_Label.setBounds(54, 117, 192, 16);
		panel.add(inputMessage_Label);
		
		JPanel settings_Pane = new JPanel();
		settings_Pane.setBounds(12, 265, 470, 287);
		panel.add(settings_Pane);
		settings_Pane.setLayout(null);
		
		JLabel webhook_Settings_Title = new JLabel("Webhook Settings");
		webhook_Settings_Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		webhook_Settings_Title.setHorizontalAlignment(SwingConstants.CENTER);
		webhook_Settings_Title.setVerticalAlignment(SwingConstants.TOP);
		webhook_Settings_Title.setBounds(0, 0, 470, 24);
		settings_Pane.add(webhook_Settings_Title);
		
		webHook_NameInput = new JTextField();
		webHook_NameInput.setText("Set name here");
		webHook_NameInput.setBounds(10, 48, 122, 22);
		settings_Pane.add(webHook_NameInput);
		webHook_NameInput.setColumns(10);
		
		JLabel webhook_NameText = new JLabel("WebHook Name");
		webhook_NameText.setBounds(10, 25, 97, 16);
		settings_Pane.add(webhook_NameText);
		
		JLabel webHook_ProFile_Text = new JLabel("WebHook  Profile Link");
		webHook_ProFile_Text.setBounds(144, 25, 134, 16);
		settings_Pane.add(webHook_ProFile_Text);
		
		webhook_ProfileInput = new JTextField();
		webhook_ProfileInput.setText("");
		webhook_ProfileInput.setBounds(144, 48, 201, 22);
		settings_Pane.add(webhook_ProfileInput);
		webhook_ProfileInput.setColumns(10);
		
		JLabel setting_Text = new JLabel("WebHook Settings");
		setting_Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		setting_Text.setHorizontalAlignment(SwingConstants.CENTER);
		setting_Text.setVerticalAlignment(SwingConstants.TOP);

	}
}
