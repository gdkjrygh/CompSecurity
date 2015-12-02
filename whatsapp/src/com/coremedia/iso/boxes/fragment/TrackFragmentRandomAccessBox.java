// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class TrackFragmentRandomAccessBox extends AbstractFullBox
{
    public static class Entry
    {

        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (moofOffset != ((Entry) (obj)).moofOffset)
                {
                    return false;
                }
                if (sampleNumber != ((Entry) (obj)).sampleNumber)
                {
                    return false;
                }
                if (time != ((Entry) (obj)).time)
                {
                    return false;
                }
                if (trafNumber != ((Entry) (obj)).trafNumber)
                {
                    return false;
                }
                if (trunNumber != ((Entry) (obj)).trunNumber)
                {
                    return false;
                }
            }
            return true;
        }

        public long getMoofOffset()
        {
            return moofOffset;
        }

        public long getSampleNumber()
        {
            return sampleNumber;
        }

        public long getTime()
        {
            return time;
        }

        public long getTrafNumber()
        {
            return trafNumber;
        }

        public long getTrunNumber()
        {
            return trunNumber;
        }

        public int hashCode()
        {
            return ((((int)(time ^ time >>> 32) * 31 + (int)(moofOffset ^ moofOffset >>> 32)) * 31 + (int)(trafNumber ^ trafNumber >>> 32)) * 31 + (int)(trunNumber ^ trunNumber >>> 32)) * 31 + (int)(sampleNumber ^ sampleNumber >>> 32);
        }

        public void setMoofOffset(long l)
        {
            moofOffset = l;
        }

        public void setSampleNumber(long l)
        {
            sampleNumber = l;
        }

        public void setTime(long l)
        {
            time = l;
        }

        public void setTrafNumber(long l)
        {
            trafNumber = l;
        }

        public void setTrunNumber(long l)
        {
            trunNumber = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{time=")).append(time).append(", moofOffset=").append(moofOffset).append(", trafNumber=").append(trafNumber).append(", trunNumber=").append(trunNumber).append(", sampleNumber=").append(sampleNumber).append('}').toString();
        }











        public Entry()
        {
        }

        public Entry(long l, long l1, long l2, long l3, long l4)
        {
            moofOffset = l1;
            sampleNumber = l4;
            time = l;
            trafNumber = l2;
            trunNumber = l3;
        }
    }


    public static final String TYPE = "tfra";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private List entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    public TrackFragmentRandomAccessBox()
    {
        super("tfra");
        lengthSizeOfTrafNum = 2;
        lengthSizeOfTrunNum = 2;
        lengthSizeOfSampleNum = 2;
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrackFragmentRandomAccessBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentRandomAccessBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = IsoTypeReader.readUInt32(bytebuffer);
        long l = IsoTypeReader.readUInt32(bytebuffer);
        reserved = (int)(l >> 6);
        lengthSizeOfTrafNum = ((int)(63L & l) >> 4) + 1;
        lengthSizeOfTrunNum = ((int)(12L & l) >> 2) + 1;
        lengthSizeOfSampleNum = (int)(3L & l) + 1;
        l = IsoTypeReader.readUInt32(bytebuffer);
        entries = new ArrayList();
        int i = 0;
        do
        {
            if ((long)i >= l)
            {
                return;
            }
            Entry entry = new Entry();
            if (getVersion() == 1)
            {
                entry.time = IsoTypeReader.readUInt64(bytebuffer);
                entry.moofOffset = IsoTypeReader.readUInt64(bytebuffer);
            } else
            {
                entry.time = IsoTypeReader.readUInt32(bytebuffer);
                entry.moofOffset = IsoTypeReader.readUInt32(bytebuffer);
            }
            entry.trafNumber = IsoTypeReaderVariable.read(bytebuffer, lengthSizeOfTrafNum);
            entry.trunNumber = IsoTypeReaderVariable.read(bytebuffer, lengthSizeOfTrunNum);
            entry.sampleNumber = IsoTypeReaderVariable.read(bytebuffer, lengthSizeOfSampleNum);
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, trackId);
        IsoTypeWriter.writeUInt32(bytebuffer, (long)(reserved << 6) | (long)((lengthSizeOfTrafNum - 1 & 3) << 4) | (long)((lengthSizeOfTrunNum - 1 & 3) << 2) | (long)(lengthSizeOfSampleNum - 1 & 3));
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            if (getVersion() == 1)
            {
                IsoTypeWriter.writeUInt64(bytebuffer, entry.time);
                IsoTypeWriter.writeUInt64(bytebuffer, entry.moofOffset);
            } else
            {
                IsoTypeWriter.writeUInt32(bytebuffer, entry.time);
                IsoTypeWriter.writeUInt32(bytebuffer, entry.moofOffset);
            }
            IsoTypeWriterVariable.write(entry.trafNumber, bytebuffer, lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(entry.trunNumber, bytebuffer, lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(entry.sampleNumber, bytebuffer, lengthSizeOfSampleNum);
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 4L + 12L;
        if (getVersion() == 1)
        {
            l += entries.size() * 16;
        } else
        {
            l += entries.size() * 8;
        }
        return l + (long)(lengthSizeOfTrafNum * entries.size()) + (long)(lengthSizeOfTrunNum * entries.size()) + (long)(lengthSizeOfSampleNum * entries.size());
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return Collections.unmodifiableList(entries);
    }

    public int getLengthSizeOfSampleNum()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (long)entries.size();
    }

    public int getReserved()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return reserved;
    }

    public long getTrackId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return trackId;
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
    }

    public void setLengthSizeOfSampleNum(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        trackId = l;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("TrackFragmentRandomAccessBox{trackId=")).append(trackId).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
