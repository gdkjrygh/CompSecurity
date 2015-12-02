// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.telephony.SmsMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dus
{

    private static Method a;

    private static SmsMessage a(byte abyte0[], String s)
    {
        if (a == null)
        {
            a = Class.forName("android.telephony.SmsMessage").getMethod("createFromPdu", new Class[] {
                [B, java/lang/String
            });
        }
        return (SmsMessage)a.invoke(null, new Object[] {
            abyte0, s
        });
    }

    public static List a(Intent intent)
    {
        byte abyte0[][];
        byte abyte1[][];
        ArrayList arraylist;
        String s;
        int j;
        int k;
        Object aobj[] = (Object[])(Object[])intent.getSerializableExtra("pdus");
        if (aobj == null)
        {
            return Collections.emptyList();
        }
        abyte0 = new byte[aobj.length][];
        for (int i = 0; i < aobj.length; i++)
        {
            abyte0[i] = (byte[])(byte[])aobj[i];
        }

        abyte1 = new byte[abyte0.length][];
        k = abyte1.length;
        arraylist = new ArrayList(k);
        s = intent.getStringExtra("format");
        j = 0;
_L5:
        if (j >= k) goto _L2; else goto _L1
_L1:
        abyte1[j] = abyte0[j];
        if (s == null) goto _L4; else goto _L3
_L3:
        intent = a(abyte1[j], s);
_L6:
        Object obj = intent;
        if (intent == null)
        {
            obj = SmsMessage.createFromPdu(abyte1[j]);
        }
        if (obj != null)
        {
            arraylist.add(obj);
        }
        j++;
          goto _L5
        intent;
_L7:
        ijg.d(intent, "Can't decode sms with format %s", new Object[] {
            s
        });
_L4:
        intent = null;
          goto _L6
_L2:
        return arraylist;
        intent;
          goto _L7
        intent;
          goto _L7
        intent;
          goto _L7
    }
}
