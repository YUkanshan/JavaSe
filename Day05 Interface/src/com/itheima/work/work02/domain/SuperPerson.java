package com.itheima.work.work02.domain;
/*定义人(Person)类,人类中有吃饭方法（eat）和工作方法（work）。
定义超人（SuperMan）类，超人类中有救人方法（save）并且超人也属于人类。
要求：使用多态的方式创建超人对象，调用吃饭和工作的方法。再将此对象转为超人对象，调用救人的方法。
 */
public class SuperPerson extends Person {
    public void save(){
        System.out.println("我是超人,我要救人");
    }
}
