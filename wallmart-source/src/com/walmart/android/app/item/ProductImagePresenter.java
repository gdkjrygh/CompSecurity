// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;
import java.util.List;

public class ProductImagePresenter extends Presenter
{

    private boolean mConfigurationChanged;
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private boolean mHasAltImages;
    private String mImageUrls[];
    private final Bitmap mImages[];
    private int mOrientation;
    private ViewGroup mPresenterView;
    private ViewGroup mScrollView;
    private WebView mSelectedImageWebView;
    private int mSelectedPosition;
    private View mSelectedThumbNailView;
    private LinearLayout mThumbnailContainer;

    public ProductImagePresenter(Context context, List list)
    {
        mPresenterView = null;
        mContext = context;
        mOrientation = mContext.getResources().getConfiguration().orientation;
        mImageUrls = (String[])list.toArray(new String[list.size()]);
        int i = mImageUrls.length;
        boolean flag;
        if (i > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasAltImages = flag;
        mImages = new Bitmap[i];
    }

    private void cleanup()
    {
        if (mPresenterView != null && mSelectedImageWebView != null)
        {
            mPresenterView.removeView(mSelectedImageWebView);
            mSelectedImageWebView.destroy();
            mSelectedImageWebView = null;
        }
        if (mScrollView != null)
        {
            mScrollView.removeView(mThumbnailContainer);
        }
    }

    private void clearThumbnail(int i)
    {
        ViewGroup viewgroup = (ViewGroup)mThumbnailContainer.findViewById(i);
        if (viewgroup != null)
        {
            ((ImageView)viewgroup.findViewById(0x7f10020d)).setImageDrawable(null);
        }
    }

    private void getImage(String s, int i)
    {
        s = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_150, s);
        Services.get().getWalmartService().getImage(s, new AsyncCallbackOnThread(i) {

            final ProductImagePresenter this$0;
            final int val$position;

            public void onFailureSameThread(Integer integer, Bitmap bitmap)
            {
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Bitmap)obj1);
            }

            public void onSuccessSameThread(Bitmap bitmap)
            {
                if (!isPopped())
                {
                    mImages[position] = bitmap;
                    initThumbnail(position);
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Bitmap)obj);
            }

            
            {
                this$0 = ProductImagePresenter.this;
                position = i;
                super(final_handler);
            }
        });
    }

    private String getUrlHtmlString(int i)
    {
        Object obj = null;
        String s = obj;
        if (mImageUrls != null)
        {
            s = obj;
            if (mImageUrls.length > i)
            {
                String s2 = mImageUrls[i];
                s = s2;
                if (s2 != null)
                {
                    String s1;
                    if (mOrientation == 2)
                    {
                        s1 = "width=\"auto\"";
                        s = "height=\"80%25\"";
                    } else
                    {
                        s1 = "width=\"80%25\"";
                        s = "height=\"auto\"";
                    }
                    s2 = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_500, s2);
                    s = (new StringBuilder()).append("<img ").append(s1).append(" ").append(s).append("\" style=\"margin:auto;display:block;\" src=\"").append(s2).append("\" />").toString();
                }
            }
        }
        return s;
    }

    private void initThumbnail(final int position)
    {
        Object obj = (ViewGroup)mThumbnailContainer.findViewById(position);
        if (obj != null)
        {
            obj = (ImageView)((ViewGroup) (obj)).findViewById(0x7f10020d);
            ((ImageView) (obj)).setImageBitmap(mImages[position]);
            ((ImageView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final ProductImagePresenter this$0;
                final int val$position;

                public void onClick(View view)
                {
                    selectThumbnail(position);
                }

            
            {
                this$0 = ProductImagePresenter.this;
                position = i;
                super();
            }
            });
        }
    }

    private void selectThumbnail(final int position)
    {
        mSelectedPosition = position;
        int i = 0;
        if (mConfigurationChanged)
        {
            i = 300;
        }
        (new Handler()).postDelayed(new Runnable() {

            final ProductImagePresenter this$0;
            final int val$position;

            public void run()
            {
                mSelectedImageWebView.loadData(getUrlHtmlString(position), "text/html", "UTF-8");
            }

            
            {
                this$0 = ProductImagePresenter.this;
                position = i;
                super();
            }
        }, i);
        if (mHasAltImages)
        {
            View view = mSelectedThumbNailView;
            mSelectedThumbNailView = mThumbnailContainer.findViewById(position);
            if (view != null)
            {
                view.setBackgroundDrawable(mSelectedThumbNailView.getBackground());
            }
            mSelectedThumbNailView.setBackgroundColor(mContext.getResources().getColor(0x7f0f0124));
        }
    }

    public String getTitleText()
    {
        return "Images";
    }

    public View getView()
    {
        return mPresenterView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        mSelectedImageWebView.destroy();
        if (mHasAltImages)
        {
            for (int i = 0; i < mImages.length; i++)
            {
                clearThumbnail(i);
            }

        }
        for (int j = 0; j < mImages.length; j++)
        {
            if (mImages[j] == null)
            {
                continue;
            }
            if (!mImages[j].isRecycled())
            {
                mImages[j].recycle();
            }
            mImages[j] = null;
        }

        mPresenterView = null;
    }

    public void onBeforePush()
    {
        if (mHasAltImages)
        {
            for (int i = 0; i < mImageUrls.length; i++)
            {
                getImage(mImageUrls[i], i);
            }

        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mConfigurationChanged = true;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        int l = mContext.getResources().getConfiguration().orientation;
        if (mThumbnailContainer == null)
        {
            mThumbnailContainer = new LinearLayout(mContext);
            if (mHasAltImages)
            {
                int i = ViewUtil.dpToPixels(5, mContext);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.leftMargin = i;
                layoutparams.rightMargin = i;
                for (int j = 0; j < mImages.length; j++)
                {
                    View view = LayoutInflater.from(mContext.getApplicationContext()).inflate(0x7f04013b, null);
                    view.setId(j);
                    mThumbnailContainer.addView(view, layoutparams);
                }

            }
        }
        if (mPresenterView == null || l != mOrientation)
        {
            mOrientation = l;
            cleanup();
            mPresenterView = (ViewGroup)ViewUtil.inflate(mContext.getApplicationContext(), 0x7f04013a, viewgroup);
            mSelectedImageWebView = new WebView(mContext.getApplicationContext());
            mSelectedImageWebView.getSettings().setBuiltInZoomControls(true);
            mSelectedImageWebView.getSettings().setLoadWithOverviewMode(true);
            mSelectedImageWebView.getSettings().setUseWideViewPort(true);
            ((ViewGroup)ViewUtil.findViewById(mPresenterView, 0x7f10045e)).addView(mSelectedImageWebView);
            mScrollView = (ViewGroup)mPresenterView.findViewById(0x7f10045f);
            mScrollView.addView(mThumbnailContainer);
            viewgroup = mThumbnailContainer;
            int k;
            if (mOrientation == 2)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            viewgroup.setOrientation(k);
        }
        selectThumbnail(mSelectedPosition);
    }





}
