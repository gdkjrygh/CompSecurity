// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class CleanApertureAtom extends AbstractFullBox
{

    public static final String TYPE = "clef";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    double height;
    double width;

    public CleanApertureAtom()
    {
        super("clef");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("CleanApertureAtom.java", com/googlecode/mp4parser/boxes/apple/CleanApertureAtom);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"), 45);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "double", "width", "", "void"), 49);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"), 53);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.CleanApertureAtom", "double", "height", "", "void"), 57);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        width = IsoTypeReader.readFixedPoint1616(bytebuffer);
        height = IsoTypeReader.readFixedPoint1616(bytebuffer);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, width);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, height);
    }

    protected long getContentSize()
    {
        return 12L;
    }

    public double getHeight()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return height;
    }

    public double getWidth()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return width;
    }

    public void setHeight(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        height = d;
    }

    public void setWidth(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        width = d;
    }

    static 
    {
        ajc$preClinit();
    }
}
