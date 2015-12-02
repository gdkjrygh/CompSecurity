// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Environment;
import android.view.View;
import com.whatsapp.util.az;
import com.whatsapp.util.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.whatsapp:
//            App, Advanced

class akh
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Advanced a;

    akh(Advanced advanced)
    {
        a = advanced;
        super();
    }

    public void onClick(View view)
    {
        Object obj;
        FileChannel filechannel = null;
        view = null;
        App.q(z[4]);
        if (!Environment.getExternalStorageState().equals(z[5]))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        File file = new File(new File(a.getFilesDir(), z[1]), z[2]);
        try
        {
            if (!App.aK.exists())
            {
                App.aK.mkdirs();
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        obj = new File(App.aK, z[0]);
        obj = Channels.newChannel(new az(App.b, ((File) (obj))));
        view = filechannel;
        filechannel = (new FileInputStream(file)).getChannel();
        view = filechannel;
        l.a(filechannel, ((WritableByteChannel) (obj)));
        if (filechannel == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        filechannel.close();
        if (obj != null)
        {
            try
            {
                ((WritableByteChannel) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                try
                {
                    throw view;
                }
                // Misplaced declaration of an exception variable
                catch (View view) { }
            }
        }
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        App.q(z[3]);
        return;
        Exception exception;
        exception;
        obj = null;
_L2:
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        view.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        ((WritableByteChannel) (obj)).close();
        throw exception;
        view;
        throw view;
        view;
        throw view;
        view;
        throw view;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "1N3N\002'V\"\024\035)A";
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
                obj = "\nI5I";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "1N3N\002'V\"\024\035)A";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\025brY\0204BrT\0362\0063L\020/J3X\035#\t _\020\"_";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "%I\"CQ*I5\032\005)\006\001~Q%G ^";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "+I'T\005#B";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 113;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 70;
          goto _L9
_L5:
        byte1 = 38;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 58;
          goto _L9
    }
}
