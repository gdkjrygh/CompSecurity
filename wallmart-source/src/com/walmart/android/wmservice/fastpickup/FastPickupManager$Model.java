// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmartlabs.utils.WLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupManager

static class mChanged
{

    private static final long LONG_SCHEDULE_INTERVAL = 0x1499700L;
    private static final long SHORT_SCHEDULE_INTERVAL = 0x1d4c0L;
    private boolean mChanged;
    private FastPickupOrderReadyEvent mCurrentEvent;
    private String mCustomerId;
    private HashMap mCustomerStatus;
    private int mError;
    private boolean mInStore;
    private long mLastServerUpdate;
    private boolean mLocationEnabled;
    private FastPickupOrder mOrders;
    private String mStoreId;

    private boolean updateEvent()
    {
        boolean flag = mChanged;
        if (mChanged)
        {
            mChanged = false;
            mCurrentEvent = new FastPickupOrderReadyEvent(mStoreId, mCustomerId, mOrders, mInStore, mLocationEnabled, mCustomerStatus);
            WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("updateEvent(): mCurrentEvent=").append(mCurrentEvent).toString());
        }
        return flag;
    }

    public FastPickupOrderReadyEvent getCurrentEvent()
    {
        return mCurrentEvent;
    }

    public String getCustomerId()
    {
        return mCustomerId;
    }

    public int getError()
    {
        return mError;
    }

    public long getLastServerUpdate()
    {
        return mLastServerUpdate;
    }

    public FastPickupOrder getOrders()
    {
        return mOrders;
    }

    public long getScheduleInterval()
    {
        long l;
label0:
        {
            long l1 = 0x1499700L;
            l = l1;
            if (mOrders == null)
            {
                break label0;
            }
            l = l1;
            if (!mInStore)
            {
                break label0;
            }
            Iterator iterator = mOrders.getStores().iterator();
            com.walmart.android.data.upManager.Model model;
            do
            {
                l = l1;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                model = (com.walmart.android.data.s)iterator.next();
            } while (!isCheckedIn(model.mber) || mOrders.getCount(model.mber) <= 0);
            l = 0x1d4c0L;
        }
        return l;
    }

    public String getStoreId()
    {
        return mStoreId;
    }

    public boolean isCheckedIn(String s)
    {
        s = (Integer)mCustomerStatus.get(s);
        return s != null && (1 == s.intValue() || 2 == s.intValue() || 3 == s.intValue());
    }

    public boolean isInStore()
    {
        return mInStore;
    }

    public boolean isLoggedIn()
    {
        return !TextUtils.isEmpty(mCustomerId);
    }

    public void reset()
    {
        if (mOrders != null || !TextUtils.isEmpty(mCustomerId))
        {
            mCustomerId = null;
            mOrders = null;
            mChanged = true;
        }
    }

    public void setCustomerId(String s)
    {
        mChanged = mChanged | FastPickupUtil.fieldChanged(mCustomerId, s);
        mCustomerId = s;
    }

    public void setCustomerStatus(String s, int i)
    {
        int j = ((Integer)mCustomerStatus.get(s)).intValue();
        boolean flag = mChanged;
        if (j != i)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        mChanged = j | flag;
        mCustomerStatus.put(s, Integer.valueOf(i));
    }

    public void setError(int i)
    {
        mError = i;
    }

    public boolean setInStore(boolean flag)
    {
        boolean flag1;
        if (mInStore != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mChanged = mChanged | flag1;
        mInStore = flag;
        if (flag1 && mInStore)
        {
            mStoreId = null;
        }
        return flag1;
    }

    public void setLocationEnabled(boolean flag)
    {
        boolean flag2 = mChanged;
        boolean flag1;
        if (mLocationEnabled != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mChanged = flag1 | flag2;
        mLocationEnabled = flag;
    }

    public void setStoreId(String s)
    {
        mChanged = mChanged | FastPickupUtil.fieldChanged(mStoreId, s);
        mStoreId = s;
    }

    public void updateServerState(FastPickupOrder fastpickuporder, int i)
    {
        WLog.d(FastPickupManager.access$100(), "Model.updateServerState()");
        mLastServerUpdate = System.currentTimeMillis();
        if (FastPickupUtil.fieldChanged(mOrders, fastpickuporder))
        {
            WLog.d(FastPickupManager.access$100(), "Model.updateServerState() order changed");
            WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("current order: ").append(mOrders).toString());
            WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("new order: ").append(fastpickuporder).toString());
            mChanged = true;
            mOrders = fastpickuporder;
        }
        if (FastPickupUtil.fieldChanged(Integer.valueOf(mError), Integer.valueOf(i)))
        {
            mError = i;
            mChanged = true;
        }
        if (fastpickuporder != null)
        {
            fastpickuporder = fastpickuporder.getCustomerStatus();
        } else
        {
            fastpickuporder = new HashMap();
        }
        if (FastPickupUtil.fieldChanged(mCustomerStatus, fastpickuporder))
        {
            WLog.d(FastPickupManager.access$100(), "Model.updateServerState() customer state changed");
            mCustomerStatus = fastpickuporder;
            mChanged = true;
        }
    }



    ()
    {
        mCustomerStatus = new HashMap();
        mCurrentEvent = new FastPickupOrderReadyEvent();
        mChanged = false;
    }
}
