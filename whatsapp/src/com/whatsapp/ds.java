// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            DescribeProblemActivity

class ds
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final DescribeProblemActivity a;
    final int b;

    ds(DescribeProblemActivity describeproblemactivity, int i)
    {
        a = describeproblemactivity;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(z[0], android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        view.setType(z[3]);
        view = Intent.createChooser(view, null);
        if (DescribeProblemActivity.d(a)[b] != null)
        {
            view.putExtra(z[2], new Intent[] {
                new Intent(z[1], null)
            });
        }
        a.startActivityForResult(view, b + 1);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = ":!'\\e2+mGd/*-Z$:,7Ge5a\023gI\020";
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
                obj = "8 .\000}3.7]k+?mGd/*-Z$:,7Ge5a\021kG\024\031\006qY\030\035\006kD\b\007\fz";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ":!'\\e2+mGd/*-Z$>77\\ku\006\rg^\022\016\017qC\025\033\006`^\b";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "2\"\"Iote";
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
        char c = obj[j];
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
        byte byte0 = 10;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 91;
          goto _L9
_L5:
        byte0 = 79;
          goto _L9
_L6:
        byte0 = 67;
          goto _L9
        byte0 = 46;
          goto _L9
    }
}
