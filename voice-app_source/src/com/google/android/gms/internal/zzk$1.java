// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzk

class zzR
    implements Runnable
{

    final String zzQ;
    final long zzR;
    final zzk zzS;

    public void run()
    {
        zzk.zzd(zzS).zza(zzQ, zzR);
        zzk.zzd(zzS).zzd(toString());
    }

    a(zzk zzk1, String s, long l)
    {
        zzS = zzk1;
        zzQ = s;
        zzR = l;
        super();
    }
}
