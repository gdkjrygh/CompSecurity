// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.messagecenter.view:
//            b, MessageCenterWebView

public class HtmlMsgDetailActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private View a;
    private MessageCenterWebView b;
    private TextView c;
    private b d;
    private Handler e;
    private boolean f;

    public HtmlMsgDetailActivity()
    {
        b = null;
        f = true;
    }

    private void a(Intent intent)
    {
        intent = intent.getExtras();
        if (intent != null)
        {
            d.a = intent.getString("extras_bundle_msg_id");
            d.b = intent.getString("extras_bundle_msg_title");
            d.d = intent.getString("extras_bundle_msg_url");
            d.c = intent.getString("extras_bundle_msg_pubished_time");
            intent = intent.getString("weather_alerts_lists_entrance");
            if (intent != null && intent.equals("widget&notification"))
            {
                f = false;
            }
        }
        if (TextUtils.isEmpty(d.a) || TextUtils.isEmpty(d.d) || TextUtils.isEmpty(d.c) || TextUtils.isEmpty(d.b))
        {
            finish();
            return;
        }
        if (f)
        {
            b.a(this, d.a, 1);
        } else
        {
            b.a(this, d.a, 2);
        }
        b.a(d.b, d.c);
        b.a(d.d);
        c.setText(d.b);
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300c8);
        getWindow().clearFlags(0x8000000);
        com.gtp.a.a.b.c.a("MSGCenter", "onCreate");
        d = new b(this, null);
        e = new Handler();
        b = (MessageCenterWebView)findViewById(0x7f090426);
        c = (TextView)findViewById(0x7f090061);
        a = findViewById(0x7f090060);
        a.setOnClickListener(this);
        a(getIntent());
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (b != null)
        {
            b.a();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (b != null && b.onKeyDown(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        com.gtp.a.a.b.c.a("MSGCenter", "onNewIntent");
        a(intent);
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStop()
    {
        super.onStop();
        if (!f)
        {
            finish();
        }
    }
}
