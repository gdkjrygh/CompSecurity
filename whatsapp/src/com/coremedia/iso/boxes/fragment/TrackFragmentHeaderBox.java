// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.coremedia.iso.boxes.fragment:
//            SampleFlags

public class TrackFragmentHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "tfhd";
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
    private long baseDataOffset;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    public TrackFragmentHeaderBox()
    {
        super("tfhd");
        baseDataOffset = -1L;
        defaultSampleDuration = -1L;
        defaultSampleSize = -1L;
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrackFragmentHeaderBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 120);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 124);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 160);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 164);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 168);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 172);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 181);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 190);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 195);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 200);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 205);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 211);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 128);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 132);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 136);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 140);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 144);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 148);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 152);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 156);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        trackId = IsoTypeReader.readUInt32(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            baseDataOffset = IsoTypeReader.readUInt64(bytebuffer);
        }
        if ((getFlags() & 2) == 2)
        {
            sampleDescriptionIndex = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 8) == 8)
        {
            defaultSampleDuration = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 0x10) == 16)
        {
            defaultSampleSize = IsoTypeReader.readUInt32(bytebuffer);
        }
        if ((getFlags() & 0x20) == 32)
        {
            defaultSampleFlags = new SampleFlags(bytebuffer);
        }
        if ((getFlags() & 0x10000) == 0x10000)
        {
            durationIsEmpty = true;
        }
    }

    public long getBaseDataOffset()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return baseDataOffset;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, trackId);
        if ((getFlags() & 1) == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 0x10) == 16)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 0x20) == 32)
        {
            defaultSampleFlags.getContent(bytebuffer);
        }
    }

    protected long getContentSize()
    {
        long l1 = 8L;
        int i = getFlags();
        if ((i & 1) == 1)
        {
            l1 = 8L + 8L;
        }
        long l = l1;
        if ((i & 2) == 2)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 8) == 8)
        {
            l1 = l + 4L;
        }
        l = l1;
        if ((i & 0x10) == 16)
        {
            l = l1 + 4L;
        }
        l1 = l;
        if ((i & 0x20) == 32)
        {
            l1 = l + 4L;
        }
        return l1;
    }

    public long getDefaultSampleDuration()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultSampleDuration;
    }

    public SampleFlags getDefaultSampleFlags()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultSampleFlags;
    }

    public long getDefaultSampleSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultSampleSize;
    }

    public long getSampleDescriptionIndex()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return sampleDescriptionIndex;
    }

    public long getTrackId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return trackId;
    }

    public boolean hasBaseDataOffset()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x20) != 0;
    }

    public boolean hasDefaultSampleSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 0x10) != 0;
    }

    public boolean hasSampleDescriptionIndex()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 2) != 0;
    }

    public boolean isDurationIsEmpty()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return durationIsEmpty;
    }

    public void setBaseDataOffset(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (l == -1L)
        {
            setFlags(getFlags() & 0x7ffffffe);
        } else
        {
            setFlags(getFlags() | 1);
        }
        baseDataOffset = l;
    }

    public void setDefaultSampleDuration(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        setFlags(getFlags() | 8);
        defaultSampleDuration = l;
    }

    public void setDefaultSampleFlags(SampleFlags sampleflags)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, sampleflags);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        setFlags(getFlags() | 0x20);
        defaultSampleFlags = sampleflags;
    }

    public void setDefaultSampleSize(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        setFlags(getFlags() | 0x10);
        defaultSampleSize = l;
    }

    public void setDurationIsEmpty(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_18, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        setFlags(getFlags() | 0x10000);
        durationIsEmpty = flag;
    }

    public void setSampleDescriptionIndex(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (l == -1L)
        {
            setFlags(getFlags() & 0x7ffffffd);
        } else
        {
            setFlags(getFlags() | 2);
        }
        sampleDescriptionIndex = l;
    }

    public void setTrackId(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        trackId = l;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_19, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackFragmentHeaderBox");
        ((StringBuilder) (obj)).append("{trackId=").append(trackId);
        ((StringBuilder) (obj)).append(", baseDataOffset=").append(baseDataOffset);
        ((StringBuilder) (obj)).append(", sampleDescriptionIndex=").append(sampleDescriptionIndex);
        ((StringBuilder) (obj)).append(", defaultSampleDuration=").append(defaultSampleDuration);
        ((StringBuilder) (obj)).append(", defaultSampleSize=").append(defaultSampleSize);
        ((StringBuilder) (obj)).append(", defaultSampleFlags=").append(defaultSampleFlags);
        ((StringBuilder) (obj)).append(", durationIsEmpty=").append(durationIsEmpty);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
