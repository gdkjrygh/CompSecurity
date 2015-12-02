// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.c1;
import com.whatsapp.util.s;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, fm, auz, l9, 
//            App, zg, Conversation, asa, 
//            au2, xr, bm, aom, 
//            vf, a8m

public class RecordAudio extends DialogToastActivity
{

    private static final String z[];
    private View j;
    private TextView k;
    private TextView l;
    private Button m;
    private SeekBar n;
    private long o;
    private ImageButton p;
    private File q;
    private s r;
    private boolean s;
    private Button t;
    private String u;
    private Handler v;
    private ProgressBar w;
    private fm x;
    private int y;

    public RecordAudio()
    {
        y = 0;
    }

    static long a(RecordAudio recordaudio, long l1)
    {
        recordaudio.o = l1;
        return l1;
    }

    static TextView a(RecordAudio recordaudio)
    {
        return recordaudio.l;
    }

    static File a(RecordAudio recordaudio, File file)
    {
        recordaudio.q = file;
        return file;
    }

    private void a()
    {
        if (x != null)
        {
            try
            {
                x.a();
            }
            catch (Exception exception)
            {
                Log.a(exception);
            }
            try
            {
                x.b();
            }
            catch (Exception exception1)
            {
                Log.a(exception1);
            }
            x = null;
        }
        w.setProgress(w.getMax());
        b();
    }

    static void a(RecordAudio recordaudio, int i1)
    {
        recordaudio.d(i1);
    }

    static ImageButton b(RecordAudio recordaudio)
    {
        return recordaudio.p;
    }

    private void b()
    {
        if (r != null)
        {
            r.d();
            r = null;
        }
        r = com.whatsapp.util.s.a(q.getAbsolutePath());
        r.a(new auz(this));
        r.a(new l9(this));
        r.c();
        Log.i((new StringBuilder()).append(z[14]).append(r.a()).toString());
        y = 5;
        n.setMax(r.a());
        k.setText(DateUtils.formatElapsedTime(r.a() / 1000));
_L2:
        n.setProgress(0);
        p.setImageResource(0x7f0205d3);
        return;
        IOException ioexception;
        ioexception;
        try
        {
            throw ioexception;
        }
        catch (IOException ioexception1)
        {
            Log.a(ioexception1);
        }
        a(0x7f0e015b);
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void b(RecordAudio recordaudio, int i1)
    {
        recordaudio.c(i1);
    }

    static int c(RecordAudio recordaudio, int i1)
    {
        recordaudio.y = i1;
        return i1;
    }

    static long c(RecordAudio recordaudio)
    {
        return recordaudio.o;
    }

    private void c(int i1)
    {
        b();
        if (r != null)
        {
            y = 3;
            v.sendEmptyMessage(0);
            p.setImageResource(0x7f0205d2);
            App.p(this);
            r.i();
            if (i1 > 0)
            {
                r.b(i1);
                n.setProgress(r.b());
            }
        }
    }

    private void d(int i1)
    {
        boolean flag;
        int j1;
        flag = false;
        j1 = App.am;
        i1;
        JVM INSTR tableswitch 0 5: default 48
    //                   0 49
    //                   1 120
    //                   2 48
    //                   3 186
    //                   4 284
    //                   5 384;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6
_L1:
        return;
_L2:
        t.setText(0x7f0e0307);
        m.setVisibility(0);
        j.setVisibility(0);
        p.setVisibility(8);
        l.setVisibility(0);
        w.setVisibility(0);
        n.setVisibility(4);
        w.setProgress(0);
        if (j1 == 0) goto _L1; else goto _L3
_L3:
        t.setText(0x7f0e0309);
        m.setVisibility(8);
        j.setVisibility(8);
        p.setVisibility(8);
        l.setVisibility(0);
        w.setVisibility(0);
        n.setVisibility(4);
        if (j1 == 0) goto _L1; else goto _L4
_L4:
        t.setText(0x7f0e0308);
        m.setVisibility(0);
        j.setVisibility(0);
        p.setVisibility(0);
        p.setImageResource(0x7f0205d2);
        l.setVisibility(8);
        w.setVisibility(4);
        n.setVisibility(0);
        SeekBar seekbar = n;
        if (r != null)
        {
            i1 = r.a();
        } else
        {
            i1 = 0;
        }
        seekbar.setMax(i1);
        if (j1 == 0) goto _L1; else goto _L5
_L5:
        t.setText(0x7f0e0308);
        m.setVisibility(0);
        j.setVisibility(0);
        p.setVisibility(0);
        p.setImageResource(0x7f0205d3);
        l.setVisibility(8);
        w.setVisibility(4);
        n.setVisibility(0);
        seekbar = n;
        i1 = ((flag) ? 1 : 0);
        if (r != null)
        {
            i1 = r.a();
        }
        seekbar.setMax(i1);
        if (j1 == 0) goto _L1; else goto _L6
_L6:
        p.setImageResource(0x7f0205d3);
        return;
    }

    static boolean d(RecordAudio recordaudio)
    {
        return recordaudio.s;
    }

    static void e(RecordAudio recordaudio)
    {
        recordaudio.a();
    }

    static int f(RecordAudio recordaudio)
    {
        return recordaudio.y;
    }

    static TextView g(RecordAudio recordaudio)
    {
        return recordaudio.k;
    }

    static SeekBar h(RecordAudio recordaudio)
    {
        return recordaudio.n;
    }

    static fm i(RecordAudio recordaudio)
    {
        return recordaudio.x;
    }

    static Handler j(RecordAudio recordaudio)
    {
        return recordaudio.v;
    }

    static ProgressBar k(RecordAudio recordaudio)
    {
        return recordaudio.w;
    }

    static String l(RecordAudio recordaudio)
    {
        return recordaudio.u;
    }

    static File m(RecordAudio recordaudio)
    {
        return recordaudio.q;
    }

    static s n(RecordAudio recordaudio)
    {
        return recordaudio.r;
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
label1:
            {
                int i1 = App.am;
                super.onCreate(bundle);
                requestWindowFeature(1L);
                setContentView(0x7f03009a);
                Log.i(z[7]);
                if (!WhatsAppLibLoader.a(null))
                {
                    Log.i(z[9]);
                    finish();
                    return;
                }
                if (App.Z == null || App.f(this) != 3)
                {
                    finish();
                    return;
                }
                if (!Environment.getExternalStorageState().equals(z[5]))
                {
                    showDialog(0);
                    return;
                }
                s = getIntent().getBooleanExtra(z[2], false);
                u = getIntent().getStringExtra(z[8]);
                k = (TextView)findViewById(0x7f0b028b);
                l = (TextView)findViewById(0x7f0b0289);
                m = (Button)findViewById(0x7f0b028e);
                j = findViewById(0x7f0b028d);
                p = (ImageButton)findViewById(0x7f0b0288);
                t = (Button)findViewById(0x7f0b028c);
                w = (ProgressBar)findViewById(0x7f0b028a);
                n = (SeekBar)findViewById(0x7f0b018e);
                n.setOnSeekBarChangeListener(new zg(this));
                if (s)
                {
                    String s1 = getIntent().getStringExtra(z[1]);
                    q = new File(s1);
                    asa asa1 = Conversation.B();
                    if (asa1.a())
                    {
                        asa1.b().am = true;
                    }
                    t.setText(0x7f0e0372);
                    findViewById(0x7f0b0287).setVisibility(0);
                    ((TextView)findViewById(0x7f0b0286)).setText(0x7f0e02f1);
                    ((TextView)findViewById(0x7f0b0287)).setText(q.getName());
                    Log.i((new StringBuilder()).append(z[0]).append(s1).toString());
                    b();
                    y = 4;
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                Object obj = null;
                if (bundle != null)
                {
                    obj = bundle.getCharSequence(z[3]);
                }
                if (obj != null)
                {
                    q = new File(((CharSequence) (obj)).toString());
                    w.setProgress(w.getMax());
                    b();
                    o = 0L;
                    y = 4;
                    if (i1 == 0)
                    {
                        break label1;
                    }
                }
                obj = c1.a(this, "", (byte)2, 0, false).getAbsolutePath();
                if (App.l >= 3)
                {
                    bundle = z[4];
                } else
                {
                    bundle = z[6];
                }
                x = fm.a(((String) (obj)), bundle);
                k.setText(DateUtils.formatElapsedTime(120L));
                l.setText(DateUtils.formatElapsedTime(0L));
            }
            if (App.A() < (long)(au2.q * 1024 * 1024))
            {
                bundle = App.au;
                App.b(getApplicationContext(), 0x7f0e015f, 1);
                finish();
                return;
            }
        }
        d(y);
        m.setOnClickListener(new xr(this));
        t.setOnClickListener(new bm(this));
        p.setOnClickListener(new aom(this));
        v = new vf(this);
    }

    public Dialog onCreateDialog(int i1)
    {
        android.app.AlertDialog.Builder builder;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 0: // '\0'
            builder = new android.app.AlertDialog.Builder(this);
            break;
        }
        if (App.m())
        {
            i1 = 0x7f0e030c;
        } else
        {
            i1 = 0x7f0e030d;
        }
        builder = builder.setTitle(i1);
        if (App.m())
        {
            i1 = 0x7f0e030a;
        } else
        {
            i1 = 0x7f0e030b;
        }
        return builder.setMessage(i1).setNeutralButton(0x7f0e02ba, new a8m(this)).create();
    }

    public void onDestroy()
    {
        s s1;
        try
        {
            Log.i(z[11]);
            super.onDestroy();
            if (y == 1)
            {
                Log.i(z[12]);
            }
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            if (x != null)
            {
                x.a();
            }
        }
        catch (Exception exception1)
        {
            Log.a(exception1);
        }
        try
        {
            if (x != null)
            {
                x.b();
            }
        }
        catch (Exception exception2)
        {
            Log.a(exception2);
        }
        s1 = r;
        if (s1 != null)
        {
            Exception exception3;
            try
            {
                if (r.f())
                {
                    Log.i(z[13]);
                    r.g();
                }
            }
            catch (Exception exception4)
            {
                throw exception4;
            }
            r.d();
        }
        return;
        exception3;
        throw exception3;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (y != 0 && q != null && !s)
        {
            bundle.putCharSequence(z[10], q.getAbsolutePath());
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[15];
        obj = "q.\0270\032g*\001;\001ld\0043\tz)\025<\003\\-\0353\r9";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "e\"\030:\030b?\034";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "s'\025&\nb(\037\000\007m'\r";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "f3\000:\032m*\030\000\016j'\021\000\030b?\034";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "b>\0206\007,$\0238S#(\033;\r`8I0\030v8";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "n$\0011\034f/";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "b>\0206\007,x\023/\030";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "q.\0270\032g*\001;\001ld\027-\rb?\021";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "i\"\020";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "b)\033-\034j%\023\177\fv.T+\007#%\025+\001u.T3\001a9\025-\001f8T2\001p8\0351\017";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "f3\000:\032m*\030\000\016j'\021\000\030b?\034";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "q.\0270\032g*\001;\001ld\020:\033w9\033&";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "q.\0270\032g*\001;\001ld\020:\033w9\033&Gp?\033/\032f(\033-\ff9";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "q.\0270\032g*\001;\001ld\020:\033w9\033&Gp?\033/\030o*\r:\032";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "q.\0270\032g*\001;\001ld\004-\rs*\006:Hb>\0206\007#/\001-\tw\"\0331R";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 441
    //                   2 448
    //                   3 455;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_455;
_L3:
        byte byte1 = 104;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 3;
          goto _L9
_L5:
        byte1 = 75;
          goto _L9
_L6:
        byte1 = 116;
          goto _L9
        byte1 = 95;
          goto _L9
    }
}
