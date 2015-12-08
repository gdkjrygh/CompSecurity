// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzay

private static final class  extends Enum
{

    public static final zzaMc zzaMa;
    public static final zzaMc zzaMb;
    public static final zzaMc zzaMc;
    private static final zzaMc zzaMd[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
    }

    public static [] values()
    {
        return ([])zzaMd.clone();
    }

    static 
    {
        zzaMa = new <init>("NONE", 0);
        zzaMb = new <init>("URL", 1);
        zzaMc = new <init>("BACKSLASH", 2);
        zzaMd = (new zzaMd[] {
            zzaMa, zzaMb, zzaMc
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
