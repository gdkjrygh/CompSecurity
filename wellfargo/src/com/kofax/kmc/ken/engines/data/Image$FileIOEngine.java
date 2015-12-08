// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;


public final class  extends Enum
{

    private static final FILE_ENG_ANDROID $VALUES[];
    public static final FILE_ENG_ANDROID FILE_ENG_ANDROID;
    public static final FILE_ENG_ANDROID FILE_ENG_KFIL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/ken/engines/data/Image$FileIOEngine, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FILE_ENG_KFIL = new <init>("FILE_ENG_KFIL", 0);
        FILE_ENG_ANDROID = new <init>("FILE_ENG_ANDROID", 1);
        $VALUES = (new .VALUES[] {
            FILE_ENG_KFIL, FILE_ENG_ANDROID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
