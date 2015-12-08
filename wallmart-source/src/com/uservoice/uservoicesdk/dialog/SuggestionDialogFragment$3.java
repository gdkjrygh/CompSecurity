// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.image.ImageCache;
import com.uservoice.uservoicesdk.model.Comment;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import java.text.DateFormat;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            SuggestionDialogFragment

class this._cls0 extends PaginatedAdapter
{

    final SuggestionDialogFragment this$0;

    protected void customizeLayout(View view, Comment comment)
    {
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.ment._fld3)).setText(comment.getText());
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.ment._fld3)).setText(comment.getUserName());
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.ment._fld3)).setText(DateFormat.getDateInstance().format(comment.getCreatedAt()));
        view = (ImageView)view.findViewById(com.uservoice.uservoicesdk.ment._fld3);
        ImageCache.getInstance().loadImage(comment.getAvatarUrl(), view);
    }

    protected volatile void customizeLayout(View view, Object obj)
    {
        customizeLayout(view, (Comment)obj);
    }

    protected int getTotalNumberOfObjects()
    {
        return SuggestionDialogFragment.access$000(SuggestionDialogFragment.this).getNumberOfComments();
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    protected void loadPage(int i, Callback callback)
    {
        Comment.loadComments(SuggestionDialogFragment.access$000(SuggestionDialogFragment.this), i, callback);
    }

    (Context context, int i, List list)
    {
        this$0 = SuggestionDialogFragment.this;
        super(context, i, list);
    }
}
