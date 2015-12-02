// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

public class LocationInformationBox extends AbstractFullBox
{

    public static final String TYPE = "loci";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_14;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_15;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    public LocationInformationBox()
    {
        super("loci");
        name = "";
        astronomicalBody = "";
        additionalNotes = "";
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("LocationInformationBox.java", com/coremedia/iso/boxes/threegpp26244/LocationInformationBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        name = IsoTypeReader.readString(bytebuffer);
        role = IsoTypeReader.readUInt8(bytebuffer);
        longitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        latitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        altitude = IsoTypeReader.readFixedPoint1616(bytebuffer);
        astronomicalBody = IsoTypeReader.readString(bytebuffer);
        additionalNotes = IsoTypeReader.readString(bytebuffer);
    }

    public String getAdditionalNotes()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_14, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return additionalNotes;
    }

    public double getAltitude()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return altitude;
    }

    public String getAstronomicalBody()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return astronomicalBody;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        bytebuffer.put(Utf8.convert(name));
        bytebuffer.put((byte)0);
        IsoTypeWriter.writeUInt8(bytebuffer, role);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, longitude);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, latitude);
        IsoTypeWriter.writeFixedPoint1616(bytebuffer, altitude);
        bytebuffer.put(Utf8.convert(astronomicalBody));
        bytebuffer.put((byte)0);
        bytebuffer.put(Utf8.convert(additionalNotes));
        bytebuffer.put((byte)0);
    }

    protected long getContentSize()
    {
        return (long)(Utf8.convert(name).length + 22 + Utf8.convert(astronomicalBody).length + Utf8.convert(additionalNotes).length);
    }

    public String getLanguage()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return language;
    }

    public double getLatitude()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return latitude;
    }

    public double getLongitude()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return longitude;
    }

    public String getName()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return name;
    }

    public int getRole()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return role;
    }

    public void setAdditionalNotes(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_15, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        additionalNotes = s;
    }

    public void setAltitude(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        altitude = d;
    }

    public void setAstronomicalBody(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_13, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        astronomicalBody = s;
    }

    public void setLanguage(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        language = s;
    }

    public void setLatitude(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        latitude = d;
    }

    public void setLongitude(double d)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.doubleObject(d));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        longitude = d;
    }

    public void setName(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        name = s;
    }

    public void setRole(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        role = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
