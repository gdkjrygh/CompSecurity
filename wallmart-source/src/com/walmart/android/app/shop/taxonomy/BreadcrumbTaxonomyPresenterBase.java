// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.app.shop.ShelfGridPresenter;
import com.walmart.android.app.shop.ShelfListPresenter;
import com.walmart.android.app.shop.ShelfUtils;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.service.taxonomy.TaxonomyService;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.CheckedIllegalStateException;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyListAdapter

public abstract class BreadcrumbTaxonomyPresenterBase extends Presenter
{
    private class GetTaxonomyCallback extends CallbackSameThread
    {

        final BreadcrumbTaxonomyPresenterBase this$0;

        public void onResultSameThread(Request request, Result result)
        {
            mLoadingView.setVisibility(8);
            if (result.successful() && result.hasData() && ((TaxonomyItem)result.getData()).children != null)
            {
                request = (TaxonomyItem)result.getData();
                ((TaxonomyStackItem)mTaxonomyStack.peek()).children = ((TaxonomyItem) (request)).children;
                if (mTaxonomyForwardHandler != null)
                {
                    mTaxonomyForwardHandler.setNewTaxonomy(((TaxonomyItem) (request)).children, true);
                    mTaxonomyForwardHandler = null;
                } else
                {
                    mTaxonomyListAdapter.setTaxonomyItems(((TaxonomyItem) (request)).children);
                    mListView.setAdapter(mTaxonomyListAdapter);
                    mListView.setVisibility(0);
                }
                onTaxonomyLoaded(request);
                return;
            }
            if (!result.hasError() && result.getStatusCode() == 404)
            {
                if (mTaxonomyStack.size() == 1)
                {
                    if (request.hasPriorRequest())
                    {
                        DialogFactory.showDialog(900, mActivity);
                        return;
                    }
                    try
                    {
                        request.retry();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Request request)
                    {
                        WLog.e(BreadcrumbTaxonomyPresenterBase.TAG, "Could not retry request to load root", request);
                    }
                    DialogFactory.showDialog(900, mActivity);
                    return;
                }
                Toast.makeText(mActivity, mActivity.getString(0x7f0905a5), 0).show();
                mLoadingView.setVisibility(0);
                for (; !mTaxonomyStack.isEmpty(); onTaxonomyPop()) { }
                mTaxonomyListAdapter = new BreadcrumbTaxonomyListAdapter(mActivity);
                mListView.setAdapter(mTaxonomyListAdapter);
                mTaxonomyListAdapter.visitItem(mRootTaxonomyItem);
                loadTaxonomy(mRootTaxonomyItem);
                return;
            }
            char c;
            if (result.hasError() && result.getError().connectionError())
            {
                c = '\u0258';
            } else
            {
                c = '\u0384';
            }
            DialogFactory.showDialog(c, mActivity);
            pop();
        }

        public GetTaxonomyCallback()
        {
            this$0 = BreadcrumbTaxonomyPresenterBase.this;
            super(mActivity);
        }
    }

    private static class ListPosition
    {

        public int selection;
        public int top;

        public ListPosition(int i, int j)
        {
            selection = i;
            top = j;
        }
    }

    private class TaxonomyBackHandler
    {

        private final TaxonomyItem mLastVisitedItem;
        private final int mLastVisitedItemIndex;
        private final ArrayList mMovingViews = new ArrayList();
        private final ListPosition mNewListPosition;
        private final TaxonomyItem mNewTaxonomy[];
        private final HashMap mOldTops = new HashMap();
        private final ArrayList mVisitedItemCopies = new ArrayList();
        final BreadcrumbTaxonomyPresenterBase this$0;

        private void animateMove()
        {
            for (int i = 0; i < mListView.getChildCount(); i++)
            {
                mListView.getChildAt(i).setAlpha(1.0F);
            }

            prepareMovePreListUpdate();
            updateList();
            mListView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final TaxonomyBackHandler this$1;

                public boolean onPreDraw()
                {
                    mListView.getViewTreeObserver().removeOnPreDrawListener(this);
                    prepareMovePostListUpdate();
                    animateMoveInList();
                    animateMoveOfCopies();
                    fadeInNonMovingListViews();
                    return true;
                }

            
            {
                this$1 = TaxonomyBackHandler.this;
                super();
            }
            });
        }

        private void animateMoveInList()
        {
            int j = getLowest(mOldTops.values());
            for (Iterator iterator = mMovingViews.iterator(); iterator.hasNext();)
            {
                View view = (View)iterator.next();
                Integer integer = (Integer)mOldTops.get(view.getTag());
                Object obj = integer;
                int i = j;
                if (integer == null)
                {
                    i = j - view.getHeight();
                    obj = Integer.valueOf(i);
                }
                j = view.getTop();
                int k = ((Integer) (obj)).intValue();
                obj = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[] {
                    (float)(-(j - k)), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(300L);
                ((ObjectAnimator) (obj)).start();
                j = i;
            }

        }

        private void animateMoveOfCopies()
        {
            View view;
            final ViewPropertyAnimator animator;
            for (Iterator iterator = mVisitedItemCopies.iterator(); iterator.hasNext(); animator.setListener(view. new AnimatorListenerAdapter() {

        final TaxonomyBackHandler this$1;
        final ViewPropertyAnimator val$animator;
        final View val$copy;

        public void onAnimationEnd(Animator animator1)
        {
            animator.setListener(null);
            mListContainer.removeView(copy);
            mScrapViews.push(copy);
        }

            
            {
                this$1 = final_taxonomybackhandler;
                animator = viewpropertyanimator;
                copy = View.this;
                super();
            }
    }).start())
            {
                view = (View)iterator.next();
                int i = -view.getHeight();
                int j = mVisitedItemCopies.size();
                animator = view.animate().translationYBy(i * j).setDuration(300L);
            }

        }

        private void fadeInNonMovingListViews()
        {
            AnimatorListenerAdapter animatorlisteneradapter = null;
            for (int i = 0; i < mListView.getChildCount();)
            {
                Object obj = mListView.getChildAt(i);
                AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
                if (!mMovingViews.contains(obj))
                {
                    ViewPropertyAnimator viewpropertyanimator = ((View) (obj)).animate();
                    obj = null;
                    animatorlisteneradapter1 = animatorlisteneradapter;
                    if (animatorlisteneradapter == null)
                    {
                        animatorlisteneradapter1 = viewpropertyanimator. new AnimatorListenerAdapter() {

                            final TaxonomyBackHandler this$1;
                            final ViewPropertyAnimator val$animator;

                            public void onAnimationEnd(Animator animator1)
                            {
                                animator.setListener(null);
                                mListView.setEnabled(true);
                            }

            
            {
                this$1 = final_taxonomybackhandler;
                animator = ViewPropertyAnimator.this;
                super();
            }
                        };
                        obj = animatorlisteneradapter1;
                    }
                    viewpropertyanimator.alpha(1.0F).setDuration(500L).setListener(((android.animation.Animator.AnimatorListener) (obj))).start();
                }
                i++;
                animatorlisteneradapter = animatorlisteneradapter1;
            }

            if (animatorlisteneradapter == null)
            {
                mListView.setEnabled(true);
            }
        }

        private View getConvertView()
        {
            View view = null;
            Iterator iterator = mScrapViews.iterator();
            do
            {
                if (!iterator.hasNext() || view != null)
                {
                    break;
                }
                View view1 = (View)iterator.next();
                if (view1.getParent() == null)
                {
                    view = view1;
                    iterator.remove();
                }
            } while (true);
            return view;
        }

        private void prepareMovePostListUpdate()
        {
            int j = mListView.getFirstVisiblePosition();
            int i = 0;
            while (i < mListView.getChildCount()) 
            {
                View view = mListView.getChildAt(i);
                if (mTaxonomyListAdapter.isVisitedItem(j + i))
                {
                    Iterator iterator = mVisitedItemCopies.iterator();
                    boolean flag = false;
                    do
                    {
                        if (!iterator.hasNext() || flag)
                        {
                            break;
                        }
                        View view1 = (View)iterator.next();
                        if (view1.getTag().equals(mTaxonomyListAdapter.getItem(j + i)))
                        {
                            iterator.remove();
                            mListContainer.removeView(view1);
                            mScrapViews.push(view1);
                            mMovingViews.add(view);
                            view.setTag(view1.getTag());
                            flag = true;
                        }
                    } while (true);
                    if (!flag)
                    {
                        view.setTag(mTaxonomyListAdapter.getItem(j + i));
                        mMovingViews.add(0, view);
                    }
                    view.setAlpha(1.0F);
                } else
                if (mTaxonomyListAdapter.getItem(j + i).equals(mLastVisitedItem))
                {
                    view.setTag(mLastVisitedItem);
                    mMovingViews.add(0, view);
                    view.setAlpha(1.0F);
                } else
                {
                    view.setAlpha(0.0F);
                }
                i++;
            }
        }

        private void prepareMovePreListUpdate()
        {
            int j = mListView.getFirstVisiblePosition();
            mOldTops.putAll(getViewPositionsInList());
            for (int i = 0; i < mLastVisitedItemIndex; i++)
            {
                View view = mListView.getChildAt(i);
                View view1 = mTaxonomyListAdapter.getView(j + i, getConvertView(), null);
                mListContainer.addView(view1, view.getWidth(), view.getHeight());
                mVisitedItemCopies.add(view1);
                view1.setTranslationY(view.getTop());
                view1.setTag(mTaxonomyListAdapter.getItem(j + i));
            }

        }

        private void updateList()
        {
            mTaxonomyListAdapter.setTaxonomyItems(mNewTaxonomy);
            mTaxonomyListAdapter.unvisitItem(mLastVisitedItem);
            mListView.setSelectionFromTop(mNewListPosition.selection, mNewListPosition.top);
        }

        public void animate()
        {
            mListView.setEnabled(false);
            AnimatorListenerAdapter animatorlisteneradapter = null;
            for (int i = mLastVisitedItemIndex + 1; i < mListView.getChildCount();)
            {
                ViewPropertyAnimator viewpropertyanimator = mListView.getChildAt(i).animate().alpha(0.0F).setDuration(100L);
                AnimatorListenerAdapter animatorlisteneradapter2 = null;
                AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
                if (animatorlisteneradapter == null)
                {
                    animatorlisteneradapter1 = viewpropertyanimator. new AnimatorListenerAdapter() {

                        final TaxonomyBackHandler this$1;
                        final ViewPropertyAnimator val$animator;

                        public void onAnimationEnd(Animator animator1)
                        {
                            animator.setListener(null);
                            animateMove();
                        }

            
            {
                this$1 = final_taxonomybackhandler;
                animator = ViewPropertyAnimator.this;
                super();
            }
                    };
                    animatorlisteneradapter2 = animatorlisteneradapter1;
                }
                viewpropertyanimator.setListener(animatorlisteneradapter2);
                viewpropertyanimator.start();
                i++;
                animatorlisteneradapter = animatorlisteneradapter1;
            }

            if (animatorlisteneradapter == null)
            {
                animateMove();
            }
        }






        public TaxonomyBackHandler(int i, TaxonomyItem taxonomyitem, TaxonomyItem ataxonomyitem[], ListPosition listposition)
        {
            this$0 = BreadcrumbTaxonomyPresenterBase.this;
            super();
            mLastVisitedItemIndex = i;
            mLastVisitedItem = taxonomyitem;
            mNewTaxonomy = ataxonomyitem;
            mNewListPosition = listposition;
            trackCategory();
        }
    }

    private class TaxonomyForwardHandler
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
            Object obj = mListView.getChildAt(mNewPosition);
            ((View) (obj)).setAlpha(1.0F);
            Integer integer = (Integer)mOldTops.get(mClickedItem);
            if (integer != null)
            {
                obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                    (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
                });
                ((ObjectAnimator) (obj)).setDuration(300L);
                ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                    final TaxonomyForwardHandler this$1;

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
                this$1 = TaxonomyForwardHandler.this;
                super();
            }
                });
                ((ObjectAnimator) (obj)).start();
            }
        }

        private void animateMove()
        {
            for (int i = 0; i < mListView.getChildCount(); i++)
            {
                mListView.getChildAt(i).setAlpha(1.0F);
            }

            updateList();
            mListView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final TaxonomyForwardHandler this$1;

                public boolean onPreDraw()
                {
                    mListView.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (mTaxonomyListAdapter.getCount() > mNewPosition)
                    {
                        fadeInNewTaxonomyWithMove();
                    }
                    animateClickedItemMove();
                    animateVisitedItemsMove();
                    return true;
                }

            
            {
                this$1 = TaxonomyForwardHandler.this;
                super();
            }
            });
        }

        private void animateVisitedItemsMove()
        {
            int i = -1;
            for (int k = 0; k < mNewPosition && i == -1; k++)
            {
                View view = mListView.getChildAt(k);
                Integer integer = (Integer)mOldTops.get(mTaxonomyListAdapter.getItem(k));
                if (integer != null)
                {
                    i = view.getTop() - integer.intValue();
                }
            }

            int l = i;
            if (i == -1)
            {
                l = mListView.getChildAt(mNewPosition - 1).getBottom();
            }
            if (l > 0)
            {
                for (int j = 0; j < mNewPosition; j++)
                {
                    Object obj = mListView.getChildAt(j);
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
            int i = mListView.getChildCount();
            mTaxonomyListAdapter.setTaxonomyItems(mNewTaxonomy);
            mListView.setAdapter(mTaxonomyListAdapter);
            mListView.getViewTreeObserver().addOnPreDrawListener(i. new android.view.ViewTreeObserver.OnPreDrawListener() {

                final TaxonomyForwardHandler this$1;
                final int val$startPos;

                public boolean onPreDraw()
                {
                    mListView.getViewTreeObserver().removeOnPreDrawListener(this);
                    AnimatorListenerAdapter animatorlisteneradapter = null;
                    for (int i = startPos; i < mListView.getChildCount();)
                    {
                        AnimatorListenerAdapter animatorlisteneradapter2 = null;
                        View view = mListView.getChildAt(i);
                        ViewPropertyAnimator viewpropertyanimator = view.animate();
                        AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
                        if (animatorlisteneradapter == null)
                        {
                            animatorlisteneradapter1 = viewpropertyanimator. new AnimatorListenerAdapter() {

                                final TaxonomyForwardHandler._cls5 this$2;
                                final ViewPropertyAnimator val$animator;

                                public void onAnimationEnd(Animator animator1)
                                {
                                    animator.setListener(null);
                                    mListView.setEnabled(true);
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
                        mListView.setEnabled(true);
                    }
                    return true;
                }

            
            {
                this$1 = final_taxonomyforwardhandler;
                startPos = I.this;
                super();
            }
            });
            mNewTaxonomy = null;
        }

        private void fadeInNewTaxonomyWithMove()
        {
            AnimatorListenerAdapter animatorlisteneradapter = null;
            for (int i = mNewPosition + 1; i < mListView.getChildCount();)
            {
                AnimatorListenerAdapter animatorlisteneradapter2 = null;
                View view = mListView.getChildAt(i);
                ViewPropertyAnimator viewpropertyanimator = view.animate();
                AnimatorListenerAdapter animatorlisteneradapter1 = animatorlisteneradapter;
                if (animatorlisteneradapter == null)
                {
                    animatorlisteneradapter1 = viewpropertyanimator. new AnimatorListenerAdapter() {

                        final TaxonomyForwardHandler this$1;
                        final ViewPropertyAnimator val$animator;

                        public void onAnimationEnd(Animator animator1)
                        {
                            animator.setListener(null);
                            mListView.setEnabled(true);
                        }

            
            {
                this$1 = final_taxonomyforwardhandler;
                animator = ViewPropertyAnimator.this;
                super();
            }
                    };
                    animatorlisteneradapter2 = animatorlisteneradapter1;
                }
                view.setAlpha(0.0F);
                viewpropertyanimator.alpha(1.0F).setDuration(500L).setListener(animatorlisteneradapter2).start();
                i++;
                animatorlisteneradapter = animatorlisteneradapter1;
            }

            if (animatorlisteneradapter == null)
            {
                mListView.setEnabled(true);
            }
        }

        private void forwardAnimate()
        {
            int k = mListView.getFirstVisiblePosition();
            HashSet hashset = new HashSet();
            for (int i = 0; i < mListView.getChildCount(); i++)
            {
                TaxonomyItem taxonomyitem = (TaxonomyItem)mTaxonomyListAdapter.getItem(k + i);
                if (taxonomyitem.equals(mClickedItem) || mTaxonomyListAdapter.isVisitedItem(taxonomyitem))
                {
                    hashset.add(Integer.valueOf(i));
                }
            }

            AnimatorListenerAdapter animatorlisteneradapter = null;
            int j = 0;
            while (j < mListView.getChildCount()) 
            {
                if (!hashset.contains(Integer.valueOf(j)))
                {
                    ViewPropertyAnimator viewpropertyanimator = mListView.getChildAt(j).animate().alpha(0.0F).setDuration(100L);
                    if (animatorlisteneradapter == null)
                    {
                        animatorlisteneradapter = viewpropertyanimator. new AnimatorListenerAdapter() {

                            final TaxonomyForwardHandler this$1;
                            final ViewPropertyAnimator val$fadeOutAnimator;

                            public void onAnimationEnd(Animator animator)
                            {
                                fadeOutAnimator.setListener(null);
                                animateMove();
                            }

            
            {
                this$1 = final_taxonomyforwardhandler;
                fadeOutAnimator = ViewPropertyAnimator.this;
                super();
            }
                        };
                        viewpropertyanimator.setListener(animatorlisteneradapter);
                    } else
                    {
                        viewpropertyanimator.setListener(null);
                    }
                    viewpropertyanimator.start();
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
            mListView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final TaxonomyForwardHandler this$1;

                public boolean onPreDraw()
                {
                    mListView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int j = mListView.getFirstVisiblePosition();
                    Object obj = mListView.getChildAt(mNewPosition);
                    Integer integer = (Integer)mOldTops.get(mTaxonomyListAdapter.getItem(mNewPosition + j));
                    if (integer != null)
                    {
                        obj = ObjectAnimator.ofFloat(obj, View.TRANSLATION_Y, new float[] {
                            (float)(-(((View) (obj)).getTop() - integer.intValue())), 0.0F
                        });
                        ((ObjectAnimator) (obj)).setDuration(300L);
                        ((ObjectAnimator) (obj)).addListener(new AnimatorListenerAdapter() {

                            final TaxonomyForwardHandler._cls6 this$2;

                            public void onAnimationEnd(Animator animator)
                            {
                                super.onAnimationEnd(animator);
                                mTaxonomyListAdapter.setTaxonomyItems(new TaxonomyItem[0]);
                                for (int i = 0; i < mListView.getChildCount(); i++)
                                {
                                    mListView.getChildAt(i).setAlpha(1.0F);
                                    mListView.getChildAt(i).setTranslationY(0.0F);
                                }

                            }

            
            {
                this$2 = TaxonomyForwardHandler._cls6.this;
                super();
            }
                        });
                        ((ObjectAnimator) (obj)).start();
                    }
                    for (int i = mNewPosition + 1; i < mListView.getChildCount(); i++)
                    {
                        View view = mListView.getChildAt(i);
                        view.animate().alpha(0.0F).setDuration(100L).setListener(null).start();
                        Integer integer1 = (Integer)mOldTops.get(mTaxonomyListAdapter.getItem(j + i));
                        if (integer1 != null)
                        {
                            view.setTranslationY(-(view.getTop() - integer1.intValue()));
                        }
                    }

                    return true;
                }

            
            {
                this$1 = TaxonomyForwardHandler.this;
                super();
            }
            });
        }

        public void animate()
        {
            mOldTops = getViewPositionsInList();
            mListView.getFirstVisiblePosition();
            mListView.getChildAt(0).getTop();
            mListView.setEnabled(false);
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
                mTaxonomyListAdapter.setTaxonomyItems(mNewTaxonomy);
                mListView.setAdapter(mTaxonomyListAdapter);
                return;
            }
        }

        public void updateList()
        {
            mNewPosition = mTaxonomyListAdapter.visitItem(mClickedItem) - 1;
            if (mNewTaxonomy != null)
            {
                mTaxonomyListAdapter.setTaxonomyItems(mNewTaxonomy);
                mListView.setAdapter(mTaxonomyListAdapter);
                mNewTaxonomy = null;
            } else
            {
                mTaxonomyListAdapter.setTaxonomyItems(new TaxonomyItem[0]);
            }
            mListView.setSelection(0);
        }







/*
        static boolean access$2602(TaxonomyForwardHandler taxonomyforwardhandler, boolean flag)
        {
            taxonomyforwardhandler.mMoveFinished = flag;
            return flag;
        }

*/




        public TaxonomyForwardHandler(TaxonomyItem taxonomyitem)
        {
            this$0 = BreadcrumbTaxonomyPresenterBase.this;
            super();
            mClickedItem = taxonomyitem;
            trackCategory();
        }
    }

    private static class TaxonomyStackItem
    {

        public TaxonomyItem children[];
        public ListPosition listPosition;
        public TaxonomyItem taxonomyItem;

        public TaxonomyStackItem(TaxonomyItem taxonomyitem)
        {
            taxonomyItem = taxonomyitem;
        }
    }


    private static final boolean SHOULD_ANIMATE = true;
    private static final String TAG = com/walmart/android/app/shop/taxonomy/BreadcrumbTaxonomyPresenterBase.getSimpleName();
    public static final int TYPE_ROLLBACKS = 1;
    public static final int TYPE_ROOT = 0;
    public static final int TYPE_SHOWCASE = 2;
    private final Activity mActivity;
    private ViewGroup mListContainer;
    private ListView mListView;
    private View mLoadingView;
    private Request mRequestInFlight;
    private TaxonomyItem mRootTaxonomyItem;
    private final LinkedList mScrapViews = new LinkedList();
    private TaxonomyForwardHandler mTaxonomyForwardHandler;
    private BreadcrumbTaxonomyListAdapter mTaxonomyListAdapter;
    private Stack mTaxonomyStack;
    private int mType;

    public BreadcrumbTaxonomyPresenterBase(Activity activity, int i)
    {
        mTaxonomyStack = new Stack();
        mActivity = activity;
        mType = i;
        mRootTaxonomyItem = new TaxonomyItem();
        TaxonomyItem taxonomyitem = mRootTaxonomyItem;
        String s;
        if (i == 2)
        {
            s = "Savings Showcase";
        } else
        {
            s = "All Departments";
        }
        taxonomyitem.name = s;
        mRootTaxonomyItem.clientStyling = -1;
        setTitleText(activity.getString(0x7f090572));
        trackCategory();
    }

    private int getLowest(Collection collection)
    {
        Object obj = null;
        Iterator iterator = collection.iterator();
        collection = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            if (collection == null || integer.intValue() < collection.intValue())
            {
                collection = integer;
            }
        } while (true);
        if (collection != null)
        {
            return collection.intValue();
        } else
        {
            return 0;
        }
    }

    private String getSectionCategoryName()
    {
        if (mType == 1 || mType == 2)
        {
            return "rollbacks";
        } else
        {
            return "browse";
        }
    }

    private HashMap getViewPositionsInList()
    {
        HashMap hashmap = new HashMap();
        int j = mListView.getFirstVisiblePosition();
        for (int i = 0; i < mListView.getChildCount(); i++)
        {
            hashmap.put(mTaxonomyListAdapter.getItem(j + i), Integer.valueOf(mListView.getChildAt(i).getTop()));
        }

        return hashmap;
    }

    private void loadTaxonomy(TaxonomyItem taxonomyitem)
    {
        if (mRequestInFlight != null)
        {
            mRequestInFlight.cancel();
            mRequestInFlight = null;
        }
        if (taxonomyitem.id == null)
        {
            if (mType == 0)
            {
                mRequestInFlight = Services.get().getTaxonomyService().getDepartments();
            } else
            {
                mRequestInFlight = Services.get().getTaxonomyService().getSavingsShowcase();
            }
        } else
        {
            mRequestInFlight = Services.get().getTaxonomyService().getDepartment(taxonomyitem.id);
        }
        mRequestInFlight.addCallback(new GetTaxonomyCallback());
        onTaxonomyPush(taxonomyitem);
    }

    private void trackCategory()
    {
        if (mTaxonomyStack.size() > 1)
        {
            trackPage(((TaxonomyStackItem)mTaxonomyStack.peek()).taxonomyItem.name);
            return;
        }
        String s;
        if (mType == 1 || mType == 2)
        {
            s = "rollbacks";
        } else
        {
            s = "shop";
        }
        trackPage(s);
    }

    private void trackPage(String s)
    {
        AnalyticsHelper.post(AnalyticsHelper.prepareBrowsePageViewEvent(s, getSectionCategoryName(), getSectionCategoryName(), null));
    }

    protected void init(ViewGroup viewgroup, ListView listview, View view)
    {
        mListContainer = viewgroup;
        mListView = listview;
        mLoadingView = view;
        mTaxonomyListAdapter = new BreadcrumbTaxonomyListAdapter(mActivity);
        mListView.setOnItemClickListener(new OnItemSingleClickListener(this) {

            final BreadcrumbTaxonomyPresenterBase this$0;

            private void onUnvisitedTaxonomyItemClick(TaxonomyItem taxonomyitem)
            {
                boolean flag;
                ((TaxonomyStackItem)mTaxonomyStack.peek()).listPosition = new ListPosition(mListView.getFirstVisiblePosition(), mListView.getChildAt(0).getTop());
                flag = true;
                if (taxonomyitem.browseToken != null) goto _L2; else goto _L1
_L1:
                loadTaxonomy(taxonomyitem);
_L4:
                if (flag)
                {
                    mTaxonomyForwardHandler = new TaxonomyForwardHandler(taxonomyitem);
                    mTaxonomyForwardHandler.animate();
                }
                return;
_L2:
                boolean flag1 = shouldVisitLeafItems();
                pushShelfPresenter(taxonomyitem);
                flag = flag1;
                if (flag1)
                {
                    onTaxonomyPush(taxonomyitem);
                    flag = flag1;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            private void onVisitedTaxonomyItemClick(TaxonomyItem taxonomyitem, int i)
            {
                TaxonomyStackItem taxonomystackitem;
                onTaxonomyPop();
                taxonomystackitem = (TaxonomyStackItem)mTaxonomyStack.peek();
_L3:
                if (mTaxonomyStack.size() > 1 && !taxonomystackitem.taxonomyItem.id.equals(taxonomyitem.id)) goto _L2; else goto _L1
_L1:
                boolean flag;
                int k;
                taxonomyitem = (TaxonomyItem)mTaxonomyListAdapter.getItem(i + 1);
                k = mListView.getFirstVisiblePosition();
                flag = false;
                i = 0;
_L4:
                int j = ((flag) ? 1 : 0);
                if (i < mListView.getChildCount())
                {
                    if (!taxonomyitem.equals(mTaxonomyListAdapter.getItem(k + i)))
                    {
                        break MISSING_BLOCK_LABEL_209;
                    }
                    j = i;
                }
                (new TaxonomyBackHandler(j, taxonomyitem, taxonomystackitem.children, taxonomystackitem.listPosition)).animate();
                if (mRequestInFlight != null)
                {
                    mRequestInFlight.cancel();
                    mRequestInFlight = null;
                }
                return;
_L2:
                onTaxonomyPop();
                taxonomystackitem = (TaxonomyStackItem)mTaxonomyStack.peek();
                  goto _L3
                i++;
                  goto _L4
            }

            public void onItemSingleClick(AdapterView adapterview, View view1, int i, long l)
            {
                adapterview = mTaxonomyListAdapter.getTaxonomyItem(i);
                if (mTaxonomyListAdapter.isVisitedItem(adapterview))
                {
                    onVisitedTaxonomyItemClick(adapterview, i);
                    return;
                } else
                {
                    onUnvisitedTaxonomyItemClick(adapterview);
                    return;
                }
            }

            
            {
                this$0 = BreadcrumbTaxonomyPresenterBase.this;
                super(presenter);
            }
        });
        mTaxonomyListAdapter.visitItem(mRootTaxonomyItem);
    }

    public boolean interceptBack()
    {
        if (!mListView.isEnabled())
        {
            return true;
        }
        if (mTaxonomyStack.size() > 1)
        {
            onTaxonomyPop();
            int k = mListView.getFirstVisiblePosition();
            int j = -1;
            for (int i = 0; i < mListView.getChildCount(); i++)
            {
                if (mTaxonomyListAdapter.isVisitedItem(k + i))
                {
                    j = i;
                }
            }

            (new TaxonomyBackHandler(j, mTaxonomyListAdapter.getLastVisitedItem(), ((TaxonomyStackItem)mTaxonomyStack.peek()).children, ((TaxonomyStackItem)mTaxonomyStack.peek()).listPosition)).animate();
            if (mRequestInFlight != null)
            {
                mRequestInFlight.cancel();
                mRequestInFlight = null;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackCategory();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        loadTaxonomy(mRootTaxonomyItem);
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        if (!recentlyPushed())
        {
            trackCategory();
        }
    }

    protected void onTaxonomyLoaded(TaxonomyItem taxonomyitem)
    {
    }

    protected void onTaxonomyPop()
    {
        mTaxonomyStack.pop();
    }

    protected void onTaxonomyPush(TaxonomyItem taxonomyitem)
    {
        mTaxonomyStack.push(new TaxonomyStackItem(taxonomyitem));
    }

    protected void pushShelfPresenter(TaxonomyItem taxonomyitem)
    {
        String s = getSectionCategoryName();
        if (ShelfUtils.canUseShelfGrid(mActivity))
        {
            ShelfGridPresenter shelfgridpresenter = new ShelfGridPresenter(mActivity, taxonomyitem.browseToken);
            shelfgridpresenter.setTitleText(taxonomyitem.name);
            shelfgridpresenter.setSectionAndCategory(s, s);
            pushPresenter(shelfgridpresenter);
            return;
        } else
        {
            ShelfListPresenter shelflistpresenter = new ShelfListPresenter(mActivity, taxonomyitem.browseToken);
            shelflistpresenter.setTitleText(taxonomyitem.name);
            shelflistpresenter.setSectionAndCategory(s, s);
            pushPresenter(shelflistpresenter);
            return;
        }
    }

    public void scrollToTop()
    {
        mListView.setSelection(0);
    }

    protected abstract boolean shouldVisitLeafItems();




/*
    static BreadcrumbTaxonomyListAdapter access$002(BreadcrumbTaxonomyPresenterBase breadcrumbtaxonomypresenterbase, BreadcrumbTaxonomyListAdapter breadcrumbtaxonomylistadapter)
    {
        breadcrumbtaxonomypresenterbase.mTaxonomyListAdapter = breadcrumbtaxonomylistadapter;
        return breadcrumbtaxonomylistadapter;
    }

*/











/*
    static Request access$302(BreadcrumbTaxonomyPresenterBase breadcrumbtaxonomypresenterbase, Request request)
    {
        breadcrumbtaxonomypresenterbase.mRequestInFlight = request;
        return request;
    }

*/




/*
    static TaxonomyForwardHandler access$502(BreadcrumbTaxonomyPresenterBase breadcrumbtaxonomypresenterbase, TaxonomyForwardHandler taxonomyforwardhandler)
    {
        breadcrumbtaxonomypresenterbase.mTaxonomyForwardHandler = taxonomyforwardhandler;
        return taxonomyforwardhandler;
    }

*/




}
