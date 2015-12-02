// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class ChangeTimeScaleTrack
    implements Track
{

    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/tracks/ChangeTimeScaleTrack.getName());
    List ctts;
    Track source;
    long timeScale;
    List tts;

    public ChangeTimeScaleTrack(Track track, long l, long al[])
    {
        source = track;
        timeScale = l;
        double d = (double)l / (double)track.getTrackMetaData().getTimescale();
        ctts = adjustCtts(track.getCompositionTimeEntries(), d);
        tts = adjustTts(track.getDecodingTimeEntries(), d, al, getTimes(track, al, l));
    }

    static List adjustCtts(List list, double d)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    return arraylist;
                }
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)list.next();
                arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(entry.getCount(), (int)Math.round((double)entry.getOffset() * d)));
            } while (true);
        } else
        {
            return null;
        }
    }

    static List adjustTts(List list, double d, long al[], long al1[])
    {
        LinkedList linkedlist;
        int i;
        long l;
        list = TimeToSampleBox.blowupTimeToSamples(list);
        l = 0L;
        linkedlist = new LinkedList();
        i = 1;
_L2:
        com.coremedia.iso.boxes.TimeToSampleBox.Entry entry;
        long l1;
        if (i > list.length)
        {
            return linkedlist;
        }
        long l2 = Math.round((double)list[i - 1] * d);
        entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.peekLast();
        int j = Arrays.binarySearch(al, i + 1);
        l1 = l2;
        if (j >= 0)
        {
            l1 = l2;
            if (al1[j] != l)
            {
                l1 = al1[j] - (l + l2);
                LOG.finest(String.format("Sample %d %d / %d - correct by %d", new Object[] {
                    Integer.valueOf(i), Long.valueOf(l), Long.valueOf(al1[j]), Long.valueOf(l1)
                }));
                l1 = l2 + l1;
            }
        }
        l += l1;
        if (entry != null)
        {
            break; /* Loop/switch isn't completed */
        }
        linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l1));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (entry.getDelta() != l1)
        {
            linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l1));
        } else
        {
            entry.setCount(entry.getCount() + 1L);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static long[] getTimes(Track track, long al[], long l)
    {
        long al1[] = new long[al.length];
        LinkedList linkedlist = new LinkedList(track.getDecodingTimeEntries());
        int i = 1;
        long l2 = 0L;
        long l3 = 0L;
        int j = 0;
        long l1 = 0L;
        do
        {
            if ((long)i > al[al.length - 1])
            {
                return al1;
            }
            int k = j;
            if ((long)i == al[j])
            {
                al1[j] = (l2 * l) / track.getTrackMetaData().getTimescale();
                k = j + 1;
            }
            if (l1 == 0L)
            {
                com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.poll();
                l1 = entry.getCount() - 1L;
                l3 = entry.getDelta();
            } else
            {
                l1--;
            }
            l2 += l3;
            i++;
            j = k;
        } while (true);
    }

    public List getCompositionTimeEntries()
    {
        return ctts;
    }

    public List getDecodingTimeEntries()
    {
        return tts;
    }

    public String getHandler()
    {
        return source.getHandler();
    }

    public Box getMediaHeaderBox()
    {
        return source.getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return source.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return source.getSampleDescriptionBox();
    }

    public List getSamples()
    {
        return source.getSamples();
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        return source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData()
    {
        TrackMetaData trackmetadata = (TrackMetaData)source.getTrackMetaData().clone();
        trackmetadata.setTimescale(timeScale);
        return trackmetadata;
    }

    public boolean isEnabled()
    {
        return source.isEnabled();
    }

    public boolean isInMovie()
    {
        return source.isInMovie();
    }

    public boolean isInPoster()
    {
        return source.isInPoster();
    }

    public boolean isInPreview()
    {
        return source.isInPreview();
    }

    public String toString()
    {
        return (new StringBuilder("ChangeTimeScaleTrack{source=")).append(source).append('}').toString();
    }

}
