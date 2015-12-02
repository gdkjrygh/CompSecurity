// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.threegpp26244;


// Referenced classes of package com.googlecode.mp4parser.boxes.threegpp26244:
//            SegmentIndexBox

public static class sapDeltaTime
{

    byte referenceType;
    int referencedSize;
    int sapDeltaTime;
    byte sapType;
    byte startsWithSap;
    long subsegmentDuration;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (sapDeltaTime)obj;
            if (referenceType != ((referenceType) (obj)).referenceType)
            {
                return false;
            }
            if (referencedSize != ((referencedSize) (obj)).referencedSize)
            {
                return false;
            }
            if (sapDeltaTime != ((sapDeltaTime) (obj)).sapDeltaTime)
            {
                return false;
            }
            if (sapType != ((sapType) (obj)).sapType)
            {
                return false;
            }
            if (startsWithSap != ((startsWithSap) (obj)).startsWithSap)
            {
                return false;
            }
            if (subsegmentDuration != ((subsegmentDuration) (obj)).subsegmentDuration)
            {
                return false;
            }
        }
        return true;
    }

    public byte getReferenceType()
    {
        return referenceType;
    }

    public int getReferencedSize()
    {
        return referencedSize;
    }

    public int getSapDeltaTime()
    {
        return sapDeltaTime;
    }

    public byte getSapType()
    {
        return sapType;
    }

    public byte getStartsWithSap()
    {
        return startsWithSap;
    }

    public long getSubsegmentDuration()
    {
        return subsegmentDuration;
    }

    public int hashCode()
    {
        return ((((referenceType * 31 + referencedSize) * 31 + (int)(subsegmentDuration ^ subsegmentDuration >>> 32)) * 31 + startsWithSap) * 31 + sapType) * 31 + sapDeltaTime;
    }

    public void setReferenceType(byte byte0)
    {
        referenceType = byte0;
    }

    public void setReferencedSize(int i)
    {
        referencedSize = i;
    }

    public void setSapDeltaTime(int i)
    {
        sapDeltaTime = i;
    }

    public void setSapType(byte byte0)
    {
        sapType = byte0;
    }

    public void setStartsWithSap(byte byte0)
    {
        startsWithSap = byte0;
    }

    public void setSubsegmentDuration(long l)
    {
        subsegmentDuration = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{referenceType=")).append(referenceType).append(", referencedSize=").append(referencedSize).append(", subsegmentDuration=").append(subsegmentDuration).append(", startsWithSap=").append(startsWithSap).append(", sapType=").append(sapType).append(", sapDeltaTime=").append(sapDeltaTime).append('}').toString();
    }

    public ()
    {
    }

    public (byte byte0, int i, long l, byte byte1, byte byte2, int j)
    {
        referenceType = byte0;
        referencedSize = i;
        subsegmentDuration = l;
        startsWithSap = byte1;
        sapType = byte2;
        sapDeltaTime = j;
    }
}
