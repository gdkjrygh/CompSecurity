// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqn

public static final class  extends Enum
{

    public static final zzaPY zzaPW;
    public static final zzaPY zzaPX;
    public static final zzaPY zzaPY;
    private static final zzaPY zzaPZ[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/internal/zzqn$zza, s);
    }

    public static [] values()
    {
        return ([])zzaPZ.clone();
    }

    static 
    {
        zzaPW = new <init>("NOT_AVAILABLE", 0);
        zzaPX = new <init>("IO_ERROR", 1);
        zzaPY = new <init>("SERVER_ERROR", 2);
        zzaPZ = (new zzaPZ[] {
            zzaPW, zzaPX, zzaPY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
