// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, aoz, GroupChatInfo, k, 
//            og

final class a9k extends Handler
{

    private static final String z[];

    a9k()
    {
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        message.what;
        JVM INSTR tableswitch 0 38: default 180
    //                   0 181
    //                   1 207
    //                   2 245
    //                   3 268
    //                   4 306
    //                   5 321
    //                   6 417
    //                   7 450
    //                   8 369
    //                   9 483
    //                   10 516
    //                   11 549
    //                   12 589
    //                   13 629
    //                   14 669
    //                   15 695
    //                   16 721
    //                   17 747
    //                   18 773
    //                   19 813
    //                   20 839
    //                   21 865
    //                   22 891
    //                   23 917
    //                   24 943
    //                   25 969
    //                   26 995
    //                   27 1021
    //                   28 1047
    //                   29 1073
    //                   30 1099
    //                   31 1125
    //                   32 1151
    //                   33 1177
    //                   34 1203
    //                   35 1229
    //                   36 1434
    //                   37 1622
    //                   38 1810;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40
_L1:
        return;
_L2:
        Log.i(z[5]);
        App.ah.g((c4)message.obj);
        if (i == 0) goto _L1; else goto _L3
_L3:
        Log.i(z[3]);
        c4 c4_1 = (c4)message.obj;
        App.ah.g(c4_1);
        GroupChatInfo.g(c4_1.y.a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        GroupChatInfo.g((String)message.obj);
        Log.i(z[0]);
        if (i == 0) goto _L1; else goto _L5
_L5:
        Log.i(z[4]);
        c4 c4_2 = (c4)message.obj;
        App.ah.g(c4_2);
        GroupChatInfo.g(c4_2.y.a);
        if (i == 0) goto _L1; else goto _L6
_L6:
        GroupChatInfo.g((String)message.obj);
        if (i == 0) goto _L1; else goto _L7
_L7:
        String s = (String)message.obj;
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0184, new Object[] {
            App.az.c(s).n
        }), 0);
        if (i == 0) goto _L1; else goto _L10
_L10:
        String s1 = (String)message.obj;
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0184, new Object[] {
            App.az.c(s1).n
        }), 0);
        if (i == 0) goto _L1; else goto _L8
_L8:
        GroupChatInfo.g((String)message.obj);
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0181), 0);
        if (i == 0) goto _L1; else goto _L9
_L9:
        GroupChatInfo.g((String)message.obj);
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0186), 0);
        if (i == 0) goto _L1; else goto _L11
_L11:
        GroupChatInfo.g((String)message.obj);
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0181), 0);
        if (i == 0) goto _L1; else goto _L12
_L12:
        GroupChatInfo.g((String)message.obj);
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e0186), 0);
        if (i == 0) goto _L1; else goto _L13
_L13:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01cb, new Object[] {
            (String)message.obj
        }), 0);
        if (i == 0) goto _L1; else goto _L14
_L14:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01cd, new Object[] {
            (String)message.obj
        }), 0);
        if (i == 0) goto _L1; else goto _L15
_L15:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01cc, new Object[] {
            (String)message.obj
        }), 0);
        if (i == 0) goto _L1; else goto _L16
_L16:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d6), 0);
        if (i == 0) goto _L1; else goto _L17
_L17:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d8), 0);
        if (i == 0) goto _L1; else goto _L18
_L18:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d9), 0);
        if (i == 0) goto _L1; else goto _L19
_L19:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d7), 0);
        if (i == 0) goto _L1; else goto _L20
_L20:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01da, new Object[] {
            (String)message.obj
        }), 0);
        if (i == 0) goto _L1; else goto _L21
_L21:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c3), 0);
        if (i == 0) goto _L1; else goto _L22
_L22:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c5), 0);
        if (i == 0) goto _L1; else goto _L23
_L23:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c6), 0);
        if (i == 0) goto _L1; else goto _L24
_L24:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c4), 0);
        if (i == 0) goto _L1; else goto _L25
_L25:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d2), 0);
        if (i == 0) goto _L1; else goto _L26
_L26:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d4), 0);
        if (i == 0) goto _L1; else goto _L27
_L27:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d5), 0);
        if (i == 0) goto _L1; else goto _L28
_L28:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d3), 0);
        if (i == 0) goto _L1; else goto _L29
_L29:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c7), 0);
        if (i == 0) goto _L1; else goto _L30
_L30:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c9), 0);
        if (i == 0) goto _L1; else goto _L31
_L31:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01ca), 0);
        if (i == 0) goto _L1; else goto _L32
_L32:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01c8), 0);
        if (i == 0) goto _L1; else goto _L33
_L33:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01cf), 0);
        if (i == 0) goto _L1; else goto _L34
_L34:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d1), 0);
        if (i == 0) goto _L1; else goto _L35
_L35:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01d0), 0);
        if (i == 0) goto _L1; else goto _L36
_L36:
        com.whatsapp.App.a(App.au.getApplicationContext(), App.au.getResources().getString(0x7f0e01ce), 0);
        if (i == 0) goto _L1; else goto _L37
_L37:
        StringBuilder stringbuilder;
        Object obj;
        Object obj1;
        stringbuilder = new StringBuilder();
        obj = (Hashtable)message.obj;
        obj1 = ((Hashtable) (obj)).keySet().iterator();
_L46:
        Object obj2;
        int j;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((Iterator) (obj1)).next();
        Log.e((new StringBuilder()).append(z[6]).append(obj2).append("/").append(((Hashtable) (obj)).get(obj2)).toString());
        j = Integer.parseInt(((Hashtable) (obj)).get(obj2).toString());
        obj2 = App.az.e(obj2.toString());
        j;
        JVM INSTR lookupswitch 3: default 1380
    //                   401: 1990
    //                   409: 2028
    //                   500: 2033;
           goto _L41 _L42 _L43 _L44
_L41:
        break; /* Loop/switch isn't completed */
_L44:
        break; /* Loop/switch isn't completed */
_L43:
        break; /* Loop/switch isn't completed */
_L62:
        stringbuilder.append(App.au.getString(0x7f0e0152, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
_L60:
        if (i == 0) goto _L46; else goto _L45
_L45:
        com.whatsapp.App.a(App.au, stringbuilder.toString(), 0);
        if (i == 0) goto _L1; else goto _L38
_L38:
        stringbuilder = new StringBuilder();
        obj = (Hashtable)message.obj;
        obj1 = ((Hashtable) (obj)).keySet().iterator();
_L50:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((Iterator) (obj1)).next();
        Log.e((new StringBuilder()).append(z[1]).append(obj2).append("/").append(((Hashtable) (obj)).get(obj2)).toString());
        j = Integer.parseInt(((Hashtable) (obj)).get(obj2).toString());
        obj2 = App.az.e(obj2.toString());
        j;
        JVM INSTR tableswitch 404 404: default 1568
    //                   404 2074;
           goto _L47 _L48
_L47:
        stringbuilder.append(App.au.getString(0x7f0e0166, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
_L63:
        if (i == 0) goto _L50; else goto _L49
_L49:
        com.whatsapp.App.a(App.au, stringbuilder.toString(), 0);
        if (i == 0) goto _L1; else goto _L39
_L39:
        stringbuilder = new StringBuilder();
        obj = (Hashtable)message.obj;
        obj1 = ((Hashtable) (obj)).keySet().iterator();
_L54:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((Iterator) (obj1)).next();
        Log.e((new StringBuilder()).append(z[2]).append(obj2).append("/").append(((Hashtable) (obj)).get(obj2)).toString());
        j = Integer.parseInt(((Hashtable) (obj)).get(obj2).toString());
        obj2 = App.az.e(obj2.toString());
        j;
        JVM INSTR tableswitch 404 404: default 1756
    //                   404 2082;
           goto _L51 _L52
_L51:
        stringbuilder.append(App.au.getString(0x7f0e0152, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
_L64:
        if (i == 0) goto _L54; else goto _L53
_L53:
        com.whatsapp.App.a(App.au, stringbuilder.toString(), 0);
        if (i == 0) goto _L1; else goto _L40
_L40:
        stringbuilder = new StringBuilder();
        message = (Hashtable)message.obj;
        obj = message.keySet().iterator();
_L58:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((Iterator) (obj)).next();
        Log.e((new StringBuilder()).append(z[7]).append(obj1).append("/").append(message.get(obj1)).toString());
        j = Integer.parseInt(message.get(obj1).toString());
        obj1 = App.az.e(obj1.toString());
        j;
        JVM INSTR tableswitch 404 404: default 1940
    //                   404 2123;
           goto _L55 _L56
_L55:
        stringbuilder.append(App.au.getString(0x7f0e0166, new Object[] {
            ((og) (obj1)).a(App.au)
        })).append("\n");
_L65:
        if (i == 0) goto _L58; else goto _L57
_L57:
        com.whatsapp.App.a(App.au, stringbuilder.toString(), 0);
        return;
_L42:
        stringbuilder.append(App.au.getString(0x7f0e0153, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
        if (i == 0) goto _L60; else goto _L59
_L59:
        if (i == 0) goto _L60; else goto _L61
_L61:
        stringbuilder.append(App.au.getString(0x7f0e0154, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
        if (i == 0) goto _L60; else goto _L62
_L48:
        if (i == 0) goto _L63; else goto _L47
_L52:
        stringbuilder.append(App.au.getString(0x7f0e0152, new Object[] {
            ((og) (obj2)).a(App.au)
        })).append("\n");
        if (i == 0) goto _L64; else goto _L51
_L56:
        stringbuilder.append(App.au.getString(0x7f0e0166, new Object[] {
            ((og) (obj1)).a(App.au)
        })).append("\n");
        if (i == 0) goto _L65; else goto _L55
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\006H?Hf\f]\"\022u\016T&Xd\022[$Ty\017I\177Qs\000L5\035q\023U%M";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\006H?Hf\f]\"\022d\004W?KsLJ1Ob\bY9Mw\017N\177Xd\023U\"\022";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\006H?Hf\f]\"\022w\005^}\\r\fS>N9\004H\"RdN";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\006H?Hf\f]\"\022~\000T4Qs>[4YI\006H?Hf\002R1II\fI7";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\006H?Hf\f]\"\022~\000T4Qs>]\"Rc\021Y8\\b>I%_|\004Y$bu\t[>Zs";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\006H?Hf\f]\"\022~\000T4QsLS>TbL]\"Rc\021\0273Uw\025";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\006H?Hf\f]\"\022w\005^}Mw\023N9^\177\021[>I9\004H\"RdN";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\006H?Hf\f]\"\022d\004W?KsL[4P\177\017I\177Xd\023U\"\022";
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
        byte byte1 = 22;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 97;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 80;
          goto _L9
        byte1 = 61;
          goto _L9
    }
}
