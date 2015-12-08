// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.DateSerializer;
import org.codehaus.jackson.map.ser.std.NonTypedScalarSerializerBase;
import org.codehaus.jackson.map.ser.std.ScalarSerializerBase;

public class StdSerializers
{
    public static final class BooleanSerializer extends NonTypedScalarSerializerBase
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

        public BooleanSerializer(boolean flag)
        {
            super(java/lang/Boolean);
            _forPrimitive = flag;
        }
    }

    public static final class CalendarSerializer extends org.codehaus.jackson.map.ser.std.CalendarSerializer
    {

        public CalendarSerializer()
        {
        }
    }

    public static final class DoubleSerializer extends NonTypedScalarSerializerBase
    {

        static final DoubleSerializer instance = new DoubleSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(double1.doubleValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Double)obj, jsongenerator, serializerprovider);
        }


        public DoubleSerializer()
        {
            super(java/lang/Double);
        }
    }

    public static final class FloatSerializer extends ScalarSerializerBase
    {

        static final FloatSerializer instance = new FloatSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Float float1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(float1.floatValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Float)obj, jsongenerator, serializerprovider);
        }


        public FloatSerializer()
        {
            super(java/lang/Float);
        }
    }

    public static final class IntLikeSerializer extends ScalarSerializerBase
    {

        static final IntLikeSerializer instance = new IntLikeSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(number.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public IntLikeSerializer()
        {
            super(java/lang/Number);
        }
    }

    public static final class IntegerSerializer extends NonTypedScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public void serialize(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(integer.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Integer)obj, jsongenerator, serializerprovider);
        }

        public IntegerSerializer()
        {
            super(java/lang/Integer);
        }
    }

    public static final class LongSerializer extends ScalarSerializerBase
    {

        static final LongSerializer instance = new LongSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(long1.longValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Long)obj, jsongenerator, serializerprovider);
        }


        public LongSerializer()
        {
            super(java/lang/Long);
        }
    }

    public static final class NumberSerializer extends ScalarSerializerBase
    {

        public static final NumberSerializer instance = new NumberSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            if (number instanceof BigDecimal)
            {
                jsongenerator.writeNumber((BigDecimal)number);
                return;
            }
            if (number instanceof BigInteger)
            {
                jsongenerator.writeNumber((BigInteger)number);
                return;
            }
            if (number instanceof Integer)
            {
                jsongenerator.writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long)
            {
                jsongenerator.writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double)
            {
                jsongenerator.writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float)
            {
                jsongenerator.writeNumber(number.floatValue());
                return;
            }
            if ((number instanceof Byte) || (number instanceof Short))
            {
                jsongenerator.writeNumber(number.intValue());
                return;
            } else
            {
                jsongenerator.writeNumber(number.toString());
                return;
            }
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public NumberSerializer()
        {
            super(java/lang/Number);
        }
    }

    public static final class SerializableSerializer extends org.codehaus.jackson.map.ser.std.SerializableSerializer
    {

        public SerializableSerializer()
        {
        }
    }

    public static final class SerializableWithTypeSerializer extends org.codehaus.jackson.map.ser.std.SerializableWithTypeSerializer
    {

        public SerializableWithTypeSerializer()
        {
        }
    }

    public static final class SqlDateSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("string", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Date)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeString(date.toString());
        }

        public SqlDateSerializer()
        {
            super(java/sql/Date);
        }
    }

    public static final class SqlTimeSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("string", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Time)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Time time, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeString(time.toString());
        }

        public SqlTimeSerializer()
        {
            super(java/sql/Time);
        }
    }

    public static final class StringSerializer extends NonTypedScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("string", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((String)obj, jsongenerator, serializerprovider);
        }

        public void serialize(String s, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeString(s);
        }

        public StringSerializer()
        {
            super(java/lang/String);
        }
    }

    public static final class UtilDateSerializer extends DateSerializer
    {

        public UtilDateSerializer()
        {
        }
    }


    protected StdSerializers()
    {
    }
}
