// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzip

class zzry
    implements Runnable
{

    final zzbd zzrw;
    final String zzry;

    public void run()
    {
        zzbd.zza(zzrw).loadData(zzry, "text/html", "UTF-8");
    }

    (zzbd zzbd1, String s)
    {
        zzrw = zzbd1;
        zzry = s;
        super();
    }
}
