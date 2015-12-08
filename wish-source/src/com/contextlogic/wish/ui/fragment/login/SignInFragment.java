// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.manager.LoginServiceManager;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.testing.WishTestingUtil;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import com.contextlogic.wish.ui.fragment.base.BaseLoginContentFragment;
import com.contextlogic.wish.ui.fragment.login.email.EmailForgotPasswordFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

public class SignInFragment extends BaseLoginContentFragment
{

    public static final String ARG_EMAIL_RELOGIN_MODE = "ArgEmailReloginMode";
    private EditText emailText;
    private View facebookButton;
    private View googleButton;
    private ProgressDialog loadingSpinner;
    private boolean loggingIn;
    private LoginServiceManager loginServiceManager;
    private EditText passwordText;
    private boolean useEmailReloginMode;

    public SignInFragment()
    {
    }

    private String extractEditTextValue(EditText edittext)
    {
        if (edittext == null)
        {
            return null;
        }
        EditText edittext1;
        if (edittext.getText() == null)
        {
            edittext = "";
        } else
        {
            edittext = edittext.getText().toString().trim();
        }
        edittext1 = edittext;
        if (edittext.equals(""))
        {
            edittext1 = null;
        }
        return edittext1;
    }

    private void handleCreateAccount()
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.CreateAccountSelect);
        if (getActivity() == null)
        {
            return;
        }
        LoginActivity loginactivity = (LoginActivity)getActivity();
        SignupFragment signupfragment = new SignupFragment();
        String s = extractEditTextValue(emailText);
        if (s != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("ArgPrefillEmail", s);
            signupfragment.setArguments(bundle);
        }
        loginactivity.setModalContentFragment(signupfragment, false);
    }

    private void handleDone()
    {
        while (getActivity() == null || loggingIn) 
        {
            return;
        }
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Done);
        hideKeyboard();
        if (validateFields())
        {
            performLogin();
            return;
        } else
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060063));
            return;
        }
    }

    private void handleForgotPasswordClicked()
    {
        if (getActivity() != null)
        {
            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ForgotPassword);
            ((LoginActivity)getActivity()).setModalContentFragment(new EmailForgotPasswordFragment(), false);
        }
    }

    private void handleLoginError(boolean flag, boolean flag1, final String dialog)
    {
        if (getActivity() == null)
        {
            return;
        }
        loggingIn = false;
        hideLoadingSpinner();
        WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
        Object obj = dialog;
        if (dialog == null)
        {
            obj = getActivity().getString(0x7f060035);
        }
        dialog = new Dialog(getActivity(), 0x7f0b00ff);
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f03003c);
        ((TextView)dialog.findViewById(0x7f0d015e)).setText(getActivity().getString(0x7f06030d));
        ((TextView)dialog.findViewById(0x7f0d015f)).setText(((CharSequence) (obj)));
        obj = (Button)dialog.findViewById(0x7f0d0160);
        ((Button) (obj)).setText(0x7f060444);
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                dialog.dismiss();
            }

            
            {
                this$0 = SignInFragment.this;
                dialog = dialog1;
                super();
            }
        });
        obj = (Button)dialog.findViewById(0x7f0d0161);
        ((Button) (obj)).setText(0x7f060102);
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                handleCreateAccount();
                dialog.dismiss();
            }

            
            {
                this$0 = SignInFragment.this;
                dialog = dialog1;
                super();
            }
        });
        dialog.findViewById(0x7f0d0162).setVisibility(8);
        dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final SignInFragment this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
        dialog.show();
    }

    private void hideKeyboard()
    {
        InputMethodManager inputmethodmanager;
        if (getActivity() != null)
        {
            if ((inputmethodmanager = (InputMethodManager)getActivity().getSystemService("input_method")) != null)
            {
                try
                {
                    inputmethodmanager.hideSoftInputFromWindow(emailText.getWindowToken(), 0);
                    return;
                }
                catch (Throwable throwable)
                {
                    return;
                }
            }
        }
    }

    private void hideLoadingSpinner()
    {
        if (loadingSpinner != null)
        {
            try
            {
                loadingSpinner.dismiss();
            }
            catch (Exception exception) { }
            loadingSpinner = null;
        }
    }

    private void performLogin()
    {
        showLoadingSpinner();
        String s = extractEditTextValue(emailText);
        String s1 = extractEditTextValue(passwordText);
        loggingIn = true;
        UserPreferences.setForceRelogin(true);
        loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

            final SignInFragment this$0;

            public void onFailure(boolean flag, boolean flag1, String s2)
            {
                WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
                hideLoadingSpinner();
                handleLoginError(false, false, s2);
            }

            public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
            {
                hideLoadingSpinner();
                loggingIn = false;
                LoginActivity loginactivity = (LoginActivity)getActivity();
                if (loginactivity != null)
                {
                    loginactivity.finishLogin(flag, wishsignupflow);
                }
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        }, "LoginModeEmail", s, s1);
    }

    private void showLoadingSpinner()
    {
        if (loadingSpinner != null || getActivity() == null)
        {
            return;
        }
        loadingSpinner = new ProgressDialog(getActivity()) {

            final SignInFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = SignInFragment.this;
                super(context);
            }
        };
        loadingSpinner.setCancelable(false);
        loadingSpinner.requestWindowFeature(1);
        loadingSpinner.setMessage(getActivity().getString(0x7f060285));
        try
        {
            loadingSpinner.show();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void startWishLoginWithFb()
    {
        if (!FacebookManager.getInstance().isLoggedIn())
        {
            handleLoginError(true, false, null);
            return;
        } else
        {
            loggingIn = true;
            showLoadingSpinner();
            loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

                final SignInFragment this$0;

                public void onFailure(boolean flag, boolean flag1, String s)
                {
                    handleLoginError(flag, flag1, s);
                }

                public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
                {
                    loggingIn = false;
                    if (LoggedInUser.getInstance().getCurrentUser() != null)
                    {
                        LoginActivity loginactivity = (LoginActivity)getActivity();
                        if (loginactivity != null)
                        {
                            loginactivity.finishLogin(flag, wishsignupflow);
                        }
                    }
                }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
            }, "LoginModeFB");
            return;
        }
    }

    private void startWishLoginWithGooglePlus()
    {
        if (!GooglePlusManager.getInstance().isLoggedIn())
        {
            handleLoginError(false, true, null);
            return;
        } else
        {
            loggingIn = true;
            showLoadingSpinner();
            loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

                final SignInFragment this$0;

                public void onFailure(boolean flag, boolean flag1, String s)
                {
                    handleLoginError(flag, flag1, s);
                }

                public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
                {
                    loggingIn = false;
                    if (LoggedInUser.getInstance().getCurrentUser() != null)
                    {
                        LoginActivity loginactivity = (LoginActivity)getActivity();
                        if (loginactivity != null)
                        {
                            loginactivity.finishLogin(flag, wishsignupflow);
                        }
                    }
                }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
            }, "LoginModeGooglePlus");
            return;
        }
    }

    private boolean validateFields()
    {
        EditText aedittext[] = new EditText[2];
        aedittext[0] = emailText;
        aedittext[1] = passwordText;
        int j = aedittext.length;
        for (int i = 0; i < j; i++)
        {
            if (extractEditTextValue(aedittext[i]) == null)
            {
                return false;
            }
        }

        return true;
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.EmailLogin;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03009e;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_EMAIL_LOGIN;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f0603e4));
        emailText = (EditText)view.findViewById(0x7f0d0320);
        WishTestingUtil.addContentDescription(emailText, getClass().getSimpleName(), "emailText");
        passwordText = (EditText)view.findViewById(0x7f0d0321);
        WishTestingUtil.addContentDescription(passwordText, getClass().getSimpleName(), "passwordText");
        passwordText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SignInFragment this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    hideKeyboard();
                    handleDone();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
        emailText.setText(UserPreferences.getLoginEmail());
        passwordText.setText(UserPreferences.getLoginPassword());
        googleButton = view.findViewById(0x7f0d0324);
        googleButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;

            public void onClick(View view1)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GoogleLogin, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                startGooglePlusLogin();
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
        if (!GooglePlusManager.isGooglePlayServicesAllowed())
        {
            googleButton.setVisibility(8);
        }
        facebookButton = view.findViewById(0x7f0d0326);
        facebookButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_SPLASH_FACEBOOK_LOGIN);
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Login, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                startFacebookLogin();
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
        if (useEmailReloginMode)
        {
            googleButton.setVisibility(8);
            facebookButton.setVisibility(8);
        }
        view.findViewById(0x7f0d0322).setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_LOGIN);
                handleDone();
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
        WishTestingUtil.addContentDescription(view.findViewById(0x7f0d0322), getClass().getSimpleName(), "signInNextButton");
        view = (TextView)view.findViewById(0x7f0d0323);
        view.setPaintFlags(view.getPaintFlags() | 8);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final SignInFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_FORGOT_PASSWORD);
                handleForgotPasswordClicked();
            }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
        });
    }

    public boolean onBackPressed()
    {
        hideKeyboard();
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        super.onCreate(bundle);
        loginServiceManager = new LoginServiceManager();
        loggingIn = false;
        boolean flag = flag1;
        if (getArguments() != null)
        {
            flag = flag1;
            if (getArguments().getBoolean("ArgEmailReloginMode", false))
            {
                flag = true;
            }
        }
        useEmailReloginMode = flag;
    }

    public void onDestroy()
    {
        super.onDestroy();
        hideLoadingSpinner();
    }

    public void startFacebookLogin()
    {
        if (loggingIn)
        {
            return;
        }
        loggingIn = true;
        showLoadingSpinner();
        if (!FacebookManager.getInstance().isLoggedIn())
        {
            FacebookManager.getInstance().startLogin(getActivity(), new com.contextlogic.wish.facebook.FacebookManager.LoginCallback() {

                final SignInFragment this$0;

                public void onFailure()
                {
                    handleLoginError(true, false, null);
                }

                public void onSuccess()
                {
                    startWishLoginWithFb();
                }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
            });
            return;
        } else
        {
            startWishLoginWithFb();
            return;
        }
    }

    public void startGooglePlusLogin()
    {
        if (loggingIn)
        {
            return;
        }
        loggingIn = true;
        showLoadingSpinner();
        if (!GooglePlusManager.getInstance().isLoggedIn())
        {
            GooglePlusManager.getInstance().startLogin(getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.LoginCallback() {

                final SignInFragment this$0;

                public Activity getActivityForErrorResolution()
                {
                    return getActivity();
                }

                public void onFailure()
                {
                    handleLoginError(false, true, null);
                }

                public void onSilentFailure()
                {
                    loggingIn = false;
                    hideLoadingSpinner();
                }

                public void onSuccess()
                {
                    startWishLoginWithGooglePlus();
                }

            
            {
                this$0 = SignInFragment.this;
                super();
            }
            });
            return;
        } else
        {
            startWishLoginWithGooglePlus();
            return;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }







/*
    static boolean access$502(SignInFragment signinfragment, boolean flag)
    {
        signinfragment.loggingIn = flag;
        return flag;
    }

*/



}
