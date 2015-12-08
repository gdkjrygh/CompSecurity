// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import java.util.Locale;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, MainActivity, ModalDialogWebViewActivity, ModalDialogLargeWebViewActivity

public abstract class BaseActionBarActivity extends ActionBarActivity
{

    protected a a;

    public BaseActionBarActivity()
    {
    }

    private void a(Intent intent)
    {
        Object obj = getIntent();
        String s = ((Intent) (obj)).getStringExtra("PNSTOKEN");
        obj = ((Intent) (obj)).getStringExtra("PNSDEST");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Log.d("BaseActionBarActivity", (new StringBuilder()).append("deepLinkDestination=").append(((String) (obj))).toString());
            intent.putExtra("PNSDEST", ((String) (obj)));
            if (!TextUtils.isEmpty(s))
            {
                Log.d("BaseActionBarActivity", (new StringBuilder()).append("accountHash=").append(s).toString());
                intent.putExtra("PNSTOKEN", s);
            }
        }
    }

    private void a(Configuration configuration)
    {
        Configuration configuration1 = configuration;
        if (configuration == null)
        {
            configuration1 = new Configuration();
        }
        configuration = WFApp.ad();
        if (configuration != null && !configuration.equalsIgnoreCase("null"))
        {
            configuration = new Locale(configuration);
            Locale.setDefault(configuration);
        } else
        {
            configuration = WFApp.ab();
        }
        configuration1.locale = configuration;
        getApplicationContext().getResources().updateConfiguration(configuration1, getApplicationContext().getResources().getDisplayMetrics());
        getResources().updateConfiguration(configuration1, getResources().getDisplayMetrics());
    }

    protected void a()
    {
        a = getSupportActionBar();
        if (a != null)
        {
            a.d(false);
            a.a(false);
            a.b(false);
            a.c(false);
            a.e(true);
        }
    }

    public void localeChanged()
    {
        updateUserLocale();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        j;
        JVM INSTR tableswitch 13 13: default 28
    //                   13 33;
           goto _L1 _L2
_L1:
        com.wf.wellsfargomobile.WFApp.a(0L);
        return;
_L2:
        if (!(this instanceof MainActivity))
        {
            setResult(13, new Intent());
            finish();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!WFApp.ae() && android.os.Build.VERSION.SDK_INT >= 11)
        {
            getWindow().setFlags(8192, 8192);
        }
        if (!(this instanceof ModalDialogWebViewActivity) && !(this instanceof ModalDialogLargeWebViewActivity))
        {
            a();
        }
    }

    protected void onRestart()
    {
label0:
        {
            super.onRestart();
            long l = System.currentTimeMillis();
            long l1 = WFApp.y();
            if (WFApp.y() != 0L && l - l1 > 0x927c0L)
            {
                if (this instanceof MainActivity)
                {
                    break label0;
                }
                WFApp.i();
                setResult(13, new Intent());
                finish();
            }
            return;
        }
        com.wf.wellsfargomobile.WFApp.a(0L);
    }

    protected void onStart()
    {
        super.onStart();
        com.wf.wellsfargomobile.WFApp.a(0L);
    }

    protected void onStop()
    {
        super.onStop();
        com.wf.wellsfargomobile.WFApp.a(System.currentTimeMillis());
    }

    public void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
    }

    public void updateUserLocale()
    {
        a(new Configuration());
    }
}
