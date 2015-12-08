// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.SetBinding;

// Referenced classes of package dagger:
//            ObjectGraph

private static final class  extends BindingsGroup
{

    public Binding contributeSetBinding(String s, SetBinding setbinding)
    {
        throw new IllegalArgumentException("Module overrides cannot contribute set bindings.");
    }

    ()
    {
    }
}
