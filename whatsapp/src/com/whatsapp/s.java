// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.whatsapp:
//            Conversation, App, k, og, 
//            a1g, asd, ConversationRow, aoz, 
//            iz, abl

class s extends CursorAdapter
{

    private static final String z[];
    private int a;
    final Conversation b;
    private Object c;

    public s(Conversation conversation, Context context, Cursor cursor, boolean flag)
    {
        b = conversation;
        super(context, cursor, flag);
    }

    private int a()
    {
        return getCursor().getCount() - Conversation.ad(b);
    }

    private int a(c4 c4_1, boolean flag, asd asd1)
    {
        TextPaint textpaint = new TextPaint();
        textpaint.setTextSize(b.getResources().getDimension(0x7f0a0023));
        int i = a((new StringBuilder()).append(q.f(b.getBaseContext(), com.whatsapp.App.q(c4_1))).append(" ").toString(), textpaint);
        textpaint.setTextSize(b.getResources().getDimension(0x7f0a0034));
        i = a(c4_1.e(), textpaint) + (0 + i);
        if (flag)
        {
            textpaint.setTextSize(b.getResources().getDimension(0x7f0a002d));
            int j = a(App.az.e(c4_1.G).a(b), textpaint);
            float f = j;
            try
            {
                asd1.e = f + Conversation.S(b).t;
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
            if (j > i)
            {
                i = j;
            }
        }
        return i + Conversation.S(b).v;
    }

    static int a(s s1)
    {
        return s1.a();
    }

    private int a(String s1, TextPaint textpaint)
    {
        int i = 0;
        int j = App.am;
        if (s1 == null)
        {
            return 0;
        }
        float f = 0.0F;
        float af[] = new float[s1.length()];
        textpaint.getTextWidths(s1, 0, s1.length(), af);
        float f1;
        do
        {
            f1 = f;
            if (i >= af.length)
            {
                break;
            }
            f1 = f + af[i];
            i++;
            f = f1;
        } while (j == 0);
        return (int)f1;
    }

    private void a(int i)
    {
        int l;
        int i1;
        l = App.am;
        i1 = getCursor().getCount();
        if (i >= i1) goto _L2; else goto _L1
_L1:
        int j = i;
_L8:
        if (j >= i1) goto _L4; else goto _L3
_L3:
        if ((c4)Conversation.u(b).get(Integer.valueOf(j)) != null)
        {
            try
            {
                Conversation.u(b).remove(Integer.valueOf(j));
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        if (l == 0) goto _L5; else goto _L4
_L4:
        if (l == 0) goto _L6; else goto _L2
_L2:
        Log.w(z[8]);
        Conversation.l(b).remove(i - i1);
_L6:
        return;
_L5:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(ConversationRow conversationrow, int i, c4 c4_1, c4 c4_2, c4 c4_3, boolean flag)
    {
        int j;
        int l;
        int i1;
        int j1;
        boolean flag1;
        int j2;
        j2 = App.am;
        j = 0;
        flag1 = false;
        i1 = 0;
        j1 = 0;
        l = j;
        if (c4_2 == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        byte byte1 = c4_2.w;
        l = j;
        if (byte1 != 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        boolean flag2 = c4_2.y.b;
        l = j;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        l = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        Object obj = c4_2.G;
        Object obj1;
        l = ((flag1) ? 1 : 0);
        if (obj != null)
        {
            asd asd1;
            byte byte0;
            boolean flag3;
            try
            {
                flag = c4_2.G.equals(c4_1.G);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
            l = j;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            l = 1;
            j = 1;
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            l = j;
        }
        try
        {
            Log.e((new StringBuilder()).append(z[9]).append(Log.a(c4_2)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            throw conversationrow;
        }
        if (c4_3 != null)
        {
            try
            {
                flag = q.b(c4_3.I, c4_1.I);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        } else
        {
            flag = false;
        }
        j = i1;
        if (c4_3 == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        byte0 = c4_3.w;
        j = i1;
        if (byte0 != 0)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        flag3 = c4_3.y.b;
        j = i1;
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        j = i1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        obj = c4_3.G;
        j = j1;
        if (obj != null)
        {
            try
            {
                flag = c4_3.G.equals(c4_1.G);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
            j = i1;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_310;
            }
            j = 1;
            i1 = 1;
            if (j2 == 0)
            {
                break MISSING_BLOCK_LABEL_310;
            }
            j = i1;
        }
        try
        {
            Log.e((new StringBuilder()).append(z[15]).append(Log.a(c4_3)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            throw conversationrow;
        }
        if (l == 0 || j == 0)
        {
            break MISSING_BLOCK_LABEL_2246;
        }
        try
        {
            Log.i((new StringBuilder()).append(z[10]).append(i).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            throw conversationrow;
        }
        obj = c4_1;
        i1 = i - 1;
        i = l;
        c4_1 = c4_2;
        c4_2 = ((c4) (obj));
        l = i1;
_L54:
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (l < 0) goto _L4; else goto _L3
_L3:
        l--;
        c4_3 = (c4)getItem(l);
_L56:
        i = l;
_L41:
        if (c4_3 != null)
        {
            try
            {
                flag = q.b(c4_3.I, c4_1.I);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        } else
        {
            flag = false;
        }
        if (c4_3 == null) goto _L6; else goto _L5
_L5:
        l = c4_3.w;
        if (l != 0) goto _L6; else goto _L7
_L7:
        flag3 = c4_3.y.b;
        if (flag3 || !flag) goto _L6; else goto _L8
_L8:
        try
        {
            flag = c4_3.G.equals(c4_1.G);
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            throw conversationrow;
        }
        if (!flag) goto _L6; else goto _L9
_L9:
        l = 1;
        if (j2 == 0) goto _L10; else goto _L6
_L6:
        l = 0;
        if (j2 == 0) goto _L10; else goto _L11
_L11:
        obj = c4_2;
        l = 0;
        c4_2 = c4_1;
        c4_1 = ((c4) (obj));
_L55:
        i1 = i + 1;
        Log.i((new StringBuilder()).append(z[12]).append(i1).toString());
        asd1 = new asd(1, c4_2);
        i = a(c4_2, true, asd1);
        obj = new asd(asd1, true, c4_1);
        asd1.b = ((asd) (obj));
        Conversation.r.put(c4_2.y, asd1);
        obj1 = null;
        i1++;
_L53:
        if (j == 0 || c4_1 == null && j2 == 0) goto _L13; else goto _L12
_L12:
        j1 = a(c4_1, false, ((asd) (null)));
        Object obj2;
        if (obj1 != null)
        {
            c4_2 = new asd(((asd) (obj1)), true, c4_1);
            obj1.b = c4_2;
        } else
        {
            c4_2 = ((c4) (obj));
        }
        if (j1 > i)
        {
            i = j1;
        }
        Conversation.r.put(c4_1.y, c4_2);
        if (i1 < 0) goto _L15; else goto _L14
_L14:
        i1++;
        obj = (c4)getItem(i1);
        j = i1;
_L44:
        if (obj != null)
        {
            try
            {
                flag = q.b(((c4) (obj)).I, c4_1.I);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        } else
        {
            flag = false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_777;
        }
        i1 = ((c4) (obj)).w;
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_777;
        }
        flag3 = ((c4) (obj)).y.b;
        if (!flag3 && flag)
        {
            try
            {
                flag = ((c4) (obj)).G.equals(c4_1.G);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
            if (flag)
            {
                i1 = 1;
                if (j2 == 0)
                {
                    break MISSING_BLOCK_LABEL_780;
                }
            }
        }
        i1 = 0;
        if (i1 != 0)
        {
            j1 = 2;
        } else
        {
            j1 = 3;
        }
        c4_2.a = j1;
        if (j2 == 0) goto _L17; else goto _L16
_L16:
        c4_2 = c4_1;
        c4_1 = ((c4) (obj));
        j1 = i;
        i = i1;
        i1 = j1;
_L52:
        try
        {
            conversationrow.k = 2;
            conversationrow.o();
            a(asd1, i1, false);
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            try
            {
                throw conversationrow;
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        }
        if (j2 == 0) goto _L19; else goto _L18
_L18:
        j1 = l;
        obj = c4_1;
        c4_1 = c4_3;
        c4_3 = ((c4) (obj));
        i1 = i;
        l = j;
        i = j1;
_L57:
        j = i;
        obj = c4_2;
        j1 = l;
        if (i == 0) goto _L21; else goto _L20
_L20:
        j = i;
        obj = c4_2;
        j1 = l;
        if (i1 != 0) goto _L21; else goto _L22
_L22:
        asd1 = new asd(3, c4_2);
        j = a(c4_2, true, asd1);
        obj1 = new asd(asd1, false, c4_1);
        asd1.d = ((asd) (obj1));
        Conversation.r.put(c4_2.y, asd1);
        obj2 = null;
        j1 = l - 1;
        l = j;
        j = i;
        i = l;
        obj = c4_2;
        l = j1;
_L51:
        if (j == 0 || c4_1 == null && j2 == 0) goto _L24; else goto _L23
_L23:
        j1 = a(c4_1, false, ((asd) (null)));
        if (obj2 != null)
        {
            c4_2 = new asd(((asd) (obj2)), false, c4_1);
            obj2.d = c4_2;
        } else
        {
            c4_2 = ((c4) (obj1));
        }
        if (j1 > i)
        {
            i = j1;
        }
        Conversation.r.put(c4_1.y, c4_2);
        if (l < 0) goto _L26; else goto _L25
_L25:
        l--;
        obj = (c4)getItem(l);
        j = l;
_L47:
        if (obj != null)
        {
            try
            {
                flag = q.b(((c4) (obj)).I, c4_1.I);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        } else
        {
            flag = false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1157;
        }
        l = ((c4) (obj)).w;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_1157;
        }
        flag3 = ((c4) (obj)).y.b;
        if (!flag3 && flag)
        {
            try
            {
                flag = ((c4) (obj)).G.equals(c4_1.G);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
            if (flag)
            {
                l = 1;
                if (j2 == 0)
                {
                    break MISSING_BLOCK_LABEL_1160;
                }
            }
        }
        l = 0;
        if (l != 0)
        {
            j1 = 2;
        } else
        {
            j1 = 1;
        }
        c4_2.a = j1;
        if (j2 == 0) goto _L28; else goto _L27
_L27:
        j1 = l;
        l = j;
        j = j1;
_L46:
        try
        {
            conversationrow.k = 3;
            conversationrow.o();
            a(asd1, i, true);
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow)
        {
            try
            {
                throw conversationrow;
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        }
        if (j2 == 0) goto _L19; else goto _L29
_L29:
        j1 = l;
        obj = c4_1;
_L21:
        if (j != 0 || i1 == 0) goto _L19; else goto _L30
_L30:
        obj1 = new asd(1, ((c4) (obj)));
        i = a(((c4) (obj)), true, ((asd) (obj1)));
        c4_2 = new asd(((asd) (obj1)), true, c4_3);
        obj1.b = c4_2;
        Conversation.r.put(((c4) (obj)).y, obj1);
        c4_1 = null;
        j = j1 + 1;
        l = i1;
_L50:
        i1 = i;
        if (l == 0) goto _L32; else goto _L31
_L31:
        if (c4_3 != null) goto _L34; else goto _L33
_L33:
        i1 = i;
        if (j2 == 0) goto _L32; else goto _L34
_L34:
        l = a(c4_3, false, ((asd) (null)));
        if (c4_1 != null)
        {
            c4_2 = new asd(c4_1, true, c4_3);
            c4_1.b = c4_2;
            c4_1 = c4_2;
        } else
        {
            c4_1 = c4_2;
        }
        if (l > i)
        {
            i = l;
        }
        Conversation.r.put(c4_3.y, c4_1);
        if (j < 0) goto _L36; else goto _L35
_L35:
        j++;
        c4_2 = (c4)getItem(j);
_L49:
        if (c4_2 != null)
        {
            try
            {
                flag = q.b(c4_2.I, c4_3.I);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
        } else
        {
            flag = false;
        }
        if (c4_2 == null)
        {
            break MISSING_BLOCK_LABEL_1486;
        }
        l = c4_2.w;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_1486;
        }
        flag3 = c4_2.y.b;
        if (!flag3 && flag)
        {
            try
            {
                flag = c4_2.G.equals(c4_3.G);
            }
            // Misplaced declaration of an exception variable
            catch (ConversationRow conversationrow)
            {
                throw conversationrow;
            }
            if (flag)
            {
                l = 1;
                if (j2 == 0)
                {
                    break MISSING_BLOCK_LABEL_1489;
                }
            }
        }
        l = 0;
        if (l != 0)
        {
            i1 = 2;
        } else
        {
            i1 = 3;
        }
        c4_1.a = i1;
        if (j2 == 0) goto _L38; else goto _L37
_L37:
        i1 = i;
_L32:
        conversationrow.k = 1;
        conversationrow.o();
        a(((asd) (obj1)), i1, false);
_L19:
        return;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
        c4_3;
        Log.e((new StringBuilder()).append(z[19]).append(b.U.getCount()).append(z[11]).append(l).toString());
        if (j2 == 0) goto _L40; else goto _L39
_L39:
        i = l;
        c4_3 = c4_1;
          goto _L41
        conversationrow;
        throw conversationrow;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
        obj;
        Log.e((new StringBuilder()).append(z[16]).append(b.U.getCount()).append(z[17]).append(i1).toString());
        c4_2.a = 3;
        if (j2 == 0) goto _L43; else goto _L42
_L42:
        j = i1;
        obj = null;
          goto _L44
        conversationrow;
        throw conversationrow;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
        obj;
        Log.e((new StringBuilder()).append(z[20]).append(b.U.getCount()).append(z[13]).append(l).toString());
        c4_2.a = 1;
        if (j2 == 0) goto _L46; else goto _L45
_L45:
        obj = null;
        j = l;
          goto _L47
        conversationrow;
        throw conversationrow;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
        c4_2;
        Log.e((new StringBuilder()).append(z[14]).append(b.U.getCount()).append(z[18]).append(j).toString());
        c4_1.a = 3;
        if (j2 == 0) goto _L37; else goto _L48
_L48:
        c4_2 = null;
          goto _L49
        conversationrow;
        throw conversationrow;
        conversationrow;
        try
        {
            throw conversationrow;
        }
        // Misplaced declaration of an exception variable
        catch (ConversationRow conversationrow) { }
        throw conversationrow;
_L38:
        c4_3 = c4_2;
        c4_2 = c4_1;
          goto _L50
_L36:
        c4_2 = null;
          goto _L49
_L24:
        c4_1 = ((c4) (obj));
          goto _L46
_L28:
        obj1 = c4_2;
        j1 = l;
        obj2 = c4_1;
        c4_1 = ((c4) (obj));
        l = j;
        obj = obj2;
        j = j1;
        obj2 = c4_2;
          goto _L51
_L26:
        j = l;
        obj = null;
          goto _L47
_L13:
        int k1 = i1;
        i1 = i;
        i = j;
        j = k1;
          goto _L52
_L17:
        int l1 = i1;
        Object obj3 = obj;
        obj = c4_2;
        i1 = j;
        j = l1;
        obj1 = c4_2;
        c4_2 = c4_1;
        c4_1 = ((c4) (obj3));
          goto _L53
_L43:
        int i2 = i1;
        obj = null;
        i1 = i;
        i = j;
        j = i2;
        c4_2 = c4_1;
        c4_1 = ((c4) (obj));
          goto _L52
_L15:
        j = i1;
        obj = null;
          goto _L44
_L10:
        i1 = l;
        c4 c4_4 = c4_2;
        c4_2 = c4_1;
        c4_1 = c4_3;
        l = i;
        c4_3 = c4_4;
        i = i1;
          goto _L54
_L40:
        c4_3 = c4_2;
        c4_2 = c4_1;
        i1 = l;
        c4 c4_5 = c4_1;
        c4_1 = c4_3;
        l = i;
        c4_3 = c4_5;
        i = i1;
          goto _L55
_L4:
        c4_3 = c4_1;
          goto _L56
_L2:
        i1 = l;
        c4 c4_6 = c4_1;
        c4_1 = c4_3;
        l = i;
        c4_3 = c4_6;
        i = i1;
          goto _L55
        c4 c4_7 = c4_2;
        i1 = i;
        i = l;
        c4_2 = c4_1;
        l = i1;
        i1 = j;
        c4_1 = c4_7;
          goto _L57
    }

    private void a(asd asd1, int i, boolean flag)
    {
        int j = App.am;
_L2:
        if (asd1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            asd1.a(i);
        }
        // Misplaced declaration of an exception variable
        catch (asd asd1)
        {
            throw asd1;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        asd1 = asd1.d;
_L3:
        if (j == 0) goto _L2; else goto _L1
_L1:
        return;
        asd1 = asd1.b;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    static void a(s s1, int i)
    {
        s1.a(i);
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
    }

    public int getCount()
    {
        int i;
        i = 0;
        boolean flag;
        try
        {
            flag = Conversation.ak(b);
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (getCursor() == null)
        {
            return 0;
        }
        int j;
        int l;
        int i1;
        try
        {
            j = getCursor().getCount();
            l = Conversation.l(b).size();
            i1 = Conversation.ad(b);
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        if (i1 > 0)
        {
            i = 1;
        }
        return i + (j + l);
        return 0;
    }

    public Object getItem(int i)
    {
        int i2;
        i2 = getCursor().getCount();
        Object obj;
        c4 c4_2;
        int j;
        try
        {
            j = Conversation.ad(b);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (j > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i - j >= i2)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        c4_2 = (c4)Conversation.u(b).get(Integer.valueOf(i));
        obj = c4_2;
        if (c4_2 != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        j = Conversation.ad(b);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        j = a();
        if (i != j)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        IllegalStateException illegalstateexception1;
        try
        {
            if (c == null)
            {
                c = new c4(null, z[3], null);
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        obj = c;
        return obj;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
label0:
        {
label1:
            {
                c4 c4_1;
                int l;
                int j1;
                try
                {
                    if (Conversation.ad(b) <= 0)
                    {
                        break label1;
                    }
                    l = a();
                }
                catch (IllegalStateException illegalstateexception3)
                {
                    throw illegalstateexception3;
                }
                if (i > l)
                {
                    l = i - 1;
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
            }
            l = i;
        }
        j1 = b.U.getCursor().getPosition();
        b.U.getCursor().moveToPosition(i2 - 1 - l);
        l = b.U.getCursor().getPosition();
        c4_1 = App.ah.a(b.U.getCursor(), b.A);
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        try
        {
            j1 = a;
        }
        catch (IllegalStateException illegalstateexception4)
        {
            try
            {
                throw illegalstateexception4;
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
        }
        if (l <= j1)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        if (l <= a + 50)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        a = Math.max(0, l - 50);
        b.U.getCursor().moveToPosition(a);
        Conversation.u(b).put(Integer.valueOf(i), c4_1);
        return c4_1;
        int k1 = i - i2;
        int i1;
        int j2;
        try
        {
            j2 = Conversation.ad(b);
        }
        catch (IllegalStateException illegalstateexception6)
        {
            throw illegalstateexception6;
        }
        i1 = k1;
        if (j2 > 0)
        {
            i1 = k1 - 1;
        }
        if (i1 >= 0)
        {
            int l1;
            try
            {
                l1 = Conversation.l(b).size();
            }
            catch (IllegalStateException illegalstateexception7)
            {
                throw illegalstateexception7;
            }
            if (i1 < l1)
            {
                return (c4)Conversation.l(b).get(i1);
            }
        }
        Log.w((new StringBuilder()).append(z[1]).append(i).append(z[2]).append(i2).append(z[0]).append(Conversation.l(b).size()).toString());
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        boolean flag;
        try
        {
            flag = Conversation.ak(b);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag)
        {
            return -1;
        }
        int j;
        try
        {
            j = Conversation.ad(b);
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (i == a())
        {
            return 18;
        }
        return Conversation.f((c4)getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        c4 c4_1;
        int j;
        j = App.am;
        c4_1 = (c4)getItem(i);
        int l = c4_1.w;
        if (l == 8)
        {
            try
            {
                if (App.l >= 3)
                {
                    throw new IllegalStateException(z[5]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        break MISSING_BLOCK_LABEL_55;
        view;
        throw view;
        if (Conversation.ad(b) <= 0) goto _L2; else goto _L1
_L1:
        l = a();
        if (i != l) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = com.whatsapp.iz.a((LayoutInflater)b.getSystemService(z[6]), 0x7f030051, viewgroup, false);
        ((TextView)((View) (obj)).findViewById(0x7f0b018c)).setText(String.format(App.j.a(0x7f0d002c, Conversation.k(b)), new Object[] {
            Integer.valueOf(Conversation.k(b))
        }));
_L14:
        return ((View) (obj));
        view;
        throw view;
_L2:
        if (view == null) goto _L5; else goto _L4
_L4:
        viewgroup = ((ViewGroup) (view.getTag()));
        if (viewgroup == null) goto _L5; else goto _L6
_L6:
        int i1;
        l = Conversation.f(c4_1);
        i1 = Conversation.f((c4)view.getTag());
        if (l != i1) goto _L5; else goto _L7
_L7:
        boolean flag = Conversation.G(b).contains(c4_1);
        if (flag) goto _L9; else goto _L8
_L8:
        viewgroup = Conversation.H(b);
        if (viewgroup != null) goto _L9; else goto _L10
_L10:
        try
        {
            viewgroup = Conversation.m(b);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (viewgroup == null) goto _L11; else goto _L9
_L9:
        flag = true;
_L18:
        view = (ConversationRow)view;
        view.a(c4_1, flag);
        Conversation.G(b).remove(c4_1);
        if (j == 0) goto _L12; else goto _L5
_L5:
        viewgroup = com.whatsapp.Conversation.a(b, c4_1);
        view = viewgroup;
        if (viewgroup == null)
        {
            byte byte0;
            boolean flag1;
            try
            {
                Log.w((new StringBuilder()).append(z[4]).append(Log.a(c4_1)).toString());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            view = viewgroup;
        }
_L12:
        if (i == 0)
        {
            try
            {
                view.a(true);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_538;
            }
        }
        viewgroup = (c4)getItem(i - 1);
        flag = q.b(((c4) (viewgroup)).I, c4_1.I);
        if (!flag)
        {
            try
            {
                view.a(true);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_381;
            }
        }
        view.a(false);
_L19:
        try
        {
            flag1 = Conversation.aj(b);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
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
        obj = view;
        if (!flag1) goto _L14; else goto _L13
_L13:
        obj = view;
        if (c4_1.y.b) goto _L14; else goto _L15
_L15:
        view.h();
        byte0 = c4_1.w;
        obj = view;
        if (byte0 != 0) goto _L14; else goto _L16
_L16:
        obj = (asd)Conversation.r.get(c4_1.y);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            view.k = ((asd) (obj)).a;
            view.o();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        obj = view;
        if (j == 0) goto _L14; else goto _L17
_L17:
        a(view, i, c4_1, viewgroup, (c4)getItem(i + 1), flag);
        return view;
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
        throw view;
_L11:
        flag = false;
          goto _L18
        flag = false;
        viewgroup = null;
          goto _L19
    }

    public int getViewTypeCount()
    {
        int i;
        try
        {
            i = Conversation.ad(b);
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + 19;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        if (context == null || cursor == null)
        {
            try
            {
                Log.w(z[7]);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            return null;
        }
        context = App.ah.a(cursor, b.A);
        try
        {
            context = com.whatsapp.Conversation.a(b, context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a(context);
            return null;
        }
        return context;
    }

    public void notifyDataSetChanged()
    {
        boolean flag = Conversation.Y(b);
        if (!flag)
        {
            IllegalStateException illegalstateexception;
            int i;
            try
            {
                Conversation.r.clear();
                super.notifyDataSetChanged();
                i = App.am;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                try
                {
                    throw illegalstateexception1;
                }
                catch (IllegalStateException illegalstateexception2)
                {
                    throw illegalstateexception2;
                }
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_58;
            }
        }
        if (Conversation.U(b))
        {
            Conversation.l(b, false);
            Conversation.i(b, false);
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    protected void onContentChanged()
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[21];
        obj = "9%p|Oj`j";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "sj>yCbv1{O\177k1kG`q5}\tw`$fRuh\177\177Icl$fI~*9aPqi9k\006";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "0-";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "tp=b_0h#h\007";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "sj>yCbv1{O\177k\177hCds9jQ?w?x\006yvpaS|iq/Kcbm";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "`w5|C~q9aA0f1cJ0i?h\006ykplI~s5}Uqq9`H0u1hC";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "|d)`SdZ9a@|d$jT";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "sj>yCbv1{O\177k1kG`q5}\t~`'/Vqw1b\006yvpaS|iq";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "sj>yCbv1{O\177k\177nBzp#{Eqf8j\tqu jHt`4";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "sj<cG`v5PKuv#nAu* }Cf*=fUcl>h\013bh$\"Ubfj";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "|j1k\006vw?b\006}l4kJu?";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "0yp";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "dm5a\006|j1k\006vw?b\006dj /\034";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "0yp";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "Sp\"|IbL>kChJ%{ivG?zHtv\025wEuu$fI~?";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                obj = "sj<cG`v5PKuv#nAu*>j^d*=fUcl>h\013bh$\"Ubfj";
                byte0 = 14;
                i = 15;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                obj = "Sp\"|IbL>kChJ%{ivG?zHtv\025wEuu$fI~?";
                i = 16;
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "0yp";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "0yp";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "Sp\"|IbL>kChJ%{ivG?zHtv\025wEuu$fI~?";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "Sp\"|IbL>kChJ%{ivG?zHtv\025wEuu$fI~?";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 544
    //                   0 567
    //                   1 574
    //                   2 580
    //                   3 587;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_587;
_L3:
        byte byte1 = 38;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 5;
          goto _L9
_L6:
        byte1 = 80;
          goto _L9
        byte1 = 15;
          goto _L9
    }
}
