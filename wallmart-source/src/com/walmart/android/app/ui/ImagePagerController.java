// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.walmart.android.ui.PagerDotView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.ui:
//            ImagePagerAdapter

public class ImagePagerController
{
    public static interface OnImageClickedListener
    {

        public abstract void OnImageClickListener(String s);
    }


    private static final String TAG = com/walmart/android/app/ui/ImagePagerController.getSimpleName();
    private final float mAspectRatio;
    private final View mContainer;
    private final Context mContext;
    private ImagePagerAdapter mImagePagerAdapter;
    private final View mLoadingView;
    private OnImageClickedListener mOnImageClickListener;
    private final PagerDotView mPagerDotView;
    private final ViewPager mViewPager;

    public ImagePagerController(Context context, View view, float f)
    {
        mContext = context;
        mContainer = view;
        mLoadingView = view.findViewById(0x7f1001bb);
        mPagerDotView = (PagerDotView)view.findViewById(0x7f1001b9);
        mAspectRatio = f;
        mViewPager = (ViewPager)mContainer.findViewById(0x7f1000f5);
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final ImagePagerController this$0;

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
                this$0 = ImagePagerController.this;
                super();
            }
        });
        mViewPager.setOnClickListener(new android.view.View.OnClickListener() {

            final ImagePagerController this$0;

            public void onClick(View view1)
            {
                if (mOnImageClickListener != null)
                {
                    view1 = mImagePagerAdapter.getItemId(mViewPager.getCurrentItem());
                    mOnImageClickListener.OnImageClickListener(view1);
                }
            }

            
            {
                this$0 = ImagePagerController.this;
                super();
            }
        });
        setLayoutParams();
    }

    private int getMaximumWidth()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mContainer.getLayoutParams();
        View view = (View)mContainer.getParent();
        return ViewUtil.getScreenWidth(mContext) - marginlayoutparams.leftMargin - marginlayoutparams.rightMargin - view.getPaddingLeft() - view.getPaddingRight();
    }

    private void setLayoutParams()
    {
        setWidthParam(mContainer.getLayoutParams().width);
    }

    private void wireAdapterListeners()
    {
        mImagePagerAdapter.setOnFirstItemDisplayedListener(new ImagePagerAdapter.OnFirstItemDisplayedListener() {

            final ImagePagerController this$0;

            public void onFirstItemDisplayed()
            {
                mLoadingView.setVisibility(8);
                int i = mImagePagerAdapter.getCount();
                mPagerDotView.setNbrOfPages(i);
                if (i > 1)
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
                this$0 = ImagePagerController.this;
                super();
            }
        });
        mImagePagerAdapter.setOnItemsChangedListener(new ImagePagerAdapter.OnItemsChangedListener() {

            final ImagePagerController this$0;

            public void onItemsChanged()
            {
                mPagerDotView.setNbrOfPages(mImagePagerAdapter.getCount());
                if (mImagePagerAdapter.getCount() > 1)
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
                this$0 = ImagePagerController.this;
                super();
            }
        });
    }

    public void cleanUp()
    {
        mImagePagerAdapter.cleanUp();
    }

    public void init(ImagePagerAdapter imagepageradapter)
    {
label0:
        {
            if (mViewPager != null)
            {
                if (imagepageradapter == null)
                {
                    break label0;
                }
                mImagePagerAdapter = imagepageradapter;
                wireAdapterListeners();
                mViewPager.setAdapter(mImagePagerAdapter);
                mContainer.setVisibility(0);
            }
            return;
        }
        mContainer.setVisibility(8);
    }

    public void setOnImageClickListener(OnImageClickedListener onimageclickedlistener)
    {
        mOnImageClickListener = onimageclickedlistener;
    }

    public void setWidthParam(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = mContainer.getLayoutParams();
        if (i <= 0)
        {
            i = getMaximumWidth();
        }
        layoutparams.width = i;
        layoutparams.height = (int)((float)i / mAspectRatio);
        mContainer.setLayoutParams(layoutparams);
    }






}
