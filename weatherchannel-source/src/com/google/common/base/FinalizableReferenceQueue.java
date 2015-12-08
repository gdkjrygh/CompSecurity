// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.base:
//            FinalizableReference

public class FinalizableReferenceQueue
    implements Closeable
{
    static class DecoupledLoader
        implements FinalizerLoader
    {

        private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

        URL getBaseUrl()
            throws IOException
        {
            String s = String.valueOf("com.google.common.base.internal.Finalizer".replace('.', '/')).concat(".class");
            URL url = getClass().getClassLoader().getResource(s);
            if (url == null)
            {
                throw new FileNotFoundException(s);
            }
            String s1 = url.toString();
            if (!s1.endsWith(s))
            {
                s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    s = "Unsupported path style: ".concat(s);
                } else
                {
                    s = new String("Unsupported path style: ");
                }
                throw new IOException(s);
            } else
            {
                return new URL(url, s1.substring(0, s1.length() - s.length()));
            }
        }

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = newLoader(getBaseUrl()).loadClass("com.google.common.base.internal.Finalizer");
            }
            catch (Exception exception)
            {
                FinalizableReferenceQueue.logger.log(Level.WARNING, "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.", exception);
                return null;
            }
            return class1;
        }

        URLClassLoader newLoader(URL url)
        {
            return new URLClassLoader(new URL[] {
                url
            }, null);
        }

        DecoupledLoader()
        {
        }
    }

    static class DirectLoader
        implements FinalizerLoader
    {

        public Class loadFinalizer()
        {
            Class class1;
            try
            {
                class1 = Class.forName("com.google.common.base.internal.Finalizer");
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new AssertionError(classnotfoundexception);
            }
            return class1;
        }

        DirectLoader()
        {
        }
    }

    static interface FinalizerLoader
    {

        public abstract Class loadFinalizer();
    }

    static class SystemLoader
        implements FinalizerLoader
    {

        static boolean disabled;

        public Class loadFinalizer()
        {
            if (!disabled) goto _L2; else goto _L1
_L1:
            Object obj;
            return null;
_L2:
            if ((obj = ClassLoader.getSystemClassLoader()) == null) goto _L1; else goto _L3
_L3:
            SecurityException securityexception;
            try
            {
                obj = ((ClassLoader) (obj)).loadClass("com.google.common.base.internal.Finalizer");
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                return null;
            }
            return ((Class) (obj));
            securityexception;
            FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
            return null;
        }

        SystemLoader()
        {
        }
    }


    private static final String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    private static final Logger logger = Logger.getLogger(com/google/common/base/FinalizableReferenceQueue.getName());
    private static final Method startFinalizer = getStartFinalizer(loadFinalizer(new FinalizerLoader[] {
        new SystemLoader(), new DecoupledLoader(), new DirectLoader()
    }));
    final PhantomReference frqRef;
    final ReferenceQueue queue;
    final boolean threadStarted;

    public FinalizableReferenceQueue()
    {
        boolean flag;
        queue = new ReferenceQueue();
        frqRef = new PhantomReference(this, queue);
        flag = false;
        startFinalizer.invoke(null, new Object[] {
            com/google/common/base/FinalizableReference, queue, frqRef
        });
        flag = true;
_L2:
        threadStarted = flag;
        return;
        Object obj;
        obj;
        throw new AssertionError(obj);
        obj;
        logger.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Method getStartFinalizer(Class class1)
    {
        try
        {
            class1 = class1.getMethod("startFinalizer", new Class[] {
                java/lang/Class, java/lang/ref/ReferenceQueue, java/lang/ref/PhantomReference
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
        return class1;
    }

    private static transient Class loadFinalizer(FinalizerLoader afinalizerloader[])
    {
        int j = afinalizerloader.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = afinalizerloader[i].loadFinalizer();
            if (class1 != null)
            {
                return class1;
            }
        }

        throw new AssertionError();
    }

    void cleanUp()
    {
        Reference reference;
        if (!threadStarted)
        {
            while ((reference = queue.poll()) != null) 
            {
                reference.clear();
                try
                {
                    ((FinalizableReference)reference).finalizeReferent();
                }
                catch (Throwable throwable)
                {
                    logger.log(Level.SEVERE, "Error cleaning up after reference.", throwable);
                }
            }
        }
    }

    public void close()
    {
        frqRef.enqueue();
        cleanUp();
    }


}
