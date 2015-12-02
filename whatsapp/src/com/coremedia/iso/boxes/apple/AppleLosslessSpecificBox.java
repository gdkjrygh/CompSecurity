// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public final class AppleLosslessSpecificBox extends AbstractFullBox
{

    public static final String TYPE = "alac";
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
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    public AppleLosslessSpecificBox()
    {
        super("alac");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AppleLosslessSpecificBox.java", com/coremedia/iso/boxes/apple/AppleLosslessSpecificBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        maxSamplePerFrame = IsoTypeReader.readUInt32(bytebuffer);
        unknown1 = IsoTypeReader.readUInt8(bytebuffer);
        sampleSize = IsoTypeReader.readUInt8(bytebuffer);
        historyMult = IsoTypeReader.readUInt8(bytebuffer);
        initialHistory = IsoTypeReader.readUInt8(bytebuffer);
        kModifier = IsoTypeReader.readUInt8(bytebuffer);
        channels = IsoTypeReader.readUInt8(bytebuffer);
        unknown2 = IsoTypeReader.readUInt16(bytebuffer);
        maxCodedFrameSize = IsoTypeReader.readUInt32(bytebuffer);
        bitRate = IsoTypeReader.readUInt32(bytebuffer);
        sampleRate = IsoTypeReader.readUInt32(bytebuffer);
    }

    public long getBitRate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return bitRate;
    }

    public int getChannels()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return channels;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(bytebuffer, unknown1);
        IsoTypeWriter.writeUInt8(bytebuffer, sampleSize);
        IsoTypeWriter.writeUInt8(bytebuffer, historyMult);
        IsoTypeWriter.writeUInt8(bytebuffer, initialHistory);
        IsoTypeWriter.writeUInt8(bytebuffer, kModifier);
        IsoTypeWriter.writeUInt8(bytebuffer, channels);
        IsoTypeWriter.writeUInt16(bytebuffer, unknown2);
        IsoTypeWriter.writeUInt32(bytebuffer, maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(bytebuffer, bitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, sampleRate);
    }

    protected long getContentSize()
    {
        return 28L;
    }

    public int getHistoryMult()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return historyMult;
    }

    public int getInitialHistory()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return initialHistory;
    }

    public int getKModifier()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return kModifier;
    }

    public long getMaxCodedFrameSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return maxSamplePerFrame;
    }

    public long getSampleRate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return sampleRate;
    }

    public int getSampleSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return sampleSize;
    }

    public int getUnknown1()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return unknown1;
    }

    public int getUnknown2()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return unknown2;
    }

    public void setBitRate(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        bitRate = i;
    }

    public void setChannels(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        channels = i;
    }

    public void setHistoryMult(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        historyMult = i;
    }

    public void setInitialHistory(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        initialHistory = i;
    }

    public void setKModifier(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        kModifier = i;
    }

    public void setMaxCodedFrameSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        maxCodedFrameSize = i;
    }

    public void setMaxSamplePerFrame(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        maxSamplePerFrame = i;
    }

    public void setSampleRate(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        sampleRate = i;
    }

    public void setSampleSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        sampleSize = i;
    }

    public void setUnknown1(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        unknown1 = i;
    }

    public void setUnknown2(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        unknown2 = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
