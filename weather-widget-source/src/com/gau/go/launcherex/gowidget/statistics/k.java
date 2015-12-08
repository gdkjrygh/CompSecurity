// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            i

class k
    implements Runnable
{

    final i a;
    private final String b;
    private final String c;
    private final Context d;

    public k(i i, String s, String s1, Context context)
    {
        a = i;
        super();
        b = s;
        c = s1;
        d = context;
    }

    public void run()
    {
        Object obj1;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        obj6 = null;
        obj7 = null;
        obj4 = null;
        obj1 = null;
        obj5 = null;
        Process.setThreadPriority(19);
        Object obj;
        obj = d.getFileStreamPath(c);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).createNewFile();
        }
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = d.openFileOutput(c, 32768);
        Object obj2;
        obj4 = obj1;
        obj2 = obj;
        obj1 = new OutputStreamWriter(((java.io.OutputStream) (obj)), "UTF-8");
        ((OutputStreamWriter) (obj1)).write((new StringBuilder()).append(b).append("\r\n").toString());
        ((OutputStreamWriter) (obj1)).flush();
_L13:
        if (obj1 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ((FileOutputStream) (obj)).close();
_L4:
        return;
        obj;
        ((IOException) (obj)).printStackTrace();
        return;
        obj1;
        obj = null;
        obj4 = obj5;
_L11:
        ((FileNotFoundException) (obj1)).printStackTrace();
        if (obj4 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        obj = null;
        obj5 = obj6;
_L10:
        obj4 = obj5;
        obj2 = obj;
        ((UnsupportedEncodingException) (obj1)).printStackTrace();
        if (obj5 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj == null) goto _L4; else goto _L5
_L5:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        obj = null;
        obj5 = obj7;
_L9:
        obj4 = obj5;
        obj2 = obj;
        ((IOException) (obj1)).printStackTrace();
        if (obj5 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj5)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (obj == null) goto _L4; else goto _L6
_L6:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        obj1;
        obj = null;
_L8:
        if (obj4 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj4)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                ((IOException) (obj2)).printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw obj1;
        obj1;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        obj4 = obj1;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        obj5 = obj7;
          goto _L9
        obj3;
        obj5 = obj1;
        obj1 = obj3;
          goto _L9
        obj1;
        obj5 = obj6;
          goto _L10
        obj3;
        obj5 = obj1;
        obj1 = obj3;
          goto _L10
        obj1;
        obj4 = obj5;
          goto _L11
        obj3;
        obj4 = obj1;
        obj1 = obj3;
          goto _L11
_L2:
        obj1 = null;
        obj = null;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
