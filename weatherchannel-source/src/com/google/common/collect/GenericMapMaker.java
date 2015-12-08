// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

abstract class GenericMapMaker
{
    static final class NullListener extends Enum
        implements MapMaker.RemovalListener
    {

        private static final NullListener $VALUES[];
        public static final NullListener INSTANCE;

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/collect/GenericMapMaker$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])$VALUES.clone();
        }

        public void onRemoval(MapMaker.RemovalNotification removalnotification)
        {
        }

        static 
        {
            INSTANCE = new NullListener("INSTANCE", 0);
            $VALUES = (new NullListener[] {
                INSTANCE
            });
        }

        private NullListener(String s, int i)
        {
            super(s, i);
        }
    }


    MapMaker.RemovalListener removalListener;

    GenericMapMaker()
    {
    }

    public abstract GenericMapMaker concurrencyLevel(int i);

    abstract GenericMapMaker expireAfterAccess(long l, TimeUnit timeunit);

    abstract GenericMapMaker expireAfterWrite(long l, TimeUnit timeunit);

    MapMaker.RemovalListener getRemovalListener()
    {
        return (MapMaker.RemovalListener)MoreObjects.firstNonNull(removalListener, NullListener.INSTANCE);
    }

    public abstract GenericMapMaker initialCapacity(int i);

    abstract GenericMapMaker keyEquivalence(Equivalence equivalence);

    abstract ConcurrentMap makeComputingMap(Function function);

    abstract MapMakerInternalMap makeCustomMap();

    public abstract ConcurrentMap makeMap();

    abstract GenericMapMaker maximumSize(int i);

    public abstract GenericMapMaker softValues();

    public abstract GenericMapMaker weakKeys();

    public abstract GenericMapMaker weakValues();
}
