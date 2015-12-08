// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.merchandising.BannerData;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.home:
//            BannerView

public class MerchandisingAdapter extends PagerAdapter
{
    public static interface BannerDimensionsListener
    {

        public abstract void onNewDimensions(int i, int j);
    }

    public static interface BannersReadyListener
    {

        public abstract void onBannersReady();
    }

    public static interface OnItemsChangedListener
    {

        public abstract void onItemsChanged();
    }


    public static final String TAG = com/walmart/android/app/home/MerchandisingAdapter.getSimpleName();
    private BannerDimensionsListener mBannerDimensionsListener;
    private BannerData mBanners[];
    private boolean mBannersReady;
    private BannersReadyListener mBannersReadyListener;
    private Context mContext;
    private OnItemsChangedListener mOnItemsChangedListener;

    public MerchandisingAdapter(Context context)
    {
        mBannersReady = false;
        mContext = context;
    }

    private void notifyFirstItemDisplayed()
    {
        if (!mBannersReady)
        {
            mBannersReady = true;
            if (mBannersReadyListener != null)
            {
                mBannersReadyListener.onBannersReady();
                mBannersReadyListener = null;
            }
        }
    }

    public void cleanUp()
    {
        WLog.d(TAG, "cleanUp(): Cancelling any ongoing banner downloads");
        Picasso.with(mContext).cancelTag(TAG);
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        WLog.d(TAG, (new StringBuilder()).append("destroyItem(").append(i).append(")").toString());
        obj = (BannerView)obj;
        ((BannerView) (obj)).setBitmapListener(null);
        viewgroup.removeView(((View) (obj)));
    }

    public BannerData getBannerData(int i)
    {
        if (mBanners != null && i < mBanners.length)
        {
            return mBanners[i];
        } else
        {
            return null;
        }
    }

    public int getCount()
    {
        if (mBanners != null)
        {
            return mBanners.length;
        } else
        {
            return 0;
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        WLog.d(TAG, (new StringBuilder()).append("instantiateItem(").append(i).append(")").toString());
        BannerView bannerview = (BannerView)ViewUtil.inflate(mContext, 0x7f040028, viewgroup);
        BannerData bannerdata = mBanners[i];
        if (i == 0)
        {
            bannerview.setBitmapListener(new BannerView.BitmapListener() {

                final MerchandisingAdapter this$0;

                public void onBitmapLoaded(int j, int k)
                {
                    if (mBannerDimensionsListener != null)
                    {
                        mBannerDimensionsListener.onNewDimensions(j, k);
                    }
                }

            
            {
                this$0 = MerchandisingAdapter.this;
                super();
            }
            });
        }
        if (bannerdata.image != null && bannerview != null)
        {
            WLog.d(TAG, (new StringBuilder()).append("instantiateItem(").append(i).append("): Fetching banner image: ").append(bannerdata.image).toString());
            Picasso.with(mContext).load(bannerdata.image).tag(TAG).into(bannerview);
        }
        viewgroup.addView(bannerview);
        notifyFirstItemDisplayed();
        return bannerview;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        if (mOnItemsChangedListener != null)
        {
            mOnItemsChangedListener.onItemsChanged();
        }
    }

    public void setBannerDimensionsListener(BannerDimensionsListener bannerdimensionslistener)
    {
        mBannerDimensionsListener = bannerdimensionslistener;
    }

    public void setBanners(BannerData abannerdata[])
    {
        mBanners = abannerdata;
        if (abannerdata != null)
        {
            int j = abannerdata.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = abannerdata[i];
                String s = TAG;
                StringBuilder stringbuilder = (new StringBuilder()).append("setBanners(): ");
                if (obj != null)
                {
                    obj = ((BannerData) (obj)).toString();
                } else
                {
                    obj = null;
                }
                WLog.d(s, stringbuilder.append(((String) (obj))).toString());
                i++;
            }
        }
        notifyDataSetChanged();
    }

    public void setBannersReadyListener(BannersReadyListener bannersreadylistener)
    {
        mBannersReadyListener = bannersreadylistener;
    }

    public void setOnItemsChangedListener(OnItemsChangedListener onitemschangedlistener)
    {
        mOnItemsChangedListener = onitemschangedlistener;
    }


}
