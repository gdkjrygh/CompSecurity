// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.fastpickup:
//            FastPickupUtil, FastPickupStorePresenter, FastPickupPresenter

public class FastPickupLoadingPresenter extends Presenter
    implements AsyncCallback
{

    private static final int DIALOG_NETWORK_ERROR = 1;
    private static final int DIALOG_SIGN_IN = 3;
    private static final int DIALOG_UNKNOWN_ERROR = 2;
    private static final String TAG = com/walmart/android/app/fastpickup/FastPickupLoadingPresenter.getSimpleName();
    private final Activity mActivity;
    private int mId;
    private boolean mRefresh;
    private View mRootView;
    private final String mStoreId;

    public FastPickupLoadingPresenter(Activity activity, String s)
    {
        mActivity = activity;
        mStoreId = s;
        setTitleText(mActivity.getString(0x7f09010a));
    }

    private FastPickupManager getManager()
    {
        return Services.get().getFastPickupManager();
    }

    public int getID()
    {
        return mId;
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
    }

    public void onBeforePush()
    {
        WLog.i(TAG, "onBeforePush()");
        super.onBeforePush();
        if (!mRefresh)
        {
            WLog.i(TAG, "onBeforePush() refresh()");
            mRefresh = true;
            getManager().refresh(this, true);
        }
    }

    public void onCancelled()
    {
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
        builder.setCancelable(true);
        builder.setPositiveButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final FastPickupLoadingPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                pop();
            }

            
            {
                this$0 = FastPickupLoadingPresenter.this;
                super();
            }
        });
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final FastPickupLoadingPresenter this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                pop();
            }

            
            {
                this$0 = FastPickupLoadingPresenter.this;
                super();
            }
        });
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            builder.setMessage(0x7f090282);
            return builder.create();

        case 2: // '\002'
            builder.setMessage(0x7f090284);
            return builder.create();

        case 3: // '\003'
            builder.setMessage(0x7f09010f);
            break;
        }
        return builder.create();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040094);
        }
    }

    public void onFailure(Integer integer, FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onFailure() error=").append(integer).toString());
        if (!isTop()) goto _L2; else goto _L1
_L1:
        byte byte0 = 2;
        FastPickupUtil.translateErrorCode(integer);
        JVM INSTR lookupswitch 2: default 64
    //                   401: 88
    //                   90002: 93;
           goto _L3 _L4 _L5
_L3:
        showDialog(byte0);
        MessageBus.getBus().post(new CloseFragmentEvent());
_L2:
        mRefresh = false;
        return;
_L4:
        byte0 = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        byte0 = 1;
        if (true) goto _L3; else goto _L6
_L6:
    }

    public volatile void onFailure(Object obj, Object obj1)
    {
        onFailure((Integer)obj, (FastPickupOrderReadyEvent)obj1);
    }

    public void onSuccess(FastPickupOrderReadyEvent fastpickuporderreadyevent)
    {
label0:
        {
label1:
            {
                WLog.d(TAG, "onSuccess()");
                mRefresh = false;
                if (fastpickuporderreadyevent.orders == null)
                {
                    break label0;
                }
                if (isTop())
                {
                    fastpickuporderreadyevent = fastpickuporderreadyevent.orders.getStores();
                    if (!TextUtils.isEmpty(mStoreId) || fastpickuporderreadyevent.size() <= 1)
                    {
                        break label1;
                    }
                    WLog.d(TAG, (new StringBuilder()).append("onSuccess() ").append(fastpickuporderreadyevent.size()).append(", ").append(fastpickuporderreadyevent).toString());
                    pushAndReplacePresenter(new FastPickupStorePresenter(mActivity));
                }
                return;
            }
            pushAndReplacePresenter(new FastPickupPresenter(mActivity, mStoreId));
            return;
        }
        onFailure(Integer.valueOf(0x15f91), fastpickuporderreadyevent);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((FastPickupOrderReadyEvent)obj);
    }

    public void setID(int i)
    {
        mId = i;
    }



}
