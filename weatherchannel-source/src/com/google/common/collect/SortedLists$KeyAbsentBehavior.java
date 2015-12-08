// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            SortedLists

public static abstract class <init> extends Enum
{

    private static final INVERTED_INSERTION_INDEX $VALUES[];
    public static final INVERTED_INSERTION_INDEX INVERTED_INSERTION_INDEX;
    public static final INVERTED_INSERTION_INDEX NEXT_HIGHER;
    public static final INVERTED_INSERTION_INDEX NEXT_LOWER;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$KeyAbsentBehavior, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract int resultIndex(int i);

    static 
    {
        NEXT_LOWER = new SortedLists.KeyAbsentBehavior("NEXT_LOWER", 0) {

            int resultIndex(int i)
            {
                return i - 1;
            }

        };
        NEXT_HIGHER = new SortedLists.KeyAbsentBehavior("NEXT_HIGHER", 1) {

            public int resultIndex(int i)
            {
                return i;
            }

        };
        INVERTED_INSERTION_INDEX = new SortedLists.KeyAbsentBehavior("INVERTED_INSERTION_INDEX", 2) {

            public int resultIndex(int i)
            {
                return ~i;
            }

        };
        $VALUES = (new .VALUES[] {
            NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, _cls3 _pcls3)
    {
        this(s, i);
    }
}
