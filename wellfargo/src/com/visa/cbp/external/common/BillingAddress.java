// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class BillingAddress
{

    public static int b042F042F042F042F042F042F = 0;
    public static int b042F042F042F042F042F042F = 2;
    public static int b042F042F042F042F042F042F = 1;
    public static int b042F042F042F042F042F042F = 1;
    private String city;
    private String country;
    private String line1;
    private String line2;
    private String state;
    private String zip;

    public BillingAddress()
    {
        int i = b042F042F042F042F042F042F;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
            Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\u03B1\uFFB2\uFFB6\uFFB4\uFFC8\uFFB2\uFFB6\uFFB4\uFFC8\u03B1\u03B1\uFFB2\uFFB6\uFFB4\uFFC8", '?', '\003'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFF70\u033D\uFF3E\uFF42\uFF40\uFF54\uFF3E\uFF42\uFF40\uFF54\u033D\u033D\uFF3E\uFF42\uFF40\uFF54", '\b', '\372', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
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
        super();
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 20;
            obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\u014F\u051C\u011D\u0121\u011F\u0133\u011D\u0121\u011F\u0133\u051C\u051C\u011D\u0121\u011F\u0133", 'O', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
        }
    }

    public static int b042F042F042F042F042F042F()
    {
        return 0;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 1;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 2;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 50;
    }

    public String getCity()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public String getCountry()
    {
        String s;
        int i;
        try
        {
            s = country;
        }
        catch (Exception exception)
        {
            throw exception;
        }
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
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 36;
            b042F042F042F042F042F042F = 16;
        }
        i = b042F042F042F042F042F042F;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 92;
            b042F042F042F042F042F042F = 17;
            // fall through

        case 0: // '\0'
            return s;
        }
    }

    public String getLine1()
    {
        int i = b042F042F042F042F042F042F;
        String s;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 98;
            b042F042F042F042F042F042F = 36;
            // fall through

        case 0: // '\0'
            s = line1;
            break;
        }
        Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB4\u0381\uFF82\uFF86\uFF84\uFF98\uFF82\uFF86\uFF84\uFF98\u0381\u0381\uFF82\uFF86\uFF84\uFF98", '\256', '\0'), new Class[0]);
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042F042F042F042F042F042F;
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFE77\u0244\uFE45\uFE49\uFE47\uFE5B\uFE45\uFE49\uFE47\uFE5B\u0244\u0244\uFE45\uFE49\uFE47\uFE5B", '\371', '\362', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            Object obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("N\u041B\034 \0362\034 \0362\u041B\u041B\034 \0362", '\024', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7E\u034B\uFF4C\uFF50\uFF4E\uFF62\uFF4C\uFF50\uFF4E\uFF62\u034B\u034B\uFF4C\uFF50\uFF4E\uFF62", 'L', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
        }
        return s;
    }

    public String getLine2()
    {
        int i = b042F042F042F042F042F042F;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 71;
            Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\u01BE\u058B\u018C\u0190\u018E\u01A2\u018C\u0190\u018E\u01A2\u058B\u058B\u018C\u0190\u018E\u01A2", '\256', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return line2;
        }
    }

    public String getState()
    {
label0:
        do
        {
            int i = b042F042F042F042F042F042F;
            switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
            {
            default:
                Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417(",\u03F9\uFFFA\uFFFE\uFFFC\020\uFFFA\uFFFE\uFFFC\020\u03F9\u03F9\uFFFA\uFFFE\uFFFC\020", '\033', '\003'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                Object obj1;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b042F042F042F042F042F042F = ((Integer)obj).intValue();
                obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\034\u03E9\uFFEA\uFFEE\uFFEC\000\uFFEA\uFFEE\uFFEC\000\u03E9\u03E9\uFFEA\uFFEE\uFFEC\0", 'D', '\212', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042F042F042F042F042F042F = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
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
                break;
            }
        } while (true);
        obj = state;
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\\\u0429*.,@*.,@\u0429\u0429*.,@", '\003', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            b042F042F042F042F042F042F = 72;
        }
        return ((String) (obj));
    }

    public String getZip()
    {
        int i = b042F042F042F042F042F042F;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 49;
            b042F042F042F042F042F042F = 88;
            // fall through

        case 0: // '\0'
            i = b042F042F042F042F042F042F;
            break;
        }
        Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\u0144\u0112\u0116\u0114\u0128\u0511\u0112\u0116\u0114\u0128\u0112\u0116\u0114\u0128\u0511\u0112\u0116\u0114\u0128", '\342', '\005'), new Class[0]);
        int j;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj).intValue();
        k = b042F042F042F042F042F042F;
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("$\u03F1\uFFF2\uFFF6\uFFF4\b\uFFF2\uFFF6\uFFF4\b\uFFF2\uFFF6\uFFF4\b\u03F1\uFFF2\uFFF6\uFFF4\b", 'u', '7', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((k * (j + i)) % ((Integer)obj).intValue() != b042F042F042F042F042F042F)
        {
            Object obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("`\u042D.20D.20D\u042D\u042D.20D", '\002', '\0'), new Class[0]);
            Exception exception;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            b042F042F042F042F042F042F = 31;
        }
        try
        {
            obj1 = zip;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj1));
    }

    public void setCity(String s)
    {
        try
        {
            city = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setCountry(String s)
    {
        int i = b042F042F042F042F042F042F;
        int j = b042F042F042F042F042F042F;
        int k = b042F042F042F042F042F042F;
        int l = b042F042F042F042F042F042F;
        Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\u025C\u022A\u022E\u022C\u0240\u022A\u022E\u022C\u0240\u0629\u0629\u022A\u022E\u022C\u0240\u022A\u022E\u022C\u0240", '\375', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\245\u0472swu\211swu\211\u0472\u0472swu\211", 'z', '7', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("#\u03F0\uFFF1\uFFF5\uFFF3\007\uFFF1\uFFF5\uFFF3\007\u03F0\u03F0\uFFF1\uFFF5\uFFF3\007", '\025', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
        }
        try
        {
            country = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setLine1(String s)
    {
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 27;
            Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDF\u03AC\uFFAD\uFFB1\uFFAF\uFFC3\uFFAD\uFFB1\uFFAF\uFFC3\u03AC\u03AC\uFFAD\uFFB1\uFFAF\uFFC3", '8', 'K', '\0'), new Class[0]);
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
        }
        i = b042F042F042F042F042F042F;
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\u0107\325\331\327\353\u04D4\325\331\327\353\325\331\327\353\u04D4\325\331\327\353", '7', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 78;
            obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFECD\u029A\uFE9B\uFE9F\uFE9D\uFEB1\uFE9B\uFE9F\uFE9D\uFEB1\u029A\u029A\uFE9B\uFE9F\uFE9D\uFEB1", '\207', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            line1 = s;
            return;
        }
    }

    public void setLine2(String s)
    {
        Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFED4\u02A1\uFEA2\uFEA6\uFEA4\uFEB8\uFEA2\uFEA6\uFEA4\uFEB8\u02A1\u02A1\uFEA2\uFEA6\uFEA4\uFEB8", '\307', '\003'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b042F042F042F042F042F042F;
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("#\u03F0\uFFF1\uFFF5\uFFF3\007\uFFF1\uFFF5\uFFF3\007\u03F0\u03F0\uFFF1\uFFF5\uFFF3\007", '?', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 54;
            int j = b042F042F042F042F042F042F;
            switch ((j * (b042F042F042F042F042F042F + j)) % b042F042F042F042F042F042F)
            {
            default:
                Object obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE8\u03B5\uFFB6\uFFBA\uFFB8\uFFCC\uFFB6\uFFBA\uFFB8\uFFCC\u03B5\u03B5\uFFB6\uFFBA\uFFB8\uFFCC", '\211', '\017', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042F042F042F042F042F042F = ((Integer)obj1).intValue();
                b042F042F042F042F042F042F = 93;
                // fall through

            case 0: // '\0'
                obj1 = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFF36\u0303\uFF04\uFF08\uFF06\uFF1A\uFF04\uFF08\uFF06\uFF1A\u0303\u0303\uFF04\uFF08\uFF06\uFF1A", '\226', '\003'), new Class[0]);
                break;
            }
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
        }
        0;
        JVM INSTR tableswitch 0 1: default 240
    //                   0 267
    //                   1 217;
           goto _L1 _L2 _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break label0;
            }
        }
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 292
    //                   0 217
    //                   1 319;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_217;
_L7:
        line2 = s;
        return;
    }

    public void setState(String s)
    {
        state = s;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    int i = b042F042F042F042F042F042F;
                    int k = b042F042F042F042F042F042F;
                    s = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB0\u037D\uFF7E\uFF82\uFF80\uFF94\uFF7E\uFF82\uFF80\uFF94\uFF7E\uFF82\uFF80\uFF94\u037D\uFF7E\uFF82\uFF80\uFF94", '\262', '\0'), new Class[0]);
                    try
                    {
                        s = ((String) (s.invoke(null, new Object[0])));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s.getCause();
                    }
                    switch (((k + i) * i) % ((Integer)s).intValue())
                    {
                    default:
                        b042F042F042F042F042F042F = 61;
                        s = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("O\u0402\035\031\037k\035\031\037k\u0402\u0402\035\031\037k", '-', '\002'), new Class[0]);
                        int j;
                        int l;
                        try
                        {
                            s = ((String) (s.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b042F042F042F042F042F042F = ((Integer)s).intValue();
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
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        j = b042F042F042F042F042F042F;
        l = b042F042F042F042F042F042F;
label1:
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        switch ((j * (l + j)) % b042F042F042F042F042F042F)
        {
        default:
            b042F042F042F042F042F042F = 65;
            s = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\303\u0490\221\225\223\247\221\225\223\247\u0490\u0490\221\225\223\247", '\226', '\367', '\001'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)s).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public void setZip(String s)
    {
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            Object obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFEF5\u02C2\uFEC3\uFEC7\uFEC5\uFED9\uFEC3\uFEC7\uFEC5\uFED9\u02C2\u02C2\uFEC3\uFEC7\uFEC5\uFED9", 'r', '\373', '\0'), new Class[0]);
            int i;
            int j;
            int k;
            int l;
            int i1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            b042F042F042F042F042F042F = 33;
        }
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA4\u0371\uFF72\uFF76\uFF74\uFF88\uFF72\uFF76\uFF74\uFF88\u0371\u0371\uFF72\uFF76\uFF74\uFF88", '_', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            j = b042F042F042F042F042F042F;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8F\u035C\uFF5D\uFF61\uFF5F\uFF73\uFF5D\uFF61\uFF5F\uFF73\u035C\u035C\uFF5D\uFF61\uFF5F\uFF73", '\263', ' ', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        k = ((Integer)obj).intValue();
        l = b042F042F042F042F042F042F;
        i1 = b042F042F042F042F042F042F;
        if ((k * (j + i)) % l == i1)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj = com/visa/cbp/external/common/BillingAddress.getMethod(nuuuuu.b0417041704170417041704170417("\362\u04BF\240\244\242\326\240\244\242\326\u04BF\u04BF\240\244\242\326", '\220', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042F042F042F042F042F042F = i;
            b042F042F042F042F042F042F = 65;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            zip = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_241;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        throw s;
        s;
        throw s.getCause();
    }
}
