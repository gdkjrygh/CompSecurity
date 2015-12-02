// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.cl;
import com.whatsapp.util.m;
import g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import l;

// Referenced classes of package com.whatsapp:
//            ConversationRow, at8, aob, App

public class ConversationRowContact extends ConversationRow
{

    private static final String N;
    private final TextView J = (TextView)findViewById(0x7f0b015b);
    private final ImageView K = (ImageView)findViewById(0x7f0b012a);
    private final ImageView L = (ImageView)findViewById(0x7f0b015c);
    private final Button M = (Button)findViewById(0x7f0b015d);

    ConversationRowContact(Context context, c4 c4_1)
    {
        super(context, c4_1);
        Button button = M;
        context = context.getResources();
        int i;
        if (c4_1.y.b)
        {
            i = 0x7f0205a8;
        } else
        {
            i = 0x7f0205a7;
        }
        button.setBackgroundDrawable(new m(context.getDrawable(i)));
        context = new at8(this, null);
        J.setOnClickListener(context);
        M.setOnClickListener(context);
        b(c4_1);
    }

    private void b(c4 c4_1)
    {
        android.graphics.Bitmap bitmap;
        Object obj2;
        obj2 = null;
        J.setText(c.b(c4_1.L, getContext(), J.getPaint()));
        Object obj;
        byte abyte0[];
        int i;
        try
        {
            obj = g.i(c4_1.e());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.c(unsupportedencodingexception);
            unsupportedencodingexception = null;
        }
        catch (IOException ioexception)
        {
            Log.a(ioexception);
            ioexception = null;
        }
        catch (l l1)
        {
            Log.c(l1);
            l1 = null;
        }
        bitmap = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        abyte0 = ((g) (obj)).m;
        bitmap = obj2;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        try
        {
            i = ((g) (obj)).m.length;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        bitmap = obj2;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = Base64.decode(((g) (obj)).m, 0);
        bitmap = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length);
_L2:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        K.setImageDrawable(new aob(getContext(), cl.a(getContext()), c4_1.y.b));
        obj = (ImageView)findViewById(0x7f0b015c);
        ((ImageView) (obj)).setImageBitmap(bitmap);
        ((ImageView) (obj)).setVisibility(0);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        K.setImageDrawable(new aob(getContext(), cl.b(getContext()), c4_1.y.b));
        L.setVisibility(8);
        return;
        c4_1;
        throw c4_1;
        Object obj1;
        obj1;
_L3:
        Log.a(N, ((Throwable) (obj1)));
        bitmap = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        c4_1;
        throw c4_1;
        obj1;
          goto _L3
        obj1;
          goto _L3
    }

    public void a(c4 c4_1, boolean flag)
    {
        c4 c4_2 = C;
        if (c4_2 != c4_1 || flag)
        {
            try
            {
                b(c4_1);
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        super.a(c4_1, flag);
        return;
        c4_1;
        throw c4_1;
    }

    protected int n()
    {
        return 0x7f03003e;
    }

    protected int q()
    {
        return 0x7f03003f;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "-(J`\005<4Eb\t!)\td\0179jGy\016:&GbO-(Jb\001-3\tb\b;*F9\002/4A Tc#Au\017*\"\013s\022<(V".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            N = (new String(ac)).intern();
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
        byte byte0 = 96;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 78;
          goto _L8
_L3:
        byte0 = 71;
          goto _L8
_L4:
        byte0 = 36;
          goto _L8
        byte0 = 22;
          goto _L8
    }
}
