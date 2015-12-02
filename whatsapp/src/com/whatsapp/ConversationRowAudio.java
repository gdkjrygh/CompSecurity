// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.cl;
import com.whatsapp.util.m;
import com.whatsapp.util.y;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, oo, App, MediaData, 
//            og, akr, aob, WaveformVisualizerView, 
//            af6, af7, Conversation, dx, 
//            MediaGallery

public final class ConversationRowAudio extends ConversationRowMedia
{

    private static final String ab[];
    private final TextView N = (TextView)findViewById(0x7f0b00f3);
    private android.view.View.OnClickListener O;
    private final int P = -1;
    private final Button Q = (Button)findViewById(0x7f0b015d);
    private WaveformVisualizerView R;
    private final int S = 0xff6a6f73;
    private final ImageView T = (ImageView)findViewById(0x7f0b012a);
    private final ProgressBar U = (ProgressBar)findViewById(0x7f0b0088);
    private final TextView V = (TextView)findViewById(0x7f0b017b);
    private akr W;

    public ConversationRowAudio(Context context, c4 c4_1)
    {
        super(context, c4_1);
        O = new oo(this);
        Button button = Q;
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
        U.setMax(100);
        c(c4_1);
    }

    static TextView a(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.N;
    }

    static TextView b(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.V;
    }

    static WaveformVisualizerView c(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.R;
    }

    private void c(c4 c4_1)
    {
label0:
        {
label1:
            {
                MediaData mediadata;
                int i;
label2:
                {
                    i = App.am;
                    mediadata = (MediaData)c4_1.B;
                    N.setVisibility(8);
                    if (!mediadata.transferring)
                    {
                        break label1;
                    }
                    U.setVisibility(0);
                    V.setText(0x7f0e007b);
                    if (c4_1.y.b)
                    {
                        Q.setOnClickListener(O);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    Q.setOnClickListener(null);
                }
                V.setOnClickListener(K);
                Object obj = U;
                boolean flag;
                if (mediadata.progress == 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((ProgressBar) (obj)).setIndeterminate(flag);
                U.setProgress((int)mediadata.progress);
                if (i == 0)
                {
                    break label0;
                }
            }
label3:
            {
label4:
                {
                    if (!mediadata.transferred && (!c4_1.E || !c4_1.y.b || og.e(c4_1.y.a)))
                    {
                        break label3;
                    }
                    if (com.whatsapp.akr.a(c4_1))
                    {
                        V.setText(0x7f0e0309);
                        if (i == 0)
                        {
                            break label4;
                        }
                    }
                    V.setText(0x7f0e02eb);
                }
                Q.setOnLongClickListener(s);
                U.setVisibility(8);
                V.setOnClickListener(O);
                Q.setOnClickListener(O);
                if (i == 0)
                {
                    break label0;
                }
            }
label5:
            {
label6:
                {
                    if (!c4_1.y.b)
                    {
                        V.setText((new StringBuilder()).append(getContext().getString(0x7f0e00f0)).append(" ").append(Formatter.formatShortFileSize(App.au, c4_1.t)).toString());
                    }
                    U.setVisibility(8);
                    Q.setOnLongClickListener(s);
                    if (!c4_1.y.b || mediadata == null || mediadata.file == null)
                    {
                        break label5;
                    }
                    if (com.whatsapp.akr.a(c4_1))
                    {
                        V.setText(0x7f0e0309);
                        V.setOnClickListener(O);
                        if (i == 0)
                        {
                            break label6;
                        }
                    }
                    V.setText(0x7f0e0361);
                    V.setOnClickListener(M);
                }
                Q.setOnClickListener(O);
                if (i == 0)
                {
                    break label0;
                }
            }
            V.setOnClickListener(L);
            Q.setOnClickListener(L);
        }
label7:
        {
label8:
            {
                setOnClickListener(null);
                if (com.whatsapp.akr.a(c4_1))
                {
                    T.setImageDrawable(new aob(getContext(), cl.a(getContext()), c4_1.y.b));
                    N.setTextColor(0xff6a6f73);
                    N.setCompoundDrawablesWithIntrinsicBounds(0x7f02059e, 0, 0, 0);
                    if (i == 0)
                    {
                        break label7;
                    }
                }
                obj = y.a(c4_1);
                if (obj != null)
                {
                    T.setImageDrawable(new aob(getContext(), ((android.graphics.Bitmap) (obj)), c4_1.y.b));
                    if (i == 0)
                    {
                        break label8;
                    }
                }
                T.setImageDrawable(new aob(getContext(), cl.e(getContext()), c4_1.y.b));
            }
            N.setTextColor(-1);
            N.setCompoundDrawablesWithIntrinsicBounds(0x7f02059d, 0, 0, 0);
        }
label9:
        {
            if (c4_1.H == 0 && mediadata != null)
            {
                c4_1.H = c1.b(mediadata.file);
            }
            if (c4_1.H != 0)
            {
                obj = DateUtils.formatElapsedTime(c4_1.H);
                if (i == 0)
                {
                    break label9;
                }
            }
            obj = Formatter.formatShortFileSize(App.au, c4_1.t);
        }
label10:
        {
label11:
            {
label12:
                {
label13:
                    {
                        N.setText(((CharSequence) (obj)));
                        N.setVisibility(0);
                        if (!c4_1.y.b && !mediadata.transferred)
                        {
                            break label10;
                        }
                        if (R == null)
                        {
                            obj = (ViewGroup)findViewById(0x7f0b0185);
                            R = new WaveformVisualizerView(getContext());
                            R.setPadding(0, (int)N.getTextSize(), 0, (int)N.getTextSize());
                            ((ViewGroup) (obj)).addView(R, -1, -1);
                        }
                        if (com.whatsapp.akr.a(c4_1))
                        {
                            break label12;
                        }
                        if (W == null)
                        {
                            W = new akr((Activity)getContext());
                            if (i == 0)
                            {
                                break label13;
                            }
                        }
                        W.a(null);
                        W.a(null);
                        W = new akr((Activity)getContext());
                    }
                    W.b(c4_1);
                    R.setVisibility(8);
                    if (i == 0)
                    {
                        break label11;
                    }
                }
                W = akr.g;
                R.setVisibility(0);
            }
            W.a(new af6(this));
            W.a(new af7(this, c4_1));
        }
        if (Conversation.ar != null && Conversation.ar.equals(c4_1.y))
        {
            Conversation.ar = null;
            b(c4_1);
        }
    }

    static ImageView d(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.T;
    }

    static akr e(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.W;
    }

    static android.view.View.OnClickListener f(ConversationRowAudio conversationrowaudio)
    {
        return conversationrowaudio.O;
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
        Object obj;
        int j;
        j = App.am;
        obj = (MediaData)c4_1.B;
        if (c4_1.y.b || ((MediaData) (obj)).transferred) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        boolean flag;
        if (((MediaData) (obj)).file != null)
        {
            flag = (new File(Uri.fromFile(((MediaData) (obj)).file).getPath())).exists();
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (!(getContext() instanceof dx))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (dx)getContext();
        s = Environment.getExternalStorageState();
        if (!s.equals(ab[16]) && !s.equals(ab[5]))
        {
            int i;
            if (com.whatsapp.App.m())
            {
                i = 0x7f0e0287;
            } else
            {
                i = 0x7f0e0288;
            }
            ((dx) (obj)).a(i);
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        ((dx) (obj)).a(0x7f0e019e);
        if (j == 0) goto _L1; else goto _L3
_L3:
        obj = new Intent(getContext(), com/whatsapp/MediaGallery);
        ((Intent) (obj)).putExtra(ab[4], -1);
        ((Intent) (obj)).putExtra(ab[14], true);
        ((Intent) (obj)).putExtra(ab[6], c4_1.y.a);
        ((Intent) (obj)).putExtra(ab[10], c4_1.y.hashCode());
        getContext().startActivity(((Intent) (obj)));
        return;
        Log.i((new StringBuilder()).append(ab[2]).append(c4_1.y.b).append(ab[9]).append(c4_1.w).append(ab[7]).append(c4_1.L).append(ab[3]).append(c4_1.l).append(ab[15]).append(((MediaData) (obj)).file).append(ab[13]).append(((MediaData) (obj)).progress).append(ab[12]).append(((MediaData) (obj)).transferred).append(ab[0]).append(((MediaData) (obj)).transferring).append(ab[8]).append(((MediaData) (obj)).fileSize).append(ab[11]).append(c4_1.t).append(ab[1]).append(c4_1.I).toString());
        if (!com.whatsapp.akr.a(c4_1))
        {
            break; /* Loop/switch isn't completed */
        }
        W.b();
        if (j == 0) goto _L1; else goto _L4
_L4:
        W.l();
        return;
    }

    protected int n()
    {
        return 0x7f030049;
    }

    protected int q()
    {
        return 0x7f03004a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = ";(vbsh:aqor2c9";
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
                obj = ";(mnxh(enm!";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "m5atp~/wbz~s$eot1[nx!";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ";)vo'";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "k3w";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "v3qmi~8[qr";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "q5`";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ";2enx!";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = ";:moxH5~f'";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ";(}sx!";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "p9}";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ";1agtz\003wjg~f";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ";(vbsh:aqo~8>";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = ";,vlzi9wp'";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "z0aqi";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = ";:mox!";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "v3qmi~8";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                ab = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 499;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_499;
_L3:
        byte byte1 = 29;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 27;
          goto _L9
_L5:
        byte1 = 92;
          goto _L9
_L6:
        byte1 = 4;
          goto _L9
        byte1 = 3;
          goto _L9
    }
}
