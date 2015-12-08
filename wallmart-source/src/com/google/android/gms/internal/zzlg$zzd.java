// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzlg, zzle

final class mIndex
    implements Iterator, java.util.
{

    int mEnd;
    boolean mEntryValid;
    int mIndex;
    final zzlg zzaeH;

    public final boolean equals(Object obj)
    {
        boolean flag = true;
        if (!mEntryValid)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.))
        {
            return false;
        }
        obj = (java.util.)obj;
        if (!zzle.equal(((java.util.) (obj)).getKey(), zzaeH.colGetEntry(mIndex, 0)) || !zzle.equal(((java.util.) (obj)).getValue(), zzaeH.colGetEntry(mIndex, 1)))
        {
            flag = false;
        }
        return flag;
    }

    public Object getKey()
    {
        if (!mEntryValid)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return zzaeH.colGetEntry(mIndex, 0);
        }
    }

    public Object getValue()
    {
        if (!mEntryValid)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return zzaeH.colGetEntry(mIndex, 1);
        }
    }

    public boolean hasNext()
    {
        return mIndex < mEnd;
    }

    public final int hashCode()
    {
        int j = 0;
        if (!mEntryValid)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object obj = zzaeH.colGetEntry(mIndex, 0);
        Object obj1 = zzaeH.colGetEntry(mIndex, 1);
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    public volatile Object next()
    {
        return next();
    }

    public java.util. next()
    {
        mIndex = mIndex + 1;
        mEntryValid = true;
        return this;
    }

    public void remove()
    {
        if (!mEntryValid)
        {
            throw new IllegalStateException();
        } else
        {
            zzaeH.colRemoveAt(mIndex);
            mIndex = mIndex - 1;
            mEnd = mEnd - 1;
            mEntryValid = false;
            return;
        }
    }

    public Object setValue(Object obj)
    {
        if (!mEntryValid)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return zzaeH.colSetValue(mIndex, obj);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
    }

    (zzlg zzlg1)
    {
        zzaeH = zzlg1;
        super();
        mEntryValid = false;
        mEnd = zzlg1.colGetSize() - 1;
        mIndex = -1;
    }
}
