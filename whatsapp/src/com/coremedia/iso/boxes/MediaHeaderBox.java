// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class MediaHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "mdhd";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private Date creationTime;
    private long duration;
    private String language;
    private Date modificationTime;
    private long timescale;

    public MediaHeaderBox()
    {
        super("mdhd");
        creationTime = new Date();
        modificationTime = new Date();
        language = "eng";
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("MediaHeaderBox.java", com/coremedia/iso/boxes/MediaHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            timescale = IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt64(bytebuffer);
        } else
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            timescale = IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt32(bytebuffer);
        }
        language = IsoTypeReader.readIso639(bytebuffer);
        IsoTypeReader.readUInt16(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, timescale);
            IsoTypeWriter.writeUInt64(bytebuffer, duration);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, timescale);
            IsoTypeWriter.writeUInt32(bytebuffer, duration);
        }
        IsoTypeWriter.writeIso639(bytebuffer, language);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
    }

    protected long getContentSize()
    {
        long l;
        if (getVersion() == 1)
        {
            l = 4L + 28L;
        } else
        {
            l = 4L + 16L;
        }
        return l + 2L + 2L;
    }

    public Date getCreationTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return creationTime;
    }

    public long getDuration()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return duration;
    }

    public String getLanguage()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return language;
    }

    public Date getModificationTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return modificationTime;
    }

    public long getTimescale()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return timescale;
    }

    public void setCreationTime(Date date)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        creationTime = date;
    }

    public void setDuration(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        duration = l;
    }

    public void setLanguage(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        language = s;
    }

    public void setModificationTime(Date date)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        modificationTime = date;
    }

    public void setTimescale(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        timescale = l;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("MediaHeaderBox[");
        ((StringBuilder) (obj)).append("creationTime=").append(getCreationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("modificationTime=").append(getModificationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("timescale=").append(getTimescale());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("duration=").append(getDuration());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("language=").append(getLanguage());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
