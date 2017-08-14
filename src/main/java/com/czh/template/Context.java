package com.czh.template;

/**
 * Created by a5453 on 2017-07-31.
 */
public interface Context {
    Object getParameter(Object key);

    void setParameter(Object key, Object value);
}
