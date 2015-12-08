// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class Flash extends Enum
{

    public static final Flash AUTO;
    public static final Flash OFF;
    public static final Flash ON;
    public static final Flash TORCH;
    private static final Flash a[];

    private Flash(String s, int i)
    {
        super(s, i);
    }

    public static Flash valueOf(String s)
    {
        return (Flash)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/Flash, s);
    }

    public static Flash[] values()
    {
        return (Flash[])a.clone();
    }

    static 
    {
        ON = new Flash("ON", 0);
        OFF = new Flash("OFF", 1);
        AUTO = new Flash("AUTO", 2);
        TORCH = new Flash("TORCH", 3);
        a = (new Flash[] {
            ON, OFF, AUTO, TORCH
        });
    }
}
