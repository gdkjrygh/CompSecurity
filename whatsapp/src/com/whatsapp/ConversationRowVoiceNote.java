// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.b7;
import com.whatsapp.util.c1;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            ConversationRow, ao9, App, x_, 
//            adr, hp, mo, sr, 
//            MediaData, og, akr, na, 
//            k, Conversation, dx, oh

public class ConversationRowVoiceNote extends ConversationRow
{

    private static b7 T;
    private static ao9 U;
    private static final String ab[];
    private final ImageView J = (ImageView)findViewById(0x7f0b0192);
    private android.view.View.OnClickListener K;
    private final ImageButton L = (ImageButton)findViewById(0x7f0b017b);
    private android.view.View.OnClickListener M;
    private final ImageView N = (ImageView)findViewById(0x7f0b015c);
    private final ImageView O = (ImageView)findViewById(0x7f0b0193);
    private final SeekBar P = (SeekBar)findViewById(0x7f0b018e);
    private final TextView Q = (TextView)findViewById(0x7f0b018f);
    private android.view.View.OnClickListener R;
    private final TextView S = (TextView)findViewById(0x7f0b0194);
    private akr V;
    private final ProgressBar W = (ProgressBar)findViewById(0x7f0b0088);
    private android.view.View.OnClickListener X;

    ConversationRowVoiceNote(Context context, c4 c4_1)
    {
        super(context, c4_1);
        K = new x_(this);
        R = new adr(this);
        M = new hp(this);
        X = new mo(this);
        W.setMax(100);
        P.setOnSeekBarChangeListener(new sr(this));
        b(c4_1);
    }

    static ImageButton a(ConversationRowVoiceNote conversationrowvoicenote)
    {
        return conversationrowvoicenote.L;
    }

    static b7 a()
    {
        return T;
    }

    static void a(ConversationRowVoiceNote conversationrowvoicenote, c4 c4_1)
    {
        conversationrowvoicenote.c(c4_1);
    }

    static akr b(ConversationRowVoiceNote conversationrowvoicenote)
    {
        return conversationrowvoicenote.V;
    }

    public static void b()
    {
        T.clear();
    }

    private void b(c4 c4_1)
    {
        ImageView imageview;
        Object obj;
        int j;
label0:
        {
            j = App.am;
            obj = (MediaData)c4_1.B;
            imageview = N;
            if (c4_1.y.b)
            {
                break label0;
            }
            if (g)
            {
                J.setVisibility(0);
                N.setVisibility(8);
                imageview = J;
                if (j == 0)
                {
                    break label0;
                }
            }
            J.setVisibility(8);
            N.setVisibility(0);
            imageview = N;
        }
        int i;
label1:
        {
label2:
            {
                Q.setVisibility(8);
                P.setVisibility(8);
                W.setVisibility(8);
                if (!g && !c4_1.y.b)
                {
                    findViewById(0x7f0b018d).setPadding(0, 0, 0, 0);
                }
                if (c4_1.H == 0)
                {
                    c4_1.H = c1.b(((MediaData) (obj)).file);
                }
                if (((MediaData) (obj)).transferring)
                {
                    W.setVisibility(0);
                    Object obj1 = W;
                    SeekBar seekbar;
                    boolean flag;
                    if (((MediaData) (obj)).progress == 0L || ((MediaData) (obj)).progress == 100L)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((ProgressBar) (obj1)).setIndeterminate(flag);
                    W.setProgress((int)((MediaData) (obj)).progress);
                    L.setImageResource(0x7f02057e);
                    L.setOnClickListener(K);
                    if (j == 0)
                    {
                        break MISSING_BLOCK_LABEL_667;
                    }
                }
                if (!((MediaData) (obj)).transferred && (!c4_1.E || !c4_1.y.b || og.e(c4_1.y.a)))
                {
                    break MISSING_BLOCK_LABEL_574;
                }
                P.setVisibility(0);
                if (com.whatsapp.akr.a(c4_1))
                {
                    break label1;
                }
                L.setImageResource(0x7f020587);
                P.setMax(c4_1.H * 1000);
                obj1 = (Integer)T.get(c4_1.y);
                seekbar = P;
                if (obj1 != null)
                {
                    i = ((Integer) (obj1)).intValue();
                } else
                {
                    i = 0;
                }
                seekbar.setProgress(i);
                if (V == null)
                {
                    V = new akr((Activity)getContext());
                    if (j == 0)
                    {
                        break label2;
                    }
                }
                V.a(null);
                V = new akr((Activity)getContext());
            }
            V.b(c4_1);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_543;
            }
        }
label3:
        {
            V = akr.g;
            if (!V.m())
            {
                L.setImageResource(0x7f020587);
                obj1 = (Integer)T.get(c4_1.y);
                seekbar = P;
                if (obj1 != null)
                {
                    i = ((Integer) (obj1)).intValue();
                } else
                {
                    i = 0;
                }
                seekbar.setProgress(i);
                if (j == 0)
                {
                    break label3;
                }
            }
            L.setImageResource(0x7f020584);
            P.setProgress(V.g());
        }
        P.setMax(V.q());
        V.a(new na(this));
        L.setOnClickListener(R);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_667;
        }
        Q.setVisibility(0);
        Q.setText(Formatter.formatShortFileSize(App.au, c4_1.t));
        if (c4_1.y.b && obj != null && ((MediaData) (obj)).file != null)
        {
            L.setImageResource(0x7f02058a);
            L.setOnClickListener(X);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_667;
            }
        }
        L.setImageResource(0x7f020581);
        L.setOnClickListener(M);
label4:
        {
            if (c4_1.y.b)
            {
                if (c4_1.M == 8)
                {
                    O.setImageResource(0x7f0205c1);
                    if (j == 0)
                    {
                        break label4;
                    }
                }
                O.setImageResource(0x7f0205ba);
                if (j == 0)
                {
                    break label4;
                }
            }
            if (c4_1.M == 9 || c4_1.M == 10)
            {
                O.setImageResource(0x7f0205c1);
                if (j == 0)
                {
                    break label4;
                }
            }
            O.setImageResource(0x7f0205c0);
        }
label5:
        {
            if (c4_1.H != 0)
            {
                obj = DateUtils.formatElapsedTime(c4_1.H);
                if (j == 0)
                {
                    break label5;
                }
            }
            obj = Formatter.formatShortFileSize(App.au, c4_1.t);
        }
label6:
        {
            S.setText(((CharSequence) (obj)));
            if (c4_1.y.b)
            {
                U.a(App.az.f(), imageview);
                if (j == 0)
                {
                    break label6;
                }
            }
            String s;
            if (g)
            {
                s = c4_1.G;
            } else
            {
                s = this.i.y.a;
            }
            U.a(App.az.e(s), imageview);
        }
        if (Conversation.ar != null && Conversation.ar.equals(c4_1.y))
        {
            Conversation.ar = null;
            c(c4_1);
        }
        return;
    }

    static SeekBar c(ConversationRowVoiceNote conversationrowvoicenote)
    {
        return conversationrowvoicenote.P;
    }

    private void c(c4 c4_1)
    {
        MediaData mediadata;
        Log.i((new StringBuilder()).append(ab[2]).append(c4_1.y).toString());
        mediadata = (MediaData)c4_1.B;
        if (!mediadata.transferring) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!mediadata.transferred || mediadata.file == null || (new File(Uri.fromFile(mediadata.file).getPath())).exists())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (!(getContext() instanceof dx)) goto _L1; else goto _L3
_L3:
        c4_1 = (dx)getContext();
        String s = Environment.getExternalStorageState();
        if (s.equals(ab[1]) || s.equals(ab[0]))
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        if (App.m())
        {
            i = 0x7f0e0287;
        } else
        {
            i = 0x7f0e0288;
        }
        c4_1.a(i);
        if (App.am == 0) goto _L1; else goto _L4
_L4:
        c4_1.a(0x7f0e019e);
        return;
        Integer integer = (Integer)T.get(c4_1.y);
        if (integer != null)
        {
            V.a(integer.intValue());
        }
        V.a();
        b(c4_1);
        return;
    }

    static TextView d(ConversationRowVoiceNote conversationrowvoicenote)
    {
        return conversationrowvoicenote.S;
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

    public void a(String s)
    {
label0:
        {
            int i = App.am;
            if (C.y.b)
            {
                if (!s.equals(App.az.f().a))
                {
                    break label0;
                }
                l();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (g)
            {
                if (!s.equals(C.G))
                {
                    break label0;
                }
                l();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (s.equals(C.y.a))
            {
                l();
            }
        }
    }

    protected int n()
    {
        return 0x7f030052;
    }

    protected int q()
    {
        return 0x7f030054;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\032\000^a\037\022\013t}\004";
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
                obj = "\032\000^a\037\022\013";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\024\000Ey\016\005\034J{\002\030\001Y`\034\001\000Bl\016\031\000_jD\001\006Nx\006\022\034Xn\f\022O";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                ab = as;
                T = new b7(250);
                U = new ao9(App.au.getResources().getDimensionPixelSize(0x7f0a0061), App.au.getResources().getDimension(0x7f0a0060));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 200
    //                   0 221
    //                   1 227
    //                   2 233
    //                   3 239;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_239;
_L3:
        byte byte0 = 107;
_L9:
        obj[j] = (char)(byte0 ^ c2);
        j++;
          goto _L8
_L4:
        byte0 = 119;
          goto _L9
_L5:
        byte0 = 111;
          goto _L9
_L6:
        byte0 = 43;
          goto _L9
        byte0 = 15;
          goto _L9
    }
}
