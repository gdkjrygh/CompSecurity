// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;

// Referenced classes of package com.whatsapp.messaging:
//            h

public final class aw
{

    private static String a;
    private static boolean b;
    private static final String z[];

    private static File a(Context context)
    {
        return new File(context.getFilesDir(), z[0]);
    }

    private static String a(File file)
    {
        com/whatsapp/messaging/aw;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        file = a;
_L4:
        com/whatsapp/messaging/aw;
        JVM INSTR monitorexit ;
        return file;
        file;
        throw file;
        file;
        com/whatsapp/messaging/aw;
        JVM INSTR monitorexit ;
        throw file;
_L2:
        file = new ObjectInputStream(new FileInputStream(file));
        Object obj = file.readObject();
        file.close();
        a = (String)obj;
        b = true;
        file = a;
        continue; /* Loop/switch isn't completed */
        file;
        Log.c(file);
        break MISSING_BLOCK_LABEL_95;
        file;
        Log.c(file);
        break MISSING_BLOCK_LABEL_95;
        file;
        Log.c(file);
        break MISSING_BLOCK_LABEL_95;
        file;
        file = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(Context context)
    {
        return a(a(context));
    }

    static InetSocketAddress c(Context context)
    {
        int i;
        try
        {
            i = App.l;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (i >= 3)
        {
            char c1 = '\u1466';
            String s = a(a(context));
            if (s != null)
            {
label0:
                {
label1:
                    {
                        context = s;
                        int j = c1;
                        if (s.indexOf(':') == -1)
                        {
                            break label0;
                        }
                        String as[] = s.split(":", -1);
                        int k;
                        try
                        {
                            if (as.length == 2)
                            {
                                break label1;
                            }
                            Log.w(z[2]);
                            k = h.a;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Context context)
                        {
                            throw context;
                        }
                        context = s;
                        j = c1;
                        if (k == 0)
                        {
                            break label0;
                        }
                    }
                    context = as[0];
                    try
                    {
                        j = Integer.parseInt(as[1]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        Log.c(context);
                        return null;
                    }
                }
                try
                {
                    context = App.aB.a(context);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.c(z[1], context);
                    return null;
                }
                return new InetSocketAddress((InetAddress)context.get(0), j);
            }
        }
        return null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "6u\0243\016\rs\036'\035\rx\0315\035";
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
                obj = "\007~\027$\00570\002)I u\005)\005$uV\"\f0e\021f\001=c\002";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\026u\0243\016rx\0315\035r}\027?I0uV\0179$&Xf=:y\005f\000!0\030)\035ru\0166\005;s\0372\005+0\0053\031\"\177\0042\f60\0272I&x\0375I&y\033#G";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 105;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 82;
          goto _L9
_L5:
        byte0 = 16;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 70;
          goto _L9
    }
}
