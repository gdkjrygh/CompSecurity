// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

// Referenced classes of package com.googlecode.mp4parser.boxes.mp4.samplegrouping:
//            GroupEntry

public class RollRecoveryEntry extends GroupEntry
{

    public static final String TYPE = "roll";
    private short rollDistance;

    public RollRecoveryEntry()
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
            obj = (RollRecoveryEntry)obj;
            if (rollDistance != ((RollRecoveryEntry) (obj)).rollDistance)
            {
                return false;
            }
        }
        return true;
    }

    public ByteBuffer get()
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(2);
        bytebuffer.putShort(rollDistance);
        bytebuffer.rewind();
        return bytebuffer;
    }

    public short getRollDistance()
    {
        return rollDistance;
    }

    public int hashCode()
    {
        return rollDistance;
    }

    public void parse(ByteBuffer bytebuffer)
    {
        rollDistance = bytebuffer.getShort();
    }

    public void setRollDistance(short word0)
    {
        rollDistance = word0;
    }
}
