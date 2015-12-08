// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.external.common:
//            ErrorResponse

public class Response
{

    public static int b041704170417041704170417 = 2;
    public static int b041704170417041704170417 = 0;
    public static int b041704170417041704170417 = 1;
    public static int b041704170417041704170417 = 79;
    private ErrorResponse errorResponse;

    public Response()
    {
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b041704170417041704170417()
    {
        return 2;
    }

    public static int b041704170417041704170417()
    {
        return 99;
    }

    public ErrorResponse getErrorResponse()
    {
        if (((b041704170417041704170417 + b041704170417041704170417) * b041704170417041704170417) % b041704170417041704170417 != b041704170417041704170417)
        {
            b041704170417041704170417 = 58;
            Object obj = com/visa/cbp/external/common/Response.getMethod(nuuuuu.b0417041704170417041704170417("\uFDA7\u015C\u015C\u015C\uFD75\uFD79\uFD76\uFD7C\u015C\u015C", '\351', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041704170417041704170417 = ((Integer)obj).intValue();
        }
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorresponse)
    {
        Object obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b041704170417041704170417;
            j = b041704170417041704170417;
            k = b041704170417041704170417;
        }
        // Misplaced declaration of an exception variable
        catch (ErrorResponse errorresponse)
        {
            throw errorresponse;
        }
        try
        {
            l = b041704170417041704170417;
            i1 = b041704170417041704170417;
        }
        // Misplaced declaration of an exception variable
        catch (ErrorResponse errorresponse)
        {
            throw errorresponse;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj = com/visa/cbp/external/common/Response.getMethod(nuuuuu.b0417041704170417041704170417("\uFD95\u014A\u014A\u014A\uFD63\uFD67\uFD64\uFD6A\u014A\u014A", '\357', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b041704170417041704170417 = i;
        b041704170417041704170417 = 37;
        i = b041704170417041704170417;
        switch ((i * (b041704170417041704170417 + i)) % b041704170417041704170417)
        {
        default:
            b041704170417041704170417 = 92;
            obj = com/visa/cbp/external/common/Response.getMethod(nuuuuu.b0417041704170417041704170417("O\u0404\u0404\u0404\035!\036$\u0404\u0404", 'n', '\201', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ErrorResponse errorresponse)
            {
                throw errorresponse.getCause();
            }
            b041704170417041704170417 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            errorResponse = errorresponse;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ErrorResponse errorresponse) { }
        throw errorresponse;
        errorresponse;
        throw errorresponse.getCause();
    }
}
