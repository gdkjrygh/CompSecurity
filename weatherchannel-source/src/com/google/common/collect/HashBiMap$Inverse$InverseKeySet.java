// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            HashBiMap

private final class this._cls1 extends this._cls1
{

    final _cls1 this$1;

    public Iterator iterator()
    {
        return new HashBiMap.Itr() {

            final HashBiMap.Inverse.InverseKeySet this$2;

            Object output(HashBiMap.BiEntry bientry)
            {
                return bientry.value;
            }

            
            {
                this$2 = HashBiMap.Inverse.InverseKeySet.this;
                super(this$0);
            }
        };
    }

    public boolean remove(Object obj)
    {
        obj = HashBiMap.access$600(_fld1, obj, HashBiMap.access$300(obj));
        if (obj == null)
        {
            return false;
        } else
        {
            HashBiMap.access$200(_fld1, ((_cls1) (obj)));
            return true;
        }
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super(this._cls1.this);
    }
}
