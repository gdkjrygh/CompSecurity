// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class bw
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final ImagePreview a;

    bw(ImagePreview imagepreview)
    {
        a = imagepreview;
        super();
    }

    public void onClick(View view)
    {
        int i = ImagePreview.B;
        Intent intent = new Intent();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ImagePreview.s(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Uri)iterator.next();
            Integer integer = (Integer)ImagePreview.o(a).get(obj);
            String s = (String)ImagePreview.k(a).get(obj);
            view = ((View) (obj));
            if (ImagePreview.h(a).containsKey(obj))
            {
                view = (Uri)ImagePreview.h(a).get(obj);
            }
            obj = view;
            if (view.getQueryParameter(z[2]) != null)
            {
                obj = view.buildUpon().query(null).build();
            }
            view = ((View) (obj));
            if (integer != null)
            {
                view = ((Uri) (obj)).buildUpon().appendQueryParameter(z[0], integer.toString()).build();
            }
            obj = view;
            if (s != null)
            {
                obj = view.buildUpon().appendQueryParameter(z[1], c.a(s)).build();
            }
            arraylist.add(obj);
        } while (i == 0);
        intent.putParcelableArrayListExtra(z[3], arraylist);
        a.setResult(-1, intent);
        ImagePreview.q(a);
        a.finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\r-w\ri\026-m";
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
                obj = "\034#s\030t\020,";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\034#s\030t\020,";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\036,g\036r\026&-\005s\013'm\0303\032:w\036|Q\021W>X>\017";
                i = 3;
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
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 29;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 127;
          goto _L9
_L5:
        byte0 = 66;
          goto _L9
_L6:
        byte0 = 3;
          goto _L9
        byte0 = 108;
          goto _L9
    }
}
