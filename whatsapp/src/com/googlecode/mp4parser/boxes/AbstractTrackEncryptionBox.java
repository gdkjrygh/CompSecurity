// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public abstract class AbstractTrackEncryptionBox extends AbstractFullBox
{

    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte default_KID[];

    protected AbstractTrackEncryptionBox(String s)
    {
        super(s);
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AbstractTrackEncryptionBox.java", com/googlecode/mp4parser/boxes/AbstractTrackEncryptionBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 24);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"), 28);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 32);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"), 36);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "[B", "default_KID", "", "void"), 46);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 73);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "int"), 87);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        defaultAlgorithmId = IsoTypeReader.readUInt24(bytebuffer);
        defaultIvSize = IsoTypeReader.readUInt8(bytebuffer);
        default_KID = new byte[16];
        bytebuffer.get(default_KID);
    }

    public boolean equals(Object obj)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AbstractTrackEncryptionBox)obj;
            if (defaultAlgorithmId != ((AbstractTrackEncryptionBox) (obj)).defaultAlgorithmId)
            {
                return false;
            }
            if (defaultIvSize != ((AbstractTrackEncryptionBox) (obj)).defaultIvSize)
            {
                return false;
            }
            if (!Arrays.equals(default_KID, ((AbstractTrackEncryptionBox) (obj)).default_KID))
            {
                return false;
            }
        }
        return true;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt24(bytebuffer, defaultAlgorithmId);
        IsoTypeWriter.writeUInt8(bytebuffer, defaultIvSize);
        bytebuffer.put(default_KID);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public int getDefaultAlgorithmId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultAlgorithmId;
    }

    public int getDefaultIvSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultIvSize;
    }

    public String getDefault_KID()
    {
        Object obj = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = ByteBuffer.wrap(default_KID);
        ((ByteBuffer) (obj)).order(ByteOrder.BIG_ENDIAN);
        return (new UUID(((ByteBuffer) (obj)).getLong(), ((ByteBuffer) (obj)).getLong())).toString();
    }

    public int hashCode()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        int j = defaultAlgorithmId;
        int k = defaultIvSize;
        int i;
        if (default_KID != null)
        {
            i = Arrays.hashCode(default_KID);
        } else
        {
            i = 0;
        }
        return (j * 31 + k) * 31 + i;
    }

    public void setDefaultAlgorithmId(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        defaultAlgorithmId = i;
    }

    public void setDefaultIvSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        defaultIvSize = i;
    }

    public void setDefault_KID(byte abyte0[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        default_KID = abyte0;
    }

    static 
    {
        ajc$preClinit();
    }
}
