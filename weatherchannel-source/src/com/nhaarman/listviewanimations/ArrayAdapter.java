// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nhaarman.listviewanimations;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class ArrayAdapter extends BaseAdapter
    implements List, com.nhaarman.listviewanimations.widget.DynamicListView.Swappable, com.nhaarman.listviewanimations.itemmanipulation.AnimateAdditionAdapter.Insertable
{

    private BaseAdapter mDataSetChangedSlavedAdapter;
    protected List mItems;

    public ArrayAdapter()
    {
        this(null);
    }

    public ArrayAdapter(List list)
    {
        this(list, false);
    }

    public ArrayAdapter(List list, boolean flag)
    {
        if (list != null)
        {
            if (flag)
            {
                mItems = new ArrayList(list);
                return;
            } else
            {
                mItems = list;
                return;
            }
        } else
        {
            mItems = new ArrayList();
            return;
        }
    }

    public void add(int i, Object obj)
    {
        mItems.add(i, obj);
        notifyDataSetChanged();
    }

    public boolean add(Object obj)
    {
        boolean flag = mItems.add(obj);
        notifyDataSetChanged();
        return flag;
    }

    public transient void addAll(int i, Object aobj[])
    {
        for (int j = i; j < aobj.length + i; j++)
        {
            mItems.add(j, aobj[j]);
        }

        notifyDataSetChanged();
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag = mItems.addAll(i, collection);
        notifyDataSetChanged();
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = mItems.addAll(collection);
        notifyDataSetChanged();
        return flag;
    }

    public transient boolean addAll(Object aobj[])
    {
        boolean flag = Collections.addAll(mItems, aobj);
        notifyDataSetChanged();
        return flag;
    }

    public void clear()
    {
        mItems.clear();
        notifyDataSetChanged();
    }

    public boolean contains(Object obj)
    {
        return mItems.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return mItems.containsAll(collection);
    }

    public Object get(int i)
    {
        return mItems.get(i);
    }

    public int getCount()
    {
        return mItems.size();
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int indexOf(Object obj)
    {
        return mItems.indexOf(obj);
    }

    public Iterator iterator()
    {
        return mItems.iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return mItems.lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        return mItems.listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return mItems.listIterator(i);
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        if (mDataSetChangedSlavedAdapter != null)
        {
            mDataSetChangedSlavedAdapter.notifyDataSetChanged();
        }
    }

    public void propagateNotifyDataSetChanged(BaseAdapter baseadapter)
    {
        mDataSetChangedSlavedAdapter = baseadapter;
    }

    public Object remove(int i)
    {
        Object obj = mItems.remove(i);
        notifyDataSetChanged();
        return obj;
    }

    public boolean remove(Object obj)
    {
        boolean flag = mItems.remove(obj);
        notifyDataSetChanged();
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = mItems.removeAll(collection);
        notifyDataSetChanged();
        return flag;
    }

    public Collection removePositions(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        collection = new ArrayList(collection);
        Collections.sort(collection);
        Collections.reverse(collection);
        int i;
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(mItems.remove(i)))
        {
            i = ((Integer)collection.next()).intValue();
        }

        notifyDataSetChanged();
        return arraylist;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag = mItems.retainAll(collection);
        notifyDataSetChanged();
        return flag;
    }

    public Object set(int i, Object obj)
    {
        obj = mItems.set(i, obj);
        notifyDataSetChanged();
        return obj;
    }

    public int size()
    {
        return mItems.size();
    }

    public List subList(int i, int j)
    {
        return mItems.subList(i, j);
    }

    public void swapItems(int i, int j)
    {
        Object obj = getItem(i);
        set(i, getItem(j));
        set(j, obj);
    }

    public Object[] toArray()
    {
        return mItems.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return mItems.toArray(aobj);
    }
}
