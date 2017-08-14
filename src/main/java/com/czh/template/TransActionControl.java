package com.czh.template;

/**
 * Created by a5453 on 2017-07-31.
 */
public abstract class TransActionControl implements TransAction{

    private TransAationConext context;

    public TransActionControl(TransAationConext context){
        this.context = context;
    }

    public TransAationConext getContext() {
        return context;
    }

    public void run(){
        try{
            reduceMoney(context.getUserA(),context.getMoney());
            addMoney(context.getUserB(),context.getMoney());
        }catch (Exception ex){
            addMoney(context.getUserA(),context.getMoney());
        }
    }
}
