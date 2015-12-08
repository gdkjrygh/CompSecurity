// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.Base64;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ui.ZoomableImageView;

public class SaverReceiptImagePresenter extends Presenter
{
    class DecodeBitmapTask extends AsyncTask
    {

        final SaverReceiptImagePresenter this$0;

        protected transient Bitmap doInBackground(String as[])
        {
            as = as[0];
            return decodeImage(as);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            if (isPopped())
            {
                return;
            } else
            {
                setEReceiptImage(bitmap);
                hideImageProgress();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        DecodeBitmapTask()
        {
            this$0 = SaverReceiptImagePresenter.this;
            super();
        }
    }


    private static final long IMAGE_CACHE_TIMEOUT = 0x493e0L;
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptImagePresenter.getSimpleName();
    private final Activity mActivity;
    private final ImageDownloader mImageDownloader;
    private ZoomableImageView mItemImage;
    private View mItemImageProgress;
    private EReceipt mReceipt;
    private View mRootView;

    public SaverReceiptImagePresenter(Activity activity, ImageDownloader imagedownloader)
    {
        mActivity = activity;
        mImageDownloader = imagedownloader;
        setTitleText(mActivity.getString(0x7f0904f1));
    }

    private Bitmap decodeImage(String s)
    {
        Object obj = null;
        if (!TextUtils.isEmpty(s))
        {
            s = Base64.decode(s, 0);
            obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(s, 0, s.length, ((android.graphics.BitmapFactory.Options) (obj)));
            int l = mImageDownloader.getMaxSize();
            int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
            int j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
            int i;
            for (i = 1; k > l || j > l; i++)
            {
                k /= 2;
                j /= 2;
            }

            obj = new android.graphics.BitmapFactory.Options();
            obj.inSampleSize = i;
            obj = BitmapFactory.decodeByteArray(s, 0, s.length, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        return ((Bitmap) (obj));
    }

    private void fetchReceiptImage()
    {
label0:
        {
            if (mReceipt != null)
            {
                if (!mReceipt.hasImage())
                {
                    break label0;
                }
                EReceiptManager.get().getReceiptImage(mReceipt.uuid, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                    final SaverReceiptImagePresenter this$0;

                    public volatile void onResult(Object obj)
                    {
                        onResult((String)obj);
                    }

                    public void onResult(String s)
                    {
                        (new DecodeBitmapTask()).execute(new String[] {
                            s
                        });
                    }

            
            {
                this$0 = SaverReceiptImagePresenter.this;
                super();
            }
                });
            }
            return;
        }
        AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

            final SaverReceiptImagePresenter this$0;

            public void onFailureSameThread(Integer integer, Bitmap bitmap)
            {
                if (isPopped())
                {
                    if (bitmap != null)
                    {
                        bitmap.recycle();
                    }
                    return;
                } else
                {
                    setEReceiptImage(bitmap);
                    hideImageProgress();
                    return;
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Bitmap)obj1);
            }

            public void onSuccessSameThread(Bitmap bitmap)
            {
                if (isPopped())
                {
                    if (bitmap != null)
                    {
                        bitmap.recycle();
                    }
                    return;
                } else
                {
                    setEReceiptImage(bitmap);
                    hideImageProgress();
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Bitmap)obj);
            }

            
            {
                this$0 = SaverReceiptImagePresenter.this;
                super(handler);
            }
        };
        mImageDownloader.downloadImage(EReceiptManager.get().getReceiptImageUrl(mReceipt.uuid), 0x493e0L, asynccallbackonthread, true);
    }

    private void hideImageProgress()
    {
        mItemImageProgress.setVisibility(8);
        mItemImage.setVisibility(0);
    }

    private void setEReceiptImage(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            bitmap = mActivity.getResources().getDrawable(0x7f020219);
        } else
        {
            bitmap = new BitmapDrawable(mActivity.getResources(), bitmap);
        }
        mItemImage.setImageDrawable(bitmap);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mItemImage != null)
        {
            ViewUtil.recycleImageView(mItemImage);
            mItemImage = null;
        }
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        fetchReceiptImage();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mItemImage != null)
        {
            mItemImage.setLayoutListener();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040164, viewgroup);
            mItemImage = (ZoomableImageView)ViewUtil.findViewById(mRootView, 0x7f1000ea);
            mItemImageProgress = ViewUtil.findViewById(mRootView, 0x7f1000eb);
        }
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Receipt - Detail Image").putString("section", "Saver - Receipt").putString("subCategory", "Receipt");
        MessageBus.getBus().post(builder);
    }

    public void setReceipt(EReceipt ereceipt)
    {
        mReceipt = ereceipt;
        fetchReceiptImage();
    }




}
