// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.jsontype.impl.StdSubtypeResolver;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.StdDateFormat;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package org.codehaus.jackson.map:
//            HandlerInstantiator, ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, 
//            BeanDescription

public abstract class MapperConfig
    implements ClassIntrospector.MixInResolver
{
    public static class Base
    {

        protected final AnnotationIntrospector _annotationIntrospector;
        protected final ClassIntrospector _classIntrospector;
        protected final DateFormat _dateFormat;
        protected final HandlerInstantiator _handlerInstantiator;
        protected final PropertyNamingStrategy _propertyNamingStrategy;
        protected final TypeFactory _typeFactory;
        protected final TypeResolverBuilder _typeResolverBuilder;
        protected final VisibilityChecker _visibilityChecker;

        public AnnotationIntrospector getAnnotationIntrospector()
        {
            return _annotationIntrospector;
        }

        public ClassIntrospector getClassIntrospector()
        {
            return _classIntrospector;
        }

        public DateFormat getDateFormat()
        {
            return _dateFormat;
        }

        public HandlerInstantiator getHandlerInstantiator()
        {
            return _handlerInstantiator;
        }

        public PropertyNamingStrategy getPropertyNamingStrategy()
        {
            return _propertyNamingStrategy;
        }

        public TypeFactory getTypeFactory()
        {
            return _typeFactory;
        }

        public TypeResolverBuilder getTypeResolverBuilder()
        {
            return _typeResolverBuilder;
        }

        public VisibilityChecker getVisibilityChecker()
        {
            return _visibilityChecker;
        }

        public Base withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
        {
            return new Base(_classIntrospector, annotationintrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
        {
            return withAnnotationIntrospector(AnnotationIntrospector.Pair.create(_annotationIntrospector, annotationintrospector));
        }

        public Base withClassIntrospector(ClassIntrospector classintrospector)
        {
            return new Base(classintrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withDateFormat(DateFormat dateformat)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, dateformat, _handlerInstantiator);
        }

        public Base withHandlerInstantiator(HandlerInstantiator handlerinstantiator)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, handlerinstantiator);
        }

        public Base withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
        {
            return withAnnotationIntrospector(AnnotationIntrospector.Pair.create(annotationintrospector, _annotationIntrospector));
        }

        public Base withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker, propertynamingstrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withTypeFactory(TypeFactory typefactory)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, typefactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, typeresolverbuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return new Base(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(jsonmethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base withVisibilityChecker(VisibilityChecker visibilitychecker)
        {
            return new Base(_classIntrospector, _annotationIntrospector, visibilitychecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator);
        }

        public Base(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, TypeResolverBuilder typeresolverbuilder, DateFormat dateformat, 
                HandlerInstantiator handlerinstantiator)
        {
            _classIntrospector = classintrospector;
            _annotationIntrospector = annotationintrospector;
            _visibilityChecker = visibilitychecker;
            _propertyNamingStrategy = propertynamingstrategy;
            _typeFactory = typefactory;
            _typeResolverBuilder = typeresolverbuilder;
            _dateFormat = dateformat;
            _handlerInstantiator = handlerinstantiator;
        }
    }

    public static interface ConfigFeature
    {

        public abstract boolean enabledByDefault();

        public abstract int getMask();
    }

    static abstract class Impl extends MapperConfig
    {

        protected int _featureFlags;

        static int collectFeatureDefaults(Class class1)
        {
            int j = 0;
            class1 = (Enum[])class1.getEnumConstants();
            int l = class1.length;
            for (int i = 0; i < l;)
            {
                Object obj = class1[i];
                int k = j;
                if (((ConfigFeature)obj).enabledByDefault())
                {
                    k = j | ((ConfigFeature)obj).getMask();
                }
                i++;
                j = k;
            }

            return j;
        }

        public void disable(ConfigFeature configfeature)
        {
            _featureFlags = _featureFlags & ~configfeature.getMask();
        }

        public void enable(ConfigFeature configfeature)
        {
            _featureFlags = _featureFlags | configfeature.getMask();
        }

        public boolean isEnabled(ConfigFeature configfeature)
        {
            return (_featureFlags & configfeature.getMask()) != 0;
        }

        public void set(ConfigFeature configfeature, boolean flag)
        {
            if (flag)
            {
                enable(configfeature);
                return;
            } else
            {
                disable(configfeature);
                return;
            }
        }

        public transient abstract Impl with(ConfigFeature aconfigfeature[]);

        public transient abstract Impl without(ConfigFeature aconfigfeature[]);

        protected Impl(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, SubtypeResolver subtyperesolver, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, HandlerInstantiator handlerinstantiator, 
                int i)
        {
            super(classintrospector, annotationintrospector, visibilitychecker, subtyperesolver, propertynamingstrategy, typefactory, handlerinstantiator);
            _featureFlags = i;
        }

        protected Impl(Impl impl)
        {
            super(impl);
            _featureFlags = impl._featureFlags;
        }

        protected Impl(Impl impl, int i)
        {
            super(impl);
            _featureFlags = i;
        }

        protected Impl(Impl impl, Base base, SubtypeResolver subtyperesolver)
        {
            super(impl, base, subtyperesolver);
            _featureFlags = impl._featureFlags;
        }
    }


    protected static final DateFormat DEFAULT_DATE_FORMAT;
    protected Base _base;
    protected HashMap _mixInAnnotations;
    protected boolean _mixInAnnotationsShared;
    protected SubtypeResolver _subtypeResolver;

    protected MapperConfig(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, SubtypeResolver subtyperesolver, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, HandlerInstantiator handlerinstantiator)
    {
        _base = new Base(classintrospector, annotationintrospector, visibilitychecker, propertynamingstrategy, typefactory, null, DEFAULT_DATE_FORMAT, handlerinstantiator);
        _subtypeResolver = subtyperesolver;
        _mixInAnnotationsShared = true;
    }

    protected MapperConfig(MapperConfig mapperconfig)
    {
        this(mapperconfig, mapperconfig._base, mapperconfig._subtypeResolver);
    }

    protected MapperConfig(MapperConfig mapperconfig, Base base, SubtypeResolver subtyperesolver)
    {
        _base = base;
        _subtypeResolver = subtyperesolver;
        _mixInAnnotationsShared = true;
        _mixInAnnotations = mapperconfig._mixInAnnotations;
    }

    public final void addMixInAnnotations(Class class1, Class class2)
    {
        if (_mixInAnnotations != null) goto _L2; else goto _L1
_L1:
        _mixInAnnotationsShared = false;
        _mixInAnnotations = new HashMap();
_L4:
        _mixInAnnotations.put(new ClassKey(class1), class2);
        return;
_L2:
        if (_mixInAnnotationsShared)
        {
            _mixInAnnotationsShared = false;
            _mixInAnnotations = new HashMap(_mixInAnnotations);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        _base = _base.withAnnotationIntrospector(AnnotationIntrospector.Pair.create(getAnnotationIntrospector(), annotationintrospector));
    }

    public abstract boolean canOverrideAccessModifiers();

    public JavaType constructSpecializedType(JavaType javatype, Class class1)
    {
        return getTypeFactory().constructSpecializedType(javatype, class1);
    }

    public final JavaType constructType(Class class1)
    {
        return getTypeFactory().constructType(class1, (TypeBindings)null);
    }

    public final JavaType constructType(TypeReference typereference)
    {
        return getTypeFactory().constructType(typereference.getType(), (TypeBindings)null);
    }

    public abstract MapperConfig createUnshared(SubtypeResolver subtyperesolver);

    public final Class findMixInClassFor(Class class1)
    {
        if (_mixInAnnotations == null)
        {
            return null;
        } else
        {
            return (Class)_mixInAnnotations.get(new ClassKey(class1));
        }
    }

    public abstract void fromAnnotations(Class class1);

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _base.getAnnotationIntrospector();
    }

    public ClassIntrospector getClassIntrospector()
    {
        return _base.getClassIntrospector();
    }

    public final DateFormat getDateFormat()
    {
        return _base.getDateFormat();
    }

    public final TypeResolverBuilder getDefaultTyper(JavaType javatype)
    {
        return _base.getTypeResolverBuilder();
    }

    public VisibilityChecker getDefaultVisibilityChecker()
    {
        return _base.getVisibilityChecker();
    }

    public final HandlerInstantiator getHandlerInstantiator()
    {
        return _base.getHandlerInstantiator();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy()
    {
        return _base.getPropertyNamingStrategy();
    }

    public final SubtypeResolver getSubtypeResolver()
    {
        if (_subtypeResolver == null)
        {
            _subtypeResolver = new StdSubtypeResolver();
        }
        return _subtypeResolver;
    }

    public final TypeFactory getTypeFactory()
    {
        return _base.getTypeFactory();
    }

    public final void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        _base = _base.withAnnotationIntrospector(AnnotationIntrospector.Pair.create(annotationintrospector, getAnnotationIntrospector()));
    }

    public BeanDescription introspectClassAnnotations(Class class1)
    {
        return introspectClassAnnotations(constructType(class1));
    }

    public abstract BeanDescription introspectClassAnnotations(JavaType javatype);

    public BeanDescription introspectDirectClassAnnotations(Class class1)
    {
        return introspectDirectClassAnnotations(constructType(class1));
    }

    public abstract BeanDescription introspectDirectClassAnnotations(JavaType javatype);

    public abstract boolean isAnnotationProcessingEnabled();

    public abstract boolean isEnabled(ConfigFeature configfeature);

    public final int mixInCount()
    {
        if (_mixInAnnotations == null)
        {
            return 0;
        } else
        {
            return _mixInAnnotations.size();
        }
    }

    public final void setAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        _base = _base.withAnnotationIntrospector(annotationintrospector);
    }

    public void setDateFormat(DateFormat dateformat)
    {
        DateFormat dateformat1 = dateformat;
        if (dateformat == null)
        {
            dateformat1 = DEFAULT_DATE_FORMAT;
        }
        _base = _base.withDateFormat(dateformat1);
    }

    public final void setMixInAnnotations(Map map)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (map != null)
        {
            obj = obj1;
            if (map.size() > 0)
            {
                HashMap hashmap = new HashMap(map.size());
                map = map.entrySet().iterator();
                do
                {
                    obj = hashmap;
                    if (!map.hasNext())
                    {
                        break;
                    }
                    obj = (java.util.Map.Entry)map.next();
                    hashmap.put(new ClassKey((Class)((java.util.Map.Entry) (obj)).getKey()), ((java.util.Map.Entry) (obj)).getValue());
                } while (true);
            }
        }
        _mixInAnnotationsShared = false;
        _mixInAnnotations = ((HashMap) (obj));
    }

    public abstract boolean shouldSortPropertiesAlphabetically();

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.typeIdResolverInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (TypeIdResolver)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    public TypeResolverBuilder typeResolverBuilderInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.typeResolverBuilderInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (TypeResolverBuilder)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    public abstract MapperConfig withAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfig withClassIntrospector(ClassIntrospector classintrospector);

    public abstract MapperConfig withDateFormat(DateFormat dateformat);

    public abstract MapperConfig withHandlerInstantiator(HandlerInstantiator handlerinstantiator);

    public abstract MapperConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfig withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy);

    public abstract MapperConfig withSubtypeResolver(SubtypeResolver subtyperesolver);

    public abstract MapperConfig withTypeFactory(TypeFactory typefactory);

    public abstract MapperConfig withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder);

    public abstract MapperConfig withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract MapperConfig withVisibilityChecker(VisibilityChecker visibilitychecker);

    static 
    {
        DEFAULT_DATE_FORMAT = StdDateFormat.instance;
    }
}
