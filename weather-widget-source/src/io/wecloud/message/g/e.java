// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import io.wecloud.message.d.g;
import io.wecloud.message.e.a;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;
import io.wecloud.message.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.wecloud.message.g:
//            l, d, c, j, 
//            f, b, a, h, 
//            i, k

public class e
    implements l
{

    long a;
    boolean b;
    boolean c;
    public int d;
    boolean e;
    boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    private k l;
    private Context m;
    private d n;
    private io.wecloud.message.g.c o;
    private boolean p;
    private g q;
    private b r;
    private Timer s;
    private boolean t;

    public e(Context context)
    {
        a = 0L;
        b = false;
        c = false;
        d = 0;
        e = false;
        f = false;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        p = false;
        t = false;
        io.wecloud.message.e.c.b("CSH", "ConnManager create");
        c = false;
        m = context;
        r = io.wecloud.message.e.b.a(context);
        n = new d(this);
        n.start();
        o = new io.wecloud.message.g.c(this);
        o.start();
    }

    static Context a(e e1)
    {
        return e1.m;
    }

    static void a(e e1, k k1)
    {
        e1.l = k1;
    }

    static void a(e e1, Timer timer)
    {
        e1.s = timer;
    }

    static b b(e e1)
    {
        return e1.r;
    }

    private void b(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            (new Timer()).schedule(new io.wecloud.message.g.j(this), 5000L);
            return;

        case 2: // '\002'
            r.a(true);
            return;

        case 3: // '\003'
            r.a(false);
            break;
        }
    }

    private void b(String s1)
    {
        try
        {
            r.a(io.wecloud.message.e.a.a(s1));
            c(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    static k c(e e1)
    {
        return e1.l;
    }

    private void c(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.split(",");
            int j1 = s1.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s2 = s1[i1];
                try
                {
                    b(Integer.parseInt(s2));
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                i1++;
            }
        }
    }

    static io.wecloud.message.g.c d(e e1)
    {
        return e1.o;
    }

    static d e(e e1)
    {
        return e1.n;
    }

    public void a()
    {
        io.wecloud.message.e.c.b("CSH", "login");
        if (l != null)
        {
            f();
        }
        q = new g(m, new f(this), d);
        q.start();
        r.a(io.wecloud.message.e.a.a());
    }

    public void a(int i1)
    {
label0:
        {
            if (n != null)
            {
                ArrayList arraylist = new ArrayList();
                if (r.a(arraylist, i1))
                {
                    f = true;
                }
                if (arraylist.size() <= 0)
                {
                    break label0;
                }
                t = true;
                n.a(io.wecloud.message.g.b.a(arraylist));
            }
            return;
        }
        t = false;
        r.b();
        io.wecloud.message.e.c.b("CYF", "send log, empty data...");
    }

    public void a(int i1, String s1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis() - a;
        if (l1 <= (long)io.wecloud.message.c.a.l(m)) goto _L2; else goto _L1
_L1:
        io.wecloud.message.e.c.d("CSH", "\u5FC3\u8DF3\u54CD\u5E94\u8D85\u65F6\uFF0C\u7B49\u5F85\u91CD\u8FDE");
        boolean flag1;
        if (d >= 3)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        flag1 = n();
        if (flag1 || i1 == 0) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        d();
        a = System.currentTimeMillis();
        r.a(io.wecloud.message.e.a.a(7, ""));
          goto _L3
        s1;
        throw s1;
_L2:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        io.wecloud.message.j.c(m);
        a(s1);
          goto _L3
_L6:
        if (i1 != 1) goto _L3; else goto _L7
_L7:
label0:
        {
            if (l1 < (long)io.wecloud.message.c.a.k(m))
            {
                break MISSING_BLOCK_LABEL_190;
            }
            if (!n() || p)
            {
                break label0;
            }
            io.wecloud.message.e.c.b("ConnManager", "\u6BCF\u5206\u949F\u68C0\u67E5\u5FC3\u8DF3\uFF0C\u5230\u5FC3\u8DF3\u95F4\u9694\uFF0Cacuqire wake lock --->");
            io.wecloud.message.j.b(m);
            io.wecloud.message.j.a(m, m.getPackageName());
        }
          goto _L3
        io.wecloud.message.j.a();
          goto _L3
        io.wecloud.message.j.a();
        io.wecloud.message.e.c.b("ConnManager", "\u6BCF\u5206\u949F\u68C0\u67E5\u5FC3\u8DF3\uFF0C\u672A\u5230\u5FC3\u8DF3\u95F4\u9694\uFF0Crelease wake lock --->");
          goto _L3
    }

    public void a(long l1)
    {
        if (n != null)
        {
            n.a(io.wecloud.message.g.b.a(l1));
        }
    }

    public void a(io.wecloud.message.g.a a1)
    {
        if (a1.a()) goto _L2; else goto _L1
_L1:
        r.a(io.wecloud.message.e.a.a(9, String.valueOf(a1.b())));
        d();
_L14:
        return;
_L2:
        a1.a;
        JVM INSTR lookupswitch 4: default 76
    //                   3: 77
    //                   101: 303
    //                   102: 551
    //                   104: 521;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        return;
_L4:
        String s1;
        long l1;
        a1 = new JSONObject(a1.c());
        s1 = a1.getString("info");
        l1 = a1.getLong("msgid");
        io.wecloud.message.c.a.a(m, l1);
        int i1 = a1.getInt("appkey");
        a1 = String.valueOf(i1);
_L11:
        Object obj;
        if (a1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1;
        JSONObject jsonobject;
        boolean flag;
        try
        {
            flag = TextUtils.isEmpty(s1);
        }
        // Misplaced declaration of an exception variable
        catch (io.wecloud.message.g.a a1)
        {
            a1.printStackTrace();
            r.a(io.wecloud.message.e.a.b(a1.getMessage()));
            return;
        }
        obj = s1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        obj = new String(Base64.decode(s1.getBytes("UTF-8"), 2), "UTF-8");
_L12:
        jsonobject = new JSONObject(((String) (obj)));
        obj1 = null;
        s1 = obj1;
        if (jsonobject == null) goto _L9; else goto _L8
_L8:
        s1 = obj1;
        if (jsonobject.has("message_type"))
        {
            s1 = jsonobject.getString("message_type");
        }
_L9:
        if (!TextUtils.isEmpty(s1) && s1.equals("0"))
        {
            if (jsonobject.has("message_action"))
            {
                io.wecloud.message.e.c.b("ConnManager", (new StringBuilder("\u7CFB\u7EDF\u6307\u4EE4, action = ")).append(jsonobject.getString("message_action")).toString());
                b(jsonobject.getString("message_action"));
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L10
_L5:
        e = true;
        io.wecloud.message.a.b.a();
        j = 0;
        k = 0;
        i = 0;
        t = false;
        p = false;
        a1 = new Intent(io.wecloud.message.h.a.a(m.getPackageName()));
        a1.setPackage(m.getPackageName());
        a1.putExtra("action", "io.wecloud.message.action.METHOD");
        a1.putExtra("method_key", 1015);
        m.startService(a1);
        return;
        obj;
        a1 = a1.getString("appkey");
          goto _L11
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
        obj = s1;
          goto _L12
        obj;
        ((Exception) (obj)).printStackTrace();
        obj = s1;
          goto _L12
_L10:
        Intent intent = new Intent(io.wecloud.message.h.a.a(m.getPackageName()));
        intent.setPackage(m.getPackageName());
        intent.putExtra("action", "io.wecloud.message.action.MESSAGE");
        intent.putExtra("msgId", l1);
        intent.putExtra("appKey", a1);
        intent.putExtra("info", ((String) (obj)));
        m.startService(intent);
        r.a(io.wecloud.message.e.a.a(l1));
        return;
_L7:
        r.b();
        t = false;
        if (f)
        {
            f = false;
            a(4);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        j();
        if (r.a())
        {
            a(4);
            return;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void a(String s1)
    {
        if (n != null)
        {
            n.a(io.wecloud.message.g.b.a(s1));
            p = true;
            i = i + 1;
        }
        io.wecloud.message.e.c.b("CYF", (new StringBuilder("sendTick --  mTickAddCount = ")).append(i).toString());
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public k b()
    {
        return l;
    }

    public void c()
    {
        String s1 = io.wecloud.message.c.a.e(m);
        int i1 = io.wecloud.message.c.a.f(m);
        if (TextUtils.isEmpty(s1))
        {
            d = 0;
            a();
            return;
        } else
        {
            io.wecloud.message.j.d(m);
            a = System.currentTimeMillis();
            (new h(this, s1, i1)).start();
            return;
        }
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        e = false;
        if (!c && io.wecloud.message.h.g.a(m)) goto _L2; else goto _L1
_L1:
        io.wecloud.message.j.d(m);
        io.wecloud.message.j.a();
        io.wecloud.message.e.c.b("CSH", "\u7F51\u7EDC\u4E0D\u901A\uFF0C\u653E\u5F03\u5B9A\u65F6\u91CD\u8FDE");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!b)
        {
            io.wecloud.message.e.c.b("ConnManager", "\u5B9A\u65F6\u91CD\u8FDE\uFF0Cacquire wake lock --->");
            io.wecloud.message.j.b(m);
            int j1 = io.wecloud.message.a.b.a(m);
            io.wecloud.message.e.c.b("CSH", (new StringBuilder("scheduleReConnect ")).append(j1).toString());
            i i1 = new i(this);
            s = new Timer();
            s.schedule(i1, j1);
            b = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        if (m != null)
        {
            io.wecloud.message.j.a(m, 111);
        }
        f();
        c();
    }

    public void f()
    {
        try
        {
            o.c();
            if (l != null)
            {
                l.c();
                l = null;
            }
            return;
        }
        catch (Exception exception)
        {
            io.wecloud.message.e.c.d("CSH", (new StringBuilder("closeConnect exception --- ")).append(exception.getMessage()).toString());
            exception.printStackTrace();
            return;
        }
    }

    public Context g()
    {
        return m;
    }

    public void h()
    {
        io.wecloud.message.e.c.b("CSH", "receive end");
        r.a(io.wecloud.message.e.a.a(8, ""));
        d();
    }

    public void i()
    {
        j = j + 1;
    }

    public void j()
    {
        p = false;
        k = k + 1;
        a = System.currentTimeMillis();
    }

    public void k()
    {
        io.wecloud.message.e.c.b("CSH", "connmanager destroy");
        c = true;
        o.a();
        n.a();
        if (s != null)
        {
            s.cancel();
        }
        try
        {
            if (q != null)
            {
                q.a();
                q.interrupt();
            }
            o.interrupt();
            n.interrupt();
            if (l != null)
            {
                l.c();
                l = null;
            }
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public b l()
    {
        return r;
    }

    public boolean m()
    {
        boolean flag = true;
        if (j != 1)
        {
            flag = false;
        }
        io.wecloud.message.e.c.b("CYF", (new StringBuilder("mTickAddCount = ")).append(i).append(", mTickCount = ").append(j).toString());
        return flag;
    }

    public boolean n()
    {
        return e;
    }

    public boolean o()
    {
        return t;
    }
}
