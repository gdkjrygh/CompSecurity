// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.analytics.app;

import android.app.ListActivity;
import android.os.Bundle;
import chn;
import chp;
import chw;
import gkd;

public class AnalyticsEventListActivity extends ListActivity
{

    private Object a[];

    public AnalyticsEventListActivity()
    {
    }

    public static Object[] a(AnalyticsEventListActivity analyticseventlistactivity)
    {
        return analyticseventlistactivity.a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = chn.a().b().g().toArray();
        setListAdapter(new chw(this, (byte)0));
    }
}
