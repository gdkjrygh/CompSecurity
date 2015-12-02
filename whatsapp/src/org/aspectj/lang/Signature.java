// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;


public interface Signature
{

    public abstract Class getDeclaringType();

    public abstract String getDeclaringTypeName();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract String toLongString();

    public abstract String toShortString();

    public abstract String toString();
}
