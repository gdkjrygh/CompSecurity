// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            MethodFilter, BasicClassIntrospector

private static class <init>
    implements MethodFilter
{

    public boolean includeMethod(Method method)
    {
        while (Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length > 2) 
        {
            return false;
        }
        return true;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
