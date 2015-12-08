// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;


public final class  extends Enum
{

    public static final NONE IMAGE_CAPTURE;
    public static final NONE IMAGE_PROCESSOR;
    public static final NONE IMAGE_WRITETOFILE;
    public static final NONE NONE;
    private static final NONE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/appstats/AppStatsImageData$ImageSource, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        IMAGE_PROCESSOR = new <init>("IMAGE_PROCESSOR", 0);
        IMAGE_CAPTURE = new <init>("IMAGE_CAPTURE", 1);
        IMAGE_WRITETOFILE = new <init>("IMAGE_WRITETOFILE", 2);
        NONE = new <init>("NONE", 3);
        a = (new a[] {
            IMAGE_PROCESSOR, IMAGE_CAPTURE, IMAGE_WRITETOFILE, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
