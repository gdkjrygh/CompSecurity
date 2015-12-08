// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            JsonMappingException

public class RuntimeJsonMappingException extends RuntimeException
{

    public RuntimeJsonMappingException(String s)
    {
        super(s);
    }

    public RuntimeJsonMappingException(String s, JsonMappingException jsonmappingexception)
    {
        super(s, jsonmappingexception);
    }

    public RuntimeJsonMappingException(JsonMappingException jsonmappingexception)
    {
        super(jsonmappingexception);
    }
}
