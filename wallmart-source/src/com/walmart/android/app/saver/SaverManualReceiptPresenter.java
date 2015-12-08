// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.SaverViewEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.payment.view.NumberFormattingTextWatcher;
import com.walmartlabs.ui.FloatLabel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNotificationUtils

public class SaverManualReceiptPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void onForceClose();

        public abstract void onReceiptInfoEntered(String s, String s1);

        public abstract void onShowCompetitors(String s, String s1, String s2, String s3, boolean flag);

        public abstract void onShowReceipt(String s, String s1, String s2, String s3, boolean flag);
    }

    private class EReceiptCallback extends SaverSubmitReceipt.EReceiptCallback
    {

        final SaverManualReceiptPresenter this$0;

        protected void dismissDialog(int i)
        {
            SaverManualReceiptPresenter.this.dismissDialog(i);
        }

        protected boolean isTop()
        {
            return SaverManualReceiptPresenter.this.isTop();
        }

        protected void onNotFoundFailure()
        {
            AppConfig appconfig = AppConfigManager.get().getAppConfig();
            if (appconfig == null || !appconfig.allowSaverWithoutEReceipt)
            {
                showDialog(1002);
                String s;
                if (mIsManual)
                {
                    s = "Error Handling - Text Entry Not Recognized";
                } else
                {
                    s = "Error Handling - Scan Entry Not Recognized";
                }
                trackError(s);
                return;
            } else
            {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("DIALOG_ARG_TC", mTcNbrView.getText());
                bundle.putCharSequence("DIALOG_ARG_DATE", mDateView.getText());
                showDialog(103, bundle);
                return;
            }
        }

        protected void onReceipt(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
        {
            mRuid = receipt.uuid;
            if (receipt.store != null)
            {
                mStoreId = receipt.store.id;
            }
        }

        protected void showDialog(int i)
        {
            SaverManualReceiptPresenter.this.showDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            SaverManualReceiptPresenter.this.showDialog(i, bundle);
        }

        public EReceiptCallback(Handler handler)
        {
            this$0 = SaverManualReceiptPresenter.this;
            super(handler);
        }
    }

    private class SaverCallback extends SaverSubmitReceipt.SaverCallback
    {

        final SaverManualReceiptPresenter this$0;

        protected void dismissDialog(int i)
        {
            SaverManualReceiptPresenter.this.dismissDialog(i);
        }

        protected boolean isEReceipt()
        {
            return mRuid != null;
        }

        protected boolean isTop()
        {
            return SaverManualReceiptPresenter.this.isTop();
        }

        public void onSuccessSameThread(StatusResponse statusresponse)
        {
            Toast.makeText(mActivity, 0x7f090537, 0).show();
            if (isTop())
            {
                dismissDialog(1001);
                mActionCallbacks.onShowCompetitors(mRuid, mTcNbr, SaverNotificationUtils.getLocalDate(mDate), mStoreId, true);
            }
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StatusResponse)obj);
        }

        protected void showDialog(int i)
        {
            SaverManualReceiptPresenter.this.showDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            SaverManualReceiptPresenter.this.showDialog(i, bundle);
        }

        public SaverCallback(Handler handler)
        {
            this$0 = SaverManualReceiptPresenter.this;
            super(handler);
        }
    }


    private static final int DIALOG_ALREADY_SUBMITTED = 1005;
    private static final String DIALOG_ARG_DATE = "DIALOG_ARG_DATE";
    private static final String DIALOG_ARG_TC = "DIALOG_ARG_TC";
    private static final int DIALOG_NO_CONNECTION = 102;
    private static final int DIALOG_PLEASE_SIGN_IN = 101;
    private static final int DIALOG_PROGRESS = 1001;
    private static final int DIALOG_SAVER_NOT_ELIGIBLE = 1004;
    private static final int DIALOG_TC_CONFIRM = 103;
    private static final int DIALOG_TC_NOT_VALID = 1002;
    private static final int DIALOG_UNKNOWN_ERROR = 1003;
    private static final int DIALOG_WEEKLY_LIMIT = 1006;
    private static final int REQUEST_CODE_SIGN_IN = 1;
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private Date mDate;
    private FloatLabel mDateLabel;
    private TextView mDateView;
    private final boolean mDontSubmit;
    private Handler mHandler;
    private final boolean mIsManual;
    private String mOrigin;
    private View mRootView;
    private String mRuid;
    private final long mScanStartTime;
    private ScrollView mScrollView;
    private String mStoreId;
    private String mTcNbr;
    private FloatLabel mTcNbrLabel;
    private TextView mTcNbrView;

    public SaverManualReceiptPresenter(Activity activity, boolean flag, String s, long l, ActionCallbacks actioncallbacks, boolean flag1, 
            String s1)
    {
        mActivity = activity;
        mIsManual = flag;
        mDontSubmit = flag1;
        mTcNbr = s;
        mScanStartTime = l;
        mActionCallbacks = actioncallbacks;
        mHandler = new Handler();
        mOrigin = s1;
        setTitleText(activity.getString(0x7f0904cd));
    }

    private void checkAndSubmit()
    {
label0:
        {
            if (validate())
            {
                if (!mDontSubmit)
                {
                    break label0;
                }
                mActionCallbacks.onReceiptInfoEntered(mTcNbr, SaverNotificationUtils.getLocalDate(mDate));
            }
            return;
        }
        if (!NetworkConnectivityHelper.isConnected(mActivity))
        {
            showDialog(102);
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverManualReceiptPresenter this$0;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        startSignIn();
                    }
                }

                public void onSuccess()
                {
                    submit();
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
            });
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", mTcNbr));
            return;
        }
    }

    private void checkAndSubmitToSaver()
    {
        if (!NetworkConnectivityHelper.isConnected(mActivity))
        {
            showDialog(102);
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverManualReceiptPresenter this$0;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        startSignIn();
                    }
                }

                public void onSuccess()
                {
                    SaverManager savermanager = SaverManager.get();
                    String s1 = mTcNbr;
                    Date date = mDate;
                    String s;
                    if (mIsManual)
                    {
                        s = "tc-manual";
                    } else
                    {
                        s = "tc-scan";
                    }
                    savermanager.addReceiptToSaverByTc(s1, date, s, new SaverCallback(mHandler));
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
            });
            return;
        }
    }

    private View createConfirmationView()
    {
        View view = ViewUtil.inflate(mActivity, 0x7f04014a);
        ViewUtil.setText(0x7f10047c, view, mActivity.getString(0x7f0904cc, new Object[] {
            getDialogArguments().getCharSequence("DIALOG_ARG_TC")
        }));
        ViewUtil.setText(0x7f10047d, view, mActivity.getString(0x7f0904c9, new Object[] {
            getDialogArguments().getCharSequence("DIALOG_ARG_DATE")
        }));
        return view;
    }

    private int getScanTime()
    {
        return (int)(System.currentTimeMillis() - mScanStartTime) / 1000;
    }

    private boolean parseDate()
    {
        try
        {
            mDate = EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.parse(String.valueOf(mDateView.getText()));
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    private boolean parseTcNbr()
    {
        mTcNbr = mTcNbrView.getText().toString().replace(" ", "");
        return !TextUtils.isEmpty(mTcNbr);
    }

    private void postScanAnalyticsEvent()
    {
        if (mIsManual && mScanStartTime > 0L)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("saverScannerOpenTimeAndResult")).putString("scanResult", "manual").putInt("time", getScanTime()).putString("error", "none");
            MessageBus.getBus().post(builder);
        }
    }

    private void smoothScrollTo(ScrollView scrollview, View view)
    {
label0:
        {
            int i = view.getTop();
            for (view = view.getParent(); view != null && view != scrollview; view = view.getParent())
            {
                if (!(view instanceof View))
                {
                    break label0;
                }
                i += ((View)view).getTop();
            }

            if (view == scrollview)
            {
                scrollview.smoothScrollTo(0, i);
            }
        }
    }

    private void startSignIn()
    {
        mActivity.startActivityForResult(SaverUtils.createSignInIntent(mActivity), 1);
        mActivity.overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    private void submit()
    {
        SharedPreferencesUtil.setSaverReceiptScanned(mActivity, true);
        SaverManager.get().getReceiptByTc(mTcNbr, mDate, new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverManualReceiptPresenter this$0;

            public void onResult(SaverReceipt saverreceipt)
            {
                if (saverreceipt != null)
                {
                    mRuid = saverreceipt.uuid;
                    if (saverreceipt.store != null)
                    {
                        mStoreId = saverreceipt.store.id;
                    }
                    if (saverreceipt.hasSummary)
                    {
                        if (isTop())
                        {
                            mActionCallbacks.onShowReceipt(mRuid, mTcNbr, SaverNotificationUtils.getLocalDate(mDate), mStoreId, true);
                        }
                        return;
                    }
                    SaverManager savermanager1 = SaverManager.get();
                    String s;
                    if (mIsManual)
                    {
                        s = "tc-manual";
                    } else
                    {
                        s = "tc-scan";
                    }
                    savermanager1.addReceiptToSaver(saverreceipt, s, new SaverCallback(mHandler));
                    return;
                }
                SaverManager savermanager = SaverManager.get();
                String s1 = mTcNbr;
                Date date = mDate;
                if (mIsManual)
                {
                    saverreceipt = "tc-manual";
                } else
                {
                    saverreceipt = "tc-scan";
                }
                savermanager.retrieveReceiptByTc(s1, date, saverreceipt, new EReceiptCallback(mHandler), new SaverCallback(mHandler));
            }

            public volatile void onResult(Object obj)
            {
                onResult((SaverReceipt)obj);
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        });
        postScanAnalyticsEvent();
    }

    private boolean validateDate()
    {
        Date date = new Date();
        if (TextUtils.isEmpty(mDateView.getText().toString()) || !parseDate() || date.before(mDate))
        {
            mDateLabel.setError(0x7f0900ce);
            mScrollView.post(new Runnable() {

                final SaverManualReceiptPresenter this$0;

                public void run()
                {
                    smoothScrollTo(mScrollView, mDateLabel);
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
            });
            return false;
        } else
        {
            mDateLabel.clearError();
            return true;
        }
    }

    private boolean validateTcNbr()
    {
        if (TextUtils.isEmpty(mTcNbrView.getText().toString()) || !parseTcNbr())
        {
            mTcNbrLabel.setError(0x7f0900d3);
            mScrollView.post(new Runnable() {

                final SaverManualReceiptPresenter this$0;

                public void run()
                {
                    smoothScrollTo(mScrollView, mTcNbrLabel);
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
            });
            return false;
        } else
        {
            mTcNbrLabel.clearError();
            return true;
        }
    }

    public View getView()
    {
        return mRootView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        super.onActivityResultAsTop(i, j, intent);
        if (i == 1)
        {
            if (j != 1)
            {
                showDialog(101);
            } else
            if (validate())
            {
                showDialog(1001);
                submit();
                return;
            }
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj;
        Object obj1 = null;
        obj = obj1;
        if (getDialogArguments() != null)
        {
            obj = obj1;
            if (getDialogArguments().containsKey("DIALOG_ARG_MESSAGE"))
            {
                obj = getDialogArguments().getString("DIALOG_ARG_MESSAGE");
            }
        }
        i;
        JVM INSTR lookupswitch 9: default 120
    //                   101: 153
    //                   102: 496
    //                   103: 527
    //                   1001: 128
    //                   1002: 209
    //                   1003: 279
    //                   1004: 384
    //                   1005: 440
    //                   1006: 328;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L4:
        break MISSING_BLOCK_LABEL_527;
_L1:
        obj = null;
_L11:
        if (obj != null)
        {
            return ((Dialog) (obj));
        } else
        {
            return super.onCreateDialog(i);
        }
_L5:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(0x7f0900cc));
          goto _L11
_L2:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090534).setPositiveButton(0x7f090535, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                startSignIn();
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).setNegativeButton(0x7f090536, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                dialoginterface = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", com.walmart.android.util.TextUtils.truncate("Error Handling - Deny to Sign In", 60));
                MessageBus.getBus().post(dialoginterface);
                mActionCallbacks.onForceClose();
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).setCancelable(false).create();
          goto _L11
_L6:
        Object obj2 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = mActivity;
            int j;
            if (mIsManual)
            {
                j = 0x7f090531;
            } else
            {
                j = 0x7f090532;
            }
            obj2 = ((Activity) (obj)).getString(j);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(((CharSequence) (obj2))).setNeutralButton(0x7f090292, null).create();
          goto _L11
_L7:
        Object obj3 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj3 = mActivity.getString(0x7f0904a8);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(((CharSequence) (obj3))).setNeutralButton(0x7f090292, null).create();
          goto _L11
_L10:
        Object obj4 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj4 = mActivity.getString(0x7f090533);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(((CharSequence) (obj4))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                mActionCallbacks.onForceClose();
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).create();
          goto _L11
_L8:
        Object obj5 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj5 = mActivity.getString(0x7f09052f);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(((CharSequence) (obj5))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                mActionCallbacks.onShowReceipt(null, null, null, null, true);
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).create();
          goto _L11
_L9:
        Object obj6 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj6 = mActivity.getString(0x7f09052e);
        }
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(((CharSequence) (obj6))).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                mActionCallbacks.onShowReceipt(mRuid, mTcNbr, SaverNotificationUtils.getLocalDate(mDate), mStoreId, true);
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).create();
          goto _L11
_L3:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090282).setNeutralButton(0x7f090292, null).create();
          goto _L11
        obj = createConfirmationView();
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setView(((View) (obj))).setPositiveButton(0x7f0904cb, new android.content.DialogInterface.OnClickListener() {

            final SaverManualReceiptPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                checkAndSubmitToSaver();
            }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
        }).setNegativeButton(0x7f0904ca, null).create();
          goto _L11
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f04017c, viewgroup, false);
            mScrollView = (ScrollView)ViewUtil.findViewById(mRootView, 0x7f10051e);
            mTcNbrView = (TextView)ViewUtil.findViewById(mRootView, 0x7f100521);
            mTcNbrView.addTextChangedListener(new NumberFormattingTextWatcher());
            mTcNbrView.setRawInputType(2);
            mTcNbrLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100520);
            mTcNbrLabel.attach(mTcNbrView);
            mDateView = (TextView)ViewUtil.findViewById(mRootView, 0x7f100523);
            mDateLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100522);
            mDateLabel.attach(mDateView);
            viewgroup = (TextView)ViewUtil.findViewById(mRootView, 0x7f10051d);
            if (mTcNbr != null)
            {
                mTcNbrView.setText(mTcNbr);
            }
            if (!mIsManual)
            {
                mTcNbrView.setEnabled(false);
                ViewUtil.setText(0x7f10051f, mRootView, 0x7f0900cf);
            }
            final Calendar today = Calendar.getInstance();
            mDateView.setOnClickListener(new android.view.View.OnClickListener() {

                final SaverManualReceiptPresenter this$0;
                final Calendar val$today;

                public void onClick(View view)
                {
                    view = Calendar.getInstance();
                    try
                    {
                        if (!TextUtils.isEmpty(mDateView.getText()))
                        {
                            view.setTime(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.parse(String.valueOf(mDateView.getText())));
                        }
                    }
                    catch (Exception exception) { }
                    view = new DatePickerDialog(mActivity, view. new android.app.DatePickerDialog.OnDateSetListener() {

                        final _cls1 this$1;
                        final Calendar val$calendar;

                        public void onDateSet(DatePicker datepicker, int i, int j, int k)
                        {
                            calendar.set(i, j, k);
                            mDateView.setText(EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.format(calendar.getTime()));
                        }

            
            {
                this$1 = final__pcls1;
                calendar = Calendar.this;
                super();
            }
                    }, view.get(1), view.get(2), view.get(5));
                    view.getDatePicker().setMaxDate(today.getTimeInMillis());
                    view.show();
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                today = calendar;
                super();
            }
            });
            viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                final SaverManualReceiptPresenter this$0;

                public void onClick(View view)
                {
                    checkAndSubmit();
                }

            
            {
                this$0 = SaverManualReceiptPresenter.this;
                super();
            }
            });
        }
        if (mTcNbr == null)
        {
            mTcNbrView.requestFocus();
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
        String s;
        byte byte0;
        builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Receipt - Manual Entry");
        s = mOrigin;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 56
    //                   1729708567: 117
    //                   2087586876: 132;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 76
    //                   0 147;
           goto _L4 _L5
_L4:
        builder.putString("section", "Saver - Receipt").putString("subCategory", "Receipt");
        MessageBus.getBus().post(new SaverViewEvent());
_L6:
        MessageBus.getBus().post(builder);
        return;
_L2:
        if (s.equals("origin_list"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("origin_saver"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        builder.putString("section", "lists").putString("subCategory", "lists");
          goto _L6
    }

    protected boolean validate()
    {
        return validateDate() & validateTcNbr();
    }
























/*
    static String access$502(SaverManualReceiptPresenter savermanualreceiptpresenter, String s)
    {
        savermanualreceiptpresenter.mRuid = s;
        return s;
    }

*/





/*
    static String access$802(SaverManualReceiptPresenter savermanualreceiptpresenter, String s)
    {
        savermanualreceiptpresenter.mStoreId = s;
        return s;
    }

*/

}
