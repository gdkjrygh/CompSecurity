// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


public final class TransmissionMode extends Enum
{

    public static final TransmissionMode DEFAULT;
    public static final TransmissionMode DISABLED;
    public static final TransmissionMode NEVER;
    public static final TransmissionMode PIGGYBACK;
    public static final TransmissionMode WIFIONLY;
    private static final TransmissionMode a[];

    private TransmissionMode(String s, int i)
    {
        super(s, i);
    }

    public static TransmissionMode valueOf(String s)
    {
        return (TransmissionMode)Enum.valueOf(com/comscore/utils/TransmissionMode, s);
    }

    public static TransmissionMode[] values()
    {
        return (TransmissionMode[])a.clone();
    }

    static 
    {
        DEFAULT = new TransmissionMode("DEFAULT", 0);
        NEVER = new TransmissionMode("NEVER", 1);
        WIFIONLY = new TransmissionMode("WIFIONLY", 2);
        PIGGYBACK = new TransmissionMode("PIGGYBACK", 3);
        DISABLED = new TransmissionMode("DISABLED", 4);
        a = (new TransmissionMode[] {
            DEFAULT, NEVER, WIFIONLY, PIGGYBACK, DISABLED
        });
    }
}
