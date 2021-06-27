package notthatuwu.webhooksender;

import java.io.IOException;

import notthatuwu.webhooksender.Webhook.Webhooks;

public class WebhookSender {
		
	public static String status;
	
	public static void sendMessage(String username, String avatarUrl,String webhookLink, String message) {
	    Webhooks webhook = new Webhooks(webhookLink);
	    webhook.setUsername(username);
	    webhook.setAvatarUrl(avatarUrl);
		webhook.setContent(message);
		try {
			setStatus("Status : Sending");
			webhook.execute();
			setStatus("Status : Sending Complete");
		} catch (IOException e) {
			setStatus("Status : Sending Error");
		}
	}

	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		WebhookSender.status = status;
	}
	


}
