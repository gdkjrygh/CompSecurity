// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzat, zzcu, zzau, zzas

class zzwJ
    implements Runnable
{

    final zzas zzaLR;
    final long zzaLS;
    final zzat zzaLT;
    final String zzwJ;

    public void run()
    {
        if (zzat.zza(zzaLT) == null)
        {
            zzcu zzcu1 = zzcu.zzzz();
            zzcu1.zza(zzat.zzb(zzaLT), zzaLR);
            zzat.zza(zzaLT, zzcu1.zzzC());
        }
        zzat.zza(zzaLT).zzg(zzaLS, zzwJ);
    }

    (zzat zzat1, zzas zzas, long l, String s)
    {
        zzaLT = zzat1;
        zzaLR = zzas;
        zzaLS = l;
        zzwJ = s;
        super();
    }
}
