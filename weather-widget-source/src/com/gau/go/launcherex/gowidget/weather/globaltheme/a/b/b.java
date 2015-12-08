// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a.b;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.f;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.e.a;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public final class b
{

    public static String a(Context context, String s, int i, int j, String s1)
    {
        e e1 = null;
        Object obj2 = null;
        Object obj1 = null;
        Object obj = s1;
        com.jiubang.goweather.b.f f1;
        if (i == 1)
        {
            try
            {
                obj = f.a(s1, "UTF-8", "ISO-8859-1");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
                obj = null;
            }
        }
        s1 = e1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        e1 = new e(s, "POST");
        s1 = new ArrayList();
        s1.add(new BasicNameValuePair("handle", (new StringBuilder()).append(i).append("").toString()));
        s1.add(new BasicNameValuePair("data", ((String) (obj))));
        s1.add(new BasicNameValuePair("shandle", (new StringBuilder()).append(j).append("").toString()));
        e1.a(s1);
        f1 = new com.jiubang.goweather.b.f();
        obj = d.a();
        s1 = obj1;
        if (!((c) (obj)).a(f1, context))
        {
            break MISSING_BLOCK_LABEL_235;
        }
        s = ((c) (obj)).a(s, e1, f1);
        s1 = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        context = obj2;
        s = com.jiubang.goweather.e.a.a(s, "ISO-8859-1");
        s1 = s;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        context = s;
        s1 = f.b(s, "ISO-8859-1", "UTF-8");
_L4:
        ((c) (obj)).a();
_L2:
        return s1;
        s;
        s1 = context;
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
            s1 = context;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(String s, Context context, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        Object obj;
        c c1;
        com.jiubang.goweather.b.f f1;
        obj = new e(s, "GET");
        f1 = new com.jiubang.goweather.b.f();
        c1 = d.a();
        if (!c1.a(f1, context)) goto _L4; else goto _L3
_L3:
        int i;
        try
        {
            obj = c1.a(s, ((e) (obj)), f1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            obj = null;
        }
        if (obj == null) goto _L4; else goto _L5
_L5:
        context = new FileOutputStream(s1);
        s = context;
        s1 = new byte[8192];
_L7:
        s = context;
        i = ((InputStream) (obj)).read(s1, 0, 8192);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = context;
        context.write(s1, 0, i);
        if (true) goto _L7; else goto _L6
        s1;
_L13:
        s = context;
        s1.printStackTrace();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return false;
            }
        }
_L2:
        return false;
_L6:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
_L4:
        c1.a();
        return true;
        s1;
        context = null;
_L11:
        s = context;
        s1.printStackTrace();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj == null) goto _L2; else goto _L8
_L8:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return false;
        context;
        s = null;
_L10:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw context;
        context;
        if (true) goto _L10; else goto _L9
_L9:
        s1;
          goto _L11
        s1;
        context = null;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
