// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class mTypeAdapter
    implements TypeAdapterFactory
{

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        typetoken = typetoken.getRawType();
        if (!java/lang/Enum.isAssignableFrom(typetoken) || typetoken == java/lang/Enum)
        {
            return null;
        }
        gson = typetoken;
        if (!typetoken.isEnum())
        {
            gson = typetoken.getSuperclass();
        }
        return new mTypeAdapter(gson);
    }

    mTypeAdapter()
    {
    }
}
