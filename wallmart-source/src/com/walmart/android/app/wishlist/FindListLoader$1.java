// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListLoader

class  extends CallbackSameThread
{

    final FindListLoader this$0;

    public void onResultSameThread(Request request, Result result)
    {
        FindListLoader.access$002(FindListLoader.this, null);
        request = (WishListResults)result.getData();
        boolean flag;
        if (FindListLoader.access$100(FindListLoader.this) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (result.successful() && result.hasData() && FindListLoader.access$200(FindListLoader.this, request))
        {
            if (FindListLoader.access$100(FindListLoader.this) == 1)
            {
                FindListLoader.access$302(FindListLoader.this, ((WishListResults) (request)).paging.totalCount);
                if (FindListLoader.access$400(FindListLoader.this) != null)
                {
                    FindListLoader.access$400(FindListLoader.this).onFirstResultBatch(FindListLoader.access$300(FindListLoader.this));
                }
            }
            int _tmp = FindListLoader.access$108(FindListLoader.this);
            FindListLoader.access$502(FindListLoader.this, FindListLoader.access$500(FindListLoader.this) + ((WishListResults) (request)).searchResults.length);
            if (FindListLoader.access$500(FindListLoader.this) < FindListLoader.access$300(FindListLoader.this))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            FindListLoader.access$600(FindListLoader.this, Arrays.asList(((WishListResults) (request)).searchResults), flag);
        } else
        {
            FindListLoader findlistloader = FindListLoader.this;
            StringBuilder stringbuilder = (new StringBuilder()).append("Error: ");
            if (result.hasError())
            {
                request = result.getError();
            } else
            {
                request = "unknown";
            }
            FindListLoader.access$700(findlistloader, stringbuilder.append(request).toString(), true);
            if (FindListLoader.access$400(FindListLoader.this) != null)
            {
                int i;
                if (result.hasError() && result.getError().ectionError())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                request = FindListLoader.access$400(FindListLoader.this);
                if (i != 0)
                {
                    i = 0x15f92;
                } else
                {
                    i = 0x15f91;
                }
                request.onError(i, flag);
                return;
            }
        }
    }

    llback(Context context)
    {
        this$0 = FindListLoader.this;
        super(context);
    }
}
