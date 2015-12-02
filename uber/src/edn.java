// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.ubercab.client.feature.hiring.template.TapLineQuestionTemplate;
import java.util.Arrays;

public final class edn extends ClickableSpan
{

    final TapLineQuestionTemplate a;
    private final cev b;

    public edn(TapLineQuestionTemplate taplinequestiontemplate, cev cev1)
    {
        a = taplinequestiontemplate;
        super();
        b = cev1;
    }

    public final void onClick(View view)
    {
        view = (Spanned)a.mContentTextView.getText();
        view = view.subSequence(view.getSpanStart(this), view.getSpanEnd(this)).toString().replaceAll("^\\s+", "");
        if (view.isEmpty())
        {
            return;
        } else
        {
            view = new edi(Arrays.asList(new String[] {
                view.substring(0, view.length() - 1)
            }));
            b.c(view);
            return;
        }
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        textpaint.setUnderlineText(false);
    }
}
