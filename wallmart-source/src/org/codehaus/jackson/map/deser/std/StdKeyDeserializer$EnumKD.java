// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.EnumResolver;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdKeyDeserializer

static final class _factory extends StdKeyDeserializer
{

    protected final AnnotatedMethod _factory;
    protected final EnumResolver _resolver;

    public Object _parse(String s, DeserializationContext deserializationcontext)
        throws JsonMappingException
    {
        if (_factory == null) goto _L2; else goto _L1
_L1:
        Object obj = _factory.call1(s);
_L4:
        return obj;
        obj;
        ClassUtil.unwrapAndThrowAsIAE(((Throwable) (obj)));
_L2:
        Enum enum = _resolver.findEnum(s);
        obj = enum;
        if (enum == null)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "not one of values for Enum class");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected (EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
    {
        super(enumresolver.getEnumClass());
        _resolver = enumresolver;
        _factory = annotatedmethod;
    }
}
