// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class w
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{

    private final x a;
    private final DrawerLayout b;
    private aa c;
    private Drawable d;
    private boolean e;
    private boolean f;
    private final int g;
    private final int h;
    private boolean i;

    public w(Activity activity, DrawerLayout drawerlayout)
    {
        this(activity, drawerlayout, (byte)0);
    }

    private w(Activity activity, DrawerLayout drawerlayout, byte byte0)
    {
        e = true;
        i = false;
        if (activity instanceof y)
        {
            a = ((y)activity).a_();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new ad(activity, (byte)0);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new ac(activity, (byte)0);
        } else
        {
            a = new ab(activity);
        }
        b = drawerlayout;
        g = 0x7f070772;
        h = 0x7f070772;
        c = new z(activity, a.b());
        d = d();
    }

    private void a(int j)
    {
        a.a(j);
    }

    private void a(Drawable drawable, int j)
    {
        if (!i && !a.c())
        {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            i = true;
        }
        a.a(drawable, j);
    }

    private void c()
    {
        if (b.isDrawerVisible(0x800003))
        {
            b.closeDrawer(0x800003);
            return;
        } else
        {
            b.openDrawer(0x800003);
            return;
        }
    }

    private Drawable d()
    {
        return a.a();
    }

    public final void a()
    {
        if (b.isDrawerOpen(0x800003))
        {
            c.a(1.0F);
        } else
        {
            c.a(0.0F);
        }
        if (e)
        {
            Drawable drawable = (Drawable)c;
            int j;
            if (b.isDrawerOpen(0x800003))
            {
                j = h;
            } else
            {
                j = g;
            }
            a(drawable, j);
        }
    }

    public final void a(boolean flag)
    {
        if (flag != e)
        {
            if (flag)
            {
                Drawable drawable = (Drawable)c;
                int j;
                if (b.isDrawerOpen(0x800003))
                {
                    j = h;
                } else
                {
                    j = g;
                }
                a(drawable, j);
            } else
            {
                a(d, 0);
            }
            e = flag;
        }
    }

    public final boolean a(MenuItem menuitem)
    {
        if (menuitem != null && menuitem.getItemId() == 0x102002c && e)
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public final void b()
    {
        if (!f)
        {
            d = d();
        }
        a();
    }

    public final void onDrawerClosed(View view)
    {
        c.a(0.0F);
        if (e)
        {
            a(g);
        }
    }

    public final void onDrawerOpened(View view)
    {
        c.a(1.0F);
        if (e)
        {
            a(h);
        }
    }

    public final void onDrawerSlide(View view, float f1)
    {
        c.a(Math.min(1.0F, Math.max(0.0F, f1)));
    }

    public final void onDrawerStateChanged(int j)
    {
    }
}
