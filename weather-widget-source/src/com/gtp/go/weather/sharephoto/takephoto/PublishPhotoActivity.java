// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.globalview.n;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.gtp.go.weather.sharephoto.UserPhotosActivity;
import com.gtp.go.weather.sharephoto.a.h;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.b.o;
import com.gtp.go.weather.sharephoto.c.b;
import com.gtp.go.weather.sharephoto.c.l;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            v, w, r, s, 
//            ao, m, q, x, 
//            t, u

public class PublishPhotoActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, h
{

    private View a;
    private View b;
    private EditText c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private View g;
    private n h;
    private ImageView i;
    private s j;
    private WeatherBean k;
    private List l;
    private String m;
    private boolean n;
    private ad o;
    private SharedPreferences p;
    private final TextWatcher q = new v(this);
    private final com.gau.go.launcherex.gowidget.weather.service.a.g r = new w(this);

    public PublishPhotoActivity()
    {
        n = false;
    }

    public static Intent a(Context context, s s1)
    {
        context = new Intent(context, com/gtp/go/weather/sharephoto/takephoto/PublishPhotoActivity);
        com.gtp.go.weather.sharephoto.takephoto.r.a = s1;
        return context;
    }

    static ImageView a(PublishPhotoActivity publishphotoactivity)
    {
        return publishphotoactivity.f;
    }

    private void a()
    {
        Object obj = c.getText().toString();
        String s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = "";
        }
        obj = p.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("key_publish_photo_description", s1);
        if (k != null)
        {
            ((android.content.SharedPreferences.Editor) (obj)).putString("key_publish_photo_city_id", k.c());
        }
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

    static boolean a(PublishPhotoActivity publishphotoactivity, boolean flag)
    {
        publishphotoactivity.n = flag;
        return flag;
    }

    static List b(PublishPhotoActivity publishphotoactivity)
    {
        return publishphotoactivity.l;
    }

    private boolean b()
    {
        return true;
    }

    static WeatherBean c(PublishPhotoActivity publishphotoactivity)
    {
        return publishphotoactivity.k;
    }

    static n d(PublishPhotoActivity publishphotoactivity)
    {
        return publishphotoactivity.h;
    }

    static TextView e(PublishPhotoActivity publishphotoactivity)
    {
        return publishphotoactivity.d;
    }

    private void f()
    {
        if (n)
        {
            return;
        }
        n = true;
        i();
        b b1 = new b(this);
        Object obj = b1.c();
        if (k != null)
        {
            b1.b(k.c());
            ((e) (obj)).c(k.d());
        }
        b1.c(c.getText().toString());
        b1.a(m);
        obj = j.f();
        if (obj != null)
        {
            ((ao) (obj)).a(k);
        }
        b1.a(j);
        obj = com.gtp.go.weather.sharephoto.takephoto.m.b();
        b1.a(((q) (obj)).c());
        if (((q) (obj)).b() != null && ((q) (obj)).b().c().equals(b1.d()))
        {
            b1.a(((q) (obj)).a());
        }
        com.gtp.go.weather.sharephoto.c.l.a(b1);
    }

    static void f(PublishPhotoActivity publishphotoactivity)
    {
        publishphotoactivity.j();
    }

    private void g()
    {
        int i1 = 5;
        Object obj = e().getDisplayMetrics();
        int l1 = (int)(0.0F * ((DisplayMetrics) (obj)).density);
        if (h == null)
        {
            View view = getLayoutInflater().inflate(0x7f030108, null);
            x x1 = new x(this);
            ((ListView)view.findViewById(0x7f09050f)).setAdapter(x1);
            int k1 = i.getHeight();
            int j1 = x1.getCount();
            k1 = (int)((float)k1 / ((45F + 0.6F) * ((DisplayMetrics) (obj)).density));
            int ai[];
            if (k1 <= 5)
            {
                i1 = k1;
            }
            if (i1 > j1)
            {
                i1 = j1;
            }
            h = new n(this, view, -1, (int)((float)i1 * (45F + 0.6F) * ((DisplayMetrics) (obj)).density + 2.5F));
            h.a(new t(this));
        }
        ai = new int[2];
        g.getLocationInWindow(ai);
        h.a(g, -ai[0], l1);
        f.setImageResource(0x7f02041a);
        ai = getCurrentFocus();
        if (ai != null)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(ai.getWindowToken(), 2);
        }
    }

    static void g(PublishPhotoActivity publishphotoactivity)
    {
        publishphotoactivity.l();
    }

    private List h()
    {
        ArrayList arraylist = new ArrayList();
        WeatherBean weatherbean = com.gtp.go.weather.sharephoto.takephoto.m.b().b();
        if (weatherbean != null)
        {
            arraylist.add(weatherbean);
        }
        Iterator iterator = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).h().d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeatherBean weatherbean1 = (WeatherBean)iterator.next();
            if (weatherbean == null || !weatherbean1.c().equals(weatherbean.c()))
            {
                arraylist.add(weatherbean1);
            }
        } while (true);
        return arraylist;
    }

    private void i()
    {
label0:
        {
            if (!isFinishing())
            {
                if (o == null)
                {
                    break label0;
                }
                if (!o.isShowing())
                {
                    o.show();
                }
            }
            return;
        }
        o = ad.a(this);
        o.setCanceledOnTouchOutside(false);
        o.setOnKeyListener(new u(this));
        o.a(getString(0x7f08045d));
        o.show();
    }

    private void j()
    {
        if (!isFinishing() && o != null && o.isShowing())
        {
            o.dismiss();
            o = null;
        }
    }

    private void k()
    {
        c.setText("");
    }

    private void l()
    {
        startActivity(new Intent(this, com/gtp/go/weather/sharephoto/UserPhotosActivity));
    }

    public void a(WeatherBean weatherbean)
    {
        k = weatherbean;
        e.setText(weatherbean.d());
    }

    public void a(o o1)
    {
        m = o1.a();
    }

    public void onBackPressed()
    {
        try
        {
            super.onBackPressed();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            finish();
        }
    }

    public void onClick(View view)
    {
        if (!view.equals(a)) goto _L2; else goto _L1
_L1:
        finish();
_L4:
        return;
_L2:
        if (!view.equals(b))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.gau.go.launcherex.gowidget.c.g.a(getApplicationContext()))
        {
            Toast.makeText(this, getText(0x7f080375), 0).show();
            return;
        }
        if (b())
        {
            f();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view.equals(g))
        {
            g();
            return;
        }
        if (view.equals(d))
        {
            k();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = com.gtp.go.weather.sharephoto.takephoto.r.a;
        if (j == null || !j.h())
        {
            finish();
            return;
        }
        bundle = com.gtp.go.weather.sharephoto.a.g.a(getApplicationContext());
        bundle.a(this);
        if (bundle.a())
        {
            m = bundle.b().a();
        }
        com.gtp.go.weather.sharephoto.c.l.a(r);
        setContentView(0x7f030107);
        a = findViewById(0x7f090060);
        b = findViewById(0x7f090509);
        c = (EditText)findViewById(0x7f09050a);
        d = (TextView)findViewById(0x7f09050b);
        e = (TextView)findViewById(0x7f09050d);
        f = (ImageView)findViewById(0x7f0902cc);
        g = findViewById(0x7f09050c);
        i = (ImageView)findViewById(0x7f09050e);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        d.setOnClickListener(this);
        g.setOnClickListener(this);
        c.addTextChangedListener(q);
        c.setOnFocusChangeListener(this);
        c.clearFocus();
        p = GoWidgetApplication.c(getApplicationContext()).a();
        bundle = p.getString("key_publish_photo_description", "");
        if (!TextUtils.isEmpty(bundle))
        {
            c.setText(bundle);
            bundle = c.getText();
            if (bundle instanceof Spannable)
            {
                Selection.setSelection((Spannable)bundle, bundle.length());
            }
        }
        bundle = p.getString("key_publish_photo_city_id", "");
        if (TextUtils.isEmpty(bundle))
        {
            bundle = j.g();
        }
        l = h();
        if (l.size() <= 0) goto _L2; else goto _L1
_L1:
        WeatherBean weatherbean;
        Iterator iterator;
        weatherbean = (WeatherBean)l.get(0);
        iterator = l.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        WeatherBean weatherbean1 = (WeatherBean)iterator.next();
        if (!weatherbean1.c().equals(bundle)) goto _L6; else goto _L5
_L5:
        bundle = weatherbean1;
_L8:
        a(bundle);
        return;
_L2:
        e.setVisibility(4);
        return;
_L4:
        bundle = weatherbean;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.gtp.go.weather.sharephoto.c.l.b(r);
        com.gtp.go.weather.sharephoto.a.g.a(getApplicationContext()).b(this);
    }

    public void onFocusChange(View view, boolean flag)
    {
label0:
        {
            if (view.equals(c))
            {
                if (!flag)
                {
                    break label0;
                }
                c.setHint("");
            }
            return;
        }
        c.setHint(0x7f08045c);
    }

    protected void onStop()
    {
        super.onStop();
        a();
    }
}
