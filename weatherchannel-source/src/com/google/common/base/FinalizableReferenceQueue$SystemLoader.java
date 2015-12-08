// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.logging.Logger;

// Referenced classes of package com.google.common.base:
//            FinalizableReferenceQueue

static class er
    implements er
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
        FinalizableReferenceQueue.access$000().info("Not allowed to access system class loader.");
        return null;
    }

    er()
    {
    }
}
