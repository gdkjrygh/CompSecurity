// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.browsepersonalization;

import java.util.Iterator;

// Referenced classes of package com.walmart.android.service.browsepersonalization:
//            LeafItems

public static class mNextItem
    implements Iterator
{

    private int mInnerIndex;
    private LeafItems mLeafItems[];
    private com.walmart.android.data.afItems mNextItem;
    private int mOuterIndex;

    public boolean hasNext()
    {
        return mNextItem != null;
    }

    public com.walmart.android.data.afItems.LeafItemIterator next()
    {
        com.walmart.android.data.afItems.LeafItemIterator leafitemiterator = mNextItem;
        mNextItem = null;
        int i = mOuterIndex;
        int j = mInnerIndex + 1;
        while (i < mLeafItems.length && mNextItem == null) 
        {
            if (j < mLeafItems[i].items.length)
            {
                mNextItem = mLeafItems[i].items[j];
                mOuterIndex = i;
                mInnerIndex = j;
            } else
            {
                j = 0;
            }
            i++;
        }
        return leafitemiterator;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public (LeafItems aleafitems[])
    {
        mLeafItems = aleafitems;
        if (aleafitems != null && aleafitems.length > 0 && aleafitems[0].items != null && aleafitems[0].items.length > 0)
        {
            mNextItem = aleafitems[0].items[0];
        }
    }
}
