// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMultiset, ImmutableList, UnmodifiableIterator, 
//            ImmutableAsList, ImmutableCollection

private final class <init> extends ImmutableSet
{

    private static final long serialVersionUID = 0L;
    final ImmutableMultiset this$0;

    public boolean contains(Object obj)
    {
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((<init>) (obj)).<init>() <= 0 || count(((<init>) (obj)).<init>()) != ((<init>) (obj)).<init>());
        return true;
    }

    ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final ImmutableMultiset.EntrySet this$1;

            ImmutableCollection delegateCollection()
            {
                return ImmutableMultiset.EntrySet.this;
            }

            public Multiset.Entry get(int i)
            {
                return getEntry(i);
            }

            public volatile Object get(int i)
            {
                return get(i);
            }

            
            {
                this$1 = ImmutableMultiset.EntrySet.this;
                super();
            }
        };
    }

    public int hashCode()
    {
        return ImmutableMultiset.this.hashCode();
    }

    boolean isPartialView()
    {
        return ImmutableMultiset.this.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return asList().iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return elementSet().size();
    }

    Object writeReplace()
    {
        return new erializedForm(ImmutableMultiset.this);
    }

    private _cls1.this._cls1()
    {
        this$0 = ImmutableMultiset.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
