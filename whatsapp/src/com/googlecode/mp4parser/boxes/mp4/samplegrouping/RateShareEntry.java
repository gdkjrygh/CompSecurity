// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class RateShareEntry extends GroupEntry
{
    public static class Entry
    {

        int availableBitrate;
        short targetRateShare;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (availableBitrate != ((Entry) (obj)).availableBitrate)
                {
                    return false;
                }
                if (targetRateShare != ((Entry) (obj)).targetRateShare)
                {
                    return false;
                }
            }
            return true;
        }

        public int getAvailableBitrate()
        {
            return availableBitrate;
        }

        public short getTargetRateShare()
        {
            return targetRateShare;
        }

        public int hashCode()
        {
            return availableBitrate * 31 + targetRateShare;
        }

        public void setAvailableBitrate(int i)
        {
            availableBitrate = i;
        }

        public void setTargetRateShare(short word0)
        {
            targetRateShare = word0;
        }

        public String toString()
        {
            return (new StringBuilder("{availableBitrate=")).append(availableBitrate).append(", targetRateShare=").append(targetRateShare).append('}').toString();
        }

        public Entry(int i, short word0)
        {
            availableBitrate = i;
            targetRateShare = word0;
        }
    }


    public static final String TYPE = "rash";
    private short discardPriority;
    private List entries;
    private int maximumBitrate;
    private int minimumBitrate;
    private short operationPointCut;
    private short targetRateShare;

    public RateShareEntry()
    {
        entries = new LinkedList();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RateShareEntry)obj;
            if (discardPriority != ((RateShareEntry) (obj)).discardPriority)
            {
                return false;
            }
            if (maximumBitrate != ((RateShareEntry) (obj)).maximumBitrate)
            {
                return false;
            }
            if (minimumBitrate != ((RateShareEntry) (obj)).minimumBitrate)
            {
                return false;
            }
            if (operationPointCut != ((RateShareEntry) (obj)).operationPointCut)
            {
                return false;
            }
            if (targetRateShare != ((RateShareEntry) (obj)).targetRateShare)
            {
                return false;
            }
            if (entries == null ? ((RateShareEntry) (obj)).entries != null : !entries.equals(((RateShareEntry) (obj)).entries))
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer;
        int i;
        if (operationPointCut == 1)
        {
            i = 13;
        } else
        {
            i = operationPointCut * 6 + 11;
        }
        bytebuffer = ByteBuffer.allocate(i);
        bytebuffer.putShort(operationPointCut);
        if (operationPointCut == 1)
        {
            bytebuffer.putShort(targetRateShare);
        } else
        {
            Iterator iterator = entries.iterator();
            while (iterator.hasNext()) 
            {
                Entry entry = (Entry)iterator.next();
                bytebuffer.putInt(entry.getAvailableBitrate());
                bytebuffer.putShort(entry.getTargetRateShare());
            }
        }
        bytebuffer.putInt(maximumBitrate);
        bytebuffer.putInt(minimumBitrate);
        IsoTypeWriter.writeUInt8(bytebuffer, discardPriority);
        bytebuffer.rewind();
        return bytebuffer;
    }

    public short getDiscardPriority()
    {
        return discardPriority;
    }

    public List getEntries()
    {
        return entries;
    }

    public int getMaximumBitrate()
    {
        return maximumBitrate;
    }

    public int getMinimumBitrate()
    {
        return minimumBitrate;
    }

    public short getOperationPointCut()
    {
        return operationPointCut;
    }

    public short getTargetRateShare()
    {
        return targetRateShare;
    }

    public int hashCode()
    {
        short word0 = operationPointCut;
        short word1 = targetRateShare;
        int i;
        if (entries != null)
        {
            i = entries.hashCode();
        } else
        {
            i = 0;
        }
        return ((((word0 * 31 + word1) * 31 + i) * 31 + maximumBitrate) * 31 + minimumBitrate) * 31 + discardPriority;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        operationPointCut = bytebuffer.getShort();
        if (operationPointCut == 1)
        {
            targetRateShare = bytebuffer.getShort();
        } else
        {
            int i = operationPointCut;
            while (i > 0) 
            {
                entries.add(new Entry(CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer)), bytebuffer.getShort()));
                i--;
            }
        }
        maximumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        minimumBitrate = CastUtils.l2i(IsoTypeReader.readUInt32(bytebuffer));
        discardPriority = (short)IsoTypeReader.readUInt8(bytebuffer);
    }

    public void setDiscardPriority(short word0)
    {
        discardPriority = word0;
    }

    public void setEntries(List list)
    {
        entries = list;
    }

    public void setMaximumBitrate(int i)
    {
        maximumBitrate = i;
    }

    public void setMinimumBitrate(int i)
    {
        minimumBitrate = i;
    }

    public void setOperationPointCut(short word0)
    {
        operationPointCut = word0;
    }

    public void setTargetRateShare(short word0)
    {
        targetRateShare = word0;
    }
}
