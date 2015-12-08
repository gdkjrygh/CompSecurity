// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.FailoverLoader;
import dagger.internal.Keys;
import dagger.internal.Linker;
import dagger.internal.Loader;
import dagger.internal.ModuleAdapter;
import dagger.internal.Modules;
import dagger.internal.ProblemDetector;
import dagger.internal.SetBinding;
import dagger.internal.StaticInjection;
import dagger.internal.ThrowingErrorHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class ObjectGraph
{
    static class DaggerObjectGraph extends ObjectGraph
    {

        private final DaggerObjectGraph base;
        private final Map injectableTypes;
        private final Linker linker;
        private final Loader plugin;
        private final List setBindings;
        private final Map staticInjections;

        private static Object checkNotNull(Object obj, String s)
        {
            if (obj == null)
            {
                throw new NullPointerException(s);
            } else
            {
                return obj;
            }
        }

        private Binding getInjectableTypeBinding(ClassLoader classloader, String s, String s1)
        {
            Class class1;
            class1 = null;
            DaggerObjectGraph daggerobjectgraph = this;
label0:
            do
            {
label1:
                {
                    if (daggerobjectgraph != null)
                    {
                        class1 = (Class)daggerobjectgraph.injectableTypes.get(s);
                        if (class1 == null)
                        {
                            break label1;
                        }
                    }
                    if (class1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("No inject registered for ").append(s).append(". You must explicitly add it to the 'injects' option in one of your modules.").toString());
                    }
                    break label0;
                }
                daggerobjectgraph = daggerobjectgraph.base;
            } while (true);
            Linker linker1 = linker;
            linker1;
            JVM INSTR monitorenter ;
            Binding binding = linker.requestBinding(s1, class1, classloader, false, true);
            if (binding == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            s = binding;
            if (binding.isLinked())
            {
                break MISSING_BLOCK_LABEL_140;
            }
            linker.linkRequested();
            s = linker.requestBinding(s1, class1, classloader, false, true);
            linker1;
            JVM INSTR monitorexit ;
            return s;
            classloader;
            linker1;
            JVM INSTR monitorexit ;
            throw classloader;
        }

        private Map linkEverything()
        {
            Map map = linker.fullyLinkedBindings();
            if (map != null)
            {
                return map;
            }
            Linker linker1 = linker;
            linker1;
            JVM INSTR monitorenter ;
            Map map1 = linker.fullyLinkedBindings();
            if (map1 == null)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            linker1;
            JVM INSTR monitorexit ;
            return map1;
            linkStaticInjections();
            linkInjectableTypes();
            map1 = linker.linkAll();
            linker1;
            JVM INSTR monitorexit ;
            return map1;
            Exception exception;
            exception;
            linker1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void linkInjectableTypes()
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = injectableTypes.entrySet().iterator(); iterator.hasNext(); linker.requestBinding((String)entry.getKey(), entry.getValue(), ((Class)entry.getValue()).getClassLoader(), false, true))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }

        private void linkStaticInjections()
        {
            StaticInjection staticinjection;
            for (Iterator iterator = staticInjections.entrySet().iterator(); iterator.hasNext(); staticinjection.attach(linker))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                StaticInjection staticinjection1 = (StaticInjection)entry.getValue();
                staticinjection = staticinjection1;
                if (staticinjection1 == null)
                {
                    staticinjection = plugin.getStaticInjection((Class)entry.getKey());
                    entry.setValue(staticinjection);
                }
            }

        }

        private static transient ObjectGraph makeGraph(DaggerObjectGraph daggerobjectgraph, Loader loader, Object aobj[])
        {
            StandardBindings standardbindings;
            OverridesBindings overridesbindings;
            LinkedHashMap linkedhashmap;
            LinkedHashMap linkedhashmap1;
            ModuleAdapter moduleadapter;
            java.util.Map.Entry entry;
            linkedhashmap = new LinkedHashMap();
            linkedhashmap1 = new LinkedHashMap();
            Iterator iterator;
            int i;
            if (daggerobjectgraph == null)
            {
                standardbindings = new StandardBindings();
            } else
            {
                standardbindings = new StandardBindings(daggerobjectgraph.setBindings);
            }
            overridesbindings = new OverridesBindings();
            iterator = Modules.loadModules(loader, aobj).entrySet().iterator();
_L2:
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            entry = (java.util.Map.Entry)iterator.next();
            moduleadapter = (ModuleAdapter)entry.getKey();
            for (i = 0; i < moduleadapter.injectableTypes.length; i++)
            {
                linkedhashmap.put(moduleadapter.injectableTypes[i], moduleadapter.moduleClass);
            }

            for (int j = 0; j < moduleadapter.staticInjections.length; j++)
            {
                linkedhashmap1.put(moduleadapter.staticInjections[j], null);
            }

            if (moduleadapter.overrides)
            {
                aobj = overridesbindings;
            } else
            {
                aobj = standardbindings;
            }
            try
            {
                moduleadapter.getBindings(((BindingsGroup) (aobj)), entry.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (DaggerObjectGraph daggerobjectgraph)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(moduleadapter.moduleClass.getSimpleName()).append(": ").append(daggerobjectgraph.getMessage()).toString(), daggerobjectgraph);
            }
            if (true) goto _L2; else goto _L1
_L1:
            if (daggerobjectgraph != null)
            {
                aobj = daggerobjectgraph.linker;
            } else
            {
                aobj = null;
            }
            aobj = new Linker(((Linker) (aobj)), loader, new ThrowingErrorHandler());
            ((Linker) (aobj)).installBindings(standardbindings);
            ((Linker) (aobj)).installBindings(overridesbindings);
            return new DaggerObjectGraph(daggerobjectgraph, ((Linker) (aobj)), loader, linkedhashmap1, linkedhashmap, standardbindings.setBindings);
        }

        public Object get(Class class1)
        {
            String s1 = Keys.get(class1);
            String s;
            if (class1.isInterface())
            {
                s = s1;
            } else
            {
                s = Keys.getMembersKey(class1);
            }
            return getInjectableTypeBinding(class1.getClassLoader(), s, s1).get();
        }

        public Object inject(Object obj)
        {
            String s = Keys.getMembersKey(obj.getClass());
            getInjectableTypeBinding(obj.getClass().getClassLoader(), s, s).injectMembers(obj);
            return obj;
        }

        public void injectStatics()
        {
            synchronized (linker)
            {
                linkStaticInjections();
                linker.linkRequested();
                linkStaticInjections();
            }
            for (obj = staticInjections.entrySet().iterator(); ((Iterator) (obj)).hasNext(); ((StaticInjection)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).inject()) { }
            break MISSING_BLOCK_LABEL_76;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public transient ObjectGraph plus(Object aobj[])
        {
            linkEverything();
            return makeGraph(this, plugin, aobj);
        }

        public void validate()
        {
            Map map = linkEverything();
            (new ProblemDetector()).detectProblems(map.values());
        }


        DaggerObjectGraph(DaggerObjectGraph daggerobjectgraph, Linker linker1, Loader loader, Map map, Map map1, List list)
        {
            base = daggerobjectgraph;
            linker = (Linker)checkNotNull(linker1, "linker");
            plugin = (Loader)checkNotNull(loader, "plugin");
            staticInjections = (Map)checkNotNull(map, "staticInjections");
            injectableTypes = (Map)checkNotNull(map1, "injectableTypes");
            setBindings = (List)checkNotNull(list, "setBindings");
        }
    }

    private static final class OverridesBindings extends BindingsGroup
    {

        public Binding contributeSetBinding(String s, SetBinding setbinding)
        {
            throw new IllegalArgumentException("Module overrides cannot contribute set bindings.");
        }

        OverridesBindings()
        {
        }
    }

    private static final class StandardBindings extends BindingsGroup
    {

        private final List setBindings;

        public Binding contributeSetBinding(String s, SetBinding setbinding)
        {
            setBindings.add(setbinding);
            return super.put(s, setbinding);
        }


        public StandardBindings()
        {
            setBindings = new ArrayList();
        }

        public StandardBindings(List list)
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


    ObjectGraph()
    {
    }

    public static transient ObjectGraph create(Object aobj[])
    {
        return DaggerObjectGraph.makeGraph(null, new FailoverLoader(), aobj);
    }

    static transient ObjectGraph createWith(Loader loader, Object aobj[])
    {
        return DaggerObjectGraph.makeGraph(null, loader, aobj);
    }

    public abstract Object get(Class class1);

    public abstract Object inject(Object obj);

    public abstract void injectStatics();

    public transient abstract ObjectGraph plus(Object aobj[]);

    public abstract void validate();
}
