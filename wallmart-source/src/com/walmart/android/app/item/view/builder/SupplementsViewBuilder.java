// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.view.View;
import com.walmart.android.service.item.model.SupplementFacts;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item.view.builder:
//            TableGridViewBuilder

public class SupplementsViewBuilder extends TableGridViewBuilder
{

    private static final int DIVIDER_LARGE_THICKNESS_DP = 10;
    private static final int N_COLUMNS = 3;

    public SupplementsViewBuilder(Context context)
    {
        super(context, 3);
        setColorableRowColor(0, 0xffcccccc);
    }

    public View build(SupplementFacts supplementfacts)
    {
        if (supplementfacts == null)
        {
            return null;
        }
        for (Iterator iterator = supplementfacts.header.iterator(); iterator.hasNext(); add(header((String)iterator.next()))) { }
        add(divider(10));
        if (!supplementfacts.segments.isEmpty())
        {
            Object obj = (com.walmart.android.service.item.model.Nutrition.Nutrient)supplementfacts.segments.get(0);
            add(colorable(text(0x7f0901be).bold()));
            add(colorable(text(0x7f0901af).bold()));
            add(colorable(text(0x7f0901bd).bold()));
            com.walmart.android.service.item.model.Nutrition.Nutrient nutrient;
            for (obj = ((com.walmart.android.service.item.model.Nutrition.Nutrient) (obj)).children.iterator(); ((Iterator) (obj)).hasNext(); add(colorable(text(nutrient.dvp))))
            {
                nutrient = (com.walmart.android.service.item.model.Nutrition.Nutrient)((Iterator) (obj)).next();
                add(colorable(text(nutrient.name)));
                add(colorable(text(nutrient.amount)));
            }

        }
        add(divider(10));
        for (supplementfacts = supplementfacts.footer.iterator(); supplementfacts.hasNext(); add(footer((String)supplementfacts.next()))) { }
        return mView;
    }
}
