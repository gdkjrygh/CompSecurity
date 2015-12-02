// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, afn, _p, za

class ak9
    implements android.view.View.OnClickListener
{

    private static final String z;
    final afn a;

    ak9(afn afn1)
    {
        a = afn1;
        super();
    }

    public void onClick(View view)
    {
        int i;
        int j = 0;
        int k = App.am;
        int l = ((Integer)view.getTag()).intValue();
        view = afn.b().iterator();
        boolean flag = false;
label0:
        do
        {
label1:
            {
                if (!view.hasNext())
                {
                    break label0;
                }
                EmojiPicker.EmojiWeight emojiweight = (EmojiPicker.EmojiWeight)view.next();
                try
                {
                    if (emojiweight.code == l)
                    {
                        break label1;
                    }
                    emojiweight.weight = emojiweight.weight * 0.9F;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (k == 0)
                {
                    continue;
                }
            }
            emojiweight.weight = emojiweight.weight + 1.0F;
            flag = true;
        } while (k == 0);
        if (!flag)
        {
            try
            {
                afn.b().add(new EmojiPicker.EmojiWeight(l, 1.0F));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        Collections.sort(afn.b(), afn.g(a));
        i = afn.b().size() - 1;
_L2:
label2:
        {
            if (i > 35)
            {
                try
                {
                    if (((EmojiPicker.EmojiWeight)afn.b().get(i)).weight < 0.1F)
                    {
                        afn.b().remove(i);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (k == 0)
                {
                    break MISSING_BLOCK_LABEL_346;
                }
            }
            try
            {
                view = new ObjectOutputStream(new FileOutputStream(new File(App.au.getFilesDir(), z)));
                view.writeObject(afn.b());
                view.close();
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
            try
            {
                if (afn.a() != 0)
                {
                    afn.f(a)[0].notifyDataSetChanged();
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (afn.d(a) == null)
            {
                break label2;
            }
            view = c.e(l);
            if (view == null)
            {
                try
                {
                    afn.d(a).a(c.b(l));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    throw view;
                }
                if (k == 0)
                {
                    break label2;
                }
            }
            l = view.length;
            i = j;
            do
            {
                if (i >= l)
                {
                    break;
                }
                j = view[i];
                afn.d(a).a(j);
                i++;
            } while (k == 0);
        }
        return;
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "dNkZn".toCharArray();
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
    //                   3 102;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_102;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 7;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 1;
          goto _L8
_L3:
        byte0 = 35;
          goto _L8
_L4:
        byte0 = 4;
          goto _L8
        byte0 = 48;
          goto _L8
    }
}
