// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.os.AsyncTask;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.wf.wellsfargomobile.d.f;
import com.wf.wellsfargomobile.hcewallet.d.h;
import java.net.CookieHandler;
import java.net.CookiePolicy;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp

class ax extends AsyncTask
{

    final WFApp a;

    ax(WFApp wfapp)
    {
        a = wfapp;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        CookieSyncManager.createInstance(a);
        WFApp.a(CookieSyncManager.getInstance());
        WFApp.ai().sync();
        WFApp.a(CookieManager.getInstance());
        CookieHandler.setDefault(new f(null, CookiePolicy.ACCEPT_ORIGINAL_SERVER));
        if (WFApp.ah())
        {
            a.registerActivityLifecycleCallbacks(new h());
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
