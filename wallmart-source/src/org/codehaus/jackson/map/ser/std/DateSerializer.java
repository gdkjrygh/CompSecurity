// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ScalarSerializerBase

public class DateSerializer extends ScalarSerializerBase
{

    public static DateSerializer instance = new DateSerializer();

    public DateSerializer()
    {
        super(java/util/Date);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        if (serializerprovider.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS))
        {
            serializerprovider = "number";
        } else
        {
            serializerprovider = "string";
        }
        return createSchemaNode(serializerprovider, true);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Date)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializerprovider.defaultSerializeDateValue(date, jsongenerator);
    }

}
