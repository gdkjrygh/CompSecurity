// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.manager.LoginServiceManager;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import com.contextlogic.wish.ui.components.text.DropdownEditText;
import com.contextlogic.wish.ui.fragment.base.BaseLoginContentFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupFragment extends BaseLoginContentFragment
{

    public static final String ARG_PREFILL_EMAIL = "ArgPrefillEmail";
    private EditText emailConfirmText;
    private DropdownEditText emailDropdownText;
    private ArrayList emailSuggestions;
    private View facebookButton;
    private EditText firstNameText;
    private View googleButton;
    private EditText lastNameText;
    private ProgressDialog loadingSpinner;
    private boolean loggingIn;
    private LoginServiceManager loginServiceManager;
    private EditText passwordText;

    public SignupFragment()
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

    private void generateTestAccount()
    {
        firstNameText.setText("FirstTest");
        lastNameText.setText("LastTest");
        int i = (new Random()).nextInt();
        String s = (new StringBuilder()).append("test").append(i).append("@testtesttest.com").toString();
        emailDropdownText.setText(s);
        emailConfirmText.setText(s);
        passwordText.setText("111111");
    }

    private String getEmail()
    {
        return extractEditTextValue(emailDropdownText);
    }

    private void handleDone()
    {
        while (getActivity() == null || loggingIn) 
        {
            return;
        }
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Done);
        hideKeyboard();
        if (!validateFields())
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060063));
            return;
        }
        if (!validateEmail())
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_EMAIL_CONFIRM_FAIL);
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f06013d));
            return;
        } else
        {
            performLogin();
            return;
        }
    }

    private void handleLoginError(boolean flag, boolean flag1, String s)
    {
        if (getActivity() == null)
        {
            return;
        }
        loggingIn = false;
        hideLoadingSpinner();
        WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
        String s1 = s;
        if (s == null)
        {
            s1 = getActivity().getString(0x7f060148);
        }
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), s1);
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
                    inputmethodmanager.hideSoftInputFromWindow(passwordText.getWindowToken(), 0);
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
        String s = extractEditTextValue(firstNameText);
        String s1 = extractEditTextValue(lastNameText);
        String s2 = getEmail();
        String s3 = extractEditTextValue(passwordText);
        UserPreferences.setForceRelogin(true);
        loggingIn = true;
        loginServiceManager.startLogin(new com.contextlogic.wish.api.service.manager.LoginServiceManager.Callback() {

            final SignupFragment this$0;

            public void onFailure(boolean flag, boolean flag1, String s4)
            {
                WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
                hideLoadingSpinner();
                handleLoginError(false, false, s4);
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
                this$0 = SignupFragment.this;
                super();
            }
        }, "LoginModeEmailSignup", s, s1, s2, s3);
    }

    private void showLoadingSpinner()
    {
        if (loadingSpinner != null || getActivity() == null)
        {
            return;
        }
        loadingSpinner = new ProgressDialog(getActivity()) {

            final SignupFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = SignupFragment.this;
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

                final SignupFragment this$0;

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
                this$0 = SignupFragment.this;
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

                final SignupFragment this$0;

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
                this$0 = SignupFragment.this;
                super();
            }
            }, "LoginModeGooglePlus");
            return;
        }
    }

    private boolean validateEmail()
    {
        String s = getEmail();
        String s1 = extractEditTextValue(emailConfirmText);
        return s != null && s1 != null && s.toLowerCase().equals(s1.toLowerCase());
    }

    private boolean validateFields()
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(firstNameText);
        ((ArrayList) (obj)).add(lastNameText);
        ((ArrayList) (obj)).add(emailDropdownText);
        ((ArrayList) (obj)).add(emailConfirmText);
        ((ArrayList) (obj)).add(passwordText);
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (extractEditTextValue((EditText)((Iterator) (obj)).next()) == null)
            {
                return false;
            }
        }

        return true;
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.EmailSignup;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03009f;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_EMAIL_SIGN_UP;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060102));
        Object obj = view.findViewById(0x7f0d0330);
        HashSet hashset;
        Pattern pattern;
        int k;
        if (WishApplication.getAppInstance().isDeveloperBuild())
        {
            ((View) (obj)).setVisibility(0);
            ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final SignupFragment this$0;

                public void onClick(View view1)
                {
                    generateTestAccount();
                }

            
            {
                this$0 = SignupFragment.this;
                super();
            }
            });
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        firstNameText = (EditText)view.findViewById(0x7f0d0327);
        lastNameText = (EditText)view.findViewById(0x7f0d0328);
        emailDropdownText = (DropdownEditText)view.findViewById(0x7f0d032a);
        emailConfirmText = (EditText)view.findViewById(0x7f0d032b);
        passwordText = (EditText)view.findViewById(0x7f0d032c);
        passwordText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final SignupFragment this$0;

            public boolean onEditorAction(TextView textview, int l, KeyEvent keyevent)
            {
                if (l == 6)
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
                this$0 = SignupFragment.this;
                super();
            }
        });
        lastNameText.setNextFocusDownId(0x7f0d032a);
        obj = AccountManager.get(getActivity()).getAccounts();
        emailSuggestions = new ArrayList();
        hashset = new HashSet();
        pattern = Patterns.EMAIL_ADDRESS;
        k = obj.length;
        for (int i = 0; i < k; i++)
        {
            Object obj1 = obj[i];
            if (!hashset.contains(((Account) (obj1)).name) && pattern.matcher(((Account) (obj1)).name).matches())
            {
                emailSuggestions.add(((Account) (obj1)).name);
                hashset.add(((Account) (obj1)).name);
            }
        }

        obj = new ArrayAdapter(getActivity(), 0x109000a, emailSuggestions);
        emailDropdownText.setAdapter(((android.widget.ListAdapter) (obj)));
        ((ArrayAdapter) (obj)).notifyDataSetChanged();
        int j;
        if (getArguments() != null)
        {
            obj = getArguments().getString("ArgPrefillEmail");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            emailDropdownText.setText(((CharSequence) (obj)));
        } else
        if (emailSuggestions.size() > 0)
        {
            obj = (String)emailSuggestions.get(0);
            emailDropdownText.setText(((CharSequence) (obj)));
        }
        if (obj != null)
        {
            emailConfirmText.setText(((CharSequence) (obj)));
        }
        emailDropdownText.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SignupFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int l, long l1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_EMAIL_SUGGEST);
                emailConfirmText.setText((CharSequence)emailSuggestions.get(l));
            }

            
            {
                this$0 = SignupFragment.this;
                super();
            }
        });
        googleButton = view.findViewById(0x7f0d032e);
        googleButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFragment this$0;

            public void onClick(View view1)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GoogleLogin, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                startGooglePlusLogin();
            }

            
            {
                this$0 = SignupFragment.this;
                super();
            }
        });
        if (!GooglePlusManager.isGooglePlayServicesAllowed())
        {
            googleButton.setVisibility(8);
        }
        facebookButton = view.findViewById(0x7f0d032f);
        facebookButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_SPLASH_FACEBOOK_LOGIN);
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Login, com.contextlogic.wish.analytics.Analytics.PageViewType.LoginSplash, com.contextlogic.wish.analytics.Analytics.LabelType.Click);
                startFacebookLogin();
            }

            
            {
                this$0 = SignupFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d032d).setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_SIGN_UP);
                handleDone();
            }

            
            {
                this$0 = SignupFragment.this;
                super();
            }
        });
        view = Locale.getDefault();
        if (view != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (view.getLanguage() != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if ((j & k) != 0 && view.getLanguage().startsWith("ja"))
        {
            view = (ViewGroup)firstNameText.getParent();
            view.removeView(firstNameText);
            view.addView(firstNameText, view.indexOfChild(lastNameText) + 1);
            j = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
            view = (android.widget.LinearLayout.LayoutParams)firstNameText.getLayoutParams();
            view.rightMargin = 0;
            view.leftMargin = j;
            firstNameText.setLayoutParams(view);
            view = (android.widget.LinearLayout.LayoutParams)lastNameText.getLayoutParams();
            view.rightMargin = j;
            view.leftMargin = 0;
            lastNameText.setLayoutParams(view);
            firstNameText.setNextFocusDownId(lastNameText.getNextFocusDownId());
            lastNameText.setNextFocusDownId(0x7f0d0327);
        }
    }

    public boolean onBackPressed()
    {
        hideKeyboard();
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        loginServiceManager = new LoginServiceManager();
        loggingIn = false;
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

                final SignupFragment this$0;

                public void onFailure()
                {
                    handleLoginError(true, false, null);
                }

                public void onSuccess()
                {
                    startWishLoginWithFb();
                }

            
            {
                this$0 = SignupFragment.this;
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

                final SignupFragment this$0;

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
                this$0 = SignupFragment.this;
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
    static boolean access$702(SignupFragment signupfragment, boolean flag)
    {
        signupfragment.loggingIn = flag;
        return flag;
    }

*/


}
