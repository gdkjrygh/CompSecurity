// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls.attribute;

import com.vladium.jcd.compiler.IClassFormatOutput;

public interface IDeclaredExceptionTable
    extends Cloneable, IClassFormatOutput
{

    public abstract int add(int i);

    public abstract Object clone();

    public abstract int get(int i);

    public abstract long length();

    public abstract int set(int i, int j);

    public abstract int size();
}
