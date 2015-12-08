// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;


// Referenced classes of package com.google.common.reflect:
//            TypeToken

private static class delegate extends delegate
{

    private final delegate _flddelegate;

    Iterable getInterfaces(Object obj)
    {
        return _flddelegate._mthdelegate(obj);
    }

    Class getRawType(Object obj)
    {
        return _flddelegate._mthdelegate(obj);
    }

    Object getSuperclass(Object obj)
    {
        return _flddelegate._mthdelegate(obj);
    }

    ( )
    {
        super(null);
        _flddelegate = ;
    }
}
