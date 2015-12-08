.class Lcom/facebook/share/internal/LikeDialog$NativeHandler;
.super Lcom/facebook/internal/FacebookDialogBase$ModeHandler;
.source "LikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/internal/LikeDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "NativeHandler"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/FacebookDialogBase",
        "<",
        "Lcom/facebook/share/internal/LikeContent;",
        "Lcom/facebook/share/internal/LikeDialog$Result;",
        ">.ModeHandler;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/share/internal/LikeDialog;


# direct methods
.method private constructor <init>(Lcom/facebook/share/internal/LikeDialog;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/facebook/share/internal/LikeDialog$NativeHandler;->this$0:Lcom/facebook/share/internal/LikeDialog;

    invoke-direct {p0, p1}, Lcom/facebook/internal/FacebookDialogBase$ModeHandler;-><init>(Lcom/facebook/internal/FacebookDialogBase;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/internal/LikeDialog;Lcom/facebook/share/internal/LikeDialog$NativeHandler;)V
    .locals 0

    .prologue
    .line 137
    invoke-direct {p0, p1}, Lcom/facebook/share/internal/LikeDialog$NativeHandler;-><init>(Lcom/facebook/share/internal/LikeDialog;)V

    return-void
.end method


# virtual methods
.method public canShow(Lcom/facebook/share/internal/LikeContent;)Z
    .locals 1
    .param p1, "content"    # Lcom/facebook/share/internal/LikeContent;

    .prologue
    .line 140
    if-eqz p1, :cond_0

    invoke-static {}, Lcom/facebook/share/internal/LikeDialog;->canShowNativeDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic canShow(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeDialog$NativeHandler;->canShow(Lcom/facebook/share/internal/LikeContent;)Z

    move-result v0

    return v0
.end method

.method public createAppCall(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/internal/AppCall;
    .locals 3
    .param p1, "content"    # Lcom/facebook/share/internal/LikeContent;

    .prologue
    .line 145
    iget-object v1, p0, Lcom/facebook/share/internal/LikeDialog$NativeHandler;->this$0:Lcom/facebook/share/internal/LikeDialog;

    invoke-virtual {v1}, Lcom/facebook/share/internal/LikeDialog;->createBaseAppCall()Lcom/facebook/internal/AppCall;

    move-result-object v0

    .line 149
    .local v0, "appCall":Lcom/facebook/internal/AppCall;
    new-instance v1, Lcom/facebook/share/internal/LikeDialog$NativeHandler$1;

    invoke-direct {v1, p0, p1}, Lcom/facebook/share/internal/LikeDialog$NativeHandler$1;-><init>(Lcom/facebook/share/internal/LikeDialog$NativeHandler;Lcom/facebook/share/internal/LikeContent;)V

    .line 163
    # invokes: Lcom/facebook/share/internal/LikeDialog;->getFeature()Lcom/facebook/internal/DialogFeature;
    invoke-static {}, Lcom/facebook/share/internal/LikeDialog;->access$1()Lcom/facebook/internal/DialogFeature;

    move-result-object v2

    .line 147
    invoke-static {v0, v1, v2}, Lcom/facebook/internal/DialogPresenter;->setupAppCallForNativeDialog(Lcom/facebook/internal/AppCall;Lcom/facebook/internal/DialogPresenter$ParameterProvider;Lcom/facebook/internal/DialogFeature;)V

    .line 165
    return-object v0
.end method

.method public bridge synthetic createAppCall(Ljava/lang/Object;)Lcom/facebook/internal/AppCall;
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeDialog$NativeHandler;->createAppCall(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/internal/AppCall;

    move-result-object v0

    return-object v0
.end method
