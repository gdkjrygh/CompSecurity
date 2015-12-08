.class Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$13;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

.field private final synthetic val$result:Landroid/webkit/JsResult;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;Landroid/webkit/JsResult;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;->val$result:Landroid/webkit/JsResult;

    .line 1204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 1209
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$3;->val$result:Landroid/webkit/JsResult;

    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 1211
    return-void
.end method
