// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

public class NewVersionAvailableActivity extends Activity
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;
    private Intent c;

    public NewVersionAvailableActivity()
    {
    }

    private void a()
    {
        if (c != null)
        {
            startActivity(c);
        }
        finish();
    }

    public void onBackPressed()
    {
        a();
    }

    public void onClick(View view)
    {
        if (view == a)
        {
            if (c != null)
            {
                view = "suggest";
            } else
            {
                view = "force";
            }
            m.a(this, "app", "prompt", view, PackageUtil.f(this));
            finish();
        } else
        if (view == b)
        {
            a();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(l.ar);
        setTitle(null);
        c = (Intent)getIntent().getParcelableExtra("forward_intent");
        a = (TextView)findViewById(j.bR);
        a.setOnClickListener(this);
        b = (TextView)findViewById(j.ca);
        if (c == null)
        {
            b.setVisibility(8);
            a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 0.0F));
            return;
        } else
        {
            b.setOnClickListener(this);
            return;
        }
    }
}
