// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.actionbarsherlock.app.SherlockActivity;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public class IcsProgressBar extends View
{

    private static final boolean IS_HONEYCOMB;
    private static final int ProgressBar[];
    private static final String z;
    private AccessibilityEventSender mAccessibilityEventSender;
    private AccessibilityManager mAccessibilityManager;
    private AlphaAnimation mAnimation;
    private int mAnimationResolution;
    private int mBehavior;
    private Drawable mCurrentDrawable;
    private int mDuration;
    private boolean mInDrawing;
    private boolean mIndeterminate;
    private Drawable mIndeterminateDrawable;
    private int mIndeterminateRealLeft;
    private int mIndeterminateRealTop;
    private Interpolator mInterpolator;
    private long mLastDrawTime;
    private int mMax;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mNoInvalidate;
    private boolean mOnlyIndeterminate;
    private int mProgress;
    private Drawable mProgressDrawable;
    private RefreshProgressRunnable mRefreshProgressRunnable;
    Bitmap mSampleTile;
    private int mSecondaryProgress;
    private boolean mShouldStartAnimationDrawable;
    private Transformation mTransformation;
    private long mUiThreadId;

    public IcsProgressBar(Context context)
    {
        this(context, null);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010077);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public IcsProgressBar(Context context, AttributeSet attributeset, int i, int j)
    {
        boolean flag1 = false;
        int k = AbsActionBarView.b;
        super(context, attributeset, i);
        mUiThreadId = Thread.currentThread().getId();
        initProgressBar();
        attributeset = context.obtainStyledAttributes(attributeset, ProgressBar, i, j);
        mNoInvalidate = true;
        Drawable drawable = attributeset.getDrawable(8);
        if (drawable != null)
        {
            setProgressDrawable(tileify(drawable, false));
        }
        mDuration = attributeset.getInt(9, mDuration);
        mMinWidth = attributeset.getDimensionPixelSize(11, mMinWidth);
        mMaxWidth = attributeset.getDimensionPixelSize(0, mMaxWidth);
        mMinHeight = attributeset.getDimensionPixelSize(12, mMinHeight);
        mMaxHeight = attributeset.getDimensionPixelSize(1, mMaxHeight);
        mBehavior = attributeset.getInt(10, mBehavior);
        i = attributeset.getResourceId(13, 0x10a000b);
        if (i > 0)
        {
            setInterpolator(context, i);
        }
        setMax(attributeset.getInt(2, mMax));
        setProgress(attributeset.getInt(3, mProgress));
        setSecondaryProgress(attributeset.getInt(4, mSecondaryProgress));
        drawable = attributeset.getDrawable(7);
        if (drawable != null)
        {
            setIndeterminateDrawable(tileifyIndeterminate(drawable));
        }
        mOnlyIndeterminate = attributeset.getBoolean(6, mOnlyIndeterminate);
        mNoInvalidate = false;
        boolean flag;
        if (mOnlyIndeterminate || attributeset.getBoolean(5, mIndeterminate))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setIndeterminate(flag);
        mAnimationResolution = attributeset.getInteger(14, 200);
        attributeset.recycle();
        mAccessibilityManager = (AccessibilityManager)context.getSystemService(z);
        if (k != 0)
        {
            if (SherlockActivity.a)
            {
                flag = flag1;
            } else
            {
                flag = true;
            }
            SherlockActivity.a = flag;
        }
    }

    private void doRefreshProgress(int i, int j, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mMax <= 0) goto _L2; else goto _L1
_L1:
        float f = (float)j / (float)mMax;
_L6:
        Object obj1 = mCurrentDrawable;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        Object obj = null;
        if (obj1 instanceof LayerDrawable)
        {
            obj = ((LayerDrawable)obj1).findDrawableByLayerId(i);
        }
        break MISSING_BLOCK_LABEL_107;
_L7:
        ((Drawable) (obj1)).setLevel(j);
        if (AbsActionBarView.b == 0) goto _L5; else goto _L4
_L4:
        invalidate();
_L5:
        if (!flag1 || i != 0x102000d)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        onProgressRefresh(f, flag);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = 0.0F;
          goto _L6
        obj;
        throw obj;
        j = (int)(10000F * f);
        if (obj != null)
        {
            obj1 = obj;
        }
          goto _L7
    }

    private void initProgressBar()
    {
        mMax = 100;
        mProgress = 0;
        mSecondaryProgress = 0;
        mIndeterminate = false;
        mOnlyIndeterminate = false;
        mDuration = 4000;
        mBehavior = 1;
        mMinWidth = 24;
        mMaxWidth = 48;
        mMinHeight = 24;
        mMaxHeight = 48;
    }

    private void refreshProgress(int i, int j, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        k = AbsActionBarView.b;
        if (mUiThreadId != Thread.currentThread().getId())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        doRefreshProgress(i, j, flag, true);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        RefreshProgressRunnable refreshprogressrunnable;
        if (mRefreshProgressRunnable == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        refreshprogressrunnable = mRefreshProgressRunnable;
        mRefreshProgressRunnable = null;
        refreshprogressrunnable.setup(i, j, flag);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        refreshprogressrunnable = new RefreshProgressRunnable(i, j, flag);
        post(refreshprogressrunnable);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void scheduleAccessibilityEventSender()
    {
label0:
        {
            if (mAccessibilityEventSender == null)
            {
                mAccessibilityEventSender = new AccessibilityEventSender(null);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            removeCallbacks(mAccessibilityEventSender);
        }
        postDelayed(mAccessibilityEventSender, 200L);
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
        boolean flag1;
        int j;
        flag1 = false;
        j = AbsActionBarView.b;
        if (!(drawable instanceof LayerDrawable)) goto _L2; else goto _L1
_L1:
        Drawable adrawable[];
        int i;
        int k;
        drawable = (LayerDrawable)drawable;
        k = drawable.getNumberOfLayers();
        adrawable = new Drawable[k];
        i = 0;
_L7:
        if (i >= k) goto _L4; else goto _L3
_L3:
        int l = drawable.getId(i);
        Drawable drawable1 = drawable.getDrawable(i);
        LayerDrawable layerdrawable;
        if (l == 0x102000d || l == 0x102000f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adrawable[i] = tileify(drawable1, flag);
        if (j == 0) goto _L5; else goto _L4
_L4:
        layerdrawable = new LayerDrawable(adrawable);
        i = ((flag1) ? 1 : 0);
        do
        {
            if (i >= k)
            {
                break;
            }
            layerdrawable.setId(i, drawable.getId(i));
            i++;
        } while (j == 0);
        return layerdrawable;
_L2:
        if (drawable instanceof BitmapDrawable)
        {
            Object obj = ((BitmapDrawable)drawable).getBitmap();
            if (mSampleTile == null)
            {
                mSampleTile = ((Bitmap) (obj));
            }
            drawable = new ShapeDrawable(getDrawableShape());
            obj = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
            drawable.getPaint().setShader(((android.graphics.Shader) (obj)));
            if (flag)
            {
                return new ClipDrawable(drawable, 3, 1);
            } else
            {
                return drawable;
            }
        } else
        {
            return drawable;
        }
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private Drawable tileifyIndeterminate(Drawable drawable)
    {
        int j = AbsActionBarView.b;
        Object obj = drawable;
        if (drawable instanceof AnimationDrawable)
        {
            drawable = (AnimationDrawable)drawable;
            int k = drawable.getNumberOfFrames();
            obj = new AnimationDrawable();
            ((AnimationDrawable) (obj)).setOneShot(drawable.isOneShot());
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                Drawable drawable1 = tileify(drawable.getFrame(i), true);
                drawable1.setLevel(10000);
                ((AnimationDrawable) (obj)).addFrame(drawable1, drawable.getDuration(i));
                i++;
            } while (j == 0);
            ((AnimationDrawable) (obj)).setLevel(10000);
        }
        return ((Drawable) (obj));
    }

    private void updateDrawableBounds(int i, int j)
    {
        int k;
        int j1;
        k = i - getPaddingRight() - getPaddingLeft();
        j1 = j - getPaddingBottom() - getPaddingTop();
        if (mIndeterminateDrawable == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (!mOnlyIndeterminate || (mIndeterminateDrawable instanceof AnimationDrawable)) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        int l = mIndeterminateDrawable.getIntrinsicWidth();
        int k1 = mIndeterminateDrawable.getIntrinsicHeight();
        f = (float)l / (float)k1;
        f1 = (float)i / (float)j;
        if (f == f1) goto _L2; else goto _L3
_L3:
        if (f1 <= f) goto _L5; else goto _L4
_L4:
        int i1;
        i1 = (int)((float)j * f);
        k = (i - i1) / 2;
        i1 += k;
        if (AbsActionBarView.b == 0) goto _L7; else goto _L6
_L6:
        i = (int)((float)i * (1.0F / f));
        j1 = (j - i) / 2;
        j = i + j1;
        i = i1;
        i1 = j1;
_L8:
        mIndeterminateDrawable.setBounds(0, 0, i - k, j - i1);
        mIndeterminateRealLeft = k;
        mIndeterminateRealTop = i1;
_L9:
        if (mProgressDrawable != null)
        {
            mProgressDrawable.setBounds(0, 0, i, j);
        }
        return;
_L7:
        i = i1;
        i1 = 0;
        j = j1;
          goto _L8
_L5:
        i1 = k;
        k = 0;
          goto _L6
_L2:
        i1 = 0;
        i = k;
        k = 0;
        j = j1;
          goto _L8
        i = k;
        j = j1;
          goto _L9
    }

    private void updateDrawableState()
    {
        int ai[] = getDrawableState();
        if (mProgressDrawable != null && mProgressDrawable.isStateful())
        {
            mProgressDrawable.setState(ai);
        }
        if (mIndeterminateDrawable != null && mIndeterminateDrawable.isStateful())
        {
            mIndeterminateDrawable.setState(ai);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        updateDrawableState();
    }

    Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    public int getProgress()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = mProgress;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void invalidateDrawable(Drawable drawable)
    {
label0:
        {
            if (mInDrawing)
            {
                break label0;
            }
            if (verifyDrawable(drawable))
            {
                Rect rect = drawable.getBounds();
                int i = getScrollX() + getPaddingLeft();
                int j = getScrollY() + getPaddingTop();
                invalidate(rect.left + i, rect.top + j, i + rect.right, rect.bottom + j);
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isIndeterminate()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (mProgressDrawable != null)
        {
            mProgressDrawable.jumpToCurrentState();
        }
        if (mIndeterminateDrawable != null)
        {
            mIndeterminateDrawable.jumpToCurrentState();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mIndeterminate)
        {
            startAnimation();
        }
    }

    protected void onDetachedFromWindow()
    {
        if (mIndeterminate)
        {
            stopAnimation();
        }
        if (mRefreshProgressRunnable != null)
        {
            removeCallbacks(mRefreshProgressRunnable);
        }
        if (mAccessibilityEventSender != null)
        {
            removeCallbacks(mAccessibilityEventSender);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        Drawable drawable;
        super.onDraw(canvas);
        drawable = mCurrentDrawable;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        float f;
        canvas.save();
        canvas.translate(getPaddingLeft() + mIndeterminateRealLeft, getPaddingTop() + mIndeterminateRealTop);
        long l = getDrawingTime();
        if (mAnimation == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        mAnimation.getTransformation(l, mTransformation);
        f = mTransformation.getAlpha();
        mInDrawing = true;
        drawable.setLevel((int)(f * 10000F));
        mInDrawing = false;
        if (SystemClock.uptimeMillis() - mLastDrawTime >= (long)mAnimationResolution)
        {
            mLastDrawTime = SystemClock.uptimeMillis();
            postInvalidateDelayed(mAnimationResolution);
        }
        drawable.draw(canvas);
        canvas.restore();
        if (mShouldStartAnimationDrawable && (drawable instanceof Animatable))
        {
            ((Animatable)drawable).start();
            mShouldStartAnimationDrawable = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        mInDrawing = false;
        throw canvas;
        canvas;
        this;
        JVM INSTR monitorexit ;
        throw canvas;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setItemCount(mMax);
        accessibilityevent.setCurrentItemIndex(mProgress);
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        this;
        JVM INSTR monitorenter ;
        Drawable drawable = mCurrentDrawable;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        int l;
        l = Math.max(mMinWidth, Math.min(mMaxWidth, drawable.getIntrinsicWidth()));
        k = Math.max(mMinHeight, Math.min(mMaxHeight, drawable.getIntrinsicHeight()));
_L4:
        updateDrawableState();
        l += getPaddingLeft() + getPaddingRight();
        k += getPaddingTop() + getPaddingBottom();
        if (!IS_HONEYCOMB) goto _L2; else goto _L1
_L1:
        setMeasuredDimension(View.resolveSizeAndState(l, i, 0), View.resolveSizeAndState(k, j, 0));
        if (AbsActionBarView.b == 0) goto _L3; else goto _L2
_L2:
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
        l = 0;
          goto _L4
    }

    void onProgressRefresh(float f, boolean flag)
    {
        if (mAccessibilityManager.isEnabled())
        {
            scheduleAccessibilityEventSender();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setProgress(((SavedState) (parcelable)).progress);
        setSecondaryProgress(((SavedState) (parcelable)).secondaryProgress);
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.progress = mProgress;
        savedstate.secondaryProgress = mSecondaryProgress;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        updateDrawableBounds(i, j);
    }

    protected void onVisibilityChanged(View view, int i)
    {
label0:
        {
            super.onVisibilityChanged(view, i);
            if (!mIndeterminate)
            {
                break label0;
            }
            if (i == 8 || i == 4)
            {
                stopAnimation();
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            startAnimation();
        }
    }

    public void postInvalidate()
    {
        if (!mNoInvalidate)
        {
            super.postInvalidate();
        }
    }

    public void setIndeterminate(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (mOnlyIndeterminate && mIndeterminate || flag == mIndeterminate)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        mIndeterminate = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        mCurrentDrawable = mIndeterminateDrawable;
        startAnimation();
        if (AbsActionBarView.b == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        mCurrentDrawable = mProgressDrawable;
        stopAnimation();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setIndeterminateDrawable(Drawable drawable)
    {
        if (drawable != null)
        {
            drawable.setCallback(this);
        }
        mIndeterminateDrawable = drawable;
        if (mIndeterminate)
        {
            mCurrentDrawable = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Context context, int i)
    {
        setInterpolator(AnimationUtils.loadInterpolator(context, i));
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }

    public void setMax(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (j != mMax)
        {
            mMax = j;
            postInvalidate();
            if (mProgress > j)
            {
                mProgress = j;
            }
            refreshProgress(0x102000d, mProgress, false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        setProgress(i, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void setProgress(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mIndeterminate;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j;
        if (i < 0)
        {
            i = 0;
        }
        j = i;
        if (i > mMax)
        {
            j = mMax;
        }
        if (j != mProgress)
        {
            mProgress = j;
            refreshProgress(0x102000d, mProgress, flag);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setProgressDrawable(Drawable drawable)
    {
        boolean flag;
label0:
        {
            if (mProgressDrawable != null && drawable != mProgressDrawable)
            {
                mProgressDrawable.setCallback(null);
                flag = true;
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            flag = false;
        }
        if (drawable != null)
        {
            drawable.setCallback(this);
            int i = drawable.getMinimumHeight();
            if (mMaxHeight < i)
            {
                mMaxHeight = i;
                requestLayout();
            }
        }
        mProgressDrawable = drawable;
        if (!mIndeterminate)
        {
            mCurrentDrawable = drawable;
            postInvalidate();
        }
        if (flag)
        {
            updateDrawableBounds(getWidth(), getHeight());
            updateDrawableState();
            doRefreshProgress(0x102000d, mProgress, false, false);
            doRefreshProgress(0x102000f, mSecondaryProgress, false, false);
        }
    }

    public void setSecondaryProgress(int i)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIndeterminate;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i < 0)
        {
            i = j;
        }
        j = i;
        if (i > mMax)
        {
            j = mMax;
        }
        if (j != mSecondaryProgress)
        {
            mSecondaryProgress = j;
            refreshProgress(0x102000f, mSecondaryProgress, false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setVisibility(int i)
    {
label0:
        {
            if (getVisibility() == i)
            {
                break label0;
            }
            super.setVisibility(i);
            if (!mIndeterminate)
            {
                break label0;
            }
            if (i == 8 || i == 4)
            {
                stopAnimation();
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            startAnimation();
        }
    }

    void startAnimation()
    {
label0:
        {
            if (getVisibility() != 0)
            {
                return;
            }
            if (mIndeterminateDrawable instanceof Animatable)
            {
                mShouldStartAnimationDrawable = true;
                mAnimation = null;
                if (AbsActionBarView.b == 0)
                {
                    break label0;
                }
            }
            if (mInterpolator == null)
            {
                mInterpolator = new LinearInterpolator();
            }
            mTransformation = new Transformation();
            mAnimation = new AlphaAnimation(0.0F, 1.0F);
            mAnimation.setRepeatMode(mBehavior);
            mAnimation.setRepeatCount(-1);
            mAnimation.setDuration(mDuration);
            mAnimation.setInterpolator(mInterpolator);
            mAnimation.setStartTime(-1L);
        }
        postInvalidate();
    }

    void stopAnimation()
    {
        mAnimation = null;
        mTransformation = null;
        if (mIndeterminateDrawable instanceof Animatable)
        {
            ((Animatable)mIndeterminateDrawable).stop();
            mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return drawable == mProgressDrawable || drawable == mIndeterminateDrawable || super.verifyDrawable(drawable);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\030l\nO\033\nf\013C\004\020{\020".toCharArray();
        j = ac.length;
        i = 0;
_L6:
        if (j <= i)
        {
            z = (new String(ac)).intern();
            byte byte0;
            char c;
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            IS_HONEYCOMB = flag;
            ProgressBar = (new int[] {
                0x101011f, 0x1010120, 0x1010136, 0x1010137, 0x1010138, 0x1010139, 0x101013a, 0x101013b, 0x101013c, 0x101013d, 
                0x101013e, 0x101013f, 0x1010140, 0x1010141, 0x101031a
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 194
    //                   1 200
    //                   2 206
    //                   3 212;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_212;
_L1:
        byte0 = 104;
_L7:
        ac[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 121;
          goto _L7
_L3:
        byte0 = 15;
          goto _L7
_L4:
        byte0 = 105;
          goto _L7
        byte0 = 42;
          goto _L7
    }



/*
    static RefreshProgressRunnable access$102(IcsProgressBar icsprogressbar, RefreshProgressRunnable refreshprogressrunnable)
    {
        icsprogressbar.mRefreshProgressRunnable = refreshprogressrunnable;
        return refreshprogressrunnable;
    }

*/

    private class RefreshProgressRunnable
        implements Runnable
    {

        private boolean mFromUser;
        private int mId;
        private int mProgress;
        final IcsProgressBar this$0;

        public void run()
        {
            doRefreshProgress(mId, mProgress, mFromUser, true);
            mRefreshProgressRunnable = this;
        }

        public void setup(int i, int j, boolean flag)
        {
            mId = i;
            mProgress = j;
            mFromUser = flag;
        }

        RefreshProgressRunnable(int i, int j, boolean flag)
        {
            this$0 = IcsProgressBar.this;
            super();
            mId = i;
            mProgress = j;
            mFromUser = flag;
        }
    }


    private class AccessibilityEventSender
        implements Runnable
    {

        final IcsProgressBar this$0;

        public void run()
        {
            sendAccessibilityEvent(4);
        }

        private AccessibilityEventSender()
        {
            this$0 = IcsProgressBar.this;
            super();
        }

        AccessibilityEventSender(_cls1 _pcls1)
        {
            this();
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        int progress;
        int secondaryProgress;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(progress);
            parcel.writeInt(secondaryProgress);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            progress = parcel.readInt();
            secondaryProgress = parcel.readInt();
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, null);
            }

            public Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

}
