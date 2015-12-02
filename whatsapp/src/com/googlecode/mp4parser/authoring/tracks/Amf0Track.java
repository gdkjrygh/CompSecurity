// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Amf0Track extends AbstractTrack
{

    SortedMap rawSamples;
    private TrackMetaData trackMetaData;

    public Amf0Track(Map map)
    {
        rawSamples = new TreeMap() {

            final Amf0Track this$0;

            
            {
                this$0 = Amf0Track.this;
                super();
            }
        };
        trackMetaData = new TrackMetaData();
        rawSamples = new TreeMap(map);
        trackMetaData.setCreationTime(new Date());
        trackMetaData.setModificationTime(new Date());
        trackMetaData.setTimescale(1000L);
        trackMetaData.setLanguage("eng");
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public List getDecodingTimeEntries()
    {
        LinkedList linkedlist = new LinkedList();
        Object obj = new LinkedList(rawSamples.keySet());
        Collections.sort(((List) (obj)));
        long l = 0L;
        obj = ((LinkedList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return linkedlist;
            }
            Long long1 = (Long)((Iterator) (obj)).next();
            l = long1.longValue() - l;
            if (linkedlist.size() > 0 && ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.peek()).getDelta() == l)
            {
                ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.peek()).setCount(((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.peek()).getCount() + 1L);
            } else
            {
                linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l));
            }
            l = long1.longValue();
        } while (true);
    }

    public String getHandler()
    {
        return "data";
    }

    public Box getMediaHeaderBox()
    {
        return new NullMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        SampleDescriptionBox sampledescriptionbox = new SampleDescriptionBox();
        ActionMessageFormat0SampleEntryBox actionmessageformat0sampleentrybox = new ActionMessageFormat0SampleEntryBox();
        actionmessageformat0sampleentrybox.setDataReferenceIndex(1);
        sampledescriptionbox.addBox(actionmessageformat0sampleentrybox);
        return sampledescriptionbox;
    }

    public List getSamples()
    {
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = rawSamples.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return linkedlist;
            }
            linkedlist.add(new SampleImpl(ByteBuffer.wrap((byte[])iterator.next())));
        } while (true);
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
        return trackMetaData;
    }
}
