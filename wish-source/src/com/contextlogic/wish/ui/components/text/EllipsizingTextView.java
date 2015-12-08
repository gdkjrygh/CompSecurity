// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.contextlogic.wish.ui.components.text:
//            UnifiedFontTextView

public class EllipsizingTextView extends UnifiedFontTextView
{
    public static interface EllipsizingTextViewListener
    {

        public abstract void ellipsizeStateChanged(boolean flag);
    }


    private static final String ELLIPSIS = "...";
    private final List ellipsizeListeners;
    private String fullText;
    private boolean isEllipsized;
    private boolean isStale;
    private float lineAdditionalVerticalPadding;
    private float lineSpacingMultiplier;
    private int maxLines;
    private boolean programmaticChange;

    public EllipsizingTextView(Context context)
    {
        super(context);
        ellipsizeListeners = new ArrayList();
        maxLines = -1;
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ellipsizeListeners = new ArrayList();
        maxLines = -1;
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
        setMaxLines(context.obtainStyledAttributes(attributeset, new int[] {
            0x1010153
        }).getInt(0, 2));
    }

    public EllipsizingTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ellipsizeListeners = new ArrayList();
        maxLines = -1;
        lineSpacingMultiplier = 1.0F;
        lineAdditionalVerticalPadding = 0.0F;
        setMaxLines(context.obtainStyledAttributes(attributeset, new int[] {
            0x1010153
        }).getInt(0, 2));
    }

    private Layout createWorkingLayout(String s)
    {
        return new StaticLayout(s, getPaint(), getWidth() - getPaddingLeft() - getPaddingRight(), android.text.Layout.Alignment.ALIGN_NORMAL, lineSpacingMultiplier, lineAdditionalVerticalPadding, false);
    }

    private void resetText()
    {
        Object obj;
        String s;
        int i;
        boolean flag;
        boolean flag1;
        i = getMaxLines();
        s = fullText;
        flag1 = false;
        flag = flag1;
        obj = s;
        if (i == -1) goto _L2; else goto _L1
_L1:
        Layout layout;
        layout = createWorkingLayout(s);
        flag = flag1;
        obj = s;
        if (layout.getLineCount() <= i) goto _L2; else goto _L3
_L3:
        obj = fullText.substring(0, layout.getLineEnd(i - 1)).trim();
_L8:
        if (createWorkingLayout((new StringBuilder()).append(((String) (obj))).append("...").toString()).getLineCount() <= i) goto _L5; else goto _L4
_L4:
        int j = ((String) (obj)).lastIndexOf(' ');
        if (j != -1) goto _L6; else goto _L5
_L5:
        obj = (new StringBuilder()).append(((String) (obj))).append("...").toString();
        flag = true;
_L2:
        if (((String) (obj)).equals(getText()))
        {
            break MISSING_BLOCK_LABEL_161;
        }
        programmaticChange = true;
        setText(((CharSequence) (obj)));
        programmaticChange = false;
        isStale = false;
        if (flag != isEllipsized)
        {
            isEllipsized = flag;
            for (obj = ellipsizeListeners.iterator(); ((Iterator) (obj)).hasNext(); ((EllipsizingTextViewListener)((Iterator) (obj)).next()).ellipsizeStateChanged(flag)) { }
        }
        break; /* Loop/switch isn't completed */
_L6:
        obj = ((String) (obj)).substring(0, j);
        if (true) goto _L8; else goto _L7
        Exception exception;
        exception;
        programmaticChange = false;
        throw exception;
_L7:
    }

    public void addEllipsizeListener(EllipsizingTextViewListener ellipsizingtextviewlistener)
    {
        if (ellipsizingtextviewlistener == null)
        {
            throw new NullPointerException();
        } else
        {
            ellipsizeListeners.add(ellipsizingtextviewlistener);
            return;
        }
    }

    public int getMaxLines()
    {
        return maxLines;
    }

    public boolean isEllipsized()
    {
        return isEllipsized;
    }

    protected void onDraw(Canvas canvas)
    {
        if (isStale)
        {
            super.setEllipsize(null);
            resetText();
        }
        super.onDraw(canvas);
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (!programmaticChange)
        {
            fullText = charsequence.toString();
            isStale = true;
        }
    }

    public void removeEllipsizeListener(EllipsizingTextViewListener ellipsizingtextviewlistener)
    {
        ellipsizeListeners.remove(ellipsizingtextviewlistener);
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
    {
    }

    public void setLineSpacing(float f, float f1)
    {
        lineAdditionalVerticalPadding = f;
        lineSpacingMultiplier = f1;
        super.setLineSpacing(f, f1);
    }

    public void setMaxLines(int i)
    {
        super.setMaxLines(i);
        maxLines = i;
        isStale = true;
    }
}
