// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.coremedia.iso.boxes:
//            SubSampleInformationBox

public static class subsampleEntries
{
    public static class SubsampleEntry
    {

        private int discardable;
        private long reserved;
        private int subsamplePriority;
        private long subsampleSize;

        public int getDiscardable()
        {
            return discardable;
        }

        public long getReserved()
        {
            return reserved;
        }

        public int getSubsamplePriority()
        {
            return subsamplePriority;
        }

        public long getSubsampleSize()
        {
            return subsampleSize;
        }

        public void setDiscardable(int i)
        {
            discardable = i;
        }

        public void setReserved(long l)
        {
            reserved = l;
        }

        public void setSubsamplePriority(int i)
        {
            subsamplePriority = i;
        }

        public void setSubsampleSize(long l)
        {
            subsampleSize = l;
        }

        public String toString()
        {
            return (new StringBuilder("SubsampleEntry{subsampleSize=")).append(subsampleSize).append(", subsamplePriority=").append(subsamplePriority).append(", discardable=").append(discardable).append(", reserved=").append(reserved).append('}').toString();
        }

        public SubsampleEntry()
        {
        }
    }


    private long sampleDelta;
    private int subsampleCount;
    private List subsampleEntries;

    public void addSubsampleEntry(SubsampleEntry subsampleentry)
    {
        subsampleEntries.add(subsampleentry);
        subsampleCount = subsampleCount + 1;
    }

    public long getSampleDelta()
    {
        return sampleDelta;
    }

    public int getSubsampleCount()
    {
        return subsampleCount;
    }

    public List getSubsampleEntries()
    {
        return subsampleEntries;
    }

    public void setSampleDelta(long l)
    {
        sampleDelta = l;
    }

    public void setSubsampleCount(int i)
    {
        subsampleCount = i;
    }

    public String toString()
    {
        return (new StringBuilder("SampleEntry{sampleDelta=")).append(sampleDelta).append(", subsampleCount=").append(subsampleCount).append(", subsampleEntries=").append(subsampleEntries).append('}').toString();
    }

    public SubsampleEntry()
    {
        subsampleEntries = new ArrayList();
    }
}
