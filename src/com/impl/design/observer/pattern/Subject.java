package com.impl.design.observer.pattern;

public interface Subject 
{
public void addObserver(Observerer o);
public void removeObserver(Observerer o);
public void notifyAllObservers();
}
