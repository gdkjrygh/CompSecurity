// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            du, zx, App, RegisterName, 
//            mn, qs, abc, fd, 
//            he, m7, abl, cv

class dw extends du
{

    private static final String z[];
    private int c;
    final RegisterName d;
    private boolean e;
    private long f;
    private android.view.View.OnClickListener g;

    public dw(RegisterName registername)
    {
        d = registername;
        super(registername, 0x7f030093);
        c = 0;
        g = new zx(this);
    }

    protected void a(int i)
    {
label0:
        {
label1:
            {
                int j;
label2:
                {
                    j = App.am;
                    c = i;
                    if (i != 1 && App.f(getContext()) != 3)
                    {
                        break label1;
                    }
                    findViewById(0x7f0b0264).setVisibility(0);
                    findViewById(0x7f0b0265).setVisibility(8);
                    RegisterName.i(d);
                    if (RegisterName.h(d) != null)
                    {
                        RegisterName.h(d).setVisibility(8);
                    }
                    RegisterName.g(d).removeMessages(0);
                    Log.i(z[3]);
                    Object obj = new mn(this);
                    findViewById(0x7f0b0264).setOnClickListener(((android.view.View.OnClickListener) (obj)));
                    findViewById(0x7f0b0268).setOnClickListener(((android.view.View.OnClickListener) (obj)));
                    obj = new qs(this);
                    findViewById(0x7f0b0267).setOnClickListener(((android.view.View.OnClickListener) (obj)));
                    obj = new abc(this);
                    findViewById(0x7f0b0269).setOnClickListener(((android.view.View.OnClickListener) (obj)));
                    obj = findViewById(0x7f0b025c);
                    View view = findViewById(0x7f0b025e);
                    findViewById(0x7f0b007a);
                    View view1 = findViewById(0x7f0b0262);
                    boolean flag = view1.isShown();
                    if (!e)
                    {
                        e = true;
                        ((View) (obj)).startAnimation(new fd(this, ((View) (obj)), view, view1, flag));
                    }
                    ((View) (obj)).setOnClickListener(new he(this, ((View) (obj)), flag, view1, view));
                    if (f < 0x5265c00L)
                    {
                        findViewById(0x7f0b0266).setVisibility(0);
                        findViewById(0x7f0b0263).setVisibility(8);
                        if (j == 0)
                        {
                            break label2;
                        }
                    }
                    findViewById(0x7f0b0266).setVisibility(8);
                    findViewById(0x7f0b0263).setVisibility(0);
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            findViewById(0x7f0b0264).setVisibility(8);
            findViewById(0x7f0b0265).setVisibility(0);
        }
    }

    public void b()
    {
        RegisterName.a(d, findViewById(0x7f0b025b));
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        int i;
label0:
        {
            int k = App.am;
            super.onCreate(bundle);
            getWindow().setFormat(1);
            getWindow().addFlags(4096);
            getWindow().setSoftInputMode(3);
            obj = (TextView)findViewById(0x7f0b007a);
            ((TextView) (obj)).setPaintFlags(((TextView) (obj)).getPaintFlags() | 8);
            ((TextView) (obj)).setOnClickListener(g);
            ((TextView) (obj)).setOnTouchListener(RegisterName.e(d));
            TextView textview = (TextView)findViewById(0x7f0b0262);
            long l2 = m7.b(z[1]);
            long l1 = l2;
            if (l2 == 0L)
            {
                l1 = System.currentTimeMillis() + 0x757b12c00L;
            }
            f = l1 - System.currentTimeMillis();
            int l = App.j(d);
            if (l1 >= 0x40acd884560L)
            {
                obj = d.getString(0x7f0e021a);
                textview.setVisibility(4);
                if (k == 0)
                {
                    break label0;
                }
            }
            if (f >= 0x73df16000L)
            {
                i = (int)(f / 0x757b12c00L);
                if (i == 0)
                {
                    i = 1;
                }
                TextView textview1;
                TextView textview2;
                TextView textview3;
                int j;
                if (l == 0)
                {
                    j = 0x7f0d002e;
                } else
                {
                    j = 0x7f0d002f;
                }
                obj = String.format(App.j.a(j, i), new Object[] {
                    Integer.valueOf(i)
                });
                if (k == 0)
                {
                    break label0;
                }
            }
            if (f >= 0x9a7ec800L)
            {
                j = (int)(f / 0x9a7ec800L);
                if (l == 0)
                {
                    i = 0x7f0d001a;
                } else
                {
                    i = 0x7f0d001b;
                }
                obj = String.format(App.j.a(i, j), new Object[] {
                    Integer.valueOf(j)
                });
                if (k == 0)
                {
                    break label0;
                }
            }
            if (f >= 0x5265c00L)
            {
                j = (int)(f / 0x5265c00L);
                if (l == 0)
                {
                    i = 0x7f0d000a;
                } else
                {
                    i = 0x7f0d000b;
                }
                obj = String.format(App.j.a(i, j), new Object[] {
                    Integer.valueOf(j)
                });
                if (k == 0)
                {
                    break label0;
                }
            }
            if (f > 0L)
            {
                obj = d.getString(0x7f0e0382);
                if (k == 0)
                {
                    break label0;
                }
            }
            obj = d.getString(0x7f0e0381);
        }
label1:
        {
label2:
            {
label3:
                {
                    textview1 = (TextView)findViewById(0x7f0b0260);
                    if (textview1 == null)
                    {
                        break label2;
                    }
                    i = ((String) (obj)).indexOf('\n', 0);
                    j = ((String) (obj)).indexOf('\n', i + 1);
                    String s;
                    String s1;
                    String s2;
                    if (i > 0)
                    {
                        s = ((String) (obj)).substring(0, i);
                    } else
                    {
                        s = "";
                    }
                    if (j > i)
                    {
                        s1 = ((String) (obj)).substring(i + 1, j);
                    } else
                    {
                        s1 = ((String) (obj)).substring(i + 1);
                    }
                    if (j > 0)
                    {
                        s2 = ((String) (obj)).substring(j + 1);
                    } else
                    {
                        s2 = "";
                    }
                    textview2 = (TextView)findViewById(0x7f0b025f);
                    textview3 = (TextView)findViewById(0x7f0b0261);
                    if (!TextUtils.isEmpty(s))
                    {
                        textview2.setText(s);
                        if (k == 0)
                        {
                            break label3;
                        }
                    }
                    textview2.setVisibility(8);
                }
label4:
                {
                    if (!TextUtils.isEmpty(s1))
                    {
                        textview1.setText(s1);
                        if (k == 0)
                        {
                            break label4;
                        }
                    }
                    textview1.setVisibility(8);
                }
label5:
                {
                    if (!TextUtils.isEmpty(s2))
                    {
                        textview3.setText(s2);
                        if (k == 0)
                        {
                            break label5;
                        }
                    }
                    textview3.setVisibility(8);
                }
label6:
                {
                    if (f < 0x5265c00L)
                    {
                        ((ImageView)findViewById(0x7f0b025d)).setImageResource(0x7f0204e5);
                        i = 0x7f0e037e;
                        textview.setPadding(0, 0, 0, (int)(textview.getTextSize() / 2.0F));
                        if (k == 0)
                        {
                            break label6;
                        }
                    }
                    i = 0x7f0e037f;
                }
                if (k == 0)
                {
                    break label1;
                }
            }
            ((TextView)findViewById(0x7f0b025f)).setText(((String) (obj)).replace('\n', ' '));
            if (f < 0x5265c00L)
            {
                ((ImageView)findViewById(0x7f0b025d)).setImageResource(0x7f0204e6);
                i = 0x7f0e037e;
                if (k == 0)
                {
                    break label1;
                }
            }
            i = 0x7f0e037f;
        }
        obj = App.e(d);
        if (obj != null)
        {
            textview.setText(d.getString(i, new Object[] {
                obj
            }));
        }
        if (bundle == null)
        {
            i = 0;
        } else
        {
            i = bundle.getInt(z[2]);
        }
        a(i);
        RegisterName.a(d, findViewById(0x7f0b025b));
        if (RegisterName.h(d) != null)
        {
            RegisterName.h(d).setOnClickListener(new cv(this));
        }
    }

    public Bundle onSaveInstanceState()
    {
        Bundle bundle = super.onSaveInstanceState();
        if (bundle != null)
        {
            bundle.putInt(z[0], c);
        }
        return bundle;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\013Fqp}";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\035J`mj\031Fykv'Vqp}";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\013Fqp}";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\nWwmk\fWbjy\025W?wa\026Q?bq\026[cl}\034";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
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
        byte byte0 = 24;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 50;
          goto _L9
_L6:
        byte0 = 16;
          goto _L9
        byte0 = 4;
          goto _L9
    }
}
