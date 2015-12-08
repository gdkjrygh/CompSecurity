// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.BitSet;

final class  extends TypeAdapter
{

    public volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public BitSet read(JsonReader jsonreader)
    {
        JsonToken jsontoken;
        BitSet bitset;
        int i;
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        bitset = new BitSet();
        jsonreader.beginArray();
        jsontoken = jsonreader.peek();
        i = 0;
_L2:
        boolean flag;
        if (jsontoken == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        switch (..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(jsontoken).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_153;

        case 1: // '\001'
            if (jsonreader.nextInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;
        }
_L3:
        if (flag)
        {
            bitset.set(i);
        }
        i++;
        jsontoken = jsonreader.peek();
        if (true) goto _L2; else goto _L1
_L1:
        flag = jsonreader.nextBoolean();
          goto _L3
        String s = jsonreader.nextString();
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s).toString());
        }
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L3
        jsonreader.endArray();
        return bitset;
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (BitSet)obj);
    }

    public void write(JsonWriter jsonwriter, BitSet bitset)
    {
        if (bitset == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        int i = 0;
        while (i < bitset.length()) 
        {
            int j;
            if (bitset.get(i))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            jsonwriter.value(j);
            i++;
        }
        jsonwriter.endArray();
    }

    ()
    {
    }
}
