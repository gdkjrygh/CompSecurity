// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.os.AsyncTask;
import android.widget.Toast;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

// Referenced classes of package com.whatsapp:
//            App, i2, WebImagePicker, q2

class ew extends AsyncTask
{

    private static final String z;
    final WebImagePicker a;
    private ProgressDialog b;
    private i2 c;

    ew(WebImagePicker webimagepicker, i2 i2_1)
    {
        a = webimagepicker;
        super();
        c = i2_1;
    }

    static ProgressDialog a(ew ew1)
    {
        return ew1.b;
    }

    static ProgressDialog a(ew ew1, ProgressDialog progressdialog)
    {
        ew1.b = progressdialog;
        return progressdialog;
    }

    protected Boolean a(Void avoid[])
    {
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        flag = true;
        l = App.am;
        OutputStream outputstream;
        byte abyte0[];
        boolean flag1;
        try
        {
            avoid = (new URL(c.a.replace(" ", z))).openStream();
            outputstream = App.d.openOutputStream(WebImagePicker.c(a));
            abyte0 = new byte[1024];
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            try
            {
                if (!isCancelled())
                {
                    Log.a(avoid);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
            return Boolean.FALSE;
        }
        i = 0;
        j = 0;
_L9:
        if (isCancelled()) goto _L2; else goto _L1
_L1:
        k = avoid.read(abyte0, 0, 1024);
        if (k == -1 && l == 0) goto _L2; else goto _L3
_L3:
        outputstream.write(abyte0, 0, k);
        k += j;
        if (c.d == 0) goto _L5; else goto _L4
_L4:
        j = (k * 100) / c.d;
_L10:
        if (j == i) goto _L7; else goto _L6
_L6:
        publishProgress(new Integer[] {
            Integer.valueOf(j)
        });
          goto _L8
_L2:
        outputstream.close();
        try
        {
            flag1 = isCancelled();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (flag1)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
_L11:
        i = j;
        j = k;
          goto _L9
_L7:
        j = i;
        continue; /* Loop/switch isn't completed */
_L5:
        j = 0;
          goto _L10
_L8:
        if (l == 0) goto _L11; else goto _L2
    }

    protected void a(Boolean boolean1)
    {
label0:
        {
            if (b != null)
            {
                b.dismiss();
            }
            b = null;
            if (WebImagePicker.b(a) == this)
            {
                WebImagePicker.a(a, null);
            }
            if (boolean1.booleanValue())
            {
                a.setResult(-1);
                a.finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!isCancelled())
            {
                Toast.makeText(a.getApplicationContext(), a.getString(0x7f0e015a), 1).show();
            }
        }
    }

    protected void a(Integer ainteger[])
    {
        if (b != null)
        {
            b.setProgress(ainteger[0].intValue());
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        b = new ProgressDialog(a);
        b.setProgressStyle(1);
        b.setMessage(a.getString(0x7f0e02d9));
        b.setCancelable(true);
        b.setOnCancelListener(new q2(this));
        b.show();
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = ";u\036".toCharArray();
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
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 40;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 30;
          goto _L8
_L3:
        byte0 = 71;
          goto _L8
_L4:
        byte0 = 46;
          goto _L8
        byte0 = 52;
          goto _L8
    }
}
