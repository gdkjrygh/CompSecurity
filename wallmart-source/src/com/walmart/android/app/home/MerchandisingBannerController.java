// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import com.walmart.android.ui.PagerDotView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.merchandising.BannerData;
import com.walmartlabs.ui.merchandising.ViewPagerDragger;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingAdapter

public class MerchandisingBannerController
{
    public static interface OnMerchandisingClickedListener
    {

        public abstract void onMerchandisingUriClicked(BannerData bannerdata);
    }


    private static final long BANNER_ANIMATION_DURATION_MS = 250L;
    private static final float DEFAULT_BANNER_ASPECT_RATIO = 2.4375F;
    private static final String TAG = com/walmart/android/app/home/MerchandisingBannerController.getSimpleName();
    private float mBannerAspectRatio;
    private View mContainer;
    private Context mContext;
    private boolean mHidePagerDotView;
    private View mLoadingView;
    private MerchandisingAdapter mMerchandisingAdapter;
    private OnMerchandisingClickedListener mMerchandisingClickListener;
    private PagerDotView mPagerDotView;
    private ViewPager mViewPager;
    private ViewPagerDragger mViewPagerDragger;

    public MerchandisingBannerController(Context context, View view, float f)
    {
        mContext = context;
        mContainer = view;
        mLoadingView = view.findViewById(0x7f1001bb);
        mPagerDotView = (PagerDotView)view.findViewById(0x7f1001b9);
        if (f <= 0.0F)
        {
            f = 2.4375F;
        }
        mBannerAspectRatio = f;
        mViewPager = (ViewPager)mContainer.findViewById(0x7f1000f5);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final MerchandisingBannerController this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f1, int j)
            {
            }

            public void onPageSelected(int i)
            {
                mPagerDotView.setPosition(i);
            }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
        });
        mViewPager.setOnClickListener(new android.view.View.OnClickListener() {

            final MerchandisingBannerController this$0;

            public void onClick(View view1)
            {
                view1 = mMerchandisingAdapter.getBannerData(mViewPager.getCurrentItem());
                if (mMerchandisingClickListener != null)
                {
                    mMerchandisingClickListener.onMerchandisingUriClicked(view1);
                }
            }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
        });
        setBannerLayoutParams(false);
    }

    private int getMaximumBannerWidth()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mContainer.getLayoutParams();
        View view = (View)mContainer.getParent();
        return ViewUtil.getScreenWidth(mContext) - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin - view.getPaddingLeft() - view.getPaddingRight();
    }

    private void setBannerLayoutParams(boolean flag)
    {
        setBannerWidthParam(mContainer.getLayoutParams().width, flag);
    }

    private void wireAdapterListeners()
    {
        mMerchandisingAdapter.setBannersReadyListener(new MerchandisingAdapter.BannersReadyListener() {

            final MerchandisingBannerController this$0;

            public void onBannersReady()
            {
                mLoadingView.setVisibility(8);
                int i = mMerchandisingAdapter.getCount();
                mPagerDotView.setNbrOfPages(i);
                if (i > 1 && !mHidePagerDotView)
                {
                    mPagerDotView.setVisibility(0);
                    mPagerDotView.setPosition(mViewPager.getCurrentItem());
                    return;
                } else
                {
                    mPagerDotView.setVisibility(8);
                    return;
                }
            }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
        });
        mMerchandisingAdapter.setOnItemsChangedListener(new MerchandisingAdapter.OnItemsChangedListener() {

            final MerchandisingBannerController this$0;

            public void onItemsChanged()
            {
                mPagerDotView.setNbrOfPages(mMerchandisingAdapter.getCount());
                if (mMerchandisingAdapter.getCount() > 1 && !mHidePagerDotView)
                {
                    mPagerDotView.setVisibility(0);
                    mPagerDotView.setPosition(mViewPager.getCurrentItem());
                    return;
                } else
                {
                    mPagerDotView.setVisibility(8);
                    return;
                }
            }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
        });
    }

    public void cleanUp()
    {
        pauseAutoPaging();
        if (mViewPager != null)
        {
            mViewPager.setAdapter(null);
        }
        if (mMerchandisingAdapter != null)
        {
            mMerchandisingAdapter.cleanUp();
        }
    }

    public void init(MerchandisingAdapter merchandisingadapter, boolean flag)
    {
label0:
        {
            if (mViewPager != null)
            {
                if (merchandisingadapter == null)
                {
                    break label0;
                }
                mMerchandisingAdapter = merchandisingadapter;
                wireAdapterListeners();
                if (mViewPagerDragger != null)
                {
                    mViewPagerDragger.pause();
                    mViewPagerDragger = null;
                    mViewPager.setOnTouchListener(null);
                }
                if (flag)
                {
                    mViewPagerDragger = new ViewPagerDragger(mViewPager);
                    mViewPagerDragger.runDelayed();
                    mViewPager.setOnTouchListener(new android.view.View.OnTouchListener() {

                        final MerchandisingBannerController this$0;

                        public boolean onTouch(View view, MotionEvent motionevent)
                        {
                            if (mViewPagerDragger != null)
                            {
                                mViewPagerDragger.resetTimer();
                            }
                            return false;
                        }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
                    });
                }
                mViewPager.setAdapter(mMerchandisingAdapter);
                mContainer.setVisibility(0);
            }
            return;
        }
        mContainer.setVisibility(8);
    }

    public void pauseAutoPaging()
    {
        if (mViewPagerDragger != null)
        {
            mViewPagerDragger.pause();
        }
    }

    public void resetAutoPagingTimer()
    {
        if (mViewPagerDragger != null)
        {
            mViewPagerDragger.resetTimer();
        }
    }

    public void setAspectRatio(float f, boolean flag)
    {
        mBannerAspectRatio = f;
        setBannerLayoutParams(flag);
    }

    public void setBannerWidthParam(int i, boolean flag)
    {
        Object obj = mContainer.getLayoutParams();
        int j;
        if (i <= 0)
        {
            i = getMaximumBannerWidth();
        }
        j = (int)((float)i / mBannerAspectRatio);
        if (flag)
        {
            obj = ValueAnimator.ofInt(new int[] {
                ((android.view.ViewGroup.LayoutParams) (obj)).height, j
            });
            ((ValueAnimator) (obj)).setDuration(250L);
            ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final MerchandisingBannerController this$0;

                public void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    mContainer.getLayoutParams().height = ((Integer)valueanimator.getAnimatedValue()).intValue();
                    mContainer.requestLayout();
                }

            
            {
                this$0 = MerchandisingBannerController.this;
                super();
            }
            });
            ((ValueAnimator) (obj)).start();
            return;
        } else
        {
            obj.width = i;
            obj.height = j;
            mContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    public void setMerchandisingClickListener(OnMerchandisingClickedListener onmerchandisingclickedlistener)
    {
        mMerchandisingClickListener = onmerchandisingclickedlistener;
    }

    public void setOffScreenPageLimit(int i)
    {
        mViewPager.setOffscreenPageLimit(i);
    }

    public void setPagerDotViewHidden(boolean flag)
    {
        mHidePagerDotView = flag;
        if (flag)
        {
            mPagerDotView.setVisibility(8);
        } else
        if (mMerchandisingAdapter != null && mMerchandisingAdapter.getCount() > 0)
        {
            mPagerDotView.setVisibility(0);
            return;
        }
    }









}
