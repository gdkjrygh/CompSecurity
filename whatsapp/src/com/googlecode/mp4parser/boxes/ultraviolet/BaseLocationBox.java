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

public class BaseLocationBox extends AbstractFullBox
{

    public static final String TYPE = "bloc";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    String baseLocation;
    String purchaseLocation;

    public BaseLocationBox()
    {
        super("bloc");
        baseLocation = "";
        purchaseLocation = "";
    }

    public BaseLocationBox(String s, String s1)
    {
        super("bloc");
        baseLocation = "";
        purchaseLocation = "";
        baseLocation = s;
        purchaseLocation = s1;
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("BaseLocationBox.java", com/googlecode/mp4parser/boxes/ultraviolet/BaseLocationBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.ultraviolet.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        baseLocation = IsoTypeReader.readString(bytebuffer);
        bytebuffer.get(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation) - 1]);
        purchaseLocation = IsoTypeReader.readString(bytebuffer);
        bytebuffer.get(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation) - 1]);
        bytebuffer.get(new byte[512]);
    }

    public boolean equals(Object obj)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BaseLocationBox)obj;
            if (baseLocation == null ? ((BaseLocationBox) (obj)).baseLocation != null : !baseLocation.equals(((BaseLocationBox) (obj)).baseLocation))
            {
                return false;
            }
            if (purchaseLocation == null ? ((BaseLocationBox) (obj)).purchaseLocation != null : !purchaseLocation.equals(((BaseLocationBox) (obj)).purchaseLocation))
            {
                return false;
            }
        }
        return true;
    }

    public String getBaseLocation()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return baseLocation;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(Utf8.convert(baseLocation));
        bytebuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation)]);
        bytebuffer.put(Utf8.convert(purchaseLocation));
        bytebuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation)]);
        bytebuffer.put(new byte[512]);
    }

    protected long getContentSize()
    {
        return 1028L;
    }

    public String getPurchaseLocation()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return purchaseLocation;
    }

    public int hashCode()
    {
        int j = 0;
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        int i;
        if (baseLocation != null)
        {
            i = baseLocation.hashCode();
        } else
        {
            i = 0;
        }
        if (purchaseLocation != null)
        {
            j = purchaseLocation.hashCode();
        }
        return i * 31 + j;
    }

    public void setBaseLocation(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        baseLocation = s;
    }

    public void setPurchaseLocation(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        purchaseLocation = s;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("BaseLocationBox{baseLocation='")).append(baseLocation).append('\'').append(", purchaseLocation='").append(purchaseLocation).append('\'').append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
