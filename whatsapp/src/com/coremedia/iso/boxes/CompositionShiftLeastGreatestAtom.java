// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class CompositionShiftLeastGreatestAtom extends AbstractFullBox
{

    public static final String TYPE = "cslg";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    public CompositionShiftLeastGreatestAtom()
    {
        super("cslg");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("CompositionShiftLeastGreatestAtom.java", com/coremedia/iso/boxes/CompositionShiftLeastGreatestAtom);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 66);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 70);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 74);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "leastDisplayOffset", "", "void"), 78);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 82);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "greatestDisplayOffset", "", "void"), 86);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 90);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayStartTime", "", "void"), 94);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 98);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayEndTime", "", "void"), 102);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        compositionOffsetToDisplayOffsetShift = bytebuffer.getInt();
        leastDisplayOffset = bytebuffer.getInt();
        greatestDisplayOffset = bytebuffer.getInt();
        displayStartTime = bytebuffer.getInt();
        displayEndTime = bytebuffer.getInt();
    }

    public int getCompositionOffsetToDisplayOffsetShift()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return compositionOffsetToDisplayOffsetShift;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.putInt(compositionOffsetToDisplayOffsetShift);
        bytebuffer.putInt(leastDisplayOffset);
        bytebuffer.putInt(greatestDisplayOffset);
        bytebuffer.putInt(displayStartTime);
        bytebuffer.putInt(displayEndTime);
    }

    protected long getContentSize()
    {
        return 24L;
    }

    public int getDisplayEndTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return displayEndTime;
    }

    public int getDisplayStartTime()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return displayStartTime;
    }

    public int getGreatestDisplayOffset()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return greatestDisplayOffset;
    }

    public int getLeastDisplayOffset()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return leastDisplayOffset;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        compositionOffsetToDisplayOffsetShift = i;
    }

    public void setDisplayEndTime(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        displayEndTime = i;
    }

    public void setDisplayStartTime(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        displayStartTime = i;
    }

    public void setGreatestDisplayOffset(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        greatestDisplayOffset = i;
    }

    public void setLeastDisplayOffset(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        leastDisplayOffset = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
