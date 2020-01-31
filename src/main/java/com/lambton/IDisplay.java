package com.lambton;

public interface IDisplay
{
    void display();

    //After some years if there is any requirement for new method which will be used by new different classes and programmer don't want to change existing classes then method can be added with default keyword
    default void print(){

    }
}
