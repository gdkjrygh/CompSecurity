// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.widget.EditText;
import com.walmart.android.search.SearchData;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            EReceiptSearchManager

class this._cls0
    implements com.walmart.android.search.emClickListener
{

    final EReceiptSearchManager this$0;

    public void onEditSelected(SearchData searchdata)
    {
        if (searchdata != null)
        {
            searchdata = searchdata.getSearchText();
            EReceiptSearchManager.access$300(EReceiptSearchManager.this).setText(searchdata);
            EReceiptSearchManager.access$400(EReceiptSearchManager.this).setSelection(searchdata.length());
            ViewUtil.showKeyboard(EReceiptSearchManager.access$500(EReceiptSearchManager.this));
        }
    }

    public void onItemSelected(SearchData searchdata)
    {
        if (searchdata != null)
        {
            CharSequence charsequence = searchdata.getSearchText();
            EReceiptSearchManager.access$100(EReceiptSearchManager.this).setText(charsequence);
            EReceiptSearchManager.access$200(EReceiptSearchManager.this).setSelection(charsequence.length());
            performSearch(searchdata);
        }
    }

    lickListener()
    {
        this$0 = EReceiptSearchManager.this;
        super();
    }
}
