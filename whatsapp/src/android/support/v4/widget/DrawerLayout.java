// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayoutImpl, SlidingPaneLayout, ViewDragHelper

public class DrawerLayout extends ViewGroup
    implements DrawerLayoutImpl
{

    private static final boolean CAN_HIDE_DESCENDANTS;
    static final DrawerLayoutCompatImpl IMPL;
    private static final int LAYOUT_ATTRS[];
    private static final String z[];
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        int j = SlidingPaneLayout.a;
        super(context, attributeset, i);
        mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
        mScrimColor = 0x99000000;
        mScrimPaint = new Paint();
        mFirstLayout = true;
        setDescendantFocusability(0x40000);
        float f = getResources().getDisplayMetrics().density;
        mMinDrawerMargin = (int)(64F * f + 0.5F);
        f *= 400F;
        try
        {
            mLeftCallback = new ViewDragCallback(3);
            mRightCallback = new ViewDragCallback(5);
            mLeftDragger = ViewDragHelper.create(this, 1.0F, mLeftCallback);
            mLeftDragger.setEdgeTrackingEnabled(1);
            mLeftDragger.setMinVelocity(f);
            mLeftCallback.setDragger(mLeftDragger);
            mRightDragger = ViewDragHelper.create(this, 1.0F, mRightCallback);
            mRightDragger.setEdgeTrackingEnabled(2);
            mRightDragger.setMinVelocity(f);
            mRightCallback.setDragger(mRightDragger);
            setFocusableInTouchMode(true);
            ViewCompat.setImportantForAccessibility(this, 1);
            ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
            ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
            if (ViewCompat.getFitsSystemWindows(this))
            {
                IMPL.configureApplyInsets(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j != 0)
        {
            Fragment.a++;
        }
    }

    private View findVisibleDrawer()
    {
        int i;
        int j;
        int k;
        j = SlidingPaneLayout.a;
        k = getChildCount();
        i = 0;
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        View view = getChildAt(i);
        boolean flag;
        try
        {
            flag = isDrawerView(view);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (isDrawerVisible(view))
        {
            return view;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        return null;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String gravityToString(int i)
    {
        if ((i & 3) == 3)
        {
            String s;
            try
            {
                s = z[6];
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return s;
        }
        if ((i & 5) == 5)
        {
            String s1;
            try
            {
                s1 = z[7];
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return s1;
        } else
        {
            return Integer.toHexString(i);
        }
    }

    private static boolean hasOpaqueBackground(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            int i;
            try
            {
                i = view.getOpacity();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            flag = flag1;
            if (i == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean hasPeekingDrawer()
    {
        int j = SlidingPaneLayout.a;
        int k = getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
                    boolean flag;
                    try
                    {
                        flag = layoutparams.isPeeking;
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (flag)
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

    private boolean hasVisibleDrawer()
    {
        View view;
        try
        {
            view = findVisibleDrawer();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return view != null;
    }

    private static boolean includeChildForAccessibility(View view)
    {
        int i;
        try
        {
            i = ViewCompat.getImportantForAccessibility(view);
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
        if (i == 4)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (ViewCompat.getImportantForAccessibility(view) != 2)
        {
            return true;
        }
        return false;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean flag)
    {
        int i;
        int j;
        int k;
        j = SlidingPaneLayout.a;
        k = getChildCount();
        i = 0;
_L2:
        View view1;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(i);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        boolean flag1 = isDrawerView(view1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!flag || view1 != view)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        try
        {
            ViewCompat.setImportantForAccessibility(view1, 1);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ViewCompat.setImportantForAccessibility(view1, 4);
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        return;
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
        throw view;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        if (findOpenDrawer() == null)
        {
            boolean flag;
            try
            {
                flag = isDrawerView(view);
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
                break MISSING_BLOCK_LABEL_37;
            }
        }
        ViewCompat.setImportantForAccessibility(view, 4);
        if (SlidingPaneLayout.a == 0)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ViewCompat.setImportantForAccessibility(view, 1);
        try
        {
            if (!CAN_HIDE_DESCENDANTS)
            {
                ViewCompat.setAccessibilityDelegate(view, mChildAccessibilityDelegate);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
    }

    void cancelChildViewTouch()
    {
        int i = 0;
        int j = SlidingPaneLayout.a;
        if (!mChildrenCanceledTouch)
        {
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            int k = getChildCount();
            do
            {
                if (i >= k)
                {
                    break;
                }
                getChildAt(i).dispatchTouchEvent(motionevent);
                i++;
            } while (j == 0);
            motionevent.recycle();
            mChildrenCanceledTouch = true;
        }
    }

    boolean checkDrawerViewAbsoluteGravity(View view, int i)
    {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
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

    public void closeDrawer(View view)
    {
        LayoutParams layoutparams;
        int i;
        i = SlidingPaneLayout.a;
        try
        {
            if (!isDrawerView(view))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[2]).append(view).append(z[3]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!mFirstLayout)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        layoutparams.onScreen = 0.0F;
        layoutparams.knownOpen = false;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        boolean flag = checkDrawerViewAbsoluteGravity(view, 3);
        if (flag)
        {
            try
            {
                mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_134;
            }
        }
        mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
        invalidate();
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public void closeDrawers()
    {
        closeDrawers(false);
    }

    void closeDrawers(boolean flag)
    {
        boolean flag1;
        int i;
        int j;
        int k;
        j = SlidingPaneLayout.a;
        k = getChildCount();
        i = 0;
        flag1 = false;
_L2:
        View view;
        LayoutParams layoutparams;
        boolean flag2;
        flag2 = flag1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        view = getChildAt(i);
        layoutparams = (LayoutParams)view.getLayoutParams();
        boolean flag3 = isDrawerView(view);
label0:
        {
label1:
            {
                flag2 = flag1;
                if (!flag3)
                {
                    break label0;
                }
                if (flag)
                {
                    IllegalArgumentException illegalargumentexception;
                    int l;
                    boolean flag4;
                    try
                    {
                        flag4 = layoutparams.isPeeking;
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                    if (!flag4)
                    {
                        flag2 = flag1;
                        if (j == 0)
                        {
                            break label0;
                        }
                    }
                }
                l = view.getWidth();
                flag2 = flag1;
                if (checkDrawerViewAbsoluteGravity(view, 3))
                {
                    flag1 |= mLeftDragger.smoothSlideViewTo(view, -l, view.getTop());
                    flag2 = flag1;
                    if (j == 0)
                    {
                        break label1;
                    }
                    flag2 = flag1;
                }
                flag2 |= mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
            }
            layoutparams.isPeeking = false;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        try
        {
            mLeftCallback.removeCallbacks();
            mRightCallback.removeCallbacks();
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        invalidate();
        return;
        illegalargumentexception;
        throw illegalargumentexception;
        illegalargumentexception;
        throw illegalargumentexception;
        i++;
        flag1 = flag2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void computeScroll()
    {
        int j = SlidingPaneLayout.a;
        int k = getChildCount();
        float f = 0.0F;
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    f = Math.max(f, ((LayoutParams)getChildAt(i).getLayoutParams()).onScreen);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                try
                {
                    mScrimOpacity = f;
                    if (mLeftDragger.continueSettling(true) | mRightDragger.continueSettling(true))
                    {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
            i++;
        } while (true);
    }

    void dispatchOnDrawerClosed(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        boolean flag = layoutparams.knownOpen;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        try
        {
            layoutparams.knownOpen = false;
            if (mListener != null)
            {
                mListener.onDrawerClosed(view);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        updateChildrenImportantForAccessibility(view, false);
        if (!hasWindowFocus())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        view = getRootView();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        view.sendAccessibilityEvent(32);
        return;
        view;
        throw view;
        view;
        throw view;
    }

    void dispatchOnDrawerOpened(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        boolean flag = layoutparams.knownOpen;
        if (!flag)
        {
            try
            {
                layoutparams.knownOpen = true;
                if (mListener != null)
                {
                    mListener.onDrawerOpened(view);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            updateChildrenImportantForAccessibility(view, true);
            view.requestFocus();
        }
        return;
        view;
        throw view;
    }

    void dispatchOnDrawerSlide(View view, float f)
    {
        try
        {
            if (mListener != null)
            {
                mListener.onDrawerSlide(view, f);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        int i;
        int j;
        int k;
        int i2;
        int j2;
        int k2;
        boolean flag;
        i2 = SlidingPaneLayout.a;
        k2 = getHeight();
        flag = isContentView(view);
        k = 0;
        i = getWidth();
        j2 = canvas.save();
        j = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        int l1;
        int l2;
        l2 = getChildCount();
        l1 = 0;
        k = 0;
        j = i;
        i = k;
_L15:
        View view1;
        if (l1 >= l2)
        {
            break MISSING_BLOCK_LABEL_649;
        }
        view1 = getChildAt(l1);
        k = i;
        if (view1 == view) goto _L4; else goto _L3
_L3:
        int j1 = view1.getVisibility();
        k = i;
        if (j1 != 0) goto _L4; else goto _L5
_L5:
        boolean flag1 = hasOpaqueBackground(view1);
        k = i;
        if (!flag1) goto _L4; else goto _L6
_L6:
        flag1 = isDrawerView(view1);
        k = i;
        if (!flag1) goto _L4; else goto _L7
_L7:
        k = view1.getHeight();
        if (k >= k2) goto _L9; else goto _L8
_L8:
        k = i;
        if (i2 == 0) goto _L4; else goto _L9
_L9:
        float f;
        int k1;
        boolean flag2;
        try
        {
            flag2 = checkDrawerViewAbsoluteGravity(view1, 3);
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        k1 = i;
        if (!flag2) goto _L11; else goto _L10
_L10:
        k = view1.getRight();
        k1 = i;
        if (k > i)
        {
            k1 = k;
        }
        k = k1;
        if (i2 == 0) goto _L4; else goto _L11
_L11:
        i = view1.getLeft();
        k = k1;
        if (i >= j) goto _L4; else goto _L12
_L12:
        j = k1;
_L16:
        if (i2 == 0) goto _L14; else goto _L13
_L13:
        canvas.clipRect(j, 0, i, getHeight());
        k = j;
        j = i;
_L2:
        flag2 = super.drawChild(canvas, view, l);
        try
        {
            canvas.restoreToCount(j2);
            f = mScrimOpacity;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (f > 0.0F && flag)
        {
            i = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
            k1 = mScrimColor;
            try
            {
                mScrimPaint.setColor(i << 24 | k1 & 0xffffff);
                canvas.drawRect(k, 0.0F, j, getHeight(), mScrimPaint);
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
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_584;
            }
        }
        if (mShadowLeft == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        flag = checkDrawerViewAbsoluteGravity(view, 3);
        if (flag)
        {
            i = mShadowLeft.getIntrinsicWidth();
            j = view.getRight();
            k = mLeftDragger.getEdgeSize();
            f = Math.max(0.0F, Math.min((float)j / (float)k, 1.0F));
            try
            {
                mShadowLeft.setBounds(j, view.getTop(), i + j, view.getBottom());
                mShadowLeft.setAlpha((int)(255F * f));
                mShadowLeft.draw(canvas);
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
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_584;
            }
        }
        if (mShadowRight == null)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        flag = checkDrawerViewAbsoluteGravity(view, 5);
        if (flag)
        {
            i = mShadowRight.getIntrinsicWidth();
            j = view.getLeft();
            k = getWidth();
            k1 = mRightDragger.getEdgeSize();
            f = Math.max(0.0F, Math.min((float)(k - j) / (float)k1, 1.0F));
            mShadowRight.setBounds(j - i, view.getTop(), j, view.getBottom());
            mShadowRight.setAlpha((int)(255F * f));
            mShadowRight.draw(canvas);
        }
        return flag2;
        canvas;
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
        catch (Canvas canvas) { }
        try
        {
            throw canvas;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas) { }
        throw canvas;
_L14:
        l1++;
        k = i;
        i = j;
        j = k;
          goto _L15
_L4:
        i = j;
        j = k;
          goto _L16
        int i1 = i;
        i = j;
        j = i1;
          goto _L13
    }

    View findDrawerWithGravity(int i)
    {
        int j = SlidingPaneLayout.a;
        int k = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        int l = getChildCount();
        i = 0;
        do
        {
label0:
            {
                if (i < l)
                {
                    View view = getChildAt(i);
                    if ((getDrawerViewAbsoluteGravity(view) & 7) == (k & 7))
                    {
                        return view;
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            i++;
        } while (true);
    }

    View findOpenDrawer()
    {
        int j = SlidingPaneLayout.a;
        int k = getChildCount();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    View view = getChildAt(i);
                    boolean flag;
                    try
                    {
                        flag = ((LayoutParams)view.getLayoutParams()).knownOpen;
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (flag)
                    {
                        return view;
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            i++;
        } while (true);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
label0:
        {
            try
            {
                if (!(layoutparams instanceof LayoutParams))
                {
                    break label0;
                }
                layoutparams = new LayoutParams((LayoutParams)layoutparams);
            }
            // Misplaced declaration of an exception variable
            catch (android.view.ViewGroup.LayoutParams layoutparams)
            {
                throw layoutparams;
            }
            return layoutparams;
        }
label1:
        {
            try
            {
                if (!(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams))
                {
                    break label1;
                }
                layoutparams = new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
            }
            // Misplaced declaration of an exception variable
            catch (android.view.ViewGroup.LayoutParams layoutparams)
            {
                throw layoutparams;
            }
            return layoutparams;
        }
        return new LayoutParams(layoutparams);
    }

    public int getDrawerLockMode(View view)
    {
        int i = getDrawerViewAbsoluteGravity(view);
        if (i == 3)
        {
            try
            {
                i = mLockModeLeft;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            return i;
        }
        if (i == 5)
        {
            int j;
            try
            {
                j = mLockModeRight;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            return j;
        } else
        {
            return 0;
        }
    }

    public CharSequence getDrawerTitle(int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (i == 3)
        {
            CharSequence charsequence;
            try
            {
                charsequence = mTitleLeft;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return charsequence;
        }
        if (i == 5)
        {
            CharSequence charsequence1;
            try
            {
                charsequence1 = mTitleRight;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return charsequence1;
        } else
        {
            return null;
        }
    }

    int getDrawerViewAbsoluteGravity(View view)
    {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
    }

    float getDrawerViewOffset(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).onScreen;
    }

    boolean isContentView(View view)
    {
        int i;
        try
        {
            i = ((LayoutParams)view.getLayoutParams()).gravity;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        return i == 0;
    }

    boolean isDrawerView(View view)
    {
        return (GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view)) & 7) != 0;
    }

    public boolean isDrawerVisible(View view)
    {
        try
        {
            if (!isDrawerView(view))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[4]).append(view).append(z[5]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        float f;
        try
        {
            f = ((LayoutParams)view.getLayoutParams()).onScreen;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        return f > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mFirstLayout = true;
    }

    public void onDraw(Canvas canvas)
    {
        Drawable drawable;
        int i;
        try
        {
            super.onDraw(canvas);
            if (!mDrawStatusBarBackground)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            drawable = mStatusBarBackground;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        i = IMPL.getTopInset(mLastInsets);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        mStatusBarBackground.setBounds(0, 0, getWidth(), i);
        mStatusBarBackground.draw(canvas);
        return;
        canvas;
        throw canvas;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag2 = false;
        j = SlidingPaneLayout.a;
        i = MotionEventCompat.getActionMasked(motionevent);
        flag3 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
        flag4 = mRightDragger.shouldInterceptTouchEvent(motionevent);
        i;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 112
    //                   1 279
    //                   2 285
    //                   3 279;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L14:
        if (flag3 | flag4 || flag) goto _L6; else goto _L5
_L5:
        flag3 = hasPeekingDrawer();
        if (flag3) goto _L6; else goto _L7
_L7:
        float f;
        float f1;
        boolean flag1;
        boolean flag5;
        try
        {
            flag3 = mChildrenCanceledTouch;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag3) goto _L8; else goto _L6
_L6:
        flag2 = true;
_L8:
        return flag2;
_L2:
        f = motionevent.getX();
        f1 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f1;
        if (mScrimOpacity <= 0.0F) goto _L10; else goto _L9
_L9:
        motionevent = mLeftDragger.findTopChildUnder((int)f, (int)f1);
        if (motionevent == null) goto _L10; else goto _L11
_L11:
        try
        {
            flag5 = isContentView(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag5) goto _L10; else goto _L12
_L12:
        flag1 = true;
_L17:
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        flag = flag1;
        if (j == 0) goto _L14; else goto _L13
_L13:
        flag5 = mLeftDragger.checkTouchSlop(3);
        flag = flag1;
        if (!flag5) goto _L14; else goto _L15
_L15:
        try
        {
            mLeftCallback.removeCallbacks();
            mRightCallback.removeCallbacks();
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        flag = flag1;
        if (j == 0) goto _L14; else goto _L16
_L16:
        flag = flag1;
_L18:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
          goto _L14
        motionevent;
        try
        {
            throw motionevent;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent) { }
        throw motionevent;
        motionevent;
        throw motionevent;
_L10:
        flag1 = false;
          goto _L17
_L3:
        flag = false;
          goto _L18
_L4:
        flag1 = false;
          goto _L13
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
label0:
        {
            if (i != 4)
            {
                break label0;
            }
            try
            {
                if (!hasVisibleDrawer())
                {
                    break label0;
                }
                KeyEventCompat.startTracking(keyevent);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent)
            {
                throw keyevent;
            }
            return true;
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            keyevent = findVisibleDrawer();
            if (keyevent != null)
            {
                try
                {
                    if (getDrawerLockMode(keyevent) == 0)
                    {
                        closeDrawers();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (KeyEvent keyevent)
                {
                    throw keyevent;
                }
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1;
        int k1;
        int l1;
        int i2;
        k1 = SlidingPaneLayout.a;
        mInLayout = true;
        l1 = k - i;
        i2 = getChildCount();
        i1 = 0;
_L2:
label0:
        {
label1:
            {
label2:
                {
                    if (i1 >= i2)
                    {
                        break label0;
                    }
                    View view = getChildAt(i1);
                    float f;
                    float f1;
                    LayoutParams layoutparams;
                    int j1;
                    int j2;
                    int k2;
                    int l2;
                    int i3;
                    try
                    {
                        i = view.getVisibility();
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        throw illegalargumentexception;
                    }
                    if (i == 8 && k1 == 0)
                    {
                        break label1;
                    }
                    layoutparams = (LayoutParams)view.getLayoutParams();
                    try
                    {
                        if (!isContentView(view))
                        {
                            break label2;
                        }
                        view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                    if (k1 == 0)
                    {
                        break label1;
                    }
                }
label3:
                {
                    j2 = view.getMeasuredWidth();
                    k2 = view.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(view, 3))
                    {
                        i = -j2;
                        j1 = (int)((float)j2 * layoutparams.onScreen) + i;
                        f = (float)(j2 + j1) / (float)j2;
                        if (k1 == 0)
                        {
                            break label3;
                        }
                    }
                    j1 = l1 - (int)((float)j2 * layoutparams.onScreen);
                    f = (float)(l1 - j1) / (float)j2;
                }
label4:
                {
label5:
                    {
                        boolean flag1;
                        try
                        {
                            f1 = layoutparams.onScreen;
                        }
                        catch (IllegalArgumentException illegalargumentexception2)
                        {
                            throw illegalargumentexception2;
                        }
                        if (f != f1)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        switch (layoutparams.gravity & 0x70)
                        {
                        default:
                            try
                            {
                                view.layout(j1, layoutparams.topMargin, j1 + j2, layoutparams.topMargin + k2);
                            }
                            catch (IllegalArgumentException illegalargumentexception3)
                            {
                                throw illegalargumentexception3;
                            }
                            if (k1 == 0)
                            {
                                break label4;
                            }
                            // fall through

                        case 80: // 'P'
                            i = l - j;
                            view.layout(j1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), j1 + j2, i - layoutparams.bottomMargin);
                            if (k1 == 0)
                            {
                                break label4;
                            }
                            // fall through

                        case 16: // '\020'
                            l2 = l - j;
                            k = (l2 - k2) / 2;
                            i = k;
                            break;
                        }
                        if (k < layoutparams.topMargin)
                        {
                            i = layoutparams.topMargin;
                            k = i;
                            if (k1 == 0)
                            {
                                break label5;
                            }
                        }
                        try
                        {
                            i3 = layoutparams.bottomMargin;
                        }
                        catch (IllegalArgumentException illegalargumentexception4)
                        {
                            throw illegalargumentexception4;
                        }
                        k = i;
                        if (i + k2 > l2 - i3)
                        {
                            k = l2 - layoutparams.bottomMargin - k2;
                        }
                    }
                    view.layout(j1, k, j2 + j1, k2 + k);
                }
                if (flag1)
                {
                    try
                    {
                        setDrawerViewOffset(view, f);
                    }
                    catch (IllegalArgumentException illegalargumentexception5)
                    {
                        throw illegalargumentexception5;
                    }
                }
                try
                {
                    f = layoutparams.onScreen;
                }
                catch (IllegalArgumentException illegalargumentexception6)
                {
                    throw illegalargumentexception6;
                }
                if (f > 0.0F)
                {
                    i = 0;
                } else
                {
                    i = 4;
                }
                try
                {
                    if (view.getVisibility() != i)
                    {
                        view.setVisibility(i);
                    }
                }
                catch (IllegalArgumentException illegalargumentexception7)
                {
                    throw illegalargumentexception7;
                }
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_535;
            }
        }
        mInLayout = false;
        mFirstLayout = false;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onMeasure(int i, int j)
    {
        int l;
        int i1;
        int l2;
label0:
        {
label1:
            {
label2:
                {
                    l2 = SlidingPaneLayout.a;
                    int k = android.view.View.MeasureSpec.getMode(i);
                    int j2 = android.view.View.MeasureSpec.getMode(j);
                    int j1 = android.view.View.MeasureSpec.getSize(i);
                    int l1 = android.view.View.MeasureSpec.getSize(j);
                    if (k == 0x40000000)
                    {
                        l = l1;
                        i1 = j1;
                        if (j2 == 0x40000000)
                        {
                            break label0;
                        }
                    }
                    IllegalArgumentException illegalargumentexception;
                    boolean flag1;
                    try
                    {
                        flag1 = isInEditMode();
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                    if (!flag1)
                    {
                        break label1;
                    }
                    l = k;
                    if (k == 0x80000000)
                    {
                        l = 0x40000000;
                        k = j1;
                        if (l2 == 0)
                        {
                            break label2;
                        }
                    }
                    k = j1;
                    if (l == 0)
                    {
                        k = 300;
                    }
                }
                j1 = j2;
                if (j2 == 0x80000000)
                {
                    j1 = 0x40000000;
                    l = l1;
                    i1 = k;
                    if (l2 == 0)
                    {
                        break label0;
                    }
                }
                l = l1;
                i1 = k;
                if (j1 != 0)
                {
                    break label0;
                }
                l = 300;
                i1 = k;
                if (l2 == 0)
                {
                    break label0;
                }
            }
            try
            {
                throw new IllegalArgumentException(z[12]);
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        Object obj;
        setMeasuredDimension(i1, l);
        obj = mLastInsets;
        if (obj == null) goto _L2; else goto _L1
_L1:
        LayoutParams layoutparams;
        boolean flag;
        int k1;
        int i2;
        int k2;
        boolean flag2;
        try
        {
            flag2 = ViewCompat.getFitsSystemWindows(this);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag2) goto _L2; else goto _L3
_L3:
        flag = true;
_L12:
        i2 = ViewCompat.getLayoutDirection(this);
        k2 = getChildCount();
        k1 = 0;
_L13:
        if (k1 >= k2) goto _L5; else goto _L4
_L4:
        obj = getChildAt(k1);
        int i3;
        int k3;
        boolean flag3;
        try
        {
            i3 = ((View) (obj)).getVisibility();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i3 == 8 && l2 == 0) goto _L7; else goto _L6
_L6:
        layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        i3 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, i2);
        flag3 = ViewCompat.getFitsSystemWindows(((View) (obj)));
        if (flag3)
        {
            try
            {
                IMPL.dispatchChildInsets(((View) (obj)), mLastInsets, i3);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (l2 == 0)
            {
                break MISSING_BLOCK_LABEL_332;
            }
        }
        IMPL.applyMarginInsets(layoutparams, mLastInsets, i3);
        if (!isContentView(((View) (obj)))) goto _L9; else goto _L8
_L8:
        i3 = android.view.View.MeasureSpec.makeMeasureSpec(i1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000);
        k3 = android.view.View.MeasureSpec.makeMeasureSpec(l - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000);
        try
        {
            ((View) (obj)).measure(i3, k3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l2 == 0) goto _L7; else goto _L9
_L9:
        flag3 = isDrawerView(((View) (obj)));
        if (!flag3) goto _L11; else goto _L10
        obj;
        throw obj;
_L2:
        flag = false;
          goto _L12
        obj;
        throw obj;
_L10:
        i3 = getDrawerViewAbsoluteGravity(((View) (obj))) & 7;
        if ((0 & i3) != 0)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(z[9]).append(gravityToString(i3)).append(z[16]).append(z[13]).append(z[14]).append(z[15]).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        int j3 = getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width);
        int l3 = getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height);
        try
        {
            ((View) (obj)).measure(j3, l3);
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            throw illegalargumentexception2;
        }
        if (l2 == 0) goto _L7; else goto _L11
_L11:
        throw new IllegalStateException((new StringBuilder()).append(z[10]).append(obj).append(z[8]).append(k1).append(z[11]).append(z[17]).toString());
_L7:
        if (l2 == 0)
        {
            break MISSING_BLOCK_LABEL_658;
        }
_L5:
        return;
        k1++;
          goto _L13
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).openDrawerGravity != 0)
        {
            View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
            if (view != null)
            {
                try
                {
                    openDrawer(view);
                }
                // Misplaced declaration of an exception variable
                catch (Parcelable parcelable)
                {
                    throw parcelable;
                }
            }
        }
        setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
        setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = findOpenDrawer();
        if (view != null)
        {
            try
            {
                savedstate.openDrawerGravity = ((LayoutParams)view.getLayoutParams()).gravity;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        savedstate.lockModeLeft = mLockModeLeft;
        savedstate.lockModeRight = mLockModeRight;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        flag = false;
        i = SlidingPaneLayout.a;
        mLeftDragger.processTouchEvent(motionevent);
        mRightDragger.processTouchEvent(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 66
    //                   1 101
    //                   2 64
    //                   3 220;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        if (i == 0) goto _L1; else goto _L3
_L3:
        float f3 = motionevent.getX();
        float f1 = motionevent.getY();
        motionevent = mLeftDragger.findTopChildUnder((int)f3, (int)f1);
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        int j;
        boolean flag1;
        try
        {
            flag1 = isContentView(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        f3 -= mInitialMotionX;
        f1 -= mInitialMotionY;
        j = mLeftDragger.getTouchSlop();
        if (f3 * f3 + f1 * f1 >= (float)(j * j))
        {
            break MISSING_BLOCK_LABEL_246;
        }
        motionevent = findOpenDrawer();
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        try
        {
            j = getDrawerLockMode(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (j == 2)
        {
            flag = true;
        }
_L5:
        try
        {
            closeDrawers(flag);
            mDisallowInterceptRequested = false;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw motionevent;
        }
        if (i == 0) goto _L1; else goto _L4
_L4:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        return true;
        flag = true;
          goto _L5
    }

    public void openDrawer(View view)
    {
        LayoutParams layoutparams;
        int i;
        i = SlidingPaneLayout.a;
        try
        {
            if (!isDrawerView(view))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[0]).append(view).append(z[1]).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!mFirstLayout)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        layoutparams.onScreen = 1.0F;
        layoutparams.knownOpen = true;
        updateChildrenImportantForAccessibility(view, true);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        boolean flag = checkDrawerViewAbsoluteGravity(view, 3);
        if (flag)
        {
            try
            {
                mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_141;
            }
        }
        mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
        invalidate();
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        try
        {
            super.requestDisallowInterceptTouchEvent(flag);
            mDisallowInterceptRequested = flag;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        closeDrawers(true);
    }

    public void requestLayout()
    {
        try
        {
            if (!mInLayout)
            {
                super.requestLayout();
            }
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
    }

    public void setChildInsets(Object obj, boolean flag)
    {
        mLastInsets = obj;
        mDrawStatusBarBackground = flag;
        if (flag) goto _L2; else goto _L1
_L1:
        try
        {
            obj = getBackground();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != null) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        setWillNotDraw(flag);
        requestLayout();
        return;
        obj;
        throw obj;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setDrawerLockMode(int i, int j)
    {
        int k;
        k = SlidingPaneLayout.a;
        j = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(this));
        if (j != 3)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        mLockModeLeft = i;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (j == 5)
        {
            try
            {
                mLockModeRight = i;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (i != 0)
        {
            Object obj;
            if (j == 3)
            {
                try
                {
                    obj = mLeftDragger;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            } else
            {
                obj = mRightDragger;
            }
            ((ViewDragHelper) (obj)).cancel();
        }
        i;
        JVM INSTR tableswitch 1 2: default 80
    //                   1 118
    //                   2 98;
           goto _L1 _L2 _L3
_L1:
        return;
        obj;
        View view;
        throw obj;
_L3:
        if ((view = findDrawerWithGravity(j)) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        IllegalArgumentException illegalargumentexception;
        try
        {
            openDrawer(view);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if ((view = findDrawerWithGravity(j)) != null)
        {
            try
            {
                closeDrawer(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void setDrawerViewOffset(View view, float f)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        float f1;
        try
        {
            f1 = layoutparams.onScreen;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (f == f1)
        {
            return;
        } else
        {
            layoutparams.onScreen = f;
            dispatchOnDrawerSlide(view, f);
            return;
        }
    }

    void updateDrawerState(int i, int j, View view)
    {
        i = 2;
        int k = SlidingPaneLayout.a;
        int l = mLeftDragger.getViewDragState();
        int i1 = mRightDragger.getViewDragState();
        float f;
        LayoutParams layoutparams;
        if (l != 1 && i1 != 1 || k != 0)
        {
            if (l != 2 && i1 != 2 || k != 0)
            {
                i = 0;
            }
        } else
        {
            i = 1;
        }
        if (view == null || j != 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        layoutparams = (LayoutParams)view.getLayoutParams();
        f = layoutparams.onScreen;
        if (f != 0.0F)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        dispatchOnDrawerClosed(view);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        try
        {
            if (layoutparams.onScreen == 1.0F)
            {
                dispatchOnDrawerOpened(view);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            j = mDrawerState;
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
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        mDrawerState = i;
        if (mListener != null)
        {
            mListener.onDrawerStateChanged(i);
        }
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        boolean flag;
        flag = true;
        as = new String[18];
        obj = "\035\003Q.*";
        byte0 = -1;
        j = 0;
_L10:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L7:
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "k\003Gyd$\036\0248*8\006]=c%\r\024=x*\035Q+";
                j = 1;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\035\003Q.*";
                j = 2;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "k\003Gyd$\036\0248*8\006]=c%\r\024=x*\035Q+";
                j = 3;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "\035\003Q.*";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "k\003Gyd$\036\0248*/\030U.o9";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\007/r\r";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "\031#s\021^";
                byte0 = 6;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "k\013@yc%\016Q!*";
                byte0 = 7;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "\b\002]5nk\016F8}.\030\0241k8JU;y$\006A-ok\rF8|\"\036My";
                byte0 = 8;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[j] = ((String) (obj));
                obj = "\b\002]5nk";
                byte0 = 9;
                j = 10;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "k\016[<yk\004[-*#\013B<**JB8f\"\016\0245k2\005A-U,\030U/c?\023\024t*&\037G-*)\017\024\036x*\034]-se&q\037^gJ";
                byte0 = 10;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "\017\030U.o9&U e>\036\0244\1778\036\024;ok\007Q8y>\030Q=*<\003@1*\006\017U*\1779\017g)o(Dq\001K\b>x\000$";
                byte0 = 11;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "\017\030U.o9&U e>\036";
                byte0 = 12;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "k\013X+o*\016Myb*\031\0248*";
                byte0 = 13;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "/\030U.o9JB0o<JU5e%\r\024-b*\036\024<n,\017";
                byte0 = 14;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "k\bA-*?\002]**";
                byte0 = 15;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "\f\030U/c?\023\032\013C\f\"`ye9Js+k=\003@ $\005%k\036X\n<}\rS";
                byte0 = 16;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[j] = ((String) (obj));
                z = as;
                int i;
                byte byte1;
                char c;
                try
                {
                    LAYOUT_ATTRS = (new int[] {
                        0x10100b3
                    });
                    i = android.os.Build.VERSION.SDK_INT;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                if (i < 19)
                {
                    flag = false;
                }
                CAN_HIDE_DESCENDANTS = flag;
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    try
                    {
                        IMPL = new DrawerLayoutCompatImplApi21();
                    }
                    catch (IllegalArgumentException illegalargumentexception1)
                    {
                        throw illegalargumentexception1;
                    }
                } else
                {
                    IMPL = new DrawerLayoutCompatImplBase();
                }
                break;
            }
            break MISSING_BLOCK_LABEL_593;
        }
        c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 520
    //                   0 543
    //                   1 550
    //                   2 557
    //                   3 564;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_564;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 10;
_L8:
        obj[k] = (char)(byte1 ^ c);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 75;
          goto _L8
_L3:
        byte1 = 106;
          goto _L8
_L4:
        byte1 = 52;
          goto _L8
        byte1 = 89;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }





    private class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final DrawerLayout this$0;

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            if (!DrawerLayout.includeChildForAccessibility(view))
            {
                accessibilitynodeinfocompat.setParent(null);
            }
        }

        ChildAccessibilityDelegate()
        {
            this$0 = DrawerLayout.this;
            super();
        }
    }


    private class ViewDragCallback extends ViewDragHelper.Callback
    {

        private final int mAbsGravity;
        private ViewDragHelper mDragger;
        private final Runnable mPeekRunnable = new _cls1();
        final DrawerLayout this$0;

        private void closeOtherDrawer()
        {
            byte byte0 = 3;
            if (mAbsGravity == 3)
            {
                byte0 = 5;
            }
            View view = findDrawerWithGravity(byte0);
            if (view != null)
            {
                closeDrawer(view);
            }
        }

        private void peekDrawer()
        {
            int i;
            int j;
            i = 0;
            j = mDragger.getEdgeSize();
            View view;
            LayoutParams layoutparams;
            boolean flag;
            if (mAbsGravity == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag) goto _L2; else goto _L1
_L1:
            view = findDrawerWithGravity(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            if (SlidingPaneLayout.a == 0) goto _L3; else goto _L2
_L2:
            view = findDrawerWithGravity(5);
            i = getWidth();
            i -= j;
_L5:
            if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
            {
                layoutparams = (LayoutParams)view.getLayoutParams();
                mDragger.smoothSlideViewTo(view, i, view.getTop());
                layoutparams.isPeeking = true;
                invalidate();
                closeOtherDrawer();
                cancelChildViewTouch();
            }
            return;
_L3:
            i += j;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
            if (checkDrawerViewAbsoluteGravity(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            } else
            {
                j = getWidth();
                return Math.max(j - view.getWidth(), Math.min(i, j));
            }
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view)
        {
            if (isDrawerView(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public void onEdgeDragStarted(int i, int j)
        {
            View view;
label0:
            {
                if ((i & 1) == 1)
                {
                    view = findDrawerWithGravity(3);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                view = findDrawerWithGravity(5);
            }
            if (view != null && getDrawerLockMode(view) == 0)
            {
                mDragger.captureChildView(view, j);
            }
        }

        public boolean onEdgeLock(int i)
        {
            return false;
        }

        public void onEdgeTouched(int i, int j)
        {
            postDelayed(mPeekRunnable, 160L);
        }

        public void onViewCaptured(View view, int i)
        {
            ((LayoutParams)view.getLayoutParams()).isPeeking = false;
            closeOtherDrawer();
        }

        public void onViewDragStateChanged(int i)
        {
            updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            float f;
label0:
            {
                j = view.getWidth();
                if (checkDrawerViewAbsoluteGravity(view, 3))
                {
                    f = (float)(j + i) / (float)j;
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                f = (float)(getWidth() - i) / (float)j;
            }
            setDrawerViewOffset(view, f);
            if (f == 0.0F)
            {
                i = 4;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
            invalidate();
        }

        public void onViewReleased(View view, float f, float f1)
        {
label0:
            {
                f1 = getDrawerViewOffset(view);
                int k = view.getWidth();
                if (checkDrawerViewAbsoluteGravity(view, 3))
                {
                    int i;
                    int j;
                    if (f > 0.0F || f == 0.0F && f1 > 0.5F)
                    {
                        i = 0;
                    } else
                    {
                        i = -k;
                    }
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                j = getWidth();
                if (f >= 0.0F)
                {
                    i = j;
                    if (f != 0.0F)
                    {
                        break label0;
                    }
                    i = j;
                    if (f1 <= 0.5F)
                    {
                        break label0;
                    }
                }
                i = j - k;
            }
            mDragger.settleCapturedViewAt(i, view.getTop());
            invalidate();
        }

        public void removeCallbacks()
        {
            DrawerLayout.this.removeCallbacks(mPeekRunnable);
        }

        public void setDragger(ViewDragHelper viewdraghelper)
        {
            mDragger = viewdraghelper;
        }

        public boolean tryCaptureView(View view, int i)
        {
            return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
        }


        public ViewDragCallback(int i)
        {
            this$0 = DrawerLayout.this;
            super();
            class _cls1
                implements Runnable
            {

                final ViewDragCallback this$1;

                public void run()
                {
                    peekDrawer();
                }

                _cls1()
                {
                    this$1 = ViewDragCallback.this;
                    super();
                }
            }

            mAbsGravity = i;
        }
    }


    private class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        private final Rect mTmpRect = new Rect();
        final DrawerLayout this$0;

        private void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
        {
            int j = SlidingPaneLayout.a;
            int k = viewgroup.getChildCount();
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                View view = viewgroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(view))
                {
                    accessibilitynodeinfocompat.addChild(view);
                }
                i++;
            } while (j == 0);
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
            Rect rect = mTmpRect;
            accessibilitynodeinfocompat1.getBoundsInParent(rect);
            accessibilitynodeinfocompat.setBoundsInParent(rect);
            accessibilitynodeinfocompat1.getBoundsInScreen(rect);
            accessibilitynodeinfocompat.setBoundsInScreen(rect);
            accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
            accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
            accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
            accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
            accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
            accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
            accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
            accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
            accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
            accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
            accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
            accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = findVisibleDrawer();
                if (accessibilityevent != null)
                {
                    int i = getDrawerViewAbsoluteGravity(accessibilityevent);
                    accessibilityevent = getDrawerTitle(i);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
label0:
            {
                if (DrawerLayout.CAN_HIDE_DESCENDANTS)
                {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
                    if (SlidingPaneLayout.a == 0)
                    {
                        break label0;
                    }
                }
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat.setSource(view);
                android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
                if (viewparent instanceof View)
                {
                    accessibilitynodeinfocompat.setParent((View)viewparent);
                }
                copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat1.recycle();
                addChildrenForAccessibility(accessibilitynodeinfocompat, (ViewGroup)view);
            }
            accessibilitynodeinfocompat.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        AccessibilityDelegate()
        {
            this$0 = DrawerLayout.this;
            super();
        }
    }


    private class DrawerLayoutCompatImpl
    {

        public abstract void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i);

        public abstract void configureApplyInsets(View view);

        public abstract void dispatchChildInsets(View view, Object obj, int i);

        public abstract int getTopInset(Object obj);
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int gravity;
        boolean isPeeking;
        boolean knownOpen;
        float onScreen;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            gravity = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gravity = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS);
            gravity = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
            gravity = layoutparams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            gravity = 0;
        }
    }


    private class DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f);

        public abstract void onDrawerStateChanged(int i);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        int lockModeLeft;
        int lockModeRight;
        int openDrawerGravity;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(openDrawerGravity);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            openDrawerGravity = 0;
            lockModeLeft = 0;
            lockModeRight = 0;
            openDrawerGravity = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            openDrawerGravity = 0;
            lockModeLeft = 0;
            lockModeRight = 0;
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
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


    private class DrawerLayoutCompatImplApi21
        implements DrawerLayoutCompatImpl
    {

        public void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
            DrawerLayoutCompatApi21.applyMarginInsets(marginlayoutparams, obj, i);
        }

        public void configureApplyInsets(View view)
        {
            DrawerLayoutCompatApi21.configureApplyInsets(view);
        }

        public void dispatchChildInsets(View view, Object obj, int i)
        {
            DrawerLayoutCompatApi21.dispatchChildInsets(view, obj, i);
        }

        public int getTopInset(Object obj)
        {
            return DrawerLayoutCompatApi21.getTopInset(obj);
        }

        DrawerLayoutCompatImplApi21()
        {
        }
    }


    private class DrawerLayoutCompatImplBase
        implements DrawerLayoutCompatImpl
    {

        public void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
        }

        public void configureApplyInsets(View view)
        {
        }

        public void dispatchChildInsets(View view, Object obj, int i)
        {
        }

        public int getTopInset(Object obj)
        {
            return 0;
        }

        DrawerLayoutCompatImplBase()
        {
        }
    }

}
