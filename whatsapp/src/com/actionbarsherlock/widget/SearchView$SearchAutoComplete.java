// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

public class getThreshold extends AutoCompleteTextView
{

    private static final String z;
    private SearchView mSearchView;
    private int mThreshold;

    private boolean isEmpty()
    {
        return TextUtils.getTrimmedLength(getText()) == 0;
    }

    public boolean enoughToFilter()
    {
        return mThreshold <= 0 || super.enoughToFilter();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        mSearchView.onTextFocusChanged();
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                android.view.rchAutoComplete rchautocomplete = getKeyDispatcherState();
                if (rchautocomplete != null)
                {
                    rchautocomplete.Tracking(keyevent, this);
                }
                return true;
            }
            if (keyevent.getAction() == 1)
            {
                android.view.rchAutoComplete rchautocomplete1 = getKeyDispatcherState();
                if (rchautocomplete1 != null)
                {
                    rchautocomplete1.eUpEvent(keyevent);
                }
                if (keyevent.isTracking() && !keyevent.isCanceled())
                {
                    mSearchView.clearFocus();
                    SearchView.access$2300(mSearchView, false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && mSearchView.hasFocus() && getVisibility() == 0)
        {
            ((InputMethodManager)getContext().getSystemService(z)).showSoftInput(this, 0);
            if (SearchView.isLandscapeMode(getContext()))
            {
                SearchView.access$2200(this, true);
            }
        }
    }

    public void performCompletion()
    {
    }

    protected void replaceText(CharSequence charsequence)
    {
    }

    void setSearchView(SearchView searchview)
    {
        mSearchView = searchview;
    }

    public void setThreshold(int i)
    {
        super.setThreshold(i);
        mThreshold = i;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "l4wl.Z7bm2j>".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 90;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 5;
          goto _L8
_L3:
        byte0 = 90;
          goto _L8
_L4:
        byte0 = 7;
          goto _L8
        byte0 = 25;
          goto _L8
    }


    public (Context context)
    {
        super(context);
        mThreshold = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mThreshold = getThreshold();
    }

    public getThreshold(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mThreshold = getThreshold();
    }
}
