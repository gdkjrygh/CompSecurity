// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public class CalendarDeserializer extends StdScalarDeserializer
{

    protected final Class _calendarClass;

    public CalendarDeserializer()
    {
        this(null);
    }

    public CalendarDeserializer(Class class1)
    {
        super(java/util/Calendar);
        _calendarClass = class1;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Calendar deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        jsonparser = _parseDate(jsonparser, deserializationcontext);
        if (jsonparser == null)
        {
            return null;
        }
        if (_calendarClass == null)
        {
            return deserializationcontext.constructCalendar(jsonparser);
        }
        Calendar calendar;
        try
        {
            calendar = (Calendar)_calendarClass.newInstance();
            calendar.setTimeInMillis(jsonparser.getTime());
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.instantiationException(_calendarClass, jsonparser);
        }
        return calendar;
    }
}
