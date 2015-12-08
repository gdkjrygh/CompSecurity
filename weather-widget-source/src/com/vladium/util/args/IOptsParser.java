// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import java.io.PrintWriter;

// Referenced classes of package com.vladium.util.args:
//            OptsParser

public interface IOptsParser
{
    public static abstract class Factory
    {

        public static IOptsParser create(String s, ClassLoader classloader, String s1, String as[])
        {
            return new OptsParser(s, classloader, s1, as);
        }

        public Factory()
        {
        }
    }

    public static interface IOpt
    {

        public abstract String getCanonicalName();

        public abstract String getFirstValue();

        public abstract String getName();

        public abstract String getPatternPrefix();

        public abstract int getValueCount();

        public abstract String[] getValues();
    }

    public static interface IOpts
    {

        public abstract void error(PrintWriter printwriter, int i);

        public abstract String[] getFreeArgs();

        public abstract IOpt[] getOpts();

        public abstract IOpt[] getOpts(String s);

        public abstract boolean hasArg(String s);

        public abstract int usageRequestLevel();
    }


    public static final int DETAILED_USAGE = 2;
    public static final int SHORT_USAGE = 1;

    public abstract IOpts parse(String as[]);

    public abstract void usage(PrintWriter printwriter, int i, int j);
}
