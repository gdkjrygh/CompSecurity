// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.walmart.android.service.taxonomy.TaxonomyItem;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.CheckedIllegalStateException;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.Stack;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase, BreadcrumbTaxonomyListAdapter

private class this._cls0 extends CallbackSameThread
{

    final BreadcrumbTaxonomyPresenterBase this$0;

    public void onResultSameThread(Request request, Result result)
    {
        BreadcrumbTaxonomyPresenterBase.access$700(BreadcrumbTaxonomyPresenterBase.this).setVisibility(8);
        if (result.successful() && result.hasData() && ((TaxonomyItem)result.getData()).children != null)
        {
            request = (TaxonomyItem)result.getData();
            ((this._cls0)BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).peek()).ildren = ((TaxonomyItem) (request)).children;
            if (BreadcrumbTaxonomyPresenterBase.access$500(BreadcrumbTaxonomyPresenterBase.this) != null)
            {
                BreadcrumbTaxonomyPresenterBase.access$500(BreadcrumbTaxonomyPresenterBase.this).setNewTaxonomy(((TaxonomyItem) (request)).children, true);
                BreadcrumbTaxonomyPresenterBase.access$502(BreadcrumbTaxonomyPresenterBase.this, null);
            } else
            {
                BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).setTaxonomyItems(((TaxonomyItem) (request)).children);
                BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setAdapter(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this));
                BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setVisibility(0);
            }
            onTaxonomyLoaded(request);
            return;
        }
        if (!result.hasError() && result.getStatusCode() == 404)
        {
            if (BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).size() == 1)
            {
                if (request.hasPriorRequest())
                {
                    DialogFactory.showDialog(900, BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this));
                    return;
                }
                try
                {
                    request.retry();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Request request)
                {
                    WLog.e(BreadcrumbTaxonomyPresenterBase.access$800(), "Could not retry request to load root", request);
                }
                DialogFactory.showDialog(900, BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this));
                return;
            }
            Toast.makeText(BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this), BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this).getString(0x7f0905a5), 0).show();
            BreadcrumbTaxonomyPresenterBase.access$700(BreadcrumbTaxonomyPresenterBase.this).setVisibility(0);
            for (; !BreadcrumbTaxonomyPresenterBase.access$100(BreadcrumbTaxonomyPresenterBase.this).isEmpty(); onTaxonomyPop()) { }
            BreadcrumbTaxonomyPresenterBase.access$002(BreadcrumbTaxonomyPresenterBase.this, new BreadcrumbTaxonomyListAdapter(BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this)));
            BreadcrumbTaxonomyPresenterBase.access$200(BreadcrumbTaxonomyPresenterBase.this).setAdapter(BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this));
            BreadcrumbTaxonomyPresenterBase.access$000(BreadcrumbTaxonomyPresenterBase.this).visitItem(BreadcrumbTaxonomyPresenterBase.access$900(BreadcrumbTaxonomyPresenterBase.this));
            BreadcrumbTaxonomyPresenterBase.access$400(BreadcrumbTaxonomyPresenterBase.this, BreadcrumbTaxonomyPresenterBase.access$900(BreadcrumbTaxonomyPresenterBase.this));
            return;
        }
        char c;
        if (result.hasError() && result.getError()._mth0())
        {
            c = '\u0258';
        } else
        {
            c = '\u0384';
        }
        DialogFactory.showDialog(c, BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this));
        BreadcrumbTaxonomyPresenterBase.access$1000(BreadcrumbTaxonomyPresenterBase.this);
    }

    public er()
    {
        this$0 = BreadcrumbTaxonomyPresenterBase.this;
        super(BreadcrumbTaxonomyPresenterBase.access$600(BreadcrumbTaxonomyPresenterBase.this));
    }
}
