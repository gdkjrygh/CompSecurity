// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.managegood.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.go.weatherex.managegood.a.b;
import com.go.weatherex.managegood.a.c;
import com.go.weatherex.managegood.b.a;
import com.jiubang.playsdk.main.f;

// Referenced classes of package com.go.weatherex.managegood.view:
//            a

public class ManageGoodPaymentActivity extends Activity
    implements b, com.gtp.go.weather.billing.a.b
{

    private a a;
    private com.go.weatherex.managegood.a.a b;
    private View c;
    private boolean d;
    private com.gtp.go.weather.billing.a.a e;
    private TextView f;

    public ManageGoodPaymentActivity()
    {
        a = null;
        b = null;
        d = false;
    }

    private void a()
    {
        if (d)
        {
            return;
        } else
        {
            String s = g.a(a.a());
            b.a(a.a(), s, a.c());
            return;
        }
    }

    private void b()
    {
        if (a.b() == 1)
        {
            f f1 = com.go.weatherex.managegood.a.c.a().b();
            if (f1 != null)
            {
                f1.a();
            }
        }
        c.setVisibility(4);
        if (!d)
        {
            y y1 = new y(this);
            y1.setCancelable(false);
            y1.c(0x7f08032b);
            y1.b(0x7f08032a);
            y1.a(new com.go.weatherex.managegood.view.a(this));
            y1.a();
        }
    }

    private void c()
    {
        c.setVisibility(4);
        if (a.b() == 1)
        {
            f f1 = com.go.weatherex.managegood.a.c.a().b();
            if (f1 != null)
            {
                f1.b();
            }
        }
        finish();
    }

    public void a(String s, String s1, String s2, int i)
    {
        c();
    }

    public void a(String s, boolean flag)
    {
        f.setVisibility(8);
        if (flag)
        {
            b();
            return;
        } else
        {
            a();
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (b != null)
        {
            b.a(this, i, j, intent);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = false;
        setContentView(0x7f0300c5);
        c = findViewById(0x7f090423);
        f = (TextView)findViewById(0x7f090424);
        Intent intent = getIntent();
        if (intent != null)
        {
            a = (a)intent.getSerializableExtra("extra_manage_good_payment_info");
        }
        if (a == null)
        {
            finish();
            return;
        } else
        {
            e = new com.gtp.go.weather.billing.a.a();
            e.a(this);
            e.a(this, bundle);
            b = new com.go.weatherex.managegood.a.a();
            b.a(this);
            b.a(this, bundle);
            f.setVisibility(0);
            f.setText(getString(0x7f08033d));
            e.a(a.a(), intent);
            e.a();
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        d = true;
        if (b != null)
        {
            b.d(this);
            b = null;
        }
        if (e != null)
        {
            e.d(this);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (b != null)
        {
            b.c(this);
        }
        if (e != null)
        {
            e.c(this);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (b != null)
        {
            b.b(this);
        }
        if (e != null)
        {
            e.b(this);
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (b != null)
        {
            b.a(this);
        }
        if (e != null)
        {
            e.a(this);
        }
    }
}
