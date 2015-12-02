// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import com.whatsapp.contact.g;
import com.whatsapp.contact.i;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.z;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            o4, App, k, ft, 
//            aoz, qt, u_, asw, 
//            ph

final class DbBackupAlarmBroadcastReceiver extends BroadcastReceiver
{

    private static final String z[];
    private final App a;

    DbBackupAlarmBroadcastReceiver(App app)
    {
        a = app;
    }

    static App a(DbBackupAlarmBroadcastReceiver dbbackupalarmbroadcastreceiver)
    {
        return dbbackupalarmbroadcastreceiver.a;
    }

    static void a(DbBackupAlarmBroadcastReceiver dbbackupalarmbroadcastreceiver, Context context)
    {
        dbbackupalarmbroadcastreceiver.b(context);
    }

    private void b(Context context)
    {
        try
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalThreadStateException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        Object obj;
        int j;
        try
        {
            com.whatsapp.fieldstats.z.a(context, ag.CLASS_COUNT, Integer.valueOf(o4.e()));
            if (o4.e() <= 10)
            {
                com.whatsapp.fieldstats.z.a(context, ag.CLASS_NAMES, o4.n().substring(0, 1000));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        try
        {
            com.whatsapp.fieldstats.z.a(context, ag.IS_BLUESTACKS, Boolean.valueOf(o4.q()));
            com.whatsapp.fieldstats.z.a(context, ag.IS_GENYMOTION, Boolean.valueOf(o4.I()));
            com.whatsapp.fieldstats.z.a(context, ag.SIGNATURE_HASH, o4.a(context));
            if (o4.D())
            {
                com.whatsapp.fieldstats.z.a(App.au, ag.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        com.whatsapp.fieldstats.z.a(context, ag.IS_WHATSAPP_PLUS_USER, Boolean.valueOf(o4.m()));
        com.whatsapp.fieldstats.z.a(context, ag.GOOGLE_ACCOUNT_COUNT, Integer.valueOf(o4.u()));
        com.whatsapp.fieldstats.z.a(context, ag.ANDROID_HAS_SD_CARD, o4.c());
        obj = i.b(g.BOTH);
        if (obj != null)
        {
            try
            {
                com.whatsapp.fieldstats.z.a(context, ag.ADDRESSBOOK_SIZE, ((Integer) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        j = App.az.l();
        if (j != -1)
        {
            try
            {
                com.whatsapp.fieldstats.z.a(context, ag.ADDRESSBOOK_WHATSAPP_SIZE, Integer.valueOf(j));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        ft.b();
        obj = aoz.o();
        if (obj != null)
        {
            try
            {
                com.whatsapp.fieldstats.z.a(context, ag.CHAT_DATABASE_SIZE, Double.valueOf(((Long) (obj)).longValue()));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        ft.c();
    }

    public void a(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[1]), z[0], null);
    }

    public void onReceive(Context context, Intent intent)
    {
        int j = App.am;
        boolean flag;
        try
        {
            flag = App.aC;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        Log.i(z[4]);
        App.aY = true;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (!App.ae)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.i(z[6]);
        App.aY = false;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        context = (qt)de.greenrobot.event.g.a().a(com/whatsapp/qt);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        flag = context.c();
        if (!flag)
        {
            try
            {
                Log.i(z[5]);
                App.aY = true;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_135;
            }
        }
        Log.i(z[3]);
        App.aY = false;
        asw.a(new u_(true), new Void[0]);
        x.a(new ph(this));
        a.aK();
        return;
        context;
        throw context;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[7];
        obj = "OG9]zDI \000l\\Xz\003h^E=\000~EG:]O~g\0257Nm{\0";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "OG9]zDI \000l\\Xz\022aMZ9]@i{\0072Ji{\0137Osj\0250Fyx";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "AM \033bH\b'\033bYD0ScI^1\001-NMt\001xB\b2\001bA\b \033h\f}\035SyDZ1\022i";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "MX$\\l@I&\036\"A[3\000iN\0076\022nG]$";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "MX$\\l@I&\036\"A[3\000iN\0076\022nG]$\\~GA$ScC\b9\026iEI";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "MX$\\l@I&\036\"A[3\000iN\0076\022nG]$\\~GA$ScC\\t\003aYO3\026i\fA:SlBLt\037b[\b6\022yXM&\n";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "MX$\\l@I&\036\"A[3\000iN\0076\022nG]$\\~GA$S\177II0^bBD-S`IL=\022";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 13;
_L9:
        obj[l] = (char)(byte1 ^ c);
        l++;
          goto _L8
_L4:
        byte1 = 44;
          goto _L9
_L5:
        byte1 = 40;
          goto _L9
_L6:
        byte1 = 84;
          goto _L9
        byte1 = 115;
          goto _L9
    }
}
