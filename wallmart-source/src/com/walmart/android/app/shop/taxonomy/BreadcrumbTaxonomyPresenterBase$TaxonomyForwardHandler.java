// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, BreadcrumbTaxonomyListAdapter

private class mClickedItem
{

    public static final boolean OPTIMIZE_SPECIAL_CASE = false;
    private TaxonomyItem mClickedItem;
    private boolean mMoveFinished;
    private int mNewPosition;
    private TaxonomyItem mNewTaxonomy[];
    private HashMap mOldTops;
    final BreadcrumbTaxonomyPresenterBase this$0;

    private void animateClickedItemMove()
    {
        Object obj = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(mNewPosition);
        ((View) (obj)).setAlpha(1.0F);
        Integer integer = (Integer)mOldTops.get(mClickedItem);
        if (integer != null)
        {
            obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;

                public void onAnimationEnd(Animator animator)
                {
                    super.onAnimationEnd(animator);
                    mMoveFinished = true;
                    if (mNewTaxonomy != null)
                    {
                        fadeInNewItemsPostMove();
                    }
                }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                super();
            }
            });
            ((ObjectAnimator) (obj)).start();
        }
    }

    private void animateMove()
    {
        for (int i = 0; i < BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount(); i++)
        {
            BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(i).setAlpha(1.0F);
        }

        updateList();
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;

            public boolean onPreDraw()
            {
                BreadcrumbTaxonomyPresenterBase.access$200(this$0).getViewTreeObserver().removeOnPreDrawListener(this);
                if (BreadcrumbTaxonomyPresenterBase.access$000(this$0).getCount() > mNewPosition)
                {
                    fadeInNewTaxonomyWithMove();
                }
                animateClickedItemMove();
                animateVisitedItemsMove();
                return true;
            }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                super();
            }
        });
    }

    private void animateVisitedItemsMove()
    {
        int i = -1;
        for (int k = 0; k < mNewPosition && i == -1; k++)
        {
            View view = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(k);
            Integer integer = (Integer)mOldTops.get(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).getItem(k));
            if (integer != null)
            {
                i = view.getTop() - integer.intValue();
            }
        }

        int l = i;
        if (i == -1)
        {
            l = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(mNewPosition - 1).getBottom();
        }
        if (l > 0)
        {
            for (int j = 0; j < mNewPosition; j++)
            {
                Object obj = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(j);
                ((View) (obj)).setAlpha(1.0F);
                obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                    (float)(-l), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(300L);
                ((ObjectAnimator) (obj)).start();
            }

        }
    }

    private void fadeInNewItemsPostMove()
    {
        final int startPos = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount();
        BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).setTaxonomyItems(mNewTaxonomy);
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setAdapter(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this));
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;
            final int val$startPos;

            public boolean onPreDraw()
            {
                BreadcrumbTaxonomyPresenterBase.access$200(this$0).getViewTreeObserver().removeOnPreDrawListener(this);
                AnimatorListenerAdapter animatorlisteneradapter = null;
                for (int i = startPos; i < BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildCount();)
                {
                    AnimatorListenerAdapter animatorlisteneradapter2 = null;
                    View view = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(i);
                    ViewPropertyAnimator viewpropertyanimator = view.animate();
                    AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
                    if (animatorlisteneradapter == null)
                    {
                        animatorlisteneradapter1 = viewpropertyanimator. new AnimatorListenerAdapter() {

                            final _cls5 this$2;
                            final ViewPropertyAnimator val$animator;

                            public void onAnimationEnd(Animator animator1)
                            {
                                animator.setListener(null);
                                BreadcrumbTaxonomyPresenterBase.access$200(this$0).setEnabled(true);
                            }

            
            {
                this$2 = final__pcls5;
                animator = ViewPropertyAnimator.this;
                super();
            }
                        };
                        animatorlisteneradapter2 = animatorlisteneradapter1;
                    }
                    view.setAlpha(0.0F);
                    viewpropertyanimator.alpha(1.0F).setDuration(300L).setListener(animatorlisteneradapter2).start();
                    i++;
                    animatorlisteneradapter = animatorlisteneradapter1;
                }

                if (animatorlisteneradapter == null)
                {
                    BreadcrumbTaxonomyPresenterBase.access$200(this$0).setEnabled(true);
                }
                return true;
            }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                startPos = i;
                super();
            }
        });
        mNewTaxonomy = null;
    }

    private void fadeInNewTaxonomyWithMove()
    {
        AnimatorListenerAdapter animatorlisteneradapter = null;
        for (int i = mNewPosition + 1; i < BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount();)
        {
            AnimatorListenerAdapter animatorlisteneradapter2 = null;
            View view = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(i);
            final ViewPropertyAnimator animator = view.animate();
            AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
            if (animatorlisteneradapter == null)
            {
                animatorlisteneradapter1 = new AnimatorListenerAdapter() {

                    final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;
                    final ViewPropertyAnimator val$animator;

                    public void onAnimationEnd(Animator animator1)
                    {
                        animator.setListener(null);
                        BreadcrumbTaxonomyPresenterBase.access$200(this$0).setEnabled(true);
                    }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                animator = viewpropertyanimator;
                super();
            }
                };
                animatorlisteneradapter2 = animatorlisteneradapter1;
            }
            view.setAlpha(0.0F);
            animator.alpha(1.0F).setDuration(500L).setListener(animatorlisteneradapter2).start();
            i++;
            animatorlisteneradapter = animatorlisteneradapter1;
        }

        if (animatorlisteneradapter == null)
        {
            BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setEnabled(true);
        }
    }

    private void forwardAnimate()
    {
        int k = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getFirstVisiblePosition();
        HashSet hashset = new HashSet();
        for (int i = 0; i < BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount(); i++)
        {
            TaxonomyItem taxonomyitem = (TaxonomyItem)BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).getItem(k + i);
            if (taxonomyitem.equals(mClickedItem) || BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).isVisitedItem(taxonomyitem))
            {
                hashset.add(Integer.valueOf(i));
            }
        }

        AnimatorListenerAdapter animatorlisteneradapter = null;
        int j = 0;
        while (j < BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount()) 
        {
            if (!hashset.contains(Integer.valueOf(j)))
            {
                final ViewPropertyAnimator fadeOutAnimator = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(j).animate().alpha(0.0F).setDuration(100L);
                if (animatorlisteneradapter == null)
                {
                    animatorlisteneradapter = new AnimatorListenerAdapter() {

                        final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;
                        final ViewPropertyAnimator val$fadeOutAnimator;

                        public void onAnimationEnd(Animator animator)
                        {
                            fadeOutAnimator.setListener(null);
                            animateMove();
                        }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                fadeOutAnimator = viewpropertyanimator;
                super();
            }
                    };
                    fadeOutAnimator.setListener(animatorlisteneradapter);
                } else
                {
                    fadeOutAnimator.setListener(null);
                }
                fadeOutAnimator.start();
            }
            j++;
        }
        if (animatorlisteneradapter == null)
        {
            animateMove();
        }
    }

    private void forwardAnimateSpecialCase()
    {
        updateList();
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler this$1;

            public boolean onPreDraw()
            {
                BreadcrumbTaxonomyPresenterBase.access$200(this$0).getViewTreeObserver().removeOnPreDrawListener(this);
                int j = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getFirstVisiblePosition();
                Object obj = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(mNewPosition);
                Integer integer = (Integer)mOldTops.get(BreadcrumbTaxonomyPresenterBase.access$000(this$0).getItem(mNewPosition + j));
                if (integer != null)
                {
                    obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                        (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
                    });
                    ((ObjectAnimator) (obj)).setDuration(300L);
                    ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                        final _cls6 this$2;

                        public void onAnimationEnd(Animator animator)
                        {
                            super.onAnimationEnd(animator);
                            BreadcrumbTaxonomyPresenterBase.access$000(this$0).setTaxonomyItems(new TaxonomyItem[0]);
                            for (int i = 0; i < BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildCount(); i++)
                            {
                                BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(i).setAlpha(1.0F);
                                BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(i).setTranslationY(0.0F);
                            }

                        }

            
            {
                this$2 = _cls6.this;
                super();
            }
                    });
                    ((ObjectAnimator) (obj)).start();
                }
                for (int i = mNewPosition + 1; i < BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildCount(); i++)
                {
                    View view = BreadcrumbTaxonomyPresenterBase.access$200(this$0).getChildAt(i);
                    view.animate().alpha(0.0F).setDuration(100L).setListener(null).start();
                    Integer integer1 = (Integer)mOldTops.get(BreadcrumbTaxonomyPresenterBase.access$000(this$0).getItem(j + i));
                    if (integer1 != null)
                    {
                        view.setTranslationY(-(view.getTop() - integer1.intValue()));
                    }
                }

                return true;
            }

            
            {
                this$1 = BreadcrumbTaxonomyPresenterBase.TaxonomyForwardHandler.this;
                super();
            }
        });
    }

    public void animate()
    {
        mOldTops = BreadcrumbTaxonomyPresenterBase.access$1400(BreadcrumbTaxonomyPresenterBase.this);
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getFirstVisiblePosition();
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(0).getTop();
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setEnabled(false);
        forwardAnimate();
    }

    public void setNewTaxonomy(TaxonomyItem ataxonomyitem[], boolean flag)
    {
        mNewTaxonomy = ataxonomyitem;
        if (flag)
        {
            if (mMoveFinished)
            {
                fadeInNewItemsPostMove();
            }
            return;
        } else
        {
            BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).setTaxonomyItems(mNewTaxonomy);
            BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setAdapter(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this));
            return;
        }
    }

    public void updateList()
    {
        mNewPosition = BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).visitItem(mClickedItem) - 1;
        if (mNewTaxonomy != null)
        {
            BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).setTaxonomyItems(mNewTaxonomy);
            BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setAdapter(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this));
            mNewTaxonomy = null;
        } else
        {
            BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).setTaxonomyItems(new TaxonomyItem[0]);
        }
        BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setSelection(0);
    }







/*
    static boolean access$2602(_cls6._cls1 _pcls1, boolean flag)
    {
        _pcls1.mMoveFinished = flag;
        return flag;
    }

*/




    public _cls6.this._cls1(TaxonomyItem taxonomyitem)
    {
        this$0 = BreadcrumbTaxonomyPresenterBase.this;
        super();
        mClickedItem = taxonomyitem;
        BreadcrumbTaxonomyPresenterBase.access$1100(BreadcrumbTaxonomyPresenterBase.this);
    }
}
