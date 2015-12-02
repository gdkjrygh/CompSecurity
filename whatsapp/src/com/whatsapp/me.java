// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.view.View;
import com.whatsapp.contact.ContactProvider;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, aoz, Conversation, Advanced

class me
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Advanced a;

    me(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        App.q(z[0]);
        try
        {
            App.ah.a(false, false, false);
            Conversation.i();
            view = new ContentValues();
            view.put(z[1], (new File(new File(App.aK, z[3]), z[2])).getAbsolutePath());
            a.getContentResolver().insert(ContactProvider.c, view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\bH\tmM\032\t\016dK";
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
                obj = "\032H\036n";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\035HDbZ";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = ".H\036gZ\013Z\017u";
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
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 106;
          goto _L9
_L5:
        byte0 = 41;
          goto _L9
_L6:
        byte0 = 106;
          goto _L9
        byte0 = 6;
          goto _L9
    }
}
