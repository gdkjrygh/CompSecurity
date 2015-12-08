// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.internal.loaders.ReflectiveAtInjectBinding;
import dagger.internal.loaders.ReflectiveStaticInjection;

// Referenced classes of package dagger.internal:
//            Loader, Binding, Memoizer, ModuleAdapter, 
//            StaticInjection

public final class FailoverLoader extends Loader
{

    private final Memoizer loadedAdapters = new _cls1();

    public FailoverLoader()
    {
    }

    public Binding getAtInjectBinding(String s, String s1, ClassLoader classloader, boolean flag)
    {
        Binding binding = (Binding)instantiate(s1.concat("$$InjectAdapter"), classloader);
        if (binding != null)
        {
            return binding;
        }
        classloader = loadClass(classloader, s1);
        if (classloader.equals(java/lang/Void))
        {
            throw new IllegalStateException(String.format("Could not load class %s needed for binding %s", new Object[] {
                s1, s
            }));
        }
        if (classloader.isInterface())
        {
            return null;
        } else
        {
            return ReflectiveAtInjectBinding.create(classloader, flag);
        }
    }

    public ModuleAdapter getModuleAdapter(Class class1)
    {
        return (ModuleAdapter)loadedAdapters.get(class1);
    }

    public StaticInjection getStaticInjection(Class class1)
    {
        StaticInjection staticinjection = (StaticInjection)instantiate(class1.getName().concat("$$StaticInjection"), class1.getClassLoader());
        if (staticinjection != null)
        {
            return staticinjection;
        } else
        {
            return ReflectiveStaticInjection.create(class1);
        }
    }

    /* member class not found */
    class _cls1 {}

}
