// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list.horizontal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.contextlogic.wish.ui.components.scrollview.InterceptingTouchHorizontalScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.components.list.horizontal:
//            HorizontalListViewAdapter, HorizontalListViewListener, HorizontalListViewCell

public class HorizontalListView extends InterceptingTouchHorizontalScrollView
{

    private static final double VISIBLE_RECT_BUFFER_RATIO = 1D;
    private HorizontalListViewAdapter adapter;
    private boolean disableContentRequestLayout;
    private HashMap indexRectMapping;
    private WeakReference listenerReference;
    private Runnable recycleRunnable;
    private HashMap reusableViews;
    private int scrollPositionOverride;
    private LinearLayout scrollViewContent;
    private FrameLayout scrollViewContentHolder;
    private int totalContentWidth;
    private HashMap visibleViews;

    public HorizontalListView(Context context)
    {
        this(context, null);
    }

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HorizontalListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void addCells(int i)
    {
        int l = adapter.getNumItems();
        int j = 0;
        int i1 = adapter.getWidthForView();
        int k = adapter.getHeightForView();
        if (l > 0)
        {
            for (; i < l; i++)
            {
                j = i * i1;
                Rect rect = new Rect(j, 0, j + i1, 0 + k);
                indexRectMapping.put(Integer.valueOf(i), rect);
            }

            j = l * i1;
        }
        totalContentWidth = j;
        disableContentRequestLayout = false;
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(totalContentWidth, k);
        scrollViewContentHolder.setLayoutParams(layoutparams);
        recycleRunnable.run();
    }

    private void alertListenerOnClickView(HorizontalListViewCell horizontallistviewcell)
    {
        HorizontalListViewListener horizontallistviewlistener;
        if (listenerReference != null)
        {
            if ((horizontallistviewlistener = (HorizontalListViewListener)listenerReference.get()) != null)
            {
                horizontallistviewlistener.onSelectCell(horizontallistviewcell, horizontallistviewcell.getIndex());
                return;
            }
        }
    }

    private void alertListenerOnScrollChanged(int i)
    {
        HorizontalListViewListener horizontallistviewlistener;
        if (listenerReference != null)
        {
            if ((horizontallistviewlistener = (HorizontalListViewListener)listenerReference.get()) != null)
            {
                horizontallistviewlistener.onScrollChanged(i, getWidth(), totalContentWidth);
                return;
            }
        }
    }

    private void enqueueView(HorizontalListViewCell horizontallistviewcell)
    {
label0:
        {
            horizontallistviewcell.prepareForRecycle();
            disableContentRequestLayout = true;
            horizontallistviewcell.setVisibility(8);
            disableContentRequestLayout = false;
            if (horizontallistviewcell.getIdentifier() != null)
            {
                ArrayList arraylist = (ArrayList)reusableViews.get(horizontallistviewcell.getIdentifier());
                if (arraylist == null)
                {
                    break label0;
                }
                arraylist.add(horizontallistviewcell);
            }
            return;
        }
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(horizontallistviewcell);
        reusableViews.put(horizontallistviewcell.getIdentifier(), arraylist1);
    }

    private void init()
    {
        scrollViewContent = new LinearLayout(getContext());
        scrollViewContent.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        scrollViewContent.setOrientation(1);
        addView(scrollViewContent);
        scrollViewContentHolder = new FrameLayout(getContext()) {

            final HorizontalListView this$0;

            public void requestLayout()
            {
                if (!disableContentRequestLayout)
                {
                    super.requestLayout();
                }
            }

            
            {
                this$0 = HorizontalListView.this;
                super(context);
            }
        };
        scrollViewContent.addView(scrollViewContentHolder);
        reusableViews = new HashMap();
        visibleViews = new HashMap();
        indexRectMapping = new HashMap();
        recycleRunnable = new Runnable() {

            final HorizontalListView this$0;

            public void run()
            {
                recycleViewsIfNecessary();
            }

            
            {
                this$0 = HorizontalListView.this;
                super();
            }
        };
    }

    private void recycleViewsIfNecessary()
    {
        if (adapter != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Rect rect;
        ArrayList arraylist;
        int i;
        int l;
        int i2;
        int j2;
        int k2;
        boolean flag;
        {
label0:
            {
                int i1 = getWidth();
                i = adapter.getHeightForView();
                if (i != 0)
                {
                    l = i1;
                    if (i1 != 0)
                    {
                        break label0;
                    }
                }
                l = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
                i = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getHeight();
            }
            HorizontalListViewCell horizontallistviewcell;
            int j1;
            int l2;
            if (scrollViewContentHolder.getChildCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (scrollPositionOverride != 0)
            {
                j1 = scrollPositionOverride;
            } else
            {
                j1 = getScrollX();
            }
            i2 = adapter.getWidthForView();
            scrollPositionOverride = 0;
            k2 = (int)((double)l * 1.0D);
            j2 = Math.max(0, j1 - k2);
            j1 = j1 + l + k2;
            rect = new Rect(j2, 0, j1, i);
            l = (int)Math.floor(j2 / i2);
            i2 = (int)Math.ceil(j1 / i2);
            arraylist = new ArrayList();
            l2 = visibleViews.size();
            i = 0;
        }
        if (i >= l2)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        if (Rect.intersects((Rect)indexRectMapping.get(Integer.valueOf(i)), rect))
        {
            break; /* Loop/switch isn't completed */
        }
        horizontallistviewcell = (HorizontalListViewCell)visibleViews.get(Integer.valueOf(i));
        j2 = i2;
        k2 = l;
        if (horizontallistviewcell != null)
        {
            enqueueView(horizontallistviewcell);
            arraylist.add(Integer.valueOf(i));
            k2 = l;
            j2 = i2;
        }
_L6:
        i++;
        i2 = j2;
        l = k2;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_209;
_L3:
        int k1;
label1:
        {
            if (l != -1)
            {
                k1 = l;
                if (i >= l)
                {
                    break label1;
                }
            }
            k1 = i;
        }
        if (i2 != -1)
        {
            j2 = i2;
            k2 = k1;
            if (i <= i2)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j2 = i;
        k2 = k1;
        if (true) goto _L6; else goto _L5
_L5:
        int l1 = arraylist.size();
        for (int j = 0; j < l1; j++)
        {
            visibleViews.remove(arraylist.get(j));
        }

        int k = Math.max(0, l);
        l = Math.min(adapter.getNumItems(), i2);
        while (k < l) 
        {
            Rect rect1 = (Rect)indexRectMapping.get(Integer.valueOf(k));
            if (rect1 != null)
            {
                boolean flag1 = visibleViews.containsKey(Integer.valueOf(k));
                if (!flag1 && Rect.intersects(rect1, rect))
                {
                    final HorizontalListViewCell cellView = adapter.getViewAtIndex(k, flag);
                    cellView.setIndex(k);
                    android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(rect1.right - rect1.left, rect1.bottom - rect1.top);
                    layoutparams.gravity = 48;
                    layoutparams.topMargin = rect1.top;
                    layoutparams.leftMargin = rect1.left;
                    layoutparams.width = adapter.getWidthForView();
                    layoutparams.height = adapter.getHeightForView();
                    if (cellView.getParent() != null && cellView.getParent() != scrollViewContentHolder)
                    {
                        ((ViewGroup)cellView.getParent()).removeView(cellView);
                    }
                    if (cellView.getParent() == null)
                    {
                        scrollViewContentHolder.addView(cellView, layoutparams);
                    }
                    cellView.setVisibility(0);
                    cellView.setLayoutParams(layoutparams);
                    cellView.setOnClickListener(new android.view.View.OnClickListener() {

                        final HorizontalListView this$0;
                        final HorizontalListViewCell val$cellView;

                        public void onClick(View view)
                        {
                            alertListenerOnClickView(cellView);
                        }

            
            {
                this$0 = HorizontalListView.this;
                cellView = horizontallistviewcell;
                super();
            }
                    });
                    visibleViews.put(Integer.valueOf(k), cellView);
                } else
                if (flag1)
                {
                    HorizontalListViewCell horizontallistviewcell1 = (HorizontalListViewCell)visibleViews.get(Integer.valueOf(k));
                    horizontallistviewcell1.setIndex(k);
                    android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)horizontallistviewcell1.getLayoutParams();
                    if (layoutparams1.leftMargin != rect1.left || layoutparams1.topMargin != rect1.top)
                    {
                        android.widget.FrameLayout.LayoutParams layoutparams2 = new android.widget.FrameLayout.LayoutParams(rect1.right - rect1.left, rect1.bottom - rect1.top);
                        layoutparams2.gravity = 48;
                        layoutparams2.topMargin = rect1.top;
                        layoutparams2.leftMargin = rect1.left;
                        horizontallistviewcell1.setLayoutParams(layoutparams2);
                    }
                }
            }
            k++;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public HorizontalListViewCell dequeueView(String s)
    {
        Object obj = null;
        ArrayList arraylist = (ArrayList)reusableViews.get(s);
        s = obj;
        if (arraylist != null)
        {
            s = obj;
            if (arraylist.size() > 0)
            {
                s = (HorizontalListViewCell)arraylist.remove(0);
            }
        }
        return s;
    }

    public HashMap getVisibleViews()
    {
        return visibleViews;
    }

    public void insertCells(int i)
    {
        if (adapter == null)
        {
            return;
        }
        if (indexRectMapping.size() == 0)
        {
            reloadData();
            return;
        } else
        {
            addCells(adapter.getNumItems() - i);
            return;
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        alertListenerOnScrollChanged(i);
        post(recycleRunnable);
    }

    public void releaseImages()
    {
        for (Iterator iterator = visibleViews.entrySet().iterator(); iterator.hasNext(); ((HorizontalListViewCell)((java.util.Map.Entry)iterator.next()).getValue()).releaseImages()) { }
    }

    public void reloadData()
    {
        if (adapter == null)
        {
            return;
        }
        for (Iterator iterator = visibleViews.entrySet().iterator(); iterator.hasNext(); enqueueView((HorizontalListViewCell)((java.util.Map.Entry)iterator.next()).getValue())) { }
        visibleViews.clear();
        indexRectMapping.clear();
        addCells(0);
    }

    public void restoreImages()
    {
        for (Iterator iterator = visibleViews.entrySet().iterator(); iterator.hasNext(); ((HorizontalListViewCell)((java.util.Map.Entry)iterator.next()).getValue()).restoreImages()) { }
    }

    public void scrollToPosition(final int position)
    {
        post(new Runnable() {

            final HorizontalListView this$0;
            final int val$position;

            public void run()
            {
                scrollTo(adapter.getWidthForView() * position, 0);
            }

            
            {
                this$0 = HorizontalListView.this;
                position = i;
                super();
            }
        });
    }

    public void setAdapter(HorizontalListViewAdapter horizontallistviewadapter)
    {
        adapter = horizontallistviewadapter;
    }

    public void setListener(HorizontalListViewListener horizontallistviewlistener)
    {
        listenerReference = new WeakReference(horizontallistviewlistener);
    }

    public void setScrollPosition(int i)
    {
        scrollPositionOverride = i;
    }




}
