// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Cursor;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;

// Referenced classes of package com.whatsapp:
//            Conversation, s, ConversationRow, App, 
//            aoz

class r8
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final Conversation a;

    r8(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
        if (Conversation.E(a) == null)
        {
            Log.i(z[4]);
        } else
        {
            int k = a.U.getCursor().getCount();
            int i;
            int j;
            int i1;
            int j1;
            boolean flag;
            boolean flag2;
            if (a.aK.getChildCount() > 1)
            {
                view = (ConversationRow)a.aK.getChildAt(1);
                i = view.k();
                flag = ((ConversationRow) (view)).q;
                j = view.i();
            } else
            {
                j = 0;
                i = 0;
                flag = false;
            }
            Conversation.m(a, true);
            i1 = Conversation.E(a).getBottom();
            view = App.ah.a(a.A, Conversation.g(a, true), null, Conversation.W(a));
            com.whatsapp.Conversation.a(a, view);
            a.U.changeCursor(view);
            a.U.getCursor().requery();
            flag2 = App.ah.h(a.A);
            if (!flag2 && Conversation.E(a) != null)
            {
                Conversation.E(a).setVisibility(8);
                a.aK.removeHeaderView(Conversation.E(a));
                Log.i((new StringBuilder()).append(z[5]).append(a.aK.getHeaderViewsCount()).toString());
                com.whatsapp.Conversation.a(a, null);
                Log.i(z[0]);
                a.U.notifyDataSetChanged();
            }
            j1 = a.U.getCursor().getCount();
            Conversation.c(a, j1 - k);
            if (j1 == 0 || j1 <= k || Conversation.t(a) >= j1)
            {
                if (flag2 && Conversation.E(a) != null)
                {
                    Conversation.E(a).setVisibility(8);
                    a.aK.removeHeaderView(Conversation.E(a));
                    Log.i((new StringBuilder()).append(z[1]).append(a.aK.getHeaderViewsCount()).toString());
                    com.whatsapp.Conversation.a(a, null);
                    Log.i((new StringBuilder()).append(z[6]).append(j1).append(z[2]).append(k).append(z[3]).append(Conversation.t(a)).append(")").toString());
                    a.U.notifyDataSetChanged();
                    return;
                }
            } else
            {
                view = (c4)a.U.getItem(Conversation.t(a));
                c4 c4_1 = (c4)a.U.getItem(Conversation.t(a) - 1);
                int l;
                boolean flag1;
                if (view != null && c4_1 != null)
                {
                    flag1 = q.b(c4_1.I, ((c4) (view)).I);
                } else
                {
                    flag1 = false;
                }
                a.aK.setTranscriptMode(0);
                if (!flag || !flag1)
                {
                    i = 0;
                }
                l = i;
                if (Conversation.aj(a))
                {
                    l = i;
                    if (((c4) (view)).y.b == c4_1.y.b)
                    {
                        l = i;
                        if (!((c4) (view)).y.b)
                        {
                            l = i;
                            if (((c4) (view)).w == c4_1.w)
                            {
                                l = i;
                                if (((c4) (view)).w == 0)
                                {
                                    l = i;
                                    if (((c4) (view)).G != null)
                                    {
                                        l = i;
                                        if (c4_1.G != null)
                                        {
                                            l = i;
                                            if (((c4) (view)).G.equals(c4_1.G))
                                            {
                                                l = i + j;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                view = a;
                j = Conversation.t(a);
                if (flag2 && Conversation.t(a) < j1 - 1)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                Conversation.c(view, i + j);
                a.aK.setSelectionFromTop(Conversation.t(a), i1 + l);
                return;
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "?n,\022&.r#\020*3om\00719`6\001l0n#\000&=s.\r&..0\001.3w'\f&=e'\026";
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
                obj = "?n,\022&.r#\020*3om\b,=e'\00510h'\026l4d#\000&.b,\020c";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "p!2\026&*<";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "p!;\024,/<";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "?n,\022&.r#\020*3om\b,=e'\00510h'\026l2t.\b";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "?n,\022&.r#\020*3om\00719`6\001l0n#\000&=s.\r&..*\001\"8d0\007-(!";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "?n,\022&.r#\020*3om\b,=e'\00510h'\026l.d/\01359i'\005'9sbL-9v\177";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 272
    //                   3 279;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_279;
_L3:
        byte byte1 = 67;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 1;
          goto _L9
_L6:
        byte1 = 66;
          goto _L9
        byte1 = 100;
          goto _L9
    }
}
