// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import com.go.weatherex.framework.a.a;
import com.go.weatherex.framework.a.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            d, a, e, b

public abstract class GoWeatherEXActivity extends Activity
    implements d, a
{

    private final a a = com.go.weatherex.framework.a.b.a();
    private BroadcastReceiver b;

    public GoWeatherEXActivity()
    {
        b = new com.gau.go.launcherex.gowidget.language.a(this);
    }

    public Typeface a(Context context, int i, int j)
    {
        return a.a(context, i, j);
    }

    public void a(Intent intent, int i, int j)
    {
        super.startActivity(intent);
        overridePendingTransition(i, j);
    }

    public void a(View view, int i, int j)
    {
        a.a(view, i, j);
    }

    public void a(View view, int i, boolean flag)
    {
        a.a(view, i, flag);
    }

    public void b(int i, int j)
    {
        super.finish();
        overridePendingTransition(i, j);
    }

    protected void c()
    {
    }

    public void c(int i)
    {
        super.finish();
        overridePendingTransition(0x7f04001e, i);
    }

    protected void d()
    {
    }

    public com.gau.go.launcherex.gowidget.language.b e()
    {
        return com.gau.go.launcherex.gowidget.language.e.a(this).a();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x7f04001e, 0x7f040009);
    }

    public Resources getResources()
    {
        return e();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        registerReceiver(b, bundle);
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            unregisterReceiver(b);
            b = null;
        }
        super.onDestroy();
    }

    public void onLanguageChanged(Resources resources)
    {
        c();
        d();
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0x7f040008, 0x7f04001e);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        super.startActivityForResult(intent, i);
        overridePendingTransition(0x7f040008, 0x7f04001e);
    }
}
