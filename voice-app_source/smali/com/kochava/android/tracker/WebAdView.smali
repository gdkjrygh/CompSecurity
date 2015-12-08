.class public Lcom/kochava/android/tracker/WebAdView;
.super Landroid/app/Activity;
.source "WebAdView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kochava/android/tracker/WebAdView$MyPictureListener;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field finishedLoad:Z

.field mDialog:Landroid/app/ProgressDialog;

.field startLoad:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 43
    iput-boolean v0, p0, Lcom/kochava/android/tracker/WebAdView;->startLoad:Z

    .line 44
    iput-boolean v0, p0, Lcom/kochava/android/tracker/WebAdView;->finishedLoad:Z

    .line 224
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 6

    .prologue
    .line 206
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 208
    iget-object v1, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 209
    sget-boolean v1, Lcom/kochava/android/tracker/Global;->DEBUG:Z

    if-eqz v1, :cond_0

    const-string v1, "KochavaAds"

    const-string v2, "Back pressed."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    :cond_0
    sget-object v1, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "slide_down"

    const-string v3, "anim"

    invoke-virtual {p0}, Lcom/kochava/android/tracker/WebAdView;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 212
    .local v0, "test":I
    if-eqz v0, :cond_1

    .line 213
    sget-object v1, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "stay"

    const-string v3, "anim"

    invoke-virtual {p0}, Lcom/kochava/android/tracker/WebAdView;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    sget-object v2, Lcom/kochava/android/tracker/Feature;->appContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "slide_down"

    const-string v4, "anim"

    invoke-virtual {p0}, Lcom/kochava/android/tracker/WebAdView;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/kochava/android/tracker/WebAdView;->overridePendingTransition(II)V

    .line 217
    :goto_0
    return-void

    .line 215
    :cond_1
    const/4 v1, 0x0

    const v2, 0x10a0003

    invoke-virtual {p0, v1, v2}, Lcom/kochava/android/tracker/WebAdView;->overridePendingTransition(II)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 13
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 48
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    iput-object p0, p0, Lcom/kochava/android/tracker/WebAdView;->activity:Landroid/app/Activity;

    .line 50
    invoke-virtual {p0}, Lcom/kochava/android/tracker/WebAdView;->getIntent()Landroid/content/Intent;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 52
    .local v0, "b":Landroid/os/Bundle;
    const-string v9, "URL"

    invoke-virtual {v0, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 56
    .local v7, "url":Ljava/lang/String;
    new-instance v8, Landroid/webkit/WebView;

    invoke-direct {v8, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 58
    .local v8, "webView":Landroid/webkit/WebView;
    invoke-virtual {v8, v7}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v8}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 60
    invoke-virtual {v8}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 63
    new-instance v9, Lcom/kochava/android/tracker/WebAdView$MyPictureListener;

    const/4 v10, 0x0

    invoke-direct {v9, p0, v10}, Lcom/kochava/android/tracker/WebAdView$MyPictureListener;-><init>(Lcom/kochava/android/tracker/WebAdView;Lcom/kochava/android/tracker/WebAdView$1;)V

    invoke-virtual {v8, v9}, Landroid/webkit/WebView;->setPictureListener(Landroid/webkit/WebView$PictureListener;)V

    .line 66
    new-instance v9, Lcom/kochava/android/tracker/WebAdView$1;

    invoke-direct {v9, p0}, Lcom/kochava/android/tracker/WebAdView$1;-><init>(Lcom/kochava/android/tracker/WebAdView;)V

    invoke-virtual {v8, v9}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 126
    const/4 v9, 0x1

    invoke-virtual {p0, v9}, Lcom/kochava/android/tracker/WebAdView;->requestWindowFeature(I)Z

    .line 128
    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 129
    .local v4, "rl":Landroid/widget/RelativeLayout;
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v9, -0x1

    const/4 v10, -0x1

    invoke-direct {v5, v9, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 132
    .local v5, "rlp":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v9, 0xa

    const/16 v10, 0xa

    const/16 v11, 0xa

    const/16 v12, 0xa

    invoke-virtual {v4, v9, v10, v11, v12}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 149
    new-instance v2, Landroid/widget/Button;

    invoke-direct {v2, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 150
    .local v2, "close":Landroid/widget/Button;
    const-string v9, "Close"

    invoke-virtual {v2, v9}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 151
    const/high16 v9, -0x1000000

    invoke-virtual {v2, v9}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 152
    const/4 v9, -0x1

    invoke-virtual {v2, v9}, Landroid/widget/Button;->setTextColor(I)V

    .line 153
    const/4 v9, 0x7

    const/4 v10, 0x3

    const/4 v11, 0x7

    const/4 v12, 0x5

    invoke-virtual {v2, v9, v10, v11, v12}, Landroid/widget/Button;->setPadding(IIII)V

    .line 155
    const/16 v9, 0x8

    new-array v1, v9, [F

    fill-array-data v1, :array_0

    .line 156
    .local v1, "bottomLeftRoundedCorner":[F
    new-instance v3, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v9, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct {v9, v1, v10, v11}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    invoke-direct {v3, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 157
    .local v3, "drawable":Landroid/graphics/drawable/ShapeDrawable;
    const/4 v9, 0x7

    const/4 v10, 0x3

    const/4 v11, 0x7

    const/4 v12, 0x5

    invoke-virtual {v3, v9, v10, v11, v12}, Landroid/graphics/drawable/ShapeDrawable;->setPadding(IIII)V

    .line 159
    new-instance v6, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 160
    .local v6, "stateList":Landroid/graphics/drawable/StateListDrawable;
    const/4 v9, 0x0

    new-array v9, v9, [I

    invoke-virtual {v6, v9, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 162
    invoke-virtual {v2, v6}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 164
    new-instance v9, Lcom/kochava/android/tracker/WebAdView$2;

    invoke-direct {v9, p0}, Lcom/kochava/android/tracker/WebAdView$2;-><init>(Lcom/kochava/android/tracker/WebAdView;)V

    invoke-virtual {v2, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    invoke-virtual {v8}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 174
    invoke-virtual {v8}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    invoke-virtual {v9, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 176
    :cond_0
    invoke-virtual {v4, v8}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 177
    invoke-virtual {v4, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 179
    invoke-virtual {p0, v4, v5}, Lcom/kochava/android/tracker/WebAdView;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    new-instance v9, Landroid/app/ProgressDialog;

    invoke-direct {v9, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    .line 182
    iget-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 183
    iget-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 187
    iget-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    new-instance v10, Lcom/kochava/android/tracker/WebAdView$3;

    invoke-direct {v10, p0}, Lcom/kochava/android/tracker/WebAdView$3;-><init>(Lcom/kochava/android/tracker/WebAdView;)V

    invoke-virtual {v9, v10}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 198
    iget-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    const-string v10, "Loading..."

    invoke-virtual {v9, v10}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v9, p0, Lcom/kochava/android/tracker/WebAdView;->mDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v9}, Landroid/app/ProgressDialog;->show()V

    .line 200
    return-void

    .line 155
    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x0
        0x0
    .end array-data
.end method
