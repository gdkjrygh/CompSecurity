// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class zzSz extends zzm
{

    final RemoteMediaPlayer zzSz;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.zzb(zzSz);
    }

    protected void onPreloadStatusUpdated()
    {
        RemoteMediaPlayer.zzd(zzSz);
    }

    protected void onQueueStatusUpdated()
    {
        RemoteMediaPlayer.zzc(zzSz);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.zza(zzSz);
    }

    (RemoteMediaPlayer remotemediaplayer, String s)
    {
        zzSz = remotemediaplayer;
        super(s);
    }
}
