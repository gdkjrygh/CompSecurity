// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class TimeToSampleBox extends AbstractFullBox
{
    public static class Entry
    {

        long count;
        long delta;

        public long getCount()
        {
            return count;
        }

        public long getDelta()
        {
            return delta;
        }

        public void setCount(long l)
        {
            count = l;
        }

        public void setDelta(long l)
        {
            delta = l;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{count=")).append(count).append(", delta=").append(delta).append('}').toString();
        }

        public Entry(long l, long l1)
        {
            count = l;
            delta = l1;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String TYPE = "stts";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    List entries;

    public TimeToSampleBox()
    {
        super("stts");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("TimeToSampleBox.java", com/coremedia/iso/boxes/TimeToSampleBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 81);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 85);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 89);
    }

    public static long[] blowupTimeToSamples(List list)
    {
        long al[];
        int i;
        long l = 0L;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                if (!$assertionsDisabled && l > 0x7fffffffL)
                {
                    throw new AssertionError();
                }
                break;
            }
            l += ((Entry)iterator.next()).getCount();
        } while (true);
        al = new long[(int)l];
        i = 0;
        list = list.iterator();
_L2:
        if (!list.hasNext())
        {
            return al;
        }
        Entry entry = (Entry)list.next();
        int k = 0;
        int j = i;
        do
        {
            i = j;
            if ((long)k >= entry.getCount())
            {
                continue;
            }
            al[j] = entry.getDelta();
            k++;
            j++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        int j = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        entries = new ArrayList(j);
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            entries.add(new Entry(IsoTypeReader.readUInt32(bytebuffer), IsoTypeReader.readUInt32(bytebuffer)));
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Entry entry = (Entry)iterator.next();
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getCount());
            IsoTypeWriter.writeUInt32(bytebuffer, entry.getDelta());
        } while (true);
    }

    protected long getContentSize()
    {
        return (long)(entries.size() * 8 + 8);
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

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("TimeToSampleBox[entryCount=")).append(entries.size()).append("]").toString();
    }

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/TimeToSampleBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
