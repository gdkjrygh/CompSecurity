// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationConfig

public abstract class AbstractTypeResolver
{

    public AbstractTypeResolver()
    {
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return null;
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return null;
    }
}
