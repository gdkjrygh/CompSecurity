// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, Maps, TransformedIterator, ForwardingMapEntry

private class <init> extends ForwardingSet
{

    final _cls1 this$0;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Set _mthdelegate()
    {
        return ntrySet;
    }

    public Iterator iterator()
    {
        return new TransformedIterator(ntrySet.iterator()) {

            final Maps.FilteredEntryMap.EntrySet this$1;

            volatile Object transform(Object obj)
            {
                return transform((java.util.Map.Entry)obj);
            }

            java.util.Map.Entry transform(java.util.Map.Entry entry)
            {
                return entry. new ForwardingMapEntry() {

                    final _cls1 this$2;
                    final java.util.Map.Entry val$entry;

                    protected volatile Object _mthdelegate()
                    {
                        return _mthdelegate();
                    }

                    protected java.util.Map.Entry _mthdelegate()
                    {
                        return entry;
                    }

                    public Object setValue(Object obj)
                    {
                        Preconditions.checkArgument(apply(getKey(), obj));
                        return super.setValue(obj);
                    }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                };
            }

            
            {
                this$1 = Maps.FilteredEntryMap.EntrySet.this;
                super(iterator1);
            }
        };
    }

    private _cls1.this._cls1()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
