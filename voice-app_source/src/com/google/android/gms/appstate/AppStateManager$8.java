// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.zzjb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class e extends e
{

    final int zzOm;
    final String zzOp;
    final byte zzOq[];

    protected volatile void zza(com.google.android.gms.common.api.<init> <init>1)
        throws RemoteException
    {
        zza((zzjb)<init>1);
    }

    protected void zza(zzjb zzjb1)
        throws RemoteException
    {
        zzjb1.zza(this, zzOm, zzOp, zzOq);
    }

    e(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        zzOm = i;
        zzOp = s;
        zzOq = abyte0;
        super(googleapiclient);
    }
}
