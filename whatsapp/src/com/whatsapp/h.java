// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, aoz, Broadcasts, abd, 
//            k, og, abl, iz

class h extends CursorAdapter
{

    private static final String z[];
    final Broadcasts a;

    public h(Broadcasts broadcasts)
    {
        a = broadcasts;
        super(broadcasts, App.ah.K());
    }

    public void a()
    {
        changeCursor(App.ah.K());
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        Object obj;
        int i1;
        i1 = App.am;
        cursor = App.ah.a(cursor, z[0]);
        view.setTag(cursor);
        obj = (TextView)view.findViewById(0x7f0b01a3);
        context = "";
        ((c4) (cursor)).w;
        JVM INSTR tableswitch 0 5: default 80
    //                   0 925
    //                   1 935
    //                   2 951
    //                   3 967
    //                   4 999
    //                   5 983;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        ((TextView) (obj)).setText(c.c(context, a.getBaseContext()));
        ((ImageView)view.findViewById(0x7f0b01a0)).setVisibility(8);
        ((TextView)view.findViewById(0x7f0b019f)).setText((new StringBuilder()).append(q.k(a, com.whatsapp.App.q(cursor))).append(" ").toString());
        if (((c4) (cursor)).G == null) goto _L9; else goto _L8
_L8:
        context = ((c4) (cursor)).G.split(",");
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        context = new String[0];
        Log.e(z[1]);
_L10:
        Object obj1;
        String s;
        int i;
        int j1 = context.length;
        i = 0;
        int l = 0;
        int j;
        do
        {
            j = i;
            if (l >= j1)
            {
                break;
            }
            obj = context[l];
            obj = App.ah.a(new a(((String) (obj)), true, ((c4) (cursor)).y.c));
            j = i;
            if (obj != null)
            {
                j = i;
                if (bg.a(((c4) (obj)).M, 5) >= 0)
                {
                    j = i + 1;
                }
            }
            l++;
            i = j;
        } while (i1 == 0);
        obj = (ImageView)view.findViewById(0x7f0b00ce);
        obj1 = a;
        float f;
        ArrayList arraylist;
        TextView textview;
        Iterator iterator;
        if (((c4) (cursor)).m == 0)
        {
            i = context.length;
        } else
        {
            i = ((c4) (cursor)).m;
        }
        ((ImageView) (obj)).setImageDrawable(new abd(((Broadcasts) (obj1)), j, i));
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(a.getWindow().getDecorView().getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
        cursor = view.findViewById(0x7f0b019d);
        j = (cursor.getMeasuredWidth() - cursor.getPaddingRight()) + cursor.getPaddingLeft();
        arraylist = new ArrayList();
        cursor = new ArrayList();
        obj = new ArrayList();
        l = context.length;
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= l)
                {
                    break label0;
                }
                obj1 = context[i];
                obj1 = App.az.e(((String) (obj1)));
                ((ArrayList) (obj)).add(obj1);
                if (((og) (obj1)).z == null)
                {
                    cursor.add(((og) (obj1)).a());
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                if (!TextUtils.isEmpty(((og) (obj1)).P))
                {
                    arraylist.add(((og) (obj1)).P);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                if (!TextUtils.isEmpty(((og) (obj1)).n))
                {
                    arraylist.add(((og) (obj1)).n);
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                cursor.add(((og) (obj1)).a());
            }
            i++;
        } while (i1 == 0);
        Collections.sort(arraylist);
        Collections.sort(cursor);
        arraylist.addAll(cursor);
        textview = (TextView)view.findViewById(0x7f0b019e);
        iterator = arraylist.iterator();
        i = 0;
        cursor = "";
        obj1 = "";
_L23:
        context = cursor;
        if (!iterator.hasNext()) goto _L12; else goto _L11
_L11:
        s = (String)iterator.next();
        f = textview.getPaint().measureText((new StringBuilder()).append(cursor).append(z[3]).append(s).toString());
        obj = obj1;
        if (cursor.length() != 0)
        {
            l = arraylist.size() - i;
            context = String.format(App.j.a(0x7f0d0006, l), new Object[] {
                cursor, Integer.valueOf(l)
            });
            obj = obj1;
            if (textview.getPaint().measureText(context) < (float)j)
            {
                obj = context;
            }
        }
        context = cursor;
        if (f <= (float)j) goto _L14; else goto _L13
_L13:
        if (cursor.length() != 0) goto _L16; else goto _L15
_L15:
        if (arraylist.size() == 1 && i1 == 0) goto _L18; else goto _L17
_L17:
        context = String.format(App.j.a(0x7f0d0005, arraylist.size()), new Object[] {
            Integer.valueOf(arraylist.size())
        });
        if (i1 == 0) goto _L12; else goto _L16
_L16:
        if (((String) (obj)).length() > 0 && i1 == 0) goto _L20; else goto _L19
_L19:
        cursor = String.format(App.j.a(0x7f0d0005, arraylist.size()), new Object[] {
            Integer.valueOf(arraylist.size())
        });
        context = cursor;
        if (i1 == 0) goto _L12; else goto _L21
_L21:
        context = cursor;
_L14:
        cursor = context;
        if (context.length() > 0)
        {
            cursor = (new StringBuilder()).append(context).append(z[2]).toString();
        }
        context = (new StringBuilder()).append(cursor).append(s).toString();
        if (i1 == 0) goto _L22; else goto _L12
_L12:
        textview.setText(context);
        view.findViewById(0x7f0b01a7).setVisibility(8);
        return;
_L2:
        context = cursor.e();
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        context = a.getString(0x7f0e00fd);
        if (i1 == 0) goto _L1; else goto _L4
_L4:
        context = a.getString(0x7f0e00f7);
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        context = a.getString(0x7f0e0100);
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        context = a.getString(0x7f0e00fe);
        if (i1 == 0) goto _L1; else goto _L6
_L6:
        context = a.getString(0x7f0e00fc);
          goto _L1
_L18:
        context = s;
          goto _L12
_L22:
        i++;
        cursor = context;
        obj1 = obj;
          goto _L23
_L20:
        context = ((Context) (obj));
          goto _L12
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return com.whatsapp.iz.a(a.getLayoutInflater(), 0x7f030057, viewgroup, false);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "ehpcCd{lv";
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
                obj = "ehpcCd{lvT(xvlCqszu\bu\177rmSbEmgThomaB'tjnK";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "+:";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "+:";
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
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 7;
          goto _L9
_L5:
        byte0 = 26;
          goto _L9
_L6:
        byte0 = 31;
          goto _L9
        byte0 = 2;
          goto _L9
    }
}
