// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.util.Calendar;
import java.util.Date;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            StdKeySerializer

public class StdKeySerializers
{

    protected static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    protected static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

    private StdKeySerializers()
    {
    }

    public static JsonSerializer getStdKeySerializer(JavaType javatype)
    {
        if (javatype == null)
        {
            return DEFAULT_KEY_SERIALIZER;
        }
        javatype = javatype.getRawClass();
        if (javatype == java/lang/String)
        {
            return DEFAULT_STRING_SERIALIZER;
        }
        if (javatype == java/lang/Object)
        {
            return DEFAULT_KEY_SERIALIZER;
        }
    /* block-local class not found */
    class DateKeySerializer {}

        if (java/util/Date.isAssignableFrom(javatype))
        {
            return DateKeySerializer.instance;
        }
    /* block-local class not found */
    class CalendarKeySerializer {}

        if (java/util/Calendar.isAssignableFrom(javatype))
        {
            return CalendarKeySerializer.instance;
        } else
        {
            return DEFAULT_KEY_SERIALIZER;
        }
    }


    // Unreferenced inner class org/codehaus/jackson/map/ser/std/StdKeySerializers$StringKeySerializer
    /* block-local class not found */
    class StringKeySerializer {}

}
