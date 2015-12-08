// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class d
{

    private static String a = "";

    public static int a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            Log.d("PhoneMachine", (new StringBuilder()).append("\u7F51\u7EDC\u7C7B\u578B\uFF1A").append(context.getType()).toString());
            switch (context.getType())
            {
            default:
                return 0;

            case 1: // '\001'
                return 1;

            case 0: // '\0'
                Log.d("PhoneMachine", (new StringBuilder()).append("\u624B\u673A\u7F51\u5236\u7C7B\u578B\uFF1A").append(context.getSubtype()).toString());
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

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            if (context != null && context.isConnected())
            {
                return true;
            }
        }
        return false;
    }

}
