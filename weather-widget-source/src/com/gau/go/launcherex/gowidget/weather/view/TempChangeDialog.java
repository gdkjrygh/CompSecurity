// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ar

public class TempChangeDialog extends GoWeatherEXActivity
{

    public TempChangeDialog()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030065);
        getWindow().clearFlags(0x8000000);
        bundle = (String)getIntent().getCharSequenceExtra("extra_temp_change_dialog_extra");
        if (bundle == null)
        {
            finish();
            return;
        } else
        {
            ((TextView)findViewById(0x7f090061)).setText(0x7f0803fb);
            ((TextView)findViewById(0x7f090265)).setText(bundle);
            bundle = (TextView)findViewById(0x7f090087);
            bundle.setVisibility(0);
            bundle.setText(0x7f080414);
            bundle.setOnClickListener(new ar(this));
            return;
        }
    }
}
