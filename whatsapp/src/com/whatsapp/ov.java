// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import com.google.af;
import com.google.fi;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            og, mk

public abstract class ov
{

    public static boolean e;
    private static final String z[];
    public String a;
    public long b;
    public int c;
    public String d;

    protected ov()
    {
        d = null;
        a = null;
    }

    protected ov(String s)
    {
        d = null;
        a = s;
    }

    protected ov(String s, String s1, long l)
    {
        d = null;
        a = s;
        d = s1;
        b = l;
    }

    public static String a(String s)
    {
        s = (new StringBuilder()).append('+').append(s).toString();
        Object obj;
        try
        {
            obj = af.a();
            obj = ((af) (obj)).a(((af) (obj)).c(s, z[2]), fi.INTERNATIONAL);
        }
        catch (Exception exception)
        {
            Log.e((new StringBuilder()).append(z[0]).append(s).append(" ").append(exception.getMessage()).toString());
            return s;
        }
        catch (ExceptionInInitializerError exceptionininitializererror)
        {
            Log.e((new StringBuilder()).append(z[1]).append(s).append(" ").append(exceptionininitializererror.getMessage()).toString());
            return s;
        }
        return ((String) (obj));
    }

    public static String b(String s)
    {
        String s1;
        if (s == null)
        {
            Log.w(z[5]);
            s1 = null;
        } else
        {
            int i = s.indexOf('@');
            s1 = s;
            if (i != -1)
            {
                String s2;
label0:
                {
                    if (og.c(s))
                    {
                        return s.substring(s.indexOf("-") + 1, s.lastIndexOf("@"));
                    }
                    String s3 = s.substring(0, i);
                    s2 = s3;
                    if (!PhoneNumberUtils.isGlobalPhoneNumber(s3))
                    {
                        break label0;
                    }
                    s2 = s3;
                    if (!mk.h(s))
                    {
                        s = a(s3);
                        s2 = s;
                        if (!e)
                        {
                            break label0;
                        }
                        s2 = s;
                    }
                    s2 = (new StringBuilder()).append("+").append(s2).toString();
                }
                return s2;
            }
        }
        return s1;
    }

    public String a()
    {
        return b(a);
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[3]).append(a).append(z[4]).append(c).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "NF;;LN]z)B_D4;YH[x*UNL%;DBGu!X@\023";
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
                obj = "NF;;LN]z)B_D4;YH[x&CD]x*UNL%;DBGu!X@\023";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "ws";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "G@1r";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\r\\;<HHG\n\"^Jv6 XC]h";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "NF;;LN]z?EBG0!X@K0=\002G@1`CXE9";
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
        byte byte1 = 45;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 45;
          goto _L9
_L5:
        byte1 = 41;
          goto _L9
_L6:
        byte1 = 85;
          goto _L9
        byte1 = 79;
          goto _L9
    }
}
