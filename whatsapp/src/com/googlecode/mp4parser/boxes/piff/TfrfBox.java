// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class TfrfBox extends AbstractFullBox
{
    public class Entry
    {

        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;
        final TfrfBox this$0;

        public long getFragmentAbsoluteDuration()
        {
            return fragmentAbsoluteDuration;
        }

        public long getFragmentAbsoluteTime()
        {
            return fragmentAbsoluteTime;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Entry");
            stringbuilder.append("{fragmentAbsoluteTime=").append(fragmentAbsoluteTime);
            stringbuilder.append(", fragmentAbsoluteDuration=").append(fragmentAbsoluteDuration);
            stringbuilder.append('}');
            return stringbuilder.toString();
        }

        public Entry()
        {
            this$0 = TfrfBox.this;
            super();
        }
    }


    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    public List entries;

    public TfrfBox()
    {
        super("uuid");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TfrfBox.java", com/googlecode/mp4parser/boxes/piff/TfrfBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "long"), 91);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = IsoTypeReader.readUInt8(bytebuffer);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            Entry entry = new Entry();
            if (getVersion() == 1)
            {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt64(bytebuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(bytebuffer);
            } else
            {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt32(bytebuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(bytebuffer);
            }
            entries.add(entry);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt8(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            if (getVersion() == 1)
            {
                IsoTypeWriter.writeUInt64(bytebuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt64(bytebuffer, entry.fragmentAbsoluteDuration);
            } else
            {
                IsoTypeWriter.writeUInt32(bytebuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt32(bytebuffer, entry.fragmentAbsoluteDuration);
            }
        } while (true);
    }

    protected long getContentSize()
    {
        int i = entries.size();
        byte byte0;
        if (getVersion() == 1)
        {
            byte0 = 16;
        } else
        {
            byte0 = 8;
        }
        return (long)(byte0 * i + 5);
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public long getFragmentCount()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (long)entries.size();
    }

    public byte[] getUserType()
    {
        return (new byte[] {
            -44, -128, 126, -14, -54, 57, 70, -107, -114, 84, 
            38, -53, -98, 70, -89, -97
        });
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("TfrfBox");
        ((StringBuilder) (obj)).append("{entries=").append(entries);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
