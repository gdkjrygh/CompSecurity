// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.h;
import com.google.android.youtube.p;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            g, h, i, d, 
//            c, f, e

public final class SupportActionBar
{

    private static final int a[] = {
        0x101030b
    };
    private final ActionBar b;
    private final List c = new LinkedList();
    private final g d;
    private d e;
    private final Activity f;
    private HomeAction g;
    private Drawable h;
    private Drawable i;
    private com.google.android.apps.youtube.app.compat.h j;

    public SupportActionBar(Activity activity)
    {
        f = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        g = HomeAction.NONE;
        b = (ActionBar)com.google.android.apps.youtube.common.fromguava.c.a(activity.getActionBar());
        d = new g(activity);
        h = b(activity);
        i = activity.getResources().getDrawable(h.u);
        activity = new com.google.android.apps.youtube.app.compat.h(i);
        activity.b(0.3333333F);
        j = activity;
        b.setDisplayOptions(8, 8);
    }

    public static SupportActionBar a(Activity activity)
    {
        if (activity instanceof i)
        {
            return ((i)activity).K();
        } else
        {
            return new SupportActionBar(activity);
        }
    }

    private void a(Drawable drawable, int k)
    {
        if (d.a != null)
        {
            try
            {
                d.a.invoke(b, new Object[] {
                    drawable
                });
                d.b.invoke(b, new Object[] {
                    Integer.valueOf(0)
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Drawable drawable)
            {
                L.b("Couldn't set home-as-up indicator via JB-MR2 API", drawable);
            }
            return;
        }
        if (d.c != null)
        {
            d.c.setImageDrawable(drawable);
            return;
        } else
        {
            L.c("Couldn't set home-as-up indicator");
            return;
        }
    }

    private static Drawable b(Activity activity)
    {
        activity = activity.obtainStyledAttributes(a);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }

    private void c(int k)
    {
        if (d.a == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        d.b.invoke(b, new Object[] {
            Integer.valueOf(k)
        });
        return;
        Exception exception;
        exception;
        L.b("Couldn't set content description via JB-MR2 API", exception);
        return;
    }

    public static boolean f()
    {
        return true;
    }

    public static boolean g()
    {
        return true;
    }

    public final void a()
    {
        if (b.isShowing())
        {
            b.hide();
            if (e != null)
            {
                e.f(false);
            }
        }
    }

    public final void a(float f1)
    {
        float f2 = j.a();
        if (f1 > 0.5F)
        {
            f1 = Math.max(f2, Math.max(0.0F, f1 - 0.5F) * 2.0F);
        } else
        {
            f1 = Math.min(f2, f1 * 2.0F);
        }
        j.a(f1);
    }

    public final void a(int k)
    {
        b.setTitle(k);
    }

    public final void a(Drawable drawable)
    {
        b.setBackgroundDrawable(drawable);
    }

    public final void a(View view)
    {
        b.setCustomView(view);
    }

    public final void a(HomeAction homeaction, boolean flag)
    {
        if (g == homeaction) goto _L2; else goto _L1
_L1:
        g = homeaction;
        c.a[g.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 61
    //                   2 73
    //                   3 94;
           goto _L2 _L3 _L4 _L5
_L2:
        b.setHomeButtonEnabled(flag);
        return;
_L3:
        b.setDisplayOptions(0, 4);
        continue; /* Loop/switch isn't completed */
_L4:
        b.setDisplayOptions(4, 4);
        a(h, 0);
        continue; /* Loop/switch isn't completed */
_L5:
        b.setDisplayOptions(4, 4);
        a(((Drawable) (j)), 0);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void a(d d1)
    {
        e = d1;
    }

    public final void a(e e1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e1);
        e1 = new f(e1);
        c.add(e1);
    }

    public final void a(CharSequence charsequence)
    {
        b.setTitle(charsequence);
    }

    public final void a(boolean flag)
    {
        b.setDisplayShowCustomEnabled(flag);
    }

    public final void b()
    {
        if (!b.isShowing())
        {
            b.show();
            if (e != null)
            {
                e.f(true);
            }
        }
    }

    public final void b(int k)
    {
        b.setNavigationMode(0);
    }

    public final void b(e e1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(e1);
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            if (f1.a == e1)
            {
                b.removeOnMenuVisibilityListener(f1);
                iterator.remove();
            }
        } while (true);
    }

    public final void c()
    {
        h = b(f);
        i = f.getResources().getDrawable(h.u);
    }

    public final void d()
    {
        j.a(1.0F);
        if (g == HomeAction.DRAWER_TOGGLE)
        {
            c(p.e);
        }
    }

    public final void e()
    {
        j.a(0.0F);
        if (g == HomeAction.DRAWER_TOGGLE)
        {
            c(p.f);
        }
    }


    private class HomeAction extends Enum
    {

        private static final HomeAction $VALUES[];
        public static final HomeAction DRAWER_TOGGLE;
        public static final HomeAction NONE;
        public static final HomeAction UP;

        public static HomeAction valueOf(String s)
        {
            return (HomeAction)Enum.valueOf(com/google/android/apps/youtube/app/compat/SupportActionBar$HomeAction, s);
        }

        public static HomeAction[] values()
        {
            return (HomeAction[])$VALUES.clone();
        }

        static 
        {
            NONE = new HomeAction("NONE", 0);
            UP = new HomeAction("UP", 1);
            DRAWER_TOGGLE = new HomeAction("DRAWER_TOGGLE", 2);
            $VALUES = (new HomeAction[] {
                NONE, UP, DRAWER_TOGGLE
            });
        }

        private HomeAction(String s, int k)
        {
            super(s, k);
        }
    }

}
