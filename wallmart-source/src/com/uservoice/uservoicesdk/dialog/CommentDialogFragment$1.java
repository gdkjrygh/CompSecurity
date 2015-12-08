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

class val.context
    implements android.content.istener
{

    final CommentDialogFragment this$0;
    final Activity val$context;
    final EditText val$emailField;
    final EditText val$nameField;
    final EditText val$textField;

    public void onClick(final DialogInterface text, int i)
    {
        text = val$textField.getText().toString();
        if (text.trim().length() > 0)
        {
            SigninManager.signIn(getActivity(), val$emailField.getText().toString(), val$nameField.getText().toString(), new Runnable() {

                final CommentDialogFragment._cls1 this$1;
                final String val$text;

                public void run()
                {
                    Comment.createComment(CommentDialogFragment.access$000(this$0), text, new DefaultCallback(getActivity()) {

                        final _cls1 this$2;

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
                this$2 = _cls1.this;
                super(context1);
            }
                    });
                }

            
            {
                this$1 = CommentDialogFragment._cls1.this;
                text = s;
                super();
            }
            });
        }
    }

    _cls1.val.text()
    {
        this$0 = final_commentdialogfragment;
        val$textField = edittext;
        val$emailField = edittext1;
        val$nameField = edittext2;
        val$context = Activity.this;
        super();
    }
}
