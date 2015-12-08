// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqr

class zzQu
    implements Runnable
{

    final byte zzQu[];
    final String zzaUi;
    final zzqr zzaUm;

    public void run()
    {
        zzaUm.zzf(zzaUi, zzQu);
    }

    (zzqr zzqr1, String s, byte abyte0[])
    {
        zzaUm = zzqr1;
        zzaUi = s;
        zzQu = abyte0;
        super();
    }
}
