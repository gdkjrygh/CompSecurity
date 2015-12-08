// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class g
{

    public static boolean a(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getActiveNetworkInfo();
        if (context == null || !context.isConnected()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String b(Context context)
    {
        int i;
        try
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "unknown";
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getActiveNetworkInfo();
        if (context == null) goto _L2; else goto _L3
_L3:
        if (!context.isAvailable() || context.getState() != android.net.NetworkInfo.State.CONNECTED) goto _L2; else goto _L4
_L4:
        i = context.getType();
        i;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 94
    //                   1 91
    //                   2 180
    //                   3 180
    //                   4 180
    //                   5 180
    //                   6 180;
           goto _L2 _L5 _L6 _L7 _L7 _L7 _L7 _L7
_L2:
        return "unknown";
_L6:
        return "WIFI";
_L5:
        i = context.getSubtype();
        i;
        JVM INSTR tableswitch 0 15: default 180
    //                   0 228
    //                   1 183
    //                   2 186
    //                   3 198
    //                   4 189
    //                   5 201
    //                   6 204
    //                   7 192
    //                   8 207
    //                   9 210
    //                   10 213
    //                   11 195
    //                   12 216
    //                   13 225
    //                   14 219
    //                   15 222;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L7:
        return "unknown";
_L9:
        return "GPRS";
_L10:
        return "EDGE";
_L12:
        return "CDMA";
_L15:
        return "1xRTT";
_L19:
        return "IDEN";
_L11:
        return "UMTS";
_L13:
        return "EVDO0";
_L14:
        return "EVDOA";
_L16:
        return "HSUPA";
_L17:
        return "HSUPA";
_L18:
        return "HSPA";
_L20:
        return "EVDOB";
_L22:
        return "EHRPD";
_L23:
        return "HSPAP";
_L21:
        return "LET";
_L8:
        return "unknown";
    }
}
