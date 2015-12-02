// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.c2dm;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.d;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.z;
import com.whatsapp.fv;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp.c2dm:
//            C2DMRegistrar

public class b
{

    private static final String z[];

    public static void a(Context context, Intent intent, boolean flag)
    {
        String s;
        Object obj;
        String s2;
        String s3;
        boolean flag1;
        obj = null;
        flag1 = C2DMRegistrar.c;
        App.a(context, 0);
        s3 = intent.getStringExtra(z[7]);
        s2 = intent.getStringExtra(z[16]);
        s = intent.getStringExtra(z[12]);
        Log.i((new StringBuilder()).append(z[9]).append(s3).append(z[15]).append(s2).append(z[3]).append(s).toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        flag = TextUtils.isEmpty(s);
        if (!flag)
        {
            try
            {
                a(context, s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
label0:
        {
            String s1 = s2;
            String as[];
            long l;
            long l1;
            try
            {
                if (!TextUtils.isEmpty(s2))
                {
                    break label0;
                }
                flag = TextUtils.isEmpty(s3);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            s1 = s2;
            if (flag)
            {
                break label0;
            }
            as = s3.split(",");
            s1 = s2;
            try
            {
                if (as.length <= 1)
                {
                    break label0;
                }
                flag = a(as[1]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            s1 = s2;
            if (flag)
            {
                s1 = as[1];
            }
        }
        s2 = intent.getStringExtra(z[8]);
        if (!z[10].equalsIgnoreCase(s2)) goto _L2; else goto _L1
_L1:
        App.a(context, null, 0L);
        if (!flag1) goto _L4; else goto _L3
_L3:
        DialogToastActivity.g++;
_L2:
        if (TextUtils.isEmpty(s2)) goto _L4; else goto _L5
_L5:
        as = s2.split(z[5], 3);
        if (as.length != 3) goto _L7; else goto _L6
_L6:
        l = Long.parseLong(as[1]);
        l1 = Long.parseLong(as[2]);
        App.a(context, as[0], (l + l1) * 1000L);
_L4:
        flag = z[13].equals(intent.getStringExtra(z[4]));
        s2 = intent.getStringExtra(z[6]);
        intent = obj;
        NumberFormatException numberformatexception;
        if (s2 != null)
        {
            try
            {
                intent = s2.split(",");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        MessageService.a(context, true, true, true, s1, intent, flag);
        return;
        context;
        throw context;
        context;
        throw context;
        numberformatexception;
        try
        {
            Log.w((new StringBuilder()).append(z[14]).append(s2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag1) goto _L4; else goto _L7
_L7:
        Log.w((new StringBuilder()).append(z[11]).append(s2).toString());
          goto _L4
    }

    private static void a(Context context, String s)
    {
        a7 a7_1;
        fv fv1;
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e((new StringBuilder()).append(z[17]).append(s).toString());
            return;
        }
        s = (d)g.a().a(com/whatsapp/d);
        fv1 = (fv)g.a().a(com/whatsapp/fv);
        a7_1 = new a7();
        a7_1.a = Double.valueOf(s.a() - 1000L * l);
        if (fv1.a())
        {
            s = Double.valueOf(1.0D);
        } else
        {
            s = Double.valueOf(0.0D);
        }
        a7_1.b = s;
        com.whatsapp.fieldstats.z.a(context, a7_1);
        return;
        context;
        throw context;
    }

    private static boolean a(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        boolean flag;
        try
        {
            flag = s.matches(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        return !s.equals(z[2]);
        Log.w(z[0]);
        return false;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[18];
        obj = "(G\035\033N9\020\032\023\b=\020V\030\016?X\020\006L*\021\035\004\0048\006";
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
                obj = "\027\021R*O\027\021R*O\027\021R*O\027\021R";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "{[IXQeE";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "g\001\nK";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "*\031\025\031\026\024\020\001\006\b9\020\035";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\027\t";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "-\027\020\006\022";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\"\021";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "&\030\n\031\027";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "(G\035\033N9\020\032\023\b=\020V\037\005v";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\b9<73";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "(G\035\033N&\030\n)\016=\020\013\004\b/\020V\037\017=\024\025\037\005\024\032\017\023\0239\034\035\023[";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "?\006";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "?\007\f\023";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "(G\035\033N&\030\n)\016=\020\013\004\b/\020V\037\017=\024\025\037\005\024\033\f\033\003.\007\nL";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "g\034\tK";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\"\005";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\"\033\017\027\r\"\021Y\002\b&\020\n\002\000&\005Y\004\004(\020\020\000\004/U\020\030A(G\035\033A;\000\n\036[k";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 476
    //                   0 499
    //                   1 506
    //                   2 513
    //                   3 520;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_520;
_L3:
        byte byte1 = 97;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 75;
          goto _L9
_L5:
        byte1 = 117;
          goto _L9
_L6:
        byte1 = 121;
          goto _L9
        byte1 = 118;
          goto _L9
    }
}
