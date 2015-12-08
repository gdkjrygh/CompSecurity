// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class TokenKey
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static int b043A043A043A043A043A043A = 1;
    public static int b043A043A043A043A043A043A = 60;
    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 2;
    private long tokenId;

    public TokenKey(long l)
    {
        Object obj;
        int i;
        int j;
        int k;
        int i1;
        int j1;
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b043A043A043A043A043A043A;
        j = b043A043A043A043A043A043A;
        k = b043A043A043A043A043A043A;
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u01CD\u019B\u019F\u019E\u01AC\u05A5\u05A5\u05A5\u05A5\u019B\u019F\u019E\u01AC", 'y', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\b\u0450Z^Y+\u0450\u0450\u0450Z^Y+", 'j', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        j1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF90\uFF5E\uFF62\uFF61\uFF6F\u0368\u0368\u0368\u0368\uFF5E\uFF62\uFF61\uFF6F", 'F', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if ((((Integer)obj).intValue() * (i1 + j1)) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 55;
            b043A043A043A043A043A043A = 90;
        }
        if ((k * (i + j)) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
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
            b043A043A043A043A043A043A = 67;
            b043A043A043A043A043A043A = 44;
        }
        try
        {
            tokenId = l;
            return;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
    }

    public TokenKey(Parcel parcel)
    {
        Method method;
        long l;
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        method = android/os/Parcel.getMethod(nuuuuu.b0417041704170417041704170417("\277\250\254\251\201\242\243\252", '\315', '\002'), new Class[0]);
        parcel = ((Parcel) (method.invoke(parcel, new Object[0])));
        l = ((Long)parcel).longValue();
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 37;
            b043A043A043A043A043A043A = 54;
        }
        tokenId = l;
        return;
        parcel;
        throw parcel.getCause();
    }

    public static int b043A043A043A043A043A043A()
    {
        return 0;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 98;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 1;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 2;
    }

    public int describeContents()
    {
        if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
            {
                Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\300\216\222\221\237\u0498\u0498\u0498\u0498\216\222\221\237", '^', '\005'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b043A043A043A043A043A043A = ((Integer)obj).intValue();
                b043A043A043A043A043A043A = 32;
            }
            b043A043A043A043A043A043A = 99;
            b043A043A043A043A043A043A = 14;
        }
        1;
        JVM INSTR tableswitch 0 1: default 120
    //                   0 95
    //                   1 147;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 172
    //                   0 199
    //                   1 95;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
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
        break MISSING_BLOCK_LABEL_95;
_L7:
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof TokenKey))
        {
            long l = tokenId;
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        int i = b043A043A043A043A043A043A;
                        Object obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("-\u0405\uFFFB\uFFFF\uFFFE\f\u0405\u0405\u0405\uFFFB\uFFFF\uFFFE\f", '\\', '\'', '\001'), new Class[0]);
                        int j;
                        int k;
                        try
                        {
                            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            throw ((InvocationTargetException) (obj)).getCause();
                        }
                        j = ((Integer)obj1).intValue();
                        k = b043A043A043A043A043A043A;
                        obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u013E\u0516\u0516\u010C\u0110\u010F\u011D\u0516\u0516\u010C\u0110\u010F\u011D", 'n', '\001'), new Class[0]);
                        try
                        {
                            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            throw ((InvocationTargetException) (obj)).getCause();
                        }
                        if ((k * (j + i)) % ((Integer)obj1).intValue() != b043A043A043A043A043A043A)
                        {
                            Object obj2 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBD\uFF8B\uFF8F\uFF8E\uFF9C\u0395\u0395\u0395\u0395\uFF8B\uFF8F\uFF8E\uFF9C", '\245', '\0'), new Class[0]);
                            long l1;
                            try
                            {
                                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                throw ((InvocationTargetException) (obj)).getCause();
                            }
                            b043A043A043A043A043A043A = ((Integer)obj2).intValue();
                            obj2 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7F\uFE4D\uFE51\uFE50\uFE5E\u0257\u0257\u0257\u0257\uFE4D\uFE51\uFE50\uFE5E", '\241', '\004'), new Class[0]);
                            try
                            {
                                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                throw ((InvocationTargetException) (obj)).getCause();
                            }
                            b043A043A043A043A043A043A = ((Integer)obj2).intValue();
                        }
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
            l1 = ((TokenKey)obj).tokenId;
            if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
            {
label1:
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
                                break label1;

                            case 1: // '\001'
                                continue label1;
                            }
                        }
                        break;

                    case 0: // '\0'
                        break label1;

                    case 1: // '\001'
                        break;
                    }
                } while (true);
                b043A043A043A043A043A043A = 84;
                obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEC\uFFBA\uFFBE\uFFBD\uFFCB\u03C4\u03C4\u03C4\u03C4\uFFBA\uFFBE\uFFBD\uFFCB", ';', '\003'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw ((InvocationTargetException) (obj)).getCause();
                }
                b043A043A043A043A043A043A = ((Integer)obj).intValue();
            }
            if (l == l1)
            {
                return true;
            }
        }
        return false;
    }

    public long getTokenId()
    {
        int i = b043A043A043A043A043A043A;
        int j = b043A043A043A043A043A043A;
        int k = b043A043A043A043A043A043A;
        int l = b043A043A043A043A043A043A;
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
        Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF66\uFF34\uFF38\uFF37\uFF45\u033E\u033E\u033E\u033E\uFF34\uFF38\uFF37\uFF45", '~', '\003'), new Class[0]);
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        i1 = ((Integer)obj).intValue();
        switch ((i1 * (b043A043A043A043A043A043A + i1)) % b043A043A043A043A043A043A)
        {
        default:
            b043A043A043A043A043A043A = 52;
            b043A043A043A043A043A043A = 9;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l != b043A043A043A043A043A043A)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF98\uFF66\uFF6A\uFF69\uFF77\u0370\u0370\u0370\u0370\uFF66\uFF6A\uFF69\uFF77", 'G', '\203', '\0'), new Class[0]);
            Exception exception;
            long l1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u0122\360\364\363\u0101\u04FA\u04FA\u04FA\u04FA\360\364\363\u0101", '\232', '&', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
        }
        try
        {
            l1 = tokenId;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return l1;
    }

    public void setTokenId(long l)
    {
        int i = b043A043A043A043A043A043A;
        Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u0314\u06EC\u02E2\u02E6\u02E5\u02F3\u06EC\u06EC\u06EC\u02E2\u02E6\u02E5\u02F3", '\346', '\006'), new Class[0]);
        int k;
        int i1;
        int j1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        k = ((Integer)obj).intValue();
        i1 = b043A043A043A043A043A043A;
        j1 = b043A043A043A043A043A043A;
        obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\371\253\257\250\332\253\257\250\332\u04A1\u04A1\u04A1\253\257\250\332", '\233', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((k + i) * i1) % j1 != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("6d`g\025\u046E\u046E\u046E\u046Ed`g\025", 'T', '\002'), new Class[0]);
            Exception exception;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            b043A043A043A043A043A043A = 35;
        }
        j = b043A043A043A043A043A043A;
        switch ((j * (b043A043A043A043A043A043A + j)) % b043A043A043A043A043A043A)
        {
        default:
            obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF50\uFF1E\uFF22\uFF21\uFF2F\u0328\u0328\u0328\u0328\uFF1E\uFF22\uFF21\uFF2F", 'K', '\307', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAE\uFF7C\uFF80\uFF7F\uFF8D\u0386\u0386\u0386\u0386\uFF7C\uFF80\uFF7F\uFF8D", '<', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            tokenId = l;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public String toString()
    {
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
        int i = b043A043A043A043A043A043A;
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u0133\u0101\u0105\u0104\u0112\u050B\u050B\u050B\u050B\u0101\u0105\u0104\u0112", '\321', '\005'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Object obj1;
            int j;
            long l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj).intValue();
            b043A043A043A043A043A043A = 65;
            // fall through

        case 0: // '\0'
            l = tokenId;
            obj = java/lang/Long.getMethod(nuuuuu.b0417041704170417041704170417("\u0100\373\337\u0100\376\365\372\363", '\214', '\005'), new Class[] {
                Long.TYPE
            });
            break;
        }
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[] {
                Long.valueOf(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        obj = (String)obj;
        j = b043A043A043A043A043A043A;
        obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417(")\u0401\uFFF7\uFFFB\uFFFA\b\u0401\u0401\u0401\uFFF7\uFFFB\uFFFA\b", 'a', '(', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((((Integer)obj1).intValue() + j) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
        {
            obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u018D\u015B\u015F\u015E\u016C\u0565\u0565\u0565\u0565\u015B\u015F\u015E\u016C", '\251', '\202', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            b043A043A043A043A043A043A = 39;
        }
        return ((String) (obj));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Method method;
        int j;
        int k;
        int l;
        int i1;
        long l1;
        try
        {
            l1 = tokenId;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        method = android/os/Parcel.getMethod(nuuuuu.b0417041704170417041704170417("\336\331\320\333\314\263\326\325\316", '\035', 'J', '\003'), new Class[] {
            Long.TYPE
        });
        method.invoke(parcel, new Object[] {
            Long.valueOf(l1)
        });
        i = b043A043A043A043A043A043A;
        j = b043A043A043A043A043A043A;
        k = b043A043A043A043A043A043A;
        l = b043A043A043A043A043A043A;
        i1 = b043A043A043A043A043A043A;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        try
        {
            b043A043A043A043A043A043A = 30;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        parcel = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF27\uFEF5\uFEF9\uFEF8\uFF06\u02FF\u02FF\u02FF\u02FF\uFEF5\uFEF9\uFEF8\uFF06", '~', '\275', '\0'), new Class[0]);
        parcel = ((Parcel) (parcel.invoke(null, new Object[0])));
        i = ((Integer)parcel).intValue();
        b043A043A043A043A043A043A = i;
        return;
        parcel;
        throw parcel.getCause();
        parcel;
        throw parcel.getCause();
    }

    static 
    {
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
        int i = b043A043A043A043A043A043A;
        int k = b043A043A043A043A043A043A;
        int l = b043A043A043A043A043A043A;
        Object obj = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\u017E\u0556\u0556\u014C\u0150\u014F\u015D\u0556\u0556\u014C\u0150\u014F\u015D", '\216', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((l * (i + k)) % ((Integer)obj).intValue() != b043A043A043A043A043A043A)
        {
            b043A043A043A043A043A043A = 79;
            b043A043A043A043A043A043A = 26;
            int j = b043A043A043A043A043A043A;
            switch ((j * (b043A043A043A043A043A043A + j)) % b043A043A043A043A043A043A)
            {
            default:
                b043A043A043A043A043A043A = 71;
                Object obj1 = com/visa/cbp/sdk/facade/data/TokenKey.getMethod(nuuuuu.b0417041704170417041704170417("\uFF80\uFF4E\uFF52\uFF51\uFF5F\u0358\u0358\u0358\u0358\uFF4E\uFF52\uFF51\uFF5F", '\342', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b043A043A043A043A043A043A = ((Integer)obj1).intValue();
                break;

            case 0: // '\0'
                break;
            }
        }
label1:
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
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
    }

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public static int b044804480448044804480448 = 50;
        public static int b044804480448044804480448 = 1;
        public static int b044804480448044804480448 = 2;
        public static int b044804480448044804480448;

        public static int b044804480448044804480448()
        {
            return 19;
        }

        public static int b044804480448044804480448()
        {
            return 1;
        }

        public static int b044804480448044804480448()
        {
            return 0;
        }

        public Object createFromParcel(Parcel parcel)
        {
            return new TokenKey(parcel);
        }

        public TokenKey[] newArray(int i)
        {
            TokenKey atokenkey[] = new TokenKey[i];
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
            i = b044804480448044804480448;
            int j = b044804480448044804480448;
            int k = b044804480448044804480448;
            int l = b044804480448044804480448;
            int i1 = b044804480448044804480448;
            switch ((i1 * (b044804480448044804480448 + i1)) % b044804480448044804480448)
            {
            default:
                Object obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\u0113\341\345\345\351\341\345\345\351\341\345\345\351\u04F9\u04F9\341\345\345\351", '\025', '\234', '\003'), new Class[0]);
                InvocationTargetException invocationtargetexception;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\253y}}\201y}}\201y}}\201\u0491\u0491y}}\201", '\032', 'c', '\001'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
                break;

            case 0: // '\0'
                break;
            }
            if ((k * (i + j)) % l != b044804480448044804480448)
            {
                obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFF13\uFEE1\uFEE5\uFEE5\uFEE9\uFEE1\uFEE5\uFEE5\uFEE9\uFEE1\uFEE5\uFEE5\uFEE9\u02F9\u02F9\uFEE1\uFEE5\uFEE5\uFEE9", '\316', '\201', '\0'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
                b044804480448044804480448 = 49;
            }
            return atokenkey;
        }

        public Object[] newArray(int i)
        {
            if (((b044804480448044804480448 + b044804480448044804480448) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
            {
                int j = b044804480448044804480448;
                switch ((j * (b044804480448044804480448 + j)) % b044804480448044804480448)
                {
                default:
                    Object obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\332\250\254\254\260\250\254\254\260\250\254\254\260\u04C0\u04C0\250\254\254\260", 'x', '\005'), new Class[0]);
                    InvocationTargetException invocationtargetexception;
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    catch (InvocationTargetException invocationtargetexception1)
                    {
                        throw invocationtargetexception1.getCause();
                    }
                    b044804480448044804480448 = ((Integer)obj).intValue();
                    b044804480448044804480448 = 32;
                    // fall through

                case 0: // '\0'
                    obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\u0117\345\351\351\355\345\351\351\355\345\351\351\355\u04FD\u04FD\345\351\351\355", '\265', '\005'), new Class[0]);
                    break;
                }
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
                obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\u01B3\u0181\u0185\u0185\u0189\u0181\u0185\u0185\u0189\u0181\u0185\u0185\u0189\u0599\u0599\u0181\u0185\u0185\u0189", '\236', '\263', '\003'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
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
label1:
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
                            break label1;

                        case 1: // '\001'
                            continue label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label1;
                }
            } while (true);
            obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF0\uFFE7\uFFF9\uFFC3\uFFF4\uFFF4\uFFE3\uFFFB", '?', '\003'), new Class[] {
                Integer.TYPE
            });
            try
            {
                obj = ((Method) (obj)).invoke(this, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            return (TokenKey[])obj;
        }

        _cls1()
        {
            if (((b044804480448044804480448 + b044804480448044804480448) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
            {
                Object obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\u01D6\u01A4\u01A8\u01A8\u01AC\u01A4\u01A8\u01A8\u01AC\u01A4\u01A8\u01A8\u01AC\u05BC\u05BC\u01A4\u01A8\u01A8\u01AC", '|', '\006'), new Class[0]);
                Object obj1;
                int i;
                int j;
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
                b044804480448044804480448 = ((Integer)obj).intValue();
                b044804480448044804480448 = 9;
            }
            i = b044804480448044804480448;
            obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("m;??C\u0453;??C\u0453\u0453;??C", '!', '\026', '\002'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            j = ((Integer)obj).intValue();
            k = b044804480448044804480448;
            l = b044804480448044804480448;
            obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\u01F1\u05D7\u05D7\u01BF\u01C3\u01C3\u01C7\u05D7\u05D7\u01BF\u01C3\u01C3\u01C7", '\205', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            if (((j + i) * k) % l != ((Integer)obj).intValue())
            {
                obj = com/visa/cbp/sdk/facade/data/TokenKey$1.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7C\uFF4A\uFF4E\uFF4E\uFF52\uFF4A\uFF4E\uFF4E\uFF52\uFF4A\uFF4E\uFF4E\uFF52\u0362\u0362\uFF4A\uFF4E\uFF4E\uFF52", 's', '\003'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    throw ((InvocationTargetException) (obj1)).getCause();
                }
                b044804480448044804480448 = ((Integer)obj).intValue();
                b044804480448044804480448 = 95;
            }
            try
            {
                super();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
    }

}
