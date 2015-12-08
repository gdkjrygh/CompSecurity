// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzid

class zzrf
    implements Runnable
{

    final zzbd zzrd;
    final String zzrf;

    public void run()
    {
        zzbd.zza(zzrd).loadData(zzrf, "text/html", "UTF-8");
    }

    (zzbd zzbd1, String s)
    {
        zzrd = zzbd1;
        zzrf = s;
        super();
    }
}
