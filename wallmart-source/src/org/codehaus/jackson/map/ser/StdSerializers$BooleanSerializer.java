// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.NonTypedScalarSerializerBase;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            StdSerializers

public static final class _forPrimitive extends NonTypedScalarSerializerBase
{

    final boolean _forPrimitive;

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        boolean flag;
        if (!_forPrimitive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return createSchemaNode("boolean", flag);
    }

    public void serialize(Boolean boolean1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeBoolean(boolean1.booleanValue());
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Boolean)obj, jsongenerator, serializerprovider);
    }

    public (boolean flag)
    {
        super(java/lang/Boolean);
        _forPrimitive = flag;
    }
}
