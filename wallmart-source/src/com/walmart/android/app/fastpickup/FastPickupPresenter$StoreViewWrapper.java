// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.view.View;
import android.widget.TextView;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupPresenter

private class <init>
{

    private TextView mAddrline1;
    private TextView mAddrline2;
    private TextView mTitle;
    final FastPickupPresenter this$0;

    public void set(String s, FastPickupOrder fastpickuporder)
    {
        s = fastpickuporder.getStoreAddress(s);
        mTitle.setText(s[0]);
        mAddrline1.setText(s[1]);
        mAddrline2.setText(s[2]);
    }

    private (View view)
    {
        this$0 = FastPickupPresenter.this;
        super();
        mTitle = (TextView)ViewUtil.findViewById(view, 0x7f10012e);
        mAddrline1 = (TextView)ViewUtil.findViewById(view, 0x7f10012f);
        mAddrline2 = (TextView)ViewUtil.findViewById(view, 0x7f100130);
    }

    mAddrline2(View view, mAddrline2 maddrline2)
    {
        this(view);
    }
}
