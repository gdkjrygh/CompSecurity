// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.BaseMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceInputView extends EditText
{
    private class TcNumberFormattingTextWatcher
        implements TextWatcher
    {

        final PriceInputView this$0;

        public void afterTextChanged(Editable editable)
        {
            this;
            JVM INSTR monitorenter ;
            reformat(editable, -1);
            this;
            JVM INSTR monitorexit ;
            return;
            editable;
            throw editable;
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        private TcNumberFormattingTextWatcher()
        {
            this$0 = PriceInputView.this;
            super();
        }

    }


    private static final int GROUP_CURRENCY = 1;
    private static final int GROUP_DECIMAL_SEPARATOR = 3;
    private static final int GROUP_DOLLAR = 2;
    private static final int GROUP_FIRST_DECIMAL = 4;
    private static final int GROUP_SECOND_DECIMAL = 5;
    private static final String mCurrency;
    private final char mDecimalPoint;
    private ForegroundColorSpan mDollarSpan;
    private ForegroundColorSpan mDotSpan;
    private ForegroundColorSpan mFirstDecimalSpan;
    private boolean mInit;
    private final Pattern mPriceInputPattern;
    private final Pattern mPriceOutputPattern;
    private ForegroundColorSpan mSecondDecimalSpan;
    private boolean mSelfChange;
    private ForegroundColorSpan mSpans[];

    public PriceInputView(Context context)
    {
        super(context);
        mDecimalPoint = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        mPriceInputPattern = Pattern.compile((new StringBuilder()).append("(\\$)?(\\d+)?(\\").append(mDecimalPoint).append(")?(\\d)?(\\d)?").toString());
        mPriceOutputPattern = Pattern.compile((new StringBuilder()).append("\\$\\d+(\\").append(mDecimalPoint).append("\\d\\d)?").toString());
        mSelfChange = false;
        init();
    }

    public PriceInputView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDecimalPoint = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        mPriceInputPattern = Pattern.compile((new StringBuilder()).append("(\\$)?(\\d+)?(\\").append(mDecimalPoint).append(")?(\\d)?(\\d)?").toString());
        mPriceOutputPattern = Pattern.compile((new StringBuilder()).append("\\$\\d+(\\").append(mDecimalPoint).append("\\d\\d)?").toString());
        mSelfChange = false;
        init();
    }

    public PriceInputView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDecimalPoint = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        mPriceInputPattern = Pattern.compile((new StringBuilder()).append("(\\$)?(\\d+)?(\\").append(mDecimalPoint).append(")?(\\d)?(\\d)?").toString());
        mPriceOutputPattern = Pattern.compile((new StringBuilder()).append("\\$\\d+(\\").append(mDecimalPoint).append("\\d\\d)?").toString());
        mSelfChange = false;
        init();
    }

    public PriceInputView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mDecimalPoint = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        mPriceInputPattern = Pattern.compile((new StringBuilder()).append("(\\$)?(\\d+)?(\\").append(mDecimalPoint).append(")?(\\d)?(\\d)?").toString());
        mPriceOutputPattern = Pattern.compile((new StringBuilder()).append("\\$\\d+(\\").append(mDecimalPoint).append("\\d\\d)?").toString());
        mSelfChange = false;
        init();
    }

    private int findSelectionStart(Editable editable)
    {
        int i;
        for (i = -1; i < editable.length() && ((ForegroundColorSpan[])editable.getSpans(i, i + 1, android/text/style/ForegroundColorSpan)).length == 0; i++) { }
        return i;
    }

    private void init()
    {
        setSingleLine();
        setRawInputType(8194);
        addTextChangedListener(new TcNumberFormattingTextWatcher());
        int i = getHintTextColors().getDefaultColor();
        i = Color.argb(Color.alpha(i) / 2, Color.red(i), Color.green(i), Color.blue(i));
        mDollarSpan = new ForegroundColorSpan(i);
        mDotSpan = new ForegroundColorSpan(i);
        mFirstDecimalSpan = new ForegroundColorSpan(i);
        mSecondDecimalSpan = new ForegroundColorSpan(i);
        mSpans = (new ForegroundColorSpan[] {
            mDollarSpan, mDotSpan, mFirstDecimalSpan, mSecondDecimalSpan
        });
        mInit = true;
    }

    private void insertSpans(Editable editable)
    {
        if (mInit) goto _L2; else goto _L1
_L1:
        Matcher matcher;
        return;
_L2:
        int i;
label0:
        {
            if (!(matcher = mPriceInputPattern.matcher(editable)).matches())
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 0;
            if (TextUtils.isEmpty(matcher.group(1)))
            {
                editable.insert(0, mCurrency);
                i = 0 + 1;
            }
            int j = i + Math.max(matcher.end(1) - matcher.start(1), 0);
            i = j;
            if (TextUtils.isEmpty(matcher.group(2)))
            {
                editable.insert(j, "0").setSpan(mDollarSpan, j, j + 1, 33);
                i = j + 1;
            }
            j = i + Math.max(matcher.end(2) - matcher.start(2), 0);
            i = j;
            if (TextUtils.isEmpty(matcher.group(3)))
            {
                editable.insert(j, String.valueOf(mDecimalPoint)).setSpan(mDotSpan, j, j + 1, 33);
                i = j + 1;
            }
            j = i + Math.max(matcher.end(3) - matcher.start(3), 0);
            if (!TextUtils.isEmpty(matcher.group(4)))
            {
                i = j;
                if (j != editable.getSpanStart(mSecondDecimalSpan))
                {
                    break label0;
                }
            }
            editable.insert(j, "0").setSpan(mFirstDecimalSpan, j, j + 1, 33);
            i = j + 1;
        }
        i += Math.max(matcher.end(4) - matcher.start(4), 0);
        if (TextUtils.isEmpty(matcher.group(5)))
        {
            editable.insert(i, "0").setSpan(mSecondDecimalSpan, i, i + 1, 33);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void reformat(Editable editable, int i)
    {
        while (!mInit || mSelfChange) 
        {
            return;
        }
        Object obj;
        if (i >= 0)
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(editable);
            int j = Math.min(i, findSelectionStart(spannablestringbuilder));
            ForegroundColorSpan aforegroundcolorspan[] = mSpans;
            int k = aforegroundcolorspan.length;
            for (i = 0; i < k; i++)
            {
                spannablestringbuilder.removeSpan(aforegroundcolorspan[i]);
            }

            obj = spannablestringbuilder;
            if (spannablestringbuilder.length() > j)
            {
                spannablestringbuilder.delete(j, spannablestringbuilder.length());
                obj = spannablestringbuilder;
            }
        } else
        {
            obj = stripCharacters(editable);
        }
        insertSpans(((Editable) (obj)));
        Selection.setSelection(((android.text.Spannable) (obj)), findSelectionStart(((Editable) (obj))));
        mSelfChange = true;
        editable.replace(0, editable.length(), ((CharSequence) (obj)), 0, ((Editable) (obj)).length());
        if (editable.toString().equals(obj.toString()))
        {
            Selection.setSelection(editable, Selection.getSelectionStart(((CharSequence) (obj))));
        }
        mSelfChange = false;
    }

    private Editable stripCharacters(Editable editable)
    {
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag1 = false;
        boolean flag = false;
        editable = new SpannableStringBuilder(editable);
        ForegroundColorSpan aforegroundcolorspan[] = mSpans;
        int k = aforegroundcolorspan.length;
        for (int i = 0; i < k; i++)
        {
            ForegroundColorSpan foregroundcolorspan = aforegroundcolorspan[i];
            if (editable.getSpanStart(foregroundcolorspan) >= 0 && editable.getSpanEnd(foregroundcolorspan) <= editable.length())
            {
                editable.delete(editable.getSpanStart(foregroundcolorspan), editable.getSpanEnd(foregroundcolorspan));
            }
            editable.removeSpan(foregroundcolorspan);
        }

        int j = 0;
        while (j < editable.length()) 
        {
            char c = editable.charAt(j);
            int l;
            boolean flag4;
            boolean flag5;
            boolean flag6;
            boolean flag7;
            if (Character.isDigit(c))
            {
                if (!flag2)
                {
                    flag5 = true;
                    l = j;
                    flag7 = flag;
                    flag6 = flag1;
                    flag4 = flag3;
                } else
                {
                    flag4 = flag3;
                    flag5 = flag2;
                    flag6 = flag1;
                    flag7 = flag;
                    l = j;
                    if (flag3)
                    {
                        if (!flag1)
                        {
                            flag6 = true;
                            flag4 = flag3;
                            flag5 = flag2;
                            flag7 = flag;
                            l = j;
                        } else
                        if (!flag)
                        {
                            flag7 = true;
                            flag4 = flag3;
                            flag5 = flag2;
                            flag6 = flag1;
                            l = j;
                        } else
                        {
                            editable.delete(j, j + 1);
                            l = j - 1;
                            flag4 = flag3;
                            flag5 = flag2;
                            flag6 = flag1;
                            flag7 = flag;
                        }
                    }
                }
            } else
            if (!flag3 && flag2 && c == mDecimalPoint)
            {
                flag4 = true;
                flag5 = flag2;
                flag6 = flag1;
                flag7 = flag;
                l = j;
            } else
            {
                editable.delete(j, j + 1);
                l = j - 1;
                flag4 = flag3;
                flag5 = flag2;
                flag6 = flag1;
                flag7 = flag;
            }
            j = l + 1;
            flag3 = flag4;
            flag2 = flag5;
            flag1 = flag6;
            flag = flag7;
        }
        return editable;
    }

    private void stripSpans(Editable editable)
    {
        mSelfChange = true;
        ForegroundColorSpan aforegroundcolorspan[] = mSpans;
        int j = aforegroundcolorspan.length;
        for (int i = 0; i < j; i++)
        {
            ForegroundColorSpan foregroundcolorspan = aforegroundcolorspan[i];
            if (editable.getSpanStart(foregroundcolorspan) >= 0 && editable.getSpanEnd(foregroundcolorspan) <= editable.length())
            {
                editable.delete(editable.getSpanStart(foregroundcolorspan), editable.getSpanEnd(foregroundcolorspan));
            }
            editable.removeSpan(foregroundcolorspan);
        }

        mSelfChange = false;
    }

    protected MovementMethod getDefaultMovementMethod()
    {
        return new BaseMovementMethod();
    }

    public String getPrice()
    {
        return getPrice(Locale.getDefault());
    }

    public String getPrice(Locale locale)
    {
        if (mPriceOutputPattern.matcher(getText()).matches())
        {
            return getText().toString().replace(mDecimalPoint, DecimalFormatSymbols.getInstance(locale).getDecimalSeparator());
        } else
        {
            return "";
        }
    }

    public String getPriceNumbers(Locale locale)
    {
        return getPrice(locale).replace(mCurrency, "");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        InputConnection inputconnection = super.onCreateInputConnection(editorinfo);
        editorinfo.imeOptions = editorinfo.imeOptions | 0x2000000;
        return inputconnection;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            if (TextUtils.isEmpty(getText()))
            {
                rect = new SpannableStringBuilder(getEditableText());
                insertSpans(rect);
                getEditableText().replace(0, getEditableText().length(), rect);
                return;
            } else
            {
                reformat(getEditableText(), getSelectionStart());
                return;
            }
        } else
        {
            stripSpans(getEditableText());
            return;
        }
    }

    protected void onSelectionChanged(int i, int j)
    {
        reformat(getEditableText(), i);
        super.onSelectionChanged(i, j);
    }

    public void setPrice(String s)
    {
        if (s != null)
        {
            s = new SpannableStringBuilder(s);
            reformat(s, s.length());
            mSelfChange = true;
            setText(s);
            mSelfChange = false;
            return;
        } else
        {
            setText(null);
            return;
        }
    }

    public void setPrice(String s, Locale locale)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s.replace(DecimalFormatSymbols.getInstance(locale).getDecimalSeparator(), mDecimalPoint);
        }
        setPrice(s1);
    }

    static 
    {
        mCurrency = Currency.getInstance(Locale.US).getSymbol(Locale.US);
    }

}
