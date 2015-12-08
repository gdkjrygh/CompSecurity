// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            Ordering, Lists

final class SortedLists
{
    public static abstract class KeyAbsentBehavior extends Enum
    {

        private static final KeyAbsentBehavior $VALUES[];
        public static final KeyAbsentBehavior INVERTED_INSERTION_INDEX;
        public static final KeyAbsentBehavior NEXT_HIGHER;
        public static final KeyAbsentBehavior NEXT_LOWER;

        public static KeyAbsentBehavior valueOf(String s)
        {
            return (KeyAbsentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyAbsentBehavior, s);
        }

        public static KeyAbsentBehavior[] values()
        {
            return (KeyAbsentBehavior[])$VALUES.clone();
        }

        abstract int resultIndex(int i);

        static 
        {
            NEXT_LOWER = new KeyAbsentBehavior("NEXT_LOWER", 0) {

                int resultIndex(int i)
                {
                    return i - 1;
                }

            };
            NEXT_HIGHER = new KeyAbsentBehavior("NEXT_HIGHER", 1) {

                public int resultIndex(int i)
                {
                    return i;
                }

            };
            INVERTED_INSERTION_INDEX = new KeyAbsentBehavior("INVERTED_INSERTION_INDEX", 2) {

                public int resultIndex(int i)
                {
                    return ~i;
                }

            };
            $VALUES = (new KeyAbsentBehavior[] {
                NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX
            });
        }

        private KeyAbsentBehavior(String s, int i)
        {
            super(s, i);
        }

    }

    public static abstract class KeyPresentBehavior extends Enum
    {

        private static final KeyPresentBehavior $VALUES[];
        public static final KeyPresentBehavior ANY_PRESENT;
        public static final KeyPresentBehavior FIRST_AFTER;
        public static final KeyPresentBehavior FIRST_PRESENT;
        public static final KeyPresentBehavior LAST_BEFORE;
        public static final KeyPresentBehavior LAST_PRESENT;

        public static KeyPresentBehavior valueOf(String s)
        {
            return (KeyPresentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
        }

        public static KeyPresentBehavior[] values()
        {
            return (KeyPresentBehavior[])$VALUES.clone();
        }

        abstract int resultIndex(Comparator comparator, Object obj, List list, int i);

        static 
        {
            ANY_PRESENT = new KeyPresentBehavior("ANY_PRESENT", 0) {

                int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return i;
                }

            };
            LAST_PRESENT = new KeyPresentBehavior("LAST_PRESENT", 1) {

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
            FIRST_PRESENT = new KeyPresentBehavior("FIRST_PRESENT", 2) {

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
            FIRST_AFTER = new KeyPresentBehavior("FIRST_AFTER", 3) {

                public int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return LAST_PRESENT.resultIndex(comparator, obj, list, i) + 1;
                }

            };
            LAST_BEFORE = new KeyPresentBehavior("LAST_BEFORE", 4) {

                public int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return FIRST_PRESENT.resultIndex(comparator, obj, list, i) - 1;
                }

            };
            $VALUES = (new KeyPresentBehavior[] {
                ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE
            });
        }

        private KeyPresentBehavior(String s, int i)
        {
            super(s, i);
        }

    }


    private SortedLists()
    {
    }

    public static int binarySearch(List list, Function function, Comparable comparable, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        return binarySearch(list, function, comparable, ((Comparator) (Ordering.natural())), keypresentbehavior, keyabsentbehavior);
    }

    public static int binarySearch(List list, Function function, Object obj, Comparator comparator, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        return binarySearch(Lists.transform(list, function), obj, comparator, keypresentbehavior, keyabsentbehavior);
    }

    public static int binarySearch(List list, Comparable comparable, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        Preconditions.checkNotNull(comparable);
        return binarySearch(list, Preconditions.checkNotNull(comparable), ((Comparator) (Ordering.natural())), keypresentbehavior, keyabsentbehavior);
    }

    public static int binarySearch(List list, Object obj, Comparator comparator, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(keypresentbehavior);
        Preconditions.checkNotNull(keyabsentbehavior);
        Object obj1 = list;
        if (!(list instanceof RandomAccess))
        {
            obj1 = Lists.newArrayList(list);
        }
        int j = 0;
        for (int i = ((List) (obj1)).size() - 1; j <= i;)
        {
            int k = j + i >>> 1;
            int l = comparator.compare(obj, ((List) (obj1)).get(k));
            if (l < 0)
            {
                i = k - 1;
            } else
            if (l > 0)
            {
                j = k + 1;
            } else
            {
                return keypresentbehavior.resultIndex(comparator, obj, ((List) (obj1)).subList(j, i + 1), k - j) + j;
            }
        }

        return keyabsentbehavior.resultIndex(j);
    }
}
