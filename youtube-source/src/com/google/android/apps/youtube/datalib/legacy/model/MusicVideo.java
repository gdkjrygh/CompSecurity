// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;

public final class MusicVideo
    implements Serializable
{

    public final String artistId;
    public final String artistName;
    public final int duration;
    private volatile int hashCode;
    public final String trackName;
    public final String videoId;

    public MusicVideo(String s, String s1, String s2, String s3, int i)
    {
        videoId = (String)c.a(s);
        artistId = (String)c.a(s1);
        artistName = (String)c.a(s2);
        trackName = (String)c.a(s3);
        duration = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MusicVideo))
            {
                return false;
            }
            obj = (MusicVideo)obj;
            if (!videoId.equals(((MusicVideo) (obj)).videoId) || !artistId.equals(((MusicVideo) (obj)).artistId) || !artistName.equals(((MusicVideo) (obj)).artistName) || !trackName.equals(((MusicVideo) (obj)).trackName) || duration != ((MusicVideo) (obj)).duration)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            i = ((((videoId.hashCode() + 527) * 31 + artistId.hashCode()) * 31 + artistName.hashCode()) * 31 + trackName.hashCode()) * 31 + duration;
            hashCode = i;
        }
        return i;
    }

    public final String toString()
    {
        return (new StringBuilder("MusicVideo{")).append(Integer.toHexString(System.identityHashCode(this))).append(" videoId=").append(videoId).append(" artistId=").append(artistId).append(" artistName=").append(artistName).append(" trackName=").append(trackName).append(" duration=").append(duration).append("}").toString();
    }
}
