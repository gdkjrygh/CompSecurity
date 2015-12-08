// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.ContextualDeserializer;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.std.AtomicReferenceDeserializer;
import org.codehaus.jackson.map.deser.std.CollectionDeserializer;
import org.codehaus.jackson.map.deser.std.EnumDeserializer;
import org.codehaus.jackson.map.deser.std.EnumMapDeserializer;
import org.codehaus.jackson.map.deser.std.EnumSetDeserializer;
import org.codehaus.jackson.map.deser.std.JsonNodeDeserializer;
import org.codehaus.jackson.map.deser.std.MapDeserializer;
import org.codehaus.jackson.map.deser.std.ObjectArrayDeserializer;
import org.codehaus.jackson.map.deser.std.PrimitiveArrayDeserializers;
import org.codehaus.jackson.map.deser.std.StdKeyDeserializers;
import org.codehaus.jackson.map.deser.std.StringCollectionDeserializer;
import org.codehaus.jackson.map.ext.OptionalHandlerFactory;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.EnumResolver;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            StdDeserializers, ValueInstantiator

public abstract class BasicDeserializerFactory extends DeserializerFactory
{

    protected static final HashMap _arrayDeserializers = PrimitiveArrayDeserializers.getAll();
    static final HashMap _collectionFallbacks;
    static final HashMap _keyDeserializers = StdKeyDeserializers.constructAll();
    static final HashMap _mapFallbacks;
    static final HashMap _simpleDeserializers = StdDeserializers.constructAll();
    protected OptionalHandlerFactory optionalHandlers;

    protected BasicDeserializerFactory()
    {
        optionalHandlers = OptionalHandlerFactory.instance;
    }

    JsonDeserializer _constructDeserializer(DeserializationConfig deserializationconfig, Annotated annotated, BeanProperty beanproperty, Object obj)
        throws JsonMappingException
    {
        if (obj instanceof JsonDeserializer)
        {
            obj = (JsonDeserializer)obj;
            annotated = ((Annotated) (obj));
            if (obj instanceof ContextualDeserializer)
            {
                annotated = ((ContextualDeserializer)obj).createContextual(deserializationconfig, beanproperty);
            }
        } else
        {
            if (!(obj instanceof Class))
            {
                throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned deserializer definition of type ").append(obj.getClass().getName()).append("; expected type JsonDeserializer or Class<JsonDeserializer> instead").toString());
            }
            obj = (Class)obj;
            if (!org/codehaus/jackson/map/JsonDeserializer.isAssignableFrom(((Class) (obj))))
            {
                throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(((Class) (obj)).getName()).append("; expected Class<JsonDeserializer>").toString());
            }
            obj = deserializationconfig.deserializerInstance(annotated, ((Class) (obj)));
            annotated = ((Annotated) (obj));
            if (obj instanceof ContextualDeserializer)
            {
                return ((ContextualDeserializer)obj).createContextual(deserializationconfig, beanproperty);
            }
        }
        return annotated;
    }

    protected abstract JsonDeserializer _findCustomArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException;

    protected abstract JsonDeserializer _findCustomTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanProperty beanproperty)
        throws JsonMappingException;

    protected EnumResolver constructEnumResolver(Class class1, DeserializationConfig deserializationconfig)
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.READ_ENUMS_USING_TO_STRING))
        {
            return EnumResolver.constructUnsafeUsingToString(class1);
        } else
        {
            return EnumResolver.constructUnsafe(class1, deserializationconfig.getAnnotationIntrospector());
        }
    }

    public JsonDeserializer createArrayDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, ArrayType arraytype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JavaType javatype = arraytype.getContentType();
        JsonDeserializer jsondeserializer1 = (JsonDeserializer)javatype.getValueHandler();
        if (jsondeserializer1 == null)
        {
            JsonDeserializer jsondeserializer = (JsonDeserializer)_arrayDeserializers.get(javatype);
            if (jsondeserializer != null)
            {
                deserializerprovider = _findCustomArrayDeserializer(arraytype, deserializationconfig, deserializerprovider, beanproperty, null, null);
                deserializationconfig = jsondeserializer;
                if (deserializerprovider != null)
                {
                    deserializationconfig = deserializerprovider;
                }
                return deserializationconfig;
            }
            if (javatype.isPrimitive())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Internal error: primitive type (").append(arraytype).append(") passed, no array deserializer found").toString());
            }
        }
        Object obj = (TypeDeserializer)javatype.getTypeHandler();
        TypeDeserializer typedeserializer = ((TypeDeserializer) (obj));
        if (obj == null)
        {
            typedeserializer = findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        }
        obj = _findCustomArrayDeserializer(arraytype, deserializationconfig, deserializerprovider, beanproperty, typedeserializer, jsondeserializer1);
        if (obj != null)
        {
            return ((JsonDeserializer) (obj));
        }
        obj = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            obj = deserializerprovider.findValueDeserializer(deserializationconfig, javatype, beanproperty);
        }
        return new ObjectArrayDeserializer(arraytype, ((JsonDeserializer) (obj)), typedeserializer);
    }

    public JsonDeserializer createCollectionDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, CollectionType collectiontype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj;
        JavaType javatype;
label0:
        {
            collectiontype = (CollectionType)mapAbstractType(deserializationconfig, collectiontype);
            Class class1 = collectiontype.getRawClass();
            BasicBeanDescription basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectForCreation(collectiontype);
            obj = findDeserializerFromAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), beanproperty);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
            CollectionType collectiontype1 = (CollectionType)modifyTypeByAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), collectiontype, null);
            javatype = collectiontype1.getContentType();
            JsonDeserializer jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
            obj = (TypeDeserializer)javatype.getTypeHandler();
            collectiontype = ((CollectionType) (obj));
            if (obj == null)
            {
                collectiontype = findTypeDeserializer(deserializationconfig, javatype, beanproperty);
            }
            obj = _findCustomCollectionDeserializer(collectiontype1, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, collectiontype, jsondeserializer);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
            obj = jsondeserializer;
            if (jsondeserializer == null)
            {
                if (java/util/EnumSet.isAssignableFrom(class1))
                {
                    return new EnumSetDeserializer(javatype.getRawClass(), createEnumDeserializer(deserializationconfig, deserializerprovider, javatype, beanproperty));
                }
                obj = deserializerprovider.findValueDeserializer(deserializationconfig, javatype, beanproperty);
            }
            if (!collectiontype1.isInterface())
            {
                beanproperty = basicbeandescription;
                deserializerprovider = collectiontype1;
                if (!collectiontype1.isAbstract())
                {
                    break label0;
                }
            }
            deserializerprovider = (Class)_collectionFallbacks.get(class1.getName());
            if (deserializerprovider == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Can not find a deserializer for non-concrete Collection type ").append(collectiontype1).toString());
            }
            deserializerprovider = (CollectionType)deserializationconfig.constructSpecializedType(collectiontype1, deserializerprovider);
            beanproperty = (BasicBeanDescription)deserializationconfig.introspectForCreation(deserializerprovider);
        }
        deserializationconfig = findValueInstantiator(deserializationconfig, beanproperty);
        if (javatype.getRawClass() == java/lang/String)
        {
            return new StringCollectionDeserializer(deserializerprovider, ((JsonDeserializer) (obj)), deserializationconfig);
        } else
        {
            return new CollectionDeserializer(deserializerprovider, ((JsonDeserializer) (obj)), collectiontype, deserializationconfig);
        }
    }

    public JsonDeserializer createCollectionLikeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, CollectionLikeType collectionliketype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        collectionliketype = (CollectionLikeType)mapAbstractType(deserializationconfig, collectionliketype);
        BasicBeanDescription basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectClassAnnotations(collectionliketype.getRawClass());
        Object obj = findDeserializerFromAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), beanproperty);
        if (obj != null)
        {
            return ((JsonDeserializer) (obj));
        }
        CollectionLikeType collectionliketype1 = (CollectionLikeType)modifyTypeByAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), collectionliketype, null);
        JavaType javatype = collectionliketype1.getContentType();
        JsonDeserializer jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
        obj = (TypeDeserializer)javatype.getTypeHandler();
        collectionliketype = ((CollectionLikeType) (obj));
        if (obj == null)
        {
            collectionliketype = findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        }
        return _findCustomCollectionLikeDeserializer(collectionliketype1, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, collectionliketype, jsondeserializer);
    }

    public JsonDeserializer createEnumDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        deserializerprovider = (BasicBeanDescription)deserializationconfig.introspectForCreation(javatype);
        JsonDeserializer jsondeserializer = findDeserializerFromAnnotation(deserializationconfig, deserializerprovider.getClassInfo(), beanproperty);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        javatype = javatype.getRawClass();
        beanproperty = _findCustomEnumDeserializer(javatype, deserializationconfig, deserializerprovider, beanproperty);
        if (beanproperty != null)
        {
            return beanproperty;
        }
        for (deserializerprovider = deserializerprovider.getFactoryMethods().iterator(); deserializerprovider.hasNext();)
        {
            beanproperty = (AnnotatedMethod)deserializerprovider.next();
            if (deserializationconfig.getAnnotationIntrospector().hasCreatorAnnotation(beanproperty))
            {
                if (beanproperty.getParameterCount() == 1 && beanproperty.getRawType().isAssignableFrom(javatype))
                {
                    return EnumDeserializer.deserializerForCreator(deserializationconfig, javatype, beanproperty);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unsuitable method (").append(beanproperty).append(") decorated with @JsonCreator (for Enum type ").append(javatype.getName()).append(")").toString());
                }
            }
        }

        return new EnumDeserializer(constructEnumResolver(javatype, deserializationconfig));
    }

    public JsonDeserializer createMapDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, MapType maptype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj;
        Object obj1;
label0:
        {
            maptype = (MapType)mapAbstractType(deserializationconfig, maptype);
            BasicBeanDescription basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectForCreation(maptype);
            obj = findDeserializerFromAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), beanproperty);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
            MapType maptype1 = (MapType)modifyTypeByAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), maptype, null);
            JavaType javatype = maptype1.getKeyType();
            JavaType javatype1 = maptype1.getContentType();
            Object obj2 = (JsonDeserializer)javatype1.getValueHandler();
            obj = (KeyDeserializer)javatype.getValueHandler();
            maptype = ((MapType) (obj));
            if (obj == null)
            {
                maptype = deserializerprovider.findKeyDeserializer(deserializationconfig, javatype, beanproperty);
            }
            obj1 = (TypeDeserializer)javatype1.getTypeHandler();
            obj = obj1;
            if (obj1 == null)
            {
                obj = findTypeDeserializer(deserializationconfig, javatype1, beanproperty);
            }
            obj1 = _findCustomMapDeserializer(maptype1, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, maptype, ((TypeDeserializer) (obj)), ((JsonDeserializer) (obj2)));
            if (obj1 != null)
            {
                return ((JsonDeserializer) (obj1));
            }
            obj1 = obj2;
            if (obj2 == null)
            {
                obj1 = deserializerprovider.findValueDeserializer(deserializationconfig, javatype1, beanproperty);
            }
            obj2 = maptype1.getRawClass();
            if (java/util/EnumMap.isAssignableFrom(((Class) (obj2))))
            {
                maptype = javatype.getRawClass();
                if (maptype == null || !maptype.isEnum())
                {
                    throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
                } else
                {
                    return new EnumMapDeserializer(javatype.getRawClass(), createEnumDeserializer(deserializationconfig, deserializerprovider, javatype, beanproperty), ((JsonDeserializer) (obj1)));
                }
            }
            if (!maptype1.isInterface())
            {
                deserializerprovider = basicbeandescription;
                beanproperty = maptype1;
                if (!maptype1.isAbstract())
                {
                    break label0;
                }
            }
            deserializerprovider = (Class)_mapFallbacks.get(((Class) (obj2)).getName());
            if (deserializerprovider == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Can not find a deserializer for non-concrete Map type ").append(maptype1).toString());
            }
            beanproperty = (MapType)deserializationconfig.constructSpecializedType(maptype1, deserializerprovider);
            deserializerprovider = (BasicBeanDescription)deserializationconfig.introspectForCreation(beanproperty);
        }
        maptype = new MapDeserializer(beanproperty, findValueInstantiator(deserializationconfig, deserializerprovider), maptype, ((JsonDeserializer) (obj1)), ((TypeDeserializer) (obj)));
        maptype.setIgnorableProperties(deserializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(deserializerprovider.getClassInfo()));
        return maptype;
    }

    public JsonDeserializer createMapLikeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, MapLikeType mapliketype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        mapliketype = (MapLikeType)mapAbstractType(deserializationconfig, mapliketype);
        BasicBeanDescription basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectForCreation(mapliketype);
        Object obj = findDeserializerFromAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), beanproperty);
        if (obj != null)
        {
            return ((JsonDeserializer) (obj));
        }
        MapLikeType mapliketype1 = (MapLikeType)modifyTypeByAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), mapliketype, null);
        Object obj1 = mapliketype1.getKeyType();
        JavaType javatype = mapliketype1.getContentType();
        JsonDeserializer jsondeserializer = (JsonDeserializer)javatype.getValueHandler();
        obj = (KeyDeserializer)((JavaType) (obj1)).getValueHandler();
        mapliketype = ((MapLikeType) (obj));
        if (obj == null)
        {
            mapliketype = deserializerprovider.findKeyDeserializer(deserializationconfig, ((JavaType) (obj1)), beanproperty);
        }
        obj1 = (TypeDeserializer)javatype.getTypeHandler();
        obj = obj1;
        if (obj1 == null)
        {
            obj = findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        }
        return _findCustomMapLikeDeserializer(mapliketype1, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, mapliketype, ((TypeDeserializer) (obj)), jsondeserializer);
    }

    public JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        deserializerprovider = javatype.getRawClass();
        deserializationconfig = _findCustomTreeNodeDeserializer(deserializerprovider, deserializationconfig, beanproperty);
        if (deserializationconfig != null)
        {
            return deserializationconfig;
        } else
        {
            return JsonNodeDeserializer.getDeserializer(deserializerprovider);
        }
    }

    protected JsonDeserializer findDeserializerFromAnnotation(DeserializationConfig deserializationconfig, Annotated annotated, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = deserializationconfig.getAnnotationIntrospector().findDeserializer(annotated);
        if (obj != null)
        {
            return _constructDeserializer(deserializationconfig, annotated, beanproperty, obj);
        } else
        {
            return null;
        }
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, AnnotatedMember annotatedmember, BeanProperty beanproperty)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyContentTypeResolver(deserializationconfig, annotatedmember, javatype);
        javatype = javatype.getContentType();
        if (typeresolverbuilder == null)
        {
            return findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        } else
        {
            return typeresolverbuilder.buildTypeDeserializer(deserializationconfig, javatype, deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, deserializationconfig, annotationintrospector), beanproperty);
        }
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, AnnotatedMember annotatedmember, BeanProperty beanproperty)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyTypeResolver(deserializationconfig, annotatedmember, javatype);
        if (typeresolverbuilder == null)
        {
            return findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        } else
        {
            return typeresolverbuilder.buildTypeDeserializer(deserializationconfig, javatype, deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, deserializationconfig, annotationintrospector), beanproperty);
        }
    }

    protected JsonDeserializer findStdBeanDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Class class1 = javatype.getRawClass();
        JsonDeserializer jsondeserializer = (JsonDeserializer)_simpleDeserializers.get(new ClassKey(class1));
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        if (java/util/concurrent/atomic/AtomicReference.isAssignableFrom(class1))
        {
            deserializationconfig = deserializationconfig.getTypeFactory().findTypeParameters(javatype, java/util/concurrent/atomic/AtomicReference);
            if (deserializationconfig == null || deserializationconfig.length < 1)
            {
                deserializationconfig = TypeFactory.unknownType();
            } else
            {
                deserializationconfig = deserializationconfig[0];
            }
            return new AtomicReferenceDeserializer(deserializationconfig, beanproperty);
        }
        deserializationconfig = optionalHandlers.findDeserializer(javatype, deserializationconfig, deserializerprovider);
        if (deserializationconfig != null)
        {
            return deserializationconfig;
        } else
        {
            return null;
        }
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj1 = ((BasicBeanDescription)deserializationconfig.introspectClassAnnotations(javatype.getRawClass())).getClassInfo();
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        Object obj = annotationintrospector.findTypeResolver(deserializationconfig, ((org.codehaus.jackson.map.introspect.AnnotatedClass) (obj1)), javatype);
        Collection collection = null;
        if (obj == null)
        {
            obj1 = deserializationconfig.getDefaultTyper(javatype);
            obj = obj1;
            if (obj1 == null)
            {
                return null;
            }
        } else
        {
            collection = deserializationconfig.getSubtypeResolver().collectAndResolveSubtypes(((org.codehaus.jackson.map.introspect.AnnotatedClass) (obj1)), deserializationconfig, annotationintrospector);
        }
        obj1 = obj;
        if (((TypeResolverBuilder) (obj)).getDefaultImpl() == null)
        {
            obj1 = obj;
            if (javatype.isAbstract())
            {
                JavaType javatype1 = mapAbstractType(deserializationconfig, javatype);
                obj1 = obj;
                if (javatype1 != null)
                {
                    obj1 = obj;
                    if (javatype1.getRawClass() != javatype.getRawClass())
                    {
                        obj1 = ((TypeResolverBuilder) (obj)).defaultImpl(javatype1.getRawClass());
                    }
                }
            }
        }
        return ((TypeResolverBuilder) (obj1)).buildTypeDeserializer(deserializationconfig, javatype, collection, beanproperty);
    }

    public abstract ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException;

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException;

    protected JavaType modifyTypeByAnnotation(DeserializationConfig deserializationconfig, Annotated annotated, JavaType javatype, String s)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        Class class1 = annotationintrospector.findDeserializationType(annotated, javatype, s);
        Object obj = javatype;
        if (class1 != null)
        {
            try
            {
                obj = javatype.narrowBy(class1);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationConfig deserializationconfig)
            {
                throw new JsonMappingException((new StringBuilder()).append("Failed to narrow type ").append(javatype).append(" with concrete-type annotation (value ").append(class1.getName()).append("), method '").append(annotated.getName()).append("': ").append(deserializationconfig.getMessage()).toString(), null, deserializationconfig);
            }
        }
        javatype = ((JavaType) (obj));
        if (((JavaType) (obj)).isContainerType())
        {
            class1 = annotationintrospector.findDeserializationKeyType(annotated, ((JavaType) (obj)).getKeyType(), s);
            javatype = ((JavaType) (obj));
            if (class1 != null)
            {
                if (!(obj instanceof MapLikeType))
                {
                    throw new JsonMappingException((new StringBuilder()).append("Illegal key-type annotation: type ").append(obj).append(" is not a Map(-like) type").toString());
                }
                try
                {
                    javatype = ((MapLikeType)obj).narrowKey(class1);
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationConfig deserializationconfig)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow key type ").append(obj).append(" with key-type annotation (").append(class1.getName()).append("): ").append(deserializationconfig.getMessage()).toString(), null, deserializationconfig);
                }
            }
            obj = javatype.getKeyType();
            if (obj != null && ((JavaType) (obj)).getValueHandler() == null)
            {
                class1 = annotationintrospector.findKeyDeserializer(annotated);
                if (class1 != null && class1 != org/codehaus/jackson/map/KeyDeserializer$None)
                {
                    ((JavaType) (obj)).setValueHandler(deserializationconfig.keyDeserializerInstance(annotated, class1));
                }
            }
            obj = annotationintrospector.findDeserializationContentType(annotated, javatype.getContentType(), s);
            s = javatype;
            if (obj != null)
            {
                try
                {
                    s = javatype.narrowContentsBy(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationConfig deserializationconfig)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow content type ").append(javatype).append(" with content-type annotation (").append(((Class) (obj)).getName()).append("): ").append(deserializationconfig.getMessage()).toString(), null, deserializationconfig);
                }
            }
            javatype = s;
            if (s.getContentType().getValueHandler() == null)
            {
                obj = annotationintrospector.findContentDeserializer(annotated);
                javatype = s;
                if (obj != null)
                {
                    javatype = s;
                    if (obj != org/codehaus/jackson/map/JsonDeserializer$None)
                    {
                        deserializationconfig = deserializationconfig.deserializerInstance(annotated, ((Class) (obj)));
                        s.getContentType().setValueHandler(deserializationconfig);
                        javatype = s;
                    }
                }
            }
        }
        return javatype;
    }

    protected JavaType resolveType(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, JavaType javatype, AnnotatedMember annotatedmember, BeanProperty beanproperty)
        throws JsonMappingException
    {
        basicbeandescription = javatype;
        if (javatype.isContainerType())
        {
            basicbeandescription = deserializationconfig.getAnnotationIntrospector();
            JavaType javatype1 = javatype.getKeyType();
            if (javatype1 != null)
            {
                Class class1 = basicbeandescription.findKeyDeserializer(annotatedmember);
                if (class1 != null && class1 != org/codehaus/jackson/map/KeyDeserializer$None)
                {
                    javatype1.setValueHandler(deserializationconfig.keyDeserializerInstance(annotatedmember, class1));
                }
            }
            basicbeandescription = basicbeandescription.findContentDeserializer(annotatedmember);
            if (basicbeandescription != null && basicbeandescription != org/codehaus/jackson/map/JsonDeserializer$None)
            {
                basicbeandescription = deserializationconfig.deserializerInstance(annotatedmember, basicbeandescription);
                javatype.getContentType().setValueHandler(basicbeandescription);
            }
            basicbeandescription = javatype;
            if (annotatedmember instanceof AnnotatedMember)
            {
                TypeDeserializer typedeserializer = findPropertyContentTypeDeserializer(deserializationconfig, javatype, annotatedmember, beanproperty);
                basicbeandescription = javatype;
                if (typedeserializer != null)
                {
                    basicbeandescription = javatype.withContentTypeHandler(typedeserializer);
                }
            }
        }
        if (annotatedmember instanceof AnnotatedMember)
        {
            deserializationconfig = findPropertyTypeDeserializer(deserializationconfig, basicbeandescription, annotatedmember, beanproperty);
        } else
        {
            deserializationconfig = findTypeDeserializer(deserializationconfig, basicbeandescription, null);
        }
        javatype = basicbeandescription;
        if (deserializationconfig != null)
        {
            javatype = basicbeandescription.withTypeHandler(deserializationconfig);
        }
        return javatype;
    }

    public abstract DeserializerFactory withConfig(org.codehaus.jackson.map.DeserializerFactory.Config config);

    static 
    {
        _mapFallbacks = new HashMap();
        _mapFallbacks.put(java/util/Map.getName(), java/util/LinkedHashMap);
        _mapFallbacks.put(java/util/concurrent/ConcurrentMap.getName(), java/util/concurrent/ConcurrentHashMap);
        _mapFallbacks.put(java/util/SortedMap.getName(), java/util/TreeMap);
        _mapFallbacks.put("java.util.NavigableMap", java/util/TreeMap);
        try
        {
            Class class1 = Class.forName("java.util.concurrent.ConcurrentNavigableMap");
            Class class2 = Class.forName("java.util.concurrent.ConcurrentSkipListMap");
            _mapFallbacks.put(class1.getName(), class2);
        }
        catch (ClassNotFoundException classnotfoundexception) { }
        catch (SecurityException securityexception) { }
        _collectionFallbacks = new HashMap();
        _collectionFallbacks.put(java/util/Collection.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/List.getName(), java/util/ArrayList);
        _collectionFallbacks.put(java/util/Set.getName(), java/util/HashSet);
        _collectionFallbacks.put(java/util/SortedSet.getName(), java/util/TreeSet);
        _collectionFallbacks.put(java/util/Queue.getName(), java/util/LinkedList);
        _collectionFallbacks.put("java.util.Deque", java/util/LinkedList);
        _collectionFallbacks.put("java.util.NavigableSet", java/util/TreeSet);
    }
}
