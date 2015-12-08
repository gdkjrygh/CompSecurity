// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import com.visa.cbp.external.common.Response;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import uuuuuu.nuuuuu;

public class CheckStatusResponse extends Response
{

    public static int b042D042D042D042D042D042D = 1;
    public static int b042D042D042D042D042D042D = 54;
    public static int b042D042D042D042D042D042D = 0;
    public static int b042D042D042D042D042D042D = 2;
    private List tokenInfos;

    public CheckStatusResponse()
    {
        Object obj = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC0\uFF8E\uFF92\uFF90\uFFA2\u038B\uFF8E\uFF92\uFF90\uFFA2\uFF8E\uFF92\uFF90\uFFA2\uFF8E\uFF92\uFF90\uFFA2\u038B", ']', 'E', '\0'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b042D042D042D042D042D042D;
        obj = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u02AE\u027C\u0280\u027E\u0290\u0679\u027C\u0280\u027E\u0290\u027C\u0280\u027E\u0290\u027C\u0280\u027E\u0290\u0679", '\304', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b042D042D042D042D042D042D != b042D042D042D042D042D042D)
        {
            int j = b042D042D042D042D042D042D;
            switch ((j * (b042D042D042D042D042D042D + j)) % b042D042D042D042D042D042D)
            {
            default:
                Object obj1 = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\252\370\374\372\214\u04E5\370\374\372\214\370\374\372\214\370\374\372\214\u04E5", '\310', '\002'), new Class[0]);
                Exception exception;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042D042D042D042D042D042D = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFF06\uFED4\uFED8\uFED6\uFEE8\u02D1\uFED4\uFED8\uFED6\uFEE8\uFED4\uFED8\uFED6\uFEE8\uFED4\uFED8\uFED6\uFEE8\u02D1", '\256', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b042D042D042D042D042D042D = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b042D042D042D042D042D042D = 93;
                break;
            }
        }
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
label0:
        do
        {
            switch (1)
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
    }

    public static int b042D042D042D042D042D042D()
    {
        return 45;
    }

    public List getTokenInfos()
    {
        if (tokenInfos == null)
        {
            ArrayList arraylist = new ArrayList();
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
            tokenInfos = arraylist;
        }
        if (((b042D042D042D042D042D042D + b042D042D042D042D042D042D) * b042D042D042D042D042D042D) % b042D042D042D042D042D042D != b042D042D042D042D042D042D)
        {
            Object obj = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFE6A\uFE38\uFE3C\uFE3A\uFE4C\u0235\uFE38\uFE3C\uFE3A\uFE4C\uFE38\uFE3C\uFE3A\uFE4C\uFE38\uFE3C\uFE3A\uFE4C\u0235", '\250', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFED\uFFBB\uFFBF\uFFBD\uFFCF\u03B8\uFFBB\uFFBF\uFFBD\uFFCF\uFFBB\uFFBF\uFFBD\uFFCF\uFFBB\uFFBF\uFFBD\uFFCF\u03B8", '\022', '\207', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)obj).intValue();
        }
        return tokenInfos;
    }

    public void setTokenInfos(List list)
    {
        int i;
        int j;
        try
        {
            tokenInfos = list;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        i = b042D042D042D042D042D042D;
        j = b042D042D042D042D042D042D;
        switch ((j * (b042D042D042D042D042D042D + j)) % b042D042D042D042D042D042D)
        {
        default:
            list = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFD83\uFD51\uFD55\uFD53\uFD65\u014E\uFD51\uFD55\uFD53\uFD65\uFD51\uFD55\uFD53\uFD65\uFD51\uFD55\uFD53\uFD65\u014E", '\365', '\004'), new Class[0]);
            try
            {
                list = ((List) (list.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b042D042D042D042D042D042D = ((Integer)list).intValue();
            b042D042D042D042D042D042D = 41;
            // fall through

        case 0: // '\0'
            switch (((b042D042D042D042D042D042D + i) * i) % b042D042D042D042D042D042D)
            {
            default:
                list = com/visa/cbp/external/aam/CheckStatusResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\uFFB2\uFFB6\uFFB4\uFFC6\u03AF\uFFB2\uFFB6\uFFB4\uFFC6\uFFB2\uFFB6\uFFB4\uFFC6\uFFB2\uFFB6\uFFB4\uFFC6\u03AF", '*', '\004'), new Class[0]);
                try
                {
                    list = ((List) (list.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    throw list.getCause();
                }
                b042D042D042D042D042D042D = ((Integer)list).intValue();
                b042D042D042D042D042D042D = 40;
                // fall through

            case 0: // '\0'
                return;
            }
        }
    }
}
