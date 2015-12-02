// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            PagerAdapter, ViewCompat, MotionEventCompat, KeyEventCompat, 
//            ViewConfigurationCompat, VelocityTrackerCompat

public class ViewPager extends ViewGroup
{

    private static final Comparator COMPARATOR;
    private static final int LAYOUT_ATTRS[];
    public static boolean a;
    private static final Interpolator sInterpolator;
    private static final ViewPositionComparator sPositionComparator;
    private static final String z[];
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public ViewPager(Context context)
    {
        super(context);
        mItems = new ArrayList();
        mTempItem = new ItemInfo();
        mTempRect = new Rect();
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
        mFirstOffset = -3.402823E+38F;
        mLastOffset = 3.402823E+38F;
        mOffscreenPageLimit = 1;
        mActivePointerId = -1;
        mFirstLayout = true;
        mNeedCalculatePageOffsets = false;
        mEndScrollRunnable = new _cls3();
        mScrollState = 0;
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mItems = new ArrayList();
        mTempItem = new ItemInfo();
        mTempRect = new Rect();
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
        mFirstOffset = -3.402823E+38F;
        mLastOffset = 3.402823E+38F;
        mOffscreenPageLimit = 1;
        mActivePointerId = -1;
        mFirstLayout = true;
        mNeedCalculatePageOffsets = false;
        mEndScrollRunnable = new _cls3();
        mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
    {
        float f;
        float f1;
        float f2;
        int j;
        int k;
        int l;
        boolean flag = a;
        int i1 = mAdapter.getCount();
        j = getClientWidth();
        if (j > 0)
        {
            float f3;
            Object obj;
            ItemInfo iteminfo2;
            int j1;
            try
            {
                k = mPageMargin;
            }
            // Misplaced declaration of an exception variable
            catch (ItemInfo iteminfo)
            {
                throw iteminfo;
            }
            f1 = (float)k / (float)j;
        } else
        {
            f1 = 0.0F;
        }
        if (iteminfo1 == null) goto _L2; else goto _L1
_L1:
        j1 = iteminfo1.position;
        if (j1 >= iteminfo.position) goto _L4; else goto _L3
_L3:
        l = 0;
        f = iteminfo1.offset + iteminfo1.widthFactor + f1;
        k = j1 + 1;
_L35:
        if (k > iteminfo.position || l >= mItems.size()) goto _L6; else goto _L5
_L5:
        obj = (ItemInfo)mItems.get(l);
        do
        {
            iteminfo2 = ((ItemInfo) (obj));
            j = l;
            if (k <= ((ItemInfo) (obj)).position)
            {
                break;
            }
            iteminfo2 = ((ItemInfo) (obj));
            j = l;
            if (l >= mItems.size() - 1)
            {
                break;
            }
            j = l + 1;
            iteminfo2 = (ItemInfo)mItems.get(j);
            obj = iteminfo2;
            l = j;
        } while (!flag);
        do
        {
            l = k;
            f2 = f;
            if (k >= iteminfo2.position)
            {
                break;
            }
            f2 = f + (mAdapter.getPageWidth(k) + f1);
            l = k + 1;
            k = l;
            f = f2;
        } while (!flag);
        iteminfo2.offset = f2;
        f = iteminfo2.widthFactor;
        k = l + 1;
        if (!flag) goto _L7; else goto _L6
_L6:
        if (!flag) goto _L2; else goto _L4
_L4:
        try
        {
            j = iteminfo.position;
        }
        // Misplaced declaration of an exception variable
        catch (ItemInfo iteminfo)
        {
            throw iteminfo;
        }
        if (j1 <= j) goto _L2; else goto _L8
_L8:
        l = mItems.size() - 1;
        f = iteminfo1.offset;
        k = j1 - 1;
_L33:
        if (k < iteminfo.position || l < 0) goto _L2; else goto _L9
_L9:
        iteminfo1 = (ItemInfo)mItems.get(l);
        do
        {
            obj = iteminfo1;
            j = l;
            if (k >= iteminfo1.position)
            {
                break;
            }
            obj = iteminfo1;
            j = l;
            if (l <= 0)
            {
                break;
            }
            j = l - 1;
            obj = (ItemInfo)mItems.get(j);
            iteminfo1 = ((ItemInfo) (obj));
            l = j;
        } while (!flag);
        do
        {
            l = k;
            f2 = f;
            if (k <= ((ItemInfo) (obj)).position)
            {
                break;
            }
            f2 = f - (mAdapter.getPageWidth(k) + f1);
            l = k - 1;
            k = l;
            f = f2;
        } while (!flag);
        f = f2 - (((ItemInfo) (obj)).widthFactor + f1);
        obj.offset = f;
        k = l - 1;
        if (!flag) goto _L10; else goto _L2
_L2:
        j1 = mItems.size();
        f2 = iteminfo.offset;
        j = iteminfo.position - 1;
        if (iteminfo.position != 0) goto _L12; else goto _L11
_L11:
        f = iteminfo.offset;
_L27:
        mFirstOffset = f;
        if (iteminfo.position != i1 - 1) goto _L14; else goto _L13
_L13:
        f = iteminfo.offset;
        f3 = iteminfo.widthFactor;
        f = (f + f3) - 1.0F;
_L28:
        mLastOffset = f;
        k = i - 1;
        f = f2;
_L31:
        if (k < 0) goto _L16; else goto _L15
_L15:
        iteminfo1 = (ItemInfo)mItems.get(k);
_L32:
        if (j <= iteminfo1.position)
        {
            break MISSING_BLOCK_LABEL_895;
        }
        obj = mAdapter;
        l = j - 1;
        f -= ((PagerAdapter) (obj)).getPageWidth(j) + f1;
        if (!flag) goto _L18; else goto _L17
_L17:
        f -= iteminfo1.widthFactor + f1;
        try
        {
            iteminfo1.offset = f;
            if (iteminfo1.position == 0)
            {
                mFirstOffset = f;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ItemInfo iteminfo)
        {
            throw iteminfo;
        }
        j = l - 1;
        if (!flag) goto _L19; else goto _L16
_L16:
        f = iteminfo.offset + iteminfo.widthFactor + f1;
        k = iteminfo.position + 1;
        j = i + 1;
        i = k;
_L29:
        if (j >= j1) goto _L21; else goto _L20
_L20:
        iteminfo = (ItemInfo)mItems.get(j);
_L30:
        if (i >= iteminfo.position) goto _L23; else goto _L22
_L22:
        iteminfo1 = mAdapter;
        k = i + 1;
        f = iteminfo1.getPageWidth(i) + f1 + f;
        if (!flag) goto _L25; else goto _L24
_L24:
        try
        {
            if (iteminfo.position == i1 - 1)
            {
                mLastOffset = (iteminfo.widthFactor + f) - 1.0F;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ItemInfo iteminfo)
        {
            throw iteminfo;
        }
        iteminfo.offset = f;
        f2 = iteminfo.widthFactor;
        i = k + 1;
        if (!flag) goto _L26; else goto _L21
_L21:
        mNeedCalculatePageOffsets = false;
        return;
        iteminfo;
        throw iteminfo;
_L12:
        f = -3.402823E+38F;
          goto _L27
        iteminfo;
        throw iteminfo;
_L14:
        f = 3.402823E+38F;
          goto _L28
_L26:
        j++;
        f += f2 + f1;
          goto _L29
_L25:
        i = k;
          goto _L30
_L23:
        k = i;
          goto _L24
_L19:
        k--;
          goto _L31
_L18:
        j = l;
          goto _L32
        l = j;
          goto _L17
_L10:
        l = j;
        if (true) goto _L33; else goto _L7
_L7:
        f = f2 + (f + f1);
        l = j;
        if (true) goto _L35; else goto _L34
_L34:
    }

    private void completeScroll(boolean flag)
    {
        int j;
        boolean flag2 = a;
        int i;
        boolean flag1;
        try
        {
            i = mScrollState;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (i == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            setScrollingCacheEnabled(false);
            mScroller.abortAnimation();
            j = getScrollX();
            int k = getScrollY();
            int l = mScroller.getCurrX();
            int i1 = mScroller.getCurrY();
            ItemInfo iteminfo;
            if (j != l || k != i1)
            {
                try
                {
                    scrollTo(l, i1);
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception1)
                {
                    throw notfoundexception1;
                }
            }
        }
        mPopulatePending = false;
        j = 0;
_L2:
        k = ((flag1) ? 1 : 0);
        if (j < mItems.size())
        {
            iteminfo = (ItemInfo)mItems.get(j);
            if (iteminfo.scrolling)
            {
                iteminfo.scrolling = false;
                flag1 = true;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_189;
            }
            k = ((flag1) ? 1 : 0);
        }
        if (!k)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (flag)
        {
            try
            {
                ViewCompat.postOnAnimation(this, mEndScrollRunnable);
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception2)
            {
                throw notfoundexception2;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_174;
            }
        }
        mEndScrollRunnable.run();
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int determineTargetPage(int i, float f, int j, int k)
    {
        int l;
        k = Math.abs(k);
        l = mFlingDistance;
        if (k <= l) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            k = Math.abs(j);
            l = mMinimumVelocity;
        }
        // Misplaced declaration of an exception variable
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            try
            {
                throw notfoundexception;
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        }
        if (k <= l) goto _L2; else goto _L3
_L3:
        if (j > 0)
        {
            j = i;
        } else
        {
            j = i + 1;
        }
        flag = a;
        if (!flag) goto _L4; else goto _L2
_L2:
        float f1;
        ItemInfo iteminfo;
        android.content.res.Resources.NotFoundException notfoundexception;
        ItemInfo iteminfo1;
        try
        {
            j = mCurItem;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception1)
        {
            throw notfoundexception1;
        }
        if (i >= j)
        {
            f1 = 0.4F;
        } else
        {
            f1 = 0.6F;
        }
        i = (int)(f1 + ((float)i + f));
_L6:
        j = i;
        if (mItems.size() > 0)
        {
            iteminfo = (ItemInfo)mItems.get(0);
            iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
            j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
        }
        return j;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
_L4:
        i = j;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void enableLayers(boolean flag)
    {
        boolean flag1 = a;
        int j = getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    byte byte0;
                    if (flag)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 0;
                    }
                    ViewCompat.setLayerType(getChildAt(i), byte0, null);
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    private void endDrag()
    {
        try
        {
            mIsBeingDragged = false;
            mIsUnableToDrag = false;
            if (mVelocityTracker != null)
            {
                mVelocityTracker.recycle();
                mVelocityTracker = null;
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view)
    {
        boolean flag = a;
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            try
            {
                rect.set(0, 0, 0, 0);
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                throw rect;
            }
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        view = view.getParent();
        do
        {
            if (!(view instanceof ViewGroup) || view == this)
            {
                break;
            }
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
            view = view.getParent();
        } while (!flag);
        return rect;
    }

    private int getClientWidth()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition()
    {
        float f3;
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        boolean flag;
        flag = a;
        i = getClientWidth();
        float f;
        float f1;
        if (i > 0)
        {
            float f2;
            int l;
            try
            {
                j = getScrollX();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            f = (float)j / (float)i;
        } else
        {
            f = 0.0F;
        }
        if (i > 0)
        {
            try
            {
                j = mPageMargin;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            f1 = (float)j / (float)i;
        } else
        {
            f1 = 0.0F;
        }
        f3 = 0.0F;
        f2 = 0.0F;
        k = -1;
        i = 0;
        j = 1;
        obj1 = null;
_L8:
        if (i >= mItems.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ItemInfo)mItems.get(i);
        if (j == 0)
        {
            try
            {
                l = ((ItemInfo) (obj)).position;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (l != k + 1)
            {
                obj = mTempItem;
                obj.offset = f3 + f2 + f1;
                obj.position = k + 1;
                obj.widthFactor = mAdapter.getPageWidth(((ItemInfo) (obj)).position);
                i--;
            }
        }
        f2 = ((ItemInfo) (obj)).offset;
        f3 = ((ItemInfo) (obj)).widthFactor;
        if (j == 0 && f < f2) goto _L2; else goto _L1
_L1:
        if (f < f3 + f2 + f1) goto _L4; else goto _L3
_L3:
        try
        {
            j = mItems.size();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i != j - 1) goto _L5; else goto _L4
_L4:
        return ((ItemInfo) (obj));
_L2:
        return ((ItemInfo) (obj1));
_L5:
        k = ((ItemInfo) (obj)).position;
        f3 = ((ItemInfo) (obj)).widthFactor;
        if (flag) goto _L4; else goto _L6
_L6:
        j = 0;
        i++;
        obj1 = obj;
        if (true) goto _L8; else goto _L7
_L7:
        return ((ItemInfo) (obj1));
    }

    private boolean isGutterDrag(float f, float f1)
    {
        int i = mGutterSize;
        if (f >= (float)i || f1 <= 0.0F)
        {
            android.content.res.Resources.NotFoundException notfoundexception;
            int j;
            int k;
            try
            {
                j = getWidth();
                k = mGutterSize;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                try
                {
                    throw notfoundexception1;
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception2)
                {
                    throw notfoundexception2;
                }
            }
            if (f <= (float)(j - k) || f1 >= 0.0F)
            {
                break MISSING_BLOCK_LABEL_63;
            }
        }
        return true;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
        return false;
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionIndex(motionevent);
        int j = MotionEventCompat.getPointerId(motionevent, i);
        int k;
        try
        {
            k = mActivePointerId;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        if (j != k)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mLastMotionX = MotionEventCompat.getX(motionevent, i);
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        if (mVelocityTracker != null)
        {
            mVelocityTracker.clear();
        }
        return;
        motionevent;
        throw motionevent;
    }

    private boolean pageScrolled(int i)
    {
        boolean flag = false;
        int j = mItems.size();
        android.content.res.Resources.NotFoundException notfoundexception1;
        if (j == 0)
        {
            try
            {
                mCalledSuper = false;
                onPageScrolled(0, 0.0F, 0);
                if (!mCalledSuper)
                {
                    throw new IllegalStateException(z[6]);
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        } else
        {
            ItemInfo iteminfo = infoForCurrentScrollPosition();
            int l = getClientWidth();
            int i1 = mPageMargin;
            float f = (float)mPageMargin / (float)l;
            int k = iteminfo.position;
            f = ((float)i / (float)l - iteminfo.offset) / (iteminfo.widthFactor + f);
            i = (int)((float)(i1 + l) * f);
            try
            {
                mCalledSuper = false;
                onPageScrolled(k, f, i);
                if (!mCalledSuper)
                {
                    throw new IllegalStateException(z[5]);
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception2)
            {
                throw notfoundexception2;
            }
            flag = true;
        }
        break MISSING_BLOCK_LABEL_157;
        notfoundexception1;
        throw notfoundexception1;
        return flag;
    }

    private boolean performDrag(float f)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        float f1 = mLastMotionX;
        mLastMotionX = f;
        float f2 = (float)getScrollX() + (f1 - f);
        int i = getClientWidth();
        f = (float)i * mFirstOffset;
        f1 = i;
        float f3 = mLastOffset;
        ItemInfo iteminfo = (ItemInfo)mItems.get(0);
        ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
        android.content.res.Resources.NotFoundException notfoundexception;
        boolean flag;
        boolean flag3;
        if (iteminfo.position != 0)
        {
            f = iteminfo.offset * (float)i;
            flag = false;
        } else
        {
            flag = true;
        }
        if (iteminfo1.position != mAdapter.getCount() - 1)
        {
            f1 = iteminfo1.offset * (float)i;
            flag1 = false;
        } else
        {
            f1 *= f3;
        }
        if (f2 >= f) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            flag2 = mLeftEdge.onPull(Math.abs(f - f2) / (float)i);
        }
        try
        {
            flag3 = a;
        }
        // Misplaced declaration of an exception variable
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            try
            {
                throw notfoundexception;
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        }
        if (!flag3) goto _L4; else goto _L3
_L3:
        flag3 = flag2;
        f2 = f;
        if (f > f1)
        {
            if (flag1)
            {
                flag2 = mRightEdge.onPull(Math.abs(f - f1) / (float)i);
            }
            f2 = f1;
            flag3 = flag2;
        }
_L5:
        mLastMotionX = mLastMotionX + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        pageScrolled((int)f2);
        return flag3;
_L4:
        flag3 = flag2;
        f2 = f;
        if (true) goto _L5; else goto _L2
_L2:
        f = f2;
        flag2 = false;
        if (true) goto _L3; else goto _L6
_L6:
    }

    private void recomputeScrollPosition(int i, int j, int k, int l)
    {
        float f1;
        if (j > 0)
        {
            ItemInfo iteminfo1;
            boolean flag;
            try
            {
                flag = mItems.isEmpty();
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
            if (!flag)
            {
                int i1 = getPaddingLeft();
                int j1 = getPaddingRight();
                int k1 = getPaddingLeft();
                int l1 = getPaddingRight();
                float f = (float)getScrollX() / (float)((j - k1 - l1) + l);
                j = (int)((float)((i - i1 - j1) + k) * f);
                scrollTo(j, getScrollY());
                if (!mScroller.isFinished())
                {
                    k = mScroller.getDuration();
                    l = mScroller.timePassed();
                    ItemInfo iteminfo = infoForPosition(mCurItem);
                    mScroller.startScroll(j, 0, (int)(iteminfo.offset * (float)i), 0, k - l);
                }
                if (!a)
                {
                    break MISSING_BLOCK_LABEL_219;
                }
            }
        }
        iteminfo1 = infoForPosition(mCurItem);
        if (iteminfo1 != null)
        {
            try
            {
                f1 = Math.min(iteminfo1.offset, mLastOffset);
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                throw notfoundexception1;
            }
        } else
        {
            f1 = 0.0F;
        }
        i = (int)(f1 * (float)(i - getPaddingLeft() - getPaddingRight()));
        if (i != getScrollX())
        {
            completeScroll(false);
            scrollTo(i, getScrollY());
        }
        return;
        android.content.res.Resources.NotFoundException notfoundexception2;
        notfoundexception2;
        throw notfoundexception2;
    }

    private void removeNonDecorViews()
    {
        int i;
        boolean flag;
        flag = a;
        i = 0;
_L2:
        int j;
label0:
        {
label1:
            {
                if (i >= getChildCount())
                {
                    break label0;
                }
                LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
                j = i;
                try
                {
                    if (layoutparams.isDecor)
                    {
                        break label1;
                    }
                    removeViewAt(i);
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception)
                {
                    throw notfoundexception;
                }
                j = i - 1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_54;
            }
        }
        return;
        i = j + 1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void requestParentDisallowInterceptTouchEvent(boolean flag)
    {
        ViewParent viewparent;
        viewparent = getParent();
        if (viewparent == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        viewparent.requestDisallowInterceptTouchEvent(flag);
        return;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        throw notfoundexception;
    }

    private void scrollToItem(int i, boolean flag, int j, boolean flag1)
    {
        Object obj = infoForPosition(i);
        android.content.res.Resources.NotFoundException notfoundexception;
        int k;
        if (obj != null)
        {
            float f = getClientWidth();
            k = (int)(Math.max(mFirstOffset, Math.min(((ItemInfo) (obj)).offset, mLastOffset)) * f);
        } else
        {
            k = 0;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        smoothScrollTo(k, 0, j);
        if (flag1)
        {
            try
            {
                if (mOnPageChangeListener != null)
                {
                    mOnPageChangeListener.onPageSelected(i);
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        obj = mInternalPageChangeListener;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        mInternalPageChangeListener.onPageSelected(i);
        flag = a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (flag1)
        {
            try
            {
                if (mOnPageChangeListener != null)
                {
                    mOnPageChangeListener.onPageSelected(i);
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        }
        if (flag1)
        {
            try
            {
                if (mInternalPageChangeListener != null)
                {
                    mInternalPageChangeListener.onPageSelected(i);
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
        }
        completeScroll(false);
        scrollTo(k, 0);
        pageScrolled(k);
        return;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
    }

    private void setScrollState(int i)
    {
        int j;
        try
        {
            j = mScrollState;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (j != i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        PageTransformer pagetransformer;
        try
        {
            mScrollState = i;
            pagetransformer = mPageTransformer;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception2)
        {
            try
            {
                throw notfoundexception2;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception3)
            {
                throw notfoundexception3;
            }
        }
        if (pagetransformer != null)
        {
            android.content.res.Resources.NotFoundException notfoundexception1;
            boolean flag;
            if (i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            enableLayers(flag);
        }
        if (mOnPageChangeListener == null) goto _L1; else goto _L3
_L3:
        mOnPageChangeListener.onPageScrollStateChanged(i);
        return;
        notfoundexception1;
        throw notfoundexception1;
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
        try
        {
            if (mScrollingCacheEnabled != flag)
            {
                mScrollingCacheEnabled = flag;
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    private void sortChildDrawingOrder()
    {
        boolean flag = a;
        int i = mDrawingOrder;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ArrayList arraylist = mDrawingOrderedChildren;
        if (arraylist == null)
        {
            View view;
            android.content.res.Resources.NotFoundException notfoundexception;
            int j;
            int k;
            try
            {
                mDrawingOrderedChildren = new ArrayList();
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                throw notfoundexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_46;
            }
        }
        mDrawingOrderedChildren.clear();
        k = getChildCount();
        j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            view = getChildAt(j);
            mDrawingOrderedChildren.add(view);
            j++;
        } while (!flag);
        Collections.sort(mDrawingOrderedChildren, sPositionComparator);
        return;
        notfoundexception;
        throw notfoundexception;
        notfoundexception;
        throw notfoundexception;
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        boolean flag = a;
        int l = arraylist.size();
        int i1 = getDescendantFocusability();
        if (i1 != 0x60000)
        {
            int k = 0;
            do
            {
                if (k >= getChildCount())
                {
                    break;
                }
                View view = getChildAt(k);
                if (view.getVisibility() == 0)
                {
                    ItemInfo iteminfo = infoForChild(view);
                    if (iteminfo != null)
                    {
                        try
                        {
                            if (iteminfo.position == mCurItem)
                            {
                                view.addFocusables(arraylist, i, j);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (ArrayList arraylist)
                        {
                            throw arraylist;
                        }
                    }
                }
                k++;
            } while (!flag);
        }
        if (i1 != 0x40000) goto _L2; else goto _L1
_L1:
        i = arraylist.size();
        if (l != i) goto _L3; else goto _L2
_L2:
        try
        {
            flag = isFocusable();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        return;
        arraylist;
        throw arraylist;
_L4:
        if ((j & 1) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = isInTouchMode();
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag1 = isFocusableInTouchMode();
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        if (!flag1) goto _L3; else goto _L5
_L5:
        if (arraylist == null) goto _L3; else goto _L6
_L6:
        try
        {
            arraylist.add(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw arraylist;
        }
        arraylist;
        throw arraylist;
    }

    ItemInfo addNewItem(int i, int j)
    {
        ItemInfo iteminfo = new ItemInfo();
        iteminfo.position = i;
        iteminfo.object = mAdapter.instantiateItem(this, i);
        iteminfo.widthFactor = mAdapter.getPageWidth(i);
        if (j >= 0)
        {
            android.content.res.Resources.NotFoundException notfoundexception;
            try
            {
                i = mItems.size();
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                try
                {
                    throw notfoundexception1;
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception2)
                {
                    throw notfoundexception2;
                }
            }
            if (j < i)
            {
                break MISSING_BLOCK_LABEL_70;
            }
        }
        mItems.add(iteminfo);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        mItems.add(j, iteminfo);
        return iteminfo;
        notfoundexception;
        throw notfoundexception;
    }

    public void addTouchables(ArrayList arraylist)
    {
        boolean flag = a;
        int i = 0;
        do
        {
            if (i >= getChildCount())
            {
                break;
            }
            View view = getChildAt(i);
            if (view.getVisibility() == 0)
            {
                ItemInfo iteminfo = infoForChild(view);
                if (iteminfo != null)
                {
                    try
                    {
                        if (iteminfo.position == mCurItem)
                        {
                            view.addTouchables(arraylist);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (ArrayList arraylist)
                    {
                        throw arraylist;
                    }
                }
            }
            i++;
        } while (!flag);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        LayoutParams layoutparams1;
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        layoutparams1 = (LayoutParams)layoutparams;
        boolean flag;
        layoutparams1.isDecor = layoutparams1.isDecor | (view instanceof Decor);
        flag = mInLayout;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (layoutparams1 != null)
        {
            try
            {
                if (layoutparams1.isDecor)
                {
                    throw new IllegalStateException(z[7]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        break MISSING_BLOCK_LABEL_82;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
        layoutparams1.needsMeasure = true;
        addViewInLayout(view, i, layoutparams);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        super.addView(view, i, layoutparams);
        return;
        view;
        throw view;
    }

    public boolean arrowScroll(int i)
    {
        View view;
        boolean flag4;
        flag4 = a;
        view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L18:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i != 17) goto _L6; else goto _L5
_L5:
        boolean flag2;
label0:
        {
            int j = getChildRectInPagerCoordinates(mTempRect, view).left;
            int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
            if (obj != null && j >= l)
            {
                flag2 = pageLeft();
                if (!flag4)
                {
                    break label0;
                }
            }
            flag2 = view.requestFocus();
        }
        if (!flag4) goto _L8; else goto _L7
_L7:
        if (i != 66) goto _L8; else goto _L9
_L9:
        boolean flag3;
label1:
        {
            int k = getChildRectInPagerCoordinates(mTempRect, view).left;
            int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
            if (obj != null && k <= i1)
            {
                flag3 = pageRight();
                if (!flag4)
                {
                    break label1;
                }
            }
            flag3 = view.requestFocus();
        }
        flag2 = flag3;
        if (!flag4) goto _L8; else goto _L10
_L10:
        if (i == 17) goto _L12; else goto _L11
_L11:
        flag2 = flag3;
        if (i != 1) goto _L13; else goto _L12
_L12:
        flag3 = pageLeft();
        flag2 = flag3;
        if (!flag4) goto _L8; else goto _L14
_L14:
        flag2 = flag3;
_L13:
        if (i == 66 || i == 2)
        {
            flag2 = pageRight();
        }
_L8:
        boolean flag1;
        StringBuilder stringbuilder;
        boolean flag;
        if (flag2)
        {
            try
            {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return flag2;
_L2:
        if (view == null) goto _L16; else goto _L15
_L15:
        obj = view.getParent();
        flag = false;
        do
        {
            flag1 = flag;
            if (!(obj instanceof ViewGroup))
            {
                break;
            }
            flag1 = flag;
            if (obj == this)
            {
                if (!flag4)
                {
                    break MISSING_BLOCK_LABEL_438;
                }
                flag1 = true;
            }
            obj = ((ViewParent) (obj)).getParent();
            flag = flag1;
        } while (!flag4);
_L19:
        if (flag1) goto _L16; else goto _L17
_L17:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        obj = view.getParent();
        do
        {
            if (!(obj instanceof ViewGroup))
            {
                break;
            }
            stringbuilder.append(z[17]).append(obj.getClass().getSimpleName());
            obj = ((ViewParent) (obj)).getParent();
        } while (!flag4);
        Log.e(z[18], (new StringBuilder()).append(z[16]).append(stringbuilder.toString()).toString());
        obj = null;
          goto _L18
_L6:
        flag2 = false;
          goto _L7
_L4:
        flag3 = false;
          goto _L10
_L16:
        obj = view;
          goto _L18
        flag1 = true;
          goto _L19
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        boolean flag1 = a;
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l;
        int i1;
        int j1;
        viewgroup = (ViewGroup)view;
        i1 = view.getScrollX();
        j1 = view.getScrollY();
        l = viewgroup.getChildCount() - 1;
_L6:
        if (l < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l);
        int k1 = view1.getLeft();
        if (j + i1 < k1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        k1 = view1.getRight();
        if (j + i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        k1 = view1.getTop();
        if (k + j1 < k1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        k1 = view1.getBottom();
        if (k + j1 < k1)
        {
            boolean flag2;
            try
            {
                flag2 = canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (flag2)
            {
                return true;
            }
        }
        break MISSING_BLOCK_LABEL_175;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
        if (!flag1) goto _L4; else goto _L2
_L2:
        if (flag)
        {
            i = -i;
            try
            {
                flag = ViewCompat.canScrollHorizontally(view, i);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
_L4:
        l--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean canScrollHorizontally(int i)
    {
        boolean flag2 = true;
        boolean flag = true;
        PagerAdapter pageradapter;
        try
        {
            pageradapter = mAdapter;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (pageradapter != null)
        {
            int j = getClientWidth();
            int k = getScrollX();
            if (i < 0)
            {
                float f = j;
                float f2;
                try
                {
                    f2 = mFirstOffset;
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception1)
                {
                    throw notfoundexception1;
                }
                if (k <= (int)(f * f2))
                {
                    flag = false;
                }
                return flag;
            }
            if (i > 0)
            {
                float f1 = j;
                float f3;
                boolean flag1;
                try
                {
                    f3 = mLastOffset;
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception2)
                {
                    throw notfoundexception2;
                }
                if (k < (int)(f1 * f3))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        boolean flag;
        try
        {
            flag = layoutparams instanceof LayoutParams;
        }
        // Misplaced declaration of an exception variable
        catch (android.view.ViewGroup.LayoutParams layoutparams)
        {
            try
            {
                throw layoutparams;
            }
            // Misplaced declaration of an exception variable
            catch (android.view.ViewGroup.LayoutParams layoutparams)
            {
                throw layoutparams;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (super.checkLayoutParams(layoutparams))
        {
            return true;
        }
        return false;
    }

    public void computeScroll()
    {
        boolean flag;
        try
        {
            if (mScroller.isFinished())
            {
                break MISSING_BLOCK_LABEL_106;
            }
            flag = mScroller.computeScrollOffset();
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (flag)
        {
            int i = getScrollX();
            int j = getScrollY();
            int k = mScroller.getCurrX();
            int l = mScroller.getCurrY();
            if (i != k || j != l)
            {
                try
                {
                    scrollTo(k, l);
                    if (!pageScrolled(k))
                    {
                        mScroller.abortAnimation();
                        scrollTo(0, l);
                    }
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception1)
                {
                    throw notfoundexception1;
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
        return;
    }

    void dataSetChanged()
    {
        int l2;
        boolean flag3;
        flag3 = a;
        l2 = mAdapter.getCount();
        int i;
        int j;
        mExpectedAdapterCount = l2;
        i = mItems.size();
        j = mOffscreenPageLimit;
        if (i >= j * 2 + 1) goto _L2; else goto _L1
_L1:
        Object obj;
        int k;
        int l;
        int k2;
        try
        {
            i = mItems.size();
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception1)
        {
            throw notfoundexception1;
        }
        if (i >= l2) goto _L2; else goto _L3
_L3:
        i = 1;
_L20:
        j = mCurItem;
        l = 0;
        boolean flag = false;
        k = i;
        i = j;
        j = l;
        l = ((flag) ? 1 : 0);
_L22:
        if (l >= mItems.size())
        {
            break MISSING_BLOCK_LABEL_479;
        }
        obj = (ItemInfo)mItems.get(l);
        k2 = mAdapter.getItemPosition(((ItemInfo) (obj)).object);
        if (k2 == -1 && !flag3) goto _L5; else goto _L4
_L4:
        if (k2 != -2) goto _L7; else goto _L6
_L6:
        android.content.res.Resources.NotFoundException notfoundexception;
        int j1;
        boolean flag2;
        try
        {
            mItems.remove(l);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception2)
        {
            throw notfoundexception2;
        }
        l--;
        k = j;
        if (j == 0)
        {
            mAdapter.startUpdate(this);
            k = 1;
        }
        mAdapter.destroyItem(this, ((ItemInfo) (obj)).position, ((ItemInfo) (obj)).object);
        if (mCurItem != ((ItemInfo) (obj)).position) goto _L9; else goto _L8
_L8:
        j1 = Math.max(0, Math.min(mCurItem, l2 - 1));
        i = j1;
        if (!flag3) goto _L9; else goto _L10
_L10:
        flag2 = true;
        j = l;
        l = j1;
        i = k;
        k = ((flag2) ? 1 : 0);
_L24:
        if (((ItemInfo) (obj)).position == k2) goto _L12; else goto _L11
_L11:
        k = ((ItemInfo) (obj)).position;
        j1 = mCurItem;
        if (k == j1)
        {
            l = k2;
        }
        obj.position = k2;
        j1 = j;
        j = l;
        k = 1;
        l = j1;
_L23:
        if (!flag3) goto _L14; else goto _L13
_L13:
        android.content.res.Resources.NotFoundException notfoundexception3;
        if (i != 0)
        {
            try
            {
                mAdapter.finishUpdate(this);
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception4)
            {
                throw notfoundexception4;
            }
        }
        Collections.sort(mItems, COMPARATOR);
        if (k == 0) goto _L16; else goto _L15
_L15:
        k = getChildCount();
        i = 0;
_L21:
        if (i >= k) goto _L18; else goto _L17
_L17:
        obj = (LayoutParams)getChildAt(i).getLayoutParams();
        try
        {
            if (!((LayoutParams) (obj)).isDecor)
            {
                obj.widthFactor = 0.0F;
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception5)
        {
            throw notfoundexception5;
        }
        if (!flag3) goto _L19; else goto _L18
_L18:
        setCurrentItemInternal(j, false, true);
        requestLayout();
_L16:
        return;
        notfoundexception;
        throw notfoundexception;
_L2:
        i = 0;
          goto _L20
        notfoundexception3;
        throw notfoundexception3;
_L19:
        i++;
          goto _L21
_L14:
        int k1 = j;
        l++;
        j = i;
        i = k1;
          goto _L22
_L12:
        int l1 = j;
        j = l;
        l = l1;
          goto _L23
_L9:
        j = i;
        boolean flag1 = true;
        i = k;
        k = ((flag1) ? 1 : 0);
          goto _L23
_L7:
        int i2 = i;
        i = j;
        j = l;
        l = i2;
          goto _L24
_L5:
        int j2 = i;
        i = j;
        j = j2;
          goto _L23
        int i1 = i;
        i = j;
        j = i1;
          goto _L13
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag;
        try
        {
            flag = super.dispatchKeyEvent(keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            try
            {
                throw keyevent;
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (!executeKeyEvent(keyevent))
        {
            return false;
        }
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = a;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
        accessibilityevent;
        throw accessibilityevent;
_L2:
        int i;
        int j;
        j = getChildCount();
        i = 0;
_L5:
        flag = flag1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        View view = getChildAt(i);
        if (view.getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ItemInfo iteminfo = infoForChild(view);
        if (iteminfo == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        int k;
        int l;
        try
        {
            k = iteminfo.position;
            l = mCurItem;
        }
        // Misplaced declaration of an exception variable
        catch (AccessibilityEvent accessibilityevent)
        {
            try
            {
                throw accessibilityevent;
            }
            // Misplaced declaration of an exception variable
            catch (AccessibilityEvent accessibilityevent)
            {
                throw accessibilityevent;
            }
        }
        if (k != l)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (view.dispatchPopulateAccessibilityEvent(accessibilityevent))
        {
            return true;
        }
        i++;
        if (flag2)
        {
            return false;
        }
          goto _L5
    }

    float distanceInfluenceForSnapDuration(float f)
    {
        return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int k = 0;
        int j = 0;
        int l = ViewCompat.getOverScrollMode(this);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        int i = k;
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        PagerAdapter pageradapter;
        int i1;
        int j1;
        boolean flag;
        try
        {
            pageradapter = mAdapter;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        i = k;
        if (pageradapter == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        i = k;
        if (mAdapter.getCount() <= 1)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        flag = mLeftEdge.isFinished();
        i = j;
        if (!flag)
        {
            j = canvas.save();
            i = getHeight() - getPaddingTop() - getPaddingBottom();
            k = getWidth();
            canvas.rotate(270F);
            canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)k);
            mLeftEdge.setSize(i, k);
            i = false | mLeftEdge.draw(canvas);
            canvas.restoreToCount(j);
        }
        j = i;
        if (mRightEdge.isFinished())
        {
            break MISSING_BLOCK_LABEL_286;
        }
        j = canvas.save();
        k = getWidth();
        l = getHeight();
        i1 = getPaddingTop();
        j1 = getPaddingBottom();
        canvas.rotate(90F);
        canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)k);
        mRightEdge.setSize(l - i1 - j1, k);
        i |= mRightEdge.draw(canvas);
        try
        {
            canvas.restoreToCount(j);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        j = i;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        mLeftEdge.finish();
        mRightEdge.finish();
        j = i;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        ViewCompat.postInvalidateOnAnimation(this);
        return;
        canvas;
        throw canvas;
    }

    protected void drawableStateChanged()
    {
        Drawable drawable;
        super.drawableStateChanged();
        drawable = mMarginDrawable;
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
        return;
        android.content.res.Resources.NotFoundException notfoundexception;
        notfoundexception;
        throw notfoundexception;
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        flag4 = a;
        flag1 = false;
        flag2 = false;
        flag = flag2;
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        int i = keyevent.getKeyCode();
        i;
        JVM INSTR lookupswitch 3: default 60
    //                   21: 68
    //                   22: 80
    //                   61: 96;
           goto _L3 _L4 _L5 _L6
_L3:
        flag = flag2;
_L2:
        return flag;
        keyevent;
        throw keyevent;
_L4:
        flag = arrowScroll(17);
        if (!flag4)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag1 = arrowScroll(66);
        flag = flag1;
        if (!flag4)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = flag1;
        boolean flag3;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag3 = KeyEventCompat.hasNoModifiers(keyevent);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        flag = flag1;
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = arrowScroll(2);
        flag = flag1;
        if (!flag4)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L7
_L7:
        try
        {
            flag1 = KeyEventCompat.hasModifiers(keyevent, 1);
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (flag1)
        {
            return arrowScroll(1);
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter()
    {
        return mAdapter;
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        int k;
        int l;
        try
        {
            l = mDrawingOrder;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        k = j;
        if (l == 2)
        {
            k = i - 1 - j;
        }
        return ((LayoutParams)((View)mDrawingOrderedChildren.get(k)).getLayoutParams()).childIndex;
    }

    public int getCurrentItem()
    {
        return mCurItem;
    }

    ItemInfo infoForAnyChild(View view)
    {
        boolean flag = a;
label0:
        do
        {
            ViewParent viewparent;
label1:
            {
                viewparent = view.getParent();
                if (viewparent == this)
                {
                    break label0;
                }
                if (viewparent != null)
                {
                    boolean flag1;
                    try
                    {
                        flag1 = viewparent instanceof View;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        throw view;
                    }
                    if (flag1)
                    {
                        break label1;
                    }
                }
                return null;
            }
            view = (View)viewparent;
        } while (!flag);
        return infoForChild(view);
    }

    ItemInfo infoForChild(View view)
    {
        boolean flag = a;
        int i = 0;
        do
        {
label0:
            {
                if (i < mItems.size())
                {
                    ItemInfo iteminfo = (ItemInfo)mItems.get(i);
                    boolean flag1;
                    try
                    {
                        flag1 = mAdapter.isViewFromObject(view, iteminfo.object);
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view)
                    {
                        throw view;
                    }
                    if (flag1)
                    {
                        return iteminfo;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return null;
            }
            i++;
        } while (true);
    }

    ItemInfo infoForPosition(int i)
    {
        boolean flag = a;
        int j = 0;
        do
        {
label0:
            {
                if (j < mItems.size())
                {
                    ItemInfo iteminfo = (ItemInfo)mItems.get(j);
                    int k;
                    try
                    {
                        k = iteminfo.position;
                    }
                    catch (android.content.res.Resources.NotFoundException notfoundexception)
                    {
                        throw notfoundexception;
                    }
                    if (k == i)
                    {
                        return iteminfo;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return null;
            }
            j++;
        } while (true);
    }

    void initViewPager()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        try
        {
            mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewconfiguration);
            mMinimumVelocity = (int)(400F * f);
            mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
            mLeftEdge = new EdgeEffectCompat(context);
            mRightEdge = new EdgeEffectCompat(context);
            mFlingDistance = (int)(25F * f);
            mCloseEnough = (int)(2.0F * f);
            mDefaultGutterSize = (int)(16F * f);
            ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
            if (ViewCompat.getImportantForAccessibility(this) == 0)
            {
                ViewCompat.setImportantForAccessibility(this, 1);
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(mEndScrollRunnable);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        float f2;
        float f4;
        Object obj;
        ItemInfo iteminfo;
        int i;
        int j;
        int k;
        boolean flag = a;
        float f;
        float f3;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            super.onDraw(canvas);
            i = mPageMargin;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas) { }
            try
            {
                throw canvas;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
        }
        if (i <= 0) goto _L2; else goto _L1
_L1:
        obj = mMarginDrawable;
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (mItems.size() <= 0) goto _L2; else goto _L4
_L4:
        obj = mAdapter;
        if (obj == null) goto _L2; else goto _L5
_L5:
        l = getScrollX();
        i1 = getWidth();
        f3 = (float)mPageMargin / (float)i1;
        obj = (ItemInfo)mItems.get(0);
        f = ((ItemInfo) (obj)).offset;
        j1 = mItems.size();
        k = ((ItemInfo) (obj)).position;
        k1 = ((ItemInfo)mItems.get(j1 - 1)).position;
        i = 0;
_L8:
        if (k >= k1) goto _L2; else goto _L6
_L6:
        do
        {
            iteminfo = ((ItemInfo) (obj));
            j = i;
            if (k <= ((ItemInfo) (obj)).position)
            {
                break;
            }
            iteminfo = ((ItemInfo) (obj));
            j = i;
            if (i >= j1)
            {
                break;
            }
            obj = mItems;
            j = i + 1;
            iteminfo = (ItemInfo)((ArrayList) (obj)).get(j);
            obj = iteminfo;
            i = j;
        } while (!flag);
        if (k == iteminfo.position)
        {
            f1 = iteminfo.offset;
            f2 = iteminfo.widthFactor;
            f4 = i1;
            f = iteminfo.offset + iteminfo.widthFactor + f3;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_398;
            }
        }
        f2 = mAdapter.getPageWidth(k);
        f4 = i1;
        f1 = f + (f2 + f3);
        f2 = (f + f2) * f4;
        f = f1;
        f1 = f2;
_L9:
        try
        {
            if ((float)mPageMargin + f1 > (float)l)
            {
                mMarginDrawable.setBounds((int)f1, mTopPageBounds, (int)((float)mPageMargin + f1 + 0.5F), mBottomPageBounds);
                mMarginDrawable.draw(canvas);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if ((f1 <= (float)(l + i1) || flag) && !flag) goto _L7; else goto _L2
_L2:
        return;
_L7:
        k++;
        obj = iteminfo;
        i = j;
          goto _L8
        f1 = f4 * (f1 + f2);
          goto _L9
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        boolean flag3;
        flag = true;
        flag3 = a;
        i = motionevent.getAction() & 0xff;
        if (i != 3 && i != 1) goto _L2; else goto _L1
_L1:
        try
        {
            mIsBeingDragged = false;
            mIsUnableToDrag = false;
            mActivePointerId = -1;
            if (mVelocityTracker != null)
            {
                mVelocityTracker.recycle();
                mVelocityTracker = null;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        flag = false;
_L4:
        return flag;
_L2:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1;
        boolean flag4;
        try
        {
            flag4 = mIsBeingDragged;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (flag4)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            flag1 = mIsUnableToDrag;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (flag1)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR lookupswitch 3: default 144
    //                   0: 444
    //                   2: 171
    //                   6: 592;
           goto _L5 _L6 _L7 _L8
_L5:
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        int j;
        int k;
        int l;
        boolean flag2;
        try
        {
            if (mVelocityTracker == null)
            {
                mVelocityTracker = VelocityTracker.obtain();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        mVelocityTracker.addMovement(motionevent);
        return mIsBeingDragged;
_L7:
        j = mActivePointerId;
        if (j == -1 && !flag3) goto _L5; else goto _L9
_L9:
        j = MotionEventCompat.findPointerIndex(motionevent, j);
        f1 = MotionEventCompat.getX(motionevent, j);
        f = f1 - mLastMotionX;
        f4 = Math.abs(f);
        f2 = MotionEventCompat.getY(motionevent, j);
        f3 = Math.abs(f2 - mInitialMotionY);
        if (f == 0.0F)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        try
        {
            flag2 = isGutterDrag(mLastMotionX, f);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        j = (int)f;
        k = (int)f1;
        l = (int)f2;
        if (!canScroll(this, false, j, k, l))
        {
            break MISSING_BLOCK_LABEL_310;
        }
        mLastMotionX = f1;
        mLastMotionY = f2;
        mIsUnableToDrag = true;
        return false;
        j = mTouchSlop;
        if (f4 <= (float)j || 0.5F * f4 <= f3) goto _L11; else goto _L10
_L10:
        try
        {
            mIsBeingDragged = true;
            requestParentDisallowInterceptTouchEvent(true);
            setScrollState(1);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (f <= 0.0F) goto _L13; else goto _L12
_L12:
        f = mInitialMotionX;
        j = mTouchSlop;
        f += j;
_L20:
        mLastMotionX = f;
        mLastMotionY = f2;
        setScrollingCacheEnabled(true);
        if (!flag3) goto _L14; else goto _L11
_L11:
        try
        {
            if (f3 > (float)mTouchSlop)
            {
                mIsUnableToDrag = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
_L14:
        flag2 = mIsBeingDragged;
        if (!flag2) goto _L5; else goto _L15
_L15:
        flag2 = performDrag(f1);
        if (!flag2) goto _L5; else goto _L16
_L16:
        ViewCompat.postInvalidateOnAnimation(this);
        if (!flag3) goto _L5; else goto _L6
_L6:
        f = motionevent.getX();
        mInitialMotionX = f;
        mLastMotionX = f;
        f = motionevent.getY();
        mInitialMotionY = f;
        mLastMotionY = f;
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        mIsUnableToDrag = false;
        mScroller.computeScrollOffset();
        j = mScrollState;
        if (j != 2) goto _L18; else goto _L17
_L17:
        j = Math.abs(mScroller.getFinalX() - mScroller.getCurrX());
        k = mCloseEnough;
        if (j <= k) goto _L18; else goto _L19
_L19:
        mScroller.abortAnimation();
        mPopulatePending = false;
        populate();
        mIsBeingDragged = true;
        requestParentDisallowInterceptTouchEvent(true);
        setScrollState(1);
        if (!flag3) goto _L5; else goto _L18
_L18:
        try
        {
            completeScroll(false);
            mIsBeingDragged = false;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag3) goto _L5; else goto _L8
_L8:
        onSecondaryPointerUp(motionevent);
          goto _L5
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
_L13:
        f = mInitialMotionX - (float)mTouchSlop;
          goto _L20
        motionevent;
        throw motionevent;
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int i2;
        int l2;
        int i3;
        int j3;
        int k3;
        flag = a;
        l2 = getChildCount();
        j3 = k - i;
        i3 = l - j;
        i = getPaddingLeft();
        j = getPaddingTop();
        l = getPaddingRight();
        k = getPaddingBottom();
        k3 = getScrollX();
        i1 = 0;
        i2 = 0;
_L26:
        if (i2 >= l2) goto _L2; else goto _L1
_L1:
        View view = getChildAt(i2);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.isDecor) goto _L4; else goto _L5
_L5:
        int j1;
        int j2;
        j1 = layoutparams.gravity;
        j2 = layoutparams.gravity;
        j1 & 7;
        JVM INSTR tableswitch 1 5: default 152
    //                   1 697
    //                   2 152
    //                   3 156
    //                   4 152
    //                   5 700;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        if (!flag) goto _L10; else goto _L8
_L8:
        int k1;
        int l1;
        l1 = view.getMeasuredWidth() + i;
        j1 = l1;
        k1 = i;
        if (!flag) goto _L12; else goto _L11
_L11:
        i = l1;
_L7:
        k1 = Math.max((j3 - view.getMeasuredWidth()) / 2, i);
        j1 = i;
        if (!flag) goto _L12; else goto _L9
_L9:
        k1 = view.getMeasuredWidth();
        j1 = l + view.getMeasuredWidth();
        k1 = j3 - l - k1;
_L28:
        j2 & 0x70;
        JVM INSTR lookupswitch 3: default 268
    //                   16: 671
    //                   48: 272
    //                   80: 674;
           goto _L13 _L14 _L15 _L16
_L13:
        if (!flag) goto _L17; else goto _L15
_L15:
        j2 = view.getMeasuredHeight() + j;
        l = j2;
        l1 = j;
        if (!flag) goto _L19; else goto _L18
_L18:
        j = j2;
_L14:
        l1 = Math.max((i3 - view.getMeasuredHeight()) / 2, j);
        l = j;
        if (!flag) goto _L19; else goto _L16
_L16:
        l1 = i3 - k - view.getMeasuredHeight();
        int k2 = view.getMeasuredHeight();
        l = j;
        k = k2 + k;
        j = l1;
_L27:
        k1 += k3;
        view.layout(k1, j, view.getMeasuredWidth() + k1, view.getMeasuredHeight() + j);
        k1 = i1 + 1;
        j = i;
        i1 = l;
        l = j1;
        i = k1;
_L29:
        if (!flag) goto _L21; else goto _L20
_L20:
        j1 = l;
        l = j;
        j = i1;
_L30:
        j1 = j3 - l - j1;
        i1 = 0;
_L25:
        if (i1 >= l2) goto _L23; else goto _L22
_L22:
        View view1 = getChildAt(i1);
        if (view1.getVisibility() != 8)
        {
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (!layoutparams1.isDecor)
            {
                ItemInfo iteminfo = infoForChild(view1);
                if (iteminfo != null)
                {
                    float f = j1;
                    k1 = (int)(iteminfo.offset * f) + l;
                    if (layoutparams1.needsMeasure)
                    {
                        layoutparams1.needsMeasure = false;
                        float f1 = j1;
                        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.widthFactor * f1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i3 - j - k, 0x40000000));
                    }
                    view1.layout(k1, j, view1.getMeasuredWidth() + k1, view1.getMeasuredHeight() + j);
                }
            }
        }
        if (!flag) goto _L24; else goto _L23
_L23:
        try
        {
            mTopPageBounds = j;
            mBottomPageBounds = i3 - k;
            mDecorChildCount = i;
            if (mFirstLayout)
            {
                scrollToItem(mCurItem, false, 0, false);
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        mFirstLayout = false;
        return;
_L24:
        i1++;
        if (true) goto _L25; else goto _L21
_L21:
        i2++;
        j1 = i;
        i = j;
        j = i1;
        i1 = j1;
          goto _L26
_L19:
        j = l1;
          goto _L27
_L17:
        l = j;
          goto _L27
_L12:
        i = j1;
        j1 = l;
          goto _L28
_L10:
        k1 = i;
        j1 = l;
          goto _L28
_L4:
        j1 = i;
        i = i1;
        i1 = j;
        j = j1;
          goto _L29
_L2:
        j1 = l;
        l = i;
        i = i1;
          goto _L30
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag2 = a;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
        i = getMeasuredWidth();
        mGutterSize = Math.min(i / 10, mDefaultGutterSize);
        i = i - getPaddingLeft() - getPaddingRight();
        j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
        int j2 = getChildCount();
        int j1 = 0;
        do
        {
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
                            {
                                int k;
                                int l;
                                int i1;
label4:
                                {
                                    l = i;
                                    k = j;
                                    if (j1 >= j2)
                                    {
                                        break label2;
                                    }
                                    View view = getChildAt(j1);
                                    l = i;
                                    k = j;
                                    if (view.getVisibility() == 8)
                                    {
                                        break label3;
                                    }
                                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                                    l = i;
                                    k = j;
                                    if (layoutparams == null)
                                    {
                                        break label3;
                                    }
                                    float f;
                                    boolean flag;
                                    boolean flag1;
                                    int k1;
                                    int i2;
                                    boolean flag3;
                                    try
                                    {
                                        flag3 = layoutparams.isDecor;
                                    }
                                    catch (android.content.res.Resources.NotFoundException notfoundexception)
                                    {
                                        throw notfoundexception;
                                    }
                                    l = i;
                                    k = j;
                                    if (!flag3)
                                    {
                                        break label3;
                                    }
                                    k = layoutparams.gravity & 7;
                                    l = layoutparams.gravity & 0x70;
                                    i1 = 0x80000000;
                                    k1 = 0x80000000;
                                    if (l == 48 || l == 80)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                    if (k == 3 || k == 5)
                                    {
                                        flag1 = true;
                                    } else
                                    {
                                        flag1 = false;
                                    }
                                    if (flag)
                                    {
                                        i1 = 0x40000000;
                                        k = k1;
                                        l = i1;
                                        if (!flag2)
                                        {
                                            break label4;
                                        }
                                    }
                                    k = k1;
                                    l = i1;
                                    if (flag1)
                                    {
                                        k = 0x40000000;
                                        l = i1;
                                    }
                                }
                                if (layoutparams.width != -2)
                                {
                                    i1 = 0x40000000;
                                    android.content.res.Resources.NotFoundException notfoundexception1;
                                    int l1;
                                    if (layoutparams.width != -1)
                                    {
                                        l = layoutparams.width;
                                    } else
                                    {
                                        l = i;
                                    }
                                } else
                                {
                                    i1 = l;
                                    l = i;
                                }
                                if (layoutparams.height == -2)
                                {
                                    break label0;
                                }
                                k1 = 0x40000000;
                                k = k1;
                                if (layoutparams.height == -1)
                                {
                                    break label0;
                                }
                                i2 = layoutparams.height;
                                k = k1;
                                l1 = i2;
                            }
                            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, i1), android.view.View.MeasureSpec.makeMeasureSpec(l1, k));
                            i1 = j;
                            if (flag)
                            {
                                i1 = j - view.getMeasuredHeight();
                                l = i;
                                k = i1;
                                if (!flag2)
                                {
                                    break label3;
                                }
                            }
                            l = i;
                            k = i1;
                            if (flag1)
                            {
                                l = i - view.getMeasuredWidth();
                                k = i1;
                            }
                        }
                        if (!flag2)
                        {
                            break label1;
                        }
                    }
                    mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                    mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
                    mInLayout = true;
                    populate();
                    mInLayout = false;
                    j = getChildCount();
                    i = 0;
                    do
                    {
label5:
                        {
label6:
                            {
label7:
                                {
                                    if (i >= j)
                                    {
                                        break label6;
                                    }
                                    view = getChildAt(i);
                                    if (view.getVisibility() == 8)
                                    {
                                        break label7;
                                    }
                                    layoutparams = (LayoutParams)view.getLayoutParams();
                                    if (layoutparams != null)
                                    {
                                        try
                                        {
                                            flag3 = layoutparams.isDecor;
                                        }
                                        // Misplaced declaration of an exception variable
                                        catch (android.content.res.Resources.NotFoundException notfoundexception1)
                                        {
                                            throw notfoundexception1;
                                        }
                                        if (flag3)
                                        {
                                            break label7;
                                        }
                                    }
                                    f = l;
                                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.widthFactor * f), 0x40000000), mChildHeightMeasureSpec);
                                }
                                if (!flag2)
                                {
                                    break label5;
                                }
                            }
                            return;
                        }
                        i++;
                    } while (true);
                }
                j1++;
                i = l;
                j = k;
            }
        } while (true);
        l1 = j;
        break MISSING_BLOCK_LABEL_332;
    }

    protected void onPageScrolled(int i, float f, int j)
    {
        boolean flag = a;
        if (mDecorChildCount <= 0) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        int l1;
        int j2;
        int k2;
        int l2;
        j2 = getScrollX();
        k = getPaddingLeft();
        l = getPaddingRight();
        k2 = getWidth();
        l2 = getChildCount();
        l1 = 0;
_L20:
        if (l1 >= l2) goto _L2; else goto _L3
_L3:
        Object obj;
        LayoutParams layoutparams;
        int i1;
        int j1;
        obj = getChildAt(l1);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        boolean flag1;
        try
        {
            flag1 = layoutparams.isDecor;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag1) goto _L5; else goto _L4
_L4:
        j1 = k;
        i1 = l;
_L18:
        if (!flag) goto _L6; else goto _L2
_L2:
        int i2;
        try
        {
            if (mOnPageChangeListener != null)
            {
                mOnPageChangeListener.onPageScrolled(i, f, j);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            if (mInternalPageChangeListener != null)
            {
                mInternalPageChangeListener.onPageScrolled(i, f, j);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (mPageTransformer == null) goto _L8; else goto _L7
_L7:
        j = getScrollX();
        k = getChildCount();
        i = 0;
_L19:
        if (i >= k) goto _L8; else goto _L9
_L9:
        obj = getChildAt(i);
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        try
        {
            flag1 = layoutparams.isDecor;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag1)
        {
            f = (float)(((View) (obj)).getLeft() - j) / (float)getClientWidth();
            mPageTransformer.transformPage(((View) (obj)), f);
        }
        if (!flag) goto _L10; else goto _L8
_L8:
        mCalledSuper = true;
        return;
_L5:
        layoutparams.gravity & 7;
        JVM INSTR tableswitch 1 5: default 248
    //                   1 473
    //                   2 248
    //                   3 253
    //                   4 248
    //                   5 476;
           goto _L11 _L12 _L11 _L13 _L11 _L14
_L11:
        if (!flag) goto _L15; else goto _L13
_L13:
        i2 = ((View) (obj)).getWidth() + k;
        j1 = i2;
        i1 = k;
        if (!flag) goto _L17; else goto _L16
_L16:
        k = i2;
_L12:
        i1 = Math.max((k2 - ((View) (obj)).getMeasuredWidth()) / 2, k);
        j1 = k;
        if (!flag) goto _L17; else goto _L14
_L14:
        i1 = k2 - l - ((View) (obj)).getMeasuredWidth();
        j1 = ((View) (obj)).getMeasuredWidth();
        l += j1;
_L21:
        i2 = (i1 + j2) - ((View) (obj)).getLeft();
        i1 = l;
        j1 = k;
        if (i2 != 0)
        {
            try
            {
                ((View) (obj)).offsetLeftAndRight(i2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            i1 = l;
            j1 = k;
        }
          goto _L18
_L10:
        i++;
          goto _L19
_L6:
        l1++;
        k = j1;
        l = i1;
          goto _L20
_L17:
        k = j1;
          goto _L21
_L15:
        int k1 = k;
        i1 = k;
        k = k1;
          goto _L21
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect)
    {
        byte byte0 = -1;
        boolean flag = a;
        int k = getChildCount();
        View view;
        ItemInfo iteminfo;
        int j;
        int l;
        int i1;
        if ((i & 2) == 0 || flag)
        {
            j = k - 1;
            k = -1;
        } else
        {
            byte0 = 1;
            j = 0;
        }
        if (j == k)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(j);
        if (view.getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        iteminfo = infoForChild(view);
        if (iteminfo == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        try
        {
            l = iteminfo.position;
            i1 = mCurItem;
        }
        // Misplaced declaration of an exception variable
        catch (Rect rect)
        {
            try
            {
                throw rect;
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                throw rect;
            }
        }
        if (l != i1)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (view.requestFocus(i, rect))
        {
            return true;
        }
        j += byte0;
        if (!flag) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
_L1:
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState) goto _L2; else goto _L1
_L1:
        super.onRestoreInstanceState(parcelable);
_L4:
        return;
        parcelable;
        throw parcelable;
_L2:
        parcelable = (SavedState)parcelable;
        PagerAdapter pageradapter;
        super.onRestoreInstanceState(parcelable.getSuperState());
        pageradapter = mAdapter;
        if (pageradapter == null)
        {
            break; /* Loop/switch isn't completed */
        }
        mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
        setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
        if (!a) goto _L4; else goto _L3
_L3:
        mRestoredCurItem = ((SavedState) (parcelable)).position;
        mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
        mRestoredClassLoader = ((SavedState) (parcelable)).loader;
        return;
        parcelable;
        throw parcelable;
        parcelable;
        throw parcelable;
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        try
        {
            savedstate.position = mCurItem;
            if (mAdapter != null)
            {
                savedstate.adapterState = mAdapter.saveState();
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        return savedstate;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        try
        {
            super.onSizeChanged(i, j, k, l);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (i == k)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        recomputeScrollPosition(i, k, mPageMargin, mPageMargin);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j;
        int k;
        boolean flag;
        boolean flag2;
        boolean flag3;
        k = 0;
        j = 0;
        flag2 = false;
        flag3 = a;
        try
        {
            flag = mFakeDragging;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        int i = motionevent.getAction();
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        PagerAdapter pageradapter;
        try
        {
            i = motionevent.getEdgeFlags();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        flag = flag2;
        if (i != 0) goto _L4; else goto _L3
_L3:
        pageradapter = mAdapter;
        flag = flag2;
        if (pageradapter == null) goto _L4; else goto _L5
_L5:
        try
        {
            i = mAdapter.getCount();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        flag = flag2;
        if (i == 0) goto _L4; else goto _L6
_L6:
        try
        {
            if (mVelocityTracker == null)
            {
                mVelocityTracker = VelocityTracker.obtain();
            }
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        mVelocityTracker.addMovement(motionevent);
        i = k;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 168
    //                   0 198
    //                   1 801
    //                   2 262
    //                   3 795
    //                   4 172
    //                   5 789
    //                   6 717;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L7:
        i = k;
_L12:
        float f;
        float f1;
        float f2;
        float f3;
        Object obj;
        boolean flag1;
        if (i != 0)
        {
            try
            {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        return true;
        motionevent;
        throw motionevent;
        motionevent;
        throw motionevent;
_L8:
        try
        {
            mScroller.abortAnimation();
            mPopulatePending = false;
            populate();
            f = motionevent.getX();
            mInitialMotionX = f;
            mLastMotionX = f;
            f = motionevent.getY();
            mInitialMotionY = f;
            mLastMotionY = f;
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i = k;
        if (!flag3) goto _L12; else goto _L10
_L10:
        flag1 = mIsBeingDragged;
        if (flag1) goto _L16; else goto _L15
_L15:
        i = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        f = MotionEventCompat.getX(motionevent, i);
        f2 = Math.abs(f - mLastMotionX);
        f1 = MotionEventCompat.getY(motionevent, i);
        f3 = Math.abs(f1 - mLastMotionY);
        try
        {
            i = mTouchSlop;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
            try
            {
                throw motionevent;
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
        if (f2 <= (float)i || f2 <= f3) goto _L16; else goto _L17
_L17:
        mIsBeingDragged = true;
        requestParentDisallowInterceptTouchEvent(true);
        if (f - mInitialMotionX <= 0.0F) goto _L19; else goto _L18
_L18:
        f = mInitialMotionX;
        i = mTouchSlop;
        f += i;
_L26:
        mLastMotionX = f;
        mLastMotionY = f1;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        obj = getParent();
        if (obj != null)
        {
            try
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent)
            {
                throw motionevent;
            }
        }
_L16:
        i = k;
        if (!mIsBeingDragged) goto _L12; else goto _L20
_L20:
        j = performDrag(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId))) | false;
        i = j;
        if (!flag3) goto _L12; else goto _L21
_L21:
        i = j;
_L28:
        try
        {
            flag1 = mIsBeingDragged;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag1) goto _L12; else goto _L22
_L22:
        obj = mVelocityTracker;
        ((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
        i = (int)VelocityTrackerCompat.getXVelocity(((VelocityTracker) (obj)), mActivePointerId);
        mPopulatePending = true;
        j = getClientWidth();
        k = getScrollX();
        obj = infoForCurrentScrollPosition();
        setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId)) - mInitialMotionX)), true, true, i);
        mActivePointerId = -1;
        endDrag();
        j = mLeftEdge.onRelease() | mRightEdge.onRelease();
        i = j;
        if (!flag3) goto _L12; else goto _L23
_L23:
        i = j;
_L27:
        try
        {
            flag1 = mIsBeingDragged;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag1) goto _L12; else goto _L24
_L24:
        scrollToItem(mCurItem, true, 0, false);
        mActivePointerId = -1;
        endDrag();
        j = mLeftEdge.onRelease() | mRightEdge.onRelease();
        i = j;
        if (!flag3) goto _L12; else goto _L25
_L25:
        i = MotionEventCompat.getActionIndex(motionevent);
        f = MotionEventCompat.getX(motionevent, i);
        try
        {
            mLastMotionX = f;
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        i = j;
        if (!flag3) goto _L12; else goto _L14
_L14:
        onSecondaryPointerUp(motionevent);
        mLastMotionX = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, mActivePointerId));
        i = j;
          goto _L12
_L19:
        f = mInitialMotionX - (float)mTouchSlop;
          goto _L26
_L13:
        j = 0;
          goto _L25
_L11:
        i = 0;
          goto _L27
_L9:
        i = 0;
          goto _L28
    }

    boolean pageLeft()
    {
label0:
        {
            try
            {
                if (mCurItem <= 0)
                {
                    break label0;
                }
                setCurrentItem(mCurItem - 1, true);
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
            return true;
        }
        return false;
    }

    boolean pageRight()
    {
        PagerAdapter pageradapter;
        try
        {
            pageradapter = mAdapter;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            try
            {
                throw notfoundexception;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                throw notfoundexception1;
            }
        }
        if (pageradapter == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (mCurItem >= mAdapter.getCount() - 1)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        setCurrentItem(mCurItem + 1, true);
        return true;
        return false;
    }

    void populate()
    {
        populate(mCurItem);
    }

    void populate(int i)
    {
        boolean flag = a;
        if (mCurItem == i) goto _L2; else goto _L1
_L1:
        int j = mCurItem;
        ItemInfo iteminfo;
        byte byte0;
        android.content.res.Resources.NotFoundException notfoundexception;
        if (j < i)
        {
            j = 66;
        } else
        {
            j = 17;
        }
        iteminfo = infoForPosition(mCurItem);
        mCurItem = i;
        byte0 = j;
_L66:
        if (mAdapter != null) goto _L4; else goto _L3
_L3:
        sortChildDrawingOrder();
_L6:
        return;
        notfoundexception;
        try
        {
            throw notfoundexception;
        }
        // Misplaced declaration of an exception variable
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        android.content.res.Resources.NotFoundException notfoundexception1;
        notfoundexception1;
        throw notfoundexception1;
_L4:
        int k1;
        int l1;
        int i2;
        try
        {
            if (mPopulatePending)
            {
                sortChildDrawingOrder();
                return;
            }
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception2)
        {
            throw notfoundexception2;
        }
        android.os.IBinder ibinder;
        try
        {
            ibinder = getWindowToken();
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception3)
        {
            throw notfoundexception3;
        }
        if (ibinder == null) goto _L6; else goto _L5
_L5:
        mAdapter.startUpdate(this);
        i = mOffscreenPageLimit;
        i2 = Math.max(0, mCurItem - i);
        k1 = mAdapter.getCount();
        l1 = Math.min(k1 - 1, i + mCurItem);
        if (k1 != mExpectedAdapterCount)
        {
            String s;
            try
            {
                s = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception4)
            {
                notfoundexception4 = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder()).append(z[9]).append(mExpectedAdapterCount).append(z[8]).append(k1).append(z[11]).append(s).append(z[10]).append(getClass()).append(z[12]).append(mAdapter.getClass()).toString());
        }
        i = 0;
_L57:
        Object obj;
        if (i >= mItems.size())
        {
            break MISSING_BLOCK_LABEL_1553;
        }
        obj = (ItemInfo)mItems.get(i);
        if (((ItemInfo) (obj)).position < mCurItem) goto _L8; else goto _L7
_L7:
        int l;
        j = ((ItemInfo) (obj)).position;
        l = mCurItem;
        if (j != l)
        {
            break MISSING_BLOCK_LABEL_1553;
        }
_L64:
        Object obj1;
        Object obj2;
        int j2;
        if (obj == null && k1 > 0)
        {
            obj2 = addNewItem(mCurItem, i);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L10; else goto _L9
_L9:
        int k = i - 1;
        float f;
        float f1;
        float f2;
        int i1;
        int j1;
        boolean flag1;
        if (k >= 0)
        {
            try
            {
                obj = (ItemInfo)mItems.get(k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = null;
        }
        j2 = getClientWidth();
        if (j2 <= 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = (2.0F - ((ItemInfo) (obj2)).widthFactor) + (float)getPaddingLeft() / (float)j2;
        }
        i1 = mCurItem;
        f = 0.0F;
        i1--;
        j1 = i;
        if (i1 < 0) goto _L12; else goto _L11
_L11:
        if (f < f1 || i1 >= i2) goto _L14; else goto _L13
_L13:
        if (obj != null) goto _L16; else goto _L15
_L15:
        j1 = i;
        if (!flag) goto _L12; else goto _L16
_L16:
        j1 = ((ItemInfo) (obj)).position;
        if (i1 != j1) goto _L18; else goto _L17
_L17:
        flag1 = ((ItemInfo) (obj)).scrolling;
        if (flag1) goto _L18; else goto _L19
_L19:
        try
        {
            mItems.remove(k);
            mAdapter.destroyItem(this, i1, ((ItemInfo) (obj)).object);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        k--;
        i--;
        if (k < 0) goto _L21; else goto _L20
_L20:
        obj = (ItemInfo)mItems.get(k);
_L58:
        if (!flag) goto _L18; else goto _L14
_L14:
        if (obj == null) goto _L23; else goto _L22
_L22:
        try
        {
            j1 = ((ItemInfo) (obj)).position;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i1 != j1) goto _L23; else goto _L24
_L24:
        f = ((ItemInfo) (obj)).widthFactor + f;
        k--;
        if (k >= 0)
        {
            try
            {
                obj = (ItemInfo)mItems.get(k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = null;
        }
        if (!flag) goto _L18; else goto _L23
_L23:
        f2 = addNewItem(i1, k + 1).widthFactor;
        if (k >= 0)
        {
            try
            {
                obj = (ItemInfo)mItems.get(k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = null;
        }
        i++;
        f = f2 + f;
_L18:
        i1--;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        j1 = i;
_L12:
        f = ((ItemInfo) (obj2)).widthFactor;
        i = j1 + 1;
        if (f >= 2.0F) goto _L26; else goto _L25
_L25:
        if (i >= mItems.size()) goto _L28; else goto _L27
_L27:
        obj1 = (ItemInfo)mItems.get(i);
_L59:
        float f3;
        if (j2 <= 0)
        {
            f3 = 0.0F;
        } else
        {
            f3 = (float)getPaddingRight() / (float)j2 + 2.0F;
        }
        k = mCurItem;
        i1 = k + 1;
_L46:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (f < f3) goto _L30; else goto _L29
_L29:
        obj = obj1;
        if (i1 <= l1) goto _L30; else goto _L31
_L31:
        if (obj1 == null && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i2 = ((ItemInfo) (obj1)).position;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj = obj1;
        f1 = f;
        k = i;
        if (i1 != i2) goto _L33; else goto _L32
_L32:
        flag1 = ((ItemInfo) (obj1)).scrolling;
        obj = obj1;
        f1 = f;
        k = i;
        if (flag1) goto _L33; else goto _L34
_L34:
        mItems.remove(i);
        mAdapter.destroyItem(this, i1, ((ItemInfo) (obj1)).object);
        if (i >= mItems.size()) goto _L36; else goto _L35
_L35:
        obj1 = (ItemInfo)mItems.get(i);
_L60:
        obj = obj1;
        f1 = f;
        k = i;
        if (!flag) goto _L33; else goto _L37
_L37:
        obj = obj1;
_L30:
        f1 = f;
        k = i;
        if (obj == null) goto _L39; else goto _L38
_L38:
        try
        {
            i2 = ((ItemInfo) (obj)).position;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        f1 = f;
        k = i;
        if (i1 != i2) goto _L39; else goto _L40
_L40:
        f += ((ItemInfo) (obj)).widthFactor;
        i++;
        if (i >= mItems.size()) goto _L42; else goto _L41
_L41:
        obj = (ItemInfo)mItems.get(i);
_L61:
        f1 = f;
        k = i;
        if (!flag) goto _L33; else goto _L43
_L43:
        k = i;
        f1 = f;
_L39:
        obj = addNewItem(i1, k);
        k++;
        f1 = ((ItemInfo) (obj)).widthFactor + f1;
        if (k >= mItems.size()) goto _L45; else goto _L44
_L44:
        obj = (ItemInfo)mItems.get(k);
_L33:
        i1++;
        obj1 = obj;
        f = f1;
        i = k;
        if (!flag) goto _L46; else goto _L26
_L26:
        calculatePageOffsets(((ItemInfo) (obj2)), j1, iteminfo);
_L10:
        try
        {
            obj1 = mAdapter;
            i = mCurItem;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj2 == null) goto _L48; else goto _L47
_L47:
        obj = ((ItemInfo) (obj2)).object;
_L62:
        ((PagerAdapter) (obj1)).setPrimaryItem(this, i, obj);
        mAdapter.finishUpdate(this);
        k = getChildCount();
        i = 0;
_L63:
        if (i >= k) goto _L50; else goto _L49
_L49:
label0:
        {
            obj1 = getChildAt(i);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            try
            {
                obj.childIndex = i;
                if (((LayoutParams) (obj)).isDecor)
                {
                    break label0;
                }
                f = ((LayoutParams) (obj)).widthFactor;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (f == 0.0F)
            {
                obj1 = infoForChild(((View) (obj1)));
                if (obj1 != null)
                {
                    try
                    {
                        obj.widthFactor = ((ItemInfo) (obj1)).widthFactor;
                        obj.position = ((ItemInfo) (obj1)).position;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
            }
        }
        if (!flag) goto _L51; else goto _L50
_L50:
        sortChildDrawingOrder();
        if (!hasFocus()) goto _L6; else goto _L52
_L52:
        obj = findFocus();
        if (obj != null)
        {
            try
            {
                obj = infoForAnyChild(((View) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i = ((ItemInfo) (obj)).position;
            k = mCurItem;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i == k) goto _L6; else goto _L53
_L53:
        i = 0;
_L56:
        if (i >= getChildCount()) goto _L6; else goto _L54
_L54:
        obj = getChildAt(i);
        obj1 = infoForChild(((View) (obj)));
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            k = ((ItemInfo) (obj1)).position;
            i1 = mCurItem;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (k != i1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = ((View) (obj)).requestFocus(byte0);
        if (flag1 && !flag) goto _L6; else goto _L55
_L55:
        i++;
        if (flag)
        {
            return;
        }
          goto _L56
        obj;
        throw obj;
_L8:
        i++;
          goto _L57
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L21:
        obj = null;
          goto _L58
        obj;
        throw obj;
_L28:
        obj1 = null;
          goto _L59
_L36:
        obj1 = null;
          goto _L60
        obj;
        throw obj;
_L42:
        obj = null;
          goto _L61
        obj;
        throw obj;
_L45:
        obj = null;
          goto _L33
_L48:
        obj = null;
          goto _L62
_L51:
        i++;
          goto _L63
        obj = null;
          goto _L64
_L2:
        byte0 = 2;
        iteminfo = null;
        if (true) goto _L66; else goto _L65
_L65:
    }

    public void removeView(View view)
    {
        boolean flag;
        try
        {
            flag = mInLayout;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        removeViewInLayout(view);
        if (!a)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        super.removeView(view);
        return;
    }

    public void setAdapter(PagerAdapter pageradapter)
    {
        boolean flag = a;
        if (mAdapter == null) goto _L2; else goto _L1
_L1:
        int i;
        mAdapter.unregisterDataSetObserver(mObserver);
        mAdapter.startUpdate(this);
        i = 0;
_L7:
        if (i >= mItems.size()) goto _L4; else goto _L3
_L3:
        ItemInfo iteminfo = (ItemInfo)mItems.get(i);
        mAdapter.destroyItem(this, iteminfo.position, iteminfo.object);
        if (!flag) goto _L5; else goto _L4
_L4:
        mAdapter.finishUpdate(this);
        mItems.clear();
        removeNonDecorViews();
        mCurItem = 0;
        scrollTo(0, 0);
_L2:
        PagerAdapter pageradapter1 = mAdapter;
        Object obj;
        mAdapter = pageradapter;
        mExpectedAdapterCount = 0;
        obj = mAdapter;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        boolean flag1;
        try
        {
            if (mObserver == null)
            {
                mObserver = new PagerObserver(null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter)
        {
            throw pageradapter;
        }
        mAdapter.registerDataSetObserver(mObserver);
        mPopulatePending = false;
        flag1 = mFirstLayout;
        mFirstLayout = true;
        mExpectedAdapterCount = mAdapter.getCount();
        i = mRestoredCurItem;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
        setCurrentItemInternal(mRestoredCurItem, false, true);
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        if (!flag1)
        {
            try
            {
                populate();
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_266;
            }
        }
        requestLayout();
        try
        {
            obj = mAdapterChangeListener;
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter)
        {
            try
            {
                throw pageradapter;
            }
            // Misplaced declaration of an exception variable
            catch (PagerAdapter pageradapter)
            {
                throw pageradapter;
            }
        }
        if (obj == null || pageradapter1 == pageradapter)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        mAdapterChangeListener.onAdapterChanged(pageradapter1, pageradapter);
        return;
        pageradapter;
        throw pageradapter;
        pageradapter;
        try
        {
            throw pageradapter;
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter) { }
        try
        {
            throw pageradapter;
        }
        // Misplaced declaration of an exception variable
        catch (PagerAdapter pageradapter) { }
        throw pageradapter;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void setChildrenDrawingOrderEnabledCompat(boolean flag)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 7)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Method method = mSetChildrenDrawingOrderEnabled;
        Object obj;
        if (method == null)
        {
            try
            {
                mSetChildrenDrawingOrderEnabled = android/view/ViewGroup.getDeclaredMethod(z[1], new Class[] {
                    Boolean.TYPE
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e(z[4], z[0], ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        mSetChildrenDrawingOrderEnabled.invoke(this, new Object[] {
            Boolean.valueOf(flag)
        });
        return;
        obj;
        throw obj;
        obj;
        Log.e(z[3], z[2], ((Throwable) (obj)));
        return;
    }

    public void setCurrentItem(int i)
    {
        boolean flag;
        try
        {
            mPopulatePending = false;
            flag = mFirstLayout;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setCurrentItemInternal(i, flag, false);
    }

    public void setCurrentItem(int i, boolean flag)
    {
        mPopulatePending = false;
        setCurrentItemInternal(i, flag, false);
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1)
    {
        setCurrentItemInternal(i, flag, flag1, 0);
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
    {
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = a;
        PagerAdapter pageradapter;
        try
        {
            pageradapter = mAdapter;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            try
            {
                throw notfoundexception;
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                throw notfoundexception1;
            }
        }
        if (pageradapter == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (mAdapter.getCount() > 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        setScrollingCacheEnabled(false);
        return;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        int k = mCurItem;
        if (k == i)
        {
            try
            {
                if (mItems.size() != 0)
                {
                    setScrollingCacheEnabled(false);
                    return;
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception2)
            {
                throw notfoundexception2;
            }
        }
        break MISSING_BLOCK_LABEL_87;
        android.content.res.Resources.NotFoundException notfoundexception3;
        notfoundexception3;
        throw notfoundexception3;
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (!flag3) goto _L4; else goto _L3
_L3:
        i = 0;
_L2:
        android.content.res.Resources.NotFoundException notfoundexception4;
        int l;
        try
        {
            k = mAdapter.getCount();
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception5)
        {
            throw notfoundexception5;
        }
        if (i >= k)
        {
            i = mAdapter.getCount() - 1;
        }
_L13:
        k = mOffscreenPageLimit;
        if (i > mCurItem + k) goto _L6; else goto _L5
_L5:
        l = mCurItem;
        if (i >= l - k) goto _L7; else goto _L6
_L6:
        k = 0;
_L11:
        if (k >= mItems.size()) goto _L7; else goto _L8
_L8:
        ((ItemInfo)mItems.get(k)).scrolling = true;
        if (!flag3) goto _L9; else goto _L7
_L7:
        android.content.res.Resources.NotFoundException notfoundexception6;
        try
        {
            k = mCurItem;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception7)
        {
            throw notfoundexception7;
        }
        flag1 = flag2;
        if (k != i)
        {
            flag1 = true;
        }
        flag2 = mFirstLayout;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        mCurItem = i;
        android.content.res.Resources.NotFoundException notfoundexception8;
        if (flag1)
        {
            try
            {
                if (mOnPageChangeListener != null)
                {
                    mOnPageChangeListener.onPageSelected(i);
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception9)
            {
                throw notfoundexception9;
            }
        }
        if (flag1)
        {
            try
            {
                if (mInternalPageChangeListener != null)
                {
                    mInternalPageChangeListener.onPageSelected(i);
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception10)
            {
                throw notfoundexception10;
            }
        }
        try
        {
            requestLayout();
        }
        // Misplaced declaration of an exception variable
        catch (android.content.res.Resources.NotFoundException notfoundexception4)
        {
            throw notfoundexception4;
        }
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        populate(i);
        scrollToItem(i, flag, j, flag1);
        return;
        notfoundexception6;
        throw notfoundexception6;
        notfoundexception8;
        throw notfoundexception8;
        notfoundexception8;
        throw notfoundexception8;
_L9:
        k++;
        if (true) goto _L11; else goto _L10
_L10:
        break; /* Loop/switch isn't completed */
_L4:
        i = 0;
        if (true) goto _L13; else goto _L12
_L12:
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        OnPageChangeListener onpagechangelistener1 = mInternalPageChangeListener;
        mInternalPageChangeListener = onpagechangelistener;
        return onpagechangelistener1;
    }

    public void setOffscreenPageLimit(int i)
    {
        int j = i;
        if (i < 1)
        {
            Log.w(z[13], (new StringBuilder()).append(z[15]).append(i).append(z[14]).append(1).toString());
            j = 1;
        }
        try
        {
            if (j != mOffscreenPageLimit)
            {
                mOffscreenPageLimit = j;
                populate();
            }
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            throw notfoundexception;
        }
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
    {
        mAdapterChangeListener = onadapterchangelistener;
    }

    public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
        mOnPageChangeListener = onpagechangelistener;
    }

    public void setPageMargin(int i)
    {
        int j = mPageMargin;
        mPageMargin = i;
        int k = getWidth();
        recomputeScrollPosition(k, k, i, j);
        requestLayout();
    }

    public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
    {
        int i = 1;
        boolean flag1 = false;
        PageTransformer pagetransformer1;
        int j;
        boolean flag2;
        boolean flag3;
        try
        {
            j = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (PageTransformer pagetransformer)
        {
            try
            {
                throw pagetransformer;
            }
            // Misplaced declaration of an exception variable
            catch (PageTransformer pagetransformer)
            {
                throw pagetransformer;
            }
        }
        if (j < 11)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (pagetransformer != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        try
        {
            pagetransformer1 = mPageTransformer;
        }
        // Misplaced declaration of an exception variable
        catch (PageTransformer pagetransformer)
        {
            throw pagetransformer;
        }
        if (pagetransformer1 != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag2 != flag3)
        {
            flag1 = true;
        }
        try
        {
            mPageTransformer = pagetransformer;
            setChildrenDrawingOrderEnabledCompat(flag2);
        }
        // Misplaced declaration of an exception variable
        catch (PageTransformer pagetransformer)
        {
            try
            {
                throw pagetransformer;
            }
            // Misplaced declaration of an exception variable
            catch (PageTransformer pagetransformer)
            {
                throw pagetransformer;
            }
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (flag)
        {
            i = 2;
        }
        mDrawingOrder = i;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        mDrawingOrder = 0;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        populate();
        return;
        pagetransformer;
        throw pagetransformer;
        pagetransformer;
        throw pagetransformer;
    }

    void smoothScrollTo(int i, int j, int k)
    {
        int l;
        int i1;
        int j1;
label0:
        {
            try
            {
                if (getChildCount() == 0)
                {
                    setScrollingCacheEnabled(false);
                    return;
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                throw notfoundexception;
            }
            l = getScrollX();
            i1 = getScrollY();
            j1 = i - l;
            j -= i1;
            if (j1 == 0 && j == 0)
            {
                try
                {
                    completeScroll(false);
                    populate();
                    setScrollState(0);
                    return;
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception1)
                {
                    throw notfoundexception1;
                }
            }
            setScrollingCacheEnabled(true);
            setScrollState(2);
            int k1 = getClientWidth();
            i = k1 / 2;
            float f2 = Math.min(1.0F, ((float)Math.abs(j1) * 1.0F) / (float)k1);
            float f = i;
            float f1 = i;
            f2 = distanceInfluenceForSnapDuration(f2);
            i = Math.abs(k);
            if (i > 0)
            {
                i = Math.round(Math.abs((f1 * f2 + f) / (float)i) * 1000F) * 4;
                if (!a)
                {
                    break label0;
                }
            }
            f = k1;
            f1 = mAdapter.getPageWidth(mCurItem);
            i = (int)(((float)Math.abs(j1) / (f * f1 + (float)mPageMargin) + 1.0F) * 100F);
        }
        i = Math.min(i, 600);
        mScroller.startScroll(l, i1, j1, j, i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        boolean flag;
        try
        {
            flag = super.verifyDrawable(drawable);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            try
            {
                throw drawable;
            }
            // Misplaced declaration of an exception variable
            catch (Drawable drawable)
            {
                throw drawable;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (drawable != mMarginDrawable)
        {
            return false;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[19];
        obj = "-A\0242gNF\023{wNS\037aP\006I\026qa\013N>gr\031I\024r\\\034D\037gV\000A\030yv\n";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\035E\016V{\007L\036gv\000d\btd\007N\035Za\nE\bP}\017B\026pw";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "+R\bzaNC\022t}\tI\024r3\rH\023yw\034E\0245w\034A\r|}\t\000\025gw\013R";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "8I\037bC\017G\037g";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "8I\037bC\017G\037g";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\001N*tt\013s\031g|\002L\037q3\nI\0365}\001TZvr\002LZff\036E\bv\177\017S\t5z\003P\026p~\013N\016tg\007O\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\001N*tt\013s\031g|\002L\037q3\nI\0365}\001TZvr\002LZff\036E\bv\177\017S\t5z\003P\026p~\013N\016tg\007O\024";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "-A\024{|\032\000\033qwNP\033rv\034\000\036pp\001RZcz\013WZqf\034I\024r3\002A\003zf\032";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "B\000\034zf\000D@5";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ":H\0375r\036P\026|p\017T\023z}ISZEr\tE\bTw\017P\016paNC\022t}\tE\0365g\006EZtw\017P\016paISZv|\000T\037{g\035\000\r|g\006O\017a3\rA\026yz\000GZEr\tE\bTw\017P\016paMN\025az\bY>tg\017s\037aP\006A\024rv\n\001ZPk\036E\031av\n\000\033qr\036T\037g3\007T\037x3\rO\017{gT\0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Np\033rv\034\000\031yr\035S@5";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Np\033rv\034\000\023q)N";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "Np\bzq\002E\027tg\007CZtw\017P\016paT\0";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "8I\037bC\017G\037g";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "NT\025z3\035M\033y\177U\000\036pu\017U\026az\000GZa|N";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "<E\013`v\035T\037q3\001F\034fp\034E\037{3\036A\035p3\002I\027|gN";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\017R\bzd=C\bz\177\002\000\016gz\013DZa|NF\023{wNF\025vf\035\000\030t`\013DZz}NN\025{>\rH\023ywNC\017ga\013N\0165u\001C\017fv\n\000\f|v\031\0";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "N\035D5";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "8I\037bC\017G\037g";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                z = as;
                LAYOUT_ATTRS = (new int[] {
                    0x10100b3
                });
                COMPARATOR = new _cls1();
                sInterpolator = new _cls2();
                sPositionComparator = new ViewPositionComparator();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 540
    //                   0 563
    //                   1 570
    //                   2 577
    //                   3 584;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_584;
_L3:
        byte byte1 = 19;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 110;
          goto _L9
_L5:
        byte1 = 32;
          goto _L9
_L6:
        byte1 = 122;
          goto _L9
        byte1 = 21;
          goto _L9
    }





    private class ItemInfo
    {

        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo()
        {
        }
    }


    private class _cls3
        implements Runnable
    {

        final ViewPager this$0;

        public void run()
        {
            setScrollState(0);
            populate();
        }

        _cls3()
        {
            this$0 = ViewPager.this;
            super();
        }
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams()
        {
            super(-1, -1);
            widthFactor = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            widthFactor = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS);
            gravity = context.getInteger(0, 48);
            context.recycle();
        }
    }


    private class OnPageChangeListener
    {

        public abstract void onPageScrollStateChanged(int i);

        public abstract void onPageScrolled(int i, float f, int j);

        public abstract void onPageSelected(int i);
    }


    private class Decor
    {
    }


    private class MyAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final ViewPager this$0;

        private boolean canScroll()
        {
            return mAdapter != null && mAdapter.getCount() > 1;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = AccessibilityRecordCompat.obtain();
            view.setScrollable(canScroll());
            if (accessibilityevent.getEventType() == 4096 && mAdapter != null)
            {
                view.setItemCount(mAdapter.getCount());
                view.setFromIndex(mCurItem);
                view.setToIndex(mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            accessibilitynodeinfocompat.setClassName(android/support/v4/view/ViewPager.getName());
            accessibilitynodeinfocompat.setScrollable(canScroll());
            if (canScrollHorizontally(1))
            {
                accessibilitynodeinfocompat.addAction(4096);
            }
            if (canScrollHorizontally(-1))
            {
                accessibilitynodeinfocompat.addAction(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i, bundle))
            {
                return true;
            }
            switch (i)
            {
            default:
                return false;

            case 4096: 
                if (canScrollHorizontally(1))
                {
                    setCurrentItem(mCurItem + 1);
                    return true;
                } else
                {
                    return false;
                }

            case 8192: 
                break;
            }
            if (canScrollHorizontally(-1))
            {
                setCurrentItem(mCurItem - 1);
                return true;
            } else
            {
                return false;
            }
        }

        MyAccessibilityDelegate()
        {
            this$0 = ViewPager.this;
            super();
        }
    }


    private class PageTransformer
    {

        public abstract void transformPage(View view, float f);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR;
        private static final String z[];
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public String toString()
        {
            return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(position).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(position);
            parcel.writeParcelable(adapterState, i);
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[2];
            obj = "^+X\006i}7M1e\177<KOWy/\\\005Wl8M\004\177";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    i = 1;
                    obj = "8)V\022ml0V\0179";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    z = as;
                    class _cls1
                        implements ParcelableCompatCreatorCallbacks
                    {

                        public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
                        {
                            return new SavedState(parcel, classloader);
                        }

                        public Object createFromParcel(Parcel parcel, ClassLoader classloader)
                        {
                            return createFromParcel(parcel, classloader);
                        }

                        public SavedState[] newArray(int l)
                        {
                            return new SavedState[l];
                        }

                        public Object[] newArray(int l)
                        {
                            return newArray(l);
                        }

                _cls1()
                {
                }
                    }

                    CREATOR = ParcelableCompat.newCreator(new _cls1());
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 148
        //                       0 168
        //                       1 174
        //                       2 180
        //                       3 186;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_186;
_L3:
            byte byte0 = 4;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 24;
              goto _L9
_L5:
            byte0 = 89;
              goto _L9
_L6:
            byte0 = 57;
              goto _L9
            byte0 = 97;
              goto _L9
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            position = parcel.readInt();
            adapterState = parcel.readParcelable(classloader1);
            loader = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private class PagerObserver extends DataSetObserver
    {

        final ViewPager this$0;

        public void onChanged()
        {
            dataSetChanged();
        }

        public void onInvalidated()
        {
            dataSetChanged();
        }

        private PagerObserver()
        {
            this$0 = ViewPager.this;
            super();
        }

        PagerObserver(_cls1 _pcls1)
        {
            this();
        }
    }


    private class OnAdapterChangeListener
    {

        public abstract void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1);
    }


    private class _cls1
        implements Comparator
    {

        public int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
        {
            return iteminfo.position - iteminfo1.position;
        }

        public int compare(Object obj, Object obj1)
        {
            return compare((ItemInfo)obj, (ItemInfo)obj1);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Interpolator
    {

        public float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

        _cls2()
        {
        }
    }


    private class ViewPositionComparator
        implements Comparator
    {

        public int compare(View view, View view1)
        {
            view = (LayoutParams)view.getLayoutParams();
            view1 = (LayoutParams)view1.getLayoutParams();
            if (((LayoutParams) (view)).isDecor != ((LayoutParams) (view1)).isDecor)
            {
                return !((LayoutParams) (view)).isDecor ? -1 : 1;
            } else
            {
                return ((LayoutParams) (view)).position - ((LayoutParams) (view1)).position;
            }
        }

        public int compare(Object obj, Object obj1)
        {
            return compare((View)obj, (View)obj1);
        }

        ViewPositionComparator()
        {
        }
    }

}
