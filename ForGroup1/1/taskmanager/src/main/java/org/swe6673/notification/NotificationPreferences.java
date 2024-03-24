package org.swe6673.notification;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NotificationPreferences {

    private List<String> users = new ArrayList<>();
    private List<Boolean> optInForEmail = new ArrayList<>();


    public NotificationPreferences() {


    }

    public void setNotificationPreferences(String userEmail, boolean optInForEmail){
        this.users.add(userEmail);
        this.optInForEmail.add(optInForEmail);
    }

    public void setOptInForEmail(String userEmail, boolean optInForEmail) {
        for (int i = 0; i < this.users.size(); i++) {
            if (Objects.equals(this.users.get(i), userEmail)) {
                System.out.println(this.optInForEmail.get(i));
            }
        }
    }

    public boolean isOptInForEmail(String userEmail){
        boolean optInForEmail = false;
            for (int i = 0; i < this.users.size(); i++) {
                if (Objects.equals(this.users.get(i), userEmail)) {
                    optInForEmail = this.optInForEmail.get(i);
                    break;
                }
            }
            return optInForEmail;
        }

}
