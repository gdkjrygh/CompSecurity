// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


public class ClassLoadContext
{

    private final Class m_caller;

    ClassLoadContext(Class class1)
    {
        m_caller = class1;
    }

    public final Class getCallerClass()
    {
        return m_caller;
    }
}
