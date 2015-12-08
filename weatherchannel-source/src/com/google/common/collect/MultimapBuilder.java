// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.google.common.collect:
//            CollectPreconditions, Ordering, Multimap, ListMultimap, 
//            Multimaps, SetMultimap, SortedSetMultimap

public abstract class MultimapBuilder
{
    private static final class ArrayListSupplier
        implements Supplier, Serializable
    {

        private final int expectedValuesPerKey;

        public volatile Object get()
        {
            return get();
        }

        public List get()
        {
            return new ArrayList(expectedValuesPerKey);
        }

        ArrayListSupplier(int i)
        {
            expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }
    }

    private static final class EnumSetSupplier
        implements Supplier, Serializable
    {

        private final Class clazz;

        public volatile Object get()
        {
            return get();
        }

        public Set get()
        {
            return EnumSet.noneOf(clazz);
        }

        EnumSetSupplier(Class class1)
        {
            clazz = (Class)Preconditions.checkNotNull(class1);
        }
    }

    private static final class HashSetSupplier
        implements Supplier, Serializable
    {

        private final int expectedValuesPerKey;

        public volatile Object get()
        {
            return get();
        }

        public Set get()
        {
            return new HashSet(expectedValuesPerKey);
        }

        HashSetSupplier(int i)
        {
            expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }
    }

    private static final class LinkedHashSetSupplier
        implements Supplier, Serializable
    {

        private final int expectedValuesPerKey;

        public volatile Object get()
        {
            return get();
        }

        public Set get()
        {
            return new LinkedHashSet(expectedValuesPerKey);
        }

        LinkedHashSetSupplier(int i)
        {
            expectedValuesPerKey = CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
        }
    }

    private static final class LinkedListSupplier extends Enum
        implements Supplier
    {

        private static final LinkedListSupplier $VALUES[];
        public static final LinkedListSupplier INSTANCE;

        public static Supplier instance()
        {
            return INSTANCE;
        }

        public static LinkedListSupplier valueOf(String s)
        {
            return (LinkedListSupplier)Enum.valueOf(com/google/common/collect/MultimapBuilder$LinkedListSupplier, s);
        }

        public static LinkedListSupplier[] values()
        {
            return (LinkedListSupplier[])$VALUES.clone();
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
            INSTANCE = new LinkedListSupplier("INSTANCE", 0);
            $VALUES = (new LinkedListSupplier[] {
                INSTANCE
            });
        }

        private LinkedListSupplier(String s, int i)
        {
            super(s, i);
        }
    }

    public static abstract class ListMultimapBuilder extends MultimapBuilder
    {

        public abstract ListMultimap build();

        public ListMultimap build(Multimap multimap)
        {
            return (ListMultimap)build(multimap);
        }

        public volatile Multimap build()
        {
            return build();
        }

        public volatile Multimap build(Multimap multimap)
        {
            return build(multimap);
        }

        ListMultimapBuilder()
        {
        }
    }

    public static abstract class MultimapBuilderWithKeys
    {

        private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

        public ListMultimapBuilder arrayListValues()
        {
            return arrayListValues(2);
        }

        public ListMultimapBuilder arrayListValues(int i)
        {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return i. new ListMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;
                final int val$expectedValuesPerKey;

                public ListMultimap build()
                {
                    return Multimaps.newListMultimap(createMap(), new ArrayListSupplier(expectedValuesPerKey));
                }

                public volatile Multimap build()
                {
                    return build();
                }

            
            {
                this$0 = final_multimapbuilderwithkeys;
                expectedValuesPerKey = I.this;
                super();
            }
            };
        }

        abstract Map createMap();

        public SetMultimapBuilder enumSetValues(Class class1)
        {
            Preconditions.checkNotNull(class1, "valueClass");
            return class1. new SetMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;
                final Class val$valueClass;

                public volatile Multimap build()
                {
                    return build();
                }

                public SetMultimap build()
                {
                    EnumSetSupplier enumsetsupplier = new EnumSetSupplier(valueClass);
                    return Multimaps.newSetMultimap(createMap(), enumsetsupplier);
                }

            
            {
                this$0 = final_multimapbuilderwithkeys;
                valueClass = Class.this;
                super();
            }
            };
        }

        public SetMultimapBuilder hashSetValues()
        {
            return hashSetValues(2);
        }

        public SetMultimapBuilder hashSetValues(int i)
        {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return i. new SetMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;
                final int val$expectedValuesPerKey;

                public volatile Multimap build()
                {
                    return build();
                }

                public SetMultimap build()
                {
                    return Multimaps.newSetMultimap(createMap(), new HashSetSupplier(expectedValuesPerKey));
                }

            
            {
                this$0 = final_multimapbuilderwithkeys;
                expectedValuesPerKey = I.this;
                super();
            }
            };
        }

        public SetMultimapBuilder linkedHashSetValues()
        {
            return linkedHashSetValues(2);
        }

        public SetMultimapBuilder linkedHashSetValues(int i)
        {
            CollectPreconditions.checkNonnegative(i, "expectedValuesPerKey");
            return i. new SetMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;
                final int val$expectedValuesPerKey;

                public volatile Multimap build()
                {
                    return build();
                }

                public SetMultimap build()
                {
                    return Multimaps.newSetMultimap(createMap(), new LinkedHashSetSupplier(expectedValuesPerKey));
                }

            
            {
                this$0 = final_multimapbuilderwithkeys;
                expectedValuesPerKey = I.this;
                super();
            }
            };
        }

        public ListMultimapBuilder linkedListValues()
        {
            return new ListMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;

                public ListMultimap build()
                {
                    return Multimaps.newListMultimap(createMap(), LinkedListSupplier.instance());
                }

                public volatile Multimap build()
                {
                    return build();
                }

            
            {
                this$0 = MultimapBuilderWithKeys.this;
                super();
            }
            };
        }

        public SortedSetMultimapBuilder treeSetValues()
        {
            return treeSetValues(((Comparator) (Ordering.natural())));
        }

        public SortedSetMultimapBuilder treeSetValues(Comparator comparator)
        {
            Preconditions.checkNotNull(comparator, "comparator");
            return comparator. new SortedSetMultimapBuilder() {

                final MultimapBuilderWithKeys this$0;
                final Comparator val$comparator;

                public volatile Multimap build()
                {
                    return build();
                }

                public volatile SetMultimap build()
                {
                    return build();
                }

                public SortedSetMultimap build()
                {
                    return Multimaps.newSortedSetMultimap(createMap(), new TreeSetSupplier(comparator));
                }

            
            {
                this$0 = final_multimapbuilderwithkeys;
                comparator = Comparator.this;
                super();
            }
            };
        }

        MultimapBuilderWithKeys()
        {
        }
    }

    public static abstract class SetMultimapBuilder extends MultimapBuilder
    {

        public volatile Multimap build()
        {
            return build();
        }

        public volatile Multimap build(Multimap multimap)
        {
            return build(multimap);
        }

        public abstract SetMultimap build();

        public SetMultimap build(Multimap multimap)
        {
            return (SetMultimap)build(multimap);
        }

        SetMultimapBuilder()
        {
        }
    }

    public static abstract class SortedSetMultimapBuilder extends SetMultimapBuilder
    {

        public volatile Multimap build()
        {
            return build();
        }

        public volatile Multimap build(Multimap multimap)
        {
            return build(multimap);
        }

        public volatile SetMultimap build()
        {
            return build();
        }

        public volatile SetMultimap build(Multimap multimap)
        {
            return build(multimap);
        }

        public abstract SortedSetMultimap build();

        public SortedSetMultimap build(Multimap multimap)
        {
            return (SortedSetMultimap)super.build(multimap);
        }

        SortedSetMultimapBuilder()
        {
        }
    }

    private static final class TreeSetSupplier
        implements Supplier, Serializable
    {

        private final Comparator comparator;

        public volatile Object get()
        {
            return get();
        }

        public SortedSet get()
        {
            return new TreeSet(comparator);
        }

        TreeSetSupplier(Comparator comparator1)
        {
            comparator = (Comparator)Preconditions.checkNotNull(comparator1);
        }
    }


    private static final int DEFAULT_EXPECTED_KEYS = 8;

    private MultimapBuilder()
    {
    }


    public static MultimapBuilderWithKeys enumKeys(Class class1)
    {
        Preconditions.checkNotNull(class1);
        return new MultimapBuilderWithKeys(class1) {

            final Class val$keyClass;

            Map createMap()
            {
                return new EnumMap(keyClass);
            }

            
            {
                keyClass = class1;
                super();
            }
        };
    }

    public static MultimapBuilderWithKeys hashKeys()
    {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys hashKeys(int i)
    {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys(i) {

            final int val$expectedKeys;

            Map createMap()
            {
                return new HashMap(expectedKeys);
            }

            
            {
                expectedKeys = i;
                super();
            }
        };
    }

    public static MultimapBuilderWithKeys linkedHashKeys()
    {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys linkedHashKeys(int i)
    {
        CollectPreconditions.checkNonnegative(i, "expectedKeys");
        return new MultimapBuilderWithKeys(i) {

            final int val$expectedKeys;

            Map createMap()
            {
                return new LinkedHashMap(expectedKeys);
            }

            
            {
                expectedKeys = i;
                super();
            }
        };
    }

    public static MultimapBuilderWithKeys treeKeys()
    {
        return treeKeys(((Comparator) (Ordering.natural())));
    }

    public static MultimapBuilderWithKeys treeKeys(Comparator comparator)
    {
        Preconditions.checkNotNull(comparator);
        return new MultimapBuilderWithKeys(comparator) {

            final Comparator val$comparator;

            Map createMap()
            {
                return new TreeMap(comparator);
            }

            
            {
                comparator = comparator1;
                super();
            }
        };
    }

    public abstract Multimap build();

    public Multimap build(Multimap multimap)
    {
        Multimap multimap1 = build();
        multimap1.putAll(multimap);
        return multimap1;
    }
}
