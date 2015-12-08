// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.GetUserStatusService;
import com.contextlogic.wish.api.service.UpdateProfileService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.util.CompatibilityUtil;
import com.contextlogic.wish.util.TabletUtil;
import java.util.Calendar;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryFragment

public class SignupUpdateProfileFragment extends BaseContentFragment
{

    public static final String ARG_SIGNUP_FLOW = "ArgSignupFlow";
    public static String ARG_UPDATE_PROFILE_IS_SETTING = "ArgIsSetting";
    private static final int MIN_BIRTH_DATE_DAY = 1;
    private static final int MIN_BIRTH_DATE_MONTH = 1;
    private static final int MIN_BIRTH_DATE_YEAR = 1900;
    private DatePicker birthdayDatePicker;
    private Spinner genderSpinner;
    private GetUserStatusService getUserStatusService;
    private boolean isSetting;
    private ProgressDialog loadingSpinner;
    private UpdateProfileService updateProfileService;
    private com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow useSignupFlow;

    public SignupUpdateProfileFragment()
    {
    }

    private void clickSkip()
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Skip);
        final Dialog dialog = new Dialog(getActivity(), 0x7f0b00ff);
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f03003c);
        ((TextView)dialog.findViewById(0x7f0d015e)).setText(getActivity().getString(0x7f060073));
        ((TextView)dialog.findViewById(0x7f0d015f)).setText(getActivity().getString(0x7f06007b));
        Button button = (Button)dialog.findViewById(0x7f0d0160);
        button.setText(getActivity().getString(0x7f0600bc));
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupUpdateProfileFragment this$0;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SkipPersonalizeCancel);
                dialog.dismiss();
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                dialog = dialog1;
                super();
            }
        });
        button = (Button)dialog.findViewById(0x7f0d0161);
        button.setText(getActivity().getString(0x7f0603ed));
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupUpdateProfileFragment this$0;
            final Dialog val$dialog;

            public void onClick(View view)
            {
                if (useSignupFlow != null)
                {
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_UPDATE_PROFILE_NEXT);
                } else
                {
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_UPDATE_PROFILE_SKIP);
                }
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.SkipPersonalize);
                dialog.dismiss();
                handleClose();
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                dialog = dialog1;
                super();
            }
        });
        dialog.findViewById(0x7f0d0162).setVisibility(8);
        dialog.show();
    }

    private void handleClose()
    {
        if (isSetting)
        {
            dismissModal();
            return;
        }
        if (useSignupFlow != null && useSignupFlow == com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.Categories)
        {
            SignupCategoryFragment signupcategoryfragment = new SignupCategoryFragment();
            ((RootActivity)getActivity()).setModalContentFragment(signupcategoryfragment, false);
            return;
        }
        if (useSignupFlow != null && !TabletUtil.isTablet(getActivity()) && useSignupFlow == com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.GenderFreeGifts)
        {
            dismissModal();
            (new Handler()).post(new Runnable() {

                final SignupUpdateProfileFragment this$0;

                public void run()
                {
                    RootActivity rootactivity = (RootActivity)getActivity();
                    if (rootactivity != null)
                    {
                        rootactivity.showFreeGiftSignupFlow(useSignupFlow);
                    }
                }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }
            });
            return;
        } else
        {
            dismissModal();
            (new Handler()).post(new Runnable() {

                final SignupUpdateProfileFragment this$0;

                public void run()
                {
                    RootActivity rootactivity = (RootActivity)getActivity();
                    if (rootactivity != null)
                    {
                        rootactivity.setContentFragment(rootactivity.getFirstFeedFragment(false), true);
                    }
                }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }
            });
            return;
        }
    }

    private void handleDone()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Done);
            hideKeyboard();
            performUpdate();
            return;
        }
    }

    private void hideKeyboard()
    {
        InputMethodManager inputmethodmanager;
        inputmethodmanager = (InputMethodManager)getActivity().getSystemService("input_method");
        if (inputmethodmanager == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        inputmethodmanager.hideSoftInputFromWindow(birthdayDatePicker.getWindowToken(), 0);
        return;
        Throwable throwable;
        throwable;
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

    private void performUpdate()
    {
        showLoadingSpinner();
        int i = birthdayDatePicker.getMonth();
        int j = birthdayDatePicker.getDayOfMonth();
        int k = birthdayDatePicker.getYear();
        String s;
        if (genderSpinner.getSelectedItemPosition() == 0)
        {
            s = "female";
        } else
        {
            s = "male";
        }
        updateProfileService.requestService(j, i + 1, k, s, false, new com.contextlogic.wish.api.service.UpdateProfileService.SuccessCallback() {

            final SignupUpdateProfileFragment this$0;

            public void onServiceSucceeded()
            {
                LoggedInUser.getInstance().refreshProfile();
                getUserStatusService.requestService(false, new com.contextlogic.wish.api.service.GetUserStatusService.SuccessCallback() {

                    final _cls5 this$1;

                    public void onServiceSucceeded()
                    {
                        postDelayed(new Runnable() {

                            final _cls1 this$2;

                            public void run()
                            {
                                hideLoadingSpinner();
                                showSuccessDialog();
                                handleClose();
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        }, 0L);
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                    final _cls5 this$1;

                    public void onServiceFailed()
                    {
                        hideLoadingSpinner();
                        showSuccessDialog();
                        handleClose();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateProfileService.FailureCallback() {

            final SignupUpdateProfileFragment this$0;

            public void onServiceFailed(String s1)
            {
                String s2 = s1;
                if (s1 == null)
                {
                    s2 = s1;
                    if (getActivity() != null)
                    {
                        s2 = getActivity().getString(0x7f06014a);
                    }
                }
                hideLoadingSpinner();
                showErrorDialog(s2);
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
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

            final SignupUpdateProfileFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
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

    private void showSuccessDialog()
    {
        if (useSignupFlow != null && useSignupFlow == com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.GenderFreeGifts)
        {
            return;
        } else
        {
            PopupAlertDialog.showSuccess(getActivity(), getActivity().getString(0x7f060436), getActivity().getString(0x7f060332));
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.SignupUpdateProfile;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f0300ac;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        if (useSignupFlow != null)
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_SIGNUP_UPDATE_PROFILE;
        } else
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_EMAIL_UPDATE_PROFILE;
        }
    }

    public boolean hideBackButton()
    {
        return !isSetting;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060330));
        birthdayDatePicker = (DatePicker)view.findViewById(0x7f0d036e);
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(1, 1900);
        ((Calendar) (obj)).set(2, 1);
        ((Calendar) (obj)).set(5, 1);
        long l1 = ((Calendar) (obj)).getTimeInMillis();
        CompatibilityUtil.setDatePickerMinDateMethod(birthdayDatePicker, l1);
        CompatibilityUtil.setDatePickerMaxDateMethod(birthdayDatePicker, System.currentTimeMillis());
        if (LoggedInUser.getInstance().isLoggedIn() && LoggedInUser.getInstance().getCurrentUser().getBirthday() != null)
        {
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTime(LoggedInUser.getInstance().getCurrentUser().getBirthday());
            int i = ((Calendar) (obj)).get(2);
            int k = ((Calendar) (obj)).get(5);
            int i1 = ((Calendar) (obj)).get(1);
            birthdayDatePicker.init(i1, i, k, null);
        } else
        {
            birthdayDatePicker = (DatePicker)view.findViewById(0x7f0d036e);
            j = birthdayDatePicker.getMonth();
            int l = birthdayDatePicker.getDayOfMonth();
            int j1 = birthdayDatePicker.getYear();
            birthdayDatePicker.init(j1 - 19, j, l, null);
        }
        genderSpinner = (Spinner)view.findViewById(0x7f0d036f);
        obj = new ArrayAdapter(getActivity(), 0x7f0300c4, new String[] {
            getActivity().getString(0x7f060200), getActivity().getString(0x7f060201)
        });
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        genderSpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        if (LoggedInUser.getInstance().isLoggedIn())
        {
            String s = LoggedInUser.getInstance().getCurrentUser().getGender();
            if (s != null)
            {
                int j = 0;
                if (getString(0x7f0604c8).equals("male"))
                {
                    j = 1;
                }
                if (s.equals("male"))
                {
                    genderSpinner.setSelection(1);
                } else
                if (s.equals("female"))
                {
                    genderSpinner.setSelection(0);
                } else
                {
                    genderSpinner.setSelection(j);
                }
            }
        }
        view = (Button)view.findViewById(0x7f0d0370);
        if (isSetting)
        {
            view.setText(getString(0x7f060130));
        }
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupUpdateProfileFragment this$0;

            public void onClick(View view1)
            {
                if (useSignupFlow != null)
                {
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_SIGNUP_UPDATE_PROFILE_NEXT);
                } else
                {
                    trackClick(WishAnalyticsEvent.CLICK_MOBILE_EMAIL_UPDATE_PROFILE_NEXT);
                }
                handleDone();
            }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }
        });
        if (!isSetting)
        {
            getNavigationBar().setBackButtonEnabled(false);
            getNavigationBar().setMenuItem(getResources().getString(0x7f0603ed), 0, new NavigationBarButtonCallback() {

                final SignupUpdateProfileFragment this$0;

                public void onMenuItemClicked()
                {
                    clickSkip();
                }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }
            });
        }
    }

    public boolean onBackPressed()
    {
        if (isSetting)
        {
            handleClose();
        } else
        {
            clickSkip();
        }
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateProfileService = new UpdateProfileService();
        getUserStatusService = new GetUserStatusService();
        if (getArguments() != null)
        {
            isSetting = getArguments().getBoolean(ARG_UPDATE_PROFILE_IS_SETTING);
            useSignupFlow = (com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow)getArguments().getSerializable("ArgSignupFlow");
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        hideLoadingSpinner();
        updateProfileService.cancelAllRequests();
    }

    public boolean useCanvasBackground()
    {
        return true;
    }









}
