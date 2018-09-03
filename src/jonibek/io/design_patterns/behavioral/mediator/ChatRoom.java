package jonibek.io.design_patterns.behavioral.mediator;

import java.util.Date;

class ChatRoom {
    static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
