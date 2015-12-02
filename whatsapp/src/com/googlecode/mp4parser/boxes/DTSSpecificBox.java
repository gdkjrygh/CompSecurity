// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class DTSSpecificBox extends AbstractBox
{

    public static final String TYPE = "ddts";
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
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_30;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_31;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    public DTSSpecificBox()
    {
        super("ddts");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("DTSSpecificBox.java", com/googlecode/mp4parser/boxes/DTSSpecificBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 88);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 92);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 128);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), 132);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 136);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 140);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 144);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 148);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 152);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 156);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 160);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 164);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 96);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 168);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 172);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 176);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 180);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 184);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 188);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 192);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 196);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 200);
        ajc$tjp_29 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 204);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 100);
        ajc$tjp_30 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 208);
        ajc$tjp_31 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 212);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 104);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 108);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 112);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 116);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 120);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 124);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        DTSSamplingFrequency = IsoTypeReader.readUInt32(bytebuffer);
        maxBitRate = IsoTypeReader.readUInt32(bytebuffer);
        avgBitRate = IsoTypeReader.readUInt32(bytebuffer);
        pcmSampleDepth = IsoTypeReader.readUInt8(bytebuffer);
        bytebuffer = new BitReaderBuffer(bytebuffer);
        frameDuration = bytebuffer.readBits(2);
        streamConstruction = bytebuffer.readBits(5);
        coreLFEPresent = bytebuffer.readBits(1);
        coreLayout = bytebuffer.readBits(6);
        coreSize = bytebuffer.readBits(14);
        stereoDownmix = bytebuffer.readBits(1);
        representationType = bytebuffer.readBits(3);
        channelLayout = bytebuffer.readBits(16);
        multiAssetFlag = bytebuffer.readBits(1);
        LBRDurationMod = bytebuffer.readBits(1);
        reservedBoxPresent = bytebuffer.readBits(1);
        reserved = bytebuffer.readBits(5);
    }

    public long getAvgBitRate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avgBitRate;
    }

    public int getChannelLayout()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return channelLayout;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt32(bytebuffer, DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(bytebuffer, maxBitRate);
        IsoTypeWriter.writeUInt32(bytebuffer, avgBitRate);
        IsoTypeWriter.writeUInt8(bytebuffer, pcmSampleDepth);
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(frameDuration, 2);
        bytebuffer.writeBits(streamConstruction, 5);
        bytebuffer.writeBits(coreLFEPresent, 1);
        bytebuffer.writeBits(coreLayout, 6);
        bytebuffer.writeBits(coreSize, 14);
        bytebuffer.writeBits(stereoDownmix, 1);
        bytebuffer.writeBits(representationType, 3);
        bytebuffer.writeBits(channelLayout, 16);
        bytebuffer.writeBits(multiAssetFlag, 1);
        bytebuffer.writeBits(LBRDurationMod, 1);
        bytebuffer.writeBits(reservedBoxPresent, 1);
        bytebuffer.writeBits(reserved, 5);
    }

    protected long getContentSize()
    {
        return 20L;
    }

    public int getCoreLFEPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return coreLFEPresent;
    }

    public int getCoreLayout()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return coreLayout;
    }

    public int getCoreSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return coreSize;
    }

    public long getDTSSamplingFrequency()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return DTSSamplingFrequency;
    }

    public int getFrameDuration()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return frameDuration;
    }

    public int getLBRDurationMod()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return LBRDurationMod;
    }

    public long getMaxBitRate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return maxBitRate;
    }

    public int getMultiAssetFlag()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return multiAssetFlag;
    }

    public int getPcmSampleDepth()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return pcmSampleDepth;
    }

    public int getRepresentationType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return representationType;
    }

    public int getReserved()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return reserved;
    }

    public int getReservedBoxPresent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_30, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return reservedBoxPresent;
    }

    public int getStereoDownmix()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return stereoDownmix;
    }

    public int getStreamConstruction()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return streamConstruction;
    }

    public void setAvgBitRate(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avgBitRate = l;
    }

    public void setChannelLayout(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_23, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        channelLayout = i;
    }

    public void setCoreLFEPresent(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        coreLFEPresent = i;
    }

    public void setCoreLayout(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        coreLayout = i;
    }

    public void setCoreSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        coreSize = i;
    }

    public void setDTSSamplingFrequency(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        DTSSamplingFrequency = l;
    }

    public void setFrameDuration(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        frameDuration = i;
    }

    public void setLBRDurationMod(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_27, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        LBRDurationMod = i;
    }

    public void setMaxBitRate(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        maxBitRate = l;
    }

    public void setMultiAssetFlag(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_25, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        pcmSampleDepth = i;
    }

    public void setRepresentationType(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        representationType = i;
    }

    public void setReserved(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_29, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        reserved = i;
    }

    public void setReservedBoxPresent(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_31, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        stereoDownmix = i;
    }

    public void setStreamConstruction(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        streamConstruction = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
