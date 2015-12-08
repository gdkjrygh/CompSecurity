// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaQueueItem, MediaInfo

public static class zzRZ
{

    private final MediaQueueItem zzRZ;

    public MediaQueueItem build()
    {
        zzRZ.zzlq();
        return zzRZ;
    }

    public zzRZ clearItemId()
    {
        zzRZ.zzaC(0);
        return this;
    }

    public zzRZ setActiveTrackIds(long al[])
    {
        zzRZ.zza(al);
        return this;
    }

    public zzRZ setAutoplay(boolean flag)
    {
        zzRZ.zzP(flag);
        return this;
    }

    public zzRZ setCustomData(JSONObject jsonobject)
    {
        zzRZ.setCustomData(jsonobject);
        return this;
    }

    public mData setPreloadTime(double d)
        throws IllegalArgumentException
    {
        zzRZ.zzc(d);
        return this;
    }

    public zzRZ setStartTime(double d)
        throws IllegalArgumentException
    {
        zzRZ.zzb(d);
        return this;
    }

    public (MediaInfo mediainfo)
        throws IllegalArgumentException
    {
        zzRZ = new MediaQueueItem(mediainfo, null);
    }

    public zzRZ(MediaQueueItem mediaqueueitem)
        throws IllegalArgumentException
    {
        zzRZ = new MediaQueueItem(mediaqueueitem, null);
    }

    public zzRZ(JSONObject jsonobject)
        throws JSONException
    {
        zzRZ = new MediaQueueItem(jsonobject);
    }
}
