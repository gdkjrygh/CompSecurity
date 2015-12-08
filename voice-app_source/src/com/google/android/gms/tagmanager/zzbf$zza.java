// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

public static final class  extends Enum
{

    public static final zzaMk zzaMi;
    public static final zzaMk zzaMj;
    public static final zzaMk zzaMk;
    private static final zzaMk zzaMl[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
    }

    public static [] values()
    {
        return ([])zzaMl.clone();
    }

    static 
    {
        zzaMi = new <init>("NOT_AVAILABLE", 0);
        zzaMj = new <init>("IO_ERROR", 1);
        zzaMk = new <init>("SERVER_ERROR", 2);
        zzaMl = (new zzaMl[] {
            zzaMi, zzaMj, zzaMk
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
