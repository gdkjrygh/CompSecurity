// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.TypePattern;

public class TypePatternImpl
    implements TypePattern
{

    private String typePattern;

    public TypePatternImpl(String s)
    {
        typePattern = s;
    }

    public String asString()
    {
        return typePattern;
    }

    public String toString()
    {
        return asString();
    }
}
