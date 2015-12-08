// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;


public final class  extends Enum
{

    public static final JPEG JPEG;
    public static final JPEG PNG;
    private static final JPEG a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/service/ImageService$InterimImageFileFormat, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        PNG = new <init>("PNG", 0);
        JPEG = new <init>("JPEG", 1);
        a = (new a[] {
            PNG, JPEG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
