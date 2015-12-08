// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.ppv;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import uuuuuu.nuuuuu;

public class UploadTxnsRequest
{

    public static int b042504250425042504250425 = 1;
    public static int b042504250425042504250425 = 39;
    public static int b042504250425042504250425 = 2;
    public static int b042504250425042504250425;
    private String lastSyncTime;
    private List tokenInfos;

    public UploadTxnsRequest()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b042504250425042504250425()
    {
        return 18;
    }

    public static int b042504250425042504250425()
    {
        return 1;
    }

    public static int b042504250425042504250425()
    {
        return 0;
    }

    public String getLastSyncTime()
    {
        String s;
        try
        {
            s = lastSyncTime;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return s;
    }

    public List getTokenInfos()
    {
        int i = 0;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        catch (Exception exception) { }
        List list;
        Exception exception1;
        Object obj;
        try
        {
            list = tokenInfos;
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        tokenInfos = new ArrayList();
        list = tokenInfos;
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            obj = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF78\uFF46\uFF4A\uFF48\uFF4B\uFF46\uFF4A\uFF48\uFF4B\u033B\u033B\u033B\uFF46\uFF4A\uFF48\uFF4B", '\352', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("H\026\032\030\033\026\032\030\033\u040B\u040B\u040B\026\032\030\033", '\r', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return list;
        }
        exception1;
        throw exception1;
    }

    public void setLastSyncTime(String s)
    {
        int i = b042504250425042504250425;
        int k = b042504250425042504250425;
        int l = b042504250425042504250425;
        int i1 = b042504250425042504250425;
        Object obj = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("\325\u0498\u0498\243\247\245\250\243\247\245\250\u0498\243\247\245\250", ';', '8', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((i + k) * l) % i1 != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u014E\u011C\u0120\u011E\u0121\u011C\u0120\u011E\u0121\u0511\u0511\u0511\u011C\u0120\u011E\u0121", '\354', '\005'), new Class[0]);
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
            b042504250425042504250425 = 93;
        }
        lastSyncTime = s;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    s = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u01D0\u019E\u01A2\u01A0\u01A3\u019E\u01A2\u01A0\u01A3\u0593\u0593\u0593\u019E\u01A2\u01A0\u01A3", 'z', '\006'), new Class[0]);
                    try
                    {
                        s = ((String) (s.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s.getCause();
                    }
                    j = ((Integer)s).intValue();
                    switch ((j * (b042504250425042504250425 + j)) % b042504250425042504250425)
                    {
                    default:
                        s = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEC\uFFBA\uFFBE\uFFBC\uFFBF\uFFBA\uFFBE\uFFBC\uFFBF\u03AF\u03AF\u03AF\uFFBA\uFFBE\uFFBC\uFFBF", ';', '\003'), new Class[0]);
                        try
                        {
                            s = ((String) (s.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b042504250425042504250425 = ((Integer)s).intValue();
                        s = com/visa/cbp/external/ppv/UploadTxnsRequest.getMethod(nuuuuu.b0417041704170417041704170417("|.*,+.*,+\u043B\u043B\u043B.*,+", '\036', '\002'), new Class[0]);
                        try
                        {
                            s = ((String) (s.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b042504250425042504250425 = ((Integer)s).intValue();
                        // fall through

                    case 0: // '\0'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
    }

    public void setTokenInfos(List list)
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            b042504250425042504250425 = 63;
            b042504250425042504250425 = 32;
            // fall through

        case 0: // '\0'
            tokenInfos = list;
            break;
        }
    }
}
