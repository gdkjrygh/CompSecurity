// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bjw;
import butterknife.ButterKnife;
import cgh;
import chp;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.ShoppingCartCharges;
import com.ubercab.client.core.model.ShoppingCartTopLineCharge;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.ui.TextView;
import dfp;
import dtw;
import fim;
import fin;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingConfirmationTopLineChargesAdapter, ShoppingConfirmationItemsAdapter

public class ShoppingConfirmationView extends FrameLayout
{

    public chp a;
    public bjw b;
    public cgh c;
    private final List d;
    private NumberFormat e;
    private int f;
    private ShoppingConfirmationTopLineChargesAdapter g;
    private Resources h;
    private ShoppingConfirmationItemsAdapter i;
    private Store j;
    private Handler k;
    private final android.view.View.OnClickListener l;
    View mContainer;
    LinearLayout mContentArea;
    TextView mFooterText;
    View mGroup;
    LinearLayout mItemsArea;
    LinearLayout mLabelsArea;
    View mScrollContainer;
    LinearLayout mValuesArea;

    public ShoppingConfirmationView(Context context)
    {
        this(context, null);
    }

    public ShoppingConfirmationView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ShoppingConfirmationView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new CopyOnWriteArrayList();
        l = new android.view.View.OnClickListener() {

            final ShoppingConfirmationView a;

            public final void onClick(View view)
            {
                ShoppingConfirmationView.a(a, view);
            }

            
            {
                a = ShoppingConfirmationView.this;
                super();
            }
        };
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
        k = new Handler(Looper.getMainLooper());
        if (context != null)
        {
            h = context.getResources();
            f = context.getResources().getDimensionPixelSize(0x7f080215);
        }
    }

    private void a(View view)
    {
        if (j != null)
        {
            view = (ShoppingConfirmationItemsAdapter.ViewHolder)view.getTag();
            if (j.getItem(((ShoppingConfirmationItemsAdapter.ViewHolder) (view)).a) != null)
            {
                for (view = d.iterator(); view.hasNext(); ((fin)view.next()).a()) { }
            }
        }
    }

    static void a(ShoppingConfirmationView shoppingconfirmationview)
    {
        shoppingconfirmationview.b();
    }

    static void a(ShoppingConfirmationView shoppingconfirmationview, View view)
    {
        shoppingconfirmationview.a(view);
    }

    private void a(Store store)
    {
        ArrayList arraylist = new ArrayList();
        if (store.getTaxes() > 0.0D)
        {
            arraylist.add(ShoppingCartTopLineCharge.create(h.getString(0x7f07041f), "debit", e.format(store.getTaxes())));
        }
        if (store.getDeliveryFee() > 0.0D)
        {
            arraylist.add(ShoppingCartTopLineCharge.create(h.getString(0x7f070418), "debit", e.format(store.getDeliveryFee())));
        }
        arraylist.add(ShoppingCartTopLineCharge.create(h.getString(0x7f070420), "debit", e.format(store.getTotal())));
        g.a(arraylist);
    }

    private void b()
    {
        k.postDelayed(new Runnable() {

            final ShoppingConfirmationView a;

            public final void run()
            {
                if (a.mContentArea.getHeight() > 0)
                {
                    a.mScrollContainer.setScrollY(a.mContentArea.getHeight());
                    return;
                } else
                {
                    ShoppingConfirmationView.a(a);
                    return;
                }
            }

            
            {
                a = ShoppingConfirmationView.this;
                super();
            }
        }, 250L);
    }

    public final int a()
    {
        if (getVisibility() == 0)
        {
            return mContainer.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    public final void a(int i1, int j1)
    {
        j1 = f + j1;
        if (i1 != getPaddingTop() || j1 != getPaddingBottom())
        {
            setPadding(0, i1, 0, j1);
        }
    }

    public final void a(fin fin1)
    {
        d.add(fin1);
    }

    public final void a(String s, fim fim1)
    {
        Store store = fim1.c(s);
        j = store;
        e = dtw.a(store.getCurrency());
        i.a(store.getCurrency());
        i.a(store.getShoppingCartItems());
        mItemsArea.removeAllViews();
        if (!i.isEmpty())
        {
            for (int i1 = 0; i1 < i.getCount(); i1++)
            {
                s = i.getView(i1, null, mItemsArea);
                s.setOnClickListener(l);
                mItemsArea.addView(s);
            }

        }
        fim1 = store.getCartCharges();
        if (fim1 == null)
        {
            s = null;
        } else
        {
            s = fim1.getFinalCharges();
        }
        if (s != null && !s.isEmpty())
        {
            g.a(s);
        } else
        {
            a(store);
        }
        if (!g.isEmpty())
        {
            mLabelsArea.removeAllViews();
            mValuesArea.removeAllViews();
            for (int j1 = 0; j1 < g.getCount(); j1++)
            {
                s = g.getView(j1, null, mLabelsArea);
                g.a(j1, s, true);
                mLabelsArea.addView(s);
                s = g.getView(j1, null, mValuesArea);
                g.a(j1, s, false);
                mValuesArea.addView(s);
            }

        }
        if (fim1 != null && fim1.getFooter() != null && !fim1.getFooter().isEmpty())
        {
            mFooterText.setText(fim1.getFooter());
            mFooterText.setVisibility(0);
        }
        if (getVisibility() != 0)
        {
            b();
        }
        setVisibility(0);
    }

    public final void b(fin fin1)
    {
        d.remove(fin1);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        Context context = getContext();
        if (context != null)
        {
            g = new ShoppingConfirmationTopLineChargesAdapter(context);
            i = new ShoppingConfirmationItemsAdapter(context, a, c, b);
        }
    }
}
