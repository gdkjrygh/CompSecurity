// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.base.Ticker;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            GenericMapMaker, MapMakerInternalMap, ComputingConcurrentHashMap, ComputationException, 
//            ImmutableEntry

public final class MapMaker extends GenericMapMaker
{
    static final class ComputingMapAdapter extends ComputingConcurrentHashMap
        implements Serializable
    {

        private static final long serialVersionUID = 0L;

        public Object get(Object obj)
        {
            Object obj1;
            try
            {
                obj1 = getOrCompute(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = ((ExecutionException) (obj)).getCause();
                Throwables.propagateIfInstanceOf(((Throwable) (obj)), com/google/common/collect/ComputationException);
                throw new ComputationException(((Throwable) (obj)));
            }
            if (obj1 == null)
            {
                obj1 = String.valueOf(String.valueOf(computingFunction));
                obj = String.valueOf(String.valueOf(obj));
                throw new NullPointerException((new StringBuilder(((String) (obj1)).length() + 24 + ((String) (obj)).length())).append(((String) (obj1))).append(" returned null for key ").append(((String) (obj))).append(".").toString());
            } else
            {
                return obj1;
            }
        }

        ComputingMapAdapter(MapMaker mapmaker, Function function)
        {
            super(mapmaker, function);
        }
    }

    static final class NullComputingConcurrentMap extends NullConcurrentMap
    {

        private static final long serialVersionUID = 0L;
        final Function computingFunction;

        private Object compute(Object obj)
        {
            Preconditions.checkNotNull(obj);
            try
            {
                obj = computingFunction.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ComputationException(((Throwable) (obj)));
            }
            return obj;
        }

        public Object get(Object obj)
        {
            Object obj1 = compute(obj);
            Preconditions.checkNotNull(obj1, "%s returned null for key %s.", new Object[] {
                computingFunction, obj
            });
            notifyRemoval(obj, obj1);
            return obj1;
        }

        NullComputingConcurrentMap(MapMaker mapmaker, Function function)
        {
            super(mapmaker);
            computingFunction = (Function)Preconditions.checkNotNull(function);
        }
    }

    static class NullConcurrentMap extends AbstractMap
        implements ConcurrentMap, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final RemovalCause removalCause;
        private final RemovalListener removalListener;

        public boolean containsKey(Object obj)
        {
            return false;
        }

        public boolean containsValue(Object obj)
        {
            return false;
        }

        public Set entrySet()
        {
            return Collections.emptySet();
        }

        public Object get(Object obj)
        {
            return null;
        }

        void notifyRemoval(Object obj, Object obj1)
        {
            obj = new RemovalNotification(obj, obj1, removalCause);
            removalListener.onRemoval(((RemovalNotification) (obj)));
        }

        public Object put(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            notifyRemoval(obj, obj1);
            return null;
        }

        public Object putIfAbsent(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Object remove(Object obj)
        {
            return null;
        }

        public boolean remove(Object obj, Object obj1)
        {
            return false;
        }

        public Object replace(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            return null;
        }

        public boolean replace(Object obj, Object obj1, Object obj2)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj2);
            return false;
        }

        NullConcurrentMap(MapMaker mapmaker)
        {
            removalListener = mapmaker.getRemovalListener();
            removalCause = mapmaker.nullRemovalCause;
        }
    }

    static abstract class RemovalCause extends Enum
    {

        private static final RemovalCause $VALUES[];
        public static final RemovalCause COLLECTED;
        public static final RemovalCause EXPIRED;
        public static final RemovalCause EXPLICIT;
        public static final RemovalCause REPLACED;
        public static final RemovalCause SIZE;

        public static RemovalCause valueOf(String s)
        {
            return (RemovalCause)Enum.valueOf(com/google/common/collect/MapMaker$RemovalCause, s);
        }

        public static RemovalCause[] values()
        {
            return (RemovalCause[])$VALUES.clone();
        }

        abstract boolean wasEvicted();

        static 
        {
            EXPLICIT = new RemovalCause("EXPLICIT", 0) {

                boolean wasEvicted()
                {
                    return false;
                }

            };
            REPLACED = new RemovalCause("REPLACED", 1) {

                boolean wasEvicted()
                {
                    return false;
                }

            };
            COLLECTED = new RemovalCause("COLLECTED", 2) {

                boolean wasEvicted()
                {
                    return true;
                }

            };
            EXPIRED = new RemovalCause("EXPIRED", 3) {

                boolean wasEvicted()
                {
                    return true;
                }

            };
            SIZE = new RemovalCause("SIZE", 4) {

                boolean wasEvicted()
                {
                    return true;
                }

            };
            $VALUES = (new RemovalCause[] {
                EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
            });
        }

        private RemovalCause(String s, int i)
        {
            super(s, i);
        }

    }

    static interface RemovalListener
    {

        public abstract void onRemoval(RemovalNotification removalnotification);
    }

    static final class RemovalNotification extends ImmutableEntry
    {

        private static final long serialVersionUID = 0L;
        private final RemovalCause cause;

        public RemovalCause getCause()
        {
            return cause;
        }

        public boolean wasEvicted()
        {
            return cause.wasEvicted();
        }

        RemovalNotification(Object obj, Object obj1, RemovalCause removalcause)
        {
            super(obj, obj1);
            cause = removalcause;
        }
    }


    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = -1;
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    MapMakerInternalMap.Strength keyStrength;
    int maximumSize;
    RemovalCause nullRemovalCause;
    Ticker ticker;
    boolean useCustomMap;
    MapMakerInternalMap.Strength valueStrength;

    public MapMaker()
    {
        initialCapacity = -1;
        concurrencyLevel = -1;
        maximumSize = -1;
        expireAfterWriteNanos = -1L;
        expireAfterAccessNanos = -1L;
    }

    private void checkExpiration(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (expireAfterWriteNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(expireAfterWriteNanos)
        });
        if (expireAfterAccessNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(expireAfterAccessNanos)
        });
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l), timeunit
        });
    }

    public volatile GenericMapMaker concurrencyLevel(int i)
    {
        return concurrencyLevel(i);
    }

    public MapMaker concurrencyLevel(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (concurrencyLevel == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(concurrencyLevel)
        });
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        concurrencyLevel = i;
        return this;
    }

    volatile GenericMapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        return expireAfterAccess(l, timeunit);
    }

    MapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterAccessNanos = timeunit.toNanos(l);
        if (l == 0L && nullRemovalCause == null)
        {
            nullRemovalCause = RemovalCause.EXPIRED;
        }
        useCustomMap = true;
        return this;
    }

    volatile GenericMapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        return expireAfterWrite(l, timeunit);
    }

    MapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterWriteNanos = timeunit.toNanos(l);
        if (l == 0L && nullRemovalCause == null)
        {
            nullRemovalCause = RemovalCause.EXPIRED;
        }
        useCustomMap = true;
        return this;
    }

    int getConcurrencyLevel()
    {
        if (concurrencyLevel == -1)
        {
            return 4;
        } else
        {
            return concurrencyLevel;
        }
    }

    long getExpireAfterAccessNanos()
    {
        if (expireAfterAccessNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterAccessNanos;
        }
    }

    long getExpireAfterWriteNanos()
    {
        if (expireAfterWriteNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterWriteNanos;
        }
    }

    int getInitialCapacity()
    {
        if (initialCapacity == -1)
        {
            return 16;
        } else
        {
            return initialCapacity;
        }
    }

    Equivalence getKeyEquivalence()
    {
        return (Equivalence)MoreObjects.firstNonNull(keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    MapMakerInternalMap.Strength getKeyStrength()
    {
        return (MapMakerInternalMap.Strength)MoreObjects.firstNonNull(keyStrength, MapMakerInternalMap.Strength.STRONG);
    }

    Ticker getTicker()
    {
        return (Ticker)MoreObjects.firstNonNull(ticker, Ticker.systemTicker());
    }

    MapMakerInternalMap.Strength getValueStrength()
    {
        return (MapMakerInternalMap.Strength)MoreObjects.firstNonNull(valueStrength, MapMakerInternalMap.Strength.STRONG);
    }

    public volatile GenericMapMaker initialCapacity(int i)
    {
        return initialCapacity(i);
    }

    public MapMaker initialCapacity(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (initialCapacity == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "initial capacity was already set to %s", new Object[] {
            Integer.valueOf(initialCapacity)
        });
        if (i >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        initialCapacity = i;
        return this;
    }

    volatile GenericMapMaker keyEquivalence(Equivalence equivalence)
    {
        return keyEquivalence(equivalence);
    }

    MapMaker keyEquivalence(Equivalence equivalence)
    {
        boolean flag;
        if (keyEquivalence == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "key equivalence was already set to %s", new Object[] {
            keyEquivalence
        });
        keyEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        useCustomMap = true;
        return this;
    }

    ConcurrentMap makeComputingMap(Function function)
    {
        if (nullRemovalCause == null)
        {
            function = new ComputingMapAdapter(this, function);
        } else
        {
            function = new NullComputingConcurrentMap(this, function);
        }
        return (ConcurrentMap)function;
    }

    MapMakerInternalMap makeCustomMap()
    {
        return new MapMakerInternalMap(this);
    }

    public ConcurrentMap makeMap()
    {
        if (!useCustomMap)
        {
            return new ConcurrentHashMap(getInitialCapacity(), 0.75F, getConcurrencyLevel());
        }
        Object obj;
        if (nullRemovalCause == null)
        {
            obj = new MapMakerInternalMap(this);
        } else
        {
            obj = new NullConcurrentMap(this);
        }
        return (ConcurrentMap)obj;
    }

    volatile GenericMapMaker maximumSize(int i)
    {
        return maximumSize(i);
    }

    MapMaker maximumSize(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if (maximumSize == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Integer.valueOf(maximumSize)
        });
        flag = flag1;
        if (i >= 0)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "maximum size must not be negative");
        maximumSize = i;
        useCustomMap = true;
        if (maximumSize == 0)
        {
            nullRemovalCause = RemovalCause.SIZE;
        }
        return this;
    }

    GenericMapMaker removalListener(RemovalListener removallistener)
    {
        boolean flag;
        if (removalListener == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        super.removalListener = (RemovalListener)Preconditions.checkNotNull(removallistener);
        useCustomMap = true;
        return this;
    }

    MapMaker setKeyStrength(MapMakerInternalMap.Strength strength)
    {
        boolean flag1 = false;
        boolean flag;
        if (keyStrength == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Key strength was already set to %s", new Object[] {
            keyStrength
        });
        keyStrength = (MapMakerInternalMap.Strength)Preconditions.checkNotNull(strength);
        flag = flag1;
        if (keyStrength != MapMakerInternalMap.Strength.SOFT)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "Soft keys are not supported");
        if (strength != MapMakerInternalMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    MapMaker setValueStrength(MapMakerInternalMap.Strength strength)
    {
        boolean flag;
        if (valueStrength == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Value strength was already set to %s", new Object[] {
            valueStrength
        });
        valueStrength = (MapMakerInternalMap.Strength)Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    public volatile GenericMapMaker softValues()
    {
        return softValues();
    }

    public MapMaker softValues()
    {
        return setValueStrength(MapMakerInternalMap.Strength.SOFT);
    }

    public String toString()
    {
        com.google.common.base.MoreObjects.ToStringHelper tostringhelper = MoreObjects.toStringHelper(this);
        if (initialCapacity != -1)
        {
            tostringhelper.add("initialCapacity", initialCapacity);
        }
        if (concurrencyLevel != -1)
        {
            tostringhelper.add("concurrencyLevel", concurrencyLevel);
        }
        if (maximumSize != -1)
        {
            tostringhelper.add("maximumSize", maximumSize);
        }
        if (expireAfterWriteNanos != -1L)
        {
            long l = expireAfterWriteNanos;
            tostringhelper.add("expireAfterWrite", (new StringBuilder(22)).append(l).append("ns").toString());
        }
        if (expireAfterAccessNanos != -1L)
        {
            long l1 = expireAfterAccessNanos;
            tostringhelper.add("expireAfterAccess", (new StringBuilder(22)).append(l1).append("ns").toString());
        }
        if (keyStrength != null)
        {
            tostringhelper.add("keyStrength", Ascii.toLowerCase(keyStrength.toString()));
        }
        if (valueStrength != null)
        {
            tostringhelper.add("valueStrength", Ascii.toLowerCase(valueStrength.toString()));
        }
        if (keyEquivalence != null)
        {
            tostringhelper.addValue("keyEquivalence");
        }
        if (removalListener != null)
        {
            tostringhelper.addValue("removalListener");
        }
        return tostringhelper.toString();
    }

    public volatile GenericMapMaker weakKeys()
    {
        return weakKeys();
    }

    public MapMaker weakKeys()
    {
        return setKeyStrength(MapMakerInternalMap.Strength.WEAK);
    }

    public volatile GenericMapMaker weakValues()
    {
        return weakValues();
    }

    public MapMaker weakValues()
    {
        return setValueStrength(MapMakerInternalMap.Strength.WEAK);
    }
}
