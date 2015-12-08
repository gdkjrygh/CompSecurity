// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            AsArraySerializerBase, StdContainerSerializers, ContainerSerializerBase

public static class  extends AsArraySerializerBase
{

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(_elementType, _staticTyping, typeserializer, _property, _elementSerializer);
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((List)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_elementSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(list, jsongenerator, serializerprovider, _elementSerializer);
_L14:
        return;
_L2:
        Object obj;
        Object obj1;
        Class class1;
        int i;
        int j;
        if (_valueTypeSerializer != null)
        {
            serializeTypedContents(list, jsongenerator, serializerprovider);
            return;
        }
        int k = list.size();
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        i = 0;
        Object obj2;
        JsonSerializer jsonserializer;
        Object obj3;
        try
        {
            obj1 = _dynamicSerializers;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            wrapAndThrow(serializerprovider, jsongenerator, list, j);
            return;
        }
_L12:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj3 = list.get(i);
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
        obj = obj1;
          goto _L5
_L4:
        j = i;
        class1 = obj3.getClass();
        j = i;
        jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
        obj2 = jsonserializer;
        obj = obj1;
        if (jsonserializer != null) goto _L7; else goto _L6
_L6:
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        j = i;
        obj1 = _findAndAddDynamic(((PropertySerializerMap) (obj1)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L10:
        j = i;
        obj = _dynamicSerializers;
        obj2 = obj1;
_L7:
        j = i;
        ((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
        break; /* Loop/switch isn't completed */
_L9:
        j = i;
        obj1 = _findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider);
        if (true) goto _L10; else goto _L5
_L5:
        i++;
        obj1 = obj;
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void serializeContentsUsing(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        int j = list.size();
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        TypeSerializer typeserializer;
        int i;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L4:
        Object obj;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = list.get(i);
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), list, i);
            }
            break MISSING_BLOCK_LABEL_96;
        }
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_96;
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void serializeTypedContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int k = list.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        Class class1;
        int i;
        int j;
        boolean flag = false;
        i = 0;
        j = ((flag) ? 1 : 0);
        Object obj2;
        JsonSerializer jsonserializer;
        TypeSerializer typeserializer;
        Object obj3;
        try
        {
            typeserializer = _valueTypeSerializer;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            wrapAndThrow(serializerprovider, jsongenerator, list, j);
            return;
        }
        j = ((flag) ? 1 : 0);
        obj1 = _dynamicSerializers;
_L12:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj3 = list.get(i);
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
        obj = obj1;
          goto _L5
_L4:
        j = i;
        class1 = obj3.getClass();
        j = i;
        jsonserializer = ((PropertySerializerMap) (obj1)).serializerFor(class1);
        obj2 = jsonserializer;
        obj = obj1;
        if (jsonserializer != null) goto _L7; else goto _L6
_L6:
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        j = i;
        obj1 = _findAndAddDynamic(((PropertySerializerMap) (obj1)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L10:
        j = i;
        obj = _dynamicSerializers;
        obj2 = obj1;
_L7:
        j = i;
        ((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
        break; /* Loop/switch isn't completed */
_L9:
        j = i;
        obj1 = _findAndAddDynamic(((PropertySerializerMap) (obj1)), class1, serializerprovider);
        if (true) goto _L10; else goto _L5
_L5:
        i++;
        obj1 = obj;
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L1; else goto _L13
_L13:
    }

    public (JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(java/util/List, javatype, flag, typeserializer, beanproperty, jsonserializer);
    }
}
