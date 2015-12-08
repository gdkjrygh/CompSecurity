// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.request;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class AuthenticationRequest
{

    private static final String GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    public static int b042504250425042504250425 = 1;
    public static int b042504250425042504250425 = 44;
    public static int b042504250425042504250425 = 0;
    public static int b042504250425042504250425 = 2;
    private String assertion;

    public AuthenticationRequest(String s)
    {
        int i = b042504250425042504250425;
        int k = b042504250425042504250425;
        int l = b042504250425042504250425;
        Object obj = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\000\u03C3\u03C3\u03C3\uFFCE\uFFD2\uFFD0\uFFD3\uFFCE\uFFD2\uFFD0\uFFD3\uFFCE\uFFD2\uFFD0\uFFD3", 'b', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((l * (i + k)) % ((Integer)obj).intValue() != b042504250425042504250425)
        {
            Object obj1 = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\222`dbe\u0455\u0455`dbe`dbe`dbe", '\266', '\206', '\002'), new Class[0]);
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\317\235\241\237\242\u0492\u0492\235\241\237\242\235\241\237\242\235\241\237\242", '\032', '\207', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            j = ((Integer)obj1).intValue();
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
            {
                Object obj2 = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u015D\u012B\u012F\u012D\u0130\u0520\u0520\u012B\u012F\u012D\u0130\u012B\u012F\u012D\u0130\u012B\u012F\u012D\u0130", '\373', '\005'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
                obj2 = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCC\uFF9A\uFF9E\uFF9C\uFF9F\u038F\u038F\uFF9A\uFF9E\uFF9C\uFF9F\uFF9A\uFF9E\uFF9C\uFF9F\uFF9A\uFF9E\uFF9C\uFF9F", '\226', '\0'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
            }
            b042504250425042504250425 = j;
        }
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            assertion = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        throw s;
    }

    public static int b042504250425042504250425()
    {
        return 1;
    }

    public static int b042504250425042504250425()
    {
        return 87;
    }

    public static int b042504250425042504250425()
    {
        return 2;
    }

    public String getGrant_type()
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
        {
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
            {
                b042504250425042504250425 = 85;
                Object obj = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u01EE\u01BC\u01C0\u01BE\u01C1\u05B1\u05B1\u01BC\u01C0\u01BE\u01C1\u01BC\u01C0\u01BE\u01C1\u01BC\u01C0\u01BE\u01C1", '\204', '\006'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042504250425042504250425 = ((Integer)obj).intValue();
            }
            b042504250425042504250425 = 82;
            obj = com/visa/cbp/sdk/facade/request/AuthenticationRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u0122\360\364\362\365\u04E5\u04E5\360\364\362\365\360\364\362\365\360\364\362\365", '`', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
        }
        return "urn:ietf:params:oauth:grant-type:jwt-bearer";
    }

    public String getJwtAssertion()
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return assertion;
    }
}
