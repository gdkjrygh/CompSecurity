// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

class val.dateTypeAdapter extends TypeAdapter
{

    final val.dateTypeAdapter this$0;
    final TypeAdapter val$dateTypeAdapter;

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public Timestamp read(JsonReader jsonreader)
        throws IOException
    {
        jsonreader = (Date)val$dateTypeAdapter.read(jsonreader);
        if (jsonreader != null)
        {
            return new Timestamp(jsonreader.getTime());
        } else
        {
            return null;
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Timestamp)obj);
    }

    public void write(JsonWriter jsonwriter, Timestamp timestamp)
        throws IOException
    {
        val$dateTypeAdapter.write(jsonwriter, timestamp);
    }

    ()
    {
        this$0 = final_;
        val$dateTypeAdapter = TypeAdapter.this;
        super();
    }

    // Unreferenced inner class com/google/gson/internal/bind/TypeAdapters$22

/* anonymous class */
    static final class TypeAdapters._cls22
        implements TypeAdapterFactory
    {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return gson.getAdapter(java/util/Date). new TypeAdapters._cls22._cls1();
            }
        }

    }

}
