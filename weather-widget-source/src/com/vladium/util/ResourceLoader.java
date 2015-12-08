// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

// Referenced classes of package com.vladium.util:
//            ClassLoaderResolver

public abstract class ResourceLoader
{

    private ResourceLoader()
    {
    }

    public static URL getResource(String s)
    {
        ClassLoader classloader = ClassLoaderResolver.getClassLoader(ClassLoaderResolver.getCallerClass(1));
        if (classloader != null)
        {
            return classloader.getResource(s);
        } else
        {
            return ClassLoader.getSystemResource(s);
        }
    }

    public static URL getResource(String s, ClassLoader classloader)
    {
        if (classloader != null)
        {
            return classloader.getResource(s);
        } else
        {
            return ClassLoader.getSystemResource(s);
        }
    }

    public static InputStream getResourceAsStream(String s)
    {
        ClassLoader classloader = ClassLoaderResolver.getClassLoader(ClassLoaderResolver.getCallerClass(1));
        if (classloader != null)
        {
            return classloader.getResourceAsStream(s);
        } else
        {
            return ClassLoader.getSystemResourceAsStream(s);
        }
    }

    public static InputStream getResourceAsStream(String s, ClassLoader classloader)
    {
        if (classloader != null)
        {
            return classloader.getResourceAsStream(s);
        } else
        {
            return ClassLoader.getSystemResourceAsStream(s);
        }
    }

    public static Enumeration getResources(String s)
        throws IOException
    {
        ClassLoader classloader = ClassLoaderResolver.getClassLoader(ClassLoaderResolver.getCallerClass(1));
        if (classloader != null)
        {
            return classloader.getResources(s);
        } else
        {
            return ClassLoader.getSystemResources(s);
        }
    }

    public static Enumeration getResources(String s, ClassLoader classloader)
        throws IOException
    {
        if (classloader != null)
        {
            return classloader.getResources(s);
        } else
        {
            return ClassLoader.getSystemResources(s);
        }
    }

    public static Class loadClass(String s)
        throws ClassNotFoundException
    {
        return Class.forName(s, false, ClassLoaderResolver.getClassLoader(ClassLoaderResolver.getCallerClass(1)));
    }

    public static Class loadClass(String s, ClassLoader classloader)
        throws ClassNotFoundException
    {
        if (classloader == null)
        {
            classloader = ClassLoader.getSystemClassLoader();
        }
        return Class.forName(s, false, classloader);
    }
}
