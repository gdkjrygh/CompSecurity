// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.go.weatherex.wear:
//            f, WearService

public class WearTestActivity extends Activity
    implements android.view.View.OnClickListener
{

    private View a;
    private View b;

    public WearTestActivity()
    {
    }

    public void onClick(View view)
    {
        f.a("--------------------------------------------------------------------------------------");
        if (view.equals(a))
        {
            f.a("WearActivity - click1");
            startService((new Intent(this, com/go/weatherex/wear/WearService)).putExtra("notification_type_key", "/data/weather/today"));
        } else
        if (view.equals(b))
        {
            f.a("WearActivity - click2");
            startService((new Intent(this, com/go/weatherex/wear/WearService)).putExtra("notification_type_key", "/data/weather/tomorrow"));
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03011e);
        a = findViewById(0x7f09055a);
        b = findViewById(0x7f09055b);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }
}
