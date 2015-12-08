// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.walmart.android.app.item.HtmlListTagHandler;
import com.walmart.android.data.StoreInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;

public class TextUtils
{

    public TextUtils()
    {
    }

    public static String capitalize(String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = s;
            if (s.length() > 0)
            {
                obj = s;
                if (Character.isLowerCase(s.charAt(0)))
                {
                    obj = (new StringBuilder()).append(Character.toUpperCase(s.charAt(0)));
                    if (s.length() > 1)
                    {
                        s = s.substring(1);
                    } else
                    {
                        s = "";
                    }
                    obj = ((StringBuilder) (obj)).append(s).toString();
                }
            }
        }
        return ((String) (obj));
    }

    private static void escapeCharsAndAppend(StringBuilder stringbuilder, char ac[], int i)
    {
        int j = 0;
_L8:
        char c;
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        c = ac[j];
        c;
        JVM INSTR lookupswitch 5: default 64
    //                   35: 79
    //                   37: 89
    //                   39: 99
    //                   63: 109
    //                   166: 119;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_119;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c);
_L9:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
        stringbuilder.append("%23");
          goto _L9
_L3:
        stringbuilder.append("%25");
          goto _L9
_L4:
        stringbuilder.append("%27");
          goto _L9
_L5:
        stringbuilder.append("%3f");
          goto _L9
        stringbuilder.append("|");
          goto _L9
    }

    public static String escapeHTML(String s)
    {
        char ac[] = s.toCharArray();
        s = new StringBuilder(s.length());
        escapeCharsAndAppend(s, ac, ac.length);
        return s.toString();
    }

    public static String formatDateString(String s)
    {
        Object obj = null;
        String as[] = s.split("T");
        s = obj;
        if (as != null)
        {
            s = obj;
            if (as.length > 0)
            {
                as = as[0].split("-");
                s = obj;
                if (as != null)
                {
                    s = obj;
                    if (as.length == 3)
                    {
                        s = new StringBuffer(14);
                        s.append(as[1]).append("/").append(as[2]).append("/").append(as[0]);
                        s = s.toString();
                    }
                }
            }
        }
        return s;
    }

    public static String getFormattedAmount(int i)
    {
        int j = i / 100;
        return String.format(Locale.US, "%d.%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i % 100)
        });
    }

    public static String getFormattedStoreAddress(Context context, StoreInfo storeinfo, int i)
    {
        Object obj = null;
        String s = obj;
        if (storeinfo != null)
        {
            s = obj;
            if (!android.text.TextUtils.isEmpty(storeinfo.addressLine2))
            {
                storeinfo = storeinfo.addressLine2.split(",");
                s = obj;
                if (storeinfo != null)
                {
                    s = obj;
                    if (storeinfo.length == 2)
                    {
                        Object obj1 = storeinfo[0];
                        storeinfo[1] = storeinfo[1].trim();
                        int j = storeinfo[1].indexOf(" ");
                        s = obj;
                        if (j != -1)
                        {
                            storeinfo[1] = storeinfo[1].substring(j).trim();
                            s = context.getString(i, new Object[] {
                                obj1, storeinfo[1]
                            });
                        }
                    }
                }
            }
        }
        return s;
    }

    public static String getPriceFromCents(int i)
    {
        return String.format(Locale.US, "$%d.%02d", new Object[] {
            Integer.valueOf(i / 100), Integer.valueOf(i % 100)
        });
    }

    public static String getPriceFromFloat(float f)
    {
        return String.format(Locale.US, "$%.2f", new Object[] {
            Float.valueOf(f)
        });
    }

    public static Spanned htmlToText(String s)
    {
        return Html.fromHtml(s, null, new HtmlListTagHandler());
    }

    public static String truncate(String s, int i)
    {
        return s.substring(0, Math.min(s.length(), i));
    }

    public static String urlDecode(String s)
    {
        String s1 = s;
        String s2 = s1;
        if (!android.text.TextUtils.isEmpty(s))
        {
            try
            {
                s2 = URLDecoder.decode(s, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return s1;
            }
        }
        return s2;
    }
}
