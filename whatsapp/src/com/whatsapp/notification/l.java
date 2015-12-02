// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.Voip;
import com.whatsapp.VoipActivity;
import com.whatsapp.abl;
import com.whatsapp.aoz;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.asa;
import com.whatsapp.es;
import com.whatsapp.k;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification, al, v, MissedCallNotificationDismissedReceiver, 
//            a8

public class l
    implements es
{

    private static l b;
    private static final String z[];
    private LinkedList a;

    public l()
    {
        App.a(this);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        l1 = App.au.getSharedPreferences(z[20], 0).getLong(z[22], 0L);
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        a = App.ah.a(l1, null);
        if (!PopupNotification.q)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        a = new LinkedList();
        Log.i((new StringBuilder()).append(z[21]).append(a.size()).append(z[19]).append(l1).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public static l d()
    {
        return b;
    }

    public LinkedList a()
    {
        b();
        return a;
    }

    public void a(Context context, c4 c4_1, boolean flag)
    {
        b();
        if (a.isEmpty())
        {
            App.au.getSharedPreferences(z[23], 0).edit().putLong(z[24], c4_1.I).commit();
        }
        a.add(0, c4_1);
        a(context, flag);
        App.au.ab().post(new al(this));
    }

    public void a(Context context, boolean flag)
    {
        boolean flag1 = PopupNotification.q;
        b();
        if (!a.isEmpty()) goto _L2; else goto _L1
_L1:
        Log.i((new StringBuilder()).append(z[15]).append(flag).toString());
        NotificationManagerCompat.from(App.au).cancel(7);
        if (!flag1) goto _L3; else goto _L2
_L2:
        Object obj;
        android.support.v4.app.NotificationCompat.Builder builder;
        Object obj2;
        obj2 = new HashSet();
        obj = a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ((HashSet) (obj2)).add(((c4)((Iterator) (obj)).next()).y.a);
        } while (!flag1);
        builder = new android.support.v4.app.NotificationCompat.Builder(App.au);
        builder.setCategory(z[0]);
        builder.setPriority(1);
        builder.setSmallIcon(0x7f0205d9);
        obj = App.au.getSharedPreferences(z[2], 0);
        if (flag) goto _L5; else goto _L4
_L4:
        Object obj1 = null;
        if (!Voip.h()) goto _L7; else goto _L6
_L6:
        obj = ((SharedPreferences) (obj)).getString(z[13], null);
_L27:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = Uri.parse(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj1 = Conversation.B();
        boolean flag2;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        flag2 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.equals(obj);
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        flag2 = com.whatsapp.notification.v.a(((Uri) (obj)));
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        flag2 = ((asa) (obj1)).a();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        flag2 = ((asa) (obj1)).b().c();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        builder.setSound(((Uri) (obj)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        char c1;
        int i;
        try
        {
            App.a(((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag1) goto _L8; else goto _L5
_L5:
        try
        {
            builder.setDefaults(4);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L8:
        Log.i((new StringBuilder()).append(z[4]).append(a.size()).append(z[5]).append(((HashSet) (obj2)).size()).append(z[8]).append(flag).toString());
        if (((HashSet) (obj2)).size() != 1) goto _L10; else goto _L9
_L9:
        obj1 = (String)((HashSet) (obj2)).iterator().next();
        obj = App.az.e(((String) (obj1)));
        if (a.size() != 1)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        builder.setContentTitle(App.au.getString(0x7f0e025e));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        try
        {
            builder.setContentTitle(String.format(App.j.a(0x7f0d0018, a.size()), new Object[] {
                Integer.valueOf(a.size())
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        builder.setTicker(App.au.getString(0x7f0e0260, new Object[] {
            ((og) (obj)).a(context)
        }));
        builder.setContentText(((og) (obj)).a(context));
        context = new Intent(App.au, com/whatsapp/VoipActivity);
        context.setFlags(0x10000000);
        context.putExtra(z[3], ((String) (obj1)));
        context.putExtra(z[6], true);
        context = PendingIntent.getActivity(App.au, 0, context, 0x10000000);
        builder.addAction(0x7f020501, App.au.getText(0x7f0e025f), context);
        context = Conversation.a(((og) (obj)));
        context.putExtra(z[11], true);
        context = PendingIntent.getActivity(App.au, 0, context, 0x10000000);
        builder.addAction(0x7f020511, App.au.getText(0x7f0e0261), context);
        if (!flag1) goto _L11; else goto _L10
_L10:
        builder.setContentTitle(String.format(App.j.a(0x7f0d0018, a.size()), new Object[] {
            Integer.valueOf(a.size())
        }));
        context = new HashSet();
        obj = new StringBuilder();
        obj1 = Locale.getDefault().getLanguage();
        if (z[9].equals(obj1)) goto _L13; else goto _L12
_L12:
        flag = z[12].equals(obj1);
        if (flag) goto _L13; else goto _L14
_L14:
        try
        {
            flag = z[10].equals(obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag) goto _L15; else goto _L13
_L13:
        c1 = '\u060C';
_L39:
        obj1 = a.iterator();
_L17:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (c4)((Iterator) (obj1)).next();
        if (!context.add(((c4) (obj2)).y.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((StringBuilder) (obj)).length();
        byte byte0;
        byte byte1;
        byte byte2;
        int j;
        boolean flag3;
        if (i > 0)
        {
            try
            {
                ((StringBuilder) (obj)).append(c1);
                ((StringBuilder) (obj)).append(' ');
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        ((StringBuilder) (obj)).append(App.az.e(((c4) (obj2)).y.a).b());
        if (!flag1) goto _L17; else goto _L16
_L16:
        builder.setContentText(((StringBuilder) (obj)).toString());
_L11:
        context = new Intent(App.au, com/whatsapp/notification/MissedCallNotificationDismissedReceiver);
        builder.setDeleteIntent(PendingIntent.getBroadcast(App.au, 7, context, 0x8000000));
        context = new Intent(App.au, Main.g());
        context.setAction(z[7]);
        builder.setContentIntent(PendingIntent.getActivity(App.au, 0, context, 0x10000000));
        context = builder.build();
        NotificationManagerCompat.from(App.au).notify(7, context);
_L38:
        WidgetProvider.a(App.au);
_L3:
        return;
        context;
        throw context;
_L7:
        obj = ((SharedPreferences) (obj)).getString(z[1], "1");
        i = -1;
        try
        {
            j = ((String) (obj)).hashCode();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        byte0 = i;
        byte1 = i;
        byte2 = i;
        j;
        JVM INSTR tableswitch 48 51: default 1052
    //                   48 1273
    //                   49 1196
    //                   50 1219
    //                   51 1246;
           goto _L18 _L19 _L20 _L21 _L22
_L18:
        i;
        JVM INSTR tableswitch 0 2: default 1080
    //                   0 1087
    //                   1 1103
    //                   2 1149;
           goto _L23 _L24 _L25 _L26
_L23:
        obj = obj1;
          goto _L27
_L24:
        builder.setDefaults(2);
        obj = obj1;
        if (!flag1) goto _L27; else goto _L25
_L25:
        builder.setVibrate(new long[] {
            0L, 300L, 200L, 300L, 200L
        });
        obj = obj1;
        if (!flag1) goto _L27; else goto _L26
_L26:
        try
        {
            builder.setVibrate(new long[] {
                0L, 750L, 250L, 750L, 250L
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj = obj1;
          goto _L27
_L20:
        flag3 = ((String) (obj)).equals("1");
        if (!flag3) goto _L18; else goto _L28
_L28:
        if (!flag1) goto _L30; else goto _L29
_L29:
        byte0 = 0;
_L21:
        try
        {
            flag3 = ((String) (obj)).equals("2");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        i = byte0;
        if (!flag3) goto _L18; else goto _L31
_L31:
        if (!flag1) goto _L33; else goto _L32
_L32:
        byte1 = 1;
_L22:
        try
        {
            flag3 = ((String) (obj)).equals("3");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        i = byte1;
        if (!flag3) goto _L18; else goto _L34
_L34:
        if (!flag1) goto _L36; else goto _L35
_L35:
        byte2 = 2;
_L19:
        try
        {
            flag3 = ((String) (obj)).equals("0");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        i = byte2;
        if (flag3)
        {
            i = 3;
        }
          goto _L18
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
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
        catch (Context context) { }
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
        catch (Context context) { }
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        if (context.toString().contains(z[14])) goto _L38; else goto _L37
_L37:
        throw context;
        context;
        throw context;
_L15:
        c1 = ',';
          goto _L39
_L36:
        i = 2;
          goto _L18
_L33:
        i = 1;
          goto _L18
_L30:
        i = 0;
          goto _L18
    }

    public void a(c4 c4_1)
    {
        try
        {
            if (Voip.b(c4_1))
            {
                a(((Context) (App.au)), c4_1, Voip.a(c4_1));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
    }

    public void a(String s, long l1)
    {
    }

    public void b(c4 c4_1)
    {
        a(App.au, c4_1, false);
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        if (!a.isEmpty())
        {
            Log.i((new StringBuilder()).append(z[17]).append(a.size()).toString());
            App.au.getSharedPreferences(z[16], 0).edit().remove(z[18]).commit();
            a = new LinkedList();
            NotificationManagerCompat.from(App.au).cancel(7);
            App.au.ab().post(new a8(this));
            WidgetProvider.a(App.au);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(c4 c4_1)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[25];
        obj = "\025\031\tY";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L8:
label0:
        {
            if (i1 > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\025\031\tYR\000\021\007Gl\002\035:Yh\030\037\021]";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\025\027\b\033z\036\031\021Fl\006\b:E\177\023\036\000Gh\030\033\000F";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\034\021\001";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\033\021\026Fh\022\033\004Ya\030\027\021\\k\037\033\004Ad\031\026J@}\022\031\021P-\025\027\020[yL";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "V\033\n[y\023\033\021F7";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\020\n\nXN\027\024\t{b\002\021\003\\n\027\f\fZc";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\025\027\b\033z\036\031\021Fl\006\bK\\c\002\035\013A#\027\033\021\\b\030V&tA:+";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "V\t\020\\h\002B";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\027\n";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\003\n";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\020\n\nXN\027\024\t{b\002\021\003\\n\027\f\fZc";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\020\031";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                obj = "\030\027\021\\k\017'\027\\c\021\f\n[h";
                byte0 = 12;
                i = 13;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\027\026\001Gb\037\034KEh\004\025\fF~\037\027\013\033X&<$aH)95eR9(6j^\"91f";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\033\021\026Fh\022\033\004Ya\030\027\021\\k\037\033\004Ad\031\026J@}\022\031\021P-\025\031\013Vh\032X";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\025\027\b\033z\036\031\021Fl\006\b:E\177\023\036\000Gh\030\033\000F";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\033\021\026Fh\022\033\004Ya\030\027\021\\k\037\033\004Ad\031\026JVa\023\031\027\025";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\020\021\027Fy)\025\fF~\023\034:Vl\032\024";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "V\f\fXh\005\f\004X}L";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\025\027\b\033z\036\031\021Fl\006\b:E\177\023\036\000Gh\030\033\000F";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\033\021\026Fh\022\033\004Ya\030\027\021\\k\037\033\004Ad\031\026J\\c\037\fEVb\003\026\021\017";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\020\021\027Fy)\025\fF~\023\034:Vl\032\024";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\025\027\b\033z\036\031\021Fl\006\b:E\177\023\036\000Gh\030\033\000F";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\020\021\027Fy)\025\fF~\023\034:Vl\032\024";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                z = as;
                b = new l();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 640
    //                   0 663
    //                   1 670
    //                   2 677
    //                   3 684;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_684;
_L3:
        byte byte1 = 13;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 118;
          goto _L9
_L5:
        byte1 = 120;
          goto _L9
_L6:
        byte1 = 101;
          goto _L9
        byte1 = 53;
          goto _L9
    }
}
