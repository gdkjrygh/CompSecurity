// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.walmart.android.utils.ViewUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class Utils
{

    public static final long ONE_DAY_IN_MS = 0x5265c00L;
    public static final long ONE_HOUR_IN_MS = 0x36ee80L;

    public Utils()
    {
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        closeable.printStackTrace();
        return;
    }

    public static List fieldsToNameValuePairs(Object obj)
    {
        Field afield[];
        LinkedList linkedlist;
        int i;
        afield = obj.getClass().getFields();
        linkedlist = new LinkedList();
        i = 0;
_L2:
        String s;
        String s2;
        if (i >= afield.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = afield[i].getName();
        s = "";
        String s1 = afield[i].get(obj).toString();
        s = s1;
_L3:
        linkedlist.add(new BasicNameValuePair(s2, s));
        i++;
        if (true) goto _L2; else goto _L1
        Object obj1;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
          goto _L3
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
          goto _L3
_L1:
        return linkedlist;
    }

    public static int getDesiredMemoryClassForScreenSize(Context context)
    {
        int i = ViewUtil.getScreenMinDimension(context);
        byte byte0 = 0;
        if (i <= 320)
        {
            byte0 = 32;
        } else
        {
            if (i <= 480)
            {
                return 42;
            }
            if (i <= 540)
            {
                return 48;
            }
            if (i <= 720)
            {
                return 64;
            }
            if (i <= 800)
            {
                return 64;
            }
            if (i <= 1600)
            {
                return 128;
            }
        }
        return byte0;
    }

    public static InputStream getFileAsInputStream(Context context, String s)
    {
        try
        {
            context = context.getAssets().open(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static String getFileAsString(Context context, String s)
    {
        context = getFileAsInputStream(context, s);
        if (context != null)
        {
            return inputStreamToString(context);
        } else
        {
            return "";
        }
    }

    public static float getImageScaleFactor(DisplayMetrics displaymetrics)
    {
        switch (displaymetrics.densityDpi)
        {
        case 120: // 'x'
        default:
            return 1.1F;

        case 160: 
            return 1.2F;

        case 240: 
            return 1.3F;

        case 320: 
        case 480: 
            return 1.4F;
        }
    }

    public static float getMemClassScaleFactor(Context context)
    {
        float f1 = (float)getMemoryClass(context) / (float)getDesiredMemoryClassForScreenSize(context);
        float f = f1;
        if (f1 > 1.0F)
        {
            f = 1.0F;
        }
        return f;
    }

    public static int getMemoryClass(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
    }

    public static String inputStreamToString(InputStream inputstream)
    {
        return inputStreamToString(inputstream, "ISO-8859-1");
    }

    public static String inputStreamToString(InputStream inputstream, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream, s));
_L1:
        s = inputstream.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        stringbuilder.append(s);
          goto _L1
        inputstream;
        return stringbuilder.toString();
    }

    public static boolean isInForeground(Context context)
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = false;
                Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
                flag = flag1;
                if (obj == null)
                {
                    break label1;
                }
                obj = ((List) (obj)).iterator();
                android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label1;
                    }
                    runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
                } while (!context.getPackageName().equals(runningappprocessinfo.processName));
                if (runningappprocessinfo.importance != 100)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    public static void runOnNewThreadIfMain(Runnable runnable)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            (new Thread(runnable)).start();
            return;
        } else
        {
            runnable.run();
            return;
        }
    }
}
