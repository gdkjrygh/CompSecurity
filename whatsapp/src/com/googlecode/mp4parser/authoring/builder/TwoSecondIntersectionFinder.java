// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentIntersectionFinder

public class TwoSecondIntersectionFinder
    implements FragmentIntersectionFinder
{

    private int fragmentLength;

    public TwoSecondIntersectionFinder()
    {
        fragmentLength = 2;
    }

    public TwoSecondIntersectionFinder(int i)
    {
        fragmentLength = 2;
        fragmentLength = i;
    }

    protected long getDuration(Track track)
    {
        long l = 0L;
        track = track.getDecodingTimeEntries().iterator();
        do
        {
            if (!track.hasNext())
            {
                return l;
            }
            com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)track.next();
            l += entry.getCount() * entry.getDelta();
        } while (true);
    }

    public long[] sampleNumbers(Track track, Movie movie)
    {
        double d;
        Object obj;
        obj = track.getDecodingTimeEntries();
        d = 0.0D;
        movie = movie.getTracks().iterator();
_L5:
        if (movie.hasNext()) goto _L2; else goto _L1
_L1:
        int k;
        long l1;
        k = (int)Math.ceil(d / (double)fragmentLength) - 1;
        int i = k;
        if (k < 1)
        {
            i = 1;
        }
        movie = new long[i];
        Arrays.fill(movie, -1L);
        movie[0] = 1L;
        l1 = 0L;
        k = 0;
        obj = ((List) (obj)).iterator();
_L7:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        int j;
        l1 = k + 1;
        j = movie.length - 1;
_L10:
        if (j < 0)
        {
            return movie;
        }
        break MISSING_BLOCK_LABEL_277;
_L2:
        Track track1 = (Track)movie.next();
        double d1 = getDuration(track1) / track1.getTrackMetaData().getTimescale();
        if (d < d1)
        {
            d = d1;
        }
          goto _L5
_L4:
        com.coremedia.iso.boxes.TimeToSampleBox.Entry entry;
        int l;
        long l2;
        entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)((Iterator) (obj)).next();
        l = 0;
        l2 = l1;
        j = k;
_L9:
        k = j;
        l1 = l2;
        if ((long)l >= entry.getCount()) goto _L7; else goto _L6
_L6:
        int i1;
        i1 = (int)(l2 / track.getTrackMetaData().getTimescale() / (long)fragmentLength) + 1;
        k = j;
        l1 = l2;
        if (i1 >= movie.length) goto _L7; else goto _L8
_L8:
        movie[i1] = j + 1;
        l2 += entry.getDelta();
        l++;
        j++;
          goto _L9
        if (movie[j] == -1L)
        {
            movie[j] = l1;
        }
        l1 = movie[j];
        j--;
          goto _L10
    }
}
