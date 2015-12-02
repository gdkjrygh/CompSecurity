// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Track, TrackMetaData

public class Movie
{

    Matrix matrix;
    List tracks;

    public Movie()
    {
        matrix = Matrix.ROTATE_0;
        tracks = new LinkedList();
    }

    public static long gcd(long l, long l1)
    {
        if (l1 == 0L)
        {
            return l;
        } else
        {
            return gcd(l1, l % l1);
        }
    }

    public void addTrack(Track track)
    {
        if (getTrackByTrackId(track.getTrackMetaData().getTrackId()) != null)
        {
            track.getTrackMetaData().setTrackId(getNextTrackId());
        }
        tracks.add(track);
    }

    public Matrix getMatrix()
    {
        return matrix;
    }

    public long getNextTrackId()
    {
        long l = 0L;
        Iterator iterator = tracks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l + 1L;
            }
            Track track = (Track)iterator.next();
            long l1 = l;
            if (l < track.getTrackMetaData().getTrackId())
            {
                l1 = track.getTrackMetaData().getTrackId();
            }
            l = l1;
        } while (true);
    }

    public long getTimescale()
    {
        long l = ((Track)getTracks().iterator().next()).getTrackMetaData().getTimescale();
        Iterator iterator = getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l = gcd(((Track)iterator.next()).getTrackMetaData().getTimescale(), l);
        } while (true);
    }

    public Track getTrackByTrackId(long l)
    {
        Iterator iterator = tracks.iterator();
        Track track;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            track = (Track)iterator.next();
        } while (track.getTrackMetaData().getTrackId() != l);
        return track;
    }

    public List getTracks()
    {
        return tracks;
    }

    public void setMatrix(Matrix matrix1)
    {
        matrix = matrix1;
    }

    public void setTracks(List list)
    {
        tracks = list;
    }

    public String toString()
    {
        String s = "Movie{ ";
        Iterator iterator = tracks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (new StringBuilder(String.valueOf(s))).append('}').toString();
            }
            Track track = (Track)iterator.next();
            s = (new StringBuilder(String.valueOf(s))).append("track_").append(track.getTrackMetaData().getTrackId()).append(" (").append(track.getHandler()).append(") ").toString();
        } while (true);
    }
}
