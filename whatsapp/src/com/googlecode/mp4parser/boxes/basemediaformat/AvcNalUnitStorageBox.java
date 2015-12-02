// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.basemediaformat;

import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class AvcNalUnitStorageBox extends AbstractBox
{

    public static final String TYPE = "avcn";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    com.coremedia.iso.boxes.h264.AvcConfigurationBox.AVCDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public AvcNalUnitStorageBox()
    {
        super("avcn");
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcconfigurationbox)
    {
        super("avcn");
        avcDecoderConfigurationRecord = avcconfigurationbox.getavcDecoderConfigurationRecord();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AvcNalUnitStorageBox.java", com/googlecode/mp4parser/boxes/basemediaformat/AvcNalUnitStorageBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.coremedia.iso.boxes.h264.AvcConfigurationBox$AVCDecoderConfigurationRecord"), 43);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 60);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 88);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord = new com.coremedia.iso.boxes.h264.AvcConfigurationBox.AVCDecoderConfigurationRecord(bytebuffer);
    }

    public com.coremedia.iso.boxes.h264.AvcConfigurationBox.AVCDecoderConfigurationRecord getAvcDecoderConfigurationRecord()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord.getContent(bytebuffer);
    }

    protected long getContentSize()
    {
        return avcDecoderConfigurationRecord.getContentSize();
    }

    public int getLengthSizeMinusOne()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public String[] getPPS()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getPPS();
    }

    public List getPictureParameterSetsAsStrings()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings();
    }

    public String[] getSPS()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getSPS();
    }

    public List getSequenceParameterSetExtsAsStrings()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getSequenceParameterSetExtsAsStrings();
    }

    public List getSequenceParameterSetsAsStrings()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings();
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("AvcNalUnitStorageBox{SPS=")).append(avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings()).append(",PPS=").append(avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings()).append(",lengthSize=").append(avcDecoderConfigurationRecord.lengthSizeMinusOne + 1).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
