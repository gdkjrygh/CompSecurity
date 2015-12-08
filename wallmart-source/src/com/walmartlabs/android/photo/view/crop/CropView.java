// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.crop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;

public class CropView extends View
{
    public static class Crop
    {

        private float mBottom;
        private float mLeft;
        private float mRight;
        private float mTop;

        public float getBottom()
        {
            return mBottom;
        }

        public float getLeft()
        {
            return mLeft;
        }

        public float getRight()
        {
            return mRight;
        }

        public float getTop()
        {
            return mTop;
        }

        public Crop(float f, float f1, float f2, float f3)
        {
            mLeft = Math.max(0.0F, f);
            mTop = Math.max(0.0F, f1);
            mRight = Math.min(1.0F, f2);
            mBottom = Math.min(1.0F, f3);
        }
    }

    private class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final CropView this$0;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            mScaleFactor = mScaleFactor * scalegesturedetector.getScaleFactor();
            mScaleFactor = Math.max(mMinScale, Math.min(mScaleFactor, getMaxScale()));
            invalidate();
            return true;
        }

        private ScaleListener()
        {
            this$0 = CropView.this;
            super();
        }

    }


    private static final float INITIAL_SCALE_FACTOR = 1.25F;
    private static final float LANDSCAPE_SELECTION_WIDTH_FACTOR = 0.7F;
    private static final int POINTER_ID_NONE = -1;
    private static final String TAG = com/walmartlabs/android/photo/view/crop/CropView.getSimpleName();
    private int mActivePointerId;
    private Bitmap mBitmap;
    private RectF mBitmapDestinationRect;
    private Paint mDashedLinePaint;
    private Paint mDefaultPaint;
    private boolean mDrawProductAndOrientationInfo;
    private boolean mHasPositionedForInitialCrop;
    private com.walmartlabs.android.photo.model.order.Crop mInitialCrop;
    private float mLastTouchX;
    private float mLastTouchY;
    private float mMinScale;
    private int mOriginalHeight;
    private int mOriginalWidth;
    private boolean mPhotoPositioned;
    private int mPrintHeight;
    private int mPrintWidth;
    private ScaleGestureDetector mScaleDetector;
    private float mScaleFactor;
    private int mSelectionHeight;
    private Rect mSelectionRect;
    private int mSelectionWidth;
    private float mSelectionWidthFactor;
    private float mSelectionWindowAspectRatio;
    private int mSelectionX;
    private int mSelectionY;
    private Paint mShadowPaint;
    private int mTextBottomSpace;
    private String mTextLine1;
    private Rect mTextLine1Bounds;
    private String mTextLine2;
    private Rect mTextLine2Bounds;
    private Paint mTextPaint;
    private Paint mTextPaintSmall;
    private RectF mTranslatedSelectionRect;
    private float mTranslationX;
    private float mTranslationY;
    private Rect mWholeViewRect;
    private Rect mWindowClipRect;

    public CropView(Context context)
    {
        this(context, null, 0);
    }

    public CropView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CropView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mActivePointerId = -1;
        mSelectionWidthFactor = 0.7F;
        mTextPaint = new Paint();
        mTextPaintSmall = new Paint();
        mShadowPaint = new Paint();
        mDashedLinePaint = new Paint();
        mDefaultPaint = new Paint();
        mWholeViewRect = new Rect();
        mBitmapDestinationRect = new RectF();
        mTranslatedSelectionRect = new RectF();
        mWindowClipRect = new Rect();
        mSelectionRect = new Rect();
        mTextLine1Bounds = new Rect();
        mTextLine2Bounds = new Rect();
        mTextLine1 = "";
        mTextLine2 = "";
        mDrawProductAndOrientationInfo = true;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setLayerType(1, null);
        }
        if (DeviceUtils.getScreenHeightDips(getContext()) < 520)
        {
            mDrawProductAndOrientationInfo = false;
        }
        mShadowPaint.setARGB(153, 39, 39, 39);
        mDashedLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        mDashedLinePaint.setColor(context.getResources().getColor(com.walmartlabs.android.photo.R.color.photo_orange));
        mTextPaint.setStyle(android.graphics.Paint.Style.FILL);
        mTextPaint.setAntiAlias(true);
        mTextPaint.setTextSize(context.getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_crop_text_size));
        mTextPaint.setColor(0xccffffff);
        mTextPaintSmall.setStyle(android.graphics.Paint.Style.FILL);
        mTextPaintSmall.setAntiAlias(true);
        mTextPaintSmall.setTextSize(context.getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_crop_text_size_small));
        mTextPaintSmall.setColor(0xccffffff);
        mTextBottomSpace = context.getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_main_padding);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            attributeset = Typeface.create("sans-serif-light", 0);
            mTextPaint.setTypeface(attributeset);
            mTextPaintSmall.setTypeface(attributeset);
        }
        mScaleDetector = new ScaleGestureDetector(context, new ScaleListener());
    }

    private float getInitialCropAspectRatio()
    {
        if (mInitialCrop != null)
        {
            float f = mInitialCrop.getLeft();
            float f1 = mInitialCrop.getTop();
            float f2 = mInitialCrop.getRight();
            float f3 = mInitialCrop.getBottom();
            return ((f2 - f) * (float)mOriginalWidth) / ((f3 - f1) * (float)mOriginalHeight);
        } else
        {
            return 1.0F;
        }
    }

    private float getMaxScale()
    {
        float f1 = 3F;
        float f2 = Math.max(mOriginalHeight, mOriginalWidth);
        float f3 = Math.max(mSelectionHeight, mSelectionWidth);
        float f4 = f3 * 3F;
        float f = f1;
        if (f4 > 0.0F)
        {
            f = f1;
            if (f3 > 0.0F)
            {
                f = f4 / f2;
            }
        }
        return f;
    }

    private void updateOrientation()
    {
        float f = 0.7F;
        if (mSelectionWindowAspectRatio <= 1.0F)
        {
            f = 0.7F * mSelectionWindowAspectRatio;
        }
        mSelectionWidthFactor = f;
        updateOrientationTexts();
        invalidate();
    }

    private void updateOrientationTexts()
    {
        if (isLandscape())
        {
            mTextLine2 = getContext().getResources().getString(com.walmartlabs.android.photo.R.string.photo_landscape);
        } else
        {
            mTextLine2 = getContext().getResources().getString(com.walmartlabs.android.photo.R.string.photo_portrait);
        }
        mTextPaint.getTextBounds(mTextLine1, 0, mTextLine1.length(), mTextLine1Bounds);
        mTextPaintSmall.getTextBounds(mTextLine2, 0, mTextLine2.length(), mTextLine2Bounds);
    }

    public Crop getCurrentCrop()
    {
        float f = mTranslatedSelectionRect.left;
        float f1 = mTranslatedSelectionRect.top;
        float f2 = mTranslatedSelectionRect.right;
        float f3 = mTranslatedSelectionRect.bottom;
        float f4 = mBitmapDestinationRect.left;
        float f5 = mBitmapDestinationRect.top;
        float f7 = mBitmapDestinationRect.right;
        float f6 = mBitmapDestinationRect.bottom;
        f7 -= f4;
        f6 -= f5;
        return new Crop((f - f4) / f7, (f1 - f5) / f6, (f2 - f4) / f7, (f3 - f5) / f6);
    }

    public boolean isLandscape()
    {
        return mSelectionWindowAspectRatio >= 1.0F;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mBitmap = null;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mBitmap != null && !mBitmap.isRecycled())
        {
            mWholeViewRect.set(0, 0, getWidth(), getHeight());
            mSelectionWidth = (int)((float)Math.min(getWidth(), getHeight()) * mSelectionWidthFactor);
            mSelectionX = getWidth() / 2 - mSelectionWidth / 2;
            mSelectionHeight = (int)((float)mSelectionWidth * (1.0F / mSelectionWindowAspectRatio));
            mSelectionY = getHeight() / 2 - mSelectionHeight / 2;
            if (!mPhotoPositioned)
            {
                mTranslationX = (mSelectionX + mSelectionWidth / 2) - mOriginalWidth / 2;
                mTranslationY = (mSelectionY + mSelectionHeight / 2) - mOriginalHeight / 2;
                mPhotoPositioned = true;
            }
            mMinScale = Math.max((float)mSelectionWidth / (float)mOriginalWidth, (float)mSelectionHeight / (float)mOriginalHeight);
            float f2;
            float f5;
            float f8;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            int i;
            int j;
            int k;
            int l;
            int i1;
            if (mScaleFactor == 0.0F)
            {
                if (mInitialCrop != null)
                {
                    float f = mInitialCrop.getRight();
                    float f3 = mOriginalWidth;
                    float f6 = mInitialCrop.getLeft();
                    float f9 = mOriginalWidth;
                    mScaleFactor = (float)mSelectionWidth / (f * f3 - f6 * f9);
                } else
                {
                    mScaleFactor = mMinScale;
                }
            }
            mScaleFactor = Math.max(mScaleFactor, mMinScale);
            if (mInitialCrop != null && !mHasPositionedForInitialCrop)
            {
                mHasPositionedForInitialCrop = true;
                float f1 = (mInitialCrop.getLeft() + mInitialCrop.getRight()) / 2.0F;
                float f4 = (mInitialCrop.getTop() + mInitialCrop.getBottom()) / 2.0F;
                float f7 = mOriginalWidth;
                float f10 = mOriginalHeight;
                mTranslationX = mTranslationX + mScaleFactor * ((0.5F - f1) * f7);
                mTranslationY = mTranslationY + mScaleFactor * ((0.5F - f4) * f10);
            }
            canvas.save();
            canvas.translate(mTranslationX, mTranslationY);
            f19 = (float)mOriginalWidth * mScaleFactor;
            f17 = (float)mOriginalHeight * mScaleFactor;
            f8 = (float)mSelectionX - mTranslationX;
            f16 = ((float)mSelectionX - mTranslationX) + (float)mSelectionWidth;
            f12 = (float)mSelectionY - mTranslationY;
            f13 = ((float)mSelectionY - mTranslationY) + (float)mSelectionHeight;
            mTranslatedSelectionRect.set(f8, f12, f16, f13);
            f11 = 0.0F - (f19 - (float)mOriginalWidth) / 2.0F;
            f14 = 0.0F - (f17 - (float)mOriginalHeight) / 2.0F;
            f2 = f11 + f19;
            f15 = f14 + f17;
            f20 = (f19 - (float)mOriginalWidth) / 2.0F;
            f18 = (f17 - (float)mOriginalHeight) / 2.0F;
            f5 = f11;
            if (f11 > f8)
            {
                f5 = f8;
                f2 = f5 + f19;
                mTranslationX = (float)mSelectionX + f20;
            }
            f8 = f2;
            f11 = f5;
            if (f2 < f16)
            {
                f8 = f16;
                f11 = f8 - f19;
                mTranslationX = ((float)(mSelectionX + mSelectionWidth) + f20) - f19;
            }
            f2 = f15;
            f5 = f14;
            if (f14 > f12)
            {
                f5 = f12;
                f2 = f5 + f17;
                mTranslationY = (float)mSelectionY + f18;
            }
            f12 = f2;
            if (f2 < f13)
            {
                f12 = f13;
                f5 = f12 - f17;
                mTranslationY = ((float)(mSelectionY + mSelectionHeight) + f18) - f17;
            }
            mBitmapDestinationRect.set(f11, f5, f8, f12);
            canvas.drawBitmap(mBitmap, null, mBitmapDestinationRect, mDefaultPaint);
            canvas.restore();
            canvas.save();
            mWindowClipRect.set(mSelectionX, mSelectionY, mSelectionX + mSelectionWidth, mSelectionY + mSelectionHeight);
            canvas.clipRect(mWindowClipRect, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawRect(mWholeViewRect, mShadowPaint);
            canvas.restore();
            mSelectionRect.set(mSelectionX, mSelectionY, mSelectionX + mSelectionWidth, mSelectionY + mSelectionHeight);
            mDashedLinePaint.setStrokeWidth(2.0F);
            canvas.drawRect(mSelectionRect, mDashedLinePaint);
            i = mSelectionY;
            j = mSelectionHeight;
            k = mTextLine1Bounds.height();
            l = mTextLine2Bounds.height();
            i1 = mTextBottomSpace;
            if (mDrawProductAndOrientationInfo && i + j + k + l + i1 * 3 < getHeight())
            {
                canvas.drawText(mTextLine1, getWidth() / 2 - mTextLine1Bounds.width() / 2, mSelectionY + mSelectionHeight + mTextLine1Bounds.height() + mTextBottomSpace * 2, mTextPaint);
                canvas.drawText(mTextLine2, getWidth() / 2 - mTextLine2Bounds.width() / 2, mSelectionY + mSelectionHeight + mTextLine1Bounds.height() + mTextLine2Bounds.height() + mTextBottomSpace * 3, mTextPaintSmall);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        i = 0;
        mScaleDetector.onTouchEvent(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 64
    //                   0 66
    //                   1 181
    //                   2 93
    //                   3 188
    //                   4 64
    //                   5 64
    //                   6 195;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return true;
_L2:
        mLastTouchX = motionevent.getX();
        mLastTouchY = motionevent.getY();
        mActivePointerId = motionevent.getPointerId(0);
        return true;
_L4:
        i = motionevent.findPointerIndex(mActivePointerId);
        float f = motionevent.getX(i);
        float f1 = motionevent.getY(i);
        if (!mScaleDetector.isInProgress())
        {
            float f2 = mLastTouchX;
            float f3 = mLastTouchY;
            mTranslationX = mTranslationX + (f - f2);
            mTranslationY = mTranslationY + (f1 - f3);
            invalidate();
        }
        mLastTouchX = f;
        mLastTouchY = f1;
        return true;
_L3:
        mActivePointerId = -1;
        return true;
_L5:
        mActivePointerId = -1;
        return true;
_L6:
        int j = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(j) == mActivePointerId)
        {
            if (j == 0)
            {
                i = 1;
            }
            mLastTouchX = motionevent.getX(i);
            mLastTouchY = motionevent.getY(i);
            mActivePointerId = motionevent.getPointerId(i);
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setBitmapAndPrintSize(Bitmap bitmap, int i, int j, String s, com.walmartlabs.android.photo.model.order.Crop crop)
    {
        mBitmap = bitmap;
        mOriginalWidth = mBitmap.getWidth();
        mOriginalHeight = mBitmap.getHeight();
        mPrintWidth = i;
        mPrintHeight = j;
        mTextLine1 = s;
        mInitialCrop = crop;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Original w/h: ").append(mOriginalWidth).append(",").append(mOriginalHeight).toString());
        if (mInitialCrop == null) goto _L2; else goto _L1
_L1:
        mSelectionWindowAspectRatio = getInitialCropAspectRatio();
_L4:
        updateOrientation();
        invalidate();
        return;
_L2:
        mSelectionWindowAspectRatio = (float)mPrintWidth / (float)mPrintHeight;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Original aspect ratio: ").append(mSelectionWindowAspectRatio).toString());
        if (mOriginalWidth < mOriginalHeight)
        {
            mSelectionWindowAspectRatio = 1.0F / mSelectionWindowAspectRatio;
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Updated aspect ratio: ").append(mSelectionWindowAspectRatio).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLandscape()
    {
        if (mSelectionWindowAspectRatio < 1.0F)
        {
            mSelectionWindowAspectRatio = 1.0F / mSelectionWindowAspectRatio;
            updateOrientation();
        }
    }

    public void setPortrait()
    {
        if (mSelectionWindowAspectRatio > 1.0F)
        {
            mSelectionWindowAspectRatio = 1.0F / mSelectionWindowAspectRatio;
            updateOrientation();
        }
    }




/*
    static float access$102(CropView cropview, float f)
    {
        cropview.mScaleFactor = f;
        return f;
    }

*/


}
