// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.view.View;
import com.jiubang.playsdk.a.a;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.imageload.p;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.main.o;
import com.jiubang.playsdk.views.m;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            b, m, f

public class e
{

    private com.go.weatherex.themestore.detail.m a;
    private boolean b;
    private c c;
    private o d;

    public e(o o, Object obj, c c1)
    {
        b = false;
        d = o;
        c = c1;
        a(obj);
    }

    private void a(int i)
    {
        if (a != null)
        {
            return;
        }
        if (i == 1)
        {
            a = new b(d);
        } else
        {
            a = new f(d);
        }
        a.a(c);
    }

    private void a(Object obj)
    {
        if (!(obj instanceof com.jiubang.playsdk.d.e)) goto _L2; else goto _L1
_L1:
        a(1);
_L8:
        if (!(a instanceof b)) goto _L4; else goto _L3
_L3:
        if (obj instanceof com.jiubang.playsdk.d.e)
        {
            ((b)a).a((com.jiubang.playsdk.d.e)obj);
        }
_L6:
        return;
_L2:
        if (obj instanceof a)
        {
            a(2);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!(a instanceof f) || !(obj instanceof a)) goto _L6; else goto _L5
_L5:
        ((f)a).a((a)obj);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public View a(int ai[], int ai1[])
    {
        if (a != null)
        {
            return a.a(ai, ai1);
        } else
        {
            return null;
        }
    }

    public void a()
    {
        if (a != null)
        {
            a.i();
        }
        if (b)
        {
            y.a().c();
            p.a().b();
        }
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener, android.view.View.OnClickListener onclicklistener, m m1)
    {
        if (a != null)
        {
            a.a(onitemclicklistener, onclicklistener, m1);
        }
    }

    public void b()
    {
        if (a instanceof f)
        {
            ((f)a).m();
        }
    }
}
