// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class GuidingLine extends Enum
{

    public static final GuidingLine LANDSCAPE;
    public static final GuidingLine OFF;
    public static final GuidingLine PORTRAIT;
    private static final GuidingLine a[];

    private GuidingLine(String s, int i)
    {
        super(s, i);
    }

    public static GuidingLine valueOf(String s)
    {
        return (GuidingLine)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/GuidingLine, s);
    }

    public static GuidingLine[] values()
    {
        return (GuidingLine[])a.clone();
    }

    static 
    {
        OFF = new GuidingLine("OFF", 0);
        LANDSCAPE = new GuidingLine("LANDSCAPE", 1);
        PORTRAIT = new GuidingLine("PORTRAIT", 2);
        a = (new GuidingLine[] {
            OFF, LANDSCAPE, PORTRAIT
        });
    }
}
