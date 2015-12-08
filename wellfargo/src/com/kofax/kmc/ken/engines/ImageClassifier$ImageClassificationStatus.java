// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;


public final class I extends Enum
{

    public static final ERROR COMPLETE;
    public static final ERROR ERROR;
    public static final ERROR IN_PROGRESS;
    private static final ERROR a[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/kofax/kmc/ken/engines/ImageClassifier$ImageClassificationStatus, s);
    }

    public static I[] values()
    {
        return (I[])a.clone();
    }

    static 
    {
        IN_PROGRESS = new <init>("IN_PROGRESS", 0);
        COMPLETE = new <init>("COMPLETE", 1);
        ERROR = new <init>("ERROR", 2);
        a = (new a[] {
            IN_PROGRESS, COMPLETE, ERROR
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
