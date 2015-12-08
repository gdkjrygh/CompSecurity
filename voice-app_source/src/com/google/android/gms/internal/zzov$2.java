// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzov, zzou

class eApiClient extends a
{

    final Uri zzaGx;
    final zzov zzaGy;

    protected void zza(Context context, zzou zzou)
        throws RemoteException
    {
        zzov.zzb(context, zzou, new b(this), zzaGx, null);
    }

    eApiClient(zzov zzov1, GoogleApiClient googleapiclient, Uri uri)
    {
        zzaGy = zzov1;
        zzaGx = uri;
        super(googleapiclient);
    }
}
