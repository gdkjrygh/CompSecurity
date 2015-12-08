// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzmu, zzmv, zzmw

public class zzmx
{

    public zzmx()
    {
    }

    int zzwn()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public zzmw zzyK()
    {
        if (zzwn() < 8)
        {
            return new zzmu();
        } else
        {
            return new zzmv();
        }
    }
}
