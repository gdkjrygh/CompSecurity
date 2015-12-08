// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, CollectPreconditions, Ordering, Multimaps, 
//            ListMultimap, Multimap, SetMultimap, SortedSetMultimap

public static abstract class >
{

    private static final int DEFAULT_EXPECTED_VALUES_PER_KEY = 2;

    public > arrayListValues()
    {
        return arrayListValues(2);
    }

    public arrayListValues arrayListValues(final int expectedValuesPerKey)
    {
        CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        return new MultimapBuilder.ListMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;
            final int val$expectedValuesPerKey;

            public ListMultimap build()
            {
                return Multimaps.newListMultimap(createMap(), new MultimapBuilder.ArrayListSupplier(expectedValuesPerKey));
            }

            public volatile Multimap build()
            {
                return build();
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                expectedValuesPerKey = i;
                super();
            }
        };
    }

    abstract Map createMap();

    public _cls1.build enumSetValues(final Class valueClass)
    {
        Preconditions.checkNotNull(valueClass, "valueClass");
        return new MultimapBuilder.SetMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;
            final Class val$valueClass;

            public volatile Multimap build()
            {
                return build();
            }

            public SetMultimap build()
            {
                MultimapBuilder.EnumSetSupplier enumsetsupplier = new MultimapBuilder.EnumSetSupplier(valueClass);
                return Multimaps.newSetMultimap(createMap(), enumsetsupplier);
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                valueClass = class1;
                super();
            }
        };
    }

    public createMap hashSetValues()
    {
        return hashSetValues(2);
    }

    public hashSetValues hashSetValues(final int expectedValuesPerKey)
    {
        CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        return new MultimapBuilder.SetMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;
            final int val$expectedValuesPerKey;

            public volatile Multimap build()
            {
                return build();
            }

            public SetMultimap build()
            {
                return Multimaps.newSetMultimap(createMap(), new MultimapBuilder.HashSetSupplier(expectedValuesPerKey));
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                expectedValuesPerKey = i;
                super();
            }
        };
    }

    public _cls3.val.expectedValuesPerKey linkedHashSetValues()
    {
        return linkedHashSetValues(2);
    }

    public linkedHashSetValues linkedHashSetValues(final int expectedValuesPerKey)
    {
        CollectPreconditions.checkNonnegative(expectedValuesPerKey, "expectedValuesPerKey");
        return new MultimapBuilder.SetMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;
            final int val$expectedValuesPerKey;

            public volatile Multimap build()
            {
                return build();
            }

            public SetMultimap build()
            {
                return Multimaps.newSetMultimap(createMap(), new MultimapBuilder.LinkedHashSetSupplier(expectedValuesPerKey));
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                expectedValuesPerKey = i;
                super();
            }
        };
    }

    public _cls4.val.expectedValuesPerKey linkedListValues()
    {
        return new MultimapBuilder.ListMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;

            public ListMultimap build()
            {
                return Multimaps.newListMultimap(createMap(), MultimapBuilder.LinkedListSupplier.instance());
            }

            public volatile Multimap build()
            {
                return build();
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                super();
            }
        };
    }

    public  treeSetValues()
    {
        return treeSetValues(((Comparator) (Ordering.natural())));
    }

    public  treeSetValues(final Comparator comparator)
    {
        Preconditions.checkNotNull(comparator, "comparator");
        return new MultimapBuilder.SortedSetMultimapBuilder() {

            final MultimapBuilder.MultimapBuilderWithKeys this$0;
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
                return Multimaps.newSortedSetMultimap(createMap(), new MultimapBuilder.TreeSetSupplier(comparator));
            }

            
            {
                this$0 = MultimapBuilder.MultimapBuilderWithKeys.this;
                comparator = comparator1;
                super();
            }
        };
    }

    >()
    {
    }
}
