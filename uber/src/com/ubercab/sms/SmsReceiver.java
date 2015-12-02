// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class SmsReceiver extends BroadcastReceiver
{

    private static Method a;

    public SmsReceiver()
    {
    }

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

    private static List a(Intent intent)
    {
        Object aobj[];
        boolean flag;
        flag = false;
        aobj = (Object[])(Object[])intent.getSerializableExtra("pdus");
        if (aobj != null) goto _L2; else goto _L1
_L1:
        intent = Collections.emptyList();
_L4:
        return intent;
_L2:
        byte abyte0[][] = new byte[aobj.length][];
        for (int i = 0; i < aobj.length; i++)
        {
            abyte0[i] = (byte[])(byte[])aobj[i];
        }

        byte abyte1[][] = new byte[abyte0.length][];
        int k = abyte1.length;
        ArrayList arraylist = new ArrayList(k);
        String s = intent.getStringExtra("format");
        int j = ((flag) ? 1 : 0);
        do
        {
            intent = arraylist;
            if (j >= k)
            {
                continue;
            }
            abyte1[j] = abyte0[j];
            Object obj = null;
            intent = ((Intent) (obj));
            if (s != null)
            {
                try
                {
                    intent = a(abyte1[j], s);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent = ((Intent) (obj));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent = ((Intent) (obj));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent = ((Intent) (obj));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    intent = ((Intent) (obj));
                }
            }
            obj = intent;
            if (intent == null)
            {
                obj = SmsMessage.createFromPdu(abyte1[j]);
            }
            if (obj != null)
            {
                arraylist.add(obj);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract void a(Context context, List list);

    public final void onReceive(Context context, Intent intent)
    {
        a(context, a(intent));
    }
}
