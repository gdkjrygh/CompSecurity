// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor

public final class ConstructorConstructor
{

    private final Map instanceCreators;

    public ConstructorConstructor(Map map)
    {
        instanceCreators = map;
    }

    private ObjectConstructor newDefaultConstructor(final Class constructor)
    {
        try
        {
            constructor = constructor.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible())
            {
                constructor.setAccessible(true);
            }
            constructor = new _cls3();
        }
        // Misplaced declaration of an exception variable
        catch (final Class constructor)
        {
            return null;
        }
        return constructor;
    }

    private ObjectConstructor newDefaultImplementationConstructor(final Type type, Class class1)
    {
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (java/util/SortedSet.isAssignableFrom(class1))
            {
                return new _cls4();
            }
            if (java/util/EnumSet.isAssignableFrom(class1))
            {
                return new _cls5();
            }
            if (java/util/Set.isAssignableFrom(class1))
            {
                return new _cls6();
            }
            if (java/util/Queue.isAssignableFrom(class1))
            {
                return new _cls7();
            } else
            {
                return new _cls8();
            }
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (java/util/SortedMap.isAssignableFrom(class1))
            {
                return new _cls9();
            }
            if ((type instanceof ParameterizedType) && !java/lang/String.isAssignableFrom(TypeToken.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
            {
                return new _cls10();
            } else
            {
                return new _cls11();
            }
        } else
        {
            return null;
        }
    }

    private ObjectConstructor newUnsafeAllocator(final Type type, final Class rawType)
    {
        return new _cls12();
    }

    public ObjectConstructor get(final TypeToken typeCreator)
    {
        final Type type = typeCreator.getType();
        Class class1 = typeCreator.getRawType();
        typeCreator = (InstanceCreator)instanceCreators.get(type);
        if (typeCreator != null)
        {
            typeCreator = new _cls1();
        } else
        {
            typeCreator = (InstanceCreator)instanceCreators.get(class1);
            if (typeCreator != null)
            {
                return new _cls2();
            }
            ObjectConstructor objectconstructor = newDefaultConstructor(class1);
            typeCreator = objectconstructor;
            if (objectconstructor == null)
            {
                ObjectConstructor objectconstructor1 = newDefaultImplementationConstructor(type, class1);
                typeCreator = objectconstructor1;
                if (objectconstructor1 == null)
                {
                    return newUnsafeAllocator(type, class1);
                }
            }
        }
        return typeCreator;
    }

    public String toString()
    {
        return instanceCreators.toString();
    }

    private class _cls3
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;
        final Constructor val$constructor;

        public Object construct()
        {
            Object obj;
            try
            {
                obj = constructor.newInstance(null);
            }
            catch (InstantiationException instantiationexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(constructor).append(" with no args").toString(), instantiationexception);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(constructor).append(" with no args").toString(), invocationtargetexception.getTargetException());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new AssertionError(illegalaccessexception);
            }
            return obj;
        }

        _cls3()
        {
            this$0 = ConstructorConstructor.this;
            constructor = constructor1;
            super();
        }
    }


    private class _cls4
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new TreeSet();
        }

        _cls4()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls5
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;
        final Type val$type;

        public Object construct()
        {
            if (type instanceof ParameterizedType)
            {
                Type type1 = ((ParameterizedType)type).getActualTypeArguments()[0];
                if (type1 instanceof Class)
                {
                    return EnumSet.noneOf((Class)type1);
                } else
                {
                    throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(type.toString()).toString());
                }
            } else
            {
                throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(type.toString()).toString());
            }
        }

        _cls5()
        {
            this$0 = ConstructorConstructor.this;
            type = type1;
            super();
        }
    }


    private class _cls6
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new LinkedHashSet();
        }

        _cls6()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls7
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new LinkedList();
        }

        _cls7()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls8
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new ArrayList();
        }

        _cls8()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls9
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new TreeMap();
        }

        _cls9()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls10
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new LinkedHashMap();
        }

        _cls10()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls11
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;

        public Object construct()
        {
            return new LinkedTreeMap();
        }

        _cls11()
        {
            this$0 = ConstructorConstructor.this;
            super();
        }
    }


    private class _cls12
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;
        private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
        final Class val$rawType;
        final Type val$type;

        public Object construct()
        {
            Object obj;
            try
            {
                obj = unsafeAllocator.newInstance(rawType);
            }
            catch (Exception exception)
            {
                throw new RuntimeException((new StringBuilder()).append("Unable to invoke no-args constructor for ").append(type).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), exception);
            }
            return obj;
        }

        _cls12()
        {
            this$0 = ConstructorConstructor.this;
            rawType = class1;
            type = type1;
            super();
        }
    }


    private class _cls1
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;
        final Type val$type;
        final InstanceCreator val$typeCreator;

        public Object construct()
        {
            return typeCreator.createInstance(type);
        }

        _cls1()
        {
            this$0 = ConstructorConstructor.this;
            typeCreator = instancecreator;
            type = type1;
            super();
        }
    }


    private class _cls2
        implements ObjectConstructor
    {

        final ConstructorConstructor this$0;
        final InstanceCreator val$rawTypeCreator;
        final Type val$type;

        public Object construct()
        {
            return rawTypeCreator.createInstance(type);
        }

        _cls2()
        {
            this$0 = ConstructorConstructor.this;
            rawTypeCreator = instancecreator;
            type = type1;
            super();
        }
    }

}
