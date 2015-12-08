// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import com.google.android.apps.youtube.common.L;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LogCollectorActivity extends Activity
{

    private static final List a = new ArrayList(Arrays.asList(new String[] {
        "logcat", "-v", "time", "-d"
    }));
    private static final Set b;

    public LogCollectorActivity()
    {
    }

    private static File a()
    {
        Object obj = Environment.getExternalStorageState();
        if (!"mounted".equals(obj))
        {
            L.b((new StringBuilder("Unable to create log file. External storage not mounted. Current state is [")).append(((String) (obj))).append("]").toString());
            return null;
        }
        obj = new File(Environment.getExternalStorageDirectory(), "logs");
        if (!((File) (obj)).isDirectory())
        {
            ((File) (obj)).mkdir();
        }
        obj = new File(((File) (obj)), "ytlog.txt");
        try
        {
            ((File) (obj)).createNewFile();
        }
        catch (IOException ioexception)
        {
            L.a("Error creating log file", ioexception);
            return ((File) (obj));
        }
        return ((File) (obj));
    }

    private static boolean a(List list, File file)
    {
        Object obj;
        IOException ioexception = null;
        Object obj1 = null;
        byte abyte0[] = new byte[1024];
        Exception exception;
        Process process;
        int i;
        try
        {
            process = Runtime.getRuntime().exec((String[])list.toArray(new String[0]));
            obj = new BufferedInputStream(process.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            list = null;
            file = obj1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            file = ioexception;
        }
        list = new BufferedOutputStream(new FileOutputStream(file));
_L3:
        i = ((InputStream) (obj)).read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        list.write(abyte0, 0, i);
          goto _L3
        ioexception;
        file = ((File) (obj));
        obj = ioexception;
_L7:
        L.a("Error collecting logs. Ironic, right?", ((Throwable) (obj)));
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                L.a("Could not close output stream.", list);
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                L.a("Could not close input stream.", list);
            }
        }
        return false;
_L2:
        process.destroy();
        try
        {
            list.close();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            L.a("Could not close output stream.", list);
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            L.a("Could not close input stream.", list);
        }
        return true;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                L.a("Could not close output stream.", file);
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                L.a("Could not close input stream.", file);
            }
        }
        throw list;
        list;
        file = ioexception;
        continue; /* Loop/switch isn't completed */
        exception;
        file = list;
        list = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = file;
        file = list;
        list = exception;
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_46;
        IOException ioexception1;
        ioexception1;
        list = null;
        file = ((File) (obj));
        obj = ioexception1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onStart()
    {
        super.onStart();
        Object obj = getCallingActivity();
        if (obj == null || !b.contains(((ComponentName) (obj)).getPackageName()))
        {
            finish();
            return;
        }
        obj = a;
        Object obj1 = a();
        if (obj1 != null && a(((List) (obj)), ((File) (obj1))))
        {
            obj = FileProvider.a(this, "com.google.android.youtube.fileprovider", ((File) (obj1)));
        } else
        {
            obj = null;
        }
        obj1 = new Intent();
        if (obj != null)
        {
            ((Intent) (obj1)).setDataAndType(((android.net.Uri) (obj)), getContentResolver().getType(((android.net.Uri) (obj))));
            ((Intent) (obj1)).addFlags(1);
            setResult(-1, ((Intent) (obj1)));
        } else
        {
            setResult(0);
        }
        finish();
    }

    static 
    {
        HashSet hashset = new HashSet();
        b = hashset;
        hashset.add("com.google.android.apps.eureka");
        b.add("com.google.eureka.feedback");
    }
}
