// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.panorama.Panorama;

// Referenced classes of package com.google.android.gms.internal:
//            zzov, zzow, zzou

private static abstract class entKey extends com.google.android.gms.common.api.tKey
{

    protected abstract void zza(Context context, zzou zzou1)
        throws RemoteException;

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zzow)t);
    }

    protected final void zza(zzow zzow1)
        throws RemoteException
    {
        zza(zzow1.getContext(), (zzou)zzow1.zznM());
    }

    protected piClient(GoogleApiClient googleapiclient)
    {
        super(Panorama.zzNX, googleapiclient);
    }
}
