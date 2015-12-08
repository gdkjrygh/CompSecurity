// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public class TimestampDeserializer extends StdScalarDeserializer
{

    public TimestampDeserializer()
    {
        super(java/sql/Timestamp);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Timestamp deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return new Timestamp(_parseDate(jsonparser, deserializationcontext).getTime());
    }
}
