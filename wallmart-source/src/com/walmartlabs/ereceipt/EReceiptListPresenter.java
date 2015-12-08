// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.analytics.AnalyticsPageView;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.WalletRegisteredEvent;
import com.walmartlabs.ui.UndoView;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListAdapter, EReceiptScanner, EReceiptDetailPresenter, EReceiptItemPresenterFactory, 
//            EReceiptsUpdatedEvent, EReceiptsCountEvent

public class EReceiptListPresenter extends Presenter
{

    private static final int DIALOG_CONFIRM_DELETE = 0;
    private static final int SCAN_BUTTON_DISABLED = 2;
    private static final int SCAN_BUTTON_OFF_SCREEN = 1;
    private static final int SCAN_BUTTON_ON_SCREEN = 0;
    private static final String TAG = com/walmartlabs/ereceipt/EReceiptListPresenter.getSimpleName();
    private final Activity mActivity;
    private int mAnimationState;
    private EReceipt mDeletedReceipt;
    private int mDialogConfig;
    private ViewGroup mEReceiptsListView;
    private final ImageDownloader mImageDownloader;
    private float mInitialY;
    private EReceiptItemPresenterFactory mItemPresenterFactory;
    private final EReceiptListAdapter mListAdapter;
    private ListView mListView;
    private View mLoadingView;
    private float mPreviousDiff;
    private EReceipt mReceiptMarkedForDelete;
    private boolean mRegistered;
    private EReceiptScanner mScanner;
    private boolean mScanningAvailable;
    private boolean mSignedIn;
    private boolean mSyncing;
    private boolean mTrackPending;
    private UndoView mUndoView;

    public EReceiptListPresenter(Activity activity, ImageDownloader imagedownloader, EReceiptScanner ereceiptscanner)
    {
        mAnimationState = 0;
        mDialogConfig = 0;
        mRegistered = true;
        mActivity = activity;
        mScanner = ereceiptscanner;
        mImageDownloader = imagedownloader;
        setTitleText(mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_title));
        mListAdapter = new EReceiptListAdapter(mActivity);
    }

    private void hideList()
    {
        mListView.setVisibility(8);
        mLoadingView.setVisibility(0);
    }

    private void hideUndo()
    {
        if (mUndoView != null && mUndoView.getVisibility() == 0)
        {
            mUndoView.clearAnimation();
            mUndoView.setVisibility(8);
        }
        if (mListAdapter.isEmpty())
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.empty_view).setVisibility(0);
        }
    }

    private void initScanButtonAnimation()
    {
        final float threshold = ViewUtil.dpToPixels(25, mActivity);
        final ViewGroup scanContainer = (ViewGroup)ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.scan_container);
        final Animation slideOutAnimation = AnimationUtils.loadAnimation(mActivity, com.walmartlabs.android.ereceipt.R.anim.ereceipt_scan_button_out);
        if (slideOutAnimation != null)
        {
            slideOutAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final EReceiptListPresenter this$0;
                final ViewGroup val$scanContainer;

                public void onAnimationEnd(Animation animation)
                {
                    scanContainer.setVisibility(8);
                    mAnimationState = 1;
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                scanContainer = viewgroup;
                super();
            }
            });
        }
        final Animation slideInAnimation = AnimationUtils.loadAnimation(mActivity, com.walmartlabs.android.ereceipt.R.anim.ereceipt_scan_button_in);
        if (slideInAnimation != null)
        {
            slideInAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final EReceiptListPresenter this$0;
                final ViewGroup val$scanContainer;

                public void onAnimationEnd(Animation animation)
                {
                    mAnimationState = 0;
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    scanContainer.setVisibility(0);
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                scanContainer = viewgroup;
                super();
            }
            });
        }
        if (slideInAnimation != null && slideOutAnimation != null)
        {
            mListView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final EReceiptListPresenter this$0;
                final ViewGroup val$scanContainer;
                final Animation val$slideInAnimation;
                final Animation val$slideOutAnimation;
                final float val$threshold;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 2: default 32
                //                               0 34
                //                               1 252
                //                               2 49;
                       goto _L1 _L2 _L3 _L4
_L1:
                    return false;
_L2:
                    mInitialY = motionevent.getY();
                    continue; /* Loop/switch isn't completed */
_L4:
                    float f = motionevent.getY();
                    float f1 = f - mInitialY;
                    if (f1 < 0.0F)
                    {
                        if (f1 < mPreviousDiff)
                        {
                            if (f1 < -threshold && mAnimationState == 0)
                            {
                                mAnimationState = 2;
                                scanContainer.startAnimation(slideOutAnimation);
                            }
                            mPreviousDiff = f1;
                        } else
                        {
                            mInitialY = f;
                            mPreviousDiff = 0.0F;
                        }
                    }
                    if (f1 > 0.0F)
                    {
                        if (f1 > mPreviousDiff)
                        {
                            if (f1 > threshold && mAnimationState == 1)
                            {
                                mAnimationState = 2;
                                scanContainer.startAnimation(slideInAnimation);
                            }
                            mPreviousDiff = f1;
                        } else
                        {
                            mInitialY = f;
                            mPreviousDiff = 0.0F;
                        }
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    mPreviousDiff = 0.0F;
                    if (true) goto _L1; else goto _L5
_L5:
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                threshold = f;
                scanContainer = viewgroup;
                slideOutAnimation = animation;
                slideInAnimation = animation1;
                super();
            }
            });
        }
    }

    private void initView(ViewGroup viewgroup)
    {
        mEReceiptsListView = (ViewGroup)mActivity.getLayoutInflater().inflate(com.walmartlabs.android.ereceipt.R.layout.ereceipt_list_layout, viewgroup, false);
        mUndoView = (UndoView)ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.undo_toast);
        viewgroup = (ViewGroup)ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.scan_container);
        mScanningAvailable = mScanner.scannerAvailable();
        if (mScanningAvailable)
        {
            ((Button)ViewUtil.findViewById(viewgroup, com.walmartlabs.android.ereceipt.R.id.scan_button)).setOnClickListener(new android.view.View.OnClickListener() {

                final EReceiptListPresenter this$0;

                public void onClick(View view)
                {
                    purgeDeletedReceipt();
                    mScanner.onScan();
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            });
        } else
        {
            viewgroup.setVisibility(8);
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.info_text, mEReceiptsListView, com.walmartlabs.android.ereceipt.R.string.ereceipts_register_text);
            updateSignInButton();
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text_register_button).setOnClickListener(new OnSingleClickListener(this) {

                final EReceiptListPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (!mSignedIn)
                    {
                        mItemPresenterFactory.launchSignIn();
                        return;
                    } else
                    {
                        mItemPresenterFactory.launchRegistration();
                        return;
                    }
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super(presenter);
            }
            });
        }
        viewgroup = mEReceiptsListView.findViewById(com.walmartlabs.android.ereceipt.R.id.empty_view);
        setupInfoView(viewgroup);
        mListView = (ListView)mEReceiptsListView.findViewById(com.walmartlabs.android.ereceipt.R.id.ereceipt_list);
        mListView.setAdapter(mListAdapter);
        mListView.setEmptyView(viewgroup);
        mListView.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            final EReceiptListPresenter this$0;

            public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
            {
                boolean flag = false;
                adapterview = (EReceipt)mListAdapter.getItem(i);
                if (adapterview != null)
                {
                    mReceiptMarkedForDelete = adapterview;
                    showDialog(0);
                    flag = true;
                }
                return flag;
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
        });
        mListView.setOnItemClickListener(new OnItemSingleClickListener(this) {

            final EReceiptListPresenter this$0;

            public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (EReceipt)mListAdapter.getItem(i);
                if (adapterview != null)
                {
                    view = new EReceiptDetailPresenter(mActivity, adapterview, mImageDownloader);
                    view.setDialogConfiguration(mDialogConfig);
                    if (mItemPresenterFactory != null)
                    {
                        view.setItemPresenterFactory(mItemPresenterFactory);
                    }
                    view.setDeleteHandler(adapterview. new EReceiptDetailPresenter.DeleteHandler() {

                        final _cls4 this$1;
                        final EReceipt val$receipt;

                        public void deleteReceipt(String s, boolean flag)
                        {
                            mReceiptMarkedForDelete = receipt;
                            showUndo();
                        }

            
            {
                this$1 = final__pcls4;
                receipt = EReceipt.this;
                super();
            }
                    });
                    pushPresenter(view);
                    return;
                } else
                {
                    Log.e(EReceiptListPresenter.TAG, (new StringBuilder()).append("Invalid eReceipt at position ").append(i).toString());
                    return;
                }
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                super(presenter);
            }
        });
        ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.sign_in_button).setOnClickListener(new OnSingleClickListener(this) {

            final EReceiptListPresenter this$0;

            public void onSingleClick(View view)
            {
                if (!mSignedIn)
                {
                    mItemPresenterFactory.launchSignIn();
                    return;
                } else
                {
                    mItemPresenterFactory.launchRegistration();
                    return;
                }
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                super(presenter);
            }
        });
        if (mScanningAvailable)
        {
            initScanButtonAnimation();
        }
        mLoadingView = mEReceiptsListView.findViewById(com.walmartlabs.android.ereceipt.R.id.ereceipt_loading_view);
        syncReceipts();
    }

    private void purgeDeletedReceipt()
    {
        if (mDeletedReceipt != null)
        {
            EReceiptManager.get().deleteReceipt(mDeletedReceipt);
            MessageBus.getBus().post(new AnalyticsEvent("Ereceipt", "Delete receipt", "list view"));
            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("ereceiptDeleted"));
        }
        mDeletedReceipt = null;
    }

    private void resetScanContainer()
    {
label0:
        {
            if (mScanningAvailable)
            {
                ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.scan_container).setVisibility(0);
                if (!mListAdapter.isEmpty())
                {
                    break label0;
                }
                mAnimationState = 2;
            }
            return;
        }
        mAnimationState = 0;
    }

    private void setupInfoView(View view)
    {
        final ViewPager pager = (ViewPager)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.view_pager);
        final PagerAdapter adapter = new PagerAdapter() {

            final EReceiptListPresenter this$0;

            public void destroyItem(ViewGroup viewgroup, int i, Object obj)
            {
                viewgroup.removeView((View)obj);
            }

            public int getCount()
            {
                return 6;
            }

            public Object instantiateItem(ViewGroup viewgroup, int i)
            {
                boolean flag = false;
                i;
                JVM INSTR tableswitch 0 5: default 44
            //                           0 104
            //                           1 83
            //                           2 90
            //                           3 97
            //                           4 104
            //                           5 83;
                   goto _L1 _L2 _L3 _L4 _L5 _L2 _L3
_L1:
                i = ((flag) ? 1 : 0);
_L7:
                View view1 = ViewUtil.inflate(mActivity, com.walmartlabs.android.ereceipt.R.layout.ereceipt_info, viewgroup);
                ((ImageView)ViewUtil.findViewById(view1, com.walmartlabs.android.ereceipt.R.id.image)).setImageResource(i);
                viewgroup.addView(view1);
                return view1;
_L3:
                i = com.walmartlabs.android.ereceipt.R.drawable.ereceipt_info_one;
                continue; /* Loop/switch isn't completed */
_L4:
                i = com.walmartlabs.android.ereceipt.R.drawable.ereceipt_info_two;
                continue; /* Loop/switch isn't completed */
_L5:
                i = com.walmartlabs.android.ereceipt.R.drawable.ereceipt_info_three;
                continue; /* Loop/switch isn't completed */
_L2:
                i = com.walmartlabs.android.ereceipt.R.drawable.ereceipt_info_four;
                if (true) goto _L7; else goto _L6
_L6:
            }

            public boolean isViewFromObject(View view1, Object obj)
            {
                return view1 == obj;
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
        };
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final EReceiptListPresenter this$0;
            final PagerAdapter val$adapter;
            final ViewPager val$pager;

            public void onPageScrollStateChanged(int i)
            {
                if (i == 0)
                {
                    i = adapter.getCount();
                    int j = pager.getCurrentItem();
                    if (j == 0)
                    {
                        pager.setCurrentItem(i - 2, false);
                    } else
                    if (j == i - 1)
                    {
                        pager.setCurrentItem(1, false);
                        return;
                    }
                }
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                adapter = pageradapter;
                pager = viewpager;
                super();
            }
        });
        ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.left_arrow).setOnClickListener(new android.view.View.OnClickListener() {

            final EReceiptListPresenter this$0;
            final PagerAdapter val$adapter;
            final ViewPager val$pager;

            public void onClick(View view1)
            {
                int i = adapter.getCount();
                int j = pager.getCurrentItem();
                if (j == 0)
                {
                    i -= 2;
                } else
                {
                    i = j - 1;
                }
                pager.setCurrentItem(i, true);
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                adapter = pageradapter;
                pager = viewpager;
                super();
            }
        });
        ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.right_arrow).setOnClickListener(new android.view.View.OnClickListener() {

            final EReceiptListPresenter this$0;
            final PagerAdapter val$adapter;
            final ViewPager val$pager;

            public void onClick(View view1)
            {
                int i = adapter.getCount();
                int j = pager.getCurrentItem();
                if (j == i - 1)
                {
                    i = 1;
                } else
                {
                    i = j + 1;
                }
                pager.setCurrentItem(i, true);
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                adapter = pageradapter;
                pager = viewpager;
                super();
            }
        });
    }

    private void showList()
    {
        mListView.setVisibility(0);
        mLoadingView.setVisibility(8);
        resetScanContainer();
        updateListHeader();
        if (mTrackPending)
        {
            trackPageView();
        }
    }

    private void showUndo()
    {
        purgeDeletedReceipt();
        mListAdapter.removeItem(mReceiptMarkedForDelete);
        mDeletedReceipt = mReceiptMarkedForDelete;
        mReceiptMarkedForDelete = null;
        if (mListAdapter.isEmpty())
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.empty_view).setVisibility(8);
        }
        if (mUndoView != null)
        {
            ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.undo_items_removed_text, mUndoView, mActivity.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_deleted));
            Object obj = (TextView)ViewUtil.findViewById(mUndoView, com.walmartlabs.android.ereceipt.R.id.undo_items_removed_subtext);
            ((TextView) (obj)).setText(mActivity.getResources().getQuantityString(com.walmartlabs.android.ereceipt.R.plurals.ereceipt_deleted_summary, mDeletedReceipt.itemsSold, new Object[] {
                Integer.valueOf(mDeletedReceipt.itemsSold), Float.valueOf(mDeletedReceipt.getPriceInDollar())
            }));
            ((TextView) (obj)).setVisibility(0);
            ((Button)mUndoView.findViewById(com.walmartlabs.android.ereceipt.R.id.undo_button)).setOnClickListener(new android.view.View.OnClickListener() {

                final EReceiptListPresenter this$0;

                public void onClick(View view)
                {
                    if (mDeletedReceipt != null)
                    {
                        mListAdapter.addItem(mDeletedReceipt);
                    }
                    mDeletedReceipt = null;
                    hideUndo();
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            });
            mUndoView.setVisibility(0);
            obj = new AlphaAnimation(1.0F, 0.0F);
            ((Animation) (obj)).setDuration(300L);
            ((Animation) (obj)).setStartOffset(5000L);
            ((Animation) (obj)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final EReceiptListPresenter this$0;

                public void onAnimationEnd(Animation animation)
                {
                    purgeDeletedReceipt();
                    if (!isPopped())
                    {
                        mUndoView.setVisibility(8);
                        if (mListAdapter.isEmpty())
                        {
                            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.empty_view).setVisibility(0);
                            return;
                        }
                    }
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            });
            mUndoView.startAnimation(((Animation) (obj)));
        }
    }

    private void syncReceipts()
    {
        if (mSyncing)
        {
            return;
        } else
        {
            mSyncing = true;
            hideList();
            mListAdapter.clear();
            com.walmartlabs.ereceipt.service.EReceiptManager.SyncListener synclistener = new com.walmartlabs.ereceipt.service.EReceiptManager.SyncListener() {

                final EReceiptListPresenter this$0;

                public void onDeletedReceipts(int ai[])
                {
                    int j = ai.length;
                    for (int i = 0; i < j; i++)
                    {
                        int k = ai[i];
                        mListAdapter.removeItem(k);
                    }

                }

                public void onNewReceipts(EReceipt aereceipt[])
                {
                    if (mDeletedReceipt != null)
                    {
                        int j = aereceipt.length;
                        for (int i = 0; i < j; i++)
                        {
                            EReceipt ereceipt = aereceipt[i];
                            if (!mDeletedReceipt.uuid.equals(ereceipt.uuid))
                            {
                                mListAdapter.addItem(ereceipt);
                            }
                        }

                    } else
                    {
                        mListAdapter.addItems(aereceipt);
                    }
                }

                public void onSyncFinished(Integer integer)
                {
                    showList();
                    mSyncing = false;
                    MessageBus.getBus().post(new EReceiptsCountEvent(String.valueOf(mListAdapter.getCount()), mSignedIn));
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            };
            EReceiptManager.get().syncReceipts(synclistener);
            return;
        }
    }

    private void trackPageView()
    {
        mTrackPending = false;
        Object obj;
        if (mSignedIn)
        {
            obj = new StringBuilder("SignedIn");
        } else
        {
            obj = new StringBuilder("Not SignedIn");
        }
        if (mListAdapter.isEmpty())
        {
            ((StringBuilder) (obj)).append(" No Receipts");
        } else
        {
            ((StringBuilder) (obj)).append(" Receipts");
        }
        obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "eReceipts List View").putString("section", "eReceipts").putString("erecListViewStatus", ((StringBuilder) (obj)).toString());
        MessageBus.getBus().post(obj);
        MessageBus.getBus().post(new AnalyticsPageView("/ereceipt/list"));
    }

    private void updateListHeader()
    {
        if (mListAdapter.isEmpty() || mSignedIn && mRegistered)
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.header_view).setVisibility(8);
            return;
        } else
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.header_view).setVisibility(0);
            return;
        }
    }

    private void updateSignInButton()
    {
        if (mSignedIn && mRegistered)
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text_register_button).setVisibility(8);
            if (mScanningAvailable)
            {
                ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text).setVisibility(0);
                return;
            } else
            {
                ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text).setVisibility(8);
                return;
            }
        }
        ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text).setVisibility(0);
        if (mScanningAvailable)
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text_register_button).setVisibility(8);
            return;
        } else
        {
            ViewUtil.findViewById(mEReceiptsListView, com.walmartlabs.android.ereceipt.R.id.info_text_register_button).setVisibility(0);
            return;
        }
    }

    public View getView()
    {
        return mEReceiptsListView;
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        String s = mScanner.getUuidFromScan(i, j, intent);
        if (s != null)
        {
            intent = new EReceiptDetailPresenter(mActivity, s, mImageDownloader, true);
            intent.setDialogConfiguration(mDialogConfig);
            intent.setItemPresenterFactory(mItemPresenterFactory);
            intent.setDeleteHandler(new EReceiptDetailPresenter.DeleteHandler() {

                final EReceiptListPresenter this$0;

                public void deleteReceipt(String s1, boolean flag)
                {
                    mReceiptMarkedForDelete = mListAdapter.getItem(s1);
                    showUndo();
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            });
            pushPresenter(intent, false);
            return;
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
        mEReceiptsListView.removeAllViews();
        mEReceiptsListView = null;
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        mSignedIn = false;
        if (authenticationstatusevent.loggedIn || authenticationstatusevent.hasCredentials)
        {
            mSignedIn = true;
        }
        updateSignInButton();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        mTrackPending = true;
    }

    protected Dialog onCreateDialog(int i)
    {
        com.walmart.android.ui.dialog.AlertDialog alertdialog;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            alertdialog = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity, mDialogConfig)).setTitle(com.walmartlabs.android.ereceipt.R.string.ereceipts_confirm_delete_dialog).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final EReceiptListPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    showUndo();
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            }).setNegativeButton(com.walmartlabs.android.ereceipt.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

                final EReceiptListPresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.cancel();
                }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
            }).setIcon(null).create();
            break;
        }
        alertdialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final EReceiptListPresenter this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                mReceiptMarkedForDelete = null;
            }

            
            {
                this$0 = EReceiptListPresenter.this;
                super();
            }
        });
        return alertdialog;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mEReceiptsListView == null)
        {
            initView(viewgroup);
        }
    }

    public void onPop()
    {
        super.onPop();
        if (mSyncing)
        {
            EReceiptManager.get().cancelSyncReceipts();
        }
        purgeDeletedReceipt();
    }

    public void onReceiptsUpdatedEvent(EReceiptsUpdatedEvent ereceiptsupdatedevent)
    {
        syncReceipts();
        mTrackPending = true;
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        purgeDeletedReceipt();
        hideUndo();
        if (mListView != null)
        {
            BaseAdapter baseadapter = (BaseAdapter)mListView.getAdapter();
            if (baseadapter != null)
            {
                baseadapter.notifyDataSetChanged();
            }
        }
        resetScanContainer();
    }

    public void onWalletRegisteredEvent(WalletRegisteredEvent walletregisteredevent)
    {
        if (walletregisteredevent.isRegistered != com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberResult.UNKNOWN)
        {
            boolean flag;
            if (walletregisteredevent.isRegistered != com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberResult.NO)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mRegistered = flag;
            updateSignInButton();
            updateListHeader();
        }
    }

    public void setDialogConfiguration(int i)
    {
        mDialogConfig = i;
    }

    public void setItemPresenterFactory(EReceiptItemPresenterFactory ereceiptitempresenterfactory)
    {
        mItemPresenterFactory = ereceiptitempresenterfactory;
    }









/*
    static EReceipt access$1302(EReceiptListPresenter ereceiptlistpresenter, EReceipt ereceipt)
    {
        ereceiptlistpresenter.mDeletedReceipt = ereceipt;
        return ereceipt;
    }

*/



/*
    static boolean access$1502(EReceiptListPresenter ereceiptlistpresenter, boolean flag)
    {
        ereceiptlistpresenter.mSyncing = flag;
        return flag;
    }

*/






/*
    static int access$1902(EReceiptListPresenter ereceiptlistpresenter, int i)
    {
        ereceiptlistpresenter.mAnimationState = i;
        return i;
    }

*/




/*
    static float access$2002(EReceiptListPresenter ereceiptlistpresenter, float f)
    {
        ereceiptlistpresenter.mInitialY = f;
        return f;
    }

*/



/*
    static float access$2102(EReceiptListPresenter ereceiptlistpresenter, float f)
    {
        ereceiptlistpresenter.mPreviousDiff = f;
        return f;
    }

*/




/*
    static EReceipt access$502(EReceiptListPresenter ereceiptlistpresenter, EReceipt ereceipt)
    {
        ereceiptlistpresenter.mReceiptMarkedForDelete = ereceipt;
        return ereceipt;
    }

*/




}
