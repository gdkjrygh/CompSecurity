// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.view.ActionMode;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView, ActionBarContainer

public class ActionBarContextView extends AbsActionBarView
    implements com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener
{

    private static final String z[];
    private boolean mAnimateInOnLayout;
    private int mAnimationMode;
    private NineLinearLayout mClose;
    private Animator mCurrentAnimation;
    private View mCustomView;
    private Drawable mSplitBackground;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private TextView mTitleView;

    public ActionBarContextView(Context context)
    {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.actionbarsherlock.R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockActionMode, i, 0);
        setBackgroundDrawable(context.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionMode_background));
        mTitleStyleRes = context.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionMode_titleTextStyle, 0);
        mSubtitleStyleRes = context.getResourceId(com.actionbarsherlock.R.styleable.SherlockActionMode_subtitleTextStyle, 0);
        mContentHeight = context.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionMode_height, 0);
        mSplitBackground = context.getDrawable(com.actionbarsherlock.R.styleable.SherlockActionMode_backgroundSplit);
        context.recycle();
    }

    private void finishAnimation()
    {
        Animator animator;
        animator = mCurrentAnimation;
        if (animator == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        mCurrentAnimation = null;
        animator.end();
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    private void initTitle()
    {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag;
        int i;
        if (mTitleLayout == null)
        {
            Object obj = LayoutInflater.from(getContext());
            boolean flag3;
            try
            {
                ((LayoutInflater) (obj)).inflate(com.actionbarsherlock.R.layout.abs__action_bar_title_item, this);
                mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
                mTitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_title);
                mSubtitleView = (TextView)mTitleLayout.findViewById(com.actionbarsherlock.R.id.abs__action_bar_subtitle);
                if (mTitleStyleRes != 0)
                {
                    mTitleView.setTextAppearance(mContext, mTitleStyleRes);
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            try
            {
                if (mSubtitleStyleRes != 0)
                {
                    mSubtitleView.setTextAppearance(mContext, mSubtitleStyleRes);
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        try
        {
            mTitleView.setText(mTitle);
            mSubtitleView.setText(mSubtitle);
            flag3 = TextUtils.isEmpty(mTitle);
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (!flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            flag3 = TextUtils.isEmpty(mSubtitle);
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        if (flag3)
        {
            flag1 = false;
        }
        try
        {
            obj = mSubtitleView;
        }
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        try
        {
            ((TextView) (obj)).setVisibility(i);
            obj = mTitleLayout;
        }
        catch (IllegalStateException illegalstateexception5)
        {
            try
            {
                throw illegalstateexception5;
            }
            catch (IllegalStateException illegalstateexception6)
            {
                throw illegalstateexception6;
            }
        }
        i = ((flag2) ? 1 : 0);
        if (!flag)
        {
            if (flag1)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 8;
            }
        }
        try
        {
            ((LinearLayout) (obj)).setVisibility(i);
            if (mTitleLayout.getParent() == null)
            {
                addView(mTitleLayout);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception7)
        {
            throw illegalstateexception7;
        }
    }

    private Animator makeInAnimation()
    {
        int k = AbsActionBarView.b;
        mClose.setTranslationX(-mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin);
        Object obj = ObjectAnimator.ofFloat(mClose, z[3], new float[] {
            0.0F
        });
        ((ObjectAnimator) (obj)).setDuration(200L);
        ((ObjectAnimator) (obj)).addListener(this);
        ((ObjectAnimator) (obj)).setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorset = new AnimatorSet();
        obj = animatorset.play(((Animator) (obj)));
        if (mMenuView != null)
        {
            int i = mMenuView.getChildCount();
            if (i > 0)
            {
                int j = i - 1;
                i = 0;
                do
                {
                    if (j < 0)
                    {
                        break;
                    }
                    Object obj1 = AnimatorProxy.wrap(mMenuView.getChildAt(j));
                    ((AnimatorProxy) (obj1)).setScaleY(0.0F);
                    obj1 = ObjectAnimator.ofFloat(obj1, z[2], new float[] {
                        0.0F, 1.0F
                    });
                    ((ObjectAnimator) (obj1)).setDuration(100L);
                    ((ObjectAnimator) (obj1)).setStartDelay(i * 70);
                    ((com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder) (obj)).with(((Animator) (obj1)));
                    j--;
                    i++;
                } while (k == 0);
            }
        }
        return animatorset;
    }

    private Animator makeOutAnimation()
    {
        int i = AbsActionBarView.b;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mClose, z[1], new float[] {
            (float)(-mClose.getWidth() - ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()).leftMargin)
        });
        objectanimator.setDuration(200L);
        objectanimator.addListener(this);
        objectanimator.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(objectanimator);
        if (mMenuView != null)
        {
            if (mMenuView.getChildCount() <= 0);
        }
        return animatorset;
    }

    public void closeMode()
    {
        int i;
        try
        {
            i = mAnimationMode;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (i == 2)
        {
            return;
        }
        try
        {
            if (mClose == null)
            {
                killMode();
                return;
            }
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        finishAnimation();
        mAnimationMode = 2;
        mCurrentAnimation = makeOutAnimation();
        mCurrentAnimation.start();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset);
    }

    public boolean hideOverflowMenu()
    {
label0:
        {
            boolean flag;
            try
            {
                if (mActionMenuPresenter == null)
                {
                    break label0;
                }
                flag = mActionMenuPresenter.hideOverflowMenu();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return flag;
        }
        return false;
    }

    public void initForMode(final ActionMode mode)
    {
        Object obj;
        int i;
        i = AbsActionBarView.b;
        if (mClose != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = LayoutInflater.from(mContext);
        mClose = (NineLinearLayout)((LayoutInflater) (obj)).inflate(com.actionbarsherlock.R.layout.abs__action_mode_close_item, this, false);
        addView(mClose);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        boolean flag;
        try
        {
            if (mClose.getParent() == null)
            {
                addView(mClose);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final ActionMode mode)
        {
            throw mode;
        }
        obj = mClose.findViewById(com.actionbarsherlock.R.id.abs__action_mode_close_button);
        ((View) (obj)).setOnClickListener(new _cls1());
        if (ActionBarSherlock.isRtl)
        {
            TypedValue typedvalue = new TypedValue();
            getContext().getTheme().resolveAttribute(com.actionbarsherlock.R.attr.actionBarItemBackground, typedvalue, true);
            ((View) (obj)).setBackgroundResource(typedvalue.resourceId);
        }
        mode = (MenuBuilder)mode.getMenu();
        try
        {
            if (mActionMenuPresenter != null)
            {
                mActionMenuPresenter.dismissPopupMenus();
            }
        }
        // Misplaced declaration of an exception variable
        catch (final ActionMode mode)
        {
            throw mode;
        }
        mActionMenuPresenter = new ActionMenuPresenter(mContext);
        mActionMenuPresenter.setReserveOverflow(true);
        obj = new android.view.ViewGroup.LayoutParams(-2, -1);
        flag = mSplitActionBar;
        if (!flag)
        {
            try
            {
                mode.addMenuPresenter(mActionMenuPresenter);
                mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
                mMenuView.setBackgroundDrawable(null);
                addView(mMenuView, ((android.view.ViewGroup.LayoutParams) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (final ActionMode mode)
            {
                throw mode;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_332;
            }
        }
        mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
        mActionMenuPresenter.setItemLimit(0x7fffffff);
        obj.width = -1;
        obj.height = mContentHeight;
        mode.addMenuPresenter(mActionMenuPresenter);
        mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
        mMenuView.setBackgroundDrawable(mSplitBackground);
        mSplitView.addView(mMenuView, ((android.view.ViewGroup.LayoutParams) (obj)));
        mAnimateInOnLayout = true;
        return;
        mode;
        throw mode;
        mode;
        throw mode;
    }

    public boolean isOverflowMenuShowing()
    {
label0:
        {
            boolean flag;
            try
            {
                if (mActionMenuPresenter == null)
                {
                    break label0;
                }
                flag = mActionMenuPresenter.isOverflowMenuShowing();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return flag;
        }
        return false;
    }

    public void killMode()
    {
        try
        {
            finishAnimation();
            removeAllViews();
            if (mSplitView != null)
            {
                mSplitView.removeView(mMenuView);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        mCustomView = null;
        mMenuView = null;
        mAnimateInOnLayout = false;
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        try
        {
            if (mAnimationMode == 2)
            {
                killMode();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Animator animator)
        {
            throw animator;
        }
        mAnimationMode = 0;
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            if (mActionMenuPresenter != null)
            {
                mActionMenuPresenter.hideOverflowMenu();
                mActionMenuPresenter.hideSubMenus();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        try
        {
            if (accessibilityevent.getEventType() == 32)
            {
                accessibilityevent.setClassName(getClass().getName());
                accessibilityevent.setPackageName(getContext().getPackageName());
                accessibilityevent.setContentDescription(mTitle);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccessibilityEvent accessibilityevent)
        {
            throw accessibilityevent;
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
label0:
        {
            flag = isLayoutRtl();
            Object obj;
            int i1;
            if (flag)
            {
                int j1;
                int k1;
                try
                {
                    i1 = getPaddingRight();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                i1 = k - i - i1;
            } else
            {
                i1 = getPaddingLeft();
            }
            j1 = getPaddingTop();
            k1 = l - j - getPaddingTop() - getPaddingBottom();
            j = i1;
            try
            {
                if (mClose == null)
                {
                    break label0;
                }
                l = mClose.getVisibility();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            j = i1;
            if (l == 8)
            {
                break label0;
            }
            obj = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
            if (flag)
            {
                try
                {
                    j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            } else
            {
                j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
            }
            if (flag)
            {
                try
                {
                    l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            } else
            {
                l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
            }
            j = next(i1, j, flag);
            l = next(positionChild(mClose, j, j1, k1, flag) + j, l, flag);
            j = l;
            try
            {
                if (!mAnimateInOnLayout)
                {
                    break label0;
                }
                mAnimationMode = 1;
                mCurrentAnimation = makeInAnimation();
                mCurrentAnimation.start();
                mAnimateInOnLayout = false;
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            j = l;
        }
        try
        {
            obj = mTitleLayout;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        l = j;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        l = j;
        if (mCustomView != null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        i1 = mTitleLayout.getVisibility();
        l = j;
        if (i1 != 8)
        {
            l = j + positionChild(mTitleLayout, j, j1, k1, flag);
        }
        if (mCustomView != null)
        {
            positionChild(mCustomView, l, j1, k1, flag);
        }
        if (flag)
        {
            try
            {
                i = getPaddingLeft();
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
        } else
        {
            i = k - i - getPaddingRight();
        }
        obj = mMenuView;
        if (obj != null)
        {
            IllegalStateException illegalstateexception4;
            try
            {
                obj = mMenuView;
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            positionChild(((View) (obj)), i, j1, k1, flag);
        }
        return;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int k1;
        int l1;
        i1 = 0x40000000;
        k1 = AbsActionBarView.b;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z[6]).append(z[5]).toString());
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        if (android.view.View.MeasureSpec.getMode(j) == 0)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(z[4]).append(z[7]).toString());
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        l1 = android.view.View.MeasureSpec.getSize(i);
        if (mContentHeight <= 0) goto _L2; else goto _L1
_L1:
        int k = mContentHeight;
_L10:
        int l;
        int j1;
label0:
        {
            int i2 = getPaddingTop() + getPaddingBottom();
            j = l1 - getPaddingLeft() - getPaddingRight();
            j1 = k - i2;
            l = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
            i = j;
            if (mClose != null)
            {
                i = measureChildView(mClose, j, l, 0);
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
                j = marginlayoutparams.leftMargin;
                i -= marginlayoutparams.rightMargin + j;
            }
            j = i;
            Object obj;
            IllegalStateException illegalstateexception2;
            try
            {
                if (mMenuView == null)
                {
                    break label0;
                }
                obj = mMenuView.getParent();
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
            j = i;
            if (obj == this)
            {
                j = measureChildView(mMenuView, i, l, 0);
            }
        }
label1:
        {
            i = j;
            try
            {
                if (mTitleLayout == null)
                {
                    break label1;
                }
                obj = mCustomView;
            }
            catch (IllegalStateException illegalstateexception4)
            {
                throw illegalstateexception4;
            }
            i = j;
            if (obj == null)
            {
                i = measureChildView(mTitleLayout, j, l, 0);
            }
        }
        if (mCustomView == null) goto _L4; else goto _L3
_L3:
        obj = mCustomView.getLayoutParams();
        try
        {
            j = ((android.view.ViewGroup.LayoutParams) (obj)).width;
        }
        catch (IllegalStateException illegalstateexception5)
        {
            throw illegalstateexception5;
        }
        if (j != -2)
        {
            j = 0x40000000;
        } else
        {
            j = 0x80000000;
        }
        l = i;
        try
        {
            if (((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
            {
                l = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, i);
            }
        }
        catch (IllegalStateException illegalstateexception6)
        {
            throw illegalstateexception6;
        }
        try
        {
            i = ((android.view.ViewGroup.LayoutParams) (obj)).height;
        }
        catch (IllegalStateException illegalstateexception7)
        {
            throw illegalstateexception7;
        }
        if (i != -2)
        {
            i = i1;
        } else
        {
            i = 0x80000000;
        }
        if (((android.view.ViewGroup.LayoutParams) (obj)).height < 0) goto _L6; else goto _L5
_L5:
        i1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j1);
_L11:
        mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, j), android.view.View.MeasureSpec.makeMeasureSpec(i1, i));
_L4:
        if (mContentHeight > 0) goto _L8; else goto _L7
_L7:
        j1 = getChildCount();
        l = 0;
        i = 0;
_L12:
        j = i;
        if (l < j1)
        {
            i1 = getChildAt(l).getMeasuredHeight() + i2;
            j = i;
            if (i1 > i)
            {
                j = i1;
            }
            if (k1 == 0)
            {
                break MISSING_BLOCK_LABEL_533;
            }
        }
        IllegalStateException illegalstateexception8;
        try
        {
            setMeasuredDimension(l1, j);
        }
        catch (IllegalStateException illegalstateexception9)
        {
            throw illegalstateexception9;
        }
        if (k1 == 0) goto _L9; else goto _L8
_L8:
        setMeasuredDimension(l1, k);
_L9:
        return;
        illegalstateexception2;
        throw illegalstateexception2;
_L2:
        k = android.view.View.MeasureSpec.getSize(j);
          goto _L10
        illegalstateexception8;
        throw illegalstateexception8;
_L6:
        i1 = j1;
          goto _L11
        l++;
        i = j;
          goto _L12
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
    }

    public void setCustomView(View view)
    {
        try
        {
            if (mCustomView != null)
            {
                removeView(mCustomView);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            mCustomView = view;
            if (mTitleLayout != null)
            {
                removeView(mTitleLayout);
                mTitleLayout = null;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (view != null)
        {
            try
            {
                addView(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
label0:
        {
label1:
            {
                Object obj;
                try
                {
                    if (mSplitActionBar == flag)
                    {
                        break label0;
                    }
                    obj = mActionMenuPresenter;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                if (obj == null)
                {
                    break label1;
                }
                obj = new android.view.ViewGroup.LayoutParams(-2, -1);
                if (!flag)
                {
                    mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
                    mMenuView.setBackgroundDrawable(null);
                    ViewGroup viewgroup = (ViewGroup)mMenuView.getParent();
                    if (viewgroup != null)
                    {
                        try
                        {
                            viewgroup.removeView(mMenuView);
                        }
                        catch (IllegalStateException illegalstateexception1)
                        {
                            throw illegalstateexception1;
                        }
                    }
                    addView(mMenuView, ((android.view.ViewGroup.LayoutParams) (obj)));
                    if (AbsActionBarView.b == 0)
                    {
                        break label1;
                    }
                }
                mActionMenuPresenter.setWidthLimit(getContext().getResources().getDisplayMetrics().widthPixels, true);
                mActionMenuPresenter.setItemLimit(0x7fffffff);
                obj.width = -1;
                obj.height = mContentHeight;
                mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
                mMenuView.setBackgroundDrawable(mSplitBackground);
                viewgroup = (ViewGroup)mMenuView.getParent();
                if (viewgroup != null)
                {
                    try
                    {
                        viewgroup.removeView(mMenuView);
                    }
                    catch (IllegalStateException illegalstateexception2)
                    {
                        throw illegalstateexception2;
                    }
                }
                mSplitView.addView(mMenuView, ((android.view.ViewGroup.LayoutParams) (obj)));
            }
            super.setSplitActionBar(flag);
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        initTitle();
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    public boolean showOverflowMenu()
    {
label0:
        {
            boolean flag;
            try
            {
                if (mActionMenuPresenter == null)
                {
                    break label0;
                }
                flag = mActionMenuPresenter.showOverflowMenu();
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return flag;
        }
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "Z\\3CRp";
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
                obj = "]M3ADE^&FXGg";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z\\3CRp";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "]M3ADE^&FXGg";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\t\\3A\027FQ>V\027KZrZDL[r";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^V&G\027HQ6]X@[hCVPP'[h^V6[_\024\035?NCJW\r_V[Z<[\025\t\027=]\027OV>ChY^ JY]\026";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\t\\3A\027FQ>V\027KZrZDL[r";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^V&G\027HQ6]X@[hCVPP'[hAZ;H_]\002pXEHO\rLXGK7AC\013";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 55;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 41;
          goto _L9
_L5:
        byte1 = 63;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 47;
          goto _L9
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ActionBarContextView this$0;
        final ActionMode val$mode;

        public void onClick(View view)
        {
            mode.finish();
        }

        _cls1()
        {
            this$0 = ActionBarContextView.this;
            mode = actionmode;
            super();
        }
    }

}
