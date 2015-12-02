// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


public interface SourceLocation
{

    public abstract int getColumn();

    public abstract String getFileName();

    public abstract int getLine();

    public abstract Class getWithinType();
}
