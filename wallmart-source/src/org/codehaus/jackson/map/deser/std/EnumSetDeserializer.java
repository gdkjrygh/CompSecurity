// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.EnumSet;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.util.EnumResolver;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdDeserializer, EnumDeserializer

public class EnumSetDeserializer extends StdDeserializer
{

    protected final Class _enumClass;
    protected final JsonDeserializer _enumDeserializer;

    public EnumSetDeserializer(Class class1, JsonDeserializer jsondeserializer)
    {
        super(java/util/EnumSet);
        _enumClass = class1;
        _enumDeserializer = jsondeserializer;
    }

    public EnumSetDeserializer(EnumResolver enumresolver)
    {
        this(enumresolver.getEnumClass(), ((JsonDeserializer) (new EnumDeserializer(enumresolver))));
    }

    private EnumSet constructSet()
    {
        return EnumSet.noneOf(_enumClass);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            throw deserializationcontext.mappingException(java/util/EnumSet);
        }
        EnumSet enumset = constructSet();
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            if (jsontoken != JsonToken.END_ARRAY)
            {
                if (jsontoken == JsonToken.VALUE_NULL)
                {
                    throw deserializationcontext.mappingException(_enumClass);
                }
                enumset.add((Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext));
            } else
            {
                return enumset;
            }
        } while (true);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }
}
