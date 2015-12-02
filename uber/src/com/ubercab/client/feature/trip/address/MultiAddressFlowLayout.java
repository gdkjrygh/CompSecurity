// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import ftk;
import ftl;
import ftu;
import fub;
import fue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressFlowEditText, StackedViewLayout

public class MultiAddressFlowLayout extends FrameLayout
    implements ftk, ftl, fue
{

    private final List a;
    private boolean b;
    AddressFlowEditText mDestinationAddress;
    AddressFlowEditText mPickupAddress;
    StackedViewLayout mStackedViewLayout;

    public MultiAddressFlowLayout(Context context)
    {
        this(context, null);
    }

    public MultiAddressFlowLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MultiAddressFlowLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
    }

    private void f(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if (i == 1 || i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 3 || i == 4)
        {
            flag1 = true;
        }
        if (b)
        {
            mPickupAddress.e(flag);
            mDestinationAddress.e(flag1);
            return;
        } else
        {
            mPickupAddress.d(flag);
            mDestinationAddress.d(flag1);
            return;
        }
    }

    private void g(int i)
    {
        boolean flag = false;
        int j;
        if (i == 0)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        mPickupAddress.e(j);
        mDestinationAddress.e(j);
        if (i == 4 || i == 2)
        {
            flag = true;
        }
        mPickupAddress.b(flag);
        mDestinationAddress.a(flag);
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fub)iterator.next()).c()) { }
    }

    public final void a(int i)
    {
        f(i);
        if (b)
        {
            mStackedViewLayout.b(i);
            return;
        } else
        {
            g(i);
            mStackedViewLayout.a(i);
            return;
        }
    }

    public final void a(ftu ftu)
    {
        mPickupAddress.a(ftu);
    }

    public final void a(fub fub1)
    {
        a.add(fub1);
    }

    public final void a(boolean flag)
    {
        if (b)
        {
            mDestinationAddress.g(flag);
            return;
        } else
        {
            mDestinationAddress.f(flag);
            return;
        }
    }

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final void b(int i)
    {
        if (b)
        {
            mPickupAddress.b(i);
            return;
        } else
        {
            mPickupAddress.a(i);
            return;
        }
    }

    public final void b(ftu ftu)
    {
        mDestinationAddress.a(ftu);
    }

    public final void b(boolean flag)
    {
        mPickupAddress.c(flag);
        mDestinationAddress.c(flag);
    }

    public final void c()
    {
        int i = mStackedViewLayout.a();
        if (i != 0)
        {
            g(i);
        }
    }

    public final void c(int i)
    {
        if (b)
        {
            mDestinationAddress.b(i);
            return;
        } else
        {
            mDestinationAddress.a(i);
            return;
        }
    }

    public final void d()
    {
        g(mStackedViewLayout.a());
    }

    public final void d(int i)
    {
        if (b)
        {
            mPickupAddress.d(i);
            return;
        } else
        {
            mPickupAddress.c(i);
            return;
        }
    }

    public final void e()
    {
        b = true;
    }

    public final void e(int i)
    {
        if (b)
        {
            mDestinationAddress.d(i);
            return;
        } else
        {
            mDestinationAddress.c(i);
            return;
        }
    }

    public final void f()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public void onDestinationAddressClick()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fub)iterator.next()).b()) { }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
        mStackedViewLayout.a(this);
        mPickupAddress.a(this);
        mPickupAddress.a(this);
        mDestinationAddress.a(this);
        mDestinationAddress.a(this);
        mPickupAddress.a(true);
        mDestinationAddress.b(true);
    }

    public void onPickupAddressClick()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fub)iterator.next()).a()) { }
    }
}
