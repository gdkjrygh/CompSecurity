// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Scroller;

public class ZoomableImageView extends ImageView
{
    private class Flinger
        implements Runnable
    {

        private boolean mFlingX;
        private boolean mFlingY;
        private int mLastX;
        private int mLastY;
        private final Scroller mScroller;
        final ZoomableImageView this$0;

        private void endFling()
        {
            mScroller.forceFinished(true);
            mIsFlinging = false;
        }

        public void run()
        {
            Scroller scroller = mScroller;
            boolean flag = scroller.computeScrollOffset();
            float f = 0.0F;
            float f1 = 0.0F;
            if (mFlingX)
            {
                int i = scroller.getCurrX();
                f = i - mLastX;
                mLastX = i;
            }
            if (mFlingY)
            {
                int j = scroller.getCurrY();
                f1 = j - mLastY;
                mLastY = j;
            }
            mMatrix.postTranslate(f, f1);
            setImageMatrix(mMatrix);
            if (flag && mIsFlinging)
            {
                ViewCompat.postOnAnimation(ZoomableImageView.this, this);
                return;
            } else
            {
                endFling();
                return;
            }
        }

        public void startFling(int i, int j)
        {
            removeCallbacks(this);
            mIsFlinging = true;
            mFlingX = true;
            mFlingY = true;
            mLastX = (int)getValue(mMatrix, 2);
            mLastY = (int)getValue(mMatrix, 5);
            int k = (int)((float)getWidth() - mActualScale * (float)mDrawable.getIntrinsicWidth());
            int l = (int)((float)getHeight() - mActualScale * (float)mDrawable.getIntrinsicHeight());
            if (k > 0)
            {
                mFlingX = false;
                i = 0;
            }
            if (l > 0)
            {
                mFlingY = false;
                j = 0;
            }
            mScroller.fling(mLastX, mLastY, i, j, k, 0, l, 0);
            ViewCompat.postOnAnimation(ZoomableImageView.this, this);
        }

        public void stopFling()
        {
            removeCallbacks(this);
            endFling();
        }

        public Flinger(Context context)
        {
            this$0 = ZoomableImageView.this;
            super();
            mScroller = new Scroller(context, new DecelerateInterpolator());
        }
    }

    private class GestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final ZoomableImageView this$0;

        public boolean onDoubleTap(MotionEvent motionevent)
        {
            if (mIsFlinging)
            {
                return true;
            }
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            if (mActualScale < 0.75F * mMedScale)
            {
                scale(mMedScale, f, f1, 250F);
                return true;
            }
            if (mActualScale < mMaxScale - 0.01F)
            {
                scale(mMaxScale, f, f1, 250F);
                return true;
            } else
            {
                scale(mMinScale, f, f1, 250F);
                return true;
            }
        }

        public boolean onDown(MotionEvent motionevent)
        {
            if (mIsFlinging)
            {
                mFlinger.stopFling();
            }
            return false;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (!mIsFlinging)
            {
                if (mScaleGestureDetector.isInProgress())
                {
                    return false;
                }
                if (Math.abs(f) > 200F || Math.abs(f1) > 200F)
                {
                    f = Math.max(-4000F, Math.min(0.5F * f, 4000F));
                    f1 = Math.max(-4000F, Math.min(0.5F * f1, 4000F));
                    mFlinger.startFling((int)f, (int)f1);
                    return true;
                }
            }
            return true;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (mIsFlinging)
            {
                return true;
            }
            if (mScaleGestureDetector.isInProgress())
            {
                return false;
            }
            float f4 = 0.0F;
            float f3 = 0.0F;
            float f6 = getValue(mMatrix, 2);
            float f5 = getValue(mMatrix, 5);
            float f2 = f4;
            if (f6 - f <= 0.0F)
            {
                f2 = f4;
                if ((f6 + mActualScale * (float)mDrawable.getIntrinsicWidth()) - f > (float)getWidth())
                {
                    f2 = -f;
                }
            }
            f = f3;
            if (f5 - f1 <= 0.0F)
            {
                f = f3;
                if ((f5 + mActualScale * (float)mDrawable.getIntrinsicHeight()) - f1 > (float)getHeight())
                {
                    f = -f1;
                }
            }
            mMatrix.postTranslate(f2, f);
            setImageMatrix(mMatrix);
            invalidate();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionevent)
        {
            if (!mIsFlinging)
            {
                if (mScaleGestureDetector.isInProgress())
                {
                    return false;
                }
                if (mOnTapListener != null)
                {
                    float f = motionevent.getX();
                    float f1 = motionevent.getY();
                    motionevent = new float[2];
                    motionevent[0] = f;
                    motionevent[1] = f1;
                    Matrix matrix = new Matrix();
                    mMatrix.invert(matrix);
                    matrix.mapPoints(motionevent);
                    mOnTapListener.onTap(motionevent[0], motionevent[1]);
                    return true;
                }
            }
            return true;
        }

        private GestureListener()
        {
            this$0 = ZoomableImageView.this;
            super();
        }

    }

    public static interface OnTapListener
    {

        public abstract void onTap(float f, float f1);
    }

    private class ScaleGestureListener
        implements android.view.ScaleGestureDetector.OnScaleGestureListener
    {

        final ZoomableImageView this$0;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            float f = scalegesturedetector.getScaleFactor() * mActualScale;
            if (Math.abs(f - mActualScale) < 0.003F)
            {
                return false;
            } else
            {
                scale(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
                invalidate();
                return true;
            }
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
        {
        }

        private ScaleGestureListener()
        {
            this$0 = ZoomableImageView.this;
            super();
        }

    }


    private static final boolean DEBUG = false;
    private static final int MATCH_DEFAULT = 0;
    private static final int MATCH_HEIGHT = 2;
    private static final int MATCH_WIDTH = 1;
    private static final int MAX_VELOCITY = 4000;
    private static final float MINIMUM_SCALING_THRESHOLD = 0.003F;
    private static final String TAG = com/walmartlabs/ui/ZoomableImageView.getSimpleName();
    private static final int VELOCITY_THRESHOLD = 200;
    private static final int ZOOM_DURATION = 250;
    private float mActualScale;
    private Drawable mDrawable;
    private Flinger mFlinger;
    private GestureDetector mGestureDetector;
    private Handler mHandler;
    private boolean mIsFlinging;
    private int mMatchMode;
    private Matrix mMatrix;
    protected final float mMatrixValues[];
    private float mMaxScale;
    private float mMedScale;
    private float mMinScale;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private OnTapListener mOnTapListener;
    private int mPreviousWidth;
    private ScaleGestureDetector mScaleGestureDetector;

    public ZoomableImageView(Context context)
    {
        super(context);
        mActualScale = 1.0F;
        mMatrixValues = new float[9];
        init(context, null);
    }

    public ZoomableImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mActualScale = 1.0F;
        mMatrixValues = new float[9];
        init(context, attributeset);
    }

    public ZoomableImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mActualScale = 1.0F;
        mMatrixValues = new float[9];
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        mFlinger = new Flinger(context);
        mHandler = new Handler();
        mActualScale = 0.0F;
        mPreviousWidth = 0;
        mScaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureListener());
        mGestureDetector = new GestureDetector(context, new GestureListener());
        if (attributeset != null)
        {
            context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.ZoomableImageView);
            mMatchMode = context.getInt(com.walmart.lib.R.styleable.ZoomableImageView_match, 0);
            context.recycle();
        }
        setLayoutListener();
        mMatrix = new Matrix();
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setImageMatrix(mMatrix);
    }

    private void scale(float f, float f1, float f2)
    {
        f = Math.max(mMinScale, Math.min(f, mMaxScale)) / mActualScale;
        mMatrix.postScale(f, f, f1, f2);
        RectF rectf = new RectF(0.0F, 0.0F, mDrawable.getIntrinsicWidth(), mDrawable.getIntrinsicHeight());
        mMatrix.mapRect(rectf);
        float f3 = rectf.height();
        f2 = rectf.width();
        f1 = 0.0F;
        f = 0.0F;
        int i = getHeight();
        if (f3 < (float)i)
        {
            f = ((float)i - f3) / 2.0F - rectf.top;
        } else
        if (rectf.top > 0.0F)
        {
            f = -rectf.top;
        } else
        if (rectf.bottom < (float)i)
        {
            f = (float)getHeight() - rectf.bottom;
        }
        i = getWidth();
        if (f2 < (float)i)
        {
            f1 = ((float)i - f2) / 2.0F - rectf.left;
        } else
        if (rectf.left > 0.0F)
        {
            f1 = -rectf.left;
        } else
        if (rectf.right < (float)i)
        {
            f1 = (float)i - rectf.right;
        }
        if (f1 != 0.0F || f != 0.0F)
        {
            mMatrix.postTranslate(f1, f);
        }
        setImageMatrix(mMatrix);
        mActualScale = getValue(mMatrix, 0);
    }

    private void scale(final float delta, final float cx, final float cy, final float duration)
    {
        final long start = System.currentTimeMillis();
        delta = (delta - mActualScale) / duration;
        final float startScale = mActualScale;
        mHandler.post(new Runnable() {

            final ZoomableImageView this$0;
            final float val$cx;
            final float val$cy;
            final float val$delta;
            final float val$duration;
            final long val$start;
            final float val$startScale;

            public void run()
            {
                long l = System.currentTimeMillis();
                float f = Math.min(duration, l - start);
                float f1 = startScale;
                float f2 = delta;
                scale(f1 + f2 * f, cx, cy);
                if (f < duration)
                {
                    mHandler.post(this);
                }
            }

            
            {
                this$0 = ZoomableImageView.this;
                duration = f;
                start = l;
                startScale = f1;
                delta = f2;
                cx = f3;
                cy = f4;
                super();
            }
        });
    }

    private void updateZoom()
    {
        if (mDrawable == null) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        f1 = 0.0F;
        f2 = 0.0F;
        mMatchMode;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 261
    //                   1 299
    //                   2 320;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_320;
_L7:
        if (mActualScale > 0.0F)
        {
            f1 = getValue(mMatrix, 2);
            f2 = getValue(mMatrix, 5);
        }
        if (mActualScale < mMinScale)
        {
            mActualScale = mMinScale;
        }
        mMedScale = mMinScale * 2.0F;
        mMaxScale = mMedScale * 2.0F;
        float f4 = mActualScale * (float)mDrawable.getIntrinsicWidth();
        float f3 = mActualScale * (float)mDrawable.getIntrinsicHeight();
        float f;
        if (f4 < (float)getWidth() || f1 >= 0.0F)
        {
            if (mMatchMode == 2 && f4 >= (float)getWidth())
            {
                f = 0.0F;
            } else
            {
                f = ((float)getWidth() - f4) / 2.0F;
            }
        } else
        {
            f = f1;
            if (f1 + f4 < (float)getWidth())
            {
                f = (float)getWidth() - f4;
            }
        }
        if (f3 < (float)getHeight() || f2 >= 0.0F)
        {
            if (mMatchMode == 1 && f3 >= (float)getHeight())
            {
                f1 = 0.0F;
            } else
            {
                f1 = ((float)getHeight() - f3) / 2.0F;
            }
        } else
        {
            f1 = f2;
            if (f2 + f3 < (float)getHeight())
            {
                f1 = (float)getHeight() - f3;
            }
        }
        mMatrix.reset();
        mMatrix.postScale(mActualScale, mActualScale);
        mMatrix.postTranslate(f, f1);
        setImageMatrix(mMatrix);
        invalidate();
_L2:
        return;
_L4:
        mMinScale = Math.min((float)getWidth() / (float)mDrawable.getIntrinsicWidth(), (float)getHeight() / (float)mDrawable.getIntrinsicHeight());
          goto _L7
_L5:
        mMinScale = (float)getWidth() / (float)mDrawable.getIntrinsicWidth();
          goto _L7
        mMinScale = (float)getHeight() / (float)mDrawable.getIntrinsicHeight();
          goto _L7
    }

    protected float getValue(Matrix matrix, int i)
    {
        matrix.getValues(mMatrixValues);
        return mMatrixValues[i];
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mScaleGestureDetector.onTouchEvent(motionevent);
        if (!mScaleGestureDetector.isInProgress())
        {
            mGestureDetector.onTouchEvent(motionevent);
        }
        return true;
    }

    public void removeLayoutListener()
    {
        if (mOnGlobalLayoutListener != null)
        {
            getViewTreeObserver().removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
            mOnGlobalLayoutListener = null;
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        mDrawable = drawable;
        super.setImageDrawable(mDrawable);
    }

    public void setLayoutListener()
    {
        if (mOnGlobalLayoutListener == null)
        {
            mOnGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final ZoomableImageView this$0;

                public void onGlobalLayout()
                {
                    if (getWidth() != mPreviousWidth)
                    {
                        updateZoom();
                        mPreviousWidth = getWidth();
                        getViewTreeObserver().removeGlobalOnLayoutListener(mOnGlobalLayoutListener);
                        mOnGlobalLayoutListener = null;
                    }
                }

            
            {
                this$0 = ZoomableImageView.this;
                super();
            }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(mOnGlobalLayoutListener);
        }
    }

    public void setOnTapListener(OnTapListener ontaplistener)
    {
        mOnTapListener = ontaplistener;
    }












/*
    static int access$202(ZoomableImageView zoomableimageview, int i)
    {
        zoomableimageview.mPreviousWidth = i;
        return i;
    }

*/




/*
    static android.view.ViewTreeObserver.OnGlobalLayoutListener access$402(ZoomableImageView zoomableimageview, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        zoomableimageview.mOnGlobalLayoutListener = ongloballayoutlistener;
        return ongloballayoutlistener;
    }

*/





/*
    static boolean access$702(ZoomableImageView zoomableimageview, boolean flag)
    {
        zoomableimageview.mIsFlinging = flag;
        return flag;
    }

*/


}
