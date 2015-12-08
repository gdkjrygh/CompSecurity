// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.CreateAccountAttemptEvent;
import com.walmart.android.analytics.events.CreateAccountSuccessEvent;
import com.walmart.android.app.PrivacyPolicyPresenter;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.account:
//            AccountPresenter, AccountDelegate

public class CreateAccountPresenter extends AccountPresenter
{
    private static class ErrorInfo
    {

        final int mEditTexId;
        final int mErrorMsgResId;
        final int mFloatLabelId;

        public ErrorInfo(int i, int j, int k)
        {
            mEditTexId = i;
            mFloatLabelId = j;
            mErrorMsgResId = k;
        }
    }


    private static final int DIALOG_NETWORK_ERROR = 2;
    private static final int DIALOG_PROGRESS = 1;
    private static final int DIALOG_UNKNOWN_ERROR = 3;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String ORIGIN_ERECEIPTS = "eReceipts";
    private static final String ORIGIN_GUEST_CHECKOUT = "GuestXO";
    private static final String ORIGIN_SCAN_AND_GO = "SnG";
    private static final String ORIGIN_SIGN_IN = "SignIn";
    private static final String TAG = com/walmart/android/app/account/CreateAccountPresenter.getSimpleName();
    private static final Pattern mEmailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final HashMap sErrorMap;
    private ScrollView mCreateAccountView;
    private String mEmail;
    private FloatLabel mEmailAddressLabel;
    private EditText mFirstEditTextWithError;
    private String mFirstName;
    private FloatLabel mFirstNameLabel;
    private final String mFrom;
    private String mLastName;
    private FloatLabel mLastNameLabel;
    private String mPassword;
    private FloatLabel mPasswordLabel;
    private boolean mSpam;
    private final int mTextFieldErrorBg = 0x7f0200fb;
    private final int mTextFieldNormalBg = 0x7f0200fc;

    public CreateAccountPresenter(Activity activity, String s)
    {
        super(activity);
        mFrom = s;
    }

    private boolean anyOptOut()
    {
        boolean flag = false;
        for (Iterator iterator = mDelegates.iterator(); iterator.hasNext() && !flag; flag = ((AccountDelegate)iterator.next()).optOut()) { }
        return flag;
    }

    private void clearErrors()
    {
        setDefaultBackGround(0x7f1000c6);
        setDefaultBackGround(0x7f1000c8);
        setDefaultBackGround(0x7f1000ca);
        setDefaultBackGround(0x7f1000cc);
        mFirstNameLabel.clearError();
        mLastNameLabel.clearError();
        mEmailAddressLabel.clearError();
        mPasswordLabel.clearError();
        mFirstEditTextWithError = null;
    }

    private void createAccount()
    {
        Services.get().getAuthentication().createAccount(mFirstName, mLastName, mEmail, mPassword, mSpam, getMergeType(), new com.walmart.android.wmservice.Authentication.CreateAccountCallback() {

            final CreateAccountPresenter this$0;

            public void onFailure(int i, String as[])
            {
                dismissDialog(1);
                if (as != null)
                {
                    int k = as.length;
                    for (int j = 0; j < k; j++)
                    {
                        String s = as[j];
                        handleError(s);
                    }

                }
                if (mFirstEditTextWithError != null)
                {
                    scrollToFirstError();
                    return;
                } else
                {
                    showDialogFromGenericErrorCode(i);
                    return;
                }
            }

            public void onSuccess()
            {
                dismissDialog(1);
                Iterator iterator = (new ArrayList(mDelegates)).iterator();
                delegateFinish(false, true, mSpam, iterator);
                MessageBus.getBus().post(new CreateAccountSuccessEvent(mFrom));
            }

            
            {
                this$0 = CreateAccountPresenter.this;
                super();
            }
        });
        showDialog(1);
        MessageBus.getBus().post(new CreateAccountAttemptEvent());
    }

    private void getInputData()
    {
        mFirstName = ViewUtil.getText(mCreateAccountView, 0x7f1000c6).trim();
        mLastName = ViewUtil.getText(mCreateAccountView, 0x7f1000c8).trim();
        mEmail = ViewUtil.getText(mCreateAccountView, 0x7f1000ca).trim();
        mPassword = ViewUtil.getText(mCreateAccountView, 0x7f1000cc).trim();
        mSpam = ((CheckBox)mCreateAccountView.findViewById(0x7f1000ce)).isChecked();
    }

    private void handleError(String s)
    {
        ErrorInfo errorinfo = (ErrorInfo)sErrorMap.get(s);
        if (errorinfo != null)
        {
            s = (EditText)ViewUtil.findViewById(mCreateAccountView, errorinfo.mEditTexId);
            FloatLabel floatlabel = (FloatLabel)ViewUtil.findViewById(mCreateAccountView, errorinfo.mFloatLabelId);
            s.setBackgroundResource(mTextFieldErrorBg);
            floatlabel.setError(errorinfo.mErrorMsgResId);
            if (mFirstEditTextWithError == null)
            {
                mFirstEditTextWithError = s;
            }
            return;
        } else
        {
            WLog.w(TAG, (new StringBuilder()).append("Create account failed, with unexpected error code: ").append(s).toString());
            return;
        }
    }

    private void handlePrepopulate()
    {
        EditText edittext = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c6);
        EditText edittext1 = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c8);
        EditText edittext2 = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000ca);
        if (!TextUtils.isEmpty(mFirstName))
        {
            edittext.setText(mFirstName);
        }
        if (!TextUtils.isEmpty(mLastName))
        {
            edittext1.setText(mLastName);
        }
        if (!TextUtils.isEmpty(mEmail))
        {
            edittext2.setText(mEmail);
        }
    }

    private void scrollToFirstError()
    {
        if (mFirstEditTextWithError != null)
        {
            mFirstEditTextWithError.clearFocus();
            mFirstEditTextWithError.requestFocus();
        }
    }

    private void setDefaultBackGround(int i)
    {
        ((EditText)ViewUtil.findViewById(mCreateAccountView, i)).setBackgroundResource(mTextFieldNormalBg);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(0x7f1000c6);
        TestFairyUtils.hideView(0x7f1000c8);
        TestFairyUtils.hideView(0x7f1000ca);
        TestFairyUtils.hideView(0x7f1000cc);
    }

    private void showDialogFromGenericErrorCode(int i)
    {
        switch (i)
        {
        default:
            showDialog(3);
            return;

        case 90002: 
            showDialog(2);
            break;
        }
    }

    private void validateAndCreateAccount()
    {
        clearErrors();
        if (validateInput())
        {
            createAccount();
            return;
        } else
        {
            scrollToFirstError();
            return;
        }
    }

    private boolean validateInput()
    {
        if ("".equals(mFirstName))
        {
            handleError("invalidFirstName");
        }
        if ("".equals(mLastName))
        {
            handleError("invalidLastName");
        }
        if ("".equals(mEmail))
        {
            handleError("missingEmailInReg");
        } else
        if (!mEmailPattern.matcher(mEmail).matches())
        {
            handleError("invalidEmail");
        }
        if ("".equals(mPassword))
        {
            handleError("missingPasswordInRegistration");
        } else
        if (mPassword.length() < 6 || mPassword.length() > 11)
        {
            handleError("invalidPasswordLength");
        }
        return mFirstEditTextWithError == null;
    }

    protected com.walmartlabs.anivia.AniviaEventAsJson.Builder anyAniviaPageViewOverride()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = null;
        for (Iterator iterator = mDelegates.iterator(); iterator.hasNext() && builder == null; builder = ((AccountDelegate)iterator.next()).getCreateAccountAniviaPageView()) { }
        return builder;
    }

    public String getTitleText()
    {
        return "Create Account";
    }

    public View getView()
    {
        return mCreateAccountView;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        GoogleAnalytics.trackEvent("Account", "Create Account Start", mFrom);
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setCancelable(true).setPositiveButton("OK", null);
        if (1 == i)
        {
            obj = CustomProgressDialog.create(mActivity);
            ((ProgressDialog) (obj)).setCancelable(false);
            ((ProgressDialog) (obj)).setIndeterminate(true);
            ((ProgressDialog) (obj)).setMessage("Creating account");
            return ((Dialog) (obj));
        }
        if (2 == i)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090283).setMessage(0x7f090282);
        } else
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090285).setMessage(0x7f090284);
        }
        return ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).create();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mCreateAccountView == null)
        {
            mCreateAccountView = (ScrollView)ViewUtil.inflate(mActivity, 0x7f040038, viewgroup);
            viewgroup = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c6);
            mFirstNameLabel = (FloatLabel)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c5);
            mFirstNameLabel.attach(viewgroup);
            viewgroup = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c8);
            mLastNameLabel = (FloatLabel)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c7);
            mLastNameLabel.attach(viewgroup);
            viewgroup = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000ca);
            mEmailAddressLabel = (FloatLabel)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c9);
            mEmailAddressLabel.attach(viewgroup);
            viewgroup = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000cc);
            mPasswordLabel = (FloatLabel)ViewUtil.findViewById(mCreateAccountView, 0x7f1000cb);
            mPasswordLabel.attach(viewgroup);
            mCreateAccountView.findViewById(0x7f1000d0).setOnClickListener(new android.view.View.OnClickListener() {

                final CreateAccountPresenter this$0;

                public void onClick(View view)
                {
                    getInputData();
                    validateAndCreateAccount();
                    ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(mCreateAccountView.getWindowToken(), 0);
                }

            
            {
                this$0 = CreateAccountPresenter.this;
                super();
            }
            });
            ((TextView)mCreateAccountView.findViewById(0x7f1000cf)).setOnClickListener(new android.view.View.OnClickListener() {

                final CreateAccountPresenter this$0;

                public void onClick(View view)
                {
                    pushPresenter(new PrivacyPolicyPresenter(mActivity));
                }

            
            {
                this$0 = CreateAccountPresenter.this;
                super();
            }
            });
            ((CheckBox)ViewUtil.findViewById(mCreateAccountView, 0x7f1000cd)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final CreateAccountPresenter this$0;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    compoundbutton = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000cc);
                    char c;
                    if (flag)
                    {
                        c = '\220';
                    } else
                    {
                        c = '\200';
                    }
                    compoundbutton.setInputType(c | '\001');
                    compoundbutton.setSelection(compoundbutton.getText().length());
                    if (flag || TextUtils.isEmpty(compoundbutton.getText()))
                    {
                        compoundbutton.setTypeface(Typeface.DEFAULT);
                    }
                }

            
            {
                this$0 = CreateAccountPresenter.this;
                super();
            }
            });
            if (anyOptOut())
            {
                viewgroup = (CheckBox)ViewUtil.findViewById(mCreateAccountView, 0x7f1000ce);
                viewgroup.setChecked(false);
                viewgroup.setVisibility(8);
            }
            setupTestFairy();
            handlePrepopulate();
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        GoogleAnalytics.trackPageView("Create Account");
        AnalyticsHelper.post(AnalyticsHelper.prepareCreateAccountPageViewEvent());
    }

    public void onPushed()
    {
        EditText edittext = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c6);
        EditText edittext1 = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000c8);
        EditText edittext2 = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000ca);
        if (!TextUtils.isEmpty(edittext.getText().toString()))
        {
            if (TextUtils.isEmpty(edittext1.getText().toString()))
            {
                edittext = edittext1;
            } else
            if (TextUtils.isEmpty(edittext2.getText().toString()))
            {
                edittext = edittext2;
            } else
            {
                edittext = (EditText)ViewUtil.findViewById(mCreateAccountView, 0x7f1000cc);
            }
        }
        edittext.requestFocus();
    }

    public void prepopulate(String s, String s1, String s2)
    {
        mFirstName = s;
        mLastName = s1;
        mEmail = s2;
    }

    static 
    {
        sErrorMap = new HashMap();
        sErrorMap.put("invalidFirstName", new ErrorInfo(0x7f1000c6, 0x7f1000c5, 0x7f0900b3));
        sErrorMap.put("invalidFirstNameFormat", new ErrorInfo(0x7f1000c6, 0x7f1000c5, 0x7f0900b4));
        sErrorMap.put("firstName.MaxLength", new ErrorInfo(0x7f1000c6, 0x7f1000c5, 0x7f0900b5));
        sErrorMap.put("invalidLastName", new ErrorInfo(0x7f1000c8, 0x7f1000c7, 0x7f0900b7));
        sErrorMap.put("invalidLastNameFormat", new ErrorInfo(0x7f1000c8, 0x7f1000c7, 0x7f0900b8));
        sErrorMap.put("lastname.MaxLength", new ErrorInfo(0x7f1000c8, 0x7f1000c7, 0x7f0900b9));
        sErrorMap.put("missingEmailInReg", new ErrorInfo(0x7f1000ca, 0x7f1000c9, 0x7f0900b0));
        sErrorMap.put("invalidEmail", new ErrorInfo(0x7f1000ca, 0x7f1000c9, 0x7f0900b1));
        sErrorMap.put("missingPasswordInRegistration", new ErrorInfo(0x7f1000cc, 0x7f1000cb, 0x7f0900bc));
        sErrorMap.put("invalidPasswordInReg", new ErrorInfo(0x7f1000cc, 0x7f1000cb, 0x7f0900be));
        sErrorMap.put("invalidPasswordLength", new ErrorInfo(0x7f1000cc, 0x7f1000cb, 0x7f0900bf));
        sErrorMap.put("userAlreadyExists", new ErrorInfo(0x7f1000ca, 0x7f1000c9, 0x7f0900c1));
    }












}
