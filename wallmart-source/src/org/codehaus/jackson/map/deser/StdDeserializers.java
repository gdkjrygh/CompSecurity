// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import org.codehaus.jackson.map.deser.std.AtomicBooleanDeserializer;
import org.codehaus.jackson.map.deser.std.CalendarDeserializer;
import org.codehaus.jackson.map.deser.std.ClassDeserializer;
import org.codehaus.jackson.map.deser.std.DateDeserializer;
import org.codehaus.jackson.map.deser.std.FromStringDeserializer;
import org.codehaus.jackson.map.deser.std.JavaTypeDeserializer;
import org.codehaus.jackson.map.deser.std.StdDeserializer;
import org.codehaus.jackson.map.deser.std.StringDeserializer;
import org.codehaus.jackson.map.deser.std.TimestampDeserializer;
import org.codehaus.jackson.map.deser.std.TokenBufferDeserializer;
import org.codehaus.jackson.map.deser.std.UntypedObjectDeserializer;
import org.codehaus.jackson.map.type.ClassKey;

class StdDeserializers
{

    final HashMap _deserializers = new HashMap();

    private StdDeserializers()
    {
        add(new UntypedObjectDeserializer());
        StringDeserializer stringdeserializer = new StringDeserializer();
        add(stringdeserializer, java/lang/String);
        add(stringdeserializer, java/lang/CharSequence);
        add(new ClassDeserializer());
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.BooleanDeserializer(java/lang/Boolean, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.ByteDeserializer(java/lang/Byte, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.ShortDeserializer(java/lang/Short, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.CharacterDeserializer(java/lang/Character, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.IntegerDeserializer(java/lang/Integer, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.LongDeserializer(java/lang/Long, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.FloatDeserializer(java/lang/Float, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.DoubleDeserializer(java/lang/Double, null));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.BooleanDeserializer(Boolean.TYPE, Boolean.FALSE));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.ShortDeserializer(Short.TYPE, Short.valueOf((short)0)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.CharacterDeserializer(Character.TYPE, Character.valueOf('\0')));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.IntegerDeserializer(Integer.TYPE, Integer.valueOf(0)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.LongDeserializer(Long.TYPE, Long.valueOf(0L)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.FloatDeserializer(Float.TYPE, Float.valueOf(0.0F)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D)));
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.NumberDeserializer());
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.BigDecimalDeserializer());
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.BigIntegerDeserializer());
        add(new CalendarDeserializer());
        add(new DateDeserializer());
        add(new CalendarDeserializer(java/util/GregorianCalendar), java/util/GregorianCalendar);
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.SqlDateDeserializer());
        add(new TimestampDeserializer());
        for (Iterator iterator = FromStringDeserializer.all().iterator(); iterator.hasNext(); add((StdDeserializer)iterator.next())) { }
        add(new org.codehaus.jackson.map.deser.std.StdDeserializer.StackTraceElementDeserializer());
        add(new AtomicBooleanDeserializer());
        add(new TokenBufferDeserializer());
        add(new JavaTypeDeserializer());
    }

    private void add(StdDeserializer stddeserializer)
    {
        add(stddeserializer, stddeserializer.getValueClass());
    }

    private void add(StdDeserializer stddeserializer, Class class1)
    {
        _deserializers.put(new ClassKey(class1), stddeserializer);
    }

    public static HashMap constructAll()
    {
        return (new StdDeserializers())._deserializers;
    }
}
