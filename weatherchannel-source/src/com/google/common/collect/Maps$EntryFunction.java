// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Maps

private static abstract class <init> extends Enum
    implements Function
{

    private static final VALUE $VALUES[];
    public static final VALUE KEY;
    public static final VALUE VALUE;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    static 
    {
        KEY = new Maps.EntryFunction("KEY", 0) {

            public volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public Object apply(java.util.Map.Entry entry)
            {
                return entry.getKey();
            }

        };
        VALUE = new Maps.EntryFunction("VALUE", 1) {

            public volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public Object apply(java.util.Map.Entry entry)
            {
                return entry.getValue();
            }

        };
        $VALUES = (new .VALUES[] {
            KEY, VALUE
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, _cls2 _pcls2)
    {
        this(s, i);
    }
}
