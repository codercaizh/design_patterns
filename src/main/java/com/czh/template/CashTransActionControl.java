package com.czh.template;
import java.util.Map;
/**
 * Created by a5453 on 2017-07-31.
 */
public class CashTransActionControl extends TransActionControl {

    public CashTransActionControl(Context context) {
        super((TransAationConext) context);
    }

    public void reduceMoney(int user, int money) {
        Map account = (Map) getContext().getParameter("Account");
        int userMoney = (Integer) account.get(user);
        int result = userMoney - money;
        account.put(user,result);
    }

    public void addMoney(int user, int money) {
        Map account = (Map) getContext().getParameter("Account");
        int userMoney = (Integer) account.get(user );
        int result = userMoney + money;
        account.put(user,result);
    }
}
