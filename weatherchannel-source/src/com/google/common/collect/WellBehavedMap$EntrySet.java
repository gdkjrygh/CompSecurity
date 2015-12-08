// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            WellBehavedMap, TransformedIterator, AbstractMapEntry

private final class <init> extends <init>
{

    final WellBehavedMap this$0;

    public Iterator iterator()
    {
        return new TransformedIterator(keySet().iterator()) {

            final WellBehavedMap.EntrySet this$1;

            volatile Object transform(Object obj)
            {
                return transform(obj);
            }

            java.util.Map.Entry transform(Object obj)
            {
                return ((_cls1) (obj)). new AbstractMapEntry() {

                    final _cls1 this$2;
                    final Object val$key;

                    public Object getKey()
                    {
                        return key;
                    }

                    public Object getValue()
                    {
                        return get(key);
                    }

                    public Object setValue(Object obj)
                    {
                        return put(key, obj);
                    }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                };
            }

            
            {
                this$1 = WellBehavedMap.EntrySet.this;
                super(iterator1);
            }
        };
    }

    Map map()
    {
        return WellBehavedMap.this;
    }

    private t>()
    {
        this$0 = WellBehavedMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
