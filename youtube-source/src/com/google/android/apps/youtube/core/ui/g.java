// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout;
import com.google.android.apps.youtube.core.player.overlay.ay;
import com.google.android.apps.youtube.core.utils.m;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            h

public final class g extends Handler
    implements android.view.View.OnSystemUiVisibilityChangeListener, ay
{

    private static final int a;
    private static final int b = 1;
    private static final int c;
    private static final int d;
    private final Window e;
    private final ActionBar f;
    private final PlayerOverlaysLayout g;
    private final h h;
    private Rect i;
    private final int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final boolean r;
    private boolean s;

    public g(Window window, ActionBar actionbar, PlayerOverlaysLayout playeroverlayslayout, h h1)
    {
        e = (Window)com.google.android.apps.youtube.common.fromguava.c.a(window, "window cannot be null");
        g = (PlayerOverlaysLayout)com.google.android.apps.youtube.common.fromguava.c.a(playeroverlayslayout, "playerOverlaysLayout cannot be null");
        playeroverlayslayout.setSystemWindowInsetsListener(this);
        f = actionbar;
        h = h1;
        playeroverlayslayout.setOnSystemUiVisibilityChangeListener(this);
        k = playeroverlayslayout.getSystemUiVisibility();
        playeroverlayslayout.setfullscreenUiVisibilityHelper(this);
        boolean flag;
        if (actionbar != null && actionbar.isShowing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        if (actionbar != null)
        {
            actionbar = window.getContext().obtainStyledAttributes(new int[] {
                0x10102eb
            });
            j = Math.round(actionbar.getDimension(0, 0.0F));
            actionbar.recycle();
        } else
        {
            j = 0;
        }
        r = com.google.android.apps.youtube.core.utils.m.a(window.getContext());
        s = false;
    }

    private void b()
    {
        boolean flag2 = true;
        removeMessages(0);
        int i1 = k;
        boolean flag3 = l;
        boolean flag4 = m;
        boolean flag;
        boolean flag1;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (!s)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((a & i1) == a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag5 = l;
        flag6 = m;
        flag7 = s;
        if ((i1 & b) == b && !flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if ((flag4 & flag3 & flag) != flag1 || (flag5 & flag6 & flag7) != i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!p && flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            sendEmptyMessageDelayed(0, 2500L);
        }
    }

    private void c()
    {
        int j1 = 0;
        boolean flag = false;
        int i1 = 0;
        b();
        if (r)
        {
            Window window = e;
            if (l)
            {
                i1 = 1024;
            }
            window.setFlags(i1, 1024);
            return;
        }
        i1 = ((flag) ? 1 : 0);
        if (l)
        {
            int k1 = c;
            if (m)
            {
                if (s)
                {
                    i1 = b;
                } else
                {
                    i1 = a;
                }
                i1 |= k1;
            } else
            {
                i1 = k1;
            }
            if (!d())
            {
                j1 = d;
            }
            i1 = j1 | i1;
        }
        g.setSystemUiVisibility(i1);
    }

    private boolean d()
    {
        while (r || q && android.os.Build.VERSION.SDK_INT >= 18 && f != null && !e.hasFeature(9)) 
        {
            return true;
        }
        return false;
    }

    private void e()
    {
        int j1 = g.getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view = g.getChildAt(i1);
            if (((com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams)view.getLayoutParams()).a)
            {
                if (!l || android.os.Build.VERSION.SDK_INT >= 16 && i == null)
                {
                    view.setPadding(0, 0, 0, 0);
                } else
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    view.setPadding(i.left, i.top, i.right, i.bottom);
                } else
                if (n && e.hasFeature(9))
                {
                    view.setPadding(0, j, 0, 0);
                } else
                {
                    view.setPadding(0, 0, 0, 0);
                }
            }
            i1++;
        }
    }

    public final void a()
    {
        removeMessages(0);
        p = true;
    }

    public final void a(Rect rect)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 && !d())
        {
            boolean flag1 = e.hasFeature(9);
            boolean flag;
            if (f != null && !f.isShowing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 && flag)
            {
                rect.top = rect.top - j;
            }
        }
        if (!rect.equals(i))
        {
            i = rect;
            e();
        }
    }

    public final void a(boolean flag)
    {
        n = false;
        c();
    }

    public final void b(boolean flag)
    {
        char c1 = '\0';
        if (l != flag)
        {
            if (flag)
            {
                Window window;
                boolean flag1;
                if ((e.getAttributes().flags & 0x400) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                o = flag1;
            }
            l = flag;
            c();
            e();
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                window = e;
                if (flag || o)
                {
                    c1 = '\u0400';
                }
                window.setFlags(c1, 1024);
            }
            if (n)
            {
                if (flag && !e.hasFeature(9))
                {
                    f.hide();
                } else
                if (!flag)
                {
                    f.show();
                    return;
                }
            }
        }
    }

    public final void c(boolean flag)
    {
label0:
        {
            m = flag;
            removeMessages(0);
            c();
            if (android.os.Build.VERSION.SDK_INT < 16 && l && n && e.hasFeature(9))
            {
                if (!flag)
                {
                    break label0;
                }
                f.hide();
            }
            return;
        }
        f.show();
    }

    public final void d(boolean flag)
    {
        q = flag;
    }

    public final void e(boolean flag)
    {
        if (s != flag)
        {
            s = flag;
            c();
        }
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            c();
            break;
        }
    }

    public final void onSystemUiVisibilityChange(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT < 16 && g.getSystemUiVisibility() != i1)
        {
            g.setSystemUiVisibility(i1);
        }
        if (h != null && (k & 2) != 0 && (i1 & 2) == 0 && !s)
        {
            h.f_();
        }
        k = i1;
        b();
    }

    static 
    {
        int i1 = 0;
        int j1 = 3;
        int k1;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            j1 = 7;
            k1 = 1536;
            i1 = 256;
        } else
        {
            k1 = 0;
        }
        a = j1;
        c = k1;
        d = i1;
    }
}
