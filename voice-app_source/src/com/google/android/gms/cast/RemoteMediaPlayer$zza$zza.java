// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class zzSY
    implements ResultCallback
{

    private final long zzSY;
    final  zzSZ;

    public void onResult(Result result)
    {
        zzm((Status)result);
    }

    public void zzm(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.zzg(zzSZ.).zzb(zzSY, status.getStatusCode());
        }
    }

    ( , long l)
    {
        zzSZ = ;
        super();
        zzSY = l;
    }
}
