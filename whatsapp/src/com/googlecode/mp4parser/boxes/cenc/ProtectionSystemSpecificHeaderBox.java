// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.cenc;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.aspectj.runtime.reflect.Factory;

public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static byte OMA2_SYSTEM_ID[] = UUIDConverter.convert(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
    public static byte PLAYREADY_SYSTEM_ID[] = UUIDConverter.convert(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    public static final String TYPE = "pssh";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    byte content[];
    byte systemId[];

    public ProtectionSystemSpecificHeaderBox()
    {
        super("pssh");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("ProtectionSystemSpecificHeaderBox.java", com/googlecode/mp4parser/boxes/cenc/ProtectionSystemSpecificHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 38);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 47);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 51);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        systemId = new byte[16];
        bytebuffer.get(systemId);
        long l = IsoTypeReader.readUInt32(bytebuffer);
        content = new byte[bytebuffer.remaining()];
        bytebuffer.get(content);
        if (!$assertionsDisabled && l != (long)content.length)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (!$assertionsDisabled && systemId.length != 16)
        {
            throw new AssertionError();
        } else
        {
            bytebuffer.put(systemId, 0, 16);
            IsoTypeWriter.writeUInt32(bytebuffer, content.length);
            bytebuffer.put(content);
            return;
        }
    }

    public byte[] getContent()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return content;
    }

    protected long getContentSize()
    {
        return (long)(content.length + 24);
    }

    public byte[] getSystemId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return systemId;
    }

    public void setContent(byte abyte0[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        content = abyte0;
    }

    public void setSystemId(byte abyte0[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (!$assertionsDisabled && abyte0.length != 16)
        {
            throw new AssertionError();
        } else
        {
            systemId = abyte0;
            return;
        }
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/cenc/ProtectionSystemSpecificHeaderBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
