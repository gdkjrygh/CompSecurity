// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

private static final class ence extends Enum
    implements ntry
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static ntry valueOf(String s)
    {
        return (ntry)Enum.valueOf(com/google/common/cache/LocalCache$NullEntry, s);
    }

    public static ntry[] values()
    {
        return (ntry[])$VALUES.clone();
    }

    public long getAccessTime()
    {
        return 0L;
    }

    public int getHash()
    {
        return 0;
    }

    public Object getKey()
    {
        return null;
    }

    public ntry getNext()
    {
        return null;
    }

    public ntry getNextInAccessQueue()
    {
        return this;
    }

    public ntry getNextInWriteQueue()
    {
        return this;
    }

    public ntry getPreviousInAccessQueue()
    {
        return this;
    }

    public ntry getPreviousInWriteQueue()
    {
        return this;
    }

    public ence getValueReference()
    {
        return null;
    }

    public long getWriteTime()
    {
        return 0L;
    }

    public void setAccessTime(long l)
    {
    }

    public void setNextInAccessQueue(ntry ntry)
    {
    }

    public void setNextInWriteQueue(ntry ntry)
    {
    }

    public void setPreviousInAccessQueue(ntry ntry)
    {
    }

    public void setPreviousInWriteQueue(ntry ntry)
    {
    }

    public void setValueReference(ence ence)
    {
    }

    public void setWriteTime(long l)
    {
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private ence(String s, int i)
    {
        super(s, i);
    }
}
