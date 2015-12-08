// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.util.List;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanPropertyWriter, BeanSerializer, AnyGetterWriter

public class BeanSerializerBuilder
{

    private static final BeanPropertyWriter NO_PROPERTIES[] = new BeanPropertyWriter[0];
    protected AnyGetterWriter _anyGetter;
    protected final BasicBeanDescription _beanDesc;
    protected Object _filterId;
    protected BeanPropertyWriter _filteredProperties[];
    protected List _properties;

    public BeanSerializerBuilder(BasicBeanDescription basicbeandescription)
    {
        _beanDesc = basicbeandescription;
    }

    protected BeanSerializerBuilder(BeanSerializerBuilder beanserializerbuilder)
    {
        _beanDesc = beanserializerbuilder._beanDesc;
        _properties = beanserializerbuilder._properties;
        _filteredProperties = beanserializerbuilder._filteredProperties;
        _anyGetter = beanserializerbuilder._anyGetter;
        _filterId = beanserializerbuilder._filterId;
    }

    public JsonSerializer build()
    {
        BeanPropertyWriter abeanpropertywriter[];
        if (_properties == null || _properties.isEmpty())
        {
            if (_anyGetter == null)
            {
                return null;
            }
            abeanpropertywriter = NO_PROPERTIES;
        } else
        {
            abeanpropertywriter = (BeanPropertyWriter[])_properties.toArray(new BeanPropertyWriter[_properties.size()]);
        }
        return new BeanSerializer(_beanDesc.getType(), abeanpropertywriter, _filteredProperties, _anyGetter, _filterId);
    }

    public BeanSerializer createDummy()
    {
        return BeanSerializer.createDummy(_beanDesc.getBeanClass());
    }

    public BasicBeanDescription getBeanDescription()
    {
        return _beanDesc;
    }

    public BeanPropertyWriter[] getFilteredProperties()
    {
        return _filteredProperties;
    }

    public List getProperties()
    {
        return _properties;
    }

    public boolean hasProperties()
    {
        return _properties != null && _properties.size() > 0;
    }

    public void setAnyGetter(AnyGetterWriter anygetterwriter)
    {
        _anyGetter = anygetterwriter;
    }

    public void setFilterId(Object obj)
    {
        _filterId = obj;
    }

    public void setFilteredProperties(BeanPropertyWriter abeanpropertywriter[])
    {
        _filteredProperties = abeanpropertywriter;
    }

    public void setProperties(List list)
    {
        _properties = list;
    }

}
