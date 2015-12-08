// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationContext, JsonDeserializer

public abstract class DeserializationProblemHandler
{

    public DeserializationProblemHandler()
    {
    }

    public boolean handleUnknownProperty(DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        return false;
    }
}
