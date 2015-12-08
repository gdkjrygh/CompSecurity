// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import java.lang.reflect.Method;

final class c
{

    private final Class a;
    private final Method b;

    private c(Class class1, Method method)
    {
        a = class1;
        b = method;
    }

    c(Class class1, Method method, byte byte0)
    {
        this(class1, method);
    }

    static Class a(c c1)
    {
        return c1.a;
    }

    static Method b(c c1)
    {
        return c1.b;
    }
}
