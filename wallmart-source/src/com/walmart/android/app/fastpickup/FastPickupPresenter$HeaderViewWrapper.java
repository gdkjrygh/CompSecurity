// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.app.storelocator.LocationUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupPresenter

private class mImage
{

    private final ImageView mImage;
    private final TextView mTitle;
    final FastPickupPresenter this$0;

    public void set(String s, FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        if (fastpickuporderreadyevent.isCheckedIn(s))
        {
            mTitle.setText(0x7f090117);
            mImage.setImageResource(0x7f020116);
            return;
        }
        mImage.setImageResource(0x7f020119);
        if (LocationUtil.isLocationServicesEnabled(FastPickupPresenter.access$000(FastPickupPresenter.this)))
        {
            if (!fastpickuporderreadyevent.isInStore() || !s.equals(fastpickuporderreadyevent.storeId))
            {
                s = fastpickuporderreadyevent.orders.getStoreAddress(s);
                mTitle.setText(FastPickupPresenter.access$000(FastPickupPresenter.this).getString(0x7f090116, new Object[] {
                    s[1]
                }));
                return;
            } else
            {
                mTitle.setText(0x7f090118);
                return;
            }
        } else
        {
            mTitle.setText(0x7f090118);
            return;
        }
    }

    public (View view)
    {
        this$0 = FastPickupPresenter.this;
        super();
        mTitle = (TextView)ViewUtil.findViewById(view, 0x7f100128);
        mImage = (ImageView)ViewUtil.findViewById(view, 0x7f100129);
    }
}
