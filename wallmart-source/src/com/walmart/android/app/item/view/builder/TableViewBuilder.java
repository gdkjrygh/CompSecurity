// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.support.v7.widget.GridLayout;
import android.view.View;
import com.walmart.android.service.item.StringPair;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item.view.builder:
//            TableGridViewBuilder, ViewBuilder

public class TableViewBuilder extends TableGridViewBuilder
{

    private static final int N_COLUMNS = 2;
    private static final String TAG = com/walmart/android/app/item/view/builder/TableViewBuilder.getSimpleName();
    private List mRowData;
    private boolean mWithNumbers;

    public TableViewBuilder(Context context)
    {
        super(context, 2);
        setColorableRowColor(getColor(0x7f0f0119), getColor(0x7f0f0125));
    }

    public View build()
    {
        int i = 0;
        while (i < mRowData.size()) 
        {
            Object obj = mRowData.get(i);
            if (obj instanceof StringPair)
            {
                add(colorable(text(((StringPair)obj).name)));
                add(colorable(text(((StringPair)obj).value)));
            } else
            if (obj instanceof com.walmart.android.service.item.DescriptionModel.Description)
            {
                add(colorable(text(((com.walmart.android.service.item.DescriptionModel.Description)obj).getTitle())));
                add(colorable(text(((com.walmart.android.service.item.DescriptionModel.Description)obj).getText())));
            } else
            if (obj instanceof CharSequence)
            {
                if (mWithNumbers)
                {
                    add(colorable(text(Integer.toString(i + 1))));
                    add(colorable(text((CharSequence)obj)));
                } else
                {
                    add(colorable(text((CharSequence)obj))).withLayout((new ViewBuilder.GridViewLayoutBuilder()).span(((GridLayout)mView).getColumnCount()));
                }
            } else
            if (obj instanceof ViewBuilder.TextViewBuilder[])
            {
                ViewBuilder.TextViewBuilder atextviewbuilder[] = (ViewBuilder.TextViewBuilder[])(ViewBuilder.TextViewBuilder[])obj;
                int k = atextviewbuilder.length;
                int j = 0;
                while (j < k) 
                {
                    add(colorable(atextviewbuilder[j]));
                    j++;
                }
            } else
            {
                WLog.e(TAG, "Unsupported row list type");
            }
            i++;
        }
        return mView;
    }

    public TableViewBuilder setRows(List list)
    {
        mRowData = list;
        return this;
    }

    public TableViewBuilder withNumbers(boolean flag)
    {
        mWithNumbers = flag;
        return this;
    }

}
