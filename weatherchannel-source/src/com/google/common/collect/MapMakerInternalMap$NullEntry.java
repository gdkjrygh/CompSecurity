// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

private static final class ence extends Enum
    implements ntry
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static ntry valueOf(String s)
    {
        return (ntry)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$NullEntry, s);
    }

    public static ntry[] values()
    {
        return (ntry[])$VALUES.clone();
    }

    public long getExpirationTime()
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

    public ntry getNextEvictable()
    {
        return this;
    }

    public ntry getNextExpirable()
    {
        return this;
    }

    public ntry getPreviousEvictable()
    {
        return this;
    }

    public ntry getPreviousExpirable()
    {
        return this;
    }

    public ence getValueReference()
    {
        return null;
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextEvictable(ntry ntry)
    {
    }

    public void setNextExpirable(ntry ntry)
    {
    }

    public void setPreviousEvictable(ntry ntry)
    {
    }

    public void setPreviousExpirable(ntry ntry)
    {
    }

    public void setValueReference(ence ence)
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
