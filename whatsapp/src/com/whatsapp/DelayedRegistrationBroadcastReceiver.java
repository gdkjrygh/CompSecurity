// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.util.Calendar;

// Referenced classes of package com.whatsapp:
//            App, a8g

final class DelayedRegistrationBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];

    DelayedRegistrationBroadcastReceiver()
    {
    }

    private void a(Context context, long l)
    {
label0:
        {
            PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, (new Intent(z[12])).setPackage(z[14]), 0x8000000);
            context = (AlarmManager)context.getSystemService(z[13]);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                context.setExact(0, l, pendingintent);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            context.set(0, l, pendingintent);
        }
    }

    private void b(Context context, long l)
    {
        context = context.getSharedPreferences(z[1], 0).edit();
        context.putLong(z[0], l);
        if (!context.commit())
        {
            Log.w(z[2]);
        }
    }

    public void a(Context context)
    {
        int i;
        long l;
        i = App.am;
        l = context.getSharedPreferences(z[21], 0).getLong(z[23], -1L);
        if (l != -2L) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Calendar calendar;
        PendingIntent pendingintent;
        long l1;
        l1 = System.currentTimeMillis();
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l1);
        calendar.add(12, 720);
        pendingintent = PendingIntent.getBroadcast(context, 0, (new Intent(z[24])).setPackage(z[22]), 0x20000000);
        if (pendingintent == null || l != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        b(context, l1);
        a(context, calendar.getTimeInMillis());
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (pendingintent == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[25]);
        if (i == 0) goto _L1; else goto _L4
_L4:
        b(context, l1);
        a(context, calendar.getTimeInMillis());
        return;
    }

    public void b(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, (new Intent(z[16])).setPackage(z[15]), 0x20000000);
        if (pendingintent != null)
        {
            ((AlarmManager)context.getSystemService(z[18])).cancel(pendingintent);
            context = context.getSharedPreferences(z[19], 0).edit();
            context.remove(z[20]);
            if (!context.commit())
            {
                Log.w(z[17]);
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            Log.i(z[10]);
            Object obj = context.getSharedPreferences(z[7], 0);
            long l = ((SharedPreferences) (obj)).getLong(z[11], -1L);
            if (l > 0L && System.currentTimeMillis() - l > 0x2932e00L)
            {
                b(context);
                if (App.u == 1 && App.f(App.au) != 3)
                {
                    intent = ((SharedPreferences) (obj)).getString(z[3], "");
                    obj = ((SharedPreferences) (obj)).getString(z[4], "");
                    Log.i((new StringBuilder()).append(z[6]).append(intent).append(z[5]).append(((String) (obj))).append(z[9]).append(App.z.getSimState()).append(" ").append(App.z.getLine1Number()).toString());
                    App.a(z[8], false, a8g.CRASH, null);
                }
                b(context, -2L);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a(context, l + 0x2932e00L);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[26];
        obj = "!\033.0j'\f(-p<\020\026*m2\f=\006m:\023,";
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
                obj = "0\021$wn;\037=*x#\016\026)k6\030,+|=\035,*";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "2\0169vj6\n;<~:\r=+x'\027&7j'\037;-m:\023,v|!\f&+";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "0\035";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "#\026";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "s\020<4$";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "2\0169vk6\031 *m!\037=0v=\n(2p=\031=6v?\021'>60\035i";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "0\021$wn;\037=*x#\016\026)k6\030,+|=\035,*";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "!\033.0j'\f(-p<\020ig$sO{yq!\r";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "s\r 4$";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "2\0169vk6\031 *m!\037=0v=\n(2p=\031=6v?\021'>6'\027$<v&\n";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "!\033.0j'\f(-p<\020\026*m2\f=\006m:\023,";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "0\021$wn;\037=*x#\016g8u2\f$wK\0269\000\nM\001?\035\020V\035!\035\030R\0320\016\006M\0341\026\025V\0359\026\rP\036;\006\fM";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "2\022(+t";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "0\021$wn;\037=*x#\016";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "0\021$wn;\037=*x#\016";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "0\021$wn;\037=*x#\016g8u2\f$wK\0269\000\nM\001?\035\020V\035!\035\030R\0320\016\006M\0341\026\025V\0359\026\rP\036;\006\fM";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "2\0169vx?\037;46!\033.-v<\022&7~|\035(7z6\022f+|>\021?<4'\027$<66\f;6k";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "2\022(+t";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "0\021$wn;\037=*x#\016\026)k6\030,+|=\035,*";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "!\033.0j'\f(-p<\020\026*m2\f=\006m:\023,";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "0\021$wn;\037=*x#\016\026)k6\030,+|=\035,*";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "0\021$wn;\037=*x#\016";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "!\033.0j'\f(-p<\020\026*m2\f=\006m:\023,";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "0\021$wn;\037=*x#\016g8u2\f$wK\0269\000\nM\001?\035\020V\035!\035\030R\0320\016\006M\0341\026\025V\0359\026\rP\036;\006\fM";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "2\0169vx?\037;46!\033.-v<\022&7~|\r,-62\022;<x7\007d<a:\r=*6 \025 )";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 652
    //                   0 675
    //                   1 682
    //                   2 689
    //                   3 696;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_696;
_L3:
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 83;
          goto _L9
_L5:
        byte1 = 126;
          goto _L9
_L6:
        byte1 = 73;
          goto _L9
        byte1 = 89;
          goto _L9
    }
}
