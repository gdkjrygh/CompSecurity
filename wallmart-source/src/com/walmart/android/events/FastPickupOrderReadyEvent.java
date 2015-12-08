// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;

import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmartlabs.utils.WLog;
import java.util.HashMap;

public class FastPickupOrderReadyEvent
{

    private static final String TAG = com/walmart/android/events/FastPickupOrderReadyEvent.getSimpleName();
    public final String customerId;
    private final boolean inStore;
    private final HashMap mCustomerStatus;
    private final boolean mLocationEnabled;
    public final FastPickupOrder orders;
    public final String storeId;

    public FastPickupOrderReadyEvent()
    {
        customerId = null;
        storeId = null;
        orders = null;
        mCustomerStatus = new HashMap();
        inStore = false;
        mLocationEnabled = true;
    }

    public FastPickupOrderReadyEvent(String s, String s1, FastPickupOrder fastpickuporder, boolean flag, boolean flag1, HashMap hashmap)
    {
        WLog.d(TAG, (new StringBuilder()).append("FastPickupOrderReadyEvent()").append(s).append(", ").append(s1).append(", order: ").append(fastpickuporder).append(", inStore=").append(flag).append(", location=").append(flag1).toString());
        customerId = s1;
        storeId = s;
        orders = fastpickuporder;
        inStore = flag;
        mCustomerStatus = hashmap;
        mLocationEnabled = flag1;
    }

    public int getCount()
    {
        if (orders == null)
        {
            return 0;
        } else
        {
            return orders.getCount(storeId);
        }
    }

    public com.walmart.android.data.FastPickupOrder.Item getItem(int i)
    {
        if (orders == null)
        {
            return null;
        } else
        {
            return orders.getItem(storeId, i);
        }
    }

    public boolean isCheckedIn(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = (Integer)mCustomerStatus.get(s)) != null && (1 == s.intValue() || 2 == s.intValue() || 3 == s.intValue()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isInStore()
    {
        return inStore;
    }

    public boolean isLocationEnabled()
    {
        return mLocationEnabled;
    }

    public boolean isLoggedIn()
    {
        return !TextUtils.isEmpty(customerId);
    }

    public boolean orderAvailable()
    {
        boolean flag;
        if (!TextUtils.isEmpty(customerId) && getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(TAG, (new StringBuilder()).append("orderAvailable(): ").append(flag).toString());
        return flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FastPickupOrderReadyEvent: {customerId:").append(customerId).append(" storeId:").append(storeId).append(" orders: ").append(orders).append(" in-store:").append(inStore).append(" locationEnabled:").append(mLocationEnabled).append(" customer status:{").append(FastPickupUtil.print(mCustomerStatus)).append("} }").toString();
    }

}
