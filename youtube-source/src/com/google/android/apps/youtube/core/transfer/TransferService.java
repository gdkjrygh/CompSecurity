// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.utils.w;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.youtube.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            r, v, g, TransfersExecutor, 
//            d, i, h, k, 
//            j

public abstract class TransferService extends Service
    implements r, v
{

    protected TransfersExecutor a;
    private i b;
    private Map c;
    private boolean d;
    private k e;
    private Set f;
    private int g;
    private d h;
    private SharedPreferences i;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener j;

    public TransferService()
    {
    }

    static int a(TransferService transferservice, int i1)
    {
        transferservice.g = i1;
        return i1;
    }

    protected static Intent a(Context context, Class class1)
    {
        return new Intent(context, class1);
    }

    protected static w a(Context context, Class class1, h h1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        class1 = new g(class1, h1);
        class1.a(context);
        return class1;
    }

    static Map a(TransferService transferservice, Map map)
    {
        transferservice.c = map;
        return map;
    }

    static Set a(TransferService transferservice)
    {
        return transferservice.f;
    }

    static boolean a(TransferService transferservice, boolean flag)
    {
        transferservice.d = true;
        return true;
    }

    static Map b(TransferService transferservice)
    {
        return transferservice.c;
    }

    static int c(TransferService transferservice)
    {
        return transferservice.g;
    }

    static void d(TransferService transferservice)
    {
        transferservice.m();
    }

    static void e(TransferService transferservice)
    {
        transferservice.n();
    }

    static void f(TransferService transferservice)
    {
        transferservice.o();
    }

    static void g(TransferService transferservice)
    {
        transferservice.p();
    }

    private void m()
    {
        boolean flag = false;
        if (e() != null)
        {
            String s = getString(p.hm);
            flag = i.getString(e(), s).equals(s);
        }
        g = a.b(flag);
    }

    private void n()
    {
        boolean flag = false;
        String s = f();
        if (s != null)
        {
            flag = i.getBoolean(s, false);
        }
        g = a.a(flag);
    }

    private void o()
    {
        String s = g();
        int i1;
        if (s != null)
        {
            i1 = i.getInt(s, h());
        } else
        {
            i1 = h();
        }
        g = a.a(i1);
    }

    private void p()
    {
        String s = i();
        if (!TextUtils.isEmpty(s))
        {
            int i1 = i.getInt(s, 0x7fffffff);
            h.a(i1);
        }
    }

    protected int a()
    {
        return a.a();
    }

    public final void a(int i1)
    {
        b.sendMessage(b.obtainMessage(2, i1, 0));
    }

    public final void a(Map map)
    {
        b.sendMessage(b.obtainMessage(1, map));
    }

    protected final boolean a(h h1)
    {
        if (f.add(com.google.android.apps.youtube.common.fromguava.c.a(h1)))
        {
            if (d)
            {
                h1.m_();
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected int b()
    {
        return 20;
    }

    public final void b(Transfer transfer)
    {
        b.sendMessage(b.obtainMessage(3, transfer));
    }

    protected final boolean b(h h1)
    {
        return f.remove(h1);
    }

    public final void c(Transfer transfer)
    {
        b.sendMessage(b.obtainMessage(4, transfer));
    }

    protected boolean c()
    {
        return true;
    }

    protected abstract String d();

    public final void d(Transfer transfer)
    {
        b.sendMessage(b.obtainMessage(5, transfer));
    }

    protected abstract String e();

    public final void e(Transfer transfer)
    {
        b.sendMessage(b.obtainMessage(6, transfer));
    }

    protected abstract String f();

    public final void f(Transfer transfer)
    {
        b.sendMessage(b.obtainMessage(7, transfer));
    }

    protected abstract String g();

    protected int h()
    {
        return 0x7fffffff;
    }

    protected abstract String i();

    protected final Map j()
    {
        return new HashMap(c);
    }

    public final String k()
    {
        return a.e();
    }

    protected final d l()
    {
        return h;
    }

    public IBinder onBind(Intent intent)
    {
        return e;
    }

    public void onCreate()
    {
        super.onCreate();
        L.e("creating transfer service");
        b = new i(this);
        a = new TransfersExecutor(this, this, this, d(), b(), c());
        f = new CopyOnWriteArraySet();
        e = new k(this);
        if (!TextUtils.isEmpty(i()))
        {
            h = new d();
        }
        if (!TextUtils.isEmpty(e()) || !TextUtils.isEmpty(f()) || !TextUtils.isEmpty(g()) || !TextUtils.isEmpty(i()))
        {
            i = ((BaseApplication)getApplication()).B();
            j = new j(this, (byte)0);
            i.registerOnSharedPreferenceChangeListener(j);
        }
        m();
        n();
        o();
        p();
        startService(a(this, getClass()));
        g = a();
    }

    public void onDestroy()
    {
        if (j != null)
        {
            i.unregisterOnSharedPreferenceChangeListener(j);
        }
        a.d();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        return 1;
    }
}
