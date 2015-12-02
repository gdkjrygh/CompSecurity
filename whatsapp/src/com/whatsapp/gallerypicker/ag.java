// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker, ImagePreview, a4, ImageGallery, 
//            t

class ag
{

    private static final String z[];
    public final int a;
    public final int b;
    final GalleryPicker c;
    public final String d;
    public final t e;
    public final String f;

    public ag(GalleryPicker gallerypicker, int i, int j, String s, String s1, t t, int k)
    {
        c = gallerypicker;
        super();
        a = i;
        d = s;
        f = s1;
        e = t;
        b = k;
    }

    public String a()
    {
        return (new StringBuilder()).append(a).append("-").append(d).append("-").append(GalleryPicker.d(c)).toString();
    }

    public void a(Activity activity)
    {
        Object obj;
        int i;
label0:
        {
            i = ImagePreview.B;
            if (a != 6)
            {
                Uri uri = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                obj = uri;
                if (!b())
                {
                    break label0;
                }
                obj = uri.buildUpon().appendQueryParameter(z[0], d).build();
                if (i == 0)
                {
                    break label0;
                }
            }
            obj = a4.i.buildUpon().appendQueryParameter(z[7], d).build();
        }
label1:
        {
            obj = new Intent(z[10], ((Uri) (obj)));
            ((Intent) (obj)).putExtra(z[9], f);
            ((Intent) (obj)).putExtra(z[13], d() & GalleryPicker.d(c));
            ((Intent) (obj)).putExtra(z[11], c.getIntent().getStringExtra(z[15]));
            ((Intent) (obj)).putExtra(z[14], c.getIntent().getStringExtra(z[3]));
            ((Intent) (obj)).putExtra(z[6], c.getIntent().getStringExtra(z[5]));
            ((Intent) (obj)).putExtra(z[8], c.getIntent().getLongExtra(z[4], 0x7fffffffffffffffL));
            if ((d() & GalleryPicker.d(c)) == 1)
            {
                ((Intent) (obj)).putExtra(z[12], c.getIntent().getIntExtra(z[1], 0x7fffffff));
                if (i == 0)
                {
                    break label1;
                }
            }
            ((Intent) (obj)).putExtra(z[2], 1);
        }
        ((Intent) (obj)).setClass(activity, com/whatsapp/gallerypicker/ImageGallery);
        activity.startActivityForResult(((Intent) (obj)), 0);
    }

    public boolean b()
    {
        return a >= 2;
    }

    public int c()
    {
        switch (a)
        {
        case 5: // '\005'
        default:
            return 0x7f0204ed;

        case 0: // '\0'
        case 2: // '\002'
            return 0x7f0204ec;

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
            return 0x7f0204ee;

        case 6: // '\006'
            return 0x7f0204ef;
        }
    }

    public int d()
    {
        switch (a)
        {
        default:
            return 5;

        case 0: // '\0'
        case 2: // '\002'
            return 1;

        case 1: // '\001'
        case 3: // '\003'
            return 4;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[16];
        obj = "ZV\021rTLj\026";
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
                obj = "UB\nFXLF\037j";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "UB\nFXLF\037j";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "NF\000{";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "UB\nFGQG\027vnKJ\b|";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "JF\021pAQF\034m";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "JF\021pAQF\034m";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "ZV\021rTLj\026";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "UB\nFGQG\027vnKJ\b|";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "OJ\034}^Ow\033m]]";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "YM\026k^QG\\p_LF\034m\037Y@\006p^V\r$Pto";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "HQ\027oX]T";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "UB\nFXLF\037j";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "QM\021uD\\F-tT\\J\023";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "NF\000{";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "HQ\027oX]T";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 432
    //                   0 455
    //                   1 462
    //                   2 469
    //                   3 476;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_476;
_L3:
        byte byte1 = 49;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 56;
          goto _L9
_L5:
        byte1 = 35;
          goto _L9
_L6:
        byte1 = 114;
          goto _L9
        byte1 = 25;
          goto _L9
    }
}
