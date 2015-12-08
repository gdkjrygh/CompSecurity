// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.pager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.walmartlabs.ui.pager:
//            PageProvider

public class PageFlipper extends View
    implements android.view.GestureDetector.OnGestureListener, PageProvider.PageProviderObserver
{
    public static interface OnClickListener
    {

        public abstract void onSpreadClicked(int i);
    }

    public static interface OnStateChangedListener
    {

        public static final int FLIPPING = 1;
        public static final int FLIP_ENDED = 2;
        public static final int FLIP_STARTED = 0;

        public abstract void onPageMoved(float f, int i);
    }

    private class PageMover
        implements Runnable
    {

        float degreesToMove;
        private int direction;
        private long duration;
        float endDegrees;
        private boolean isMoving;
        float startDegrees;
        private long startTime;
        final PageFlipper this$0;

        private void start(int i, long l)
        {
            direction = i;
            startDegrees = mAngle;
            if (i != -1) goto _L2; else goto _L1
_L1:
            endDegrees = -180F;
_L4:
            degreesToMove = endDegrees - startDegrees;
            duration = l;
            startTime = AnimationUtils.currentAnimationTimeMillis();
            post(this);
            isMoving = true;
            return;
_L2:
            if (i == 1)
            {
                endDegrees = 0.0F;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void run()
        {
            long l = AnimationUtils.currentAnimationTimeMillis() - startTime;
            if (l > duration)
            {
                if (direction == -1)
                {
                    changeAngle(-180F, false, true);
                } else
                {
                    changeAngle(180F, false, true);
                }
                isMoving = false;
            } else
            {
                float f = (float)l / (float)duration;
                float f1 = startDegrees;
                float f2 = degreesToMove;
                float f3 = mAngle;
                changeAngle((f1 + f2 * f) - f3, false, false);
                post(this);
            }
            invalidate();
        }

        public void stop()
        {
            if (isMoving)
            {
                isMoving = false;
                removeCallbacks(this);
            }
        }



        private PageMover()
        {
            this$0 = PageFlipper.this;
            super();
        }

    }


    private static final boolean DEBUG_LOG = false;
    private static final float MAX_ANGLE_DIFF = 15F;
    private static final float MAX_FLING_VELOCITY = 4000F;
    private static final int STATE_FLIPPING_LEFT = -1;
    private static final int STATE_FLIPPING_RIGHT = 1;
    private static final int STATE_IDLE = 0;
    public static final String TAG = com/walmartlabs/ui/pager/PageFlipper.getSimpleName();
    private float mAngle;
    private Paint mBitmapPaint;
    private Camera mCamera;
    private int mCurrentLeftPageIndex;
    private int mFlipState;
    private GestureDetector mGestureDetector;
    private int mHeight;
    private int mLastFinishedFlipDirection;
    private Bitmap mLeftFlipPage;
    private Bitmap mLeftPage;
    private int mLeftPageOffsetX;
    private boolean mLightingEnabled;
    private Paint mLinePaint;
    private Matrix mMatrix;
    private int mOffsetY;
    private OnClickListener mOnClickListener;
    private OnStateChangedListener mOnStateChangedListener;
    private float mPadding;
    private int mPageCount;
    private int mPageHeight;
    private PageMover mPageMover;
    private PageProvider mPageProvider;
    private int mPageWidth;
    private Bitmap mRightFlipPage;
    private Bitmap mRightPage;
    private int mRightPageOffsetX;
    private float mScaleFactor;
    private VelocityTracker mVelocityTracker;
    private int mWidth;

    public PageFlipper(Context context)
    {
        super(context);
        mMatrix = new Matrix();
        mBitmapPaint = new Paint();
        mPadding = 15F;
        mVelocityTracker = VelocityTracker.obtain();
        mPageMover = new PageMover();
        init(context);
    }

    public PageFlipper(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMatrix = new Matrix();
        mBitmapPaint = new Paint();
        mPadding = 15F;
        mVelocityTracker = VelocityTracker.obtain();
        mPageMover = new PageMover();
        init(context);
    }

    public PageFlipper(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMatrix = new Matrix();
        mBitmapPaint = new Paint();
        mPadding = 15F;
        mVelocityTracker = VelocityTracker.obtain();
        mPageMover = new PageMover();
        init(context);
    }

    private LightingColorFilter calculateLight(float f)
    {
        float f1 = Math.abs(f);
        f = f1;
        if (f1 > 90F)
        {
            f = 180F - f1;
        }
        int i = Math.round(255F * (0.5F + 0.5F * (1.0F - f / 90F)));
        return new LightingColorFilter(Color.rgb(i, i, i), 0);
    }

    private float calculateScaleFactor()
    {
        float f = mPadding;
        float f1 = mPageWidth * 2;
        float f2 = (float)mHeight - f * 2.0F;
        f1 = ((float)mWidth - f * 2.0F) / f1;
        f = f1;
        if ((float)mPageHeight * f1 > f2)
        {
            f = f2 / (float)mPageHeight;
        }
        return f;
    }

    private int getSpreadIndex(int i, boolean flag)
    {
        if (flag)
        {
            return (i + 1) / 2;
        } else
        {
            return i / 2;
        }
    }

    private void init(Context context)
    {
        if (!isInEditMode())
        {
            mGestureDetector = new GestureDetector(getContext(), this);
        }
        mCamera = new Camera();
        mLinePaint = new Paint();
        mLinePaint.setColor(-1);
    }

    private void initDrawOffset()
    {
        mRightPageOffsetX = (mWidth - mPageWidth) / 2;
        mOffsetY = (mHeight - mPageHeight) / 2;
        mScaleFactor = calculateScaleFactor();
    }

    private void requestCreateAndDestroy(int i)
    {
        int j = mCurrentLeftPageIndex;
        int i1 = mPageProvider.getPageCount();
        int ai1[] = new int[2];
        int ai[] = new int[2];
        if (i == -1)
        {
            ai1[0] = j - 3;
            ai1[1] = j - 4;
            ai[0] = j + 3;
            ai[1] = j + 2;
        } else
        {
            ai1[0] = j + 4;
            ai1[1] = j + 5;
            ai[0] = j - 2;
            ai[1] = j - 1;
        }
        for (i = 0; i < ai1.length; i++)
        {
            j = ai1[i];
            if (j >= 0 && j < i1)
            {
                mPageProvider.destroyPage(j);
            }
        }

        j = 0;
        for (i = 0; i < ai.length;)
        {
            int j1 = ai[i];
            int k = j;
            if (j1 >= 0)
            {
                k = j;
                if (j1 < i1)
                {
                    k = j + 1;
                }
            }
            i++;
            j = k;
        }

        ai1 = new int[j];
        j = 0;
        for (i = 0; i < ai.length;)
        {
            int k1 = ai[i];
            int l = j;
            if (k1 >= 0)
            {
                l = j;
                if (k1 < i1)
                {
                    ai1[j] = k1;
                    l = j + 1;
                }
            }
            i++;
            j = l;
        }

        mPageProvider.createPages(ai1, mCurrentLeftPageIndex);
    }

    public void changeAngle(float f, boolean flag, boolean flag1)
    {
        float f1;
        float f3;
        float f5;
        int k;
        f5 = mAngle;
        float f4 = f5;
        k = -1;
        if (!flag1)
        {
            f3 = f4;
            f1 = f;
            if (Math.abs(f) > 15F)
            {
                if (f >= 0.0F)
                {
                    f = 1.0F;
                } else
                {
                    f = -1F;
                }
                f1 = 15F * f;
                f3 = f4;
            }
        } else
        if (f < 0.0F)
        {
            f1 = -180F - mAngle;
            f3 = -180F;
        } else
        {
            f1 = -mAngle;
            f3 = 0.0F;
        }
        if (mPageCount > 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        f3 += f1;
        f = f3;
        if (f3 > 0.0F)
        {
            f = 0.0F;
        }
        f3 = f;
        if (f < -180F)
        {
            f3 = -180F;
        }
        int i;
        if (mFlipState == 0)
        {
            if (mCurrentLeftPageIndex > 0 && mLastFinishedFlipDirection != 1)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (mCurrentLeftPageIndex + 2 < mPageCount && mLastFinishedFlipDirection != -1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (f1 < 0.0F && i != 0)
            {
                mRightFlipPage = mRightPage;
                i = mCurrentLeftPageIndex + 2;
                j = i + 1;
                mLeftFlipPage = mPageProvider.getPage(i);
                if (j < mPageCount)
                {
                    mRightPage = mPageProvider.getPage(j);
                } else
                {
                    mRightPage = null;
                }
                mAngle = 0.0F + f1;
                mFlipState = -1;
                i = 0;
            } else
            {
                i = k;
                if (f1 > 0.0F)
                {
                    i = k;
                    if (j != 0)
                    {
                        mLeftFlipPage = mLeftPage;
                        i = mCurrentLeftPageIndex - 1;
                        j = i - 1;
                        mRightFlipPage = mPageProvider.getPage(i);
                        if (j >= 0)
                        {
                            mLeftPage = mPageProvider.getPage(j);
                        } else
                        {
                            mLeftPage = null;
                        }
                        mAngle = -180F + f1;
                        mFlipState = 1;
                        i = 0;
                        mCurrentLeftPageIndex = mCurrentLeftPageIndex - 2;
                    }
                }
            }
        } else
        {
            byte byte0 = 0;
            boolean flag3 = false;
            boolean flag2 = false;
            i = 0;
            boolean flag5 = false;
            boolean flag6 = false;
            j = 0;
            if (f5 > -180F && f3 == -180F)
            {
                mCurrentLeftPageIndex = mCurrentLeftPageIndex + 2;
                mLeftPage = mLeftFlipPage;
                mLeftFlipPage = null;
                mRightFlipPage = null;
                byte0 = j;
                flag2 = i;
                if (mFlipState == -1)
                {
                    flag2 = true;
                    byte0 = -1;
                }
                flag3 = true;
                i = ((flag3) ? 1 : 0);
                j = byte0;
                k = ((flag2) ? 1 : 0);
                if (flag)
                {
                    mLastFinishedFlipDirection = -1;
                    k = ((flag2) ? 1 : 0);
                    j = byte0;
                    i = ((flag3) ? 1 : 0);
                }
            } else
            {
                i = byte0;
                j = ((flag5) ? 1 : 0);
                k = ((flag3) ? 1 : 0);
                if (f5 < 0.0F)
                {
                    i = byte0;
                    j = ((flag5) ? 1 : 0);
                    k = ((flag3) ? 1 : 0);
                    if (f3 == 0.0F)
                    {
                        mRightPage = mRightFlipPage;
                        mRightFlipPage = null;
                        mLeftFlipPage = null;
                        byte0 = flag6;
                        if (mFlipState == 1)
                        {
                            flag2 = true;
                            byte0 = 1;
                        }
                        boolean flag4 = true;
                        i = ((flag4) ? 1 : 0);
                        j = byte0;
                        k = ((flag2) ? 1 : 0);
                        if (flag)
                        {
                            mLastFinishedFlipDirection = 1;
                            i = ((flag4) ? 1 : 0);
                            j = byte0;
                            k = ((flag2) ? 1 : 0);
                        }
                    }
                }
            }
            mAngle = f3;
            if (i != 0)
            {
                mFlipState = 0;
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            i = byte0;
            if (k != 0)
            {
                requestCreateAndDestroy(j);
                i = byte0;
            }
        }
        f = 0.0F;
        k = mPageWidth / 2;
        if (mLeftPage == null || mRightPage == null)
        {
            break; /* Loop/switch isn't completed */
        }
        f = 1.0F;
        j = k;
_L4:
        j = (int)((float)j * f);
        mRightPageOffsetX = (mWidth - mPageWidth) / 2 + j;
        mLeftPageOffsetX = mRightPageOffsetX - mPageWidth;
        mOffsetY = (mHeight - mPageHeight) / 2;
        if (mOnStateChangedListener != null && i != -1)
        {
            f = mAngle / -180F;
            mOnStateChangedListener.onPageMoved(f, i);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (mLeftPage == null)
        {
            float f2 = mAngle / -180F;
            f = f2;
            j = k;
            if (mRightPage == null)
            {
                j = mPageWidth;
                f = f2;
            }
        } else
        {
            j = k;
            if (mRightPage == null)
            {
                f = mAngle / -180F + 1.0F;
                j = k;
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int getCurrentSpreadIndex()
    {
        return getSpreadIndex(mCurrentLeftPageIndex, mPageProvider.isFirstPageCover());
    }

    public int[] getCurrentSpreadPages()
    {
        int i = 0;
        int ai[] = new int[2];
        if (mLeftPage != null)
        {
            ai[0] = mCurrentLeftPageIndex;
            i = 0 + 1;
        }
        int k = i;
        if (mRightPage != null)
        {
            ai[i] = mCurrentLeftPageIndex + 1;
            k = i + 1;
        }
        int ai1[] = new int[k];
        for (int j = 0; j < ai1.length; j++)
        {
            ai1[j] = ai[j];
        }

        return ai1;
    }

    public int getPadding()
    {
        return (int)mPadding;
    }

    public int getPaddingBottom()
    {
        return (int)mPadding;
    }

    public int getPaddingLeft()
    {
        return (int)mPadding;
    }

    public int getPaddingRight()
    {
        return (int)mPadding;
    }

    public int getPaddingTop()
    {
        return (int)mPadding;
    }

    int getSpreadCount()
    {
        if (mPageCount <= 1)
        {
            return mPageCount;
        }
        if (mPageProvider.isFirstPageCover())
        {
            return (mPageCount + 2) / 2;
        } else
        {
            return (mPageCount + 1) / 2;
        }
    }

    public boolean isHorizontalScrollBarEnabled()
    {
        return true;
    }

    public boolean isVerticalScrollBarEnabled()
    {
        return true;
    }

    public void onDatasetChanged()
    {
        mPageCount = mPageProvider.getPageCount();
        int l = mCurrentLeftPageIndex;
        int i = -1;
        int j = -1;
        int k;
        if (mFlipState == 0)
        {
            k = l + 1;
        } else
        {
            j = l + 1;
            i = l + 2;
            k = l + 3;
        }
        if (l >= 0 && l < mPageCount)
        {
            mLeftPage = mPageProvider.getPage(l);
        }
        if (k >= 0 && k < mPageCount)
        {
            mRightPage = mPageProvider.getPage(k);
        }
        if (i >= 0 && i < mPageCount)
        {
            mLeftFlipPage = mPageProvider.getPage(i);
        }
        if (j >= 0 && j < mPageCount)
        {
            mRightFlipPage = mPageProvider.getPage(j);
        }
        invalidate();
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (mPageMover.isMoving)
        {
            mPageMover.stop();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        LightingColorFilter lightingcolorfilter;
        canvas.drawColor(0xffe6edf5);
        canvas.save();
        canvas.scale(mScaleFactor, mScaleFactor, mWidth / 2, mHeight / 2);
        lightingcolorfilter = null;
        if (mLightingEnabled)
        {
            lightingcolorfilter = calculateLight(mAngle);
        }
        if (mRightPage != null)
        {
            mBitmapPaint.setColorFilter(null);
            canvas.save();
            canvas.translate(mRightPageOffsetX, mOffsetY);
            canvas.drawBitmap(mRightPage, 0.0F, 0.0F, mBitmapPaint);
            canvas.restore();
        }
        if (mLeftPage != null)
        {
            mBitmapPaint.setColorFilter(null);
            canvas.save();
            canvas.translate(mLeftPageOffsetX, mOffsetY);
            canvas.drawBitmap(mLeftPage, 0.0F, 0.0F, mBitmapPaint);
            canvas.restore();
        }
        if (mAngle <= -90F || mAngle >= 0.0F) goto _L2; else goto _L1
_L1:
        mBitmapPaint.setColorFilter(lightingcolorfilter);
        canvas.save();
        canvas.translate(mRightPageOffsetX, mOffsetY);
        mCamera.save();
        mCamera.rotateY(mAngle);
        mCamera.getMatrix(mMatrix);
        mCamera.restore();
        mMatrix.preTranslate(0.0F, -mPageHeight / 2);
        mMatrix.postTranslate(0.0F, mPageHeight / 2);
        canvas.drawBitmap(mRightFlipPage, mMatrix, mBitmapPaint);
        canvas.restore();
_L4:
        canvas.restore();
        return;
_L2:
        if (mAngle <= -90F && mAngle > -180F)
        {
            mBitmapPaint.setColorFilter(lightingcolorfilter);
            canvas.save();
            canvas.translate(mRightPageOffsetX - mPageWidth, mOffsetY);
            mCamera.save();
            mCamera.rotateY(mAngle + 180F);
            mCamera.getMatrix(mMatrix);
            mCamera.restore();
            mMatrix.preTranslate(-mPageWidth, -mPageHeight / 2);
            mMatrix.postTranslate(mPageWidth, mPageHeight / 2);
            canvas.drawBitmap(mLeftFlipPage, mMatrix, mBitmapPaint);
            canvas.restore();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        mWidth = android.view.View.MeasureSpec.getSize(i);
        mHeight = android.view.View.MeasureSpec.getSize(j);
        initDrawOffset();
        setMeasuredDimension(mWidth, mHeight);
        changeAngle(0.0F, true, false);
        invalidate();
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        changeAngle(-f / 2.0F, true, false);
        invalidate();
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (mOnClickListener != null)
        {
            mOnClickListener.onSpreadClicked(mCurrentLeftPageIndex);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        mVelocityTracker.addMovement(motionevent);
        if (motionevent.getAction() == 1)
        {
            mLastFinishedFlipDirection = 0;
            if (mFlipState != 0)
            {
                mVelocityTracker.computeCurrentVelocity(1000, 4000F);
                float f = mVelocityTracker.getXVelocity();
                float f1 = (1.0F - Math.abs(f) / 4000F) * 500F + 50F;
                if (f < 0.0F)
                {
                    mPageMover.start(-1, (long)f1);
                } else
                {
                    mPageMover.start(1, (long)f1);
                }
            }
        }
        return mGestureDetector.onTouchEvent(motionevent);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
    }

    public void setLightingEnabled(boolean flag)
    {
        mLightingEnabled = flag;
    }

    public void setOnClickListener(OnClickListener onclicklistener)
    {
        mOnClickListener = onclicklistener;
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        mOnStateChangedListener = onstatechangedlistener;
    }

    public void setPadding(int i)
    {
        mPadding = i;
    }

    public void setPageProvider(PageProvider pageprovider)
    {
        mPageProvider = pageprovider;
        mPageProvider.setPageProviderObserver(this);
        mPageCount = mPageProvider.getPageCount();
        byte byte0 = 3;
        if (!mPageProvider.isFirstPageCover())
        {
            byte0 = 4;
        }
        pageprovider = new int[Math.min(mPageCount, byte0)];
        for (int i = 0; i < pageprovider.length; i++)
        {
            pageprovider[i] = i;
        }

        mPageProvider.createPages(pageprovider, mCurrentLeftPageIndex);
        if (mPageCount <= 0) goto _L2; else goto _L1
_L1:
        if (!mPageProvider.isFirstPageCover()) goto _L4; else goto _L3
_L3:
        mCurrentLeftPageIndex = -1;
        mRightPage = mPageProvider.getPage(0);
        mPageWidth = mRightPage.getWidth();
        mPageHeight = mRightPage.getHeight();
_L6:
        initDrawOffset();
_L2:
        return;
_L4:
        mCurrentLeftPageIndex = 0;
        mLeftPage = mPageProvider.getPage(0);
        mPageWidth = mLeftPage.getWidth();
        mPageHeight = mLeftPage.getHeight();
        if (mPageCount > 1)
        {
            mRightPage = mPageProvider.getPage(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }


}
