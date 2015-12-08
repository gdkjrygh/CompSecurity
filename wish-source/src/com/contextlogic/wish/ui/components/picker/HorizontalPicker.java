// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.picker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.contextlogic.wish.cache.TransientCache;
import java.lang.ref.WeakReference;
import java.util.List;

public class HorizontalPicker extends View
{
    private static final class Marquee extends Handler
    {

        private static final int MARQUEE_DELAY = 1200;
        private static final float MARQUEE_DELTA_MAX = 0.07F;
        private static final int MARQUEE_PIXELS_PER_SECOND = 30;
        private static final int MARQUEE_RESOLUTION = 33;
        private static final int MARQUEE_RESTART_DELAY = 1200;
        private static final byte MARQUEE_RUNNING = 2;
        private static final byte MARQUEE_STARTING = 1;
        private static final byte MARQUEE_STOPPED = 0;
        private static final int MESSAGE_RESTART = 3;
        private static final int MESSAGE_START = 1;
        private static final int MESSAGE_TICK = 2;
        private float mFadeStop;
        private float mGhostOffset;
        private float mGhostStart;
        private final WeakReference mLayout;
        private float mMaxFadeScroll;
        private float mMaxScroll;
        private int mRepeatLimit;
        private boolean mRtl;
        private float mScroll;
        private final float mScrollUnit;
        private byte mStatus;
        private final WeakReference mView;

        private void resetScroll()
        {
            mScroll = 0.0F;
            HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
            if (horizontalpicker != null)
            {
                horizontalpicker.invalidate();
            }
        }

        float getGhostOffset()
        {
            return mGhostOffset;
        }

        float getMaxFadeScroll()
        {
            return mMaxFadeScroll;
        }

        float getScroll()
        {
            return mScroll;
        }

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 3: default 32
        //                       1 33
        //                       2 43
        //                       3 48;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            mStatus = 2;
            tick();
            return;
_L3:
            tick();
            return;
_L4:
            if (mStatus == 2)
            {
                if (mRepeatLimit >= 0)
                {
                    mRepeatLimit = mRepeatLimit - 1;
                }
                start(mRepeatLimit);
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        boolean isRunning()
        {
            return mStatus == 2;
        }

        boolean isStopped()
        {
            return mStatus == 0;
        }

        boolean shouldDrawGhost()
        {
            return mStatus == 2 && Math.abs(mScroll) > mGhostStart;
        }

        boolean shouldDrawLeftFade()
        {
            return mScroll <= mFadeStop;
        }

        void start(int i)
        {
            if (i == 0)
            {
                stop();
            } else
            {
                mRepeatLimit = i;
                HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
                Layout layout = (Layout)mLayout.get();
                if (horizontalpicker != null && layout != null)
                {
                    mStatus = 1;
                    mScroll = 0.0F;
                    i = horizontalpicker.mItemWidth;
                    float f = layout.getLineWidth(0);
                    float f1 = (float)i / 3F;
                    mGhostStart = (f - (float)i) + f1;
                    mMaxScroll = mGhostStart + (float)i;
                    mGhostOffset = f + f1;
                    mFadeStop = (float)i / 6F + f;
                    mMaxFadeScroll = mGhostStart + f + f;
                    if (mRtl)
                    {
                        mGhostOffset = mGhostOffset * -1F;
                    }
                    horizontalpicker.invalidate();
                    sendEmptyMessageDelayed(1, 1200L);
                    return;
                }
            }
        }

        void stop()
        {
            mStatus = 0;
            removeMessages(1);
            removeMessages(3);
            removeMessages(2);
            resetScroll();
        }

        void tick()
        {
            if (mStatus == 2)
            {
                removeMessages(2);
                HorizontalPicker horizontalpicker = (HorizontalPicker)mView.get();
                Layout layout = (Layout)mLayout.get();
                if (horizontalpicker != null && layout != null && (horizontalpicker.isFocused() || horizontalpicker.isSelected()))
                {
                    mScroll = mScroll + mScrollUnit;
                    if (Math.abs(mScroll) > mMaxScroll)
                    {
                        mScroll = mMaxScroll;
                        if (mRtl)
                        {
                            mScroll = mScroll * -1F;
                        }
                        sendEmptyMessageDelayed(3, 1200L);
                    } else
                    {
                        sendEmptyMessageDelayed(2, 33L);
                    }
                    horizontalpicker.invalidate();
                    return;
                }
            }
        }

        Marquee(HorizontalPicker horizontalpicker, Layout layout, boolean flag)
        {
            mStatus = 0;
            float f = (30F * horizontalpicker.getContext().getResources().getDisplayMetrics().density) / 33F;
            if (flag)
            {
                mScrollUnit = -f;
            } else
            {
                mScrollUnit = f;
            }
            mView = new WeakReference(horizontalpicker);
            mLayout = new WeakReference(layout);
            mRtl = flag;
        }
    }

    public static interface OnItemSelected
    {

        public abstract void onItemSelected(int i);
    }

    private static class PickerTouchHelper extends ExploreByTouchHelper
    {

        private HorizontalPicker mPicker;

        protected int getVirtualViewAt(float f, float f1)
        {
            f1 = (float)mPicker.mItemWidth + mPicker.mDividerSize;
            f = (((float)mPicker.getScrollX() + f) - (float)mPicker.mSideItems * f1) / f1;
            if (f < 0.0F || f > (float)mPicker.mValues.length)
            {
                return 0x80000000;
            } else
            {
                return (int)f;
            }
        }

        protected void getVisibleVirtualViews(List list)
        {
            int k;
            int i1;
            float f = (float)mPicker.mItemWidth + mPicker.mDividerSize;
            float f1 = (float)mPicker.getScrollX() - (float)mPicker.mSideItems * f;
            i1 = (int)(f1 / f);
            int i = mPicker.mSideItems * 2 + 1;
            k = i;
            if (f1 % f != 0.0F)
            {
                k = i + 1;
            }
            if (i1 >= 0) goto _L2; else goto _L1
_L1:
            int j;
            int l;
            j = k + i1;
            l = 0;
_L4:
            for (k = 0; k < j; k++)
            {
                list.add(Integer.valueOf(l + k));
            }

            break; /* Loop/switch isn't completed */
_L2:
            l = i1;
            j = k;
            if (i1 + k > mPicker.mValues.length)
            {
                j = mPicker.mValues.length - i1;
                l = i1;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected boolean onPerformActionForVirtualView(int i, int j, Bundle bundle)
        {
            return false;
        }

        protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent)
        {
            accessibilityevent.setContentDescription(mPicker.mValues[i]);
        }

        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            float f = (float)mPicker.mItemWidth + mPicker.mDividerSize;
            float f1 = mPicker.getScrollX();
            float f2 = mPicker.mSideItems;
            int j = (int)((float)i * f - (f1 - f2 * f));
            int k = mPicker.mItemWidth;
            accessibilitynodeinfocompat.setContentDescription(mPicker.mValues[i]);
            accessibilitynodeinfocompat.setBoundsInParent(new Rect(j, 0, j + k, mPicker.getHeight()));
            accessibilitynodeinfocompat.addAction(16);
        }

        public PickerTouchHelper(HorizontalPicker horizontalpicker)
        {
            super(horizontalpicker);
            mPicker = horizontalpicker;
        }
    }

    public static class SavedState extends android.view.View.BaseSavedState
    {

        private int mSelItem;

        public String toString()
        {
            return (new StringBuilder()).append("HorizontalPicker.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" selItem=").append(mSelItem).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(mSelItem);
        }



/*
        static int access$002(SavedState savedstate, int i)
        {
            savedstate.mSelItem = i;
            return i;
        }

*/

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 4;
    public static final String TAG = "HorizontalTimePicker";
    private OverScroller mAdjustScrollerX;
    private android.text.BoringLayout.Metrics mBoringMetrics;
    private float mDividerSize;
    private android.text.TextUtils.TruncateAt mEllipsize;
    private OverScroller mFlingScrollerX;
    private RectF mItemClipBounds;
    private RectF mItemClipBoundsOffser;
    private int mItemWidth;
    private float mLastDownEventX;
    private BoringLayout mLayouts[];
    private Marquee mMarquee;
    private int mMarqueeRepeatLimit;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private OnItemSelected mOnItemSelected;
    private final int mOverscrollDistance;
    private int mPressedItem;
    private int mPreviousScrollerX;
    private boolean mScrollingX;
    private int mSelectedItem;
    private int mSideItems;
    private ColorStateList mTextColor;
    private TextDirectionHeuristicCompat mTextDir;
    private TextPaint mTextPaint;
    private final PickerTouchHelper mTouchHelper;
    private int mTouchSlop;
    private CharSequence mValues[];
    private VelocityTracker mVelocityTracker;

    public HorizontalPicker(Context context)
    {
        this(context, null);
    }

    public HorizontalPicker(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010003);
    }

    public HorizontalPicker(Context context, AttributeSet attributeset, int i)
    {
        Object obj;
        int k;
        super(context, attributeset, i);
        mPressedItem = -1;
        mMarqueeRepeatLimit = 3;
        mDividerSize = 0.0F;
        mSideItems = 1;
        obj = new TextPaint();
        ((TextPaint) (obj)).setAntiAlias(true);
        ((TextPaint) (obj)).setTypeface(TransientCache.getInstance().getTypefaceForStyle(getContext(), 0));
        mTextPaint = ((TextPaint) (obj));
        obj = context.getTheme().obtainStyledAttributes(attributeset, com.contextlogic.wish.R.styleable.HorizontalPicker, i, 0);
        k = mSideItems;
        float f;
        int j;
        int l;
        mTextColor = ((TypedArray) (obj)).getColorStateList(1);
        attributeset = ((TypedArray) (obj)).getTextArray(4);
        j = ((TypedArray) (obj)).getInt(7, 0x80000000);
        i = ((TypedArray) (obj)).getInt(8, 0x80000000);
        l = ((TypedArray) (obj)).getInt(2, 3);
        mMarqueeRepeatLimit = ((TypedArray) (obj)).getInt(3, mMarqueeRepeatLimit);
        mDividerSize = ((TypedArray) (obj)).getDimension(5, mDividerSize);
        k = ((TypedArray) (obj)).getInt(6, k);
        f = ((TypedArray) (obj)).getDimension(0, -1F);
        if (f <= -1F)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        setTextSize(f);
        ((TypedArray) (obj)).recycle();
        l;
        JVM INSTR tableswitch 1 4: default 232
    //                   1 482
    //                   2 492
    //                   3 502
    //                   4 512;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        obj = mTextPaint.getFontMetricsInt();
        mBoringMetrics = new android.text.BoringLayout.Metrics();
        mBoringMetrics.ascent = ((android.graphics.Paint.FontMetricsInt) (obj)).ascent;
        mBoringMetrics.bottom = ((android.graphics.Paint.FontMetricsInt) (obj)).bottom;
        mBoringMetrics.descent = ((android.graphics.Paint.FontMetricsInt) (obj)).descent;
        mBoringMetrics.leading = ((android.graphics.Paint.FontMetricsInt) (obj)).leading;
        mBoringMetrics.top = ((android.graphics.Paint.FontMetricsInt) (obj)).top;
        mBoringMetrics.width = mItemWidth;
        setWillNotDraw(false);
        mFlingScrollerX = new OverScroller(context);
        mAdjustScrollerX = new OverScroller(context, new DecelerateInterpolator(2.5F));
        context = ViewConfiguration.get(context);
        mTouchSlop = context.getScaledTouchSlop();
        mMinimumFlingVelocity = context.getScaledMinimumFlingVelocity();
        mMaximumFlingVelocity = context.getScaledMaximumFlingVelocity() / 4;
        mOverscrollDistance = context.getScaledOverscrollDistance();
        mPreviousScrollerX = 0x80000000;
        context = attributeset;
        if (attributeset == null)
        {
            context = attributeset;
            if (j != 0x80000000)
            {
                context = attributeset;
                if (i != 0x7fffffff)
                {
                    context = attributeset;
                    if (j < i)
                    {
                        attributeset = new String[(i - j) + 1];
                        i = 0;
                        do
                        {
                            context = attributeset;
                            if (i >= attributeset.length)
                            {
                                break;
                            }
                            attributeset[i] = String.valueOf(i + j);
                            i++;
                        } while (true);
                    }
                }
            }
        }
        break; /* Loop/switch isn't completed */
        context;
        ((TypedArray) (obj)).recycle();
        throw context;
_L2:
        setEllipsize(android.text.TextUtils.TruncateAt.START);
        continue; /* Loop/switch isn't completed */
_L3:
        setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        continue; /* Loop/switch isn't completed */
_L4:
        setEllipsize(android.text.TextUtils.TruncateAt.END);
        continue; /* Loop/switch isn't completed */
_L5:
        setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        if (true) goto _L1; else goto _L6
_L6:
        setValues(context);
        setSideItems(k);
        mTouchHelper = new PickerTouchHelper(this);
        ViewCompat.setAccessibilityDelegate(this, mTouchHelper);
        return;
    }

    private void adjustToNearestItemX()
    {
        int j;
        int k;
        k = getScrollX();
        j = Math.round((float)k / ((float)mItemWidth + mDividerSize * 1.0F));
        if (j >= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        mSelectedItem = i;
        j = mItemWidth;
        int l = (int)mDividerSize;
        mAdjustScrollerX.startScroll(k, 0, (j + l) * i - k, 0, 800);
        invalidate();
        return;
_L2:
        i = j;
        if (j > mValues.length)
        {
            i = mValues.length;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Object argbEvaluate(float f, Object obj, Object obj1)
    {
        int l = ((Integer)obj).intValue();
        int i = l >> 24 & 0xff;
        int j = l >> 16 & 0xff;
        int k = l >> 8 & 0xff;
        l &= 0xff;
        int i1 = ((Integer)obj1).intValue();
        return Integer.valueOf((int)((float)((i1 >> 24 & 0xff) - i) * f) + i << 24 | (int)((float)((i1 >> 16 & 0xff) - j) * f) + j << 16 | (int)((float)((i1 >> 8 & 0xff) - k) * f) + k << 8 | (int)((float)((i1 & 0xff) - l) * f) + l);
    }

    private void calculateItemSize(int i, int j)
    {
        int k = mSideItems * 2 + 1;
        mItemWidth = (i - (int)mDividerSize * (k - 1)) / k;
        mItemClipBounds = new RectF(0.0F, 0.0F, mItemWidth, j);
        mItemClipBoundsOffser = new RectF(mItemClipBounds);
        scrollToItem(mSelectedItem);
        remakeLayout();
        startMarqueeIfNeeded();
    }

    private void computeScrollX()
    {
        OverScroller overscroller;
        OverScroller overscroller1;
        overscroller1 = mFlingScrollerX;
        overscroller = overscroller1;
        if (!overscroller1.isFinished()) goto _L2; else goto _L1
_L1:
        overscroller1 = mAdjustScrollerX;
        overscroller = overscroller1;
        if (!overscroller1.isFinished()) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (overscroller.computeScrollOffset())
        {
            int i = overscroller.getCurrX();
            if (mPreviousScrollerX == 0x80000000)
            {
                mPreviousScrollerX = overscroller.getStartX();
            }
            getScrollRange();
            overScrollBy(i - mPreviousScrollerX, 0, mPreviousScrollerX, getScrollY(), getScrollRange(), 0, mOverscrollDistance, 0, false);
            mPreviousScrollerX = i;
            if (overscroller.isFinished())
            {
                onScrollerFinishedX(overscroller);
            }
            postInvalidate();
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void finishScrolling()
    {
        adjustToNearestItemX();
        mScrollingX = false;
        startMarqueeIfNeeded();
    }

    private void flingX(int i)
    {
        mPreviousScrollerX = 0x80000000;
        OverScroller overscroller = mFlingScrollerX;
        int j = getScrollX();
        int k = getScrollY();
        i = -i;
        int l = (int)((float)mItemWidth + mDividerSize);
        overscroller.fling(j, k, i, 0, 0, (mValues.length - 1) * l, 0, 0, getWidth() / 2, 0);
        invalidate();
    }

    private int getColor(int i, int j)
    {
        int k = (int)((float)mItemWidth + mDividerSize);
        float f = Math.abs(((1.0F * (float)i) % (float)k) / 2.0F / ((float)k / 2.0F));
        if ((double)f > 0.5D)
        {
            f -= 0.5F;
        } else
        {
            f = 0.5F - f;
        }
        if (mPressedItem == j)
        {
            ColorStateList colorstatelist = mTextColor;
            i = mTextColor.getDefaultColor();
            i = colorstatelist.getColorForState(new int[] {
                0x10100a7
            }, i);
            j = mTextColor.getColorForState(new int[] {
                0x10100a7, 0x10100a1
            }, i);
        } else
        {
            i = mTextColor.getDefaultColor();
            j = mTextColor.getColorForState(new int[] {
                0x10100a1
            }, i);
        }
        return ((Integer)argbEvaluate(f * 2.0F, Integer.valueOf(j), Integer.valueOf(i))).intValue();
    }

    private int getInBoundsX(int i)
    {
        int j;
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = i;
            if (i > (mItemWidth + (int)mDividerSize) * (mValues.length - 1))
            {
                return (mItemWidth + (int)mDividerSize) * (mValues.length - 1);
            }
        }
        return j;
    }

    private int getPositionFromCoordinates(int i)
    {
        return Math.round((float)i / ((float)mItemWidth + mDividerSize));
    }

    private int getPositionFromTouch(float f)
    {
        return getPositionFromCoordinates((int)(((float)getScrollX() - ((float)mItemWidth + mDividerSize) * ((float)mSideItems + 0.5F)) + f));
    }

    private int getPositionOnScreen(float f)
    {
        return (int)(f / ((float)mItemWidth + mDividerSize));
    }

    private int getRelativeInBound(int i)
    {
        int j = getScrollX();
        return getInBoundsX(j + i) - j;
    }

    private int getScrollRange()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (mValues != null)
        {
            i = ((flag) ? 1 : 0);
            if (mValues.length != 0)
            {
                i = Math.max(0, (mItemWidth + (int)mDividerSize) * (mValues.length - 1));
            }
        }
        return i;
    }

    private int getTextColor(int i)
    {
        int j = getScrollX();
        int k = mTextColor.getDefaultColor();
        int l = (int)((float)mItemWidth + mDividerSize);
        if (j > l * i - l / 2 && j < (i + 1) * l - l / 2)
        {
            j = getColor(j - l / 2, i);
        } else
        {
            j = k;
            if (i == mPressedItem)
            {
                return mTextColor.getColorForState(new int[] {
                    0x10100a7
                }, k);
            }
        }
        return j;
    }

    private TextDirectionHeuristicCompat getTextDirectionHeuristic()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            return TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        if (getLayoutDirection() != 1)
        {
            flag = false;
        }
        switch (getTextDirection())
        {
        default:
            if (flag)
            {
                return TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
            } else
            {
                return TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
            }

        case 2: // '\002'
            return TextDirectionHeuristicsCompat.ANYRTL_LTR;

        case 3: // '\003'
            return TextDirectionHeuristicsCompat.LTR;

        case 4: // '\004'
            return TextDirectionHeuristicsCompat.RTL;

        case 5: // '\005'
            return TextDirectionHeuristicsCompat.LOCALE;
        }
    }

    private boolean isRtl(CharSequence charsequence)
    {
        if (mTextDir == null)
        {
            mTextDir = getTextDirectionHeuristic();
        }
        return mTextDir.isRtl(charsequence, 0, charsequence.length());
    }

    private void onScrollerFinishedX(OverScroller overscroller)
    {
        if (overscroller == mFlingScrollerX)
        {
            finishScrolling();
        }
    }

    private void remakeLayout()
    {
        if (mLayouts != null && mLayouts.length > 0 && getWidth() > 0)
        {
            for (int i = 0; i < mLayouts.length; i++)
            {
                mLayouts[i].replaceOrMake(mValues[i], mTextPaint, mItemWidth, android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 1.0F, mBoringMetrics, false, mEllipsize, mItemWidth);
            }

        }
    }

    private void scrollToItem(int i)
    {
        scrollTo((mItemWidth + (int)mDividerSize) * i, 0);
        invalidate();
    }

    private void selectItem()
    {
        if (mOnItemSelected != null)
        {
            mOnItemSelected.onItemSelected(getSelectedItem());
        }
        adjustToNearestItemX();
    }

    private void setTextSize(float f)
    {
        if (f != mTextPaint.getTextSize())
        {
            mTextPaint.setTextSize(f);
            requestLayout();
            invalidate();
        }
    }

    private void smoothScrollBy(int i)
    {
        i = getRelativeInBound((mItemWidth + (int)mDividerSize) * i);
        mFlingScrollerX.startScroll(getScrollX(), 0, i, 0);
        stopMarqueeIfNeeded();
        invalidate();
    }

    private void startMarqueeIfNeeded()
    {
        stopMarqueeIfNeeded();
        int i = getSelectedItem();
        BoringLayout boringlayout = mLayouts[i];
        if (mEllipsize == android.text.TextUtils.TruncateAt.MARQUEE && (float)mItemWidth < boringlayout.getLineWidth(0))
        {
            mMarquee = new Marquee(this, boringlayout, isRtl(mValues[i]));
            mMarquee.start(mMarqueeRepeatLimit);
        }
    }

    private void stopMarqueeIfNeeded()
    {
        if (mMarquee != null)
        {
            mMarquee.stop();
            mMarquee = null;
        }
    }

    public void computeScroll()
    {
        computeScrollX();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
    }

    public android.text.TextUtils.TruncateAt getEllipsize()
    {
        return mEllipsize;
    }

    public void getFocusedRect(Rect rect)
    {
        super.getFocusedRect(rect);
    }

    public int getMarqueeRepeatLimit()
    {
        return mMarqueeRepeatLimit;
    }

    public int getSelectedItem()
    {
        return getPositionFromCoordinates(getScrollX());
    }

    public int getSideItems()
    {
        return mSideItems;
    }

    public CharSequence[] getValues()
    {
        return mValues;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j = canvas.getSaveCount();
        canvas.save();
        int k = mSelectedItem;
        float f2 = (float)mItemWidth + mDividerSize;
        canvas.translate((float)mSideItems * f2, 0.0F);
        int i = 0;
        while (i < mValues.length) 
        {
            mTextPaint.setColor(getTextColor(i));
            BoringLayout boringlayout = mLayouts[i];
            int l = canvas.getSaveCount();
            canvas.save();
            float f = 0.0F;
            float f1 = boringlayout.getLineWidth(0);
            RectF rectf;
            if (f1 > (float)mItemWidth)
            {
                if (isRtl(mValues[i]))
                {
                    f = 0.0F + (f1 - (float)mItemWidth) / 2.0F;
                } else
                {
                    f = 0.0F - (f1 - (float)mItemWidth) / 2.0F;
                }
            }
            f1 = f;
            if (mMarquee != null)
            {
                f1 = f;
                if (i == k)
                {
                    f1 = f + mMarquee.getScroll();
                }
            }
            if (getHeight() == 0)
            {
                f = mItemClipBounds.height();
            } else
            {
                f = getHeight();
            }
            canvas.translate(-f1, (f - (float)boringlayout.getHeight()) / 2.0F);
            if (f1 == 0.0F)
            {
                rectf = mItemClipBounds;
            } else
            {
                rectf = mItemClipBoundsOffser;
                rectf.set(mItemClipBounds);
                rectf.offset(f1, 0.0F);
            }
            canvas.clipRect(rectf);
            boringlayout.draw(canvas);
            if (mMarquee != null && i == k && mMarquee.shouldDrawGhost())
            {
                canvas.translate(mMarquee.getGhostOffset(), 0.0F);
                boringlayout.draw(canvas);
            }
            canvas.restoreToCount(l);
            canvas.translate(f2, 0.0F);
            i++;
        }
        canvas.restoreToCount(j);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (!isEnabled())
        {
            return super.onKeyDown(i, keyevent);
        }
        switch (i)
        {
        default:
            return super.onKeyDown(i, keyevent);

        case 23: // '\027'
        case 66: // 'B'
            selectItem();
            return true;

        case 21: // '\025'
            smoothScrollBy(-1);
            return true;

        case 22: // '\026'
            smoothScrollBy(1);
            return true;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getMode(j);
        int k = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getSize(j);
        if (l != 0x40000000)
        {
            android.graphics.Paint.FontMetrics fontmetrics = mTextPaint.getFontMetrics();
            j = (int)(Math.abs(fontmetrics.ascent) + Math.abs(fontmetrics.descent)) + (getPaddingTop() + getPaddingBottom());
            if (l == 0x80000000)
            {
                i = Math.min(i, j);
            } else
            {
                i = j;
            }
        }
        setMeasuredDimension(k, i);
    }

    protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
    {
        super.scrollTo(i, j);
        if (!mFlingScrollerX.isFinished() && flag)
        {
            mFlingScrollerX.springBack(i, j, 0, getScrollRange(), 0, 0);
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            setSelectedItem(((SavedState) (parcelable)).mSelItem);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.mSelItem = mSelectedItem;
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        calculateItemSize(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 64
    //                   0 182
    //                   1 273
    //                   2 66
    //                   3 334;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L4:
        getParent().requestDisallowInterceptTouchEvent(true);
        float f = motionevent.getX();
        int i = (int)(mLastDownEventX - f);
        if (mScrollingX || Math.abs(i) > mTouchSlop)
        {
            if (!mScrollingX)
            {
                i = 0;
                mPressedItem = -1;
                mScrollingX = true;
                stopMarqueeIfNeeded();
            }
            int l = getScrollRange();
            if (overScrollBy(i, 0, getScrollX(), 0, l, 0, mOverscrollDistance, 0, true))
            {
                mVelocityTracker.clear();
            }
            mLastDownEventX = f;
            invalidate();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!mAdjustScrollerX.isFinished())
        {
            mAdjustScrollerX.forceFinished(true);
        } else
        if (!mFlingScrollerX.isFinished())
        {
            mFlingScrollerX.forceFinished(true);
        } else
        {
            mScrollingX = false;
        }
        mLastDownEventX = motionevent.getX();
        if (!mScrollingX)
        {
            mPressedItem = getPositionFromTouch(motionevent.getX());
        }
        invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        VelocityTracker velocitytracker = mVelocityTracker;
        velocitytracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
        int j = (int)velocitytracker.getXVelocity();
        if (mScrollingX && Math.abs(j) > mMinimumFlingVelocity)
        {
            flingX(j);
        } else
        {
            float f1 = motionevent.getX();
            if (!mScrollingX)
            {
                int k = getPositionOnScreen(f1) - mSideItems;
                if (k == 0)
                {
                    selectItem();
                } else
                {
                    smoothScrollBy(k);
                }
            } else
            if (mScrollingX)
            {
                finishScrolling();
            }
        }
        mVelocityTracker.recycle();
        mVelocityTracker = null;
_L5:
        mPressedItem = -1;
        invalidate();
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void scrollBy(int i, int j)
    {
        super.scrollBy(i, 0);
    }

    public void scrollTo(int i, int j)
    {
        super.scrollTo(i, j);
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
    {
        if (mEllipsize != truncateat)
        {
            mEllipsize = truncateat;
            remakeLayout();
            invalidate();
        }
    }

    public void setMarqueeRepeatLimit(int i)
    {
        mMarqueeRepeatLimit = i;
    }

    public void setOnItemSelectedListener(OnItemSelected onitemselected)
    {
        mOnItemSelected = onitemselected;
    }

    public void setOverScrollMode(int i)
    {
        super.setOverScrollMode(i);
    }

    public void setSelectedItem(int i)
    {
        mSelectedItem = i;
        scrollToItem(i);
    }

    public void setSideItems(int i)
    {
        if (mSideItems < 0)
        {
            throw new IllegalArgumentException("Number of items on each side must be grater or equal to 0.");
        }
        if (mSideItems != i)
        {
            mSideItems = i;
            calculateItemSize(getWidth(), getHeight());
        }
    }

    public void setValues(CharSequence acharsequence[])
    {
        if (mValues != acharsequence)
        {
            mValues = acharsequence;
            if (mValues == null)
            {
                mValues = new CharSequence[0];
            }
            mLayouts = new BoringLayout[mValues.length];
            for (int i = 0; i < mLayouts.length; i++)
            {
                mLayouts[i] = new BoringLayout(mValues[i], mTextPaint, mItemWidth, android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 1.0F, mBoringMetrics, false, mEllipsize, mItemWidth);
            }

            if (getWidth() > 0)
            {
                startMarqueeIfNeeded();
            }
            requestLayout();
            invalidate();
        }
    }




}
