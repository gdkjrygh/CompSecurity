// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.fieldstats.ae;
import com.whatsapp.fieldstats.ap;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;
import org.whispersystems.aO;
import org.whispersystems.ak;

// Referenced classes of package com.whatsapp:
//            App, mk, og, k, 
//            tt, uc, au2, aoz, 
//            aki

final class a8v
    implements Runnable
{

    private static final String z[];
    final c4 a;

    a8v(c4 c4_1)
    {
        a = c4_1;
        super();
    }

    public void run()
    {
        boolean flag;
        int l;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag2 = true;
        flag = true;
        flag3 = false;
        l = App.am;
        flag4 = mk.h(a.y.a);
        flag1 = flag3;
        if (a.w != 0) goto _L2; else goto _L1
_L1:
        boolean flag6 = TextUtils.isEmpty(a.y.a);
        flag1 = flag3;
        if (flag6) goto _L2; else goto _L3
_L3:
        flag1 = flag3;
        if (flag4) goto _L2; else goto _L4
_L4:
        Object obj;
        int i;
        long l1;
        Date date;
        Calendar calendar;
        boolean flag5;
        try
        {
            flag5 = og.g(a.y.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        flag1 = flag3;
        if (flag5) goto _L2; else goto _L5
_L5:
        a.b(null);
        obj = new ap();
        flag1 = App.az.d(a.y.a);
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj.d = Double.valueOf(i);
        Log.i((new StringBuilder()).append(z[2]).append(flag1).toString());
        obj.b = Double.valueOf(a.D);
        try
        {
            l1 = com.whatsapp.tt.a(a.y.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            App.aD().post(new aki(this, false));
            return;
        }
        date = App.au.aq.d(l1).a();
        calendar = Calendar.getInstance();
        calendar.add(5, -1);
        flag3 = App.au.aq.c(l1);
        if (date == null) goto _L7; else goto _L6
_L6:
        try
        {
            flag1 = date.before(calendar.getTime());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag1) goto _L8; else goto _L7
_L7:
        i = 1;
        break MISSING_BLOCK_LABEL_268;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L8:
        i = 0;
        if (true) goto _L10; else goto _L9
_L10:
        if (flag3 || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            if (au2.l)
            {
                Log.i((new StringBuilder()).append(z[0]).append(a.y).append(z[1]).toString());
                a.M = 14;
                App.ah.b(a.y);
                App.aD().post(new aki(this, true));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj.a = Double.valueOf(0.0D);
        obj.c = Double.valueOf(ae.NO_SESSION_AVAILABLE.getCode());
        flag1 = flag2;
        if (l == 0) goto _L12; else goto _L11
_L11:
        flag1 = true;
_L16:
        if (!flag3) goto _L14; else goto _L13
_L13:
        aO ao = (new ak(App.au.aq, App.au.aq, App.au.aq.f(), App.au.aq, l1, 0)).a(a.a());
        c4 c4_1;
        int j;
        try
        {
            a.b(ao.b());
            c4_1 = a;
            j = ao.a();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (j == 3)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        try
        {
            c4_1.a(j);
            obj.a = Double.valueOf(1.0D);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw illegalargumentexception1;
        }
        if (l == 0) goto _L12; else goto _L14
_L14:
        obj.a = Double.valueOf(0.0D);
        obj.c = Double.valueOf(ae.NO_SESSION_AVAILABLE.getCode());
_L12:
        com.whatsapp.fieldstats.z.a(App.au, ((com.whatsapp.fieldstats.aq) (obj)));
_L2:
        App.aD().post(new aki(this, flag1));
        return;
_L9:
        flag1 = false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "i2JE<|&\005Y&|>LG4(";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "(#K]<(:@G7a$B\t6:/\005Z6{9LF=(9QH'mjA\\6(>J\t=gjVL {#JGsi$A\tm:~\005A<}8V\t a$FLsd+V]sc/\\\t!m;PL |";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "i2JE<|&\005@ (9@E5(9@G7a$B\023s";
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
        char c = obj[j];
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
        byte byte0 = 83;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 74;
          goto _L9
_L6:
        byte0 = 37;
          goto _L9
        byte0 = 41;
          goto _L9
    }
}
