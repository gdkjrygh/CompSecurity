// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.events.SaverViewEvent;
import com.walmart.android.fragments.WalmartPresenterFragment;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.ui.ViewStackLayout;
import com.walmart.android.util.ScannerUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.EReceiptScanner;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverRedeemActivity, SaverScannerActivity, SaverSubmitReceiptActivity

public abstract class SaverFragment extends WalmartPresenterFragment
{
    protected static class EReceiptScannerImpl
        implements EReceiptScanner
    {

        private final Activity mActivity;
        private final SaverFragment mFragment;

        public String getUuidFromScan(int i, int j, Intent intent)
        {
            return null;
        }

        public void onScan()
        {
            mFragment.launchScanner();
        }

        public boolean scannerAvailable()
        {
            return ScannerUtil.scannerAvailable(mActivity);
        }

        public EReceiptScannerImpl(Activity activity, SaverFragment saverfragment)
        {
            mActivity = activity;
            mFragment = saverfragment;
        }
    }


    protected static final int REQUEST_CODE_BARCODE_SCAN = 2;
    protected static final int REQUEST_CODE_SIGN_IN = 1;
    private static final String TAG = com/walmart/android/app/saver/SaverFragment.getSimpleName();
    private boolean mBlockGetItBackBar;
    private View mGetItBackBar;
    private int mRedeemableCents;

    public SaverFragment()
    {
    }

    private void addHeightCheckListener()
    {
        mFragmentRootView.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final SaverFragment this$0;

            public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                boolean flag = mBlockGetItBackBar;
                if (l >= l1 || (double)l >= (double)ViewUtil.getScreenHeight(getActivity()) * 0.66000000000000003D) goto _L2; else goto _L1
_L1:
                mBlockGetItBackBar = true;
_L4:
                if (flag != mBlockGetItBackBar)
                {
                    updateGetItBackBarVisibility();
                    
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SaverFragment.this;
                super();
            }
        });
    }

    private void updateGetItBackBar(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary overallsavingssummary)
    {
        if (overallsavingssummary == null || !overallsavingssummary.canRedeemNow() && !overallsavingssummary.isAmexRegisterEnabled())
        {
            mRedeemableCents = 0;
        } else
        {
            mRedeemableCents = overallsavingssummary.redeemableCents;
            ViewUtil.setText(0x7f100491, mGetItBackBar, getString(0x7f0904be, new Object[] {
                Float.valueOf((float)overallsavingssummary.redeemableCents / 100F)
            }));
        }
        updateGetItBackBarVisibility();
    }

    private void updateGetItBackBarVisibility()
    {
        Presenter presenter = mPresenterStack.peek();
        if (!mBlockGetItBackBar && (presenter instanceof HasGetItBackBar) && ((HasGetItBackBar)presenter).getRedeemLimit() < mRedeemableCents)
        {
            mGetItBackBar.setVisibility(0);
            return;
        } else
        {
            mGetItBackBar.setVisibility(8);
            return;
        }
    }

    public View getView()
    {
        WLog.v(TAG, "getView");
        return getView();
    }

    protected void handleDynamicArguments(Bundle bundle)
    {
        WLog.d(TAG, "handleDynamicArguments");
    }

    protected void launchRedeem()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverRedeemActivity);
        intent.putExtra("EXTRA_SHOW_REDEEM", true);
        startActivity(intent);
        getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    protected void launchScanner()
    {
        Intent intent;
        if (ScannerUtil.scannerAvailable(getActivity()))
        {
            intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverScannerActivity);
            intent.putExtra("mode", 1);
        } else
        {
            intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverSubmitReceiptActivity);
        }
        intent.addFlags(0x20000);
        startActivityForResult(intent, 2);
    }

    public void onActivityCreated(Bundle bundle)
    {
        WLog.v(TAG, "onActivityCreated");
        onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        WLog.d(TAG, (new StringBuilder()).append("onActivityResult, req ").append(i).append(", res ").append(j).toString());
        if (i == 2 && j == 12)
        {
            launchScanner();
        }
        onActivityResult(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        WLog.v(TAG, "onCreate");
        onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (mFragmentRootView == null)
        {
            mFragmentRootView = layoutinflater.inflate(0x7f04015f, viewgroup, false);
            mFragmentRootView.setLayoutParams(new LayoutParams(-1, -1));
            mViewStackContainer = (ViewStackLayout)mFragmentRootView.findViewById(0x7f1004cd);
            mGetItBackBar = mFragmentRootView.findViewById(0x7f1004ce);
            mGetItBackBar.findViewById(0x7f100492).setOnClickListener(new android.view.View.OnClickListener() {

                final SaverFragment this$0;

                public void onClick(View view)
                {
                    launchRedeem();
                }

            
            {
                this$0 = SaverFragment.this;
                super();
            }
            });
            addHeightCheckListener();
            mPresenterStack = new PresenterStack(mViewStackContainer);
            layoutinflater = onCreatePresenter();
            if (layoutinflater != null)
            {
                mPresenterStack.pushPresenter(layoutinflater, false);
            }
        }
        MessageBus.getBus().register(this);
        return mFragmentRootView;
    }

    public void onDestroy()
    {
        WLog.v(TAG, "onDestroy");
        onDestroy();
    }

    public void onDestroyView()
    {
        WLog.v(TAG, "onDestroyView");
        onDestroyView();
        MessageBus.getBus().unregister(this);
    }

    public void onDetach()
    {
        WLog.v(TAG, "onDetach");
        onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        WLog.v(TAG, "onHiddenChanged");
        onHiddenChanged(flag);
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        WLog.v(TAG, "onInflate");
        onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        WLog.v(TAG, "onPause");
        onPause();
    }

    public void onPresenterPopped(Presenter presenter)
    {
        onPresenterPopped(presenter);
        updateGetItBackBarVisibility();
    }

    public void onPresenterPushed(Presenter presenter)
    {
        onPresenterPushed(presenter);
        updateGetItBackBarVisibility();
    }

    public void onResume()
    {
        onResume();
        Bundle bundle = getDynamicArguments();
        String s1 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("onResume() with");
        String s;
        if (bundle != null)
        {
            s = "";
        } else
        {
            s = "out";
        }
        stringbuilder = stringbuilder.append(s).append(" arguments:");
        if (bundle != null)
        {
            s = bundle.toString();
        } else
        {
            s = "";
        }
        WLog.v(s1, stringbuilder.append(s).toString());
        if (bundle == null) goto _L2; else goto _L1
_L1:
        mPresenterStack.popToRootSilent();
        mPresenterStack.clear();
        handleDynamicArguments(bundle);
        setDynamicArguments(null);
_L4:
        MessageBus.getBus().post(new SaverViewEvent());
        return;
_L2:
        if (mPresenterStack.peek() == null)
        {
            handleDynamicArguments(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        updateGetItBackBar(saversummaryupdateevent.mOverallSavingsSummary);
    }

    public void onStart()
    {
        WLog.v(TAG, "onStart");
        if (getDynamicArguments() != null)
        {
            mPresenterStack.popToRootSilent();
            mPresenterStack.clear();
        }
        onStart();
    }

    public void onStop()
    {
        WLog.v(TAG, "onStop");
        onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        WLog.v(TAG, "onViewCreated");
        onViewCreated(view, bundle);
    }




/*
    static boolean access$002(SaverFragment saverfragment, boolean flag)
    {
        saverfragment.mBlockGetItBackBar = flag;
        return flag;
    }

*/




    // Unreferenced inner class com/walmart/android/app/saver/SaverFragment$2$1

/* anonymous class */
}
