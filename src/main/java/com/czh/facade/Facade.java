package com.czh.facade;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 21:26
 * <p>
 * 描述：门面者
 */
public class Facade {
    private ChargeSystem chargeSystem;

    private MedicalSystem medicalSystem;

    public Facade(){
        chargeSystem = new ChargeSystem();
        medicalSystem = new MedicalSystem();
    }

    public void guide(String sickness,int money){
        chargeSystem.getMoney(money);
        medicalSystem.treat(sickness);
    }
}
