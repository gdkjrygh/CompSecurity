// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class AmrSpecificBox extends AbstractBox
{

    public static final String TYPE = "damr";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    public AmrSpecificBox()
    {
        super("damr");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AmrSpecificBox.java", com/coremedia/iso/boxes/sampleentry/AmrSpecificBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        vendor = IsoFile.bytesToFourCC(abyte0);
        decoderVersion = IsoTypeReader.readUInt8(bytebuffer);
        modeSet = IsoTypeReader.readUInt16(bytebuffer);
        modeChangePeriod = IsoTypeReader.readUInt8(bytebuffer);
        framesPerSample = IsoTypeReader.readUInt8(bytebuffer);
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        bytebuffer.put(IsoFile.fourCCtoBytes(vendor));
        IsoTypeWriter.writeUInt8(bytebuffer, decoderVersion);
        IsoTypeWriter.writeUInt16(bytebuffer, modeSet);
        IsoTypeWriter.writeUInt8(bytebuffer, modeChangePeriod);
        IsoTypeWriter.writeUInt8(bytebuffer, framesPerSample);
    }

    protected long getContentSize()
    {
        return 9L;
    }

    public int getDecoderVersion()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return decoderVersion;
    }

    public int getFramesPerSample()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return framesPerSample;
    }

    public int getModeChangePeriod()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return modeChangePeriod;
    }

    public int getModeSet()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return modeSet;
    }

    public String getVendor()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return vendor;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("AmrSpecificBox[vendor=").append(getVendor());
        ((StringBuilder) (obj)).append(";decoderVersion=").append(getDecoderVersion());
        ((StringBuilder) (obj)).append(";modeSet=").append(getModeSet());
        ((StringBuilder) (obj)).append(";modeChangePeriod=").append(getModeChangePeriod());
        ((StringBuilder) (obj)).append(";framesPerSample=").append(getFramesPerSample());
        ((StringBuilder) (obj)).append("]");
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
