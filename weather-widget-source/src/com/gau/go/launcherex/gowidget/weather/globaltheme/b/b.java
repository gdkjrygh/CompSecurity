// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.b:
//            e, c

public class b extends e
{

    private static Comparator x = null;
    private WeakReference a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private ArrayList q;
    private long r;
    private long s;
    private android.widget.ImageView.ScaleType t;
    private boolean u;
    private l v;
    private int w;

    public b()
    {
        b = -1;
        n = false;
        o = false;
        p = true;
        t = android.widget.ImageView.ScaleType.FIT_CENTER;
        u = false;
        w = 1;
    }

    public static List a(List list)
    {
        if (x == null)
        {
            x = Collections.reverseOrder(new c());
        }
        Collections.sort(list, x);
        return list;
    }

    private void b(Drawable drawable)
    {
        if (drawable == null)
        {
            return;
        } else
        {
            drawable.setCallback(null);
            return;
        }
    }

    public int a()
    {
        return w;
    }

    public Drawable a(Context context)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        Drawable drawable;
label0:
        {
            Drawable drawable1 = (Drawable)a.get();
            drawable = drawable1;
            if (drawable1 == null)
            {
                break label0;
            }
            drawable = drawable1;
            if (!(drawable1 instanceof BitmapDrawable))
            {
                break label0;
            }
            Bitmap bitmap = ((BitmapDrawable)drawable1).getBitmap();
            if (bitmap != null)
            {
                drawable = drawable1;
                if (!bitmap.isRecycled())
                {
                    break label0;
                }
            }
            drawable = null;
        }
_L4:
        Object obj = drawable;
        if (drawable == null)
        {
            context = com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(context, this);
            obj = context;
            if (context != null)
            {
                a(((Drawable) (context)));
                obj = context;
            }
        }
        return ((Drawable) (obj));
_L2:
        drawable = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int i1)
    {
        w = i1;
    }

    public void a(long l1)
    {
        r = l1;
    }

    public void a(Drawable drawable)
    {
        if (a != null)
        {
            b((Drawable)a.get());
            a = null;
        }
        if (drawable != null)
        {
            a = new WeakReference(drawable);
        }
    }

    public void a(android.widget.ImageView.ScaleType scaletype)
    {
        t = scaletype;
    }

    public void a(l l1)
    {
        v = l1;
    }

    public void a(ArrayList arraylist)
    {
        q = arraylist;
    }

    public void a(boolean flag)
    {
        u = flag;
    }

    public void b(int i1)
    {
        b = i1;
    }

    public void b(long l1)
    {
        s = l1;
    }

    public void b(boolean flag)
    {
        o = flag;
    }

    public boolean b()
    {
        return u;
    }

    public long c()
    {
        return s;
    }

    public void c(int i1)
    {
        d = i1;
    }

    public void c(boolean flag)
    {
        p = flag;
    }

    public ArrayList d()
    {
        return q;
    }

    public void d(boolean flag)
    {
        n = flag;
    }

    public void e(boolean flag)
    {
        k = flag;
    }

    public boolean e()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (q != null)
        {
            flag = flag1;
            if (q.size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void f(boolean flag)
    {
        l = flag;
    }

    public boolean f()
    {
        return o;
    }

    public void g(boolean flag)
    {
        m = flag;
    }

    public boolean g()
    {
        return p;
    }

    public void h(boolean flag)
    {
        e = flag;
    }

    public boolean h()
    {
        return n;
    }

    public void i(boolean flag)
    {
        f = flag;
    }

    public boolean i()
    {
        return k;
    }

    public void j(boolean flag)
    {
        g = flag;
    }

    public boolean j()
    {
        return m;
    }

    public void k(boolean flag)
    {
        h = flag;
    }

    public boolean k()
    {
        return e;
    }

    public void l(boolean flag)
    {
        i = flag;
    }

    public boolean l()
    {
        return f;
    }

    public void m(boolean flag)
    {
        c = flag;
    }

    public boolean m()
    {
        return g;
    }

    public void n(boolean flag)
    {
        j = flag;
    }

    public boolean n()
    {
        return h;
    }

    public boolean o()
    {
        return i;
    }

    public int p()
    {
        return b;
    }

    public boolean q()
    {
        return c;
    }

    public int r()
    {
        return d;
    }

    public boolean s()
    {
        return j;
    }

}
