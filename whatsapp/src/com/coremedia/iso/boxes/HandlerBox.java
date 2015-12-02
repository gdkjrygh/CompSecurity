// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.runtime.reflect.Factory;

public class HandlerBox extends AbstractFullBox
{

    public static final String TYPE = "hdlr";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    public static final Map readableTypes;
    private long a;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    public HandlerBox()
    {
        super("hdlr");
        name = null;
        zeroTerm = true;
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("HandlerBox.java", com/coremedia/iso/boxes/HandlerBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        shouldBeZeroButAppleWritesHereSomeValue = IsoTypeReader.readUInt32(bytebuffer);
        handlerType = IsoTypeReader.read4cc(bytebuffer);
        a = IsoTypeReader.readUInt32(bytebuffer);
        b = IsoTypeReader.readUInt32(bytebuffer);
        c = IsoTypeReader.readUInt32(bytebuffer);
        if (bytebuffer.remaining() > 0)
        {
            name = IsoTypeReader.readString(bytebuffer, bytebuffer.remaining());
            if (name.endsWith("\0"))
            {
                name = name.substring(0, name.length() - 1);
                zeroTerm = true;
                return;
            } else
            {
                zeroTerm = false;
                return;
            }
        } else
        {
            zeroTerm = false;
            return;
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, shouldBeZeroButAppleWritesHereSomeValue);
        bytebuffer.put(IsoFile.fourCCtoBytes(handlerType));
        IsoTypeWriter.writeUInt32(bytebuffer, a);
        IsoTypeWriter.writeUInt32(bytebuffer, b);
        IsoTypeWriter.writeUInt32(bytebuffer, c);
        if (name != null)
        {
            bytebuffer.put(Utf8.convert(name));
        }
        if (zeroTerm)
        {
            bytebuffer.put((byte)0);
        }
    }

    protected long getContentSize()
    {
        if (zeroTerm)
        {
            return (long)(Utf8.utf8StringLengthInBytes(name) + 25);
        } else
        {
            return (long)(Utf8.utf8StringLengthInBytes(name) + 24);
        }
    }

    public String getHandlerType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return handlerType;
    }

    public String getHumanReadableTrackType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (readableTypes.get(handlerType) != null)
        {
            return (String)readableTypes.get(handlerType);
        } else
        {
            return "Unknown Handler Type";
        }
    }

    public String getName()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return name;
    }

    public void setHandlerType(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        handlerType = s;
    }

    public void setName(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        name = s;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("HandlerBox[handlerType=")).append(getHandlerType()).append(";name=").append(getName()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        HashMap hashmap = new HashMap();
        hashmap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashmap.put("mdir", "Apple Meta Data iTunes Reader");
        hashmap.put("mp7b", "MPEG-7 binary XML");
        hashmap.put("mp7t", "MPEG-7 XML");
        hashmap.put("vide", "Video Track");
        hashmap.put("soun", "Sound Track");
        hashmap.put("hint", "Hint Track");
        hashmap.put("appl", "Apple specific");
        hashmap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(hashmap);
    }
}
