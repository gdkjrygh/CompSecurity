// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.cache:
//            CacheStats, CacheBuilderSpec, RemovalListener, Weigher, 
//            Cache, CacheLoader, LoadingCache, RemovalNotification

public final class CacheBuilder
{
    static final class NullListener extends Enum
        implements RemovalListener
    {

        private static final NullListener $VALUES[];
        public static final NullListener INSTANCE;

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/cache/CacheBuilder$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])$VALUES.clone();
        }

        public void onRemoval(RemovalNotification removalnotification)
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

    static final class OneWeigher extends Enum
        implements Weigher
    {

        private static final OneWeigher $VALUES[];
        public static final OneWeigher INSTANCE;

        public static OneWeigher valueOf(String s)
        {
            return (OneWeigher)Enum.valueOf(com/google/common/cache/CacheBuilder$OneWeigher, s);
        }

        public static OneWeigher[] values()
        {
            return (OneWeigher[])$VALUES.clone();
        }

        public int weigh(Object obj, Object obj1)
        {
            return 1;
        }

        static 
        {
            INSTANCE = new OneWeigher("INSTANCE", 0);
            $VALUES = (new OneWeigher[] {
                INSTANCE
            });
        }

        private OneWeigher(String s, int i)
        {
            super(s, i);
        }
    }


    static final Supplier CACHE_STATS_COUNTER = new Supplier() {

        public AbstractCache.StatsCounter get()
        {
            return new AbstractCache.SimpleStatsCounter();
        }

        public volatile Object get()
        {
            return get();
        }

    };
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final int DEFAULT_REFRESH_NANOS = 0;
    static final CacheStats EMPTY_STATS = new CacheStats(0L, 0L, 0L, 0L, 0L, 0L);
    static final Supplier NULL_STATS_COUNTER = Suppliers.ofInstance(new AbstractCache.StatsCounter() {

        public void recordEviction()
        {
        }

        public void recordHits(int i)
        {
        }

        public void recordLoadException(long l)
        {
        }

        public void recordLoadSuccess(long l)
        {
        }

        public void recordMisses(int i)
        {
        }

        public CacheStats snapshot()
        {
            return CacheBuilder.EMPTY_STATS;
        }

    });
    static final Ticker NULL_TICKER = new Ticker() {

        public long read()
        {
            return 0L;
        }

    };
    static final int UNSET_INT = -1;
    private static final Logger logger = Logger.getLogger(com/google/common/cache/CacheBuilder.getName());
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    LocalCache.Strength keyStrength;
    long maximumSize;
    long maximumWeight;
    long refreshNanos;
    RemovalListener removalListener;
    Supplier statsCounterSupplier;
    boolean strictParsing;
    Ticker ticker;
    Equivalence valueEquivalence;
    LocalCache.Strength valueStrength;
    Weigher weigher;

    CacheBuilder()
    {
        strictParsing = true;
        initialCapacity = -1;
        concurrencyLevel = -1;
        maximumSize = -1L;
        maximumWeight = -1L;
        expireAfterWriteNanos = -1L;
        expireAfterAccessNanos = -1L;
        refreshNanos = -1L;
        statsCounterSupplier = NULL_STATS_COUNTER;
    }

    private void checkNonLoadingCache()
    {
        boolean flag;
        if (refreshNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher()
    {
        boolean flag2 = true;
        boolean flag = true;
        if (weigher == null)
        {
            if (maximumWeight != -1L)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "maximumWeight requires weigher");
        } else
        {
            if (strictParsing)
            {
                boolean flag1;
                if (maximumWeight != -1L)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "weigher requires maximumWeight");
                return;
            }
            if (maximumWeight == -1L)
            {
                logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                return;
            }
        }
    }

    public static CacheBuilder from(CacheBuilderSpec cachebuilderspec)
    {
        return cachebuilderspec.toCacheBuilder().lenientParsing();
    }

    public static CacheBuilder from(String s)
    {
        return from(CacheBuilderSpec.parse(s));
    }

    public static CacheBuilder newBuilder()
    {
        return new CacheBuilder();
    }

    public Cache build()
    {
        checkWeightWithWeigher();
        checkNonLoadingCache();
        return new LocalCache.LocalManualCache(this);
    }

    public LoadingCache build(CacheLoader cacheloader)
    {
        checkWeightWithWeigher();
        return new LocalCache.LocalLoadingCache(this, cacheloader);
    }

    public CacheBuilder concurrencyLevel(int i)
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

    public CacheBuilder expireAfterAccess(long l, TimeUnit timeunit)
    {
        boolean flag;
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
        expireAfterAccessNanos = timeunit.toNanos(l);
        return this;
    }

    public CacheBuilder expireAfterWrite(long l, TimeUnit timeunit)
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
        expireAfterWriteNanos = timeunit.toNanos(l);
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

    LocalCache.Strength getKeyStrength()
    {
        return (LocalCache.Strength)MoreObjects.firstNonNull(keyStrength, LocalCache.Strength.STRONG);
    }

    long getMaximumWeight()
    {
        if (expireAfterWriteNanos == 0L || expireAfterAccessNanos == 0L)
        {
            return 0L;
        }
        if (weigher == null)
        {
            return maximumSize;
        } else
        {
            return maximumWeight;
        }
    }

    long getRefreshNanos()
    {
        if (refreshNanos == -1L)
        {
            return 0L;
        } else
        {
            return refreshNanos;
        }
    }

    RemovalListener getRemovalListener()
    {
        return (RemovalListener)MoreObjects.firstNonNull(removalListener, NullListener.INSTANCE);
    }

    Supplier getStatsCounterSupplier()
    {
        return statsCounterSupplier;
    }

    Ticker getTicker(boolean flag)
    {
        if (ticker != null)
        {
            return ticker;
        }
        if (flag)
        {
            return Ticker.systemTicker();
        } else
        {
            return NULL_TICKER;
        }
    }

    Equivalence getValueEquivalence()
    {
        return (Equivalence)MoreObjects.firstNonNull(valueEquivalence, getValueStrength().defaultEquivalence());
    }

    LocalCache.Strength getValueStrength()
    {
        return (LocalCache.Strength)MoreObjects.firstNonNull(valueStrength, LocalCache.Strength.STRONG);
    }

    Weigher getWeigher()
    {
        return (Weigher)MoreObjects.firstNonNull(weigher, OneWeigher.INSTANCE);
    }

    public CacheBuilder initialCapacity(int i)
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

    boolean isRecordingStats()
    {
        return statsCounterSupplier == CACHE_STATS_COUNTER;
    }

    CacheBuilder keyEquivalence(Equivalence equivalence)
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
        return this;
    }

    CacheBuilder lenientParsing()
    {
        strictParsing = false;
        return this;
    }

    public CacheBuilder maximumSize(long l)
    {
        boolean flag1 = true;
        boolean flag;
        if (maximumSize == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Long.valueOf(maximumSize)
        });
        if (maximumWeight == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum weight was already set to %s", new Object[] {
            Long.valueOf(maximumWeight)
        });
        if (weigher == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size can not be combined with weigher");
        if (l >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maximum size must not be negative");
        maximumSize = l;
        return this;
    }

    public CacheBuilder maximumWeight(long l)
    {
        boolean flag1 = true;
        boolean flag;
        if (maximumWeight == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum weight was already set to %s", new Object[] {
            Long.valueOf(maximumWeight)
        });
        if (maximumSize == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Long.valueOf(maximumSize)
        });
        maximumWeight = l;
        if (l >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maximum weight must not be negative");
        return this;
    }

    public CacheBuilder recordStats()
    {
        statsCounterSupplier = CACHE_STATS_COUNTER;
        return this;
    }

    public CacheBuilder refreshAfterWrite(long l, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeunit);
        boolean flag;
        if (refreshNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "refresh was already set to %s ns", new Object[] {
            Long.valueOf(refreshNanos)
        });
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "duration must be positive: %s %s", new Object[] {
            Long.valueOf(l), timeunit
        });
        refreshNanos = timeunit.toNanos(l);
        return this;
    }

    public CacheBuilder removalListener(RemovalListener removallistener)
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
        removalListener = (RemovalListener)Preconditions.checkNotNull(removallistener);
        return this;
    }

    CacheBuilder setKeyStrength(LocalCache.Strength strength)
    {
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
        keyStrength = (LocalCache.Strength)Preconditions.checkNotNull(strength);
        return this;
    }

    CacheBuilder setValueStrength(LocalCache.Strength strength)
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
        valueStrength = (LocalCache.Strength)Preconditions.checkNotNull(strength);
        return this;
    }

    public CacheBuilder softValues()
    {
        return setValueStrength(LocalCache.Strength.SOFT);
    }

    public CacheBuilder ticker(Ticker ticker1)
    {
        boolean flag;
        if (ticker == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        ticker = (Ticker)Preconditions.checkNotNull(ticker1);
        return this;
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
        if (maximumSize != -1L)
        {
            tostringhelper.add("maximumSize", maximumSize);
        }
        if (maximumWeight != -1L)
        {
            tostringhelper.add("maximumWeight", maximumWeight);
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
        if (valueEquivalence != null)
        {
            tostringhelper.addValue("valueEquivalence");
        }
        if (removalListener != null)
        {
            tostringhelper.addValue("removalListener");
        }
        return tostringhelper.toString();
    }

    CacheBuilder valueEquivalence(Equivalence equivalence)
    {
        boolean flag;
        if (valueEquivalence == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "value equivalence was already set to %s", new Object[] {
            valueEquivalence
        });
        valueEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        return this;
    }

    public CacheBuilder weakKeys()
    {
        return setKeyStrength(LocalCache.Strength.WEAK);
    }

    public CacheBuilder weakValues()
    {
        return setValueStrength(LocalCache.Strength.WEAK);
    }

    public CacheBuilder weigher(Weigher weigher1)
    {
        boolean flag;
        if (weigher == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (strictParsing)
        {
            if (maximumSize == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "weigher can not be combined with maximum size", new Object[] {
                Long.valueOf(maximumSize)
            });
        }
        weigher = (Weigher)Preconditions.checkNotNull(weigher1);
        return this;
    }

}
