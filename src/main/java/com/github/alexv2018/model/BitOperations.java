package com.github.alexv2018.model;

import com.github.alexv2018.main.BitOperationsIntf;

/**
 * Created by vendin on 18.10.2017.
 */
public class BitOperations implements BitOperationsIntf {
    private int ID;

    final private int var1;
    final private int var2;


    public BitOperations() {
        var1 = 0x000001;
        var2 = 0x100000;
    }

    public BitOperations(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public int doAnd(int var1, int var2) {
        System.out.println("var1 & var2 " + Integer.toBinaryString(var1 & var2));
        return var1 & var2;
    }

    @Override
    public int doOR(int var1, int var2) {
        System.out.println("var1 | var2 " + Integer.toBinaryString(var1 | var2));
        return var1 | var2;
    }

    @Override
    public int doXor(int var1, int var2) {
        System.out.println("var1 ^ var2 " + Integer.toBinaryString(var1 ^ var2));
        return var1 ^ var2;
    }

    @Override
    public int doNot(int var) {
        System.out.println("~var " + Integer.toBinaryString(~var));
        return ~var;
    }


    @Override
    public int doAnd() {
        return doAnd(var1, var2);
    }

    @Override
    public int doOR() {
        return doOR(var1, var2);
    }

    @Override
    public int doXor() {
        return doXor(var1, var2);
    }

    public int doNotVar1() {
        return doNot(var1);
    }

    public int doNotVar2() {
        return doNot(var2);
    }

    public void setVar1(int var1) {

    }

    public void setVar2(int var2) {

    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
