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
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            af, ag, VerticalStretchLayout, ah

public class Setting21Activity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static int u;
    private static int v;
    public int a;
    public int b;
    public int c;
    public int d;
    private View e;
    private TextView f;
    private View g;
    private CheckBox h;
    private View i;
    private CheckBox j;
    private View k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private VerticalStretchLayout o;
    private View p;
    private String q[];
    private int r[];
    private String s[];
    private ah t;
    private e w;
    private f x;
    private t y;

    public Setting21Activity()
    {
        s = null;
    }

    static TextView a(Setting21Activity setting21activity)
    {
        return setting21activity.f;
    }

    private t a()
    {
        if (y == null)
        {
            y = new t(this);
        }
        return y;
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
        t1.a(new af(this, acharsequence));
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
        as.a(new ag(this, j1));
        as.a();
    }

    static void a(Setting21Activity setting21activity, boolean flag)
    {
        setting21activity.a(flag);
    }

    private void a(boolean flag)
    {
        k.setClickable(flag);
        if (flag)
        {
            l.setTextColor(u);
            m.setTextColor(u);
            n.setImageResource(0x7f020415);
            p.setVisibility(0);
            return;
        } else
        {
            l.setTextColor(v);
            m.setTextColor(v);
            n.setImageResource(0x7f020416);
            p.setVisibility(8);
            return;
        }
    }

    static e b(Setting21Activity setting21activity)
    {
        return setting21activity.w;
    }

    static int[] c(Setting21Activity setting21activity)
    {
        return setting21activity.r;
    }

    static String[] d(Setting21Activity setting21activity)
    {
        return setting21activity.q;
    }

    static TextView e(Setting21Activity setting21activity)
    {
        return setting21activity.l;
    }

    static String[] f(Setting21Activity setting21activity)
    {
        return setting21activity.s;
    }

    static CheckBox g(Setting21Activity setting21activity)
    {
        return setting21activity.h;
    }

    static CheckBox h(Setting21Activity setting21activity)
    {
        return setting21activity.j;
    }

    static VerticalStretchLayout i(Setting21Activity setting21activity)
    {
        return setting21activity.o;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        flag1 = true;
        i1 = 1;
        if (!compoundbutton.equals(j)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            i1 = 0;
        }
        if (c == i1) goto _L4; else goto _L3
_L3:
        c = i1;
        a(flag);
        w.a(WeatherContentProvider.g, "setting_key", "autoUpdate", "setting_value", c);
        if (!flag) goto _L6; else goto _L5
_L5:
        o.d();
_L4:
        return;
_L6:
        o.c();
        return;
_L2:
        if (compoundbutton.equals(h))
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
                w.a(WeatherContentProvider.g, "setting_key", "isCycle", "setting_value", a);
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void onClick(View view)
    {
        if (!view.equals(e)) goto _L2; else goto _L1
_L1:
        a(0x7f080391, d - 1, s);
_L4:
        return;
_L2:
        if (view.equals(g))
        {
            h.toggle();
            return;
        }
        if (view.equals(i))
        {
            j.toggle();
            return;
        }
        if (view.equals(k))
        {
            int j1 = r.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                if (b == r[i1])
                {
                    a(0x7f0803ad, i1, q);
                    return;
                }
                i1++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030136);
        getWindow().clearFlags(0x8000000);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext());
        w = bundle.f();
        x = bundle.h();
        u = e().getColor(0x7f0a0065);
        v = e().getColor(0x7f0a0038);
        s = com.gau.go.launcherex.gowidget.weather.util.c.e(this);
        e = findViewById(0x7f090323);
        e.setOnClickListener(this);
        f = (TextView)findViewById(0x7f090325);
        g = findViewById(0x7f090379);
        g.setOnClickListener(this);
        h = (CheckBox)findViewById(0x7f09037a);
        h.setOnCheckedChangeListener(this);
        i = findViewById(0x7f090339);
        i.setOnClickListener(this);
        j = (CheckBox)findViewById(0x7f090591);
        j.setOnCheckedChangeListener(this);
        q = com.gau.go.launcherex.gowidget.weather.util.c.a(this);
        r = e().getIntArray(0x7f0d0026);
        k = findViewById(0x7f09033c);
        k.setOnClickListener(this);
        l = (TextView)findViewById(0x7f09033e);
        m = (TextView)findViewById(0x7f09033d);
        n = (ImageView)findViewById(0x7f090592);
        o = (VerticalStretchLayout)findViewById(0x7f09033b);
        p = findViewById(0x7f090593);
        t = new ah(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        registerReceiver(t, bundle);
    }

    protected void onDestroy()
    {
        unregisterReceiver(t);
        super.onDestroy();
    }
}
