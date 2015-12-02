// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;

import org.aspectj.lang.reflect.SourceLocation;

// Referenced classes of package org.aspectj.lang:
//            JoinPoint, Signature

public static interface n
{

    public abstract int getId();

    public abstract String getKind();

    public abstract Signature getSignature();

    public abstract SourceLocation getSourceLocation();

    public abstract String toLongString();

    public abstract String toShortString();

    public abstract String toString();
}
