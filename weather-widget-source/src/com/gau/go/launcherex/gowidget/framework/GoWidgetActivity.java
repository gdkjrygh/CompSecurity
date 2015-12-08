// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.go.weatherex.ad.b.c;
import com.go.weatherex.e.a;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import com.jiubang.ggheart.uninstallcheck.UninstallService;
import java.io.File;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            m, j, b, d, 
//            i, f, g, k, 
//            l

public class GoWidgetActivity extends GoWeatherEXActivity
{

    private long a;
    private String b;
    private int c;
    private String d;
    private boolean e;
    private int f;
    private Bitmap g;
    private Bitmap h;
    private boolean i;
    private ImageView j;
    private int k[] = {
        0x7f020319, 0x7f02031a, 0x7f02031b, 0x7f02031c, 0x7f02031d, 0x7f02031e, 0x7f02031f, 0x7f020320
    };
    private int l[] = {
        0x7f020311, 0x7f020312, 0x7f020313, 0x7f020314, 0x7f020315, 0x7f020316, 0x7f020317, 0x7f020318
    };
    private int m[] = {
        0x7f0201e7, 0x7f0201e9, 0x7f0201eb, 0x7f0201ed, 0x7f0201ef, 0x7f0201f1, 0x7f0201f3
    };
    private int n[] = {
        0x7f0201e8, 0x7f0201ea, 0x7f0201ec, 0x7f0201ee, 0x7f0201f0, 0x7f0201f2, 0x7f0201f4
    };
    private Drawable o[];
    private int p;
    private TextView q;
    private TextView r;
    private c s;
    private com.jiubang.ggheart.analytic.a t;
    private m u;
    private BroadcastReceiver v;

    public GoWidgetActivity()
    {
        b = "";
        c = 0;
        e = true;
        f = -1;
        g = null;
        h = null;
        i = true;
        o = new Drawable[8];
        p = 0;
        u = new m(this);
        v = new j(this);
    }

    static m a(GoWidgetActivity gowidgetactivity)
    {
        return gowidgetactivity.u;
    }

    static com.jiubang.ggheart.analytic.a a(GoWidgetActivity gowidgetactivity, com.jiubang.ggheart.analytic.a a1)
    {
        gowidgetactivity.t = a1;
        return a1;
    }

    private void a(boolean flag)
    {
        com.gau.go.launcherex.gowidget.language.b b1 = e();
        int j1 = o.length;
        int ai[];
        int i1;
        if (i)
        {
            ai = k;
        } else
        {
            ai = l;
        }
        for (i1 = 0; i1 < j1; i1++)
        {
            o[i1] = b1.getDrawable(ai[i1]);
        }

    }

    static com.jiubang.ggheart.analytic.a b(GoWidgetActivity gowidgetactivity)
    {
        return gowidgetactivity.t;
    }

    static long c(GoWidgetActivity gowidgetactivity)
    {
        return gowidgetactivity.a;
    }

    private void f()
    {
        if (s.b())
        {
            long l1 = System.currentTimeMillis();
            s.a(new com.gau.go.launcherex.gowidget.framework.b(this, l1));
            s.c();
        }
    }

    private void g()
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(new d(this));
    }

    private void h()
    {
        ImageView imageview;
        File file;
        if (w.a())
        {
            file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("/GOWeatherEX/download").append(File.separator).append("hiWeather.ex").toString());
        } else
        {
            file = getFileStreamPath("hiWeather.ex");
        }
        if (file != null && file.exists())
        {
            try
            {
                g = BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    outofmemoryerror.printStackTrace();
                }
                if (g != null && !g.isRecycled())
                {
                    g.recycle();
                    g = null;
                }
            }
        }
        imageview = (ImageView)findViewById(0x7f090291);
        if (g == null) goto _L2; else goto _L1
_L1:
        imageview.setImageBitmap(g);
_L7:
        (new i(this)).start();
        return;
_L2:
        Object obj;
        android.graphics.BitmapFactory.Options options;
        int i1;
        i1 = (int)(Math.random() * 10D) % m.length;
        if (i)
        {
            i1 = m[i1];
        } else
        {
            i1 = n[i1];
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 2;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ALPHA_8;
        if (!com.go.weatherex.e.a.a().b())
        {
            break MISSING_BLOCK_LABEL_405;
        }
        obj = com.go.weatherex.e.a.a().c("guide_page_bg");
_L10:
        if (obj == null) goto _L4; else goto _L3
_L3:
        h = ((Bitmap) (obj));
_L8:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        obj = com.go.weatherex.home.a.c.a(getApplicationContext(), h, 15);
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            h.recycle();
            h = ((Bitmap) (obj));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (com.gtp.a.a.b.c.a())
            {
                ((OutOfMemoryError) (obj)).printStackTrace();
            }
            if (h != null && !h.isRecycled())
            {
                h.recycle();
                h = null;
            }
        }
_L9:
        if (h != null)
        {
            imageview.setImageBitmap(h);
        }
          goto _L7
_L4:
        h = BitmapFactory.decodeResource(e(), i1, options);
          goto _L8
_L6:
        findViewById(0x7f090292).setBackgroundColor(Color.argb(90, 0, 0, 0));
          goto _L9
        findViewById(0x7f090292).setBackgroundColor(Color.argb(90, 0, 0, 0));
          goto _L9
        obj = null;
          goto _L10
    }

    private void i()
    {
        Time time = new Time();
        time.setToNow();
        if (time.hour >= 6 && time.hour < 18)
        {
            i = true;
            return;
        } else
        {
            i = false;
            return;
        }
    }

    private void j()
    {
        Intent intent = new Intent(getApplicationContext(), com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        Bundle bundle = new Bundle();
        bundle.putInt("notify_request", 9);
        intent.putExtras(bundle);
        getApplicationContext().startService(intent);
    }

    private boolean k()
    {
        Time time = new Time();
        time.set(26, 11, 2014);
        Time time1 = new Time();
        time1.setToNow();
        return time1.before(time);
    }

    public void a()
    {
        p = (p + 1) % o.length;
        j.setImageDrawable(o[p]);
    }

    public void a(com.jiubang.commerce.ad.a.a a1)
    {
        ImageView imageview = (ImageView)findViewById(0x7f090297);
        com.jiubang.commerce.ad.a.a(getApplicationContext(), a1.i(), new f(this, a1));
        imageview.setOnClickListener(new g(this, a1));
    }

    public void a(Object obj)
    {
        Object aobj[] = (Object[])(Object[])obj;
        if (aobj.length > 1)
        {
            obj = (ImageView)findViewById(0x7f090297);
            com.jiubang.commerce.ad.a.a a1 = (com.jiubang.commerce.ad.a.a)aobj[0];
            Bitmap bitmap = (Bitmap)aobj[1];
            com.jiubang.commerce.ad.a.a(getApplicationContext(), a1, "", "");
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(800L);
            alphaanimation.setAnimationListener(new k(this, ((ImageView) (obj))));
            ((ImageView) (obj)).setImageBitmap(bitmap);
            ((ImageView) (obj)).startAnimation(alphaanimation);
            (new l(this, a1)).start();
        }
        u.sendEmptyMessageDelayed(1, 2000L);
    }

    public void b()
    {
        a(WeatherDetailActivity.a(this, b, e, c, d, f), 0, 0);
        b(0x7f04000b, 0x7f04000d);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03006c);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        Log.i("wss", "GoWidgetActivity_onCreate");
        if (!ab.b("http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip"))
        {
            Log.i("wss", "GoWidgetActivity_Download_iamge_Url");
            com.go.weatherex.e.a.a().a("http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip");
        } else
        {
            Log.i("wss", "GoWidgetActivity_HALLOWEEN_URL");
            com.go.weatherex.e.a.a().a("http://goappdl.goforandroid.com/dynamic/Thanksgiving2015/2015.11.25;2015.11.27.zip");
        }
        q = (TextView)findViewById(0x7f09011a);
        r = (TextView)findViewById(0x7f090294);
        if (k())
        {
            q.setText("");
            q.setBackgroundResource(0x7f020321);
            r.setText("Beautiful Chrismas \267 Beautiful Weather");
        }
        s = new c(getApplicationContext());
        i();
        h();
        a(findViewById(0x7f090290), 2, true);
        a(q, 4, true);
        a(r, 4, true);
        j = (ImageView)findViewById(0x7f090293);
        if (g == null)
        {
            a(i);
            j.setImageDrawable(o[0]);
            u.sendEmptyMessageDelayed(2, 80L);
        } else
        {
            j.setVisibility(8);
        }
        bundle = getIntent();
        if (bundle != null && bundle.getExtras() != null)
        {
            e = bundle.getBooleanExtra("EXTRA_BG_LOADING_IMMEDIATELY_", true);
            f = bundle.getIntExtra("detail_goto", -1);
            b = bundle.getStringExtra("cityId");
            c = bundle.getIntExtra("detailSrc", 0);
            d = bundle.getStringExtra("extra_src_app_package_name");
            if (TextUtils.isEmpty(d))
            {
                d = "--";
            }
            if (c == 3)
            {
                sendBroadcast(new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_HIDE_THEME_ICON"));
            }
        }
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        registerReceiver(v, bundle);
        j();
        a = System.currentTimeMillis();
        UninstallService.a(this);
        f();
        g();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (g != null && !g.isRecycled())
        {
            g.recycle();
            g = null;
        }
        if (h != null && !h.isRecycled())
        {
            h.recycle();
            h = null;
        }
        unregisterReceiver(v);
        if (s != null)
        {
            s.d();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        switch (i1)
        {
        default:
            return super.onKeyDown(i1, keyevent);

        case 4: // '\004'
            return true;
        }
    }

    protected void onStop()
    {
        super.onStop();
        UninstallService.b(this);
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
