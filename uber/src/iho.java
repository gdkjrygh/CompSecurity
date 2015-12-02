// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class iho
{

    public static final Unsafe a;

    public static long a(Class class1, String s)
    {
        long l;
        try
        {
            class1 = class1.getDeclaredField(s);
            l = a.objectFieldOffset(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            s = new InternalError();
            s.initCause(class1);
            throw s;
        }
        return l;
    }

    public static final boolean a()
    {
        return a != null;
    }

    static 
    {
        Object obj;
        try
        {
            obj = sun/misc/Unsafe.getDeclaredField("theUnsafe");
            ((Field) (obj)).setAccessible(true);
            obj = (Unsafe)((Field) (obj)).get(null);
        }
        catch (Throwable throwable)
        {
            throwable = null;
        }
        a = ((Unsafe) (obj));
    }
}
