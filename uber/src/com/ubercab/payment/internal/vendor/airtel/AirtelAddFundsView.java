// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import chp;
import cic;
import gmg;
import gss;
import guq;
import gwc;
import gwd;
import gxa;
import gxb;

public abstract class AirtelAddFundsView extends ScrollView
{

    public chp a;
    public gmg b;
    private gxa c;
    private gxb d;

    public AirtelAddFundsView(Context context)
    {
        super(context);
    }

    public AirtelAddFundsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AirtelAddFundsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(gxa gxa1)
    {
        c = gxa1;
    }

    public final void a(gxb gxb1)
    {
        d = gxb1;
    }

    protected void b()
    {
        if (c != null)
        {
            c.d();
        }
    }

    protected void b(double d1)
    {
        if (d != null)
        {
            d.a(d1);
        }
    }

    protected abstract cic c();

    public final void d()
    {
        a.a(c());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        gwc.a().a(gss.a((Application)getContext().getApplicationContext())).a().a(this);
    }
}
