// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.GuestCheckoutTapEvent;
import com.walmart.android.analytics.events.SignInEvent;
import com.walmart.android.data.AssociateLogin;
import com.walmart.android.data.LoginResult;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import com.walmartlabs.ui.FloatLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.account:
//            AccountPresenter, AccountDelegate, CreateAccountPresenter, AssociateLoginPresenter

public class LoginPresenter extends AccountPresenter
{

    private static final int DIALOG_NO_NETWORK = 1;
    private static final int DIALOG_PROGRESS_LOADING = 5;
    private static final int DIALOG_PROGRESS_SIGN_IN = 3;
    private static final int DIALOG_PROGRESS_SIGN_OUT = 4;
    private static final int DIALOG_UNKNOWN_ERROR = 2;
    private Authentication mAuthentication;
    private boolean mCheckAssociate;
    private EditText mEmailAddressEditText;
    private FloatLabel mEmailAddressLabel;
    private View mFocusedView;
    private String mFrom;
    private com.walmart.android.wmservice.Authentication.AuthCallback mLoginCallback;
    private EditText mPasswordEditText;
    private FloatLabel mPasswordLabel;
    private boolean mShowGuest;
    private View mSignInErrorInfoText;
    private int mSignInHeaderTextResId;
    private View mSignInView;
    private final int mTextFieldErrorBg = 0x7f0200fb;
    private final int mTextFieldNormalBg = 0x7f0200fc;
    private boolean mVerifyCredentials;

    public LoginPresenter(Activity activity, String s)
    {
        super(activity);
        mLoginCallback = new com.walmart.android.wmservice.Authentication.AuthCallback() {

            final LoginPresenter this$0;

            public void onFailure(int i)
            {
                handleLoginFailure(i);
            }

            public void onSuccess()
            {
                handleLoginSuccess();
            }

            
            {
                this$0 = LoginPresenter.this;
                super();
            }
        };
        mAuthentication = Services.get().getAuthentication();
        mFrom = s;
    }

    private void checkAssociate()
    {
        Services.get().getWalmartService().getAssociateLoginRequired(new AsyncCallbackOnThread(new Handler()) {

            final LoginPresenter this$0;

            public void onFailureSameThread(Integer integer, AssociateLogin associatelogin)
            {
                handleLoginFailure(integer.intValue());
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (AssociateLogin)obj1);
            }

            public void onSuccessSameThread(AssociateLogin associatelogin)
            {
                dismissDialog(3);
                if (associatelogin.getAssociateLoginRequired())
                {
                    associatelogin = new AssociateLoginPresenter(mActivity);
                    associatelogin.setAccountListener(mAccountListener);
                    pushAndReplacePresenter(associatelogin);
                    return;
                } else
                {
                    finish(false);
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((AssociateLogin)obj);
            }

            
            {
                this$0 = LoginPresenter.this;
                super(handler);
            }
        });
    }

    private void clearErrors()
    {
        mSignInErrorInfoText.setVisibility(8);
        mEmailAddressEditText.setBackgroundResource(mTextFieldNormalBg);
        mPasswordEditText.setBackgroundResource(mTextFieldNormalBg);
        mEmailAddressLabel.clearError();
        mPasswordLabel.clearError();
    }

    private void finish(boolean flag)
    {
        delegateFinish(flag, false, false, (new ArrayList(mDelegates)).iterator());
    }

    private void guestLogin()
    {
        Services.get().getWalmartService().guestLogin(new AsyncCallbackOnThread(new Handler()) {

            final LoginPresenter this$0;

            public void onFailureSameThread(Integer integer, LoginResult loginresult)
            {
                dismissDialog(5);
                if (integer.intValue() == 0x15f92)
                {
                    showDialog(1);
                    return;
                } else
                {
                    showDialog(2);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (LoginResult)obj1);
            }

            public void onSuccessSameThread(LoginResult loginresult)
            {
                dismissDialog(5);
                finish(true);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((LoginResult)obj);
            }

            
            {
                this$0 = LoginPresenter.this;
                super(handler);
            }
        });
        showDialog(5);
    }

    private void handleLoginFailure(int i)
    {
        dismissDialog(3);
        if (i == 2)
        {
            showUsernamePasswordIncorrectInfoText();
            return;
        } else
        {
            showDialogFromAuthError(i);
            return;
        }
    }

    private void handleLoginSuccess()
    {
        trackLogin();
        if (mCheckAssociate)
        {
            checkAssociate();
            return;
        } else
        {
            dismissDialog(3);
            finish(false);
            return;
        }
    }

    private boolean isValidInput()
    {
        boolean flag = true;
        clearErrors();
        if (TextUtils.isEmpty(mEmailAddressEditText.getText()))
        {
            mEmailAddressLabel.setError(0x7f09057a);
            mEmailAddressEditText.setBackgroundResource(mTextFieldErrorBg);
            mEmailAddressEditText.requestFocus();
            flag = false;
        }
        boolean flag1 = flag;
        if (TextUtils.isEmpty(mPasswordEditText.getText()))
        {
            mPasswordLabel.setError(0x7f090579);
            mPasswordEditText.setBackgroundResource(mTextFieldErrorBg);
            flag1 = flag;
            if (flag)
            {
                mPasswordEditText.requestFocus();
                flag1 = false;
            }
        }
        return flag1;
    }

    private void login(String s, String s1)
    {
        mAuthentication.login(s, s1, getMergeType(), mLoginCallback);
        showDialog(3);
    }

    private void prepopulateUsername()
    {
        String s = mAuthentication.getUsername();
        if (!TextUtils.isEmpty(s))
        {
            mEmailAddressEditText.setText(s);
            mPasswordEditText.requestFocus();
        }
    }

    private void setSignInHeaderTextResIdInternal()
    {
        ((TextView)mSignInView.findViewById(0x7f100584)).setText(mSignInHeaderTextResId);
    }

    private void setVerifyCredentialsInternal()
    {
        if (mVerifyCredentials)
        {
            mEmailAddressEditText.setEnabled(false);
            mSignInView.findViewById(0x7f10057f).setVisibility(8);
            ((TextView)mSignInView.findViewById(0x7f100584)).setText(0x7f09057c);
        }
    }

    private void setupLoginView()
    {
        setupTestFairy();
        final Button button = mSignInView.findViewById(0x7f10057e);
        mSignInErrorInfoText = ViewUtil.findViewById(mSignInView, 0x7f100585);
        mEmailAddressEditText = (EditText)ViewUtil.findViewById(button, 0x7f100587);
        mEmailAddressLabel = (FloatLabel)ViewUtil.findViewById(mSignInView, 0x7f100586);
        mEmailAddressLabel.attach(mEmailAddressEditText);
        mPasswordEditText = (EditText)ViewUtil.findViewById(button, 0x7f100589);
        mPasswordLabel = (FloatLabel)ViewUtil.findViewById(mSignInView, 0x7f100588);
        mPasswordLabel.attach(mPasswordEditText);
        button = (Button)button.findViewById(0x7f100108);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final LoginPresenter this$0;

            public void onClick(View view)
            {
                if (isValidInput())
                {
                    login(mEmailAddressEditText.getText().toString(), mPasswordEditText.getText().toString());
                }
            }

            
            {
                this$0 = LoginPresenter.this;
                super();
            }
        });
        mPasswordEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final LoginPresenter this$0;
            final Button val$button;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    button.performClick();
                }
                return false;
            }

            
            {
                this$0 = LoginPresenter.this;
                button = button1;
                super();
            }
        });
        mPasswordEditText.setTypeface(Typeface.DEFAULT);
        mSignInView.findViewById(0x7f10058a).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginPresenter this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(mActivity.getString(0x7f090127)));
                if (view.resolveActivity(mActivity.getPackageManager()) != null)
                {
                    mActivity.startActivity(view);
                    GoogleAnalytics.trackEvent("Account", "Forgot Password", mFrom);
                }
            }

            
            {
                this$0 = LoginPresenter.this;
                super();
            }
        });
        mSignInView.findViewById(0x7f100581).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginPresenter this$0;

            public void onClick(View view)
            {
                guestLogin();
                MessageBus.getBus().post(new GuestCheckoutTapEvent());
            }

            
            {
                this$0 = LoginPresenter.this;
                super();
            }
        });
        mSignInView.findViewById(0x7f100582).setOnClickListener(new android.view.View.OnClickListener() {

            final LoginPresenter this$0;

            public void onClick(View view)
            {
                view = new CreateAccountPresenter(mActivity, mFrom);
                view.setAccountListener(mAccountListener);
                view.addAccountDelegates(mDelegates);
                view.setMergeType(getMergeType());
                pushPresenter(view);
            }

            
            {
                this$0 = LoginPresenter.this;
                super();
            }
        });
        showGuestLoginInternal();
        setSignInHeaderTextResIdInternal();
        prepopulateUsername();
        setVerifyCredentialsInternal();
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(0x7f100587);
        TestFairyUtils.hideView(0x7f100589);
    }

    private void showDialogFromAuthError(int i)
    {
        byte byte0 = 2;
        if (i == 1)
        {
            byte0 = 1;
        }
        showDialog(byte0);
    }

    private void showGuestLoginInternal()
    {
        boolean flag = false;
        View view = mSignInView.findViewById(0x7f100580);
        int i;
        if (mShowGuest)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = mSignInView.findViewById(0x7f100581);
        if (mShowGuest)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void showUsernamePasswordIncorrectInfoText()
    {
        mSignInErrorInfoText.setVisibility(0);
        mEmailAddressEditText.setBackgroundResource(mTextFieldErrorBg);
        mEmailAddressLabel.setError();
        mEmailAddressEditText.requestFocus();
        mPasswordEditText.setBackgroundResource(mTextFieldErrorBg);
        mPasswordLabel.setError();
    }

    private void trackLogin()
    {
        MessageBus.getBus().post(new SignInEvent(mAuthentication.getCustomerId(), mFrom));
    }

    protected com.walmartlabs.anivia.AniviaEventAsJson.Builder anyAniviaPageViewOverride()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = null;
        for (Iterator iterator = mDelegates.iterator(); iterator.hasNext() && builder == null; builder = ((AccountDelegate)iterator.next()).getLoginAniviaPageView()) { }
        return builder;
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f090580);
    }

    public View getView()
    {
        return mSignInView;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mSignInView != null)
        {
            mFocusedView = mSignInView.findFocus();
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setCancelable(true).setPositiveButton("OK", null);
        if (i == 1)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090283).setMessage(0x7f090282);
        } else
        {
            if (i == 3)
            {
                obj = CustomProgressDialog.create(mActivity);
                ((ProgressDialog) (obj)).setCancelable(false);
                ((ProgressDialog) (obj)).setIndeterminate(true);
                ((ProgressDialog) (obj)).setMessage(mActivity.getString(0x7f09057d));
                return ((Dialog) (obj));
            }
            if (i == 4)
            {
                obj = CustomProgressDialog.create(mActivity);
                ((ProgressDialog) (obj)).setCancelable(false);
                ((ProgressDialog) (obj)).setIndeterminate(true);
                ((ProgressDialog) (obj)).setMessage(mActivity.getString(0x7f090583));
                return ((Dialog) (obj));
            }
            if (i == 5)
            {
                obj = CustomProgressDialog.create(mActivity);
                ((ProgressDialog) (obj)).setCancelable(false);
                ((ProgressDialog) (obj)).setIndeterminate(true);
                ((ProgressDialog) (obj)).setMessage(mActivity.getString(0x7f0901ce));
                return ((Dialog) (obj));
            }
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090285).setMessage(0x7f090284);
        }
        return ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).create();
    }

    public void onCreateView(ViewGroup viewgroup)
    {
        if (mSignInView == null)
        {
            mSignInView = ViewUtil.inflate(mActivity, 0x7f04019a, viewgroup);
            setupLoginView();
        }
        if (mFocusedView != null)
        {
            mFocusedView.requestFocus();
            mFocusedView = null;
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        String s = GoogleAnalytics.getAppSection();
        if ("Track Order".equals(s))
        {
            GoogleAnalytics.trackPageView("Track Order Sign In");
            return;
        }
        if ("Cart".equals(s))
        {
            GoogleAnalytics.trackPageView("Cart Sign In");
            return;
        }
        if ("Other".equals(s))
        {
            GoogleAnalytics.trackPageView("More Menu Sign In");
            return;
        } else
        {
            GoogleAnalytics.trackPageView("Sign In");
            return;
        }
    }

    public void overrideCreateAccountButton(android.view.View.OnClickListener onclicklistener)
    {
        mSignInView.findViewById(0x7f100582).setOnClickListener(onclicklistener);
    }

    public void setCheckAssociate(boolean flag)
    {
        mCheckAssociate = flag;
    }

    public void setSignInHeaderTextResId(int i)
    {
        mSignInHeaderTextResId = i;
        if (mSignInView != null)
        {
            setSignInHeaderTextResIdInternal();
        }
    }

    public void setVerifyCredentials(boolean flag)
    {
        mVerifyCredentials = flag;
        if (mSignInView != null)
        {
            prepopulateUsername();
            setVerifyCredentialsInternal();
        }
    }

    public void showGuestLogin(boolean flag)
    {
        mShowGuest = flag;
        if (mSignInView != null)
        {
            showGuestLoginInternal();
        }
    }
















}
