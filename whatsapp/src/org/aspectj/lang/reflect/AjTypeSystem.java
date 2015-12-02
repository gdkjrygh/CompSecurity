// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.aspectj.internal.lang.reflect.AjTypeImpl;

// Referenced classes of package org.aspectj.lang.reflect:
//            AjType

public class AjTypeSystem
{

    private static Map ajTypes = Collections.synchronizedMap(new WeakHashMap());

    public AjTypeSystem()
    {
    }

    public static AjType getAjType(Class class1)
    {
        Object obj = (WeakReference)ajTypes.get(class1);
        if (obj != null)
        {
            obj = (AjType)((WeakReference) (obj)).get();
            if (obj != null)
            {
                return ((AjType) (obj));
            } else
            {
                AjTypeImpl ajtypeimpl = new AjTypeImpl(class1);
                ajTypes.put(class1, new WeakReference(ajtypeimpl));
                return ajtypeimpl;
            }
        } else
        {
            AjTypeImpl ajtypeimpl1 = new AjTypeImpl(class1);
            ajTypes.put(class1, new WeakReference(ajtypeimpl1));
            return ajtypeimpl1;
        }
    }

}
