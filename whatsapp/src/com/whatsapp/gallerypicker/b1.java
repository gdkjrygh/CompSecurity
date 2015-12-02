// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class b1
    implements com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener
{

    private static final String z[];
    final GalleryPicker a;
    final Intent b;
    final ResolveInfo c;

    b1(GalleryPicker gallerypicker, ResolveInfo resolveinfo, Intent intent)
    {
        a = gallerypicker;
        c = resolveinfo;
        b = intent;
        super();
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        a.getSharedPreferences(z[1], 0).edit().putString((new StringBuilder()).append(z[0]).append(GalleryPicker.d(a)).toString(), (new StringBuilder()).append(c.activityInfo.packageName).append("_").append(c.activityInfo.name).toString()).commit();
        b.setComponent(new ComponentName(c.activityInfo.packageName, c.activityInfo.name));
        a.startActivityForResult(b, 1);
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "-DAz28\\";
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
                obj = ")J@8 \"DYe6:Urf%/CHd2$FHe";
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
        char c1 = obj[j];
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
        byte byte0 = 87;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 74;
          goto _L9
_L5:
        byte0 = 37;
          goto _L9
_L6:
        byte0 = 45;
          goto _L9
        byte0 = 22;
          goto _L9
    }
}
