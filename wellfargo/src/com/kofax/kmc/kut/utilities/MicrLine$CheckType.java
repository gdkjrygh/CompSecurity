// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;


public final class  extends Enum
{

    public static final BUSINESS_CHECK BUSINESS_CHECK;
    public static final BUSINESS_CHECK NONE;
    public static final BUSINESS_CHECK PERSONAL_CHECK;
    private static final BUSINESS_CHECK a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/kofax/kmc/kut/utilities/MicrLine$CheckType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        PERSONAL_CHECK = new <init>("PERSONAL_CHECK", 1);
        BUSINESS_CHECK = new <init>("BUSINESS_CHECK", 2);
        a = (new a[] {
            NONE, PERSONAL_CHECK, BUSINESS_CHECK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
