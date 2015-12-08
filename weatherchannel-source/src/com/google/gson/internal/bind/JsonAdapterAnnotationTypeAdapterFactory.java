// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;

public final class JsonAdapterAnnotationTypeAdapterFactory
    implements TypeAdapterFactory
{

    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorconstructor)
    {
        constructorConstructor = constructorconstructor;
    }

    static TypeAdapter getTypeAdapter(ConstructorConstructor constructorconstructor, Gson gson, TypeToken typetoken, JsonAdapter jsonadapter)
    {
        jsonadapter = jsonadapter.value();
        if (com/google/gson/TypeAdapter.isAssignableFrom(jsonadapter))
        {
            return (TypeAdapter)constructorconstructor.get(TypeToken.get(jsonadapter)).construct();
        }
        if (com/google/gson/TypeAdapterFactory.isAssignableFrom(jsonadapter))
        {
            return ((TypeAdapterFactory)constructorconstructor.get(TypeToken.get(jsonadapter)).construct()).create(gson, typetoken);
        } else
        {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        JsonAdapter jsonadapter = (JsonAdapter)typetoken.getRawType().getAnnotation(com/google/gson/annotations/JsonAdapter);
        if (jsonadapter == null)
        {
            return null;
        } else
        {
            return getTypeAdapter(constructorConstructor, gson, typetoken, jsonadapter);
        }
    }
}
