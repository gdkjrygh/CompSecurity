// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            MessageCenterWebView, d

public class HtmlMsgDialogActivity extends GoWeatherEXActivity
{

    private TextView a;
    private Notification b;
    private NotificationManager c;
    private int d;
    private MessageCenterWebView e;
    private d f;
    private Handler g;

    public HtmlMsgDialogActivity()
    {
        d = 1;
        e = null;
    }

    private void a()
    {
        e = (MessageCenterWebView)findViewById(0x7f090426);
        e.a(this, f.a, 4);
        a = (TextView)findViewById(0x7f090428);
    }

    private void b()
    {
        b = new Notification();
        c = (NotificationManager)getSystemService("notification");
        boolean flag;
        if (com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).f().a().z == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.defaults = 7;
        } else
        {
            b.defaults = 6;
        }
        c.notify(d, b);
    }

    private void f()
    {
        e.a(f.b, f.c);
        e.a(f.d);
        a.setText(0x7f080309);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        super.dispatchKeyEvent(keyevent);
        if (c != null)
        {
            c.cancel(d);
            c = null;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        super.dispatchTouchEvent(motionevent);
        if (c != null)
        {
            c.cancel(d);
            c = null;
        }
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f0300c9);
        getWindow().clearFlags(0x8000000);
        g = new Handler();
        f = new d(this, null);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            f.a = bundle.getString("extras_bundle_msg_id");
            f.b = bundle.getString("extras_bundle_msg_title");
            f.d = bundle.getString("extras_bundle_msg_url");
            f.c = bundle.getString("extras_bundle_msg_pubished_time");
        }
        com.gtp.a.a.b.c.a("MSGCenter", f.a);
        com.gtp.a.a.b.c.a("MSGCenter", f.b);
        com.gtp.a.a.b.c.a("MSGCenter", f.d);
        com.gtp.a.a.b.c.a("MSGCenter", f.c);
        if (TextUtils.isEmpty(f.a) || TextUtils.isEmpty(f.d) || TextUtils.isEmpty(f.c) || TextUtils.isEmpty(f.b))
        {
            finish();
            return;
        } else
        {
            a();
            f();
            b();
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            c.cancel(d);
            c = null;
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        intent = getIntent().getExtras();
        if (intent != null)
        {
            f.a = intent.getString("extras_bundle_msg_id");
            f.b = intent.getString("extras_bundle_msg_title");
            f.d = intent.getString("extras_bundle_msg_url");
            f.c = intent.getString("extras_bundle_msg_pubished_time");
        }
        if (!TextUtils.isEmpty(f.a) && !TextUtils.isEmpty(f.d))
        {
            f();
        }
    }
}
