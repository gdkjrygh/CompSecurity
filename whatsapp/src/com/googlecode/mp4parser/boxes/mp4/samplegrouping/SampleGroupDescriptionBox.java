// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            RollRecoveryEntry, GroupEntry, RateShareEntry, CencSampleEncryptionInformationGroupEntry, 
//            VisualRandomAccessEntry, TemporalLevelEntry, UnknownEntry

public class SampleGroupDescriptionBox extends AbstractFullBox
{

    public static final String TYPE = "sgpd";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private int defaultLength;
    private int descriptionLength;
    private List groupEntries;
    private String groupingType;

    public SampleGroupDescriptionBox()
    {
        super("sgpd");
        groupEntries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("SampleGroupDescriptionBox.java", com/googlecode/mp4parser/boxes/mp4/samplegrouping/SampleGroupDescriptionBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 135);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 139);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 143);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 147);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 155);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 160);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 184);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 192);
    }

    private GroupEntry parseGroupEntry(ByteBuffer bytebuffer, String s)
    {
        if ("roll".equals(s))
        {
            s = new RollRecoveryEntry();
        } else
        if ("rash".equals(s))
        {
            s = new RateShareEntry();
        } else
        if ("seig".equals(s))
        {
            s = new CencSampleEncryptionInformationGroupEntry();
        } else
        if ("rap ".equals(s))
        {
            s = new VisualRandomAccessEntry();
        } else
        if ("tele".equals(s))
        {
            s = new TemporalLevelEntry();
        } else
        {
            s = new UnknownEntry();
        }
        s.parse(bytebuffer);
        return s;
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        if (getVersion() != 1)
        {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        groupingType = IsoTypeReader.read4cc(bytebuffer);
        if (getVersion() == 1)
        {
            defaultLength = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        }
        long l = IsoTypeReader.readUInt32(bytebuffer);
        do
        {
            if (l <= 0L)
            {
                return;
            }
            int i = defaultLength;
            if (getVersion() == 1)
            {
                if (defaultLength == 0)
                {
                    descriptionLength = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
                    i = descriptionLength;
                }
                int j = bytebuffer.position();
                ByteBuffer bytebuffer1 = bytebuffer.slice();
                bytebuffer1.limit(i);
                groupEntries.add(parseGroupEntry(bytebuffer1, groupingType));
                bytebuffer.position(j + i);
                l--;
            } else
            {
                throw new RuntimeException("This should be implemented");
            }
        } while (true);
    }

    public boolean equals(Object obj)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SampleGroupDescriptionBox)obj;
            if (defaultLength != ((SampleGroupDescriptionBox) (obj)).defaultLength)
            {
                return false;
            }
            if (groupEntries == null ? ((SampleGroupDescriptionBox) (obj)).groupEntries != null : !groupEntries.equals(((SampleGroupDescriptionBox) (obj)).groupEntries))
            {
                return false;
            }
            if (groupingType == null ? ((SampleGroupDescriptionBox) (obj)).groupingType != null : !groupingType.equals(((SampleGroupDescriptionBox) (obj)).groupingType))
            {
                return false;
            }
        }
        return true;
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        bytebuffer.put(groupingType.getBytes());
        if (getVersion() == 1)
        {
            IsoTypeWriter.writeUInt32(bytebuffer, defaultLength);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, groupEntries.size());
        Iterator iterator = groupEntries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            GroupEntry groupentry = (GroupEntry)iterator.next();
            if (getVersion() == 1 && defaultLength == 0)
            {
                IsoTypeWriter.writeUInt32(bytebuffer, groupentry.get().limit());
            }
            bytebuffer.put(groupentry.get());
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 8L;
        if (getVersion() == 1)
        {
            l = 8L + 4L;
        }
        l += 4L;
        Iterator iterator = groupEntries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            GroupEntry groupentry = (GroupEntry)iterator.next();
            long l1 = l;
            if (getVersion() == 1)
            {
                l1 = l;
                if (defaultLength == 0)
                {
                    l1 = l + 4L;
                }
            }
            l = l1 + (long)groupentry.size();
        } while (true);
    }

    public int getDefaultLength()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return defaultLength;
    }

    public List getGroupEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return groupEntries;
    }

    public String getGroupingType()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return groupingType;
    }

    public int hashCode()
    {
        int j = 0;
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        int i;
        int k;
        if (groupingType != null)
        {
            i = groupingType.hashCode();
        } else
        {
            i = 0;
        }
        k = defaultLength;
        if (groupEntries != null)
        {
            j = groupEntries.hashCode();
        }
        return (i * 31 + k) * 31 + j;
    }

    public void setDefaultLength(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        defaultLength = i;
    }

    public void setGroupEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        groupEntries = list;
    }

    public void setGroupingType(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        groupingType = s;
    }

    public String toString()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return (new StringBuilder("SampleGroupDescriptionBox{groupingType='")).append(groupingType).append('\'').append(", defaultLength=").append(defaultLength).append(", groupEntries=").append(groupEntries).append('}').toString();
    }

    static 
    {
        ajc$preClinit();
    }
}
