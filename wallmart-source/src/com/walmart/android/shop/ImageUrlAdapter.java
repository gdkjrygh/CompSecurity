// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.shop;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.app.ui.ImagePagerAdapter;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.utils.ViewUtil;
import java.util.List;

public class ImageUrlAdapter extends ImagePagerAdapter
{

    private static final String TAG = com/walmart/android/shop/ImageUrlAdapter.getSimpleName();
    private final ImageDownloader mImageDownloader;
    protected String mImageUrls[];

    public ImageUrlAdapter(Context context, ImageDownloader imagedownloader)
    {
        super(context);
        mImageUrls = new String[0];
        mImageDownloader = imagedownloader;
    }

    public void cleanUp()
    {
        super.cleanUp();
        mImageDownloader.cancelAllDownloads();
    }

    protected void downloadImage(int i, String s)
    {
        AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(i) {

            final ImageUrlAdapter this$0;
            final int val$position;
            final String val$url;

            public void onFailureSameThread(Integer integer, Bitmap bitmap)
            {
                Log.w(ImageUrlAdapter.TAG, (new StringBuilder()).append("Failed to download image : ").append(url).toString());
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Bitmap)obj1);
            }

            public void onSuccessSameThread(Bitmap bitmap)
            {
                _22_Failed_20_to_20_download_20_image_20__3A__20__22_.put(position, bitmap);
                bitmap = (View)append.get(position);
                if (bitmap != null)
                {
                    setImage(position, bitmap);
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Bitmap)obj);
            }

            
            {
                this$0 = ImageUrlAdapter.this;
                url = s;
                position = i;
                super(final_handler);
            }
        };
        mImageDownloader.downloadImage(s, 0x36ee80L, asynccallbackonthread);
        mBitmaps.put(i, mPlaceHolderBitmap);
    }

    public int getCount()
    {
        if (mImageUrls != null)
        {
            return mImageUrls.length;
        } else
        {
            return 0;
        }
    }

    public String[] getImageUrls()
    {
        return mImageUrls;
    }

    public String getItemId(int i)
    {
        String s1 = "";
        String s = s1;
        if (mImageUrls != null)
        {
            s = s1;
            if (mImageUrls.length != 0)
            {
                s = s1;
                if (i < mImageUrls.length)
                {
                    s = mImageUrls[i];
                }
            }
        }
        return s;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        Object obj = null;
        View view = obj;
        if (mImageUrls != null)
        {
            view = obj;
            if (mImageUrls.length != 0)
            {
                view = obj;
                if (i < mImageUrls.length)
                {
                    View view1 = ViewUtil.inflate(mContext, 0x7f04007f, viewgroup);
                    view = view1;
                    if (!setImage(i, view1))
                    {
                        String s = mImageUrls[i];
                        view = view1;
                        if (!TextUtils.isEmpty(s))
                        {
                            downloadImage(i, s);
                            view = view1;
                        }
                    }
                }
            }
        }
        mViews.put(i, view);
        viewgroup.addView(view);
        notifyFirstItemDisplayed();
        return view;
    }

    public void setImageUrls(List list, int i)
    {
        mImageUrls = (String[])list.toArray(new String[list.size()]);
        mViewPagerWidth = i;
        notifyDataSetChanged();
    }





}
