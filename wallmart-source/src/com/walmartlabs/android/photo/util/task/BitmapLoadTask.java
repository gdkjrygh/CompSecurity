// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.util.BitmapCache;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.image.ImageUtils;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.RecyclingBitmapDrawable;
import com.walmartlabs.utils.WLog;

public class BitmapLoadTask extends AsyncTask
{
    public static interface BitmapLoadCallback
    {

        public abstract void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj);

        public abstract void onTaskCancelled(Bitmap bitmap);
    }


    public static final int BITMAP_TYPE_FULL = 2;
    public static final int BITMAP_TYPE_FULL_THUMBNAIL = 1;
    public static final int BITMAP_TYPE_HALF_THUMBNAIL = 0;
    private static final String TAG = com/walmartlabs/android/photo/util/task/BitmapLoadTask.getSimpleName();
    private int mBitmapType;
    private boolean mCacheHit;
    private BitmapLoadCallback mCallback;
    private Context mContext;
    private int mMinHeight;
    private int mMinWidth;
    private DevicePhoto mPhoto;
    private Object mTag;

    public BitmapLoadTask(Context context, int i, int j, int k, BitmapLoadCallback bitmaploadcallback)
    {
        mContext = context.getApplicationContext();
        mBitmapType = i;
        mMinWidth = j;
        mMinHeight = k;
        mCallback = bitmaploadcallback;
        if (DeviceUtils.isLittleMemory() && mBitmapType == 2)
        {
            PhotoLogger.get().d(TAG, "Low-memory device, reverting from original to thumbnail loading");
            mBitmapType = 1;
        } else
        if (mBitmapType == 2 && (mMinWidth <= 0 || mMinHeight <= 0))
        {
            mMinHeight = 600;
            mMinWidth = 600;
            return;
        }
    }

    public BitmapLoadTask(Context context, int i, BitmapLoadCallback bitmaploadcallback)
    {
        this(context, i, 0, 0, bitmaploadcallback);
    }

    private String getStringForType(int i)
    {
        switch (i)
        {
        default:
            return "N/A";

        case 2: // '\002'
            return "FULL";

        case 1: // '\001'
            return "THUMBNAIL";

        case 0: // '\0'
            return "THUMBNAIL/2";
        }
    }

    private Bitmap loadThumbnail(int i)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inSampleSize = i;
        try
        {
            obj = android.provider.MediaStore.Images.Thumbnails.getThumbnail(mContext.getContentResolver(), mPhoto.getId(), 1, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            WLog.w(TAG, (new StringBuilder()).append("loadThumbnail(").append(i).append("): OOM while loading thumbnail, returning null").toString());
            return null;
        }
        return ((Bitmap) (obj));
    }

    private String taskDetails()
    {
        return (new StringBuilder(TAG)).append((new StringBuilder()).append(" [").append(mPhoto.getName()).append(", ").append(getStringForType(mBitmapType)).append(", min: ").append(mMinWidth).append("x").append(mMinHeight).toString()).toString();
    }

    protected PhotoDrawable asDrawable(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        if (PhotoUtils.needToRecycleBitmaps())
        {
            return new RecyclingBitmapDrawable(mContext.getResources(), bitmap);
        } else
        {
            return new PhotoDrawable(mContext.getResources(), bitmap);
        }
    }

    protected transient PhotoDrawable doInBackground(DevicePhoto adevicephoto[])
    {
        byte byte0 = 2;
        Object obj1 = null;
        Object obj = obj1;
        if (adevicephoto != null)
        {
            obj = obj1;
            if (adevicephoto.length == 1)
            {
                obj = obj1;
                if (adevicephoto[0] != null)
                {
                    mPhoto = adevicephoto[0];
                    mPhoto.getDimensions(mContext);
                    if (mBitmapType == 2)
                    {
                        obj = asDrawable(PhotoUtils.decodeSampledBitmap(mPhoto.getLocation(), mMinWidth, mMinHeight));
                    } else
                    if (!shouldCache())
                    {
                        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Not caching: ").append(mPhoto.getName()).toString());
                        if (mBitmapType != 0)
                        {
                            byte0 = 1;
                        }
                        obj = asDrawable(loadThumbnail(byte0));
                    } else
                    {
                        byte byte1;
                        if (mBitmapType == 0)
                        {
                            byte1 = 2;
                        } else
                        {
                            byte1 = 1;
                        }
                        obj = (new StringBuilder()).append(String.valueOf(mPhoto.getId()));
                        if (byte1 == 1)
                        {
                            adevicephoto = "-full";
                        } else
                        {
                            adevicephoto = "-half";
                        }
                        obj = ((StringBuilder) (obj)).append(adevicephoto).toString();
                        adevicephoto = BitmapCache.get().getBitmapDrawable(((String) (obj)));
                        if (adevicephoto == null || adevicephoto.getBitmap() == null)
                        {
                            Bitmap bitmap = loadThumbnail(byte1);
                            if (bitmap != null)
                            {
                                adevicephoto = asDrawable(bitmap);
                                BitmapCache.get().putBitmap(((String) (obj)), adevicephoto);
                            }
                            mPhoto.setBroken(ImageUtils.isNotJpeg(mPhoto.getLocation()));
                        } else
                        {
                            mCacheHit = true;
                        }
                        obj = adevicephoto;
                    }
                }
            }
        }
        return onPostProcessInBackground(mPhoto, ((PhotoDrawable) (obj)));
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((DevicePhoto[])aobj);
    }

    protected Context getContext()
    {
        return mContext;
    }

    protected void onCancelled(PhotoDrawable photodrawable)
    {
        PhotoLogger.get().d(TAG, "Task cancelled");
    }

    protected volatile void onCancelled(Object obj)
    {
        onCancelled((PhotoDrawable)obj);
    }

    protected void onPostExecute(PhotoDrawable photodrawable)
    {
        if (photodrawable == null)
        {
            PhotoLogger.get().w(TAG, (new StringBuilder()).append("Photo ").append(mPhoto.getLocation()).append(" could not be loaded, seems broken/corrupt").toString());
            mPhoto.setBroken(true);
        }
        if (mCallback != null)
        {
            mCallback.onBitmapLoaded(photodrawable, mCacheHit, mTag);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((PhotoDrawable)obj);
    }

    protected PhotoDrawable onPostProcessInBackground(DevicePhoto devicephoto, PhotoDrawable photodrawable)
    {
        return photodrawable;
    }

    public void setTag(Object obj)
    {
        mTag = obj;
    }

    protected boolean shouldCache()
    {
        return true;
    }

}
