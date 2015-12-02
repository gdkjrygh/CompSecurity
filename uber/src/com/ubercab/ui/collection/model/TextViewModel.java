// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.collection.model;


// Referenced classes of package com.ubercab.ui.collection.model:
//            ViewModel, Shape_TextViewModel

public abstract class TextViewModel extends ViewModel
{

    public TextViewModel()
    {
    }

    public static TextViewModel create(CharSequence charsequence, int i)
    {
        return create(charsequence, i, 0);
    }

    public static TextViewModel create(CharSequence charsequence, int i, int j)
    {
        return (new Shape_TextViewModel()).setText(charsequence).setTextAppearance(i).setGravity(j);
    }

    public abstract int getBackgroundDrawable();

    public abstract android.view.View.OnClickListener getClickListener();

    public abstract boolean getDefaultSelectBackground();

    public abstract android.text.TextUtils.TruncateAt getEllipsize();

    public abstract int getGravity();

    public abstract boolean getIncludeFontPadding();

    public abstract float getLineSpacingMultiplier();

    public abstract int getMaxLines();

    public abstract int getMinimumHeight();

    public abstract int getPaddingBottom();

    public abstract int getPaddingLeft();

    public abstract int getPaddingRight();

    public abstract int getPaddingTop();

    public abstract CharSequence getText();

    public abstract int getTextAppearance();

    public abstract TextViewModel setBackgroundDrawable(int i);

    public abstract TextViewModel setClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract TextViewModel setDefaultSelectBackground(boolean flag);

    public abstract TextViewModel setEllipsize(android.text.TextUtils.TruncateAt truncateat);

    public abstract TextViewModel setGravity(int i);

    public abstract TextViewModel setIncludeFontPadding(boolean flag);

    public abstract TextViewModel setLineSpacingMultiplier(float f);

    public abstract TextViewModel setMaxLines(int i);

    public abstract TextViewModel setMinimumHeight(int i);

    public TextViewModel setPadding(int i, int j, int k, int l)
    {
        setPaddingLeft(i);
        setPaddingRight(k);
        setPaddingTop(j);
        return setPaddingBottom(l);
    }

    public abstract TextViewModel setPaddingBottom(int i);

    public abstract TextViewModel setPaddingLeft(int i);

    public abstract TextViewModel setPaddingRight(int i);

    public abstract TextViewModel setPaddingTop(int i);

    abstract TextViewModel setText(CharSequence charsequence);

    public TextViewModel setText(CharSequence charsequence, int i)
    {
        return setText(charsequence).setTextAppearance(i);
    }

    abstract TextViewModel setTextAppearance(int i);
}
