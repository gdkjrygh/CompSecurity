// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

private static abstract class <init>
{
    private static class ForwardingTypeCollector extends TypeToken.TypeCollector
    {

        private final TypeToken.TypeCollector _flddelegate;

        Iterable getInterfaces(Object obj)
        {
            return _flddelegate.getInterfaces(obj);
        }

        Class getRawType(Object obj)
        {
            return _flddelegate.getRawType(obj);
        }

        Object getSuperclass(Object obj)
        {
            return _flddelegate.getSuperclass(obj);
        }

        ForwardingTypeCollector(TypeToken.TypeCollector typecollector)
        {
            super(null);
            _flddelegate = typecollector;
        }
    }


    static final collectTypes FOR_GENERIC_TYPE = new TypeToken.TypeCollector() {

        Iterable getInterfaces(TypeToken typetoken)
        {
            return typetoken.getGenericInterfaces();
        }

        volatile Iterable getInterfaces(Object obj)
        {
            return getInterfaces((TypeToken)obj);
        }

        Class getRawType(TypeToken typetoken)
        {
            return typetoken.getRawType();
        }

        volatile Class getRawType(Object obj)
        {
            return getRawType((TypeToken)obj);
        }

        TypeToken getSuperclass(TypeToken typetoken)
        {
            return typetoken.getGenericSuperclass();
        }

        volatile Object getSuperclass(Object obj)
        {
            return getSuperclass((TypeToken)obj);
        }

    };
    static final _cls1.getSuperclass FOR_RAW_TYPE = new TypeToken.TypeCollector() {

        Iterable getInterfaces(Class class1)
        {
            return Arrays.asList(class1.getInterfaces());
        }

        volatile Iterable getInterfaces(Object obj)
        {
            return getInterfaces((Class)obj);
        }

        Class getRawType(Class class1)
        {
            return class1;
        }

        volatile Class getRawType(Object obj)
        {
            return getRawType((Class)obj);
        }

        Class getSuperclass(Class class1)
        {
            return class1.getSuperclass();
        }

        volatile Object getSuperclass(Object obj)
        {
            return getSuperclass((Class)obj);
        }

    };

    private int collectTypes(Object obj, Map map)
    {
        Object obj1 = (Integer)map.get(this);
        if (obj1 != null)
        {
            return ((Integer) (obj1)).intValue();
        }
        int i;
        if (getRawType(obj).isInterface())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        for (obj1 = getInterfaces(obj).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            i = Math.max(i, collectTypes(((Iterator) (obj1)).next(), map));
        }

        obj1 = getSuperclass(obj);
        int j = i;
        if (obj1 != null)
        {
            j = Math.max(i, collectTypes(obj1, map));
        }
        map.put(obj, Integer.valueOf(j + 1));
        return j + 1;
    }

    private static ImmutableList sortKeysByValue(Map map, Comparator comparator)
    {
        return (new Ordering(comparator, map) {

            final Map val$map;
            final Comparator val$valueComparator;

            public int compare(Object obj, Object obj1)
            {
                return valueComparator.compare(map.get(obj), map.get(obj1));
            }

            
            {
                valueComparator = comparator;
                map = map1;
                super();
            }
        }).immutableSortedCopy(map.keySet());
    }

    final Copy classesOnly()
    {
        return new ForwardingTypeCollector(this) {

            final TypeToken.TypeCollector this$0;

            ImmutableList collectTypes(Iterable iterable)
            {
                com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
                iterable = iterable.iterator();
                do
                {
                    if (!iterable.hasNext())
                    {
                        break;
                    }
                    Object obj = iterable.next();
                    if (!getRawType(obj).isInterface())
                    {
                        builder.add(obj);
                    }
                } while (true);
                return super.collectTypes(builder.build());
            }

            Iterable getInterfaces(Object obj)
            {
                return ImmutableSet.of();
            }

            
            {
                this$0 = TypeToken.TypeCollector.this;
                super(typecollector1);
            }
        };
    }

    ImmutableList collectTypes(Iterable iterable)
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        for (iterable = iterable.iterator(); iterable.hasNext(); collectTypes(iterable.next(), ((Map) (hashmap)))) { }
        return sortKeysByValue(hashmap, Ordering.natural().reverse());
    }

    final ImmutableList collectTypes(Object obj)
    {
        return collectTypes(((Iterable) (ImmutableList.of(obj))));
    }

    abstract Iterable getInterfaces(Object obj);

    abstract Class getRawType(Object obj);

    abstract Object getSuperclass(Object obj);


    private _cls4.val.map()
    {
    }

    _cls4.val.map(_cls4.val.map map)
    {
        this();
    }
}
