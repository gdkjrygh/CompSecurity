// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo, MediaMetadata, TextTrackStyle

public static class zzRK
{

    private final MediaInfo zzRK;

    public MediaInfo build()
        throws IllegalArgumentException
    {
        zzRK.zzlq();
        return zzRK;
    }

    public zzRK setContentType(String s)
        throws IllegalArgumentException
    {
        zzRK.setContentType(s);
        return this;
    }

    public ntType setCustomData(JSONObject jsonobject)
    {
        zzRK.setCustomData(jsonobject);
        return this;
    }

    public mData setMediaTracks(List list)
    {
        zzRK.zzj(list);
        return this;
    }

    public zzRK setMetadata(MediaMetadata mediametadata)
    {
        zzRK.zza(mediametadata);
        return this;
    }

    public zzRK setStreamDuration(long l)
        throws IllegalArgumentException
    {
        zzRK.zzx(l);
        return this;
    }

    public zzRK setStreamType(int i)
        throws IllegalArgumentException
    {
        zzRK.setStreamType(i);
        return this;
    }

    public mType setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        zzRK.setTextTrackStyle(texttrackstyle);
        return this;
    }

    public (String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Content ID cannot be empty");
        } else
        {
            zzRK = new MediaInfo(s);
            return;
        }
    }
}
