// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.cl;
import com.whatsapp.util.m;
import com.whatsapp.util.q;
import com.whatsapp.util.y;
import java.text.NumberFormat;

// Referenced classes of package com.whatsapp:
//            ConversationRow, ato, TextEmojiLabel, ao5, 
//            App, MediaData, eg, Conversation, 
//            ConversationRowText, ats, atk, aob

public class ConversationRowLocation extends ConversationRow
{

    private static int S;
    private static final String T[];
    private final TextView J = (TextView)findViewById(0x7f0b0179);
    private final TextView K = (TextView)findViewById(0x7f0b017b);
    private final ImageView L = (ImageView)findViewById(0x7f0b012a);
    private final TextEmojiLabel M = (TextEmojiLabel)findViewById(0x7f0b0178);
    private ato N;
    private MediaData O;
    private final View P = findViewById(0x7f0b017d);
    private final View Q = findViewById(0x7f0b017e);
    private final Button R = (Button)findViewById(0x7f0b015d);

    ConversationRowLocation(Context context, c4 c4_1)
    {
        super(context, c4_1);
        N = new ato(this, null);
        M.setLinkHandler(new ao5());
        M.setAutoLinkMask(0);
        M.setLinksClickable(false);
        M.setFocusable(false);
        M.setClickable(false);
        M.setLongClickable(false);
        Button button = R;
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
        b(c4_1);
    }

    private static int a()
    {
        if (S < 0)
        {
            try
            {
                S = App.au.getPackageManager().getPackageInfo(T[6], 128).versionCode;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                S = 0;
            }
        }
        return S;
    }

    public static void a(Context context, double d, double d1, String s)
    {
        Object obj;
        obj = s;
        if (!TextUtils.isEmpty(s))
        {
            obj = s.replace("(", "[").replace(")", "]");
        }
        if (!com.whatsapp.App.a()) goto _L2; else goto _L1
_L1:
        s = Uri.parse((new StringBuilder()).append(T[2]).append(d).append(",").append(d1).toString());
_L4:
        obj = s;
        if (NumberFormat.getInstance().format(1.1000000000000001D).indexOf(",") > 0)
        {
            obj = s;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                obj = s;
                if (a() >= 0x29b92700)
                {
                    obj = s;
                    if (a() < 0x29d7ab80)
                    {
                        obj = Uri.parse((new StringBuilder()).append(T[4]).append(d).append(",").append(d1).append(T[5]).toString());
                    }
                }
            }
        }
        context.startActivity(new Intent(T[3], ((Uri) (obj))));
        return;
_L2:
label0:
        {
            String s1 = (new StringBuilder()).append(T[0]).append(d).append(",").append(d1).toString();
            s = s1;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                break label0;
            }
            if (android.os.Build.VERSION.SDK_INT <= 10)
            {
                s = s1;
                if (a() >= 0x2499a8d0)
                {
                    break label0;
                }
            }
            s = (new StringBuilder()).append(s1).append(T[1]).append(((String) (obj))).append(")").toString();
        }
        s = Uri.parse(s);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(c4 c4_1)
    {
        Object obj;
label0:
        {
            int i = App.am;
            if (c4_1.v != 0.0D && c4_1.o != 0.0D)
            {
                R.setOnClickListener(N);
                R.setOnLongClickListener(s);
            }
            Object obj1 = (TextView)findViewById(0x7f0b017a);
            if (obj1 == null || t == null)
            {
                break label0;
            }
            if (!c4_1.y.b && g)
            {
                Object obj2 = new StringBuilder();
                Object obj3;
                TextView textview;
                if (App.aR())
                {
                    obj = "";
                } else
                {
                    obj = " ";
                }
                obj2 = ((StringBuilder) (obj2)).append(((String) (obj)));
                obj3 = com.whatsapp.util.q.f(getContext(), com.whatsapp.App.q(c4_1));
                if (App.aR())
                {
                    obj = " ";
                } else
                {
                    obj = "";
                }
                ((TextView) (obj1)).setText(((StringBuilder) (obj2)).append(((String) (obj3)).concat(((String) (obj)))).toString());
                ((TextView) (obj1)).setVisibility(0);
                t.setVisibility(8);
                if (i == 0)
                {
                    break label0;
                }
            }
            ((TextView) (obj1)).setVisibility(8);
            t.setVisibility(0);
        }
label1:
        {
label2:
            {
label3:
                {
label4:
                    {
                        O = (MediaData)c4_1.B;
                        if (!TextUtils.isEmpty(c4_1.L))
                        {
                            obj = c4_1.L.split("\n");
                        } else
                        {
                            obj = null;
                        }
                        if (obj == null || obj.length == 0)
                        {
                            M.setVisibility(8);
                            J.setVisibility(8);
                            K.setVisibility(0);
                            if (obj1 != null)
                            {
                                ((TextView) (obj1)).setVisibility(8);
                            }
                            t.setVisibility(0);
                            if (i == 0)
                            {
                                break label1;
                            }
                        }
                        M.setVisibility(0);
                        if (!TextUtils.isEmpty(c4_1.l))
                        {
                            break label3;
                        }
                        if (obj.length > 1 && obj[1].startsWith(obj[0]))
                        {
                            obj1 = obj[1];
                            if (i == 0)
                            {
                                break label4;
                            }
                        }
                        obj1 = c4_1.L;
                    }
                    obj1 = (new StringBuilder()).append(T[9]).append(Uri.encode(((String) (obj1)).replaceAll(T[7], "+"))).append(T[8]).append(c4_1.o).append(",").append(c4_1.v).toString();
                    if (i == 0)
                    {
                        break label2;
                    }
                }
                obj1 = c4_1.l;
            }
label5:
            {
                obj2 = new SpannableStringBuilder(obj[0]);
                ((SpannableStringBuilder) (obj2)).setSpan(new eg(((String) (obj1))), 0, obj[0].length(), 18);
                M.setText(com.whatsapp.ConversationRowText.a(obj[0], Conversation.o, ((SpannableStringBuilder) (obj2))), android.widget.TextView.BufferType.SPANNABLE);
                J.setVisibility(0);
                if (obj.length > 1 && !TextUtils.isEmpty(obj[1]))
                {
                    obj3 = com.whatsapp.ConversationRowText.a(obj[1], Conversation.o, null);
                    textview = J;
                    obj2 = obj3;
                    if (obj3 == null)
                    {
                        obj2 = obj[1];
                    }
                    textview.setText(((CharSequence) (obj2)));
                    if (i == 0)
                    {
                        break label5;
                    }
                }
                J.setText("");
            }
            obj = new ats(this, ((String) (obj1)));
            J.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            K.setVisibility(8);
        }
label6:
        {
            if (Q != null)
            {
                Q.setVisibility(0);
            }
            if (O.transferring)
            {
                if (c4_1.y.b)
                {
                    K.setVisibility(8);
                    M.setVisibility(8);
                    J.setVisibility(8);
                    P.setVisibility(0);
                    R.setOnClickListener(null);
                    if (i == 0)
                    {
                        break label6;
                    }
                }
                P.setVisibility(0);
                if (i == 0)
                {
                    break label6;
                }
            }
            if (!c4_1.y.b || O.transferred)
            {
                if (c4_1.L == null || "".equals(c4_1.L))
                {
                    K.setVisibility(0);
                }
                if (P != null)
                {
                    P.setVisibility(8);
                }
                K.setOnClickListener(N);
                K.setText(0x7f0e047a);
                if (i == 0)
                {
                    break label6;
                }
            }
            if (c4_1.L == null || "".equals(c4_1.L))
            {
                K.setVisibility(0);
            }
            if (P != null)
            {
                P.setVisibility(8);
            }
            K.setText(0x7f0e0361);
            K.setOnClickListener(new atk(this, null));
            R.setOnClickListener(null);
        }
label7:
        {
            obj = y.a(c4_1);
            if (obj != null)
            {
                L.setImageDrawable(new aob(getContext(), ((android.graphics.Bitmap) (obj)), c4_1.y.b));
                if (i == 0)
                {
                    break label7;
                }
            }
            L.setImageDrawable(new aob(getContext(), cl.f(getContext()), c4_1.y.b));
        }
    }

    public void a()
    {
        b(C);
        super.a();
    }

    public void a(c4 c4_1, boolean flag)
    {
        if (c4_1 != C || flag)
        {
            b(c4_1);
        }
        super.a(c4_1, flag);
    }

    protected int n()
    {
        return 0x7f030043;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }

    protected int q()
    {
        return 0x7f030045;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        i = 0;
        obj = "v!50\002$zn-\020n&o'\036q2-%_}:,o\034\177%2\177\000#9.#K";
        byte0 = -1;
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
                obj = ">}";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "v!50\002$zn-\020n&o'\036q2-%_}:,o\034\177%2\177\000#";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\177;%2\036w1o)\037j0/4_\17765)\036p{\027\t4I";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "v!50\002$zn-\020n&o'\036q2-%_}:,o\034\177%2\177\000#9.#K6";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "8/|qG";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "}:,n\026q:&,\02404/$\003q<%n\020n%2n\034\177%2";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "B&j";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "8&-,L";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "v!50\002$zn-\020n&o'\036q2-%_}:,o\034\177%2\177\000#";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                T = as;
                S = -1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 304
    //                   0 327
    //                   1 334
    //                   2 341
    //                   3 348;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_348;
_L3:
        byte byte1 = 113;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 30;
          goto _L9
_L5:
        byte1 = 85;
          goto _L9
_L6:
        byte1 = 65;
          goto _L9
        byte1 = 64;
          goto _L9
    }
}
