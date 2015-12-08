// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

public static final class  extends Enum
{

    public static final zzaQE zzaQC;
    public static final zzaQE zzaQD;
    public static final zzaQE zzaQE;
    private static final zzaQE zzaQF[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
    }

    public static [] values()
    {
        return ([])zzaQF.clone();
    }

    static 
    {
        zzaQC = new <init>("NOT_AVAILABLE", 0);
        zzaQD = new <init>("IO_ERROR", 1);
        zzaQE = new <init>("SERVER_ERROR", 2);
        zzaQF = (new zzaQF[] {
            zzaQC, zzaQD, zzaQE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
