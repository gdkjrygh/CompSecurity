// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.wallpaper:
//            WallpaperPicker, ImageViewTouchBase

class a extends BaseAdapter
{

    private static final String z[];
    final WallpaperPicker a;
    private LayoutInflater b;

    a(WallpaperPicker wallpaperpicker, WallpaperPicker wallpaperpicker1)
    {
        a = wallpaperpicker;
        super();
        b = wallpaperpicker1.getLayoutInflater();
    }

    public int getCount()
    {
        return WallpaperPicker.b(a).size();
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = ImageViewTouchBase.e;
        if (view != null) goto _L2; else goto _L1
_L1:
        viewgroup = (ImageView)b.inflate(0x7f0300b1, viewgroup, false);
        if (!flag) goto _L3; else goto _L2
_L2:
        view = (ImageView)view;
_L5:
label0:
        {
            int j = ((Integer)WallpaperPicker.b(a).get(i)).intValue();
            view.setImageDrawable(a.h.getDrawable(j));
            viewgroup = view.getDrawable();
            if (viewgroup != null)
            {
                viewgroup.setDither(true);
                if (!flag)
                {
                    break label0;
                }
            }
            Log.e((new StringBuilder()).append(z[1]).append(j).append(z[0]).append(i).toString());
        }
        return view;
_L3:
        view = viewgroup;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\0053\t\004=R4\n\032mD%\003\004=\006";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "`'\024\031o\0051\003\025rA<\b\021=Q=\023\033\177K4\017\032=W0\025?y\030";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 29;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 37;
          goto _L9
_L5:
        byte0 = 85;
          goto _L9
_L6:
        byte0 = 102;
          goto _L9
        byte0 = 118;
          goto _L9
    }
}
