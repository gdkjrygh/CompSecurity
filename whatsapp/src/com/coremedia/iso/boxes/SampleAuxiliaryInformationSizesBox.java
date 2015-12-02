// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "saiz";
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
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private int defaultSampleInfoSize;
    private int sampleCount;
    private List sampleInfoSizes;

    public SampleAuxiliaryInformationSizesBox()
    {
        super("saiz");
        sampleInfoSizes = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SampleAuxiliaryInformationSizesBox.java", com/coremedia/iso/boxes/SampleAuxiliaryInformationSizesBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 98);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 102);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 140);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 106);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 110);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 114);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 118);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.util.List"), 123);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.util.List", "sampleInfoSizes", "", "void"), 127);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 131);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 135);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            auxInfoType = IsoTypeReader.read4cc(bytebuffer);
            auxInfoTypeParameter = IsoTypeReader.read4cc(bytebuffer);
        }
        defaultSampleInfoSize = (short)IsoTypeReader.readUInt8(bytebuffer);
        sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        sampleInfoSizes.clear();
        if (defaultSampleInfoSize != 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < sampleCount) goto _L3; else goto _L2
_L2:
        return;
_L3:
        sampleInfoSizes.add(Short.valueOf((short)IsoTypeReader.readUInt8(bytebuffer)));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String getAuxInfoType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return auxInfoType;
    }

    public String getAuxInfoTypeParameter()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return auxInfoTypeParameter;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            bytebuffer.put(IsoFile.fourCCtoBytes(auxInfoType));
            bytebuffer.put(IsoFile.fourCCtoBytes(auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt8(bytebuffer, defaultSampleInfoSize);
        if (defaultSampleInfoSize == 0)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, sampleInfoSizes.size());
            Iterator iterator = sampleInfoSizes.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                IsoTypeWriter.writeUInt8(bytebuffer, ((Short)iterator.next()).shortValue());
            } while (true);
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, sampleCount);
            return;
        }
    }

    protected long getContentSize()
    {
        int i = 4;
        if ((getFlags() & 1) == 1)
        {
            i = 4 + 8;
        }
        int j;
        if (defaultSampleInfoSize == 0)
        {
            j = sampleInfoSizes.size();
        } else
        {
            j = 0;
        }
        return (long)(i + 5 + j);
    }

    public int getDefaultSampleInfoSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultSampleInfoSize;
    }

    public int getSampleCount()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return sampleCount;
    }

    public List getSampleInfoSizes()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return sampleInfoSizes;
    }

    public void setAuxInfoType(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        auxInfoType = s;
    }

    public void setAuxInfoTypeParameter(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        auxInfoTypeParameter = s;
    }

    public void setDefaultSampleInfoSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (!$assertionsDisabled && i > 255)
        {
            throw new AssertionError();
        } else
        {
            defaultSampleInfoSize = i;
            return;
        }
    }

    public void setSampleCount(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        sampleCount = i;
    }

    public void setSampleInfoSizes(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        sampleInfoSizes = list;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=")).append(defaultSampleInfoSize).append(", sampleCount=").append(sampleCount).append(", auxInfoType='").append(auxInfoType).append('\'').append(", auxInfoTypeParameter='").append(auxInfoTypeParameter).append('\'').append('}').toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/SampleAuxiliaryInformationSizesBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
