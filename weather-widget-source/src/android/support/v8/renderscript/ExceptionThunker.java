// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.renderscript.RSDriverException;
import android.renderscript.RSIllegalArgumentException;
import android.renderscript.RSInvalidStateException;
import android.renderscript.RSRuntimeException;

// Referenced classes of package android.support.v8.renderscript:
//            RSIllegalArgumentException, RSInvalidStateException, RSDriverException, RSRuntimeException

class ExceptionThunker
{

    ExceptionThunker()
    {
    }

    static RuntimeException convertException(RuntimeException runtimeexception)
    {
        Object obj;
        if (runtimeexception instanceof RSIllegalArgumentException)
        {
            obj = new android.support.v8.renderscript.RSIllegalArgumentException(runtimeexception.getMessage());
        } else
        {
            if (runtimeexception instanceof RSInvalidStateException)
            {
                return new android.support.v8.renderscript.RSInvalidStateException(runtimeexception.getMessage());
            }
            if (runtimeexception instanceof RSDriverException)
            {
                return new android.support.v8.renderscript.RSDriverException(runtimeexception.getMessage());
            }
            obj = runtimeexception;
            if (runtimeexception instanceof RSRuntimeException)
            {
                return new android.support.v8.renderscript.RSRuntimeException(runtimeexception.getMessage());
            }
        }
        return ((RuntimeException) (obj));
    }
}
