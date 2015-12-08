// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class  extends TypeAdapter
{

    public volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public StringBuilder read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return new StringBuilder(jsonreader.nextString());
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (StringBuilder)obj);
    }

    public void write(JsonWriter jsonwriter, StringBuilder stringbuilder)
    {
        if (stringbuilder == null)
        {
            stringbuilder = null;
        } else
        {
            stringbuilder = stringbuilder.toString();
        }
        jsonwriter.value(stringbuilder);
    }

    ()
    {
    }
}
