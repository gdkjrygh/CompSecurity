// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class PageDetectMode extends Enum
{

    public static final PageDetectMode AUTOMATIC;
    public static final PageDetectMode CONTINUOUS;
    public static final PageDetectMode OFF;
    private static final PageDetectMode a[];

    private PageDetectMode(String s, int i)
    {
        super(s, i);
    }

    public static PageDetectMode valueOf(String s)
    {
        return (PageDetectMode)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/PageDetectMode, s);
    }

    public static PageDetectMode[] values()
    {
        return (PageDetectMode[])a.clone();
    }

    static 
    {
        OFF = new PageDetectMode("OFF", 0);
        AUTOMATIC = new PageDetectMode("AUTOMATIC", 1);
        CONTINUOUS = new PageDetectMode("CONTINUOUS", 2);
        a = (new PageDetectMode[] {
            OFF, AUTOMATIC, CONTINUOUS
        });
    }
}
