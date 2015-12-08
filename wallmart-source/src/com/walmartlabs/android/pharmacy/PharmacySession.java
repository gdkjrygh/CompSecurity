// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import com.walmartlabs.android.pharmacy.events.SessionEndedEvent;
import com.walmartlabs.utils.WLog;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PharmacySession
{

    private static final int INACTIVITY_TIMEOUT = 0xdbf88;
    private static final String TAG = com/walmartlabs/android/pharmacy/PharmacySession.getSimpleName();
    private static final int THROTTLING_TIME = 1000;
    private String mCustomerDOB;
    private boolean mHasTimedOut;
    private final Runnable mInactivityTimeoutRunnable = new Runnable() {

        final PharmacySession this$0;

        public void run()
        {
            WLog.d(PharmacySession.TAG, "Client session timeout");
            timeOut();
        }

            
            {
                this$0 = PharmacySession.this;
                super();
            }
    };
    private boolean mIsSessionActive;
    private long mLastInteractionReportTime;
    private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    private HashSet mPlacedRefillOrders;

    public PharmacySession()
    {
        mPlacedRefillOrders = new HashSet();
    }

    public void addPlacedOrder(int i, int j)
    {
        if (mIsSessionActive)
        {
            PrescriptionInfo prescriptioninfo = new PrescriptionInfo(i, j);
            mPlacedRefillOrders.add(prescriptioninfo);
            return;
        } else
        {
            WLog.i(TAG, "Order placed when there wasn't a session");
            return;
        }
    }

    public void clearTimeout()
    {
        mHasTimedOut = false;
    }

    public void endSession()
    {
        if (mIsSessionActive)
        {
            WLog.i(TAG, "endSession");
            mIsSessionActive = false;
            mMainThreadHandler.removeCallbacks(mInactivityTimeoutRunnable);
            mCustomerDOB = null;
            mPlacedRefillOrders.clear();
            MessageBus.getBus().post(new SessionEndedEvent(mHasTimedOut));
            return;
        } else
        {
            WLog.w(TAG, "endSession: Error in logic, stopping non active session");
            return;
        }
    }

    public String getCustomerDOB()
    {
        return mCustomerDOB;
    }

    public Set getPlacedOrders()
    {
        return Collections.unmodifiableSet(mPlacedRefillOrders);
    }

    public boolean hasActiveCustomerSession()
    {
        return mIsSessionActive && mCustomerDOB != null;
    }

    public boolean hasActiveSession()
    {
        return mIsSessionActive;
    }

    public boolean hasTimedOut()
    {
        return mHasTimedOut;
    }

    public void reportUserInteraction()
    {
        if (mIsSessionActive)
        {
            long l = SystemClock.elapsedRealtime();
            long l1 = l - mLastInteractionReportTime;
            if (l1 > 0xdbf88L)
            {
                WLog.d(TAG, "Client session timeout while CPU was sleeping");
                timeOut();
            } else
            if (l1 > 1000L)
            {
                WLog.d(TAG, "User interaction: resetting timeout");
                mMainThreadHandler.removeCallbacks(mInactivityTimeoutRunnable);
                mLastInteractionReportTime = l;
                mMainThreadHandler.postDelayed(mInactivityTimeoutRunnable, 0xdbf88L);
                return;
            }
        }
    }

    public void startCustomerSession(String s)
    {
        if (mCustomerDOB != null && !mCustomerDOB.equals(s))
        {
            WLog.w(TAG, "startCustomerSession: logic error, there's already a session for other customer");
            return;
        } else
        {
            WLog.d(TAG, "startCustomerSession: trying to start a new session");
            mCustomerDOB = s;
            startSession();
            return;
        }
    }

    public void startSession()
    {
        if (!mIsSessionActive)
        {
            WLog.i(TAG, "startSession: new session created");
            mLastInteractionReportTime = SystemClock.elapsedRealtime();
            mMainThreadHandler.postDelayed(mInactivityTimeoutRunnable, 0xdbf88L);
            mIsSessionActive = true;
            mHasTimedOut = false;
            return;
        } else
        {
            WLog.d(TAG, "startSession: session already exist, renewing");
            reportUserInteraction();
            return;
        }
    }

    public void timeOut()
    {
        mHasTimedOut = true;
        endSession();
    }


}
