// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.util.Provider;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ToStringSerializer, NullSerializer, ScalarSerializerBase, SerializerBase

public class StdJdkSerializers
    implements Provider
{
    public static final class AtomicBooleanSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("boolean", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicBoolean)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicBoolean atomicboolean, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeBoolean(atomicboolean.get());
        }

        public AtomicBooleanSerializer()
        {
            super(java/util/concurrent/atomic/AtomicBoolean, false);
        }
    }

    public static final class AtomicIntegerSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicInteger)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicInteger atomicinteger, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(atomicinteger.get());
        }

        public AtomicIntegerSerializer()
        {
            super(java/util/concurrent/atomic/AtomicInteger, false);
        }
    }

    public static final class AtomicLongSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicLong)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicLong atomiclong, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(atomiclong.get());
        }

        public AtomicLongSerializer()
        {
            super(java/util/concurrent/atomic/AtomicLong, false);
        }
    }

    public static final class AtomicReferenceSerializer extends SerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("any", true);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((AtomicReference)obj, jsongenerator, serializerprovider);
        }

        public void serialize(AtomicReference atomicreference, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serializerprovider.defaultSerializeValue(atomicreference.get(), jsongenerator);
        }

        public AtomicReferenceSerializer()
        {
            super(java/util/concurrent/atomic/AtomicReference, false);
        }
    }

    public static final class ClassSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("string", true);
        }

        public void serialize(Class class1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeString(class1.getName());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Class)obj, jsongenerator, serializerprovider);
        }

        public ClassSerializer()
        {
            super(java/lang/Class, false);
        }
    }

    public static final class FileSerializer extends ScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("string", true);
        }

        public void serialize(File file, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeString(file.getAbsolutePath());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((File)obj, jsongenerator, serializerprovider);
        }

        public FileSerializer()
        {
            super(java/io/File);
        }
    }


    public StdJdkSerializers()
    {
    }

    public Collection provide()
    {
        HashMap hashmap = new HashMap();
        ToStringSerializer tostringserializer = ToStringSerializer.instance;
        hashmap.put(java/net/URL, tostringserializer);
        hashmap.put(java/net/URI, tostringserializer);
        hashmap.put(java/util/Currency, tostringserializer);
        hashmap.put(java/util/UUID, tostringserializer);
        hashmap.put(java/util/regex/Pattern, tostringserializer);
        hashmap.put(java/util/Locale, tostringserializer);
        hashmap.put(java/util/Locale, tostringserializer);
        hashmap.put(java/util/concurrent/atomic/AtomicReference, org/codehaus/jackson/map/ser/std/StdJdkSerializers$AtomicReferenceSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicBoolean, org/codehaus/jackson/map/ser/std/StdJdkSerializers$AtomicBooleanSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicInteger, org/codehaus/jackson/map/ser/std/StdJdkSerializers$AtomicIntegerSerializer);
        hashmap.put(java/util/concurrent/atomic/AtomicLong, org/codehaus/jackson/map/ser/std/StdJdkSerializers$AtomicLongSerializer);
        hashmap.put(java/io/File, org/codehaus/jackson/map/ser/std/StdJdkSerializers$FileSerializer);
        hashmap.put(java/lang/Class, org/codehaus/jackson/map/ser/std/StdJdkSerializers$ClassSerializer);
        hashmap.put(Void.TYPE, org/codehaus/jackson/map/ser/std/NullSerializer);
        return hashmap.entrySet();
    }
}
