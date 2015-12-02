// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.location.RiderLocation;
import ftv;
import ftw;
import fuc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressView

public class MultiAddressView extends LinearLayout
    implements ftv, ftw
{

    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Integer f;
    private ValueAnimator g;
    private ValueAnimator h;
    private List i;
    private Runnable j;
    private Runnable k;
    private Boolean l;
    private boolean m;
    AddressView mAddressViewDestination;
    AddressView mAddressViewPickup;

    public MultiAddressView(Context context)
    {
        this(context, null);
    }

    public MultiAddressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MultiAddressView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 0;
        i = new CopyOnWriteArrayList();
    }

    static int a(MultiAddressView multiaddressview, int i1)
    {
        multiaddressview.b = i1;
        return i1;
    }

    static void a(MultiAddressView multiaddressview)
    {
        multiaddressview.e();
    }

    private void a(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        g(flag1);
        mAddressViewPickup.setClickable(true);
        mAddressViewPickup.e(false);
        mAddressViewPickup.setVisibility(0);
        mAddressViewPickup.a(flag1);
        AddressView addressview = mAddressViewPickup;
        int i1;
        if (m)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        addressview.c(i1);
        mAddressViewPickup.d(flag1);
        mAddressViewDestination.setEnabled(true);
        mAddressViewDestination.setTranslationY(0.0F);
        mAddressViewDestination.c(8);
        if (!flag2)
        {
            mAddressViewPickup.g(8);
            mAddressViewPickup.a(1);
            mAddressViewPickup.b(0);
            mAddressViewDestination.setVisibility(8);
            return;
        }
        if (flag)
        {
            mAddressViewPickup.g(8);
            mAddressViewPickup.a(2);
            mAddressViewPickup.b(1);
            mAddressViewDestination.a(2);
            mAddressViewDestination.b(1);
            mAddressViewDestination.h(0);
        } else
        if (flag3)
        {
            mAddressViewPickup.g(8);
            mAddressViewPickup.a(1);
            mAddressViewPickup.b(1);
            mAddressViewDestination.h(8);
            mAddressViewDestination.a(0);
            mAddressViewDestination.b(1);
            mAddressViewDestination.d(getResources().getColor(0x7f0d004b));
            mAddressViewDestination.b(getResources().getString(0x7f0701da));
        } else
        {
            mAddressViewPickup.g(0);
            mAddressViewPickup.a(1);
            mAddressViewPickup.b(0);
            mAddressViewDestination.d(getResources().getColor(0x7f0d0070));
            mAddressViewDestination.b(getResources().getString(0x7f0701d9));
        }
        if (flag3 || flag)
        {
            e(flag1);
            return;
        } else
        {
            mAddressViewDestination.setVisibility(8);
            return;
        }
    }

    static void b(MultiAddressView multiaddressview)
    {
        multiaddressview.f();
    }

    private void b(boolean flag)
    {
        g(flag);
        mAddressViewPickup.setClickable(true);
        mAddressViewPickup.e(false);
        mAddressViewPickup.setVisibility(0);
        mAddressViewPickup.a(flag);
        mAddressViewPickup.c(0);
        mAddressViewPickup.g(8);
        mAddressViewPickup.d(flag);
        mAddressViewPickup.a(0);
        mAddressViewPickup.b(0);
        mAddressViewDestination.setTranslationY(0.0F);
        mAddressViewDestination.setVisibility(8);
    }

    private void b(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        byte byte0 = 8;
        mAddressViewPickup.setClickable(false);
        mAddressViewPickup.setVisibility(0);
        AddressView addressview = mAddressViewPickup;
        int i1;
        boolean flag4;
        if (m)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        addressview.c(i1);
        mAddressViewPickup.g(8);
        mAddressViewPickup.e(a);
        mAddressViewPickup.c(flag1);
        mAddressViewDestination.c(8);
        addressview = mAddressViewDestination;
        if (!flag3)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        addressview.setEnabled(flag4);
        mAddressViewDestination.b(0);
        mAddressViewDestination.b(getResources().getString(0x7f0701d9));
        if (flag)
        {
            f(flag1);
            mAddressViewPickup.a(2);
            mAddressViewDestination.setVisibility(0);
            mAddressViewDestination.a(2);
            AddressView addressview1 = mAddressViewDestination;
            if (flag3)
            {
                i1 = byte0;
            } else
            {
                i1 = 0;
            }
            addressview1.h(i1);
            return;
        }
        mAddressViewPickup.a(1);
        mAddressViewDestination.h(8);
        mAddressViewDestination.a(0);
        if (flag2)
        {
            f(flag1);
            e(flag1);
            return;
        } else
        {
            g(flag1);
            mAddressViewPickup.b(flag1);
            mAddressViewPickup.b(0);
            mAddressViewDestination.setVisibility(8);
            return;
        }
    }

    private void c(boolean flag)
    {
        b(flag);
    }

    private void c(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        boolean flag4 = false;
        g(flag1);
        mAddressViewPickup.setClickable(false);
        mAddressViewPickup.e(false);
        mAddressViewDestination.c(8);
        AddressView addressview = mAddressViewDestination;
        boolean flag5;
        if (!flag3)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        addressview.setEnabled(flag5);
        mAddressViewDestination.b(0);
        mAddressViewDestination.b(getResources().getString(0x7f0701d9));
        if (flag)
        {
            mAddressViewDestination.setVisibility(0);
            mAddressViewDestination.a(1);
            addressview = mAddressViewDestination;
            byte byte0;
            if (flag3)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            addressview.h(byte0);
        } else
        {
            mAddressViewDestination.h(8);
            mAddressViewDestination.a(0);
            if (flag2)
            {
                e(flag1);
            } else
            {
                mAddressViewDestination.setVisibility(8);
            }
        }
        if (flag1)
        {
            mAddressViewPickup.b(true);
            if (flag2)
            {
                d();
                return;
            } else
            {
                mAddressViewDestination.setVisibility(8);
                return;
            }
        }
        mAddressViewPickup.setVisibility(8);
        mAddressViewDestination.setTranslationY(0.0F);
        addressview = mAddressViewDestination;
        int i1;
        if (flag2)
        {
            i1 = ((flag4) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        addressview.setVisibility(i1);
    }

    private void d()
    {
        e = mAddressViewDestination.getTop();
        mAddressViewDestination.animate().setDuration(d).setInterpolator(new DecelerateInterpolator()).translationY(-mAddressViewPickup.getHeight()).setListener(new AnimatorListenerAdapter() {

            final MultiAddressView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mAddressViewPickup.setVisibility(8);
                a.mAddressViewDestination.setTranslationY(0.0F);
                MultiAddressView.b(a);
            }

            
            {
                a = MultiAddressView.this;
                super();
            }
        }).start();
    }

    private void d(boolean flag)
    {
        b(flag);
        mAddressViewPickup.c(8);
    }

    private void e()
    {
        if (mAddressViewDestination.getTop() == 0)
        {
            postDelayed(j, 50L);
        } else
        {
            Iterator iterator = i.iterator();
            while (iterator.hasNext()) 
            {
                ((fuc)iterator.next()).a(mAddressViewDestination.getTop());
            }
        }
    }

    private void e(boolean flag)
    {
        if (mAddressViewDestination.isShown())
        {
            return;
        }
        if (!flag)
        {
            mAddressViewDestination.setTranslationY(0.0F);
            mAddressViewDestination.setVisibility(0);
            e();
            return;
        } else
        {
            mAddressViewDestination.setAlpha(0.0F);
            mAddressViewDestination.setVisibility(0);
            mAddressViewDestination.setTranslationY(-mAddressViewPickup.getHeight());
            mAddressViewDestination.animate().alpha(1.0F).translationY(0.0F).setStartDelay(c).setDuration(d).setInterpolator(new DecelerateInterpolator()).setListener(new AnimatorListenerAdapter() {

                final MultiAddressView a;

                public final void onAnimationEnd(Animator animator)
                {
                    MultiAddressView.a(a);
                }

            
            {
                a = MultiAddressView.this;
                super();
            }
            });
            return;
        }
    }

    private void f()
    {
        if (mAddressViewDestination.getTop() == e)
        {
            postDelayed(k, 50L);
        } else
        {
            Iterator iterator = i.iterator();
            while (iterator.hasNext()) 
            {
                ((fuc)iterator.next()).g();
            }
        }
    }

    private void f(boolean flag)
    {
        if (!flag)
        {
            g.cancel();
            h.cancel();
            getBackground().setAlpha(255);
            b = 255;
        } else
        {
            if (h.isRunning())
            {
                h.reverse();
                return;
            }
            if (b < 255)
            {
                g.setIntValues(new int[] {
                    b, 255
                });
                g.start();
                return;
            }
        }
    }

    private void g(boolean flag)
    {
        if (!flag)
        {
            g.cancel();
            h.cancel();
            getBackground().setAlpha(0);
            b = 0;
        } else
        {
            if (g.isRunning())
            {
                g.reverse();
                return;
            }
            if (b > 0)
            {
                h.setIntValues(new int[] {
                    b, 0
                });
                h.start();
                return;
            }
        }
    }

    public final int a()
    {
        int j1 = getPaddingTop();
        int i1 = j1;
        if (mAddressViewPickup.getVisibility() == 0)
        {
            i1 = j1;
            if (!mAddressViewPickup.d())
            {
                i1 = j1 + mAddressViewPickup.getMeasuredHeight();
            }
        }
        j1 = i1;
        if (mAddressViewDestination.getVisibility() == 0)
        {
            j1 = i1 + mAddressViewDestination.getMeasuredHeight();
        }
        return j1;
    }

    public final void a(int i1, RiderLocation riderlocation, RiderLocation riderlocation1, boolean flag, boolean flag1)
    {
        boolean flag4;
        boolean flag5;
        boolean flag3 = true;
        boolean flag2;
        boolean flag6;
        boolean flag7;
        if (riderlocation != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (riderlocation1 != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        flag6 = mAddressViewPickup.b(riderlocation);
        flag7 = mAddressViewDestination.b(riderlocation1);
        if (f != null && f.intValue() != i1)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (l == null || l.booleanValue() != flag1)
        {
            flag3 = false;
        }
        if (!flag5 && flag2 && flag6 && flag7 && flag3)
        {
            return;
        }
        l = Boolean.valueOf(flag1);
        i1;
        JVM INSTR lookupswitch 9: default 220
    //                   -2147483648: 245
    //                   0: 245
    //                   1: 263
    //                   2: 254
    //                   3: 272
    //                   4: 287
    //                   5: 287
    //                   6: 287
    //                   7: 302;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6 _L6 _L6 _L7
_L1:
        mAddressViewPickup.a(riderlocation);
        mAddressViewDestination.a(riderlocation1);
        f = Integer.valueOf(i1);
        return;
_L2:
        b(flag5);
        continue; /* Loop/switch isn't completed */
_L4:
        d(flag5);
        continue; /* Loop/switch isn't completed */
_L3:
        c(flag5);
        continue; /* Loop/switch isn't completed */
_L5:
        a(flag4, flag5, flag, flag1);
        continue; /* Loop/switch isn't completed */
_L6:
        b(flag4, flag5, flag, flag1);
        continue; /* Loop/switch isn't completed */
_L7:
        c(flag4, flag5, flag, flag1);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void a(AddressView addressview)
    {
        if (addressview.getId() == 0x7f0e05e3)
        {
            for (addressview = i.iterator(); addressview.hasNext(); ((fuc)addressview.next()).d()) { }
        }
    }

    public final void a(fuc fuc1)
    {
        i.add(fuc1);
    }

    public final void a(String s)
    {
        mAddressViewPickup.b(s);
    }

    public final void a(String s, boolean flag)
    {
        m = flag;
        mAddressViewPickup.a(s);
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final void b()
    {
        mAddressViewDestination.c();
    }

    public final void b(AddressView addressview)
    {
        if (addressview.getId() == 0x7f0e05e4)
        {
            for (addressview = i.iterator(); addressview.hasNext(); ((fuc)addressview.next()).f()) { }
        }
    }

    public final void b(fuc fuc1)
    {
        i.remove(fuc1);
    }

    public final void b(String s)
    {
        mAddressViewDestination.b(s);
    }

    public final AddressView c()
    {
        return mAddressViewPickup;
    }

    public final void c(String s)
    {
        mAddressViewDestination.a(s);
    }

    public void onClickAddressViewDestination()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((fuc)iterator.next()).e()) { }
    }

    public void onClickAddressViewPickup()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((fuc)iterator.next()).c()) { }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(j);
        removeCallbacks(k);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        c = getResources().getInteger(0x7f0b0010);
        d = getResources().getInteger(0x7f0b000c);
        mAddressViewPickup.a(this);
        mAddressViewPickup.a();
        mAddressViewDestination.a(this);
        mAddressViewDestination.b();
        Drawable drawable = getBackground();
        drawable.setAlpha(b);
        g = ObjectAnimator.ofInt(drawable, "alpha", new int[] {
            0, 255
        });
        g.setDuration(c);
        h = ObjectAnimator.ofInt(drawable, "alpha", new int[] {
            255, 0
        });
        h.setDuration(c);
        g.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final MultiAddressView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                MultiAddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
            }

            
            {
                a = MultiAddressView.this;
                super();
            }
        });
        h.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final MultiAddressView a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                MultiAddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
            }

            
            {
                a = MultiAddressView.this;
                super();
            }
        });
        j = new Runnable() {

            final MultiAddressView a;

            public final void run()
            {
                MultiAddressView.a(a);
            }

            
            {
                a = MultiAddressView.this;
                super();
            }
        };
        k = new Runnable() {

            final MultiAddressView a;

            public final void run()
            {
                MultiAddressView.b(a);
            }

            
            {
                a = MultiAddressView.this;
                super();
            }
        };
    }
}
