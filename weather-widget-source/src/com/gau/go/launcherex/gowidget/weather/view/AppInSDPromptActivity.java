// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;

public class AppInSDPromptActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private TextView a;
    private Button b;
    private Button c;

    public AppInSDPromptActivity()
    {
    }

    private void a(String s)
    {
        Intent intent = new Intent();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 9)
        {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", s, null));
        } else
        {
            String s1;
            if (i == 8)
            {
                s1 = "pkg";
            } else
            {
                s1 = "com.android.settings.ApplicationPkgName";
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra(s1, s);
        }
        try
        {
            startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            a(getPackageName());
            finish();
        } else
        if (view.equals(b))
        {
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        getWindow().setLayout(-1, -1);
        getWindow().clearFlags(0x8000000);
        bundle = getIntent();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle.getIntExtra("app_in_sd_prompt_tips_type", 1);
        JVM INSTR tableswitch 1 2: default 68
    //                   1 135
    //                   2 141;
           goto _L2 _L3 _L4
_L2:
        int i = 0x7f0801ee;
_L6:
        a = (TextView)findViewById(0x7f090117);
        a.setText(i);
        b = (Button)findViewById(0x7f090118);
        b.setOnClickListener(this);
        c = (Button)findViewById(0x7f090119);
        c.setOnClickListener(this);
        return;
_L3:
        i = 0x7f0801ee;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f08021c;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
