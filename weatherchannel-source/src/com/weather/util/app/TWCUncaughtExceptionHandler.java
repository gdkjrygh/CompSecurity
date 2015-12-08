// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.app;

import android.content.Context;
import android.os.Debug;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.io.File;

// Referenced classes of package com.weather.util.app:
//            AbstractTwcApplication

public final class TWCUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    public static final String TAG = "TWCUncaughtExceptionHandler";
    private final Thread.UncaughtExceptionHandler chain;

    public TWCUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        chain = (Thread.UncaughtExceptionHandler)Preconditions.checkNotNull(uncaughtexceptionhandler);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.e("TWCUncaughtExceptionHandler", (new StringBuilder()).append("Uncaught exception in thread: ").append(thread).toString(), throwable);
        if (!(throwable instanceof OutOfMemoryError)) goto _L2; else goto _L1
_L1:
        Object obj = AbstractTwcApplication.getRootContext().getExternalFilesDir(null);
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            Log.w("TWCUncaughtExceptionHandler", "can't save hprof dump, no external file dir available");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("TWCUncaughtExceptionHandler", "Unable to save hprof dump file after OOME", ((Throwable) (obj)));
        }
_L2:
        chain.uncaughtException(thread, throwable);
        return;
_L4:
label0:
        {
            if (((File) (obj)).exists() || ((File) (obj)).mkdirs())
            {
                break label0;
            }
            Log.w("TWCUncaughtExceptionHandler", (new StringBuilder()).append("Unable to create directory: ").append(obj).toString());
        }
          goto _L2
        obj = new File(((File) (obj)), "dump.hprof");
        Debug.dumpHprofData(((File) (obj)).getAbsolutePath());
        Log.e("TWCUncaughtExceptionHandler", (new StringBuilder()).append("hprof dump saved to ").append(((File) (obj)).getAbsolutePath()).toString());
          goto _L2
    }
}
