// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Toast;
import butterknife.ButterKnife;
import chp;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.share.wechat.ShareActivity;
import com.ubercab.ui.TextView;
import cwm;
import cwu;
import cxk;
import czf;
import dbf;
import dbj;
import dtp;
import fic;
import gmg;
import n;

// Referenced classes of package com.ubercab.client.feature.share:
//            ShareFragment

public class b
{

    final ShareFragment a;
    private final View b;
    TextView mTextViewCode;
    TextView mTextViewPromoMessage;

    private void a()
    {
        String s = a.getString(0x7f07040b, new Object[] {
            ShareFragment.c(a)
        });
        String s1 = a.getString(0x7f070406, new Object[] {
            ShareFragment.d(a), ShareFragment.c(a), ShareFragment.e(a)
        });
        fic fic1 = new fic(a.getActivity());
        if (a.i.z() || !a.e.b(dbf.cJ))
        {
            fic1.a(s, s1, ShareFragment.a(ShareFragment.f(a)));
        }
        if (a.e.a(dbf.bj, dbj.a))
        {
            fic1.a(ShareActivity.a(a.getActivity(), s1, cxk.b));
        }
        fic1.d(s1).c(s1).a(s, s1).e(s1).b(a.getString(0x7f0703ea)).a(ShareFragment.d(a)).a();
    }

    public static void a(a a1)
    {
        a1.b();
    }

    private void b()
    {
        mTextViewCode.setText(ShareFragment.d(a));
        c();
    }

    static void b(c c1)
    {
        c1.a();
    }

    static View c(a a1)
    {
        return a1.b;
    }

    private void c()
    {
        Object obj = new ClickableSpan() {

            final ShareFragment.HeaderViewHolder a;

            public final void onClick(View view)
            {
                dtp.a((RiderActivity)a.a.getActivity(), 0, null, a.a.getString(0x7f070407, new Object[] {
                    ShareFragment.c(a.a)
                }), a.a.getString(0x7f07009a).toUpperCase());
            }

            public final void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                a = ShareFragment.HeaderViewHolder.this;
                super();
            }
        };
        SpannableString spannablestring = new SpannableString(a.getString(0x7f0703f3));
        spannablestring.setSpan(obj, 0, spannablestring.length(), 33);
        spannablestring.setSpan(new ForegroundColorSpan(a.getResources().getColor(0x7f0d00bc)), 0, spannablestring.length(), 33);
        obj = new SpannableStringBuilder(a.getString(0x7f0703f2, new Object[] {
            ShareFragment.c(a)
        }));
        ((SpannableStringBuilder) (obj)).append(" ");
        ((SpannableStringBuilder) (obj)).append(spannablestring);
        mTextViewPromoMessage.setHighlightColor(0);
        mTextViewPromoMessage.setText(((CharSequence) (obj)));
        mTextViewPromoMessage.setMovementMethod(LinkMovementMethod.getInstance());
    }

    final void a(boolean flag)
    {
        int i = cwm.b(a.getActivity());
        i = cwu.a(a.getActivity()) - i;
        android.view.teListener telistener = b.getLayoutParams();
        if (!flag)
        {
            telistener.b = i;
            b.setLayoutParams(telistener);
            return;
        } else
        {
            Object obj = ShareFragment.b(a).getLayoutParams();
            obj.a = -2;
            ShareFragment.b(a).setLayoutParams(((android.view.nt.HeaderViewHolder.a) (obj)));
            int j = (int)a.getResources().getDimension(0x7f08020f);
            obj = ValueAnimator.ofInt(new int[] {
                b.getMeasuredHeight(), i - j
            });
            ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final ShareFragment.HeaderViewHolder a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    android.view.ViewGroup.LayoutParams layoutparams = ShareFragment.HeaderViewHolder.c(a).getLayoutParams();
                    layoutparams.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
                    ShareFragment.HeaderViewHolder.c(a).setLayoutParams(layoutparams);
                }

            
            {
                a = ShareFragment.HeaderViewHolder.this;
                super();
            }
            });
            ((ValueAnimator) (obj)).setDuration(750L);
            ((ValueAnimator) (obj)).start();
            return;
        }
    }

    void onClickCode()
    {
        a.c.a(n.ff);
        ((ClipboardManager)a.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a.getString(0x7f0703ef), mTextViewCode.getText()));
        Toast toast = Toast.makeText(a.getActivity(), a.getString(0x7f0703f0), 0);
        toast.setGravity(17, 0, 0);
        toast.show();
    }

    void onClickInvite()
    {
        a.c.a(n.fp);
        a();
    }

    _cls2.a(ShareFragment sharefragment, View view)
    {
        a = sharefragment;
        super();
        b = view;
        ButterKnife.inject(this, view);
    }
}
