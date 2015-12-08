// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.UpdateWishList;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmui.RadioButtonController;
import com.walmartlabs.android.pharmacy.PharmacyUtils;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.ui.NoDefaultSpinner;

// Referenced classes of package com.walmart.android.app.wishlist:
//            WishListUtils

public class SettingsPresenter extends Presenter
{
    static interface OnListUpdatedCallback
    {

        public abstract void onListUpdated(WishList wishlist);
    }

    private class RegistrantVisibilityController
        implements com.walmart.android.wmui.RadioButtonController.OnCheckedChangeListener
    {

        private boolean mIsPublic;
        private boolean mShowCoRegistrant;
        final SettingsPresenter this$0;

        private void update()
        {
            boolean flag = false;
            View view = mRegistrantContainer;
            int i;
            if (mIsPublic)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            view = mCoRegistrantContainer;
            if (mIsPublic && mShowCoRegistrant)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            view = mAddCoRegistrant;
            if (mIsPublic && !mShowCoRegistrant)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }

        public void init()
        {
            mIsPublic = mList.isPublic();
            mShowCoRegistrant = mList.hasCoRegistrant();
            update();
            mAddCoRegistrant.setOnClickListener(new android.view.View.OnClickListener() {

                final RegistrantVisibilityController this$1;

                public void onClick(View view)
                {
                    mShowCoRegistrant = true;
                    update();
                }

            
            {
                this$1 = RegistrantVisibilityController.this;
                super();
            }
            });
        }

        public void onCheckedChanged(int i)
        {
            boolean flag;
            if (i == 0x7f100671)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsPublic = flag;
            mShowCoRegistrant = mList.hasCoRegistrant();
            if (!mIsPublic)
            {
                fillRegistrantFields();
            }
            update();
        }


/*
        static boolean access$1202(RegistrantVisibilityController registrantvisibilitycontroller, boolean flag)
        {
            registrantvisibilitycontroller.mShowCoRegistrant = flag;
            return flag;
        }

*/


        private RegistrantVisibilityController()
        {
            this$0 = SettingsPresenter.this;
            super();
        }

    }


    private static final int DIALOG_DELETE_LIST = 1;
    private static final int DIALOG_DELETE_PROGRESS = 2;
    private static final int DIALOG_UPDATE_PROGRESS = 0;
    private final AppCompatActivity mActivity;
    private View mAddCoRegistrant;
    private View mCoRegistrantContainer;
    private EditText mCoRegistrantFirstNameEditText;
    private FloatLabel mCoRegistrantFirstNameLabel;
    private EditText mCoRegistrantLastNameEditText;
    private FloatLabel mCoRegistrantLastNameLabel;
    private View mDeleteButton;
    private boolean mIsSaveActionEnabled;
    private final WishList mList;
    private EditText mListNameEditText;
    private FloatLabel mListNameLabel;
    private final OnListUpdatedCallback mOnListUpdatedCallback;
    private RadioButtonController mRadioButtonController;
    private View mRegistrantContainer;
    private EditText mRegistrantFirstNameEditText;
    private FloatLabel mRegistrantFirstNameLabel;
    private EditText mRegistrantLastNameEditText;
    private FloatLabel mRegistrantLastNameLabel;
    private View mRootView;
    private Drawable mSavedToolbarNavIcon;
    private FloatLabel mUsStateLabel;
    private NoDefaultSpinner mUsStateSpinner;

    public SettingsPresenter(AppCompatActivity appcompatactivity, WishList wishlist, OnListUpdatedCallback onlistupdatedcallback)
    {
        mIsSaveActionEnabled = true;
        mActivity = appcompatactivity;
        mList = wishlist;
        mOnListUpdatedCallback = onlistupdatedcallback;
    }

    private boolean areFieldsValid()
    {
        clearErrors();
        boolean flag2 = true;
        if (TextUtils.isEmpty(mListNameEditText.getText().toString().trim()))
        {
            mListNameLabel.setError(0x7f090655);
            scrollAndFocus(mListNameEditText);
            flag2 = false;
        }
        boolean flag4 = flag2;
        if ("public".equals(getCurrentPrivacyState()))
        {
            boolean flag3 = flag2;
            if (TextUtils.isEmpty(mRegistrantFirstNameEditText.getText().toString().trim()))
            {
                mRegistrantFirstNameLabel.setError(0x7f090653);
                flag3 = flag2;
                if (flag2)
                {
                    scrollAndFocus(mRegistrantFirstNameEditText);
                    flag3 = false;
                }
            }
            flag2 = flag3;
            if (TextUtils.isEmpty(mRegistrantLastNameEditText.getText().toString().trim()))
            {
                mRegistrantLastNameLabel.setError(0x7f090654);
                flag2 = flag3;
                if (flag3)
                {
                    scrollAndFocus(mRegistrantLastNameEditText);
                    flag2 = false;
                }
            }
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(mCoRegistrantFirstNameEditText.getText().toString().trim()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!TextUtils.isEmpty(mCoRegistrantLastNameEditText.getText().toString().trim()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag3 = flag2;
            if (!flag)
            {
                flag3 = flag2;
                if (flag1)
                {
                    mCoRegistrantFirstNameLabel.setError(0x7f090653);
                    flag3 = flag2;
                    if (flag2)
                    {
                        scrollAndFocus(mCoRegistrantFirstNameEditText);
                        flag3 = false;
                    }
                }
            }
            flag4 = flag3;
            if (!flag1)
            {
                flag4 = flag3;
                if (flag)
                {
                    mCoRegistrantLastNameLabel.setError(0x7f090654);
                    flag4 = flag3;
                    if (flag3)
                    {
                        scrollAndFocus(mCoRegistrantLastNameEditText);
                        flag4 = false;
                    }
                }
            }
        }
        return flag4;
    }

    private void clearErrors()
    {
        mListNameLabel.clearError();
        mRegistrantFirstNameLabel.clearError();
        mRegistrantLastNameLabel.clearError();
        mCoRegistrantFirstNameLabel.clearError();
        mCoRegistrantLastNameLabel.clearError();
    }

    private void deleteList(String s)
    {
        mDeleteButton.setEnabled(false);
        setSaveActionEnabled(false);
        showDialog(2);
        WishListManager.get().deleteList(s, new CallbackSameThread() {

            final SettingsPresenter this$0;

            public void onResultSameThread(Request request, Result result)
            {
                char c = '\001';
                dismissDialog(2);
                setSaveActionEnabled(true);
                if (result.successful())
                {
                    mActivity.finish();
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listDelete"));
                    return;
                }
                mDeleteButton.setEnabled(true);
                if (!result.hasError() || !result.getError().connectionError())
                {
                    c = '\0';
                }
                if (c != 0)
                {
                    c = '\u0258';
                } else
                {
                    c = '\u0384';
                }
                DialogFactory.showDialog(c, mActivity);
            }

            
            {
                this$0 = SettingsPresenter.this;
                super();
            }
        });
    }

    private void fillRegistrantFields()
    {
        if (mList.hasRegistrant())
        {
            mRegistrantFirstNameEditText.setText(mList.registrant.firstName);
            mRegistrantLastNameEditText.setText(mList.registrant.lastName);
        } else
        {
            Authentication authentication = Services.get().getAuthentication();
            if (authentication.hasCredentials())
            {
                mRegistrantFirstNameEditText.setText(authentication.getFirstName());
                mRegistrantLastNameEditText.setText(authentication.getLastName());
            } else
            {
                mRegistrantFirstNameEditText.setText(null);
                mRegistrantLastNameEditText.setText(null);
            }
        }
        if (mList.hasCoRegistrant())
        {
            mCoRegistrantFirstNameEditText.setText(mList.coRegistrant.firstName);
            mCoRegistrantLastNameEditText.setText(mList.coRegistrant.lastName);
        } else
        {
            mCoRegistrantFirstNameEditText.setText(null);
            mCoRegistrantLastNameEditText.setText(null);
        }
        if (!TextUtils.isEmpty(mList.state))
        {
            String as[] = mActivity.getResources().getStringArray(0x7f0e000f);
            int i = 0;
            do
            {
label0:
                {
                    if (i < as.length)
                    {
                        if (!as[i].equals(mList.state))
                        {
                            break label0;
                        }
                        mUsStateSpinner.setSelection(i);
                    }
                    return;
                }
                i++;
            } while (true);
        } else
        {
            mUsStateSpinner.clearSelection();
            mUsStateLabel.hide();
            return;
        }
    }

    private String getCurrentPrivacyState()
    {
        if (mRadioButtonController.getCheckedRadioButtonId() == 0x7f100671)
        {
            return "public";
        } else
        {
            return "private";
        }
    }

    private UpdateWishList getInputData()
    {
        Object obj = mListNameEditText.getText().toString().trim();
        String s = getCurrentPrivacyState();
        obj = new UpdateWishList(((String) (obj)), s);
        if ("public".equals(s))
        {
            ((UpdateWishList) (obj)).setRegistrant(mRegistrantFirstNameEditText.getText().toString().trim(), mRegistrantLastNameEditText.getText().toString().trim());
            ((UpdateWishList) (obj)).setCoRegistrant(mCoRegistrantFirstNameEditText.getText().toString().trim(), mCoRegistrantLastNameEditText.getText().toString().trim());
            if (mUsStateSpinner.getSelectedItemPosition() != -1)
            {
                String s1 = mActivity.getResources().getStringArray(0x7f0e000f)[mUsStateSpinner.getSelectedItemPosition()];
                if (!TextUtils.isEmpty(s1))
                {
                    obj.state = s1;
                }
            }
        }
        return ((UpdateWishList) (obj));
    }

    private void restoreToolbarNavIcon()
    {
        ((Toolbar)mActivity.findViewById(0x7f100207)).setNavigationIcon(mSavedToolbarNavIcon);
    }

    private void saveChanges()
    {
        if (areFieldsValid())
        {
            UpdateWishList updatewishlist = getInputData();
            WishListManager.get().updateList(mList.id, updatewishlist, new CallbackSameThread(mActivity) {

                final SettingsPresenter this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    char c = '\001';
                    dismissDialog(0);
                    setSaveActionEnabled(true);
                    if (result.successful() && result.hasData())
                    {
                        request = (WishList)result.getData();
                        mOnListUpdatedCallback.onListUpdated(request);
                        pop();
                        result = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listSave");
                        if (request.isPublic())
                        {
                            request = "public";
                        } else
                        {
                            request = "private";
                        }
                        request = result.putString("privacySetting", request);
                        MessageBus.getBus().post(request);
                        return;
                    }
                    if (!result.hasError() || !result.getError().connectionError())
                    {
                        c = '\0';
                    }
                    if (c != 0)
                    {
                        c = '\u0258';
                    } else
                    {
                        c = '\u0384';
                    }
                    DialogFactory.showDialog(c, mActivity);
                }

            
            {
                this$0 = SettingsPresenter.this;
                super(context);
            }
            });
            showDialog(0);
            setSaveActionEnabled(false);
        }
    }

    private void scrollAndFocus(View view)
    {
        PharmacyUtils.scrollAndFocus(mActivity, mRootView, view);
    }

    private void setSaveActionEnabled(boolean flag)
    {
        mIsSaveActionEnabled = flag;
        mActivity.supportInvalidateOptionsMenu();
    }

    private void setToolbarNavIconAsClose()
    {
        Toolbar toolbar = (Toolbar)mActivity.findViewById(0x7f100207);
        mSavedToolbarNavIcon = toolbar.getNavigationIcon();
        toolbar.setNavigationIcon(0x7f020160);
    }

    private void wireListeners()
    {
        mUsStateSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final SettingsPresenter this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                mUsStateLabel.show();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = SettingsPresenter.this;
                super();
            }
        });
        mDeleteButton.setOnClickListener(new OnSingleClickListener(this) {

            final SettingsPresenter this$0;

            public void onSingleClick(View view)
            {
                showDialog(1);
            }

            
            {
                this$0 = SettingsPresenter.this;
                super(presenter);
            }
        });
        RegistrantVisibilityController registrantvisibilitycontroller = new RegistrantVisibilityController();
        mRadioButtonController.setOnCheckedChangeListener(registrantvisibilitycontroller);
        registrantvisibilitycontroller.init();
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09066d);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        setToolbarNavIconAsClose();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        setToolbarNavIconAsClose();
    }

    protected Dialog onCreateDialog(int i)
    {
        ProgressDialog progressdialog1;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setCancelable(false);
            progressdialog.setIndeterminate(true);
            progressdialog.setMessage(mActivity.getString(0x7f090676));
            return progressdialog;

        case 1: // '\001'
            return (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setMessage(0x7f090617).setCancelable(true).setPositiveButton(0x7f09067d, new android.content.DialogInterface.OnClickListener() {

                final SettingsPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    deleteList(mList.id);
                }

            
            {
                this$0 = SettingsPresenter.this;
                super();
            }
            }).setNegativeButton(0x7f090657, null).setIcon(null).create();

        case 2: // '\002'
            progressdialog1 = CustomProgressDialog.create(mActivity);
            break;
        }
        progressdialog1.setCancelable(false);
        progressdialog1.setIndeterminate(true);
        progressdialog1.setMessage(mActivity.getString(0x7f09061a));
        return progressdialog1;
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        MenuItem menuitem = menu.add(0, 0x7f100007, 0, 0x7f090065);
        MenuItemCompat.setShowAsAction(menuitem, 2);
        menuitem.setEnabled(mIsSaveActionEnabled);
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401f1);
            mListNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f10061c);
            mListNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10061a);
            mListNameLabel.attach(mListNameEditText);
            mListNameEditText.setFilters(WishListUtils.getWishListNameInputFilters());
            mRegistrantFirstNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f100675);
            mRegistrantFirstNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100674);
            mRegistrantFirstNameLabel.attach(mRegistrantFirstNameEditText);
            mRegistrantLastNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f100677);
            mRegistrantLastNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100676);
            mRegistrantLastNameLabel.attach(mRegistrantLastNameEditText);
            mUsStateLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100678);
            mUsStateSpinner = (NoDefaultSpinner)ViewUtil.findViewById(mRootView, 0x7f100679);
            mUsStateSpinner.setAdapter(new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mActivity, 0x7f090659, 0x7f0e000e));
            mCoRegistrantFirstNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f10067d);
            mCoRegistrantFirstNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10067c);
            mCoRegistrantFirstNameLabel.attach(mCoRegistrantFirstNameEditText);
            mCoRegistrantLastNameEditText = (EditText)ViewUtil.findViewById(mRootView, 0x7f10067f);
            mCoRegistrantLastNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10067e);
            mCoRegistrantLastNameLabel.attach(mCoRegistrantLastNameEditText);
            mRegistrantContainer = ViewUtil.findViewById(mRootView, 0x7f100673);
            mCoRegistrantContainer = ViewUtil.findViewById(mRootView, 0x7f10067b);
            mAddCoRegistrant = ViewUtil.findViewById(mRootView, 0x7f10067a);
            mListNameEditText.setText(mList.name);
            mDeleteButton = ViewUtil.findViewById(mRootView, 0x7f100682);
            mRadioButtonController = new RadioButtonController(new RadioButton[] {
                (RadioButton)ViewUtil.findViewById(mRootView, 0x7f100671), (RadioButton)ViewUtil.findViewById(mRootView, 0x7f100680)
            });
            viewgroup = mRadioButtonController;
            int i;
            if (mList.isPublic())
            {
                i = 0x7f100671;
            } else
            {
                i = 0x7f100680;
            }
            viewgroup.check(i);
            fillRegistrantFields();
            wireListeners();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        restoreToolbarNavIcon();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (menuitem.getItemId() == 0x7f100007)
        {
            saveChanges();
            return true;
        } else
        {
            return super.onOptionsMenuItemSelected(menuitem, activity);
        }
    }

    protected void onPageView()
    {
        super.onPageView();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "edit list details").putString("section", "lists");
        MessageBus.getBus().post(builder);
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }

    public void onPop()
    {
        super.onPop();
        restoreToolbarNavIcon();
        if (mRootView != null)
        {
            ViewUtil.hideKeyboard(mRootView);
        }
    }















}
