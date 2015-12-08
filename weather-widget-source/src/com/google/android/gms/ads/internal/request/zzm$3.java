// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

class zzEB
    implements Runnable
{

    final zzm zzEB;

    public void run()
    {
        if (zzm.zzb(zzEB) != null)
        {
            zzm.zzb(zzEB).release();
            zzm.zza(zzEB, null);
        }
    }

    (zzm zzm1)
    {
        zzEB = zzm1;
        super();
    }
}
