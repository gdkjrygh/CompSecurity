// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.EnumMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableEnumMap

private static class delegate
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final EnumMap _flddelegate;

    Object readResolve()
    {
        return new ImmutableEnumMap(_flddelegate, null);
    }

    (EnumMap enummap)
    {
        _flddelegate = enummap;
    }
}
