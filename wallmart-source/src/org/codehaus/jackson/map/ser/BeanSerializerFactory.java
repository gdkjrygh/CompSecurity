// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.BeanPropertyDefinition;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerFactory;
import org.codehaus.jackson.map.Serializers;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.ser.std.MapSerializer;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BasicSerializerFactory, PropertyBuilder, BeanPropertyWriter, BeanSerializerModifier, 
//            BeanSerializerBuilder, AnyGetterWriter, FilteredBeanPropertyWriter

public class BeanSerializerFactory extends BasicSerializerFactory
{
    public static class ConfigImpl extends org.codehaus.jackson.map.SerializerFactory.Config
    {

        protected static final BeanSerializerModifier NO_MODIFIERS[] = new BeanSerializerModifier[0];
        protected static final Serializers NO_SERIALIZERS[] = new Serializers[0];
        protected final Serializers _additionalKeySerializers[];
        protected final Serializers _additionalSerializers[];
        protected final BeanSerializerModifier _modifiers[];

        public boolean hasKeySerializers()
        {
            return _additionalKeySerializers.length > 0;
        }

        public boolean hasSerializerModifiers()
        {
            return _modifiers.length > 0;
        }

        public boolean hasSerializers()
        {
            return _additionalSerializers.length > 0;
        }

        public Iterable keySerializers()
        {
            return ArrayBuilders.arrayAsIterable(_additionalKeySerializers);
        }

        public Iterable serializerModifiers()
        {
            return ArrayBuilders.arrayAsIterable(_modifiers);
        }

        public Iterable serializers()
        {
            return ArrayBuilders.arrayAsIterable(_additionalSerializers);
        }

        public org.codehaus.jackson.map.SerializerFactory.Config withAdditionalKeySerializers(Serializers serializers1)
        {
            if (serializers1 == null)
            {
                throw new IllegalArgumentException("Can not pass null Serializers");
            } else
            {
                serializers1 = (Serializers[])ArrayBuilders.insertInListNoDup(_additionalKeySerializers, serializers1);
                return new ConfigImpl(_additionalSerializers, serializers1, _modifiers);
            }
        }

        public org.codehaus.jackson.map.SerializerFactory.Config withAdditionalSerializers(Serializers serializers1)
        {
            if (serializers1 == null)
            {
                throw new IllegalArgumentException("Can not pass null Serializers");
            } else
            {
                return new ConfigImpl((Serializers[])ArrayBuilders.insertInListNoDup(_additionalSerializers, serializers1), _additionalKeySerializers, _modifiers);
            }
        }

        public org.codehaus.jackson.map.SerializerFactory.Config withSerializerModifier(BeanSerializerModifier beanserializermodifier)
        {
            if (beanserializermodifier == null)
            {
                throw new IllegalArgumentException("Can not pass null modifier");
            } else
            {
                beanserializermodifier = (BeanSerializerModifier[])ArrayBuilders.insertInListNoDup(_modifiers, beanserializermodifier);
                return new ConfigImpl(_additionalSerializers, _additionalKeySerializers, beanserializermodifier);
            }
        }


        public ConfigImpl()
        {
            this(null, null, null);
        }

        protected ConfigImpl(Serializers aserializers[], Serializers aserializers1[], BeanSerializerModifier abeanserializermodifier[])
        {
            Serializers aserializers2[] = aserializers;
            if (aserializers == null)
            {
                aserializers2 = NO_SERIALIZERS;
            }
            _additionalSerializers = aserializers2;
            aserializers = aserializers1;
            if (aserializers1 == null)
            {
                aserializers = NO_SERIALIZERS;
            }
            _additionalKeySerializers = aserializers;
            aserializers = abeanserializermodifier;
            if (abeanserializermodifier == null)
            {
                aserializers = NO_MODIFIERS;
            }
            _modifiers = aserializers;
        }
    }


    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    protected final org.codehaus.jackson.map.SerializerFactory.Config _factoryConfig;

    protected BeanSerializerFactory(org.codehaus.jackson.map.SerializerFactory.Config config)
    {
        Object obj = config;
        if (config == null)
        {
            obj = new ConfigImpl();
        }
        _factoryConfig = ((org.codehaus.jackson.map.SerializerFactory.Config) (obj));
    }

    protected BeanPropertyWriter _constructWriter(SerializationConfig serializationconfig, TypeBindings typebindings, PropertyBuilder propertybuilder, boolean flag, String s, AnnotatedMember annotatedmember)
        throws JsonMappingException
    {
        if (serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            annotatedmember.fixAccess();
        }
        JavaType javatype = annotatedmember.getType(typebindings);
        org.codehaus.jackson.map.BeanProperty.Std std = new org.codehaus.jackson.map.BeanProperty.Std(s, javatype, propertybuilder.getClassAnnotations(), annotatedmember);
        JsonSerializer jsonserializer = findSerializerFromAnnotation(serializationconfig, annotatedmember, std);
        typebindings = null;
        if (ClassUtil.isCollectionMapOrArray(javatype.getRawClass()))
        {
            typebindings = findPropertyContentTypeSerializer(javatype, serializationconfig, annotatedmember, std);
        }
        typebindings = propertybuilder.buildWriter(s, javatype, jsonserializer, findPropertyTypeSerializer(javatype, serializationconfig, annotatedmember, std), typebindings, annotatedmember, flag);
        typebindings.setViews(serializationconfig.getAnnotationIntrospector().findSerializationViews(annotatedmember));
        return typebindings;
    }

    protected JsonSerializer constructBeanSerializer(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (basicbeandescription.getBeanClass() == java/lang/Object)
        {
            throw new IllegalArgumentException("Can not create bean serializer for Object.class");
        }
        BeanSerializerBuilder beanserializerbuilder = constructBeanSerializerBuilder(basicbeandescription);
        Object obj1 = findBeanProperties(serializationconfig, basicbeandescription);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList();
        }
        obj1 = obj;
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator1 = _factoryConfig.serializerModifiers().iterator();
            do
            {
                obj1 = obj;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)iterator1.next()).changeProperties(serializationconfig, basicbeandescription, ((List) (obj)));
            } while (true);
        }
        obj = sortBeanProperties(serializationconfig, basicbeandescription, filterBeanProperties(serializationconfig, basicbeandescription, ((List) (obj1))));
        obj1 = obj;
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator2 = _factoryConfig.serializerModifiers().iterator();
            do
            {
                obj1 = obj;
                if (!iterator2.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)iterator2.next()).orderProperties(serializationconfig, basicbeandescription, ((List) (obj)));
            } while (true);
        }
        beanserializerbuilder.setProperties(((List) (obj1)));
        beanserializerbuilder.setFilterId(findFilterId(serializationconfig, basicbeandescription));
        obj = basicbeandescription.findAnyGetter();
        if (obj != null)
        {
            if (serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
            {
                ((AnnotatedMethod) (obj)).fixAccess();
            }
            JavaType javatype = ((AnnotatedMethod) (obj)).getType(basicbeandescription.bindingsForBeanType());
            beanserializerbuilder.setAnyGetter(new AnyGetterWriter(((AnnotatedMethod) (obj)), MapSerializer.construct(null, javatype, serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.USE_STATIC_TYPING), createTypeSerializer(serializationconfig, javatype.getContentType(), beanproperty), beanproperty, null, null)));
        }
        processViews(serializationconfig, beanserializerbuilder);
        obj = beanserializerbuilder;
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            beanproperty = beanserializerbuilder;
            do
            {
                obj = beanproperty;
                if (!iterator.hasNext())
                {
                    break;
                }
                beanproperty = ((BeanSerializerModifier)iterator.next()).updateBuilder(serializationconfig, basicbeandescription, beanproperty);
            } while (true);
        }
        beanproperty = ((BeanSerializerBuilder) (obj)).build();
        serializationconfig = beanproperty;
        if (beanproperty == null)
        {
            serializationconfig = beanproperty;
            if (basicbeandescription.hasKnownClassAnnotations())
            {
                serializationconfig = ((BeanSerializerBuilder) (obj)).createDummy();
            }
        }
        return serializationconfig;
    }

    protected BeanSerializerBuilder constructBeanSerializerBuilder(BasicBeanDescription basicbeandescription)
    {
        return new BeanSerializerBuilder(basicbeandescription);
    }

    protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanpropertywriter, Class aclass[])
    {
        return FilteredBeanPropertyWriter.constructViewBased(beanpropertywriter, aclass);
    }

    protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription)
    {
        return new PropertyBuilder(serializationconfig, basicbeandescription);
    }

    public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, BeanProperty beanproperty)
    {
        if (_factoryConfig.hasKeySerializers()) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer = null;
_L4:
        return jsonserializer;
_L2:
        JsonSerializer jsonserializer1;
        BasicBeanDescription basicbeandescription = (BasicBeanDescription)serializationconfig.introspectClassAnnotations(javatype.getRawClass());
        jsonserializer = null;
        Iterator iterator = _factoryConfig.keySerializers().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer1 = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, basicbeandescription, beanproperty);
            jsonserializer = jsonserializer1;
        } while (jsonserializer1 == null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return jsonserializer1;
    }

    public JsonSerializer createSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj1 = (BasicBeanDescription)serializationconfig.introspect(javatype);
        Object obj = findSerializerFromAnnotation(serializationconfig, ((BasicBeanDescription) (obj1)).getClassInfo(), beanproperty);
        if (obj != null)
        {
            return ((JsonSerializer) (obj));
        }
        JavaType javatype1 = modifyTypeByAnnotation(serializationconfig, ((BasicBeanDescription) (obj1)).getClassInfo(), javatype);
        boolean flag;
        if (javatype1 != javatype)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        if (javatype1 != javatype)
        {
            obj = obj1;
            if (javatype1.getRawClass() != javatype.getRawClass())
            {
                obj = (BasicBeanDescription)serializationconfig.introspect(javatype1);
            }
        }
        if (javatype.isContainerType())
        {
            return buildContainerSerializer(serializationconfig, javatype1, ((BasicBeanDescription) (obj)), beanproperty, flag);
        }
        for (javatype = _factoryConfig.serializers().iterator(); javatype.hasNext();)
        {
            obj1 = ((Serializers)javatype.next()).findSerializer(serializationconfig, javatype1, ((org.codehaus.jackson.map.BeanDescription) (obj)), beanproperty);
            if (obj1 != null)
            {
                return ((JsonSerializer) (obj1));
            }
        }

        obj1 = findSerializerByLookup(javatype1, serializationconfig, ((BasicBeanDescription) (obj)), beanproperty, flag);
        javatype = ((JavaType) (obj1));
        if (obj1 == null)
        {
            JsonSerializer jsonserializer = findSerializerByPrimaryType(javatype1, serializationconfig, ((BasicBeanDescription) (obj)), beanproperty, flag);
            javatype = jsonserializer;
            if (jsonserializer == null)
            {
                JsonSerializer jsonserializer1 = findBeanSerializer(serializationconfig, javatype1, ((BasicBeanDescription) (obj)), beanproperty);
                javatype = jsonserializer1;
                if (jsonserializer1 == null)
                {
                    javatype = findSerializerByAddonType(serializationconfig, javatype1, ((BasicBeanDescription) (obj)), beanproperty, flag);
                }
            }
        }
        return javatype;
    }

    protected Iterable customSerializers()
    {
        return _factoryConfig.serializers();
    }

    protected List filterBeanProperties(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        serializationconfig = serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(basicbeandescription.getClassInfo());
        if (serializationconfig != null && serializationconfig.length > 0)
        {
            serializationconfig = ArrayBuilders.arrayToSet(serializationconfig);
            basicbeandescription = list.iterator();
            do
            {
                if (!basicbeandescription.hasNext())
                {
                    break;
                }
                if (serializationconfig.contains(((BeanPropertyWriter)basicbeandescription.next()).getName()))
                {
                    basicbeandescription.remove();
                }
            } while (true);
        }
        return list;
    }

    protected List findBeanProperties(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector;
        Object obj;
        obj = basicbeandescription.findProperties();
        annotationintrospector = serializationconfig.getAnnotationIntrospector();
        removeIgnorableTypes(serializationconfig, basicbeandescription, ((List) (obj)));
        if (serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.REQUIRE_SETTERS_FOR_GETTERS))
        {
            removeSetterlessGetters(serializationconfig, basicbeandescription, ((List) (obj)));
        }
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        basicbeandescription = null;
_L4:
        return basicbeandescription;
_L2:
        boolean flag = usesStaticTyping(serializationconfig, basicbeandescription, null, null);
        PropertyBuilder propertybuilder = constructPropertyBuilder(serializationconfig, basicbeandescription);
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        TypeBindings typebindings = basicbeandescription.bindingsForBeanType();
        obj = ((List) (obj)).iterator();
        do
        {
            basicbeandescription = arraylist;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            Object obj1 = (BeanPropertyDefinition)((Iterator) (obj)).next();
            basicbeandescription = ((BeanPropertyDefinition) (obj1)).getAccessor();
            org.codehaus.jackson.map.AnnotationIntrospector.ReferenceProperty referenceproperty = annotationintrospector.findReferenceType(basicbeandescription);
            if (referenceproperty == null || !referenceproperty.isBackReference())
            {
                obj1 = ((BeanPropertyDefinition) (obj1)).getName();
                if (basicbeandescription instanceof AnnotatedMethod)
                {
                    arraylist.add(_constructWriter(serializationconfig, typebindings, propertybuilder, flag, ((String) (obj1)), (AnnotatedMethod)basicbeandescription));
                } else
                {
                    arraylist.add(_constructWriter(serializationconfig, typebindings, propertybuilder, flag, ((String) (obj1)), (AnnotatedField)basicbeandescription));
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer findBeanSerializer(SerializationConfig serializationconfig, JavaType javatype, BasicBeanDescription basicbeandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (isPotentialBeanType(javatype.getRawClass())) goto _L2; else goto _L1
_L1:
        javatype = null;
_L4:
        return javatype;
_L2:
        beanproperty = constructBeanSerializer(serializationconfig, basicbeandescription, beanproperty);
        javatype = beanproperty;
        if (!_factoryConfig.hasSerializerModifiers())
        {
            continue;
        }
        Iterator iterator = _factoryConfig.serializerModifiers().iterator();
        do
        {
            javatype = beanproperty;
            if (!iterator.hasNext())
            {
                continue;
            }
            beanproperty = ((BeanSerializerModifier)iterator.next()).modifySerializer(serializationconfig, basicbeandescription, beanproperty);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object findFilterId(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription)
    {
        return serializationconfig.getAnnotationIntrospector().findFilterId(basicbeandescription.getClassInfo());
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JavaType javatype1 = javatype.getContentType();
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        javatype = annotationintrospector.findPropertyContentTypeResolver(serializationconfig, annotatedmember, javatype);
        if (javatype == null)
        {
            return createTypeSerializer(serializationconfig, javatype1, beanproperty);
        } else
        {
            return javatype.buildTypeSerializer(serializationconfig, javatype1, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, annotationintrospector), beanproperty);
        }
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember, BeanProperty beanproperty)
        throws JsonMappingException
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findPropertyTypeResolver(serializationconfig, annotatedmember, javatype);
        if (typeresolverbuilder == null)
        {
            return createTypeSerializer(serializationconfig, javatype, beanproperty);
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedmember, serializationconfig, annotationintrospector), beanproperty);
        }
    }

    public org.codehaus.jackson.map.SerializerFactory.Config getConfig()
    {
        return _factoryConfig;
    }

    protected boolean isPotentialBeanType(Class class1)
    {
        return ClassUtil.canBeABeanType(class1) == null && !ClassUtil.isProxyType(class1);
    }

    protected void processViews(SerializationConfig serializationconfig, BeanSerializerBuilder beanserializerbuilder)
    {
        List list = beanserializerbuilder.getProperties();
        boolean flag = serializationconfig.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION);
        int l = list.size();
        int j = 0;
        serializationconfig = new BeanPropertyWriter[l];
        int i = 0;
        while (i < l) 
        {
            BeanPropertyWriter beanpropertywriter = (BeanPropertyWriter)list.get(i);
            Class aclass[] = beanpropertywriter.getViews();
            int k;
            if (aclass == null)
            {
                k = j;
                if (flag)
                {
                    serializationconfig[i] = beanpropertywriter;
                    k = j;
                }
            } else
            {
                k = j + 1;
                serializationconfig[i] = constructFilteredBeanWriter(beanpropertywriter, aclass);
            }
            i++;
            j = k;
        }
        if (flag && j == 0)
        {
            return;
        } else
        {
            beanserializerbuilder.setFilteredProperties(serializationconfig);
            return;
        }
    }

    protected void removeIgnorableTypes(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            basicbeandescription = ((BeanPropertyDefinition)iterator.next()).getAccessor();
            if (basicbeandescription == null)
            {
                iterator.remove();
            } else
            {
                Class class1 = basicbeandescription.getRawType();
                list = (Boolean)hashmap.get(class1);
                basicbeandescription = list;
                if (list == null)
                {
                    list = annotationintrospector.isIgnorableType(((BasicBeanDescription)serializationconfig.introspectClassAnnotations(class1)).getClassInfo());
                    basicbeandescription = list;
                    if (list == null)
                    {
                        basicbeandescription = Boolean.FALSE;
                    }
                    hashmap.put(class1, basicbeandescription);
                }
                if (basicbeandescription.booleanValue())
                {
                    iterator.remove();
                }
            }
        } while (true);
    }

    protected void removeSetterlessGetters(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        serializationconfig = list.iterator();
        do
        {
            if (!serializationconfig.hasNext())
            {
                break;
            }
            basicbeandescription = (BeanPropertyDefinition)serializationconfig.next();
            if (!basicbeandescription.couldDeserialize() && !basicbeandescription.isExplicitlyIncluded())
            {
                serializationconfig.remove();
            }
        } while (true);
    }

    protected List sortBeanProperties(SerializationConfig serializationconfig, BasicBeanDescription basicbeandescription, List list)
    {
        return list;
    }

    public SerializerFactory withConfig(org.codehaus.jackson.map.SerializerFactory.Config config)
    {
        if (_factoryConfig == config)
        {
            return this;
        }
        if (getClass() != org/codehaus/jackson/map/ser/BeanSerializerFactory)
        {
            throw new IllegalStateException((new StringBuilder()).append("Subtype of BeanSerializerFactory (").append(getClass().getName()).append(") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with ").append("additional serializer definitions").toString());
        } else
        {
            return new BeanSerializerFactory(config);
        }
    }

}
