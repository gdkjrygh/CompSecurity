// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static class mAttachCount
{

    private static final int DEFAULT_MAX_SCRAP = 5;
    private int mAttachCount;
    private SparseIntArray mMaxScrap;
    private SparseArray mScrap;

    private ArrayList getScrapHeapForType(int i)
    {
        ArrayList arraylist1 = (ArrayList)mScrap.get(i);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            ArrayList arraylist2 = new ArrayList();
            mScrap.put(i, arraylist2);
            arraylist = arraylist2;
            if (mMaxScrap.indexOfKey(i) < 0)
            {
                mMaxScrap.put(i, 5);
                arraylist = arraylist2;
            }
        }
        return arraylist;
    }

    void attach(mMaxScrap mmaxscrap)
    {
        mAttachCount = mAttachCount + 1;
    }

    public void clear()
    {
        mScrap.clear();
    }

    void detach()
    {
        mAttachCount = mAttachCount - 1;
    }

    public mAttachCount getRecycledView(int i)
    {
        ArrayList arraylist = (ArrayList)mScrap.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            mAttachCount mattachcount = (mScrap)arraylist.get(i);
            arraylist.remove(i);
            return mattachcount;
        } else
        {
            return null;
        }
    }

    void onAdapterChanged(mScrap mscrap, mScrap mscrap1, boolean flag)
    {
        if (mscrap != null)
        {
            detach();
        }
        if (!flag && mAttachCount == 0)
        {
            clear();
        }
        if (mscrap1 != null)
        {
            attach(mscrap1);
        }
    }

    public void putRecycledView(attach attach1)
    {
        int i = attach1.mViewType();
        ArrayList arraylist = getScrapHeapForType(i);
        if (mMaxScrap.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            attach1.nternal();
            arraylist.add(attach1);
            return;
        }
    }

    public void setMaxRecycledViews(int i, int j)
    {
        mMaxScrap.put(i, j);
        ArrayList arraylist = (ArrayList)mScrap.get(i);
        if (arraylist != null)
        {
            for (; arraylist.size() > j; arraylist.remove(arraylist.size() - 1)) { }
        }
    }

    int size()
    {
        int j = 0;
        for (int i = 0; i < mScrap.size();)
        {
            ArrayList arraylist = (ArrayList)mScrap.valueAt(i);
            int k = j;
            if (arraylist != null)
            {
                k = j + arraylist.size();
            }
            i++;
            j = k;
        }

        return j;
    }

    public ()
    {
        mScrap = new SparseArray();
        mMaxScrap = new SparseIntArray();
        mAttachCount = 0;
    }
}
