// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.c.d;
import com.gtp.go.weather.sharephoto.b.g;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            h

public class f
{

    private static f b;
    private int a;
    private Context c;
    private int d;
    private HashMap e;
    private ArrayList f;

    private f(Context context)
    {
        a = 3;
        d = 0;
        c = context;
        d = 0;
        e = new HashMap();
        a();
    }

    static Context a(f f1)
    {
        return f1.c;
    }

    public static f a(Context context)
    {
        if (b == null)
        {
            b = new f(context);
        }
        return b;
    }

    static String a(f f1, String s)
    {
        return f1.a(s);
    }

    private String a(String s)
    {
        String s1 = b(s);
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        }
        s = s.split("=");
        if (s != null && s.length == 2 && !TextUtils.isEmpty(s[1]))
        {
            return s[1];
        } else
        {
            return w.c();
        }
    }

    private void a()
    {
        switch (com.gtp.a.a.c.d.a(c))
        {
        default:
            a = 3;
            return;

        case 1: // '\001'
            a = 4;
            return;

        case 2: // '\002'
            a = 2;
            return;

        case 3: // '\003'
            a = 3;
            return;

        case 4: // '\004'
            a = 4;
            break;
        }
    }

    private String b(String s)
    {
        StringBuilder stringbuilder;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, MD5 not be supported?", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("oh, UTF-8 should be supported?", s);
        }
        stringbuilder = new StringBuilder(s.length * 2);
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = s[i];
            if ((byte0 & 0xff) < 16)
            {
                stringbuilder.append("0");
            }
            stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        }

        return stringbuilder.toString();
    }

    static HashMap b(f f1)
    {
        return f1.e;
    }

    private void b()
    {
        int j = d;
        int i = j;
        if (f != null)
        {
            i = j + f.size();
        }
        if (i == 0)
        {
            c();
        } else
        if (f != null && f.size() > 0 && d < a)
        {
            g g1 = (g)f.remove(0);
            d = d + 1;
            (new h(this, null)).execute(new g[] {
                g1
            });
            return;
        }
    }

    static int c(f f1)
    {
        int i = f1.d;
        f1.d = i - 1;
        return i;
    }

    private void c()
    {
        b = null;
        e.clear();
    }

    static void d(f f1)
    {
        f1.b();
    }

    public String a(long l)
    {
        return (String)e.get(Long.valueOf(l));
    }

    public void a(g g1)
    {
label0:
        {
            if (!e.containsKey(Long.valueOf(g1.a())))
            {
                e.put(Long.valueOf(g1.a()), g1.x());
                if (d >= a)
                {
                    break label0;
                }
                d = d + 1;
                (new h(this, null)).execute(new g[] {
                    g1
                });
            }
            return;
        }
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(g1);
    }
}
