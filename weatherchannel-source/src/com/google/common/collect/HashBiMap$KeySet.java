// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            HashBiMap

private final class > extends >
{

    final HashBiMap this$0;

    public Iterator iterator()
    {
        return new HashBiMap.Itr() {

            final HashBiMap.KeySet this$1;

            Object output(HashBiMap.BiEntry bientry)
            {
                return bientry.key;
            }

            
            {
                this$1 = HashBiMap.KeySet.this;
                super(this$0);
            }
        };
    }

    public boolean remove(Object obj)
    {
        obj = HashBiMap.access$400(HashBiMap.this, obj, HashBiMap.access$300(obj));
        if (obj == null)
        {
            return false;
        } else
        {
            HashBiMap.access$200(HashBiMap.this, (() (obj)));
            return true;
        }
    }

    this._cls0()
    {
        this$0 = HashBiMap.this;
        super(HashBiMap.this);
    }
}
