// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;

import java.io.IOException;
import java.util.Iterator;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package org.codehaus.jackson:
//            JsonProcessingException, JsonNode, JsonParser, JsonGenerator

public abstract class ObjectCodec
{

    protected ObjectCodec()
    {
    }

    public abstract JsonNode createArrayNode();

    public abstract JsonNode createObjectNode();

    public abstract JsonNode readTree(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException;

    public abstract JsonParser treeAsTokens(JsonNode jsonnode);

    public abstract Object treeToValue(JsonNode jsonnode, Class class1)
        throws IOException, JsonProcessingException;

    public abstract void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode)
        throws IOException, JsonProcessingException;

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException;
}
