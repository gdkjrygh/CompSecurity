// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

public final class ArrayTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory FACTORY = new _cls1();
    private final Class componentType;
    private final TypeAdapter componentTypeAdapter;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeadapter, Class class1)
    {
        componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, class1);
        componentType = class1;
    }

    public Object read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(componentTypeAdapter.read(jsonreader))) { }
        jsonreader.endArray();
        jsonreader = ((JsonReader) (Array.newInstance(componentType, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(jsonreader, i, arraylist.get(i));
        }

        return jsonreader;
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            componentTypeAdapter.write(jsonwriter, obj1);
        }

        jsonwriter.endArray();
    }


    private class _cls1
        implements TypeAdapterFactory
    {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            typetoken = typetoken.getType();
            if (!(typetoken instanceof GenericArrayType) && (!(typetoken instanceof Class) || !((Class)typetoken).isArray()))
            {
                return null;
            } else
            {
                typetoken = com.google.gson.internal..Gson.Types.getArrayComponentType(typetoken);
                return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(typetoken)), com.google.gson.internal..Gson.Types.getRawType(typetoken));
            }
        }

        _cls1()
        {
        }
    }

}
