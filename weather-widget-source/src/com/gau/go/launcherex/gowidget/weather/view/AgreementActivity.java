// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class AgreementActivity extends Activity
    implements android.view.View.OnClickListener
{

    private TextView a;

    public AgreementActivity()
    {
    }

    public void onClick(View view)
    {
        if (view == a)
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300db);
        getWindow().clearFlags(0x8000000);
        a = (TextView)findViewById(0x7f090481);
        a.setOnClickListener(this);
    }
}
