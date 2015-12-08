// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.models.ReceiptModel;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.ui.recycler.ListRecyclerView;

// Referenced classes of package com.walmart.android.app.wishlist:
//            MatchedItemsAdapter

public class ReceiptMatchPresenter extends Presenter
{
    static interface UpdateListener
    {

        public abstract void afterUpdate(boolean flag);

        public abstract void beforeUpdate();

        public abstract void startReceiptScanner();
    }


    private static final int DIALOG_CONNECTION_ERROR = 2;
    private static final int DIALOG_UNKNOWN_ERROR = 3;
    private static final int DIALOG_UPDATE_DONE = 1;
    private final AppCompatActivity mActivity;
    private final MatchedItemsAdapter mAdapter;
    private ListRecyclerView mListView;
    private View mLoadingView;
    private View mMarkButtonContainer;
    private Button mMarkPurchasedButton;
    private Request mMatchItemsRequest;
    private View mNoMatchesView;
    private final String mReceiptDate;
    private View mResultsContainer;
    private View mReturnToListButton;
    private final String mRid;
    private View mRootView;
    private View mScanAgainButton;
    private final String mTcNumber;
    private final UpdateListener mUpdateListener;
    private final WishList mWishList;

    public ReceiptMatchPresenter(AppCompatActivity appcompatactivity, WishList wishlist, UpdateListener updatelistener, String s, String s1, String s2)
    {
        mActivity = appcompatactivity;
        mWishList = wishlist;
        mTcNumber = s;
        mReceiptDate = s1;
        mRid = s2;
        mUpdateListener = updatelistener;
        mAdapter = new MatchedItemsAdapter(appcompatactivity);
    }

    private View createSpacerView()
    {
        View view = new View(mActivity);
        view.setMinimumHeight(mActivity.getResources().getDimensionPixelSize(0x7f0a00bb));
        return view;
    }

    private void wireListeners()
    {
        mMarkPurchasedButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceiptMatchPresenter this$0;

            public void onClick(View view)
            {
                view = mAdapter.getSelectedItems();
                if (view.length > 0)
                {
                    WishListManager.get().markPurchasedItems(mWishList.id, view).addCallback(new CallbackSameThread(mActivity) {

                        final _cls1 this$1;

                        public void onResultSameThread(Request request, Result result)
                        {
                            if (!isPopped())
                            {
                                if (result.successful())
                                {
                                    showDialog(1);
                                } else
                                {
                                    byte byte0;
                                    if (result.hasError() && result.getError().connectionError())
                                    {
                                        byte0 = 1;
                                    } else
                                    {
                                        byte0 = 0;
                                    }
                                    request = _fld0;
                                    if (byte0 != 0)
                                    {
                                        byte0 = 2;
                                    } else
                                    {
                                        byte0 = 3;
                                    }
                                    request.showDialog(byte0);
                                }
                                mMarkPurchasedButton.setText(0x7f09064f);
                                mMarkPurchasedButton.setEnabled(true);
                            }
                            mUpdateListener.afterUpdate(result.successful());
                        }

            
            {
                this$1 = _cls1.this;
                super(context);
            }
                    });
                    mMarkPurchasedButton.setText(0x7f090650);
                    mMarkPurchasedButton.setEnabled(false);
                    mUpdateListener.beforeUpdate();
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listMarkPurchased"));
                }
            }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super();
            }
        });
        mMarkButtonContainer.setTranslationY(mActivity.getResources().getDimensionPixelSize(0x7f0a00bb));
        mAdapter.setSelectionChangedListener(new MatchedItemsAdapter.OnSelectionChangedListener() {

            final ReceiptMatchPresenter this$0;

            public void onSelectionChanged(boolean flag)
            {
                if (flag)
                {
                    mMarkButtonContainer.animate().translationY(0.0F).setDuration(300L).start();
                    return;
                } else
                {
                    mMarkButtonContainer.animate().translationY(mMarkButtonContainer.getHeight()).setDuration(300L).start();
                    return;
                }
            }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super();
            }
        });
        mScanAgainButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceiptMatchPresenter this$0;

            public void onClick(View view)
            {
                mUpdateListener.startReceiptScanner();
                pop();
            }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super();
            }
        });
        mReturnToListButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ReceiptMatchPresenter this$0;

            public void onClick(View view)
            {
                pop();
            }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super();
            }
        });
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f090665);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mMatchItemsRequest != null)
        {
            mMatchItemsRequest.cancel();
            mMatchItemsRequest = null;
        }
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        WishListManager wishlistmanager = WishListManager.get();
        if (!TextUtils.isEmpty(mTcNumber) && !TextUtils.isEmpty(mReceiptDate))
        {
            mMatchItemsRequest = wishlistmanager.matchReceiptItemsByTcNumber(mWishList.id, mReceiptDate, mTcNumber);
        } else
        if (!TextUtils.isEmpty(mRid))
        {
            mMatchItemsRequest = wishlistmanager.matchReceiptItemsByReceiptId(mWishList.id, mRid);
        } else
        {
            mMatchItemsRequest = null;
        }
        if (mMatchItemsRequest != null)
        {
            mMatchItemsRequest.addCallback(new CallbackSameThread(mActivity) {

                final ReceiptMatchPresenter this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    mMatchItemsRequest = null;
                    if (result.successful() && result.hasData())
                    {
                        mLoadingView.setVisibility(8);
                        request = (ReceiptModel)result.getData();
                        if (request.hasMatches())
                        {
                            mResultsContainer.setVisibility(0);
                            mNoMatchesView.setVisibility(8);
                            mAdapter.setItems(request.getMatchedItems());
                            return;
                        } else
                        {
                            mResultsContainer.setVisibility(8);
                            mNoMatchesView.setVisibility(0);
                            return;
                        }
                    } else
                    {
                        showDialog(3);
                        return;
                    }
                }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super(context);
            }
            });
            return;
        } else
        {
            showDialog(3);
            return;
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setPositiveButton(0x7f090292, null);
        i;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 52
    //                   2 73;
           goto _L1 _L2 _L3
_L1:
        builder.setMessage(0x7f090284);
_L5:
        return builder.create();
_L2:
        builder.setMessage(0x7f090672).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ReceiptMatchPresenter this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                pop();
            }

            
            {
                this$0 = ReceiptMatchPresenter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L3:
        builder.setMessage(0x7f090282);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f0401e7);
            mLoadingView = ViewUtil.findViewById(mRootView, 0x7f100640);
            mResultsContainer = ViewUtil.findViewById(mRootView, 0x7f10063d);
            mNoMatchesView = ViewUtil.findViewById(mRootView, 0x7f100637);
            mListView = (ListRecyclerView)ViewUtil.findViewById(mRootView, 0x7f100636);
            mListView.setAdapter(mAdapter);
            mListView.addHeaderView(ViewUtil.inflate(mActivity, 0x7f0401e6));
            mListView.addFooterView(createSpacerView());
            mMarkButtonContainer = ViewUtil.findViewById(mRootView, 0x7f10063e);
            mMarkPurchasedButton = (Button)ViewUtil.findViewById(mRootView, 0x7f10063f);
            mScanAgainButton = ViewUtil.findViewById(mRootView, 0x7f10063b);
            mReturnToListButton = ViewUtil.findViewById(mRootView, 0x7f10063c);
            wireListeners();
        }
    }

    protected void onPageView()
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "review items").putString("section", "lists"));
    }




/*
    static Request access$1002(ReceiptMatchPresenter receiptmatchpresenter, Request request)
    {
        receiptmatchpresenter.mMatchItemsRequest = request;
        return request;
    }

*/













}
