// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Constraint, MapConstraints, MapConstraint

class val.key
    implements Constraint
{

    final val.key this$0;
    final Object val$key;

    public Object checkElement(Object obj)
    {
        nstraint.checkKeyValue(val$key, obj);
        return obj;
    }

    ()
    {
        this$0 = final_;
        val$key = Object.this;
        super();
    }
}
