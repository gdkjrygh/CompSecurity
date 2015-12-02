// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackRunBox extends AbstractFullBox
{
    public static class Entry
    {

        private int sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;

        public int getSampleCompositionTimeOffset()
        {
            return sampleCompositionTimeOffset;
        }

        public long getSampleDuration()
        {
            return sampleDuration;
        }

        public SampleFlags getSampleFlags()
        {
            return sampleFlags;
        }

        public long getSampleSize()
        {
            return sampleSize;
        }

        public void setSampleCompositionTimeOffset(int i)
        {
            sampleCompositionTimeOffset = i;
        }

        public void setSampleDuration(long l)
        {
            sampleDuration = l;
        }

        public void setSampleFlags(SampleFlags sampleflags)
        {
            sampleFlags = sampleflags;
        }

        public void setSampleSize(long l)
        {
            sampleSize = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{sampleDuration=")).append(sampleDuration).append(", sampleSize=").append(sampleSize).append(", sampleFlags=").append(sampleFlags).append(", sampleCompositionTimeOffset=").append(sampleCompositionTimeOffset).append('}').toString();
        }









        public Entry()
        {
        }

        public Entry(long l, long l1, SampleFlags sampleflags, int i)
        {
            sampleDuration = l;
            sampleSize = l1;
            sampleFlags = sampleflags;
            sampleCompositionTimeOffset = i;
        }
    }


    public static final String TYPE = "trun";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_14;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_15;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_16;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_17;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_18;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_19;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private int dataOffset;
    private List entries;
    private SampleFlags firstSampleFlags;

    public TrackRunBox()
    {
        super("trun");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrackRunBox.java", com/coremedia/iso/boxes/fragment/TrackRunBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 117);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 260);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 268);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 276);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 285);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 293);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 302);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 306);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 310);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 320);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 335);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 126);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 231);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 235);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 239);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 244);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 248);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 252);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 256);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        long l = IsoTypeReader.readUInt32(bytebuffer);
        int i;
        if ((getFlags() & 1) == 1)
        {
            dataOffset = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        } else
        {
            dataOffset = -1;
        }
        if ((getFlags() & 4) == 4)
        {
            firstSampleFlags = new SampleFlags(bytebuffer);
        }
        i = 0;
        do
        {
            if ((long)i >= l)
            {
                return;
            }
            Entry entry = new Entry();
            if ((getFlags() & 0x100) == 256)
            {
                entry.sampleDuration = IsoTypeReader.readUInt32(bytebuffer);
            }
            if ((getFlags() & 0x200) == 512)
            {
                entry.sampleSize = IsoTypeReader.readUInt32(bytebuffer);
            }
            if ((getFlags() & 0x400) == 1024)
            {
                entry.sampleFlags = new SampleFlags(bytebuffer);
            }
            if ((getFlags() & 0x800) == 2048)
            {
                entry.sampleCompositionTimeOffset = bytebuffer.getInt();
            }
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        int i = getFlags();
        if ((i & 1) == 1)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, dataOffset);
        }
        if ((i & 4) == 4)
        {
            firstSampleFlags.getContent(bytebuffer);
        }
        Iterator iterator = entries.iterator();
        do
        {
            Entry entry;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                entry = (Entry)iterator.next();
                if ((i & 0x100) == 256)
                {
                    IsoTypeWriter.writeUInt32(bytebuffer, entry.sampleDuration);
                }
                if ((i & 0x200) == 512)
                {
                    IsoTypeWriter.writeUInt32(bytebuffer, entry.sampleSize);
                }
                if ((i & 0x400) == 1024)
                {
                    entry.sampleFlags.getContent(bytebuffer);
                }
            } while ((i & 0x800) != 2048);
            bytebuffer.putInt(entry.sampleCompositionTimeOffset);
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 8L;
        int i = getFlags();
        if ((i & 1) == 1)
        {
            l = 8L + 4L;
        }
        long l2 = l;
        if ((i & 4) == 4)
        {
            l2 = l + 4L;
        }
        long l1 = 0L;
        if ((i & 0x100) == 256)
        {
            l1 = 0L + 4L;
        }
        l = l1;
        if ((i & 0x200) == 512)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 0x400) == 1024)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((i & 0x800) == 2048)
        {
            l = l1 + 4L;
        }
        return l2 + (long)entries.size() * l;
    }

    public int getDataOffset()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return dataOffset;
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public SampleFlags getFirstSampleFlags()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (isSampleCompositionTimeOffsetPresent())
        {
            long al[] = new long[entries.size()];
            int i = 0;
            do
            {
                if (i >= al.length)
                {
                    return al;
                }
                al[i] = ((Entry)entries.get(i)).getSampleCompositionTimeOffset();
                i++;
            } while (true);
        } else
        {
            return null;
        }
    }

    public long getSampleCount()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (long)entries.size();
    }

    public boolean isDataOffsetPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x800) == 2048;
    }

    public boolean isSampleDurationPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x100) == 256;
    }

    public boolean isSampleFlagsPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x400) == 1024;
    }

    public boolean isSampleSizePresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x200) == 512;
    }

    public void setDataOffset(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (i == -1)
        {
            setFlags(getFlags() & 0xfffffe);
        } else
        {
            setFlags(getFlags() | 1);
        }
        dataOffset = i;
    }

    public void setDataOffsetPresent(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffe);
            return;
        }
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_19, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
    }

    public void setFirstSampleFlags(SampleFlags sampleflags)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, sampleflags);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (sampleflags == null)
        {
            setFlags(getFlags() & 0xfffffb);
        } else
        {
            setFlags(getFlags() | 4);
        }
        firstSampleFlags = sampleflags;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 0x800);
            return;
        } else
        {
            setFlags(getFlags() & 0xfff7ff);
            return;
        }
    }

    public void setSampleDurationPresent(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 0x100);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffeff);
            return;
        }
    }

    public void setSampleFlagsPresent(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 0x400);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffbff);
            return;
        }
    }

    public void setSampleSizePresent(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 0x200);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffdff);
            return;
        }
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackRunBox");
        ((StringBuilder) (obj)).append("{sampleCount=").append(entries.size());
        ((StringBuilder) (obj)).append(", dataOffset=").append(dataOffset);
        ((StringBuilder) (obj)).append(", dataOffsetPresent=").append(isDataOffsetPresent());
        ((StringBuilder) (obj)).append(", sampleSizePresent=").append(isSampleSizePresent());
        ((StringBuilder) (obj)).append(", sampleDurationPresent=").append(isSampleDurationPresent());
        ((StringBuilder) (obj)).append(", sampleFlagsPresentPresent=").append(isSampleFlagsPresent());
        ((StringBuilder) (obj)).append(", sampleCompositionTimeOffsetPresent=").append(isSampleCompositionTimeOffsetPresent());
        ((StringBuilder) (obj)).append(", firstSampleFlags=").append(firstSampleFlags);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
