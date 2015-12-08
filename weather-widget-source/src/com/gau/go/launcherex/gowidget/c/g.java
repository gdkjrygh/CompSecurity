// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.statistics.w;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class g
{

    public static final boolean a;
    public static final boolean b;

    public static File a(Bitmap bitmap, String s, String s1, android.graphics.Bitmap.CompressFormat compressformat, int i, Context context, boolean flag)
    {
        if (bitmap == null)
        {
            return null;
        }
        if (!w.a()) goto _L2; else goto _L1
_L1:
        s = new File(Environment.getExternalStorageDirectory(), s);
        if (!s.exists())
        {
            s.mkdirs();
        }
        s = new File((new StringBuilder()).append(s.getPath()).append(File.separator).append(s1).toString());
        s1 = new BufferedOutputStream(new FileOutputStream(s));
        bitmap.compress(compressformat, i, s1);
        s1.flush();
        s1.close();
        bitmap = s;
_L3:
        return bitmap;
        s;
        bitmap = null;
_L4:
        s.printStackTrace();
          goto _L3
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        bitmap.compress(compressformat, i, context.openFileOutput(s1, 0));
        bitmap = context.getFileStreamPath(s1);
          goto _L3
        bitmap;
        bitmap.printStackTrace();
        bitmap = null;
          goto _L3
        s1;
        bitmap = s;
        s = s1;
          goto _L4
    }

    public static String a(String s)
    {
        StringBuilder stringbuilder;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, MD5 not be supported?", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, UTF-8 should be supported?", s);
        }
        stringbuilder = new StringBuilder(s.length * 2);
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = s[i];
            if ((byte0 & 0xff) < 16)
            {
                stringbuilder.append("0");
            }
            stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        }

        return stringbuilder.toString();
    }

    public static void a(Context context, int ai[])
    {
        context = context.getResources().getDisplayMetrics();
        if (ai != null && ai.length >= 2)
        {
            ai[0] = Math.min(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels);
            ai[1] = Math.max(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels);
        }
    }

    public static boolean a(Context context)
    {
        if (context != null)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
                if (context != null && context.isConnected())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, String s, String s1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (w.a())
        {
            s = new File(Environment.getExternalStorageDirectory(), s);
            s = new File((new StringBuilder()).append(s.getPath()).append(File.separator).append(s1).toString());
            flag1 = flag2;
            if (s.exists())
            {
                flag1 = s.delete();
            }
        }
        if (flag)
        {
            flag1 = context.deleteFile(s1);
        }
        return flag1;
    }

    public static boolean b(Context context)
    {
        if (context != null)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
                if (context != null && context.isConnected() && context.getType() == 1)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int c(Context context)
    {
        context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        if (context != null)
        {
            if (context.startsWith("46000") || context.startsWith("46002"))
            {
                return 0;
            }
            if (context.startsWith("46001"))
            {
                return 1;
            }
            if (context.startsWith("46003"))
            {
                return 2;
            }
        }
        return -1;
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
