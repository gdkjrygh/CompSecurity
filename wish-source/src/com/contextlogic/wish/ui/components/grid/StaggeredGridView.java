// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.grid;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.contextlogic.wish.ui.components.scrollview.InterceptingTouchScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.components.grid:
//            StaggeredGridViewAdapter, StaggeredGridViewListener, StaggeredGridCellView

public class StaggeredGridView extends InterceptingTouchScrollView
{

    private static final int LOAD_BUFFER_FACTOR = 10;
    private static final int MARGIN = 8;
    private static final double VISIBLE_RECT_BUFFER_RATIO = 0.75D;
    private StaggeredGridViewAdapter adapter;
    private Rect cachedVisibleRect;
    private SparseBooleanArray cleanupArray;
    private ArrayList columnHeights;
    private int columnWidth;
    private boolean disableContentRequestLayout;
    private int displayWidth;
    private View footer;
    private boolean forceAlternatingColumns;
    private View header;
    private int horizontalMargin;
    private boolean inEditMode;
    private SparseArray indexRectMapping;
    private int lastColumnIndex;
    private WeakReference listenerReference;
    private int numColumns;
    private int orientation;
    private Runnable recycleRunnable;
    private HashMap reusableViews;
    private int scrollPositionOverride;
    private LinearLayout scrollViewContent;
    private FrameLayout scrollViewContentHolder;
    private View specialHeader;
    private int totalContentHeight;
    private int verticalMargin;
    private SparseArray visibleViews;

    public StaggeredGridView(Context context)
    {
        this(context, null);
    }

    public StaggeredGridView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StaggeredGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void addCells(int i)
    {
        int i1;
        int j1;
        boolean flag;
        int l2;
        l2 = adapter.getNumItems();
        i1 = 0;
        flag = false;
        if (l2 <= 0)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        j1 = i;
_L2:
        int l1;
        int j2;
        if (j1 >= l2)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        i1 = 0;
        if (!forceAlternatingColumns)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = (lastColumnIndex + 1) % numColumns;
        lastColumnIndex = j2;
        l1 = ((Integer)columnHeights.get(j2)).intValue();
_L4:
        i = columnWidth * j2 + (j2 + 1) * horizontalMargin;
        int j = columnWidth;
        i1 = l1 + adapter.getHeightForViewAtIndex(j1, columnWidth);
        Rect rect = new Rect(i, l1, i + j, i1);
        indexRectMapping.put(j1, rect);
        columnHeights.set(j2, Integer.valueOf(verticalMargin + i1));
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        int k;
        k = ((Integer)columnHeights.get(0)).intValue();
        i = 1;
_L5:
        j2 = i1;
        l1 = k;
        if (i >= numColumns) goto _L4; else goto _L3
_L3:
        int k2 = ((Integer)columnHeights.get(i)).intValue();
        int i2 = k;
        if (k2 < k)
        {
            i2 = k2;
            i1 = i;
        }
        i++;
        k = i2;
          goto _L5
          goto _L4
        int l = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            i1 = i;
            if (l >= numColumns)
            {
                break;
            }
            int k1 = ((Integer)columnHeights.get(l)).intValue();
            i1 = i;
            if (i < k1)
            {
                i1 = k1;
            }
            l++;
            i = i1;
        } while (true);
        totalContentHeight = i1;
        scrollViewContentHolder.setLayoutParams(new android.widget.LinearLayout.LayoutParams(displayWidth, i1));
        recycleRunnable.run();
        return;
    }

    private void alertListenerOnClickView(StaggeredGridCellView staggeredgridcellview)
    {
        StaggeredGridViewListener staggeredgridviewlistener;
        if (listenerReference != null)
        {
            if ((staggeredgridviewlistener = (StaggeredGridViewListener)listenerReference.get()) != null)
            {
                staggeredgridviewlistener.onSelectCell(staggeredgridcellview, staggeredgridcellview.getIndex());
                return;
            }
        }
    }

    private boolean alertListenerOnLongClickView(StaggeredGridCellView staggeredgridcellview)
    {
        StaggeredGridViewListener staggeredgridviewlistener;
        if (listenerReference != null)
        {
            if ((staggeredgridviewlistener = (StaggeredGridViewListener)listenerReference.get()) != null)
            {
                return staggeredgridviewlistener.onLongClickCell(staggeredgridcellview, staggeredgridcellview.getIndex());
            }
        }
        return false;
    }

    private void alertListenerOnScrollChanged(int i, int j)
    {
        StaggeredGridViewListener staggeredgridviewlistener;
        if (listenerReference != null)
        {
            if ((staggeredgridviewlistener = (StaggeredGridViewListener)listenerReference.get()) != null)
            {
                staggeredgridviewlistener.onScrollChanged(i, j, getHeight(), totalContentHeight);
                return;
            }
        }
    }

    private void enqueueView(StaggeredGridCellView staggeredgridcellview)
    {
label0:
        {
            staggeredgridcellview.prepareForRecycle();
            disableContentRequestLayout = true;
            staggeredgridcellview.getContentView().setVisibility(8);
            disableContentRequestLayout = false;
            if (staggeredgridcellview.getIdentifier() != null)
            {
                ArrayList arraylist = (ArrayList)reusableViews.get(staggeredgridcellview.getIdentifier());
                if (arraylist == null)
                {
                    break label0;
                }
                arraylist.add(staggeredgridcellview);
            }
            return;
        }
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(staggeredgridcellview);
        reusableViews.put(staggeredgridcellview.getIdentifier(), arraylist1);
    }

    private void init()
    {
        cachedVisibleRect = new Rect(0, 0, 0, 0);
        cleanupArray = new SparseBooleanArray();
        forceAlternatingColumns = false;
        scrollViewContent = new LinearLayout(getContext());
        scrollViewContent.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        scrollViewContent.setOrientation(1);
        addView(scrollViewContent);
        scrollViewContentHolder = new FrameLayout(getContext()) {

            final StaggeredGridView this$0;

            public void requestLayout()
            {
                if (!disableContentRequestLayout)
                {
                    super.requestLayout();
                }
            }

            
            {
                this$0 = StaggeredGridView.this;
                super(context);
            }
        };
        scrollViewContent.addView(scrollViewContentHolder);
        reusableViews = new HashMap();
        visibleViews = new SparseArray();
        indexRectMapping = new SparseArray();
        columnHeights = new ArrayList();
        setHorizontalMargin(8);
        setVerticalMargin(8);
        recycleRunnable = new Runnable() {

            final StaggeredGridView this$0;

            public void run()
            {
                recycleViewsIfNecessary();
            }

            
            {
                this$0 = StaggeredGridView.this;
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
        int j;
        int k1;
        int j2;
        int k2;
        boolean flag1;
        {
            int l1;
label0:
            {
                int i = getWidth();
                l1 = getHeight();
                if (l1 != 0)
                {
                    k1 = i;
                    if (i != 0)
                    {
                        break label0;
                    }
                }
                k1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
                l1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getHeight();
            }
            int k;
            int l2;
            if (scrollViewContentHolder.getChildCount() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (scrollPositionOverride != 0)
            {
                k = scrollPositionOverride;
            } else
            {
                k = getScrollY();
            }
            j = k;
            if (header != null)
            {
                j = k - header.getHeight();
            }
            k = j;
            if (specialHeader != null)
            {
                k = j - specialHeader.getHeight();
            }
            scrollPositionOverride = 0;
            j = (int)((double)l1 * 0.75D);
            j2 = Math.max(0, k - j);
            cachedVisibleRect.set(0, j2, k1, k + l1 + j);
            j = -1;
            k1 = -1;
            l2 = visibleViews.size();
            cleanupArray.clear();
            l1 = 0;
        }
        if (l1 >= l2)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        j2 = visibleViews.keyAt(l1);
        if (Rect.intersects((Rect)indexRectMapping.get(j2), cachedVisibleRect))
        {
            break; /* Loop/switch isn't completed */
        }
        enqueueView((StaggeredGridCellView)visibleViews.get(j2));
        cleanupArray.put(j2, true);
        k2 = j;
        j = k1;
_L6:
        l1++;
        k1 = j;
        j = k2;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_217;
_L3:
        int l;
label1:
        {
            if (j != -1)
            {
                l = j;
                if (j2 >= j)
                {
                    break label1;
                }
            }
            l = j2;
        }
        if (k1 != -1)
        {
            j = k1;
            k2 = l;
            if (j2 <= k1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = j2;
        k2 = l;
        if (true) goto _L6; else goto _L5
_L5:
        int i2 = cleanupArray.size();
        for (int i1 = 0; i1 < i2; i1++)
        {
            visibleViews.remove(cleanupArray.keyAt(i1));
        }

        int j1 = adapter.getNumItems();
        if (visibleViews.size() == 0)
        {
            j = 0;
        } else
        {
            j = Math.max(0, j - numColumns * 10);
            j1 = Math.min(j1, numColumns * 10 + k1);
        }
        while (j < j1) 
        {
            Rect rect = (Rect)indexRectMapping.get(j);
            if (rect != null)
            {
                final StaggeredGridCellView cellView = (StaggeredGridCellView)visibleViews.get(j);
                boolean flag;
                if (cellView != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag && Rect.intersects(rect, cachedVisibleRect))
                {
                    cellView = adapter.getViewAtIndex(j, columnWidth, flag1);
                    cellView.setIndex(j);
                    cellView.setEditModeEnabled(inEditMode);
                    android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(rect.right - rect.left, rect.bottom - rect.top);
                    layoutparams.gravity = 48;
                    layoutparams.topMargin = rect.top;
                    layoutparams.leftMargin = rect.left;
                    if (cellView.getContentView().getParent() != null && cellView.getContentView().getParent() != scrollViewContentHolder)
                    {
                        ((ViewGroup)cellView.getContentView().getParent()).removeView(cellView.getContentView());
                    }
                    if (cellView.getContentView().getParent() == null)
                    {
                        scrollViewContentHolder.addView(cellView.getContentView(), layoutparams);
                    }
                    cellView.getContentView().setVisibility(0);
                    cellView.getContentView().setLayoutParams(layoutparams);
                    cellView.getContentView().setOnClickListener(new android.view.View.OnClickListener() {

                        final StaggeredGridView this$0;
                        final StaggeredGridCellView val$cellView;

                        public void onClick(View view)
                        {
                            alertListenerOnClickView(cellView);
                        }

            
            {
                this$0 = StaggeredGridView.this;
                cellView = staggeredgridcellview;
                super();
            }
                    });
                    cellView.getContentView().setOnLongClickListener(new android.view.View.OnLongClickListener() {

                        final StaggeredGridView this$0;
                        final StaggeredGridCellView val$cellView;

                        public boolean onLongClick(View view)
                        {
                            return alertListenerOnLongClickView(cellView);
                        }

            
            {
                this$0 = StaggeredGridView.this;
                cellView = staggeredgridcellview;
                super();
            }
                    });
                    visibleViews.put(j, cellView);
                } else
                if (flag)
                {
                    cellView.setIndex(j);
                    if (((android.widget.FrameLayout.LayoutParams)cellView.getContentView().getLayoutParams()).topMargin != rect.top)
                    {
                        android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(rect.right - rect.left, rect.bottom - rect.top);
                        layoutparams1.gravity = 48;
                        layoutparams1.topMargin = rect.top;
                        layoutparams1.leftMargin = rect.left;
                        cellView.getContentView().setLayoutParams(layoutparams1);
                    }
                }
            }
            j++;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void addColumnSpanningView(View view, int i)
    {
        int j = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, i);
        layoutparams.gravity = 48;
        layoutparams.topMargin = totalContentHeight;
        layoutparams.leftMargin = 0;
        scrollViewContentHolder.addView(view, layoutparams);
        int k = totalContentHeight + i + verticalMargin;
        for (i = 0; i < numColumns; i++)
        {
            columnHeights.set(i, Integer.valueOf(k));
        }

        totalContentHeight = k;
        scrollViewContentHolder.setLayoutParams(new android.widget.LinearLayout.LayoutParams(j, k));
        recycleRunnable.run();
    }

    public void addFooterView(View view)
    {
        removeFooterView();
        scrollViewContent.addView(view);
        footer = view;
    }

    public void addHeaderView(View view)
    {
        removeHeaderView();
        int i = 0;
        if (specialHeader != null)
        {
            int j = scrollViewContent.indexOfChild(specialHeader);
            i = j;
            if (j == -1)
            {
                i = 0;
            }
        }
        scrollViewContent.addView(view, i);
        header = view;
    }

    public void addSpecialHeaderView(View view)
    {
        removeSpecialHeaderView();
        scrollViewContent.addView(view, 0);
        specialHeader = view;
    }

    public StaggeredGridCellView dequeueView(String s)
    {
        Object obj = null;
        ArrayList arraylist = (ArrayList)reusableViews.get(s);
        s = obj;
        if (arraylist != null)
        {
            s = obj;
            if (arraylist.size() > 0)
            {
                s = (StaggeredGridCellView)arraylist.remove(0);
            }
        }
        return s;
    }

    public void forceAlternatingColumns()
    {
        forceAlternatingColumns = true;
    }

    public int getColumnWidth()
    {
        return columnWidth;
    }

    public int getContentHeight()
    {
        return totalContentHeight;
    }

    public View getHeaderView()
    {
        return header;
    }

    public View getSpecialHeaderView()
    {
        return specialHeader;
    }

    public SparseArray getVisibleViews()
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

    public boolean isInEditMode()
    {
        return inEditMode;
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        alertListenerOnScrollChanged(j, j - l);
        post(recycleRunnable);
    }

    public void releaseImages()
    {
        int j = visibleViews.size();
        for (int i = 0; i < j; i++)
        {
            ((StaggeredGridCellView)visibleViews.valueAt(i)).releaseImages();
        }

    }

    public void reloadData()
    {
        if (adapter == null)
        {
            return;
        }
        int k = visibleViews.size();
        for (int i = 0; i < k; i++)
        {
            enqueueView((StaggeredGridCellView)visibleViews.valueAt(i));
        }

        visibleViews.clear();
        columnHeights.clear();
        indexRectMapping.clear();
        lastColumnIndex = -1;
        orientation = getContext().getResources().getConfiguration().orientation;
        int j;
        if (orientation == 2)
        {
            numColumns = adapter.getNumColumnsInLandscape();
        } else
        {
            numColumns = adapter.getNumColumnsInPortrait();
        }
        for (j = 0; j < numColumns; j++)
        {
            columnHeights.add(Integer.valueOf(verticalMargin));
        }

        displayWidth = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
        if (adapter.overrideScreenWidth())
        {
            displayWidth = adapter.getScreenWidthOverride();
        }
        columnWidth = (displayWidth - (numColumns + 1) * horizontalMargin) / numColumns;
        addCells(0);
    }

    public void removeCell(int i)
    {
        Rect rect = (Rect)indexRectMapping.get(i);
        int l = (rect.bottom - rect.top) + verticalMargin;
        for (int j = 0; j < numColumns; j++)
        {
            if (columnWidth * j + (j + 1) * horizontalMargin == rect.left)
            {
                int j1 = ((Integer)columnHeights.get(j)).intValue();
                columnHeights.set(j, Integer.valueOf(j1 - l));
            }
        }

        StaggeredGridCellView staggeredgridcellview = (StaggeredGridCellView)visibleViews.get(i);
        if (staggeredgridcellview != null)
        {
            visibleViews.remove(i);
            enqueueView(staggeredgridcellview);
        }
        int k = indexRectMapping.size();
        indexRectMapping.remove(i);
        i++;
        while (i < k) 
        {
            Object obj = (Rect)indexRectMapping.get(i);
            if (obj != null)
            {
                if (((Rect) (obj)).left == rect.left)
                {
                    obj.top = ((Rect) (obj)).top - l;
                    obj.bottom = ((Rect) (obj)).bottom - l;
                }
                indexRectMapping.remove(i);
                indexRectMapping.put(i - 1, obj);
                obj = (StaggeredGridCellView)visibleViews.get(i);
                if (obj != null)
                {
                    visibleViews.remove(i);
                    visibleViews.put(i - 1, obj);
                }
            }
            i++;
        }
        int l1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getWidth();
        k = 0;
        for (i = 0; i < numColumns;)
        {
            int k1 = ((Integer)columnHeights.get(i)).intValue();
            int i1 = k;
            if (k < k1)
            {
                i1 = k1;
            }
            i++;
            k = i1;
        }

        totalContentHeight = k;
        scrollViewContentHolder.setLayoutParams(new android.widget.LinearLayout.LayoutParams(l1, k));
        recycleRunnable.run();
    }

    public void removeFooterView()
    {
        if (footer != null)
        {
            scrollViewContent.removeView(footer);
        }
    }

    public void removeHeaderView()
    {
        if (header != null)
        {
            scrollViewContent.removeView(header);
        }
    }

    public void removeSpecialHeaderView()
    {
        if (specialHeader != null)
        {
            scrollViewContent.removeView(specialHeader);
        }
    }

    public void restoreImages()
    {
        int j = visibleViews.size();
        for (int i = 0; i < j; i++)
        {
            ((StaggeredGridCellView)visibleViews.valueAt(i)).restoreImages();
        }

    }

    public void setAdapter(StaggeredGridViewAdapter staggeredgridviewadapter)
    {
        adapter = staggeredgridviewadapter;
    }

    public void setClipChildren(boolean flag)
    {
        scrollViewContentHolder.setClipChildren(flag);
    }

    public void setEditModeEnabled(boolean flag)
    {
        inEditMode = flag;
        int j = visibleViews.size();
        for (int i = 0; i < j; i++)
        {
            ((StaggeredGridCellView)visibleViews.valueAt(i)).setEditModeEnabled(flag);
        }

    }

    public void setHorizontalMargin(int i)
    {
        horizontalMargin = (int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    public void setListener(StaggeredGridViewListener staggeredgridviewlistener)
    {
        listenerReference = new WeakReference(staggeredgridviewlistener);
    }

    public void setScrollPosition(int i)
    {
        scrollPositionOverride = i;
    }

    public void setVerticalMargin(int i)
    {
        verticalMargin = (int)TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }




}
