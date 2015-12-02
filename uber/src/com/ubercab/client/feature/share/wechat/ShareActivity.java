// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share.wechat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import cxj;
import cxk;
import czj;
import dfe;
import dfp;
import fii;
import fij;
import fik;
import java.util.Iterator;
import java.util.List;
import n;

public class ShareActivity extends RiderActivity
{

    public chp h;

    public ShareActivity()
    {
    }

    private static Intent a(Context context)
    {
        Intent intent = new Intent(context, com/ubercab/client/feature/share/wechat/ShareActivity);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        intent.setAction("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", builder.scheme("android.resource").authority(context.getPackageName()).appendPath("2130837887").build());
        return intent;
    }

    private static LabeledIntent a(Context context, Intent intent, ResolveInfo resolveinfo)
    {
        ActivityInfo activityinfo = resolveinfo.activityInfo;
        if (activityinfo != null)
        {
            return new LabeledIntent(intent, activityinfo.packageName, resolveinfo.loadLabel(context.getPackageManager()), resolveinfo.getIconResource());
        } else
        {
            return null;
        }
    }

    public static LabeledIntent a(Context context, String s1, cxk cxk1)
    {
        ResolveInfo resolveinfo;
        if (!TextUtils.isEmpty(s1) && cxk1 != null)
        {
            if ((resolveinfo = a(context, cxk1.b())) != null)
            {
                Intent intent = a(context);
                intent.putExtra("com.ubercab.EXTRA_WECHAT_SHARE", true);
                intent.putExtra("com.ubercab.EXTRA_SHARE_BODY", s1);
                intent.putExtra("com.ubercab.EXTRA_WECHAT_SCENE", cxk1);
                return a(context, intent, resolveinfo);
            }
        }
        return null;
    }

    private static ResolveInfo a(Context context, String s1)
    {
        ComponentName componentname = new ComponentName("com.tencent.mm", s1);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setComponent(componentname);
        for (context = context.getPackageManager().queryIntentActivities(intent, 0).iterator(); context.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)context.next();
            if (resolveinfo.activityInfo.name.equalsIgnoreCase(s1))
            {
                return resolveinfo;
            }
        }

        return null;
    }

    private void a(fik fik1)
    {
        fik1.a(this);
    }

    private fik b(dfp dfp)
    {
        return fii.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fik)czj);
    }

    protected final void b(Bundle bundle)
    {
        Object obj;
        super.b(bundle);
        obj = getIntent();
        if (obj == null || !((Intent) (obj)).getBooleanExtra("com.ubercab.EXTRA_WECHAT_SHARE", false)) goto _L2; else goto _L1
_L1:
        bundle = ((Intent) (obj)).getStringExtra("com.ubercab.EXTRA_SHARE_BODY");
        obj = (cxk)((Intent) (obj)).getSerializableExtra("com.ubercab.EXTRA_WECHAT_SCENE");
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[cxk.values().length];
                try
                {
                    a[cxk.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1.a[((cxk) (obj)).ordinal()];
        JVM INSTR tableswitch 1 1: default 68
    //                   1 73;
           goto _L2 _L3
_L2:
        finish();
        return;
_L3:
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fr).setValue("wechat_moments");
        h.a(analyticsevent);
        (new cxj(this, getString(0x7f0706c3))).a(bundle, cxk.b);
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
