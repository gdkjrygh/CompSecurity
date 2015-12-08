// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationContext, BeanProperty

public abstract class InjectableValues
{

    public InjectableValues()
    {
    }

    public abstract Object findInjectableValue(Object obj, DeserializationContext deserializationcontext, BeanProperty beanproperty, Object obj1);

    // Unreferenced inner class org/codehaus/jackson/map/InjectableValues$Std
    /* block-local class not found */
    class Std {}

}
