// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class TrickPlayBox extends AbstractFullBox
{
    public static class Entry
    {

        private int value;

        public int getDependencyLevel()
        {
            return value & 0x3f;
        }

        public int getPicType()
        {
            return value >> 6 & 3;
        }

        public void setDependencyLevel(int i)
        {
            value = i & 0x3f | value;
        }

        public void setPicType(int i)
        {
            value = value & 0x1f;
            value = (i & 3) << 6 | value;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Entry");
            stringbuilder.append("{picType=").append(getPicType());
            stringbuilder.append(",dependencyLevel=").append(getDependencyLevel());
            stringbuilder.append('}');
            return stringbuilder.toString();
        }


        public Entry()
        {
        }

        public Entry(int i)
        {
            value = i;
        }
    }


    public static final String TYPE = "trik";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private List entries;

    public TrickPlayBox()
    {
        super("trik");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TrickPlayBox.java", com/coremedia/iso/boxes/dece/TrickPlayBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        do
        {
            if (bytebuffer.remaining() <= 0)
            {
                return;
            }
            entries.add(new Entry(IsoTypeReader.readUInt8(bytebuffer)));
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            IsoTypeWriter.writeUInt8(bytebuffer, ((Entry)iterator.next()).value);
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() + 4);
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TrickPlayBox");
        ((StringBuilder) (obj)).append("{entries=").append(entries);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
