// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzms

class zzKl
    implements Runnable
{

    final byte zzKl[];
    final String zzaHA;
    final zzms zzaHE;

    public void run()
    {
        zzaHE.zzf(zzaHA, zzKl);
    }

    (zzms zzms1, String s, byte abyte0[])
    {
        zzaHE = zzms1;
        zzaHA = s;
        zzKl = abyte0;
        super();
    }
}
