// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Random;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            a, ac, ab

public final class aa
{

    private final View a;
    private final a b;
    private final ac c;
    private final Random d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final Handler l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final Rect p;
    private int q;
    private int r;
    private int s;
    private String t;
    private String u;
    private String v;

    public aa(View view, a a1, ac ac1)
    {
        this(view, a1, ac1, view.getContext().getMainLooper(), true, true, true, new Random(), 1000, 3000, 300, 600);
    }

    private aa(View view, a a1, ac ac1, Looper looper, boolean flag, boolean flag1, boolean flag2, 
            Random random, int i1, int j1, int k1, int l1)
    {
        a = (View)com.google.android.apps.youtube.common.fromguava.c.a(view, "playerView cannot be null");
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1, "activityProxy cannot be null");
        c = (ac)com.google.android.apps.youtube.common.fromguava.c.a(ac1, "listener cannot be null");
        d = (Random)com.google.android.apps.youtube.common.fromguava.c.a(random, "random cannot be null");
        e = true;
        f = true;
        g = true;
        com.google.android.apps.youtube.common.fromguava.c.a(true, "normalMinimumPeriod must be >= 0");
        com.google.android.apps.youtube.common.fromguava.c.a(true, "normalMaximumPeriod must be >= 0");
        com.google.android.apps.youtube.common.fromguava.c.a(true, "recheckMinimumPeriod must be >= 0");
        com.google.android.apps.youtube.common.fromguava.c.a(true, "recheckMaximumPeriod must be >= 0");
        h = 1000;
        i = 3000;
        j = 300;
        k = 600;
        l = new Handler(looper, new ab(this, (byte)0));
        m = new Rect();
        n = new Rect();
        o = new Rect();
        p = new Rect();
    }

    private static String a(Rect rect, Rect rect1)
    {
        return String.format("left: %d, top: %d, right: %d, bottom: %d", new Object[] {
            Integer.valueOf(rect1.left - rect.left), Integer.valueOf(rect1.top - rect.top), Integer.valueOf(rect.right - rect1.right), Integer.valueOf(rect.bottom - rect1.bottom)
        });
    }

    private void a(View view, Rect rect)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b(view, rect);
            rect.offset((int)view.getTranslationX(), (int)view.getTranslationY());
            return;
        } else
        {
            b(view, rect);
            return;
        }
    }

    private void a(View view, ViewGroup viewgroup, Rect rect)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b(view, viewgroup, rect);
            rect.offset((int)viewgroup.getTranslationX(), (int)viewgroup.getTranslationY());
            return;
        } else
        {
            b(view, viewgroup, rect);
            return;
        }
    }

    private void a(ViewGroup viewgroup, Rect rect)
    {
        rect.set(0, 0, viewgroup.getWidth(), viewgroup.getHeight());
        if (f)
        {
            rect.left = rect.left + viewgroup.getPaddingLeft();
            rect.top = rect.top + viewgroup.getPaddingTop();
            rect.right = rect.right - viewgroup.getPaddingRight();
            rect.bottom = rect.bottom - viewgroup.getPaddingBottom();
        }
    }

    static void a(aa aa1)
    {
        Object obj;
        View view;
        int i1;
        boolean flag = true;
        boolean flag1 = aa1.c();
        float f1 = aa1.a.getResources().getDisplayMetrics().density;
        i1 = (int)((float)aa1.a.getWidth() / f1 + 0.5F);
        int j1 = (int)((float)aa1.a.getHeight() / f1 + 0.5F);
        if (i1 < 195 || j1 < 105)
        {
            aa1.u = String.format("The YouTubePlayerView is %ddp wide (minimum is %ddp) and %ddp high (minimum is %ddp).", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(200), Integer.valueOf(j1), Integer.valueOf(110)
            });
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        view = aa1.a;
_L9:
        j1 = view.getVisibility();
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR lookupswitch 3: default 172
    //                   0: 322
    //                   4: 329
    //                   8: 336;
           goto _L3 _L4 _L5 _L6
_L3:
        obj = "UNKNOWN";
_L7:
        aa1.v = String.format("The view %s has visibility \"%s\".", new Object[] {
            view, obj
        });
        flag = false;
_L8:
        if (!flag1)
        {
            aa1.q = aa1.q + 1;
        }
        if (i1 == 0)
        {
            aa1.r = aa1.r + 1;
        }
        if (!flag)
        {
            aa1.s = aa1.s + 1;
        }
        if (aa1.q >= 3)
        {
            aa1.c.a(aa1.t);
            aa1.q = 0;
        } else
        if (aa1.r >= 3)
        {
            aa1.c.b(aa1.u);
            aa1.r = 0;
        } else
        if (aa1.s >= 3)
        {
            aa1.c.c(aa1.v);
            aa1.s = 0;
        }
        if (flag1 && i1 != 0)
        {
            i1 = aa1.h + aa1.d.nextInt(aa1.i - aa1.h);
        } else
        {
            i1 = aa1.j + aa1.d.nextInt(aa1.k - aa1.j);
        }
        aa1.l.sendEmptyMessageDelayed(0, i1);
        return;
_L4:
        obj = "VISIBLE";
          goto _L7
_L5:
        obj = "INVISIBLE";
          goto _L7
_L6:
        obj = "GONE";
          goto _L7
_L2:
        if (view.getParent() instanceof View)
        {
            obj = (View)view.getParent();
        } else
        {
            obj = null;
        }
        view = ((View) (obj));
        if (obj != null) goto _L9; else goto _L8
    }

    private boolean a(View view)
    {
        a(a, m);
        ViewGroup viewgroup;
        for (Object obj = a; obj != view && (((View) (obj)).getParent() instanceof ViewGroup); obj = viewgroup)
        {
            viewgroup = (ViewGroup)((View) (obj)).getParent();
            a(((View) (obj)), viewgroup, m);
            if (e)
            {
                Rect rect = n;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    a(viewgroup, rect);
                    rect.offset((int)viewgroup.getTranslationX(), (int)viewgroup.getTranslationY());
                } else
                {
                    a(viewgroup, rect);
                }
                if (!n.contains(m))
                {
                    t = String.format("The YouTubePlayerView is not contained inside its ancestor %s. The distances between the ancestor's edges and that of the YouTubePlayerView is: %s (these should all be positive).", new Object[] {
                        viewgroup, a(n, m)
                    });
                    return false;
                }
            }
            int j1 = viewgroup.getChildCount();
            for (int i1 = viewgroup.indexOfChild(((View) (obj))) + 1; i1 < j1; i1++)
            {
                obj = viewgroup.getChildAt(i1);
                if (((View) (obj)).getVisibility() == 0 && !a(((View) (obj)), viewgroup, m.left, m.top, m.right, m.bottom))
                {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean a(View view, ViewGroup viewgroup, int i1, int j1, int k1, int l1)
    {
        o.setEmpty();
        a(view, viewgroup, o);
        a(view, p);
        p.offset(o.left, o.top);
        if (!p.intersects(i1, j1, k1, l1)) goto _L2; else goto _L1
_L1:
        Rect rect;
        Rect rect1;
        o.set(i1, j1, k1, l1);
        rect = o;
        rect1 = p;
        if (!rect1.contains(rect)) goto _L4; else goto _L3
_L3:
        viewgroup = (new StringBuilder("YouTubePlayerView is completely covered, with the distance in px between each edge of the obscuring view and the YouTubePlayerView being: ")).append(a(rect1, rect)).append(".").toString();
_L9:
        t = String.format("The YouTubePlayerView is obscured by %s. %s.", new Object[] {
            view, viewgroup
        });
        return false;
_L4:
        if (rect.contains(rect1))
        {
            viewgroup = (new StringBuilder("The view is inside the YouTubePlayerView, with the distance in px between each edge of the obscuring view and the YouTubePlayerView being: ")).append(a(rect, rect1)).append(".").toString();
            continue; /* Loop/switch isn't completed */
        }
        viewgroup = "";
        if (rect.left >= rect1.left || rect1.left >= rect.right) goto _L6; else goto _L5
_L5:
        Object obj = (new StringBuilder()).append("").append(String.format("Left edge %d px left of YouTubePlayerView's right edge. ", new Object[] {
            Integer.valueOf(rect.right - rect1.left)
        })).toString();
_L8:
        if (rect.top >= rect1.top || rect1.top >= rect.bottom)
        {
            break; /* Loop/switch isn't completed */
        }
        viewgroup = (new StringBuilder()).append(((String) (obj))).append(String.format("Top edge %d px above YouTubePlayerView's bottom edge. ", new Object[] {
            Integer.valueOf(rect.bottom - rect1.top)
        })).toString();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = viewgroup;
        if (rect.left < rect1.right)
        {
            obj = viewgroup;
            if (rect1.right < rect.right)
            {
                obj = (new StringBuilder()).append("").append(String.format("Right edge %d px right of YouTubePlayerView's left edge. ", new Object[] {
                    Integer.valueOf(rect1.right - rect.left)
                })).toString();
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        viewgroup = ((ViewGroup) (obj));
        if (rect.top < rect1.bottom)
        {
            viewgroup = ((ViewGroup) (obj));
            if (rect1.bottom < rect.bottom)
            {
                viewgroup = (new StringBuilder()).append(((String) (obj))).append(String.format("Bottom edge %d px below YouTubePlayerView's top edge. ", new Object[] {
                    Integer.valueOf(rect1.bottom - rect.top)
                })).toString();
            }
        }
        if (true) goto _L9; else goto _L2
_L2:
        if (!g && (view instanceof ViewGroup))
        {
            view = (ViewGroup)view;
            int j2 = o.left;
            int k2 = o.top;
            int l2 = o.left;
            int i3 = o.top;
            int j3 = view.getChildCount();
            for (int i2 = 0; i2 < j3; i2++)
            {
                if (!a(view.getChildAt(i2), ((ViewGroup) (view)), i1 - j2, j1 - k2, k1 - l2, l1 - i3))
                {
                    return false;
                }
            }

        }
        return true;
    }

    private static void b(View view, Rect rect)
    {
        rect.left = 0;
        rect.top = 0;
        rect.right = view.getWidth();
        rect.bottom = view.getHeight();
    }

    private static void b(View view, ViewGroup viewgroup, Rect rect)
    {
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-viewgroup.getScrollX(), -viewgroup.getScrollY());
    }

    public final void a()
    {
        l.removeMessages(0);
        l.sendEmptyMessage(0);
    }

    public final void b()
    {
        l.removeMessages(0);
    }

    public final boolean c()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            Object obj = b.d();
            if (((Window) (obj)).hasFeature(9))
            {
                obj = ((Window) (obj)).getDecorView().findViewById(0x1020002);
                if (obj != null)
                {
                    return a(((View) (obj)));
                } else
                {
                    return true;
                }
            } else
            {
                return a(((View) (null)));
            }
        } else
        {
            return a(((View) (null)));
        }
    }
}
