// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.codehaus.jackson.JsonNode;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartServiceException

public static class 
{

    private String mId;
    private String mMessage;
    private Map mParams;
    private String mType;

    public static  createFromJson(JsonNode jsonnode)
    {
          = new <init>();
        JsonNode jsonnode1 = jsonnode.get("type");
        if (jsonnode1 != null)
        {
            .mType = jsonnode1.getTextValue();
        }
        jsonnode1 = jsonnode.get("id");
        if (jsonnode1 != null)
        {
            .mId = jsonnode1.getTextValue();
        }
        jsonnode1 = jsonnode.get("message");
        if (jsonnode1 != null)
        {
            .mMessage = jsonnode1.getTextValue();
        }
        jsonnode = jsonnode.get("params");
        if (jsonnode != null)
        {
            .mParams = new HashMap();
            Iterator iterator = jsonnode.getFieldNames();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = jsonnode.get(s);
                if (obj != null && ((JsonNode) (obj)).isArray() && ((JsonNode) (obj)).size() > 0)
                {
                    obj = ((JsonNode) (obj)).get(0).getTextValue();
                    .mParams.put(s, obj);
                }
            } while (true);
        }
        return ;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setMessage(String s)
    {
        mMessage = s;
    }

    public void setParams(Map map)
    {
        mParams = map;
    }

    public void setType(String s)
    {
        mType = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Exception [mType=").append(mType).append(", mId=").append(mId).append(", mMessage=").append(mMessage).append(", mParams=").append(mParams).append("]").toString();
    }

    public ()
    {
    }
}
