// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            atg, App

public class ConversationTextEntry extends EditText
{

    private static boolean b;
    private static final android.text.Editable.Factory c;
    private static final String z[];
    private int a;

    public ConversationTextEntry(Context context)
    {
        super(context);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!b)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        setEditableFactory(c);
        return;
        context;
        throw context;
    }

    public ConversationTextEntry(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (!b)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        setEditableFactory(c);
        return;
        context;
        throw context;
    }

    public ConversationTextEntry(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        if (!b)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        setEditableFactory(c);
        return;
        context;
        throw context;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        if (a != 0)
        {
            int i = editorinfo.imeOptions & 0xff;
            try
            {
                if ((a & i) != 0)
                {
                    editorinfo.imeOptions = i ^ editorinfo.imeOptions;
                    editorinfo.imeOptions = editorinfo.imeOptions | a;
                }
            }
            // Misplaced declaration of an exception variable
            catch (EditorInfo editorinfo)
            {
                throw editorinfo;
            }
            try
            {
                if ((editorinfo.imeOptions & 0x40000000) != 0)
                {
                    editorinfo.imeOptions = editorinfo.imeOptions & 0xbfffffff;
                }
            }
            // Misplaced declaration of an exception variable
            catch (EditorInfo editorinfo)
            {
                throw editorinfo;
            }
        }
        return inputconnection;
    }

    public void setInputEnterAction(int i)
    {
label0:
        {
            a = i;
            setRawInputType(0x2c001);
            int j = 4;
            if (i == 0)
            {
                j = 0x40000004;
            }
            i = j;
            boolean flag;
            try
            {
                if (android.os.Build.VERSION.SDK_INT < 14)
                {
                    break label0;
                }
                flag = z[1].equals(android.provider.Settings.Secure.getString(App.d, z[0]));
            }
            catch (SecurityException securityexception)
            {
                throw securityexception;
            }
            i = j;
            if (flag)
            {
                i = j | 0x10000000;
            }
        }
        setImeOptions(i);
    }

    public void setInputEnterDone(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 6;
        } else
        {
            byte0 = 0;
        }
        setInputEnterAction(byte0);
    }

    public void setInputEnterSend(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setInputEnterAction(byte0);
    }

    static 
    {
        Object obj;
        String as[];
        int i;
        int j;
        as = new String[2];
        obj = "|{I'Dtjp/_hk[\031\\}jG)U";
        i = -1;
        j = 0;
_L13:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L11:
        if (l > k) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        i;
        JVM INSTR tableswitch 0 0: default 68
    //                   0 85;
           goto _L3 _L4
_L3:
        as1[j] = ((String) (obj));
        obj = "{qBhYl}\001'_|l@/U6v[%Xu{\000hyL]f\013tK{]0X{{";
        j = 1;
        i = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[j] = ((String) (obj));
        z = as;
        b = false;
        obj = "hl@%Tkm{)bmn_)Cl[B)[q".toCharArray();
        j = obj.length;
        i = 0;
          goto _L5
_L2:
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 212
    //                   0 233
    //                   1 239
    //                   2 245
    //                   3 251;
           goto _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_251;
_L6:
        byte0 = 49;
_L12:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L11
_L7:
        byte0 = 24;
          goto _L12
_L8:
        byte0 = 30;
          goto _L12
_L9:
        byte0 = 47;
          goto _L12
        byte0 = 70;
          goto _L12
        if (true) goto _L13; else goto _L2
_L5:
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c1;
            try
            {
                android/text/Layout.getDeclaredMethod(((String) (obj)), new Class[] {
                    java/lang/CharSequence, Integer.TYPE, Integer.TYPE
                });
                b = true;
            }
            catch (SecurityException securityexception) { }
            catch (NoSuchMethodException nosuchmethodexception) { }
            c = new atg();
            return;
        }
        k = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 296
    //                   0 317
    //                   1 323
    //                   2 329
    //                   3 335;
           goto _L14 _L15 _L16 _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_335;
_L14:
        byte0 = 49;
_L19:
        obj[i] = (char)(byte0 ^ k);
        i++;
          goto _L5
_L15:
        byte0 = 24;
          goto _L19
_L16:
        byte0 = 30;
          goto _L19
_L17:
        byte0 = 47;
          goto _L19
        byte0 = 70;
          goto _L19
    }
}
