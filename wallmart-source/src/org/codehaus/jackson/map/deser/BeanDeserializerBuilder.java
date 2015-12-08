// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.BeanPropertyDefinition;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.codehaus.jackson.map.deser.impl.ValueInjector;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            SettableBeanProperty, BeanDeserializer, SettableAnyProperty, ValueInstantiator

public class BeanDeserializerBuilder
{

    protected SettableAnyProperty _anySetter;
    protected HashMap _backRefProperties;
    protected final BasicBeanDescription _beanDesc;
    protected HashSet _ignorableProps;
    protected boolean _ignoreAllUnknown;
    protected List _injectables;
    protected final HashMap _properties;
    protected ValueInstantiator _valueInstantiator;

    protected BeanDeserializerBuilder(BeanDeserializerBuilder beandeserializerbuilder)
    {
        _properties = new LinkedHashMap();
        _beanDesc = beandeserializerbuilder._beanDesc;
        _anySetter = beandeserializerbuilder._anySetter;
        _ignoreAllUnknown = beandeserializerbuilder._ignoreAllUnknown;
        _properties.putAll(beandeserializerbuilder._properties);
        _backRefProperties = _copy(beandeserializerbuilder._backRefProperties);
        _ignorableProps = beandeserializerbuilder._ignorableProps;
        _valueInstantiator = beandeserializerbuilder._valueInstantiator;
    }

    public BeanDeserializerBuilder(BasicBeanDescription basicbeandescription)
    {
        _properties = new LinkedHashMap();
        _beanDesc = basicbeandescription;
    }

    private static HashMap _copy(HashMap hashmap)
    {
        if (hashmap == null)
        {
            return null;
        } else
        {
            return new HashMap(hashmap);
        }
    }

    public void addBackReferenceProperty(String s, SettableBeanProperty settablebeanproperty)
    {
        if (_backRefProperties == null)
        {
            _backRefProperties = new HashMap(4);
        }
        _backRefProperties.put(s, settablebeanproperty);
        if (_properties != null)
        {
            _properties.remove(settablebeanproperty.getName());
        }
    }

    public void addCreatorProperty(BeanPropertyDefinition beanpropertydefinition)
    {
    }

    public void addIgnorable(String s)
    {
        if (_ignorableProps == null)
        {
            _ignorableProps = new HashSet();
        }
        _ignorableProps.add(s);
    }

    public void addInjectable(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
    {
        if (_injectables == null)
        {
            _injectables = new ArrayList();
        }
        _injectables.add(new ValueInjector(s, javatype, annotations, annotatedmember, obj));
    }

    public void addOrReplaceProperty(SettableBeanProperty settablebeanproperty, boolean flag)
    {
        _properties.put(settablebeanproperty.getName(), settablebeanproperty);
    }

    public void addProperty(SettableBeanProperty settablebeanproperty)
    {
        SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_properties.put(settablebeanproperty.getName(), settablebeanproperty);
        if (settablebeanproperty1 != null && settablebeanproperty1 != settablebeanproperty)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate property '").append(settablebeanproperty.getName()).append("' for ").append(_beanDesc.getType()).toString());
        } else
        {
            return;
        }
    }

    public JsonDeserializer build(BeanProperty beanproperty)
    {
        BeanPropertyMap beanpropertymap = new BeanPropertyMap(_properties.values());
        beanpropertymap.assignIndexes();
        return new BeanDeserializer(_beanDesc, beanproperty, _valueInstantiator, beanpropertymap, _backRefProperties, _ignorableProps, _ignoreAllUnknown, _anySetter, _injectables);
    }

    public Iterator getProperties()
    {
        return _properties.values().iterator();
    }

    public ValueInstantiator getValueInstantiator()
    {
        return _valueInstantiator;
    }

    public boolean hasProperty(String s)
    {
        return _properties.containsKey(s);
    }

    public SettableBeanProperty removeProperty(String s)
    {
        return (SettableBeanProperty)_properties.remove(s);
    }

    public void setAnySetter(SettableAnyProperty settableanyproperty)
    {
        if (_anySetter != null && settableanyproperty != null)
        {
            throw new IllegalStateException("_anySetter already set to non-null");
        } else
        {
            _anySetter = settableanyproperty;
            return;
        }
    }

    public void setIgnoreUnknownProperties(boolean flag)
    {
        _ignoreAllUnknown = flag;
    }

    public void setValueInstantiator(ValueInstantiator valueinstantiator)
    {
        _valueInstantiator = valueinstantiator;
    }
}
