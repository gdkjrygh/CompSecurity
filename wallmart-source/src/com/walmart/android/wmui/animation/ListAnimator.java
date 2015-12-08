// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.wmui.animation:
//            DismissibleAdapter, BackgroundContainer

class ListAnimator
{

    protected static final int MOVE_DURATION = 150;
    protected DismissibleAdapter mAdapter;
    protected boolean mAnimating;
    protected BackgroundContainer mBackgroundContainer;
    protected HashMap mHeaderTopMap;
    protected HashMap mItemIdTopMap;
    protected ListView mListView;
    protected boolean mSwiping;

    ListAnimator(ListView listview, DismissibleAdapter dismissibleadapter, BackgroundContainer backgroundcontainer)
    {
        mSwiping = false;
        mItemIdTopMap = new HashMap();
        mHeaderTopMap = new HashMap();
        mAnimating = false;
        mListView = listview;
        mAdapter = dismissibleadapter;
        mBackgroundContainer = backgroundcontainer;
    }

    private void moveView(View view, float f, float f1, float f2, float f3, Runnable runnable)
    {
        view.animate().setDuration(150L);
        Object obj = runnable;
        if (f != f1)
        {
            obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[] {
                f, f1
            });
            ((ObjectAnimator) (obj)).setDuration(150L);
            ((ObjectAnimator) (obj)).start();
            setAnimatorEndAction(((Animator) (obj)), runnable);
            obj = null;
        }
        if (f2 != f3)
        {
            view = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
                f2, f3
            });
            view.setDuration(150L);
            view.start();
            setAnimatorEndAction(view, ((Runnable) (obj)));
        }
    }

    private void setAnimatorEndAction(Animator animator, final Runnable endAction)
    {
        if (endAction != null)
        {
            animator.addListener(new AnimatorListenerAdapter() {

                final ListAnimator this$0;
                final Runnable val$endAction;

                public void onAnimationEnd(Animator animator1)
                {
                    endAction.run();
                }

            
            {
                this$0 = ListAnimator.this;
                endAction = runnable;
                super();
            }
            });
        }
    }

    void animateItemViews(Runnable runnable)
    {
        mAnimating = true;
        mListView.setEnabled(false);
        int j = mListView.getFirstVisiblePosition();
        int k = mListView.getHeaderViewsCount();
        int i = 0;
        while (i < mListView.getChildCount()) 
        {
            View view = mListView.getChildAt(i);
            int l = j + i;
            if (l < k)
            {
                mHeaderTopMap.put(Integer.valueOf(l), Integer.valueOf(view.getTop()));
            } else
            {
                long l1 = mAdapter.getItemId(l - k);
                mItemIdTopMap.put(Long.valueOf(l1), Integer.valueOf(view.getTop()));
            }
            i++;
        }
        runnable.run();
        mListView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final ListAnimator this$0;

            public boolean onPreDraw()
            {
                mListView.getViewTreeObserver().removeOnPreDrawListener(this);
                int j1 = 1;
                boolean flag = true;
                int i2 = mListView.getFirstVisiblePosition();
                int j2 = mListView.getHeaderViewsCount();
                int i1 = 0;
                while (i1 < mListView.getChildCount()) 
                {
                    View view1 = mListView.getChildAt(i1);
                    view1.setPressed(false);
                    int k1 = i2 + i1;
                    Object obj;
                    Integer integer;
                    int k2;
                    if (k1 < j2)
                    {
                        obj = (Integer)mHeaderTopMap.get(Integer.valueOf(k1));
                    } else
                    {
                        long l2 = mAdapter.getItemId(k1 - j2);
                        obj = (Integer)mItemIdTopMap.get(Long.valueOf(l2));
                    }
                    k2 = view1.getTop();
                    integer = ((Integer) (obj));
                    if (obj == null)
                    {
                        k1 = view1.getHeight() + mListView.getDividerHeight();
                        if (i1 <= 0)
                        {
                            k1 = -k1;
                        }
                        integer = Integer.valueOf(k2 + k1);
                    }
                    k2 = integer.intValue() - k2;
                    k1 = j1;
                    if (k2 != 0)
                    {
                        if (j1 != 0)
                        {
                            obj = new Runnable() {

                                final _cls3 this$1;

                                public void run()
                                {
                                    if (mBackgroundContainer != null)
                                    {
                                        mBackgroundContainer.hideBackground();
                                    }
                                    mSwiping = false;
                                    mAnimating = false;
                                    mListView.setEnabled(true);
                                }

            
            {
                this$1 = _cls3.this;
                super();
            }
                            };
                        } else
                        {
                            obj = null;
                        }
                        k1 = 0;
                        moveView(view1, 0.0F, 0.0F, k2, 0.0F, ((Runnable) (obj)));
                        flag = false;
                    }
                    i1++;
                    j1 = k1;
                }
                if (flag)
                {
                    if (mBackgroundContainer != null)
                    {
                        mBackgroundContainer.hideBackground();
                    }
                    mSwiping = false;
                    mAnimating = false;
                    mListView.setEnabled(true);
                }
                mItemIdTopMap.clear();
                mHeaderTopMap.clear();
                return true;
            }

            
            {
                this$0 = ListAnimator.this;
                super();
            }
        });
    }

    void animateSwipe(final View view, float f, long l, final boolean remove)
    {
        mAnimating = true;
        mListView.setEnabled(false);
        final Runnable endAction = new Runnable() {

            final ListAnimator this$0;
            final boolean val$remove;
            final View val$view;

            public void run()
            {
                if (!remove) goto _L2; else goto _L1
_L1:
                if (view.getParent() != null)
                {
                    int i = mListView.getPositionForView(view);
                    if (i - mListView.getHeaderViewsCount() >= 0)
                    {
                        mAdapter.dismiss(i - mListView.getHeaderViewsCount());
                    }
                }
_L4:
                mSwiping = false;
                mAnimating = false;
                mListView.setEnabled(true);
                return;
_L2:
                if (mBackgroundContainer != null)
                {
                    mBackgroundContainer.hideBackground();
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = ListAnimator.this;
                remove = flag;
                view = view1;
                super();
            }
        };
        ViewPropertyAnimator viewpropertyanimator = view.animate().setDuration(l);
        float f1;
        if (remove)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        viewpropertyanimator.alpha(f1).translationX(f).setListener(new AnimatorListenerAdapter() {

            final ListAnimator this$0;
            final Runnable val$endAction;
            final View val$view;

            public void onAnimationEnd(Animator animator)
            {
                view.setAlpha(1.0F);
                view.setTranslationX(0.0F);
                endAction.run();
            }

            
            {
                this$0 = ListAnimator.this;
                view = view1;
                endAction = runnable;
                super();
            }
        });
    }

    void clearSwiping()
    {
        mSwiping = false;
    }

    boolean isAnimating()
    {
        return mAnimating;
    }

    boolean isSwiping()
    {
        return mSwiping;
    }

    void setSwipePosition(View view, float f)
    {
        float f1 = Math.abs(f) / (float)view.getWidth();
        view.setTranslationX(f);
        view.setAlpha(1.0F - f1);
    }

    void setSwiping(View view)
    {
        mSwiping = true;
        if (mBackgroundContainer != null)
        {
            mBackgroundContainer.showBackground(view.getTop(), view.getHeight());
        }
    }

}
