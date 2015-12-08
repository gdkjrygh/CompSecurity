// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.data.WishSettingsSpec;
import com.contextlogic.wish.api.service.DeleteAccountService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.developer.DeveloperSettingsFragment;
import com.contextlogic.wish.ui.fragment.login.email.EmailChangePasswordFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.signup.SignupUpdateProfileFragment;
import com.contextlogic.wish.user.UserStatusManager;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsAdapter, SettingsItem

public class SettingsFragment extends BaseContentFragment
{

    private SettingsAdapter adapter;
    private DeleteAccountService deleteAccountService;
    private ListView listView;
    private ProgressDialog loadingSpinner;

    public SettingsFragment()
    {
    }

    private void handleDeleteAccountAction()
    {
        showLoadingSpinner();
        deleteAccountService.requestService(new com.contextlogic.wish.api.service.DeleteAccountService.SuccessCallback() {

            final SettingsFragment this$0;

            public void onServiceSucceeded()
            {
                handleDeleteAccountSuccess();
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.DeleteAccountService.FailureCallback() {

            final SettingsFragment this$0;

            public void onServiceFailed(String s)
            {
                String s1 = s;
                if (s == null)
                {
                    s1 = getActivity().getString(0x7f060111);
                }
                hideLoadingSpinner();
                PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), s1);
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    private void handleDeleteAccountClicked()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060073));
        alertdialog.setMessage(getActivity().getString(0x7f060076));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                handleDeleteAccountDoubleConfirm();
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.show();
    }

    private void handleDeleteAccountDoubleConfirm()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060072));
        alertdialog.setMessage(getActivity().getString(0x7f060077));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                handleDeleteAccountAction();
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.show();
    }

    private void handleDeleteAccountSuccess()
    {
        if (GooglePlusManager.getInstance().isLoggedIn())
        {
            Plus.AccountApi.clearDefaultAccount(GooglePlusManager.getInstance().getPlusClient());
            Plus.AccountApi.revokeAccessAndDisconnect(GooglePlusManager.getInstance().getPlusClient()).setResultCallback(new ResultCallback() {

                final SettingsFragment this$0;

                public volatile void onResult(Result result)
                {
                    onResult((Status)result);
                }

                public void onResult(Status status)
                {
                    GooglePlusManager.getInstance().resetPlusClient();
                    onDeleteAccountComplete();
                }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
            });
            return;
        } else
        {
            onDeleteAccountComplete();
            return;
        }
    }

    private void handleLogoutClicked()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060073));
        alertdialog.setMessage(getActivity().getString(0x7f06007a));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final SettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                WishApplication.getAppInstance().clearAllNotifications();
                WishApplication.getAppInstance().logout(getActivity(), false, false, true);
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
        alertdialog.show();
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

    private void onDeleteAccountComplete()
    {
        hideLoadingSpinner();
        WishApplication.getAppInstance().clearAllNotifications();
        WishApplication.getAppInstance().logout(getActivity(), false, false, true);
    }

    private void showLoadingSpinner()
    {
        loadingSpinner = new ProgressDialog(getActivity()) {

            final SettingsFragment this$0;

            public void onBackPressed()
            {
            }

            
            {
                this$0 = SettingsFragment.this;
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

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.Settings;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03009b;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        return MainMenuItem.SETTINGS;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f0603b5));
        listView = (ListView)view.findViewById(0x7f0d030a);
        adapter = new SettingsAdapter(getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SettingsFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                adapterview = SettingsItem.resolveIndexForSet(i, adapter.getCurrentMenuSet());
                static class _cls12
                {

                    static final int $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[];

                    static 
                    {
                        $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem = new int[SettingsItem.values().length];
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.SETTINGS_GENERAL.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.CHANGE_PASSWORD.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.LOGOUT.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.DELETE_ACCOUNT.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.DEVELOPER_SETTINGS.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$contextlogic$wish$ui$fragment$settings$SettingsItem[SettingsItem.UPDATE_PROFILE.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls12..SwitchMap.com.contextlogic.wish.ui.fragment.settings.SettingsItem[adapterview.ordinal()];
                JVM INSTR tableswitch 1 6: default 60
            //                           1 61
            //                           2 104
            //                           3 144
            //                           4 162
            //                           5 180
            //                           6 204;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
                break MISSING_BLOCK_LABEL_162;
_L6:
                break MISSING_BLOCK_LABEL_180;
_L1:
                break; /* Loop/switch isn't completed */
_L7:
                break MISSING_BLOCK_LABEL_204;
_L8:
                return;
_L2:
                if ((adapterview = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(((WishSettingsSpec)UserStatusManager.getInstance().getSettings().get(i)).action()))) != null)
                {
                    ((RootActivity)getActivity()).processDeepLink(adapterview, true);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ChangePasswordSelect);
                adapterview = new EmailChangePasswordFragment();
                view1 = (RootActivity)getActivity();
                if (view1 != null)
                {
                    view1.setContentFragment(adapterview, false);
                    return;
                }
                if (true) goto _L8; else goto _L4
_L4:
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Logout);
                handleLogoutClicked();
                return;
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.DeleteAccount);
                handleDeleteAccountClicked();
                return;
                adapterview = new DeveloperSettingsFragment();
                ((RootActivity)getActivity()).setModalContentFragment(adapterview, true);
                return;
                adapterview = new SignupUpdateProfileFragment();
                ((RootActivity)getActivity()).setModalContentFragment(adapterview, true);
                return;
            }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        deleteAccountService = new DeleteAccountService();
    }








}
