// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.text.DateFormat;
import java.util.HashMap;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.NopAnnotationIntrospector;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.LinkedNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            HandlerInstantiator, JsonDeserializer, AnnotationIntrospector, ClassIntrospector, 
//            KeyDeserializer, PropertyNamingStrategy, DeserializationProblemHandler, MapperConfig, 
//            BeanDescription

public class DeserializationConfig extends MapperConfig.Impl
{
    public static final class Feature extends Enum
        implements MapperConfig.ConfigFeature
    {

        private static final Feature $VALUES[];
        public static final Feature ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
        public static final Feature ACCEPT_SINGLE_VALUE_AS_ARRAY;
        public static final Feature AUTO_DETECT_CREATORS;
        public static final Feature AUTO_DETECT_FIELDS;
        public static final Feature AUTO_DETECT_SETTERS;
        public static final Feature CAN_OVERRIDE_ACCESS_MODIFIERS;
        public static final Feature FAIL_ON_NULL_FOR_PRIMITIVES;
        public static final Feature FAIL_ON_NUMBERS_FOR_ENUMS;
        public static final Feature FAIL_ON_UNKNOWN_PROPERTIES;
        public static final Feature READ_ENUMS_USING_TO_STRING;
        public static final Feature UNWRAP_ROOT_VALUE;
        public static final Feature USE_ANNOTATIONS;
        public static final Feature USE_BIG_DECIMAL_FOR_FLOATS;
        public static final Feature USE_BIG_INTEGER_FOR_INTS;
        public static final Feature USE_GETTERS_AS_SETTERS;
        public static final Feature USE_JAVA_ARRAY_FOR_JSON_ARRAY;
        public static final Feature WRAP_EXCEPTIONS;
        final boolean _defaultState;

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(org/codehaus/jackson/map/DeserializationConfig$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])$VALUES.clone();
        }

        public boolean enabledByDefault()
        {
            return _defaultState;
        }

        public int getMask()
        {
            return 1 << ordinal();
        }

        static 
        {
            USE_ANNOTATIONS = new Feature("USE_ANNOTATIONS", 0, true);
            AUTO_DETECT_SETTERS = new Feature("AUTO_DETECT_SETTERS", 1, true);
            AUTO_DETECT_CREATORS = new Feature("AUTO_DETECT_CREATORS", 2, true);
            AUTO_DETECT_FIELDS = new Feature("AUTO_DETECT_FIELDS", 3, true);
            USE_GETTERS_AS_SETTERS = new Feature("USE_GETTERS_AS_SETTERS", 4, true);
            CAN_OVERRIDE_ACCESS_MODIFIERS = new Feature("CAN_OVERRIDE_ACCESS_MODIFIERS", 5, true);
            USE_BIG_DECIMAL_FOR_FLOATS = new Feature("USE_BIG_DECIMAL_FOR_FLOATS", 6, false);
            USE_BIG_INTEGER_FOR_INTS = new Feature("USE_BIG_INTEGER_FOR_INTS", 7, false);
            USE_JAVA_ARRAY_FOR_JSON_ARRAY = new Feature("USE_JAVA_ARRAY_FOR_JSON_ARRAY", 8, false);
            READ_ENUMS_USING_TO_STRING = new Feature("READ_ENUMS_USING_TO_STRING", 9, false);
            FAIL_ON_UNKNOWN_PROPERTIES = new Feature("FAIL_ON_UNKNOWN_PROPERTIES", 10, true);
            FAIL_ON_NULL_FOR_PRIMITIVES = new Feature("FAIL_ON_NULL_FOR_PRIMITIVES", 11, false);
            FAIL_ON_NUMBERS_FOR_ENUMS = new Feature("FAIL_ON_NUMBERS_FOR_ENUMS", 12, false);
            WRAP_EXCEPTIONS = new Feature("WRAP_EXCEPTIONS", 13, true);
            ACCEPT_SINGLE_VALUE_AS_ARRAY = new Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 14, false);
            UNWRAP_ROOT_VALUE = new Feature("UNWRAP_ROOT_VALUE", 15, false);
            ACCEPT_EMPTY_STRING_AS_NULL_OBJECT = new Feature("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", 16, false);
            $VALUES = (new Feature[] {
                USE_ANNOTATIONS, AUTO_DETECT_SETTERS, AUTO_DETECT_CREATORS, AUTO_DETECT_FIELDS, USE_GETTERS_AS_SETTERS, CAN_OVERRIDE_ACCESS_MODIFIERS, USE_BIG_DECIMAL_FOR_FLOATS, USE_BIG_INTEGER_FOR_INTS, USE_JAVA_ARRAY_FOR_JSON_ARRAY, READ_ENUMS_USING_TO_STRING, 
                FAIL_ON_UNKNOWN_PROPERTIES, FAIL_ON_NULL_FOR_PRIMITIVES, FAIL_ON_NUMBERS_FOR_ENUMS, WRAP_EXCEPTIONS, ACCEPT_SINGLE_VALUE_AS_ARRAY, UNWRAP_ROOT_VALUE, ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
    }


    protected final JsonNodeFactory _nodeFactory;
    protected LinkedNode _problemHandlers;
    protected boolean _sortPropertiesAlphabetically;

    public DeserializationConfig(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, SubtypeResolver subtyperesolver, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, HandlerInstantiator handlerinstantiator)
    {
        super(classintrospector, annotationintrospector, visibilitychecker, subtyperesolver, propertynamingstrategy, typefactory, handlerinstantiator, collectFeatureDefaults(org/codehaus/jackson/map/DeserializationConfig$Feature));
        _nodeFactory = JsonNodeFactory.instance;
    }

    protected DeserializationConfig(DeserializationConfig deserializationconfig)
    {
        this(deserializationconfig, deserializationconfig._base);
    }

    protected DeserializationConfig(DeserializationConfig deserializationconfig, int i)
    {
        super(deserializationconfig, i);
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = deserializationconfig._nodeFactory;
        _sortPropertiesAlphabetically = deserializationconfig._sortPropertiesAlphabetically;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, HashMap hashmap, SubtypeResolver subtyperesolver)
    {
        this(deserializationconfig, deserializationconfig._base);
        _mixInAnnotations = hashmap;
        _subtypeResolver = subtyperesolver;
    }

    protected DeserializationConfig(DeserializationConfig deserializationconfig, MapperConfig.Base base)
    {
        super(deserializationconfig, base, deserializationconfig._subtypeResolver);
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = deserializationconfig._nodeFactory;
        _sortPropertiesAlphabetically = deserializationconfig._sortPropertiesAlphabetically;
    }

    protected DeserializationConfig(DeserializationConfig deserializationconfig, JsonNodeFactory jsonnodefactory)
    {
        super(deserializationconfig);
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = jsonnodefactory;
        _sortPropertiesAlphabetically = deserializationconfig._sortPropertiesAlphabetically;
    }

    public void addHandler(DeserializationProblemHandler deserializationproblemhandler)
    {
        if (!LinkedNode.contains(_problemHandlers, deserializationproblemhandler))
        {
            _problemHandlers = new LinkedNode(deserializationproblemhandler, _problemHandlers);
        }
    }

    public boolean canOverrideAccessModifiers()
    {
        return isEnabled(Feature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public void clearHandlers()
    {
        _problemHandlers = null;
    }

    public DeserializationConfig createUnshared(SubtypeResolver subtyperesolver)
    {
        HashMap hashmap = _mixInAnnotations;
        _mixInAnnotationsShared = true;
        return new DeserializationConfig(this, hashmap, subtyperesolver);
    }

    public volatile MapperConfig createUnshared(SubtypeResolver subtyperesolver)
    {
        return createUnshared(subtyperesolver);
    }

    public JsonDeserializer deserializerInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.deserializerInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (JsonDeserializer)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    public void disable(Feature feature)
    {
        super.disable(feature);
    }

    public volatile void disable(MapperConfig.ConfigFeature configfeature)
    {
        disable((Feature)configfeature);
    }

    public void enable(Feature feature)
    {
        super.enable(feature);
    }

    public volatile void enable(MapperConfig.ConfigFeature configfeature)
    {
        enable((Feature)configfeature);
    }

    public void fromAnnotations(Class class1)
    {
        AnnotationIntrospector annotationintrospector = getAnnotationIntrospector();
        class1 = AnnotatedClass.construct(class1, annotationintrospector, null);
        VisibilityChecker visibilitychecker = getDefaultVisibilityChecker();
        _base = _base.withVisibilityChecker(annotationintrospector.findAutoDetectVisibility(class1, visibilitychecker));
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        if (isEnabled(Feature.USE_ANNOTATIONS))
        {
            return super.getAnnotationIntrospector();
        } else
        {
            return NopAnnotationIntrospector.instance;
        }
    }

    public Base64Variant getBase64Variant()
    {
        return Base64Variants.getDefaultVariant();
    }

    public VisibilityChecker getDefaultVisibilityChecker()
    {
        VisibilityChecker visibilitychecker1 = super.getDefaultVisibilityChecker();
        VisibilityChecker visibilitychecker = visibilitychecker1;
        if (!isEnabled(Feature.AUTO_DETECT_SETTERS))
        {
            visibilitychecker = visibilitychecker1.withSetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker1 = visibilitychecker;
        if (!isEnabled(Feature.AUTO_DETECT_CREATORS))
        {
            visibilitychecker1 = visibilitychecker.withCreatorVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker = visibilitychecker1;
        if (!isEnabled(Feature.AUTO_DETECT_FIELDS))
        {
            visibilitychecker = visibilitychecker1.withFieldVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE);
        }
        return visibilitychecker;
    }

    public final JsonNodeFactory getNodeFactory()
    {
        return _nodeFactory;
    }

    public LinkedNode getProblemHandlers()
    {
        return _problemHandlers;
    }

    public BeanDescription introspect(JavaType javatype)
    {
        return getClassIntrospector().forDeserialization(this, javatype, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forClassAnnotations(this, javatype, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forDirectClassAnnotations(this, javatype, this);
    }

    public BeanDescription introspectForCreation(JavaType javatype)
    {
        return getClassIntrospector().forCreation(this, javatype, this);
    }

    public boolean isAnnotationProcessingEnabled()
    {
        return isEnabled(Feature.USE_ANNOTATIONS);
    }

    public boolean isEnabled(Feature feature)
    {
        return (_featureFlags & feature.getMask()) != 0;
    }

    public volatile boolean isEnabled(MapperConfig.ConfigFeature configfeature)
    {
        return super.isEnabled(configfeature);
    }

    public KeyDeserializer keyDeserializerInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.keyDeserializerInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (KeyDeserializer)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    protected DeserializationConfig passSerializationFeatures(int i)
    {
        boolean flag;
        if ((SerializationConfig.Feature.SORT_PROPERTIES_ALPHABETICALLY.getMask() & i) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _sortPropertiesAlphabetically = flag;
        return this;
    }

    public void set(Feature feature, boolean flag)
    {
        super.set(feature, flag);
    }

    public volatile void set(MapperConfig.ConfigFeature configfeature, boolean flag)
    {
        set((Feature)configfeature, flag);
    }

    public boolean shouldSortPropertiesAlphabetically()
    {
        return _sortPropertiesAlphabetically;
    }

    public ValueInstantiator valueInstantiatorInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.valueInstantiatorInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (ValueInstantiator)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    public transient DeserializationConfig with(Feature afeature[])
    {
        int j = _featureFlags;
        int k = afeature.length;
        for (int i = 0; i < k; i++)
        {
            j |= afeature[i].getMask();
        }

        return new DeserializationConfig(this, j);
    }

    public volatile MapperConfig.Impl with(MapperConfig.ConfigFeature aconfigfeature[])
    {
        return with((Feature[])aconfigfeature);
    }

    public DeserializationConfig withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return new DeserializationConfig(this, _base.withAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfig withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAnnotationIntrospector(annotationintrospector);
    }

    public DeserializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return new DeserializationConfig(this, _base.withAppendedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAppendedAnnotationIntrospector(annotationintrospector);
    }

    public DeserializationConfig withClassIntrospector(ClassIntrospector classintrospector)
    {
        return new DeserializationConfig(this, _base.withClassIntrospector(classintrospector));
    }

    public volatile MapperConfig withClassIntrospector(ClassIntrospector classintrospector)
    {
        return withClassIntrospector(classintrospector);
    }

    public DeserializationConfig withDateFormat(DateFormat dateformat)
    {
        if (dateformat == _base.getDateFormat())
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _base.withDateFormat(dateformat));
        }
    }

    public volatile MapperConfig withDateFormat(DateFormat dateformat)
    {
        return withDateFormat(dateformat);
    }

    public DeserializationConfig withHandlerInstantiator(HandlerInstantiator handlerinstantiator)
    {
        if (handlerinstantiator == _base.getHandlerInstantiator())
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _base.withHandlerInstantiator(handlerinstantiator));
        }
    }

    public volatile MapperConfig withHandlerInstantiator(HandlerInstantiator handlerinstantiator)
    {
        return withHandlerInstantiator(handlerinstantiator);
    }

    public DeserializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return new DeserializationConfig(this, _base.withInsertedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withInsertedAnnotationIntrospector(annotationintrospector);
    }

    public DeserializationConfig withNodeFactory(JsonNodeFactory jsonnodefactory)
    {
        return new DeserializationConfig(this, jsonnodefactory);
    }

    public DeserializationConfig withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
    {
        return new DeserializationConfig(this, _base.withPropertyNamingStrategy(propertynamingstrategy));
    }

    public volatile MapperConfig withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
    {
        return withPropertyNamingStrategy(propertynamingstrategy);
    }

    public DeserializationConfig withSubtypeResolver(SubtypeResolver subtyperesolver)
    {
        DeserializationConfig deserializationconfig = new DeserializationConfig(this);
        deserializationconfig._subtypeResolver = subtyperesolver;
        return deserializationconfig;
    }

    public volatile MapperConfig withSubtypeResolver(SubtypeResolver subtyperesolver)
    {
        return withSubtypeResolver(subtyperesolver);
    }

    public DeserializationConfig withTypeFactory(TypeFactory typefactory)
    {
        if (typefactory == _base.getTypeFactory())
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _base.withTypeFactory(typefactory));
        }
    }

    public volatile MapperConfig withTypeFactory(TypeFactory typefactory)
    {
        return withTypeFactory(typefactory);
    }

    public DeserializationConfig withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder)
    {
        return new DeserializationConfig(this, _base.withTypeResolverBuilder(typeresolverbuilder));
    }

    public volatile MapperConfig withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder)
    {
        return withTypeResolverBuilder(typeresolverbuilder);
    }

    public DeserializationConfig withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
    {
        return new DeserializationConfig(this, _base.withVisibility(jsonmethod, visibility));
    }

    public volatile MapperConfig withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
    {
        return withVisibility(jsonmethod, visibility);
    }

    public DeserializationConfig withVisibilityChecker(VisibilityChecker visibilitychecker)
    {
        return new DeserializationConfig(this, _base.withVisibilityChecker(visibilitychecker));
    }

    public volatile MapperConfig withVisibilityChecker(VisibilityChecker visibilitychecker)
    {
        return withVisibilityChecker(visibilitychecker);
    }

    public transient DeserializationConfig without(Feature afeature[])
    {
        int j = _featureFlags;
        int k = afeature.length;
        for (int i = 0; i < k; i++)
        {
            j &= ~afeature[i].getMask();
        }

        return new DeserializationConfig(this, j);
    }

    public volatile MapperConfig.Impl without(MapperConfig.ConfigFeature aconfigfeature[])
    {
        return without((Feature[])aconfigfeature);
    }
}
