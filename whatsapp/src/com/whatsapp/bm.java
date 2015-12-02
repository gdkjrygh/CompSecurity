// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.s;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            RecordAudio, App, fm, MediaData, 
//            x2, a_g, a3o

class bm
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final RecordAudio a;

    bm(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    private void a()
    {
        c1.a(a, a, RecordAudio.l(a), RecordAudio.m(a), (byte)2, RecordAudio.d(a));
_L2:
        s s1 = RecordAudio.n(a);
        Object obj;
        String s2;
        boolean flag;
        if (s1 != null)
        {
            try
            {
                if (RecordAudio.n(a).f())
                {
                    RecordAudio.n(a).g();
                }
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                throw filenotfoundexception;
            }
        }
        a.finish();
        return;
        obj;
        Log.a(((Throwable) (obj)));
        App.b(a.getBaseContext(), 0x7f0e03d4, 0);
        continue; /* Loop/switch isn't completed */
        obj;
        Log.a(((Throwable) (obj)));
        s2 = ((IOException) (obj)).getMessage();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        try
        {
            flag = ((IOException) (obj)).getMessage().contains(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        App.b(a.getBaseContext(), 0x7f0e015f, 1);
        if (App.am == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        App.b(a.getBaseContext(), 0x7f0e03d4, 1);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        throw obj;
    }

    public void onClick(View view)
    {
        int i = App.am;
        int j;
        boolean flag;
        try
        {
            Log.i((new StringBuilder()).append(z[2]).append(RecordAudio.f(a)).toString());
            j = RecordAudio.f(a);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        j;
        JVM INSTR tableswitch 0 5: default 84
    //                   0 99
    //                   1 207
    //                   2 84
    //                   3 227
    //                   4 256
    //                   5 256;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L5
_L1:
        RecordAudio.a(a, RecordAudio.f(a));
        return;
_L2:
        flag = RecordAudio.d(a);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        a();
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        RecordAudio.j(a).sendEmptyMessage(0);
        RecordAudio.k(a).setMax(0x1d4c0);
        RecordAudio.a(a, System.currentTimeMillis());
        try
        {
            RecordAudio.i(a).f();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
        }
        try
        {
            RecordAudio.i(a).e();
            RecordAudio.c(a, 1);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
            a.a(0x7f0e0168, new x2(this));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
            a.a(0x7f0e0168, new a_g(this));
        }
        try
        {
            RecordAudio.a(a, RecordAudio.i(a).c());
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        RecordAudio.e(a);
        RecordAudio.c(a, 4);
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        RecordAudio.n(a).g();
        try
        {
            RecordAudio.n(a).c();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.a(view);
            a.a(0x7f0e0196, new a3o(this));
        }
        RecordAudio.c(a, 4);
_L5:
        if (!RecordAudio.d(a)) goto _L7; else goto _L6
_L6:
        a();
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        (new MediaData()).file = RecordAudio.m(a);
        view = new Intent();
        view.setData(Uri.fromFile(RecordAudio.m(a)));
        view.putExtra(z[1], false);
        a.setResult(-1, view);
        a.finish();
        continue; /* Loop/switch isn't completed */
        view;
        throw view;
        if (true) goto _L1; else goto _L8
_L8:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "qTE\"j^X\0";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "WZ\026\016jM^\0238\177H";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "M^\006>h[Z\0205sP\024\006>tKI\n=5";
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
        byte byte0 = 26;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 63;
          goto _L9
_L5:
        byte0 = 59;
          goto _L9
_L6:
        byte0 = 101;
          goto _L9
        byte0 = 81;
          goto _L9
    }
}
