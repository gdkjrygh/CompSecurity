// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            ConversationRow, ce, DividerView, App, 
//            Conversation, ConversationRowText, k, mk, 
//            og, abl, ov

public class ConversationRowDivider extends ConversationRow
{

    private static final String L[];
    android.view.View.OnClickListener J;
    private final DividerView K = (DividerView)findViewById(0x7f0b012b);

    ConversationRowDivider(Context context, c4 c4_1)
    {
        super(context, c4_1);
        J = new ce(this);
        setClickable(false);
        setLongClickable(false);
        b(c4_1);
    }

    private void b(c4 c4_1)
    {
        android.text.SpannableStringBuilder spannablestringbuilder;
        String s;
label0:
        {
            C = c4_1;
            setClickable(false);
            K.setTextSize(a(getResources()));
            if (c4_1.M == -1 && c4_1.w == -1)
            {
                K.setText(App.au.getString(0x7f0e0185));
                return;
            }
            s = c(i);
            android.text.SpannableStringBuilder spannablestringbuilder1 = com.whatsapp.util.c.a(s, getContext(), K.getPaint(), 1.4F);
            if (i.t != 1L)
            {
                spannablestringbuilder = spannablestringbuilder1;
                if (i.t != 11L)
                {
                    break label0;
                }
            }
            spannablestringbuilder = com.whatsapp.ConversationRowText.a(s, Conversation.o, spannablestringbuilder1);
        }
        DividerView dividerview = K;
        Object obj = spannablestringbuilder;
        if (spannablestringbuilder == null)
        {
            obj = s;
        }
        dividerview.setText(((CharSequence) (obj)));
        if (!App.az.d(i.G) && mk.h(c4_1.y.a) && i.t != 15L && i.t != 16L)
        {
            setClickable(true);
            K.setOnClickListener(J);
            K.setBackgroundResource(0x7f02063d);
        }
        setTag(c4_1);
    }

    public static String c(c4 c4_1)
    {
        String s = null;
        Object obj;
        Object obj1;
        boolean flag;
        if (!TextUtils.isEmpty(c4_1.G))
        {
            obj1 = App.az.e(c4_1.G);
            obj = ((og) (obj1)).b();
        } else
        {
            obj1 = null;
            obj = null;
        }
        switch ((int)c4_1.t)
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            return null;

        case 1: // '\001'
            obj1 = s;
            if (c4_1.e() != null)
            {
                obj1 = c4_1.e().split("\n");
            }
            if (obj1 != null && obj1.length == 2 && (c4_1.G == null || obj1[0].endsWith(L[2]) && obj1[1].lastIndexOf("\"") > obj1[1].indexOf("\"")))
            {
                obj = App.az.e(obj1[0]).b();
                int i = obj1[1].indexOf("\"");
                int l = obj1[1].lastIndexOf("\"");
                if (l <= i)
                {
                    Log.e((new StringBuilder()).append(L[1]).append(c4_1.G).append(L[0]).append(obj1[0]).append(L[3]).append(obj1[1]).toString());
                }
                return App.au.getString(0x7f0e01f1, new Object[] {
                    obj, obj1[1].substring(i + 1, l)
                });
            }
            if (!App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01f1, new Object[] {
                    obj, c4_1.e()
                });
            }
            int j = c4_1.e().indexOf("\"");
            int i1 = c4_1.e().lastIndexOf("\"");
            if (j == 0 && i1 == c4_1.e().length() - 1 && j != i1)
            {
                c4_1 = c4_1.e().substring(j + 1, i1);
                return App.au.getString(0x7f0e01f2, new Object[] {
                    c4_1
                });
            } else
            {
                return App.au.getString(0x7f0e01f2, new Object[] {
                    c4_1.e()
                });
            }

        case 11: // '\013'
            if (!App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01b9, new Object[] {
                    obj, c4_1.e()
                });
            } else
            {
                return App.au.getString(0x7f0e01ba, new Object[] {
                    c4_1.e()
                });
            }

        case 6: // '\006'
            if (c4_1.G != null)
            {
                if (App.az.d(c4_1.G))
                {
                    if (c4_1.e() == null)
                    {
                        return App.au.getString(0x7f0e02de);
                    } else
                    {
                        return App.au.getString(0x7f0e02d6);
                    }
                }
                obj = App.az.e(c4_1.G).b();
                if (c4_1.e() == null)
                {
                    return App.au.getString(0x7f0e02dc, new Object[] {
                        obj
                    });
                } else
                {
                    return App.au.getString(0x7f0e02d4, new Object[] {
                        obj
                    });
                }
            } else
            {
                return "";
            }

        case 4: // '\004'
            if (og.e(c4_1.y.a))
            {
                return App.au.getString(0x7f0e021e, new Object[] {
                    obj
                });
            }
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01e1);
            } else
            {
                return App.au.getString(0x7f0e01e0, new Object[] {
                    obj
                });
            }

        case 5: // '\005'
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01e6);
            } else
            {
                return App.au.getString(0x7f0e01e5, new Object[] {
                    obj
                });
            }

        case 7: // '\007'
            if (og.e(c4_1.y.a))
            {
                return App.au.getString(0x7f0e021f, new Object[] {
                    obj
                });
            }
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01e9);
            } else
            {
                return App.au.getString(0x7f0e01e8, new Object[] {
                    obj
                });
            }

        case 12: // '\f'
            obj1 = (Vector)c4_1.B;
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01ee, new Object[] {
                    com.whatsapp.mk.a(((Vector) (obj1)))
                });
            }
            if (obj == null)
            {
                if (((Vector) (obj1)).size() == 1 && App.az.d((String)((Vector) (obj1)).get(0)))
                {
                    return App.au.getString(0x7f0e01e1);
                } else
                {
                    return App.au.getString(0x7f0e01e0, new Object[] {
                        com.whatsapp.mk.a(((Vector) (obj1)))
                    });
                }
            }
            if (((Vector) (obj1)).size() == 1 && App.az.d((String)((Vector) (obj1)).get(0)))
            {
                return App.au.getString(0x7f0e01eb, new Object[] {
                    obj
                });
            } else
            {
                return App.au.getString(0x7f0e01ea, new Object[] {
                    obj, com.whatsapp.mk.a(((Vector) (obj1)))
                });
            }

        case 13: // '\r'
            c4_1 = (Vector)c4_1.B;
            return App.au.getString(0x7f0e01e5, new Object[] {
                com.whatsapp.mk.a(c4_1)
            });

        case 14: // '\016'
            obj1 = (Vector)c4_1.B;
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01ef, new Object[] {
                    com.whatsapp.mk.a(((Vector) (obj1)))
                });
            }
            if (obj == null)
            {
                if (((Vector) (obj1)).size() == 1 && App.az.d((String)((Vector) (obj1)).get(0)))
                {
                    return App.au.getString(0x7f0e01e9);
                } else
                {
                    return App.au.getString(0x7f0e01e8, new Object[] {
                        com.whatsapp.mk.a(((Vector) (obj1)))
                    });
                }
            }
            if (((Vector) (obj1)).size() == 1 && App.az.d((String)((Vector) (obj1)).get(0)))
            {
                return App.au.getString(0x7f0e01ed, new Object[] {
                    obj
                });
            } else
            {
                return App.au.getString(0x7f0e01ec, new Object[] {
                    obj, com.whatsapp.mk.a(((Vector) (obj1)))
                });
            }

        case 15: // '\017'
            c4_1 = (Vector)c4_1.B;
            if (c4_1.size() == 1 && App.az.d((String)c4_1.get(0)))
            {
                return App.au.getString(0x7f0e01e7);
            } else
            {
                return App.j.a(0x7f0d0010, c4_1.size(), new Object[] {
                    com.whatsapp.mk.a(c4_1)
                });
            }

        case 16: // '\020'
            c4_1 = (Vector)c4_1.B;
            if (c4_1.size() == 1 && App.az.d((String)c4_1.get(0)))
            {
                return App.au.getString(0x7f0e01e4);
            } else
            {
                return App.j.a(0x7f0d000f, c4_1.size(), new Object[] {
                    com.whatsapp.mk.a(c4_1)
                });
            }

        case 17: // '\021'
            if (App.az.d(c4_1.G))
            {
                return App.au.getString(0x7f0e01c2);
            } else
            {
                return App.au.getString(0x7f0e01c1, new Object[] {
                    obj
                });
            }

        case 8: // '\b'
            return App.au.getString(0x7f0e007f);

        case 9: // '\t'
            obj = (Vector)c4_1.B;
            if (TextUtils.isEmpty(c4_1.e()))
            {
                return App.j.a(0x7f0d0031, ((Vector) (obj)).size(), new Object[] {
                    Integer.valueOf(((Vector) (obj)).size())
                });
            } else
            {
                return App.j.a(0x7f0d0030, ((Vector) (obj)).size(), new Object[] {
                    c4_1.e(), Integer.valueOf(((Vector) (obj)).size())
                });
            }

        case 10: // '\n'
            c4_1 = (String)c4_1.B;
            break;
        }
        if (c4_1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.b(flag);
        s = Character.toString('\240');
        if (((og) (obj1)).l())
        {
            return App.au.getString(0x7f0e01e3, new Object[] {
                ((String) (obj)).replace(" ", s), ov.b(c4_1).replace(" ", s)
            });
        } else
        {
            return App.au.getString(0x7f0e01e2, new Object[] {
                obj, ((og) (obj1)).a().replace(" ", s), ov.b(c4_1).replace(" ", s)
            });
        }
    }

    public void a()
    {
        b(C);
        super.a();
    }

    public void a(c4 c4_1, boolean flag)
    {
        if (C != c4_1 || flag)
        {
            C = c4_1;
            i = c4_1;
            b(c4_1);
        }
        super.a(c4_1, flag);
    }

    protected int n()
    {
        return 0x7f030040;
    }

    protected int q()
    {
        return 0x7f030040;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = ";+)\0253";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\177(6\030j~3\037\003aln2\0033";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "[2n\006fz53\020~ko.\024z";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = ";2}";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                L = as;
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
        byte byte0 = 14;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 27;
          goto _L9
_L5:
        byte0 = 65;
          goto _L9
_L6:
        byte0 = 64;
          goto _L9
        byte0 = 113;
          goto _L9
    }
}
