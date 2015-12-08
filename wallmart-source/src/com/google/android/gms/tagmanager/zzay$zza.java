// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzay

private static final class  extends Enum
{

    public static final zzaQw zzaQu;
    public static final zzaQw zzaQv;
    public static final zzaQw zzaQw;
    private static final zzaQw zzaQx[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
    }

    public static [] values()
    {
        return ([])zzaQx.clone();
    }

    static 
    {
        zzaQu = new <init>("NONE", 0);
        zzaQv = new <init>("URL", 1);
        zzaQw = new <init>("BACKSLASH", 2);
        zzaQx = (new zzaQx[] {
            zzaQu, zzaQv, zzaQw
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
