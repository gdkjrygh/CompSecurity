// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import java.util.Locale;

// Referenced classes of package com.google.android.apps.analytics:
//            AnalyticsParameterEncoder, Event, Item, Transaction, 
//            CustomVariable, CustomVariableBuffer

class NetworkRequestUtil
{

    private static final String FAKE_DOMAIN_HASH = "999";
    private static final String GOOGLE_ANALYTICS_GIF_PATH = "/__utm.gif";
    private static final int X10_PROJECT_NAMES = 8;
    private static final int X10_PROJECT_SCOPES = 11;
    private static final int X10_PROJECT_VALUES = 9;

    NetworkRequestUtil()
    {
    }

    static void appendCurrencyValue(StringBuilder stringbuilder, String s, double d)
    {
        stringbuilder.append(s).append("=");
        d = Math.floor(d * 1000000D + 0.5D) / 1000000D;
        if (d != 0.0D)
        {
            stringbuilder.append(Double.toString(d));
        }
    }

    private static void appendStringValue(StringBuilder stringbuilder, String s, String s1)
    {
        stringbuilder.append(s).append("=");
        if (s1 != null && s1.trim().length() > 0)
        {
            stringbuilder.append(AnalyticsParameterEncoder.encode(s1));
        }
    }

    public static String constructEventRequestPath(Event event, String s)
    {
        Locale locale = Locale.getDefault();
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        stringbuilder1.append(String.format("5(%s*%s", new Object[] {
            encode(event.category), encode(event.action)
        }));
        if (event.label != null)
        {
            stringbuilder1.append("*").append(encode(event.label));
        }
        stringbuilder1.append(")");
        if (event.value > -1)
        {
            stringbuilder1.append(String.format("(%d)", new Object[] {
                Integer.valueOf(event.value)
            }));
        }
        stringbuilder1.append(getCustomVariableParams(event));
        stringbuilder.append("/__utm.gif");
        stringbuilder.append("?utmwv=4.6ma");
        stringbuilder.append("&utmn=").append(event.randomVal);
        stringbuilder.append("&utmt=event");
        stringbuilder.append("&utme=").append(stringbuilder1.toString());
        stringbuilder.append("&utmcs=UTF-8");
        stringbuilder.append(String.format("&utmsr=%dx%d", new Object[] {
            Integer.valueOf(event.screenWidth), Integer.valueOf(event.screenHeight)
        }));
        stringbuilder.append(String.format("&utmul=%s-%s", new Object[] {
            locale.getLanguage(), locale.getCountry()
        }));
        stringbuilder.append("&utmac=").append(event.accountId);
        stringbuilder.append("&utmcc=").append(getEscapedCookieString(event, s));
        return stringbuilder.toString();
    }

    public static String constructItemRequestPath(Event event, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("/__utm.gif");
        stringbuilder.append("?utmwv=4.6ma");
        stringbuilder.append("&utmn=").append(event.randomVal);
        stringbuilder.append("&utmt=item");
        Item item = event.getItem();
        if (item != null)
        {
            appendStringValue(stringbuilder, "&utmtid", item.getOrderId());
            appendStringValue(stringbuilder, "&utmipc", item.getItemSKU());
            appendStringValue(stringbuilder, "&utmipn", item.getItemName());
            appendStringValue(stringbuilder, "&utmiva", item.getItemCategory());
            appendCurrencyValue(stringbuilder, "&utmipr", item.getItemPrice());
            stringbuilder.append("&utmiqt=");
            if (item.getItemCount() != 0L)
            {
                stringbuilder.append(item.getItemCount());
            }
        }
        stringbuilder.append("&utmac=").append(event.accountId);
        stringbuilder.append("&utmcc=").append(getEscapedCookieString(event, s));
        return stringbuilder.toString();
    }

    public static String constructPageviewRequestPath(Event event, String s)
    {
        String s1 = "";
        if (event.action != null)
        {
            s1 = event.action;
        }
        String s2 = s1;
        if (!s1.startsWith("/"))
        {
            s2 = (new StringBuilder()).append("/").append(s1).toString();
        }
        s1 = encode(s2);
        s2 = getCustomVariableParams(event);
        Locale locale = Locale.getDefault();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("/__utm.gif");
        stringbuilder.append("?utmwv=4.6ma");
        stringbuilder.append("&utmn=").append(event.randomVal);
        if (s2.length() > 0)
        {
            stringbuilder.append("&utme=").append(s2);
        }
        stringbuilder.append("&utmcs=UTF-8");
        stringbuilder.append(String.format("&utmsr=%dx%d", new Object[] {
            Integer.valueOf(event.screenWidth), Integer.valueOf(event.screenHeight)
        }));
        stringbuilder.append(String.format("&utmul=%s-%s", new Object[] {
            locale.getLanguage(), locale.getCountry()
        }));
        stringbuilder.append("&utmp=").append(s1);
        stringbuilder.append("&utmac=").append(event.accountId);
        stringbuilder.append("&utmcc=").append(getEscapedCookieString(event, s));
        return stringbuilder.toString();
    }

    public static String constructTransactionRequestPath(Event event, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("/__utm.gif");
        stringbuilder.append("?utmwv=4.6ma");
        stringbuilder.append("&utmn=").append(event.randomVal);
        stringbuilder.append("&utmt=tran");
        Transaction transaction = event.getTransaction();
        if (transaction != null)
        {
            appendStringValue(stringbuilder, "&utmtid", transaction.getOrderId());
            appendStringValue(stringbuilder, "&utmtst", transaction.getStoreName());
            appendCurrencyValue(stringbuilder, "&utmtto", transaction.getTotalCost());
            appendCurrencyValue(stringbuilder, "&utmttx", transaction.getTotalTax());
            appendCurrencyValue(stringbuilder, "&utmtsp", transaction.getShippingCost());
            appendStringValue(stringbuilder, "&utmtci", "");
            appendStringValue(stringbuilder, "&utmtrg", "");
            appendStringValue(stringbuilder, "&utmtco", "");
        }
        stringbuilder.append("&utmac=").append(event.accountId);
        stringbuilder.append("&utmcc=").append(getEscapedCookieString(event, s));
        return stringbuilder.toString();
    }

    private static void createX10Project(CustomVariable acustomvariable[], StringBuilder stringbuilder, int i)
    {
        boolean flag;
        int j;
        stringbuilder.append(i).append("(");
        flag = true;
        j = 0;
_L9:
        boolean flag1;
        if (j >= acustomvariable.length)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        flag1 = flag;
        if (acustomvariable[j] == null) goto _L2; else goto _L1
_L1:
        CustomVariable customvariable;
        customvariable = acustomvariable[j];
        if (!flag)
        {
            stringbuilder.append("*");
        } else
        {
            flag = false;
        }
        stringbuilder.append(customvariable.getIndex()).append("!");
        flag1 = flag;
        i;
        JVM INSTR tableswitch 8 11: default 104
    //                   8 127
    //                   9 149
    //                   10 108
    //                   11 171;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_171;
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        flag1 = flag;
_L2:
        j++;
        flag = flag1;
        if (true) goto _L9; else goto _L8
_L8:
        stringbuilder.append(x10Escape(encode(customvariable.getName())));
        flag1 = flag;
          goto _L2
_L5:
        stringbuilder.append(x10Escape(encode(customvariable.getValue())));
        flag1 = flag;
          goto _L2
        stringbuilder.append(customvariable.getScope());
        flag1 = flag;
          goto _L2
        stringbuilder.append(")");
        return;
    }

    private static String encode(String s)
    {
        return AnalyticsParameterEncoder.encode(s);
    }

    public static String getCustomVariableParams(Event event)
    {
        StringBuilder stringbuilder = new StringBuilder();
        event = event.getCustomVariableBuffer();
        if (event == null)
        {
            return "";
        }
        if (!event.hasCustomVariables())
        {
            return "";
        } else
        {
            event = event.getCustomVariableArray();
            createX10Project(event, stringbuilder, 8);
            createX10Project(event, stringbuilder, 9);
            createX10Project(event, stringbuilder, 11);
            return stringbuilder.toString();
        }
    }

    public static String getEscapedCookieString(Event event, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("__utma=");
        stringbuilder.append("999").append(".");
        stringbuilder.append(event.userId).append(".");
        stringbuilder.append(event.timestampFirst).append(".");
        stringbuilder.append(event.timestampPrevious).append(".");
        stringbuilder.append(event.timestampCurrent).append(".");
        stringbuilder.append(event.visits);
        if (s != null)
        {
            stringbuilder.append("+__utmz=");
            stringbuilder.append("999").append(".");
            stringbuilder.append(event.timestampFirst).append(".");
            stringbuilder.append("1.1.");
            stringbuilder.append(s);
        }
        return encode(stringbuilder.toString());
    }

    private static String x10Escape(String s)
    {
        return s.replace("'", "'0").replace(")", "'1").replace("*", "'2").replace("!", "'3");
    }
}
