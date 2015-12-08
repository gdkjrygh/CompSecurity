// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Flushables
{

    private static final Logger logger = Logger.getLogger(com/google/common/io/Flushables.getName());

    private Flushables()
    {
    }

    public static void flush(Flushable flushable, boolean flag)
        throws IOException
    {
        try
        {
            flushable.flush();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Flushable flushable) { }
        if (flag)
        {
            logger.log(Level.WARNING, "IOException thrown while flushing Flushable.", flushable);
            return;
        } else
        {
            throw flushable;
        }
    }

    public static void flushQuietly(Flushable flushable)
    {
        try
        {
            flush(flushable, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Flushable flushable)
        {
            logger.log(Level.SEVERE, "IOException should not have been thrown.", flushable);
        }
    }

}
