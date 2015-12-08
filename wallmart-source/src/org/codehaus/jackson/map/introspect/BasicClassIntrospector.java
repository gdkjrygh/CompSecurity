// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Map;
import org.codehaus.jackson.map.BeanDescription;
import org.codehaus.jackson.map.ClassIntrospector;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.MapperConfig;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.type.SimpleType;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            AnnotatedClass, BasicBeanDescription, POJOPropertiesCollector, MethodFilter

public class BasicClassIntrospector extends ClassIntrospector
{
    public static class GetterMethodFilter
        implements MethodFilter
    {

        public boolean includeMethod(Method method)
        {
            return ClassUtil.hasGetterSignature(method);
        }

        private GetterMethodFilter()
        {
        }

    }

    private static class MinimalMethodFilter
        implements MethodFilter
    {

        public boolean includeMethod(Method method)
        {
            while (Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length > 2) 
            {
                return false;
            }
            return true;
        }

        private MinimalMethodFilter()
        {
        }

    }

    public static final class SetterAndGetterMethodFilter extends SetterMethodFilter
    {

        public boolean includeMethod(Method method)
        {
            if (!super.includeMethod(method))
            {
                if (!ClassUtil.hasGetterSignature(method))
                {
                    return false;
                }
                method = method.getReturnType();
                if (!java/util/Collection.isAssignableFrom(method) && !java/util/Map.isAssignableFrom(method))
                {
                    return false;
                }
            }
            return true;
        }

        public SetterAndGetterMethodFilter()
        {
        }
    }

    public static class SetterMethodFilter
        implements MethodFilter
    {

        public boolean includeMethod(Method method)
        {
            if (Modifier.isStatic(method.getModifiers()))
            {
                return false;
            }
            switch (method.getParameterTypes().length)
            {
            default:
                return false;

            case 1: // '\001'
                return true;

            case 2: // '\002'
                return true;
            }
        }

        public SetterMethodFilter()
        {
        }
    }


    protected static final BasicBeanDescription BOOLEAN_DESC;
    public static final GetterMethodFilter DEFAULT_GETTER_FILTER = new GetterMethodFilter();
    public static final SetterAndGetterMethodFilter DEFAULT_SETTER_AND_GETTER_FILTER = new SetterAndGetterMethodFilter();
    public static final SetterMethodFilter DEFAULT_SETTER_FILTER = new SetterMethodFilter();
    protected static final BasicBeanDescription INT_DESC;
    protected static final BasicBeanDescription LONG_DESC;
    protected static final MethodFilter MINIMAL_FILTER = new MinimalMethodFilter();
    protected static final BasicBeanDescription STRING_DESC;
    public static final BasicClassIntrospector instance = new BasicClassIntrospector();

    public BasicClassIntrospector()
    {
    }

    protected BasicBeanDescription _findCachedDesc(JavaType javatype)
    {
        javatype = javatype.getRawClass();
        if (javatype == java/lang/String)
        {
            return STRING_DESC;
        }
        if (javatype == Boolean.TYPE)
        {
            return BOOLEAN_DESC;
        }
        if (javatype == Integer.TYPE)
        {
            return INT_DESC;
        }
        if (javatype == Long.TYPE)
        {
            return LONG_DESC;
        } else
        {
            return null;
        }
    }

    public AnnotatedClass classWithCreators(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        boolean flag = mapperconfig.isAnnotationProcessingEnabled();
        mapperconfig = mapperconfig.getAnnotationIntrospector();
        javatype = javatype.getRawClass();
        if (!flag)
        {
            mapperconfig = null;
        }
        mapperconfig = AnnotatedClass.construct(javatype, mapperconfig, mixinresolver);
        mapperconfig.resolveMemberMethods(MINIMAL_FILTER);
        mapperconfig.resolveCreators(true);
        return mapperconfig;
    }

    public POJOPropertiesCollector collectProperties(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver, boolean flag)
    {
        mixinresolver = classWithCreators(mapperconfig, javatype, mixinresolver);
        mixinresolver.resolveMemberMethods(MINIMAL_FILTER);
        mixinresolver.resolveFields();
        return constructPropertyCollector(mapperconfig, mixinresolver, javatype, flag).collect();
    }

    protected POJOPropertiesCollector constructPropertyCollector(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype, boolean flag)
    {
        return new POJOPropertiesCollector(mapperconfig, flag, javatype, annotatedclass);
    }

    public volatile BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        return forClassAnnotations(mapperconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        boolean flag = mapperconfig.isAnnotationProcessingEnabled();
        org.codehaus.jackson.map.AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
        Class class1 = javatype.getRawClass();
        if (!flag)
        {
            annotationintrospector = null;
        }
        return BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(class1, annotationintrospector, mixinresolver));
    }

    public volatile BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        return forCreation(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false));
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDeserialization(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false));
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDirectClassAnnotations(mapperconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        boolean flag = mapperconfig.isAnnotationProcessingEnabled();
        org.codehaus.jackson.map.AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
        Class class1 = javatype.getRawClass();
        if (!flag)
        {
            annotationintrospector = null;
        }
        return BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.constructWithoutSuperTypes(class1, annotationintrospector, mixinresolver));
    }

    public volatile BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        return forSerialization(serializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, org.codehaus.jackson.map.ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forSerialization(collectProperties(serializationconfig, javatype, mixinresolver, true));
        }
        return basicbeandescription;
    }

    protected MethodFilter getDeserializationMethodFilter(DeserializationConfig deserializationconfig)
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_GETTERS_AS_SETTERS))
        {
            return DEFAULT_SETTER_AND_GETTER_FILTER;
        } else
        {
            return DEFAULT_SETTER_FILTER;
        }
    }

    protected MethodFilter getSerializationMethodFilter(SerializationConfig serializationconfig)
    {
        return DEFAULT_GETTER_FILTER;
    }

    static 
    {
        AnnotatedClass annotatedclass = AnnotatedClass.constructWithoutSuperTypes(java/lang/String, null, null);
        STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(java/lang/String), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Boolean.TYPE, null, null);
        BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Boolean.TYPE), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Integer.TYPE, null, null);
        INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Integer.TYPE), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Long.TYPE, null, null);
        LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Long.TYPE), annotatedclass);
    }
}
