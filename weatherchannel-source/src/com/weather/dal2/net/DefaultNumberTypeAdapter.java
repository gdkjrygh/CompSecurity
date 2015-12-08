// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public abstract class DefaultNumberTypeAdapter extends TypeAdapter
{

    public DefaultNumberTypeAdapter()
    {
    }

    protected abstract Number parse(String s)
        throws NumberFormatException;

    public Number read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
        } else
        {
            jsonreader = jsonreader.nextString();
            if (!jsonreader.isEmpty())
            {
                return parse(jsonreader);
            }
        }
        return null;
    }

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Number number)
        throws IOException
    {
        if (number == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            jsonwriter.value(number);
            return;
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Number)obj);
    }
}
