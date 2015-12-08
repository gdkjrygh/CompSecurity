// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

// Referenced classes of package com.walmartlabs.android.pharmacy.ui.dob:
//            MultipleDigitEditor

class this._cls0 extends BaseInputConnection
{

    final MultipleDigitEditor this$0;

    public boolean deleteSurroundingText(int i, int j)
    {
        return sendKeyEvent(new KeyEvent(0, 67));
    }

    public CharSequence getTextBeforeCursor(int i, int j)
    {
        StringBuffer stringbuffer = new StringBuffer(MultipleDigitEditor.access$000(MultipleDigitEditor.this).length + 1);
        stringbuffer.append(" ");
        for (j = 0; j <= MultipleDigitEditor.access$100(MultipleDigitEditor.this); j++)
        {
            stringbuffer.append(MultipleDigitEditor.access$000(MultipleDigitEditor.this)[j]);
        }

        return stringbuffer.subSequence(Math.max(0, stringbuffer.length() - i), stringbuffer.length());
    }

    (View view, boolean flag)
    {
        this$0 = MultipleDigitEditor.this;
        super(view, flag);
    }
}
