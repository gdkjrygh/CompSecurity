// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.impl.UnwrappingBeanSerializer;
import org.codehaus.jackson.map.ser.std.BeanSerializerBase;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanPropertyWriter, AnyGetterWriter

public class BeanSerializer extends BeanSerializerBase
{

    public BeanSerializer(Class class1, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[], AnyGetterWriter anygetterwriter, Object obj)
    {
        super(class1, abeanpropertywriter, abeanpropertywriter1, anygetterwriter, obj);
    }

    protected BeanSerializer(BeanSerializer beanserializer)
    {
        super(beanserializer);
    }

    protected BeanSerializer(BeanSerializerBase beanserializerbase)
    {
        super(beanserializerbase);
    }

    public BeanSerializer(JavaType javatype, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[], AnyGetterWriter anygetterwriter, Object obj)
    {
        super(javatype, abeanpropertywriter, abeanpropertywriter1, anygetterwriter, obj);
    }

    public static BeanSerializer createDummy(Class class1)
    {
        return new BeanSerializer(class1, NO_PROPS, null, null, null);
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    public String toString()
    {
        return (new StringBuilder()).append("BeanSerializer for ").append(handledType().getName()).toString();
    }

    public JsonSerializer unwrappingSerializer()
    {
        return new UnwrappingBeanSerializer(this);
    }
}
