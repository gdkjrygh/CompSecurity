// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class Track2DataDec
{

    public static int b042D042D042D042D042D042D = 1;
    public static int b042D042D042D042D042D042D = 78;
    public static int b042D042D042D042D042D042D = 0;
    public static int b042D042D042D042D042D042D = 2;
    private String svcCode;

    public Track2DataDec()
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

    public static int b042D042D042D042D042D042D()
    {
        return 2;
    }

    public static int b042D042D042D042D042D042D()
    {
        return 82;
    }

    public static int b042D042D042D042D042D042D()
    {
        return 1;
    }

    public String getSvcCode()
    {
        String s = svcCode;
        int i = b042D042D042D042D042D042D;
        Object obj = com/visa/cbp/external/common/Track2DataDec.getMethod(nuuuuu.b0417041704170417041704170417("U\u0420#'%7#'%7\u0420#'%7#'%7", '\241', '\224', '\001'), new Class[0]);
        int k;
        int l;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        k = ((Integer)obj).intValue();
        l = b042D042D042D042D042D042D;
        obj = com/visa/cbp/external/common/Track2DataDec.getMethod(nuuuuu.b0417041704170417041704170417("\uFE6A\uFE38\uFE3C\uFE3A\uFE4C\uFE38\uFE3C\uFE3A\uFE4C\uFE38\uFE3C\uFE3A\uFE4C\u0235\uFE38\uFE3C\uFE3A\uFE4C\uFE38\uFE3C\uFE3A\uFE4C", '\250', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((l * (k + i)) % ((Integer)obj).intValue() != b042D042D042D042D042D042D)
        {
            int j = b042D042D042D042D042D042D;
            switch ((j * (b042D042D042D042D042D042D + j)) % b042D042D042D042D042D042D)
            {
            default:
                b042D042D042D042D042D042D = 83;
                b042D042D042D042D042D042D = 95;
                // fall through

            case 0: // '\0'
                b042D042D042D042D042D042D = 6;
                break;
            }
            Object obj1 = com/visa/cbp/external/common/Track2DataDec.getMethod(nuuuuu.b0417041704170417041704170417("\u022D\u01FB\u01FF\u01FD\u020F\u05F8\u01FB\u01FF\u01FD\u020F\u05F8\u01FB\u01FF\u01FD\u020F\u01FB\u01FF\u01FD\u020F", '\231', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj1).intValue();
        }
        return s;
    }

    public void setSvcCode(String s)
    {
        int i = b042D042D042D042D042D042D;
        Object obj = com/visa/cbp/external/common/Track2DataDec.getMethod(nuuuuu.b0417041704170417041704170417("\u01A8\u0573\u0176\u017A\u0178\u018A\u0176\u017A\u0178\u018A\u0573\u0176\u017A\u0178\u018A\u0176\u017A\u0178\u018A", '\243', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b042D042D042D042D042D042D)
        {
        default:
            b042D042D042D042D042D042D = 92;
            b042D042D042D042D042D042D = 44;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            svcCode = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }
}
