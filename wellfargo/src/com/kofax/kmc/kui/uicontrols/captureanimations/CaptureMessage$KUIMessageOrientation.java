// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;


public final class Y extends Enum
{

    public static final UNKNOWN LANDSCAPE;
    public static final UNKNOWN PORTRAIT;
    public static final UNKNOWN REVERSELANDSCAPE;
    public static final UNKNOWN REVERSEPORTRAIT;
    public static final UNKNOWN UNKNOWN;
    private static final UNKNOWN a[];

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/kofax/kmc/kui/uicontrols/captureanimations/CaptureMessage$KUIMessageOrientation, s);
    }

    public static Y[] values()
    {
        return (Y[])a.clone();
    }

    static 
    {
        PORTRAIT = new <init>("PORTRAIT", 0);
        LANDSCAPE = new <init>("LANDSCAPE", 1);
        REVERSEPORTRAIT = new <init>("REVERSEPORTRAIT", 2);
        REVERSELANDSCAPE = new <init>("REVERSELANDSCAPE", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        a = (new a[] {
            PORTRAIT, LANDSCAPE, REVERSEPORTRAIT, REVERSELANDSCAPE, UNKNOWN
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
