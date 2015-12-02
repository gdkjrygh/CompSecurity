// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.runtime.reflect.Factory;

public class AbstractDescriptorBox extends AbstractFullBox
{

    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static Logger log = Logger.getLogger(com/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox.getName());
    public ByteBuffer data;
    public BaseDescriptor descriptor;

    public AbstractDescriptorBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AbstractDescriptorBox.java", com/googlecode/mp4parser/boxes/mp4/AbstractDescriptorBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 58);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 62);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 66);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        data = bytebuffer.slice();
        bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
        try
        {
            data.rewind();
            descriptor = ObjectDescriptorFactory.createFrom(-1, data);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", bytebuffer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", bytebuffer);
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        data.rewind();
        bytebuffer.put(data);
    }

    protected long getContentSize()
    {
        return (long)(data.limit() + 4);
    }

    public BaseDescriptor getDescriptor()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return descriptor;
    }

    public String getDescriptorAsString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return descriptor.toString();
    }

    public void setData(ByteBuffer bytebuffer)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, bytebuffer);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        data = bytebuffer;
    }

    public void setDescriptor(BaseDescriptor basedescriptor)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this, basedescriptor);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        descriptor = basedescriptor;
    }

    static 
    {
        ajc$preClinit();
    }
}
