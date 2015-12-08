// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.collect:
//            Interner, Interners, MapMaker, MapMakerInternalMap

private static class <init>
    implements Interner
{
    private static final class Dummy extends Enum
    {

        private static final Dummy $VALUES[];
        public static final Dummy VALUE;

        public static Dummy valueOf(String s)
        {
            return (Dummy)Enum.valueOf(com/google/common/collect/Interners$WeakInterner$Dummy, s);
        }

        public static Dummy[] values()
        {
            return (Dummy[])$VALUES.clone();
        }

        static 
        {
            VALUE = new Dummy("VALUE", 0);
            $VALUES = (new Dummy[] {
                VALUE
            });
        }

        private Dummy(String s, int i)
        {
            super(s, i);
        }
    }


    private final MapMakerInternalMap map;

    public Object intern(Object obj)
    {
        do
        {
            Object obj1 = map.getEntry(obj);
            if (obj1 != null)
            {
                obj1 = ((erenceEntry) (obj1)).getKey();
                if (obj1 != null)
                {
                    return obj1;
                }
            }
        } while ((Dummy)map.putIfAbsent(obj, Dummy.VALUE) != null);
        return obj;
    }

    private Dummy()
    {
        map = (new MapMaker()).weakKeys().keyEquivalence(Equivalence.equals()).makeCustomMap();
    }

    ( )
    {
        this();
    }
}
