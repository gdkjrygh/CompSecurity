// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            BakedBezierInterpolator

final class SwipeProgressBar
{

    private static final int ANIMATION_DURATION_MS = 2000;
    private static final int COLOR1 = 0xb3000000;
    private static final int COLOR2 = 0x80000000;
    private static final int COLOR3 = 0x4d000000;
    private static final int COLOR4 = 0x1a000000;
    private static final int FINISH_ANIMATION_DURATION_MS = 1000;
    private static final Interpolator INTERPOLATOR = BakedBezierInterpolator.getInstance();
    private Rect mBounds;
    private final RectF mClipRect = new RectF();
    private int mColor1;
    private int mColor2;
    private int mColor3;
    private int mColor4;
    private long mFinishTime;
    private final Paint mPaint = new Paint();
    private View mParent;
    private boolean mRunning;
    private long mStartTime;
    private float mTriggerPercentage;

    public SwipeProgressBar(View view)
    {
        mBounds = new Rect();
        mParent = view;
        mColor1 = 0xb3000000;
        mColor2 = 0x80000000;
        mColor3 = 0x4d000000;
        mColor4 = 0x1a000000;
    }

    private void drawCircle(Canvas canvas, float f, float f1, int i, float f2)
    {
        mPaint.setColor(i);
        canvas.save();
        canvas.translate(f, f1);
        f1 = INTERPOLATOR.getInterpolation(f2);
        canvas.scale(f1, f1);
        canvas.drawCircle(0.0F, 0.0F, f, mPaint);
        canvas.restore();
    }

    private void drawTrigger(Canvas canvas, int i, int j)
    {
        mPaint.setColor(mColor1);
        canvas.drawCircle(i, j, (float)i * mTriggerPercentage, mPaint);
    }

    void draw(Canvas canvas)
    {
        int i;
        int j;
        boolean flag;
        int k;
        int l;
        int i1;
        i = mBounds.width();
        i1 = mBounds.height();
        k = i / 2;
        l = i1 / 2;
        flag = false;
        j = canvas.save();
        canvas.clipRect(mBounds);
        if (!mRunning && mFinishTime <= 0L) goto _L2; else goto _L1
_L1:
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        long l2 = mStartTime;
        long l3 = (l1 - mStartTime) / 2000L;
        float f = (float)((l1 - l2) % 2000L) / 20F;
        if (!mRunning)
        {
            if (l1 - mFinishTime >= 1000L)
            {
                mFinishTime = 0L;
                return;
            }
            float f1 = (float)((l1 - mFinishTime) % 1000L) / 10F / 100F;
            f1 = (float)(i / 2) * INTERPOLATOR.getInterpolation(f1);
            mClipRect.set((float)k - f1, 0.0F, (float)k + f1, i1);
            canvas.saveLayerAlpha(mClipRect, 0, 0);
            flag = true;
        }
        if (l3 == 0L)
        {
            canvas.drawColor(mColor1);
        } else
        if (f >= 0.0F && f < 25F)
        {
            canvas.drawColor(mColor4);
        } else
        if (f >= 25F && f < 50F)
        {
            canvas.drawColor(mColor1);
        } else
        if (f >= 50F && f < 75F)
        {
            canvas.drawColor(mColor2);
        } else
        {
            canvas.drawColor(mColor3);
        }
        if (f >= 0.0F && f <= 25F)
        {
            float f2 = ((25F + f) * 2.0F) / 100F;
            drawCircle(canvas, k, l, mColor1, f2);
        }
        if (f >= 0.0F && f <= 50F)
        {
            float f3 = (2.0F * f) / 100F;
            drawCircle(canvas, k, l, mColor2, f3);
        }
        if (f >= 25F && f <= 75F)
        {
            float f4 = ((f - 25F) * 2.0F) / 100F;
            drawCircle(canvas, k, l, mColor3, f4);
        }
        if (f >= 50F && f <= 100F)
        {
            float f5 = ((f - 50F) * 2.0F) / 100F;
            drawCircle(canvas, k, l, mColor4, f5);
        }
        if (f >= 75F && f <= 100F)
        {
            f = ((f - 75F) * 2.0F) / 100F;
            drawCircle(canvas, k, l, mColor1, f);
        }
        i = j;
        if (mTriggerPercentage > 0.0F)
        {
            i = j;
            if (flag)
            {
                canvas.restoreToCount(j);
                i = canvas.save();
                canvas.clipRect(mBounds);
                drawTrigger(canvas, k, l);
            }
        }
        ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
_L4:
        canvas.restoreToCount(i);
        return;
_L2:
        i = j;
        if (mTriggerPercentage > 0.0F)
        {
            i = j;
            if ((double)mTriggerPercentage <= 1.0D)
            {
                drawTrigger(canvas, k, l);
                i = j;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean isRunning()
    {
        return mRunning || mFinishTime > 0L;
    }

    void setBounds(int i, int j, int k, int l)
    {
        mBounds.left = i;
        mBounds.top = j;
        mBounds.right = k;
        mBounds.bottom = l;
    }

    void setColorScheme(int i, int j, int k, int l)
    {
        mColor1 = i;
        mColor2 = j;
        mColor3 = k;
        mColor4 = l;
    }

    void setTriggerPercentage(float f)
    {
        mTriggerPercentage = f;
        mStartTime = 0L;
        ViewCompat.postInvalidateOnAnimation(mParent, mBounds.left, mBounds.top, mBounds.right, mBounds.bottom);
    }

    void start()
    {
        if (!mRunning)
        {
            mTriggerPercentage = 0.0F;
            mStartTime = AnimationUtils.currentAnimationTimeMillis();
            mRunning = true;
            mParent.postInvalidate();
        }
    }

    void stop()
    {
        if (mRunning)
        {
            mTriggerPercentage = 0.0F;
            mFinishTime = AnimationUtils.currentAnimationTimeMillis();
            mRunning = false;
            mParent.postInvalidate();
        }
    }

}
