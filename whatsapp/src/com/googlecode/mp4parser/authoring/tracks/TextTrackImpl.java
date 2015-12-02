// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TextTrackImpl extends AbstractTrack
{
    public static class Line
    {

        long from;
        String text;
        long to;

        public long getFrom()
        {
            return from;
        }

        public String getText()
        {
            return text;
        }

        public long getTo()
        {
            return to;
        }

        public Line(long l, long l1, String s)
        {
            from = l;
            to = l1;
            text = s;
        }
    }


    SampleDescriptionBox sampleDescriptionBox;
    List subs;
    TrackMetaData trackMetaData;

    public TextTrackImpl()
    {
        trackMetaData = new TrackMetaData();
        subs = new LinkedList();
        sampleDescriptionBox = new SampleDescriptionBox();
        TextSampleEntry textsampleentry = new TextSampleEntry("tx3g");
        textsampleentry.setDataReferenceIndex(1);
        textsampleentry.setStyleRecord(new com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord());
        textsampleentry.setBoxRecord(new com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord());
        sampleDescriptionBox.addBox(textsampleentry);
        FontTableBox fonttablebox = new FontTableBox();
        fonttablebox.setEntries(Collections.singletonList(new com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord(1, "Serif")));
        textsampleentry.addBox(fonttablebox);
        trackMetaData.setCreationTime(new Date());
        trackMetaData.setModificationTime(new Date());
        trackMetaData.setTimescale(1000L);
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public List getDecodingTimeEntries()
    {
        LinkedList linkedlist;
        Iterator iterator;
        long l;
        linkedlist = new LinkedList();
        l = 0L;
        iterator = subs.iterator();
_L2:
        Line line;
        if (!iterator.hasNext())
        {
            return linkedlist;
        }
        line = (Line)iterator.next();
        l = line.from - l;
        if (l <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l));
_L4:
        linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, line.to - line.from));
        l = line.to;
        if (true) goto _L2; else goto _L1
_L1:
        if (l >= 0L) goto _L4; else goto _L3
_L3:
        throw new Error("Subtitle display times may not intersect");
    }

    public String getHandler()
    {
        return "sbtl";
    }

    public AbstractMediaHeaderBox getMediaHeaderBox()
    {
        return new NullMediaHeaderBox();
    }

    public volatile Box getMediaHeaderBox()
    {
        return getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public List getSamples()
    {
        LinkedList linkedlist;
        Iterator iterator;
        long l;
        linkedlist = new LinkedList();
        l = 0L;
        iterator = subs.iterator();
_L3:
        Line line;
        if (!iterator.hasNext())
        {
            return linkedlist;
        }
        line = (Line)iterator.next();
        l = line.from - l;
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        linkedlist.add(new SampleImpl(ByteBuffer.wrap(new byte[2])));
_L4:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
        try
        {
            dataoutputstream.writeShort(line.text.getBytes("UTF-8").length);
            dataoutputstream.write(line.text.getBytes("UTF-8"));
            dataoutputstream.close();
        }
        catch (IOException ioexception)
        {
            throw new Error("VM is broken. Does not support UTF-8");
        }
        linkedlist.add(new SampleImpl(ByteBuffer.wrap(bytearrayoutputstream.toByteArray())));
        l = line.to;
        if (true) goto _L3; else goto _L2
_L2:
        if (l < 0L)
        {
            throw new Error("Subtitle display times may not intersect");
        }
          goto _L4
    }

    public List getSubs()
    {
        return subs;
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
