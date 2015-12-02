// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.az;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Referenced classes of package com.whatsapp:
//            App, a8k

public class l1
{

    private static File a;
    public static Statistics.Data b;
    private static final String z[];

    public static void a()
    {
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new az(App.ab, a));
        objectoutputstream.writeObject(b);
        if (objectoutputstream != null)
        {
            objectoutputstream.close();
        }
        return;
        Exception exception;
        exception;
        objectoutputstream = null;
_L2:
        if (objectoutputstream != null)
        {
            objectoutputstream.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(long l, int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 52
    //                   2 71;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        Statistics.Data data = b;
        data.tx_media_bytes = data.tx_media_bytes + l;
        if (j == 0) goto _L1; else goto _L3
_L3:
        Statistics.Data data1 = b;
        data1.tx_message_service_bytes = data1.tx_message_service_bytes + l;
        if (j == 0) goto _L1; else goto _L4
_L4:
        Statistics.Data data2 = b;
        data2.tx_voip_bytes = data2.tx_voip_bytes + l;
        return;
    }

    public static void a(c4 c4_1)
    {
label0:
        {
            if (c4_1.w == 0)
            {
                c4_1 = b;
                c4_1.tx_text_msgs = ((Statistics.Data) (c4_1)).tx_text_msgs + 1L;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            c4_1 = b;
            c4_1.tx_media_msgs = ((Statistics.Data) (c4_1)).tx_media_msgs + 1L;
        }
    }

    public static void a(File file)
    {
        a = new File(file, z[4]);
        boolean flag = c();
        file = new Handler();
        file.postDelayed(new a8k(file), 0xdbba0L);
        if (!flag)
        {
            b = new Statistics.Data(false);
        }
        Log.i((new StringBuilder()).append(z[3]).append(b.toString()).toString());
    }

    public static void b()
    {
        b = new Statistics.Data(true);
        try
        {
            a();
            return;
        }
        catch (IOException ioexception)
        {
            Log.a(z[5], ioexception);
        }
    }

    public static void b(long l, int i)
    {
        int j = App.am;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 52
    //                   2 71;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        Statistics.Data data = b;
        data.rx_media_bytes = data.rx_media_bytes + l;
        if (j == 0) goto _L1; else goto _L3
_L3:
        Statistics.Data data1 = b;
        data1.rx_message_service_bytes = data1.rx_message_service_bytes + l;
        if (j == 0) goto _L1; else goto _L4
_L4:
        Statistics.Data data2 = b;
        data2.rx_voip_bytes = data2.rx_voip_bytes + l;
        return;
    }

    public static void b(c4 c4_1)
    {
label0:
        {
            long l = System.currentTimeMillis() - c4_1.I;
            if (l > 1000L)
            {
                Statistics.Data data = b;
                long l2 = b.rx_offline_delay;
                long l3 = b.rx_offline_msgs;
                Statistics.Data data1 = b;
                long l4 = data1.rx_offline_msgs + 1L;
                data1.rx_offline_msgs = l4;
                data.rx_offline_delay = (l + l2 * l3) / l4;
            }
            if (c4_1.w == 0)
            {
                c4_1 = b;
                c4_1.rx_text_msgs = ((Statistics.Data) (c4_1)).rx_text_msgs + 1L;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            c4_1 = b;
            c4_1.rx_media_msgs = ((Statistics.Data) (c4_1)).rx_media_msgs + 1L;
        }
    }

    public static void c(c4 c4_1)
    {
label0:
        {
            if (c4_1.w != 8)
            {
                break label0;
            }
            if (c4_1.y.b)
            {
                c4_1 = b;
                c4_1.tx_voip_calls = ((Statistics.Data) (c4_1)).tx_voip_calls + 1L;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            c4_1 = b;
            c4_1.rx_voip_calls = ((Statistics.Data) (c4_1)).rx_voip_calls + 1L;
        }
    }

    public static boolean c()
    {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag;
        flag = false;
        if (!a.exists())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj4 = null;
        obj2 = null;
        obj3 = null;
        Object obj = new ObjectInputStream(new FileInputStream(a));
        obj2 = obj;
        b = (Statistics.Data)((ObjectInputStream) (obj)).readObject();
        Object obj1;
        IOException ioexception1;
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        flag = true;
        return flag;
        obj3;
        obj = null;
_L8:
        obj2 = obj;
        Log.w((new StringBuilder()).append(z[0]).append(obj3).toString());
        obj2 = obj;
        b = new Statistics.Data(true);
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return true;
        obj2;
        obj = obj3;
        obj3 = obj2;
_L6:
        obj2 = obj;
        Log.w((new StringBuilder()).append(z[1]).append(obj3).toString());
        obj2 = obj;
        b = new Statistics.Data(true);
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return true;
        ioexception1;
        obj = obj4;
_L4:
        obj2 = obj;
        Log.w((new StringBuilder()).append(z[2]).append(ioexception1).toString());
        obj2 = obj;
        b = new Statistics.Data(true);
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        return true;
        obj1;
_L2:
        if (obj2 != null)
        {
            try
            {
                ((ObjectInputStream) (obj2)).close();
            }
            catch (IOException ioexception) { }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception1;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception1;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "${\fSk${\004Dqw}\bTg#/\tRgw{\002\007o>|\036Nl0/\016Kc$|W\007";
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
                obj = "${\fSk${\004Dqw}\bTg#/\tRgw{\002\007q2}\004Fn>u\fSk8aMDj6a\nB8w";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "${\fSk${\004Dqw}\bTg#/\tRgw{\002\007kx`MBz4j\035Sk8aW\007";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "${\fSk${\004Dqw";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "${\fSk${\004Dq";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "2}\037Hpw|\fQk9hMTv6{\004Tv>l\036\007d>c\b";
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
    //                   0 238
    //                   1 245
    //                   2 252
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        byte byte1 = 2;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 87;
          goto _L9
_L5:
        byte1 = 15;
          goto _L9
_L6:
        byte1 = 109;
          goto _L9
        byte1 = 39;
          goto _L9
    }
}
