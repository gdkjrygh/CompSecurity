// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Iterator;

// Referenced classes of package android.support.v4.util:
//            MapCollections

final class mSize
    implements Iterator
{

    boolean mCanRemove;
    int mIndex;
    final int mOffset;
    int mSize;
    final MapCollections this$0;

    public boolean hasNext()
    {
        int i;
        int j;
        try
        {
            i = mIndex;
            j = mSize;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i < j;
    }

    public Object next()
    {
        Object obj = colGetEntry(mIndex, mOffset);
        mIndex = mIndex + 1;
        mCanRemove = true;
        return obj;
    }

    public void remove()
    {
        try
        {
            if (!mCanRemove)
            {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        mIndex = mIndex - 1;
        mSize = mSize - 1;
        mCanRemove = false;
        colRemoveAt(mIndex);
    }

    (int i)
    {
        this$0 = MapCollections.this;
        super();
        mCanRemove = false;
        mOffset = i;
        mSize = colGetSize();
    }
}
