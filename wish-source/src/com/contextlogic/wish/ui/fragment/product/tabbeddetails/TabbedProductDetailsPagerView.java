// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsFragment

public abstract class TabbedProductDetailsPagerView extends FrameLayout
{
    private static final class ScrollDirection extends Enum
    {

        private static final ScrollDirection $VALUES[];
        public static final ScrollDirection DOWN;
        public static final ScrollDirection UNKNOWN;
        public static final ScrollDirection UP;

        public static ScrollDirection valueOf(String s)
        {
            return (ScrollDirection)Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsPagerView$ScrollDirection, s);
        }

        public static ScrollDirection[] values()
        {
            return (ScrollDirection[])$VALUES.clone();
        }

        static 
        {
            UP = new ScrollDirection("UP", 0);
            DOWN = new ScrollDirection("DOWN", 1);
            UNKNOWN = new ScrollDirection("UNKNOWN", 2);
            $VALUES = (new ScrollDirection[] {
                UP, DOWN, UNKNOWN
            });
        }

        private ScrollDirection(String s, int i)
        {
            super(s, i);
        }
    }


    private boolean canChangeScrollDirection;
    private ScrollDirection currentScrollDirection;
    protected TabbedProductDetailsFragment fragment;
    protected int index;
    private int lastScrollEndPosition;
    private boolean pagerSettled;
    private ArrayList pagerSettledTasks;
    protected WishProduct product;
    private Runnable scrollEndTask;
    private int startScrollPosition;
    private int startTabBarOffset;

    public TabbedProductDetailsPagerView(Context context)
    {
        this(context, null);
    }

    public TabbedProductDetailsPagerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabbedProductDetailsPagerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleScrollEnded()
    {
        int i = getCurrentScrollY();
        if (i <= fragment.getTabBarStripHeight())
        {
            fragment.showTabBarStrip(true);
        } else
        if (i < startScrollPosition)
        {
            fragment.showTabBarStrip(true);
        } else
        {
            fragment.hideTabBarStrip(true);
        }
        startScrollPosition = -1;
        startTabBarOffset = -1;
        currentScrollDirection = ScrollDirection.UNKNOWN;
    }

    private void processPagerSettledTasks()
    {
        if (!pagerSettled || fragment.getCurrentIndex() != index)
        {
            return;
        }
        for (Iterator iterator = pagerSettledTasks.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        pagerSettledTasks.clear();
    }

    private void waitForScrollEnd()
    {
        removeCallbacks(scrollEndTask);
        lastScrollEndPosition = -1;
        scrollEndTask.run();
    }

    public abstract void cleanup();

    public abstract int getCurrentScrollY();

    public abstract void handleOrientationChanged();

    protected void handleScrollChanged(int i, int j)
    {
        i = Math.max(0, i);
        ScrollDirection scrolldirection;
        if (j < 0)
        {
            scrolldirection = ScrollDirection.UP;
        } else
        if (j == 0)
        {
            scrolldirection = currentScrollDirection;
        } else
        {
            scrolldirection = ScrollDirection.DOWN;
        }
        if (startScrollPosition == -1 || scrolldirection != currentScrollDirection && canChangeScrollDirection)
        {
            startScrollPosition = i - j;
            startTabBarOffset = fragment.getTabBarStripOffset();
            currentScrollDirection = scrolldirection;
        }
        i = startScrollPosition - i;
        if (i != 0)
        {
            fragment.setTabBarStripOffset(startTabBarOffset + i);
        }
    }

    protected void init()
    {
        startScrollPosition = -1;
        startTabBarOffset = -1;
        currentScrollDirection = ScrollDirection.UNKNOWN;
        pagerSettledTasks = new ArrayList();
        pagerSettled = true;
        scrollEndTask = new Runnable() {

            final TabbedProductDetailsPagerView this$0;

            public void run()
            {
                int i = getCurrentScrollY();
                if (lastScrollEndPosition - i == 0)
                {
                    handleScrollEnded();
                    return;
                } else
                {
                    lastScrollEndPosition = i;
                    postDelayed(scrollEndTask, 100L);
                    return;
                }
            }

            
            {
                this$0 = TabbedProductDetailsPagerView.this;
                super();
            }
        };
    }

    public void onPagerScrollSettled()
    {
        pagerSettled = true;
        processPagerSettledTasks();
    }

    public void onPagerScrollUnsettled()
    {
        pagerSettled = false;
    }

    protected void queuePagerSettledTask(Runnable runnable)
    {
        pagerSettledTasks.add(runnable);
        processPagerSettledTasks();
    }

    public abstract void refreshWishStates(boolean flag);

    public abstract void releaseImages();

    public abstract void restoreImages();

    public void setup(WishProduct wishproduct, int i, TabbedProductDetailsFragment tabbedproductdetailsfragment)
    {
        product = wishproduct;
        index = i;
        fragment = tabbedproductdetailsfragment;
    }

    protected void setupScroller(View view)
    {
        view.setOnTouchListener(new android.view.View.OnTouchListener() {

            final TabbedProductDetailsPagerView this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    canChangeScrollDirection = false;
                    waitForScrollEnd();
                } else
                if (motionevent.getAction() == 2)
                {
                    canChangeScrollDirection = true;
                    return false;
                }
                return false;
            }

            
            {
                this$0 = TabbedProductDetailsPagerView.this;
                super();
            }
        });
    }



/*
    static int access$002(TabbedProductDetailsPagerView tabbedproductdetailspagerview, int i)
    {
        tabbedproductdetailspagerview.lastScrollEndPosition = i;
        return i;
    }

*/




/*
    static boolean access$302(TabbedProductDetailsPagerView tabbedproductdetailspagerview, boolean flag)
    {
        tabbedproductdetailspagerview.canChangeScrollDirection = flag;
        return flag;
    }

*/

}
