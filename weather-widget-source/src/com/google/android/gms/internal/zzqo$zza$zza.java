// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqo

public static final class  extends Enum
{

    public static final zzaTQ zzaTO;
    public static final zzaTQ zzaTP;
    public static final zzaTQ zzaTQ;
    private static final zzaTQ zzaTR[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzqo$zza$zza, s);
    }

    public static [] values()
    {
        return ([])zzaTR.clone();
    }

    static 
    {
        zzaTO = new <init>("NETWORK", 0);
        zzaTP = new <init>("DISK", 1);
        zzaTQ = new <init>("DEFAULT", 2);
        zzaTR = (new zzaTR[] {
            zzaTO, zzaTP, zzaTQ
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
