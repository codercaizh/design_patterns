package com.czh.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 21:02
 * <p>
 * 描述：
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();
    public void addElement(Element element){
        elements.add(element);
    }
    public void accept(Vistor vistor){
        for(Element element : elements){
            element.accept(vistor);
        }
    }

}
