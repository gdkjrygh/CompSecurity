// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;

// Referenced classes of package com.jiubang.playsdk.adapter:
//            c, d, b

public class PackageBroadcastReceiver extends BroadcastReceiver
{

    private c a;
    private d b;
    private b c;
    private Context d;

    public PackageBroadcastReceiver(Context context)
    {
        d = context;
    }

    public IntentFilter a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.VIEW_RELOAD_ADDED");
        intentfilter.addAction("android.intent.action.VIEW_RELOAD_REMOVED");
        intentfilter.addAction("android.intent.action.VIEW_REFRESH");
        intentfilter.addAction("android.intent.action.VIEW_RELOAD");
        intentfilter.addAction("android.intent.action.VIEW_REMOVE_ADMOB");
        intentfilter.addCategory(d.getPackageName());
        return intentfilter;
    }

    public void a(b b1)
    {
        c = b1;
    }

    public void a(c c1)
    {
        a = c1;
    }

    public void a(d d1)
    {
        b = d1;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        context = intent.getAction();
        if (TextUtils.isEmpty(context)) goto _L2; else goto _L3
_L3:
        if (!"android.intent.action.VIEW_RELOAD".equals(context) && !"android.intent.action.VIEW_RELOAD_REMOVED".equals(context) && !"android.intent.action.VIEW_RELOAD_ADDED".equals(context)) goto _L5; else goto _L4
_L4:
        intent = intent.getDataString();
        if (a != null)
        {
            a.a("android.intent.action.VIEW_RELOAD_REMOVED".equals(context), intent);
        }
_L2:
        return;
_L5:
        if (!"android.intent.action.VIEW_REFRESH".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b == null) goto _L2; else goto _L6
_L6:
        b.k();
        return;
        if (!"android.intent.action.VIEW_REMOVE_ADMOB".equals(context) || c == null) goto _L2; else goto _L7
_L7:
        c.l();
        return;
    }
}
