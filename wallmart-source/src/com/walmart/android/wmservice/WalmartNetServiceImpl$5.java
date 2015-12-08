// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.JsonDeserializer;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl, WalmartServiceException

class  extends DeserializationProblemHandler
{

    final WalmartNetServiceImpl this$0;

    public boolean handleUnknownProperty(DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (s.equals("__exception__"))
        {
            throw WalmartServiceException.createFromJson(deserializationcontext.getParser().readValueAsTree());
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
    }
}
