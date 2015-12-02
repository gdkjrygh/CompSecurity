// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.messaging.aw;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

// Referenced classes of package com.whatsapp:
//            App, aba, de, v0, 
//            j2, me, wr, ak2, 
//            nj, lp, akh, xk, 
//            id, zb, y6, ap, 
//            a_1, eo, fn, yl, 
//            r6, asu, rt, j5, 
//            se, om, a9u, hz, 
//            yz, fk, abl, cw, 
//            l_, a8s, _v

public class Advanced extends Activity
{

    private static final String z[];

    public Advanced()
    {
    }

    static void a(Uri uri, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        Log.w(z[2]);
_L3:
        return;
        uri;
        throw uri;
_L2:
        Object obj = App.aK;
        boolean flag;
        if (((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        flag = ((File) (obj)).mkdirs();
        if (!flag)
        {
            try
            {
                Log.w(z[4]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        break MISSING_BLOCK_LABEL_51;
        uri;
        throw uri;
        s = new File(((File) (obj)), s);
        obj = new PrintStream(s);
        s = App.d.query(uri, null, null, null, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        uri = s;
        DatabaseUtils.dumpCursor(s, ((PrintStream) (obj)));
        uri = s;
        s.close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
          goto _L3
        IOException ioexception;
        ioexception;
        uri = s;
        throw ioexception;
        ioexception;
_L7:
        uri = s;
        Log.e((new StringBuilder()).append(z[3]).append(ioexception.toString()).toString());
        if (s == null) goto _L3; else goto _L4
_L4:
        s.close();
        return;
        s;
        uri = null;
_L6:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        s = null;
          goto _L7
    }

    static void a(Advanced advanced, File file, int i)
    {
        advanced.a(file, i);
    }

    private void a(File file, int i)
    {
        Object obj;
        Object obj1;
        int j = App.am;
        File afile[] = new File[i];
        i = 0;
        do
        {
            if (i >= afile.length)
            {
                break;
            }
            afile[i] = new File(file, z[0].concat(Integer.toString(i)));
            i++;
        } while (j == 0);
        SystemClock.elapsedRealtime();
        int k = afile.length;
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            file = afile[i];
            long l = SystemClock.elapsedRealtime();
            try
            {
                file.createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            if (SystemClock.elapsedRealtime() - l <= 1000L);
            i++;
        } while (j == 0);
        SystemClock.elapsedRealtime();
        k = afile.length;
        i = 0;
_L8:
        if (i >= k) goto _L2; else goto _L1
_L1:
        obj = afile[i];
        l = SystemClock.elapsedRealtime();
        file = null;
        obj = new ObjectOutputStream(new FileOutputStream(((File) (obj))));
        file = ((File) (obj));
        ((ObjectOutputStream) (obj)).writeObject(null);
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.c(file);
            }
        }
_L3:
        if (SystemClock.elapsedRealtime() - l <= 1000L);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
_L2:
        SystemClock.elapsedRealtime();
        k = afile.length;
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            file = afile[i];
            l = SystemClock.elapsedRealtime();
            file.delete();
            if (SystemClock.elapsedRealtime() - l <= 1000L);
            i++;
        } while (j == 0);
        return;
        obj1;
        obj = null;
_L6:
        file = ((File) (obj));
        Log.c(((Throwable) (obj1)));
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                Log.c(file);
            }
        }
          goto _L3
        obj1;
        obj = file;
        file = ((File) (obj1));
_L5:
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.c(((Throwable) (obj)));
            }
        }
        throw file;
        obj1;
        obj = file;
        file = ((File) (obj1));
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
          goto _L6
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z[1]);
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        ((TextView)findViewById(0x7f0b008d)).setText(Integer.toString(App.aa));
        findViewById(0x7f0b008e).setOnClickListener(new aba(this));
        findViewById(0x7f0b008f).setOnClickListener(new de(this));
        findViewById(0x7f0b0092).setOnClickListener(new v0(this));
        findViewById(0x7f0b0093).setOnClickListener(new j2(this));
        findViewById(0x7f0b0094).setOnClickListener(new me(this));
        findViewById(0x7f0b0090).setOnClickListener(new wr(this));
        findViewById(0x7f0b0091).setOnClickListener(new ak2(this));
        findViewById(0x7f0b00a3).setOnClickListener(new nj(this));
        findViewById(0x7f0b00a4).setOnClickListener(new lp(this));
        findViewById(0x7f0b0097).setOnClickListener(new akh(this));
        findViewById(0x7f0b0095).setOnClickListener(new xk(this));
        findViewById(0x7f0b0096).setOnClickListener(new id(this));
        findViewById(0x7f0b0098).setOnClickListener(new zb(this));
        findViewById(0x7f0b0099).setOnClickListener(new y6(this));
        findViewById(0x7f0b009a).setOnClickListener(new ap(this));
        bundle = (EditText)findViewById(0x7f0b009b);
        findViewById(0x7f0b009c).setOnClickListener(new a_1(this, bundle));
        findViewById(0x7f0b009d).setOnClickListener(new eo(this, bundle));
        findViewById(0x7f0b009e).setOnClickListener(new fn(this));
        findViewById(0x7f0b009f).setOnClickListener(new yl(this));
        findViewById(0x7f0b00a0).setOnClickListener(new r6(this));
        findViewById(0x7f0b00a1).setOnClickListener(new asu(this));
        findViewById(0x7f0b00a2).setOnClickListener(new rt(this));
        findViewById(0x7f0b00a5).setOnClickListener(new j5(this));
        findViewById(0x7f0b00a6).setOnClickListener(new se(this));
        findViewById(0x7f0b00a7).setOnClickListener(new om(this));
        findViewById(0x7f0b00a8).setOnClickListener(new a9u(this));
        findViewById(0x7f0b00a9).setOnClickListener(new hz(this));
        findViewById(0x7f0b00aa).setOnClickListener(new yz(this));
        ((TextView)findViewById(0x7f0b008b)).setText(aw.b(this));
        findViewById(0x7f0b00ab).setOnClickListener(new fk(this));
    }

    protected Dialog onCreateDialog(int i)
    {
        String s = String.format(App.j.a(0x7f0d002a, 3), new Object[] {
            Integer.valueOf(3)
        });
        cw cw1 = new cw(this);
        l_ l_1 = new l_(this);
        a8s a8s1 = new a8s(this);
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return (new android.app.AlertDialog.Builder(this)).setMessage(s).setCancelable(false).setPositiveButton(0x7f0e02ca, cw1).setNeutralButton(0x7f0e02ce, a8s1).setNegativeButton(0x7f0e02cc, l_1).create();

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setTitle(s).setItems(0x7f07000e, new _v(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "z;^\001gG+";
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
                obj = "R\020|\005zP\021nKwA\021k\020q";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "R\020|\005zP\021nKpF\031z\020uQ\030oKrZ\030o\nu^\021*\rg\023\032\177\bx";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "R\020|\005zP\021nKpF\031z\020uQ\030oK}\\Yo\026f\\\006*";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "R\020|\005zP\021nKpF\031z\020uQ\030oKwR\032d\013`\023\027x\001uG\021*\000}A";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 20;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 51;
          goto _L9
_L5:
        byte1 = 116;
          goto _L9
_L6:
        byte1 = 10;
          goto _L9
        byte1 = 100;
          goto _L9
    }
}
