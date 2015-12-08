// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqh

class zzOn
    implements Runnable
{

    final byte zzOn[];
    final String zzaPO;
    final zzqh zzaPS;

    public void run()
    {
        zzaPS.zzf(zzaPO, zzOn);
    }

    (zzqh zzqh1, String s, byte abyte0[])
    {
        zzaPS = zzqh1;
        zzaPO = s;
        zzOn = abyte0;
        super();
    }
}
