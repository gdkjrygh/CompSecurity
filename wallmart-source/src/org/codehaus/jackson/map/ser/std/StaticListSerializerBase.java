// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.node.ObjectNode;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase

public abstract class StaticListSerializerBase extends SerializerBase
{

    protected final BeanProperty _property;

    protected StaticListSerializerBase(Class class1, BeanProperty beanproperty)
    {
        super(class1, false);
        _property = beanproperty;
    }

    protected abstract JsonNode contentSchema();

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", contentSchema());
        return serializerprovider;
    }
}
