// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzk

public static final class  extends Enum
{

    public static final zzW zzT;
    public static final zzW zzU;
    public static final zzW zzV;
    public static final zzW zzW;
    private static final zzW zzX[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzk$zza, s);
    }

    public static [] values()
    {
        return ([])zzX.clone();
    }

    static 
    {
        zzT = new <init>("LOW", 0);
        zzU = new <init>("NORMAL", 1);
        zzV = new <init>("HIGH", 2);
        zzW = new <init>("IMMEDIATE", 3);
        zzX = (new zzX[] {
            zzT, zzU, zzV, zzW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
