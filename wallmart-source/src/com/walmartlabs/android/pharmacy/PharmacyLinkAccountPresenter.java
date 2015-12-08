// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.android.pharmacy.data.CoolDownData;
import com.walmartlabs.android.pharmacy.data.LinkAccountData;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.ui.dob.DateEditText;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyUtils, PharmacyManager, PharmacyResponse

public abstract class PharmacyLinkAccountPresenter extends Presenter
{

    private static final int DIALOG_PRESCRIPTION_HELP = 1;
    private static final int DIALOG_PROGRESS = 2;
    protected Activity mActivity;
    private Button mCreateAccountButton;
    private DateEditText mDateBirthEditText;
    private FloatLabel mDateBirthLabel;
    private final int mDropDownPadding;
    private View mErrorInfoText;
    private String mLastName;
    private EditText mLastNameEditText;
    private FloatLabel mLastNameLabel;
    private int mPrepopulatedRxNumber;
    private int mPrepopulatedStoreNumber;
    private View mPrescriptionHelpButton;
    private CheckBox mPrivacyNoticeCheckBox;
    private FloatLabel mPrivacyNoticeLabel;
    private View mRootView;
    private EditText mRxNumberEditText;
    private FloatLabel mRxNumberLabel;
    private long mScanStartTime;
    private final int mSpinnerErrorBg;
    private final int mSpinnerNormalBg;
    private EditText mStoreNumberEditText;
    private FloatLabel mStoreNumberLabel;
    private boolean mSuccessfulScan;
    private final int mTextFieldErrorBg;
    private final int mTextFieldNormalBg;

    public PharmacyLinkAccountPresenter(Activity activity)
    {
        mPrepopulatedRxNumber = -1;
        mPrepopulatedStoreNumber = -1;
        mActivity = activity;
        mTextFieldNormalBg = R.drawable.edit_text_regular;
        mTextFieldErrorBg = R.drawable.edit_text_error;
        mSpinnerNormalBg = R.drawable.spinner_background_holo_light;
        mSpinnerErrorBg = R.drawable.spinner_background_holo_light_error;
        mDropDownPadding = mActivity.getResources().getDimensionPixelSize(R.dimen.textfield_padding_left);
    }

    private void clearErrors()
    {
        mErrorInfoText.setVisibility(8);
        mStoreNumberEditText.setBackgroundResource(mTextFieldNormalBg);
        mRxNumberEditText.setBackgroundResource(mTextFieldNormalBg);
        mLastNameEditText.setBackgroundResource(mTextFieldNormalBg);
        mDateBirthEditText.setBackgroundResource(mSpinnerNormalBg);
        PharmacyUtils.restoreLeftPaddingDropDown(mDateBirthEditText, mDropDownPadding);
        mStoreNumberLabel.clearError();
        mRxNumberLabel.clearError();
        mLastNameLabel.clearError();
        mDateBirthLabel.clearError();
        mPrivacyNoticeLabel.clearError();
    }

    private boolean isInputValid()
    {
        boolean flag;
label0:
        {
            clearErrors();
            flag = true;
            boolean flag1 = true;
            String s = mRxNumberEditText.getText().toString();
            String s1 = mStoreNumberEditText.getText().toString();
            boolean flag3 = TextUtils.isEmpty(s);
            boolean flag4 = TextUtils.isEmpty(s1);
            boolean flag5 = PharmacyUtils.isValidPrescriptionNumber(s);
            boolean flag6 = PharmacyUtils.isValidStoreNumber(s1);
            if (flag3)
            {
                mRxNumberEditText.setBackgroundResource(mTextFieldErrorBg);
                flag = flag1;
                if (true)
                {
                    scrollAndFocus(mRxNumberEditText);
                    flag = false;
                }
                mRxNumberLabel.setError(R.string.pharmacy_link_account_rx_number_incomplete);
            }
            flag1 = flag;
            if (flag4)
            {
                mStoreNumberEditText.setBackgroundResource(mTextFieldErrorBg);
                flag1 = flag;
                if (flag)
                {
                    scrollAndFocus(mStoreNumberEditText);
                    flag1 = false;
                }
                mStoreNumberLabel.setError(R.string.pharmacy_link_account_store_number_incomplete);
            }
            flag = flag1;
            if (flag3)
            {
                break label0;
            }
            flag = flag1;
            if (flag4)
            {
                break label0;
            }
            if (flag5)
            {
                flag = flag1;
                if (flag6)
                {
                    break label0;
                }
            }
            flag = false;
            showInvalidStoreOrRxNumberError();
        }
        boolean flag2 = flag;
        if (TextUtils.isEmpty(mLastNameEditText.getText()))
        {
            mLastNameEditText.setBackgroundResource(mTextFieldErrorBg);
            flag2 = flag;
            if (flag)
            {
                scrollAndFocus(mLastNameEditText);
                flag2 = false;
            }
            mLastNameLabel.setError(R.string.pharmacy_link_account_last_name_incomplete);
        }
        flag = flag2;
        if (TextUtils.isEmpty(mDateBirthEditText.getText()))
        {
            mDateBirthEditText.setBackgroundResource(mSpinnerErrorBg);
            PharmacyUtils.restoreLeftPaddingDropDown(mDateBirthEditText, mDropDownPadding);
            flag = flag2;
            if (flag2)
            {
                scrollAndFocus(mDateBirthEditText);
                flag = false;
            }
            mDateBirthLabel.setError(R.string.pharmacy_link_account_dob_incomplete);
        }
        flag2 = flag;
        if (!mPrivacyNoticeCheckBox.isChecked())
        {
            flag2 = flag;
            if (flag)
            {
                scrollAndFocus(mPrivacyNoticeCheckBox);
                flag2 = false;
            }
            mPrivacyNoticeLabel.setError();
        }
        return flag2;
    }

    private void linkAccount()
    {
        Object obj = new LinkAccountData();
        obj.storeNumber = Integer.parseInt(mStoreNumberEditText.getText().toString().trim());
        obj.rxNumber = Integer.parseInt(mRxNumberEditText.getText().toString().trim());
        obj.dob = mDateBirthEditText.getDate();
        obj.lastName = mLastNameEditText.getText().toString().trim();
        Object obj1 = new AsyncCallbackOnThread(new Handler()) {

            final PharmacyLinkAccountPresenter this$0;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(2);
                if (pharmacyresponse != null)
                {
                    switch (pharmacyresponse.status)
                    {
                    default:
                        showDialog(0x10004);
                        onFailure();
                        return;

                    case 1: // '\001'
                        onSuccess();
                        return;

                    case 1008: 
                        showInvalidStoreOrRxNumberError();
                        return;

                    case 1001: 
                        mDateBirthEditText.setBackgroundResource(mSpinnerErrorBg);
                        PharmacyUtils.restoreLeftPaddingDropDown(mDateBirthEditText, mDropDownPadding);
                        mDateBirthLabel.setError(R.string.pharmacy_link_account_dob_doesnt_match_records);
                        scrollAndFocus(mDateBirthEditText);
                        return;

                    case 1002: 
                        DialogFactory.showCoolDownDialog(mActivity, ((CoolDownData)pharmacyresponse.data).dobVerificationAttempted, ((CoolDownData)pharmacyresponse.data).coolDownTimeInSeconds, new android.content.DialogInterface.OnClickListener() {

                            final _cls5 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                popToRoot();
                            }

            
            {
                this$1 = _cls5.this;
                super();
            }
                        });
                        return;

                    case 1022: 
                        mLastNameEditText.setBackgroundResource(mTextFieldErrorBg);
                        break;
                    }
                    mLastNameLabel.setError(R.string.pharmacy_link_account_last_name_doesnt_match_records);
                    scrollAndFocus(mLastNameEditText);
                    return;
                } else
                {
                    showDialog(0x10004);
                    onFailure();
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj2, Object obj3)
            {
                onFailureSameThread((Integer)obj2, (PharmacyResponse)obj3);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj2)
            {
                onSuccessSameThread((PharmacyResponse)obj2);
            }

            
            {
                this$0 = PharmacyLinkAccountPresenter.this;
                super(handler);
            }
        };
        PharmacyManager.get().linkAccount(((LinkAccountData) (obj)), ((AsyncCallbackOnThread) (obj1)));
        showDialog(2);
        obj1 = MessageBus.getBus();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmRxNumberCaptureMethod");
        if (mSuccessfulScan)
        {
            obj = "scan";
        } else
        {
            obj = "type";
        }
        ((Bus) (obj1)).post(builder.putString("entryMethod", ((String) (obj))));
    }

    private void scrollAndFocus(View view)
    {
        PharmacyUtils.scrollAndFocus(mActivity, mRootView, view);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.pharmacy_transfer_rx_patient_last_name);
        TestFairyUtils.hideView(R.id.pharmacy_link_account_rx_number);
        TestFairyUtils.hideView(R.id.pharmacy_link_account_date_birth);
    }

    private void showInvalidStoreOrRxNumberError()
    {
        mErrorInfoText.setVisibility(0);
        mRxNumberLabel.setError();
        mStoreNumberLabel.setError();
        mStoreNumberEditText.setBackgroundResource(mTextFieldErrorBg);
        mRxNumberEditText.setBackgroundResource(mTextFieldErrorBg);
        scrollAndFocus(mStoreNumberEditText);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "errMsgInvalidRxNum"));
    }

    private void trackPageView()
    {
        MessageBus.getBus().post(new AnalyticsPageView("/pharmacy/link_account"));
    }

    private void wireListeners()
    {
        mRootView.findViewById(R.id.pharmacy_link_account_scan_button).setOnClickListener(new android.view.View.OnClickListener() {

            final PharmacyLinkAccountPresenter this$0;

            public void onClick(View view)
            {
                mScanStartTime = System.currentTimeMillis();
                startCode128Scanner();
            }

            
            {
                this$0 = PharmacyLinkAccountPresenter.this;
                super();
            }
        });
        mPrescriptionHelpButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PharmacyLinkAccountPresenter this$0;

            public void onClick(View view)
            {
                showDialog(1);
            }

            
            {
                this$0 = PharmacyLinkAccountPresenter.this;
                super();
            }
        });
        mRootView.findViewById(R.id.pharmacy_link_account_privacy_notice).setOnClickListener(new android.view.View.OnClickListener() {

            final PharmacyLinkAccountPresenter this$0;

            public void onClick(View view)
            {
                showPrivacyNotice();
            }

            
            {
                this$0 = PharmacyLinkAccountPresenter.this;
                super();
            }
        });
        mCreateAccountButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PharmacyLinkAccountPresenter this$0;

            public void onClick(View view)
            {
                if (isInputValid())
                {
                    ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(mRootView.getWindowToken(), 0);
                    linkAccount();
                }
            }

            
            {
                this$0 = PharmacyLinkAccountPresenter.this;
                super();
            }
        });
    }

    public String getTitleText()
    {
        return mActivity.getString(R.string.pharmacy_link_account_title);
    }

    public View getView()
    {
        return mRootView;
    }

    public void handlePrepopulate()
    {
        if (mPrepopulatedRxNumber != -1)
        {
            mRxNumberEditText.setText(String.valueOf(mPrepopulatedRxNumber));
        }
        if (mPrepopulatedStoreNumber != -1)
        {
            mStoreNumberEditText.setText(String.valueOf(mPrepopulatedStoreNumber));
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        mLastName = authenticationstatusevent.lastName;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
        MessageBus.getBus().register(this);
        if (!TextUtils.isEmpty(mLastName) && mLastNameEditText != null)
        {
            mLastNameEditText.setText(mLastName);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i == 1)
        {
            com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity);
            builder.setView(ViewUtil.inflate(mActivity, R.layout.pharmacy_help_scan_link));
            builder.setCancelable(true).setPositiveButton(0x104000a, null);
            return builder.create();
        }
        if (i == 2)
        {
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setCancelable(false);
            progressdialog.setIndeterminate(true);
            progressdialog.setMessage(mActivity.getString(R.string.pharmacy_link_account_creating_account_progress));
            return progressdialog;
        } else
        {
            return DialogFactory.onCreateDialog(i, mActivity);
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, R.layout.pharmacy_link_account, viewgroup);
            mErrorInfoText = ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_error_info_text);
            mStoreNumberEditText = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_store_number);
            mStoreNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_store_number_label);
            mStoreNumberLabel.attach(mStoreNumberEditText);
            mRxNumberEditText = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_rx_number);
            mRxNumberLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_rx_number_label);
            mRxNumberLabel.attach(mRxNumberEditText);
            mLastNameEditText = (EditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_patient_last_name);
            mLastNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_transfer_rx_patient_last_name_label);
            mLastNameLabel.attach(mLastNameEditText);
            mDateBirthEditText = (DateEditText)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_date_birth);
            mDateBirthEditText.setPromptDialog(mActivity.getString(R.string.pharmacy_dob_dialog_enter_dob));
            mDateBirthLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_date_birth_label);
            mDateBirthLabel.attach(mDateBirthEditText);
            mPrivacyNoticeLabel = (FloatLabel)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_privacy_notice_label);
            mPrescriptionHelpButton = ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_help_button);
            mCreateAccountButton = (Button)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_create_account_button);
            mPrivacyNoticeCheckBox = (CheckBox)ViewUtil.findViewById(mRootView, R.id.pharmacy_link_account_privacy_notice_check);
            if (!scannerAvailable())
            {
                mRootView.findViewById(R.id.pharmacy_link_account_scan_button).setVisibility(8);
                ViewUtil.setText(R.id.pharmacy_link_account_info_text, mRootView, mActivity.getString(R.string.pharmacy_link_account_label_rx_info_text));
            }
            wireListeners();
            handlePrepopulate();
            setupTestFairy();
        }
    }

    protected void onFailure()
    {
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }

    protected void onScanResult(String s)
    {
        s = PharmacyUtils.getPrescriptionInfo(s);
        if (s != null)
        {
            mStoreNumberEditText.setText(String.valueOf(((PrescriptionInfo) (s)).storeNumber));
            mRxNumberEditText.setText(String.valueOf(((PrescriptionInfo) (s)).rxNumber));
            scrollAndFocus(mDateBirthEditText);
            postScanAnalyticsEvent("scan");
            mSuccessfulScan = true;
            return;
        } else
        {
            showManualEntry();
            postScanAnalyticsEvent("error");
            return;
        }
    }

    protected void onSuccess()
    {
        pop();
    }

    protected void postScanAnalyticsEvent(String s)
    {
        int i = (int)(System.currentTimeMillis() - mScanStartTime) / 1000;
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("scannerOpenTimeAndResult")).putString("pharmScanResult", s).putInt("pharmScanTime", i));
    }

    public void prepopulate(int i, int j)
    {
        mPrepopulatedRxNumber = i;
        mPrepopulatedStoreNumber = j;
    }

    protected abstract boolean scannerAvailable();

    protected void showManualEntry()
    {
        scrollAndFocus(mStoreNumberEditText);
    }

    protected abstract void showPrivacyNotice();

    protected abstract void startCode128Scanner();


/*
    static long access$002(PharmacyLinkAccountPresenter pharmacylinkaccountpresenter, long l)
    {
        pharmacylinkaccountpresenter.mScanStartTime = l;
        return l;
    }

*/

















}
