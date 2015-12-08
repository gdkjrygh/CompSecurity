// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.ChangePasswordService;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.user.LoggedInUser;

public class EmailChangePasswordFragment extends BaseContentFragment
{

    private ChangePasswordService changePasswordService;
    private ProgressDialog loadingSpinner;
    private EditText newPasswordText;
    private EditText oldPasswordText;

    public EmailChangePasswordFragment()
    {
    }

    private void clearFields()
    {
        oldPasswordText.setText(null);
        newPasswordText.setText(null);
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
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0602ce));
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
                    inputmethodmanager.hideSoftInputFromWindow(oldPasswordText.getWindowToken(), 0);
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
        final String oldPassword = extractEditTextValue(oldPasswordText);
        String s = extractEditTextValue(newPasswordText);
        changePasswordService.requestService(oldPassword, s, new com.contextlogic.wish.api.service.ChangePasswordService.SuccessCallback() {

            final EmailChangePasswordFragment this$0;
            final String val$oldPassword;

            public void onServiceSucceeded()
            {
                hideLoadingSpinner();
                EmailChangePasswordFragment emailchangepasswordfragment = EmailChangePasswordFragment.this;
                boolean flag;
                if (oldPassword == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                emailchangepasswordfragment.showSuccessDialog(flag);
                clearFields();
            }

            
            {
                this$0 = EmailChangePasswordFragment.this;
                oldPassword = s;
                super();
            }
        }, new com.contextlogic.wish.api.service.ChangePasswordService.FailureCallback() {

            final EmailChangePasswordFragment this$0;

            public void onServiceFailed(String s1)
            {
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = s1;
                    if (getActivity() != null)
                    {
                        s2 = getActivity().getString(0x7f060147);
                    }
                }
                hideLoadingSpinner();
                showErrorDialog(s2);
            }

            
            {
                this$0 = EmailChangePasswordFragment.this;
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

            final EmailChangePasswordFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = EmailChangePasswordFragment.this;
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

    private void showSuccessDialog(boolean flag)
    {
        if (flag)
        {
            PopupAlertDialog.showSuccess(getActivity(), getActivity().getString(0x7f060436), getActivity().getString(0x7f060489));
            return;
        } else
        {
            PopupAlertDialog.showSuccess(getActivity(), getActivity().getString(0x7f060436), getActivity().getString(0x7f060328));
            return;
        }
    }

    private boolean validateFields()
    {
        EditText aedittext[] = new EditText[1];
        aedittext[0] = newPasswordText;
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
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ChangePassword;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030048;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return WishAnalyticsEvent.IMPRESSION_MOBILE_EMAIL_CHANGE_PASSWORD;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f0600d6));
        oldPasswordText = (EditText)view.findViewById(0x7f0d01a6);
        newPasswordText = (EditText)view.findViewById(0x7f0d01a7);
        newPasswordText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EmailChangePasswordFragment this$0;

            public boolean onEditorAction(TextView textview1, int i, KeyEvent keyevent)
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
                this$0 = EmailChangePasswordFragment.this;
                super();
            }
        });
        TextView textview = (TextView)view.findViewById(0x7f0d01a5);
        if (LoggedInUser.getInstance().isLoggedIn())
        {
            textview.setText(LoggedInUser.getInstance().getCurrentUser().getEmail());
        }
        view.findViewById(0x7f0d01a8).setOnClickListener(new android.view.View.OnClickListener() {

            final EmailChangePasswordFragment this$0;

            public void onClick(View view1)
            {
                trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_CHANGE_PASSWORD);
                handleDone();
            }

            
            {
                this$0 = EmailChangePasswordFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        changePasswordService = new ChangePasswordService();
    }

    public void onDestroy()
    {
        hideKeyboard();
        super.onDestroy();
        hideLoadingSpinner();
        changePasswordService.cancelAllRequests();
    }

    public boolean useCanvasBackground()
    {
        return true;
    }






}
