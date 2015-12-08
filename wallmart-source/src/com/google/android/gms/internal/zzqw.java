// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqt, zzqu, zzqv

public class zzqw
{

    public zzqw()
    {
    }

    public zzqv zzBW()
    {
        if (zzzz() < 8)
        {
            return new zzqt();
        } else
        {
            return new zzqu();
        }
    }

    int zzzz()
    {
        return android.os.Build.VERSION.SDK_INT;
    }
}
