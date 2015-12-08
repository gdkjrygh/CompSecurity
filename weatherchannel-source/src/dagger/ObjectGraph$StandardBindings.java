// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.SetBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package dagger:
//            ObjectGraph

private static final class setBindings extends BindingsGroup
{

    private final List setBindings;

    public Binding contributeSetBinding(String s, SetBinding setbinding)
    {
        setBindings.add(setbinding);
        return super.put(s, setbinding);
    }


    public ()
    {
        setBindings = new ArrayList();
    }

    public setBindings(List list)
    {
        setBindings = new ArrayList(list.size());
        SetBinding setbinding;
        for (list = list.iterator(); list.hasNext(); put(setbinding.provideKey, setbinding))
        {
            setbinding = new SetBinding((SetBinding)list.next());
            setBindings.add(setbinding);
        }

    }
}
