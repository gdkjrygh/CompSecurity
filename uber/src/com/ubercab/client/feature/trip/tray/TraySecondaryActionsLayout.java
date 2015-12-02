// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import czi;
import fqp;
import gdq;
import gfg;
import gfn;
import gfp;
import gmg;

public class TraySecondaryActionsLayout extends LinearLayout
{

    public gmg a;
    public gfn b;
    private Interpolator c;
    public TextView mActionCancel;
    public TextView mActionContact;

    public TraySecondaryActionsLayout(Context context)
    {
        super(context);
        c = new AccelerateDecelerateInterpolator();
    }

    public TraySecondaryActionsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new AccelerateDecelerateInterpolator();
    }

    public TraySecondaryActionsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new AccelerateDecelerateInterpolator();
    }

    public static Interpolator a(TraySecondaryActionsLayout traysecondaryactionslayout)
    {
        return traysecondaryactionslayout.c;
    }

    protected void onCancel()
    {
        b.c();
    }

    protected void onContact()
    {
        b.g();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ((fqp)((czi)getContext()).d()).a(this);
            ButterKnife.inject(this);
            gfp.a(this, new gfg(this, (byte)0));
            return;
        }
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TraySecondaryActionsLayout$1

/* anonymous class */
    public final class _cls1
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
