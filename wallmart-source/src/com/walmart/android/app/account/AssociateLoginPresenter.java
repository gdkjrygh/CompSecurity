// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.data.StatusMessage;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;

// Referenced classes of package com.walmart.android.app.account:
//            AccountListener

public class AssociateLoginPresenter extends Presenter
{

    private static final int DIALOG_ERROR = 4;
    private static final int DIALOG_NO_CARD = 2;
    private static final int DIALOG_NO_ID = 1;
    private static final int DIALOG_NO_NETWORK = 5;
    private static final int DIALOG_PROGRESS = 3;
    private static final int DIALOG_UNKNOWN_ERROR = 6;
    private AccountListener mAccountListener;
    private final Context mContext;
    private final View mView;

    public AssociateLoginPresenter(final Context associateIdText)
    {
        mContext = associateIdText;
        mView = LayoutInflater.from(associateIdText).inflate(0x7f040027, null);
        associateIdText = (EditText)mView.findViewById(0x7f10008f);
        associateIdText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        final EditText associateCardText = (EditText)mView.findViewById(0x7f100091);
        ((TextView)mView.findViewById(0x7f100092)).setMovementMethod(WalmartLinkMovementMethod.getInstance(mContext));
        ((Button)mView.findViewById(0x7f100094)).setOnClickListener(new android.view.View.OnClickListener() {

            final AssociateLoginPresenter this$0;
            final EditText val$associateCardText;
            final EditText val$associateIdText;

            public void onClick(View view)
            {
                view = associateIdText.getText().toString();
                String s = associateCardText.getText().toString();
                if (TextUtils.isEmpty(view))
                {
                    showDialog(1);
                    return;
                }
                if (TextUtils.isEmpty(s))
                {
                    showDialog(2);
                    return;
                } else
                {
                    ((InputMethodManager)mContext.getSystemService("input_method")).hideSoftInputFromWindow(associateCardText.getWindowToken(), 0);
                    applyDiscount(view, s);
                    return;
                }
            }

            
            {
                this$0 = AssociateLoginPresenter.this;
                associateIdText = edittext;
                associateCardText = edittext1;
                super();
            }
        });
        ((Button)mView.findViewById(0x7f100095)).setOnClickListener(new android.view.View.OnClickListener() {

            final AssociateLoginPresenter this$0;

            public void onClick(View view)
            {
                denyDiscount();
            }

            
            {
                this$0 = AssociateLoginPresenter.this;
                super();
            }
        });
    }

    private void applyDiscount(String s, String s1)
    {
        Services.get().getWalmartService().applyAssociateDiscount(s, s1, new AsyncCallbackOnThread(new Handler()) {

            final AssociateLoginPresenter this$0;

            public void onFailureSameThread(Integer integer, StatusMessage astatusmessage[])
            {
                dismissDialog(3);
                if (integer.intValue() == 0x15f93)
                {
                    showDialog(4);
                    return;
                }
                if (integer.intValue() == 0x15f92)
                {
                    showDialog(5);
                    return;
                } else
                {
                    showDialog(6);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StatusMessage[])obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StatusMessage[])obj);
            }

            public void onSuccessSameThread(StatusMessage astatusmessage[])
            {
                if (astatusmessage != null && astatusmessage.length > 0)
                {
                    dismissDialog(3);
                    showDialog(4);
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            
            {
                this$0 = AssociateLoginPresenter.this;
                super(handler);
            }
        });
        showDialog(3);
    }

    private void denyDiscount()
    {
        Services.get().getWalmartService().setAssoicateDiscountDeclined(new AsyncCallbackOnThread(new Handler()) {

            final AssociateLoginPresenter this$0;

            public void onFailureSameThread(Integer integer, StatusMessage astatusmessage[])
            {
                dismissDialog(3);
                if (integer.intValue() == 0x15f93)
                {
                    showDialog(6);
                    return;
                }
                if (integer.intValue() == 0x15f92)
                {
                    showDialog(5);
                    return;
                } else
                {
                    showDialog(6);
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StatusMessage[])obj1);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StatusMessage[])obj);
            }

            public void onSuccessSameThread(StatusMessage astatusmessage[])
            {
                finish();
            }

            
            {
                this$0 = AssociateLoginPresenter.this;
                super(handler);
            }
        });
        showDialog(3);
    }

    private void finish()
    {
        if (mAccountListener != null)
        {
            mAccountListener.onLoginCompleted(false, false, false);
        }
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Associate Sign In");
    }

    public String getTitleText()
    {
        return mContext.getString(0x7f090080);
    }

    public View getView()
    {
        return mView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        trackPageView();
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = (new com.walmart.android.ui.dialog.AlertDialog.Builder(mContext)).setCancelable(true).setPositiveButton("OK", null);
        if (i == 1)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle("No Associate ID").setMessage("Please enter your associate ID.");
        } else
        if (i == 2)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle("No Associate Card Number").setMessage("Please enter your associate card number.");
        } else
        if (i == 4)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle("Failed").setMessage("Please check the Associate ID and Card Number and try again.");
        } else
        if (i == 5)
        {
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090283).setMessage(0x7f090282);
        } else
        {
            if (i == 3)
            {
                obj = CustomProgressDialog.create(mContext);
                ((ProgressDialog) (obj)).setCancelable(false);
                ((ProgressDialog) (obj)).setIndeterminate(true);
                ((ProgressDialog) (obj)).setMessage("Loading...");
                return ((Dialog) (obj));
            }
            ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setTitle(0x7f090285).setMessage(0x7f090284);
        }
        return ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).create();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }

    public void setAccountListener(AccountListener accountlistener)
    {
        mAccountListener = accountlistener;
    }
















}
