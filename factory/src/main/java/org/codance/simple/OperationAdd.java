package org.codance.simple;

/**
 * @author zhaoxg
 * @date 2021/5/13 11:24
 */
public class OperationAdd extends Operation {
    @Override
    public double calculate() {
        return numberA + numberB;
    }
}
