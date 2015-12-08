// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.go.weatherex.framework.a.a;
import com.go.weatherex.framework.a.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            d, c, e, b

public abstract class GoWeatherExFragmentActivity extends FragmentActivity
    implements d, a
{

    private final a a = com.go.weatherex.framework.a.b.a();
    private final BroadcastReceiver b = new c(this);

    public GoWeatherExFragmentActivity()
    {
    }

    public Typeface a(Context context, int i, int j)
    {
        return a.a(context, i, j);
    }

    public void a(View view, int i, int j)
    {
        a.a(view, i, j);
    }

    public void a(View view, int i, boolean flag)
    {
        a.a(view, i, flag);
    }

    public com.gau.go.launcherex.gowidget.language.b b_()
    {
        return com.gau.go.launcherex.gowidget.language.e.a(getApplicationContext()).a();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x7f04001e, 0x7f04000d);
    }

    public Resources getResources()
    {
        return b_();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        registerReceiver(b, bundle);
    }

    protected void onDestroy()
    {
        unregisterReceiver(b);
        super.onDestroy();
    }

    public void onLanguageChanged(Resources resources)
    {
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0x7f04000b, 0x7f04001e);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        super.startActivityForResult(intent, i);
        overridePendingTransition(0x7f04000b, 0x7f04001e);
    }
}
