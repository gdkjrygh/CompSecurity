// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class UnknownBox extends AbstractBox
{

    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    ByteBuffer data;

    public UnknownBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("UnknownBox.java", com/coremedia/iso/boxes/UnknownBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        data = bytebuffer;
        bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        data.rewind();
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)data.limit();
    }

    public ByteBuffer getData()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return data;
    }

    public void setData(ByteBuffer bytebuffer)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        data = bytebuffer;
    }

    static 
    {
        ajc$preClinit();
    }
}
