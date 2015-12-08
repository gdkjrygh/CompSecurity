// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Proxy;

public class ClassLoaderObjectInputStream extends ObjectInputStream
{

    private final ClassLoader classLoader;

    public ClassLoaderObjectInputStream(ClassLoader classloader, InputStream inputstream)
        throws IOException, StreamCorruptedException
    {
        super(inputstream);
        classLoader = classloader;
    }

    protected Class resolveClass(ObjectStreamClass objectstreamclass)
        throws IOException, ClassNotFoundException
    {
        Class class1 = Class.forName(objectstreamclass.getName(), false, classLoader);
        if (class1 != null)
        {
            return class1;
        } else
        {
            return super.resolveClass(objectstreamclass);
        }
    }

    protected Class resolveProxyClass(String as[])
        throws IOException, ClassNotFoundException
    {
        Class aclass[] = new Class[as.length];
        for (int i = 0; i < as.length; i++)
        {
            aclass[i] = Class.forName(as[i], false, classLoader);
        }

        Class class1;
        try
        {
            class1 = Proxy.getProxyClass(classLoader, aclass);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return super.resolveProxyClass(as);
        }
        return class1;
    }
}
