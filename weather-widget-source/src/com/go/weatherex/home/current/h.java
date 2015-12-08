// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.j;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.c.e;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, i, w

public class h extends aa
    implements android.view.View.OnClickListener
{

    private Context b;
    private View c;
    private View d;
    private TextView e;
    private String f;
    private View g;
    private Time h;

    public h(a a1, int k)
    {
        super(a1, k);
        b = a1.getActivity().getApplicationContext();
        c = a1.getActivity().getLayoutInflater().inflate(0x7f03003e, null);
        d = c.findViewById(0x7f0901eb);
        d.setOnClickListener(this);
        e = (TextView)c.findViewById(0x7f090202);
        a.a(e, 4, true);
        g = c.findViewById(0x7f0901e3);
        h = new Time();
        h.setToNow();
    }

    private int a(j j1)
    {
        switch (com.go.weatherex.home.current.i.a[j1.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f020074;

        case 2: // '\002'
            return 0x7f020075;

        case 3: // '\003'
            return 0x7f020077;

        case 4: // '\004'
            return 0x7f020079;

        case 5: // '\005'
            return 0x7f020078;

        case 6: // '\006'
            return 0x7f020072;

        case 7: // '\007'
            return 0x7f020073;

        case 8: // '\b'
            return 0x7f020071;

        case 9: // '\t'
            return 0x7f020076;
        }
    }

    private String a(j j1, String s)
    {
        int k;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        k = Integer.parseInt(s);
        i3 = k;
        j3 = k;
        k3 = k;
        l3 = k;
        i4 = k;
        j4 = k;
        k4 = k;
        l4 = k;
        com.go.weatherex.home.current.i.a[j1.ordinal()];
        JVM INSTR tableswitch 1 9: default 88
    //                   1 91
    //                   2 154
    //                   3 199
    //                   4 259
    //                   5 319
    //                   6 379
    //                   7 439
    //                   8 484
    //                   9 544;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return "";
_L2:
        j3 = k;
        if (k < 0)
        {
            j3 = -k;
        }
        if (j3 < 2)
        {
            return b.getString(0x7f08022e);
        }
        if (j3 < 3)
        {
            return b.getString(0x7f08022f);
        }
        i3 = j3;
        if (j3 <= 5)
        {
            return b.getString(0x7f080230);
        }
_L3:
        int l = i3;
        if (i3 < 0)
        {
            l = -i3;
        }
        if (l < 4)
        {
            return b.getString(0x7f080231);
        }
        j3 = l;
        if (l <= 5)
        {
            return b.getString(0x7f080232);
        }
_L4:
        int i1 = j3;
        if (j3 < 0)
        {
            i1 = -j3;
        }
        if (i1 < 2)
        {
            return b.getString(0x7f08022e);
        }
        if (i1 < 3)
        {
            return b.getString(0x7f08022f);
        }
        k3 = i1;
        if (i1 <= 5)
        {
            return b.getString(0x7f080230);
        }
_L5:
        int k1 = k3;
        if (k3 < 0)
        {
            k1 = -k3;
        }
        if (k1 < 2)
        {
            return b.getString(0x7f080237);
        }
        if (k1 < 3)
        {
            return b.getString(0x7f080238);
        }
        l3 = k1;
        if (k1 <= 5)
        {
            return b.getString(0x7f080239);
        }
_L6:
        int l1 = l3;
        if (l3 < 0)
        {
            l1 = -l3;
        }
        if (l1 < 2)
        {
            return b.getString(0x7f08022e);
        }
        if (l1 < 3)
        {
            return b.getString(0x7f08022f);
        }
        i4 = l1;
        if (l1 <= 5)
        {
            return b.getString(0x7f080230);
        }
_L7:
        int i2 = i4;
        if (i4 < 0)
        {
            i2 = -i4;
        }
        if (i2 < 2)
        {
            return b.getString(0x7f08022e);
        }
        if (i2 < 3)
        {
            return b.getString(0x7f08022f);
        }
        j4 = i2;
        if (i2 <= 5)
        {
            return b.getString(0x7f080230);
        }
_L8:
        int j2 = j4;
        if (j4 < 0)
        {
            j2 = -j4;
        }
        if (j2 <= 2)
        {
            return b.getString(0x7f080233);
        }
        k4 = j2;
        if (j2 <= 5)
        {
            return b.getString(0x7f080234);
        }
_L9:
        int k2 = k4;
        if (k4 < 0)
        {
            k2 = -k4;
        }
        if (k2 < 2)
        {
            return b.getString(0x7f080235);
        }
        if (k2 < 3)
        {
            return b.getString(0x7f080236);
        }
        l4 = k2;
        if (k2 <= 5)
        {
            return b.getString(0x7f080234);
        }
_L10:
        int l2 = l4;
        if (l4 < 0)
        {
            l2 = -l4;
        }
        if (l2 < 2)
        {
            return b.getString(0x7f080235);
        }
        if (l2 < 3)
        {
            return b.getString(0x7f080236);
        }
        if (l2 <= 5)
        {
            return b.getString(0x7f080234);
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    private void a(GoLifeBean golifebean, View view)
    {
        ((ImageView)(ImageView)view.findViewById(0x7f0901e8)).setImageResource(a(golifebean.c()));
        TextView textview = (TextView)view.findViewById(0x7f0901e9);
        textview.setText(b(golifebean.c()));
        a.a(textview, 4, true);
        ((TextView)view.findViewById(0x7f0901ea)).setText(a(golifebean.c(), golifebean.b()));
    }

    private String b(j j1)
    {
        switch (com.go.weatherex.home.current.i.a[j1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return b.getString(0x7f080222);

        case 2: // '\002'
            return b.getString(0x7f080223);

        case 3: // '\003'
            return b.getString(0x7f080224);

        case 4: // '\004'
            return b.getString(0x7f080225);

        case 5: // '\005'
            return b.getString(0x7f080226);

        case 6: // '\006'
            return b.getString(0x7f080227);

        case 7: // '\007'
            return b.getString(0x7f080228);

        case 8: // '\b'
            return b.getString(0x7f080229);

        case 9: // '\t'
            return b.getString(0x7f08022a);
        }
    }

    private boolean m()
    {
        Time time = new Time();
        time.setToNow();
        if (h.year == time.year && h.month == time.month && h.monthDay == time.monthDay)
        {
            return false;
        } else
        {
            h.setToNow();
            return true;
        }
    }

    public void a()
    {
        super.a();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public void a(String s)
    {
        e.setText(b.getResources().getString(0x7f0802e1));
        if (!TextUtils.isEmpty(s))
        {
            f = s;
            s = com.gau.go.launcherex.gowidget.weather.util.f.a(b).a(f);
            if (s != null)
            {
                Object obj = com.go.weatherex.home.c.e.a(((WeatherBean) (s)).k);
                new ArrayList();
                Object obj1 = com.go.weatherex.home.c.a.a((ArrayList)((SparseArray) (obj)).get(1));
                new ArrayList();
                s = com.go.weatherex.home.c.a.a((ArrayList)((SparseArray) (obj)).get(2));
                new ArrayList();
                obj = com.go.weatherex.home.c.a.a((ArrayList)((SparseArray) (obj)).get(3));
                View view = c.findViewById(0x7f0901ec);
                if (((ArrayList) (obj1)).size() >= 1)
                {
                    a((GoLifeBean)((ArrayList) (obj1)).get(0), view);
                } else
                {
                    view.setVisibility(8);
                }
                obj1 = c.findViewById(0x7f0901ed);
                if (s.size() >= 1)
                {
                    a((GoLifeBean)s.get(0), ((View) (obj1)));
                } else
                {
                    ((View) (obj1)).setVisibility(8);
                }
                s = c.findViewById(0x7f0901ee);
                if (((ArrayList) (obj)).size() >= 1)
                {
                    a((GoLifeBean)((ArrayList) (obj)).get(0), ((View) (s)));
                    return;
                } else
                {
                    s.setVisibility(8);
                    return;
                }
            }
        }
    }

    public void a(List list, w w1)
    {
        super.a(list, w1);
        a(f);
    }

    public void b()
    {
        super.b();
        if (!m())
        {
            return;
        } else
        {
            a(f);
            return;
        }
    }

    public View f()
    {
        return c;
    }

    public void g()
    {
    }

    public void h()
    {
        a(f);
    }

    public void i()
    {
    }

    public void onClick(View view)
    {
        if (view.equals(d))
        {
            ((com.go.weatherex.home.current.w)a).e(f);
        }
    }
}
