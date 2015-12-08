// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            ClassLoadContext, IClassLoadStrategy

public abstract class ClassLoaderResolver
{
    private static final class CallerResolver extends SecurityManager
    {

        protected Class[] getClassContext()
        {
            return super.getClassContext();
        }

        private CallerResolver()
        {
        }

    }

    private static final class DefaultClassLoadStrategy
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

        private DefaultClassLoadStrategy()
        {
        }

    }


    private static final CallerResolver CALLER_RESOLVER;
    private static final int CALL_CONTEXT_OFFSET = 2;
    private static IClassLoadStrategy s_strategy;

    private ClassLoaderResolver()
    {
    }

    public static Class getCallerClass(int i)
    {
        if (CALLER_RESOLVER == null)
        {
            return null;
        } else
        {
            return CALLER_RESOLVER.getClassContext()[i + 2];
        }
    }

    public static ClassLoader getClassLoader()
    {
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ClassLoadContext(getCallerClass(1));
        obj = s_strategy.getClassLoader(((ClassLoadContext) (obj)));
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorexit ;
        return ((ClassLoader) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public static ClassLoader getClassLoader(Class class1)
    {
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorenter ;
        class1 = new ClassLoadContext(class1);
        class1 = s_strategy.getClassLoader(class1);
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorexit ;
        return class1;
        class1;
        throw class1;
    }

    public static IClassLoadStrategy getStrategy()
    {
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorenter ;
        IClassLoadStrategy iclassloadstrategy = s_strategy;
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorexit ;
        return iclassloadstrategy;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isChild(ClassLoader classloader, ClassLoader classloader1)
    {
        if (classloader != classloader1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (classloader1 == null)
        {
            return false;
        }
        if (classloader != null)
        {
label0:
            do
            {
label1:
                {
                    if (classloader1 == null)
                    {
                        break label1;
                    }
                    if (classloader1 == classloader)
                    {
                        break label0;
                    }
                    classloader1 = classloader1.getParent();
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static IClassLoadStrategy setStrategy(IClassLoadStrategy iclassloadstrategy)
    {
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorenter ;
        if (iclassloadstrategy != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("null input: strategy");
        iclassloadstrategy;
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorexit ;
        throw iclassloadstrategy;
        IClassLoadStrategy iclassloadstrategy1;
        iclassloadstrategy1 = s_strategy;
        s_strategy = iclassloadstrategy;
        com/vladium/util/ClassLoaderResolver;
        JVM INSTR monitorexit ;
        return iclassloadstrategy1;
    }

    static 
    {
        CallerResolver callerresolver = null;
        CallerResolver callerresolver1 = new CallerResolver();
        callerresolver = callerresolver1;
_L2:
        CALLER_RESOLVER = callerresolver;
        s_strategy = new DefaultClassLoadStrategy();
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
