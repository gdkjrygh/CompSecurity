// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.UUID;

final class  extends TypeAdapter
{

    public volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public UUID read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return UUID.fromString(jsonreader.nextString());
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (UUID)obj);
    }

    public void write(JsonWriter jsonwriter, UUID uuid)
    {
        if (uuid == null)
        {
            uuid = null;
        } else
        {
            uuid = uuid.toString();
        }
        jsonwriter.value(uuid);
    }

    ()
    {
    }
}
