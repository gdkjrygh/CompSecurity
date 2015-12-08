// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.globalview.g;
import com.gau.go.launcherex.gowidget.weather.model.ThemeDataBean;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.go.weather.sharephoto.b.a;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;
import java.io.File;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            x, y, k, aa, 
//            c

public class MyAwardsActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private LayoutInflater a;
    private View b;
    private int c;
    private ListView d;
    private y e;
    private k f;
    private aa g;
    private c h;
    private g i;

    public MyAwardsActivity()
    {
    }

    private Bitmap a(Bitmap bitmap)
    {
        return ab.a(bitmap);
    }

    static Bitmap a(MyAwardsActivity myawardsactivity, Bitmap bitmap)
    {
        return myawardsactivity.a(bitmap);
    }

    static y a(MyAwardsActivity myawardsactivity)
    {
        return myawardsactivity.e;
    }

    private void a(long l, a a1)
    {
        ThemeDataBean themedatabean;
        themedatabean = new ThemeDataBean();
        themedatabean.a(a1.d());
        themedatabean.e(a1.c());
        themedatabean.a((int)l);
        a1.f();
        JVM INSTR tableswitch 1 3: default 64
    //                   1 71
    //                   2 83
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(this, themedatabean);
        return;
_L2:
        themedatabean.j(a1.e());
        continue; /* Loop/switch isn't completed */
_L3:
        themedatabean.k(a1.e());
        continue; /* Loop/switch isn't completed */
_L4:
        themedatabean.n(a1.e());
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(long l, a a1, String s)
    {
        if (i == null)
        {
            i = new g(this);
            i.d(0x7f080129);
            i.b(null);
            i.c(null);
        }
        boolean flag = r.a(this, a1.c());
        if (flag)
        {
            i.c(0x7f0804b6);
            i.b(0x7f0804b8);
        } else
        {
            i.c(0x7f080128);
            i.b(0x7f0804b7);
        }
        i.a(BitmapFactory.decodeFile(a1.b()));
        i.a(new x(this, flag, a1, l));
        i.show();
    }

    static void a(MyAwardsActivity myawardsactivity, long l, a a1)
    {
        myawardsactivity.a(l, a1);
    }

    static void a(MyAwardsActivity myawardsactivity, String s)
    {
        myawardsactivity.a(s);
    }

    private void a(String s)
    {
        s = ThemeDetailActivity.a(this, 2, 2, s);
        s.addFlags(0x4000000);
        startActivity(s);
    }

    static Bitmap b(MyAwardsActivity myawardsactivity, String s)
    {
        return myawardsactivity.c(s);
    }

    static k b(MyAwardsActivity myawardsactivity)
    {
        return myawardsactivity.f;
    }

    private void b(String s)
    {
        Toast.makeText(this, s, 0).show();
    }

    private Bitmap c(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return ab.a(c, c, new File(s));
        } else
        {
            return null;
        }
    }

    static g c(MyAwardsActivity myawardsactivity)
    {
        return myawardsactivity.i;
    }

    static LayoutInflater d(MyAwardsActivity myawardsactivity)
    {
        return myawardsactivity.a;
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030002);
        a = LayoutInflater.from(this);
        c = (int)(e().getDisplayMetrics().density * 100F);
        b = findViewById(0x7f090060);
        b.setOnClickListener(this);
        d = (ListView)findViewById(0x7f090062);
        d.setDivider(null);
        d.setCacheColorHint(0);
        e = new y(this, null);
        d.setAdapter(e);
        d.setOnItemClickListener(this);
        f = new k(getApplicationContext());
        g = new aa(this, null);
        f.a(g);
        f.a(false);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        FilterService.destroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        if (!com.gau.go.launcherex.gowidget.c.g.a(this))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        view = e.a(j);
        if (view == null) goto _L2; else goto _L1
_L1:
        if (view.j() != 0) goto _L4; else goto _L3
_L3:
        if (h == null)
        {
            h = new c(this);
            h.setCanceledOnTouchOutside(false);
        }
        h.a(view);
_L2:
        return;
_L4:
        adapterview = null;
        com.gtp.go.weather.sharephoto.b.b b1 = view.i();
        if (b1 != null)
        {
            adapterview = b1.d();
        }
        if (adapterview == null) goto _L2; else goto _L5
_L5:
        a(view.h(), adapterview, adapterview.c());
        return;
        b(getString(0x7f08019c));
        return;
    }
}
