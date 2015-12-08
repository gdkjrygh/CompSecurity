// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;

// Referenced classes of package com.jiubang.goweather.c:
//            p, k, l

public class j
    implements android.os.Handler.Callback
{

    private Context a;
    private p b;
    private boolean c;
    private boolean d;
    private volatile boolean e;
    private Handler f;
    private l g;

    public j(Context context)
    {
        a = context.getApplicationContext();
        c = false;
        d = false;
        e = false;
        f = new Handler(Looper.getMainLooper(), this);
        b = new p(a);
    }

    static Handler a(j j1)
    {
        return j1.f;
    }

    private void a(int i, int i1, int j1)
    {
        b.a(i, i1, j1, new k(this, i, i1));
    }

    private void a(int i, Location location)
    {
        if (g != null)
        {
            g.a(i, location);
        }
    }

    private void a(int i, CityBean citybean)
    {
        if (g != null)
        {
            g.a(i, citybean);
        }
    }

    static void a(j j1, int i, int i1, int k1)
    {
        j1.b(i, i1, k1);
    }

    static boolean a(j j1, boolean flag)
    {
        j1.e = flag;
        return flag;
    }

    private void b(int i, int i1, int j1)
    {
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            a(i1, 2, 10);
            return;

        case 2: // '\002'
            a(i1, 3, 30);
            return;

        case 3: // '\003'
            f.sendEmptyMessage(5);
            break;
        }
    }

    static boolean b(j j1)
    {
        return j1.e;
    }

    public void a()
    {
        if (!c)
        {
            c = true;
            a(0, 1, 15);
        }
    }

    public void a(Location location)
    {
        if (location == null)
        {
            b();
        } else
        if (!d)
        {
            d = true;
            e = true;
            b.a(location);
            return;
        }
    }

    public void a(l l1)
    {
        g = l1;
    }

    public void b()
    {
        e = true;
        a();
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 158
    //                   2 50
    //                   3 122
    //                   4 177
    //                   5 86;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalThreadStateException("need a new case?");
_L3:
        c = false;
        a(2, ((Location) (null)));
        d = false;
        if (e)
        {
            e = false;
            a(2, ((CityBean) (null)));
        }
_L8:
        return false;
_L6:
        c = false;
        a(5, ((Location) (null)));
        d = false;
        if (!e) goto _L8; else goto _L7
_L7:
        e = false;
        a(5, ((CityBean) (null)));
        return false;
_L4:
        c = false;
        a(3, ((Location) (null)));
        d = false;
        if (!e) goto _L8; else goto _L9
_L9:
        e = false;
        a(3, ((CityBean) (null)));
        return false;
_L2:
        c = false;
        a(1, (Location)message.obj);
        return false;
_L5:
        d = false;
        a(4, (CityBean)message.obj);
        return false;
    }
}
