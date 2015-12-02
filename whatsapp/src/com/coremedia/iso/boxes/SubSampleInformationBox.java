// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class SubSampleInformationBox extends AbstractFullBox
{
    public static class SampleEntry
    {

        private long sampleDelta;
        private int subsampleCount;
        private List subsampleEntries;

        public void addSubsampleEntry(SubsampleEntry subsampleentry)
        {
            subsampleEntries.add(subsampleentry);
            subsampleCount = subsampleCount + 1;
        }

        public long getSampleDelta()
        {
            return sampleDelta;
        }

        public int getSubsampleCount()
        {
            return subsampleCount;
        }

        public List getSubsampleEntries()
        {
            return subsampleEntries;
        }

        public void setSampleDelta(long l)
        {
            sampleDelta = l;
        }

        public void setSubsampleCount(int i)
        {
            subsampleCount = i;
        }

        public String toString()
        {
            return (new StringBuilder("SampleEntry{sampleDelta=")).append(sampleDelta).append(", subsampleCount=").append(subsampleCount).append(", subsampleEntries=").append(subsampleEntries).append('}').toString();
        }

        public SampleEntry()
        {
            subsampleEntries = new ArrayList();
        }
    }

    public static class SampleEntry.SubsampleEntry
    {

        private int discardable;
        private long reserved;
        private int subsamplePriority;
        private long subsampleSize;

        public int getDiscardable()
        {
            return discardable;
        }

        public long getReserved()
        {
            return reserved;
        }

        public int getSubsamplePriority()
        {
            return subsamplePriority;
        }

        public long getSubsampleSize()
        {
            return subsampleSize;
        }

        public void setDiscardable(int i)
        {
            discardable = i;
        }

        public void setReserved(long l)
        {
            reserved = l;
        }

        public void setSubsamplePriority(int i)
        {
            subsamplePriority = i;
        }

        public void setSubsampleSize(long l)
        {
            subsampleSize = l;
        }

        public String toString()
        {
            return (new StringBuilder("SubsampleEntry{subsampleSize=")).append(subsampleSize).append(", subsamplePriority=").append(subsamplePriority).append(", discardable=").append(discardable).append(", reserved=").append(reserved).append('}').toString();
        }

        public SampleEntry.SubsampleEntry()
        {
        }
    }


    public static final String TYPE = "subs";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private List entries;
    private long entryCount;

    public SubSampleInformationBox()
    {
        super("subs");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SubSampleInformationBox.java", com/coremedia/iso/boxes/SubSampleInformationBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 51);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 55);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 115);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int i;
        parseVersionAndFlags(bytebuffer);
        entryCount = IsoTypeReader.readUInt32(bytebuffer);
        i = 0;
_L2:
        if ((long)i >= entryCount)
        {
            return;
        }
        SampleEntry sampleentry = new SampleEntry();
        sampleentry.setSampleDelta(IsoTypeReader.readUInt32(bytebuffer));
        int k = IsoTypeReader.readUInt16(bytebuffer);
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    break label0;
                }
                entries.add(sampleentry);
                i++;
            }
            if (true)
            {
                continue;
            }
            SampleEntry.SubsampleEntry subsampleentry = new SampleEntry.SubsampleEntry();
            long l;
            if (getVersion() == 1)
            {
                l = IsoTypeReader.readUInt32(bytebuffer);
            } else
            {
                l = IsoTypeReader.readUInt16(bytebuffer);
            }
            subsampleentry.setSubsampleSize(l);
            subsampleentry.setSubsamplePriority(IsoTypeReader.readUInt8(bytebuffer));
            subsampleentry.setDiscardable(IsoTypeReader.readUInt8(bytebuffer));
            subsampleentry.setReserved(IsoTypeReader.readUInt32(bytebuffer));
            sampleentry.addSubsampleEntry(subsampleentry);
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Object obj = (SampleEntry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, ((SampleEntry) (obj)).getSampleDelta());
            IsoTypeWriter.writeUInt16(bytebuffer, ((SampleEntry) (obj)).getSubsampleCount());
            obj = ((SampleEntry) (obj)).getSubsampleEntries().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                SampleEntry.SubsampleEntry subsampleentry = (SampleEntry.SubsampleEntry)((Iterator) (obj)).next();
                if (getVersion() == 1)
                {
                    IsoTypeWriter.writeUInt32(bytebuffer, subsampleentry.getSubsampleSize());
                } else
                {
                    IsoTypeWriter.writeUInt16(bytebuffer, CastUtils.l2i(subsampleentry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(bytebuffer, subsampleentry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(bytebuffer, subsampleentry.getDiscardable());
                IsoTypeWriter.writeUInt32(bytebuffer, subsampleentry.getReserved());
            }
        } while (true);
    }

    protected long getContentSize()
    {
        long l = entryCount;
        int i = 0;
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (long)i + (8L + 6L * l);
            }
            int j = ((SampleEntry)iterator.next()).getSubsampleCount();
            byte byte0;
            if (getVersion() == 1)
            {
                byte0 = 4;
            } else
            {
                byte0 = 2;
            }
            i += (byte0 + 1 + 1 + 4) * j;
        } while (true);
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
        entryCount = list.size();
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("SubSampleInformationBox{entryCount=")).append(entryCount).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
