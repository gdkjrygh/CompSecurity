// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.app.bridge.DrawerUpdateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapFullScreenController, SourceDataMapper, MappedSections, MappedData

public class InStoreMapFullScreenPresenter extends Presenter
    implements InStoreMapFullScreenController.MarkerCallbacks
{
    public static interface ActionCallbacks
    {

        public abstract void onItemSelected(int i);
    }

    public static interface SourceDataAdapter
        extends SourceDataMapper.Listener
    {

        public abstract MappedData getData(int i);

        public abstract int getDataPosition(MappedData mappeddata);

        public abstract String getImageUrl(int i);
    }


    private static final String TAG = com/walmart/android/app/shop/map/InStoreMapFullScreenPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private View mItemContainer;
    private ImageView mItemImage;
    private View mNext;
    private final PagerAdapter mPagerAdapter;
    private View mPagerContainer;
    private View mPagerControl;
    private ViewPager mPagerView;
    private int mPendingPageviewEvents;
    private TextView mPositionTextView;
    private View mPrev;
    private View mRootView;
    private final SourceDataMapper mSourceDataMapper;
    private final InStoreMapFullScreenController mStoreMapController;

    public InStoreMapFullScreenPresenter(Context context, String s, SourceDataMapper sourcedatamapper, PagerAdapter pageradapter, ActionCallbacks actioncallbacks)
    {
        mContext = context;
        mStoreMapController = new InStoreMapFullScreenController(context, sourcedatamapper, this);
        mPagerAdapter = pageradapter;
        mSourceDataMapper = sourcedatamapper;
        mSourceDataMapper.addListener((SourceDataMapper.Listener)mPagerAdapter);
        mActionCallbacks = actioncallbacks;
        setTitleText(s);
    }

    private void selectItem(int i)
    {
        mStoreMapController.moveTo(((SourceDataAdapter)mPagerAdapter).getData(i));
        updatePositionText();
    }

    private void sendPendingPageViewEvents()
    {
        if (mStoreMapController.getSourceDataMapper().hasAllData() && mStoreMapController.isMapLoaded() && mPendingPageviewEvents > 0)
        {
            for (int i = 0; i < mPendingPageviewEvents; i++)
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "store map").putString("section", "store search").putString("storeId", "Dashboard").putString("numberOfItemsMapped", String.valueOf(mStoreMapController.getSourceDataMapper().getMappedSections().getDataCount())).putString("numberOfAislesMapped", String.valueOf(mStoreMapController.getSourceDataMapper().getMappedSections().getAisleCount()));
                MessageBus.getBus().post(builder);
            }

            mPendingPageviewEvents = 0;
        }
    }

    private void showPager(boolean flag)
    {
        if (flag)
        {
            mPagerContainer.setVisibility(0);
            mItemImage.setVisibility(8);
            return;
        } else
        {
            mPagerContainer.setVisibility(8);
            mItemImage.setVisibility(0);
            return;
        }
    }

    private void updatePositionText()
    {
        if (mPagerView.getAdapter().getCount() <= 1)
        {
            mPagerControl.setVisibility(8);
        } else
        {
            mPagerControl.setVisibility(0);
        }
        if (mPagerView.getAdapter().getCount() <= 0)
        {
            mItemContainer.setVisibility(8);
        } else
        {
            mItemContainer.setVisibility(0);
        }
        mPositionTextView.setText(mContext.getString(0x7f09015d, new Object[] {
            Integer.valueOf(mPagerView.getCurrentItem() + 1), Integer.valueOf(mPagerView.getAdapter().getCount())
        }));
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mStoreMapController.stop();
        Picasso.with(mContext).cancelTag(TAG);
        mSourceDataMapper.removeListener((SourceDataMapper.Listener)mPagerAdapter);
        mStoreMapController.destroy();
    }

    public void onAislesLoaded()
    {
        sendPendingPageViewEvents();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mStoreMapController.start();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mStoreMapController.start();
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(final ViewGroup tapGestureDetector)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mContext, 0x7f04006d, tapGestureDetector, false);
            tapGestureDetector = (ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100183);
            mStoreMapController.setContainerView(tapGestureDetector);
            mItemContainer = ViewUtil.findViewById(mRootView, 0x7f100185);
            mItemContainer.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                final InStoreMapFullScreenPresenter this$0;

                public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                        int k1, int l1)
                {
                    mStoreMapController.setVisibleRect(new Rect(0, 0, mRootView.getWidth(), j));
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super();
            }
            });
            mItemContainer.setOnTouchListener(new android.view.View.OnTouchListener() {

                final InStoreMapFullScreenPresenter this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return true;
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super();
            }
            });
            mItemImage = (ImageView)ViewUtil.findViewById(mRootView, 0x7f10018c);
            mItemImage.setOnClickListener(new OnSingleClickListener(this) {

                final InStoreMapFullScreenPresenter this$0;

                public void onSingleClick(View view)
                {
                    showPager(true);
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super(presenter);
            }
            });
            mPagerContainer = ViewUtil.findViewById(mRootView, 0x7f100186);
            mPagerView = (ViewPager)ViewUtil.findViewById(mRootView, 0x7f100187);
            mPagerView.setAdapter(mPagerAdapter);
            mPagerControl = ViewUtil.findViewById(mRootView, 0x7f100188);
            mPrev = ViewUtil.findViewById(mRootView, 0x7f100189);
            mNext = ViewUtil.findViewById(mRootView, 0x7f10018b);
            mPrev.setEnabled(false);
            mNext.setEnabled(false);
            mPositionTextView = (TextView)ViewUtil.findViewById(mRootView, 0x7f10018a);
            mPrev.setOnClickListener(new OnSingleClickListener(this) {

                final InStoreMapFullScreenPresenter this$0;

                public void onSingleClick(View view)
                {
                    view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mapInteraction")).putString("action", "paginate previous");
                    MessageBus.getBus().post(view);
                    mPagerView.setCurrentItem(((mPagerView.getCurrentItem() - 1) + mPagerView.getAdapter().getCount()) % mPagerView.getAdapter().getCount(), false);
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super(presenter);
            }
            });
            mNext.setOnClickListener(new OnSingleClickListener(this) {

                final InStoreMapFullScreenPresenter this$0;

                public void onSingleClick(View view)
                {
                    view = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mapInteraction")).putString("action", "paginate next");
                    MessageBus.getBus().post(view);
                    mPagerView.setCurrentItem((mPagerView.getCurrentItem() + 1) % mPagerView.getAdapter().getCount(), false);
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super(presenter);
            }
            });
            mPagerView.addOnPageChangeListener(new android.support.v4.view.ViewPager.SimpleOnPageChangeListener() {

                final InStoreMapFullScreenPresenter this$0;

                public void onPageSelected(int i)
                {
                    selectItem(i);
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super();
            }
            });
            tapGestureDetector = new GestureDetectorCompat(mContext, new android.view.GestureDetector.SimpleOnGestureListener() {

                final InStoreMapFullScreenPresenter this$0;

                public boolean onSingleTapConfirmed(MotionEvent motionevent)
                {
                    motionevent = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mapInteraction")).putString("action", "reopen card");
                    MessageBus.getBus().post(motionevent);
                    pop();
                    if (mActionCallbacks != null)
                    {
                        motionevent = ((SourceDataAdapter)mPagerAdapter).getData(mPagerView.getCurrentItem());
                        if (motionevent != null)
                        {
                            mActionCallbacks.onItemSelected(motionevent.getSourcePosition());
                        }
                    }
                    return false;
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super();
            }
            });
            mPagerView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final InStoreMapFullScreenPresenter this$0;
                final GestureDetectorCompat val$tapGestureDetector;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    tapGestureDetector.onTouchEvent(motionevent);
                    return false;
                }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                tapGestureDetector = gesturedetectorcompat;
                super();
            }
            });
            updatePositionText();
        }
    }

    public void onMapFail()
    {
        if (isTop())
        {
            (new com.walmart.android.ui.CustomAlertDialog.Builder(mContext)).setMessage(0x7f0905a4).setPositiveButton(0x7f090292, null).show();
            pop();
        }
    }

    public void onMapLoaded()
    {
        MappedData mappeddata = mStoreMapController.currentPosition();
        int i = ((SourceDataAdapter)mPagerAdapter).getDataPosition(mappeddata);
        mPrev.setEnabled(true);
        mNext.setEnabled(true);
        if (i < 0)
        {
            i = 0;
        }
        selectItem(i);
    }

    public void onMapTap()
    {
        String s = ((SourceDataAdapter)mPagerAdapter).getImageUrl(mPagerView.getCurrentItem());
        Picasso.with(mContext).load(s).error(0x7f02021b).tag(TAG).into(mItemImage);
        showPager(false);
    }

    public void onMarkerTap(List list)
    {
        showPager(true);
        ArrayList arraylist = new ArrayList(list.size());
        MappedData mappeddata;
        for (list = list.iterator(); list.hasNext(); arraylist.add(Integer.valueOf(((SourceDataAdapter)mPagerAdapter).getDataPosition(mappeddata))))
        {
            mappeddata = (MappedData)list.next();
        }

        int i = arraylist.indexOf(Integer.valueOf(mPagerView.getCurrentItem()));
        if (i >= 0)
        {
            int j = arraylist.size();
            mPagerView.setCurrentItem(((Integer)arraylist.get((i + 1) % j)).intValue(), false);
            return;
        } else
        {
            mPagerView.setCurrentItem(((Integer)arraylist.get(0)).intValue(), false);
            return;
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mStoreMapController.stop();
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            pop();
            return true;
        } else
        {
            return super.onOptionsMenuItemSelected(menuitem, activity);
        }
    }

    protected void onPageView()
    {
        mPendingPageviewEvents = mPendingPageviewEvents + 1;
        sendPendingPageViewEvents();
        mHandler.post(new Runnable() {

            final InStoreMapFullScreenPresenter this$0;

            public void run()
            {
                MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
            }

            
            {
                this$0 = InStoreMapFullScreenPresenter.this;
                super();
            }
        });
    }

    public void onPauseAsTop()
    {
        super.onPauseAsTop();
        mStoreMapController.stop();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mStoreMapController.start();
    }

    public void onStoreDataSourceChanged()
    {
        sendPendingPageViewEvents();
    }









}
