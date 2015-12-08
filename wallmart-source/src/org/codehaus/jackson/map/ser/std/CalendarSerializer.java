// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Calendar;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ScalarSerializerBase

public class CalendarSerializer extends ScalarSerializerBase
{

    public static CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer()
    {
        super(java/util/Calendar);
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
        serialize((Calendar)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializerprovider.defaultSerializeDateValue(calendar.getTimeInMillis(), jsongenerator);
    }

}
