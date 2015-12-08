// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.report;

import java.util.Comparator;

// Referenced classes of package com.vladium.emma.report:
//            IItemAttribute, IItem

private final class <init>
    implements Comparator
{

    final ateID this$0;

    public int compare(Object obj, Object obj1)
    {
        obj = (IItem)obj;
        obj1 = (IItem)obj1;
        double d = ((IItem) (obj)).getAggregate(eID);
        double d1 = ((IItem) (obj)).getAggregate(ateID);
        double d2 = ((IItem) (obj1)).getAggregate(eID);
        d = d * (double)((IItem) (obj1)).getAggregate(ateID) - d2 * d1;
        if (d > 0.0D)
        {
            return 1;
        }
        return d >= 0.0D ? 0 : -1;
    }

    private Y()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
