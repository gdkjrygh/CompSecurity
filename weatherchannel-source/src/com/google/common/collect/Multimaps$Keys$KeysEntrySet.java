// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Multimaps, Multimap, Multiset

class this._cls0 extends this._cls0
{

    final nts this$0;

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            Collection collection = (Collection)_fld0.asMap().get(((this._cls0) (obj))._mth0());
            flag = flag1;
            if (collection != null)
            {
                flag = flag1;
                if (collection.size() == ((this._cls0) (obj))._mth0())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean isEmpty()
    {
        return _fld0.isEmpty();
    }

    public Iterator iterator()
    {
        return ();
    }

    Multiset multiset()
    {
        return this._cls0.this;
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            Collection collection = (Collection)_fld0.asMap().get(((this._cls0) (obj))._mth0());
            if (collection != null && collection.size() == ((this._cls0) (obj))._mth0())
            {
                collection.clear();
                return true;
            }
        }
        return false;
    }

    public int size()
    {
        return nts();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
