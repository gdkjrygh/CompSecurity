// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            z, ImagePreview, r

class as
{

    private static final String z[];
    public z a;
    public boolean b;
    public android.graphics.BitmapFactory.Options c;

    private as()
    {
        a = z.ALLOW;
    }

    as(r r)
    {
        this();
    }

    public String toString()
    {
        String s;
label0:
        {
            int i = ImagePreview.B;
            if (a == z.CANCEL)
            {
                s = z[1];
                if (i == 0)
                {
                    break label0;
                }
            }
            if (a == z.ALLOW)
            {
                s = z[2];
                if (i == 0)
                {
                    break label0;
                }
            }
            s = "?";
        }
        return (new StringBuilder()).append(z[3]).append(s).append(z[0]).append(c).toString();
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte1;
        int i;
        as1 = new String[4];
        obj = "br\020fU'=\021e\001sr";
        byte1 = -1;
        i = 0;
_L2:
        String as2[];
        int j;
        int k;
        as2 = as1;
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
                as2[i] = ((String) (obj));
                obj = "\r3\021uD\"";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "\017>\023yV";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                i = 3;
                obj = "::\rs@*r\fb@:7_+\001";
                byte1 = 2;
                break;

            case 2: // '\002'
                as2[i] = ((String) (obj));
                z = as1;
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
        byte byte0 = 33;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 78;
          goto _L9
_L5:
        byte0 = 82;
          goto _L9
_L6:
        byte0 = 127;
          goto _L9
        byte0 = 22;
          goto _L9
    }
}
