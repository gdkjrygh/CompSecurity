// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb

static final class  extends Enum
{

    public static final zzaRe zzaRc;
    public static final zzaRe zzaRd;
    public static final zzaRe zzaRe;
    private static final zzaRe zzaRf[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
    }

    public static [] values()
    {
        return ([])zzaRf.clone();
    }

    static 
    {
        zzaRc = new <init>("NONE", 0);
        zzaRd = new <init>("CONTAINER", 1);
        zzaRe = new <init>("CONTAINER_DEBUG", 2);
        zzaRf = (new zzaRf[] {
            zzaRc, zzaRd, zzaRe
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
