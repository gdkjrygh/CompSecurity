// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.h264;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public final class AvcConfigurationBox extends AbstractBox
{
    public static class AVCDecoderConfigurationRecord
    {

        public int avcLevelIndication;
        public int avcProfileIndication;
        public int bitDepthChromaMinus8;
        public int bitDepthChromaMinus8PaddingBits;
        public int bitDepthLumaMinus8;
        public int bitDepthLumaMinus8PaddingBits;
        public int chromaFormat;
        public int chromaFormatPaddingBits;
        public int configurationVersion;
        public boolean hasExts;
        public int lengthSizeMinusOne;
        public int lengthSizeMinusOnePaddingBits;
        public int numberOfSequenceParameterSetsPaddingBits;
        public List pictureParameterSets;
        public int profileCompatibility;
        public List sequenceParameterSetExts;
        public List sequenceParameterSets;

        public void getContent(ByteBuffer bytebuffer)
        {
            Object obj;
            IsoTypeWriter.writeUInt8(bytebuffer, configurationVersion);
            IsoTypeWriter.writeUInt8(bytebuffer, avcProfileIndication);
            IsoTypeWriter.writeUInt8(bytebuffer, profileCompatibility);
            IsoTypeWriter.writeUInt8(bytebuffer, avcLevelIndication);
            obj = new BitWriterBuffer(bytebuffer);
            ((BitWriterBuffer) (obj)).writeBits(lengthSizeMinusOnePaddingBits, 6);
            ((BitWriterBuffer) (obj)).writeBits(lengthSizeMinusOne, 2);
            ((BitWriterBuffer) (obj)).writeBits(numberOfSequenceParameterSetsPaddingBits, 3);
            ((BitWriterBuffer) (obj)).writeBits(pictureParameterSets.size(), 5);
            obj = sequenceParameterSets.iterator();
_L7:
            if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
            IsoTypeWriter.writeUInt8(bytebuffer, pictureParameterSets.size());
            obj = pictureParameterSets.iterator();
_L8:
            if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
            if (!hasExts || avcProfileIndication != 100 && avcProfileIndication != 110 && avcProfileIndication != 122 && avcProfileIndication != 144) goto _L6; else goto _L5
_L5:
            obj = new BitWriterBuffer(bytebuffer);
            ((BitWriterBuffer) (obj)).writeBits(chromaFormatPaddingBits, 6);
            ((BitWriterBuffer) (obj)).writeBits(chromaFormat, 2);
            ((BitWriterBuffer) (obj)).writeBits(bitDepthLumaMinus8PaddingBits, 5);
            ((BitWriterBuffer) (obj)).writeBits(bitDepthLumaMinus8, 3);
            ((BitWriterBuffer) (obj)).writeBits(bitDepthChromaMinus8PaddingBits, 5);
            ((BitWriterBuffer) (obj)).writeBits(bitDepthChromaMinus8, 3);
            obj = sequenceParameterSetExts.iterator();
_L9:
            if (((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_312;
            }
_L6:
            return;
_L2:
            byte abyte0[] = (byte[])((Iterator) (obj)).next();
            IsoTypeWriter.writeUInt16(bytebuffer, abyte0.length);
            bytebuffer.put(abyte0);
              goto _L7
_L4:
            byte abyte1[] = (byte[])((Iterator) (obj)).next();
            IsoTypeWriter.writeUInt16(bytebuffer, abyte1.length);
            bytebuffer.put(abyte1);
              goto _L8
            byte abyte2[] = (byte[])((Iterator) (obj)).next();
            IsoTypeWriter.writeUInt16(bytebuffer, abyte2.length);
            bytebuffer.put(abyte2);
              goto _L9
        }

        public long getContentSize()
        {
            Iterator iterator;
            long l;
            l = 5L + 1L;
            iterator = sequenceParameterSets.iterator();
_L9:
            if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
            l++;
            iterator = pictureParameterSets.iterator();
_L10:
            if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
            long l1 = l;
            if (!hasExts) goto _L6; else goto _L5
_L5:
            if (avcProfileIndication == 100 || avcProfileIndication == 110 || avcProfileIndication == 122) goto _L8; else goto _L7
_L7:
            l1 = l;
            if (avcProfileIndication != 144) goto _L6; else goto _L8
_L8:
            l += 4L;
_L11:
            for (iterator = sequenceParameterSetExts.iterator(); iterator.hasNext();)
            {
                break MISSING_BLOCK_LABEL_171;
            }

            l1 = l;
_L6:
            return l1;
_L2:
            l = l + 2L + (long)((byte[])iterator.next()).length;
              goto _L9
_L4:
            l = l + 2L + (long)((byte[])iterator.next()).length;
              goto _L10
            l = l + 2L + (long)((byte[])iterator.next()).length;
              goto _L11
        }

        public String[] getPPS()
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = pictureParameterSets.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return (String[])arraylist.toArray(new String[arraylist.size()]);
                }
                byte abyte0[] = (byte[])iterator.next();
                String s;
                try
                {
                    s = PictureParameterSet.read(new ByteArrayInputStream(abyte0, 1, abyte0.length - 1)).toString();
                }
                catch (IOException ioexception)
                {
                    throw new RuntimeException(ioexception);
                }
                arraylist.add(s);
            } while (true);
        }

        public List getPictureParameterSetsAsStrings()
        {
            ArrayList arraylist = new ArrayList(pictureParameterSets.size());
            Iterator iterator = pictureParameterSets.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                arraylist.add(Hex.encodeHex((byte[])iterator.next()));
            } while (true);
        }

        public String[] getSPS()
        {
            ArrayList arraylist;
            Iterator iterator;
            arraylist = new ArrayList();
            iterator = sequenceParameterSets.iterator();
_L2:
            String s;
            byte abyte0[];
            if (!iterator.hasNext())
            {
                return (String[])arraylist.toArray(new String[arraylist.size()]);
            }
            abyte0 = (byte[])iterator.next();
            s = "not parsable";
            String s1 = SeqParameterSet.read(new ByteArrayInputStream(abyte0, 1, abyte0.length - 1)).toString();
            s = s1;
_L3:
            arraylist.add(s);
            if (true) goto _L2; else goto _L1
_L1:
            IOException ioexception;
            ioexception;
              goto _L3
        }

        public List getSequenceParameterSetExtsAsStrings()
        {
            ArrayList arraylist = new ArrayList(sequenceParameterSetExts.size());
            Iterator iterator = sequenceParameterSetExts.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                arraylist.add(Hex.encodeHex((byte[])iterator.next()));
            } while (true);
        }

        public List getSequenceParameterSetsAsStrings()
        {
            ArrayList arraylist = new ArrayList(sequenceParameterSets.size());
            Iterator iterator = sequenceParameterSets.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return arraylist;
                }
                arraylist.add(Hex.encodeHex((byte[])iterator.next()));
            } while (true);
        }

        public AVCDecoderConfigurationRecord()
        {
            sequenceParameterSets = new ArrayList();
            pictureParameterSets = new ArrayList();
            hasExts = true;
            chromaFormat = 1;
            bitDepthLumaMinus8 = 0;
            bitDepthChromaMinus8 = 0;
            sequenceParameterSetExts = new ArrayList();
            lengthSizeMinusOnePaddingBits = 63;
            numberOfSequenceParameterSetsPaddingBits = 7;
            chromaFormatPaddingBits = 31;
            bitDepthLumaMinus8PaddingBits = 31;
            bitDepthChromaMinus8PaddingBits = 31;
        }

        public AVCDecoderConfigurationRecord(ByteBuffer bytebuffer)
        {
            int i;
            int j;
            sequenceParameterSets = new ArrayList();
            pictureParameterSets = new ArrayList();
            hasExts = true;
            chromaFormat = 1;
            bitDepthLumaMinus8 = 0;
            bitDepthChromaMinus8 = 0;
            sequenceParameterSetExts = new ArrayList();
            lengthSizeMinusOnePaddingBits = 63;
            numberOfSequenceParameterSetsPaddingBits = 7;
            chromaFormatPaddingBits = 31;
            bitDepthLumaMinus8PaddingBits = 31;
            bitDepthChromaMinus8PaddingBits = 31;
            configurationVersion = IsoTypeReader.readUInt8(bytebuffer);
            avcProfileIndication = IsoTypeReader.readUInt8(bytebuffer);
            profileCompatibility = IsoTypeReader.readUInt8(bytebuffer);
            avcLevelIndication = IsoTypeReader.readUInt8(bytebuffer);
            BitReaderBuffer bitreaderbuffer = new BitReaderBuffer(bytebuffer);
            lengthSizeMinusOnePaddingBits = bitreaderbuffer.readBits(6);
            lengthSizeMinusOne = bitreaderbuffer.readBits(2);
            numberOfSequenceParameterSetsPaddingBits = bitreaderbuffer.readBits(3);
            j = bitreaderbuffer.readBits(5);
            i = 0;
_L8:
            if (i < j) goto _L2; else goto _L1
_L1:
            long l;
            l = IsoTypeReader.readUInt8(bytebuffer);
            i = 0;
_L5:
            if ((long)i < l) goto _L4; else goto _L3
_L3:
            if (bytebuffer.remaining() < 4)
            {
                hasExts = false;
            }
            if (!hasExts || avcProfileIndication != 100 && avcProfileIndication != 110 && avcProfileIndication != 122 && avcProfileIndication != 144)
            {
                break MISSING_BLOCK_LABEL_420;
            }
            BitReaderBuffer bitreaderbuffer1 = new BitReaderBuffer(bytebuffer);
            chromaFormatPaddingBits = bitreaderbuffer1.readBits(6);
            chromaFormat = bitreaderbuffer1.readBits(2);
            bitDepthLumaMinus8PaddingBits = bitreaderbuffer1.readBits(5);
            bitDepthLumaMinus8 = bitreaderbuffer1.readBits(3);
            bitDepthChromaMinus8PaddingBits = bitreaderbuffer1.readBits(5);
            bitDepthChromaMinus8 = bitreaderbuffer1.readBits(3);
            l = IsoTypeReader.readUInt8(bytebuffer);
            i = 0;
_L6:
            if ((long)i >= l)
            {
                return;
            }
            break MISSING_BLOCK_LABEL_389;
_L2:
            byte abyte0[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
            bytebuffer.get(abyte0);
            sequenceParameterSets.add(abyte0);
            i++;
            continue; /* Loop/switch isn't completed */
_L4:
            byte abyte1[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
            bytebuffer.get(abyte1);
            pictureParameterSets.add(abyte1);
            i++;
              goto _L5
            byte abyte2[] = new byte[IsoTypeReader.readUInt16(bytebuffer)];
            bytebuffer.get(abyte2);
            sequenceParameterSetExts.add(abyte2);
            i++;
              goto _L6
            chromaFormat = -1;
            bitDepthLumaMinus8 = -1;
            bitDepthChromaMinus8 = -1;
            return;
            if (true) goto _L8; else goto _L7
_L7:
        }
    }


    public static final String TYPE = "avcC";
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
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    public AVCDecoderConfigurationRecord avcDecoderConfigurationRecord;

    public AvcConfigurationBox()
    {
        super("avcC");
        avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AvcConfigurationBox.java", com/coremedia/iso/boxes/h264/AvcConfigurationBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 58);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 94);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 98);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 102);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 106);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 110);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 114);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 118);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 122);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 126);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 130);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 62);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 134);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 138);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "boolean"), 142);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 146);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContentSize", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "long"), 157);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 163);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 168);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 172);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getavcDecoderConfigurationRecord", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "com.coremedia.iso.boxes.h264.AvcConfigurationBox$AVCDecoderConfigurationRecord"), 177);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 66);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 70);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 74);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 78);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 82);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 86);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 90);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord(bytebuffer);
    }

    public int getAvcLevelIndication()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.avcLevelIndication;
    }

    public int getAvcProfileIndication()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.avcProfileIndication;
    }

    public int getBitDepthChromaMinus8()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_18, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }

    public int getBitDepthLumaMinus8()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_16, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }

    public int getChromaFormat()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.chromaFormat;
    }

    public int getConfigurationVersion()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.configurationVersion;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_25, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.getContent(bytebuffer);
    }

    public long getContentSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_24, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getContentSize();
    }

    public int getLengthSizeMinusOne()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }

    public String[] getPPS()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_27, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getPPS();
    }

    public List getPictureParameterSets()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return Collections.unmodifiableList(avcDecoderConfigurationRecord.pictureParameterSets);
    }

    public int getProfileCompatibility()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.profileCompatibility;
    }

    public String[] getSPS()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_26, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.getSPS();
    }

    public List getSequenceParameterSetExts()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_20, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }

    public List getSequenceParameterSets()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return Collections.unmodifiableList(avcDecoderConfigurationRecord.sequenceParameterSets);
    }

    public AVCDecoderConfigurationRecord getavcDecoderConfigurationRecord()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_28, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord;
    }

    public boolean hasExts()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_22, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return avcDecoderConfigurationRecord.hasExts;
    }

    public void setAvcLevelIndication(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.avcLevelIndication = i;
    }

    public void setAvcProfileIndication(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.avcProfileIndication = i;
    }

    public void setBitDepthChromaMinus8(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.bitDepthChromaMinus8 = i;
    }

    public void setBitDepthLumaMinus8(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.bitDepthLumaMinus8 = i;
    }

    public void setChromaFormat(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.chromaFormat = i;
    }

    public void setConfigurationVersion(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.configurationVersion = i;
    }

    public void setHasExts(boolean flag)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_23, this, this, Conversions.booleanObject(flag));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.hasExts = flag;
    }

    public void setLengthSizeMinusOne(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.lengthSizeMinusOne = i;
    }

    public void setPictureParameterSets(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.pictureParameterSets = list;
    }

    public void setProfileCompatibility(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.profileCompatibility = i;
    }

    public void setSequenceParameterSetExts(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_21, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.sequenceParameterSetExts = list;
    }

    public void setSequenceParameterSets(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        avcDecoderConfigurationRecord.sequenceParameterSets = list;
    }

    static 
    {
        ajc$preClinit();
    }
}
