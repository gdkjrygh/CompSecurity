// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.codehaus.jackson.map.util.ClassUtil;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            BasicClassIntrospector

public static final class  extends 
{

    public boolean includeMethod(Method method)
    {
        if (!super.thod(method))
        {
            if (!ClassUtil.hasGetterSignature(method))
            {
                return false;
            }
            method = method.getReturnType();
            if (!java/util/Collection.isAssignableFrom(method) && !java/util/Map.isAssignableFrom(method))
            {
                return false;
            }
        }
        return true;
    }

    public ()
    {
    }
}
