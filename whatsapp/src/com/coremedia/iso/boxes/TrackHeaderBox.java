// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.DateHelper;
import com.googlecode.mp4parser.util.Matrix;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class TrackHeaderBox extends AbstractFullBox
{

    public static final String TYPE = "tkhd";
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
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_20;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_21;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_22;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_23;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_24;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_25;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_26;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_27;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_28;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_29;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private int alternateGroup;
    private Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    public TrackHeaderBox()
    {
        super("tkhd");
        matrix = Matrix.ROTATE_0;
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrackHeaderBox.java", com/coremedia/iso/boxes/TrackHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 138);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 166);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 192);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 199);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 207);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 211);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 218);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 222);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 226);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 234);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 238);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 243);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 259);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 267);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 275);
        ajc$tjp_29 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 283);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt64(bytebuffer));
            trackId = IsoTypeReader.readUInt32(bytebuffer);
            IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt64(bytebuffer);
        } else
        {
            creationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            modificationTime = DateHelper.convert(IsoTypeReader.readUInt32(bytebuffer));
            trackId = IsoTypeReader.readUInt32(bytebuffer);
            IsoTypeReader.readUInt32(bytebuffer);
            duration = IsoTypeReader.readUInt32(bytebuffer);
        }
        IsoTypeReader.readUInt32(bytebuffer);
        IsoTypeReader.readUInt32(bytebuffer);
        layer = IsoTypeReader.readUInt16(bytebuffer);
        alternateGroup = IsoTypeReader.readUInt16(bytebuffer);
        volume = IsoTypeReader.readFixedPoint88(bytebuffer);
        IsoTypeReader.readUInt16(bytebuffer);
        matrix = Matrix.fromByteBuffer(bytebuffer);
        width = IsoTypeReader.readFixedPoint1616(bytebuffer);
        height = IsoTypeReader.readFixedPoint1616(bytebuffer);
    }

    public int getAlternateGroup()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return alternateGroup;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt64(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, trackId);
            IsoTypeWriter.writeUInt32(bytebuffer, 0L);
            IsoTypeWriter.writeUInt64(bytebuffer, duration);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(creationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, DateHelper.convert(modificationTime));
            IsoTypeWriter.writeUInt32(bytebuffer, trackId);
            IsoTypeWriter.writeUInt32(bytebuffer, 0L);
            IsoTypeWriter.writeUInt32(bytebuffer, duration);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt32(bytebuffer, 0L);
        IsoTypeWriter.writeUInt16(bytebuffer, layer);
        IsoTypeWriter.writeUInt16(bytebuffer, alternateGroup);
        IsoTypeWriter.writeFixedPoint88(bytebuffer, volume);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
        matrix.getContent(bytebuffer);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, width);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, height);
    }

    protected long getContentSize()
    {
        long l;
        if (getVersion() == 1)
        {
            l = 4L + 32L;
        } else
        {
            l = 4L + 20L;
        }
        return l + 60L;
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

    public double getHeight()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return height;
    }

    public int getLayer()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return layer;
    }

    public Matrix getMatrix()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return matrix;
    }

    public Date getModificationTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return modificationTime;
    }

    public long getTrackId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return trackId;
    }

    public float getVolume()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return volume;
    }

    public double getWidth()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return width;
    }

    public boolean isEnabled()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_23, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_25, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        alternateGroup = i;
    }

    public void setCreationTime(Date date)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        creationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setDuration(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        duration = l;
        if (l >= 0x100000000L)
        {
            setFlags(1);
        }
    }

    public void setEnabled(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_26, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & -2);
            return;
        }
    }

    public void setHeight(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_21, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        height = d;
    }

    public void setInMovie(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_27, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 2);
            return;
        } else
        {
            setFlags(getFlags() & -3);
            return;
        }
    }

    public void setInPoster(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_29, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 8);
            return;
        } else
        {
            setFlags(getFlags() & -9);
            return;
        }
    }

    public void setInPreview(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_28, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (flag)
        {
            setFlags(getFlags() | 4);
            return;
        } else
        {
            setFlags(getFlags() & -5);
            return;
        }
    }

    public void setLayer(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        layer = i;
    }

    public void setMatrix(Matrix matrix1)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_19, this, this, matrix1);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        matrix = matrix1;
    }

    public void setModificationTime(Date date)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, date);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        modificationTime = date;
        if (DateHelper.convert(date) >= 0x100000000L)
        {
            setVersion(1);
        }
    }

    public void setTrackId(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        trackId = l;
    }

    public void setVolume(float f)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_18, this, this, Conversions.floatObject(f));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        volume = f;
    }

    public void setWidth(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_20, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        width = d;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_11, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrackHeaderBox[");
        ((StringBuilder) (obj)).append("creationTime=").append(getCreationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("modificationTime=").append(getModificationTime());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("trackId=").append(getTrackId());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("duration=").append(getDuration());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("layer=").append(getLayer());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("alternateGroup=").append(getAlternateGroup());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("volume=").append(getVolume());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("matrix=").append(matrix);
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("width=").append(getWidth());
        ((StringBuilder) (obj)).append(";");
        ((StringBuilder) (obj)).append("height=").append(getHeight());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
