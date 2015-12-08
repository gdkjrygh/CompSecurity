// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.a;

import android.os.Environment;
import android.os.Process;
import android.text.format.Time;
import com.gtp.a.a.b.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.gtp.a.a.a:
//            a

class b
    implements Runnable
{

    final com.gtp.a.a.a.a a;
    private final String b;
    private final String c;

    public b(com.gtp.a.a.a.a a1, String s, String s1)
    {
        a = a1;
        super();
        b = s;
        c = s1;
    }

    public void run()
    {
        Process.setThreadPriority(19);
        com.gtp.a.a.a.a.a(a).setToNow();
        Object obj = com.gtp.a.a.a.a.a(a).format2445();
        String s = (new StringBuilder()).append(((String) (obj))).append(" : ").append(b).append("\n").toString();
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj = a.b;
        File file = new File(((String) (obj)));
        if (!file.exists())
        {
            file.mkdirs();
        }
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (file.length() > 0x80000L)
        {
            try
            {
                obj = new FileOutputStream((new StringBuilder()).append(((String) (obj))).append(c).toString(), false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((FileNotFoundException) (obj)).printStackTrace();
                obj = null;
            }
        } else
        {
            try
            {
                obj = new FileOutputStream((new StringBuilder()).append(((String) (obj))).append(c).toString(), true);
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                filenotfoundexception.printStackTrace();
                filenotfoundexception = null;
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        ((FileOutputStream) (obj)).write(s.getBytes());
        ((FileOutputStream) (obj)).flush();
        ((FileOutputStream) (obj)).close();
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return;
    }
}
