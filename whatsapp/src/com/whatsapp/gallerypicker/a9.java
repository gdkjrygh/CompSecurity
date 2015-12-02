// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.util.Log;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, ImageGallery, ai, t, 
//            at

class a9
    implements android.widget.AdapterView.OnItemLongClickListener
{

    private static final String z[];
    final ImageGallery a;

    a9(ImageGallery imagegallery)
    {
        a = imagegallery;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            int j = ImagePreview.B;
            adapterview = ImageGallery.a(a).a(i);
            if (adapterview != null)
            {
                if (ImageGallery.i(a) != null)
                {
                    ImageGallery.a(a, adapterview);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                ImageGallery.l(a).add(adapterview.a());
                ImageGallery.a(a, a.startActionMode(ImageGallery.g(a)));
                ImageGallery.c(a).notifyDataSetChanged();
                if (j == 0)
                {
                    break label0;
                }
            }
            Log.e((new StringBuilder()).append(z[0]).append(i).append(z[1]).append(ImageGallery.e(a)).toString());
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "ZpW+&T|Z &Ad\031%7VpZ#-T~Z% X2\026<,@tB%,]'";
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
                obj = "\023~Y9-G'";
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
        byte byte0 = 67;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 51;
          goto _L9
_L5:
        byte0 = 29;
          goto _L9
_L6:
        byte0 = 54;
          goto _L9
        byte0 = 76;
          goto _L9
    }
}
