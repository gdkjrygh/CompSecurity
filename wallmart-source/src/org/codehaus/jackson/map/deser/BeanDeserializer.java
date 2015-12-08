// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanDescription;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.codehaus.jackson.map.deser.impl.CreatorCollector;
import org.codehaus.jackson.map.deser.impl.ExternalTypeHandler;
import org.codehaus.jackson.map.deser.impl.PropertyBasedCreator;
import org.codehaus.jackson.map.deser.impl.PropertyValueBuffer;
import org.codehaus.jackson.map.deser.impl.UnwrappedPropertyHandler;
import org.codehaus.jackson.map.deser.impl.ValueInjector;
import org.codehaus.jackson.map.deser.std.ContainerDeserializerBase;
import org.codehaus.jackson.map.deser.std.StdDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.TokenBuffer;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            ValueInstantiator, SettableAnyProperty, SettableBeanProperty, AbstractDeserializer

public class BeanDeserializer extends StdDeserializer
    implements ResolvableDeserializer
{

    protected SettableAnyProperty _anySetter;
    protected final Map _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected JsonDeserializer _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final AnnotatedClass _forClass;
    protected final HashSet _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector _injectables[];
    protected boolean _nonStandardCreation;
    protected final BeanProperty _property;
    protected final PropertyBasedCreator _propertyBasedCreator;
    protected HashMap _subDeserializers;
    protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;

    public BeanDeserializer(BeanDescription beandescription, BeanProperty beanproperty, ValueInstantiator valueinstantiator, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, boolean flag, 
            SettableAnyProperty settableanyproperty, List list)
    {
        this(beandescription.getClassInfo(), beandescription.getType(), beanproperty, valueinstantiator, beanpropertymap, map, hashset, flag, settableanyproperty, list);
    }

    protected BeanDeserializer(BeanDeserializer beandeserializer)
    {
        this(beandeserializer, beandeserializer._ignoreAllUnknown);
    }

    protected BeanDeserializer(BeanDeserializer beandeserializer, boolean flag)
    {
        super(beandeserializer._beanType);
        _forClass = beandeserializer._forClass;
        _beanType = beandeserializer._beanType;
        _property = beandeserializer._property;
        _valueInstantiator = beandeserializer._valueInstantiator;
        _delegateDeserializer = beandeserializer._delegateDeserializer;
        _propertyBasedCreator = beandeserializer._propertyBasedCreator;
        _beanProperties = beandeserializer._beanProperties;
        _backRefs = beandeserializer._backRefs;
        _ignorableProps = beandeserializer._ignorableProps;
        _ignoreAllUnknown = flag;
        _anySetter = beandeserializer._anySetter;
        _injectables = beandeserializer._injectables;
        _nonStandardCreation = beandeserializer._nonStandardCreation;
        _unwrappedPropertyHandler = beandeserializer._unwrappedPropertyHandler;
    }

    protected BeanDeserializer(AnnotatedClass annotatedclass, JavaType javatype, BeanProperty beanproperty, ValueInstantiator valueinstantiator, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, 
            boolean flag, SettableAnyProperty settableanyproperty, List list)
    {
        Object obj = null;
        super(javatype);
        _forClass = annotatedclass;
        _beanType = javatype;
        _property = beanproperty;
        _valueInstantiator = valueinstantiator;
        if (valueinstantiator.canCreateFromObjectWith())
        {
            _propertyBasedCreator = new PropertyBasedCreator(valueinstantiator);
        } else
        {
            _propertyBasedCreator = null;
        }
        _beanProperties = beanpropertymap;
        _backRefs = map;
        _ignorableProps = hashset;
        _ignoreAllUnknown = flag;
        _anySetter = settableanyproperty;
        annotatedclass = obj;
        if (list != null)
        {
            if (list.isEmpty())
            {
                annotatedclass = obj;
            } else
            {
                annotatedclass = (ValueInjector[])list.toArray(new ValueInjector[list.size()]);
            }
        }
        _injectables = annotatedclass;
        if (valueinstantiator.canCreateUsingDelegate() || _propertyBasedCreator != null || !valueinstantiator.canCreateUsingDefault() || _unwrappedPropertyHandler != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _nonStandardCreation = flag;
    }

    public BeanDeserializer(AnnotatedClass annotatedclass, JavaType javatype, BeanProperty beanproperty, CreatorCollector creatorcollector, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, 
            boolean flag, SettableAnyProperty settableanyproperty)
    {
        this(annotatedclass, javatype, beanproperty, creatorcollector.constructValueInstantiator(null), beanpropertymap, map, hashset, flag, settableanyproperty, null);
    }

    private final void _handleUnknown(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
            return;
        }
        if (_anySetter != null)
        {
            try
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                wrapAndThrow(jsonparser, obj, s, deserializationcontext);
            }
            return;
        } else
        {
            handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
            return;
        }
    }

    protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        Object obj2;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext);
        obj = null;
        obj2 = jsonparser.getCurrentToken();
_L12:
        if (obj2 != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        SettableBeanProperty settablebeanproperty;
        obj2 = jsonparser.getCurrentName();
        jsonparser.nextToken();
        settablebeanproperty = propertybasedcreator.findCreatorProperty(((String) (obj2)));
        if (settablebeanproperty == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj3;
        obj3 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
        obj1 = obj;
        if (!propertyvaluebuffer.assignParameter(settablebeanproperty.getPropertyIndex(), obj3)) goto _L6; else goto _L5
_L5:
        jsonparser.nextToken();
        obj1 = propertybasedcreator.build(propertyvaluebuffer);
        if (obj1.getClass() == _beanType.getRawClass()) goto _L8; else goto _L7
_L7:
        jsonparser = ((JsonParser) (handlePolymorphic(jsonparser, deserializationcontext, obj1, ((TokenBuffer) (obj)))));
_L10:
        return jsonparser;
        obj1;
        wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), ((String) (obj2)), deserializationcontext);
        obj1 = obj;
_L6:
        obj2 = jsonparser.nextToken();
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L8:
        obj2 = obj1;
        if (obj != null)
        {
            obj2 = handleUnknownProperties(deserializationcontext, obj1, ((TokenBuffer) (obj)));
        }
        return deserialize(jsonparser, deserializationcontext, obj2);
_L4:
        obj1 = _beanProperties.find(((String) (obj2)));
        if (obj1 != null)
        {
            propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
            obj1 = obj;
        } else
        if (_ignorableProps != null && _ignorableProps.contains(obj2))
        {
            jsonparser.skipChildren();
            obj1 = obj;
        } else
        if (_anySetter != null)
        {
            propertyvaluebuffer.bufferAnyProperty(_anySetter, ((String) (obj2)), _anySetter.deserialize(jsonparser, deserializationcontext));
            obj1 = obj;
        } else
        {
            obj1 = obj;
            if (obj == null)
            {
                obj1 = new TokenBuffer(jsonparser.getCodec());
            }
            ((TokenBuffer) (obj1)).writeFieldName(((String) (obj2)));
            ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
        }
        if (true) goto _L6; else goto _L2
_L2:
        try
        {
            obj1 = propertybasedcreator.build(propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            return null;
        }
        jsonparser = ((JsonParser) (obj1));
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (obj1.getClass() != _beanType.getRawClass())
        {
            return handlePolymorphic(null, deserializationcontext, obj1, ((TokenBuffer) (obj)));
        }
        return handleUnknownProperties(deserializationcontext, obj1, ((TokenBuffer) (obj)));
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected JsonDeserializer _findSubclassDeserializer(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        this;
        JVM INSTR monitorenter ;
        if (_subDeserializers != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        tokenbuffer = null;
_L1:
        this;
        JVM INSTR monitorexit ;
        if (tokenbuffer != null)
        {
            return tokenbuffer;
        }
        break MISSING_BLOCK_LABEL_49;
        tokenbuffer = (JsonDeserializer)_subDeserializers.get(new ClassKey(obj.getClass()));
          goto _L1
        deserializationcontext;
        this;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        DeserializerProvider deserializerprovider = deserializationcontext.getDeserializerProvider();
        if (deserializerprovider == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        tokenbuffer = deserializationcontext.constructType(obj.getClass());
        deserializationcontext = deserializerprovider.findValueDeserializer(deserializationcontext.getConfig(), tokenbuffer, _property);
        tokenbuffer = deserializationcontext;
        if (deserializationcontext == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        this;
        JVM INSTR monitorenter ;
        if (_subDeserializers == null)
        {
            _subDeserializers = new HashMap();
        }
        _subDeserializers.put(new ClassKey(obj.getClass()), deserializationcontext);
        this;
        JVM INSTR monitorexit ;
        tokenbuffer = deserializationcontext;
        break MISSING_BLOCK_LABEL_142;
        deserializationcontext;
        this;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        return tokenbuffer;
    }

    protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationConfig deserializationconfig, SettableBeanProperty settablebeanproperty)
    {
        Object obj;
        Object obj1;
        obj1 = settablebeanproperty.getValueDeserializer();
        obj = settablebeanproperty;
        if (!(obj1 instanceof BeanDeserializer)) goto _L2; else goto _L1
_L1:
        obj = settablebeanproperty;
        if (((BeanDeserializer)obj1).getValueInstantiator().canCreateUsingDefault()) goto _L2; else goto _L3
_L3:
        Class class1;
        class1 = settablebeanproperty.getType().getRawClass();
        obj1 = ClassUtil.getOuterClass(class1);
        obj = settablebeanproperty;
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        obj = settablebeanproperty;
        if (obj1 != _beanType.getRawClass()) goto _L2; else goto _L5
_L5:
        Constructor aconstructor[];
        int i;
        int j;
        aconstructor = class1.getConstructors();
        j = aconstructor.length;
        i = 0;
_L10:
        obj = settablebeanproperty;
        if (i >= j) goto _L2; else goto _L6
_L6:
        Class aclass[];
        obj = aconstructor[i];
        aclass = ((Constructor) (obj)).getParameterTypes();
        if (aclass.length != 1 || aclass[0] != obj1) goto _L8; else goto _L7
_L7:
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (obj)));
        }
        obj = new SettableBeanProperty.InnerClassProperty(settablebeanproperty, ((Constructor) (obj)));
_L2:
        return ((SettableBeanProperty) (obj));
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationConfig deserializationconfig, SettableBeanProperty settablebeanproperty)
    {
        String s;
        boolean flag;
        s = settablebeanproperty.getManagedReferenceName();
        if (s == null)
        {
            return settablebeanproperty;
        }
        deserializationconfig = settablebeanproperty.getValueDeserializer();
        flag = false;
        if (!(deserializationconfig instanceof BeanDeserializer)) goto _L2; else goto _L1
_L1:
        deserializationconfig = ((BeanDeserializer)deserializationconfig).findBackReference(s);
_L4:
        if (deserializationconfig == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': no back reference property found from type ").append(settablebeanproperty.getType()).toString());
        }
        break MISSING_BLOCK_LABEL_280;
_L2:
        if (!(deserializationconfig instanceof ContainerDeserializerBase))
        {
            break; /* Loop/switch isn't completed */
        }
        deserializationconfig = ((ContainerDeserializerBase)deserializationconfig).getContentDeserializer();
        if (!(deserializationconfig instanceof BeanDeserializer))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer ").append(" (instead it's of type ").append(deserializationconfig.getClass().getName()).append(")").toString());
        }
        deserializationconfig = ((BeanDeserializer)deserializationconfig).findBackReference(s);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        if (deserializationconfig instanceof AbstractDeserializer)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference for abstract types (property ").append(_beanType.getRawClass().getName()).append(".").append(settablebeanproperty.getName()).append(")").toString());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but ").append(deserializationconfig.getClass().getName()).toString());
        }
        JavaType javatype = _beanType;
        JavaType javatype1 = deserializationconfig.getType();
        if (!javatype1.getRawClass().isAssignableFrom(javatype.getRawClass()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': back reference type (").append(javatype1.getRawClass().getName()).append(") not compatible with managed type (").append(javatype.getRawClass().getName()).append(")").toString());
        } else
        {
            return new SettableBeanProperty.ManagedReferenceProperty(s, settablebeanproperty, deserializationconfig, _forClass.getAnnotations(), flag);
        }
    }

    protected SettableBeanProperty _resolveUnwrappedProperty(DeserializationConfig deserializationconfig, SettableBeanProperty settablebeanproperty)
    {
        org.codehaus.jackson.map.introspect.AnnotatedMember annotatedmember = settablebeanproperty.getMember();
        if (annotatedmember != null && deserializationconfig.getAnnotationIntrospector().shouldUnwrapProperty(annotatedmember) == Boolean.TRUE)
        {
            deserializationconfig = settablebeanproperty.getValueDeserializer();
            JsonDeserializer jsondeserializer = deserializationconfig.unwrappingDeserializer();
            if (jsondeserializer != deserializationconfig && jsondeserializer != null)
            {
                return settablebeanproperty.withValueDeserializer(jsondeserializer);
            }
        }
        return null;
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.START_OBJECT)
        {
            jsonparser.nextToken();
            return deserializeFromObject(jsonparser, deserializationcontext);
        }
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw deserializationcontext.mappingException(getBeanClass());

        case 1: // '\001'
            return deserializeFromString(jsonparser, deserializationcontext);

        case 2: // '\002'
            return deserializeFromNumber(jsonparser, deserializationcontext);

        case 3: // '\003'
            return deserializeFromDouble(jsonparser, deserializationcontext);

        case 4: // '\004'
            return jsonparser.getEmbeddedObject();

        case 5: // '\005'
        case 6: // '\006'
            return deserializeFromBoolean(jsonparser, deserializationcontext);

        case 7: // '\007'
            return deserializeFromArray(jsonparser, deserializationcontext);

        case 8: // '\b'
        case 9: // '\t'
            return deserializeFromObject(jsonparser, deserializationcontext);
        }
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        if (_unwrappedPropertyHandler == null) goto _L2; else goto _L1
_L1:
        Object obj2 = deserializeWithUnwrapped(jsonparser, deserializationcontext, obj);
_L4:
        return obj2;
_L2:
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext, obj);
        }
        obj2 = jsonparser.getCurrentToken();
        Object obj1 = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        do
        {
            obj2 = obj;
            if (obj1 != JsonToken.FIELD_NAME)
            {
                continue;
            }
            obj1 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            obj2 = _beanProperties.find(((String) (obj1)));
            if (obj2 != null)
            {
                try
                {
                    ((SettableBeanProperty) (obj2)).deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                jsonparser.skipChildren();
            } else
            if (_anySetter != null)
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            } else
            {
                handleUnknownProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            obj1 = jsonparser.nextToken();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
        if (_injectables != null)
        {
            injectValues(deserializationcontext, jsonparser);
        }
        return jsonparser;
        jsonparser;
        wrapInstantiationProblem(jsonparser, deserializationcontext);
        throw deserializationcontext.mappingException(getBeanClass());
    }

    public Object deserializeFromBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromBoolean())
        {
            jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, jsonparser);
            }
            return jsonparser;
        }
        boolean flag;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return _valueInstantiator.createFromBoolean(flag);
    }

    public Object deserializeFromDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        _cls1..SwitchMap.org.codehaus.jackson.JsonParser.NumberType[jsonparser.getNumberType().ordinal()];
        JVM INSTR tableswitch 3 4: default 32
    //                   3 58
    //                   4 58;
           goto _L1 _L2 _L2
_L1:
        if (_delegateDeserializer == null) goto _L4; else goto _L3
_L3:
        jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
_L5:
        return jsonparser;
_L2:
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromDouble())
        {
            Object obj = _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj);
                return obj;
            }
        } else
        {
            return _valueInstantiator.createFromDouble(jsonparser.getDoubleValue());
        }
        if (true) goto _L5; else goto _L4
_L4:
        throw deserializationcontext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON floating-point number");
    }

    public Object deserializeFromNumber(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        _cls1..SwitchMap.org.codehaus.jackson.JsonParser.NumberType[jsonparser.getNumberType().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 75
    //                   2 138;
           goto _L1 _L2 _L3
_L1:
        if (_delegateDeserializer == null) goto _L5; else goto _L4
_L4:
        Object obj = _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        jsonparser = ((JsonParser) (obj));
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
            jsonparser = ((JsonParser) (obj));
        }
_L6:
        return jsonparser;
_L2:
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromInt())
        {
            Object obj1 = _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj1));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj1);
                return obj1;
            }
        } else
        {
            return _valueInstantiator.createFromInt(jsonparser.getIntValue());
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromInt())
        {
            Object obj2 = _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj2));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj2);
                return obj2;
            }
        } else
        {
            return _valueInstantiator.createFromLong(jsonparser.getLongValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        throw deserializationcontext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON integer number");
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!_nonStandardCreation) goto _L2; else goto _L1
_L1:
        if (_unwrappedPropertyHandler == null) goto _L4; else goto _L3
_L3:
        Object obj = deserializeWithUnwrapped(jsonparser, deserializationcontext);
_L6:
        return obj;
_L4:
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
        }
_L2:
        Object obj1 = _valueInstantiator.createUsingDefault();
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj1);
        }
        do
        {
            obj = obj1;
            if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
            {
                continue;
            }
            obj = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj)));
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj1, ((String) (obj)), deserializationcontext);
                }
            } else
            {
                _handleUnknown(jsonparser, deserializationcontext, obj1, ((String) (obj)));
            }
            jsonparser.nextToken();
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Object deserializeFromObjectUsingNonDefault(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return _deserializeUsingPropertyBased(jsonparser, deserializationcontext);
        }
        if (_beanType.isAbstract())
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not instantiate abstract type ").append(_beanType).append(" (need to add/enable type information?)").toString());
        } else
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("No suitable constructor found for type ").append(_beanType).append(": can not instantiate from JSON object (need to add/enable type information?)").toString());
        }
    }

    public Object deserializeFromString(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromString())
        {
            jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, jsonparser);
            }
            return jsonparser;
        } else
        {
            return _valueInstantiator.createFromString(jsonparser.getText());
        }
    }

    protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        ExternalTypeHandler externaltypehandler;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        externaltypehandler = _externalTypeIdHandler.start();
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext);
        tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        Object obj2 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getPropertyIndex(), obj2))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = jsonparser.nextToken();
        Object obj3 = propertybasedcreator.build(propertyvaluebuffer);
        for (; obj == JsonToken.FIELD_NAME; obj = jsonparser.nextToken())
        {
            jsonparser.nextToken();
            tokenbuffer.copyCurrentStructure(jsonparser);
        }

        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(((Throwable) (obj)), _beanType.getRawClass(), s, deserializationcontext);
_L3:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        if (obj3.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException("Can not create polymorphic instances with unwrapped values");
        } else
        {
            return externaltypehandler.complete(jsonparser, deserializationcontext, obj3);
        }
        SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
        if (settablebeanproperty != null)
        {
            propertyvaluebuffer.bufferProperty(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext));
        } else
        if (!externaltypehandler.handleToken(jsonparser, deserializationcontext, s, null))
        {
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                jsonparser.skipChildren();
            } else
            if (_anySetter != null)
            {
                propertyvaluebuffer.bufferAnyProperty(_anySetter, s, _anySetter.deserialize(jsonparser, deserializationcontext));
            }
        }
          goto _L3
        Object obj1;
        try
        {
            obj1 = propertybasedcreator.build(propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            return null;
        }
        return externaltypehandler.complete(jsonparser, deserializationcontext, obj1);
    }

    protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext);
        tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        Object obj2 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getPropertyIndex(), obj2))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj = jsonparser.nextToken();
        Object obj3 = propertybasedcreator.build(propertyvaluebuffer);
        for (; obj == JsonToken.FIELD_NAME; obj = jsonparser.nextToken())
        {
            jsonparser.nextToken();
            tokenbuffer.copyCurrentStructure(jsonparser);
        }

        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(((Throwable) (obj)), _beanType.getRawClass(), s, deserializationcontext);
_L3:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        tokenbuffer.writeEndObject();
        if (obj3.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException("Can not create polymorphic instances with unwrapped values");
        } else
        {
            return _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj3, tokenbuffer);
        }
        SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
        if (settablebeanproperty != null)
        {
            propertyvaluebuffer.bufferProperty(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext));
        } else
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
        } else
        {
            tokenbuffer.writeFieldName(s);
            tokenbuffer.copyCurrentStructure(jsonparser);
            if (_anySetter != null)
            {
                propertyvaluebuffer.bufferAnyProperty(_anySetter, s, _anySetter.deserialize(jsonparser, deserializationcontext));
            }
        }
          goto _L3
        Object obj1;
        try
        {
            obj1 = propertybasedcreator.build(propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            return null;
        }
        return _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj1, tokenbuffer);
    }

    protected Object deserializeWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext, _valueInstantiator.createUsingDefault());
        }
    }

    protected Object deserializeWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        ExternalTypeHandler externaltypehandler = _externalTypeIdHandler.start();
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                if (jsonparser.getCurrentToken().isScalarValue())
                {
                    externaltypehandler.handleTypePropertyValue(jsonparser, deserializationcontext, s, obj);
                }
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, s, deserializationcontext);
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                jsonparser.skipChildren();
            } else
            if (!externaltypehandler.handleToken(jsonparser, deserializationcontext, s, obj))
            {
                if (_anySetter != null)
                {
                    try
                    {
                        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
                    }
                    catch (Exception exception1)
                    {
                        wrapAndThrow(exception1, obj, s, deserializationcontext);
                    }
                } else
                {
                    handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
                }
            }
            jsonparser.nextToken();
        }
        return externaltypehandler.complete(jsonparser, deserializationcontext, obj);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonparser, deserializationcontext);
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        Object obj = _valueInstantiator.createUsingDefault();
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, s, deserializationcontext);
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                jsonparser.skipChildren();
            } else
            {
                tokenbuffer.writeFieldName(s);
                tokenbuffer.copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    try
                    {
                        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
                    }
                    catch (Exception exception1)
                    {
                        wrapAndThrow(exception1, obj, s, deserializationcontext);
                    }
                }
            }
            jsonparser.nextToken();
        }
        tokenbuffer.writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj, tokenbuffer);
        return obj;
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        Object obj2 = jsonparser.getCurrentToken();
        Object obj1 = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        obj2 = new TokenBuffer(jsonparser.getCodec());
        ((TokenBuffer) (obj2)).writeStartObject();
        while (obj1 == JsonToken.FIELD_NAME) 
        {
            obj1 = jsonparser.getCurrentName();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj1)));
            jsonparser.nextToken();
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                jsonparser.skipChildren();
            } else
            {
                ((TokenBuffer) (obj2)).writeFieldName(((String) (obj1)));
                ((TokenBuffer) (obj2)).copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
                }
            }
            obj1 = jsonparser.nextToken();
        }
        ((TokenBuffer) (obj2)).writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj, ((TokenBuffer) (obj2)));
        return obj;
    }

    public SettableBeanProperty findBackReference(String s)
    {
        if (_backRefs == null)
        {
            return null;
        } else
        {
            return (SettableBeanProperty)_backRefs.get(s);
        }
    }

    public final Class getBeanClass()
    {
        return _beanType.getRawClass();
    }

    public int getPropertyCount()
    {
        return _beanProperties.size();
    }

    public ValueInstantiator getValueInstantiator()
    {
        return _valueInstantiator;
    }

    public JavaType getValueType()
    {
        return _beanType;
    }

    protected Object handlePolymorphic(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        JsonDeserializer jsondeserializer = _findSubclassDeserializer(deserializationcontext, obj, tokenbuffer);
        if (jsondeserializer != null)
        {
            Object obj1 = obj;
            if (tokenbuffer != null)
            {
                tokenbuffer.writeEndObject();
                tokenbuffer = tokenbuffer.asParser();
                tokenbuffer.nextToken();
                obj1 = jsondeserializer.deserialize(tokenbuffer, deserializationcontext, obj);
            }
            obj = obj1;
            if (jsonparser != null)
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext, obj1);
            }
            return obj;
        }
        Object obj2 = obj;
        if (tokenbuffer != null)
        {
            obj2 = handleUnknownProperties(deserializationcontext, obj, tokenbuffer);
        }
        obj = obj2;
        if (jsonparser != null)
        {
            obj = deserialize(jsonparser, deserializationcontext, obj2);
        }
        return obj;
    }

    protected Object handleUnknownProperties(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        tokenbuffer.writeEndObject();
        String s;
        for (tokenbuffer = tokenbuffer.asParser(); tokenbuffer.nextToken() != JsonToken.END_OBJECT; handleUnknownProperty(tokenbuffer, deserializationcontext, obj, s))
        {
            s = tokenbuffer.getCurrentName();
            tokenbuffer.nextToken();
        }

        return obj;
    }

    protected void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (_ignoreAllUnknown || _ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
            return;
        } else
        {
            super.handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
            return;
        }
    }

    public boolean hasProperty(String s)
    {
        return _beanProperties.find(s) != null;
    }

    protected void injectValues(DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        ValueInjector avalueinjector[] = _injectables;
        int j = avalueinjector.length;
        for (int i = 0; i < j; i++)
        {
            avalueinjector[i].inject(deserializationcontext, obj);
        }

    }

    public Iterator properties()
    {
        if (_beanProperties == null)
        {
            throw new IllegalStateException("Can only call before BeanDeserializer has been resolved");
        } else
        {
            return _beanProperties.allProperties();
        }
    }

    public void resolve(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider)
        throws JsonMappingException
    {
        Iterator iterator1 = _beanProperties.allProperties();
        Object obj = null;
        Object obj2 = null;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            SettableBeanProperty settablebeanproperty2 = (SettableBeanProperty)iterator1.next();
            Object obj1 = settablebeanproperty2;
            SettableBeanProperty settablebeanproperty = ((SettableBeanProperty) (obj1));
            if (!((SettableBeanProperty) (obj1)).hasValueDeserializer())
            {
                settablebeanproperty = ((SettableBeanProperty) (obj1)).withValueDeserializer(findDeserializer(deserializationconfig, deserializerprovider, ((SettableBeanProperty) (obj1)).getType(), ((BeanProperty) (obj1))));
            }
            settablebeanproperty = _resolveManagedReferenceProperty(deserializationconfig, settablebeanproperty);
            SettableBeanProperty settablebeanproperty3 = _resolveUnwrappedProperty(deserializationconfig, settablebeanproperty);
            obj1 = obj;
            if (settablebeanproperty3 != null)
            {
                settablebeanproperty = settablebeanproperty3;
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new UnwrappedPropertyHandler();
                }
                ((UnwrappedPropertyHandler) (obj1)).addProperty(settablebeanproperty);
            }
            settablebeanproperty = _resolveInnerClassValuedProperty(deserializationconfig, settablebeanproperty);
            if (settablebeanproperty != settablebeanproperty2)
            {
                _beanProperties.replace(settablebeanproperty);
            }
            obj = obj1;
            if (settablebeanproperty.hasValueTypeDeserializer())
            {
                TypeDeserializer typedeserializer = settablebeanproperty.getValueTypeDeserializer();
                obj = obj1;
                if (typedeserializer.getTypeInclusion() == org.codehaus.jackson.annotate.JsonTypeInfo.As.EXTERNAL_PROPERTY)
                {
                    obj = obj2;
                    if (obj2 == null)
                    {
                        obj = new org.codehaus.jackson.map.deser.impl.ExternalTypeHandler.Builder();
                    }
                    ((org.codehaus.jackson.map.deser.impl.ExternalTypeHandler.Builder) (obj)).addExternal(settablebeanproperty, typedeserializer.getPropertyName());
                    _beanProperties.remove(settablebeanproperty);
                    obj2 = obj;
                    obj = obj1;
                }
            }
        } while (true);
        if (_anySetter != null && !_anySetter.hasValueDeserializer())
        {
            _anySetter = _anySetter.withValueDeserializer(findDeserializer(deserializationconfig, deserializerprovider, _anySetter.getType(), _anySetter.getProperty()));
        }
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            JavaType javatype = _valueInstantiator.getDelegateType();
            if (javatype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_beanType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            org.codehaus.jackson.map.introspect.AnnotatedWithParams annotatedwithparams = _valueInstantiator.getDelegateCreator();
            _delegateDeserializer = findDeserializer(deserializationconfig, deserializerprovider, javatype, new org.codehaus.jackson.map.BeanProperty.Std(null, javatype, _forClass.getAnnotations(), annotatedwithparams));
        }
        if (_propertyBasedCreator != null)
        {
            Iterator iterator = _propertyBasedCreator.getCreatorProperties().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)iterator.next();
                if (!settablebeanproperty1.hasValueDeserializer())
                {
                    _propertyBasedCreator.assignDeserializer(settablebeanproperty1, findDeserializer(deserializationconfig, deserializerprovider, settablebeanproperty1.getType(), settablebeanproperty1));
                }
            } while (true);
        }
        if (obj2 != null)
        {
            _externalTypeIdHandler = ((org.codehaus.jackson.map.deser.impl.ExternalTypeHandler.Builder) (obj2)).build();
            _nonStandardCreation = true;
        }
        _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) (obj));
        if (obj != null)
        {
            _nonStandardCreation = true;
        }
    }

    public JsonDeserializer unwrappingDeserializer()
    {
        if (getClass() != org/codehaus/jackson/map/deser/BeanDeserializer)
        {
            return this;
        } else
        {
            return new BeanDeserializer(this, true);
        }
    }

    public void wrapAndThrow(Throwable throwable, Object obj, int i)
        throws IOException
    {
        wrapAndThrow(throwable, obj, i, null);
    }

    public void wrapAndThrow(Throwable throwable, Object obj, int i, DeserializationContext deserializationcontext)
        throws IOException
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, i);
    }

    public void wrapAndThrow(Throwable throwable, Object obj, String s)
        throws IOException
    {
        wrapAndThrow(throwable, obj, s, null);
    }

    public void wrapAndThrow(Throwable throwable, Object obj, String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, s);
    }

    protected void wrapInstantiationProblem(Throwable throwable, DeserializationContext deserializationcontext)
        throws IOException
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            throw (IOException)throwable;
        }
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        } else
        {
            throw deserializationcontext.instantiationException(_beanType.getRawClass(), throwable);
        }
    }
}
