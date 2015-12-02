// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

public class ReplaceSampleTrack extends AbstractTrack
{
    private class ReplaceASingleEntryList extends AbstractList
    {

        final ReplaceSampleTrack this$0;

        public Sample get(int i)
        {
            if (sampleNumber == (long)i)
            {
                return sampleContent;
            } else
            {
                return (Sample)origTrack.getSamples().get(i);
            }
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        public int size()
        {
            return origTrack.getSamples().size();
        }

        private ReplaceASingleEntryList()
        {
            this$0 = ReplaceSampleTrack.this;
            super();
        }

        ReplaceASingleEntryList(ReplaceASingleEntryList replaceasingleentrylist)
        {
            this();
        }
    }


    Track origTrack;
    private Sample sampleContent;
    private long sampleNumber;
    private List samples;

    public ReplaceSampleTrack(Track track, long l, ByteBuffer bytebuffer)
    {
        origTrack = track;
        sampleNumber = l;
        sampleContent = new SampleImpl(bytebuffer);
        samples = new ReplaceASingleEntryList(null);
    }

    public List getCompositionTimeEntries()
    {
        return origTrack.getCompositionTimeEntries();
    }

    public List getDecodingTimeEntries()
    {
        return origTrack.getDecodingTimeEntries();
    }

    public String getHandler()
    {
        return origTrack.getHandler();
    }

    public Box getMediaHeaderBox()
    {
        return origTrack.getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return origTrack.getSampleDependencies();
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return origTrack.getSampleDescriptionBox();
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return origTrack.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        this;
        JVM INSTR monitorenter ;
        long al[] = origTrack.getSyncSamples();
        this;
        JVM INSTR monitorexit ;
        return al;
        Exception exception;
        exception;
        throw exception;
    }

    public TrackMetaData getTrackMetaData()
    {
        return origTrack.getTrackMetaData();
    }


}
