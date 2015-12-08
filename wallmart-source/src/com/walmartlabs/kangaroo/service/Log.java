// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;


public abstract class Log
{
    public static class DefaultLogger extends Log
    {

        static final int CHUNK_SIZE = 4000;
        private static final String EMPTY[] = new String[0];

        String[] chunkify(String s)
        {
            if (s != null) goto _L2; else goto _L1
_L1:
            String as[] = EMPTY;
_L4:
            return as;
_L2:
            int j = s.length();
            int k = j / 4000;
            String as1[];
            int i;
            if (j % 4000 == 0)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            as1 = new String[k + i];
            i = 0;
            as = as1;
            if (i < as1.length)
            {
                k = i * 4000;
                as1[i] = s.substring(k, Math.min(j, k + 4000));
                i++;
                break MISSING_BLOCK_LABEL_48;
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void exception(String s, String s1, Throwable throwable, boolean flag)
        {
            s1 = chunkify(s1);
            int j = s1.length;
            for (int i = 0; i < j; i++)
            {
                android.util.Log.e(s, s1[i], throwable);
            }

        }

        public void print(String s, String s1, boolean flag)
        {
            s1 = chunkify(s1);
            int j = s1.length;
            for (int i = 0; i < j; i++)
            {
                android.util.Log.d(s, s1[i]);
            }

        }


        public DefaultLogger(Level level)
        {
            super(level);
        }
    }

    public static final class Level extends Enum
    {

        private static final Level $VALUES[];
        public static final Level BASIC;
        public static final Level EVERYTHING;
        public static final Level NONE;
        public static final Level PARAMS_AND_BODIES;
        public static final Level SECURE_PARAMS_AND_BODIES;

        public static Level valueOf(String s)
        {
            return (Level)Enum.valueOf(com/walmartlabs/kangaroo/service/Log$Level, s);
        }

        public static Level[] values()
        {
            return (Level[])$VALUES.clone();
        }

        public boolean shouldLog(Level level)
        {
            return !equals(NONE) && !level.equals(NONE) && ordinal() >= level.ordinal();
        }

        static 
        {
            NONE = new Level("NONE", 0);
            BASIC = new Level("BASIC", 1);
            PARAMS_AND_BODIES = new Level("PARAMS_AND_BODIES", 2);
            SECURE_PARAMS_AND_BODIES = new Level("SECURE_PARAMS_AND_BODIES", 3);
            EVERYTHING = new Level("EVERYTHING", 4);
            $VALUES = (new Level[] {
                NONE, BASIC, PARAMS_AND_BODIES, SECURE_PARAMS_AND_BODIES, EVERYTHING
            });
        }

        private Level(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "kangaroo";
    private final Level mLevel;

    public Log(Level level)
    {
        mLevel = level;
    }

    public static Log createDefault(Level level)
    {
        return new DefaultLogger(level);
    }

    public final void exception(Level level, String s, Throwable throwable)
    {
        exception(level, s, throwable, true);
    }

    public final void exception(Level level, String s, Throwable throwable, boolean flag)
    {
        if (mLevel.shouldLog(level))
        {
            exception("kangaroo", s, throwable, flag);
        }
    }

    protected abstract void exception(String s, String s1, Throwable throwable, boolean flag);

    public final void exception(String s, Throwable throwable)
    {
        exception("kangaroo", s, throwable, true);
    }

    public final void print(Level level, String s)
    {
        print(level, s, false);
    }

    public final void print(Level level, String s, boolean flag)
    {
        if (mLevel.shouldLog(level))
        {
            print("kangaroo", s, flag);
        }
    }

    public final void print(String s)
    {
        print(s, false);
    }

    protected abstract void print(String s, String s1, boolean flag);

    public final void print(String s, boolean flag)
    {
        print("kangaroo", s, flag);
    }

    public final boolean shouldLog(Level level)
    {
        return mLevel.shouldLog(level);
    }
}
