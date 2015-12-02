// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.protocol.b_;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            av

class bj
    implements b_
{

    private static final String z[];
    final Bundle a;
    final av b;
    final Messenger c;

    bj(av av, Bundle bundle, Messenger messenger)
    {
        b = av;
        a = bundle;
        c = messenger;
        super();
    }

    public void a()
    {
        try
        {
            c.send(Message.obtain(null, 2, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.a(z[0], remoteexception);
        }
    }

    public void a(int i)
    {
        try
        {
            c.send(Message.obtain(null, 0, i, 0, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.a(z[5], remoteexception);
        }
    }

    public void a(long l, String s)
    {
        try
        {
            a.putString(z[2], s);
            a.putLong(z[1], l);
            c.send(Message.obtain(null, 1, a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.a(z[3], s);
        }
    }

    public void b()
    {
        try
        {
            c.send(Message.obtain(null, 3, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.a(z[4], remoteexception);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "\177\b\025L\002oF\000ANy\003\032JN~\tTM\017f\n\026O\raF\031K\035y\007\023K";
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
                obj = "~\017\031K\035~\007\031^";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "y\022\025Z\033y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\177\b\025L\002oF\000ANy\003\032JN~\tTM\017f\n\026O\raF\031K\035y\007\023K";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\177\b\025L\002oF\000ANy\003\032JN~\tTM\017f\n\026O\raF\031K\035y\007\023K";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\177\b\025L\002oF\000ANy\003\032JN~\tTM\017f\n\026O\raF\031K\035y\007\023K";
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
        char c1 = obj[j];
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
        byte byte1 = 110;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 10;
          goto _L9
_L5:
        byte1 = 102;
          goto _L9
_L6:
        byte1 = 116;
          goto _L9
        byte1 = 46;
          goto _L9
    }
}
