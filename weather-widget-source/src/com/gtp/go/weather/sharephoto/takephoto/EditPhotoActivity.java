// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.c.l;
import com.jiubang.core.b.a;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameterBuidler;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;
import java.io.File;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ag, i, b, m, 
//            PreviewLayout, PhotoPreview, ab, PublishPhotoActivity, 
//            d, c, ad, s, 
//            WatermarkPreview, q

public class EditPhotoActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, ag, i
{

    private View a;
    private View b;
    private View c;
    private View d;
    private PhotoPreview e;
    private WatermarkPreview f;
    private PreviewLayout g;
    private File h;
    private int i;
    private String j;
    private String k;
    private d l;
    private ad m;
    private Bitmap n;
    private volatile int o;
    private volatile int p;
    private volatile int q;
    private com.gtp.go.weather.sharephoto.takephoto.c r;
    private final FilterParameter s = FilterParameterBuidler.createFilterParameter(0);
    private FilterParameter t;
    private FilterService u;
    private boolean v;
    private boolean w;
    private final g x = new com.gtp.go.weather.sharephoto.takephoto.b(this);

    public EditPhotoActivity()
    {
        i = 1;
        o = -1;
        q = 0;
        t = s;
        v = false;
        w = false;
    }

    static int a(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.o;
    }

    public static Intent a(Context context, int i1, String s1, String s2)
    {
        context = new Intent(context, com/gtp/go/weather/sharephoto/takephoto/EditPhotoActivity);
        context.putExtra("intent_key_way_to_get_photo", i1);
        context.putExtra("intent_key_get_photo_app_package_name", s1);
        context.putExtra("intent_key_get_photo_activity_class_name", s2);
        return context;
    }

    static Bitmap a(EditPhotoActivity editphotoactivity, Bitmap bitmap)
    {
        editphotoactivity.n = bitmap;
        return bitmap;
    }

    private void a()
    {
        Intent intent = getIntent();
        i = intent.getIntExtra("intent_key_way_to_get_photo", 1);
        j = intent.getStringExtra("intent_key_get_photo_app_package_name");
        k = intent.getStringExtra("intent_key_get_photo_activity_class_name");
        u = FilterService.getService(getApplicationContext());
        com.gtp.go.weather.sharephoto.takephoto.m.a(getApplicationContext());
        setContentView(0x7f0300fd);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        a = findViewById(0x7f090060);
        b = findViewById(0x7f0904ea);
        c = findViewById(0x7f0904f2);
        d = findViewById(0x7f0904f1);
        g = (PreviewLayout)findViewById(0x7f0904eb);
        e = g.a();
        f = g.b();
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setVisibility(0);
        f();
        com.gtp.go.weather.sharephoto.c.l.a(x);
        h = com.gtp.go.weather.sharephoto.takephoto.ab.a(this);
        if (!h.exists())
        {
            m();
            return;
        } else
        {
            b();
            return;
        }
    }

    private void a(s s1)
    {
        startActivity(com.gtp.go.weather.sharephoto.takephoto.PublishPhotoActivity.a(this, s1));
    }

    static boolean a(EditPhotoActivity editphotoactivity, boolean flag)
    {
        editphotoactivity.w = flag;
        return flag;
    }

    static int b(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.p;
    }

    private void b()
    {
        v = true;
        q = com.gtp.go.weather.sharephoto.takephoto.ab.a(h.getAbsolutePath());
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("mPhotoAngle: ").append(q).toString());
        l.a(g());
        l.a();
        e.getViewTreeObserver().addOnGlobalLayoutListener(this);
        e.requestLayout();
        android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(getApplicationContext()).a().edit();
        editor.remove("key_publish_photo_description");
        editor.remove("key_publish_photo_city_id");
        editor.commit();
    }

    private void b(FilterParameter filterparameter)
    {
        if (filterparameter.getTypeId() == s.getTypeId())
        {
            t = s;
        } else
        {
            t = FilterParameterBuidler.createFilterParameter(filterparameter.getTypeId());
        }
        t.mSrcBitmap = n;
        if (r != null)
        {
            r.cancel(true);
        }
        r = new com.gtp.go.weather.sharephoto.takephoto.c(this, null);
        r.execute(new FilterParameter[] {
            t
        });
    }

    static File c(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.h;
    }

    static int d(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.q;
    }

    static FilterService e(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.u;
    }

    static PhotoPreview f(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.e;
    }

    private void f()
    {
        j();
        if (l == null)
        {
            l = new d(this, findViewById(0x7f0904ee), u);
            l.a(this);
            l.a(g());
            l.c(0);
        }
        d.setSelected(true);
        l.b(0);
    }

    private Bitmap g()
    {
        if (v)
        {
            int i1 = (int)(46F * e().getDisplayMetrics().density);
            return com.gtp.go.weather.sharephoto.takephoto.ab.a(com.gtp.go.weather.sharephoto.takephoto.ab.a(i1, i1, h), q);
        } else
        {
            return null;
        }
    }

    static boolean g(EditPhotoActivity editphotoactivity)
    {
        return editphotoactivity.w;
    }

    private void h()
    {
        if (l != null)
        {
            d.setSelected(false);
            l.b(4);
        }
    }

    private void i()
    {
        h();
        if (m == null)
        {
            m = new ad(this, ((ViewStub)findViewById(0x7f0904ef)).inflate());
            m.a(this);
            m.c(1);
        }
        m.b(0);
        c.setSelected(true);
    }

    private void j()
    {
        if (m != null)
        {
            c.setSelected(false);
            m.b(4);
        }
    }

    private void k()
    {
        if (n == null)
        {
            return;
        }
        s s1 = new s();
        s1.a(h.getAbsolutePath());
        s1.d(t.getTypeId());
        s1.a(f.a());
        s1.a(q);
        s1.b(f.getHeight());
        s1.c(f.getWidth());
        WeatherBean weatherbean = com.gtp.go.weather.sharephoto.takephoto.m.b().b();
        if (weatherbean != null)
        {
            s1.b(weatherbean.c());
        }
        a(s1);
    }

    private void l()
    {
        if (g.getWidth() == 0 || g.getHeight() == 0)
        {
            return;
        }
        o = g.getWidth();
        p = g.getHeight();
        if (p > 800 || o > 800)
        {
            int i1 = com.gtp.a.a.c.a.a();
            com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("deviceLevel: ").append(i1).toString());
            float f1 = (float)(4 - i1) * 0.15F + 0.35F;
            o = (int)((float)o * f1);
            p = (int)(f1 * (float)p);
        }
        b(l.b());
        e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    private void m()
    {
        v = false;
        switch (i)
        {
        default:
            throw new IllegalStateException("some thing unexpected happen...");

        case 1: // '\001'
            n();
            return;

        case 2: // '\002'
            o();
            break;
        }
    }

    private void n()
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setType("image/*");
        intent.putExtra("output", Uri.fromFile(h));
        intent.setComponent(new ComponentName(j, k));
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(intent, 101);
        }
    }

    private void o()
    {
        Intent intent = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        intent.setComponent(new ComponentName(j, k));
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(intent, 102);
        }
    }

    public void a(int i1)
    {
        f.a(i1);
    }

    public void a(FilterParameter filterparameter)
    {
        if (v)
        {
            b(filterparameter);
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onActivityResult").append(hashCode()).toString());
        switch (i1)
        {
        default:
            return;

        case 101: // 'e'
            if (j1 == -1 && h.exists())
            {
                b();
                return;
            }
            if (j1 != 0)
            {
                Toast.makeText(this, getString(0x7f080465), 0).show();
            }
            finish();
            return;

        case 102: // 'f'
            break;
        }
        if (j1 == -1)
        {
            intent = intent.getData();
            if (intent != null)
            {
                intent = getContentResolver().query(intent, new String[] {
                    "_data"
                }, null, null, null);
                if (intent != null && intent.moveToFirst())
                {
                    String s1 = intent.getString(intent.getColumnIndex("_data"));
                    if (!TextUtils.isEmpty(s1))
                    {
                        com.jiubang.goweather.e.a.a(new File(s1), h, Boolean.valueOf(true));
                    }
                    if (intent != null)
                    {
                        intent.close();
                    }
                }
            }
        }
        if (h.exists())
        {
            b();
            return;
        }
        if (j1 != 0)
        {
            Toast.makeText(this, getString(0x7f080465), 0).show();
        }
        finish();
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
        if (view.equals(a))
        {
            finish();
        } else
        {
            if (view.equals(b))
            {
                k();
                return;
            }
            if (view.equals(c))
            {
                i();
                return;
            }
            if (view.equals(d))
            {
                f();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onCreate").append(hashCode()).toString());
        a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onDestroy").append(hashCode()).toString());
        FilterService.destroy();
        if (l != null)
        {
            l.c();
        }
        if (m != null)
        {
            m.a();
        }
        com.gtp.go.weather.sharephoto.c.l.b(x);
    }

    public void onGlobalLayout()
    {
        if (o == -1)
        {
            l();
        }
    }

    protected void onPause()
    {
        super.onPause();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onPause").append(hashCode()).toString());
        if (isFinishing())
        {
            com.gtp.go.weather.sharephoto.c.l.b(x);
        }
    }

    protected void onRestart()
    {
        super.onRestart();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onRestart").append(hashCode()).toString());
    }

    protected void onResume()
    {
        super.onResume();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onResume").append(hashCode()).toString());
    }

    protected void onStart()
    {
        super.onStart();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onStart").append(hashCode()).toString());
    }

    protected void onStop()
    {
        super.onStop();
        com.gtp.a.a.b.c.a("EditPhotoActivity", (new StringBuilder()).append("onStop").append(hashCode()).toString());
    }
}
