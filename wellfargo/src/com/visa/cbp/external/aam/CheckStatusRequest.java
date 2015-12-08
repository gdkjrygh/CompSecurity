// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import com.visa.cbp.external.common.EnvInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import uuuuuu.nuuuuu;

public class CheckStatusRequest
{

    public static int b042204220422042204220422 = 2;
    public static int b043204320432043204320432 = 0;
    public static int b043204320432043204320432 = 1;
    public static int b043204320432043204320432 = 69;
    private EnvInfo envInfo;
    private List tokenInfos;

    public CheckStatusRequest()
    {
        int i = b043204320432043204320432;
        switch ((i * (b043204320432043204320432 + i)) % b042204220422042204220422)
        {
        default:
            Object obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\262\u0472\200\204\202\202\u0472\u0472\u0472\u0472", 'w', '\'', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC1\u0381\uFF8F\uFF93\uFF91\uFF91\u0381\u0381\u0381\u0381", '\321', '0', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b042204220422042204220422()
    {
        return 2;
    }

    public static int b042204220422042204220422()
    {
        return 46;
    }

    public static int b042204220422042204220422()
    {
        return 0;
    }

    public EnvInfo getEnvInfo()
    {
        EnvInfo envinfo;
        try
        {
            envinfo = envInfo;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b042204220422042204220422 != b043204320432043204320432)
        {
            b043204320432043204320432 = 26;
            b043204320432043204320432 = 56;
        }
        return envinfo;
    }

    public List getTokenInfos()
    {
        int i = b043204320432043204320432;
        int k = b043204320432043204320432;
        int l = b043204320432043204320432;
        int i1 = b042204220422042204220422;
        Object obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\375\u04BD\u04BD\313\317\315\315\u04BD\u04BD\u04BD", '\233', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((i + k) * l) % i1 != ((Integer)obj).intValue())
        {
            int j = b043204320432043204320432;
            switch ((j * (b043204320432043204320432 + j)) % b042204220422042204220422)
            {
            default:
                b043204320432043204320432 = 76;
                Object obj1 = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF27\u02E7\uFEF5\uFEF9\uFEF7\uFEF7\u02E7\u02E7\u02E7\u02E7", '?', '\374', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b043204320432043204320432 = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b043204320432043204320432 = 42;
                b043204320432043204320432 = 2;
                break;
            }
        }
        if (tokenInfos == null)
        {
            tokenInfos = new ArrayList();
        }
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
        return tokenInfos;
    }

    public void setEnvInfo(EnvInfo envinfo)
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b043204320432043204320432;
            k = b043204320432043204320432;
            l = b042204220422042204220422;
        }
        // Misplaced declaration of an exception variable
        catch (EnvInfo envinfo)
        {
            throw envinfo;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 88;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_88;
_L1:
        obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\252\u046Ax|zz\u046A\u046A\u046A\u046A", 'I', '\221', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        try
        {
            b043204320432043204320432 = j;
            b043204320432043204320432 = 52;
        }
        // Misplaced declaration of an exception variable
        catch (EnvInfo envinfo)
        {
            throw envinfo;
        }
        envInfo = envinfo;
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b042204220422042204220422 != b043204320432043204320432)
        {
            envinfo = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u0344\u0704\u0312\u0316\u0314\u0314\u0704\u0704\u0704\u0704", '\366', '\006'), new Class[0]);
            try
            {
                envinfo = ((EnvInfo) (envinfo.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (EnvInfo envinfo)
            {
                throw envinfo.getCause();
            }
            b043204320432043204320432 = ((Integer)envinfo).intValue();
            envinfo = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\007\u03C7\uFFD5\uFFD9\uFFD7\uFFD7\u03C7\u03C7\u03C7\u03C7", '4', '\'', '\0'), new Class[0]);
            try
            {
                envinfo = ((EnvInfo) (envinfo.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (EnvInfo envinfo)
            {
                throw envinfo.getCause();
            }
            b043204320432043204320432 = ((Integer)envinfo).intValue();
        }
        return;
        envinfo;
        throw envinfo;
        envinfo;
        throw envinfo.getCause();
    }

    public void setTokenInfos(List list)
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b043204320432043204320432;
            k = b043204320432043204320432;
            l = b042204220422042204220422;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 120;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_120;
_L1:
        obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("\325\u0495\243\247\245\245\u0495\u0495\u0495\u0495", 's', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        try
        {
            b043204320432043204320432 = j;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj = com/visa/cbp/external/aam/CheckStatusRequest.getMethod(nuuuuu.b0417041704170417041704170417("A\u0401\017\023\021\021\u0401\u0401\u0401\u0401", '!', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b043204320432043204320432 = j;
        tokenInfos = list;
        return;
        list;
        throw list.getCause();
        list;
        throw list.getCause();
    }
}
