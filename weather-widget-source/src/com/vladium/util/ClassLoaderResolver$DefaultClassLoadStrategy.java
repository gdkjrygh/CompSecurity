// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            IClassLoadStrategy, ClassLoaderResolver, ClassLoadContext

private static final class <init>
    implements IClassLoadStrategy
{

    public ClassLoader getClassLoader(ClassLoadContext classloadcontext)
    {
        Object obj;
        if (classloadcontext == null)
        {
            throw new IllegalArgumentException("null input: ctx");
        }
        obj = classloadcontext.getCallerClass();
        classloadcontext = Thread.currentThread().getContextClassLoader();
        if (obj != null) goto _L2; else goto _L1
_L1:
        ClassLoader classloader = ClassLoader.getSystemClassLoader();
        obj = classloadcontext;
        if (ClassLoaderResolver.isChild(classloadcontext, classloader))
        {
            obj = classloader;
        }
        return ((ClassLoader) (obj));
_L2:
        obj = ((Class) (obj)).getClassLoader();
        if (!ClassLoaderResolver.isChild(((ClassLoader) (obj)), classloadcontext))
        {
            classloadcontext = ((ClassLoadContext) (obj));
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
