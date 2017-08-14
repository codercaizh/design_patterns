package com.czh.template;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by a5453 on 2017-07-31.
 */
public class SimpleTransActionContext extends TransAationConext {

    private Map context = new HashMap<Object,Object>();
    public Object getParameter(Object key) {
        return context.get(key);
    }

    public void setParameter(Object key, Object value) {
        context.put(key,value);
    }
}
