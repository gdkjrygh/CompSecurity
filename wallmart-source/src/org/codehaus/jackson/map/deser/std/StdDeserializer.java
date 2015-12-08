// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.io.NumberInput;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public abstract class StdDeserializer extends JsonDeserializer
{
    public static class BigDecimalDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue();
            }
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return null;
                }
                try
                {
                    jsonparser = new BigDecimal(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
                }
                return jsonparser;
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
        }

        public BigDecimalDeserializer()
        {
            super(java/math/BigDecimal);
        }
    }

    public static class BigIntegerDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigInteger deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
_L1:
            static class _cls1
            {

                static final int $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[];
                static final int $SwitchMap$org$codehaus$jackson$JsonToken[];

                static 
                {
                    $SwitchMap$org$codehaus$jackson$JsonParser$NumberType = new int[org.codehaus.jackson.JsonParser.NumberType.values().length];
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[org.codehaus.jackson.JsonParser.NumberType.INT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$JsonParser$NumberType[org.codehaus.jackson.JsonParser.NumberType.LONG.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    $SwitchMap$org$codehaus$jackson$JsonToken = new int[JsonToken.values().length];
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.org.codehaus.jackson.JsonParser.NumberType[jsonparser.getNumberType().ordinal()];
            JVM INSTR tableswitch 1 2: default 44
        //                       1 61
        //                       2 61;
               goto _L3 _L4 _L4
_L3:
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return null;
            }
            break; /* Loop/switch isn't completed */
_L4:
            return BigInteger.valueOf(jsonparser.getLongValue());
_L2:
            if (jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue().toBigInteger();
            }
            if (jsontoken != JsonToken.VALUE_STRING)
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
            if (true) goto _L3; else goto _L5
_L5:
            try
            {
                jsonparser = new BigInteger(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
            }
            return jsonparser;
        }

        public BigIntegerDeserializer()
        {
            super(java/math/BigInteger);
        }
    }

    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public BooleanDeserializer(Class class1, Boolean boolean1)
        {
            super(class1, boolean1);
        }
    }

    public static final class ByteDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseByte(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public ByteDeserializer(Class class1, Byte byte1)
        {
            super(class1, byte1);
        }
    }

    public static final class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT)
            {
                int i = jsonparser.getIntValue();
                if (i >= 0 && i <= 65535)
                {
                    return Character.valueOf((char)i);
                }
            } else
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText();
                if (jsonparser.length() == 1)
                {
                    return Character.valueOf(jsonparser.charAt(0));
                }
                if (jsonparser.length() == 0)
                {
                    return (Character)getEmptyValue();
                }
            }
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public CharacterDeserializer(Class class1, Character character)
        {
            super(class1, character);
        }
    }

    public static final class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public DoubleDeserializer(Class class1, Double double1)
        {
            super(class1, double1);
        }
    }

    public static final class FloatDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseFloat(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public FloatDeserializer(Class class1, Float float1)
        {
            super(class1, float1);
        }
    }

    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public IntegerDeserializer(Class class1, Integer integer)
        {
            super(class1, integer);
        }
    }

    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseLong(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public LongDeserializer(Class class1, Long long1)
        {
            super(class1, long1);
        }
    }

    public static final class NumberDeserializer extends StdScalarDeserializer
    {

        public Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken;
            jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT)
            {
                if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_INTEGER_FOR_INTS))
                {
                    return jsonparser.getBigIntegerValue();
                } else
                {
                    return jsonparser.getNumberValue();
                }
            }
            if (jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_DECIMAL_FOR_FLOATS))
                {
                    return jsonparser.getDecimalValue();
                } else
                {
                    return Double.valueOf(jsonparser.getDoubleValue());
                }
            }
            if (jsontoken != JsonToken.VALUE_STRING)
            {
                break MISSING_BLOCK_LABEL_184;
            }
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.indexOf('.') < 0)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            jsonparser = new BigDecimal(jsonparser);
            return jsonparser;
            return new Double(jsonparser);
            long l;
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_INTEGER_FOR_INTS))
            {
                return new BigInteger(jsonparser);
            }
            l = Long.parseLong(jsonparser);
            if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
            {
                try
                {
                    return Integer.valueOf((int)l);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "not a valid number");
                }
            } else
            {
                return Long.valueOf(l);
            }
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            switch (_cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()])
            {
            default:
                return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                return deserialize(jsonparser, deserializationcontext);
            }
        }

        public NumberDeserializer()
        {
            super(java/lang/Number);
        }
    }

    protected static abstract class PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
    {

        final Object _nullValue;

        public final Object getNullValue()
        {
            return _nullValue;
        }

        protected PrimitiveOrWrapperDeserializer(Class class1, Object obj)
        {
            super(class1);
            _nullValue = obj;
        }
    }

    public static final class ShortDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseShort(jsonparser, deserializationcontext);
        }

        public ShortDeserializer(Class class1, Short short1)
        {
            super(class1, short1);
        }
    }

    public static class SqlDateDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public java.sql.Date deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            jsonparser = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser == null)
            {
                return null;
            } else
            {
                return new java.sql.Date(jsonparser.getTime());
            }
        }

        public SqlDateDeserializer()
        {
            super(java/sql/Date);
        }
    }

    public static class StackTraceElementDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.START_OBJECT)
            {
                String s1 = "";
                obj = "";
                String s = "";
                int i = -1;
                do
                {
                    JsonToken jsontoken = jsonparser.nextValue();
                    if (jsontoken == JsonToken.END_OBJECT)
                    {
                        break;
                    }
                    String s2 = jsonparser.getCurrentName();
                    if ("className".equals(s2))
                    {
                        s1 = jsonparser.getText();
                    } else
                    if ("fileName".equals(s2))
                    {
                        s = jsonparser.getText();
                    } else
                    if ("lineNumber".equals(s2))
                    {
                        if (jsontoken.isNumeric())
                        {
                            i = jsonparser.getIntValue();
                        } else
                        {
                            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Non-numeric token (").append(jsontoken).append(") for property 'lineNumber'").toString());
                        }
                    } else
                    if ("methodName".equals(s2))
                    {
                        obj = jsonparser.getText();
                    } else
                    if (!"nativeMethod".equals(s2))
                    {
                        handleUnknownProperty(jsonparser, deserializationcontext, _valueClass, s2);
                    }
                } while (true);
                return new StackTraceElement(s1, ((String) (obj)), s, i);
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }

        public StackTraceElementDeserializer()
        {
            super(java/lang/StackTraceElement);
        }
    }


    protected final Class _valueClass;

    protected StdDeserializer(Class class1)
    {
        _valueClass = class1;
    }

    protected StdDeserializer(JavaType javatype)
    {
        if (javatype == null)
        {
            javatype = null;
        } else
        {
            javatype = javatype.getRawClass();
        }
        _valueClass = javatype;
    }

    protected static final double parseDouble(String s)
        throws NumberFormatException
    {
        if ("2.2250738585072012e-308".equals(s))
        {
            return 2.2250738585072014E-308D;
        } else
        {
            return Double.parseDouble(s);
        }
    }

    protected final Boolean _parseBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_TRUE)
        {
            return Boolean.TRUE;
        }
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return Boolean.FALSE;
        }
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            if (jsonparser.getNumberType() == org.codehaus.jackson.JsonParser.NumberType.INT)
            {
                if (jsonparser.getIntValue() == 0)
                {
                    return Boolean.FALSE;
                } else
                {
                    return Boolean.TRUE;
                }
            } else
            {
                return Boolean.valueOf(_parseBooleanFromNumber(jsonparser, deserializationcontext));
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Boolean)getNullValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if ("true".equals(jsonparser))
            {
                return Boolean.TRUE;
            }
            if ("false".equals(jsonparser))
            {
                return Boolean.FALSE;
            }
            if (jsonparser.length() == 0)
            {
                return (Boolean)getEmptyValue();
            } else
            {
                throw deserializationcontext.weirdStringException(_valueClass, "only \"true\" or \"false\" recognized");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final boolean _parseBooleanFromNumber(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getNumberType() == org.codehaus.jackson.JsonParser.NumberType.LONG)
        {
            if (jsonparser.getLongValue() == 0L)
            {
                jsonparser = Boolean.FALSE;
            } else
            {
                jsonparser = Boolean.TRUE;
            }
            return jsonparser.booleanValue();
        }
        jsonparser = jsonparser.getText();
        if ("0.0".equals(jsonparser) || "0".equals(jsonparser))
        {
            return Boolean.FALSE.booleanValue();
        } else
        {
            return Boolean.TRUE.booleanValue();
        }
    }

    protected final boolean _parseBooleanPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_TRUE) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return false;
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return false;
        }
        if (jsontoken != JsonToken.VALUE_NUMBER_INT)
        {
            break; /* Loop/switch isn't completed */
        }
        if (jsonparser.getNumberType() == org.codehaus.jackson.JsonParser.NumberType.INT)
        {
            if (jsonparser.getIntValue() == 0)
            {
                return false;
            }
        } else
        {
            return _parseBooleanFromNumber(jsonparser, deserializationcontext);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (!"true".equals(jsonparser))
            {
                if ("false".equals(jsonparser) || jsonparser.length() == 0)
                {
                    return Boolean.FALSE.booleanValue();
                } else
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "only \"true\" or \"false\" recognized");
                }
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected Byte _parseByte(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Byte.valueOf(jsonparser.getByteValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            int i;
            try
            {
                if (jsonparser.length() == 0)
                {
                    return (Byte)getEmptyValue();
                }
                i = NumberInput.parseInt(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Byte value");
            }
            if (i < -128 || i > 255)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 8-bit value");
            } else
            {
                return Byte.valueOf((byte)i);
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Byte)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            return new Date(jsonparser.getLongValue());
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Date)getNullValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            try
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return (Date)getEmptyValue();
                }
                jsonparser = deserializationcontext.parseDate(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("not a valid representation (error: ").append(jsonparser.getMessage()).append(")").toString());
            }
            return jsonparser;
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final Double _parseDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Double)getEmptyValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 100
    //                   45: 154
    //                   73: 110
    //                   78: 137;
           goto _L3 _L4 _L5 _L6
_L3:
        double d;
        try
        {
            d = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Double value");
        }
        return Double.valueOf(d);
_L5:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L3; else goto _L7
_L7:
        return Double.valueOf((1.0D / 0.0D));
_L6:
        if (!"NaN".equals(jsonparser)) goto _L3; else goto _L8
_L8:
        return Double.valueOf((0.0D / 0.0D));
_L4:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L3; else goto _L9
_L9:
        return Double.valueOf((-1.0D / 0.0D));
_L2:
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Double)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final double _parseDoublePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        double d;
        JsonToken jsontoken;
        d = 0.0D;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        d = jsonparser.getDoubleValue();
_L4:
        return d;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 92
    //                   45: 137
    //                   73: 99
    //                   78: 123;
           goto _L5 _L6 _L7 _L8
_L5:
        double d1;
        try
        {
            d1 = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid double value");
        }
        return d1;
_L7:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0D / 0.0D);
_L8:
        if (!"NaN".equals(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0D / 0.0D);
_L6:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0D / 0.0D);
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L12
_L12:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final Float _parseFloat(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Float.valueOf(jsonparser.getFloatValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Float)getEmptyValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 100
    //                   45: 154
    //                   73: 110
    //                   78: 137;
           goto _L3 _L4 _L5 _L6
_L3:
        float f;
        try
        {
            f = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Float value");
        }
        return Float.valueOf(f);
_L5:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L3; else goto _L7
_L7:
        return Float.valueOf((1.0F / 0.0F));
_L6:
        if (!"NaN".equals(jsonparser)) goto _L3; else goto _L8
_L8:
        return Float.valueOf((0.0F / 0.0F));
_L4:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L3; else goto _L9
_L9:
        return Float.valueOf((-1.0F / 0.0F));
_L2:
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Float)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final float _parseFloatPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        float f;
        JsonToken jsontoken;
        f = 0.0F;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        f = jsonparser.getFloatValue();
_L4:
        return f;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 92
    //                   45: 137
    //                   73: 99
    //                   78: 123;
           goto _L5 _L6 _L7 _L8
_L5:
        float f1;
        try
        {
            f1 = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid float value");
        }
        return f1;
_L7:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0F / 0.0F);
_L8:
        if (!"NaN".equals(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0F / 0.0F);
_L6:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0F / 0.0F);
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L12
_L12:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final int _parseIntPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        int i;
        i = 0;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        i = jsonparser.getIntValue();
_L4:
        return i;
_L2:
        int j;
        long l;
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        try
        {
            j = jsonparser.length();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid int value");
        }
        if (j <= 9)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(jsonparser).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
        return (int)l;
        if (j == 0) goto _L4; else goto _L3
_L3:
        i = NumberInput.parseInt(jsonparser);
        return i;
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L5
_L5:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        int i;
        long l;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        jsonparser = jsonparser.getText().trim();
        try
        {
            i = jsonparser.length();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Integer value");
        }
        if (i <= 9)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(jsonparser).append(") out of range of Integer (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
        i = (int)l;
        return Integer.valueOf(i);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        return (Integer)getEmptyValue();
        i = NumberInput.parseInt(jsonparser);
        return Integer.valueOf(i);
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Integer)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Long.valueOf(jsonparser.getLongValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return (Long)getEmptyValue();
            }
            long l;
            try
            {
                l = NumberInput.parseLong(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Long value");
            }
            return Long.valueOf(l);
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Long)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final long _parseLongPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        long l;
        l = 0L;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        l = jsonparser.getLongValue();
_L4:
        return l;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        long l1;
        try
        {
            l1 = NumberInput.parseLong(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid long value");
        }
        return l1;
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L5
_L5:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected Short _parseShort(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Short.valueOf(jsonparser.getShortValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            int i;
            try
            {
                if (jsonparser.length() == 0)
                {
                    return (Short)getEmptyValue();
                }
                i = NumberInput.parseInt(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Short value");
            }
            if (i < -32768 || i > 32767)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 16-bit value");
            } else
            {
                return Short.valueOf((short)i);
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Short)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final short _parseShortPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        int i = _parseIntPrimitive(jsonparser, deserializationcontext);
        if (i < -32768 || i > 32767)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 16-bit value");
        } else
        {
            return (short)i;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    protected JsonDeserializer findDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return deserializerprovider.findValueDeserializer(deserializationconfig, javatype, beanproperty);
    }

    public Class getValueClass()
    {
        return _valueClass;
    }

    public JavaType getValueType()
    {
        return null;
    }

    protected void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = getValueClass();
        }
        if (deserializationcontext.handleUnknownProperty(jsonparser, this, obj1, s))
        {
            return;
        } else
        {
            reportUnknownProperty(deserializationcontext, obj1, s);
            jsonparser.skipChildren();
            return;
        }
    }

    protected boolean isDefaultSerializer(JsonDeserializer jsondeserializer)
    {
        return jsondeserializer != null && jsondeserializer.getClass().getAnnotation(org/codehaus/jackson/map/annotate/JacksonStdImpl) != null;
    }

    protected void reportUnknownProperty(DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES))
        {
            throw deserializationcontext.unknownFieldException(obj, s);
        } else
        {
            return;
        }
    }
}
