package com.czh.abstractfactory;


/**
 * 创建人：菜头君
 *
 * 设计模式名称：抽象工厂模式
 *
 * 设计模式意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 *
 * 适用性：
 *
 * 1、一个系统要独立于它的产品的创建、组合和表示时。
 *
 * 2、一个系统要由多个产品系列中的一个来配置时。
 *
 * 3、当你要强调一系列相关的产品对象的设计以便进行联合使用时。
 *
 * 4、当你提供一个产品类库，而只想显示它们的接口而不是实现时。
 *
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Object object = Class.forName("com.czh.abstractfactory.NiceManFactory").newInstance();
        if(object == null){
            System.out.println("未找到工厂，无法实例化");
        }else if(!(object instanceof PersonFactory)){
            System.out.println("工厂配置错误，无法实例化");
        }else{
            PersonFactory personFactory = (PersonFactory) object;
              Person person = personFactory.createPerson();
            String personAttr = person.getPersonAttr();
            System.out.println("创建的人为:" + personAttr);
        }
    }
}
