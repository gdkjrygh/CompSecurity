// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import java.text.Collator;
import java.util.Comparator;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, GalleryPicker

class bd
    implements Comparator
{

    private static final String z[];
    final GalleryPicker a;

    bd(GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }

    public int a(java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        int i;
label0:
        {
label1:
            {
label2:
                {
                    byte byte0 = -1;
                    int j = ImagePreview.B;
                    Collator collator = Collator.getInstance();
                    collator.setStrength(0);
                    collator.setDecomposition(1);
                    i = collator.compare((String)entry.getValue(), (String)entry1.getValue());
                    if (i == 0)
                    {
                        break label0;
                    }
                    if (z[3].equals(entry.getValue()))
                    {
                        i = byte0;
                        if (j == 0)
                        {
                            break label2;
                        }
                        i = -1;
                    }
                    if (z[0].equals(entry1.getValue()))
                    {
                        if (j == 0)
                        {
                            break label1;
                        }
                        i = 1;
                    }
                    if (z[2].equals(entry.getValue()))
                    {
                        i = byte0;
                        if (j == 0)
                        {
                            break label2;
                        }
                        i = byte0;
                    }
                    if (z[1].equals(entry1.getValue()))
                    {
                        i = 1;
                    }
                }
                return i;
            }
            return 1;
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((java.util.Map.Entry)obj, (java.util.Map.Entry)obj1);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "t(`\006hb0qRRN!f\027h";
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
                obj = "t(`\006hb0qRMJ$d\035";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "t(`\006hb0qRMJ$d\035";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "t(`\006hb0qRRN!f\027h";
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
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 27;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 35;
          goto _L9
_L5:
        byte0 = 64;
          goto _L9
_L6:
        byte0 = 1;
          goto _L9
        byte0 = 114;
          goto _L9
    }
}
