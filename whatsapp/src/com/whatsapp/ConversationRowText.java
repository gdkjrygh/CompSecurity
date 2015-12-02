// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.ai;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            ConversationRow, TextEmojiLabel, ao5, App, 
//            u5, og, k, mk, 
//            iz, Conversation, alb, eg

public class ConversationRowText extends ConversationRow
{

    private static final String K[];
    private final TextEmojiLabel J = (TextEmojiLabel)findViewById(0x7f0b018b);

    ConversationRowText(Context context, c4 c4_1)
    {
        super(context, c4_1);
        J.setLinkHandler(new ao5());
        J.setAutoLinkMask(0);
        J.setLinksClickable(false);
        J.setFocusable(false);
        J.setClickable(false);
        J.setLongClickable(false);
        b(c4_1);
    }

    public static SpannableStringBuilder a(String s, String s1, SpannableStringBuilder spannablestringbuilder)
    {
        int j = App.am;
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return spannablestringbuilder;
_L2:
        String s2 = s.toLowerCase();
        String s3 = s1.toLowerCase();
        int i = s2.indexOf(s3);
        s1 = spannablestringbuilder;
        do
        {
            spannablestringbuilder = s1;
            if (i < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            spannablestringbuilder = s1;
            if (s1 == null)
            {
                spannablestringbuilder = new SpannableStringBuilder(s);
            }
            spannablestringbuilder.setSpan(new BackgroundColorSpan(-256), i, s3.length() + i, 33);
            i = s2.indexOf(s3, i + 1);
            s1 = spannablestringbuilder;
            if (j != 0)
            {
                return spannablestringbuilder;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean a(c4 c4_1)
    {
        og og1;
        int j;
        boolean flag2;
        flag2 = false;
        j = App.am;
        if (c4_1.y.b && j == 0)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        og1 = u5.d(c4_1.y.a);
        if (!og1.k()) goto _L2; else goto _L1
_L1:
        if (c4_1.G == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        og og2 = App.az.e(c4_1.G);
        og og3 = App.az.e(og1.x());
        String s;
        int i;
        int l;
        if (App.Z != null)
        {
            s = (new StringBuilder()).append(App.Z.jabber_id).append(K[1]).toString();
        } else
        {
            s = "";
        }
        if (mk.f(og1.a) || og3 != null && (og3.z != null || s.equals(og3.a)) || og2 != null && og2.z != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (j == 0) goto _L5; else goto _L4
_L4:
        flag = flag2;
        if (j == 0) goto _L6; else goto _L2
_L2:
        if (og1.z != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (flag) goto _L5; else goto _L7
_L7:
        flag1 = flag;
        if (c4_1.y.a == null) goto _L5; else goto _L8
_L8:
        l = c4_1.y.a.indexOf(K[0]);
        flag1 = true;
        i = 0;
_L13:
        flag = flag1;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!Character.isDigit(c4_1.y.a.charAt(i))) goto _L10; else goto _L9
_L9:
        if (j == 0) goto _L12; else goto _L11
_L11:
        flag = false;
_L10:
        i++;
        flag1 = flag;
        if (j == 0) goto _L13; else goto _L6
_L6:
        return flag;
_L12:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        return flag1;
        return true;
    }

    private void b(c4 c4_1)
    {
        String s = c4_1.e();
        int j;
        if (App.aR())
        {
            int i;
            if (s != null)
            {
                i = s.lastIndexOf('\n');
                float f1;
                Object obj;
                android.widget.LinearLayout.LayoutParams layoutparams;
                if (i > 0)
                {
                    obj = s.substring(i);
                } else
                {
                    obj = s;
                }
                if (!com.whatsapp.iz.a.isRtl(((String) (obj))))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            } else
            {
                i = 1;
            }
            obj = findViewById(0x7f0b0183);
            layoutparams = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            if (i != 0)
            {
                ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(-2, 0), android.view.View.MeasureSpec.makeMeasureSpec(-2, 0));
                i = ((View) (obj)).getMeasuredWidth();
            } else
            {
                i = 0;
            }
            j = i;
            if (layoutparams.leftMargin != -i)
            {
                layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.leftMargin = -i;
                layoutparams.gravity = 80;
                ((View) (obj)).setLayoutParams(layoutparams);
                j = i;
            }
        } else
        {
            j = 0;
        }
        setMessageText(s, J, j, c4_1);
        J.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        J.clearAnimation();
        if (s.length() == 1 && (s.charAt(0) == '\uE022' || s.charAt(0) == '\u2764') || s.length() == 2 && s.charAt(0) == '\u2764' && s.charAt(1) == '\uFE0F')
        {
            J.setCompoundDrawablesWithIntrinsicBounds(0x7f020593, 0, 0, 0);
            obj = new ScaleAnimation(0.85F, 0.8F, 0.85F, 0.8F, 1, 0.5F, 1, 0.5F);
            ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
            ((Animation) (obj)).setDuration(500L);
            ((Animation) (obj)).setRepeatMode(2);
            ((Animation) (obj)).setRepeatCount(-1);
            J.startAnimation(((Animation) (obj)));
            J.setText("");
        }
        obj = (ImageView)findViewById(0x7f0b018a);
        if (obj != null)
        {
            ((ImageView) (obj)).setVisibility(8);
            if (c4_1.B != null)
            {
                c4_1 = (byte[])(byte[])c4_1.B;
                c4_1 = BitmapFactory.decodeByteArray(c4_1, 0, c4_1.length);
                if (c4_1 != null)
                {
                    ((ImageView) (obj)).setVisibility(0);
                    f1 = J.getPaint().getFontSpacing() * 3F;
                    ((ImageView) (obj)).setImageBitmap(Bitmap.createScaledBitmap(c4_1, (int)(((float)c4_1.getWidth() * f1) / (float)c4_1.getHeight()), (int)f1, true));
                    c4_1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
                    ai.a(J.getText(), ((View) (obj)), J, c4_1);
                }
            }
        }
    }

    public static void setMessageText(String s, TextEmojiLabel textemojilabel, int i, c4 c4_1)
    {
        int i1 = App.am;
        com.whatsapp.iz.a(textemojilabel, s);
        textemojilabel.setTextSize(b(textemojilabel.getResources()));
        Object obj = c.a(s, textemojilabel.getContext(), textemojilabel.getPaint(), 1.4F);
        SpannableStringBuilder spannablestringbuilder = a(s, Conversation.o, ((SpannableStringBuilder) (obj)));
        obj = spannablestringbuilder;
        if (i != 0)
        {
            obj = spannablestringbuilder;
            if (spannablestringbuilder == null)
            {
                obj = new SpannableStringBuilder(s);
            }
            ((SpannableStringBuilder) (obj)).append(K[2]);
            ((SpannableStringBuilder) (obj)).setSpan(new alb(i - (int)textemojilabel.getPaint().measureText(" "), (int)(textemojilabel.getTextSize() - textemojilabel.getResources().getDisplayMetrics().scaledDensity)), ((SpannableStringBuilder) (obj)).length() - 1, ((SpannableStringBuilder) (obj)).length(), 33);
        }
        int j;
        int l;
        int j1;
        if (obj == null)
        {
            s = new SpannableStringBuilder(s);
        } else
        {
            s = ((String) (obj));
        }
        Linkify.addLinks(s, 15);
        obj = (URLSpan[])s.getSpans(0, s.length(), android/text/style/URLSpan);
        if (obj == null || obj.length <= 0) goto _L2; else goto _L1
_L1:
        if (!a(c4_1)) goto _L4; else goto _L3
_L3:
        j1 = obj.length;
        i = 0;
_L9:
        if (i >= j1) goto _L4; else goto _L5
_L5:
        c4_1 = obj[i];
        l = s.getSpanEnd(c4_1);
        j = l;
        if (s.length() > l)
        {
            j = l;
            if (s.charAt(l) == '/')
            {
                j = l + 1;
            }
        }
        s.setSpan(new eg(c4_1.getURL()), s.getSpanStart(c4_1), j, s.getSpanFlags(c4_1));
        if (i1 == 0) goto _L6; else goto _L4
_L4:
        j = obj.length;
        i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            s.removeSpan(obj[i]);
            i++;
        } while (i1 == 0);
        textemojilabel.setText(s, android.widget.TextView.BufferType.SPANNABLE);
        if (i1 == 0) goto _L7; else goto _L2
_L2:
        textemojilabel.setText(s);
_L7:
        return;
_L6:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a()
    {
        b(C);
        super.a();
    }

    public void a(c4 c4_1, boolean flag)
    {
        boolean flag1;
        if (c4_1 != C)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1 | flag;
        super.a(c4_1, flag);
        if (flag)
        {
            b(c4_1);
        }
    }

    public void f()
    {
        super.f();
        if (App.aR())
        {
            J.setPadding(J.getPaddingLeft(), J.getPaddingTop(), J.getPaddingRight() * 4, J.getPaddingBottom());
        }
    }

    protected int n()
    {
        return 0x7f03004f;
    }

    protected int q()
    {
        return 0x7f030050;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\037n\bQ\006>iUG\036/3HC\032";
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
                obj = "\037n\bQ\006>iUG\036/3HC\032";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\177=";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                K = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 110;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 95;
          goto _L9
_L5:
        byte0 = 29;
          goto _L9
_L6:
        byte0 = 38;
          goto _L9
        byte0 = 38;
          goto _L9
    }
}
