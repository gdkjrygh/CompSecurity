// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.os.AsyncTask;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;

// Referenced classes of package com.crashlytics.android:
//            j

public class CrashTest
{

    public CrashTest()
    {
    }

    public void crashAsyncTask(long l)
    {
        (new j(this, l)).execute(new Void[] {
            null
        });
    }

    public void indexOutOfBounds()
    {
        int i = (new int[2])[10];
        v.a().b().a("Crashlytics", (new StringBuilder("Out of bounds value: ")).append(i).toString());
    }

    public void stackOverflow()
    {
        stackOverflow();
    }

    public void throwFiveChainedExceptions()
    {
        try
        {
            throw new RuntimeException("1");
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
