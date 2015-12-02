// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class VisualRandomAccessEntry extends GroupEntry
{

    public static final String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;

    public VisualRandomAccessEntry()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (VisualRandomAccessEntry)obj;
            if (numLeadingSamples != ((VisualRandomAccessEntry) (obj)).numLeadingSamples)
            {
                return false;
            }
            if (numLeadingSamplesKnown != ((VisualRandomAccessEntry) (obj)).numLeadingSamplesKnown)
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(1);
        char c;
        if (numLeadingSamplesKnown)
        {
            c = '\200';
        } else
        {
            c = '\0';
        }
        bytebuffer.put((byte)(c | numLeadingSamples & 0x7f));
        bytebuffer.rewind();
        return bytebuffer;
    }

    public short getNumLeadingSamples()
    {
        return numLeadingSamples;
    }

    public int hashCode()
    {
        int i;
        if (numLeadingSamplesKnown)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i * 31 + numLeadingSamples;
    }

    public boolean isNumLeadingSamplesKnown()
    {
        return numLeadingSamplesKnown;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        byte byte0 = bytebuffer.get();
        boolean flag;
        if ((byte0 & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        numLeadingSamplesKnown = flag;
        numLeadingSamples = (short)(byte0 & 0x7f);
    }

    public void setNumLeadingSamples(short word0)
    {
        numLeadingSamples = word0;
    }

    public void setNumLeadingSamplesKnown(boolean flag)
    {
        numLeadingSamplesKnown = flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("VisualRandomAccessEntry");
        stringbuilder.append("{numLeadingSamplesKnown=").append(numLeadingSamplesKnown);
        stringbuilder.append(", numLeadingSamples=").append(numLeadingSamples);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
