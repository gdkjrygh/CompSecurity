// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup;
import com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;
import com.actionbarsherlock.internal.view.menu.ActionMenuView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ActionBarContainer

public abstract class AbsActionBarView extends NineViewGroup
{

    public static int b;
    private static final Interpolator sAlphaInterpolator;
    private static final String z[];
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    final Context mContext;
    protected ActionMenuView mMenuView;
    protected boolean mSplitActionBar;
    protected ActionBarContainer mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected Animator mVisibilityAnim;

    public AbsActionBarView(Context context)
    {
        super(context);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
    }

    public AbsActionBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
    }

    public AbsActionBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mVisAnimListener = new VisibilityAnimListener();
        mContext = context;
    }

    protected static boolean isLayoutRtl()
    {
        return ActionBarSherlock.isRtl;
    }

    protected static int next(int i, int j, boolean flag)
    {
        if (flag)
        {
            return i - j;
        } else
        {
            return i + j;
        }
    }

    public void animateToVisibility(int i)
    {
label0:
        {
            int j;
label1:
            {
label2:
                {
                    j = b;
                    if (mVisibilityAnim != null)
                    {
                        mVisibilityAnim.cancel();
                    }
                    if (i != 0)
                    {
                        break label1;
                    }
                    if (getVisibility() != 0)
                    {
                        setAlpha(0.0F);
                        if (mSplitView != null && mMenuView != null)
                        {
                            mMenuView.setAlpha(0.0F);
                        }
                    }
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, z[3], new float[] {
                        1.0F
                    });
                    objectanimator.setDuration(200L);
                    objectanimator.setInterpolator(sAlphaInterpolator);
                    if (mSplitView != null && mMenuView != null)
                    {
                        AnimatorSet animatorset = new AnimatorSet();
                        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mMenuView, z[1], new float[] {
                            1.0F
                        });
                        objectanimator2.setDuration(200L);
                        animatorset.addListener(mVisAnimListener.withFinalVisibility(i));
                        animatorset.play(objectanimator).with(objectanimator2);
                        animatorset.start();
                        if (j == 0)
                        {
                            break label2;
                        }
                    }
                    objectanimator.addListener(mVisAnimListener.withFinalVisibility(i));
                    objectanimator.start();
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, z[0], new float[] {
                0.0F
            });
            objectanimator1.setDuration(200L);
            objectanimator1.setInterpolator(sAlphaInterpolator);
            if (mSplitView != null && mMenuView != null)
            {
                AnimatorSet animatorset1 = new AnimatorSet();
                ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mMenuView, z[2], new float[] {
                    0.0F
                });
                objectanimator3.setDuration(200L);
                animatorset1.addListener(mVisAnimListener.withFinalVisibility(i));
                animatorset1.play(objectanimator1).with(objectanimator3);
                animatorset1.start();
                if (j == 0)
                {
                    break label0;
                }
            }
            objectanimator1.addListener(mVisAnimListener.withFinalVisibility(i));
            objectanimator1.start();
        }
    }

    public void dismissPopupMenus()
    {
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.dismissPopupMenus();
        }
    }

    public int getAnimatedVisibility()
    {
        if (mVisibilityAnim != null)
        {
            return mVisAnimListener.mFinalVisibility;
        } else
        {
            return getVisibility();
        }
    }

    public boolean hideOverflowMenu()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.hideOverflowMenu();
        } else
        {
            return false;
        }
    }

    public boolean isOverflowMenuShowing()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.isOverflowMenuShowing();
        } else
        {
            return false;
        }
    }

    public boolean isOverflowReserved()
    {
        return mActionMenuPresenter != null && mActionMenuPresenter.isOverflowReserved();
    }

    protected int measureChildView(View view, int i, int j, int k)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth() - k);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                super.onConfigurationChanged(configuration);
                if (b == 0)
                {
                    break label0;
                }
            }
            if (mMenuView != null)
            {
                mMenuView.onConfigurationChanged(configuration);
            }
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, com.actionbarsherlock.R.styleable.SherlockActionBar, com.actionbarsherlock.R.attr.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(com.actionbarsherlock.R.styleable.SherlockActionBar_height, 0));
        typedarray.recycle();
        if (mSplitWhenNarrow)
        {
            setSplitActionBar(ResourcesCompat.getResources_getBoolean(getContext(), com.actionbarsherlock.R.bool.abs__split_action_bar_is_narrow));
        }
        if (mActionMenuPresenter != null)
        {
            mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    protected int positionChild(View view, int i, int j, int k, boolean flag)
    {
        int l;
label0:
        {
            l = view.getMeasuredWidth();
            int i1 = view.getMeasuredHeight();
            j = (k - i1) / 2 + j;
            if (flag)
            {
                view.layout(i - l, j, i, j + i1);
                if (b == 0)
                {
                    break label0;
                }
            }
            view.layout(i, j, i + l, i1 + j);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
    }

    public void postShowOverflowMenu()
    {
        post(new _cls1());
    }

    public void setContentHeight(int i)
    {
        mContentHeight = i;
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        mSplitActionBar = flag;
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
        mSplitView = actionbarcontainer;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        mSplitWhenNarrow = flag;
    }

    public void setVisibility(int i)
    {
        if (mVisibilityAnim != null)
        {
            mVisibilityAnim.end();
        }
        super.setVisibility(i);
    }

    public boolean showOverflowMenu()
    {
        if (mActionMenuPresenter != null)
        {
            return mActionMenuPresenter.showOverflowMenu();
        } else
        {
            return false;
        }
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "$\020r\032`".toCharArray();
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
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                sAlphaInterpolator = new DecelerateInterpolator();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 196
    //                   1 202
    //                   2 208
    //                   3 213;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_213;
_L3:
        byte byte0 = 1;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 69;
          goto _L9
_L5:
        byte0 = 124;
          goto _L9
_L6:
        byte0 = 2;
          goto _L9
        byte0 = 114;
          goto _L9
    }

    private class VisibilityAnimListener
        implements com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener
    {

        private boolean mCanceled;
        int mFinalVisibility;
        final AbsActionBarView this$0;

        public void onAnimationCancel(Animator animator)
        {
            mCanceled = true;
        }

        public void onAnimationEnd(Animator animator)
        {
            if (!mCanceled)
            {
                mVisibilityAnim = null;
                setVisibility(mFinalVisibility);
                if (mSplitView != null && mMenuView != null)
                {
                    mMenuView.setVisibility(mFinalVisibility);
                    return;
                }
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
            setVisibility(0);
            mVisibilityAnim = animator;
            mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(int i)
        {
            mFinalVisibility = i;
            return this;
        }

        protected VisibilityAnimListener()
        {
            this$0 = AbsActionBarView.this;
            super();
            mCanceled = false;
        }
    }


    private class _cls1
        implements Runnable
    {

        final AbsActionBarView this$0;

        public void run()
        {
            showOverflowMenu();
        }

        _cls1()
        {
            this$0 = AbsActionBarView.this;
            super();
        }
    }

}
