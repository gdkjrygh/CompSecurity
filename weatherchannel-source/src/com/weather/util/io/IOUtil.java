// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.io;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.weather.util.app.AbstractTwcApplication;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil
{

    private static final String TAG = "IOUtil";

    private IOUtil()
    {
    }

    public static String getStringFromFile(int i)
    {
        return getStringFromFile(AbstractTwcApplication.getRootContext(), i);
    }

    public static String getStringFromFile(Context context, int i)
    {
        Object obj;
        IOException ioexception;
        Object obj1;
        ioexception = null;
        obj1 = null;
        obj = ioexception;
        context = context.getResources().openRawResource(i);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = ioexception;
        Log.e("IOUtil", (new StringBuilder()).append("Null inputStream, unable to find resource ").append(i).toString());
        return null;
        obj = ioexception;
        InputStreamReader inputstreamreader = new InputStreamReader(context, Charsets.UTF_8);
        context = CharStreams.toString(inputstreamreader);
        obj = context;
        inputstreamreader.close();
_L2:
        return context;
        ioexception;
        obj = context;
        try
        {
            Log.e("IOUtil", ioexception.getMessage(), ioexception);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("IOUtil", (new StringBuilder()).append("Unable to find resource ").append(i).toString());
            context = ((Context) (obj));
        }
        continue; /* Loop/switch isn't completed */
        context;
        Log.e("IOUtil", context.getMessage(), context);
        obj = ioexception;
        inputstreamreader.close();
        context = obj1;
        continue; /* Loop/switch isn't completed */
        context;
        obj = ioexception;
        Log.e("IOUtil", context.getMessage(), context);
        context = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        obj = ioexception;
        inputstreamreader.close();
_L3:
        obj = ioexception;
        throw context;
        IOException ioexception1;
        ioexception1;
        obj = ioexception;
        Log.e("IOUtil", ioexception1.getMessage(), ioexception1);
          goto _L3
    }

    public static String getStringFromRawFile(Context context, String s)
    {
        return getStringFromFile(context, context.getResources().getIdentifier(s, "raw", context.getPackageName()));
    }

    public static String getStringFromRawFile(String s)
    {
        return getStringFromFile(AbstractTwcApplication.getRootContext().getResources().getIdentifier(s, "raw", AbstractTwcApplication.getRootContext().getPackageName()));
    }
}
