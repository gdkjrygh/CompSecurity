// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class MaterialProgressDrawable extends Drawable
    implements Animatable
{

    private static final Interpolator EASE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final Interpolator END_CURVE_INTERPOLATOR = new EndCurveInterpolator(null);
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator START_CURVE_INTERPOLATOR = new StartCurveInterpolator(null);
    private final int COLORS[] = {
        0xff000000
    };
    private Animation mAnimation;
    private final ArrayList mAnimators = new ArrayList();
    private final android.graphics.drawable.Drawable.Callback mCallback = new _cls3();
    boolean mFinishing;
    private double mHeight;
    private View mParent;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    public MaterialProgressDrawable(Context context, View view)
    {
        mParent = view;
        mResources = context.getResources();
        mRing = new Ring(mCallback);
        mRing.setColors(COLORS);
        updateSizes(1);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, Ring ring)
    {
        float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
        ring.setStartTrim(ring.getStartingStartTrim() + (ring.getStartingEndTrim() - ring.getStartingStartTrim()) * f);
        float f2 = ring.getStartingRotation();
        ring.setRotation((f1 - ring.getStartingRotation()) * f + f2);
    }

    private void setSizeParameters(double d, double d1, double d2, double d3, float f, float f1)
    {
        Ring ring = mRing;
        float f2 = mResources.getDisplayMetrics().density;
        mWidth = (double)f2 * d;
        mHeight = (double)f2 * d1;
        ring.setStrokeWidth((float)d3 * f2);
        ring.setCenterRadius((double)f2 * d2);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f * f2, f2 * f1);
        ring.setInsets((int)mWidth, (int)mHeight);
    }

    private void setupAnimators()
    {
        final Ring ring = mRing;
        _cls1 _lcls1 = new _cls1();
        _lcls1.setRepeatCount(-1);
        _lcls1.setRepeatMode(1);
        _lcls1.setInterpolator(LINEAR_INTERPOLATOR);
        _lcls1.setAnimationListener(new _cls2());
        mAnimation = _lcls1;
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i = canvas.save();
        canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
        mRing.draw(canvas, rect);
        canvas.restoreToCount(i);
    }

    public int getAlpha()
    {
        return mRing.getAlpha();
    }

    public int getIntrinsicHeight()
    {
        return (int)mHeight;
    }

    public int getIntrinsicWidth()
    {
        return (int)mWidth;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isRunning()
    {
        int j = SlidingPaneLayout.a;
        ArrayList arraylist = mAnimators;
        int k = arraylist.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    Animation animation = (Animation)arraylist.get(i);
                    if (animation.hasStarted() && !animation.hasEnded())
                    {
                        return true;
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return false;
            }
            i++;
        } while (true);
    }

    public void setAlpha(int i)
    {
        mRing.setAlpha(i);
    }

    public void setArrowScale(float f)
    {
        mRing.setArrowScale(f);
    }

    public void setBackgroundColor(int i)
    {
        mRing.setBackgroundColor(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mRing.setColorFilter(colorfilter);
    }

    public void setProgressRotation(float f)
    {
        mRing.setRotation(f);
    }

    void setRotation(float f)
    {
        mRotation = f;
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f1)
    {
        mRing.setStartTrim(f);
        mRing.setEndTrim(f1);
    }

    public void showArrow(boolean flag)
    {
        mRing.setShowArrow(flag);
    }

    public void start()
    {
label0:
        {
            mAnimation.reset();
            mRing.storeOriginals();
            if (mRing.getEndTrim() != mRing.getStartTrim())
            {
                mFinishing = true;
                mAnimation.setDuration(666L);
                mParent.startAnimation(mAnimation);
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            mRing.setColorIndex(0);
            mRing.resetOriginals();
            mAnimation.setDuration(1333L);
            mParent.startAnimation(mAnimation);
        }
    }

    public void stop()
    {
        mParent.clearAnimation();
        setRotation(0.0F);
        mRing.setShowArrow(false);
        mRing.setColorIndex(0);
        mRing.resetOriginals();
    }

    public void updateSizes(int i)
    {
label0:
        {
            if (i == 0)
            {
                setSizeParameters(56D, 56D, 12.5D, 3D, 12F, 6F);
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            setSizeParameters(40D, 40D, 8.75D, 2.5D, 10F, 5F);
        }
    }







/*
    static float access$502(MaterialProgressDrawable materialprogressdrawable, float f)
    {
        materialprogressdrawable.mRotationCount = f;
        return f;
    }

*/

    private class _cls3
        implements android.graphics.drawable.Drawable.Callback
    {

        final MaterialProgressDrawable this$0;

        public void invalidateDrawable(Drawable drawable)
        {
            invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
        {
            scheduleSelf(runnable, l);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable)
        {
            unscheduleSelf(runnable);
        }

        _cls3()
        {
            this$0 = MaterialProgressDrawable.this;
            super();
        }
    }


    private class Ring
    {

        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint = new Paint();
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final android.graphics.drawable.Drawable.Callback mCallback;
        private final Paint mCirclePaint = new Paint();
        private int mColorIndex;
        private int mColors[];
        private float mEndTrim;
        private final Paint mPaint = new Paint();
        private double mRingCenterRadius;
        private float mRotation;
        private boolean mShowArrow;
        private float mStartTrim;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private float mStrokeInset;
        private float mStrokeWidth;
        private final RectF mTempBounds = new RectF();

        private void drawTriangle(Canvas canvas, float f, float f1, Rect rect)
        {
label0:
            {
label1:
                {
                    if (!mShowArrow)
                    {
                        break label0;
                    }
                    if (mArrow == null)
                    {
                        mArrow = new Path();
                        mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                        if (SlidingPaneLayout.a == 0)
                        {
                            break label1;
                        }
                    }
                    mArrow.reset();
                }
                float f2 = (int)mStrokeInset / 2;
                float f3 = mArrowScale;
                float f4 = (float)(mRingCenterRadius * Math.cos(0.0D) + (double)rect.exactCenterX());
                float f5 = (float)(mRingCenterRadius * Math.sin(0.0D) + (double)rect.exactCenterY());
                mArrow.moveTo(0.0F, 0.0F);
                mArrow.lineTo((float)mArrowWidth * mArrowScale, 0.0F);
                mArrow.lineTo(((float)mArrowWidth * mArrowScale) / 2.0F, (float)mArrowHeight * mArrowScale);
                mArrow.offset(f4 - f2 * f3, f5);
                mArrow.close();
                mArrowPaint.setColor(mColors[mColorIndex]);
                canvas.rotate((f + f1) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(mArrow, mArrowPaint);
            }
        }

        private void invalidateSelf()
        {
            mCallback.invalidateDrawable(null);
        }

        public void draw(Canvas canvas, Rect rect)
        {
            RectF rectf = mTempBounds;
            rectf.set(rect);
            rectf.inset(mStrokeInset, mStrokeInset);
            float f = (mStartTrim + mRotation) * 360F;
            float f1 = (mEndTrim + mRotation) * 360F - f;
            mPaint.setColor(mColors[mColorIndex]);
            canvas.drawArc(rectf, f, f1, false, mPaint);
            drawTriangle(canvas, f, f1, rect);
            if (mAlpha < 255)
            {
                mCirclePaint.setColor(mBackgroundColor);
                mCirclePaint.setAlpha(255 - mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, mCirclePaint);
            }
        }

        public int getAlpha()
        {
            return mAlpha;
        }

        public double getCenterRadius()
        {
            return mRingCenterRadius;
        }

        public float getEndTrim()
        {
            return mEndTrim;
        }

        public float getStartTrim()
        {
            return mStartTrim;
        }

        public float getStartingEndTrim()
        {
            return mStartingEndTrim;
        }

        public float getStartingRotation()
        {
            return mStartingRotation;
        }

        public float getStartingStartTrim()
        {
            return mStartingStartTrim;
        }

        public float getStrokeWidth()
        {
            return mStrokeWidth;
        }

        public void goToNextColor()
        {
            mColorIndex = (mColorIndex + 1) % mColors.length;
        }

        public void resetOriginals()
        {
            mStartingStartTrim = 0.0F;
            mStartingEndTrim = 0.0F;
            mStartingRotation = 0.0F;
            setStartTrim(0.0F);
            setEndTrim(0.0F);
            setRotation(0.0F);
        }

        public void setAlpha(int i)
        {
            mAlpha = i;
        }

        public void setArrowDimensions(float f, float f1)
        {
            mArrowWidth = (int)f;
            mArrowHeight = (int)f1;
        }

        public void setArrowScale(float f)
        {
            if (f != mArrowScale)
            {
                mArrowScale = f;
                invalidateSelf();
            }
        }

        public void setBackgroundColor(int i)
        {
            mBackgroundColor = i;
        }

        public void setCenterRadius(double d)
        {
            mRingCenterRadius = d;
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
            mPaint.setColorFilter(colorfilter);
            invalidateSelf();
        }

        public void setColorIndex(int i)
        {
            mColorIndex = i;
        }

        public void setColors(int ai[])
        {
            mColors = ai;
            setColorIndex(0);
        }

        public void setEndTrim(float f)
        {
            mEndTrim = f;
            invalidateSelf();
        }

        public void setInsets(int i, int j)
        {
            float f;
label0:
            {
                float f1 = Math.min(i, j);
                if (mRingCenterRadius <= 0.0D || f1 < 0.0F)
                {
                    f = (float)Math.ceil(mStrokeWidth / 2.0F);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                f = (float)((double)(f1 / 2.0F) - mRingCenterRadius);
            }
            mStrokeInset = f;
        }

        public void setRotation(float f)
        {
            mRotation = f;
            invalidateSelf();
        }

        public void setShowArrow(boolean flag)
        {
            if (mShowArrow != flag)
            {
                mShowArrow = flag;
                invalidateSelf();
            }
        }

        public void setStartTrim(float f)
        {
            mStartTrim = f;
            invalidateSelf();
        }

        public void setStrokeWidth(float f)
        {
            mStrokeWidth = f;
            mPaint.setStrokeWidth(f);
            invalidateSelf();
        }

        public void storeOriginals()
        {
            mStartingStartTrim = mStartTrim;
            mStartingEndTrim = mEndTrim;
            mStartingRotation = mRotation;
        }

        public Ring(android.graphics.drawable.Drawable.Callback callback)
        {
            mStartTrim = 0.0F;
            mEndTrim = 0.0F;
            mRotation = 0.0F;
            mStrokeWidth = 5F;
            mStrokeInset = 2.5F;
            mCallback = callback;
            mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            mPaint.setAntiAlias(true);
            mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            mArrowPaint.setStyle(android.graphics.Paint.Style.FILL);
            mArrowPaint.setAntiAlias(true);
        }
    }


    private class _cls1 extends Animation
    {

        final MaterialProgressDrawable this$0;
        final Ring val$ring;

        public void applyTransformation(float f, Transformation transformation)
        {
label0:
            {
                if (mFinishing)
                {
                    applyFinishTranslation(f, ring);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                float f3 = (float)Math.toRadians((double)ring.getStrokeWidth() / (6.2831853071795862D * ring.getCenterRadius()));
                float f4 = ring.getStartingEndTrim();
                float f1 = ring.getStartingStartTrim();
                float f2 = ring.getStartingRotation();
                float f5 = MaterialProgressDrawable.START_CURVE_INTERPOLATOR.getInterpolation(f);
                ring.setEndTrim((0.8F - f3) * f5 + f4);
                f3 = MaterialProgressDrawable.END_CURVE_INTERPOLATOR.getInterpolation(f);
                ring.setStartTrim(f3 * 0.8F + f1);
                ring.setRotation(0.25F * f + f2);
                f1 = mRotationCount / 5F;
                setRotation(144F * f + 720F * f1);
            }
        }

        _cls1()
        {
            this$0 = MaterialProgressDrawable.this;
            ring = ring1;
            super();
        }
    }


    private class _cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final MaterialProgressDrawable this$0;
        final Ring val$ring;

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
label0:
            {
                ring.storeOriginals();
                ring.goToNextColor();
                ring.setStartTrim(ring.getEndTrim());
                if (mFinishing)
                {
                    mFinishing = false;
                    animation.setDuration(1333L);
                    ring.setShowArrow(false);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                mRotationCount = (mRotationCount + 1.0F) % 5F;
            }
        }

        public void onAnimationStart(Animation animation)
        {
            mRotationCount = 0.0F;
        }

        _cls2()
        {
            this$0 = MaterialProgressDrawable.this;
            ring = ring1;
            super();
        }
    }


    private class EndCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f)
        {
            return super.getInterpolation(Math.max(0.0F, (f - 0.5F) * 2.0F));
        }

        private EndCurveInterpolator()
        {
        }

        EndCurveInterpolator(_cls1 _pcls1)
        {
            this();
        }
    }


    private class StartCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f)
        {
            return super.getInterpolation(Math.min(1.0F, 2.0F * f));
        }

        private StartCurveInterpolator()
        {
        }

        StartCurveInterpolator(_cls1 _pcls1)
        {
            this();
        }
    }

}
