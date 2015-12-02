// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, k, og, abl, 
//            MediaData, iz, p_, ur, 
//            a8f, hd

public class zj
{

    private static final String z[];

    public static Dialog a(Activity activity, Collection collection, String s, int i, hd hd)
    {
        Object obj2;
        int j;
        j = App.am;
        if (collection == null || collection.isEmpty())
        {
            Log.e(z[0]);
            return null;
        }
        obj2 = App.az.e(s);
        if (collection.size() != 1) goto _L2; else goto _L1
_L1:
        Object obj1 = (c4)collection.iterator().next();
        if (!((c4) (obj1)).y.b) goto _L4; else goto _L3
_L3:
        Object obj = activity.getResources().getString(0x7f0e0126);
        if (j == 0) goto _L5; else goto _L4
_L4:
        if (!((og) (obj2)).k()) goto _L7; else goto _L6
_L6:
        if (((c4) (obj1)).G == null) goto _L9; else goto _L8
_L8:
        obj = App.az.e(((c4) (obj1)).G);
        View view;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            obj1 = ((og) (obj)).a(activity);
        } else
        {
            obj1 = "";
        }
        obj = obj1;
        if (j == 0) goto _L11; else goto _L10
_L10:
        obj = obj1;
        if (obj2 != null)
        {
            obj = obj1;
            if (((og) (obj2)).a(activity) != null)
            {
                obj = ((og) (obj2)).a(activity);
            }
        }
_L11:
        obj = activity.getResources().getString(0x7f0e0125, new Object[] {
            obj
        });
_L5:
        if (j == 0) goto _L12; else goto _L2
_L2:
        obj = String.format(App.j.a(0x7f0d000c, collection.size()), new Object[] {
            Integer.valueOf(collection.size())
        });
_L12:
        obj1 = collection.iterator();
        flag = false;
_L16:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (c4)((Iterator) (obj1)).next();
        if (((c4) (obj2)).w != 1 && ((c4) (obj2)).w != 3 && (((c4) (obj2)).w != 2 || ((c4) (obj2)).n == 1) || ((c4) (obj2)).B == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = (MediaData)((c4) (obj2)).B;
        if (((MediaData) (obj2)).file == null || !((MediaData) (obj2)).file.exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L14; else goto _L13
_L13:
        flag = true;
        if (j == 0) goto _L16; else goto _L15
_L15:
        obj2 = new android.app.AlertDialog.Builder(activity);
        if (!flag) goto _L18; else goto _L17
_L17:
        view = com.whatsapp.iz.a(activity.getLayoutInflater(), 0x7f03005e, null, false);
        obj1 = (CheckBox)view.findViewById(0x7f0b01b6);
        flag1 = App.au.getSharedPreferences(z[1], 0).getBoolean(z[2], true);
        ((CheckBox) (obj1)).setChecked(flag1);
        ((TextView)view.findViewById(0x7f0b01b5)).setText(((CharSequence) (obj)));
        ((android.app.AlertDialog.Builder) (obj2)).setView(view);
        if (j == 0) goto _L19; else goto _L18
_L18:
        ((android.app.AlertDialog.Builder) (obj2)).setMessage(c.b(((String) (obj)), activity.getBaseContext()));
        flag1 = false;
        obj = null;
_L20:
        return ((android.app.AlertDialog.Builder) (obj2)).setCancelable(true).setPositiveButton(0x7f0e010e, new p_(activity, i, ((CheckBox) (obj)), flag1, s, collection, hd)).setNegativeButton(0x7f0e007b, new ur(activity, i)).setOnCancelListener(new a8f(activity, i)).create();
_L19:
        obj = obj1;
        if (true) goto _L20; else goto _L14
_L14:
        flag = true;
        if (true) goto _L15; else goto _L9
_L9:
        obj = "";
        if (true) goto _L11; else goto _L7
_L7:
        obj1 = "";
        if (true) goto _L10; else goto _L21
_L21:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = ".\023J\004.-UO\r-/\016NH/%ZF\r29\033L\r2";
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
                obj = ")\025FF6\"\033_\033 :\nt\0303/\034N\032$$\031N\033";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = ":\bN\016\036.\037G\r5/%F\r%#\033";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 65;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 74;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 43;
          goto _L9
        byte0 = 104;
          goto _L9
    }
}
