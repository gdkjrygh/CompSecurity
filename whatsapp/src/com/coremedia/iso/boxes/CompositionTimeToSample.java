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

public class CompositionTimeToSample extends AbstractFullBox
{
    public static class Entry
    {

        int count;
        int offset;

        public int getCount()
        {
            return count;
        }

        public int getOffset()
        {
            return offset;
        }

        public void setCount(int i)
        {
            count = i;
        }

        public void setOffset(int i)
        {
            offset = i;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{count=")).append(count).append(", offset=").append(offset).append('}').toString();
        }

        public Entry(int i, int j)
        {
            count = i;
            offset = j;
        }
    }


    static final boolean $assertionsDisabled;
    public static final String TYPE = "ctts";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    List entries;

    public CompositionTimeToSample()
    {
        super("ctts");
        entries = Collections.emptyList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("CompositionTimeToSample.java", com/coremedia/iso/boxes/CompositionTimeToSample);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "", "void"), 61);
    }

    public static int[] blowupCompositionTimes(List list)
    {
        int ai[];
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
        ai = new int[(int)l];
        i = 0;
        list = list.iterator();
_L2:
        if (!list.hasNext())
        {
            return ai;
        }
        Entry entry = (Entry)list.next();
        int k = 0;
        int j = i;
        do
        {
            i = j;
            if (k >= entry.getCount())
            {
                continue;
            }
            ai[j] = entry.getOffset();
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
            Entry entry = new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer)), bytebuffer.getInt());
            entries.add(entry);
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
            bytebuffer.putInt(entry.getOffset());
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

    static 
    {
        ajc$preClinit();
        boolean flag;
        if (!com/coremedia/iso/boxes/CompositionTimeToSample.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
