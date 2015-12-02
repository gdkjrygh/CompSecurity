// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentedMp4Builder

class val.cycle
    implements Comparator
{

    final FragmentedMp4Builder this$0;
    private final int val$cycle;
    private final Map val$intersectionMap;

    public int compare(Track track, Track track1)
    {
        long al[];
        long al1[];
        int i;
        long l;
        long l1;
        long l2;
        long l3;
        l3 = ((long[])val$intersectionMap.get(track))[val$cycle];
        l2 = ((long[])val$intersectionMap.get(track1))[val$cycle];
        al = TimeToSampleBox.blowupTimeToSamples(track.getDecodingTimeEntries());
        al1 = TimeToSampleBox.blowupTimeToSamples(track1.getDecodingTimeEntries());
        l = 0L;
        l1 = 0L;
        i = 1;
_L3:
        if ((long)i < l3) goto _L2; else goto _L1
_L1:
        i = 1;
_L4:
        if ((long)i >= l2)
        {
            return (int)(((double)l / (double)track.getTrackMetaData().getTimescale() - (double)l1 / (double)track1.getTrackMetaData().getTimescale()) * 100D);
        }
        break MISSING_BLOCK_LABEL_146;
_L2:
        l += al[i - 1];
        i++;
          goto _L3
        l1 += al1[i - 1];
        i++;
          goto _L4
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Track)obj, (Track)obj1);
    }

    ()
    {
        this$0 = final_fragmentedmp4builder;
        val$intersectionMap = map;
        val$cycle = I.this;
        super();
    }
}
