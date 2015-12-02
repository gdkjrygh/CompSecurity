// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class DefaultMp4SampleList extends AbstractList
{

    Container topLevel;
    TrackBox trackBox;

    public DefaultMp4SampleList(long l, Container container)
    {
        trackBox = null;
        topLevel = container;
        container = ((MovieBox)container.getBoxes(com/coremedia/iso/boxes/MovieBox).get(0)).getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            do
            {
                TrackBox trackbox;
                if (!container.hasNext())
                {
                    if (trackBox == null)
                    {
                        throw new RuntimeException((new StringBuilder("This MP4 does not contain track ")).append(l).toString());
                    } else
                    {
                        return;
                    }
                }
                trackbox = (TrackBox)container.next();
            } while (trackbox.getTrackHeaderBox().getTrackId() != l);
            trackBox = trackbox;
        } while (true);
    }

    public Sample get(int i)
    {
        if ((long)i >= trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount())
        {
            throw new IndexOutOfBoundsException();
        }
        Object obj = trackBox.getSampleTableBox().getSampleToChunkBox().getEntries().iterator();
        com.coremedia.iso.boxes.SampleToChunkBox.Entry entry = (com.coremedia.iso.boxes.SampleToChunkBox.Entry)((Iterator) (obj)).next();
        long l6 = 0L;
        long l5 = 0L;
        long l3 = entry.getFirstChunk();
        long l = entry.getSamplesPerChunk();
        boolean flag = true;
        int k = i + 1;
        i = ((flag) ? 1 : 0);
        do
        {
            long l7 = l6 + 1L;
            long l4 = l5;
            long l1 = l3;
            long l2 = l;
            int j;
            if (l7 == l3)
            {
                if (((Iterator) (obj)).hasNext())
                {
                    com.coremedia.iso.boxes.SampleToChunkBox.Entry entry1 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry)((Iterator) (obj)).next();
                    l2 = entry1.getSamplesPerChunk();
                    l1 = entry1.getFirstChunk();
                    l4 = l;
                } else
                {
                    l2 = -1L;
                    l1 = 0x7fffffffffffffffL;
                    l4 = l;
                }
            }
            j = (int)((long)i + l4);
            l6 = l7;
            i = j;
            l5 = l4;
            l3 = l1;
            l = l2;
        } while (j <= k);
        i = (int)((long)j - l4);
        l = trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets()[CastUtils.l2i(l7 - 1L)];
        obj = trackBox.getSampleTableBox().getSampleSizeBox();
        do
        {
            if (i >= k)
            {
                try
                {
                    obj = new SampleImpl(topLevel.getByteBuffer(l, ((SampleSizeBox) (obj)).getSampleSizeAtIndex(i - 1)));
                }
                catch (IOException ioexception)
                {
                    return null;
                }
                return ((Sample) (obj));
            }
            l += ((SampleSizeBox) (obj)).getSampleSizeAtIndex(i - 1);
            i++;
        } while (true);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        return CastUtils.l2i(trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
