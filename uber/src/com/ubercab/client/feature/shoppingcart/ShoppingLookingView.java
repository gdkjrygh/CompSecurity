// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cgh;
import chp;
import com.ubercab.client.feature.shoppingcart.model.Page;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.rider.realtime.response.Promotion;
import czi;
import dbf;
import dru;
import fip;
import fir;
import fit;
import fqp;
import gmg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingMenuRecyclerView, ShoppingMenuAdapter

public class ShoppingLookingView extends FrameLayout
    implements fir, fit
{

    public chp a;
    public cev b;
    public gmg c;
    public cgh d;
    boolean e;
    ShoppingMenuAdapter f;
    boolean g;
    boolean h;
    Promotion i;
    final int j;
    private final Set k;
    ViewGroup mCheckoutArea;
    View mCheckoutAreaShadow;
    TextView mPromoBanner;
    ViewGroup mShoppingCartAreaOld;
    TextView mShoppingCartQuantity;
    TextView mShoppingCartQuantityOld;
    ShoppingMenuRecyclerView mShoppingMenuRecyclerView;

    public ShoppingLookingView(Context context)
    {
        this(context, null);
    }

    public ShoppingLookingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ShoppingLookingView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new HashSet();
        if (!isInEditMode())
        {
            ((fqp)((czi)context).d()).a(this);
        }
        j = getResources().getDimensionPixelSize(0x7f0802df);
        g = c.a(dbf.bb);
        boolean flag;
        if (c.a(dbf.bd) && c.a(dbf.bb))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    private void e(int i1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mShoppingMenuRecyclerView.getLayoutParams();
        if (marginlayoutparams != null)
        {
            marginlayoutparams.bottomMargin = i1;
        }
    }

    public static void h()
    {
    }

    private void p()
    {
        e(j);
        if (mShoppingMenuRecyclerView != null && mShoppingMenuRecyclerView.getChildAt(mShoppingMenuRecyclerView.getChildCount() - 1).getBottom() == mShoppingMenuRecyclerView.getHeight())
        {
            mShoppingMenuRecyclerView.postDelayed(new Runnable() {

                final ShoppingLookingView a;

                public final void run()
                {
                    a.mShoppingMenuRecyclerView.a(a.f.a());
                }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
            }, 350L);
            e = true;
        }
    }

    private void q()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040018);
        animation.setAnimationListener(new dru() {

            final ShoppingLookingView a;

            public final void onAnimationEnd(Animation animation1)
            {
                a.setVisibility(0);
            }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
        });
        startAnimation(animation);
    }

    public final void a()
    {
        if (h)
        {
            f.c(8);
            f.b(false);
        }
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).a()) { }
    }

    public final void a(int i1)
    {
        mShoppingCartAreaOld.setVisibility(i1);
    }

    public final void a(Page page, Store store)
    {
        if (f == null)
        {
            return;
        } else
        {
            f.a(page, store.getCurrentlyDisplayedTimeWindow(), store.getTimezone(), store.getCurrency());
            mShoppingMenuRecyclerView.setVisibility(0);
            return;
        }
    }

    public final void a(Promotion promotion)
    {
        if (h)
        {
            i = promotion;
            i();
            if (f != null)
            {
                if (f())
                {
                    f.c(8);
                }
                f.a(promotion);
                return;
            }
        }
    }

    public final void a(fip fip1)
    {
        if (fip1 != null)
        {
            k.add(fip1);
        }
    }

    public final void a(String s)
    {
        f = new ShoppingMenuAdapter(getContext(), a, c, b, d);
        f.a(s);
        f.a(this);
        mShoppingMenuRecyclerView.a();
        getContext();
        s = new LinearLayoutManager();
        mShoppingMenuRecyclerView.a(s);
        mShoppingMenuRecyclerView.a(f);
        mShoppingMenuRecyclerView.a(this);
        f.b(g());
        q();
    }

    public final void a(String s, long l1)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).a(s, l1)) { }
    }

    public final void a(String s, String s1)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).a(s, s1)) { }
    }

    public final void a(String s, String s1, long l1)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).a(s, s1, l1)) { }
    }

    public final void a(String s, boolean flag)
    {
        f.a(s, flag);
    }

    public final void b()
    {
        if (h)
        {
            Iterator iterator;
            if (!f() && i != null)
            {
                f.c(0);
            } else
            {
                f.c(8);
            }
            f.b(true);
        }
        for (iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).b()) { }
    }

    public final void b(int i1)
    {
        mCheckoutArea.setVisibility(i1);
        mCheckoutAreaShadow.setVisibility(i1);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        e(j);
        if (h)
        {
            f.a(true);
            f.c(8);
        }
_L4:
        i();
        return;
_L2:
        e(0);
        if (i != null && g() && h)
        {
            f.a(false);
            f.c(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(String s)
    {
        if (f != null)
        {
            f.c(s);
        }
    }

    public final void c()
    {
        f.c(8);
        mShoppingMenuRecyclerView.n();
    }

    public final void c(int i1)
    {
        mShoppingCartQuantityOld.setText(String.valueOf(i1));
    }

    public final void c(String s)
    {
        if (f != null)
        {
            f.b(s);
        }
    }

    public final void d()
    {
        mShoppingMenuRecyclerView.p();
    }

    public final void d(int i1)
    {
        mShoppingCartQuantity.setText(String.valueOf(i1));
    }

    public final void d(String s)
    {
        if (f != null)
        {
            f.a(s);
        }
    }

    public final boolean e()
    {
        return mShoppingCartAreaOld.getVisibility() == 0;
    }

    public final boolean f()
    {
        return mCheckoutArea.getVisibility() == 0;
    }

    public final boolean g()
    {
        return mShoppingMenuRecyclerView.o();
    }

    public final void i()
    {
        if (!g)
        {
            return;
        }
        if (i != null && f() && !TextUtils.isEmpty(i.getDescription()))
        {
            mPromoBanner.setText(i.getDescription());
            mPromoBanner.setVisibility(0);
            return;
        } else
        {
            mPromoBanner.setVisibility(8);
            return;
        }
    }

    public final void j()
    {
        mShoppingMenuRecyclerView.n();
        if (h)
        {
            f.c(8);
        }
    }

    public final void k()
    {
        mShoppingMenuRecyclerView.q();
        if (i != null && g() && !f() && h)
        {
            f.c(0);
        }
    }

    public final void l()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
        e(0);
        animation.setAnimationListener(new dru() {

            final ShoppingLookingView a;

            public final void onAnimationStart(Animation animation1)
            {
                a.mShoppingCartAreaOld.setVisibility(8);
            }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
        });
        mShoppingCartAreaOld.startAnimation(animation);
    }

    public final void m()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
        e(0);
        animation.setAnimationListener(new dru() {

            final ShoppingLookingView a;

            public final void onAnimationStart(Animation animation1)
            {
                a.mCheckoutArea.setVisibility(8);
                a.mCheckoutAreaShadow.setVisibility(8);
            }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
        });
        mCheckoutArea.startAnimation(animation);
        if (e)
        {
            mShoppingMenuRecyclerView.f(j);
            e = false;
        }
        e(0);
        if (g)
        {
            mPromoBanner.setVisibility(8);
            if (i != null && g() && h)
            {
                f.a(false);
                f.c(0);
            }
        }
    }

    public final void n()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040018);
        animation.setAnimationListener(new dru() {

            final ShoppingLookingView a;

            public final void onAnimationEnd(Animation animation1)
            {
                a.mShoppingCartAreaOld.setVisibility(0);
            }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
        });
        mShoppingCartAreaOld.startAnimation(animation);
        p();
    }

    public final void o()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040018);
        animation.setAnimationListener(new dru() {

            final ShoppingLookingView a;

            public final void onAnimationEnd(Animation animation1)
            {
                a.mCheckoutArea.setVisibility(0);
                a.mCheckoutAreaShadow.setVisibility(0);
                a.i();
            }

            
            {
                a = ShoppingLookingView.this;
                super();
            }
        });
        mCheckoutArea.startAnimation(animation);
        f.a(true);
        p();
    }

    public void onClickButtonCheckout()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((fip)iterator.next()).e()) { }
    }

    public void onClickButtonCheckoutOld()
    {
        onClickButtonCheckout();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
