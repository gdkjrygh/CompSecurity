// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.dialog.UnhelpfulDialogFragment;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.ui.Utils;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            BaseActivity, SearchActivity

public class ArticleActivity extends BaseActivity
    implements SearchActivity
{

    public ArticleActivity()
    {
    }

    public void finish()
    {
        ((WebView)findViewById(com.uservoice.uservoicesdk.R.id.uv_webview)).loadData("", "text/html", "utf-8");
        super.finish();
    }

    protected void onCreate(final Bundle article)
    {
        super.onCreate(article);
        setContentView(com.uservoice.uservoicesdk.R.layout.uv_article_layout);
        article = Session.getInstance().getArticle();
        setTitle(article.getTitle());
        WebView webview = (WebView)findViewById(com.uservoice.uservoicesdk.R.id.uv_webview);
        Utils.displayArticle(webview, article, this);
        View view = findViewById(com.uservoice.uservoicesdk.R.id.uv_container);
        int i;
        if (Utils.isDarkTheme(this))
        {
            i = 0xff000000;
        } else
        {
            i = -1;
        }
        view.setBackgroundColor(i);
        webview.setWebViewClient(new WebViewClient() {

            final ArticleActivity this$0;

            public void onPageFinished(WebView webview1, String s)
            {
                super.onPageFinished(webview1, s);
                findViewById(com.uservoice.uservoicesdk.R.id.uv_helpful_section).setVisibility(0);
            }

            
            {
                this$0 = ArticleActivity.this;
                super();
            }
        });
        findViewById(com.uservoice.uservoicesdk.R.id.uv_helpful_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ArticleActivity this$0;
            final Article val$article;

            public void onClick(View view1)
            {
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VOTE_ARTICLE, article.getId());
                Toast.makeText(ArticleActivity.this, com.uservoice.uservoicesdk.R.string.uv_thanks, 0).show();
            }

            
            {
                this$0 = ArticleActivity.this;
                article = article1;
                super();
            }
        });
        findViewById(com.uservoice.uservoicesdk.R.id.uv_unhelpful_button).setOnClickListener(new android.view.View.OnClickListener() {

            final ArticleActivity this$0;

            public void onClick(View view1)
            {
                (new UnhelpfulDialogFragment()).show(getSupportFragmentManager(), "UnhelpfulDialogFragment");
            }

            
            {
                this$0 = ArticleActivity.this;
                super();
            }
        });
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_ARTICLE, article.getId());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.uservoice.uservoicesdk.R.menu.uv_portal, menu);
        setupScopedSearch(menu);
        return true;
    }
}
