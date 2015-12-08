// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat extends CompoundButton
{

    private static final int CHECKED_STATE_SET[] = {
        0x10100a0
    };
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_APPEARANCE_ATTRS[];
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    private Animation mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private int mThumbWidth;
    private final TintManager mTintManager;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private VelocityTracker mVelocityTracker;

    public SwitchCompat(Context context)
    {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mVelocityTracker = VelocityTracker.obtain();
        mTempRect = new Rect();
        mTextPaint = new TextPaint(1);
        Resources resources = getResources();
        mTextPaint.density = resources.getDisplayMetrics().density;
        attributeset = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SwitchCompat, i, 0);
        mThumbDrawable = attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_android_thumb);
        mTrackDrawable = attributeset.getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
        mTextOn = attributeset.getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
        mTextOff = attributeset.getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
        mShowText = attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
        mThumbTextPadding = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        mSwitchMinWidth = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        mSwitchPadding = attributeset.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        mSplitTrack = attributeset.getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        i = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (i != 0)
        {
            setSwitchTextAppearance(context, i);
        }
        mTintManager = attributeset.getTintManager();
        attributeset.recycle();
        context = ViewConfiguration.get(context);
        mTouchSlop = context.getScaledTouchSlop();
        mMinFlingVelocity = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void animateThumbToCheckedState(boolean flag)
    {
        final float startPosition = mThumbPosition;
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        mPositionAnimator = new Animation() {

            final SwitchCompat this$0;
            final float val$diff;
            final float val$startPosition;

            protected void applyTransformation(float f1, Transformation transformation)
            {
                setThumbPosition(startPosition + diff * f1);
            }

            
            {
                this$0 = SwitchCompat.this;
                startPosition = f;
                diff = f1;
                super();
            }
        };
        mPositionAnimator.setDuration(250L);
        startAnimation(mPositionAnimator);
    }

    private void cancelPositionAnimator()
    {
        if (mPositionAnimator != null)
        {
            clearAnimation();
            mPositionAnimator = null;
        }
    }

    private void cancelSuperTouch(MotionEvent motionevent)
    {
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setAction(3);
        super.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    private static float constrain(float f, float f1, float f2)
    {
        if (f < f1)
        {
            return f1;
        }
        if (f > f2)
        {
            return f2;
        } else
        {
            return f;
        }
    }

    private boolean getTargetCheckedState()
    {
        return mThumbPosition > 0.5F;
    }

    private int getThumbOffset()
    {
        float f;
        if (ViewUtils.isLayoutRtl(this))
        {
            f = 1.0F - mThumbPosition;
        } else
        {
            f = mThumbPosition;
        }
        return (int)((float)getThumbScrollRange() * f + 0.5F);
    }

    private int getThumbScrollRange()
    {
        if (mTrackDrawable != null)
        {
            Rect rect = mTempRect;
            mTrackDrawable.getPadding(rect);
            return mSwitchWidth - mThumbWidth - rect.left - rect.right;
        } else
        {
            return 0;
        }
    }

    private boolean hitThumb(float f, float f1)
    {
        int k = getThumbOffset();
        mThumbDrawable.getPadding(mTempRect);
        int i = mSwitchTop;
        int j = mTouchSlop;
        k = (mSwitchLeft + k) - mTouchSlop;
        int l = mThumbWidth;
        int i1 = mTempRect.left;
        int j1 = mTempRect.right;
        int k1 = mTouchSlop;
        int l1 = mSwitchBottom;
        int i2 = mTouchSlop;
        return f > (float)k && f < (float)(l + k + i1 + j1 + k1) && f1 > (float)(i - j) && f1 < (float)(l1 + i2);
    }

    private Layout makeLayout(CharSequence charsequence)
    {
        if (mSwitchTransformationMethod != null)
        {
            charsequence = mSwitchTransformationMethod.getTransformation(charsequence, this);
        }
        return new StaticLayout(charsequence, mTextPaint, (int)Math.ceil(Layout.getDesiredWidth(charsequence, mTextPaint)), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }

    private void setThumbPosition(float f)
    {
        mThumbPosition = f;
        invalidate();
    }

    private void stopDrag(MotionEvent motionevent)
    {
        float f;
        boolean flag1;
        flag1 = true;
        mTouchMode = 0;
        boolean flag;
        if (motionevent.getAction() == 1 && isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        mVelocityTracker.computeCurrentVelocity(1000);
        f = mVelocityTracker.getXVelocity();
        if (Math.abs(f) <= (float)mMinFlingVelocity) goto _L4; else goto _L3
_L3:
        if (!ViewUtils.isLayoutRtl(this)) goto _L6; else goto _L5
_L5:
        if (f >= 0.0F)
        {
            flag1 = false;
        }
_L8:
        setChecked(flag1);
        cancelSuperTouch(motionevent);
        return;
_L6:
        if (f <= 0.0F)
        {
            flag1 = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag1 = getTargetCheckedState();
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = isChecked();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void draw(Canvas canvas)
    {
        Object obj = mTempRect;
        int j1 = mSwitchLeft;
        int l = mSwitchTop;
        int k1 = mSwitchRight;
        int i1 = mSwitchBottom;
        int j = j1 + getThumbOffset();
        int i = j;
        if (mTrackDrawable != null)
        {
            mTrackDrawable.getPadding(((Rect) (obj)));
            i = j + ((Rect) (obj)).left;
            mTrackDrawable.setBounds(j1, l, k1, i1);
        }
        if (mThumbDrawable != null)
        {
            mThumbDrawable.getPadding(((Rect) (obj)));
            int k = i - ((Rect) (obj)).left;
            i = mThumbWidth + i + ((Rect) (obj)).right;
            mThumbDrawable.setBounds(k, l, i, i1);
            obj = getBackground();
            if (obj != null)
            {
                DrawableCompat.setHotspotBounds(((Drawable) (obj)), k, l, i, i1);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f1)
    {
        super.drawableHotspotChanged(f, f1);
        if (mThumbDrawable != null)
        {
            DrawableCompat.setHotspot(mThumbDrawable, f, f1);
        }
        if (mTrackDrawable != null)
        {
            DrawableCompat.setHotspot(mTrackDrawable, f, f1);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int ai[] = getDrawableState();
        if (mThumbDrawable != null)
        {
            mThumbDrawable.setState(ai);
        }
        if (mTrackDrawable != null)
        {
            mTrackDrawable.setState(ai);
        }
        invalidate();
    }

    public int getCompoundPaddingLeft()
    {
        int i;
        if (!ViewUtils.isLayoutRtl(this))
        {
            i = super.getCompoundPaddingLeft();
        } else
        {
            int j = super.getCompoundPaddingLeft() + mSwitchWidth;
            i = j;
            if (!TextUtils.isEmpty(getText()))
            {
                return j + mSwitchPadding;
            }
        }
        return i;
    }

    public int getCompoundPaddingRight()
    {
        int i;
        if (ViewUtils.isLayoutRtl(this))
        {
            i = super.getCompoundPaddingRight();
        } else
        {
            int j = super.getCompoundPaddingRight() + mSwitchWidth;
            i = j;
            if (!TextUtils.isEmpty(getText()))
            {
                return j + mSwitchPadding;
            }
        }
        return i;
    }

    public boolean getShowText()
    {
        return mShowText;
    }

    public boolean getSplitTrack()
    {
        return mSplitTrack;
    }

    public int getSwitchMinWidth()
    {
        return mSwitchMinWidth;
    }

    public int getSwitchPadding()
    {
        return mSwitchPadding;
    }

    public CharSequence getTextOff()
    {
        return mTextOff;
    }

    public CharSequence getTextOn()
    {
        return mTextOn;
    }

    public Drawable getThumbDrawable()
    {
        return mThumbDrawable;
    }

    public int getThumbTextPadding()
    {
        return mThumbTextPadding;
    }

    public Drawable getTrackDrawable()
    {
        return mTrackDrawable;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (mThumbDrawable != null)
            {
                mThumbDrawable.jumpToCurrentState();
            }
            if (mTrackDrawable != null)
            {
                mTrackDrawable.jumpToCurrentState();
            }
            if (mPositionAnimator != null && mPositionAnimator.hasStarted() && !mPositionAnimator.hasEnded())
            {
                clearAnimation();
                mPositionAnimator = null;
            }
        }
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, CHECKED_STATE_SET);
        }
        return ai;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Object obj1 = mTempRect;
        Object obj = mTrackDrawable;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(((Rect) (obj1)));
        } else
        {
            ((Rect) (obj1)).setEmpty();
        }
        k = mSwitchTop;
        l = mSwitchBottom;
        i1 = ((Rect) (obj1)).top;
        j1 = ((Rect) (obj1)).bottom;
        obj1 = mThumbDrawable;
        if (obj != null)
        {
            ((Drawable) (obj)).draw(canvas);
        }
        j = canvas.save();
        if (obj1 != null)
        {
            ((Drawable) (obj1)).draw(canvas);
        }
        if (getTargetCheckedState())
        {
            obj = mOnLayout;
        } else
        {
            obj = mOffLayout;
        }
        if (obj != null)
        {
            int ai[] = getDrawableState();
            if (mTextColors != null)
            {
                mTextPaint.setColor(mTextColors.getColorForState(ai, 0));
            }
            mTextPaint.drawableState = ai;
            int i;
            int k1;
            if (obj1 != null)
            {
                obj1 = ((Drawable) (obj1)).getBounds();
                i = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
            } else
            {
                i = getWidth();
            }
            i /= 2;
            k1 = ((Layout) (obj)).getWidth() / 2;
            k = (k + i1 + (l - j1)) / 2;
            l = ((Layout) (obj)).getHeight() / 2;
            canvas.translate(i - k1, k - l);
            ((Layout) (obj)).draw(canvas);
        }
        canvas.restoreToCount(j);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/SwitchCompat.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        CharSequence charsequence;
        CharSequence charsequence1;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
                accessibilitynodeinfo.setClassName(android/support/v7/widget/SwitchCompat.getName());
                if (isChecked())
                {
                    charsequence = mTextOn;
                } else
                {
                    charsequence = mTextOff;
                }
                if (!TextUtils.isEmpty(charsequence))
                {
                    charsequence1 = accessibilitynodeinfo.getText();
                    if (!TextUtils.isEmpty(charsequence1))
                    {
                        break label0;
                    }
                    accessibilitynodeinfo.setText(charsequence);
                }
            }
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(charsequence1).append(' ').append(charsequence);
        accessibilitynodeinfo.setText(stringbuilder);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (mThumbDrawable != null)
        {
            Rect rect = mTempRect;
            if (mTrackDrawable != null)
            {
                mTrackDrawable.getPadding(rect);
            } else
            {
                rect.setEmpty();
            }
        }
        if (ViewUtils.isLayoutRtl(this))
        {
            k = getPaddingLeft() + 0;
            l = mSwitchWidth + k + 0 + 0;
        } else
        {
            l = (getWidth() - getPaddingRight()) + 0;
            k = (l - mSwitchWidth) + 0 + 0;
        }
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 104
    //                   16: 176
    //                   80: 210;
           goto _L1 _L2 _L3
_L1:
        j = getPaddingTop();
        i = j + mSwitchHeight;
_L5:
        mSwitchLeft = k;
        mSwitchTop = j;
        mSwitchBottom = i;
        mSwitchRight = l;
        return;
_L2:
        j = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - mSwitchHeight / 2;
        i = j + mSwitchHeight;
        continue; /* Loop/switch isn't completed */
_L3:
        i = getHeight() - getPaddingBottom();
        j = i - mSwitchHeight;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onMeasure(int i, int j)
    {
        if (mShowText)
        {
            if (mOnLayout == null)
            {
                mOnLayout = makeLayout(mTextOn);
            }
            if (mOffLayout == null)
            {
                mOffLayout = makeLayout(mTextOff);
            }
        }
        Rect rect = mTempRect;
        int k;
        int l;
        int i1;
        int j1;
        if (mThumbDrawable != null)
        {
            mThumbDrawable.getPadding(rect);
            l = mThumbDrawable.getIntrinsicWidth() - rect.left - rect.right;
            k = mThumbDrawable.getIntrinsicHeight();
        } else
        {
            l = 0;
            k = 0;
        }
        if (mShowText)
        {
            i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
        } else
        {
            i1 = 0;
        }
        mThumbWidth = Math.max(i1, l);
        if (mTrackDrawable != null)
        {
            mTrackDrawable.getPadding(rect);
            l = mTrackDrawable.getIntrinsicHeight();
        } else
        {
            rect.setEmpty();
            l = 0;
        }
        i1 = rect.left;
        j1 = rect.right;
        i1 = Math.max(mSwitchMinWidth, mThumbWidth * 2 + i1 + j1);
        k = Math.max(l, k);
        mSwitchWidth = i1;
        mSwitchHeight = k;
        super.onMeasure(i, j);
        if (getMeasuredHeight() < k)
        {
            setMeasuredDimension(ViewCompat.getMeasuredWidthAndState(this), k);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        CharSequence charsequence;
        if (isChecked())
        {
            charsequence = mTextOn;
        } else
        {
            charsequence = mTextOff;
        }
        if (charsequence != null)
        {
            accessibilityevent.getText().add(charsequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mVelocityTracker.addMovement(motionevent);
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 3: default 44
    //                   0 50
    //                   1 295
    //                   2 94
    //                   3 295;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        float f = motionevent.getX();
        float f3 = motionevent.getY();
        if (isEnabled() && hitThumb(f, f3))
        {
            mTouchMode = 1;
            mTouchX = f;
            mTouchY = f3;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        switch (mTouchMode)
        {
        case 1: // '\001'
            float f1 = motionevent.getX();
            float f4 = motionevent.getY();
            if (Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
            {
                mTouchMode = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                mTouchX = f1;
                mTouchY = f4;
                return true;
            }
            break;

        case 2: // '\002'
            float f6 = motionevent.getX();
            int i = getThumbScrollRange();
            float f2 = f6 - mTouchX;
            float f5;
            if (i != 0)
            {
                f2 /= i;
            } else
            if (f2 > 0.0F)
            {
                f2 = 1.0F;
            } else
            {
                f2 = -1F;
            }
            f5 = f2;
            if (ViewUtils.isLayoutRtl(this))
            {
                f5 = -f2;
            }
            f2 = constrain(mThumbPosition + f5, 0.0F, 1.0F);
            if (f2 != mThumbPosition)
            {
                mTouchX = f6;
                setThumbPosition(f2);
            }
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mTouchMode == 2)
        {
            stopDrag(motionevent);
            super.onTouchEvent(motionevent);
            return true;
        }
        mTouchMode = 0;
        mVelocityTracker.clear();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setChecked(boolean flag)
    {
        super.setChecked(flag);
        flag = isChecked();
        if (getWindowToken() != null)
        {
            animateThumbToCheckedState(flag);
            return;
        }
        cancelPositionAnimator();
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        setThumbPosition(f);
    }

    public void setShowText(boolean flag)
    {
        if (mShowText != flag)
        {
            mShowText = flag;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean flag)
    {
        mSplitTrack = flag;
        invalidate();
    }

    public void setSwitchMinWidth(int i)
    {
        mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i)
    {
        mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, TEXT_APPEARANCE_ATTRS);
        ColorStateList colorstatelist = context.getColorStateList(0);
        if (colorstatelist != null)
        {
            mTextColors = colorstatelist;
        } else
        {
            mTextColors = getTextColors();
        }
        i = context.getDimensionPixelSize(1, 0);
        if (i != 0 && (float)i != mTextPaint.getTextSize())
        {
            mTextPaint.setTextSize(i);
            requestLayout();
        }
        if (context.getBoolean(2, false))
        {
            mSwitchTransformationMethod = new AllCapsTransformationMethod(getContext());
        } else
        {
            mSwitchTransformationMethod = null;
        }
        context.recycle();
    }

    public void setSwitchTypeface(Typeface typeface)
    {
        if (mTextPaint.getTypeface() != typeface)
        {
            mTextPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i)
    {
        boolean flag = false;
        if (i > 0)
        {
            float f;
            int j;
            if (typeface == null)
            {
                typeface = Typeface.defaultFromStyle(i);
            } else
            {
                typeface = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface);
            if (typeface != null)
            {
                j = typeface.getStyle();
            } else
            {
                j = 0;
            }
            i &= ~j;
            typeface = mTextPaint;
            if ((i & 1) != 0)
            {
                flag = true;
            }
            typeface.setFakeBoldText(flag);
            typeface = mTextPaint;
            if ((i & 2) != 0)
            {
                f = -0.25F;
            } else
            {
                f = 0.0F;
            }
            typeface.setTextSkewX(f);
            return;
        } else
        {
            mTextPaint.setFakeBoldText(false);
            mTextPaint.setTextSkewX(0.0F);
            setSwitchTypeface(typeface);
            return;
        }
    }

    public void setTextOff(CharSequence charsequence)
    {
        mTextOff = charsequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charsequence)
    {
        mTextOn = charsequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable)
    {
        mThumbDrawable = drawable;
        requestLayout();
    }

    public void setThumbResource(int i)
    {
        setThumbDrawable(mTintManager.getDrawable(i));
    }

    public void setThumbTextPadding(int i)
    {
        mThumbTextPadding = i;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable)
    {
        mTrackDrawable = drawable;
        requestLayout();
    }

    public void setTrackResource(int i)
    {
        setTrackDrawable(mTintManager.getDrawable(i));
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == mThumbDrawable || drawable == mTrackDrawable;
    }

    static 
    {
        TEXT_APPEARANCE_ATTRS = (new int[] {
            0x1010098, 0x1010095, android.support.v7.appcompat.R.attr.textAllCaps
        });
    }

}
