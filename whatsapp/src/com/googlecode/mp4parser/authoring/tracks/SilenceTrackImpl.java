// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SilenceTrackImpl
    implements Track
{

    com.coremedia.iso.boxes.TimeToSampleBox.Entry entry;
    List samples;
    Track source;

    public SilenceTrackImpl(Track track, long l)
    {
        samples = new LinkedList();
        source = track;
        if ("mp4a".equals(track.getSampleDescriptionBox().getSampleEntry().getType()))
        {
            long l1 = (getTrackMetaData().getTimescale() * l) / 1000L / 1024L;
            entry = new com.coremedia.iso.boxes.TimeToSampleBox.Entry(l1, (getTrackMetaData().getTimescale() * l) / l1 / 1000L);
            l = l1;
            do
            {
                if (l <= 0L)
                {
                    return;
                }
                samples.add(new SampleImpl((ByteBuffer)ByteBuffer.wrap(new byte[] {
                    33, 16, 4, 96, -116, 28
                }).rewind()));
                l--;
            } while (true);
        } else
        {
            throw new RuntimeException((new StringBuilder("Tracks of type ")).append(track.getClass().getSimpleName()).append(" are not supported").toString());
        }
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public List getDecodingTimeEntries()
    {
        return Collections.singletonList(entry);
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
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return source.getSampleDescriptionBox();
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return source.getTrackMetaData();
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
}
