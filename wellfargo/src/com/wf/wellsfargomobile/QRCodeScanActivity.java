// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.c;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseActionBarActivity, aq, al, ao, 
//            an, am, ak

public class QRCodeScanActivity extends BaseActionBarActivity
    implements android.view.View.OnClickListener, aq, c
{

    private boolean b;
    private int c;
    private String d;
    private an e;
    private boolean f;
    private boolean g;
    private FrameLayout h;
    private FrameLayout i;
    private ImageView j;
    private ImageView k;
    private Button l;
    private TextView m;
    private View n;
    private com.wf.wellsfargomobile.util.a o;

    public QRCodeScanActivity()
    {
        b = false;
        f = false;
        g = false;
    }

    static com.wf.wellsfargomobile.util.a a(QRCodeScanActivity qrcodescanactivity)
    {
        return qrcodescanactivity.o;
    }

    static boolean a(QRCodeScanActivity qrcodescanactivity, boolean flag)
    {
        qrcodescanactivity.f = flag;
        return flag;
    }

    static boolean b(QRCodeScanActivity qrcodescanactivity)
    {
        return qrcodescanactivity.f;
    }

    private void h()
    {
        StringBuilder stringbuilder = new StringBuilder(com.wf.wellsfargomobile.a.a.a());
        stringbuilder.append("/bev/billpayScanQRCodeBev.action");
        try
        {
            (new al(this, stringbuilder.toString())).start();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void i()
    {
        if (o != null)
        {
            c();
            o.a();
        }
        if (i != null)
        {
            i.removeAllViews();
            h.removeAllViews();
            i = null;
        }
        Intent intent = new Intent();
        intent.putExtra("error", false);
        setResult(31, intent);
        finish();
    }

    public void a(String s)
    {
        c();
        Intent intent = new Intent();
        intent.putExtra("scan_string", s);
        setResult(32, intent);
        finish();
    }

    public void a(String s, String s1)
    {
        if (s1 != null)
        {
            s = new ao();
            Bundle bundle = new Bundle();
            bundle.putInt("SELECT_FRAGMENT", 2);
            bundle.putString("DIALOG_TITLE", s1);
            bundle.putString("DIALOG_MESSAGE", null);
            s.setArguments(bundle);
            s.show(getSupportFragmentManager(), "ErrorMessageDialogFragment");
        }
    }

    public void b()
    {
        if (e != null)
        {
            if (e.isAlive())
            {
                e.a();
            }
            e = null;
        }
        e = new an(this, null);
        e.a(c * 1000);
        e.start();
    }

    public void b(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(com.wf.wellsfargomobile.a.a.a());
        stringbuilder.append("/bev/billpayQRCodeLinkBev.action");
        try
        {
            (new am(this, s, stringbuilder.toString())).start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void c()
    {
        f = true;
    }

    public void d()
    {
        if (o != null)
        {
            b = false;
            o.a(i, this);
            b();
        }
    }

    public void e()
    {
        runOnUiThread(new ak(this));
    }

    public void f()
    {
        Intent intent = new Intent();
        intent.putExtra("error", true);
        setResult(31, intent);
        finish();
    }

    public void g()
    {
        b = true;
        h();
        a(((String) (null)), getResources().getString(0x7f0800d8));
    }

    public void onBackPressed()
    {
        i();
    }

    public void onClick(View view)
    {
        if (view.equals(l))
        {
            i();
        } else
        if (view.equals(j) || view.equals(m))
        {
            b = true;
            c();
            o.a();
            (new ao()).show(getSupportFragmentManager(), "ScanningTipsDialogFragment");
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateUserLocale();
        if (a != null)
        {
            a.b();
        }
        setContentView(0x7f040050);
        if (bundle != null)
        {
            b = bundle.getBoolean("SCANNING_TIPS_ON", false);
        }
        if (getIntent() != null)
        {
            Bundle bundle1 = getIntent().getExtras();
            if (bundle1 != null)
            {
                c = bundle1.getInt("time_out_in_secs", 30);
                d = bundle1.getString("activity_source");
            }
        }
        j = (ImageView)findViewById(0x7f0f0101);
        j.setOnClickListener(this);
        m = (TextView)findViewById(0x7f0f0102);
        m.setOnClickListener(this);
        l = (Button)findViewById(0x7f0f0103);
        l.setOnClickListener(this);
        o = new com.wf.wellsfargomobile.util.a();
        try
        {
            o.a("ttP,,thT0#4FZ&8#8l,@tvtjLfD$xr^TB@[089nl5n[6qb04[(NPIUEAWGUNKl;dfvkhzdf7rglcvjck=,mIOF&^BUL?!!!!!!Z2");
        }
        catch (Exception exception) { }
        h = (FrameLayout)findViewById(0x7f0f0104);
        n = getLayoutInflater().inflate(0x7f040024, h, false);
        i = (FrameLayout)n.findViewById(0x7f0f0074);
        k = (ImageView)n.findViewById(0x7f0f0075);
        k.setBackgroundResource(0x7f02010a);
        h.addView(i);
        if (!b)
        {
            o.a(i, this);
            b();
        }
        if (bundle == null)
        {
            b(d);
        }
    }

    public void onPause()
    {
        super.onPause();
        g = true;
        c();
        o.a();
    }

    public void onResume()
    {
        super.onResume();
        if (g)
        {
            g = false;
            if (!b)
            {
                d();
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("SCANNING_TIPS_ON", b);
        if (e != null && e.isAlive())
        {
            e.a();
        }
    }
}
