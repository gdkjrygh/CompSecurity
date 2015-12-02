// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            SyncSampleIntersectFinderImpl

public static class movie
{

    Movie movie;
    Track track;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (movie)obj;
            if (movie == null ? ((movie) (obj)).movie != null : !movie.equals(((movie) (obj)).movie))
            {
                return false;
            }
            if (track == null ? ((track) (obj)).track != null : !track.equals(((track) (obj)).track))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (track != null)
        {
            i = track.hashCode();
        } else
        {
            i = 0;
        }
        if (movie != null)
        {
            j = movie.hashCode();
        }
        return i * 31 + j;
    }

    public Y(Track track1, Movie movie1)
    {
        track = track1;
        movie = movie1;
    }
}
