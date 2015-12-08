// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Supplier;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder

private static final class  extends Enum
    implements Supplier
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static Supplier instance()
    {
        return INSTANCE;
    }

    public static INSTANCE valueOf(String s)
    {
        return (INSTANCE)Enum.valueOf(com/google/common/collect/MultimapBuilder$LinkedListSupplier, s);
    }

    public static INSTANCE[] values()
    {
        return (INSTANCE[])$VALUES.clone();
    }

    public volatile Object get()
    {
        return get();
    }

    public List get()
    {
        return new LinkedList();
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
