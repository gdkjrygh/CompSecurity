// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.Comment;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            CommentDialogFragment, SuggestionDialogFragment

class val.text
    implements Runnable
{

    final _cls1.onModel this$1;
    final String val$text;

    public void run()
    {
        Comment.createComment(CommentDialogFragment.access$000(_fld0), val$text, new DefaultCallback(getActivity()) {

            final CommentDialogFragment._cls1._cls1 this$2;

            public void onModel(Comment comment)
            {
                Toast.makeText(context, com.uservoice.uservoicesdk.R.string.uv_msg_comment_posted, 0).show();
                CommentDialogFragment.access$100(this$0).commentPosted(comment);
            }

            public volatile void onModel(Object obj)
            {
                onModel((Comment)obj);
            }

            
            {
                this$2 = CommentDialogFragment._cls1._cls1.this;
                super(context);
            }
        });
    }

    l.context()
    {
        this$1 = final_context;
        val$text = String.this;
        super();
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/dialog/CommentDialogFragment$1

/* anonymous class */
    class CommentDialogFragment._cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final CommentDialogFragment this$0;
        final Activity val$context;
        final EditText val$emailField;
        final EditText val$nameField;
        final EditText val$textField;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = textField.getText().toString();
            if (dialoginterface.trim().length() > 0)
            {
                SigninManager.signIn(getActivity(), emailField.getText().toString(), nameField.getText().toString(), dialoginterface. new CommentDialogFragment._cls1._cls1());
            }
        }

            
            {
                this$0 = final_commentdialogfragment;
                textField = edittext;
                emailField = edittext1;
                nameField = edittext2;
                context = Activity.this;
                super();
            }
    }

}
