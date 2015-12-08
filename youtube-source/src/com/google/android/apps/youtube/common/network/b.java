// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.d.a;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            h, c, d

public final class b
    implements h
{

    public static final d a = new com.google.android.apps.youtube.common.network.c();
    private final ConnectivityManager b;
    private final d c;

    public b(ConnectivityManager connectivitymanager, d d1)
    {
        b = (ConnectivityManager)com.google.android.apps.youtube.common.fromguava.c.a(connectivitymanager);
        c = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
    }

    private boolean a(int j)
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.getType() == j;
    }

    public final boolean a()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    public final boolean b()
    {
        return android.support.v4.d.a.a(b);
    }

    public final boolean c()
    {
        return a(1);
    }

    public final boolean d()
    {
        return a(9);
    }

    public final boolean e()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a(0))
        {
            flag = flag1;
            if (c.g_())
            {
                flag = true;
            }
        }
        return flag;
    }

    public final String f()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        String s;
        if (networkinfo == null)
        {
            s = "Disconnected";
        } else
        {
            String s1 = networkinfo.getTypeName();
            s = networkinfo.getSubtypeName();
            if (!TextUtils.isEmpty(s))
            {
                if (networkinfo.isConnected())
                {
                    return (new StringBuilder()).append(s1).append(".").append(s).toString();
                } else
                {
                    return (new StringBuilder("Disconnected (")).append(s1).append(".").append(s).append(")").toString();
                }
            }
            s = s1;
            if (!networkinfo.isConnected())
            {
                return (new StringBuilder("Disconnected (")).append(s1).append(")").toString();
            }
        }
        return s;
    }

    public final boolean g()
    {
        boolean flag = false;
        if (b.getNetworkInfo(0) != null)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean h()
    {
        boolean flag1 = true;
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            boolean flag = flag1;
            switch (networkinfo.getType())
            {
            default:
                flag = false;
                break;

            case 0: // '\0'
                flag = flag1;
                switch (networkinfo.getSubtype())
                {
                default:
                    return false;

                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                case 11: // '\013'
                case 12: // '\f'
                case 14: // '\016'
                case 15: // '\017'
                    return false;

                case 13: // '\r'
                    break;
                }
                break;

            case 1: // '\001'
            case 6: // '\006'
            case 9: // '\t'
                break;
            }
            while (true) 
            {
                return flag;
            }
        }
        return false;
    }

    public final int i()
    {
        NetworkInfo networkinfo;
        byte byte1;
        byte1 = 6;
        networkinfo = b.getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnected()) goto _L2; else goto _L1
_L1:
        byte byte0 = 2;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (networkinfo.getType())
        {
        default:
            return 1;

        case 6: // '\006'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            return 3;

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        switch (networkinfo.getSubtype())
        {
        default:
            return 7;

        case 1: // '\001'
        case 2: // '\002'
            return 4;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 5;

        case 13: // '\r'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
