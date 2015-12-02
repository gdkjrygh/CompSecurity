// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.preference.WaFontListPreference;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            BubbleRelativeLayout, App, a3q, wf, 
//            afp, ry, a1g, mk, 
//            iz, og, oa, as_, 
//            k, Conversation, ja, kp, 
//            y1

public abstract class ConversationRow extends BubbleRelativeLayout
{

    private static float B;
    private static final String J[];
    private static float x;
    private static Paint y;
    static int z;
    android.view.View.OnClickListener A;
    protected c4 C;
    private View D;
    private final Runnable E;
    private TextView F;
    private int G;
    private long H;
    private boolean I;
    protected android.view.View.OnLongClickListener s;
    protected final TextView t;
    protected final ImageView u;
    private View v;
    private Drawable w;

    public ConversationRow(Context context, c4 c4_1)
    {
        int i1;
        int k1;
        int l1;
label0:
        {
            k1 = 3;
            l1 = App.am;
            super(context, c4_1);
            I = false;
            w = new a3q(this);
            s = new wf(this);
            E = new afp(this);
            A = new ry(this);
            context = com.whatsapp.a1g.a();
            if (c4_1.y.b)
            {
                i1 = q();
                if (l1 == 0)
                {
                    break label0;
                }
            }
            i1 = n();
        }
label1:
        {
label2:
            {
                g = mk.h(c4_1.y.a);
                com.whatsapp.iz.a(LayoutInflater.from(getContext()), i1, this, true);
                z = (int)(((a1g) (context)).g * 2.0F);
                if (c4_1.M == 6 && c4_1.w != 8)
                {
                    setGravity(17);
                    setPadding(z, z + ((a1g) (context)).n, z, z + ((a1g) (context)).n);
                    if (l1 == 0)
                    {
                        break label1;
                    }
                }
                int j1;
                if (c4_1.y.b)
                {
                    int i2;
                    int j2;
                    if (App.aR())
                    {
                        i1 = 5;
                    } else
                    {
                        i1 = 3;
                    }
                    setGravity(i1);
                    if (App.aR())
                    {
                        i1 = z;
                    } else
                    {
                        i1 = 0;
                    }
                    i2 = z;
                    j2 = ((a1g) (context)).n;
                    if (App.aR())
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = z;
                    }
                    setPadding(i1, j2 + i2, j1, z + ((a1g) (context)).n);
                    if (l1 == 0)
                    {
                        break label2;
                    }
                }
                if (App.aR())
                {
                    i1 = k1;
                } else
                {
                    i1 = 5;
                }
                setGravity(i1);
                if (App.aR())
                {
                    i1 = 0;
                } else
                {
                    i1 = z;
                }
                k1 = z;
                i2 = ((a1g) (context)).n;
                if (App.aR())
                {
                    j1 = z;
                } else
                {
                    j1 = 0;
                }
                setPadding(i1, i2 + k1, j1, z + ((a1g) (context)).n);
            }
            setBackgroundDrawable(w);
            setMinimumHeight((int)getResources().getDimension(0x7f0a002f));
            setLongClickable(true);
        }
label3:
        {
            t = (TextView)findViewById(0x7f0b015a);
            u = (ImageView)findViewById(0x7f0b00cf);
            if (App.H)
            {
                context = (TextView)findViewById(0x7f0b0159);
                if (context != null)
                {
                    context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
                }
            }
            a(c4_1);
            setOnLongClickListener(s);
            if (y == null)
            {
                y = new Paint();
                y.setColor(0x4d33b5e5);
                y.setStyle(android.graphics.Paint.Style.FILL);
                y.setAntiAlias(true);
            }
            if (p() != null)
            {
                m();
                v.setSelected(p().containsKey(c4_1.y));
                if (l1 == 0)
                {
                    break label3;
                }
            }
            g();
        }
    }

    static float a(Resources resources)
    {
        int i1;
label0:
        {
            if (x == 0.0F)
            {
                float f1 = resources.getDisplayMetrics().scaledDensity;
                x = resources.getDimension(0x7f0a0024) / f1;
            }
            i1 = 0;
            if (WaFontListPreference.c == -1)
            {
                byte byte0 = -2;
                i1 = byte0;
                if (App.am == 0)
                {
                    break label0;
                }
                i1 = byte0;
            }
            if (WaFontListPreference.c == 1)
            {
                i1 = 4;
            }
        }
        float f2 = x;
        return (float)i1 + f2;
    }

    public static float a(Resources resources, int i1)
    {
        byte byte0;
label0:
        {
            if (B == 0.0F)
            {
                float f1 = resources.getDisplayMetrics().scaledDensity;
                B = resources.getDimension(0x7f0a0034) / f1;
            }
            byte0 = 0;
            if (i1 == -1)
            {
                byte byte1 = -2;
                byte0 = byte1;
                if (App.am == 0)
                {
                    break label0;
                }
                byte0 = byte1;
            }
            if (i1 == 1)
            {
                byte0 = 4;
            }
        }
label1:
        {
            if (!Locale.getDefault().getLanguage().equals(J[1]))
            {
                i1 = byte0;
                if (!Locale.getDefault().getLanguage().equals(J[2]))
                {
                    break label1;
                }
            }
            i1 = byte0 + 1;
        }
        float f2 = B;
        return (float)i1 + f2;
    }

    static HashMap a(ConversationRow conversationrow)
    {
        return conversationrow.p();
    }

    private void a(c4 c4_1)
    {
label0:
        {
            int i1 = App.am;
            boolean flag;
            if (c4_1 != C)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            C = c4_1;
            super.i = c4_1;
            setTag(c4_1);
            if (t == null)
            {
                break label0;
            }
            if (!I || c4_1.I != H)
            {
                Object obj1 = t;
                StringBuilder stringbuilder = new StringBuilder();
                Object obj;
                String s1;
                if (App.aR())
                {
                    obj = "";
                } else
                {
                    obj = " ";
                }
                stringbuilder = stringbuilder.append(((String) (obj)));
                s1 = com.whatsapp.util.q.f(getContext(), com.whatsapp.App.q(c4_1));
                if (App.aR())
                {
                    obj = " ";
                } else
                {
                    obj = "";
                }
                ((TextView) (obj1)).setText(stringbuilder.append(s1.concat(((String) (obj)))).toString());
                H = c4_1.I;
            }
            if (c4_1.E && c4_1.y.b && !og.g(c4_1.y.a))
            {
                t.setCompoundDrawablesWithIntrinsicBounds(0x7f0200ba, 0, 0, 0);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
label1:
        {
label2:
            {
                if (u == null || !c4_1.y.b || I && c4_1.M == G && !flag)
                {
                    break label1;
                }
                if (!flag && bg.a(c4_1.M, 13) >= 0)
                {
                    obj = new oa(u, a(c4_1.M));
                    ((Animation) (obj)).setDuration(400L);
                    ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
                    u.startAnimation(((Animation) (obj)));
                    if (i1 == 0)
                    {
                        break label2;
                    }
                }
                u.setImageResource(a(c4_1.M));
            }
            G = c4_1.M;
        }
label3:
        {
label4:
            {
label5:
                {
label6:
                    {
                        D = findViewById(0x7f0b0157);
                        if (c4_1.y.b || !mk.h(c4_1.y.a))
                        {
                            break label3;
                        }
                        if (c4_1.G == null)
                        {
                            break label5;
                        }
                        obj = (TextView)findViewById(0x7f0b0158);
                        obj1 = App.R;
                        obj1 = com.whatsapp.mk.c(c4_1.y.a, c4_1.G);
                        if (obj1 != null)
                        {
                            ((TextView) (obj)).setTextColor(((as_) (obj1)).c);
                            if (i1 == 0)
                            {
                                break label6;
                            }
                        }
                        ((TextView) (obj)).setTextColor(0x99000000);
                    }
label7:
                    {
                        ((TextView) (obj)).setTextSize(b(getResources()));
                        a1g.b(((TextView) (obj)));
                        obj1 = App.az.e(c4_1.G);
                        ((TextView) (obj)).setText(((og) (obj1)).a(getContext()));
                        obj = (TextView)findViewById(0x7f0b0159);
                        if (TextUtils.isEmpty(((og) (obj1)).n) && !TextUtils.isEmpty(((og) (obj1)).N))
                        {
                            ((TextView) (obj)).setText(com.whatsapp.util.c.c((new StringBuilder()).append("~").append(((og) (obj1)).N).toString(), getContext()));
                            ((TextView) (obj)).setVisibility(0);
                            if (i1 == 0)
                            {
                                break label7;
                            }
                        }
                        ((TextView) (obj)).setVisibility(8);
                    }
                    if (i1 == 0)
                    {
                        break label4;
                    }
                }
                Log.e((new StringBuilder()).append(J[0]).append(Log.a(c4_1)).toString());
            }
            if (k < 2)
            {
                D.setVisibility(0);
            }
            D.setOnClickListener(A);
            D.setBackgroundResource(0x7f02063d);
        }
        I = true;
    }

    public static float b(Resources resources)
    {
        return a(resources, WaFontListPreference.c);
    }

    static Paint b()
    {
        return y;
    }

    static View b(ConversationRow conversationrow)
    {
        return conversationrow.v;
    }

    private HashMap p()
    {
        Conversation conversation = d();
        if (conversation != null)
        {
            return conversation.Z;
        } else
        {
            return null;
        }
    }

    protected int a(int i1)
    {
        int j1;
label0:
        {
            int k1 = App.am;
            if (bg.a(i1, 13) >= 0)
            {
                j1 = 0x7f0205b2;
                if (k1 == 0)
                {
                    break label0;
                }
            }
            if (bg.a(i1, 5) >= 0)
            {
                j1 = 0x7f0205b6;
                if (k1 == 0)
                {
                    break label0;
                }
            }
            if (bg.a(i1, 4) == 0)
            {
                j1 = 0x7f0205b4;
                if (k1 == 0)
                {
                    break label0;
                }
            }
            j1 = 0x7f0205b8;
        }
        int l1 = j1;
        if (App.l == 3)
        {
            l1 = j1;
            if (i1 == 7)
            {
                l1 = 0x7f0205b8;
            }
        }
        return l1;
    }

    public void a()
    {
        a(C);
    }

    public void a(c4 c4_1, boolean flag)
    {
label0:
        {
            if (C != c4_1 || flag)
            {
                a(c4_1);
            }
            if (p() != null)
            {
                m();
                v.setSelected(p().containsKey(C.y));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            g();
        }
    }

    public void a(String s1)
    {
    }

    public void a(boolean flag)
    {
label0:
        {
            if (flag)
            {
                F = (TextView)findViewById(0x7f0b0156);
                F.setText(com.whatsapp.util.q.c(getContext(), C.I));
                F.setTextSize(a(getResources()));
                F.setVisibility(0);
                q = true;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b0156).setVisibility(8);
            q = false;
        }
    }

    c4 c()
    {
        return (c4)getTag();
    }

    protected Conversation d()
    {
        if (getContext() instanceof Conversation)
        {
            return (Conversation)getContext();
        } else
        {
            return null;
        }
    }

    protected void e()
    {
label0:
        {
label1:
            {
                if (!(getContext() instanceof Conversation))
                {
                    break label0;
                }
                Conversation conversation = (Conversation)getContext();
                ArrayList arraylist = new ArrayList();
                if (!mk.h(C.y.a) || C.y.b && (!C.y.b || C.M != 6))
                {
                    break label1;
                }
                if (C.G != null)
                {
                    if (App.az.e(C.G).z == null)
                    {
                        arraylist.add(new ja(getResources().getString(0x7f0e0026), 7));
                        arraylist.add(new ja(getResources().getString(0x7f0e0029), 8));
                    }
                    arraylist.add(new ja(getResources().getString(0x7f0e024e), 14));
                    arraylist.add(new ja(getResources().getString(0x7f0e006f), 16));
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                Object obj1 = (new StringBuilder()).append(J[3]).append(Log.a(C));
                Object obj;
                android.app.AlertDialog.Builder builder;
                og og1;
                if (App.l >= 1 && C.f == 0)
                {
                    obj = (new StringBuilder()).append(J[5]).append(C.e()).toString();
                } else
                {
                    obj = "";
                }
                Log.e(((StringBuilder) (obj1)).append(((String) (obj))).toString());
            }
            if (!arraylist.isEmpty())
            {
                builder = new android.app.AlertDialog.Builder(getContext());
                og1 = App.az.e(C.G);
                obj1 = og1.b();
                obj = obj1;
                if (og1.z == null)
                {
                    obj = obj1;
                    if (!TextUtils.isEmpty(og1.N))
                    {
                        obj = (new StringBuilder()).append(((String) (obj1))).append(J[4]).append(og1.N).append(")").toString();
                    }
                }
                builder.setTitle(((CharSequence) (obj)));
                obj = c();
                builder.setAdapter(new ArrayAdapter(getContext(), 0x1090011, arraylist), new kp(this, conversation, arraylist, og1, ((c4) (obj))));
                conversation.a(builder.create());
            }
        }
    }

    public void f()
    {
        o = true;
        setOnLongClickListener(null);
        t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    void g()
    {
        if (v != null)
        {
            v.setVisibility(8);
        }
    }

    public void h()
    {
        int j1 = 0;
        D = findViewById(0x7f0b0157);
        if (D != null)
        {
            D.setVisibility(0);
            k = -1;
            setMinimumHeight((int)getResources().getDimension(0x7f0a002f));
            int i1;
            int k1;
            int l1;
            if (App.aR())
            {
                i1 = 0;
            } else
            {
                i1 = z;
            }
            k1 = z;
            l1 = com.whatsapp.a1g.a().n;
            if (App.aR())
            {
                j1 = z;
            }
            setPadding(i1, k1 + l1, j1, z + com.whatsapp.a1g.a().n);
        }
    }

    public int i()
    {
        if (D != null)
        {
            return D.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    protected void j()
    {
        Conversation conversation = d();
        if (conversation != null)
        {
            conversation.Z = new HashMap();
            conversation.Z.put(i.y, i);
            conversation.m();
            conversation.s();
        }
    }

    public int k()
    {
        if (F == null)
        {
            F = (TextView)findViewById(0x7f0b0156);
        }
        return Math.round(getResources().getDimension(0x7f0a0022)) + F.getMeasuredHeight();
    }

    public final void l()
    {
label0:
        {
            Object obj = getHandler();
            if (obj == null)
            {
                removeCallbacks(E);
                post(E);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!((Handler) (obj)).hasMessages(0, E))
            {
                obj = Message.obtain(((Handler) (obj)), E);
                obj.what = 0;
                obj.obj = E;
                ((Message) (obj)).sendToTarget();
            }
        }
    }

    void m()
    {
        if (v != null)
        {
            v.setVisibility(0);
            return;
        } else
        {
            v = new _cls3(getContext());
            v.setClickable(true);
            v.setOnClickListener(new y1(this));
            setClipToPadding(false);
            addView(v, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            return;
        }
    }

    protected abstract int n();

    public void o()
    {
        boolean flag;
        int k1;
        flag = false;
        k1 = App.am;
        if (k > 1 && D != null)
        {
            D.setVisibility(8);
        }
        k;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 61
    //                   2 113
    //                   3 171;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        int i1;
        int j1;
        int l1;
        int i2;
        if (App.aR())
        {
            i1 = 0;
        } else
        {
            i1 = z;
        }
        l1 = z;
        i2 = com.whatsapp.a1g.a().n;
        if (App.aR())
        {
            j1 = z;
        } else
        {
            j1 = 0;
        }
        setPadding(i1, i2 + l1, j1, z / 2);
        if (k1 == 0) goto _L1; else goto _L3
_L3:
        if (App.aR())
        {
            i1 = 0;
        } else
        {
            i1 = z;
        }
        l1 = z / 2;
        if (App.aR())
        {
            j1 = z;
        } else
        {
            j1 = 0;
        }
        setPadding(i1, l1, j1, z / 2);
        setMinimumHeight((int)getResources().getDimension(0x7f0a0030));
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        if (App.aR())
        {
            i1 = 0;
        } else
        {
            i1 = z;
        }
        k1 = z / 2;
        j1 = ((flag) ? 1 : 0);
        if (App.aR())
        {
            j1 = z;
        }
        setPadding(i1, k1, j1, z / 2 + com.whatsapp.a1g.a().n);
        setMinimumHeight((int)getResources().getDimension(0x7f0a0031));
        return;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (v != null)
        {
            v.layout(0, 0, getWidth(), getHeight());
        }
    }

    protected abstract int q();

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[6];
        i1 = 0;
        obj = "=D].\",XR,.1El*()\004^14-B]?\030,FG\0074,H\t";
        byte0 = -1;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "?Y";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "8J";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "=D].\",XR,.1E\034?\"*OZ9+1LZ,\"3X\034*\"3DG=\030,N@72,HVx.-\013]-+2\n\023";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "~\003";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "~OR,&c";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                J = as;
                x = 0.0F;
                B = 0.0F;
                z = -1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_272;
_L3:
        byte byte1 = 71;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 94;
          goto _L9
_L5:
        byte1 = 43;
          goto _L9
_L6:
        byte1 = 51;
          goto _L9
        byte1 = 88;
          goto _L9
    }

    private class _cls3 extends View
    {

        final ConversationRow a;
        private final Rect b = new Rect();

        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            if (isSelected())
            {
                getDrawingRect(b);
                b.top = a.l.top - (int)(1.5F * com.whatsapp.a1g.a().g);
                b.bottom = a.l.bottom + Math.max(1, (int)(0.5F * com.whatsapp.a1g.a().g));
                canvas.drawRect(b, ConversationRow.b());
            }
        }

        _cls3(Context context)
        {
            a = ConversationRow.this;
            super(context);
        }
    }

}
