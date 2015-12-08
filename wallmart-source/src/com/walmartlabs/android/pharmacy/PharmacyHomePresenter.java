// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.events.ServiceSuspendedEvent;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, TransferRxUserInfoPresenter, EnterNumbersPresenter, PharmacyResponse, 
//            PrescriptionPresenter

public abstract class PharmacyHomePresenter extends Presenter
{

    private static final int DIALOG_NETWORK_ERROR = 0;
    private static final int DIALOG_PHARMACY_LOADING = 1;
    private static final int NO_RESOURCE_ID = 0;
    public static final int REQUEST_CODE_SCAN_TO_REFILL = 1;
    protected static final String TAG = com/walmartlabs/android/pharmacy/PharmacyHomePresenter.getSimpleName();
    protected final Activity mActivity;
    private AuthenticationStatusEvent mAuthenticationStatus;
    private View mPharmacyRootView;

    public PharmacyHomePresenter(Activity activity)
    {
        mActivity = activity;
        setTitleText(mActivity.getString(R.string.pharmacy_title));
    }

    private void checkService()
    {
        ViewUtil.findViewById(mPharmacyRootView, R.id.loading_view).setVisibility(0);
        PharmacyManager.get().getKillSwitchStatus(new AsyncCallbackOnThread(new Handler()) {

            final PharmacyHomePresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                if (pharmacyresponse != null && pharmacyresponse.status == 1009)
                {
                    updateVisibility(false);
                    return;
                } else
                {
                    updateVisibility(true);
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PharmacyHomePresenter.this;
                super(handler);
            }
        });
    }

    private void setupEntry(int i, int j, int k, int l, android.view.View.OnClickListener onclicklistener)
    {
        View view = mPharmacyRootView.findViewById(i);
        if (j != 0)
        {
            ((ImageView)ViewUtil.findViewById(view, R.id.icon)).setImageResource(j);
        }
        ViewUtil.setText(R.id.title, view, k);
        if (l != 0)
        {
            TextView textview = (TextView)ViewUtil.findViewById(view, R.id.description);
            textview.setText(l);
            textview.setVisibility(0);
        }
        view.setOnClickListener(onclicklistener);
    }

    private void startPrescriptions()
    {
        PharmacyManager.OnFlowCompleted onflowcompleted = new PharmacyManager.OnFlowCompleted() {

            final PharmacyHomePresenter this$0;

            public void onFlowCompleted()
            {
                getPresenterStack().popToRoot();
                PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity);
                pushPresenter(prescriptionpresenter);
            }

            
            {
                this$0 = PharmacyHomePresenter.this;
                super();
            }
        };
        PharmacyManager.get().accessPharmacyAuthRequiredFlow(mActivity, getPresenterStack(), onflowcompleted);
        clearSingleClickFlag();
    }

    private void updateVisibility(boolean flag)
    {
        ViewUtil.findViewById(mPharmacyRootView, R.id.loading_view).setVisibility(8);
        TextView textview = (TextView)ViewUtil.findViewById(mPharmacyRootView, R.id.pharmacy_service_suspended);
        if (flag)
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(String.format(Locale.US, "%s %s", new Object[] {
                mActivity.getString(R.string.pharmacy_killswitch_dialog_title), mActivity.getString(R.string.pharmacy_killswitch_dialog_text)
            }));
            textview.setVisibility(0);
        }
        ViewUtil.findViewById(mPharmacyRootView, R.id.pharmacy_scan_to_refill).setEnabled(flag);
        ViewUtil.findViewById(mPharmacyRootView, R.id.pharmacy_my_prescriptions).setEnabled(flag);
        ViewUtil.findViewById(mPharmacyRootView, R.id.pharmacy_transfer_prescription).setEnabled(flag);
    }

    protected abstract Presenter createFourDollarPresenter();

    protected abstract Presenter createPrivacyNoticePresenter();

    protected Presenter createTransferPrescriptionPresenter()
    {
        TransferRxUserInfoPresenter transferrxuserinfopresenter = new TransferRxUserInfoPresenter(mActivity);
        if (mAuthenticationStatus.hasCredentials)
        {
            transferrxuserinfopresenter.prePopulate(mAuthenticationStatus.firstName, mAuthenticationStatus.lastName, mAuthenticationStatus.email);
        }
        return transferrxuserinfopresenter;
    }

    public String getScreenName()
    {
        return "Rx:PharmacyHomepage";
    }

    public View getView()
    {
        return mPharmacyRootView;
    }

    protected abstract boolean isScannerAvailable();

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        mAuthenticationStatus = authenticationstatusevent;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        PharmacyManager.get().cleanDanglingServiceSession();
        MessageBus.getBus().register(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        Dialog dialog = null;
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 43
    //                   1 57;
           goto _L1 _L2 _L3
_L1:
        Dialog dialog1 = dialog;
        if (dialog == null)
        {
            dialog1 = DialogFactory.onCreateDialog(0x10004, mActivity);
        }
        return dialog1;
_L2:
        dialog = DialogFactory.onCreateDialog(0x10004, mActivity);
        continue; /* Loop/switch isn't completed */
_L3:
        dialog = DialogFactory.onCreateDialog(0x10002, mActivity);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mPharmacyRootView == null)
        {
            mPharmacyRootView = ViewUtil.inflate(mActivity, R.layout.pharmacy_home_view, viewgroup);
            mPharmacyRootView.findViewById(R.id.pharmacy_home_privacy_notice).setOnClickListener(new OnSingleClickListener(this) {

                final PharmacyHomePresenter this$0;

                public void onSingleClick(View view)
                {
                    view = createPrivacyNoticePresenter();
                    pushPresenter(view);
                }

            
            {
                this$0 = PharmacyHomePresenter.this;
                super(presenter);
            }
            });
            setupEntries();
        }
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        checkService();
    }

    public void onServiceSuspended(ServiceSuspendedEvent servicesuspendedevent)
    {
        updateVisibility(false);
    }

    protected void setupEntries()
    {
        OnSingleClickListener onsingleclicklistener = new OnSingleClickListener(this) {

            final PharmacyHomePresenter this$0;

            public void onSingleClick(View view)
            {
                int i = view.getId();
                if (i == R.id.pharmacy_scan_to_refill)
                {
                    startEasyRefill();
                    return;
                }
                if (i == R.id.pharmacy_my_prescriptions)
                {
                    startPrescriptions();
                    return;
                }
                if (i == R.id.pharmacy_transfer_prescription)
                {
                    view = createTransferPrescriptionPresenter();
                    pushPresenter(view);
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyTransferInitiate"));
                    return;
                }
                if (i == R.id.pharmacy_four_dollar_prescriptions)
                {
                    view = createFourDollarPresenter();
                    pushPresenter(view);
                    return;
                }
                if (i == R.id.pharmacy_find_a_pharmacy)
                {
                    startFindAPharmacy();
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:Pharmacy Locator Page"));
                    return;
                } else
                {
                    clearSingleClickFlag();
                    return;
                }
            }

            
            {
                this$0 = PharmacyHomePresenter.this;
                super(presenter);
            }
        };
        setupEntry(R.id.pharmacy_scan_to_refill, R.drawable.icn_scan, R.string.pharmacy_scan_to_refill_title, R.string.pharmacy_scan_to_refill_text, onsingleclicklistener);
        setupEntry(R.id.pharmacy_my_prescriptions, R.drawable.icn_my_prescriptions, R.string.pharmacy_my_prescriptions_title, R.string.pharmacy_my_prescriptions_text, onsingleclicklistener);
        setupEntry(R.id.pharmacy_transfer_prescription, R.drawable.icn_transfer_prescription, R.string.pharmacy_transfer_prescriptions_title, 0, onsingleclicklistener);
        setupEntry(R.id.pharmacy_find_a_pharmacy, R.drawable.icn_find_a_pharmacy, R.string.pharmacy_find_a_pharmacy_title, 0, onsingleclicklistener);
        setupEntry(R.id.pharmacy_four_dollar_prescriptions, 0, R.string.pharmacy_four_dollar_prescriptions_title, 0, onsingleclicklistener);
    }

    protected void showManualEntry()
    {
        OrderConfirmationRefillPresenter.RefillListener refilllistener = new OrderConfirmationRefillPresenter.RefillListener() {

            final PharmacyHomePresenter this$0;

            public void refill()
            {
                startEasyRefill();
            }

            
            {
                this$0 = PharmacyHomePresenter.this;
                super();
            }
        };
        pushPresenter(new EnterNumbersPresenter(mActivity, refilllistener), false);
    }

    protected abstract void startEasyRefill();

    protected abstract void startFindAPharmacy();







}
