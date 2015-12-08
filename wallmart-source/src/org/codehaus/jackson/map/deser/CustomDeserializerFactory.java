// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.util.HashMap;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            BeanDeserializerFactory

public class CustomDeserializerFactory extends BeanDeserializerFactory
{

    protected HashMap _directClassMappings;
    protected HashMap _mixInAnnotations;

    public CustomDeserializerFactory()
    {
        this(null);
    }

    protected CustomDeserializerFactory(org.codehaus.jackson.map.DeserializerFactory.Config config)
    {
        super(config);
        _directClassMappings = null;
    }

    public void addMixInAnnotationMapping(Class class1, Class class2)
    {
        if (_mixInAnnotations == null)
        {
            _mixInAnnotations = new HashMap();
        }
        _mixInAnnotations.put(new ClassKey(class1), class2);
    }

    public void addSpecificMapping(Class class1, JsonDeserializer jsondeserializer)
    {
        class1 = new ClassKey(class1);
        if (_directClassMappings == null)
        {
            _directClassMappings = new HashMap();
        }
        _directClassMappings.put(class1, jsondeserializer);
    }

    public JsonDeserializer createArrayDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, ArrayType arraytype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = new ClassKey(arraytype.getRawClass());
        if (_directClassMappings != null)
        {
            obj = (JsonDeserializer)_directClassMappings.get(obj);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
        }
        return super.createArrayDeserializer(deserializationconfig, deserializerprovider, arraytype, beanproperty);
    }

    public JsonDeserializer createBeanDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = new ClassKey(javatype.getRawClass());
        if (_directClassMappings != null)
        {
            obj = (JsonDeserializer)_directClassMappings.get(obj);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
        }
        return super.createBeanDeserializer(deserializationconfig, deserializerprovider, javatype, beanproperty);
    }

    public JsonDeserializer createEnumDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (_directClassMappings != null)
        {
            Object obj = new ClassKey(javatype.getRawClass());
            obj = (JsonDeserializer)_directClassMappings.get(obj);
            if (obj != null)
            {
                return ((JsonDeserializer) (obj));
            }
        }
        return super.createEnumDeserializer(deserializationconfig, deserializerprovider, javatype, beanproperty);
    }

    public DeserializerFactory withConfig(org.codehaus.jackson.map.DeserializerFactory.Config config)
    {
        if (getClass() != org/codehaus/jackson/map/deser/CustomDeserializerFactory)
        {
            throw new IllegalStateException((new StringBuilder()).append("Subtype of CustomDeserializerFactory (").append(getClass().getName()).append(") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with ").append("additional deserializer definitions").toString());
        } else
        {
            return new CustomDeserializerFactory(config);
        }
    }
}
