// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterVerifyPresenter

public class EReceiptRegisterInputPresenter extends Presenter
{

    private static final int DIALOG_EXHAUSTED = 4;
    private static final int DIALOG_INFO = 0;
    private static final int DIALOG_NO_NETWORK = 2;
    private static final int DIALOG_PROGRESS = 1;
    private static final int DIALOG_UNKNOWN_ERROR = 3;
    public static final int MAX_RETRIES = 3;
    private static final long sTryTimestamps[] = new long[3];
    private final Activity mActivity;
    private AccountListener mListener;
    private EditText mPhoneNbrEditText;
    private FloatLabel mPhoneNbrLabel;
    private View mRootView;
    private final int mTextFieldErrorBg = 0x7f0200fb;
    private final int mTextFieldNormalBg = 0x7f0200fc;
    private final boolean mVerificationForward;

    public EReceiptRegisterInputPresenter(Activity activity, boolean flag)
    {
        mActivity = activity;
        mVerificationForward = flag;
        setTitleText(mActivity.getString(0x7f0900e0));
    }

    private static boolean areTimestampsOk()
    {
        return sTryTimestamps[findOldestTryTimestamp()] + 0x1b7740L < System.currentTimeMillis();
    }

    private void clearErrors()
    {
        mPhoneNbrEditText.setBackgroundResource(mTextFieldNormalBg);
        mPhoneNbrLabel.clearError();
    }

    private static int findOldestTryTimestamp()
    {
        int i = 0;
        int j = 0;
        long l1;
        for (long l = 0x7fffffffffffffffL; i < 3; l = l1)
        {
            l1 = l;
            if (l > sTryTimestamps[i])
            {
                l1 = sTryTimestamps[i];
                j = i;
            }
            i++;
        }

        return j;
    }

    private boolean isValidInput()
    {
        boolean flag = true;
        clearErrors();
        if (TextUtils.isEmpty(mPhoneNbrEditText.getText()))
        {
            mPhoneNbrLabel.setError(0x7f0900dd);
            mPhoneNbrEditText.setBackgroundResource(mTextFieldErrorBg);
            mPhoneNbrEditText.requestFocus();
            flag = false;
        }
        return flag;
    }

    private static void markTryTimestamp()
    {
        long l = System.currentTimeMillis();
        int i = findOldestTryTimestamp();
        sTryTimestamps[i] = l;
    }

    private void registerPhoneNumber(String s)
    {
        if (areTimestampsOk())
        {
            showDialog(1);
            EReceiptManager.get().walletRegister(s, new AsyncCallbackOnThread(s) {

                final EReceiptRegisterInputPresenter this$0;
                final String val$phoneNumber;

                public void onFailureSameThread(Integer integer, Boolean boolean1)
                {
                    clearSingleClickFlag();
                    dismissDialog(1);
                    if (integer.intValue() >= 0x15f90)
                    {
                        if (integer.intValue() == 0x15f92)
                        {
                            showDialog(2);
                            return;
                        } else
                        {
                            showDialog(3);
                            return;
                        }
                    } else
                    {
                        EReceiptRegisterInputPresenter.markTryTimestamp();
                        mPhoneNbrLabel.setError(0x7f0900df);
                        mPhoneNbrEditText.setBackgroundResource(mTextFieldErrorBg);
                        mPhoneNbrEditText.requestFocus();
                        return;
                    }
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (Boolean)obj1);
                }

                public void onSuccessSameThread(Boolean boolean1)
                {
                    EReceiptRegisterInputPresenter.markTryTimestamp();
                    dismissDialog(1);
                    SharedPreferencesUtil.setEReceiptPhoneNumber(mActivity, phoneNumber);
                    if (mVerificationForward)
                    {
                        boolean1 = new EReceiptRegisterVerifyPresenter(mActivity, phoneNumber, false);
                        boolean1.setAccountListener(mListener);
                        pushPresenter(boolean1);
                        updateRegisterButton();
                        return;
                    } else
                    {
                        mActivity.onBackPressed();
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((Boolean)obj);
                }

            
            {
                this$0 = EReceiptRegisterInputPresenter.this;
                phoneNumber = s;
                super(final_handler);
            }
            });
            return;
        } else
        {
            showDialog(4);
            s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", com.walmart.android.util.TextUtils.truncate("For your security, you must wait 30 minutes before trying to register again", 60));
            MessageBus.getBus().post(s);
            return;
        }
    }

    private void trackPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Enter Phone Number").putString("section", "eReceipts");
        MessageBus.getBus().post(builder);
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Enter Phone Number").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        MessageBus.getBus().post(builder);
    }

    private void updateRegisterButton()
    {
        ((TextView)ViewUtil.findViewById(mRootView, 0x7f10011b)).setText(0x7f0900e2);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder1;
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            builder.setTitle(0x7f0900db).setMessage(0x7f0900da).setNeutralButton(0x7f090292, null);
            return builder.create();

        case 1: // '\001'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setMessage(mActivity.getString(0x7f0900cc));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(true);
            return progressdialog;

        case 2: // '\002'
            return DialogFactory.onCreateDialog(600, mActivity);

        case 3: // '\003'
            return DialogFactory.onCreateDialog(900, mActivity);

        case 4: // '\004'
            builder1 = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            break;
        }
        builder1.setMessage(0x7f0900d9).setNeutralButton(0x7f090292, null);
        return builder1.create();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = mActivity.getLayoutInflater().inflate(0x7f040052, viewgroup, false);
            mPhoneNbrEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f100118);
            mPhoneNbrEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
            mPhoneNbrLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100117);
            mPhoneNbrLabel.attach(mPhoneNbrEditText);
            ViewUtil.findViewById(mRootView, 0x7f100119).setOnClickListener(new OnSingleClickListener(this) {

                final EReceiptRegisterInputPresenter this$0;

                public void onSingleClick(View view)
                {
                    showDialog(0);
                    view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Why Enter Phone Number").putString("section", "Saver").putString("subCategory", "Savings Catcher");
                    MessageBus.getBus().post(view);
                }

            
            {
                this$0 = EReceiptRegisterInputPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f10011c).setOnClickListener(new OnSingleClickListener(this) {

                final EReceiptRegisterInputPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mListener != null)
                    {
                        mListener.onLoginCompleted(false, false, false);
                    } else
                    {
                        mActivity.onBackPressed();
                    }
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("registerAction")).putString("action", "not now"));
                }

            
            {
                this$0 = EReceiptRegisterInputPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f10011b).setOnClickListener(new OnSingleClickListener(this) {

                final EReceiptRegisterInputPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (!isValidInput())
                    {
                        clearSingleClickFlag();
                    } else
                    {
                        view = PhoneNumberUtils.stripSeparators(mPhoneNbrEditText.getText().toString());
                        registerPhoneNumber(view);
                        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("registerAction")).putString("action", "register"));
                        if (!TextUtils.isEmpty(SharedPreferencesUtil.getEReceiptPhoneNumber(mActivity)))
                        {
                            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("requestResendCode"));
                            return;
                        }
                    }
                }

            
            {
                this$0 = EReceiptRegisterInputPresenter.this;
                super(presenter);
            }
            });
            ((TextView)ViewUtil.findViewById(mRootView, 0x7f10011a)).setMovementMethod(WalmartLinkMovementMethod.getInstance(mActivity));
            viewgroup = SharedPreferencesUtil.getEReceiptPhoneNumber(mActivity);
            if (!TextUtils.isEmpty(viewgroup))
            {
                mPhoneNbrEditText.setText(viewgroup);
                updateRegisterButton();
            }
        }
    }

    public void onPushed()
    {
        super.onPushed();
        trackPageView();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        trackPageView();
    }

    public void setAccountListener(AccountListener accountlistener)
    {
        mListener = accountlistener;
    }

















}
