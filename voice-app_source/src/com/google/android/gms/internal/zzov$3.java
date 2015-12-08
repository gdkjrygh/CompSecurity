// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzov, zzot

static final class a extends a
{

    final Uri zzaGx;
    final zzot zzaGz;
    final Context zzqV;

    public void zza(int i, Bundle bundle, int j, Intent intent)
        throws RemoteException
    {
        zzov.zzb(zzqV, zzaGx);
        zzaGz.zza(i, bundle, j, intent);
    }

    a(Context context, Uri uri, zzot zzot1)
    {
        zzqV = context;
        zzaGx = uri;
        zzaGz = zzot1;
        super();
    }
}
