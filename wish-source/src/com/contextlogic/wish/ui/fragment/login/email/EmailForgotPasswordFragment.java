// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.ResetPasswordService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import com.contextlogic.wish.ui.fragment.base.BaseLoginContentFragment;

public class EmailForgotPasswordFragment extends BaseLoginContentFragment
{

    private EditText emailText;
    private ProgressDialog loadingSpinner;
    private ResetPasswordService resetPasswordService;

    public EmailForgotPasswordFragment()
    {
    }

    private void endFragment()
    {
        while (getActivity() == null || getActivity().getSupportFragmentManager().getBackStackEntryCount() <= 1) 
        {
            return;
        }
        getActivity().getSupportFragmentManager().popBackStackImmediate();
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

    private void handleDone()
    {
        if (getActivity() == null)
        {
            return;
        }
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Done);
        hideKeyboard();
        if (validateFields())
        {
            performReset();
            return;
        } else
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f060063));
            return;
        }
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

    private void performReset()
    {
        showLoadingSpinner();
        String s = extractEditTextValue(emailText);
        resetPasswordService.requestService(s, new com.contextlogic.wish.api.service.ResetPasswordService.SuccessCallback() {

            final EmailForgotPasswordFragment this$0;

            public void onServiceSucceeded(String s1)
            {
                hideLoadingSpinner();
                showSuccessDialog(s1);
                endFragment();
            }

            
            {
                this$0 = EmailForgotPasswordFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ResetPasswordService.FailureCallback() {

            final EmailForgotPasswordFragment this$0;

            public void onServiceFailed(String s1)
            {
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = s1;
                    if (getActivity() != null)
                    {
                        s2 = getActivity().getString(0x7f060149);
                    }
                }
                hideLoadingSpinner();
                showErrorDialog(s2);
            }

            
            {
                this$0 = EmailForgotPasswordFragment.this;
                super();
            }
        });
    }

    private void showErrorDialog(String s)
    {
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), s);
    }

    private void showLoadingSpinner()
    {
        loadingSpinner = new ProgressDialog(getActivity()) {

            final EmailForgotPasswordFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = EmailForgotPasswordFragment.this;
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

    private void showSuccessDialog(String s)
    {
        PopupAlertDialog.showSuccess(getActivity(), null, s);
    }

    private boolean validateFields()
    {
        EditText aedittext[] = new EditText[1];
        aedittext[0] = emailText;
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
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ForgotPassword;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03005b;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_EMAIL_FORGOT_PASSWORD;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060168));
        emailText = (EditText)view.findViewById(0x7f0d01eb);
        emailText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EmailForgotPasswordFragment this$0;

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
                this$0 = EmailForgotPasswordFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d01ec).setOnClickListener(new android.view.View.OnClickListener() {

            final EmailForgotPasswordFragment this$0;

            public void onClick(View view1)
            {
                handleDone();
            }

            
            {
                this$0 = EmailForgotPasswordFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        resetPasswordService = new ResetPasswordService();
    }

    public void onDestroy()
    {
        super.onDestroy();
        hideLoadingSpinner();
        resetPasswordService.cancelAllRequests();
    }

    public boolean useCanvasBackground()
    {
        return true;
    }






}
