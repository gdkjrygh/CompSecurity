// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class TemporalLevelEntry extends GroupEntry
{

    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    public TemporalLevelEntry()
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
            obj = (TemporalLevelEntry)obj;
            if (levelIndependentlyDecodable != ((TemporalLevelEntry) (obj)).levelIndependentlyDecodable)
            {
                return false;
            }
            if (reserved != ((TemporalLevelEntry) (obj)).reserved)
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
        if (levelIndependentlyDecodable)
        {
            c = '\200';
        } else
        {
            c = '\0';
        }
        bytebuffer.put((byte)c);
        bytebuffer.rewind();
        return bytebuffer;
    }

    public int hashCode()
    {
        int i;
        if (levelIndependentlyDecodable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i * 31 + reserved;
    }

    public boolean isLevelIndependentlyDecodable()
    {
        return levelIndependentlyDecodable;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        boolean flag;
        if ((bytebuffer.get() & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        levelIndependentlyDecodable = flag;
    }

    public void setLevelIndependentlyDecodable(boolean flag)
    {
        levelIndependentlyDecodable = flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("TemporalLevelEntry");
        stringbuilder.append("{levelIndependentlyDecodable=").append(levelIndependentlyDecodable);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
