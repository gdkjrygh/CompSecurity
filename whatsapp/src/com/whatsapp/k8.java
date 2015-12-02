// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, MediaData, aoz, Conversation

class k8
    implements Runnable
{

    private static final String z[];
    int a;
    final Conversation b;
    final Handler c;
    final c4 d;

    k8(Conversation conversation, c4 c4_1, Handler handler)
    {
        b = conversation;
        d = c4_1;
        c = handler;
        super();
        a = 0;
    }

    public void run()
    {
        c4 c4_1;
        int i;
        i = App.am;
        c4_1 = new c4(new a(d.y.a, d.y.b, (new StringBuilder()).append(z[0]).append(Long.toString(System.currentTimeMillis())).toString()));
        c4_1.G = d.G;
        if (d.f != 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        c4_1.a(d.e());
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        Bitmap bitmap;
        byte abyte0[];
        Object obj;
        Canvas canvas;
        Object obj1;
        try
        {
            c4_1.a(d.a());
        }
        catch (IOException ioexception1)
        {
            throw ioexception1;
        }
        try
        {
            c4_1.I = d.I;
            c4_1.M = d.M;
            c4_1.o = d.o;
            c4_1.v = d.v;
            c4_1.l = d.l;
            c4_1.w = d.w;
            c4_1.e = d.e;
            c4_1.t = d.t;
            c4_1.H = d.H;
            c4_1.n = d.n;
            c4_1.L = d.L;
            c4_1.B = d.B;
            if (d.w == 0)
            {
                c4_1.a((new StringBuilder()).append(c4_1.e()).append(z[2]).append(a).append(")").toString());
            }
        }
        catch (IOException ioexception2)
        {
            throw ioexception2;
        }
        if (d.w != 1)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = y.a(d);
        bitmap = Bitmap.createBitmap(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((Bitmap) (obj)).getConfig());
        canvas = new Canvas(bitmap);
        obj1 = new Paint();
        ((Paint) (obj1)).setAntiAlias(true);
        ((Paint) (obj1)).setFilterBitmap(true);
        ((Paint) (obj1)).setDither(true);
        canvas.drawBitmap(((Bitmap) (obj)), 0.0F, 0.0F, ((Paint) (obj1)));
        obj1 = new TextPaint();
        ((TextPaint) (obj1)).setAntiAlias(true);
        ((TextPaint) (obj1)).setColor(-1);
        ((TextPaint) (obj1)).setTextSize(36F);
        ((TextPaint) (obj1)).setTypeface(Typeface.DEFAULT_BOLD);
        ((TextPaint) (obj1)).setTextAlign(android.graphics.Paint.Align.CENTER);
        canvas.drawText(Integer.toString(a), ((Bitmap) (obj)).getWidth() / 2, ((Bitmap) (obj)).getHeight() / 2, ((Paint) (obj1)));
        obj = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, ((java.io.OutputStream) (obj)));
        abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
        c4_1.f = 1;
        c4_1.a(abyte0);
        if (c4_1.y.b)
        {
            MediaData mediadata = new MediaData();
            String s = c1.b(1);
            mediadata.file = com.whatsapp.App.a((new StringBuilder()).append(s).append(z[1]).toString(), (byte)1, true);
            IOException ioexception;
            try
            {
                c1.a(((MediaData)c4_1.B).file, mediadata.file);
            }
            catch (IOException ioexception6)
            {
                Log.a(ioexception6);
            }
            try
            {
                com.whatsapp.App.a(d.y.a, c4_1.a(), mediadata, c4_1.w, c4_1.n);
            }
            catch (IOException ioexception3)
            {
                throw ioexception3;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_596;
            }
        }
        App.ah.g(c4_1);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        try
        {
            App.ah.g(c4_1);
        }
        catch (IOException ioexception4)
        {
            throw ioexception4;
        }
        try
        {
            i = a + 1;
            a = i;
        }
        catch (IOException ioexception5)
        {
            throw ioexception5;
        }
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        c.postDelayed(this, 2000L);
        return;
        ioexception;
        throw ioexception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "}\032PTNj\023LN\006$";
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
                obj = "'\025SG";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = ")W";
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
        char c2 = obj[j];
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
        byte byte0 = 99;
_L9:
        obj[j] = (char)(byte0 ^ c2);
        j++;
          goto _L8
_L4:
        byte0 = 9;
          goto _L9
_L5:
        byte0 = 127;
          goto _L9
_L6:
        byte0 = 35;
          goto _L9
        byte0 = 32;
          goto _L9
    }
}
