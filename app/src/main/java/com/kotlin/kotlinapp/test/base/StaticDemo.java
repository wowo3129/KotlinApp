package com.kotlin.kotlinapp.test.base;

public class StaticDemo {
    /**
     * 非静态内部类默认持有外部类的引用,因此需要使用外部类的实例对象里去创建非静态内部类
     */
    class InnerClass {

    }

    public static void main(String[] args) {
        InnerClass innerClass = new StaticDemo().new InnerClass();
    }
}
