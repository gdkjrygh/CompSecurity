// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import chp;
import czi;
import drc;
import fqp;
import gdq;
import gfe;
import gfn;
import gfp;
import n;

public class TraySafetyNetLayout extends FrameLayout
{

    public chp a;
    public drc b;
    public gfn c;
    private int d;

    public TraySafetyNetLayout(Context context)
    {
        super(context);
    }

    public TraySafetyNetLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TraySafetyNetLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static int a(TraySafetyNetLayout traysafetynetlayout)
    {
        return traysafetynetlayout.d;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        ((fqp)((czi)getContext()).d()).a(this);
        d = (int)getResources().getDimension(0x7f080299);
        gfp.a(this, new gfe(this));
        setOnClickListener(new android.view.View.OnClickListener() {

            final TraySafetyNetLayout a;

            public final void onClick(View view)
            {
                a.c.f();
                a.a.a(n.ez);
            }

            
            {
                a = TraySafetyNetLayout.this;
                super();
            }
        });
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TraySafetyNetLayout$2

/* anonymous class */
    public final class _cls2
    {

        public static final int a[];

        static 
        {
            a = new int[gdq.values().length];
            try
            {
                a[gdq.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[gdq.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[gdq.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
