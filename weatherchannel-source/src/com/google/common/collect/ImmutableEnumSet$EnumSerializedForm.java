// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.EnumSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableEnumSet

private static class delegate
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final EnumSet _flddelegate;

    Object readResolve()
    {
        return new ImmutableEnumSet(_flddelegate.clone(), null);
    }

    (EnumSet enumset)
    {
        _flddelegate = enumset;
    }
}
