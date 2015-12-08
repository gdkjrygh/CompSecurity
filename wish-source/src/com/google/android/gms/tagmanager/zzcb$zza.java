// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb

static final class  extends Enum
{

    public static final zzaEw zzaEu;
    public static final zzaEw zzaEv;
    public static final zzaEw zzaEw;
    private static final zzaEw zzaEx[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
    }

    public static [] values()
    {
        return ([])zzaEx.clone();
    }

    static 
    {
        zzaEu = new <init>("NONE", 0);
        zzaEv = new <init>("CONTAINER", 1);
        zzaEw = new <init>("CONTAINER_DEBUG", 2);
        zzaEx = (new zzaEx[] {
            zzaEu, zzaEv, zzaEw
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
