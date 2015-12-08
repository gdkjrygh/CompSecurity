// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


public interface h
{

    public abstract void endRefresh();

    public abstract void onAutoLocateFail(String s);

    public abstract void onDateStyleChange(int i);

    public abstract void onLoadFinish();

    public abstract void onScreenChange(String s);

    public abstract void onTemperatureUnitChange(int i);

    public abstract void onTimeChange(int i, int j);

    public abstract void startRefresh();
}
