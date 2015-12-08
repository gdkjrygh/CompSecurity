// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Objects;
import com.google.common.base.Throwables;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.eventbus:
//            SubscriberFindingStrategy, Subscribe, EventSubscriber, SynchronizedEventSubscriber, 
//            AllowConcurrentEvents

class AnnotatedSubscriberFinder
    implements SubscriberFindingStrategy
{
    private static final class MethodIdentifier
    {

        private final String name;
        private final List parameterTypes;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof MethodIdentifier)
            {
                obj = (MethodIdentifier)obj;
                flag = flag1;
                if (name.equals(((MethodIdentifier) (obj)).name))
                {
                    flag = flag1;
                    if (parameterTypes.equals(((MethodIdentifier) (obj)).parameterTypes))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                name, parameterTypes
            });
        }

        MethodIdentifier(Method method)
        {
            name = method.getName();
            parameterTypes = Arrays.asList(method.getParameterTypes());
        }
    }


    private static final LoadingCache subscriberMethodsCache = CacheBuilder.newBuilder().weakKeys().build(new CacheLoader() {

        public ImmutableList load(Class class1)
            throws Exception
        {
            return AnnotatedSubscriberFinder.getAnnotatedMethodsInternal(class1);
        }

        public volatile Object load(Object obj)
            throws Exception
        {
            return load((Class)obj);
        }

    });

    AnnotatedSubscriberFinder()
    {
    }

    private static ImmutableList getAnnotatedMethods(Class class1)
    {
        try
        {
            class1 = (ImmutableList)subscriberMethodsCache.getUnchecked(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw Throwables.propagate(class1.getCause());
        }
        return class1;
    }

    private static ImmutableList getAnnotatedMethodsInternal(Class class1)
    {
        Object obj = TypeToken.of(class1).getTypes().rawTypes();
        class1 = Maps.newHashMap();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Method amethod[] = ((Class)((Iterator) (obj)).next()).getMethods();
            int j = amethod.length;
            int i = 0;
            while (i < j) 
            {
                Method method = amethod[i];
                if (method.isAnnotationPresent(com/google/common/eventbus/Subscribe) && !method.isBridge())
                {
                    Class aclass[] = method.getParameterTypes();
                    if (aclass.length != 1)
                    {
                        class1 = String.valueOf(String.valueOf(method));
                        i = aclass.length;
                        throw new IllegalArgumentException((new StringBuilder(class1.length() + 128)).append("Method ").append(class1).append(" has @Subscribe annotation, but requires ").append(i).append(" arguments.  Event subscriber methods must require a single argument.").toString());
                    }
                    MethodIdentifier methodidentifier = new MethodIdentifier(method);
                    if (!class1.containsKey(methodidentifier))
                    {
                        class1.put(methodidentifier, method);
                    }
                }
                i++;
            }
        }

        return ImmutableList.copyOf(class1.values());
    }

    private static EventSubscriber makeSubscriber(Object obj, Method method)
    {
        if (methodIsDeclaredThreadSafe(method))
        {
            return new EventSubscriber(obj, method);
        } else
        {
            return new SynchronizedEventSubscriber(obj, method);
        }
    }

    private static boolean methodIsDeclaredThreadSafe(Method method)
    {
        return method.getAnnotation(com/google/common/eventbus/AllowConcurrentEvents) != null;
    }

    public Multimap findAllSubscribers(Object obj)
    {
        HashMultimap hashmultimap = HashMultimap.create();
        Method method;
        for (Iterator iterator = getAnnotatedMethods(obj.getClass()).iterator(); iterator.hasNext(); hashmultimap.put(method.getParameterTypes()[0], makeSubscriber(obj, method)))
        {
            method = (Method)iterator.next();
        }

        return hashmultimap;
    }


}
