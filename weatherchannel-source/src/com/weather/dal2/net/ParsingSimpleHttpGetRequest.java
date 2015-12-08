// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.net;

import com.weather.dal2.exceptions.DalException;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.weather.dal2.net:
//            SimpleHttpGetRequest, JsonParsingReceiver, JsonObjectMapper, Receiver

public class ParsingSimpleHttpGetRequest extends SimpleHttpGetRequest
{

    public ParsingSimpleHttpGetRequest()
    {
    }

    public ParsingSimpleHttpGetRequest(String s)
    {
        super(s);
    }

    public void asyncFetch(String s, Class class1, boolean flag, Object obj, Receiver receiver)
    {
        asyncFetch(s, flag, obj, ((Receiver) (new JsonParsingReceiver(receiver, class1))));
    }

    public Object fetch(String s, Class class1, boolean flag)
        throws DalException, IOException, JSONException
    {
        return JsonObjectMapper.fromJson(fetch(s, flag), class1);
    }
}
