// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.cache:
//            CacheBuilder

public final class CacheBuilderSpec
{
    static class AccessDurationParser extends DurationParser
    {

        protected void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit)
        {
            boolean flag;
            if (cachebuilderspec.accessExpirationTimeUnit == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "expireAfterAccess already set");
            cachebuilderspec.accessExpirationDuration = l;
            cachebuilderspec.accessExpirationTimeUnit = timeunit;
        }

        AccessDurationParser()
        {
        }
    }

    static class ConcurrencyLevelParser extends IntegerParser
    {

        protected void parseInteger(CacheBuilderSpec cachebuilderspec, int i)
        {
            boolean flag;
            if (cachebuilderspec.concurrencyLevel == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "concurrency level was already set to ", new Object[] {
                cachebuilderspec.concurrencyLevel
            });
            cachebuilderspec.concurrencyLevel = Integer.valueOf(i);
        }

        ConcurrencyLevelParser()
        {
        }
    }

    static abstract class DurationParser
        implements ValueParser
    {

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag;
            if (s1 != null && !s1.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value of key %s omitted", new Object[] {
                s
            });
            s1.charAt(s1.length() - 1);
            JVM INSTR lookupswitch 4: default 188
        //                       100: 137
        //                       104: 164
        //                       109: 172
        //                       115: 180;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_180;
_L1:
            throw new IllegalArgumentException(String.format("key %s invalid format.  was %s, must end with one of [dDhHmMsS]", new Object[] {
                s, s1
            }));
_L2:
            TimeUnit timeunit = TimeUnit.DAYS;
_L6:
            parseDuration(cachebuilderspec, Long.parseLong(s1.substring(0, s1.length() - 1)), timeunit);
            return;
_L3:
            try
            {
                timeunit = TimeUnit.HOURS;
            }
            // Misplaced declaration of an exception variable
            catch (CacheBuilderSpec cachebuilderspec)
            {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[] {
                    s, s1
                }));
            }
              goto _L6
_L4:
            timeunit = TimeUnit.MINUTES;
              goto _L6
            timeunit = TimeUnit.SECONDS;
              goto _L6
        }

        protected abstract void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit);

        DurationParser()
        {
        }
    }

    static class InitialCapacityParser extends IntegerParser
    {

        protected void parseInteger(CacheBuilderSpec cachebuilderspec, int i)
        {
            boolean flag;
            if (cachebuilderspec.initialCapacity == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "initial capacity was already set to ", new Object[] {
                cachebuilderspec.initialCapacity
            });
            cachebuilderspec.initialCapacity = Integer.valueOf(i);
        }

        InitialCapacityParser()
        {
        }
    }

    static abstract class IntegerParser
        implements ValueParser
    {

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag;
            if (s1 != null && !s1.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value of key %s omitted", new Object[] {
                s
            });
            try
            {
                parseInteger(cachebuilderspec, Integer.parseInt(s1));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CacheBuilderSpec cachebuilderspec)
            {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[] {
                    s, s1
                }), cachebuilderspec);
            }
        }

        protected abstract void parseInteger(CacheBuilderSpec cachebuilderspec, int i);

        IntegerParser()
        {
        }
    }

    static class KeyStrengthParser
        implements ValueParser
    {

        private final LocalCache.Strength strength;

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag;
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "key %s does not take values", new Object[] {
                s
            });
            if (cachebuilderspec.keyStrength == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "%s was already set to %s", new Object[] {
                s, cachebuilderspec.keyStrength
            });
            cachebuilderspec.keyStrength = strength;
        }

        public KeyStrengthParser(LocalCache.Strength strength1)
        {
            strength = strength1;
        }
    }

    static abstract class LongParser
        implements ValueParser
    {

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag;
            if (s1 != null && !s1.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value of key %s omitted", new Object[] {
                s
            });
            try
            {
                parseLong(cachebuilderspec, Long.parseLong(s1));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CacheBuilderSpec cachebuilderspec)
            {
                throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", new Object[] {
                    s, s1
                }), cachebuilderspec);
            }
        }

        protected abstract void parseLong(CacheBuilderSpec cachebuilderspec, long l);

        LongParser()
        {
        }
    }

    static class MaximumSizeParser extends LongParser
    {

        protected void parseLong(CacheBuilderSpec cachebuilderspec, long l)
        {
            boolean flag;
            if (cachebuilderspec.maximumSize == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "maximum size was already set to ", new Object[] {
                cachebuilderspec.maximumSize
            });
            if (cachebuilderspec.maximumWeight == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "maximum weight was already set to ", new Object[] {
                cachebuilderspec.maximumWeight
            });
            cachebuilderspec.maximumSize = Long.valueOf(l);
        }

        MaximumSizeParser()
        {
        }
    }

    static class MaximumWeightParser extends LongParser
    {

        protected void parseLong(CacheBuilderSpec cachebuilderspec, long l)
        {
            boolean flag;
            if (cachebuilderspec.maximumWeight == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "maximum weight was already set to ", new Object[] {
                cachebuilderspec.maximumWeight
            });
            if (cachebuilderspec.maximumSize == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "maximum size was already set to ", new Object[] {
                cachebuilderspec.maximumSize
            });
            cachebuilderspec.maximumWeight = Long.valueOf(l);
        }

        MaximumWeightParser()
        {
        }
    }

    static class RecordStatsParser
        implements ValueParser
    {

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag1 = false;
            boolean flag;
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "recordStats does not take values");
            flag = flag1;
            if (cachebuilderspec.recordStats == null)
            {
                flag = true;
            }
            Preconditions.checkArgument(flag, "recordStats already set");
            cachebuilderspec.recordStats = Boolean.valueOf(true);
        }

        RecordStatsParser()
        {
        }
    }

    static class RefreshDurationParser extends DurationParser
    {

        protected void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit)
        {
            boolean flag;
            if (cachebuilderspec.refreshTimeUnit == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "refreshAfterWrite already set");
            cachebuilderspec.refreshDuration = l;
            cachebuilderspec.refreshTimeUnit = timeunit;
        }

        RefreshDurationParser()
        {
        }
    }

    private static interface ValueParser
    {

        public abstract void parse(CacheBuilderSpec cachebuilderspec, String s, String s1);
    }

    static class ValueStrengthParser
        implements ValueParser
    {

        private final LocalCache.Strength strength;

        public void parse(CacheBuilderSpec cachebuilderspec, String s, String s1)
        {
            boolean flag;
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "key %s does not take values", new Object[] {
                s
            });
            if (cachebuilderspec.valueStrength == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "%s was already set to %s", new Object[] {
                s, cachebuilderspec.valueStrength
            });
            cachebuilderspec.valueStrength = strength;
        }

        public ValueStrengthParser(LocalCache.Strength strength1)
        {
            strength = strength1;
        }
    }

    static class WriteDurationParser extends DurationParser
    {

        protected void parseDuration(CacheBuilderSpec cachebuilderspec, long l, TimeUnit timeunit)
        {
            boolean flag;
            if (cachebuilderspec.writeExpirationTimeUnit == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "expireAfterWrite already set");
            cachebuilderspec.writeExpirationDuration = l;
            cachebuilderspec.writeExpirationTimeUnit = timeunit;
        }

        WriteDurationParser()
        {
        }
    }


    private static final Splitter KEYS_SPLITTER = Splitter.on(',').trimResults();
    private static final Splitter KEY_VALUE_SPLITTER = Splitter.on('=').trimResults();
    private static final ImmutableMap VALUE_PARSERS;
    long accessExpirationDuration;
    TimeUnit accessExpirationTimeUnit;
    Integer concurrencyLevel;
    Integer initialCapacity;
    LocalCache.Strength keyStrength;
    Long maximumSize;
    Long maximumWeight;
    Boolean recordStats;
    long refreshDuration;
    TimeUnit refreshTimeUnit;
    private final String specification;
    LocalCache.Strength valueStrength;
    long writeExpirationDuration;
    TimeUnit writeExpirationTimeUnit;

    private CacheBuilderSpec(String s)
    {
        specification = s;
    }

    public static CacheBuilderSpec disableCaching()
    {
        return parse("maximumSize=0");
    }

    private static Long durationInNanos(long l, TimeUnit timeunit)
    {
        if (timeunit == null)
        {
            return null;
        } else
        {
            return Long.valueOf(timeunit.toNanos(l));
        }
    }

    public static CacheBuilderSpec parse(String s)
    {
        CacheBuilderSpec cachebuilderspec = new CacheBuilderSpec(s);
        if (!s.isEmpty())
        {
            Iterator iterator = KEYS_SPLITTER.split(s).iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                s = ImmutableList.copyOf(KEY_VALUE_SPLITTER.split(s1));
                ValueParser valueparser;
                boolean flag;
                if (!s.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "blank key-value pair");
                if (s.size() <= 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "key-value pair %s with more than one equals sign", new Object[] {
                    s1
                });
                s1 = (String)s.get(0);
                valueparser = (ValueParser)VALUE_PARSERS.get(s1);
                if (valueparser != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "unknown key %s", new Object[] {
                    s1
                });
                if (s.size() == 1)
                {
                    s = null;
                } else
                {
                    s = (String)s.get(1);
                }
                valueparser.parse(cachebuilderspec, s1, s);
            }
        }
        return cachebuilderspec;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CacheBuilderSpec))
            {
                return false;
            }
            obj = (CacheBuilderSpec)obj;
            if (!Objects.equal(initialCapacity, ((CacheBuilderSpec) (obj)).initialCapacity) || !Objects.equal(maximumSize, ((CacheBuilderSpec) (obj)).maximumSize) || !Objects.equal(maximumWeight, ((CacheBuilderSpec) (obj)).maximumWeight) || !Objects.equal(concurrencyLevel, ((CacheBuilderSpec) (obj)).concurrencyLevel) || !Objects.equal(keyStrength, ((CacheBuilderSpec) (obj)).keyStrength) || !Objects.equal(valueStrength, ((CacheBuilderSpec) (obj)).valueStrength) || !Objects.equal(recordStats, ((CacheBuilderSpec) (obj)).recordStats) || !Objects.equal(durationInNanos(writeExpirationDuration, writeExpirationTimeUnit), durationInNanos(((CacheBuilderSpec) (obj)).writeExpirationDuration, ((CacheBuilderSpec) (obj)).writeExpirationTimeUnit)) || !Objects.equal(durationInNanos(accessExpirationDuration, accessExpirationTimeUnit), durationInNanos(((CacheBuilderSpec) (obj)).accessExpirationDuration, ((CacheBuilderSpec) (obj)).accessExpirationTimeUnit)) || !Objects.equal(durationInNanos(refreshDuration, refreshTimeUnit), durationInNanos(((CacheBuilderSpec) (obj)).refreshDuration, ((CacheBuilderSpec) (obj)).refreshTimeUnit)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            initialCapacity, maximumSize, maximumWeight, concurrencyLevel, keyStrength, valueStrength, recordStats, durationInNanos(writeExpirationDuration, writeExpirationTimeUnit), durationInNanos(accessExpirationDuration, accessExpirationTimeUnit), durationInNanos(refreshDuration, refreshTimeUnit)
        });
    }

    CacheBuilder toCacheBuilder()
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$common$cache$LocalCache$Strength[];

            static 
            {
                $SwitchMap$com$google$common$cache$LocalCache$Strength = new int[LocalCache.Strength.values().length];
                try
                {
                    $SwitchMap$com$google$common$cache$LocalCache$Strength[LocalCache.Strength.WEAK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$common$cache$LocalCache$Strength[LocalCache.Strength.SOFT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        CacheBuilder cachebuilder;
        cachebuilder = CacheBuilder.newBuilder();
        if (initialCapacity != null)
        {
            cachebuilder.initialCapacity(initialCapacity.intValue());
        }
        if (maximumSize != null)
        {
            cachebuilder.maximumSize(maximumSize.longValue());
        }
        if (maximumWeight != null)
        {
            cachebuilder.maximumWeight(maximumWeight.longValue());
        }
        if (concurrencyLevel != null)
        {
            cachebuilder.concurrencyLevel(concurrencyLevel.intValue());
        }
        if (keyStrength != null)
        {
            switch (_cls1..SwitchMap.com.google.common.cache.LocalCache.Strength[keyStrength.ordinal()])
            {
            default:
                throw new AssertionError();

            case 1: // '\001'
                cachebuilder.weakKeys();
                break;
            }
        }
        if (valueStrength == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.google.common.cache.LocalCache.Strength[valueStrength.ordinal()];
        JVM INSTR tableswitch 1 2: default 168
    //                   1 265
    //                   2 176;
           goto _L3 _L4 _L5
_L3:
        throw new AssertionError();
_L5:
        cachebuilder.softValues();
_L2:
        if (recordStats != null && recordStats.booleanValue())
        {
            cachebuilder.recordStats();
        }
        if (writeExpirationTimeUnit != null)
        {
            cachebuilder.expireAfterWrite(writeExpirationDuration, writeExpirationTimeUnit);
        }
        if (accessExpirationTimeUnit != null)
        {
            cachebuilder.expireAfterAccess(accessExpirationDuration, accessExpirationTimeUnit);
        }
        if (refreshTimeUnit != null)
        {
            cachebuilder.refreshAfterWrite(refreshDuration, refreshTimeUnit);
        }
        return cachebuilder;
_L4:
        cachebuilder.weakValues();
        if (true) goto _L2; else goto _L6
_L6:
    }

    public String toParsableString()
    {
        return specification;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }

    static 
    {
        VALUE_PARSERS = ImmutableMap.builder().put("initialCapacity", new InitialCapacityParser()).put("maximumSize", new MaximumSizeParser()).put("maximumWeight", new MaximumWeightParser()).put("concurrencyLevel", new ConcurrencyLevelParser()).put("weakKeys", new KeyStrengthParser(LocalCache.Strength.WEAK)).put("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).put("weakValues", new ValueStrengthParser(LocalCache.Strength.WEAK)).put("recordStats", new RecordStatsParser()).put("expireAfterAccess", new AccessDurationParser()).put("expireAfterWrite", new WriteDurationParser()).put("refreshAfterWrite", new RefreshDurationParser()).put("refreshInterval", new RefreshDurationParser()).build();
    }
}
