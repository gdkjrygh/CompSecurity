// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer, Cast

private class zzSX
    implements zzn
{
    private final class zza
        implements ResultCallback
    {

        private final long zzSY;
        final RemoteMediaPlayer.zza zzSZ;

        public void onResult(Result result)
        {
            zzm((Status)result);
        }

        public void zzm(Status status)
        {
            if (!status.isSuccess())
            {
                RemoteMediaPlayer.zzg(zzSZ.zzSz).zzb(zzSY, status.getStatusCode());
            }
        }

        zza(long l)
        {
            zzSZ = RemoteMediaPlayer.zza.this;
            super();
            zzSY = l;
        }
    }


    private GoogleApiClient zzSW;
    private long zzSX;
    final RemoteMediaPlayer zzSz;

    public void zza(String s, String s1, long l, String s2)
        throws IOException
    {
        if (zzSW == null)
        {
            throw new IOException("No GoogleApiClient available");
        } else
        {
            Cast.CastApi.ge(zzSW, s, s1).setResultCallback(new zza(l));
            return;
        }
    }

    public void zzb(GoogleApiClient googleapiclient)
    {
        zzSW = googleapiclient;
    }

    public long zzlu()
    {
        long l = zzSX + 1L;
        zzSX = l;
        return l;
    }

    public zza.zzSY(RemoteMediaPlayer remotemediaplayer)
    {
        zzSz = remotemediaplayer;
        super();
        zzSX = 0L;
    }
}
