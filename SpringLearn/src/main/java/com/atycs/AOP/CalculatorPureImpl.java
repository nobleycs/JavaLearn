package com.atycs.AOP;

import org.springframework.stereotype.Component;

@Component
public class CalculatorPureImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;
        System.out.println("结果：" + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;
        System.out.println("结果：" + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;
        System.out.println("结果：" + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;
        System.out.println("结果：" + result);

        return result;
    }
}
