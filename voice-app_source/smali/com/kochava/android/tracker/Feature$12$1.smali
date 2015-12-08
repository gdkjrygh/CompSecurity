.class Lcom/kochava/android/tracker/Feature$12$1;
.super Ljava/lang/Thread;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature$12;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kochava/android/tracker/Feature$12;

.field final synthetic val$clickUrl:Ljava/lang/String;

.field final synthetic val$fAdUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature$12;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "this$1"    # Lcom/kochava/android/tracker/Feature$12;

    .prologue
    .line 2960
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iput-object p2, p0, Lcom/kochava/android/tracker/Feature$12$1;->val$clickUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/kochava/android/tracker/Feature$12$1;->val$fAdUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2966
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 2967
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 2968
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 2969
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    new-instance v1, Lcom/kochava/android/tracker/Feature$12$1$1;

    invoke-direct {v1, p0}, Lcom/kochava/android/tracker/Feature$12$1$1;-><init>(Lcom/kochava/android/tracker/Feature$12$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 3022
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 3024
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Loading add "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$12$1;->val$fAdUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 3025
    iget-object v0, p0, Lcom/kochava/android/tracker/Feature$12$1;->this$1:Lcom/kochava/android/tracker/Feature$12;

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/kochava/android/tracker/Feature$12$1;->val$fAdUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 3027
    return-void
.end method
