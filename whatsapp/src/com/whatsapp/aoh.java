// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.whatsapp.util.Log;
import com.whatsapp.util.s;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, MediaView, akr

class aoh
    implements android.view.View.OnClickListener
{

    private static final String z[];
    private ImageButton a;
    final MediaView b;
    private SeekBar c;

    public aoh(MediaView mediaview, SeekBar seekbar, ImageButton imagebutton)
    {
        b = mediaview;
        super();
        c = seekbar;
        a = imagebutton;
    }

    public void onClick(View view)
    {
        int i = App.am;
        int j;
        Log.i((new StringBuilder()).append(z[1]).append(c.getProgress()).append(z[2]).append(c.getMax()).append(z[3]).append(com.whatsapp.MediaView.s(b)).append(z[0]).append(5).toString());
        if (com.whatsapp.MediaView.s(b) != 5)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        j = c.getProgress();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        int i1;
        j = c.getProgress();
        i1 = c.getMax();
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        MediaView.c(b, 4);
        App.p(b);
        akr.o();
        MediaView.h(b).i();
        MediaView.u(b).sendEmptyMessage(0);
        a.setImageResource(0x7f0205d2);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        j = com.whatsapp.MediaView.s(b);
        if (j != 5)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        j = MediaView.h(b).b();
        i1 = MediaView.h(b).a();
        if (j >= i1)
        {
            int k;
            int j1;
            try
            {
                k = c.getProgress();
                j1 = c.getMax();
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (k == j1)
            {
                c.setProgress(0);
                int l;
                try
                {
                    MediaView.h(b).c();
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
                }
            }
        }
        try
        {
            App.p(b);
            akr.o();
            MediaView.h(b).i();
            MediaView.u(b).removeMessages(0);
            MediaView.u(b).sendEmptyMessage(0);
            a.setImageResource(0x7f0205d2);
            MediaView.c(b, 4);
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
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        l = com.whatsapp.MediaView.s(b);
        if (l != 4)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        MediaView.h(b).h();
        a.setImageResource(0x7f0205d3);
        MediaView.c(b, 5);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_460;
        }
        MediaView.b(b, MediaView.b(b, MediaView.o(b)));
        if (MediaView.h(b) != null)
        {
            MediaView.c(b, 4);
            MediaView.u(b).sendEmptyMessage(0);
            a.setImageResource(0x7f0205d2);
            App.p(b);
            akr.o();
            MediaView.h(b).i();
        }
        return;
        view;
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
        catch (View view) { }
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
        catch (View view) { }
        throw view;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "s$)";
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
                obj = ">=m\bI%1l\026\0072-m\bG04`\002Cs";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "s$)";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "su)";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 40;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 83;
          goto _L9
_L5:
        byte0 = 88;
          goto _L9
_L6:
        byte0 = 9;
          goto _L9
        byte0 = 97;
          goto _L9
    }
}
