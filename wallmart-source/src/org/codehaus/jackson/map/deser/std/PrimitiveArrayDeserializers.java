// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.HashMap;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ObjectBuffer;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdDeserializer

public class PrimitiveArrayDeserializers
{
    static abstract class Base extends StdDeserializer
    {

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
        }

        protected Base(Class class1)
        {
            super(class1);
        }
    }

    static final class BooleanDeser extends Base
    {

        private final boolean[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new boolean[] {
                    _parseBooleanPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.BooleanBuilder booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
            boolean aflag[] = (boolean[])booleanbuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                boolean flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
                boolean aflag1[] = aflag;
                int j = i;
                if (i >= aflag.length)
                {
                    aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(aflag, i);
                    j = 0;
                }
                aflag1[j] = flag;
                i = j + 1;
                aflag = aflag1;
            }
            return (boolean[])booleanbuilder.completeAndClearBuffer(aflag, i);
        }

        public BooleanDeser()
        {
            super([Z);
        }
    }

    static final class ByteDeser extends Base
    {

        private final byte[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
            JsonToken jsontoken = jsonparser.getCurrentToken();
            byte byte0;
            if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                byte0 = jsonparser.getByteValue();
            } else
            {
                if (jsontoken != JsonToken.VALUE_NULL)
                {
                    throw deserializationcontext.mappingException(_valueClass.getComponentType());
                }
                byte0 = 0;
            }
            return (new byte[] {
                byte0
            });
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                return jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
            }
            if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                Object obj = jsonparser.getEmbeddedObject();
                if (obj == null)
                {
                    return null;
                }
                if (obj instanceof byte[])
                {
                    return (byte[])(byte[])obj;
                }
            }
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.ByteBuilder bytebuilder = deserializationcontext.getArrayBuilders().getByteBuilder();
            byte abyte0[] = (byte[])bytebuilder.resetAndStart();
            int i = 0;
            do
            {
                Object obj1 = jsonparser.nextToken();
                if (obj1 != JsonToken.END_ARRAY)
                {
                    byte byte0;
                    int j;
                    if (obj1 == JsonToken.VALUE_NUMBER_INT || obj1 == JsonToken.VALUE_NUMBER_FLOAT)
                    {
                        byte0 = jsonparser.getByteValue();
                    } else
                    {
                        if (obj1 != JsonToken.VALUE_NULL)
                        {
                            throw deserializationcontext.mappingException(_valueClass.getComponentType());
                        }
                        byte0 = 0;
                    }
                    obj1 = abyte0;
                    j = i;
                    if (i >= abyte0.length)
                    {
                        obj1 = (byte[])bytebuilder.appendCompletedChunk(abyte0, i);
                        j = 0;
                    }
                    obj1[j] = byte0;
                    i = j + 1;
                    abyte0 = ((byte []) (obj1));
                } else
                {
                    return (byte[])bytebuilder.completeAndClearBuffer(abyte0, i);
                }
            } while (true);
        }

        public ByteDeser()
        {
            super([B);
        }
    }

    static final class CharDeser extends Base
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public char[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.VALUE_STRING)
            {
                deserializationcontext = jsonparser.getTextCharacters();
                int i = jsonparser.getTextOffset();
                int j = jsonparser.getTextLength();
                jsonparser = new char[j];
                System.arraycopy(deserializationcontext, i, jsonparser, 0, j);
                return jsonparser;
            }
            if (jsonparser.isExpectedStartArrayToken())
            {
                obj = new StringBuilder(64);
                do
                {
                    Object obj1 = jsonparser.nextToken();
                    if (obj1 != JsonToken.END_ARRAY)
                    {
                        if (obj1 != JsonToken.VALUE_STRING)
                        {
                            throw deserializationcontext.mappingException(Character.TYPE);
                        }
                        obj1 = jsonparser.getText();
                        if (((String) (obj1)).length() != 1)
                        {
                            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not convert a JSON String of length ").append(((String) (obj1)).length()).append(" into a char element of char array").toString());
                        }
                        ((StringBuilder) (obj)).append(((String) (obj1)).charAt(0));
                    } else
                    {
                        return ((StringBuilder) (obj)).toString().toCharArray();
                    }
                } while (true);
            }
            if (obj == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
                if (jsonparser == null)
                {
                    return null;
                }
                if (jsonparser instanceof char[])
                {
                    return (char[])(char[])jsonparser;
                }
                if (jsonparser instanceof String)
                {
                    return ((String)jsonparser).toCharArray();
                }
                if (jsonparser instanceof byte[])
                {
                    return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false).toCharArray();
                }
            }
            throw deserializationcontext.mappingException(_valueClass);
        }

        public CharDeser()
        {
            super([C);
        }
    }

    static final class DoubleDeser extends Base
    {

        private final double[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new double[] {
                    _parseDoublePrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.DoubleBuilder doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
            double ad[] = (double[])doublebuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                double d = _parseDoublePrimitive(jsonparser, deserializationcontext);
                double ad1[] = ad;
                int j = i;
                if (i >= ad.length)
                {
                    ad1 = (double[])doublebuilder.appendCompletedChunk(ad, i);
                    j = 0;
                }
                ad1[j] = d;
                i = j + 1;
                ad = ad1;
            }
            return (double[])doublebuilder.completeAndClearBuffer(ad, i);
        }

        public DoubleDeser()
        {
            super([D);
        }
    }

    static final class FloatDeser extends Base
    {

        private final float[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new float[] {
                    _parseFloatPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.FloatBuilder floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
            float af[] = (float[])floatbuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                float f = _parseFloatPrimitive(jsonparser, deserializationcontext);
                float af1[] = af;
                int j = i;
                if (i >= af.length)
                {
                    af1 = (float[])floatbuilder.appendCompletedChunk(af, i);
                    j = 0;
                }
                af1[j] = f;
                i = j + 1;
                af = af1;
            }
            return (float[])floatbuilder.completeAndClearBuffer(af, i);
        }

        public FloatDeser()
        {
            super([F);
        }
    }

    static final class IntDeser extends Base
    {

        private final int[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new int[] {
                    _parseIntPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.IntBuilder intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
            int ai[] = (int[])intbuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                int k = _parseIntPrimitive(jsonparser, deserializationcontext);
                int ai1[] = ai;
                int j = i;
                if (i >= ai.length)
                {
                    ai1 = (int[])intbuilder.appendCompletedChunk(ai, i);
                    j = 0;
                }
                ai1[j] = k;
                i = j + 1;
                ai = ai1;
            }
            return (int[])intbuilder.completeAndClearBuffer(ai, i);
        }

        public IntDeser()
        {
            super([I);
        }
    }

    static final class LongDeser extends Base
    {

        private final long[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new long[] {
                    _parseLongPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.LongBuilder longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
            long al[] = (long[])longbuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                long l = _parseLongPrimitive(jsonparser, deserializationcontext);
                long al1[] = al;
                int j = i;
                if (i >= al.length)
                {
                    al1 = (long[])longbuilder.appendCompletedChunk(al, i);
                    j = 0;
                }
                al1[j] = l;
                i = j + 1;
                al = al1;
            }
            return (long[])longbuilder.completeAndClearBuffer(al, i);
        }

        public LongDeser()
        {
            super([J);
        }
    }

    static final class ShortDeser extends Base
    {

        private final short[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new short[] {
                    _parseShortPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            org.codehaus.jackson.map.util.ArrayBuilders.ShortBuilder shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
            short aword0[] = (short[])shortbuilder.resetAndStart();
            int i = 0;
            while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
            {
                short word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
                short aword1[] = aword0;
                int j = i;
                if (i >= aword0.length)
                {
                    aword1 = (short[])shortbuilder.appendCompletedChunk(aword0, i);
                    j = 0;
                }
                aword1[j] = word0;
                i = j + 1;
                aword0 = aword1;
            }
            return (short[])shortbuilder.completeAndClearBuffer(aword0, i);
        }

        public ShortDeser()
        {
            super([S);
        }
    }

    static final class StringDeser extends Base
    {

        private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = null;
            if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
                {
                    return null;
                } else
                {
                    throw deserializationcontext.mappingException(_valueClass);
                }
            }
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
            {
                jsonparser = obj;
            } else
            {
                jsonparser = jsonparser.getText();
            }
            return (new String[] {
                jsonparser
            });
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
            Object aobj[] = objectbuffer.resetAndStart();
            int i = 0;
            do
            {
                Object obj = jsonparser.nextToken();
                if (obj != JsonToken.END_ARRAY)
                {
                    Object aobj1[];
                    int j;
                    if (obj == JsonToken.VALUE_NULL)
                    {
                        obj = null;
                    } else
                    {
                        obj = jsonparser.getText();
                    }
                    aobj1 = aobj;
                    j = i;
                    if (i >= aobj.length)
                    {
                        aobj1 = objectbuffer.appendCompletedChunk(aobj);
                        j = 0;
                    }
                    aobj1[j] = obj;
                    i = j + 1;
                    aobj = aobj1;
                } else
                {
                    jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
                    deserializationcontext.returnObjectBuffer(objectbuffer);
                    return jsonparser;
                }
            } while (true);
        }

        public StringDeser()
        {
            super([Ljava/lang/String;);
        }
    }


    static final PrimitiveArrayDeserializers instance = new PrimitiveArrayDeserializers();
    HashMap _allDeserializers;

    protected PrimitiveArrayDeserializers()
    {
        _allDeserializers = new HashMap();
        add(Boolean.TYPE, new BooleanDeser());
        add(Byte.TYPE, new ByteDeser());
        add(Short.TYPE, new ShortDeser());
        add(Integer.TYPE, new IntDeser());
        add(Long.TYPE, new LongDeser());
        add(Float.TYPE, new FloatDeser());
        add(Double.TYPE, new DoubleDeser());
        add(java/lang/String, new StringDeser());
        add(Character.TYPE, new CharDeser());
    }

    private void add(Class class1, JsonDeserializer jsondeserializer)
    {
        _allDeserializers.put(TypeFactory.defaultInstance().constructType(class1), jsondeserializer);
    }

    public static HashMap getAll()
    {
        return instance._allDeserializers;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

}
