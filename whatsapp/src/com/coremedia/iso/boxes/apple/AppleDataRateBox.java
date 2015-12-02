// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class AppleDataRateBox extends AbstractFullBox
{

    public static final String TYPE = "rmdr";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private long dataRate;

    public AppleDataRateBox()
    {
        super("rmdr");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AppleDataRateBox.java", com/coremedia/iso/boxes/apple/AppleDataRateBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        dataRate = IsoTypeReader.readUInt32(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, dataRate);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public long getDataRate()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return dataRate;
    }

    static 
    {
        ajc$preClinit();
    }
}
