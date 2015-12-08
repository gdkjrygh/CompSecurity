// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import java.util.HashMap;

public class defaultValue extends HashMap
{

    private static final long serialVersionUID = 0xdb0b67a42d2495f9L;
    protected Object defaultValue;

    public Object get(Object obj)
    {
        Object obj2 = super.get(obj);
        Object obj1 = obj2;
        if (obj2 == null)
        {
            obj1 = obj2;
            if (!containsKey(obj))
            {
                obj1 = defaultValue;
            }
        }
        return obj1;
    }

    public (Object obj)
    {
        defaultValue = obj;
    }
}
