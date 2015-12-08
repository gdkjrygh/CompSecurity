// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzip

class zzrr
    implements Runnable
{

    final String zzrr;
    final zzbd zzrw;

    public void run()
    {
        zzbd.zza(zzrw).loadUrl(zzrr);
    }

    (zzbd zzbd1, String s)
    {
        zzrw = zzbd1;
        zzrr = s;
        super();
    }
}
