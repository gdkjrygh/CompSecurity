// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.common.reflect:
//            TypeResolver

class nit> extends nit>
{

    final solveInternal this$0;
    final solveInternal val$unguarded;
    final TypeVariable val$var;

    public Type resolveInternal(TypeVariable typevariable, nit> nit>)
    {
        if (typevariable.getGenericDeclaration().equals(val$var.getGenericDeclaration()))
        {
            return typevariable;
        } else
        {
            return val$unguarded.solveInternal(typevariable, nit>);
        }
    }

    ()
    {
        this$0 = final_;
        val$var = typevariable;
        val$unguarded = val.unguarded.this;
        super();
    }
}
