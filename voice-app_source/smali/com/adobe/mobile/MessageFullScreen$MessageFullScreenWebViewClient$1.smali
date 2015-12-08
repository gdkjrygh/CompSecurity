.class Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient$1;
.super Ljava/lang/Object;
.source "MessageFullScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;->dismissMessage(Landroid/webkit/WebView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;


# direct methods
.method constructor <init>(Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;)V
    .locals 0
    .param p1, "this$0"    # Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;

    .prologue
    .line 293
    iput-object p1, p0, Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient$1;->this$0:Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 296
    iget-object v0, p0, Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient$1;->this$0:Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;

    # getter for: Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;->message:Lcom/adobe/mobile/MessageFullScreen;
    invoke-static {v0}, Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;->access$200(Lcom/adobe/mobile/MessageFullScreen$MessageFullScreenWebViewClient;)Lcom/adobe/mobile/MessageFullScreen;

    move-result-object v0

    # invokes: Lcom/adobe/mobile/MessageFullScreen;->killMessageActivity(Lcom/adobe/mobile/MessageFullScreen;)V
    invoke-static {v0}, Lcom/adobe/mobile/MessageFullScreen;->access$100(Lcom/adobe/mobile/MessageFullScreen;)V

    .line 297
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 303
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 300
    return-void
.end method
