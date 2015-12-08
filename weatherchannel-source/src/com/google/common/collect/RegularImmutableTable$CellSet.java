// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, RegularImmutableTable, ImmutableList, UnmodifiableIterator, 
//            ImmutableAsList, ImmutableCollection

private final class <init> extends ImmutableSet
{

    final RegularImmutableTable this$0;

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            Object obj1 = get(((<init>) (obj)).<init>(), ((<init>) (obj)).<init>());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((<init>) (obj)).<init>()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final RegularImmutableTable.CellSet this$1;

            ImmutableCollection delegateCollection()
            {
                return RegularImmutableTable.CellSet.this;
            }

            public Table.Cell get(int i)
            {
                return getCell(i);
            }

            public volatile Object get(int i)
            {
                return get(i);
            }

            
            {
                this$1 = RegularImmutableTable.CellSet.this;
                super();
            }
        };
    }

    boolean isPartialView()
    {
        return false;
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
        return RegularImmutableTable.this.size();
    }

    private _cls1.this._cls1()
    {
        this$0 = RegularImmutableTable.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
