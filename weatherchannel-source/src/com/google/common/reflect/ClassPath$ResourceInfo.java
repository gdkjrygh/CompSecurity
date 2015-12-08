// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.net.URL;

// Referenced classes of package com.google.common.reflect:
//            ClassPath

public static class 
{

    final ClassLoader loader;
    private final String resourceName;

    static  of(String s, ClassLoader classloader)
    {
        if (s.endsWith(".class"))
        {
            return new it>(s, classloader);
        } else
        {
            return new <init>(s, classloader);
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            flag = flag1;
            if (resourceName.equals(((resourceName) (obj)).resourceName))
            {
                flag = flag1;
                if (loader == ((loader) (obj)).loader)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final String getResourceName()
    {
        return resourceName;
    }

    public int hashCode()
    {
        return resourceName.hashCode();
    }

    public String toString()
    {
        return resourceName;
    }

    public final URL url()
    {
        return (URL)Preconditions.checkNotNull(loader.getResource(resourceName), "Failed to load resource: %s", new Object[] {
            resourceName
        });
    }

    (String s, ClassLoader classloader)
    {
        resourceName = (String)Preconditions.checkNotNull(s);
        loader = (ClassLoader)Preconditions.checkNotNull(classloader);
    }
}
