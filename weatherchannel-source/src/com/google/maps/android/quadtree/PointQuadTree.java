// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PointQuadTree
{
    public static interface Item
    {

        public abstract Point getPoint();
    }


    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final Bounds mBounds;
    private List mChildren;
    private final int mDepth;
    private List mItems;

    public PointQuadTree(double d, double d1, double d2, double d3)
    {
        this(new Bounds(d, d1, d2, d3));
    }

    private PointQuadTree(double d, double d1, double d2, double d3, int i)
    {
        this(new Bounds(d, d1, d2, d3), i);
    }

    public PointQuadTree(Bounds bounds)
    {
        this(bounds, 0);
    }

    private PointQuadTree(Bounds bounds, int i)
    {
        mChildren = null;
        mBounds = bounds;
        mDepth = i;
    }

    private void insert(double d, double d1, Item item)
    {
        if (mChildren == null) goto _L2; else goto _L1
_L1:
        if (d1 >= mBounds.midY) goto _L4; else goto _L3
_L3:
        if (d >= mBounds.midX) goto _L6; else goto _L5
_L5:
        ((PointQuadTree)mChildren.get(0)).insert(d, d1, item);
_L8:
        return;
_L6:
        ((PointQuadTree)mChildren.get(1)).insert(d, d1, item);
        return;
_L4:
        if (d < mBounds.midX)
        {
            ((PointQuadTree)mChildren.get(2)).insert(d, d1, item);
            return;
        } else
        {
            ((PointQuadTree)mChildren.get(3)).insert(d, d1, item);
            return;
        }
_L2:
        if (mItems == null)
        {
            mItems = new ArrayList();
        }
        mItems.add(item);
        if (mItems.size() > 50 && mDepth < 40)
        {
            split();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean remove(double d, double d1, Item item)
    {
        if (mChildren != null)
        {
            if (d1 < mBounds.midY)
            {
                if (d < mBounds.midX)
                {
                    return ((PointQuadTree)mChildren.get(0)).remove(d, d1, item);
                } else
                {
                    return ((PointQuadTree)mChildren.get(1)).remove(d, d1, item);
                }
            }
            if (d < mBounds.midX)
            {
                return ((PointQuadTree)mChildren.get(2)).remove(d, d1, item);
            } else
            {
                return ((PointQuadTree)mChildren.get(3)).remove(d, d1, item);
            }
        } else
        {
            return mItems.remove(item);
        }
    }

    private void search(Bounds bounds, Collection collection)
    {
        if (mBounds.intersects(bounds)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mChildren == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Iterator iterator = mChildren.iterator();
        while (iterator.hasNext()) 
        {
            ((PointQuadTree)iterator.next()).search(bounds, collection);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (mItems != null)
        {
            if (bounds.contains(mBounds))
            {
                collection.addAll(mItems);
                return;
            }
            Iterator iterator1 = mItems.iterator();
            while (iterator1.hasNext()) 
            {
                Item item = (Item)iterator1.next();
                if (bounds.contains(item.getPoint()))
                {
                    collection.add(item);
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void split()
    {
        mChildren = new ArrayList(4);
        mChildren.add(new PointQuadTree(mBounds.minX, mBounds.midX, mBounds.minY, mBounds.midY, mDepth + 1));
        mChildren.add(new PointQuadTree(mBounds.midX, mBounds.maxX, mBounds.minY, mBounds.midY, mDepth + 1));
        mChildren.add(new PointQuadTree(mBounds.minX, mBounds.midX, mBounds.midY, mBounds.maxY, mDepth + 1));
        mChildren.add(new PointQuadTree(mBounds.midX, mBounds.maxX, mBounds.midY, mBounds.maxY, mDepth + 1));
        Object obj = mItems;
        mItems = null;
        Item item;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); insert(item.getPoint().x, item.getPoint().y, item))
        {
            item = (Item)((Iterator) (obj)).next();
        }

    }

    public void add(Item item)
    {
        Point point = item.getPoint();
        if (mBounds.contains(point.x, point.y))
        {
            insert(point.x, point.y, item);
        }
    }

    public void clear()
    {
        mChildren = null;
        if (mItems != null)
        {
            mItems.clear();
        }
    }

    public boolean remove(Item item)
    {
        Point point = item.getPoint();
        if (mBounds.contains(point.x, point.y))
        {
            return remove(point.x, point.y, item);
        } else
        {
            return false;
        }
    }

    public Collection search(Bounds bounds)
    {
        ArrayList arraylist = new ArrayList();
        search(bounds, ((Collection) (arraylist)));
        return arraylist;
    }
}
