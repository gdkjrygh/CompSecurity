// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdDeserializer

public abstract class ContainerDeserializerBase extends StdDeserializer
{

    protected ContainerDeserializerBase(Class class1)
    {
        super(class1);
    }

    public abstract JsonDeserializer getContentDeserializer();

    public abstract JavaType getContentType();
}
