// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import czi;
import drc;
import drd;
import dre;
import dzk;
import fqp;
import gdq;
import gem;
import gfn;
import gfp;
import gmg;
import java.util.List;

public class TrayActionsLayout extends LinearLayout
{

    public drc a;
    public gmg b;
    public gfn c;
    private int d;
    private int e;
    private gem f;
    public ViewGroup mActionCancel;
    public TextView mActionCancelText;
    ViewGroup mActionFareSplit;
    ViewGroup mActionHelp;
    ViewGroup mActionShareEta;
    ViewGroup mActionShareTrip;
    TextView mFareSplitIndicatorText;

    public TrayActionsLayout(Context context)
    {
        super(context);
    }

    public TrayActionsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrayActionsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static int a(TrayActionsLayout trayactionslayout)
    {
        return trayactionslayout.e;
    }

    private static int a(ClientStatus clientstatus, FareSplit faresplit)
    {
        if (drd.a(clientstatus) || !a(faresplit))
        {
            return 0;
        } else
        {
            return faresplit.getClients().size();
        }
    }

    private static void a(ViewGroup viewgroup, boolean flag)
    {
        viewgroup.setEnabled(flag);
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.5F;
        }
        viewgroup.setAlpha(f1);
    }

    private static boolean a(FareSplit faresplit)
    {
        return faresplit != null && faresplit.getClients() != null && !faresplit.getClients().isEmpty();
    }

    private static void b(ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
    }

    public final void a(ClientStatus clientstatus, Eyeball eyeball, Trip trip)
    {
        boolean flag1 = true;
        eyeball = dre.a(clientstatus, eyeball, trip);
        boolean flag2 = dre.a(eyeball);
        a(mActionCancel, flag2);
        boolean flag = a.g();
        b(mActionShareTrip, flag);
        ViewGroup viewgroup = mActionShareEta;
        int i;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(viewgroup, flag);
        if (trip != null && trip.getCanShareETA())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        viewgroup = mActionShareEta;
        if (flag2 && i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(viewgroup, flag);
        if (trip != null && trip.getCanSplitFare())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(mActionFareSplit, flag);
        i = a(clientstatus, ((FareSplit) (eyeball)));
        if (flag && i > 1)
        {
            mFareSplitIndicatorText.setText(String.valueOf(i));
            i = 1;
        } else
        {
            i = 0;
        }
        clientstatus = mFareSplitIndicatorText;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        clientstatus.setVisibility(i);
        flag = dzk.a(b);
        b(mActionHelp, flag);
        clientstatus = mActionCancel;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b(clientstatus, flag);
    }

    protected void onCancel()
    {
        c.c();
    }

    protected void onFareSplit()
    {
        c.a();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            d = getContext().getResources().getDimensionPixelSize(0x7f080298);
            e = d;
            ((fqp)((czi)getContext()).d()).a(this);
            ButterKnife.inject(this);
            f = new gem(this, (byte)0);
            gfp.a(this, f);
            mActionCancelText.setMaxLines(2);
            return;
        }
    }

    protected void onHelp()
    {
        c.d();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            gem.a(f);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getMeasuredHeight();
        if (i != 0 && e != i)
        {
            e = i;
            if (e > d)
            {
                setMinimumHeight(e);
                d = e;
            }
            if (f != null)
            {
                f.k().a(false);
            }
        }
    }

    protected void onShareEta()
    {
        c.e();
    }

    protected void onShareTrip()
    {
        c.f();
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TrayActionsLayout$1

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
