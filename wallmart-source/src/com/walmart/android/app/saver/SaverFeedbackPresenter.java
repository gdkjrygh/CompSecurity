// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AniviaAnalytics;
import com.walmart.android.app.item.ItemPriceView;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.CompetitorsResponse;
import com.walmart.android.service.saver.FeedbackRequest;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmart.android.wmui.PriceInputView;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.ui.FloatLabel;
import com.walmartlabs.ui.NoDefaultSpinner;
import com.walmartlabs.utils.WLog;
import java.text.Collator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class SaverFeedbackPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void onEligibilityLinkClicked();

        public abstract void onFeedbackSubmitted();
    }


    private static final int DIALOG_DATE_HELP = 2;
    private static final int DIALOG_ERROR = 1;
    private static final int DIALOG_PROGRESS = 0;
    private static final DateFormat LOCALE_DATE_FORMAT = DateFormat.getDateInstance();
    private static final DateFormat REQUEST_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final String TAG = com/walmart/android/app/saver/SaverFeedbackPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private com.walmartlabs.ui.NoDefaultSpinner.Adapter mAdapter;
    private FloatLabel mCompetitorNameLabel;
    private NoDefaultSpinner mCompetitorNameView;
    private Bitmap mDefaultImage;
    private final Calendar mEndDate = Calendar.getInstance();
    private FloatLabel mEndDateLabel;
    private EditText mEndDateView;
    private final String mImageUrl;
    private final Spanned mItemName;
    private final String mPrice;
    private FloatLabel mPriceLabel;
    private PriceInputView mPriceView;
    private Date mReceiptDate;
    private View mRootView;
    private final Calendar mStartDate = Calendar.getInstance();
    private FloatLabel mStartDateLabel;
    private EditText mStartDateView;
    private final String mStoreId;
    private final String mTcNumber;
    private final String mUpc;

    public SaverFeedbackPresenter(Activity activity, String s, String s1, String s2, Spanned spanned, String s3, String s4, 
            String s5, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mStoreId = s;
        mActionCallbacks = actioncallbacks;
        mUpc = s1;
        mImageUrl = s2;
        mItemName = spanned;
        mPrice = s3;
        mTcNumber = s4;
        try
        {
            mReceiptDate = EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(s5);
            mStartDate.setTime(mReceiptDate);
            mEndDate.setTime(mReceiptDate);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        setTitleText(mActivity.getString(0x7f0904b9));
    }

    private void clearPriceFocus()
    {
        ViewUtil.hideKeyboard(mPriceView);
        mPriceView.setFocusableInTouchMode(false);
        mPriceView.setFocusable(false);
        mPriceView.setFocusable(true);
        mPriceView.setFocusableInTouchMode(true);
    }

    private void findNearbyCompetitors()
    {
        SaverManager.get().findNearbyCompetitors(mStoreId, new AsyncCallbackOnThread(new Handler()) {

            final SaverFeedbackPresenter this$0;

            public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
            {
                if (isTop())
                {
                    showDialog(1);
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
            }

            public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
            {
label0:
                {
                    if (!isPopped())
                    {
                        if (competitorsresponse.payload != null && competitorsresponse.payload.competitors != null && competitorsresponse.payload.competitors.size() != 0)
                        {
                            break label0;
                        }
                        onFailureSameThread(Integer.valueOf(0x15f90), competitorsresponse);
                    }
                    return;
                }
                HashSet hashset = new HashSet(competitorsresponse.payload.competitors.size());
                for (competitorsresponse = competitorsresponse.payload.competitors.iterator(); competitorsresponse.hasNext(); hashset.add(((com.walmart.android.service.saver.CompetitorsResponse.Competitor)competitorsresponse.next()).name)) { }
                competitorsresponse = new ArrayList(hashset);
                Collections.sort(competitorsresponse, Collator.getInstance());
                mAdapter.clear();
                mAdapter.addAll(competitorsresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((CompetitorsResponse)obj);
            }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(handler);
            }
        });
    }

    private boolean isCompetitorNameValid()
    {
        if (TextUtils.isEmpty((String)mCompetitorNameView.getSelectedItem()))
        {
            mCompetitorNameLabel.setError(0x7f0904a9);
            return false;
        } else
        {
            mCompetitorNameLabel.clearError();
            return true;
        }
    }

    private boolean isEndDateValid()
    {
        if (TextUtils.isEmpty(mEndDateView.getText()))
        {
            mEndDateLabel.setError(0x7f0904b1);
            return false;
        } else
        {
            mEndDateLabel.clearError();
            return true;
        }
    }

    private boolean isPriceValid()
    {
        if (TextUtils.isEmpty(mPriceView.getPrice(Locale.US)))
        {
            mPriceLabel.setError(0x7f0904b8);
            return false;
        } else
        {
            mPriceLabel.clearError();
            return true;
        }
    }

    private boolean isStartDateValid()
    {
        if (TextUtils.isEmpty(mStartDateView.getText()))
        {
            mStartDateLabel.setError(0x7f0904ba);
            return false;
        } else
        {
            mStartDateLabel.clearError();
            return true;
        }
    }

    private boolean isValid()
    {
        return isCompetitorNameValid() & isPriceValid() & isStartDateValid() & isEndDateValid();
    }

    private void loadProductImage(String s)
    {
        if (s != null && !"".equals(s))
        {
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final SaverFeedbackPresenter this$0;

                public void onFailureSameThread(Integer integer, Bitmap bitmap)
                {
                    WLog.e(SaverFeedbackPresenter.TAG, (new StringBuilder()).append("Failed to load detail image: ").append(integer).toString());
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (Bitmap)obj1);
                }

                public void onSuccessSameThread(Bitmap bitmap)
                {
                    if (isPopped())
                    {
                        bitmap.recycle();
                        return;
                    } else
                    {
                        updateImage(bitmap);
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((Bitmap)obj);
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(handler);
            }
            };
            Services.get().getWalmartService().getImage(s, asynccallbackonthread);
            return;
        } else
        {
            updateImage(mDefaultImage);
            return;
        }
    }

    private void submit()
    {
        if (isValid())
        {
            FeedbackRequest feedbackrequest = new FeedbackRequest();
            feedbackrequest.category = "Item Specific";
            if (mCompetitorNameView.getSelectedItem() != null)
            {
                feedbackrequest.competitorName = mCompetitorNameView.getSelectedItem().toString();
            }
            feedbackrequest.tcNbr = mTcNumber;
            feedbackrequest.upcNbr = mUpc;
            feedbackrequest.startDate = REQUEST_DATE_FORMAT.format(mStartDate.getTime());
            feedbackrequest.endDate = REQUEST_DATE_FORMAT.format(mEndDate.getTime());
            feedbackrequest.description = (new StringBuilder()).append("Advertised price ").append(mPriceView.getPrice(Locale.US)).toString();
            showDialog(0);
            SaverManager.get().submitFeedback(feedbackrequest, new AsyncCallbackOnThread(feedbackrequest) {

                final SaverFeedbackPresenter this$0;
                final FeedbackRequest val$request;

                public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
                {
                    dismissDialog(0);
                    showDialog(1);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (StatusResponse)obj1);
                }

                public void onSuccessSameThread(StatusResponse statusresponse)
                {
                    dismissDialog(0);
                    mActionCallbacks.onFeedbackSubmitted();
                    statusresponse = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("missedCompForm")).putString("itemUPC", mUpc).putString("itemName", mItemName.toString()).putString("itemPrice", mPrice.replaceAll("\\$", "").replaceAll(",", "")).putString("startDate", AniviaAnalytics.DATE_FORMAT.format(mStartDate.getTime())).putString("endDate", AniviaAnalytics.DATE_FORMAT.format(mEndDate.getTime()));
                    if (request.competitorName != null)
                    {
                        statusresponse.putString("compName", request.competitorName);
                    }
                    MessageBus.getBus().post(statusresponse);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((StatusResponse)obj);
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                request = feedbackrequest;
                super(final_handler);
            }
            });
        }
    }

    private void updateImage(Bitmap bitmap)
    {
        ImageView imageview = (ImageView)mRootView.findViewById(0x7f100481);
        imageview.setImageBitmap(bitmap);
        bitmap = new AlphaAnimation(0.0F, 1.0F);
        bitmap.setDuration(250L);
        imageview.startAnimation(bitmap);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        ViewUtil.recycleImageView(mRootView, 0x7f100481);
        if (mDefaultImage != null && !mDefaultImage.isRecycled())
        {
            mDefaultImage.recycle();
        }
        mRootView = null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mPriceView != null)
        {
            ViewUtil.hideKeyboard(mPriceView);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setMessage(mActivity.getString(0x7f0900cc));
            return progressdialog;

        case 1: // '\001'
            return (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setMessage(0x7f0904a8).setCancelable(true).setNeutralButton(0x7f090292, null).create();

        case 2: // '\002'
            return (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setMessage(0x7f0904ae).setCancelable(true).setNeutralButton(0x7f090292, null).create();
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f04014d, viewgroup, false);
            mDefaultImage = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(mActivity.getResources(), 0x7f02021b), 100, 100, true);
            loadProductImage(mImageUrl);
            ViewUtil.setTextHideIfEmpty(0x7f100482, mRootView, mItemName);
            viewgroup = (ItemPriceView)ViewUtil.findViewById(mRootView, 0x7f100483);
            viewgroup.setPrice(mPrice);
            viewgroup.setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f100484).setOnClickListener(new OnSingleClickListener(this) {

                final SaverFeedbackPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mActionCallbacks != null)
                    {
                        mActionCallbacks.onEligibilityLinkClicked();
                    }
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(presenter);
            }
            });
            mCompetitorNameView = (NoDefaultSpinner)ViewUtil.findViewById(mRootView, 0x7f100486);
            mCompetitorNameLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100485);
            mCompetitorNameView.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final SaverFeedbackPresenter this$0;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    mCompetitorNameLabel.show();
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                    mCompetitorNameLabel.hide();
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super();
            }
            });
            mCompetitorNameView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final SaverFeedbackPresenter this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    if (motionevent.getAction() == 1)
                    {
                        clearPriceFocus();
                    }
                    return false;
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super();
            }
            });
            mAdapter = new com.walmartlabs.ui.NoDefaultSpinner.Adapter(mActivity, mActivity.getString(0x7f0904b2), new String[0]);
            mAdapter.setDropDownViewResource(0x1090009);
            mCompetitorNameView.setAdapter(mAdapter);
            mPriceView = (PriceInputView)ViewUtil.findViewById(mRootView, 0x7f100488);
            mPriceLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100487);
            mPriceLabel.attach(mPriceView);
            mStartDateView = (EditText)ViewUtil.findViewById(mRootView, 0x7f10048a);
            mStartDateView.setOnClickListener(new OnSingleClickListener(this) {

                final SaverFeedbackPresenter this$0;

                public void onSingleClick(View view)
                {
                    clearPriceFocus();
                    view = new android.app.DatePickerDialog.OnDateSetListener() {

                        final _cls4 this$1;

                        public void onDateSet(DatePicker datepicker, int i, int j, int k)
                        {
                            mStartDate.set(1, i);
                            mStartDate.set(2, j);
                            mStartDate.set(5, k);
                            mStartDateView.setText(SaverFeedbackPresenter.LOCALE_DATE_FORMAT.format(mStartDate.getTime()));
                        }

            
            {
                this$1 = _cls4.this;
                super();
            }
                    };
                    view = new DatePickerDialog(mActivity, view, mStartDate.get(1), mStartDate.get(2), mStartDate.get(5));
                    long l;
                    if (mReceiptDate != null)
                    {
                        l = mReceiptDate.getTime();
                    } else
                    {
                        l = mEndDate.getTimeInMillis();
                    }
                    view.getDatePicker().setMaxDate(l);
                    view.show();
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(presenter);
            }
            });
            mStartDateLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f100489);
            mStartDateLabel.attach(mStartDateView);
            mEndDateView = (EditText)ViewUtil.findViewById(mRootView, 0x7f10048d);
            mEndDateView.setOnClickListener(new OnSingleClickListener(this) {

                final SaverFeedbackPresenter this$0;

                public void onSingleClick(View view)
                {
                    clearPriceFocus();
                    view = new android.app.DatePickerDialog.OnDateSetListener() {

                        final _cls5 this$1;

                        public void onDateSet(DatePicker datepicker, int i, int j, int k)
                        {
                            mEndDate.set(1, i);
                            mEndDate.set(2, j);
                            mEndDate.set(5, k);
                            mEndDateView.setText(SaverFeedbackPresenter.LOCALE_DATE_FORMAT.format(mEndDate.getTime()));
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    };
                    view = new DatePickerDialog(mActivity, view, mEndDate.get(1), mEndDate.get(2), mEndDate.get(5));
                    long l;
                    if (mReceiptDate != null)
                    {
                        l = mReceiptDate.getTime();
                    } else
                    {
                        l = mStartDate.getTimeInMillis();
                    }
                    view.getDatePicker().setMinDate(l);
                    view.show();
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(presenter);
            }
            });
            mEndDateLabel = (FloatLabel)ViewUtil.findViewById(mRootView, 0x7f10048c);
            mEndDateLabel.attach(mEndDateView);
            ViewUtil.findViewById(mRootView, 0x7f10048e).setOnClickListener(new OnSingleClickListener(this) {

                final SaverFeedbackPresenter this$0;

                public void onSingleClick(View view)
                {
                    clearPriceFocus();
                    submit();
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f10048b).setOnClickListener(new OnSingleClickListener(this) {

                final SaverFeedbackPresenter this$0;

                public void onSingleClick(View view)
                {
                    clearPriceFocus();
                    showDialog(2);
                }

            
            {
                this$0 = SaverFeedbackPresenter.this;
                super(presenter);
            }
            });
            findNearbyCompetitors();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        if (mPriceView != null)
        {
            ViewUtil.hideKeyboard(mPriceView);
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Missed Ad").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        MessageBus.getBus().post(builder);
    }

    public void onPop()
    {
        super.onPop();
        if (mPriceView != null)
        {
            ViewUtil.hideKeyboard(mPriceView);
        }
    }























}
