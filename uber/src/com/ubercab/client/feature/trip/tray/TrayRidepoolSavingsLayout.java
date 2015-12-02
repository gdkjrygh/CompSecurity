// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.ViewFlipper;
import butterknife.ButterKnife;
import chp;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import czi;
import fqp;
import gdq;
import gfc;
import gfp;
import hoq;
import ijg;
import java.util.Map;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.tray:
//            DiscountProgressAnimView

public class TrayRidepoolSavingsLayout extends LinearLayout
{

    public chp a;
    private int b;
    private int c;
    private boolean d;
    private Resources e;
    private String f;
    private android.widget.ViewSwitcher.ViewFactory g;
    public ImageView mNotMatchedIcon;
    public TextSwitcher mTextSwitcher;
    public DiscountProgressAnimView mUberPoolMatchAnimationView;
    public ViewFlipper mViewFlipper;

    public TrayRidepoolSavingsLayout(Context context)
    {
        this(context, null);
    }

    public TrayRidepoolSavingsLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TrayRidepoolSavingsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static Resources a(TrayRidepoolSavingsLayout trayridepoolsavingslayout)
    {
        return trayridepoolsavingslayout.e;
    }

    public static String a(TrayRidepoolSavingsLayout trayridepoolsavingslayout, String s)
    {
        trayridepoolsavingslayout.f = s;
        return s;
    }

    public static String a(Trip trip)
    {
        String s = b(trip);
        if (s == null)
        {
            return null;
        }
        trip = (String)((Map)trip.getExtraStates().get(s)).get("statusString");
        if (TextUtils.isEmpty(trip))
        {
            return null;
        } else
        {
            return trip.toUpperCase();
        }
    }

    private void a()
    {
        g = new android.widget.ViewSwitcher.ViewFactory() {

            final TrayRidepoolSavingsLayout a;

            public final View makeView()
            {
                TextView textview = new TextView(a.getContext());
                textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                textview.setSingleLine();
                textview.setTextSize(2, 12F);
                textview.setTextColor(TrayRidepoolSavingsLayout.a(a).getColor(0x7f0d0073));
                textview.setGravity(17);
                textview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1));
                hoq.a(a.getContext(), textview);
                return textview;
            }

            
            {
                a = TrayRidepoolSavingsLayout.this;
                super();
            }
        };
    }

    public static int b(TrayRidepoolSavingsLayout trayridepoolsavingslayout)
    {
        return trayridepoolsavingslayout.c;
    }

    public static String b(Trip trip)
    {
        if (trip != null)
        {
            trip = trip.getExtraStates();
            if (trip.containsKey("UberPoolNotMatched"))
            {
                return "UberPoolNotMatched";
            }
            if (trip.containsKey("UberPoolMatched"))
            {
                return "UberPoolMatched";
            }
            if (trip.containsKey("UberPoolMatching"))
            {
                return "UberPoolMatching";
            }
        }
        return null;
    }

    private void b()
    {
        mTextSwitcher.setFactory(g);
        mTextSwitcher.setInAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f04001f));
        mTextSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040020));
    }

    public static int c(TrayRidepoolSavingsLayout trayridepoolsavingslayout)
    {
        return trayridepoolsavingslayout.b;
    }

    private static Integer d(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ijg.d("Promo discount failed to parse", new Object[] {
                s
            });
            return null;
        }
        return Integer.valueOf(i);
    }

    public static String d(TrayRidepoolSavingsLayout trayridepoolsavingslayout)
    {
        return trayridepoolsavingslayout.f;
    }

    public final String a(String s)
    {
        String s2 = e.getString(0x7f070626);
        String s1 = s2;
        if (!TextUtils.isEmpty(s))
        {
            s1 = String.format("%S, %S%S%%%S", new Object[] {
                s2, "**", s, "**"
            });
        }
        return s1;
    }

    public final String a(String s, String s1)
    {
        Integer integer = d(s1);
        if (!d)
        {
            return e.getString(0x7f07062c, new Object[] {
                integer, s
            });
        }
        if (integer != null && integer.intValue() > 0)
        {
            return String.format("%S %S, %S%S %S%%%S", new Object[] {
                e.getString(0x7f07062b), s, "**", e.getString(0x7f07062d), s1, "**"
            });
        } else
        {
            return String.format("%S %S", new Object[] {
                e.getString(0x7f07062b), s
            });
        }
    }

    public final void a(boolean flag)
    {
        d = flag;
    }

    public final String b(String s)
    {
        String s1 = e.getString(0x7f070628);
        if (!TextUtils.isEmpty(s))
        {
            s1 = String.format("%S, %S%S %S%%%S", new Object[] {
                e.getString(0x7f070628), "**", e.getString(0x7f07062d), s, "**"
            });
        }
        return s1;
    }

    public final String c(String s)
    {
        String s2 = e.getString(0x7f070626);
        String s1 = s2;
        if (!TextUtils.isEmpty(s))
        {
            s1 = String.format("%S, %S%S %S%%%S", new Object[] {
                s2, "**", e.getString(0x7f07062d), s, "**"
            });
        }
        return s1;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            gfp.a(this, new gfc(this, (byte)0));
            e = getResources();
            b = e.getDimensionPixelSize(0x7f0802ab);
            c = e.getDimensionPixelSize(0x7f0802ac);
            ((fqp)((czi)getContext()).d()).a(this);
            a();
            b();
            a.a(l.io);
            return;
        }
    }

    // Unreferenced inner class com/ubercab/client/feature/trip/tray/TrayRidepoolSavingsLayout$2

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
