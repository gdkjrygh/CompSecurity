// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import com.google.android.youtube.player.internal.b.b;
import com.google.android.youtube.player.internal.b.d;
import com.google.android.youtube.player.internal.g;
import com.google.android.youtube.player.internal.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.android.youtube.player.internal.dynamic:
//            d, a

public final class YouTubeDynamicCode
{

    private static IBinder a(Class class1, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, boolean flag)
    {
        try
        {
            ibinder = (IBinder)class1.getConstructor(new Class[] {
                android/os/IBinder, android/os/IBinder, android/os/IBinder, Boolean.TYPE
            }).newInstance(new Object[] {
                ibinder, ibinder1, ibinder2, Boolean.valueOf(flag)
            });
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            throw new DynamicCodeException((new StringBuilder("Could not find the right constructor for ")).append(class1.getName()).toString(), ibinder);
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            throw new DynamicCodeException((new StringBuilder("Exception thrown by invoked constructor in ")).append(class1.getName()).toString(), ibinder);
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            throw new DynamicCodeException((new StringBuilder("Unable to instantiate the dynamic class ")).append(class1.getName()).toString(), ibinder);
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            throw new DynamicCodeException((new StringBuilder("Unable to call the default constructor of ")).append(class1.getName()).toString(), ibinder);
        }
        return ibinder;
    }

    private static IBinder a(ClassLoader classloader, String s, IBinder ibinder, IBinder ibinder1, IBinder ibinder2, boolean flag)
    {
        try
        {
            classloader = a(classloader.loadClass(s), ibinder, ibinder1, ibinder2, flag);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            throw new DynamicCodeException((new StringBuilder("Unable to find dynamic class ")).append(s).toString(), classloader);
        }
        return classloader;
    }

    public static g a(Activity activity, IBinder ibinder, boolean flag)
    {
        d.a(activity);
        d.a(ibinder);
        Context context = b.b(activity);
        if (context == null)
        {
            throw new DynamicCodeException("Could not create remote context");
        } else
        {
            return h.a(a(context.getClassLoader(), "com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer", d.a(context).asBinder(), d.a(activity).asBinder(), ibinder, flag));
        }
    }

    private class DynamicCodeException extends Exception
    {

        public DynamicCodeException(String s)
        {
            super(s);
        }

        public DynamicCodeException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

}
