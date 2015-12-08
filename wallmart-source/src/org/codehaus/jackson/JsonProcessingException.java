// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;

import java.io.IOException;

// Referenced classes of package org.codehaus.jackson:
//            JsonLocation

public class JsonProcessingException extends IOException
{

    static final long serialVersionUID = 123L;
    protected JsonLocation mLocation;

    protected JsonProcessingException(String s)
    {
        super(s);
    }

    protected JsonProcessingException(String s, Throwable throwable)
    {
        this(s, null, throwable);
    }

    protected JsonProcessingException(String s, JsonLocation jsonlocation)
    {
        this(s, jsonlocation, null);
    }

    protected JsonProcessingException(String s, JsonLocation jsonlocation, Throwable throwable)
    {
        super(s);
        if (throwable != null)
        {
            initCause(throwable);
        }
        mLocation = jsonlocation;
    }

    protected JsonProcessingException(Throwable throwable)
    {
        this(null, null, throwable);
    }

    public JsonLocation getLocation()
    {
        return mLocation;
    }

    public String getMessage()
    {
        Object obj = super.getMessage();
        String s = ((String) (obj));
        if (obj == null)
        {
            s = "N/A";
        }
        JsonLocation jsonlocation = getLocation();
        obj = s;
        if (jsonlocation != null)
        {
            obj = new StringBuilder();
            ((StringBuilder) (obj)).append(s);
            ((StringBuilder) (obj)).append('\n');
            ((StringBuilder) (obj)).append(" at ");
            ((StringBuilder) (obj)).append(jsonlocation.toString());
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append(": ").append(getMessage()).toString();
    }
}
