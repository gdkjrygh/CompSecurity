// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Multimaps, CollectPreconditions

class  extends 
{

    final val.key this$0;
    final Object val$key;

    public Iterator iterator()
    {
        return new Iterator() {

            int i;
            final Multimaps.MapMultimap._cls1 this$1;

            public boolean hasNext()
            {
                return i == 0 && map.containsKey(key);
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    i = i + 1;
                    return map.get(key);
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
                map.remove(key);
            }

            
            {
                this$1 = Multimaps.MapMultimap._cls1.this;
                super();
            }
        };
    }

    public int size()
    {
        return !p.containsKey(val$key) ? 0 : 1;
    }

    _cls1.this._cls1()
    {
        this$0 = final__pcls1;
        val$key = Object.this;
        super();
    }
}
