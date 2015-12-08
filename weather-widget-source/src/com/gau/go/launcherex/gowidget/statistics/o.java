// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.text.format.Time;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            n, w, p

public class o
{

    private static String a = "";
    private Context b;
    private Time c;
    private final ExecutorService d = Executors.newFixedThreadPool(1);

    public o(Context context)
    {
        b = context;
        c = new Time();
        a = (new StringBuilder()).append(b.getApplicationContext().getFilesDir().getAbsolutePath()).append("/payment_statistics.temp").toString();
    }

    static Context a(o o1)
    {
        return o1.b;
    }

    static String a(o o1, n n1)
    {
        return o1.b(n1);
    }

    static void a(o o1, String s)
    {
        o1.a(s);
    }

    private void a(String s)
    {
        Object obj;
        Object obj1;
        obj = new File(a);
        if (!((File) (obj)).exists())
        {
            try
            {
                ((File) (obj)).createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj1 = new FileOutputStream(((File) (obj)), true);
        obj = obj1;
        ((FileOutputStream) (obj1)).write((new StringBuilder()).append(s).append("\n").toString().getBytes());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
_L2:
        return;
        s;
        s.printStackTrace();
        return;
        Exception exception;
        exception;
        s = null;
_L5:
        obj = s;
        exception.printStackTrace();
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            s.flush();
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        s;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).flush();
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        s = ((String) (obj1));
          goto _L5
    }

    private String b(n n1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("6||");
        stringbuffer.append(android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id"));
        stringbuffer.append("||");
        c.setToNow();
        stringbuffer.append(c.format("%Y-%m-%d %T"));
        stringbuffer.append("||");
        stringbuffer.append(n1.a);
        stringbuffer.append("||");
        stringbuffer.append(n1.b);
        stringbuffer.append("||");
        stringbuffer.append(n1.c);
        stringbuffer.append("||");
        stringbuffer.append(n1.d);
        stringbuffer.append("||");
        stringbuffer.append(n1.e);
        stringbuffer.append("||");
        stringbuffer.append(n1.f);
        stringbuffer.append("||");
        String s = w.d(b);
        n1 = s;
        if (s == null)
        {
            n1 = "0000000000000000";
        }
        stringbuffer.append(n1);
        stringbuffer.append("||");
        stringbuffer.append(w.n(b));
        stringbuffer.append("||");
        stringbuffer.append(w.f(b));
        stringbuffer.append("||");
        stringbuffer.append(w.e(b));
        return stringbuffer.toString();
    }

    public List a()
    {
        Object obj;
        File file;
        obj = null;
        file = new File(a);
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList();
        Object obj1 = new BufferedReader(new FileReader(file));
_L6:
        obj = obj1;
        String s = ((BufferedReader) (obj1)).readLine();
        if (s == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        arraylist.add(s);
        if (true) goto _L6; else goto _L5
_L5:
        Object obj2;
        obj2;
_L9:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
                file.delete();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return arraylist;
            }
        }
        return arraylist;
_L4:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
                file.delete();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return arraylist;
            }
            return arraylist;
        } else
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj2;
        obj1 = obj;
        obj = obj2;
_L8:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
                file.delete();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L8; else goto _L7
_L7:
        obj2;
        obj1 = null;
        if (true) goto _L9; else goto _L2
_L2:
        return null;
    }

    public void a(n n1)
    {
        d.execute(new p(this, n1));
    }

}
