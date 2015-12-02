// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class FreeSpaceBox extends AbstractBox
{

    public static final String TYPE = "skip";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    byte data[];

    public FreeSpaceBox()
    {
        super("skip");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("FreeSpaceBox.java", com/coremedia/iso/boxes/FreeSpaceBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", "data", "", "void"), 42);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        data = new byte[bytebuffer.remaining()];
        bytebuffer.get(data);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)data.length;
    }

    public byte[] getData()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return data;
    }

    public void setData(byte abyte0[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        data = abyte0;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("FreeSpaceBox[size=")).append(data.length).append(";type=").append(getType()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
