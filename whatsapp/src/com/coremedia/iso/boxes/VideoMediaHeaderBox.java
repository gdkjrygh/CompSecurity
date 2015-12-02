// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.coremedia.iso.boxes:
//            AbstractMediaHeaderBox

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox
{

    public static final String TYPE = "vmhd";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private int graphicsmode;
    private int opcolor[];

    public VideoMediaHeaderBox()
    {
        super("vmhd");
        graphicsmode = 0;
        opcolor = new int[3];
        setFlags(1);
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("VideoMediaHeaderBox.java", com/coremedia/iso/boxes/VideoMediaHeaderBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        graphicsmode = IsoTypeReader.readUInt16(bytebuffer);
        opcolor = new int[3];
        int i = 0;
        do
        {
            if (i >= 3)
            {
                return;
            }
            opcolor[i] = IsoTypeReader.readUInt16(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt16(bytebuffer, graphicsmode);
        int ai[] = opcolor;
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            IsoTypeWriter.writeUInt16(bytebuffer, ai[i]);
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        return 12L;
    }

    public int getGraphicsmode()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return graphicsmode;
    }

    public int[] getOpcolor()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return opcolor;
    }

    public void setGraphicsmode(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        graphicsmode = i;
    }

    public void setOpcolor(int ai[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, ai);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        opcolor = ai;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("VideoMediaHeaderBox[graphicsmode=")).append(getGraphicsmode()).append(";opcolor0=").append(getOpcolor()[0]).append(";opcolor1=").append(getOpcolor()[1]).append(";opcolor2=").append(getOpcolor()[2]).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
