// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.text.TextUtils;
import java.util.Locale;

public class UpcUtils
{

    public static final String TAG = com/walmart/android/utils/UpcUtils.getSimpleName();

    public UpcUtils()
    {
    }

    public static String convertUpceToUpca(String s)
    {
        String s1 = s;
        if (s.length() == 7)
        {
            s1 = String.format("0%s", new Object[] {
                s
            });
        }
        switch (s1.charAt(6))
        {
        default:
            return s1;

        case 48: // '0'
            return String.format("00%s00000%s", new Object[] {
                s1.substring(1, 3), s1.substring(3, 6)
            });

        case 49: // '1'
            return String.format("00%s10000%s", new Object[] {
                s1.substring(1, 3), s1.substring(3, 6)
            });

        case 50: // '2'
            return String.format("00%s20000%s", new Object[] {
                s1.substring(1, 3), s1.substring(3, 6)
            });

        case 51: // '3'
            return String.format("00%s00000%s", new Object[] {
                s1.substring(1, 4), s1.substring(4, 6)
            });

        case 52: // '4'
            return String.format("00%s00000%s", new Object[] {
                s1.substring(1, 5), s1.substring(5, 6)
            });

        case 53: // '5'
            return String.format("00%s00005", new Object[] {
                s1.substring(1, 6)
            });

        case 54: // '6'
            return String.format("00%s00006", new Object[] {
                s1.substring(1, 6)
            });

        case 55: // '7'
            return String.format("00%s00007", new Object[] {
                s1.substring(1, 6)
            });

        case 56: // '8'
            return String.format("00%s00008", new Object[] {
                s1.substring(1, 6)
            });

        case 57: // '9'
            return String.format("00%s00009", new Object[] {
                s1.substring(1, 6)
            });
        }
    }

    public static String getLookupUpc(String s)
    {
        String s1;
        if (s != null)
        {
            s1 = s;
        } else
        {
            s1 = "";
        }
        if (isValid(s))
        {
            if (isPriceEmbedded(s))
            {
                s = getPriceEmbeddedLookupCode(s);
            } else
            if (s.length() == 8 || s.length() == 7)
            {
                s = convertUpceToUpca(s);
            } else
            {
                s = s.substring(0, s.length() - 1);
            }
            s1 = normalize(s);
        }
        return s1;
    }

    public static int getPrice(String s)
    {
        int i = 0;
        int j = s.length() - 12;
        if (j >= 0)
        {
            i = Integer.parseInt(s.substring(j + 7, j + 11));
        }
        return i;
    }

    public static String getPriceEmbeddedLookupCode(String s)
    {
        String s1 = s;
        int i = s.length() - 12;
        int j = i + 6;
        String s2 = s1;
        if (i >= 0)
        {
            s2 = s1;
            if (j < s.length())
            {
                s2 = String.format(Locale.US, "%s00000", new Object[] {
                    s.substring(i, j)
                });
            }
        }
        return s2;
    }

    public static boolean isPriceEmbedded(String s)
    {
        String s1;
        boolean flag1 = true;
        if (!isValid(s))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        s1 = s;
        boolean flag = flag1;
        if (s.length() == 13)
        {
            if (s.charAt(0) == '0')
            {
                s1 = s.substring(1);
                flag = flag1;
            } else
            {
                flag = false;
                s1 = s;
            }
        }
        if (s1.length() == 12) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (s1.charAt(0) == '2') goto _L4; else goto _L3
_L3:
        return false;
        return false;
    }

    public static boolean isShelfCode(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (isValid(s))
        {
            s = normalize(s);
            flag = flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag = flag1;
                if (s.length() == 12)
                {
                    flag = flag1;
                    if (s.startsWith("40"))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public static boolean isValid(String s)
    {
        return s != null && s.matches("^[0-9]{6,}$");
    }

    public static String normalize(String s)
    {
        try
        {
            s = String.format(Locale.US, "%d", new Object[] {
                Long.valueOf(Long.parseLong(s))
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static String zeroPrefix(String s, int i)
    {
        StringBuilder stringbuilder;
        for (stringbuilder = new StringBuilder(); stringbuilder.length() + s.length() < i; stringbuilder.append('0')) { }
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

}
