// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.io.CharacterEscapes;
import org.codehaus.jackson.io.SerializedString;

// Referenced classes of package org.codehaus.jackson:
//            Versioned, JsonProcessingException, FormatSchema, Version, 
//            JsonGenerationException, Base64Variants, SerializableString, PrettyPrinter, 
//            JsonParser, ObjectCodec, JsonStreamContext, Base64Variant, 
//            JsonNode

public abstract class JsonGenerator
    implements Closeable, Versioned
{
    public static final class Feature extends Enum
    {

        private static final Feature $VALUES[];
        public static final Feature AUTO_CLOSE_JSON_CONTENT;
        public static final Feature AUTO_CLOSE_TARGET;
        public static final Feature ESCAPE_NON_ASCII;
        public static final Feature FLUSH_PASSED_TO_STREAM;
        public static final Feature QUOTE_FIELD_NAMES;
        public static final Feature QUOTE_NON_NUMERIC_NUMBERS;
        public static final Feature WRITE_NUMBERS_AS_STRINGS;
        final boolean _defaultState;
        final int _mask = 1 << ordinal();

        public static int collectDefaults()
        {
            int j = 0;
            Feature afeature[] = values();
            int l = afeature.length;
            for (int i = 0; i < l;)
            {
                Feature feature = afeature[i];
                int k = j;
                if (feature.enabledByDefault())
                {
                    k = j | feature.getMask();
                }
                i++;
                j = k;
            }

            return j;
        }

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(org/codehaus/jackson/JsonGenerator$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])$VALUES.clone();
        }

        public boolean enabledByDefault()
        {
            return _defaultState;
        }

        public int getMask()
        {
            return _mask;
        }

        static 
        {
            AUTO_CLOSE_TARGET = new Feature("AUTO_CLOSE_TARGET", 0, true);
            AUTO_CLOSE_JSON_CONTENT = new Feature("AUTO_CLOSE_JSON_CONTENT", 1, true);
            QUOTE_FIELD_NAMES = new Feature("QUOTE_FIELD_NAMES", 2, true);
            QUOTE_NON_NUMERIC_NUMBERS = new Feature("QUOTE_NON_NUMERIC_NUMBERS", 3, true);
            WRITE_NUMBERS_AS_STRINGS = new Feature("WRITE_NUMBERS_AS_STRINGS", 4, false);
            FLUSH_PASSED_TO_STREAM = new Feature("FLUSH_PASSED_TO_STREAM", 5, true);
            ESCAPE_NON_ASCII = new Feature("ESCAPE_NON_ASCII", 6, false);
            $VALUES = (new Feature[] {
                AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, WRITE_NUMBERS_AS_STRINGS, FLUSH_PASSED_TO_STREAM, ESCAPE_NON_ASCII
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
    }


    protected PrettyPrinter _cfgPrettyPrinter;

    protected JsonGenerator()
    {
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        return false;
    }

    public abstract void close()
        throws IOException;

    public JsonGenerator configure(Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public abstract void copyCurrentEvent(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract void copyCurrentStructure(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract JsonGenerator disable(Feature feature);

    public void disableFeature(Feature feature)
    {
        disable(feature);
    }

    public abstract JsonGenerator enable(Feature feature);

    public void enableFeature(Feature feature)
    {
        enable(feature);
    }

    public abstract void flush()
        throws IOException;

    public CharacterEscapes getCharacterEscapes()
    {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public int getHighestEscapedChar()
    {
        return 0;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget()
    {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public boolean isFeatureEnabled(Feature feature)
    {
        return isEnabled(feature);
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectcodec);

    public void setFeature(Feature feature, boolean flag)
    {
        configure(feature, flag);
    }

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
    {
        _cfgPrettyPrinter = prettyprinter;
        return this;
    }

    public void setSchema(FormatSchema formatschema)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Generator of type ").append(getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public Version version()
    {
        return Version.unknownVersion();
    }

    public final void writeArrayFieldStart(String s)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeStartArray();
    }

    public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException;

    public void writeBinary(byte abyte0[])
        throws IOException, JsonGenerationException
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
    }

    public void writeBinary(byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
    }

    public final void writeBinaryField(String s, byte abyte0[])
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeBinary(abyte0);
    }

    public abstract void writeBoolean(boolean flag)
        throws IOException, JsonGenerationException;

    public final void writeBooleanField(String s, boolean flag)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeBoolean(flag);
    }

    public abstract void writeEndArray()
        throws IOException, JsonGenerationException;

    public abstract void writeEndObject()
        throws IOException, JsonGenerationException;

    public abstract void writeFieldName(String s)
        throws IOException, JsonGenerationException;

    public void writeFieldName(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeFieldName(serializablestring.getValue());
    }

    public void writeFieldName(SerializedString serializedstring)
        throws IOException, JsonGenerationException
    {
        writeFieldName(serializedstring.getValue());
    }

    public abstract void writeNull()
        throws IOException, JsonGenerationException;

    public final void writeNullField(String s)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNull();
    }

    public abstract void writeNumber(double d)
        throws IOException, JsonGenerationException;

    public abstract void writeNumber(float f)
        throws IOException, JsonGenerationException;

    public abstract void writeNumber(int i)
        throws IOException, JsonGenerationException;

    public abstract void writeNumber(long l)
        throws IOException, JsonGenerationException;

    public abstract void writeNumber(String s)
        throws IOException, JsonGenerationException, UnsupportedOperationException;

    public abstract void writeNumber(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException;

    public abstract void writeNumber(BigInteger biginteger)
        throws IOException, JsonGenerationException;

    public final void writeNumberField(String s, double d)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNumber(d);
    }

    public final void writeNumberField(String s, float f)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNumber(f);
    }

    public final void writeNumberField(String s, int i)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNumber(i);
    }

    public final void writeNumberField(String s, long l)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNumber(l);
    }

    public final void writeNumberField(String s, BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeNumber(bigdecimal);
    }

    public abstract void writeObject(Object obj)
        throws IOException, JsonProcessingException;

    public final void writeObjectField(String s, Object obj)
        throws IOException, JsonProcessingException
    {
        writeFieldName(s);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String s)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeStartObject();
    }

    public abstract void writeRaw(char c)
        throws IOException, JsonGenerationException;

    public abstract void writeRaw(String s)
        throws IOException, JsonGenerationException;

    public abstract void writeRaw(String s, int i, int j)
        throws IOException, JsonGenerationException;

    public abstract void writeRaw(char ac[], int i, int j)
        throws IOException, JsonGenerationException;

    public abstract void writeRawUTF8String(byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException;

    public abstract void writeRawValue(String s)
        throws IOException, JsonGenerationException;

    public abstract void writeRawValue(String s, int i, int j)
        throws IOException, JsonGenerationException;

    public abstract void writeRawValue(char ac[], int i, int j)
        throws IOException, JsonGenerationException;

    public abstract void writeStartArray()
        throws IOException, JsonGenerationException;

    public abstract void writeStartObject()
        throws IOException, JsonGenerationException;

    public abstract void writeString(String s)
        throws IOException, JsonGenerationException;

    public void writeString(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeString(serializablestring.getValue());
    }

    public abstract void writeString(char ac[], int i, int j)
        throws IOException, JsonGenerationException;

    public void writeStringField(String s, String s1)
        throws IOException, JsonGenerationException
    {
        writeFieldName(s);
        writeString(s1);
    }

    public abstract void writeTree(JsonNode jsonnode)
        throws IOException, JsonProcessingException;

    public abstract void writeUTF8String(byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException;
}
