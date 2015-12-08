// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.util.TimeZone;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ScalarSerializerBase

public class TimeZoneSerializer extends ScalarSerializerBase
{

    public static final TimeZoneSerializer instance = new TimeZoneSerializer();

    public TimeZoneSerializer()
    {
        super(java/util/TimeZone);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((TimeZone)obj, jsongenerator, serializerprovider);
    }

    public void serialize(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeString(timezone.getID());
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        serializeWithType((TimeZone)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(TimeZone timezone, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForScalar(timezone, jsongenerator, java/util/TimeZone);
        serialize(timezone, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(timezone, jsongenerator);
    }

}
