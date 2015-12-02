// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Debug;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import de.greenrobot.event.g;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, qt, ot, u_, 
//            asw

final class DeviceInfoAlarmBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];

    DeviceInfoAlarmBroadcastReceiver()
    {
    }

    private void a()
    {
        Object obj;
        int j;
        int l;
        j = 0;
        l = App.am;
        obj = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj)));
        Log.i((new StringBuilder()).append(z[12]).append(((android.os.Debug.MemoryInfo) (obj)).getTotalPrivateDirty()).append(z[15]).append(z[9]).append(((android.os.Debug.MemoryInfo) (obj)).getTotalPss()).append(z[7]).append(z[10]).append(((android.os.Debug.MemoryInfo) (obj)).getTotalSharedDirty()).append(z[8]).toString());
        obj = App.a.getRunningAppProcesses();
        if (obj != null) goto _L2; else goto _L1
_L1:
        android.os.Debug.MemoryInfo amemoryinfo[];
        int ai[];
        int i;
        int k;
        int i1;
        try
        {
            Log.w(z[13]);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (l == 0) goto _L3; else goto _L2
_L2:
        ai = new int[((List) (obj)).size()];
        i = 0;
_L11:
        if (i >= ((List) (obj)).size()) goto _L5; else goto _L4
_L4:
        ai[i] = ((android.app.ActivityManager.RunningAppProcessInfo)((List) (obj)).get(i)).pid;
        if (l == 0) goto _L6; else goto _L5
_L5:
        amemoryinfo = App.a.getProcessMemoryInfo(ai);
        if (amemoryinfo == null) goto _L3; else goto _L7
_L7:
        i1 = amemoryinfo.length;
        i = 0;
_L9:
        k = i;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i + amemoryinfo[j].getTotalPss();
        j++;
        i = k;
        if (l == 0) goto _L9; else goto _L8
_L8:
        try
        {
            Log.i((new StringBuilder()).append(z[14]).append(amemoryinfo.length).append(z[11]).append(k).toString());
        }
        catch (Exception exception1)
        {
            Log.i((new StringBuilder()).append(z[5]).append(exception1.toString()).toString());
        }
_L3:
        amemoryinfo = (qt)g.a().a(com/whatsapp/qt);
        Log.i((new StringBuilder()).append(z[6]).append(amemoryinfo).toString());
        App.aT();
        return;
_L6:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void a(DeviceInfoAlarmBroadcastReceiver deviceinfoalarmbroadcastreceiver)
    {
        deviceinfoalarmbroadcastreceiver.a();
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[4]), z[3], null);
    }

    public void b(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, (new Intent(z[0])).setPackage(z[1]), 0);
        ((AlarmManager)context.getSystemService(z[2])).setInexactRepeating(3, 0L, 0x36ee80L, pendingintent);
    }

    public void onReceive(Context context, Intent intent)
    {
        x.a(new ot(this));
        if (App.af())
        {
            asw.a(new u_(false), new Void[0]);
        }
        boolean flag = App.aI.getBackgroundDataSetting();
        Log.i((new StringBuilder()).append(z[17]).append(flag).toString());
        if (!flag)
        {
            App.b(context, true);
            App.a(context);
            App.i(z[16]);
        }
        com.whatsapp.App.g();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[18];
        obj = "\033;/eZ\032!0b_\020!8`X\r3&mZ\01376b";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "<\021\024\002n7\037\r_x/\016";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ">\022\030^t";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "<\021\024\002n7\037\r_x/\016W\\|-\023\020_j6\021\027\002[\r18hZ\036--";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\033;/eZ\032!0b_\020!8`X\r3&mZ\01376b";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ";\033\017Ez:Q\t^v<\033\n_|,Q\034^k0\fY";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ";\033\017Ez:Q\033Mm+\033\013U9";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "4<";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "4<";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\177\016\n_$";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\177\r\021Mk:\032&Hp-\n\000\021";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\177\n\026Xx3C";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ";\033\017Ez:Q\024It0\f\000\fi-\027\017Mm:!\035Ek+\007D";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = ";\033\017Ez:Q\t^v<\033\n_|,Q\027Cw:";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = ";\033\017Ez:Q\024It0\f\000\fi-\021\032Ij,\033\n\021";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "4<";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "<\021\024\002~0\021\036@|q\016\013Cz:\r\n\002~>\016\t_";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = ";\033\017Ez:Q\033Mz4\031\013Cl1\032THx+\037VIw>\034\025I}\177";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 476
    //                   0 499
    //                   1 506
    //                   2 513
    //                   3 520;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_520;
_L3:
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 95;
          goto _L9
_L5:
        byte1 = 126;
          goto _L9
_L6:
        byte1 = 121;
          goto _L9
        byte1 = 44;
          goto _L9
    }
}
