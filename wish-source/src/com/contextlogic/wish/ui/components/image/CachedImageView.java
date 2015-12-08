// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.cache.CachedImageFetcher;
import com.contextlogic.wish.cache.CachedImageFetcherCallback;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.util.BitmapUtil;

// Referenced classes of package com.contextlogic.wish.ui.components.image:
//            SafeTouchImageView, SafeImageView

public class CachedImageView extends FrameLayout
    implements CachedImageFetcherCallback
{
    public static interface Listener
    {

        public abstract void onImageAnimationComplete();

        public abstract void onImageErrored();

        public abstract void onImageLoaded();

        public abstract void onImageRequested();

        public abstract void onImageUnloaded();
    }


    private static final int MAX_ATTEMPTS = 2;
    private int actualImageHeight;
    private int actualImageWidth;
    private boolean animationEnabled;
    private int attempts;
    private int backgroundColor;
    private AlphaAnimation fadeAnimation;
    private boolean forceAnimation;
    private boolean forceNoImageResize;
    private boolean imageErrored;
    private CachedImageFetcher imageFetcher;
    private boolean imageLoaded;
    private boolean imageLoading;
    private boolean imageReleased;
    private ImageView imageView;
    private Listener listener;
    private long requestTime;
    private int requestedImageHeight;
    private int requestedImageWidth;
    private WishAnalyticsEvent touchImageViewZoomEvent;
    private boolean touchImageViewZoomTracked;
    private String url;
    private boolean useDynamicScaling;

    public CachedImageView(Context context)
    {
        this(context, null);
    }

    public CachedImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CachedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void cancelRequest()
    {
        if (imageFetcher != null)
        {
            imageFetcher.cancel();
            imageFetcher = null;
        }
        imageLoading = false;
    }

    private void init()
    {
        useDynamicScaling = false;
        backgroundColor = getResources().getColor(0x7f0c00e8);
        if (shouldSupportTouch())
        {
            final SafeTouchImageView touchImageView = new SafeTouchImageView(getContext());
            touchImageView.setOnTouchImageViewListener(new com.ortiz.touch.TouchImageView.OnTouchImageViewListener() {

                final CachedImageView this$0;
                final SafeTouchImageView val$touchImageView;

                public void onMove()
                {
                    trackTouchImageViewMove(touchImageView.isZoomed());
                }

            
            {
                this$0 = CachedImageView.this;
                touchImageView = safetouchimageview;
                super();
            }
            });
            imageView = touchImageView;
        } else
        {
            imageView = new SafeImageView(getContext());
        }
        imageView.setDrawingCacheEnabled(false);
        setAnimationCacheEnabled(false);
        setDrawingCacheEnabled(false);
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(imageView);
        requestedImageWidth = -1;
        requestedImageHeight = -1;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        animationEnabled = true;
        requestTime = -1L;
        forceAnimation = false;
        touchImageViewZoomTracked = false;
        fadeAnimation = new AlphaAnimation(0.0F, 1.0F);
        fadeAnimation.setDuration(250L);
        fadeAnimation.setFillBefore(true);
        fadeAnimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final CachedImageView this$0;

            public void onAnimationEnd(Animation animation)
            {
                if (listener != null)
                {
                    listener.onImageAnimationComplete();
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = CachedImageView.this;
                super();
            }
        });
    }

    private void requestImage()
    {
        byte byte0;
        if (url == null)
        {
            return;
        }
        cancelRequest();
        imageReleased = false;
        Bitmap bitmap = TransientCache.getInstance().getCachedImage(url, requestedImageWidth, requestedImageHeight);
        if (bitmap != null)
        {
            onImageLoaded(null, bitmap);
            unlockImageFromCache();
            return;
        }
        if (attempts == 0)
        {
            requestTime = System.currentTimeMillis();
        }
        if (listener != null && attempts == 0)
        {
            listener.onImageRequested();
        }
        attempts = attempts + 1;
        imageLoading = true;
        imageFetcher = new CachedImageFetcher(this);
        imageFetcher.setUseDynamicScaling(useDynamicScaling);
        imageFetcher.setRequestedImageWidth(requestedImageWidth);
        imageFetcher.setRequestedImageHeight(requestedImageHeight);
        byte0 = -1;
        if (imageView.getScaleType() != android.widget.ImageView.ScaleType.FIT_CENTER) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        imageFetcher.setMode(i);
        imageFetcher.fetchImage(url, null);
        return;
_L2:
        i = byte0;
        if (imageView.getScaleType() == android.widget.ImageView.ScaleType.CENTER_CROP)
        {
            i = byte0;
            if (requestedImageWidth > 0)
            {
                i = byte0;
                if (requestedImageHeight > 0)
                {
                    i = 1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void trackTouchImageViewMove(boolean flag)
    {
        if (!touchImageViewZoomTracked && touchImageViewZoomEvent != null && flag)
        {
            touchImageViewZoomTracked = true;
            (new LogService()).requestService(Integer.toString(touchImageViewZoomEvent.getValue()), null, null, null);
        }
    }

    public int getActualImageHeight()
    {
        return actualImageHeight;
    }

    public int getActualImageWidth()
    {
        return actualImageWidth;
    }

    public String getImageUrl()
    {
        return url;
    }

    public boolean isImageErrored()
    {
        return imageErrored;
    }

    public boolean isImageLoaded()
    {
        return imageLoaded;
    }

    public void lockImageInCache()
    {
        if (url == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        Object obj;
        try
        {
            obj = imageView.getDrawable();
        }
        catch (Throwable throwable)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (obj instanceof BitmapDrawable)
        {
            obj = ((BitmapDrawable)obj).getBitmap();
            if (!((Bitmap) (obj)).isRecycled())
            {
                TransientCache.getInstance().cacheImage(url, ((Bitmap) (obj)), requestedImageWidth, requestedImageHeight);
                TransientCache.getInstance().lockCachedImage(url, requestedImageWidth, requestedImageHeight);
            }
        }
    }

    public void onImageLoadFailed(Object obj)
    {
        imageFetcher = null;
        imageLoaded = false;
        imageErrored = true;
        imageLoading = false;
        if (attempts < 2)
        {
            requestImage();
        } else
        {
            requestTime = -1L;
            if (listener != null)
            {
                listener.onImageErrored();
                return;
            }
        }
    }

    public void onImageLoaded(Object obj, Bitmap bitmap)
    {
        imageFetcher = null;
        imageLoaded = true;
        imageErrored = false;
        imageLoading = false;
        actualImageHeight = bitmap.getHeight();
        actualImageWidth = bitmap.getWidth();
        if (useDynamicScaling && bitmap != null)
        {
            if (bitmap.getWidth() < getWidth() && bitmap.getHeight() < getHeight())
            {
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            } else
            {
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            }
        }
        if (listener != null)
        {
            listener.onImageLoaded();
        }
        imageView.setBackgroundColor(backgroundColor);
        imageView.setImageBitmap(bitmap);
        TransientCache.getInstance().cacheImage(url, bitmap, requestedImageWidth, requestedImageHeight);
        imageView.clearAnimation();
        if (!animationEnabled || !forceAnimation && (requestTime == -1L || System.currentTimeMillis() - requestTime <= 400L)) goto _L2; else goto _L1
_L1:
        imageView.startAnimation(fadeAnimation);
        invalidate();
_L4:
        requestTime = -1L;
        return;
_L2:
        if (listener != null)
        {
            listener.onImageAnimationComplete();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onWindowVisibilityChanged(int i)
    {
        if (i == 8)
        {
            cancelRequest();
        } else
        if (i == 0 && url != null && !imageErrored && !imageLoading && !imageLoaded && imageFetcher == null && !imageReleased)
        {
            requestImage();
            return;
        }
    }

    public void releaseImage()
    {
        releaseImage(true);
    }

    public void releaseImage(boolean flag)
    {
        if (url != null)
        {
            cancelRequest();
            if (listener != null)
            {
                listener.onImageUnloaded();
            }
            imageReleased = true;
            imageLoaded = false;
            Object obj = imageView.getDrawable();
            if (obj != null && (obj instanceof BitmapDrawable))
            {
                obj = ((BitmapDrawable)obj).getBitmap();
                imageView.setImageDrawable(null);
                imageView.setBackgroundColor(getResources().getColor(0x7f0c00e4));
                if (flag)
                {
                    unlockImageFromCache();
                }
                if (TransientCache.getInstance().removedCachedImage(url, requestedImageWidth, requestedImageHeight) && obj != null)
                {
                    ((Bitmap) (obj)).recycle();
                    return;
                }
            }
        }
    }

    public void restoreImage()
    {
        restoreImage(null);
    }

    public void restoreImage(Drawable drawable)
    {
        if (url == null)
        {
            return;
        } else
        {
            imageView.setImageDrawable(drawable);
            attempts = 0;
            requestImage();
            return;
        }
    }

    public void setAnimationEnabled(boolean flag)
    {
        animationEnabled = flag;
    }

    public void setForceAnimation(boolean flag)
    {
        forceAnimation = flag;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        if (useDynamicScaling && bitmap != null)
        {
            if (bitmap.getWidth() < getWidth() && bitmap.getHeight() < getHeight())
            {
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            } else
            {
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            }
        }
        url = null;
        imageLoaded = false;
        imageErrored = false;
        imageView.clearAnimation();
        imageView.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable)
    {
        url = null;
        imageLoaded = false;
        imageErrored = false;
        imageView.clearAnimation();
        imageView.setImageDrawable(drawable);
    }

    public void setImageResource(int i)
    {
        url = null;
        imageLoaded = false;
        imageErrored = false;
        imageView.clearAnimation();
        BitmapUtil.safeSetImageResource(imageView, i);
    }

    public void setImageUrl(String s)
    {
        if (s == null || url == null || !s.equals(url) || !imageLoaded)
        {
            imageView.clearAnimation();
            releaseImage(false);
            url = s;
            attempts = 0;
            imageLoaded = false;
            imageErrored = false;
            if (url != null)
            {
                requestImage();
                return;
            }
        }
    }

    public void setListener(Listener listener1)
    {
        listener = listener1;
    }

    public void setLoadedBackgroundColor(int i)
    {
        backgroundColor = i;
    }

    public void setRequestedImageHeight(int i)
    {
        setRequestedImageHeightPx((int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics()));
    }

    public void setRequestedImageHeightOffset(int i)
    {
        requestedImageHeight = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight() - (int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    public void setRequestedImageHeightPercent(float f)
    {
        requestedImageHeight = (int)((float)((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight() * (f / 100F));
    }

    public void setRequestedImageHeightPx(int i)
    {
        requestedImageHeight = i;
    }

    public void setRequestedImageWidth(int i)
    {
        setRequestedImageWidthPx((int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics()));
    }

    public void setRequestedImageWidthOffset(int i)
    {
        requestedImageWidth = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth() - (int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    public void setRequestedImageWidthPercent(float f)
    {
        requestedImageWidth = (int)((float)((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth() * (f / 100F));
    }

    public void setRequestedImageWidthPx(int i)
    {
        requestedImageWidth = i;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        imageView.setScaleType(scaletype);
    }

    public void setTouchImageViewZoomEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        touchImageViewZoomEvent = wishanalyticsevent;
    }

    public void setUseDynamicScaling(boolean flag)
    {
        useDynamicScaling = flag;
    }

    protected boolean shouldSupportTouch()
    {
        return false;
    }

    public void unlockImageFromCache()
    {
        if (url != null)
        {
            TransientCache.getInstance().unlockCachedImage(url, requestedImageWidth, requestedImageHeight);
        }
    }


}
