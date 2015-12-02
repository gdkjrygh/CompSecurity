// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DivideTimeScaleTrack
    implements Track
{

    Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(Track track, int i)
    {
        source = track;
        timeScaleDivisor = i;
    }

    List adjustCtts()
    {
        Object obj = source.getCompositionTimeEntries();
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return arraylist;
                }
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)((Iterator) (obj)).next();
                arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() / timeScaleDivisor));
            } while (true);
        } else
        {
            return null;
        }
    }

    List adjustTts()
    {
        Object obj = source.getDecodingTimeEntries();
        LinkedList linkedlist = new LinkedList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return linkedlist;
            }
            com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)((Iterator) (obj)).next();
            linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(entry.getCount(), entry.getDelta() / (long)timeScaleDivisor));
        } while (true);
    }

    public List getCompositionTimeEntries()
    {
        return adjustCtts();
    }

    public List getDecodingTimeEntries()
    {
        return adjustTts();
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
        trackmetadata.setTimescale(source.getTrackMetaData().getTimescale() / (long)timeScaleDivisor);
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
        return (new StringBuilder("MultiplyTimeScaleTrack{source=")).append(source).append('}').toString();
    }
}
