// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            MapConstraint, MapConstraints

private static class constraint
    implements MapConstraint
{

    final MapConstraint constraint;

    public void checkKeyValue(Object obj, Object obj1)
    {
        constraint.checkKeyValue(obj1, obj);
    }

    public (MapConstraint mapconstraint)
    {
        constraint = (MapConstraint)Preconditions.checkNotNull(mapconstraint);
    }
}
