// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer
    implements Runnable
{

    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    private static final Field inheritableThreadLocals = getInheritableThreadLocalsField();
    private static final Logger logger = Logger.getLogger(com/google/common/base/internal/Finalizer.getName());
    private final WeakReference finalizableReferenceClassReference;
    private final PhantomReference frqReference;
    private final ReferenceQueue queue;

    private Finalizer(Class class1, ReferenceQueue referencequeue, PhantomReference phantomreference)
    {
        queue = referencequeue;
        finalizableReferenceClassReference = new WeakReference(class1);
        frqReference = phantomreference;
    }

    private boolean cleanUp(Reference reference)
    {
        Method method = getFinalizeReferentMethod();
        if (method != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        do
        {
            reference.clear();
            if (reference == frqReference)
            {
                continue;
            }
            Reference reference1;
            try
            {
                method.invoke(reference, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Reference reference)
            {
                logger.log(Level.SEVERE, "Error cleaning up after reference.", reference);
            }
            reference1 = queue.poll();
            reference = reference1;
            if (reference1 == null)
            {
                return true;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private Method getFinalizeReferentMethod()
    {
        Object obj = (Class)finalizableReferenceClassReference.get();
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = ((Class) (obj)).getMethod("finalizeReferent", new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new AssertionError(nosuchmethodexception);
        }
        return ((Method) (obj));
    }

    public static Field getInheritableThreadLocalsField()
    {
        Field field;
        try
        {
            field = java/lang/Thread.getDeclaredField("inheritableThreadLocals");
            field.setAccessible(true);
        }
        catch (Throwable throwable)
        {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
        return field;
    }

    public static void startFinalizer(Class class1, ReferenceQueue referencequeue, PhantomReference phantomreference)
    {
        if (!class1.getName().equals("com.google.common.base.FinalizableReference"))
        {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        class1 = new Thread(new Finalizer(class1, referencequeue, phantomreference));
        class1.setName(com/google/common/base/internal/Finalizer.getName());
        class1.setDaemon(true);
        try
        {
            if (inheritableThreadLocals != null)
            {
                inheritableThreadLocals.set(class1, null);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ReferenceQueue referencequeue)
        {
            logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", referencequeue);
        }
        class1.start();
    }

    public void run()
    {
_L2:
        boolean flag;
        do
        {
            flag = cleanUp(queue.remove());
        } while (flag);
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
