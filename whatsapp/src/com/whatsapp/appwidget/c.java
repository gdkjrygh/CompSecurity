// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.whatsapp.App;
import com.whatsapp.k;
import com.whatsapp.notification.p;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.appwidget:
//            a, WidgetProvider

public class c
    implements android.widget.RemoteViewsService.RemoteViewsFactory
{

    private static final String z[];
    private final Context a;
    private ArrayList b;

    public c(Context context)
    {
        b = new ArrayList();
        a = context;
    }

    public int getCount()
    {
        return b.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public RemoteViews getLoadingView()
    {
        return null;
    }

    public RemoteViews getViewAt(int i)
    {
        if (i >= b.size())
        {
            return null;
        } else
        {
            RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300b9);
            com.whatsapp.appwidget.a a1 = (com.whatsapp.appwidget.a)b.get(i);
            remoteviews.setTextViewText(0x7f0b02ec, a1.b);
            remoteviews.setTextViewText(0x7f0b0115, a1.d);
            remoteviews.setTextViewText(0x7f0b015a, a1.c);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString(z[2], a1.a);
            intent.putExtras(bundle);
            remoteviews.setOnClickFillInIntent(0x7f0b02eb, intent);
            return remoteviews;
        }
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public void onCreate()
    {
        Log.i(z[3]);
        onDataSetChanged();
    }

    public void onDataSetChanged()
    {
        int i;
        long l;
        i = WidgetProvider.d;
        Log.i(z[0]);
        l = Binder.clearCallingIdentity();
        Object obj;
        obj = com.whatsapp.appwidget.WidgetProvider.a();
        b.clear();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)((Iterator) (obj)).next();
            com.whatsapp.appwidget.a a1 = new com.whatsapp.appwidget.a(null);
            og og1 = App.az.e(c4_1.y.a);
            a1.a = og1.a;
            a1.b = com.whatsapp.util.c.b(og1.a(a));
            a1.d = com.whatsapp.util.c.b(p.a(a, c4_1, og1, false, false));
            a1.c = q.k(a, App.q(c4_1));
            b.add(a1);
        } while (i == 0);
        Binder.restoreCallingIdentity(l);
        return;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

    public void onDestroy()
    {
        Log.i(z[1]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "1NQ]=2Q\\_/5ATY,)UL\0257(CTN95BAY0'IR_<";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "1NQ]=2Q\\_/5ATY,)UL\0257(CPI,4HL";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",NQ";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "1NQ]=2Q\\_/5ATY,)UL\0257(DG_92B";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 88;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 70;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 53;
          goto _L9
        byte0 = 58;
          goto _L9
    }
}
