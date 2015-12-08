// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.c.d;
import com.gtp.go.weather.sharephoto.d.m;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.core.c.a:
//            d, e, a, f, 
//            c

public class b
{

    private Context a;
    private ConcurrentHashMap b;
    private com.jiubang.core.c.a.d c;
    private volatile boolean d;
    private ExecutorService e;
    private com.jiubang.core.c.a.e f;
    private boolean g;
    private boolean h;
    private boolean i;
    private com.jiubang.core.c.a.c j;

    public b(Context context)
    {
        d = false;
        g = true;
        h = false;
        i = false;
        a = context;
        b = new ConcurrentHashMap();
        c = new com.jiubang.core.c.a.d(this);
        f = new com.jiubang.core.c.a.e(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a.registerReceiver(f, intentfilter);
        d = false;
        int k = a();
        g = com.gtp.a.a.c.d.b(context);
        e = Executors.newFixedThreadPool(k);
    }

    private int a()
    {
        byte byte0 = 4;
        switch (com.gtp.a.a.c.d.a(a))
        {
        default:
            byte0 = 3;
            // fall through

        case 1: // '\001'
        case 4: // '\004'
            return byte0;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    public static String a(String s)
    {
        String s1 = m.a(s);
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return Integer.toString(s.hashCode());
        }
    }

    private boolean a(a a1, String s, String s1)
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag4 = false;
        flag5 = false;
        flag3 = false;
        flag2 = false;
        flag1 = flag2;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L3
_L3:
        Object obj;
        Object obj1;
        int k;
        c.sendMessage(c.obtainMessage(0, a1));
        obj = new e(s, "GET");
        f f1 = new f();
        obj1 = com.jiubang.goweather.b.d.a();
        byte abyte0[];
        long l;
        long l1;
        try
        {
            obj1 = ((c) (obj1)).a(s, ((e) (obj)), f1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            obj1 = null;
        }
        flag1 = flag2;
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        obj = null;
        if (!w.a()) goto _L6; else goto _L5
_L5:
        obj = new FileOutputStream(s1);
        s = ((String) (obj));
        l1 = f1.o();
        l = 0L;
        s = ((String) (obj));
        abyte0 = new byte[8192];
_L12:
        s = ((String) (obj));
        if (i) goto _L8; else goto _L7
_L7:
        s = ((String) (obj));
        k = ((InputStream) (obj1)).read(abyte0, 0, 8192);
        if (k == -1) goto _L8; else goto _L9
_L9:
        s = ((String) (obj));
        ((FileOutputStream) (obj)).write(abyte0, 0, k);
        l += k;
        if (l1 <= 0L) goto _L11; else goto _L10
_L10:
        s = ((String) (obj));
        k = (int)((100L * l) / l1);
_L14:
        s = ((String) (obj));
        a1.e = k;
        s = ((String) (obj));
        c.sendMessage(c.obtainMessage(1, a1));
          goto _L12
        a1;
_L28:
        s = ((String) (obj));
        a1.printStackTrace();
        boolean flag;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                a1.printStackTrace();
            }
        }
        flag1 = flag2;
        if (obj1 == null) goto _L2; else goto _L13
_L13:
        ((InputStream) (obj1)).close();
        flag1 = flag2;
_L2:
        return flag1;
_L11:
        k = 0;
          goto _L14
_L8:
        s = ((String) (obj));
        if (!i) goto _L16; else goto _L15
_L15:
        s = ((String) (obj));
        k = a1.e;
        if (k != 100) goto _L17; else goto _L16
_L16:
        flag = true;
_L20:
        s = ((String) (obj));
_L25:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                a1.printStackTrace();
            }
        }
        flag1 = flag;
        if (obj1 == null) goto _L2; else goto _L18
_L18:
        ((InputStream) (obj1)).close();
        return flag;
        a1;
_L23:
        a1.printStackTrace();
        return flag;
_L17:
        s = ((String) (obj));
        a1 = new File(s1);
        flag = flag4;
        if (a1 == null) goto _L20; else goto _L19
_L19:
        flag = flag4;
        s = ((String) (obj));
        if (!a1.exists()) goto _L20; else goto _L21
_L21:
        s = ((String) (obj));
        a1.delete();
        flag = flag4;
          goto _L20
        a1;
_L30:
        s = ((String) (obj));
        a1.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                a1.printStackTrace();
            }
        }
        flag1 = flag2;
        if (obj1 == null) goto _L2; else goto _L22
_L22:
        ((InputStream) (obj1)).close();
        return false;
        a1;
        flag = flag3;
          goto _L23
_L6:
        flag = flag5;
        s = ((String) (obj));
        if (!s1.contains(".png")) goto _L25; else goto _L24
_L24:
        flag = flag5;
        s = ((String) (obj));
        if (!h) goto _L25; else goto _L26
_L26:
        s1 = BitmapFactory.decodeStream(((InputStream) (obj1)));
        flag = flag5;
        s = ((String) (obj));
        if (s1 == null) goto _L25; else goto _L27
_L27:
        a1.d = s1;
        flag = flag5;
        s = ((String) (obj));
          goto _L25
        a1;
        obj = null;
          goto _L28
        a1;
        s = null;
_L29:
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
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw a1;
        a1;
        flag = flag3;
          goto _L23
        a1;
          goto _L29
        a1;
        obj = null;
          goto _L30
    }

    static boolean a(b b1)
    {
        return b1.d;
    }

    static boolean a(b b1, a a1, String s, String s1)
    {
        return b1.a(a1, s, s1);
    }

    static boolean a(b b1, boolean flag)
    {
        b1.g = flag;
        return flag;
    }

    static com.jiubang.core.c.a.d b(b b1)
    {
        return b1.c;
    }

    static com.jiubang.core.c.a.c c(b b1)
    {
        return b1.j;
    }

    static ConcurrentHashMap d(b b1)
    {
        return b1.b;
    }

    public void a(a a1)
    {
label0:
        {
            if (a1 != null && !d && (!b.containsKey(a1.a) || ((a)b.get(a1.a)).f == 3))
            {
                if (!b.containsKey(a1.a))
                {
                    b.put(a1.a, a1);
                }
                if (!g)
                {
                    break label0;
                }
                e.execute(new com.jiubang.core.c.a.f(this, a1));
            }
            return;
        }
        c.sendMessage(c.obtainMessage(3, a1));
    }

    public void a(com.jiubang.core.c.a.c c1)
    {
        j = c1;
    }

    public void a(boolean flag)
    {
        d = true;
        i = flag;
        a.unregisterReceiver(f);
        if (j != null)
        {
            j = null;
        }
        if (flag)
        {
            e.shutdownNow();
        } else
        {
            e.shutdown();
        }
        c.removeCallbacksAndMessages(null);
    }
}
