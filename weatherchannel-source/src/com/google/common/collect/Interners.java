// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Interner, MapMaker, MapMakerInternalMap

public final class Interners
{
    private static class InternerFunction
        implements Function
    {

        private final Interner interner;

        public Object apply(Object obj)
        {
            return interner.intern(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof InternerFunction)
            {
                obj = (InternerFunction)obj;
                return interner.equals(((InternerFunction) (obj)).interner);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return interner.hashCode();
        }

        public InternerFunction(Interner interner1)
        {
            interner = interner1;
        }
    }

    private static class WeakInterner
        implements Interner
    {

        private final MapMakerInternalMap map;

        public Object intern(Object obj)
        {
            do
            {
                Object obj1 = map.getEntry(obj);
                if (obj1 != null)
                {
                    obj1 = ((MapMakerInternalMap.ReferenceEntry) (obj1)).getKey();
                    if (obj1 != null)
                    {
                        return obj1;
                    }
                }
            } while ((Dummy)map.putIfAbsent(obj, Dummy.VALUE) != null);
            return obj;
        }

        private WeakInterner()
        {
            map = (new MapMaker()).weakKeys().keyEquivalence(Equivalence.equals()).makeCustomMap();
        }

    }

    private static final class WeakInterner.Dummy extends Enum
    {

        private static final WeakInterner.Dummy $VALUES[];
        public static final WeakInterner.Dummy VALUE;

        public static WeakInterner.Dummy valueOf(String s)
        {
            return (WeakInterner.Dummy)Enum.valueOf(com/google/common/collect/Interners$WeakInterner$Dummy, s);
        }

        public static WeakInterner.Dummy[] values()
        {
            return (WeakInterner.Dummy[])$VALUES.clone();
        }

        static 
        {
            VALUE = new WeakInterner.Dummy("VALUE", 0);
            $VALUES = (new WeakInterner.Dummy[] {
                VALUE
            });
        }

        private WeakInterner.Dummy(String s, int i)
        {
            super(s, i);
        }
    }


    private Interners()
    {
    }

    public static Function asFunction(Interner interner)
    {
        return new InternerFunction((Interner)Preconditions.checkNotNull(interner));
    }

    public static Interner newStrongInterner()
    {
        return new Interner((new MapMaker()).makeMap()) {

            final ConcurrentMap val$map;

            public Object intern(Object obj)
            {
                Object obj1 = map.putIfAbsent(Preconditions.checkNotNull(obj), obj);
                if (obj1 == null)
                {
                    return obj;
                } else
                {
                    return obj1;
                }
            }

            
            {
                map = concurrentmap;
                super();
            }
        };
    }

    public static Interner newWeakInterner()
    {
        return new WeakInterner();
    }
}
