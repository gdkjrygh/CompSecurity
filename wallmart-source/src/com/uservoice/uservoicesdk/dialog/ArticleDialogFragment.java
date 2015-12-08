// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import com.uservoice.uservoicesdk.activity.InstantAnswersActivity;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.deflection.Deflection;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.dialog:
//            DialogFragmentBugfixed, UnhelpfulDialogFragment, HelpfulDialogFragment

public class ArticleDialogFragment extends DialogFragmentBugfixed
{

    private final Article article;
    private WebView webView;

    public ArticleDialogFragment(Article article1)
    {
        article = article1;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(com.uservoice.uservoicesdk.R.string.uv_article_instant_answer_question);
        webView = new WebView(getActivity());
        if (!Utils.isDarkTheme(getActivity()))
        {
            bundle.setInverseBackgroundForced(true);
        }
        bundle.setView(webView);
        Utils.displayArticle(webView, article, getActivity());
        bundle.setNegativeButton(com.uservoice.uservoicesdk.R.string.uv_no, new android.content.DialogInterface.OnClickListener() {

            final ArticleDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (getActivity() instanceof InstantAnswersActivity)
                {
                    Deflection.trackDeflection("unhelpful", article);
                    ((InstantAnswersAdapter)((InstantAnswersActivity)getActivity()).getListAdapter()).notHelpful();
                    return;
                } else
                {
                    (new UnhelpfulDialogFragment()).show(getActivity().getSupportFragmentManager(), "UnhelpfulDialogFragment");
                    return;
                }
            }

            
            {
                this$0 = ArticleDialogFragment.this;
                super();
            }
        });
        bundle.setPositiveButton(com.uservoice.uservoicesdk.R.string.uv_very_yes, new android.content.DialogInterface.OnClickListener() {

            final ArticleDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VOTE_ARTICLE, article.getId());
                if (getActivity() instanceof InstantAnswersActivity)
                {
                    Deflection.trackDeflection("helpful", article);
                    (new HelpfulDialogFragment()).show(getActivity().getSupportFragmentManager(), "HelpfulDialogFragment");
                }
            }

            
            {
                this$0 = ArticleDialogFragment.this;
                super();
            }
        });
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_ARTICLE, article.getId());
        return bundle.create();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        webView.loadUrl("about:blank");
        super.onDismiss(dialoginterface);
    }

}
