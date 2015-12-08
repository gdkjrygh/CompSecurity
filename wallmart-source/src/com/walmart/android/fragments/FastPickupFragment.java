// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.app.fastpickup.FastPickupLoadingPresenter;
import com.walmart.android.app.fastpickup.FastPickupPresenter;
import com.walmart.android.app.fastpickup.FastPickupStorePresenter;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.app.fastpickup.FastPickupViewEvent;
import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.Criteria;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.fragments:
//            WalmartPresenterFragment

public class FastPickupFragment extends WalmartPresenterFragment
{

    private static final String NO_STORE_ID = "";
    private static final String TAG = com/walmart/android/fragments/FastPickupFragment.getSimpleName();
    private Bundle mCurrentArguments;
    private String mStoreId;

    public FastPickupFragment()
    {
        mCurrentArguments = new Bundle();
        mStoreId = "";
    }

    private Presenter createPresenter(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("onCreatePresenter storeId:").append(s).toString());
        FastPickupOrderReadyEvent fastpickuporderreadyevent = Services.get().getFastPickupManager().getFastPickupOrderReadyEvent();
        if (fastpickuporderreadyevent.orders == null)
        {
            return new FastPickupLoadingPresenter(getActivity(), s);
        }
        if (TextUtils.isEmpty(s) && fastpickuporderreadyevent.orders.getStores().size() > 1)
        {
            return new FastPickupStorePresenter(getActivity());
        } else
        {
            return new FastPickupPresenter(getActivity(), s);
        }
    }

    private String getStoreId(Bundle bundle)
    {
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("STORE_ID");
        }
        bundle = s;
        if (TextUtils.isEmpty(s))
        {
            bundle = Services.get().getFastPickupManager().getFastPickupOrderReadyEvent().storeId;
        }
        return bundle;
    }

    private void handleDynamicArguments(Bundle bundle)
    {
        WLog.d(TAG, (new StringBuilder()).append("handleDynamicArguments() bundle: ").append(bundle).toString());
        mCurrentArguments = bundle;
        mStoreId = getStoreId(bundle);
        bundle = createPresenter(mStoreId);
        mPresenterStack.pushPresenter(bundle, false);
    }

    private boolean storeChanged(Bundle bundle)
    {
        boolean flag1 = FastPickupUtil.fieldChanged(mCurrentArguments, bundle);
        boolean flag = flag1;
        if (!flag1)
        {
            bundle = getStoreId(bundle);
            flag = FastPickupUtil.fieldChanged(mStoreId, bundle);
        }
        return flag;
    }

    public View getView()
    {
        WLog.v(TAG, "getView");
        return super.getView();
    }

    public void onAttach(Activity activity)
    {
        WLog.d(TAG, "onAttach()");
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        WLog.d(TAG, "onCreateView()");
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        WLog.v(TAG, "onDestroy");
        super.onDestroy();
    }

    public void onDestroyView()
    {
        WLog.v(TAG, "onDestroyView");
        mStoreId = "";
        mCurrentArguments = new Bundle();
        super.onDestroyView();
    }

    public void onDetach()
    {
        WLog.v(TAG, "onDetach");
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        WLog.v(TAG, "onHiddenChanged");
        super.onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        WLog.v(TAG, "onInflate");
        super.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        WLog.d(TAG, "onPause()");
        super.onPause();
        MessageBus.getBus().post(new FastPickupViewEvent(false));
    }

    public void onResume()
    {
        Bundle bundle;
        WLog.d(TAG, "onResume()");
        super.onResume();
        bundle = getDynamicArguments();
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("onResume() with");
        Object obj;
        if (bundle != null)
        {
            obj = "";
        } else
        {
            obj = "out";
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append(" arguments:");
        if (bundle != null)
        {
            obj = bundle.toString();
        } else
        {
            obj = "";
        }
        WLog.v(s, stringbuilder.append(((String) (obj))).toString());
        if (bundle != null || mPresenterStack.getCount() <= 1) goto _L2; else goto _L1
_L1:
        obj = new Criteria() {

            final FastPickupFragment this$0;

            public boolean fullfilled(Presenter presenter)
            {
                return presenter.getClass().equals(com/walmart/android/app/fastpickup/FastPickupStorePresenter);
            }

            public volatile boolean fullfilled(Object obj1)
            {
                return fullfilled((Presenter)obj1);
            }

            
            {
                this$0 = FastPickupFragment.this;
                super();
            }
        };
        if (mPresenterStack.isInStack(((Criteria) (obj))))
        {
            for (; !(mPresenterStack.peek() instanceof FastPickupStorePresenter); mPresenterStack.popPresenter()) { }
        }
          goto _L3
_L2:
        if (!storeChanged(bundle)) goto _L5; else goto _L4
_L4:
        mPresenterStack.popToRoot();
        mPresenterStack.clear();
        handleDynamicArguments(bundle);
_L3:
        MessageBus.getBus().post(new FastPickupViewEvent(true));
        return;
_L5:
        if (mPresenterStack.peek() == null)
        {
            handleDynamicArguments(null);
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void onStart()
    {
        WLog.v(TAG, "onStart");
        super.onStart();
    }

    public void onStop()
    {
        WLog.v(TAG, "onStop");
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.d(TAG, "onViewCreated()");
        super.onViewCreated(view, bundle);
    }

    public void onViewStateRestored(Bundle bundle)
    {
        WLog.d(TAG, "onViewStateRestored()");
        super.onViewStateRestored(bundle);
    }

}
