// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            av, bm, ag, ah, 
//            ai, aj, bn

public class DefaultSurveyOverlay extends FrameLayout
    implements av, bm
{

    private final ViewGroup a;
    private final TextView b;
    private final ViewGroup c;
    private final ViewGroup d[];
    private final TextView e[];
    private final View f;
    private final View g;
    private final Context h;
    private TextView i;
    private TextView j;
    private Drawable k;
    private Drawable l;
    private bn m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;

    public DefaultSurveyOverlay(Context context)
    {
        super(context);
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        h = context;
        a = (ViewGroup)layoutinflater.inflate(l.bm, this);
        b = (TextView)a.findViewById(j.cG);
        c = (ViewGroup)a.findViewById(j.cL);
        i = (TextView)c.findViewById(j.fs);
        k = context.getResources().getDrawable(h.az);
        l = context.getResources().getDrawable(h.aA);
        j = (TextView)c.findViewById(j.fr);
        d = (new ViewGroup[] {
            (ViewGroup)c.findViewById(j.fo), (ViewGroup)c.findViewById(j.fp), (ViewGroup)c.findViewById(j.fq)
        });
        e = (new TextView[] {
            (TextView)c.findViewById(j.fj), (TextView)c.findViewById(j.fk), (TextView)c.findViewById(j.fl), (TextView)c.findViewById(j.fm), (TextView)c.findViewById(j.fn)
        });
        f = c.findViewById(j.eO);
        f.setOnClickListener(new ag(this, (byte)0));
        f.setOnTouchListener(new ah(this, (byte)0));
        g = c.findViewById(j.eY);
        g.setOnClickListener(new ai(this, (byte)0));
        for (int i1 = 0; i1 < e.length; i1++)
        {
            e[i1].setOnClickListener(new aj(this, i1));
        }

        a();
    }

    private void a(int i1, boolean flag)
    {
        if (i1 >= e.length)
        {
            return;
        }
        e[i1].setSelected(flag);
        if (n)
        {
            TextView textview = e[i1];
            Drawable drawable;
            if (flag)
            {
                drawable = k;
            } else
            {
                drawable = l;
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
            return;
        } else
        {
            e[i1].setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
    }

    static void a(DefaultSurveyOverlay defaultsurveyoverlay)
    {
        defaultsurveyoverlay.f();
    }

    static void a(DefaultSurveyOverlay defaultsurveyoverlay, int i1, View view)
    {
        boolean flag;
        if (!view.isSelected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        defaultsurveyoverlay.a(i1, flag);
        if (defaultsurveyoverlay.n)
        {
            if (flag && defaultsurveyoverlay.n)
            {
                if (i1 < defaultsurveyoverlay.o)
                {
                    defaultsurveyoverlay.a(defaultsurveyoverlay.o, false);
                } else
                {
                    i1 = 0;
                    while (i1 < defaultsurveyoverlay.o) 
                    {
                        defaultsurveyoverlay.a(i1, false);
                        i1++;
                    }
                }
            }
            defaultsurveyoverlay.e();
            return;
        } else
        {
            defaultsurveyoverlay.f();
            return;
        }
    }

    static void a(DefaultSurveyOverlay defaultsurveyoverlay, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            defaultsurveyoverlay.r = (int)motionevent.getRawX();
            defaultsurveyoverlay.s = (int)motionevent.getRawY();
        }
    }

    static bn b(DefaultSurveyOverlay defaultsurveyoverlay)
    {
        return defaultsurveyoverlay.m;
    }

    private boolean b(int i1)
    {
        return i1 < e.length && e[i1].isSelected();
    }

    static int c(DefaultSurveyOverlay defaultsurveyoverlay)
    {
        return defaultsurveyoverlay.r;
    }

    static int d(DefaultSurveyOverlay defaultsurveyoverlay)
    {
        return defaultsurveyoverlay.s;
    }

    private void e()
    {
        boolean flag3 = true;
        boolean flag = false;
        p = false;
        int i1 = 0;
        while (i1 < o) 
        {
            boolean flag1;
            if (p || b(i1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p = flag1;
            i1++;
        }
        boolean flag2 = flag3;
        View view;
        if (!p)
        {
            if (n && b(o))
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
        }
        p = flag2;
        view = g;
        if (p && n)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        view = f;
        if (q && !p)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    private void f()
    {
        int i1 = 0;
        if (m == null)
        {
            return;
        }
        int ai1[] = new int[o];
        int j1;
        int k1;
        for (j1 = 0; i1 < o; j1 = k1)
        {
            k1 = j1;
            if (b(i1))
            {
                ai1[j1] = i1;
                k1 = j1 + 1;
            }
            i1++;
        }

        m.a(Arrays.copyOf(ai1, j1));
    }

    public final void a()
    {
        a.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(8);
        p = false;
        q = false;
        r = 0;
        s = 0;
        setVisibility(8);
    }

    public final void a(int i1)
    {
        String s1 = com.google.android.apps.youtube.common.e.m.a((int)Math.ceil((float)i1 / 1000F), 3);
        j.setText(a.getResources().getString(p.fT, new Object[] {
            s1
        }));
    }

    public final void a(String s1, List list, boolean flag)
    {
        a();
        n = flag;
        o = list.size();
        b.setText(s1);
        i.setText(s1);
        int j1 = list.size();
        int i1 = 0;
        while (i1 < e.length) 
        {
            if (i1 < list.size())
            {
                e[i1].setText((CharSequence)list.get(i1));
                e[i1].setVisibility(0);
            } else
            if (i1 == j1 && flag)
            {
                e[i1].setText(p.fU);
                e[i1].setVisibility(0);
            } else
            {
                e[i1].setVisibility(4);
            }
            a(i1, false);
            i1++;
        }
        a.setVisibility(0);
    }

    public final View b()
    {
        return this;
    }

    public final PlayerOverlaysLayout.LayoutParams c()
    {
        return new PlayerOverlaysLayout.LayoutParams(-1, -1, true);
    }

    public final void d()
    {
        q = true;
        e();
    }

    public void setListener(bn bn1)
    {
        m = bn1;
    }

    public void setMinimized(boolean flag)
    {
        byte byte0 = 8;
        Object obj = b;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((TextView) (obj)).setVisibility(i1);
        obj = c;
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ViewGroup) (obj)).setVisibility(i1);
    }

    public void setVisible(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
    }
}
