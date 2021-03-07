package Modyfikatory_Dostępu.Example1.package2;

import Modyfikatory_Dostępu.Example1.package1.BasicClass;

public class OtherClass extends BasicClass {

    public OtherClass(){ //musi być publiczny żeby był widoczny w innym pakiecie!
        name = "OtherClass";
        this.setName("OtherClass");
    }

}
