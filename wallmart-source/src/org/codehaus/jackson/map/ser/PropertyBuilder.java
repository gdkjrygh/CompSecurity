// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.map.util.Comparators;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanPropertyWriter, BeanSerializerFactory

public class PropertyBuilder
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BasicBeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion _outputProps;

    public PropertyBuilder(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription)
    {
        _config = serializationconfig;
        _beanDesc = basicbeandescription;
        _outputProps = basicbeandescription.findSerializationInclusion(serializationconfig.getSerializationInclusion());
        _annotationIntrospector = _config.getAnnotationIntrospector();
    }

    protected Object _throwWrapped(Exception exception, String s, Object obj)
    {
        for (; exception.getCause() != null; exception = exception.getCause()) { }
        if (exception instanceof Error)
        {
            throw (Error)exception;
        }
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to get property '").append(s).append("' of default ").append(obj.getClass().getName()).append(" instance").toString());
        }
    }

    protected BeanPropertyWriter buildWriter(String s, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, TypeSerializer typeserializer1, AnnotatedMember annotatedmember, boolean flag)
    {
        Method method;
        Field field;
        JavaType javatype1;
        Object obj;
        org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion;
        boolean flag1;
        boolean flag2;
        if (annotatedmember instanceof AnnotatedField)
        {
            method = null;
            field = ((AnnotatedField)annotatedmember).getAnnotated();
        } else
        {
            method = ((AnnotatedMethod)annotatedmember).getAnnotated();
            field = null;
        }
        obj = findSerializationType(annotatedmember, flag, javatype);
        javatype1 = ((JavaType) (obj));
        if (typeserializer1 != null)
        {
            javatype1 = ((JavaType) (obj));
            if (obj == null)
            {
                javatype1 = javatype;
            }
            if (javatype1.getContentType() == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Problem trying to create BeanPropertyWriter for property '").append(s).append("' (of type ").append(_beanDesc.getType()).append("); serialization type ").append(javatype1).append(" has no content").toString());
            }
            javatype1 = javatype1.withContentTypeHandler(typeserializer1);
            javatype1.getContentType();
        }
        obj = null;
        flag1 = false;
        flag2 = false;
        inclusion = _annotationIntrospector.findSerializationInclusion(annotatedmember, _outputProps);
        flag = flag2;
        typeserializer1 = ((TypeSerializer) (obj));
        if (inclusion == null) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm1 {}

        _cls1..SwitchMap.org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion[inclusion.ordinal()];
        JVM INSTR tableswitch 1 4: default 224
    //                   1 296
    //                   2 355
    //                   3 369
    //                   4 372;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        typeserializer1 = ((TypeSerializer) (obj));
        flag = flag2;
_L2:
        javatype = new BeanPropertyWriter(annotatedmember, _beanDesc.getClassAnnotations(), s, javatype, jsonserializer, typeserializer, javatype1, method, field, flag, typeserializer1);
        jsonserializer = _annotationIntrospector.shouldUnwrapProperty(annotatedmember);
        s = javatype;
        if (jsonserializer != null)
        {
            s = javatype;
            if (jsonserializer.booleanValue())
            {
                s = javatype.unwrappingWriter();
            }
        }
        return s;
_L4:
        obj = getDefaultValue(s, method, field);
        if (obj == null)
        {
            flag = true;
            typeserializer1 = ((TypeSerializer) (obj));
        } else
        {
            flag = flag2;
            typeserializer1 = ((TypeSerializer) (obj));
            if (obj.getClass().isArray())
            {
                typeserializer1 = ((TypeSerializer) (Comparators.getArrayComparator(obj)));
                flag = flag2;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = true;
        typeserializer1 = ((TypeSerializer) (getEmptyValueChecker(s, javatype)));
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = true;
_L7:
        flag = flag1;
        typeserializer1 = ((TypeSerializer) (obj));
        if (javatype.isContainerType())
        {
            typeserializer1 = ((TypeSerializer) (getContainerValueChecker(s, javatype)));
            flag = flag1;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected JavaType findSerializationType(Annotated annotated, boolean flag, JavaType javatype)
    {
        Object obj1 = _annotationIntrospector.findSerializationType(annotated);
        Object obj = javatype;
        boolean flag1;
        if (obj1 != null)
        {
            obj = javatype.getRawClass();
            if (((Class) (obj1)).isAssignableFrom(((Class) (obj))))
            {
                obj = javatype.widenBy(((Class) (obj1)));
            } else
            {
                if (!((Class) (obj)).isAssignableFrom(((Class) (obj1))))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Illegal concrete-type annotation for method '").append(annotated.getName()).append("': class ").append(((Class) (obj1)).getName()).append(" not a super-type of (declared) class ").append(((Class) (obj)).getName()).toString());
                }
                obj = _config.constructSpecializedType(javatype, ((Class) (obj1)));
            }
            flag = true;
        }
        obj1 = BeanSerializerFactory.modifySecondaryTypesByAnnotation(_config, annotated, ((JavaType) (obj)));
        javatype = ((JavaType) (obj));
        if (obj1 != obj)
        {
            flag = true;
            javatype = ((JavaType) (obj1));
        }
        flag1 = flag;
        if (!flag)
        {
            annotated = _annotationIntrospector.findSerializationTyping(annotated);
            flag1 = flag;
            if (annotated != null)
            {
                if (annotated == org.codehaus.jackson.map.annotate.JsonSerialize.Typing.STATIC)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (flag1)
        {
            return javatype;
        } else
        {
            return null;
        }
    }

    public Annotations getClassAnnotations()
    {
        return _beanDesc.getClassAnnotations();
    }

    protected Object getContainerValueChecker(String s, JavaType javatype)
    {
        if (!_config.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_EMPTY_JSON_ARRAYS))
        {
    /* block-local class not found */
    class EmptyArrayChecker {}

            if (javatype.isArrayType())
            {
                return new EmptyArrayChecker();
            }
    /* block-local class not found */
    class EmptyCollectionChecker {}

            if (java/util/Collection.isAssignableFrom(javatype.getRawClass()))
            {
                return new EmptyCollectionChecker();
            }
        }
        return null;
    }

    protected Object getDefaultBean()
    {
        if (_defaultBean == null)
        {
            _defaultBean = _beanDesc.instantiateBean(_config.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS));
            if (_defaultBean == null)
            {
                Class class1 = _beanDesc.getClassInfo().getAnnotated();
                throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation").toString());
            }
        }
        return _defaultBean;
    }

    protected Object getDefaultValue(String s, Method method, Field field)
    {
        Object obj;
        obj = getDefaultBean();
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        return method.invoke(obj, new Object[0]);
        method = ((Method) (field.get(obj)));
        return method;
        method;
        return _throwWrapped(method, s, obj);
    }

    protected Object getEmptyValueChecker(String s, JavaType javatype)
    {
        s = javatype.getRawClass();
    /* block-local class not found */
    class EmptyStringChecker {}

        if (s == java/lang/String)
        {
            return new EmptyStringChecker();
        }
        if (javatype.isArrayType())
        {
            return new EmptyArrayChecker();
        }
        if (java/util/Collection.isAssignableFrom(s))
        {
            return new EmptyCollectionChecker();
        }
    /* block-local class not found */
    class EmptyMapChecker {}

        if (java/util/Map.isAssignableFrom(s))
        {
            return new EmptyMapChecker();
        } else
        {
            return null;
        }
    }
}
