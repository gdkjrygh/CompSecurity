// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

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

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox
{

    public static final String TYPE = "saio";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private long auxInfoType;
    private long auxInfoTypeParameter;
    private List offsets;

    public SampleAuxiliaryInformationOffsetsBox()
    {
        super("saio");
        offsets = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SampleAuxiliaryInformationOffsetsBox.java", com/coremedia/iso/boxes/SampleAuxiliaryInformationOffsetsBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 108);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoType", "", "void"), 112);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 116);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoTypeParameter", "", "void"), 120);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "java.util.List", "offsets", "", "void"), 128);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if ((getFlags() & 1) == 1)
        {
            auxInfoType = IsoTypeReader.readUInt32(bytebuffer);
            auxInfoTypeParameter = IsoTypeReader.readUInt32(bytebuffer);
        }
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        offsets.clear();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            if (getVersion() == 0)
            {
                offsets.add(Long.valueOf(IsoTypeReader.readUInt32(bytebuffer)));
            } else
            {
                offsets.add(Long.valueOf(IsoTypeReader.readUInt64(bytebuffer)));
            }
            i++;
        } while (true);
    }

    public long getAuxInfoType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return auxInfoType;
    }

    public long getAuxInfoTypeParameter()
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
            IsoTypeWriter.writeUInt32(bytebuffer, auxInfoType);
            IsoTypeWriter.writeUInt32(bytebuffer, auxInfoTypeParameter);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, offsets.size());
        Iterator iterator = offsets.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Long long1 = (Long)iterator.next();
            if (getVersion() == 0)
            {
                IsoTypeWriter.writeUInt32(bytebuffer, long1.longValue());
            } else
            {
                IsoTypeWriter.writeUInt64(bytebuffer, long1.longValue());
            }
        } while (true);
    }

    protected long getContentSize()
    {
        int i;
        byte byte0;
        if (getVersion() == 0)
        {
            i = offsets.size() * 4;
        } else
        {
            i = offsets.size() * 8;
        }
        if ((getFlags() & 1) == 1)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        return (long)(byte0 + (i + 8));
    }

    public List getOffsets()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return offsets;
    }

    public void setAuxInfoType(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        auxInfoType = l;
    }

    public void setAuxInfoTypeParameter(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        auxInfoTypeParameter = l;
    }

    public void setOffsets(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        offsets = list;
    }

    static 
    {
        ajc$preClinit();
    }
}
