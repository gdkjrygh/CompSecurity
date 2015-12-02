// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            App, c5, LocationPicker2, kx, 
//            v8

class a1w
    implements Runnable
{

    private static final String z;
    final LocationPicker2 a;
    double b;
    double c;

    a1w(LocationPicker2 locationpicker2, double d, double d1)
    {
        a = locationpicker2;
        super();
        c = d;
        b = d1;
    }

    public void run()
    {
        Object obj;
        int j;
        j = App.am;
        obj = new Geocoder(App.au, Locale.getDefault());
        obj = ((Geocoder) (obj)).getFromLocation(c, b, 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        StringBuilder stringbuilder;
        int i;
        int k;
        boolean flag;
        try
        {
            flag = ((List) (obj)).isEmpty();
        }
        catch (Exception exception)
        {
            try
            {
                throw exception;
            }
            catch (Exception exception1)
            {
                a.runOnUiThread(new v8(this));
            }
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = (Address)((List) (obj)).get(0);
        stringbuilder = new StringBuilder();
        i = 0;
_L2:
        k = ((Address) (obj)).getMaxAddressLineIndex();
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        stringbuilder.append(z);
        stringbuilder.append(((Address) (obj)).getAddressLine(i));
        i++;
        if (j == 0) goto _L2; else goto _L1
_L1:
        a.runOnUiThread(new c5(this, ((Address) (obj)), stringbuilder));
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        a.runOnUiThread(new kx(this));
        return;
        Exception exception2;
        exception2;
        throw exception2;
        exception2;
        throw exception2;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "(:".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 16;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 4;
          goto _L8
_L3:
        byte0 = 26;
          goto _L8
_L4:
        byte0 = 56;
          goto _L8
        byte0 = 17;
          goto _L8
    }
}
