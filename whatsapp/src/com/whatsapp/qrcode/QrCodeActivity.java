// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.google.S;
import com.google.T;
import com.google.by;
import com.google.c6;
import com.google.g6;
import com.google.gX;
import com.google.gh;
import com.google.gr;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.ad;
import com.whatsapp.cr;
import com.whatsapp.iz;
import com.whatsapp.my;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.whatsapp.qrcode:
//            f, k, m, l, 
//            QrCodeView, c, j, p, 
//            h

public class QrCodeActivity extends DialogToastActivity
{

    public static int m;
    private static final String z[];
    private Handler j;
    private cr k;
    private Runnable l;
    private String n;
    private HandlerThread o;
    private boolean p;
    private TextView q;
    private boolean r;
    private String s;
    private QrCodeView t;
    private android.hardware.Camera.PreviewCallback u;
    private g6 v;

    public QrCodeActivity()
    {
        v = new g6();
        r = true;
        l = new f(this);
        k = new k(this);
        u = new m(this);
    }

    static String a(QrCodeActivity qrcodeactivity, String s1)
    {
        qrcodeactivity.s = s1;
        return s1;
    }

    private void a()
    {
        runOnUiThread(new l(this));
    }

    static void a(QrCodeActivity qrcodeactivity, byte abyte0[])
    {
        qrcodeactivity.a(abyte0);
    }

    private void a(byte abyte0[])
    {
        int i;
        i = m;
        android.hardware.Camera.Size size = t.a();
        int i1 = (Math.min(size.width, size.height) * 3) / 4;
        float f1 = (float)q.getHeight() / (float)t.getHeight();
        int j1 = size.width;
        j1 = Math.min((((int)(f1 * (float)size.width) + j1) - i1) / 2, size.width - i1);
        int k1 = (size.height - i1) / 2;
        abyte0 = new gr(abyte0, size.width, size.height, j1, k1, i1, i1, false);
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        abyte0 = new by(new gX(abyte0));
        String s1;
        boolean flag;
        try
        {
            abyte0 = v.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            v.a();
            abyte0 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            v.a();
            throw abyte0;
        }
        v.a();
_L4:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        s1 = abyte0.e();
        try
        {
            Log.i((new StringBuilder()).append(z[0]).append(s1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        flag = s1.equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        s = s1;
        abyte0 = App.g(abyte0.e());
        if (abyte0 == null)
        {
            try
            {
                App.b(this, 0x7f0e0211, 0);
                t.postDelayed(new c(this), 3000L);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_291;
            }
        }
        runOnUiThread(new j(this));
        n = ((ad) (abyte0)).c;
        t.postDelayed(l, 32000L);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        try
        {
            a();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        a();
        return;
        abyte0;
        throw abyte0;
_L2:
        abyte0 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.r;
    }

    static boolean a(QrCodeActivity qrcodeactivity, boolean flag)
    {
        qrcodeactivity.r = flag;
        return flag;
    }

    static void b(QrCodeActivity qrcodeactivity)
    {
        qrcodeactivity.a();
    }

    static boolean b(QrCodeActivity qrcodeactivity, boolean flag)
    {
        qrcodeactivity.p = flag;
        return flag;
    }

    static android.hardware.Camera.PreviewCallback c(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.u;
    }

    static boolean d(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.p;
    }

    static QrCodeView e(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.t;
    }

    static String f(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.n;
    }

    static Handler g(QrCodeActivity qrcodeactivity)
    {
        return qrcodeactivity.j;
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            Log.i(z[5]);
            requestWindowFeature(5L);
            getWindow().addFlags(128);
            setContentView((ViewGroup)iz.a(getLayoutInflater(), 0x7f030098, null, false));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setSupportProgressBarIndeterminateVisibility(false);
            bundle = new HashMap();
            ArrayList arraylist = new ArrayList();
            arraylist.add(S.QR_CODE);
            bundle.put(T.POSSIBLE_FORMATS, arraylist);
            o = new HandlerThread(z[2]);
            o.start();
            j = new Handler(o.getLooper());
            r = getSharedPreferences(z[4], 0).getBoolean(z[3], true);
            t = (QrCodeView)findViewById(0x7f0b00e2);
            t.setCameraCallback(new p(this));
            q = (TextView)findViewById(0x7f0b027c);
            q.setText(Html.fromHtml(getString(0x7f0e02fd, new Object[] {
                z[1]
            })));
            findViewById(0x7f0b00f1).setOnClickListener(new h(this));
            if (r)
            {
                findViewById(0x7f0b027f).setVisibility(0);
                findViewById(0x7f0b027d).setVisibility(0);
                findViewById(0x7f0b027e).setVisibility(8);
                if (m == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b027f).setVisibility(8);
            findViewById(0x7f0b027d).setVisibility(8);
            findViewById(0x7f0b027e).setVisibility(0);
        }
        my.a(k);
    }

    protected void onDestroy()
    {
        Log.i(z[6]);
        super.onDestroy();
        o.quit();
        my.b(k);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "KeoPjSagGg\025ek@kVc.";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\006qa]j\032ta_qH*)\020.\n'>\003.\035)yV|\024`fRjIv~C0Yxc\0171\\x`G ";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "keJV}Usk";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "KeQVzOtoGwUy";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Yxc\035iRvz@\177JgQCl_qkA{Ttk@";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "KeoPjSagGg\025t|V\177Nr";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "KeoPjSagGg\025sk@jHxw";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 30;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 58;
          goto _L9
_L5:
        byte1 = 23;
          goto _L9
_L6:
        byte1 = 14;
          goto _L9
        byte1 = 51;
          goto _L9
    }
}
