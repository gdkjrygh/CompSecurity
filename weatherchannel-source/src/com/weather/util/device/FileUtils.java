// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import com.weather.util.app.AbstractTwcApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class FileUtils
{

    private static final String TAG = "FileUtils";

    private FileUtils()
    {
    }

    public static void clearDirectory(File file)
    {
        if (file != null && file.exists() && file.isDirectory()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((file = file.listFiles()) != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (file1.isDirectory())
                {
                    clearDirectory(file1);
                }
                delete(file1);
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void clearFiles(File file)
    {
        if (file != null && file.exists() && file.isDirectory()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((file = file.listFiles()) != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (!file1.isDirectory())
                {
                    delete(file1);
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void copyAssetsToDevice(Context context, String s, String s1)
    {
        Object obj4;
        AssetManager assetmanager;
        assetmanager = context.getAssets();
        obj4 = new String[0];
        context = assetmanager.list(s);
        obj4 = context;
_L3:
        int i;
        int j;
        j = obj4.length;
        i = 0;
_L2:
        Object obj;
        Object obj2;
        Context context1;
        Object obj3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String s2;
        String s3;
        String s4;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s4 = obj4[i];
        obj7 = null;
        obj8 = null;
        context = null;
        obj5 = null;
        obj6 = null;
        obj3 = null;
        s3 = (new StringBuilder()).append(s).append(File.separator).append(s4).toString();
        s2 = (new StringBuilder()).append(s1).append(s4).toString();
        context1 = obj7;
        obj = obj8;
        obj2 = obj6;
        if ((new File(s1, s4)).exists())
        {
            break MISSING_BLOCK_LABEL_181;
        }
        context1 = obj7;
        obj = obj8;
        obj2 = obj6;
        context = assetmanager.open(s3);
        context1 = context;
        obj = context;
        obj2 = obj6;
        obj3 = new FileOutputStream(s2);
        copyStream(context, ((OutputStream) (obj3)));
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close input stream for ").append(s3).toString());
            }
        }
        if (obj3 != null)
        {
            try
            {
                ((OutputStream) (obj3)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close output stream for file ").append(s2).toString());
            }
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
        context;
        Log.e("FileUtils", (new StringBuilder()).append("unexpected exception with asset folder ").append(s).toString(), context);
          goto _L3
        obj3;
        context = obj5;
_L7:
        obj = context1;
        obj2 = context;
        Log.e("FileUtils", (new StringBuilder()).append("error in copying asset ").append(s3).append(" to ").append(s2).toString(), ((Throwable) (obj3)));
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close input stream for ").append(s3).toString());
            }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close output stream for file ").append(s2).toString());
            }
        }
          goto _L4
        context;
_L6:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close input stream for ").append(s3).toString());
            }
        }
        if (obj2 != null)
        {
            try
            {
                ((OutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("FileUtils", (new StringBuilder()).append("can't close output stream for file ").append(s2).toString());
            }
        }
        throw context;
_L1:
        return;
        s;
        obj2 = obj3;
        obj = context;
        context = s;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        Object obj1 = obj3;
        obj3 = exception;
        context1 = context;
        context = ((Context) (obj1));
          goto _L7
    }

    public static void copyStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public static boolean delete(File file)
    {
        return file.delete();
    }

    public static File getExternalAppDir()
    {
        return getExternalDir("/files");
    }

    public static File getExternalCacheDir()
    {
        return getExternalDir("/cache");
    }

    private static File getExternalDir(String s)
    {
        String s1 = Environment.getExternalStorageDirectory().getAbsolutePath();
        String s2 = AbstractTwcApplication.getRootContext().getPackageName();
        return new File((new StringBuilder()).append(s1).append("/Android/data/").append(s2).append(s).toString());
    }

    public static File getExternalLogsDir()
    {
        return getExternalDir("/logs");
    }

    public static File getExternalPerformanceDataDir()
    {
        return getExternalDir("/performance");
    }

    public static boolean removeDirectory(File file)
    {
        if (file == null || !file.exists() || !file.isDirectory())
        {
            return false;
        } else
        {
            clearDirectory(file);
            return file.delete();
        }
    }
}
