// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishSignupCategory;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryGridCellView

private class <init>
    implements Runnable
{

    private boolean cancelled;
    final SignupCategoryGridCellView this$0;

    public void markCancelled()
    {
        cancelled = true;
    }

    public void run()
    {
        if (!cancelled)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = SignupCategoryGridCellView.access$100(SignupCategoryGridCellView.this).getPreviews().iterator(); iterator.hasNext(); arraylist.add(((WishImage)iterator.next()).getUrlString(com.contextlogic.wish.api.data.gRunnable.this._fld0))) { }
            SignupCategoryGridCellView.access$200(SignupCategoryGridCellView.this).getImageView().setImageUrl((String)arraylist.get(0));
            SignupCategoryGridCellView.access$300(SignupCategoryGridCellView.this).getImageView().setImageUrl((String)arraylist.get(1));
            SignupCategoryGridCellView.access$400(SignupCategoryGridCellView.this).getImageView().setImageUrl((String)arraylist.get(2));
            SignupCategoryGridCellView.access$500(SignupCategoryGridCellView.this).getImageView().setImageUrl((String)arraylist.get(3));
        }
    }

    private ()
    {
        this$0 = SignupCategoryGridCellView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
