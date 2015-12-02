// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            SubSampleInformationBox

public static class 
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

    public ()
    {
    }
}
