// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.item:
//            HtmlListTagHandler

public class ReturnPolicyPresenter extends Presenter
{

    private final Context mContext;
    private final int mPadding;
    private final Spanned mSpannedText;
    private TextView mView;

    public ReturnPolicyPresenter(Context context, String s)
    {
        mContext = context;
        mSpannedText = Html.fromHtml(s, null, new HtmlListTagHandler());
        mPadding = ViewUtil.dpToPixels(20, context);
        setTitleText(context.getString(0x7f0901a6));
    }

    public View getView()
    {
        return mView;
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        mView = new TextView(mContext);
        mView.setTextAppearance(mContext, 0x7f0b0170);
        mView.setPadding(mPadding, mPadding, mPadding, mPadding);
        mView.setMovementMethod(new WalmartLinkMovementMethod(mContext));
        mView.setText(mSpannedText);
    }
}
