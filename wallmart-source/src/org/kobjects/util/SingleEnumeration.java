// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.util;

import java.util.Enumeration;

public class SingleEnumeration
    implements Enumeration
{

    Object object;

    public SingleEnumeration(Object obj)
    {
        object = obj;
    }

    public boolean hasMoreElements()
    {
        return object != null;
    }

    public Object nextElement()
    {
        Object obj = object;
        object = null;
        return obj;
    }
}
