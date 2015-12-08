// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.jiubang.commerce.utils:
//            j

public class k
{

    public static boolean a(Context context)
    {
        boolean flag = false;
        if (context == null) goto _L2; else goto _L1
_L1:
        try
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if (context == null) goto _L4; else goto _L3
_L3:
        context = context.getActiveNetworkInfo();
        if (context == null) goto _L4; else goto _L5
_L5:
        flag = context.isConnected();
        if (!flag) goto _L4; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L4:
        flag = false;
        if (true) goto _L2; else goto _L7
_L7:
    }

    public static boolean b(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
        } else
        {
            context = null;
        }
        return context != null && context.isConnected() && context.getType() == 1;
    }

    public static int c(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            if (j.a)
            {
                j.a("appcenter_network", (new StringBuilder()).append("\u7F51\u7EDC\u7C7B\u578B\uFF1A").append(context.getType()).toString());
            }
            switch (context.getType())
            {
            default:
                return 0;

            case 1: // '\001'
                return 1;

            case 0: // '\0'
                if (j.a)
                {
                    j.a("appcenter_network", (new StringBuilder()).append("\u624B\u673A\u7F51\u5236\u7C7B\u578B\uFF1A").append(context.getSubtype()).toString());
                }
                switch (context.getSubtype())
                {
                default:
                    return 0;

                case 1: // '\001'
                case 2: // '\002'
                case 4: // '\004'
                case 7: // '\007'
                    return 2;

                case 3: // '\003'
                case 5: // '\005'
                case 6: // '\006'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 14: // '\016'
                case 15: // '\017'
                    return 3;

                case 13: // '\r'
                    return 4;

                case 0: // '\0'
                    return 0;
                }

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
                return 5;
            }
        } else
        {
            return 0;
        }
    }

    public static String d(Context context)
    {
        int i = c(context);
        if (i != 0)
        {
            if (i == 1)
            {
                return "wifi";
            }
            if (i == 2)
            {
                return "2g";
            }
            if (i == 3)
            {
                return "3g";
            }
            if (i == 4)
            {
                return "4g";
            }
            if (i == 5)
            {
                return "other";
            }
        }
        return "unknown";
    }
}
