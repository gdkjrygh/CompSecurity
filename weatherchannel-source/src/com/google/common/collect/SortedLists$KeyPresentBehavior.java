// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            SortedLists

public static abstract class <init> extends Enum
{

    private static final LAST_BEFORE $VALUES[];
    public static final LAST_BEFORE ANY_PRESENT;
    public static final LAST_BEFORE FIRST_AFTER;
    public static final LAST_BEFORE FIRST_PRESENT;
    public static final LAST_BEFORE LAST_BEFORE;
    public static final LAST_BEFORE LAST_PRESENT;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract int resultIndex(Comparator comparator, Object obj, List list, int i);

    static 
    {
        ANY_PRESENT = new SortedLists.KeyPresentBehavior("ANY_PRESENT", 0) {

            int resultIndex(Comparator comparator, Object obj, List list, int i)
            {
                return i;
            }

        };
        LAST_PRESENT = new SortedLists.KeyPresentBehavior("LAST_PRESENT", 1) {

            int resultIndex(Comparator comparator, Object obj, List list, int i)
            {
                int j = i;
                for (i = list.size() - 1; j < i;)
                {
                    int k = j + i + 1 >>> 1;
                    if (comparator.compare(list.get(k), obj) > 0)
                    {
                        i = k - 1;
                    } else
                    {
                        j = k;
                    }
                }

                return j;
            }

        };
        FIRST_PRESENT = new SortedLists.KeyPresentBehavior("FIRST_PRESENT", 2) {

            int resultIndex(Comparator comparator, Object obj, List list, int i)
            {
                int j;
                for (j = 0; j < i;)
                {
                    int k = j + i >>> 1;
                    if (comparator.compare(list.get(k), obj) < 0)
                    {
                        j = k + 1;
                    } else
                    {
                        i = k;
                    }
                }

                return j;
            }

        };
        FIRST_AFTER = new SortedLists.KeyPresentBehavior("FIRST_AFTER", 3) {

            public int resultIndex(Comparator comparator, Object obj, List list, int i)
            {
                return LAST_PRESENT.resultIndex(comparator, obj, list, i) + 1;
            }

        };
        LAST_BEFORE = new SortedLists.KeyPresentBehavior("LAST_BEFORE", 4) {

            public int resultIndex(Comparator comparator, Object obj, List list, int i)
            {
                return FIRST_PRESENT.resultIndex(comparator, obj, list, i) - 1;
            }

        };
        $VALUES = (new .VALUES[] {
            ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, _cls5 _pcls5)
    {
        this(s, i);
    }
}
