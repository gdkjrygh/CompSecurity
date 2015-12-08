// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.jiubang.commerce.ad.j.g;
import com.jiubang.commerce.ad.j.m;
import com.jiubang.commerce.utils.j;

public class AdService extends Service
{

    private g a;

    public AdService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        j.a("Ad_SDK", "Ad Service onCreate");
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int k)
    {
        Bundle bundle;
        j.a("Ad_SDK", "Ad Service onStartCommand");
        if (intent == null)
        {
            return super.onStartCommand(intent, i, k);
        }
        bundle = intent.getExtras();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle.getInt("AD_SERVICES_REQUEST", -1);
        JVM INSTR tableswitch 16 17: default 60
    //                   16 68
    //                   17 93;
           goto _L2 _L3 _L4
_L2:
        return super.onStartCommand(intent, i, k);
_L3:
        m.a(this).a();
        a = g.a();
        a.f(this);
        continue; /* Loop/switch isn't completed */
_L4:
        if (a != null)
        {
            m.a(this).b();
            a.d();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
