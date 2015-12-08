// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.e;

import android.os.Environment;
import android.util.Log;
import io.wecloud.message.b.a;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c
{

    static final byte a[] = "\n".getBytes();
    private static boolean b;
    private static boolean c;

    public static void a(String s)
    {
        io/wecloud/message/e/c;
        JVM INSTR monitorenter ;
        Object obj;
        c = a.a;
        if (!c || !Environment.getExternalStorageState().equals("mounted"))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj = Environment.getExternalStorageDirectory().getAbsolutePath();
        s = (new StringBuilder(String.valueOf((new SimpleDateFormat("MM/dd HH:mm:ss")).format(new Date(System.currentTimeMillis()))))).append(" ").append(s).toString();
        File file = new File((new StringBuilder(String.valueOf(obj))).append("/WeCloud/log").toString());
        if (!file.exists())
        {
            file.mkdirs();
        }
        obj = new File((new StringBuilder(String.valueOf(obj))).append("/WeCloud/log").append(File.separator).append("connect.txt").toString());
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).createNewFile();
        }
        obj = new FileOutputStream(((File) (obj)), true);
        ((FileOutputStream) (obj)).write(s.getBytes());
        ((FileOutputStream) (obj)).write(a);
        ((FileOutputStream) (obj)).close();
_L2:
        io/wecloud/message/e/c;
        JVM INSTR monitorexit ;
        return;
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public static void a(String s, String s1)
    {
        if (b)
        {
            Log.d(s, s1);
        }
        a(s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (b)
        {
            Log.e(s, s1);
        }
        a(s1);
    }

    public static void b(String s, String s1)
    {
        if (b)
        {
            Log.i(s, s1);
        }
        a(s1);
    }

    public static void c(String s, String s1)
    {
        if (b)
        {
            Log.w(s, s1);
        }
        a(s1);
    }

    public static void d(String s, String s1)
    {
        if (b)
        {
            Log.e(s, s1);
        }
        a(s1);
    }

    static 
    {
        b = a.b;
        c = a.a;
    }
}
