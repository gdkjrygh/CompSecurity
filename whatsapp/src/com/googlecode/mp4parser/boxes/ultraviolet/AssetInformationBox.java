// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.ultraviolet;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class AssetInformationBox extends AbstractFullBox
{

    static final boolean $assertionsDisabled;
    public static final String TYPE = "ainf";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    String apid;
    String profileVersion;

    public AssetInformationBox()
    {
        super("ainf");
        apid = "";
        profileVersion = "0000";
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AssetInformationBox.java", com/googlecode/mp4parser/boxes/ultraviolet/AssetInformationBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "apid", "", "void"), 66);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 70);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 74);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        profileVersion = IsoTypeReader.readString(bytebuffer, 4);
        apid = IsoTypeReader.readString(bytebuffer);
    }

    public String getApid()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return apid;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(Utf8.convert(profileVersion), 0, 4);
        bytebuffer.put(Utf8.convert(apid));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.utf8StringLengthInBytes(apid) + 9);
    }

    public String getProfileVersion()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return profileVersion;
    }

    public void setApid(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        apid = s;
    }

    public void setProfileVersion(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (!$assertionsDisabled && (s == null || s.length() != 4))
        {
            throw new AssertionError();
        } else
        {
            profileVersion = s;
            return;
        }
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/googlecode/mp4parser/boxes/ultraviolet/AssetInformationBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
