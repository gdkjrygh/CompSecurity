// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.codehaus.jackson.map.AbstractTypeResolver;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.BeanPropertyDefinition;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.Deserializers;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.KeyDeserializers;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.impl.CreatorCollector;
import org.codehaus.jackson.map.deser.impl.CreatorProperty;
import org.codehaus.jackson.map.deser.std.StdKeyDeserializers;
import org.codehaus.jackson.map.deser.std.ThrowableDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            BasicDeserializerFactory, BeanDeserializerBuilder, ValueInstantiator, AbstractDeserializer, 
//            BeanDeserializerModifier, BeanDeserializer, SettableAnyProperty, SettableBeanProperty, 
//            ValueInstantiators

public class BeanDeserializerFactory extends BasicDeserializerFactory
{
    /* member class not found */
    class ConfigImpl {}


    private static final Class INIT_CAUSE_PARAMS[] = {
        java/lang/Throwable
    };
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(null);
    protected final org.codehaus.jackson.map.DeserializerFactory.Config _factoryConfig;

    public BeanDeserializerFactory()
    {
        BeanDeserializerFactory(null);
    }

    public BeanDeserializerFactory(org.codehaus.jackson.map.DeserializerFactory.Config config)
    {
        Object obj = config;
        if (config == null)
        {
            obj = new ConfigImpl();
        }
        _factoryConfig = ((org.codehaus.jackson.map.DeserializerFactory.Config) (obj));
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = (BasicBeanDescription)deserializationconfig.introspect(javatype);
        javatype = javatype.getRawClass();
        beanproperty = constructEnumResolver(javatype, deserializationconfig);
        for (obj = ((BasicBeanDescription) (obj)).getFactoryMethods().iterator(); ((Iterator) (obj)).hasNext();)
        {
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)((Iterator) (obj)).next();
            if (deserializationconfig.getAnnotationIntrospector().hasCreatorAnnotation(annotatedmethod))
            {
                if (annotatedmethod.getParameterCount() == 1 && annotatedmethod.getRawType().isAssignableFrom(javatype))
                {
                    if (annotatedmethod.getParameterType(0) != java/lang/String)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Parameter #0 type for factory method (").append(annotatedmethod).append(") not suitable, must be java.lang.String").toString());
                    }
                    if (deserializationconfig.canOverrideAccessModifiers())
                    {
                        ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(beanproperty, annotatedmethod);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unsuitable method (").append(annotatedmethod).append(") decorated with @JsonCreator (for Enum type ").append(javatype.getName()).append(")").toString());
                }
            }
        }

        return StdKeyDeserializers.constructEnumKeyDeserializer(beanproperty);
    }

    protected void _addDeserializerConstructors(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector)
        throws JsonMappingException
    {
label0:
        {
            Iterator iterator = basicbeandescription.getConstructors().iterator();
            Object obj;
            AnnotatedConstructor annotatedconstructor;
            int i;
            int k;
            int j1;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    annotatedconstructor = (AnnotatedConstructor)iterator.next();
                    j1 = annotatedconstructor.getParameterCount();
                } while (j1 < 1);
                boolean flag = annotationintrospector.hasCreatorAnnotation(annotatedconstructor);
                boolean flag1 = visibilitychecker.isCreatorVisible(annotatedconstructor);
                if (j1 == 1)
                {
                    _handleSingleArgumentConstructor(deserializationconfig, basicbeandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedconstructor, flag, flag1);
                    continue;
                }
                if (!flag && !flag1)
                {
                    continue;
                }
                obj = null;
                i = 0;
                k = 0;
                CreatorProperty acreatorproperty[] = new CreatorProperty[j1];
                int j = 0;
                while (j < j1) 
                {
                    AnnotatedParameter annotatedparameter = annotatedconstructor.getParameter(j);
                    Object obj1;
                    Object obj2;
                    int l;
                    int i1;
                    if (annotatedparameter == null)
                    {
                        obj1 = null;
                    } else
                    {
                        obj1 = annotationintrospector.findPropertyNameForParam(annotatedparameter);
                    }
                    obj2 = annotationintrospector.findInjectableValueId(annotatedparameter);
                    if (obj1 != null && ((String) (obj1)).length() > 0)
                    {
                        i1 = i + 1;
                        acreatorproperty[j] = constructCreatorProperty(deserializationconfig, basicbeandescription, ((String) (obj1)), j, annotatedparameter, obj2);
                        obj1 = obj;
                        l = k;
                    } else
                    if (obj2 != null)
                    {
                        l = k + 1;
                        acreatorproperty[j] = constructCreatorProperty(deserializationconfig, basicbeandescription, ((String) (obj1)), j, annotatedparameter, obj2);
                        i1 = i;
                        obj1 = obj;
                    } else
                    {
                        l = k;
                        i1 = i;
                        obj1 = obj;
                        if (obj == null)
                        {
                            obj1 = annotatedparameter;
                            l = k;
                            i1 = i;
                        }
                    }
                    j++;
                    k = l;
                    i = i1;
                    obj = obj1;
                }
                if (flag || i > 0 || k > 0)
                {
                    if (i + k != j1)
                    {
                        break;
                    }
                    creatorcollector.addPropertyCreator(annotatedconstructor, acreatorproperty);
                }
                if (false)
                {
                    creatorcollector.addPropertyCreator(annotatedconstructor, acreatorproperty);
                }
            } while (true);
            if (i == 0 && k + 1 == j1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Delegated constructor with Injectables not yet supported (see [JACKSON-712]) for ").append(annotatedconstructor).toString());
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Argument #").append(((AnnotatedParameter) (obj)).getIndex()).append(" of constructor ").append(annotatedconstructor).append(" has no property name annotation; must have name when multiple-paramater constructor annotated as Creator").toString());
            }
        }
    }

    protected void _addDeserializerFactoryMethods(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector)
        throws JsonMappingException
    {
        Iterator iterator = basicbeandescription.getFactoryMethods().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
            int j = annotatedmethod.getParameterCount();
            if (j < 1)
            {
                continue;
            }
            boolean flag = annotationintrospector.hasCreatorAnnotation(annotatedmethod);
            if (j == 1)
            {
                AnnotatedParameter annotatedparameter = annotatedmethod.getParameter(0);
                String s = annotationintrospector.findPropertyNameForParam(annotatedparameter);
                if (annotationintrospector.findInjectableValueId(annotatedparameter) == null && (s == null || s.length() == 0))
                {
                    _handleSingleArgumentFactory(deserializationconfig, basicbeandescription, visibilitychecker, annotationintrospector, creatorcollector, annotatedmethod, flag);
                    continue;
                }
            } else
            if (!annotationintrospector.hasCreatorAnnotation(annotatedmethod))
            {
                continue;
            }
            CreatorProperty acreatorproperty[] = new CreatorProperty[j];
            for (int i = 0; i < j; i++)
            {
                AnnotatedParameter annotatedparameter1 = annotatedmethod.getParameter(i);
                String s1 = annotationintrospector.findPropertyNameForParam(annotatedparameter1);
                Object obj = annotationintrospector.findInjectableValueId(annotatedparameter1);
                if ((s1 == null || s1.length() == 0) && obj == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Argument #").append(i).append(" of factory method ").append(annotatedmethod).append(" has no property name annotation; must have when multiple-paramater static method annotated as Creator").toString());
                }
                acreatorproperty[i] = constructCreatorProperty(deserializationconfig, basicbeandescription, s1, i, annotatedparameter1, obj);
            }

            creatorcollector.addPropertyCreator(annotatedmethod, acreatorproperty);
        } while (true);
    }

    protected JsonDeserializer _findCustomArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findArrayDeserializer(arraytype, deserializationconfig, deserializerprovider, beanproperty, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findBeanDeserializer(javatype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findCollectionDeserializer(collectiontype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findCollectionLikeDeserializer(collectionliketype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findEnumDeserializer(class1, deserializationconfig, basicbeandescription, beanproperty);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findMapDeserializer(maptype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, keydeserializer, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BasicBeanDescription basicbeandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer1 = ((Deserializers)iterator.next()).findMapLikeDeserializer(mapliketype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty, keydeserializer, typedeserializer, jsondeserializer);
            if (jsondeserializer1 != null)
            {
                return jsondeserializer1;
            }
        }

        return null;
    }

    protected JsonDeserializer _findCustomTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanProperty beanproperty)
        throws JsonMappingException
    {
        for (Iterator iterator = _factoryConfig.deserializers().iterator(); iterator.hasNext();)
        {
            JsonDeserializer jsondeserializer = ((Deserializers)iterator.next()).findTreeNodeDeserializer(class1, deserializationconfig, beanproperty);
            if (jsondeserializer != null)
            {
                return jsondeserializer;
            }
        }

        return null;
    }

    protected boolean _handleSingleArgumentConstructor(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedConstructor annotatedconstructor, boolean flag, 
            boolean flag1)
        throws JsonMappingException
    {
        visibilitychecker = annotatedconstructor.getParameter(0);
        String s = annotationintrospector.findPropertyNameForParam(visibilitychecker);
        annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findInjectableValueId(visibilitychecker)));
        if (annotationintrospector != null || s != null && s.length() > 0)
        {
            creatorcollector.addPropertyCreator(annotatedconstructor, new CreatorProperty[] {
                constructCreatorProperty(deserializationconfig, basicbeandescription, s, 0, visibilitychecker, annotationintrospector)
            });
            return true;
        }
        deserializationconfig = annotatedconstructor.getParameterClass(0);
        if (deserializationconfig == java/lang/String)
        {
            if (flag || flag1)
            {
                creatorcollector.addStringCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationconfig == Integer.TYPE || deserializationconfig == java/lang/Integer)
        {
            if (flag || flag1)
            {
                creatorcollector.addIntCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationconfig == Long.TYPE || deserializationconfig == java/lang/Long)
        {
            if (flag || flag1)
            {
                creatorcollector.addLongCreator(annotatedconstructor);
            }
            return true;
        }
        if (deserializationconfig == Double.TYPE || deserializationconfig == java/lang/Double)
        {
            if (flag || flag1)
            {
                creatorcollector.addDoubleCreator(annotatedconstructor);
            }
            return true;
        }
        if (flag)
        {
            creatorcollector.addDelegatingCreator(annotatedconstructor);
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean _handleSingleArgumentFactory(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, VisibilityChecker visibilitychecker, AnnotationIntrospector annotationintrospector, CreatorCollector creatorcollector, AnnotatedMethod annotatedmethod, boolean flag)
        throws JsonMappingException
    {
        deserializationconfig = annotatedmethod.getParameterClass(0);
        if (deserializationconfig != java/lang/String) goto _L2; else goto _L1
_L1:
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addStringCreator(annotatedmethod);
        }
_L4:
        return true;
_L2:
        if (deserializationconfig != Integer.TYPE && deserializationconfig != java/lang/Integer)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addIntCreator(annotatedmethod);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (deserializationconfig != Long.TYPE && deserializationconfig != java/lang/Long)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addLongCreator(annotatedmethod);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (deserializationconfig != Double.TYPE && deserializationconfig != java/lang/Double)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
        {
            creatorcollector.addDoubleCreator(annotatedmethod);
            return true;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (deserializationconfig == Boolean.TYPE || deserializationconfig == java/lang/Boolean)
        {
            if (flag || visibilitychecker.isCreatorVisible(annotatedmethod))
            {
                creatorcollector.addBooleanCreator(annotatedmethod);
                return true;
            }
        } else
        if (annotationintrospector.hasCreatorAnnotation(annotatedmethod))
        {
            creatorcollector.addDelegatingCreator(annotatedmethod);
            return true;
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected JavaType _mapAbstractType2(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
label0:
        {
            Class class1 = javatype.getRawClass();
            if (!_factoryConfig.hasAbstractTypeResolvers())
            {
                break label0;
            }
            Iterator iterator = _factoryConfig.abstractTypeResolvers().iterator();
            JavaType javatype1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                javatype1 = ((AbstractTypeResolver)iterator.next()).findTypeMapping(deserializationconfig, javatype);
            } while (javatype1 == null || javatype1.getRawClass() == class1);
            return javatype1;
        }
        return null;
    }

    protected void addBeanProps(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanDeserializerBuilder beandeserializerbuilder)
        throws JsonMappingException
    {
        List list = basicbeandescription.findProperties();
        Object obj = deserializationconfig.getAnnotationIntrospector();
        Object obj1 = ((AnnotationIntrospector) (obj)).findIgnoreUnknownProperties(basicbeandescription.getClassInfo());
        if (obj1 != null)
        {
            beandeserializerbuilder.setIgnoreUnknownProperties(((Boolean) (obj1)).booleanValue());
        }
        obj1 = ArrayBuilders.arrayToSet(((AnnotationIntrospector) (obj)).findPropertiesToIgnore(basicbeandescription.getClassInfo()));
        for (obj = ((Set) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); beandeserializerbuilder.addIgnorable((String)((Iterator) (obj)).next())) { }
        AnnotatedMethod annotatedmethod = basicbeandescription.findAnySetter();
        if (annotatedmethod == null)
        {
            obj = basicbeandescription.getIgnoredPropertyNames();
        } else
        {
            obj = basicbeandescription.getIgnoredPropertyNamesForDeser();
        }
        if (obj != null)
        {
            for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); beandeserializerbuilder.addIgnorable((String)((Iterator) (obj)).next())) { }
        }
        obj = new HashMap();
        Iterator iterator1 = list.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj4 = (BeanPropertyDefinition)iterator1.next();
            Object obj3 = ((BeanPropertyDefinition) (obj4)).getName();
            if (!((Set) (obj1)).contains(obj3))
            {
                if (((BeanPropertyDefinition) (obj4)).hasConstructorParameter())
                {
                    beandeserializerbuilder.addCreatorProperty(((BeanPropertyDefinition) (obj4)));
                } else
                if (((BeanPropertyDefinition) (obj4)).hasSetter())
                {
                    obj4 = ((BeanPropertyDefinition) (obj4)).getSetter();
                    if (isIgnorableType(deserializationconfig, basicbeandescription, ((AnnotatedMethod) (obj4)).getParameterClass(0), ((Map) (obj))))
                    {
                        beandeserializerbuilder.addIgnorable(((String) (obj3)));
                    } else
                    {
                        obj3 = constructSettableProperty(deserializationconfig, basicbeandescription, ((String) (obj3)), ((AnnotatedMethod) (obj4)));
                        if (obj3 != null)
                        {
                            beandeserializerbuilder.addProperty(((SettableBeanProperty) (obj3)));
                        }
                    }
                } else
                if (((BeanPropertyDefinition) (obj4)).hasField())
                {
                    obj4 = ((BeanPropertyDefinition) (obj4)).getField();
                    if (isIgnorableType(deserializationconfig, basicbeandescription, ((AnnotatedField) (obj4)).getRawType(), ((Map) (obj))))
                    {
                        beandeserializerbuilder.addIgnorable(((String) (obj3)));
                    } else
                    {
                        obj3 = constructSettableProperty(deserializationconfig, basicbeandescription, ((String) (obj3)), ((AnnotatedField) (obj4)));
                        if (obj3 != null)
                        {
                            beandeserializerbuilder.addProperty(((SettableBeanProperty) (obj3)));
                        }
                    }
                }
            }
        } while (true);
        if (annotatedmethod != null)
        {
            beandeserializerbuilder.setAnySetter(constructAnySetter(deserializationconfig, basicbeandescription, annotatedmethod));
        }
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_GETTERS_AS_SETTERS))
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj2 = (BeanPropertyDefinition)iterator.next();
                if (((BeanPropertyDefinition) (obj2)).hasGetter())
                {
                    String s = ((BeanPropertyDefinition) (obj2)).getName();
                    if (!beandeserializerbuilder.hasProperty(s) && !((Set) (obj1)).contains(s))
                    {
                        obj2 = ((BeanPropertyDefinition) (obj2)).getGetter();
                        Class class1 = ((AnnotatedMethod) (obj2)).getRawType();
                        if ((java/util/Collection.isAssignableFrom(class1) || java/util/Map.isAssignableFrom(class1)) && !((Set) (obj1)).contains(s) && !beandeserializerbuilder.hasProperty(s))
                        {
                            beandeserializerbuilder.addProperty(constructSetterlessProperty(deserializationconfig, basicbeandescription, s, ((AnnotatedMethod) (obj2))));
                        }
                    }
                }
            } while (true);
        }
    }

    protected void addInjectables(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanDeserializerBuilder beandeserializerbuilder)
        throws JsonMappingException
    {
        Object obj = basicbeandescription.findInjectables();
        if (obj != null)
        {
            boolean flag = deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS);
            AnnotatedMember annotatedmember;
            for (deserializationconfig = ((Map) (obj)).entrySet().iterator(); deserializationconfig.hasNext(); beandeserializerbuilder.addInjectable(annotatedmember.getName(), basicbeandescription.resolveType(annotatedmember.getGenericType()), basicbeandescription.getClassAnnotations(), annotatedmember, ((java.util.Map.Entry) (obj)).getKey()))
            {
                obj = (java.util.Map.Entry)deserializationconfig.next();
                annotatedmember = (AnnotatedMember)((java.util.Map.Entry) (obj)).getValue();
                if (flag)
                {
                    annotatedmember.fixAccess();
                }
            }

        }
    }

    protected void addReferenceProperties(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, BeanDeserializerBuilder beandeserializerbuilder)
        throws JsonMappingException
    {
        Object obj = basicbeandescription.findBackReferenceProperties();
        if (obj != null)
        {
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                String s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (AnnotatedMember)((java.util.Map.Entry) (obj1)).getValue();
                if (obj1 instanceof AnnotatedMethod)
                {
                    beandeserializerbuilder.addBackReferenceProperty(s, constructSettableProperty(deserializationconfig, basicbeandescription, ((AnnotatedMember) (obj1)).getName(), (AnnotatedMethod)obj1));
                } else
                {
                    beandeserializerbuilder.addBackReferenceProperty(s, constructSettableProperty(deserializationconfig, basicbeandescription, ((AnnotatedMember) (obj1)).getName(), (AnnotatedField)obj1));
                }
            }

        }
    }

    public JsonDeserializer buildBeanDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = findValueInstantiator(deserializationconfig, basicbeandescription);
        if (!javatype.isAbstract() || ((ValueInstantiator) (obj)).canInstantiate()) goto _L2; else goto _L1
_L1:
        javatype = new AbstractDeserializer(javatype);
_L4:
        return javatype;
_L2:
        javatype = constructBeanDeserializerBuilder(basicbeandescription);
        javatype.setValueInstantiator(((ValueInstantiator) (obj)));
        addBeanProps(deserializationconfig, basicbeandescription, javatype);
        addReferenceProperties(deserializationconfig, basicbeandescription, javatype);
        addInjectables(deserializationconfig, basicbeandescription, javatype);
        obj = javatype;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                obj = javatype;
                if (!iterator.hasNext())
                {
                    break;
                }
                javatype = ((BeanDeserializerModifier)iterator.next()).updateBuilder(deserializationconfig, basicbeandescription, javatype);
            } while (true);
        }
        beanproperty = ((BeanDeserializerBuilder) (obj)).build(beanproperty);
        javatype = beanproperty;
        if (!_factoryConfig.hasDeserializerModifiers())
        {
            continue;
        }
        obj = _factoryConfig.deserializerModifiers().iterator();
        do
        {
            javatype = beanproperty;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            beanproperty = ((BeanDeserializerModifier)((Iterator) (obj)).next()).modifyDeserializer(deserializationconfig, basicbeandescription, beanproperty);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonDeserializer buildThrowableDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        javatype = constructBeanDeserializerBuilder(basicbeandescription);
        javatype.setValueInstantiator(findValueInstantiator(deserializationconfig, basicbeandescription));
        addBeanProps(deserializationconfig, basicbeandescription, javatype);
        Object obj = basicbeandescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (obj != null)
        {
            obj = constructSettableProperty(deserializationconfig, basicbeandescription, "cause", ((AnnotatedMethod) (obj)));
            if (obj != null)
            {
                javatype.addOrReplaceProperty(((SettableBeanProperty) (obj)), true);
            }
        }
        javatype.addIgnorable("localizedMessage");
        javatype.addIgnorable("message");
        javatype.addIgnorable("suppressed");
        obj = javatype;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator1 = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                obj = javatype;
                if (!iterator1.hasNext())
                {
                    break;
                }
                javatype = ((BeanDeserializerModifier)iterator1.next()).updateBuilder(deserializationconfig, basicbeandescription, javatype);
            } while (true);
        }
        beanproperty = ((BeanDeserializerBuilder) (obj)).build(beanproperty);
        javatype = beanproperty;
        if (beanproperty instanceof BeanDeserializer)
        {
            javatype = new ThrowableDeserializer((BeanDeserializer)beanproperty);
        }
        beanproperty = javatype;
        if (_factoryConfig.hasDeserializerModifiers())
        {
            Iterator iterator = _factoryConfig.deserializerModifiers().iterator();
            do
            {
                beanproperty = javatype;
                if (!iterator.hasNext())
                {
                    break;
                }
                javatype = ((BeanDeserializerModifier)iterator.next()).modifyDeserializer(deserializationconfig, basicbeandescription, javatype);
            } while (true);
        }
        return beanproperty;
    }

    protected SettableAnyProperty constructAnySetter(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, AnnotatedMethod annotatedmethod)
        throws JsonMappingException
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            annotatedmethod.fixAccess();
        }
        Object obj = basicbeandescription.bindingsForBeanType().resolveType(annotatedmethod.getParameterType(1));
        org.codehaus.jackson.map.BeanProperty.Std std = new Std(annotatedmethod.getName(), ((JavaType) (obj)), basicbeandescription.getClassAnnotations(), annotatedmethod);
        basicbeandescription = resolveType(deserializationconfig, basicbeandescription, ((JavaType) (obj)), annotatedmethod, std);
        obj = findDeserializerFromAnnotation(deserializationconfig, annotatedmethod, std);
        if (obj != null)
        {
            return new SettableAnyProperty(std, annotatedmethod, basicbeandescription, ((JsonDeserializer) (obj)));
        } else
        {
            return new SettableAnyProperty(std, annotatedmethod, modifyTypeByAnnotation(deserializationconfig, annotatedmethod, basicbeandescription, std.getName()), null);
        }
    }

    protected BeanDeserializerBuilder constructBeanDeserializerBuilder(BasicBeanDescription basicbeandescription)
    {
        return new BeanDeserializerBuilder(basicbeandescription);
    }

    protected CreatorProperty constructCreatorProperty(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, String s, int i, AnnotatedParameter annotatedparameter, Object obj)
        throws JsonMappingException
    {
        Object obj3 = deserializationconfig.getTypeFactory().constructType(annotatedparameter.getParameterType(), basicbeandescription.bindingsForBeanType());
        Object obj1 = new Std(s, ((JavaType) (obj3)), basicbeandescription.getClassAnnotations(), annotatedparameter);
        Object obj2 = resolveType(deserializationconfig, basicbeandescription, ((JavaType) (obj3)), annotatedparameter, ((BeanProperty) (obj1)));
        org.codehaus.jackson.map.BeanProperty.Std std = ((org.codehaus.jackson.map.BeanProperty.Std) (obj1));
        if (obj2 != obj3)
        {
            std = ((org.codehaus.jackson.map.BeanProperty.Std) (obj1)).withType(((JavaType) (obj2)));
        }
        obj3 = findDeserializerFromAnnotation(deserializationconfig, annotatedparameter, std);
        JavaType javatype = modifyTypeByAnnotation(deserializationconfig, annotatedparameter, ((JavaType) (obj2)), s);
        obj2 = (TypeDeserializer)javatype.getTypeHandler();
        obj1 = obj2;
        if (obj2 == null)
        {
            obj1 = findTypeDeserializer(deserializationconfig, javatype, std);
        }
        basicbeandescription = new CreatorProperty(s, javatype, ((TypeDeserializer) (obj1)), basicbeandescription.getClassAnnotations(), annotatedparameter, i, obj);
        deserializationconfig = basicbeandescription;
        if (obj3 != null)
        {
            deserializationconfig = basicbeandescription.withValueDeserializer(((JsonDeserializer) (obj3)));
        }
        return deserializationconfig;
    }

    protected ValueInstantiator constructDefaultValueInstantiator(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException
    {
        boolean flag = deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS);
        CreatorCollector creatorcollector = new CreatorCollector(basicbeandescription, flag);
        AnnotationIntrospector annotationintrospector = deserializationconfig.getAnnotationIntrospector();
        if (basicbeandescription.getType().isConcrete())
        {
            AnnotatedConstructor annotatedconstructor = basicbeandescription.findDefaultConstructor();
            if (annotatedconstructor != null)
            {
                if (flag)
                {
                    ClassUtil.checkAndFixAccess(annotatedconstructor.getAnnotated());
                }
                creatorcollector.setDefaultConstructor(annotatedconstructor);
            }
        }
        VisibilityChecker visibilitychecker = deserializationconfig.getDefaultVisibilityChecker();
        visibilitychecker = deserializationconfig.getAnnotationIntrospector().findAutoDetectVisibility(basicbeandescription.getClassInfo(), visibilitychecker);
        _addDeserializerFactoryMethods(deserializationconfig, basicbeandescription, visibilitychecker, annotationintrospector, creatorcollector);
        _addDeserializerConstructors(deserializationconfig, basicbeandescription, visibilitychecker, annotationintrospector, creatorcollector);
        return creatorcollector.constructValueInstantiator(deserializationconfig);
    }

    protected SettableBeanProperty constructSettableProperty(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, String s, AnnotatedField annotatedfield)
        throws JsonMappingException
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            annotatedfield.fixAccess();
        }
        JavaType javatype1 = basicbeandescription.bindingsForBeanType().resolveType(annotatedfield.getGenericType());
        Object obj1 = new Std(s, javatype1, basicbeandescription.getClassAnnotations(), annotatedfield);
        JavaType javatype = resolveType(deserializationconfig, basicbeandescription, javatype1, annotatedfield, ((BeanProperty) (obj1)));
        Object obj = obj1;
        if (javatype != javatype1)
        {
            obj = ((org.codehaus.jackson.map.BeanProperty.Std) (obj1)).withType(javatype);
        }
        obj = findDeserializerFromAnnotation(deserializationconfig, annotatedfield, ((BeanProperty) (obj)));
        obj1 = modifyTypeByAnnotation(deserializationconfig, annotatedfield, javatype, s);
        s = new FieldProperty(s, ((JavaType) (obj1)), (TypeDeserializer)((JavaType) (obj1)).getTypeHandler(), basicbeandescription.getClassAnnotations(), annotatedfield);
        basicbeandescription = s;
        if (obj != null)
        {
            basicbeandescription = s.withValueDeserializer(((JsonDeserializer) (obj)));
        }
        deserializationconfig = deserializationconfig.getAnnotationIntrospector().findReferenceType(annotatedfield);
        if (deserializationconfig != null && deserializationconfig.isManagedReference())
        {
            basicbeandescription.setManagedReferenceName(deserializationconfig.getName());
        }
        return basicbeandescription;
    }

    protected SettableBeanProperty constructSettableProperty(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, String s, AnnotatedMethod annotatedmethod)
        throws JsonMappingException
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            annotatedmethod.fixAccess();
        }
        JavaType javatype1 = basicbeandescription.bindingsForBeanType().resolveType(annotatedmethod.getParameterType(0));
        Object obj1 = new Std(s, javatype1, basicbeandescription.getClassAnnotations(), annotatedmethod);
        JavaType javatype = resolveType(deserializationconfig, basicbeandescription, javatype1, annotatedmethod, ((BeanProperty) (obj1)));
        Object obj = obj1;
        if (javatype != javatype1)
        {
            obj = ((org.codehaus.jackson.map.BeanProperty.Std) (obj1)).withType(javatype);
        }
        obj = findDeserializerFromAnnotation(deserializationconfig, annotatedmethod, ((BeanProperty) (obj)));
        obj1 = modifyTypeByAnnotation(deserializationconfig, annotatedmethod, javatype, s);
        s = new MethodProperty(s, ((JavaType) (obj1)), (TypeDeserializer)((JavaType) (obj1)).getTypeHandler(), basicbeandescription.getClassAnnotations(), annotatedmethod);
        basicbeandescription = s;
        if (obj != null)
        {
            basicbeandescription = s.withValueDeserializer(((JsonDeserializer) (obj)));
        }
        deserializationconfig = deserializationconfig.getAnnotationIntrospector().findReferenceType(annotatedmethod);
        if (deserializationconfig != null && deserializationconfig.isManagedReference())
        {
            basicbeandescription.setManagedReferenceName(deserializationconfig.getName());
        }
        return basicbeandescription;
    }

    protected SettableBeanProperty constructSetterlessProperty(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, String s, AnnotatedMethod annotatedmethod)
        throws JsonMappingException
    {
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            annotatedmethod.fixAccess();
        }
        JavaType javatype = annotatedmethod.getType(basicbeandescription.bindingsForBeanType());
        JsonDeserializer jsondeserializer = findDeserializerFromAnnotation(deserializationconfig, annotatedmethod, new Std(s, javatype, basicbeandescription.getClassAnnotations(), annotatedmethod));
        deserializationconfig = modifyTypeByAnnotation(deserializationconfig, annotatedmethod, javatype, s);
        basicbeandescription = new SetterlessProperty(s, deserializationconfig, (TypeDeserializer)deserializationconfig.getTypeHandler(), basicbeandescription.getClassAnnotations(), annotatedmethod);
        deserializationconfig = basicbeandescription;
        if (jsondeserializer != null)
        {
            deserializationconfig = basicbeandescription.withValueDeserializer(jsondeserializer);
        }
        return deserializationconfig;
    }

    public JsonDeserializer createBeanDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = javatype;
        if (javatype.isAbstract())
        {
            obj = mapAbstractType(deserializationconfig, javatype);
        }
        BasicBeanDescription basicbeandescription = (BasicBeanDescription)deserializationconfig.introspect(((JavaType) (obj)));
        javatype = findDeserializerFromAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), beanproperty);
        if (javatype != null)
        {
            return javatype;
        }
        JavaType javatype2 = modifyTypeByAnnotation(deserializationconfig, basicbeandescription.getClassInfo(), ((JavaType) (obj)), null);
        javatype = ((JavaType) (obj));
        if (javatype2.getRawClass() != ((JavaType) (obj)).getRawClass())
        {
            javatype = javatype2;
            basicbeandescription = (BasicBeanDescription)deserializationconfig.introspect(javatype);
        }
        obj = _findCustomBeanDeserializer(javatype, deserializationconfig, deserializerprovider, basicbeandescription, beanproperty);
        if (obj != null)
        {
            return ((JsonDeserializer) (obj));
        }
        if (javatype.isThrowable())
        {
            return buildThrowableDeserializer(deserializationconfig, javatype, basicbeandescription, beanproperty);
        }
        if (javatype.isAbstract())
        {
            JavaType javatype1 = materializeAbstractType(deserializationconfig, basicbeandescription);
            if (javatype1 != null)
            {
                return buildBeanDeserializer(deserializationconfig, javatype1, (BasicBeanDescription)deserializationconfig.introspect(javatype1), beanproperty);
            }
        }
        deserializerprovider = findStdBeanDeserializer(deserializationconfig, deserializerprovider, javatype, beanproperty);
        if (deserializerprovider != null)
        {
            return deserializerprovider;
        }
        if (!isPotentialBeanType(javatype.getRawClass()))
        {
            return null;
        } else
        {
            return buildBeanDeserializer(deserializationconfig, javatype, basicbeandescription, beanproperty);
        }
    }

    public KeyDeserializer createKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (!_factoryConfig.hasKeyDeserializers()) goto _L2; else goto _L1
_L1:
        BasicBeanDescription basicbeandescription;
        Iterator iterator;
        basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectClassAnnotations(javatype.getRawClass());
        iterator = _factoryConfig.keyDeserializers().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        Object obj = ((KeyDeserializers)iterator.next()).findKeyDeserializer(javatype, deserializationconfig, basicbeandescription, beanproperty);
        if (obj == null) goto _L5; else goto _L4
_L4:
        return ((KeyDeserializer) (obj));
_L2:
        obj = javatype.getRawClass();
        if (obj == java/lang/String || obj == java/lang/Object)
        {
            return StdKeyDeserializers.constructStringKeyDeserializer(deserializationconfig, javatype);
        }
        KeyDeserializer keydeserializer = (KeyDeserializer)_keyDeserializers.get(javatype);
        obj = keydeserializer;
        if (keydeserializer == null)
        {
            if (javatype.isEnumType())
            {
                return _createEnumKeyDeserializer(deserializationconfig, javatype, beanproperty);
            } else
            {
                return StdKeyDeserializers.findStringBasedKeyDeserializer(deserializationconfig, javatype);
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException
    {
        Object obj1;
label0:
        {
            Object obj = basicbeandescription.getClassInfo();
            obj1 = deserializationconfig.getAnnotationIntrospector().findValueInstantiator(((org.codehaus.jackson.map.introspect.AnnotatedClass) (obj)));
            Iterator iterator;
            ValueInstantiators valueinstantiators;
            if (obj1 != null)
            {
                if (obj1 instanceof ValueInstantiator)
                {
                    obj = (ValueInstantiator)obj1;
                } else
                {
                    if (!(obj1 instanceof Class))
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Invalid value instantiator returned for type ").append(basicbeandescription).append(": neither a Class nor ValueInstantiator").toString());
                    }
                    obj1 = (Class)obj1;
                    if (!org/codehaus/jackson/map/deser/ValueInstantiator.isAssignableFrom(((Class) (obj1))))
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Invalid instantiator Class<?> returned for type ").append(basicbeandescription).append(": ").append(((Class) (obj1)).getName()).append(" not a ValueInstantiator").toString());
                    }
                    obj = deserializationconfig.valueInstantiatorInstance(((org.codehaus.jackson.map.introspect.Annotated) (obj)), ((Class) (obj1)));
                }
            } else
            {
                obj = constructDefaultValueInstantiator(deserializationconfig, basicbeandescription);
            }
            obj1 = obj;
            if (!_factoryConfig.hasValueInstantiators())
            {
                break label0;
            }
            iterator = _factoryConfig.valueInstantiators().iterator();
            do
            {
                obj1 = obj;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                valueinstantiators = (ValueInstantiators)iterator.next();
                obj1 = valueinstantiators.findValueInstantiator(deserializationconfig, basicbeandescription, ((ValueInstantiator) (obj)));
                obj = obj1;
            } while (obj1 != null);
            throw new JsonMappingException((new StringBuilder()).append("Broken registered ValueInstantiators (of type ").append(valueinstantiators.getClass().getName()).append("): returned null ValueInstantiator").toString());
        }
        return ((ValueInstantiator) (obj1));
    }

    public final org.codehaus.jackson.map.DeserializerFactory.Config getConfig()
    {
        return _factoryConfig;
    }

    protected boolean isIgnorableType(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription, Class class1, Map map)
    {
        map = (Boolean)map.get(class1);
        basicbeandescription = map;
        if (map == null)
        {
            basicbeandescription = (BasicBeanDescription)deserializationconfig.introspectClassAnnotations(class1);
            deserializationconfig = deserializationconfig.getAnnotationIntrospector().isIgnorableType(basicbeandescription.getClassInfo());
            basicbeandescription = deserializationconfig;
            if (deserializationconfig == null)
            {
                basicbeandescription = Boolean.FALSE;
            }
        }
        return basicbeandescription.booleanValue();
    }

    protected boolean isPotentialBeanType(Class class1)
    {
        String s = ClassUtil.canBeABeanType(class1);
        if (s != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not deserialize Class ").append(class1.getName()).append(" (of type ").append(s).append(") as a Bean").toString());
        }
        if (ClassUtil.isProxyType(class1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not deserialize Proxy class ").append(class1.getName()).append(" as a Bean").toString());
        }
        s = ClassUtil.isLocalType(class1, true);
        if (s != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not deserialize Class ").append(class1.getName()).append(" (of type ").append(s).append(") as a Bean").toString());
        } else
        {
            return true;
        }
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        do
        {
            JavaType javatype1 = _mapAbstractType2(deserializationconfig, javatype);
            if (javatype1 == null)
            {
                return javatype;
            }
            Class class1 = javatype.getRawClass();
            Class class2 = javatype1.getRawClass();
            if (class1 == class2 || !class1.isAssignableFrom(class2))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid abstract type resolution from ").append(javatype).append(" to ").append(javatype1).append(": latter is not a subtype of former").toString());
            }
            javatype = javatype1;
        } while (true);
    }

    protected JavaType materializeAbstractType(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException
    {
        basicbeandescription = basicbeandescription.getType();
        for (Iterator iterator = _factoryConfig.abstractTypeResolvers().iterator(); iterator.hasNext();)
        {
            JavaType javatype = ((AbstractTypeResolver)iterator.next()).resolveAbstractType(deserializationconfig, basicbeandescription);
            if (javatype != null)
            {
                return javatype;
            }
        }

        return null;
    }

    public DeserializerFactory withConfig(org.codehaus.jackson.map.DeserializerFactory.Config config)
    {
        if (_factoryConfig == config)
        {
            return this;
        }
        if (getClass() != org/codehaus/jackson/map/deser/BeanDeserializerFactory)
        {
            throw new IllegalStateException((new StringBuilder()).append("Subtype of BeanDeserializerFactory (").append(getClass().getName()).append(") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with ").append("additional deserializer definitions").toString());
        } else
        {
            return new BeanDeserializerFactory(config);
        }
    }


}
