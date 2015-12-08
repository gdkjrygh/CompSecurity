// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Category;
import com.uservoice.uservoicesdk.model.Suggestion;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, PostIdeaAdapter

class t> extends DefaultCallback
{

    final onModel this$1;

    public void onModel(Suggestion suggestion)
    {
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.T_IDEA);
        Toast.makeText(context, com.uservoice.uservoicesdk._created, 0).show();
        context.finish();
    }

    public volatile void onModel(Object obj)
    {
        onModel((Suggestion)obj);
    }

    is._cls0(Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/ui/PostIdeaAdapter$1

/* anonymous class */
    class PostIdeaAdapter._cls1
        implements Runnable
    {

        final PostIdeaAdapter this$0;

        public void run()
        {
            Category category;
            if (PostIdeaAdapter.access$000(PostIdeaAdapter.this) == null)
            {
                category = null;
            } else
            {
                category = (Category)PostIdeaAdapter.access$000(PostIdeaAdapter.this).getSelectedItem();
            }
            Suggestion.createSuggestion(Session.getInstance().getForum(), category, textField.getText().toString(), PostIdeaAdapter.access$100(PostIdeaAdapter.this).getText().toString(), 1, new PostIdeaAdapter._cls1._cls1(context));
        }

            
            {
                this$0 = PostIdeaAdapter.this;
                super();
            }
    }

}
