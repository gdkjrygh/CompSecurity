// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.globalview.s;
import com.gtp.go.weather.sharephoto.award.MyAwardsActivity;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.award.r;
import com.gtp.go.weather.sharephoto.d.c;
import com.gtp.go.weather.sharephoto.photo.ad;
import com.gtp.go.weather.sharephoto.photo.aj;
import com.gtp.go.weather.sharephoto.takephoto.aa;
import com.gtp.go.weather.sharephoto.view.UserPhotoItem;
import com.gtp.go.weather.sharephoto.view.e;
import com.gtp.go.weather.sharephoto.view.f;
import com.gtp.go.weather.sharephoto.view.g;
import com.gtp.go.weather.sharephoto.view.n;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            ab, aa, TermsAndPrivacyActivity, ac, 
//            z

public class UserPhotosActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, aj, f, n
{

    private ad a;
    private ViewGroup b;
    private g c;
    private ListView d;
    private View e;
    private View f;
    private View g;
    private aa h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private View o;
    private TextView p;
    private boolean q;
    private int r;
    private ImageView s;
    private k t;
    private r u;
    private ac v;
    private c w;
    private s x;

    public UserPhotosActivity()
    {
    }

    private void a(String s1, boolean flag)
    {
        if (x == null)
        {
            x = new s(this);
        }
        x.setCancelable(flag);
        x.a(s1);
        if (!x.isShowing())
        {
            x.show();
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            o.setVisibility(8);
            p.setVisibility(0);
            return;
        } else
        {
            o.setVisibility(0);
            p.setVisibility(8);
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            i.setVisibility(8);
            l.setVisibility(0);
            if (flag1)
            {
                m.setVisibility(0);
                n.setVisibility(8);
                return;
            } else
            {
                m.setVisibility(8);
                n.setVisibility(0);
                return;
            }
        }
        i.setVisibility(0);
        l.setVisibility(8);
        if (flag1)
        {
            j.setVisibility(0);
            k.setVisibility(8);
            return;
        } else
        {
            j.setVisibility(8);
            k.setVisibility(0);
            return;
        }
    }

    static boolean a(UserPhotosActivity userphotosactivity)
    {
        return userphotosactivity.q;
    }

    static boolean a(UserPhotosActivity userphotosactivity, boolean flag)
    {
        userphotosactivity.q = flag;
        return flag;
    }

    private void b()
    {
        if (r > 1)
        {
            q = true;
            Toast.makeText(this, 0x7f0804a9, 0).show();
            if (c.a() == 1)
            {
                a(true, true);
            } else
            {
                a(false, true);
            }
            a.a(r - 1, this);
        }
    }

    static void b(UserPhotosActivity userphotosactivity)
    {
        userphotosactivity.b();
    }

    static ImageView c(UserPhotosActivity userphotosactivity)
    {
        return userphotosactivity.s;
    }

    static void d(UserPhotosActivity userphotosactivity)
    {
        userphotosactivity.f();
    }

    static g e(UserPhotosActivity userphotosactivity)
    {
        return userphotosactivity.c;
    }

    static ad f(UserPhotosActivity userphotosactivity)
    {
        return userphotosactivity.a;
    }

    private void f()
    {
        while (x == null || !x.isShowing()) 
        {
            return;
        }
        x.dismiss();
    }

    public void a()
    {
        int i1 = c.a();
        if (i1 == 0)
        {
            i.setVisibility(8);
            l.setVisibility(8);
            return;
        }
        if (i1 == 1)
        {
            a(true);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public void a(int i1, ArrayList arraylist)
    {
        r = i1;
        if (arraylist != null && !arraylist.isEmpty())
        {
            c.a(arraylist);
        }
        c.notifyDataSetChanged();
        f();
        i1 = c.a();
        if (r != 1) goto _L2; else goto _L1
_L1:
        if (i1 == 1)
        {
            a(true, false);
        } else
        {
            a(false, false);
        }
_L4:
        q = false;
        return;
_L2:
        if (i.getVisibility() == 0)
        {
            i.setVisibility(8);
            j.setVisibility(8);
            k.setVisibility(8);
        } else
        if (l.getVisibility() == 0)
        {
            l.setVisibility(8);
            m.setVisibility(8);
            n.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(long l1, View view, UserPhotoItem userphotoitem)
    {
        if (com.gau.go.launcherex.gowidget.c.g.a(this))
        {
            a(getString(0x7f0804aa), false);
            a.b(l1, new ab(this, l1, view, userphotoitem));
            view = new a(117, "delete_confirm");
            view.a(String.valueOf(l1));
            view.e("2");
            com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(view);
            return;
        } else
        {
            Toast.makeText(getApplicationContext(), 0x7f0804ae, 0).show();
            return;
        }
    }

    public void a(long l1, boolean flag, UserPhotoItem userphotoitem)
    {
        if (flag)
        {
            com.gtp.go.weather.sharephoto.view.e.a(this, b);
            return;
        } else
        {
            com.gtp.go.weather.sharephoto.view.e.b(this, b);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            c.a(arraylist);
            c.notifyDataSetChanged();
            f();
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        h.a(i1, j1, intent);
    }

    public void onClick(View view)
    {
        if (view.equals(e))
        {
            finish();
        } else
        {
            if (view.equals(g))
            {
                h.a();
                return;
            }
            if (view.equals(s))
            {
                startActivity(new Intent(this, com/gtp/go/weather/sharephoto/award/MyAwardsActivity));
                s.postDelayed(new com.gtp.go.weather.sharephoto.aa(this), 200L);
                return;
            }
            if (view.equals(o) || view.equals(p))
            {
                com.gtp.go.weather.sharephoto.TermsAndPrivacyActivity.a(this);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = LayoutInflater.from(this);
        getWindow().setBackgroundDrawable(null);
        b = (ViewGroup)bundle.inflate(0x7f030004, null);
        setContentView(b);
        w = new c(this);
        e = findViewById(0x7f090060);
        e.setOnClickListener(this);
        s = (ImageView)findViewById(0x7f09006c);
        s.setOnClickListener(this);
        o = bundle.inflate(0x7f0300e6, null);
        o.setOnClickListener(this);
        p = (TextView)findViewById(0x7f090071);
        p.setOnClickListener(this);
        p.getPaint().setFlags(8);
        ((TextView)o.findViewById(0x7f090071)).getPaint().setFlags(8);
        t = new k(getApplicationContext());
        u = new r(this, t);
        v = new ac(this, null);
        t.a(v);
        f = findViewById(0x7f09006e);
        g = findViewById(0x7f09006f);
        g.setOnClickListener(this);
        l = findViewById(0x7f090070);
        m = l.findViewById(0x7f09049c);
        n = l.findViewById(0x7f09049d);
        c = new g(this);
        c.a(this);
        c.a(this);
        c.a(w);
        d = (ListView)findViewById(0x7f09006d);
        d.setCacheColorHint(0);
        d.setDivider(null);
        d.setSelector(new ColorDrawable(0));
        d.setEmptyView(f);
        i = bundle.inflate(0x7f0300e3, null);
        j = i.findViewById(0x7f09049c);
        k = i.findViewById(0x7f09049d);
        i.setVisibility(8);
        d.addFooterView(i);
        d.addFooterView(o);
        d.setAdapter(c);
        d.setOnScrollListener(new z(this));
        f.setVisibility(8);
        h = new aa(this);
        a = new ad(this);
        a(getString(0x7f0804ab), true);
        a.a(0, this);
        q = true;
        t.a(false);
        t.b();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        u.a();
        t.b(v);
        t.a();
        c.b();
        com.gtp.go.weather.sharephoto.d.a.a();
        w.a();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a.a(0, this);
    }

    protected void onResume()
    {
        super.onResume();
        u.b();
    }

    protected void onStop()
    {
        super.onStop();
        u.a();
    }
}
