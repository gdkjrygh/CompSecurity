// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.sound;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.weather.util.device.FileUtils;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class SoundUtil
{

    private static final String TAG = "SoundUtil";

    private SoundUtil()
    {
    }

    public static boolean deleteNotificationTone(Context context, String s)
    {
        s = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS), s);
        boolean flag = s.delete();
        if (flag)
        {
            Log.i("SoundUtil", (new StringBuilder()).append("deleted: ").append(s).toString());
        }
        MediaScannerConnection.scanFile(context, new String[] {
            s.toString()
        }, null, null);
        return flag;
    }

    public static void installNotificationTone(com.weather.util.prefs.TwcPrefs.Keys keys, String s, int i, Context context, boolean flag)
    {
        File file;
        File file1;
        file1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS);
        file = new File(file1, s);
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        scanMediaFile(keys, context, file, flag);
_L4:
        return;
_L2:
        InputStream inputstream;
        Object obj;
        InputStream inputstream1;
        FileOutputStream fileoutputstream;
        Object obj1;
        Object obj2;
        obj2 = null;
        inputstream = null;
        fileoutputstream = null;
        obj1 = null;
        inputstream1 = inputstream;
        s = obj2;
        obj = fileoutputstream;
        if (!file1.mkdirs())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        inputstream1 = inputstream;
        s = obj2;
        obj = fileoutputstream;
        Log.i("SoundUtil", (new StringBuilder()).append("notification directory created. path=").append(file1).toString());
        inputstream1 = inputstream;
        s = obj2;
        obj = fileoutputstream;
        inputstream = context.getResources().openRawResource(i);
        inputstream1 = inputstream;
        s = inputstream;
        obj = fileoutputstream;
        fileoutputstream = new FileOutputStream(file);
        FileUtils.copyStream(inputstream, fileoutputstream);
        scanMediaFile(keys, context, file, flag);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (com.weather.util.prefs.TwcPrefs.Keys keys)
            {
                Log.w("SoundUtil", (new StringBuilder()).append("can't close is for resource ").append(i).toString());
            }
        }
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.weather.util.prefs.TwcPrefs.Keys keys)
            {
                Log.w("SoundUtil", (new StringBuilder()).append("can't close os for file ").append(file).toString());
            }
            return;
        } else
        {
            return;
        }
        context;
        keys = obj1;
        inputstream = inputstream1;
_L7:
        s = inputstream;
        obj = keys;
        Log.w("SoundUtil", (new StringBuilder()).append("Error writing ").append(file).toString(), context);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("SoundUtil", (new StringBuilder()).append("can't close is for resource ").append(i).toString());
            }
        }
        if (keys == null) goto _L4; else goto _L3
_L3:
        try
        {
            keys.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.weather.util.prefs.TwcPrefs.Keys keys)
        {
            Log.w("SoundUtil", (new StringBuilder()).append("can't close os for file ").append(file).toString());
        }
        return;
        keys;
_L6:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("SoundUtil", (new StringBuilder()).append("can't close is for resource ").append(i).toString());
            }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("SoundUtil", (new StringBuilder()).append("can't close os for file ").append(file).toString());
            }
        }
        throw keys;
        keys;
        obj = fileoutputstream;
        s = inputstream;
        if (true) goto _L6; else goto _L5
_L5:
        context;
        keys = fileoutputstream;
          goto _L7
    }

    private static void scanMediaFile(com.weather.util.prefs.TwcPrefs.Keys keys, Context context, File file, boolean flag)
    {
        file = file.toString();
        keys = new android.media.MediaScannerConnection.OnScanCompletedListener(keys, flag) {

            final boolean val$force;
            final com.weather.util.prefs.TwcPrefs.Keys val$setting;

            public void onScanCompleted(String s, Uri uri)
            {
                Log.i("SoundUtil", (new StringBuilder()).append("Scanned ").append(s).append(", uri=").append(uri).toString());
                SoundUtil.setDefaultSetting(setting, uri.toString(), force);
            }

            
            {
                setting = keys;
                force = flag;
                super();
            }
        };
        MediaScannerConnection.scanFile(context, new String[] {
            file
        }, null, keys);
    }

    public static void setDefaultSetting(com.weather.util.prefs.TwcPrefs.Keys keys, String s, boolean flag)
    {
        Prefs prefs = TwcPrefs.getInstance();
        Object obj;
        if (flag)
        {
            obj = "<uninitialized>";
        } else
        {
            obj = prefs.getString(keys, "<uninitialized>");
        }
        if ("<uninitialized>".equals(obj))
        {
            prefs.putString(keys, s);
            obj = (new StringBuilder()).append(keys);
            if (flag)
            {
                keys = " forced to ";
            } else
            {
                keys = " set to ";
            }
            Log.i("SoundUtil", ((StringBuilder) (obj)).append(keys).append(s).toString());
            return;
        } else
        {
            Log.i("SoundUtil", (new StringBuilder()).append(keys).append(" was already set to ").append(((String) (obj))).toString());
            return;
        }
    }
}
