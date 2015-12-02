// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class FontTableBox extends AbstractBox
{
    public static class FontRecord
    {

        int fontId;
        String fontname;

        public void getContent(ByteBuffer bytebuffer)
        {
            IsoTypeWriter.writeUInt16(bytebuffer, fontId);
            IsoTypeWriter.writeUInt8(bytebuffer, fontname.length());
            bytebuffer.put(Utf8.convert(fontname));
        }

        public int getSize()
        {
            return Utf8.utf8StringLengthInBytes(fontname) + 3;
        }

        public void parse(ByteBuffer bytebuffer)
        {
            fontId = IsoTypeReader.readUInt16(bytebuffer);
            fontname = IsoTypeReader.readString(bytebuffer, IsoTypeReader.readUInt8(bytebuffer));
        }

        public String toString()
        {
            return (new StringBuilder("FontRecord{fontId=")).append(fontId).append(", fontname='").append(fontname).append('\'').append('}').toString();
        }

        public FontRecord()
        {
        }

        public FontRecord(int i, String s)
        {
            fontId = i;
            fontname = s;
        }
    }


    public static final String TYPE = "ftab";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    List entries;

    public FontTableBox()
    {
        super("ftab");
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("FontTableBox.java", com/googlecode/mp4parser/boxes/threegpp26245/FontTableBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int j = IsoTypeReader.readUInt16(bytebuffer);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            FontRecord fontrecord = new FontRecord();
            fontrecord.parse(bytebuffer);
            entries.add(fontrecord);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        IsoTypeWriter.writeUInt16(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((FontRecord)iterator.next()).getContent(bytebuffer);
        } while (true);
    }

    protected long getContentSize()
    {
        int i = 2;
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (long)i;
            }
            i += ((FontRecord)iterator.next()).getSize();
        } while (true);
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
    }

    static 
    {
        ajc$preClinit();
    }
}
