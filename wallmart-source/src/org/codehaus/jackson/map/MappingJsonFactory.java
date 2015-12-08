// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.format.InputAccessor;
import org.codehaus.jackson.format.MatchStrength;

// Referenced classes of package org.codehaus.jackson.map:
//            ObjectMapper

public class MappingJsonFactory extends JsonFactory
{

    public MappingJsonFactory()
    {
        this(null);
    }

    public MappingJsonFactory(ObjectMapper objectmapper)
    {
        super(objectmapper);
        if (objectmapper == null)
        {
            setCodec(new ObjectMapper(this));
        }
    }

    public volatile ObjectCodec getCodec()
    {
        return getCodec();
    }

    public final ObjectMapper getCodec()
    {
        return (ObjectMapper)_objectCodec;
    }

    public String getFormatName()
    {
        return "JSON";
    }

    public MatchStrength hasFormat(InputAccessor inputaccessor)
        throws IOException
    {
        return hasJSONFormat(inputaccessor);
    }
}
