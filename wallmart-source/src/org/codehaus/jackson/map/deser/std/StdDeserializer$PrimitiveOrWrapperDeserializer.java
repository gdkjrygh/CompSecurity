// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;


// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer, StdDeserializer

protected static abstract class _nullValue extends StdScalarDeserializer
{

    final Object _nullValue;

    public final Object getNullValue()
    {
        return _nullValue;
    }

    protected (Class class1, Object obj)
    {
        super(class1);
        _nullValue = obj;
    }
}
