// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nhaarman.listviewanimations.itemmanipulation;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.nhaarman.listviewanimations.BaseAdapterDecorator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nhaarman.listviewanimations.itemmanipulation:
//            InsertQueue

public class AnimateAdditionAdapter extends BaseAdapterDecorator
{
    public static interface Insertable
    {

        public abstract void add(int i, Object obj);
    }


    private static final String ALPHA = "alpha";
    private static final long DEFAULT_INSERTION_ANIMATION_MS = 300L;
    private static final long DEFAULT_SCROLLDOWN_ANIMATION_MS = 300L;
    private final InsertQueue mInsertQueue;
    private final Insertable mInsertable;
    private long mInsertionAnimationDurationMs;
    private long mScrolldownAnimationDurationMs;
    private boolean mShouldAnimateDown;

    public AnimateAdditionAdapter(BaseAdapter baseadapter)
    {
        super(baseadapter);
        mShouldAnimateDown = true;
        mInsertionAnimationDurationMs = 300L;
        mScrolldownAnimationDurationMs = 300L;
        baseadapter = getRootAdapter();
        if (!(baseadapter instanceof Insertable))
        {
            throw new IllegalArgumentException("BaseAdapter should implement Insertable!");
        } else
        {
            mInsertable = (Insertable)baseadapter;
            mInsertQueue = new InsertQueue(mInsertable);
            return;
        }
    }

    private BaseAdapter getRootAdapter()
    {
        BaseAdapter baseadapter;
        for (baseadapter = getDecoratedBaseAdapter(); baseadapter instanceof BaseAdapterDecorator; baseadapter = ((BaseAdapterDecorator)baseadapter).getDecoratedBaseAdapter()) { }
        return baseadapter;
    }

    protected Animator[] getAdditionalAnimators(View view, ViewGroup viewgroup)
    {
        return new Animator[0];
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if (mInsertQueue.getActiveIndexes().contains(Integer.valueOf(i)))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(-1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0x80000000));
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                1, view.getMeasuredHeight()
            });
            valueanimator.addUpdateListener(new _cls1(view));
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                0.0F, 1.0F
            });
            AnimatorSet animatorset = new AnimatorSet();
            viewgroup = getAdditionalAnimators(view, viewgroup);
            Animator aanimator[] = new Animator[viewgroup.length + 2];
            aanimator[0] = valueanimator;
            aanimator[1] = objectanimator;
            System.arraycopy(viewgroup, 0, aanimator, 2, viewgroup.length);
            animatorset.playTogether(aanimator);
            animatorset.setDuration(mInsertionAnimationDurationMs);
            animatorset.addListener(new _cls2(i));
            animatorset.start();
        }
        return view;
    }

    public void insert(int i, Object obj)
    {
        insert(new Pair[] {
            new Pair(Integer.valueOf(i), obj)
        });
    }

    public void insert(List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        int i1 = 0;
        int l = 0;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (Pair)list.next();
            if (getAbsListView().getFirstVisiblePosition() > ((Integer)((Pair) (obj)).first).intValue())
            {
                int i = ((Integer)((Pair) (obj)).first).intValue();
                Iterator iterator = arraylist1.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (i >= ((Integer)iterator.next()).intValue())
                    {
                        i++;
                    }
                } while (true);
                mInsertable.add(i, ((Pair) (obj)).second);
                arraylist1.add(Integer.valueOf(i));
                i = l + 1;
                l = i;
                if (mShouldAnimateDown)
                {
                    obj = getView(((Integer)((Pair) (obj)).first).intValue(), null, getAbsListView());
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    i1 -= ((View) (obj)).getMeasuredHeight();
                    l = i;
                }
            } else
            if (getAbsListView().getLastVisiblePosition() >= ((Integer)((Pair) (obj)).first).intValue())
            {
                int j = ((Integer)((Pair) (obj)).first).intValue();
                Iterator iterator1 = arraylist1.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    if (j >= ((Integer)iterator1.next()).intValue())
                    {
                        j++;
                    }
                } while (true);
                arraylist.add(new Pair(Integer.valueOf(j), ((Pair) (obj)).second));
            } else
            {
                int k = ((Integer)((Pair) (obj)).first).intValue();
                Iterator iterator2 = arraylist1.iterator();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    if (k >= ((Integer)iterator2.next()).intValue())
                    {
                        k++;
                    }
                } while (true);
                iterator2 = arraylist2.iterator();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    if (k >= ((Integer)iterator2.next()).intValue())
                    {
                        k++;
                    }
                } while (true);
                arraylist2.add(Integer.valueOf(k));
                mInsertable.add(k, ((Pair) (obj)).second);
            }
        } while (true);
        if (mShouldAnimateDown)
        {
            getAbsListView().smoothScrollBy(i1, (int)(mScrolldownAnimationDurationMs * (long)l));
        }
        mInsertQueue.insert(arraylist);
        ((ListView)getAbsListView()).setSelectionFromTop(getAbsListView().getFirstVisiblePosition() + l, getAbsListView().getChildAt(0).getTop());
    }

    public transient void insert(Pair apair[])
    {
        insert(Arrays.asList(apair));
    }

    public void setAbsListView(AbsListView abslistview)
    {
        if (!(abslistview instanceof ListView))
        {
            throw new IllegalArgumentException("AnimateAdditionAdapter requires a ListView instance!");
        } else
        {
            super.setAbsListView(abslistview);
            return;
        }
    }

    public void setInsertionAnimationDuration(long l)
    {
        mInsertionAnimationDurationMs = l;
    }

    public void setListView(ListView listview)
    {
        super.setAbsListView(listview);
    }

    public void setScrolldownAnimationDuration(long l)
    {
        mScrolldownAnimationDurationMs = l;
    }

    public void setShouldAnimateDown(boolean flag)
    {
        mShouldAnimateDown = flag;
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
