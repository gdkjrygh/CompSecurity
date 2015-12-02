// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import gdx;
import gdy;
import geg;
import gjy;
import gka;
import gki;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionGroup

public class VehicleOptionsBar extends LinearLayout
    implements gdx
{

    private final Context a;
    private Boolean b;
    private String c;
    private ObjectAnimator d;
    private ObjectAnimator e;
    private final List f;
    FrameLayout mViewGroupContainer;

    public VehicleOptionsBar(Context context)
    {
        this(context, null);
    }

    public VehicleOptionsBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleOptionsBar(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        f = new CopyOnWriteArrayList();
        a = context;
    }

    private VehicleOptionGroup a(List list, String s)
    {
        return (VehicleOptionGroup)gki.d(list, new gka(s) {

            final String a;
            final VehicleOptionsBar b;

            private boolean a(VehicleOptionGroup vehicleoptiongroup)
            {
                return vehicleoptiongroup.a().a(a);
            }

            public final boolean apply(Object obj)
            {
                return a((VehicleOptionGroup)obj);
            }

            
            {
                b = VehicleOptionsBar.this;
                a = s;
                super();
            }
        }).d();
    }

    static Boolean a(VehicleOptionsBar vehicleoptionsbar, Boolean boolean1)
    {
        vehicleoptionsbar.b = boolean1;
        return boolean1;
    }

    static void a(VehicleOptionsBar vehicleoptionsbar)
    {
        vehicleoptionsbar.h();
    }

    private void d()
    {
        int j = a();
        int k = a.getResources().getInteger(0x7f0b0010);
        d = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            (float)j, 0.0F
        });
        e = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            0.0F, (float)j
        });
        d.setDuration(k);
        e.setDuration(k);
        d.setInterpolator(new DecelerateInterpolator());
        e.setInterpolator(new DecelerateInterpolator());
        d.addListener(new AnimatorListenerAdapter() {

            final VehicleOptionsBar a;

            public final void onAnimationCancel(Animator animator)
            {
                VehicleOptionsBar.a(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                VehicleOptionsBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                VehicleOptionsBar.a(a, Boolean.valueOf(true));
                VehicleOptionsBar.a(a);
            }

            
            {
                a = VehicleOptionsBar.this;
                super();
            }
        });
        e.addListener(new AnimatorListenerAdapter() {

            final VehicleOptionsBar a;

            public final void onAnimationCancel(Animator animator)
            {
                VehicleOptionsBar.a(a);
            }

            public final void onAnimationEnd(Animator animator)
            {
                VehicleOptionsBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                VehicleOptionsBar.a(a, Boolean.valueOf(false));
            }

            
            {
                a = VehicleOptionsBar.this;
                super();
            }
        });
    }

    private void e()
    {
        e.cancel();
        d.cancel();
    }

    private void f()
    {
        d.start();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gdy)iterator.next()).b()) { }
    }

    private void g()
    {
        e.start();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gdy)iterator.next()).b()) { }
    }

    private void h()
    {
        int j;
        if (b())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        setVisibility(j);
    }

    private List i()
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < mViewGroupContainer.getChildCount(); j++)
        {
            arraylist.add((VehicleOptionGroup)mViewGroupContainer.getChildAt(j));
        }

        return arraylist;
    }

    final int a()
    {
        return getResources().getDimensionPixelSize(0x7f0802b9);
    }

    final void a(gdy gdy1)
    {
        f.add(gdy1);
    }

    final void a(String s)
    {
        Object obj;
        c = s;
        obj = i();
        s = a(((List) (obj)), s);
        if (s != null) goto _L2; else goto _L1
_L1:
        if (b != null) goto _L4; else goto _L3
_L3:
        setTranslationY(a());
        b = Boolean.valueOf(false);
        h();
_L8:
        return;
_L4:
        if (b.booleanValue())
        {
            e();
            g();
            return;
        }
          goto _L5
_L2:
        if (b != null) goto _L7; else goto _L6
_L6:
        setTranslationY(0.0F);
        b = Boolean.valueOf(true);
        h();
_L9:
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            VehicleOptionGroup vehicleoptiongroup = (VehicleOptionGroup)((Iterator) (obj)).next();
            int j;
            if (vehicleoptiongroup == s)
            {
                j = 0;
            } else
            {
                j = 4;
            }
            vehicleoptiongroup.setVisibility(j);
        }
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        if (!b.booleanValue())
        {
            e();
            f();
        }
          goto _L9
    }

    public final void a(String s, String s1)
    {
        c = s;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((gdy)iterator.next()).a(s, s1)) { }
    }

    final void a(List list, Map map)
    {
        List list1 = i();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            geg geg1 = (geg)iterator.next();
            VehicleOptionGroup vehicleoptiongroup = (VehicleOptionGroup)gki.d(list1, new gka(geg1) {

                final geg a;
                final VehicleOptionsBar b;

                private boolean a(VehicleOptionGroup vehicleoptiongroup1)
                {
                    return vehicleoptiongroup1.a().a().equals(a.a());
                }

                public final boolean apply(Object obj)
                {
                    return a((VehicleOptionGroup)obj);
                }

            
            {
                b = VehicleOptionsBar.this;
                a = geg1;
                super();
            }
            }).d();
            if (!geg1.f())
            {
                if (vehicleoptiongroup != null)
                {
                    vehicleoptiongroup.b(this);
                    mViewGroupContainer.removeView(vehicleoptiongroup);
                }
            } else
            {
                list = vehicleoptiongroup;
                if (vehicleoptiongroup == null)
                {
                    list = new VehicleOptionGroup(getContext());
                    list.setVisibility(4);
                    mViewGroupContainer.addView(list);
                    list.a(this);
                }
                list.a(geg1, map);
            }
        } while (true);
        d();
    }

    final void b(String s)
    {
        a(s);
        VehicleOptionGroup vehicleoptiongroup = c(s);
        if (vehicleoptiongroup != null)
        {
            vehicleoptiongroup.a(s);
        }
    }

    final boolean b()
    {
        return b != null && b.booleanValue();
    }

    final VehicleOptionGroup c(String s)
    {
        return a(i(), s);
    }

    final String c()
    {
        Object obj = c(c);
        if (obj != null)
        {
            obj = ((VehicleOptionGroup) (obj)).b();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                return ((String) (obj));
            }
        }
        return c;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        d();
    }
}
