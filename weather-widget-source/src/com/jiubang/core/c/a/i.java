// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;

// Referenced classes of package com.jiubang.core.c.a:
//            a, g, h

class i extends AsyncTask
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, h h)
    {
        this(g1);
    }

    protected transient a a(a aa[])
    {
        Object obj;
        Object obj1;
        a a1;
        InputStream inputstream;
        int j = 0;
        a1 = aa[0];
        aa = new File(a1.b);
        c c1;
        if (!aa.exists())
        {
            if (aa.mkdirs())
            {
                j = 1;
            }
        } else
        {
            j = 1;
        }
        if (j == 0) goto _L2; else goto _L1
_L1:
        aa = new e(a1.a, "GET");
        obj = new f();
        c1 = d.a();
        if (!c1.a(((f) (obj)), g.a(a))) goto _L4; else goto _L3
_L3:
        inputstream = c1.a(a1.a, aa, ((f) (obj)));
        if (inputstream == null) goto _L4; else goto _L5
_L5:
        obj = null;
        obj1 = null;
        aa = new FileOutputStream(new File(a1.b, a1.c));
        obj = aa;
        obj1 = new byte[1024];
_L7:
        obj = aa;
        j = inputstream.read(((byte []) (obj1)), 0, 1024);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aa;
        aa.write(((byte []) (obj1)), 0, j);
        if (true) goto _L7; else goto _L6
        obj1;
_L15:
        obj = aa;
        ((FileNotFoundException) (obj1)).printStackTrace();
        if (a1.f != 1)
        {
            (new File(a1.b, a1.c)).delete();
        }
        Exception exception;
        if (aa != null)
        {
            try
            {
                aa.close();
            }
            // Misplaced declaration of an exception variable
            catch (a aa[])
            {
                aa.printStackTrace();
            }
        }
        if (inputstream == null) goto _L4; else goto _L8
_L8:
        inputstream.close();
_L4:
        c1.a();
_L2:
        return a1;
_L6:
        obj = aa;
        a1.f = 1;
        if (a1.f != 1)
        {
            (new File(a1.b, a1.c)).delete();
        }
        if (aa != null)
        {
            try
            {
                aa.close();
            }
            // Misplaced declaration of an exception variable
            catch (a aa[])
            {
                aa.printStackTrace();
            }
        }
        if (inputstream == null) goto _L4; else goto _L9
_L9:
        inputstream.close();
          goto _L4
        aa;
_L11:
        aa.printStackTrace();
          goto _L4
        obj;
        aa = ((a []) (obj1));
        obj1 = obj;
_L13:
        obj = aa;
        ((Exception) (obj1)).printStackTrace();
        if (a1.f != 1)
        {
            (new File(a1.b, a1.c)).delete();
        }
        if (aa != null)
        {
            try
            {
                aa.close();
            }
            // Misplaced declaration of an exception variable
            catch (a aa[])
            {
                aa.printStackTrace();
            }
        }
        if (inputstream == null) goto _L4; else goto _L10
_L10:
        inputstream.close();
          goto _L4
        aa;
          goto _L11
        aa;
_L12:
        if (a1.f != 1)
        {
            (new File(a1.b, a1.c)).delete();
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        throw aa;
        aa;
          goto _L11
        aa;
          goto _L12
        obj1;
          goto _L13
        obj1;
        aa = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected void a(a a1)
    {
        g.b(a).remove(a1.a);
        if (a1.f == 1)
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DOWNLOAD_PHOTO");
            intent.putExtra("extra_photo_path", (new StringBuilder()).append(a1.b).append(File.separator).append(a1.c).toString());
            intent.putExtra("extra_photo_url", a1.a);
            g.a(a).sendBroadcast(intent);
        }
        com.jiubang.core.c.a.g.c(a);
        com.jiubang.core.c.a.g.d(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((a[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }
}
