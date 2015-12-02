// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class SoundMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "smhd";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private float balance;

    public SoundMediaHeaderBox()
    {
        super("smhd");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SoundMediaHeaderBox.java", com/coremedia/iso/boxes/SoundMediaHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        balance = IsoTypeReader.readFixedPoint88(bytebuffer);
        IsoTypeReader.readUInt16(bytebuffer);
    }

    public float getBalance()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return balance;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeFixedPoint88(bytebuffer, balance);
        IsoTypeWriter.writeUInt16(bytebuffer, 0);
    }

    protected long getContentSize()
    {
        return 8L;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("SoundMediaHeaderBox[balance=")).append(getBalance()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
