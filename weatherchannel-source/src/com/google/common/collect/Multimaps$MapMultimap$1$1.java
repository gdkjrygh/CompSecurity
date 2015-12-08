// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Multimaps, CollectPreconditions

class this._cls1
    implements Iterator
{

    int i;
    final l.key this$1;

    public boolean hasNext()
    {
        return i == 0 && _fld0.i.containsKey(key);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            i = i + 1;
            return _fld0.i.get(key);
        }
    }

    public void remove()
    {
        boolean flag = true;
        if (i != 1)
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        i = -1;
        _fld0.i.remove(key);
    }

    init>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Multimaps$MapMultimap$1

/* anonymous class */
    class Multimaps.MapMultimap._cls1 extends Sets.ImprovedAbstractSet
    {

        final Multimaps.MapMultimap this$0;
        final Object val$key;

        public Iterator iterator()
        {
            return new Multimaps.MapMultimap._cls1._cls1();
        }

        public int size()
        {
            return !map.containsKey(key) ? 0 : 1;
        }

            
            {
                this$0 = final_mapmultimap;
                key = Object.this;
                super();
            }
    }

}
