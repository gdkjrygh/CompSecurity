// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox
{

    public static final String TYPE = "tfdt";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private long baseMediaDecodeTime;

    public TrackFragmentBaseMediaDecodeTimeBox()
    {
        super("tfdt");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrackFragmentBaseMediaDecodeTimeBox.java", com/coremedia/iso/boxes/fragment/TrackFragmentBaseMediaDecodeTimeBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            baseMediaDecodeTime = IsoTypeReader.readUInt64(bytebuffer);
            return;
        } else
        {
            baseMediaDecodeTime = IsoTypeReader.readUInt32(bytebuffer);
            return;
        }
    }

    public long getBaseMediaDecodeTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return baseMediaDecodeTime;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt64(bytebuffer, baseMediaDecodeTime);
            return;
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, baseMediaDecodeTime);
            return;
        }
    }

    protected long getContentSize()
    {
        int i;
        if (getVersion() == 0)
        {
            i = 8;
        } else
        {
            i = 12;
        }
        return (long)i;
    }

    public void setBaseMediaDecodeTime(long l)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(l));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        baseMediaDecodeTime = l;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=")).append(baseMediaDecodeTime).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
