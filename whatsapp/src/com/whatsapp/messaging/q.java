// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.messaging:
//            h

final class q
{

    private static final String z[];
    private final Context a;

    public q(Context context)
    {
        a = context;
    }

    private ArrayList a()
    {
        ArrayList arraylist;
label0:
        {
            int i = h.a;
            Object obj = new ObjectInputStream(new BufferedInputStream(a.openFileInput(z[0])));
            arraylist = (ArrayList)((ObjectInputStream) (obj)).readObject();
            ((ObjectInputStream) (obj)).close();
            obj = new HashSet();
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                DnsCacheEntrySerializable dnscacheentryserializable = (DnsCacheEntrySerializable)iterator.next();
                if (dnscacheentryserializable.isExpired())
                {
                    ((Collection) (obj)).add(dnscacheentryserializable);
                }
            } while (i == 0);
            if (((Collection) (obj)).isEmpty())
            {
                break label0;
            }
            arraylist.removeAll(((Collection) (obj)));
            if (arraylist.isEmpty())
            {
                a.deleteFile(z[1]);
                if (i == 0)
                {
                    break label0;
                }
            }
            a(arraylist);
        }
        return arraylist;
    }

    private void a(ArrayList arraylist)
    {
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(a.openFileOutput(z[2], 0)));
        objectoutputstream.writeObject(arraylist);
        objectoutputstream.close();
    }

    public ArrayList a(String as[])
    {
        int i;
        int j;
        i = 0;
        j = h.a;
        if (as != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = (new File(a.getFilesDir(), z[7])).canRead();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw as;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        as = a();
        return as;
        as;
_L6:
        Log.a(z[5], as);
_L4:
        return new ArrayList();
_L2:
        if (as.length != 1)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        flag = as[0].equalsIgnoreCase(z[6]);
        if (flag)
        {
            try
            {
                a.deleteFile(z[3]);
                as = new ArrayList();
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                throw as;
            }
            return as;
        }
        break MISSING_BLOCK_LABEL_124;
        as;
        throw as;
        ArrayList arraylist = new ArrayList();
        int k = as.length;
        do
        {
            if (i >= k)
            {
                break;
            }
            DnsCacheEntrySerializable dnscacheentryserializable = DnsCacheEntrySerializable.parseFallbackIpString(as[i]);
            if (dnscacheentryserializable != null)
            {
                arraylist.add(dnscacheentryserializable);
            }
            i++;
        } while (j == 0);
        try
        {
            a(arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.a(z[4], as);
            return arraylist;
        }
        return arraylist;
        as;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "T\034rDR";
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
                obj = "T\034rDR";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "T\034rDR";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "T\034rDR";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "J\023kD\016A\033iBHQ\0334R@^\022yUBYQhUWW8zXMP\037x_R";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "J\023kD\016A\033iBHQ\0334R@^\022yUBYQw[@V8zXMP\037x_R";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "q2^us";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "T\034rDR";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 33;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 50;
          goto _L9
_L5:
        byte1 = 126;
          goto _L9
_L6:
        byte1 = 27;
          goto _L9
        byte1 = 52;
          goto _L9
    }
}
