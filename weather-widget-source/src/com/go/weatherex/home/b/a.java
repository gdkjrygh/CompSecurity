// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.go.weatherex.home.b:
//            n, g, d, b, 
//            e, f

public abstract class a
{

    public static final String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("/GOWeatherEX/common/").toString();
    protected static n b = new n(0x500000);
    protected static a c = null;
    protected static g i = null;
    protected static ScheduledExecutorService j = null;
    protected ThreadPoolExecutor d;
    protected HashMap e;
    protected Queue f;
    protected Object g;
    protected RejectedExecutionHandler h;

    public a()
    {
        d = null;
        f = null;
        g = new Object();
        h = null;
        e = new HashMap();
        f = new ConcurrentLinkedQueue();
        if (i == null)
        {
            i = new g(this, null);
            j = Executors.newSingleThreadScheduledExecutor();
            j.scheduleAtFixedRate(i, 0L, 150L, TimeUnit.MILLISECONDS);
        }
        f();
    }

    public static Bitmap a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
            options.inDither = true;
        }
        try
        {
            inputstream = BitmapFactory.decodeStream(inputstream, null, options);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e("ImageManager", (new StringBuilder()).append("decodeBitmap:").append(inputstream.toString()).toString());
            System.gc();
            return null;
        }
        return inputstream;
    }

    public static Bitmap a(byte abyte0[])
    {
        try
        {
            abyte0 = a(((InputStream) (new ByteArrayInputStream(abyte0))));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            System.gc();
            return null;
        }
        return abyte0;
    }

    static void a(a a1)
    {
        a1.e();
    }

    static void a(a a1, String s, Bitmap bitmap, String s1)
    {
        a1.a(s, bitmap, s1);
    }

    private void a(String s, Bitmap bitmap, String s1)
    {
        d(s1);
        if (!TextUtils.isEmpty(s) && bitmap != null && !bitmap.isRecycled()) goto _L2; else goto _L1
_L1:
        Log.d("mjw", " trying to savenull bitmap");
_L4:
        return;
_L2:
        if (!c()) goto _L4; else goto _L3
_L3:
        if (10 > d())
        {
            Log.w("mjw", "Low free space onsd, do not cache");
            return;
        }
        File file = new File(s1);
        if (!file.exists())
        {
            file.mkdirs();
        }
        c(s1);
        s1 = new File(file, a(s));
        if (s1.exists())
        {
            s1.delete();
        }
        s = null;
        s1 = new FileOutputStream(s1);
        s = s1;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, s1);
        s = s1;
        Log.i("mjw", "Image saved tosd");
        if (s1 == null) goto _L4; else goto _L5
_L5:
        s1.flush();
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
_L7:
        s.printStackTrace();
        return;
        s;
        bitmap = null;
_L9:
        s = bitmap;
        Log.w("mjw", "FileNotFoundException");
        if (bitmap == null) goto _L4; else goto _L6
_L6:
        try
        {
            bitmap.flush();
            bitmap.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
        s1;
        bitmap = s;
        s = s1;
_L8:
        if (bitmap != null)
        {
            try
            {
                bitmap.flush();
                bitmap.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
            }
        }
        throw s;
        s;
          goto _L7
        s1;
        bitmap = s;
        s = s1;
          goto _L8
        s;
        bitmap = s1;
          goto _L9
    }

    public static Bitmap b(String s)
    {
        try
        {
            s = a(new FileInputStream(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            System.gc();
            return null;
        }
        return s;
    }

    private void c(String s)
    {
        File file;
        file = new File(s);
        if (!file.exists())
        {
            file.mkdirs();
        }
        file = new File(s, ".nomedia");
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        file.createNewFile();
        return;
        Exception exception;
        exception;
        Log.i("ImageManager", (new StringBuilder()).append("hideMediaInFolder error, folder = ").append(s).toString());
        return;
    }

    private static boolean c()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    private static int d()
    {
        StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l = statfs.getBlockSize();
        return (int)((double)((long)statfs.getAvailableBlocks() * l) / 1024D / 1024D);
    }

    private void d(String s)
    {
        boolean flag = false;
        if (c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c(s);
        s = (new File(s)).listFiles();
        if (s != null && s.length > 0)
        {
            long l1 = 0L;
            for (int k = 0; k < s.length; k++)
            {
                l1 += s[k].length();
            }

            if (l1 > 0xc800000L || 10 > d())
            {
                int i1 = (int)(0.40000000000000002D * (double)s.length + 1.0D);
                Arrays.sort(s, new d(this));
                Log.i("ImageManager", "Clear some expiredcache files ");
                int l = ((flag) ? 1 : 0);
                while (l < i1) 
                {
                    s[l].delete();
                    l++;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void e()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Runnable runnable;
        if (!b())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        runnable = (Runnable)f.poll();
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        Log.i("ImageManager", (new StringBuilder()).append("downloadImage, executeWaitTask ").append(runnable.toString()).toString());
        a().execute(runnable);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
        h = new b(this);
    }

    protected String a(String s)
    {
        String s1 = s;
        if (s.lastIndexOf("/") > 0)
        {
            s1 = s.substring(s.lastIndexOf("/") + 1);
        }
        return s1;
    }

    public ThreadPoolExecutor a()
    {
        this;
        JVM INSTR monitorenter ;
        ThreadPoolExecutor threadpoolexecutor;
        if (d == null || d.isShutdown())
        {
            d = new ThreadPoolExecutor(3, 5, 10L, TimeUnit.SECONDS, new ArrayBlockingQueue(30), h);
        }
        threadpoolexecutor = d;
        this;
        JVM INSTR monitorexit ;
        return threadpoolexecutor;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(String s, int k, f f1, String s1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        e e1 = (e)e.get(s);
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e1.a(k, f1);
        Log.i("ImageManager", (new StringBuilder()).append("downloadImage  return, duplex task, url:").append(s).append(", add new listener to task").toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        s1 = new e(this, s, s1, null);
        s1.a(k, f1);
        e.put(s, s1);
        a().execute(s1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            b.a(s);
            b.a(s, bitmap);
            return;
        }
    }

    public boolean b()
    {
        boolean flag = false;
        if (!f.isEmpty())
        {
            flag = true;
        }
        return flag;
    }

}
