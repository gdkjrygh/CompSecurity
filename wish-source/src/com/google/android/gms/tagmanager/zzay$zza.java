// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzay

private static final class  extends Enum
{

    public static final zzaDO zzaDM;
    public static final zzaDO zzaDN;
    public static final zzaDO zzaDO;
    private static final zzaDO zzaDP[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/tagmanager/zzay$zza, s);
    }

    public static [] values()
    {
        return ([])zzaDP.clone();
    }

    static 
    {
        zzaDM = new <init>("NONE", 0);
        zzaDN = new <init>("URL", 1);
        zzaDO = new <init>("BACKSLASH", 2);
        zzaDP = (new zzaDP[] {
            zzaDM, zzaDN, zzaDO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
