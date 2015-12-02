// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public final class BitRateBox extends AbstractBox
{

    public static final String TYPE = "btrt";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    public BitRateBox()
    {
        super("btrt");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("BitRateBox.java", com/coremedia/iso/boxes/BitRateBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBufferSizeDb", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 70);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBufferSizeDb", "com.coremedia.iso.boxes.BitRateBox", "long", "bufferSizeDb", "", "void"), 74);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxBitrate", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 78);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxBitrate", "com.coremedia.iso.boxes.BitRateBox", "long", "maxBitrate", "", "void"), 82);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvgBitrate", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 86);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvgBitrate", "com.coremedia.iso.boxes.BitRateBox", "long", "avgBitrate", "", "void"), 90);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        bufferSizeDb = IsoTypeReader.readUInt32(bytebuffer);
        maxBitrate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitrate = IsoTypeReader.readUInt32(bytebuffer);
    }

    public long getAvgBitrate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avgBitrate;
    }

    public long getBufferSizeDb()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return bufferSizeDb;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt32(bytebuffer, bufferSizeDb);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitrate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitrate);
    }

    protected long getContentSize()
    {
        return 12L;
    }

    public long getMaxBitrate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return maxBitrate;
    }

    public void setAvgBitrate(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avgBitrate = l;
    }

    public void setBufferSizeDb(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        bufferSizeDb = l;
    }

    public void setMaxBitrate(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        maxBitrate = l;
    }

    static 
    {
        ajc$preClinit();
    }
}
