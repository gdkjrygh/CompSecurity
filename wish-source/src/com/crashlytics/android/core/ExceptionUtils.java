// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

final class ExceptionUtils
{

    private ExceptionUtils()
    {
    }

    private static String getMessage(Throwable throwable)
    {
        throwable = throwable.getLocalizedMessage();
        if (throwable == null)
        {
            return null;
        } else
        {
            return throwable.replaceAll("(\r\n|\n|\f)", " ");
        }
    }

    public static void writeStackTrace(Context context, Throwable throwable, String s)
    {
        Context context1;
        Object obj;
        context1 = null;
        obj = null;
        context = new PrintWriter(context.openFileOutput(s, 0));
        writeStackTrace(throwable, ((Writer) (context)));
        CommonUtils.closeOrLog(context, "Failed to close stack trace writer.");
        return;
        throwable;
        context = obj;
_L4:
        context1 = context;
        Fabric.getLogger().e("CrashlyticsCore", "Failed to create PrintWriter", throwable);
        CommonUtils.closeOrLog(context, "Failed to close stack trace writer.");
        return;
        context;
_L2:
        CommonUtils.closeOrLog(context1, "Failed to close stack trace writer.");
        throw context;
        throwable;
        context1 = context;
        context = throwable;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeStackTrace(Throwable throwable, OutputStream outputstream)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        outputstream = new PrintWriter(outputstream);
        writeStackTrace(throwable, ((Writer) (outputstream)));
        CommonUtils.closeOrLog(outputstream, "Failed to close stack trace writer.");
        return;
        outputstream;
        throwable = obj1;
_L4:
        obj = throwable;
        Fabric.getLogger().e("CrashlyticsCore", "Failed to create PrintWriter", outputstream);
        CommonUtils.closeOrLog(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
_L2:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        obj = outputstream;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throwable = outputstream;
        outputstream = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeStackTrace(Throwable throwable, Writer writer)
    {
        int i = 1;
_L4:
        if (throwable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = getMessage(throwable);
        String s;
        boolean flag;
        int j;
        if (obj == null)
        {
            obj = "";
        }
        break MISSING_BLOCK_LABEL_155;
        writer.write((new StringBuilder()).append(s).append(throwable.getClass().getName()).append(": ").append(((String) (obj))).append("\n").toString());
        flag = false;
        obj = throwable.getStackTrace();
        j = obj.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = obj[i];
        writer.write((new StringBuilder()).append("\tat ").append(s.toString()).append("\n").toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throwable = throwable.getCause();
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
        throwable;
        Fabric.getLogger().e("CrashlyticsCore", "Could not write stack trace", throwable);
_L3:
        return;
        if (i != 0)
        {
            s = "";
        } else
        {
            s = "Caused by: ";
        }
        break MISSING_BLOCK_LABEL_19;
    }

    public static void writeStackTraceIfNotNull(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream != null)
        {
            writeStackTrace(throwable, outputstream);
        }
    }
}
