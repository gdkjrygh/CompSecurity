// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;

public class GCMMsgDetailActivity extends GoWeatherEXActivity
{

    TextView a;
    TextView b;
    TextView c;
    private boolean d;

    public GCMMsgDetailActivity()
    {
        d = true;
        a = null;
        b = null;
        c = null;
    }

    private void a(Intent intent)
    {
        String s2 = "";
        String s1 = "";
        String s = "";
        String s3 = "";
        Object obj = intent.getExtras();
        intent = s3;
        if (obj != null)
        {
            String s4 = ((Bundle) (obj)).getString("extras_bundle_msg_id");
            String s5 = ((Bundle) (obj)).getString("extras_bundle_msg_title");
            String s6 = ((Bundle) (obj)).getString("extras_bundle_msg_summary");
            String s7 = ((Bundle) (obj)).getString("extras_bundle_msg_time");
            obj = ((Bundle) (obj)).getString("weather_alerts_lists_entrance");
            intent = s7;
            s = s6;
            s1 = s5;
            s2 = s4;
            if (obj != null)
            {
                intent = s7;
                s = s6;
                s1 = s5;
                s2 = s4;
                if (((String) (obj)).equals("widget&notification"))
                {
                    d = false;
                    s2 = s4;
                    s1 = s5;
                    s = s6;
                    intent = s7;
                }
            }
        }
        if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || TextUtils.isEmpty(intent))
        {
            finish();
            return;
        } else
        {
            a.setText(s1);
            c.setText(intent);
            b.setText(Html.fromHtml(s));
            b.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300cb);
        getWindow().clearFlags(0x8000000);
        a = (TextView)findViewById(0x7f09042d);
        b = (TextView)findViewById(0x7f09042e);
        c = (TextView)findViewById(0x7f09042f);
        a(getIntent());
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }

    protected void onStop()
    {
        super.onStop();
        if (!d)
        {
            finish();
        }
    }
}
