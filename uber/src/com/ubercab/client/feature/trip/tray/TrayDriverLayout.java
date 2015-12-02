// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cgh;
import chp;
import com.ubercab.ui.TextView;
import czi;
import dzw;
import fqp;
import gdq;
import ger;
import ges;
import gfk;
import gfp;
import gju;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.ubercab.client.feature.trip.tray:
//            TripTrayView

public class TrayDriverLayout extends FrameLayout
{

    private static final long e;
    public chp a;
    public gju b;
    public cgh c;
    public dzw d;
    private final List f;
    private final View g[][] = {
        new View[2], new View[2]
    };
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private int m;
    public TextView mDriverBoxText;
    public ViewGroup mDriverBoxTextGroup;
    public ViewGroup mDriverImageContainer;
    public ImageView mDriverImageView;
    public ViewGroup mDriverSection;
    public TextView mDriverSubtext;
    public TextView mDriverText;
    public ViewGroup mDriverTextContainer;
    public ImageView mVehicleBoxIcon;
    public TextView mVehicleBoxText;
    public ViewGroup mVehicleBoxTextGroup;
    public ViewGroup mVehicleImageContainer;
    public ImageView mVehicleImageView;
    public ViewGroup mVehicleSection;
    public ViewGroup mVehicleTextContainer;
    public TextView mVehicleTextMake;
    public TextView mVehicleTextModel;
    private boolean n;
    private int o;
    private int p;
    private ges q;
    private int r;
    private int s;
    private int t;
    private int u;

    public TrayDriverLayout(Context context)
    {
        super(context);
        f = new ArrayList();
    }

    public TrayDriverLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new ArrayList();
    }

    public TrayDriverLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = new ArrayList();
    }

    private int a(int i1)
    {
        return (int)TypedValue.applyDimension(1, i1, getResources().getDisplayMetrics());
    }

    public static int a(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.i;
    }

    public static long a()
    {
        return e;
    }

    public static void a(View view)
    {
        b(view);
    }

    private static void a(ViewParent viewparent)
    {
        if (viewparent instanceof ViewGroup)
        {
            ((ViewGroup)viewparent).setClipToPadding(false);
            ((ViewGroup)viewparent).setClipChildren(false);
            if (!(viewparent instanceof TripTrayView))
            {
                a(viewparent.getParent());
                return;
            }
        }
    }

    public static boolean a(TrayDriverLayout traydriverlayout, boolean flag)
    {
        traydriverlayout.n = flag;
        return flag;
    }

    public static int b(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.h;
    }

    private static void b(View view)
    {
        ((View)view.getParent().getParent()).bringToFront();
    }

    private View[][] b()
    {
        Object obj;
        View aview[];
        boolean flag;
        if (ges.a(q).a() == ges.b(q).a())
        {
            flag = n;
        } else
        {
            flag = ges.a(q).a();
        }
        aview = g[0];
        if (flag)
        {
            obj = mVehicleImageView;
        } else
        {
            obj = mDriverImageView;
        }
        aview[0] = ((View) (obj));
        aview = g[1];
        if (!flag)
        {
            obj = mVehicleImageView;
        } else
        {
            obj = mDriverImageView;
        }
        aview[0] = ((View) (obj));
        aview = g[0];
        if (n)
        {
            obj = mVehicleBoxTextGroup;
        } else
        {
            obj = mDriverBoxTextGroup;
        }
        aview[1] = ((View) (obj));
        aview = g[1];
        if (!n)
        {
            obj = mVehicleBoxTextGroup;
        } else
        {
            obj = mDriverBoxTextGroup;
        }
        aview[1] = ((View) (obj));
        return g;
    }

    public static boolean c(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.n;
    }

    public static int d(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.p;
    }

    public static int e(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.o;
    }

    public static List f(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.f;
    }

    public static ges g(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.q;
    }

    public static int h(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.m;
    }

    public static int i(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.t;
    }

    public static int j(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.r;
    }

    public static int k(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.k;
    }

    public static int l(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.j;
    }

    public static int m(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.s;
    }

    public static int n(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.u;
    }

    public static float o(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.l;
    }

    public static View[][] p(TrayDriverLayout traydriverlayout)
    {
        return traydriverlayout.b();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            a(mDriverText.getParent());
            a(mVehicleTextModel.getParent());
            a(mDriverImageView.getParent());
            a(mVehicleImageView.getParent());
            a(mVehicleBoxIcon.getParent());
            return;
        }
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
            Resources resources = getResources();
            i = resources.getDimensionPixelSize(0x7f0802a3);
            m = resources.getDimensionPixelSize(0x7f0802a0);
            j = resources.getDimensionPixelSize(0x7f0802a4);
            k = resources.getDimensionPixelSize(0x7f0802a5);
            o = resources.getDimensionPixelSize(0x7f080299);
            r = resources.getColor(0x7f0d0073);
            s = resources.getColor(0x7f0d0070);
            t = a(12);
            u = a(10);
            l = a(5);
            p = resources.getDimensionPixelSize(0x7f08029f);
            h = resources.getDimensionPixelSize(0x7f080296);
            q = new ges(this, (byte)0);
            gfp.a(this, q);
            return;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        while (isInEditMode() || !flag || q.e.b() == gdq.c) 
        {
            return;
        }
        q.i();
    }

    static 
    {
        e = TimeUnit.SECONDS.toMillis(3L);
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TrayDriverLayout$1

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
