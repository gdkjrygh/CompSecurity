// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.WalletStatus;
import com.walmartlabs.ui.CodeView;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterInputPresenter

public class EReceiptRegisterVerifyPresenter extends Presenter
{

    private static final String DIALOG_ARGS_WAIT_WINDOW_MINUTES = "waitWindowMinutes";
    private static final int DIALOG_EXHAUSTED = 1;
    private static final int DIALOG_NOT_VALID = 0;
    private static final int DIALOG_NO_NETWORK = 3;
    private static final int DIALOG_PROGRESS = 2;
    private static final int DIALOG_UNKNOWN_ERROR = 4;
    private final Activity mActivity;
    private CodeView mCodeView;
    private final boolean mInputForward;
    private AccountListener mListener;
    private final String mPhoneNumber;
    private View mRootView;

    public EReceiptRegisterVerifyPresenter(Activity activity, String s, boolean flag)
    {
        mActivity = activity;
        mPhoneNumber = s;
        mInputForward = flag;
        setTitleText(mActivity.getString(0x7f0900ea));
    }

    private void verifyCode(CharSequence charsequence)
    {
        showDialog(2);
        EReceiptManager.get().walletRegisterVerify(mPhoneNumber, charsequence.toString(), new AsyncCallbackOnThread(new Handler()) {

            final EReceiptRegisterVerifyPresenter this$0;

            public void onFailureSameThread(Integer integer, WalletStatus walletstatus)
            {
                dismissDialog(2);
                if (integer.intValue() >= 0x15f90)
                {
                    if (integer.intValue() == 0x15f92)
                    {
                        showDialog(3);
                        return;
                    } else
                    {
                        showDialog(4);
                        return;
                    }
                }
                if (walletstatus != null && walletstatus.retriesRemaining <= 0)
                {
                    integer = new Bundle();
                    integer.putInt("waitWindowMinutes", walletstatus.waitWindowMinutes);
                    showDialog(1, integer);
                    integer = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", mActivity.getString(0x7f0900e5, new Object[] {
                        Integer.valueOf(walletstatus.waitWindowMinutes)
                    }));
                    MessageBus.getBus().post(integer);
                    return;
                } else
                {
                    showDialog(0);
                    integer = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", TextUtils.truncate("Oops! The code you entered is not valid. Please check the text message we sent you and enter the code again now", 60));
                    MessageBus.getBus().post(integer);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (WalletStatus)obj1);
            }

            public void onSuccessSameThread(WalletStatus walletstatus)
            {
                dismissDialog(2);
                if (mListener != null)
                {
                    mListener.onLoginCompleted(false, false, false);
                }
                walletstatus = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("phoneNumberAdd");
                MessageBus.getBus().post(walletstatus);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((WalletStatus)obj);
            }

            
            {
                this$0 = EReceiptRegisterVerifyPresenter.this;
                super(handler);
            }
        });
    }

    public View getView()
    {
        return mRootView;
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setMessage(mActivity.getString(0x7f0900cc));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(true);
            return progressdialog;

        case 0: // '\0'
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            builder.setMessage(0x7f0900e9);
            builder.setNeutralButton(0x7f090292, null);
            return builder.create();

        case 1: // '\001'
            i = getDialogArguments().getInt("waitWindowMinutes");
            com.walmart.android.ui.dialog.AlertDialog.Builder builder1 = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
            builder1.setMessage(mActivity.getString(0x7f0900e5, new Object[] {
                Integer.valueOf(i)
            }));
            builder1.setNeutralButton(0x7f090292, null);
            return builder1.create();

        case 3: // '\003'
            return DialogFactory.onCreateDialog(600, mActivity);

        case 4: // '\004'
            return DialogFactory.onCreateDialog(900, mActivity);
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView != null)
        {
            if (mCodeView != null)
            {
                ViewUtil.showKeyboard(mCodeView);
            }
            return;
        } else
        {
            mRootView = mActivity.getLayoutInflater().inflate(0x7f040053, viewgroup, false);
            mCodeView = (CodeView)ViewUtil.findViewById(mRootView, 0x7f10011e);
            mCodeView.setOnCodeEnteredListener(new com.walmartlabs.ui.CodeView.OnCodeEnteredListener() {

                final EReceiptRegisterVerifyPresenter this$0;

                public void onCodeEntered(CharSequence charsequence1)
                {
                    verifyCode(charsequence1);
                }

            
            {
                this$0 = EReceiptRegisterVerifyPresenter.this;
                super();
            }
            });
            ((TextView)ViewUtil.findViewById(mRootView, 0x7f10011d)).setText(mActivity.getString(0x7f0900e6, new Object[] {
                PhoneNumberUtils.formatNumber(mPhoneNumber)
            }));
            viewgroup = (new StringBuilder()).append(mActivity.getText(0x7f0900e7)).append(" ").toString();
            CharSequence charsequence = mActivity.getText(0x7f0900e8);
            TextView textview = (TextView)ViewUtil.findViewById(mRootView, 0x7f10011f);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(viewgroup);
            spannablestringbuilder.append(charsequence);
            spannablestringbuilder.setSpan(new ClickableSpan() {

                final EReceiptRegisterVerifyPresenter this$0;

                public void onClick(View view)
                {
                    if (mInputForward)
                    {
                        view = new EReceiptRegisterInputPresenter(mActivity, false);
                        pushPresenter(view);
                        return;
                    } else
                    {
                        mActivity.onBackPressed();
                        return;
                    }
                }

                public void updateDrawState(TextPaint textpaint)
                {
                    super.updateDrawState(textpaint);
                    textpaint.setUnderlineText(false);
                }

            
            {
                this$0 = EReceiptRegisterVerifyPresenter.this;
                super();
            }
            }, viewgroup.length(), viewgroup.length() + charsequence.length(), 33);
            textview.setText(spannablestringbuilder);
            textview.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Enter Code").putString("section", "eReceipts");
        MessageBus.getBus().post(builder);
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Enter Code").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        MessageBus.getBus().post(builder);
    }

    public void onPushed()
    {
        super.onPushed();
        (new Handler()).postDelayed(new Runnable() {

            final EReceiptRegisterVerifyPresenter this$0;

            public void run()
            {
                if (mCodeView != null)
                {
                    ViewUtil.showKeyboard(mCodeView);
                }
            }

            
            {
                this$0 = EReceiptRegisterVerifyPresenter.this;
                super();
            }
        }, 100L);
    }

    public void setAccountListener(AccountListener accountlistener)
    {
        mListener = accountlistener;
    }












}
