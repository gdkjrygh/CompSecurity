// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class AppleDataReferenceBox extends AbstractFullBox
{

    public static final String TYPE = "rdrf";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    public AppleDataReferenceBox()
    {
        super("rdrf");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AppleDataReferenceBox.java", com/coremedia/iso/boxes/apple/AppleDataReferenceBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        dataReferenceType = IsoTypeReader.read4cc(bytebuffer);
        dataReferenceSize = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        dataReference = IsoTypeReader.readString(bytebuffer, dataReferenceSize);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(IsoFile.fourCCtoBytes(dataReferenceType));
        IsoTypeWriter.writeUInt32(bytebuffer, dataReferenceSize);
        bytebuffer.put(Utf8.convert(dataReference));
    }

    protected long getContentSize()
    {
        return (long)(dataReferenceSize + 12);
    }

    public String getDataReference()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return dataReference;
    }

    public long getDataReferenceSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (long)dataReferenceSize;
    }

    public String getDataReferenceType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return dataReferenceType;
    }

    static 
    {
        ajc$preClinit();
    }
}
