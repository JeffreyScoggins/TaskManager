package org.swe6673.notification;

public class NotificationPreferences {

    private String userEmail;
    private boolean optInForEmail;

    public NotificationPreferences(String userEmail) {
        this.userEmail = userEmail;
        this.optInForEmail = true;
    }

    public void setOptInForEmail(boolean optInForEmail) {
        this.optInForEmail = optInForEmail;
    }

    public boolean isOptInForEmail() {
        return this.optInForEmail;
    }

}
