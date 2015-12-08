// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqx

public static final class  extends Enum
{

    public static final zzaUs zzaUq;
    public static final zzaUs zzaUr;
    public static final zzaUs zzaUs;
    private static final zzaUs zzaUt[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzqx$zza, s);
    }

    public static [] values()
    {
        return ([])zzaUt.clone();
    }

    static 
    {
        zzaUq = new <init>("NOT_AVAILABLE", 0);
        zzaUr = new <init>("IO_ERROR", 1);
        zzaUs = new <init>("SERVER_ERROR", 2);
        zzaUt = (new zzaUt[] {
            zzaUq, zzaUr, zzaUs
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
