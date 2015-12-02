// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.RemoteViews;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Main;
import com.whatsapp.abl;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.appwidget:
//            d, WidgetService, b

public class WidgetProvider extends AppWidgetProvider
{

    private static ArrayList a;
    private static Handler b;
    private static Runnable c;
    public static int d;
    private static final String z[];
    private b e;

    public WidgetProvider()
    {
    }

    static RemoteViews a(Context context, int i, int j, int k)
    {
        return b(context, i, j, k);
    }

    public static ArrayList a()
    {
        return a;
    }

    static ArrayList a(ArrayList arraylist)
    {
        a = arraylist;
        return arraylist;
    }

    public static void a(Context context)
    {
        if (context.getResources().getBoolean(0x7f080006))
        {
            AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
            int ai[];
            try
            {
                ai = appwidgetmanager.getAppWidgetIds(new ComponentName(context, com/whatsapp/appwidget/WidgetProvider));
            }
            catch (RuntimeException runtimeexception)
            {
                Log.e((new StringBuilder()).append(z[9]).append(runtimeexception.toString()).toString());
                runtimeexception = null;
            }
            if (ai != null)
            {
                int i;
                boolean flag;
                try
                {
                    i = ai.length;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (i > 0)
                {
                    Intent intent = new Intent(context, com/whatsapp/appwidget/WidgetProvider);
                    intent.setAction(z[8]);
                    intent.putExtra(z[7], ai);
                    context.sendBroadcast(intent);
                }
            }
        }
        flag = z[10].equals(Build.MANUFACTURER);
        if (flag)
        {
            try
            {
                if (c == null)
                {
                    c = new d(context.getPackageName(), null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            b().removeCallbacks(c);
            b().post(c);
        }
        return;
        context;
        throw context;
    }

    private static boolean a(int i, int j)
    {
        return i > 100 && j > 100;
    }

    private static Handler b()
    {
        if (b == null)
        {
            HandlerThread handlerthread = new HandlerThread(z[3], 10);
            handlerthread.start();
            b = new Handler(handlerthread.getLooper());
        }
        return b;
    }

    private static RemoteViews b(Context context, int i, int j, int k)
    {
        RemoteViews remoteviews;
label0:
        {
label1:
            {
                {
                    int l = d;
                    if (!a(j, k))
                    {
                        break label0;
                    }
                    remoteviews = new RemoteViews(context.getPackageName(), 0x7f0300b8);
                    Object obj = "";
                    float f;
                    float f1;
                    try
                    {
                        if (a == null)
                        {
                            break label1;
                        }
                        k = a.size();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        throw context;
                    }
                }
                if (k > 0)
                {
                    obj = String.format(App.j.a(0x7f0d002c, a.size()), new Object[] {
                        Integer.valueOf(a.size())
                    });
                    remoteviews.setViewVisibility(0x7f0b02e8, 0);
                    if (l == 0)
                    {
                        break label1;
                    }
                }
                obj = context.getString(0x7f0e02b3);
                remoteviews.setViewVisibility(0x7f0b02e8, 8);
            }
            remoteviews.setTextViewText(0x7f0b02e8, ((CharSequence) (obj)));
            obj = new Intent(context, com/whatsapp/appwidget/WidgetService);
            ((Intent) (obj)).putExtra(z[2], i);
            ((Intent) (obj)).setData(Uri.parse(((Intent) (obj)).toUri(1)));
            remoteviews.setRemoteAdapter(i, 0x7f0b02e9, ((Intent) (obj)));
            obj = new Intent(context, com/whatsapp/Conversation);
            ((Intent) (obj)).setAction(z[1]);
            remoteviews.setPendingIntentTemplate(0x7f0b02e9, PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x8000000));
            remoteviews.setOnClickPendingIntent(0x7f0b00b9, PendingIntent.getActivity(context, 0, new Intent(context, Main.g()), 0x8000000));
            remoteviews.setEmptyView(0x7f0b02e9, 0x7f0b02ea);
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_398;
            }
        }
label2:
        {
label3:
            {
                obj = new RemoteViews(context.getPackageName(), 0x7f0300ba);
                if (a == null)
                {
                    break label2;
                }
                i = a.size();
                ((RemoteViews) (obj)).setTextViewText(0x7f0b00de, Integer.toString(i));
                f1 = 30F;
                f = f1;
                if (j >= 100)
                {
                    break label3;
                }
                f = f1;
                if (i > 99)
                {
                    f1 = 14F;
                    f = f1;
                    if (l == 0)
                    {
                        break label3;
                    }
                    f = f1;
                }
                if (i > 9)
                {
                    f = 20F;
                }
            }
            ((RemoteViews) (obj)).setFloat(0x7f0b00de, z[0], f);
        }
        ((RemoteViews) (obj)).setOnClickPendingIntent(0x7f0b00b9, PendingIntent.getActivity(context, 0, new Intent(context, Main.g()), 0x8000000));
        return ((RemoteViews) (obj));
        return remoteviews;
    }

    static boolean b(int i, int j)
    {
        return a(i, j);
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appwidgetmanager, int i, Bundle bundle)
    {
        int k = 0x7fffffff;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            int j;
            if (bundle != null)
            {
                int l = bundle.getInt(z[5]);
                j = bundle.getInt(z[4]);
                try
                {
                    Log.i((new StringBuilder()).append(z[6]).append(l).append("x").append(j).toString());
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (l == 0 || j == 0)
                {
                    j = 0x7fffffff;
                } else
                {
                    k = l;
                }
            } else
            {
                j = 0x7fffffff;
            }
            appwidgetmanager.updateAppWidget(i, b(context, i, k, j));
        }
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, int ai[])
    {
        int i = d;
        try
        {
            Log.i((new StringBuilder()).append(z[11]).append(ai.length).toString());
            if (e != null)
            {
                e.a();
                b().removeCallbacks(e);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        e = new b(context, appwidgetmanager, ai);
        b().post(e);
        super.onUpdate(context, appwidgetmanager, ai);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "_w)5nTf\016\bqI";
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
                obj = "M|9\023dEvs\beXw3\025%Mq)\bdB<\013(N{";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Mb-6bHu8\025BH";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Yb9\000\177IM*\boKw)";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Mb-6bHu8\025FE|\025\004bKz)";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Mb-6bHu8\025FE|\n\boXz";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "[{9\006nXb/\016}Ev8\023$C|<\021{[{9\006nX}-\025bC|.\002cM|:\004o\f";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "Mb-6bHu8\025BHa";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "M|9\023dEvs\000{\\e4\005lIfs\000hX{2\017%mB\r6BhU\0305TyB\031 _i";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "[{9\006nXb/\016}Ev8\023$Kw) {\\E4\005lIf\024\005x\ft<\bgIv";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "_s0\022~Bu";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "[{9\006nXb/\016}Ev8\023$Yb9\000\177I2";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 11;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 44;
          goto _L9
_L5:
        byte1 = 18;
          goto _L9
_L6:
        byte1 = 93;
          goto _L9
        byte1 = 97;
          goto _L9
    }
}
