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
//            am, ao, an, ap, 
//            VerticalStretchLayout, aq

public class Setting42Activity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static int G;
    private static int H;
    private CheckBox A;
    private String B[];
    private View C;
    private CheckBox D;
    private View E;
    private CheckBox F;
    private e I;
    private t J;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private aq f;
    private View g;
    private TextView h;
    private View i;
    private TextView j;
    private int k;
    private int l[] = {
        1, 2, 3
    };
    private View m;
    private TextView n;
    private int o;
    private String p[];
    private int q[];
    private String r[];
    private int s[];
    private View t;
    private TextView u;
    private TextView v;
    private ImageView w;
    private VerticalStretchLayout x;
    private View y;
    private View z;

    public Setting42Activity()
    {
        B = null;
    }

    static int a(Setting42Activity setting42activity, int i1)
    {
        setting42activity.k = i1;
        return i1;
    }

    static TextView a(Setting42Activity setting42activity)
    {
        return setting42activity.h;
    }

    private t a()
    {
        if (J == null)
        {
            J = new t(this);
        }
        return J;
    }

    private void a(int i1)
    {
        j.setText(com.gau.go.launcherex.gowidget.weather.util.r.a(l[i1]));
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
        t1.a(new am(this, acharsequence));
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
        as.a(new ao(this, j1));
        as.a();
    }

    static void a(Setting42Activity setting42activity, boolean flag)
    {
        setting42activity.a(flag);
    }

    private void a(boolean flag)
    {
        t.setClickable(flag);
        if (flag)
        {
            u.setTextColor(G);
            v.setTextColor(G);
            w.setImageResource(0x7f020415);
            y.setVisibility(0);
            return;
        } else
        {
            u.setTextColor(H);
            v.setTextColor(H);
            w.setImageResource(0x7f020416);
            y.setVisibility(8);
            return;
        }
    }

    static e b(Setting42Activity setting42activity)
    {
        return setting42activity.I;
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
        acharsequence.a(new an(this));
        acharsequence.a();
    }

    static void b(Setting42Activity setting42activity, int i1)
    {
        setting42activity.a(i1);
    }

    static int c(Setting42Activity setting42activity)
    {
        return setting42activity.k;
    }

    static int c(Setting42Activity setting42activity, int i1)
    {
        setting42activity.o = i1;
        return i1;
    }

    private void c(int i1, int j1, CharSequence acharsequence[])
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
        acharsequence.a(new ap(this, j1));
        acharsequence.a();
    }

    static int[] d(Setting42Activity setting42activity)
    {
        return setting42activity.l;
    }

    static int[] e(Setting42Activity setting42activity)
    {
        return setting42activity.s;
    }

    static String[] f(Setting42Activity setting42activity)
    {
        return setting42activity.r;
    }

    static TextView g(Setting42Activity setting42activity)
    {
        return setting42activity.u;
    }

    static int[] h(Setting42Activity setting42activity)
    {
        return setting42activity.q;
    }

    static String[] i(Setting42Activity setting42activity)
    {
        return setting42activity.p;
    }

    static TextView j(Setting42Activity setting42activity)
    {
        return setting42activity.n;
    }

    static int k(Setting42Activity setting42activity)
    {
        return setting42activity.o;
    }

    static String[] l(Setting42Activity setting42activity)
    {
        return setting42activity.B;
    }

    static CheckBox m(Setting42Activity setting42activity)
    {
        return setting42activity.D;
    }

    static CheckBox n(Setting42Activity setting42activity)
    {
        return setting42activity.F;
    }

    static CheckBox o(Setting42Activity setting42activity)
    {
        return setting42activity.A;
    }

    static VerticalStretchLayout p(Setting42Activity setting42activity)
    {
        return setting42activity.x;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        i1 = 1;
        if (!compoundbutton.equals(D)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            i1 = 0;
        }
        if (d != i1)
        {
            d = i1;
            I.k(d);
            I.a(WeatherContentProvider.g, "setting_key", "calendarType", "setting_value", d);
        }
_L4:
        return;
_L2:
        if (!compoundbutton.equals(A))
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1;
        if (flag)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        if (b != j1)
        {
            b = j1;
            a(flag);
            I.a(WeatherContentProvider.g, "setting_key", "autoUpdate", "setting_value", b);
            if (flag)
            {
                x.d();
                return;
            } else
            {
                x.c();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!compoundbutton.equals(F)) goto _L4; else goto _L3
_L3:
        int k1;
        if (flag)
        {
            k1 = ((flag2) ? 1 : 0);
        } else
        {
            k1 = 0;
        }
        if (e != k1)
        {
            e = k1;
            I.a(WeatherContentProvider.g, "setting_key", "isCycle", "setting_value", e);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        int i1;
        int l1;
        int i2;
        l1 = 0;
        i2 = 0;
        i1 = 0;
        if (!view.equals(z)) goto _L2; else goto _L1
_L1:
        A.toggle();
_L4:
        return;
_L2:
        if (!view.equals(t))
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = s.length;
        while (i1 < l1) 
        {
            if (a == s[i1])
            {
                a(0x7f0803ad, i1, r);
                return;
            }
            i1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view.equals(g))
        {
            a(0x7f080391, c - 1, B);
            return;
        }
        if (view.equals(i))
        {
            i2 = l.length;
            view = new CharSequence[i2];
            for (int j1 = l1; j1 < i2; j1++)
            {
                view[j1] = com.gau.go.launcherex.gowidget.weather.util.r.a(l[j1]);
            }

            b(0x7f08039b, k, view);
            return;
        }
        if (!view.equals(m))
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = q.length;
        int k1 = i2;
        while (k1 < l1) 
        {
            if (o == q[k1])
            {
                c(0x7f0803cc, k1, p);
                return;
            }
            k1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (view.equals(C))
        {
            D.toggle();
            return;
        }
        if (view.equals(E))
        {
            F.toggle();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030138);
        getWindow().clearFlags(0x8000000);
        I = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).f();
        G = e().getColor(0x7f0a0065);
        H = e().getColor(0x7f0a0038);
        z = findViewById(0x7f090339);
        z.setOnClickListener(this);
        A = (CheckBox)findViewById(0x7f090591);
        A.setOnCheckedChangeListener(this);
        r = com.gau.go.launcherex.gowidget.weather.util.c.a(this);
        s = e().getIntArray(0x7f0d0026);
        t = findViewById(0x7f09033c);
        t.setOnClickListener(this);
        u = (TextView)findViewById(0x7f09033e);
        v = (TextView)findViewById(0x7f09033d);
        w = (ImageView)findViewById(0x7f090592);
        x = (VerticalStretchLayout)findViewById(0x7f09033b);
        y = findViewById(0x7f090593);
        B = com.gau.go.launcherex.gowidget.weather.util.c.e(this);
        g = findViewById(0x7f090323);
        g.setOnClickListener(this);
        h = (TextView)findViewById(0x7f090325);
        i = findViewById(0x7f09032c);
        i.setOnClickListener(this);
        j = (TextView)findViewById(0x7f09032d);
        m = findViewById(0x7f0901b7);
        m.setOnClickListener(this);
        n = (TextView)findViewById(0x7f0901b8);
        p = com.gau.go.launcherex.gowidget.weather.util.c.b(this);
        q = e().getIntArray(0x7f0d0028);
        C = findViewById(0x7f0901b5);
        C.setOnClickListener(this);
        D = (CheckBox)findViewById(0x7f0901b6);
        D.setOnCheckedChangeListener(this);
        E = findViewById(0x7f090379);
        E.setOnClickListener(this);
        F = (CheckBox)findViewById(0x7f09037a);
        F.setOnCheckedChangeListener(this);
        f = new aq(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        registerReceiver(f, bundle);
    }

    protected void onDestroy()
    {
        unregisterReceiver(f);
        super.onDestroy();
    }
}
