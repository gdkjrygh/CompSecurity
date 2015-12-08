// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ai, ak, aj, VerticalStretchLayout, 
//            al

public class Setting41Activity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static int y;
    private static int z;
    private e A;
    private t B;
    public int a;
    public int b;
    public int c;
    public int d;
    private View e;
    private TextView f;
    private View g;
    private TextView h;
    private View i;
    private CheckBox j;
    private View k;
    private CheckBox l;
    private View m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private VerticalStretchLayout q;
    private View r;
    private int s;
    private int t[] = {
        1, 2, 3
    };
    private String u[];
    private int v[];
    private String w[];
    private al x;

    public Setting41Activity()
    {
        w = null;
    }

    static int a(Setting41Activity setting41activity, int i1)
    {
        setting41activity.s = i1;
        return i1;
    }

    static TextView a(Setting41Activity setting41activity)
    {
        return setting41activity.f;
    }

    private t a()
    {
        if (B == null)
        {
            B = new t(this);
        }
        return B;
    }

    private void a(int i1)
    {
        h.setText(com.gau.go.launcherex.gowidget.weather.util.r.a(t[i1]));
    }

    private void a(int i1, int j1, CharSequence acharsequence[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = acharsequence.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            a a1 = new a();
            a1.a = acharsequence[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        t t1 = a();
        t1.a(i1);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new ai(this, acharsequence));
        t1.a();
    }

    private void a(int i1, int j1, String as[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = as.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            a a1 = new a();
            a1.a = as[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        as = a();
        as.a(i1);
        as.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        as.b(i1);
        as.a(new ak(this, j1));
        as.a();
    }

    static void a(Setting41Activity setting41activity, boolean flag)
    {
        setting41activity.a(flag);
    }

    private void a(boolean flag)
    {
        m.setClickable(flag);
        if (flag)
        {
            n.setTextColor(y);
            o.setTextColor(y);
            p.setImageResource(0x7f020415);
            r.setVisibility(0);
            return;
        } else
        {
            n.setTextColor(z);
            o.setTextColor(z);
            p.setImageResource(0x7f020416);
            r.setVisibility(8);
            return;
        }
    }

    static e b(Setting41Activity setting41activity)
    {
        return setting41activity.A;
    }

    private void b(int i1, int j1, CharSequence acharsequence[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = acharsequence.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            a a1 = new a();
            a1.a = acharsequence[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        acharsequence = a();
        acharsequence.a(i1);
        acharsequence.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        acharsequence.b(i1);
        acharsequence.a(new aj(this));
        acharsequence.a();
    }

    static void b(Setting41Activity setting41activity, int i1)
    {
        setting41activity.a(i1);
    }

    static int c(Setting41Activity setting41activity)
    {
        return setting41activity.s;
    }

    static int[] d(Setting41Activity setting41activity)
    {
        return setting41activity.t;
    }

    static int[] e(Setting41Activity setting41activity)
    {
        return setting41activity.v;
    }

    static String[] f(Setting41Activity setting41activity)
    {
        return setting41activity.u;
    }

    static TextView g(Setting41Activity setting41activity)
    {
        return setting41activity.n;
    }

    static String[] h(Setting41Activity setting41activity)
    {
        return setting41activity.w;
    }

    static CheckBox i(Setting41Activity setting41activity)
    {
        return setting41activity.j;
    }

    static CheckBox j(Setting41Activity setting41activity)
    {
        return setting41activity.l;
    }

    static VerticalStretchLayout k(Setting41Activity setting41activity)
    {
        return setting41activity.q;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        flag1 = true;
        i1 = 1;
        if (!compoundbutton.equals(l)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            i1 = 0;
        }
        if (c == i1) goto _L4; else goto _L3
_L3:
        c = i1;
        a(flag);
        A.a(WeatherContentProvider.g, "setting_key", "autoUpdate", "setting_value", c);
        if (!flag) goto _L6; else goto _L5
_L5:
        q.d();
_L4:
        return;
_L6:
        q.c();
        return;
_L2:
        if (compoundbutton.equals(j))
        {
            int j1;
            if (flag)
            {
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 0;
            }
            if (a != j1)
            {
                a = j1;
                A.a(WeatherContentProvider.g, "setting_key", "isCycle", "setting_value", a);
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void onClick(View view)
    {
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        if (!view.equals(e)) goto _L2; else goto _L1
_L1:
        a(0x7f080391, d - 1, w);
_L4:
        return;
_L2:
        if (view.equals(g))
        {
            k1 = t.length;
            view = new CharSequence[k1];
            for (; i1 < k1; i1++)
            {
                view[i1] = com.gau.go.launcherex.gowidget.weather.util.r.a(t[i1]);
            }

            b(0x7f08039b, s, view);
            return;
        }
        if (view.equals(i))
        {
            j.toggle();
            return;
        }
        if (view.equals(k))
        {
            l.toggle();
            return;
        }
        if (view.equals(m))
        {
            int l1 = v.length;
            int j1 = k1;
            while (j1 < l1) 
            {
                if (b == v[j1])
                {
                    a(0x7f0803ad, j1, u);
                    return;
                }
                j1++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030137);
        getWindow().clearFlags(0x8000000);
        A = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).f();
        y = e().getColor(0x7f0a0065);
        z = e().getColor(0x7f0a0038);
        w = com.gau.go.launcherex.gowidget.weather.util.c.e(this);
        e = findViewById(0x7f090323);
        e.setOnClickListener(this);
        f = (TextView)findViewById(0x7f090325);
        g = findViewById(0x7f09032c);
        g.setOnClickListener(this);
        h = (TextView)findViewById(0x7f09032d);
        i = findViewById(0x7f090379);
        i.setOnClickListener(this);
        j = (CheckBox)findViewById(0x7f09037a);
        j.setOnCheckedChangeListener(this);
        k = findViewById(0x7f090339);
        k.setOnClickListener(this);
        l = (CheckBox)findViewById(0x7f090591);
        l.setOnCheckedChangeListener(this);
        u = com.gau.go.launcherex.gowidget.weather.util.c.a(this);
        v = e().getIntArray(0x7f0d0026);
        m = findViewById(0x7f09033c);
        m.setOnClickListener(this);
        n = (TextView)findViewById(0x7f09033e);
        o = (TextView)findViewById(0x7f09033d);
        p = (ImageView)findViewById(0x7f090592);
        q = (VerticalStretchLayout)findViewById(0x7f09033b);
        r = findViewById(0x7f090593);
        x = new al(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        registerReceiver(x, bundle);
    }

    protected void onDestroy()
    {
        unregisterReceiver(x);
        super.onDestroy();
    }
}
