// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClause;
import org.aspectj.lang.reflect.PerClauseKind;

public class PerClauseImpl
    implements PerClause
{

    private final PerClauseKind kind;

    protected PerClauseImpl(PerClauseKind perclausekind)
    {
        kind = perclausekind;
    }

    public PerClauseKind getKind()
    {
        return kind;
    }

    public String toString()
    {
        return "issingleton()";
    }
}
