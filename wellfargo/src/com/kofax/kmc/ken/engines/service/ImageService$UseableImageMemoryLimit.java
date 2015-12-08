// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;


public final class  extends Enum
{

    public static final MAXIMUM LARGE;
    public static final MAXIMUM MAXIMUM;
    public static final MAXIMUM NORMAL;
    private static final MAXIMUM a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/service/ImageService$UseableImageMemoryLimit, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        LARGE = new <init>("LARGE", 1);
        MAXIMUM = new <init>("MAXIMUM", 2);
        a = (new a[] {
            NORMAL, LARGE, MAXIMUM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
