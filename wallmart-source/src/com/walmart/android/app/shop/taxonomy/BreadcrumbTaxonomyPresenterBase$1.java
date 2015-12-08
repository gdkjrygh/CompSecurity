// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.kangaroo.Request;
import java.util.Stack;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, BreadcrumbTaxonomyListAdapter

class this._cls0 extends OnItemSingleClickListener
{

    final BreadcrumbTaxonomyPresenterBase this$0;

    private void onUnvisitedTaxonomyItemClick(TaxonomyItem taxonomyitem)
    {
        boolean flag;
        ((xonomyStackItem)BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).peek()).listPosition = new stPosition(BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getFirstVisiblePosition(), BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildAt(0).getTop());
        flag = true;
        if (taxonomyitem.browseToken != null) goto _L2; else goto _L1
_L1:
        BreadcrumbTaxonomyPresenterBase.access$400(BreadcrumbTaxonomyPresenterBase.this, taxonomyitem);
_L4:
        if (flag)
        {
            BreadcrumbTaxonomyPresenterBase.access$502(BreadcrumbTaxonomyPresenterBase.this, new xonomyForwardHandler(BreadcrumbTaxonomyPresenterBase.this, taxonomyitem));
            BreadcrumbTaxonomyPresenterBase.access$500(BreadcrumbTaxonomyPresenterBase.this).animate();
        }
        return;
_L2:
        boolean flag1 = shouldVisitLeafItems();
        pushShelfPresenter(taxonomyitem);
        flag = flag1;
        if (flag1)
        {
            onTaxonomyPush(taxonomyitem);
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onVisitedTaxonomyItemClick(TaxonomyItem taxonomyitem, int i)
    {
        xonomyStackItem xonomystackitem;
        onTaxonomyPop();
        xonomystackitem = (xonomyStackItem)BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).peek();
_L3:
        if (BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).size() > 1 && !xonomystackitem.taxonomyItem.id.equals(taxonomyitem.id)) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k;
        taxonomyitem = (TaxonomyItem)BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).getItem(i + 1);
        k = BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getFirstVisiblePosition();
        flag = false;
        i = 0;
_L4:
        int j = ((flag) ? 1 : 0);
        if (i < BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).getChildCount())
        {
            if (!taxonomyitem.equals(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).getItem(k + i)))
            {
                break MISSING_BLOCK_LABEL_209;
            }
            j = i;
        }
        (new xonomyBackHandler(BreadcrumbTaxonomyPresenterBase.this, j, taxonomyitem, xonomystackitem.children, xonomystackitem.listPosition)).animate();
        if (BreadcrumbTaxonomyPresenterBase.access$300(BreadcrumbTaxonomyPresenterBase.this) != null)
        {
            BreadcrumbTaxonomyPresenterBase.access$300(BreadcrumbTaxonomyPresenterBase.this).cancel();
            BreadcrumbTaxonomyPresenterBase.access$302(BreadcrumbTaxonomyPresenterBase.this, null);
        }
        return;
_L2:
        onTaxonomyPop();
        xonomystackitem = (xonomyStackItem)BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).peek();
          goto _L3
        i++;
          goto _L4
    }

    public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).getTaxonomyItem(i);
        if (BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).isVisitedItem(adapterview))
        {
            onVisitedTaxonomyItemClick(adapterview, i);
            return;
        } else
        {
            onUnvisitedTaxonomyItemClick(adapterview);
            return;
        }
    }

    xonomyBackHandler(Presenter presenter)
    {
        this$0 = BreadcrumbTaxonomyPresenterBase.this;
        super(presenter);
    }
}
