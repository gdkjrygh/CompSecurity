// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.TypePattern;
import org.aspectj.lang.reflect.TypePatternBasedPerClause;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PerClauseImpl, TypePatternImpl

public class TypePatternBasedPerClauseImpl extends PerClauseImpl
    implements TypePatternBasedPerClause
{

    private TypePattern typePattern;

    public TypePatternBasedPerClauseImpl(PerClauseKind perclausekind, String s)
    {
        super(perclausekind);
        typePattern = new TypePatternImpl(s);
    }

    public TypePattern getTypePattern()
    {
        return typePattern;
    }

    public String toString()
    {
        return (new StringBuilder()).append("pertypewithin(").append(typePattern.asString()).append(")").toString();
    }
}
