// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


// Referenced classes of package com.google.ads:
//            AdRequest

public static final class  extends Enum
{

    public static final FEMALE FEMALE;
    public static final FEMALE MALE;
    public static final FEMALE UNKNOWN;
    private static final FEMALE zzaJ[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/ads/AdRequest$Gender, s);
    }

    public static [] values()
    {
        return ([])zzaJ.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        MALE = new <init>("MALE", 1);
        FEMALE = new <init>("FEMALE", 2);
        zzaJ = (new zzaJ[] {
            UNKNOWN, MALE, FEMALE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
