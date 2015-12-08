// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

public final class Callables
{

    private Callables()
    {
    }

    public static Callable returning(Object obj)
    {
        return new Callable(obj) {

            final Object val$value;

            public Object call()
            {
                return value;
            }

            
            {
                value = obj;
                super();
            }
        };
    }

    static Runnable threadRenaming(Runnable runnable, Supplier supplier)
    {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable(supplier, runnable) {

            final Supplier val$nameSupplier;
            final Runnable val$task;

            public void run()
            {
                Thread thread;
                String s;
                boolean flag;
                thread = Thread.currentThread();
                s = thread.getName();
                flag = Callables.trySetName((String)nameSupplier.get(), thread);
                task.run();
                if (flag)
                {
                    Callables.trySetName(s, thread);
                }
                return;
                Exception exception;
                exception;
                if (flag)
                {
                    Callables.trySetName(s, thread);
                }
                throw exception;
            }

            
            {
                nameSupplier = supplier;
                task = runnable;
                super();
            }
        };
    }

    static Callable threadRenaming(Callable callable, Supplier supplier)
    {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable(supplier, callable) {

            final Callable val$callable;
            final Supplier val$nameSupplier;

            public Object call()
                throws Exception
            {
                Thread thread;
                String s;
                boolean flag;
                thread = Thread.currentThread();
                s = thread.getName();
                flag = Callables.trySetName((String)nameSupplier.get(), thread);
                Object obj = callable.call();
                if (flag)
                {
                    Callables.trySetName(s, thread);
                }
                return obj;
                Exception exception;
                exception;
                if (flag)
                {
                    Callables.trySetName(s, thread);
                }
                throw exception;
            }

            
            {
                nameSupplier = supplier;
                callable = callable1;
                super();
            }
        };
    }

    private static boolean trySetName(String s, Thread thread)
    {
        try
        {
            thread.setName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

}
