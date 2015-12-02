// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.security.class3;

import android.app.Application;
import com.security.class3.utilities.Class4;

public class Class3
{

    private static Class3 Variable1;
    private Application Variable2;

    private Class3()
    {
    }

    public static Class3 Method1()
    {
        if (Variable1 == null)
        {
            Variable1 = new Class3();
        }
        return Variable1;
    }

    private void Method3(Application application)
    {
        Variable2 = application;
    }

    private Application Method4()
    {
        return Variable2;
    }

    public void Method2(Application application)
    {
        Method1().Method3(application);
    }

    public String Method5()
    {
        return Class4.Method1().Method2(Method1().Method4());
    }
}
