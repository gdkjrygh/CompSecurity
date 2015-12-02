// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.aw;
import com.whatsapp.util.c1;
import com.whatsapp.util.m;
import com.whatsapp.util.y;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, ue, CircularProgressBar, App, 
//            MediaData, w5, og, qu, 
//            TextEmojiLabel, ConversationRowText, Conversation, MediaGallery, 
//            akr, MediaView

public final class ConversationRowVideo extends ConversationRowMedia
{

    private static Handler O;
    private static final String ab[];
    private final TextView N = (TextView)findViewById(0x7f0b012b);
    private qu P;
    private aw Q;
    private final TextView R = (TextView)findViewById(0x7f0b017b);
    private final View S = findViewById(0x7f0b0180);
    private final View T = findViewById(0x7f0b0181);
    private final TextView U = (TextView)findViewById(0x7f0b0182);
    private final ImageView V = (ImageView)findViewById(0x7f0b012a);
    private final CircularProgressBar W = (CircularProgressBar)findViewById(0x7f0b0088);

    public ConversationRowVideo(Context context, c4 c4_1)
    {
        super(context, c4_1);
        Q = new ue(this);
        W.setMax(100);
        if (O == null)
        {
            if (android.os.Build.VERSION.SDK_INT < 11);
        }
        c(c4_1);
    }

    static Handler a()
    {
        return O;
    }

    static qu a(ConversationRowVideo conversationrowvideo)
    {
        return conversationrowvideo.P;
    }

    static qu a(ConversationRowVideo conversationrowvideo, qu qu1)
    {
        conversationrowvideo.P = qu1;
        return qu1;
    }

    static ImageView b(ConversationRowVideo conversationrowvideo)
    {
        return conversationrowvideo.V;
    }

    private void c(c4 c4_1)
    {
label0:
        {
label1:
            {
                Object obj;
                int k;
label2:
                {
                    k = App.am;
                    obj = (MediaData)c4_1.B;
                    N.setVisibility(8);
                    if (!((MediaData) (obj)).transferring)
                    {
                        break label1;
                    }
                    S.setVisibility(0);
                    W.setVisibility(0);
                    T.setVisibility(0);
                    R.setText("");
                    R.setVisibility(8);
                    if (c4_1.y.b)
                    {
                        setOnClickListener(J);
                        if (k == 0)
                        {
                            break label2;
                        }
                    }
                    setOnClickListener(null);
                }
                int i;
label3:
                {
                    R.setOnClickListener(K);
                    W.setOnClickListener(K);
                    int j = (int)((MediaData) (obj)).progress;
                    i = j;
                    if (((MediaData) (obj)).transcoder == null)
                    {
                        break label3;
                    }
                    i = j;
                    if (!((MediaData) (obj)).transcoder.h())
                    {
                        break label3;
                    }
                    i = j;
                    if (((MediaData) (obj)).uploader == null)
                    {
                        j /= 2;
                        i = j;
                        if (k == 0)
                        {
                            break label3;
                        }
                        i = j;
                    }
                    i = i / 2 + 50;
                }
                CircularProgressBar circularprogressbar = W;
                boolean flag;
                if (i == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                circularprogressbar.setIndeterminate(flag);
                W.setProgress(i);
                if (k == 0)
                {
                    break label0;
                }
            }
            if (((MediaData) (obj)).transferred || c4_1.E && c4_1.y.b && !og.e(c4_1.y.a))
            {
                S.setVisibility(8);
                R.setText(0x7f0e02eb);
                R.setVisibility(8);
                W.setVisibility(8);
                T.setVisibility(8);
                setOnLongClickListener(s);
                R.setOnClickListener(J);
                setOnClickListener(J);
                if (k == 0)
                {
                    break label0;
                }
            }
            S.setVisibility(0);
            W.setVisibility(8);
            T.setVisibility(8);
            R.setVisibility(0);
            setOnLongClickListener(s);
            if (c4_1.y.b && ((MediaData) (obj)).file != null)
            {
                R.setText(0x7f0e0361);
                R.setCompoundDrawablesWithIntrinsicBounds(0x7f0200f0, 0, 0, 0);
                R.setOnClickListener(M);
                setOnClickListener(J);
                if (k == 0)
                {
                    break label0;
                }
            }
            R.setText(Formatter.formatShortFileSize(App.au, c4_1.t));
            R.setCompoundDrawablesWithIntrinsicBounds(0x7f0200c3, 0, 0, 0);
            R.setOnClickListener(L);
            setOnClickListener(L);
        }
label4:
        {
            y.c(c4_1, V, Q);
            if (O != null)
            {
                if (P != null)
                {
                    O.removeCallbacks(P);
                    P.a();
                }
                P = new qu(this, ((MediaData) (obj)));
                O.postDelayed(P, 2000L);
            }
            if (c4_1.H == 0)
            {
                c4_1.H = c1.b(((MediaData) (obj)).file);
            }
            if (c4_1.H != 0)
            {
                obj = DateUtils.formatElapsedTime(c4_1.H);
                if (k == 0)
                {
                    break label4;
                }
            }
            obj = Formatter.formatShortFileSize(App.au, c4_1.t);
        }
label5:
        {
            N.setText(((CharSequence) (obj)));
            N.setVisibility(0);
            if (App.aR())
            {
                N.setCompoundDrawablesWithIntrinsicBounds(0x7f02059f, 0, 0, 0);
                if (k == 0)
                {
                    break label5;
                }
            }
            N.setCompoundDrawablesWithIntrinsicBounds(null, null, new m(getContext().getResources().getDrawable(0x7f02059f)), null);
        }
label6:
        {
            if (t == null)
            {
                break label6;
            }
            if (c4_1.E && c4_1.y.b && !og.g(c4_1.y.a))
            {
                t.setCompoundDrawablesWithIntrinsicBounds(0x7f0200bb, 0, 0, 0);
                if (k == 0)
                {
                    break label6;
                }
            }
            t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
label7:
        {
            if (!TextUtils.isEmpty(c4_1.b))
            {
                U.setVisibility(0);
                ConversationRowText.setMessageText(c4_1.b, (TextEmojiLabel)U, 0, c4_1);
                if (k == 0)
                {
                    break label7;
                }
            }
            U.setVisibility(8);
        }
        if (Conversation.ar != null && Conversation.ar.equals(c4_1.y))
        {
            Conversation.ar = null;
            b(c4_1);
        }
    }

    protected int a(int i)
    {
        int j;
label0:
        {
            int k = App.am;
            if (bg.a(i, 13) >= 0)
            {
                j = 0x7f0205b3;
                if (k == 0)
                {
                    break label0;
                }
            }
            if (bg.a(i, 5) >= 0)
            {
                j = 0x7f0205b7;
                if (k == 0)
                {
                    break label0;
                }
            }
            if (bg.a(i, 4) == 0)
            {
                j = 0x7f0205b5;
                if (k == 0)
                {
                    break label0;
                }
            }
            j = 0x7f0205b9;
        }
        int l = j;
        if (App.l == 3)
        {
            l = j;
            if (i == 7)
            {
                l = 0x7f0205b9;
            }
        }
        return l;
    }

    public void a()
    {
        c(C);
        super.a();
    }

    public void a(c4 c4_1, boolean flag)
    {
        if (c4_1 != C || flag)
        {
            c(c4_1);
        }
        super.a(c4_1, flag);
    }

    protected void b(c4 c4_1)
    {
        Object obj = (MediaData)c4_1.B;
        if (!c4_1.y.b && !((MediaData) (obj)).transferred)
        {
            return;
        }
        boolean flag;
        if (((MediaData) (obj)).file != null)
        {
            flag = (new File(Uri.fromFile(((MediaData) (obj)).file).getPath())).exists();
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            obj = new Intent(getContext(), com/whatsapp/MediaGallery);
            ((Intent) (obj)).putExtra(ab[10], -1);
            ((Intent) (obj)).putExtra(ab[5], true);
            ((Intent) (obj)).putExtra(ab[6], c4_1.y.a);
            ((Intent) (obj)).putExtra(ab[1], c4_1.y.hashCode());
            getContext().startActivity(((Intent) (obj)));
            return;
        } else
        {
            Log.i((new StringBuilder()).append(ab[0]).append(c4_1.y.b).append(ab[11]).append(c4_1.w).append(ab[2]).append(c4_1.L).append(ab[3]).append(c4_1.l).append(ab[9]).append(((MediaData) (obj)).file).append(ab[4]).append(((MediaData) (obj)).progress).append(ab[14]).append(((MediaData) (obj)).transferred).append(ab[7]).append(((MediaData) (obj)).transferring).append(ab[8]).append(((MediaData) (obj)).fileSize).append(ab[12]).append(c4_1.t).append(ab[13]).append(c4_1.I).toString());
            akr.t();
            c4_1 = com.whatsapp.MediaView.a(c4_1, c4_1.y.a, getContext());
            getContext().startActivity(c4_1);
            return;
        }
    }

    protected int n()
    {
        return 0x7f03004c;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (O != null && P == null)
        {
            P = new qu(this, (MediaData)C.B);
            O.postDelayed(P, 2000L);
        }
    }

    protected int q()
    {
        return 0x7f03004d;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "{=\tULh'\037CFh{LDSb93OD7";
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
                obj = "f1\025";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "-:\rOD7";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "-!\036N\033";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "-$\036MF\1771\037Q\033";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "l8\tPU";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "g=\b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "- \036CO~2\tPSd:\013\030";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "-2\005ND^=\026G\033";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "-2\005ND7";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "};\037";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "- \025RD7";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "-9\tFHl\013\037K[hn";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                obj = "- \005OD~ \rOQ7";
                byte0 = 12;
                i = 13;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "- \036CO~2\tPSh0V";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                ab = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 33;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 13;
          goto _L9
_L5:
        byte1 = 84;
          goto _L9
_L6:
        byte1 = 108;
          goto _L9
        byte1 = 34;
          goto _L9
    }
}
