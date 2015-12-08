// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.walmart.android.service.ServiceException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.codehaus.jackson.JsonNode;

public class WalmartServiceException extends ServiceException
{
    public static class Exception
    {

        private String mId;
        private String mMessage;
        private Map mParams;
        private String mType;

        public static Exception createFromJson(JsonNode jsonnode)
        {
            Exception exception = new Exception();
            JsonNode jsonnode1 = jsonnode.get("type");
            if (jsonnode1 != null)
            {
                exception.mType = jsonnode1.getTextValue();
            }
            jsonnode1 = jsonnode.get("id");
            if (jsonnode1 != null)
            {
                exception.mId = jsonnode1.getTextValue();
            }
            jsonnode1 = jsonnode.get("message");
            if (jsonnode1 != null)
            {
                exception.mMessage = jsonnode1.getTextValue();
            }
            jsonnode = jsonnode.get("params");
            if (jsonnode != null)
            {
                exception.mParams = new HashMap();
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
                        exception.mParams.put(s, obj);
                    }
                } while (true);
            }
            return exception;
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

        public Exception()
        {
        }
    }


    private static final long serialVersionUID = 0xd3d6224f4ad7bf94L;
    private Exception mException;

    public WalmartServiceException()
    {
    }

    public static WalmartServiceException createFromJson(JsonNode jsonnode)
    {
        WalmartServiceException walmartserviceexception = new WalmartServiceException();
        if (jsonnode == null)
        {
            return walmartserviceexception;
        } else
        {
            walmartserviceexception.mException = Exception.createFromJson(jsonnode);
            return walmartserviceexception;
        }
    }

    public Exception getException()
    {
        return mException;
    }

    public boolean hasException()
    {
        return mException != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ServiceException [mException=").append(mException).append("]").toString();
    }
}
