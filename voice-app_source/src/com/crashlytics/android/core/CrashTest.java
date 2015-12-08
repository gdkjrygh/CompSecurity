// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.AsyncTask;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

public class CrashTest
{

    public CrashTest()
    {
    }

    private void privateMethodThatThrowsException(String s)
    {
        throw new RuntimeException(s);
    }

    public void crashAsyncTask(final long delayMs)
    {
        (new AsyncTask() {

            final CrashTest this$0;
            final long val$delayMs;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                try
                {
                    Thread.sleep(delayMs);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
                throwRuntimeException("Background thread crash");
                return null;
            }

            
            {
                this$0 = CrashTest.this;
                delayMs = l;
                super();
            }
        }).execute(new Void[] {
            (Void)null
        });
    }

    public void indexOutOfBounds()
    {
        int i = (new int[2])[10];
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Out of bounds value: ").append(i).toString());
    }

    public int stackOverflow()
    {
        return stackOverflow() + (int)Math.random();
    }

    public void throwFiveChainedExceptions()
    {
        try
        {
            privateMethodThatThrowsException("1");
            return;
        }
        catch (Exception exception)
        {
            try
            {
                throw new RuntimeException("2", exception);
            }
            catch (Exception exception1)
            {
                try
                {
                    throw new RuntimeException("3", exception1);
                }
                catch (Exception exception2)
                {
                    try
                    {
                        throw new RuntimeException("4", exception2);
                    }
                    catch (Exception exception3)
                    {
                        throw new RuntimeException("5", exception3);
                    }
                }
            }
        }
    }

    public void throwRuntimeException(String s)
    {
        throw new RuntimeException(s);
    }
}
