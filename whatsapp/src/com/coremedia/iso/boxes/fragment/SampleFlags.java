// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import java.nio.ByteBuffer;

public class SampleFlags
{

    private int reserved;
    private int sampleDegradationPriority;
    private int sampleDependsOn;
    private int sampleHasRedundancy;
    private int sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private int samplePaddingValue;

    public SampleFlags()
    {
    }

    public SampleFlags(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        super();
        bytebuffer = new BitReaderBuffer(bytebuffer);
        reserved = bytebuffer.readBits(6);
        sampleDependsOn = bytebuffer.readBits(2);
        sampleIsDependedOn = bytebuffer.readBits(2);
        sampleHasRedundancy = bytebuffer.readBits(2);
        samplePaddingValue = bytebuffer.readBits(3);
        if (bytebuffer.readBits(1) != 1)
        {
            flag = false;
        }
        sampleIsDifferenceSample = flag;
        sampleDegradationPriority = bytebuffer.readBits(16);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SampleFlags)obj;
            if (reserved != ((SampleFlags) (obj)).reserved)
            {
                return false;
            }
            if (sampleDegradationPriority != ((SampleFlags) (obj)).sampleDegradationPriority)
            {
                return false;
            }
            if (sampleDependsOn != ((SampleFlags) (obj)).sampleDependsOn)
            {
                return false;
            }
            if (sampleHasRedundancy != ((SampleFlags) (obj)).sampleHasRedundancy)
            {
                return false;
            }
            if (sampleIsDependedOn != ((SampleFlags) (obj)).sampleIsDependedOn)
            {
                return false;
            }
            if (sampleIsDifferenceSample != ((SampleFlags) (obj)).sampleIsDifferenceSample)
            {
                return false;
            }
            if (samplePaddingValue != ((SampleFlags) (obj)).samplePaddingValue)
            {
                return false;
            }
        }
        return true;
    }

    public void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer = new BitWriterBuffer(bytebuffer);
        bytebuffer.writeBits(reserved, 6);
        bytebuffer.writeBits(sampleDependsOn, 2);
        bytebuffer.writeBits(sampleIsDependedOn, 2);
        bytebuffer.writeBits(sampleHasRedundancy, 2);
        bytebuffer.writeBits(samplePaddingValue, 3);
        int i;
        if (sampleIsDifferenceSample)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bytebuffer.writeBits(i, 1);
        bytebuffer.writeBits(sampleDegradationPriority, 16);
    }

    public int getReserved()
    {
        return reserved;
    }

    public int getSampleDegradationPriority()
    {
        return sampleDegradationPriority;
    }

    public int getSampleDependsOn()
    {
        return sampleDependsOn;
    }

    public int getSampleHasRedundancy()
    {
        return sampleHasRedundancy;
    }

    public int getSampleIsDependedOn()
    {
        return sampleIsDependedOn;
    }

    public int getSamplePaddingValue()
    {
        return samplePaddingValue;
    }

    public int hashCode()
    {
        int j = reserved;
        int k = sampleDependsOn;
        int l = sampleIsDependedOn;
        int i1 = sampleHasRedundancy;
        int j1 = samplePaddingValue;
        int i;
        if (sampleIsDifferenceSample)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return (((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + i) * 31 + sampleDegradationPriority;
    }

    public boolean isSampleIsDifferenceSample()
    {
        return sampleIsDifferenceSample;
    }

    public void setReserved(int i)
    {
        reserved = i;
    }

    public void setSampleDegradationPriority(int i)
    {
        sampleDegradationPriority = i;
    }

    public void setSampleDependsOn(int i)
    {
        sampleDependsOn = i;
    }

    public void setSampleHasRedundancy(int i)
    {
        sampleHasRedundancy = i;
    }

    public void setSampleIsDependedOn(int i)
    {
        sampleIsDependedOn = i;
    }

    public void setSampleIsDifferenceSample(boolean flag)
    {
        sampleIsDifferenceSample = flag;
    }

    public void setSamplePaddingValue(int i)
    {
        samplePaddingValue = i;
    }

    public String toString()
    {
        return (new StringBuilder("SampleFlags{reserved=")).append(reserved).append(", sampleDependsOn=").append(sampleDependsOn).append(", sampleHasRedundancy=").append(sampleHasRedundancy).append(", samplePaddingValue=").append(samplePaddingValue).append(", sampleIsDifferenceSample=").append(sampleIsDifferenceSample).append(", sampleDegradationPriority=").append(sampleDegradationPriority).append('}').toString();
    }
}
