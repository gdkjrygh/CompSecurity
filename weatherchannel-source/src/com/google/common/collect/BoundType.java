// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


public abstract class BoundType extends Enum
{

    private static final BoundType $VALUES[];
    public static final BoundType CLOSED;
    public static final BoundType OPEN;

    private BoundType(String s, int i)
    {
        super(s, i);
    }


    static BoundType forBoolean(boolean flag)
    {
        if (flag)
        {
            return CLOSED;
        } else
        {
            return OPEN;
        }
    }

    public static BoundType valueOf(String s)
    {
        return (BoundType)Enum.valueOf(com/google/common/collect/BoundType, s);
    }

    public static BoundType[] values()
    {
        return (BoundType[])$VALUES.clone();
    }

    abstract BoundType flip();

    static 
    {
        OPEN = new BoundType("OPEN", 0) {

            BoundType flip()
            {
                return CLOSED;
            }

        };
        CLOSED = new BoundType("CLOSED", 1) {

            BoundType flip()
            {
                return OPEN;
            }

        };
        $VALUES = (new BoundType[] {
            OPEN, CLOSED
        });
    }
}
