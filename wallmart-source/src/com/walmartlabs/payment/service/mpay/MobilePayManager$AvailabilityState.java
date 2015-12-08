// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.mpay;

import android.location.Location;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.LocationUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmartlabs.payment.service.mpay:
//            MobilePayManager, MobilePayPreferences, PilotRegion

private class <init>
{

    private boolean mEnabled;
    private String mInStoreId;
    private boolean mManuallyEnabled;
    private boolean mMobilePayAvailable;
    private boolean mPilot;
    private final Set mPilotRegions;
    private final Set mPilotStores;
    private String mPreferredStoreId;
    final MobilePayManager this$0;

    private void checkMobilePayAvailable()
    {
        boolean flag2 = isEnabled();
        boolean flag1 = flag2;
        if (flag2)
        {
            flag1 = flag2;
            if (isPilot())
            {
                flag1 = isInPilotStore() | preferPilotStore() | isInPilotArea() | isManuallyEnabled();
            }
        }
        boolean flag;
        if (mMobilePayAvailable != flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mMobilePayAvailable = flag1;
        if (flag)
        {
            MobilePayPreferences.setMobilePayAvailable(MobilePayManager.access$1300(MobilePayManager.this), mMobilePayAvailable);
            MessageBus.getBus().post(produceMobilePayEvent());
        }
    }

    private boolean isEnabled()
    {
        return mEnabled;
    }

    private boolean isInPilotArea()
    {
label0:
        {
            Location location = LocationUtils.getLastKnownLocation(MobilePayManager.access$1300(MobilePayManager.this));
            if (location == null)
            {
                break label0;
            }
            Iterator iterator = mPilotRegions.iterator();
            PilotRegion pilotregion;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                pilotregion = (PilotRegion)iterator.next();
            } while (location.distanceTo(pilotregion.mLocation) >= (float)pilotregion.mRadius);
            return true;
        }
        return false;
    }

    private boolean isInPilotStore()
    {
        return mInStoreId != null && mPilotStores.contains(mInStoreId);
    }

    private boolean isManuallyEnabled()
    {
        return mManuallyEnabled;
    }

    private boolean isPilot()
    {
        return mPilot;
    }

    private boolean preferPilotStore()
    {
        return mPreferredStoreId != null && mPilotStores.contains(mPreferredStoreId);
    }

    private void setEnabled(boolean flag)
    {
        mEnabled = flag;
        checkMobilePayAvailable();
    }

    private void setInStoreId(String s)
    {
        mInStoreId = s;
        checkMobilePayAvailable();
    }

    private void setManuallyEnabled(boolean flag)
    {
        mManuallyEnabled = flag;
        MobilePayPreferences.setMobilePayManuallyEnabled(MobilePayManager.access$1300(MobilePayManager.this), mManuallyEnabled);
        checkMobilePayAvailable();
    }

    private void setPilot(boolean flag)
    {
        mPilot = flag;
        checkMobilePayAvailable();
    }

    private void setPilotStores(String as[])
    {
        mPilotStores.clear();
        if (as != null)
        {
            mPilotStores.addAll(Arrays.asList(as));
        }
        checkMobilePayAvailable();
    }

    private void setPreferredStore(String s)
    {
        mPreferredStoreId = s;
        checkMobilePayAvailable();
    }

    public void init()
    {
        mMobilePayAvailable = MobilePayPreferences.isMobilePayAvailable(MobilePayManager.access$1300(MobilePayManager.this));
        mManuallyEnabled = MobilePayPreferences.isMobilePayManuallyEnabled(MobilePayManager.access$1300(MobilePayManager.this));
    }

    public void setPilotRegions(Set set)
    {
        mPilotRegions.clear();
        if (set != null)
        {
            mPilotRegions.addAll(set);
        }
        checkMobilePayAvailable();
    }









    private ()
    {
        this$0 = MobilePayManager.this;
        super();
        mPilotStores = new HashSet();
        mPilotRegions = new HashSet();
    }

    mPilotRegions(mPilotRegions mpilotregions)
    {
        this();
    }
}
