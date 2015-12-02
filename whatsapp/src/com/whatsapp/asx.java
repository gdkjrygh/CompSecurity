// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.location.Location;
import android.text.Html;
import android.widget.Button;
import com.google.android.maps.MapView;

// Referenced classes of package com.whatsapp:
//            asq, App, abl, LocationPicker, 
//            t3, vg

class asx extends asq
{

    private static final String z[];
    final LocationPicker h;
    private int i;

    asx(LocationPicker locationpicker, Context context, MapView mapview)
    {
        h = locationpicker;
        super(context, mapview);
        i = -1;
    }

    public void onLocationChanged(Location location)
    {
label0:
        {
            int j;
            int k;
label1:
            {
                k = App.am;
                super.onLocationChanged(location);
                if (location == null)
                {
                    break label0;
                }
                if (location.hasAccuracy())
                {
                    j = Math.max(1, (int)location.getAccuracy());
                    if (k == 0)
                    {
                        break label1;
                    }
                }
                j = -1;
            }
label2:
            {
                if (j == i)
                {
                    break label2;
                }
                i = j;
                if (j > 0)
                {
                    String s = String.format(App.j.a(0x7f0d0013, j), new Object[] {
                        Integer.valueOf(j)
                    });
                    LocationPicker.f(h).setText(Html.fromHtml((new StringBuilder()).append(z[2]).append(h.getString(0x7f0e037a)).append(z[4]).append(s).append(z[3]).toString()));
                    if (k == 0)
                    {
                        break label2;
                    }
                }
                LocationPicker.f(h).setText(Html.fromHtml((new StringBuilder()).append(z[1]).append(h.getString(0x7f0e037a)).append(z[0]).toString()));
            }
            boolean flag;
            if (LocationPicker.n(h) != null && LocationPicker.n(h).l != null && LocationPicker.c(h) && location.getAccuracy() < 200F && LocationPicker.n(h).l.distanceTo(location) > 1000F)
            {
                LocationPicker.b(h, false);
                flag = true;
            } else
            {
                flag = false;
            }
            LocationPicker.a(h, location);
            if ((LocationPicker.n(h) == null || flag) && (location.getAccuracy() < 200F && location.getTime() + 60000L > System.currentTimeMillis() || LocationPicker.l(h)))
            {
                h.runOnUiThread(new vg(this, flag, location));
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[5];
        obj = "\rM2\030";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\r\000n";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\r\000n";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "\rM6IhE\\l\tu\\\003<J8";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "\rM2\030:S\020\177\030:B\0171Jj\017^6IhEB3Ij^\020m\001%\007Tf\0200\007En";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 6;
_L9:
        obj[k] = (char)(byte1 ^ c);
        k++;
          goto _L8
_L4:
        byte1 = 49;
          goto _L9
_L5:
        byte1 = 98;
          goto _L9
_L6:
        byte1 = 80;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
