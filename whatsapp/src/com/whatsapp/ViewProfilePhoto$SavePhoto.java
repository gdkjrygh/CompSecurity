// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.util.c1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            s0, App

public class  extends Activity
{

    private static final String z[];

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Uri)getIntent().getParcelableExtra(z[3]);
        Object obj = getIntent().getStringExtra(z[1]).replaceAll(z[2], "");
        SimpleDateFormat simpledateformat = new SimpleDateFormat(z[4], Locale.US);
        obj = new File(s0.b(), (new StringBuilder()).append(((String) (obj))).append(" ").append(simpledateformat.format(new Date())).append(z[0]).toString());
        try
        {
            c1.a(new File(bundle.getPath()), ((File) (obj)));
            c1.a(this, Uri.fromFile(((File) (obj))));
            App.b(getApplicationContext(), 0x7f0e02e0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            App.b(getApplicationContext(), 0x7f0e02d8, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            App.b(getApplicationContext(), 0x7f0e02d8, 1);
        }
        finish();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "(y\001)";
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
                obj = "hr\034+";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "],K\022:,1Mpi[";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "g}\025<zow_'{rv\037:;ck\005<t(@%\034PG^";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\177j\b7XKw\025\021]N~\034=f";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 21;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 6;
          goto _L9
_L5:
        byte1 = 19;
          goto _L9
_L6:
        byte1 = 113;
          goto _L9
        byte1 = 78;
          goto _L9
    }

    public ()
    {
    }
}
