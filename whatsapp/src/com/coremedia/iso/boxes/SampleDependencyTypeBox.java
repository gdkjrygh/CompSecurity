// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.runtime.reflect.Factory;

public class SampleDependencyTypeBox extends AbstractFullBox
{
    public static class Entry
    {

        private int value;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (value != ((Entry) (obj)).value)
                {
                    return false;
                }
            }
            return true;
        }

        public int getReserved()
        {
            return value >> 6 & 3;
        }

        public int getSampleDependsOn()
        {
            return value >> 4 & 3;
        }

        public int getSampleHasRedundancy()
        {
            return value & 3;
        }

        public int getSampleIsDependentOn()
        {
            return value >> 2 & 3;
        }

        public int hashCode()
        {
            return value;
        }

        public void setReserved(int i)
        {
            value = (i & 3) << 6 | value & 0x3f;
        }

        public void setSampleDependsOn(int i)
        {
            value = (i & 3) << 4 | value & 0xcf;
        }

        public void setSampleHasRedundancy(int i)
        {
            value = i & 3 | value & 0xfc;
        }

        public void setSampleIsDependentOn(int i)
        {
            value = (i & 3) << 2 | value & 0xf3;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{reserved=")).append(getReserved()).append(", sampleDependsOn=").append(getSampleDependsOn()).append(", sampleIsDependentOn=").append(getSampleIsDependentOn()).append(", sampleHasRedundancy=").append(getSampleHasRedundancy()).append('}').toString();
        }


        public Entry(int i)
        {
            value = i;
        }
    }


    public static final String TYPE = "sdtp";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private List entries;

    public SampleDependencyTypeBox()
    {
        super("sdtp");
        entries = new ArrayList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SampleDependencyTypeBox.java", com/coremedia/iso/boxes/SampleDependencyTypeBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
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
        Object obj = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("SampleDependencyTypeBox");
        ((StringBuilder) (obj)).append("{entries=").append(entries);
        ((StringBuilder) (obj)).append('}');
        return ((StringBuilder) (obj)).toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
