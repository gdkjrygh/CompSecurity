// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;


// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            SampleToGroupBox

public static class groupDescriptionIndex
{

    private int groupDescriptionIndex;
    private long sampleCount;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (groupDescriptionIndex)obj;
            if (groupDescriptionIndex != ((groupDescriptionIndex) (obj)).groupDescriptionIndex)
            {
                return false;
            }
            if (sampleCount != ((sampleCount) (obj)).sampleCount)
            {
                return false;
            }
        }
        return true;
    }

    public int getGroupDescriptionIndex()
    {
        return groupDescriptionIndex;
    }

    public long getSampleCount()
    {
        return sampleCount;
    }

    public int hashCode()
    {
        return (int)(sampleCount ^ sampleCount >>> 32) * 31 + groupDescriptionIndex;
    }

    public void setGroupDescriptionIndex(int i)
    {
        groupDescriptionIndex = i;
    }

    public void setSampleCount(long l)
    {
        sampleCount = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{sampleCount=")).append(sampleCount).append(", groupDescriptionIndex=").append(groupDescriptionIndex).append('}').toString();
    }

    public (long l, int i)
    {
        sampleCount = l;
        groupDescriptionIndex = i;
    }
}
