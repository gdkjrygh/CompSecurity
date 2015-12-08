// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqe

public static final class  extends Enum
{

    public static final zzaPw zzaPu;
    public static final zzaPw zzaPv;
    public static final zzaPw zzaPw;
    private static final zzaPw zzaPx[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzqe$zza$zza, s);
    }

    public static [] values()
    {
        return ([])zzaPx.clone();
    }

    static 
    {
        zzaPu = new <init>("NETWORK", 0);
        zzaPv = new <init>("DISK", 1);
        zzaPw = new <init>("DEFAULT", 2);
        zzaPx = (new zzaPx[] {
            zzaPu, zzaPv, zzaPw
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
