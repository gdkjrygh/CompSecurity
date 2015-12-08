// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.utils.ViewUtil;

public abstract class ImageAdapter extends BaseAdapter
{

    private static final String TAG = com/walmartlabs/ui/ImageAdapter.getSimpleName();
    private boolean mEnabled;
    private boolean mFadingEnabled;
    private LruCache mImageCache;
    private final ImageDownloader mImageDownloader;
    private boolean mRecyclingEnabled;

    public ImageAdapter(ImageDownloader imagedownloader)
    {
        mEnabled = true;
        mImageCache = new LruCache(50) {

            final ImageAdapter this$0;

            protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
            {
                entryRemoved(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
            }

            protected void entryRemoved(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
            {
                if (bitmap != bitmap1)
                {
                    if (mRecyclingEnabled && bitmap != null && !bitmap.isRecycled())
                    {
                        bitmap.recycle();
                    }
                    onRemovedFromCache(s);
                }
            }

            
            {
                this$0 = ImageAdapter.this;
                super(i);
            }
        };
        mImageDownloader = imagedownloader;
        enableRecycling(false);
    }

    private void setImage(int i, View view, ImageView imageview, Bitmap bitmap, String s, boolean flag)
    {
        imageview.setImageBitmap(bitmap);
        if (mFadingEnabled && flag)
        {
            bitmap = new AlphaAnimation(0.0F, 1.0F);
            bitmap.setDuration(300L);
            imageview.setAnimation(bitmap);
        }
        onImageSet(i, view, s);
    }

    public void clearImages()
    {
        mImageCache.evictAll();
    }

    public void enable(boolean flag)
    {
        mEnabled = flag;
    }

    public void enableFading(boolean flag)
    {
        mFadingEnabled = flag;
    }

    public void enableRecycling(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            flag = true;
        }
        mRecyclingEnabled = flag;
    }

    protected Bitmap getImage(String s)
    {
        return (Bitmap)mImageCache.get(s);
    }

    protected void onFailedImageDownload(int i, View view, int j, String s)
    {
    }

    protected void onImageSet(int i, View view, String s)
    {
    }

    protected boolean onInterceptImageLoading(int i, View view, int j, String s)
    {
        return false;
    }

    protected void onRemovedFromCache(String s)
    {
    }

    protected void setAndCacheImage(Bitmap bitmap, int i, View view, int j, String s)
    {
        if (!mEnabled)
        {
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
        } else
        {
            mImageCache.put(s, bitmap);
            ImageView imageview = (ImageView)ViewUtil.findViewById(view, j);
            if (s.equals(imageview.getTag(com.walmart.lib.R.id.image_url)))
            {
                setImage(i, view, imageview, bitmap, s, true);
                return;
            }
        }
    }

    protected final void setImage(int i, View view, int j, String s)
    {
        ImageView imageview = (ImageView)ViewUtil.findViewById(view, j);
        imageview.setTag(com.walmart.lib.R.id.image_url, s);
        imageview.setImageDrawable(null);
        Bitmap bitmap = (Bitmap)mImageCache.get(s);
        if (bitmap != null)
        {
            setImage(i, view, imageview, bitmap, s, false);
        } else
        if (!onInterceptImageLoading(i, view, j, s))
        {
            if (!TextUtils.isEmpty(s))
            {
                mImageDownloader.downloadImage(s, new AsyncCallbackOnThread(j) {

                    final ImageAdapter this$0;
                    final String val$imageUrl;
                    final int val$imageViewId;
                    final View val$listEntryView;
                    final int val$position;

                    public void onFailureSameThread(Integer integer, Bitmap bitmap1)
                    {
                        onFailedImageDownload(position, listEntryView, imageViewId, imageUrl);
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (Bitmap)obj1);
                    }

                    public void onSuccessSameThread(Bitmap bitmap1)
                    {
                        setAndCacheImage(bitmap1, position, listEntryView, imageViewId, imageUrl);
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((Bitmap)obj);
                    }

            
            {
                this$0 = ImageAdapter.this;
                imageUrl = s;
                position = i;
                listEntryView = view;
                imageViewId = j;
                super(final_handler);
            }
                });
                return;
            } else
            {
                onFailedImageDownload(i, view, j, s);
                return;
            }
        }
    }


}
