// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzlg

final class etSize
    implements Iterator
{

    boolean mCanRemove;
    int mIndex;
    final int mOffset;
    int mSize;
    final zzlg zzaeH;

    public boolean hasNext()
    {
        return mIndex < mSize;
    }

    public Object next()
    {
        Object obj = zzaeH.colGetEntry(mIndex, mOffset);
        mIndex = mIndex + 1;
        mCanRemove = true;
        return obj;
    }

    public void remove()
    {
        if (!mCanRemove)
        {
            throw new IllegalStateException();
        } else
        {
            mIndex = mIndex - 1;
            mSize = mSize - 1;
            mCanRemove = false;
            zzaeH.colRemoveAt(mIndex);
            return;
        }
    }

    (zzlg zzlg1, int i)
    {
        zzaeH = zzlg1;
        super();
        mCanRemove = false;
        mOffset = i;
        mSize = zzlg1.colGetSize();
    }
}
