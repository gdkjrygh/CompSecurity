// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.p2pimport;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.a;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.p2pimport:
//            b

public class P2PImportDetailActivity extends BaseActionBarActivity
{

    public P2PImportDetailActivity()
    {
    }

    protected void a()
    {
        super.a();
        int i = 0x7f040019;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0x7f04001a;
        }
        android.view.View view = getLayoutInflater().inflate(i, null);
        a.a(view);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040022);
        bundle = getSupportFragmentManager();
        if (bundle.findFragmentById(0x7f0f006e) == null)
        {
            b b1 = new b();
            bundle.beginTransaction().add(0x7f0f006e, b1).commit();
        }
    }

    protected void onResume()
    {
        super.onResume();
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061));
    }
}
