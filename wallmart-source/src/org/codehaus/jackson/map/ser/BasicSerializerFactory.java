// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.TimeZone;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.ContextualSerializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializable;
import org.codehaus.jackson.map.JsonSerializableWithType;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerFactory;
import org.codehaus.jackson.map.Serializers;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ext.OptionalHandlerFactory;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.ser.std.CalendarSerializer;
import org.codehaus.jackson.map.ser.std.DateSerializer;
import org.codehaus.jackson.map.ser.std.EnumMapSerializer;
import org.codehaus.jackson.map.ser.std.EnumSerializer;
import org.codehaus.jackson.map.ser.std.IndexedStringListSerializer;
import org.codehaus.jackson.map.ser.std.InetAddressSerializer;
import org.codehaus.jackson.map.ser.std.JsonValueSerializer;
import org.codehaus.jackson.map.ser.std.MapSerializer;
import org.codehaus.jackson.map.ser.std.NullSerializer;
import org.codehaus.jackson.map.ser.std.ObjectArraySerializer;
import org.codehaus.jackson.map.ser.std.SerializableSerializer;
import org.codehaus.jackson.map.ser.std.SerializableWithTypeSerializer;
import org.codehaus.jackson.map.ser.std.StdContainerSerializers;
import org.codehaus.jackson.map.ser.std.StdJdkSerializers;
import org.codehaus.jackson.map.ser.std.StringCollectionSerializer;
import org.codehaus.jackson.map.ser.std.StringSerializer;
import org.codehaus.jackson.map.ser.std.TimeZoneSerializer;
import org.codehaus.jackson.map.ser.std.ToStringSerializer;
import org.codehaus.jackson.map.ser.std.TokenBufferSerializer;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.EnumValues;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.TokenBuffer;

public abstract class BasicSerializerFactory extends SerializerFactory
{

    protected static final HashMap _arraySerializers;
    protected static final HashMap _concrete;
    protected static final HashMap _concreteLazy;
    protected OptionalHandlerFactory optionalHandlers;

    protected BasicSerializerFactory()
    {
        optionalHandlers = OptionalHandlerFactory.instance;
    }

    protected static JsonSerializer findContentSerializer(SerializationConfig serializationconfig, Annotated annotated, BeanProperty beanproperty)
    {
        Class class1;
label0:
        {
            AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
            Class class2 = annotationintrospector.findContentSerializer(annotated);
            if (class2 != null)
            {
                class1 = class2;
                if (class2 != org/codehaus/jackson/map/JsonSerializer$None)
                {
                    break label0;
                }
            }
            class1 = class2;
            if (beanproperty != null)
            {
                class1 = annotationintrospector.findContentSerializer(beanproperty.getMember());
            }
        }
        if (class1 != null && class1 != org/codehaus/jackson/map/JsonSerializer$None)
        {
            return serializationconfig.serializerInstance(annotated, class1);
        } else
        {
            return null;
        }
    }

    protected static JsonSerializer findKeySerializer(SerializationConfig serializationconfig, Annotated annotated, BeanProperty beanproperty)
    {
        Class class1;
label0:
        {
            AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
            Class class2 = annotationintrospector.findKeySerializer(annotated);
            if (class2 != null)
            {
                class1 = class2;
                if (class2 != org/codehaus/jackson/map/JsonSerializer$None)
                {
                    break label0;
                }
            }
            class1 = class2;
            if (beanproperty != null)
            {
                class1 = annotationintrospector.findKeySerializer(beanproperty.getMember());
            }
        }
        if (class1 != null && class1 != org/codehaus/jackson/map/JsonSerializer$None)
        {
            return serializationconfig.serializerInstance(annotated, class1);
        } else
        {
            return null;
        }
    }

    protected static JavaType modifySecondaryTypesByAnnotation(SerializationConfig serializationconfig, Annotated annotated, JavaType javatype)
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        Object obj = javatype;
        if (javatype.isContainerType())
        {
            obj = annotationintrospector.findSerializationKeyType(annotated, javatype.getKeyType());
            serializationconfig = javatype;
            if (obj != null)
            {
                if (!(javatype instanceof MapType))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Illegal key-type annotation: type ").append(javatype).append(" is not a Map type").toString());
                }
                try
                {
                    serializationconfig = ((MapType)javatype).widenKey(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (SerializationConfig serializationconfig)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Failed to narrow key type ").append(javatype).append(" with key-type annotation (").append(((Class) (obj)).getName()).append("): ").append(serializationconfig.getMessage()).toString());
                }
            }
            annotated = annotationintrospector.findSerializationContentType(annotated, serializationconfig.getContentType());
            obj = serializationconfig;
            if (annotated != null)
            {
                try
                {
                    obj = serializationconfig.widenContentsBy(annotated);
                }
                // Misplaced declaration of an exception variable
                catch (JavaType javatype)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Failed to narrow content type ").append(serializationconfig).append(" with content-type annotation (").append(annotated.getName()).append("): ").append(javatype.getMessage()).toString());
                }
            }
        }
        return ((JavaType) (obj));
    }

    protected JsonSerializer buildArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        serializationconfig = arraytype.getRawClass();
        if ([Ljava/lang/String; == serializationconfig)
        {
            serializationconfig = new org.codehaus.jackson.map.ser.std.StdArraySerializers.StringArraySerializer(beanproperty);
        } else
        {
            basicbeandescription = (JsonSerializer)_arraySerializers.get(serializationconfig.getName());
            serializationconfig = basicbeandescription;
            if (basicbeandescription == null)
            {
                return new ObjectArraySerializer(arraytype.getContentType(), flag, typeserializer, beanproperty, jsonserializer);
            }
        }
        return serializationconfig;
    }

    protected JsonSerializer buildCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer1 = ((Serializers)iterator.next()).findCollectionLikeSerializer(serializationconfig, collectionliketype, basicbeandescription, beanproperty, typeserializer, jsonserializer);
            if (jsonserializer1 != null)
            {
                return jsonserializer1;
            }
        }

        return null;
    }

    protected JsonSerializer buildCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer1 = ((Serializers)iterator.next()).findCollectionSerializer(serializationconfig, collectiontype, basicbeandescription, beanproperty, typeserializer, jsonserializer);
            if (jsonserializer1 != null)
            {
                return jsonserializer1;
            }
        }

        Class class1 = collectiontype.getRawClass();
        if (java/util/EnumSet.isAssignableFrom(class1))
        {
            return buildEnumSetSerializer(serializationconfig, collectiontype, basicbeandescription, beanproperty, flag, typeserializer, jsonserializer);
        }
        serializationconfig = collectiontype.getContentType().getRawClass();
        if (isIndexedList(class1))
        {
            if (serializationconfig == java/lang/String)
            {
                return new IndexedStringListSerializer(beanproperty, jsonserializer);
            } else
            {
                return StdContainerSerializers.indexedListSerializer(collectiontype.getContentType(), flag, typeserializer, beanproperty, jsonserializer);
            }
        }
        if (serializationconfig == java/lang/String)
        {
            return new StringCollectionSerializer(beanproperty, jsonserializer);
        } else
        {
            return StdContainerSerializers.collectionSerializer(collectiontype.getContentType(), flag, typeserializer, beanproperty, jsonserializer);
        }
    }

    public JsonSerializer buildContainerSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
    {
        TypeSerializer typeserializer = createTypeSerializer(serializationconfig, javatype.getContentType(), beanproperty);
        JsonSerializer jsonserializer;
        boolean flag1;
        if (typeserializer != null)
        {
            flag1 = false;
        } else
        {
            flag1 = flag;
            if (!flag)
            {
                flag1 = usesStaticTyping(serializationconfig, basicbeandescription, typeserializer, beanproperty);
            }
        }
        jsonserializer = findContentSerializer(serializationconfig, basicbeandescription.getClassInfo(), beanproperty);
        if (javatype.isMapLikeType())
        {
            javatype = (MapLikeType)javatype;
            JsonSerializer jsonserializer1 = findKeySerializer(serializationconfig, basicbeandescription.getClassInfo(), beanproperty);
            if (javatype.isTrueMapType())
            {
                return buildMapSerializer(serializationconfig, (MapType)javatype, basicbeandescription, beanproperty, flag1, jsonserializer1, typeserializer, jsonserializer);
            } else
            {
                return buildMapLikeSerializer(serializationconfig, javatype, basicbeandescription, beanproperty, flag1, jsonserializer1, typeserializer, jsonserializer);
            }
        }
        if (javatype.isCollectionLikeType())
        {
            javatype = (CollectionLikeType)javatype;
            if (javatype.isTrueCollectionType())
            {
                return buildCollectionSerializer(serializationconfig, (CollectionType)javatype, basicbeandescription, beanproperty, flag1, typeserializer, jsonserializer);
            } else
            {
                return buildCollectionLikeSerializer(serializationconfig, javatype, basicbeandescription, beanproperty, flag1, typeserializer, jsonserializer);
            }
        }
        if (javatype.isArrayType())
        {
            return buildArraySerializer(serializationconfig, (ArrayType)javatype, basicbeandescription, beanproperty, flag1, typeserializer, jsonserializer);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer buildEnumMapSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        JavaType javatype1 = javatype.getKeyType();
        basicbeandescription = null;
        if (javatype1.isEnumType())
        {
            basicbeandescription = EnumValues.construct(javatype1.getRawClass(), serializationconfig.getAnnotationIntrospector());
        }
        return new EnumMapSerializer(javatype.getContentType(), flag, basicbeandescription, typeserializer, beanproperty, jsonserializer);
    }

    protected JsonSerializer buildEnumSetSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        javatype = javatype.getContentType();
        serializationconfig = javatype;
        if (!javatype.isEnumType())
        {
            serializationconfig = null;
        }
        return StdContainerSerializers.enumSetSerializer(serializationconfig, beanproperty);
    }

    protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
    {
        Object obj = javatype.containedType(0);
        javatype = ((JavaType) (obj));
        if (obj == null)
        {
            javatype = TypeFactory.unknownType();
        }
        obj = createTypeSerializer(serializationconfig, javatype, beanproperty);
        return StdContainerSerializers.iterableSerializer(javatype, usesStaticTyping(serializationconfig, basicbeandescription, ((TypeSerializer) (obj)), beanproperty), ((TypeSerializer) (obj)), beanproperty);
    }

    protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
    {
        Object obj = javatype.containedType(0);
        javatype = ((JavaType) (obj));
        if (obj == null)
        {
            javatype = TypeFactory.unknownType();
        }
        obj = createTypeSerializer(serializationconfig, javatype, beanproperty);
        return StdContainerSerializers.iteratorSerializer(javatype, usesStaticTyping(serializationconfig, basicbeandescription, ((TypeSerializer) (obj)), beanproperty), ((TypeSerializer) (obj)), beanproperty);
    }

    protected JsonSerializer buildMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, 
            JsonSerializer jsonserializer1)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer2 = ((Serializers)iterator.next()).findMapLikeSerializer(serializationconfig, mapliketype, basicbeandescription, beanproperty, jsonserializer, typeserializer, jsonserializer1);
            if (jsonserializer2 != null)
            {
                return jsonserializer2;
            }
        }

        return null;
    }

    protected JsonSerializer buildMapSerializer(SerializationConfig serializationconfig, MapType maptype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, 
            JsonSerializer jsonserializer1)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer2 = ((Serializers)iterator.next()).findMapSerializer(serializationconfig, maptype, basicbeandescription, beanproperty, jsonserializer, typeserializer, jsonserializer1);
            if (jsonserializer2 != null)
            {
                return jsonserializer2;
            }
        }

        if (java/util/EnumMap.isAssignableFrom(maptype.getRawClass()))
        {
            return buildEnumMapSerializer(serializationconfig, maptype, basicbeandescription, beanproperty, flag, typeserializer, jsonserializer1);
        } else
        {
            return MapSerializer.construct(serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(basicbeandescription.getClassInfo()), maptype, flag, typeserializer, beanproperty, jsonserializer, jsonserializer1);
        }
    }

    public abstract JsonSerializer createSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanProperty beanproperty)
    {
        org.codehaus.jackson.map.introspect.AnnotatedClass annotatedclass = ((BasicBeanDescription)serializationconfig.introspectClassAnnotations(javatype.getRawClass())).getClassInfo();
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findTypeResolver(serializationconfig, annotatedclass, javatype);
        Collection collection = null;
        if (typeresolverbuilder == null)
        {
            typeresolverbuilder = serializationconfig.getDefaultTyper(javatype);
        } else
        {
            collection = serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedclass, serializationconfig, annotationintrospector);
        }
        if (typeresolverbuilder == null)
        {
            return null;
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, collection, beanproperty);
        }
    }

    protected abstract Iterable customSerializers();

    public final JsonSerializer findSerializerByAddonType(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
        throws JsonMappingException
    {
        Class class1 = javatype.getRawClass();
        if (java/util/Iterator.isAssignableFrom(class1))
        {
            return buildIteratorSerializer(serializationconfig, javatype, basicbeandescription, beanproperty, flag);
        }
        if (java/lang/Iterable.isAssignableFrom(class1))
        {
            return buildIterableSerializer(serializationconfig, javatype, basicbeandescription, beanproperty, flag);
        }
        if (java/lang/CharSequence.isAssignableFrom(class1))
        {
            return ToStringSerializer.instance;
        } else
        {
            return null;
        }
    }

    public final JsonSerializer findSerializerByLookup(JavaType javatype, SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
    {
        javatype = javatype.getRawClass().getName();
        serializationconfig = (JsonSerializer)_concrete.get(javatype);
        if (serializationconfig != null)
        {
            return serializationconfig;
        }
        javatype = (Class)_concreteLazy.get(javatype);
        if (javatype != null)
        {
            try
            {
                serializationconfig = (JsonSerializer)javatype.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (SerializationConfig serializationconfig)
            {
                throw new IllegalStateException((new StringBuilder()).append("Failed to instantiate standard serializer (of type ").append(javatype.getName()).append("): ").append(serializationconfig.getMessage()).toString(), serializationconfig);
            }
            return serializationconfig;
        } else
        {
            return null;
        }
    }

    public final JsonSerializer findSerializerByPrimaryType(JavaType javatype, SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, boolean flag)
        throws JsonMappingException
    {
        Class class1 = javatype.getRawClass();
        if (!org/codehaus/jackson/map/JsonSerializable.isAssignableFrom(class1)) goto _L2; else goto _L1
_L1:
        if (!org/codehaus/jackson/map/JsonSerializableWithType.isAssignableFrom(class1)) goto _L4; else goto _L3
_L3:
        javatype = SerializableWithTypeSerializer.instance;
_L6:
        return javatype;
_L4:
        return SerializableSerializer.instance;
_L2:
        AnnotatedMethod annotatedmethod = basicbeandescription.findJsonValueMethod();
        if (annotatedmethod != null)
        {
            javatype = annotatedmethod.getAnnotated();
            if (serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
            {
                ClassUtil.checkAndFixAccess(javatype);
            }
            return new JsonValueSerializer(javatype, findSerializerFromAnnotation(serializationconfig, annotatedmethod, beanproperty), beanproperty);
        }
        if (java/net/InetAddress.isAssignableFrom(class1))
        {
            return InetAddressSerializer.instance;
        }
        if (java/util/TimeZone.isAssignableFrom(class1))
        {
            return TimeZoneSerializer.instance;
        }
        if (java/nio/charset/Charset.isAssignableFrom(class1))
        {
            return ToStringSerializer.instance;
        }
        beanproperty = optionalHandlers.findSerializer(serializationconfig, javatype);
        javatype = beanproperty;
        if (beanproperty == null)
        {
            if (java/lang/Number.isAssignableFrom(class1))
            {
                return StdSerializers.NumberSerializer.instance;
            }
            if (java/lang/Enum.isAssignableFrom(class1))
            {
                return EnumSerializer.construct(class1, serializationconfig, basicbeandescription);
            }
            if (java/util/Calendar.isAssignableFrom(class1))
            {
                return CalendarSerializer.instance;
            }
            if (java/util/Date.isAssignableFrom(class1))
            {
                return DateSerializer.instance;
            } else
            {
                return null;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected JsonSerializer findSerializerFromAnnotation(SerializationConfig serializationconfig, Annotated annotated, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = serializationconfig.getAnnotationIntrospector().findSerializer(annotated);
        if (obj != null) goto _L2; else goto _L1
_L1:
        annotated = null;
_L4:
        return annotated;
_L2:
        if (!(obj instanceof JsonSerializer))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JsonSerializer)obj;
        annotated = ((Annotated) (obj));
        if (obj instanceof ContextualSerializer)
        {
            return ((ContextualSerializer)obj).createContextual(serializationconfig, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned value of type ").append(obj.getClass().getName()).append("; expected type JsonSerializer or Class<JsonSerializer> instead").toString());
        }
        obj = (Class)obj;
        if (!org/codehaus/jackson/map/JsonSerializer.isAssignableFrom(((Class) (obj))))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(((Class) (obj)).getName()).append("; expected Class<JsonSerializer>").toString());
        }
        obj = serializationconfig.serializerInstance(annotated, ((Class) (obj)));
        annotated = ((Annotated) (obj));
        if (obj instanceof ContextualSerializer)
        {
            return ((ContextualSerializer)obj).createContextual(serializationconfig, beanproperty);
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final JsonSerializer getNullSerializer()
    {
        return NullSerializer.instance;
    }

    protected boolean isIndexedList(Class class1)
    {
        return java/util/RandomAccess.isAssignableFrom(class1);
    }

    protected JavaType modifyTypeByAnnotation(SerializationConfig serializationconfig, Annotated annotated, JavaType javatype)
    {
        Class class1 = serializationconfig.getAnnotationIntrospector().findSerializationType(annotated);
        JavaType javatype1 = javatype;
        if (class1 != null)
        {
            try
            {
                javatype1 = javatype.widenBy(class1);
            }
            // Misplaced declaration of an exception variable
            catch (SerializationConfig serializationconfig)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to widen type ").append(javatype).append(" with concrete-type annotation (value ").append(class1.getName()).append("), method '").append(annotated.getName()).append("': ").append(serializationconfig.getMessage()).toString());
            }
        }
        return modifySecondaryTypesByAnnotation(serializationconfig, annotated, javatype1);
    }

    protected boolean usesStaticTyping(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        if (typeserializer == null)
        {
            typeserializer = serializationconfig.getAnnotationIntrospector();
            basicbeandescription = typeserializer.findSerializationTyping(basicbeandescription.getClassInfo());
            if (basicbeandescription != null)
            {
                if (basicbeandescription == org.codehaus.jackson.map.annotate.JsonSerialize.Typing.STATIC)
                {
                    return true;
                }
            } else
            if (serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.USE_STATIC_TYPING))
            {
                return true;
            }
            if (beanproperty != null)
            {
                serializationconfig = beanproperty.getType();
                if (serializationconfig.isContainerType())
                {
                    if (typeserializer.findSerializationContentType(beanproperty.getMember(), beanproperty.getType()) != null)
                    {
                        return true;
                    }
                    if ((serializationconfig instanceof MapType) && typeserializer.findSerializationKeyType(beanproperty.getMember(), beanproperty.getType()) != null)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static 
    {
        _concrete = new HashMap();
        _concreteLazy = new HashMap();
        _concrete.put(java/lang/String.getName(), new StringSerializer());
        Object obj = ToStringSerializer.instance;
        _concrete.put(java/lang/StringBuffer.getName(), obj);
        _concrete.put(java/lang/StringBuilder.getName(), obj);
        _concrete.put(java/lang/Character.getName(), obj);
        _concrete.put(Character.TYPE.getName(), obj);
        _concrete.put(Boolean.TYPE.getName(), new StdSerializers.BooleanSerializer(true));
        _concrete.put(java/lang/Boolean.getName(), new StdSerializers.BooleanSerializer(false));
        obj = new StdSerializers.IntegerSerializer();
        _concrete.put(java/lang/Integer.getName(), obj);
        _concrete.put(Integer.TYPE.getName(), obj);
        _concrete.put(java/lang/Long.getName(), StdSerializers.LongSerializer.instance);
        _concrete.put(Long.TYPE.getName(), StdSerializers.LongSerializer.instance);
        _concrete.put(java/lang/Byte.getName(), StdSerializers.IntLikeSerializer.instance);
        _concrete.put(Byte.TYPE.getName(), StdSerializers.IntLikeSerializer.instance);
        _concrete.put(java/lang/Short.getName(), StdSerializers.IntLikeSerializer.instance);
        _concrete.put(Short.TYPE.getName(), StdSerializers.IntLikeSerializer.instance);
        _concrete.put(java/lang/Float.getName(), StdSerializers.FloatSerializer.instance);
        _concrete.put(Float.TYPE.getName(), StdSerializers.FloatSerializer.instance);
        _concrete.put(java/lang/Double.getName(), StdSerializers.DoubleSerializer.instance);
        _concrete.put(Double.TYPE.getName(), StdSerializers.DoubleSerializer.instance);
        obj = new StdSerializers.NumberSerializer();
        _concrete.put(java/math/BigInteger.getName(), obj);
        _concrete.put(java/math/BigDecimal.getName(), obj);
        _concrete.put(java/util/Calendar.getName(), CalendarSerializer.instance);
        obj = DateSerializer.instance;
        _concrete.put(java/util/Date.getName(), obj);
        _concrete.put(java/sql/Timestamp.getName(), obj);
        _concrete.put(java/sql/Date.getName(), new StdSerializers.SqlDateSerializer());
        _concrete.put(java/sql/Time.getName(), new StdSerializers.SqlTimeSerializer());
        for (Iterator iterator = (new StdJdkSerializers()).provide().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = entry.getValue();
            if (obj1 instanceof JsonSerializer)
            {
                _concrete.put(((Class)entry.getKey()).getName(), (JsonSerializer)obj1);
            } else
            if (obj1 instanceof Class)
            {
                obj1 = (Class)obj1;
                _concreteLazy.put(((Class)entry.getKey()).getName(), obj1);
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Internal error: unrecognized value of type ").append(entry.getClass().getName()).toString());
            }
        }

        _concreteLazy.put(org/codehaus/jackson/util/TokenBuffer.getName(), org/codehaus/jackson/map/ser/std/TokenBufferSerializer);
        _arraySerializers = new HashMap();
        _arraySerializers.put([Z.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.BooleanArraySerializer());
        _arraySerializers.put([B.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.ByteArraySerializer());
        _arraySerializers.put([C.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.CharArraySerializer());
        _arraySerializers.put([S.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.ShortArraySerializer());
        _arraySerializers.put([I.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.IntArraySerializer());
        _arraySerializers.put([J.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.LongArraySerializer());
        _arraySerializers.put([F.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.FloatArraySerializer());
        _arraySerializers.put([D.getName(), new org.codehaus.jackson.map.ser.std.StdArraySerializers.DoubleArraySerializer());
    }
}
